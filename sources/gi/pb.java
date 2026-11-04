package gi;

import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pb implements Runnable {
    public final hp f13397a;
    public final TLRPC.User[] f13398b;
    public final double f13399c;
    public final double d;
    public final int[] f13400e;
    public final ConnectionsManager f13401f;
    public final nb h;
    public final String f13402n;

    public pb(hp hpVar, TLRPC.User[] userArr, double d, double d10, int[] iArr, ConnectionsManager connectionsManager, nb nbVar, String str) {
        this.f13397a = hpVar;
        this.f13398b = userArr;
        this.f13399c = d;
        this.d = d10;
        this.f13400e = iArr;
        this.f13401f = connectionsManager;
        this.h = nbVar;
        this.f13402n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f13397a.q1(this.f13398b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f13399c;
        tL_inputGeoPoint.lat = d;
        final double d10 = this.d;
        tL_inputGeoPoint._long = d10;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.f13400e;
        final nb nbVar = this.h;
        final String str = this.f13402n;
        iArr[0] = this.f13401f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final nb nbVar2 = nbVar;
                final double d11 = d;
                final double d12 = d10;
                final String str2 = str;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.messages_BotResults;
                        nb nbVar3 = nbVar2;
                        if (z10) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    ?? tLObject3 = new TLObject();
                                    tLObject3.f13582a = d11;
                                    tLObject3.f13583b = d12;
                                    tLObject3.f13584c = str3;
                                    tLObject3.d = parseFloat;
                                    tb.f13638a = str2;
                                    tb.f13639b = tLObject3;
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
