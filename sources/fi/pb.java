package fi;

import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pb implements Runnable {
    public final qp f12627a;
    public final TLRPC.User[] f12628b;
    public final double f12629c;
    public final double d;
    public final int[] f12630e;
    public final ConnectionsManager f12631f;
    public final nb h;
    public final String f12632n;

    public pb(qp qpVar, TLRPC.User[] userArr, double d, double d2, int[] iArr, ConnectionsManager connectionsManager, nb nbVar, String str) {
        this.f12627a = qpVar;
        this.f12628b = userArr;
        this.f12629c = d;
        this.d = d2;
        this.f12630e = iArr;
        this.f12631f = connectionsManager;
        this.h = nbVar;
        this.f12632n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f12627a.q1(this.f12628b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f12629c;
        tL_inputGeoPoint.lat = d;
        final double d2 = this.d;
        tL_inputGeoPoint._long = d2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.f12630e;
        final nb nbVar = this.h;
        final String str = this.f12632n;
        iArr[0] = this.f12631f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final nb nbVar2 = nbVar;
                final double d10 = d;
                final double d11 = d2;
                final String str2 = str;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z9 = tLObject2 instanceof TLRPC.messages_BotResults;
                        nb nbVar3 = nbVar2;
                        if (z9) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    ?? tLObject3 = new TLObject();
                                    tLObject3.f12821a = d10;
                                    tLObject3.f12822b = d11;
                                    tLObject3.f12823c = str3;
                                    tLObject3.d = parseFloat;
                                    tb.f12868a = str2;
                                    tb.f12869b = tLObject3;
                                    nbVar3.a(tLObject3);
                                    return;
                                } catch (Exception unused) {
                                    nbVar3.a(null);
                                    return;
                                }
                            }
                        }
                        nbVar3.a(null);
                    }
                });
            }
        });
    }
}
