package hi;

import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final np f14711a;
    public final TLRPC.User[] f14712b;
    public final double f14713c;
    public final double d;
    public final int[] f14714e;
    public final ConnectionsManager f14715f;
    public final kb h;
    public final String f14716n;

    public mb(np npVar, TLRPC.User[] userArr, double d, double d2, int[] iArr, ConnectionsManager connectionsManager, kb kbVar, String str) {
        this.f14711a = npVar;
        this.f14712b = userArr;
        this.f14713c = d;
        this.d = d2;
        this.f14714e = iArr;
        this.f14715f = connectionsManager;
        this.h = kbVar;
        this.f14716n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f14711a.q1(this.f14712b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f14713c;
        tL_inputGeoPoint.lat = d;
        final double d2 = this.d;
        tL_inputGeoPoint._long = d2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.f14714e;
        final kb kbVar = this.h;
        final String str = this.f14716n;
        iArr[0] = this.f14715f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final kb kbVar2 = kbVar;
                final double d10 = d;
                final double d11 = d2;
                final String str2 = str;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.messages_BotResults;
                        kb kbVar3 = kbVar2;
                        if (z10) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    ?? tLObject3 = new TLObject();
                                    tLObject3.f14883a = d10;
                                    tLObject3.f14884b = d11;
                                    tLObject3.f14885c = str3;
                                    tLObject3.d = parseFloat;
                                    qb.f14933a = str2;
                                    qb.f14934b = tLObject3;
                                    kbVar3.a(tLObject3);
                                    return;
                                } catch (Exception unused) {
                                    kbVar3.a(null);
                                    return;
                                }
                            }
                        }
                        kbVar3.a(null);
                    }
                });
            }
        });
    }
}
