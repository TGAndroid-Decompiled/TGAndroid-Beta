package hi;

import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final mp f15039a;
    public final TLRPC.User[] f15040b;
    public final double f15041c;
    public final double d;
    public final int[] f15042e;
    public final ConnectionsManager f15043f;
    public final kb h;
    public final String f15044n;

    public mb(mp mpVar, TLRPC.User[] userArr, double d, double d2, int[] iArr, ConnectionsManager connectionsManager, kb kbVar, String str) {
        this.f15039a = mpVar;
        this.f15040b = userArr;
        this.f15041c = d;
        this.d = d2;
        this.f15042e = iArr;
        this.f15043f = connectionsManager;
        this.h = kbVar;
        this.f15044n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f15039a.s1(this.f15040b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f15041c;
        tL_inputGeoPoint.lat = d;
        final double d2 = this.d;
        tL_inputGeoPoint._long = d2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.f15042e;
        final kb kbVar = this.h;
        final String str = this.f15044n;
        iArr[0] = this.f15043f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final kb kbVar2 = kbVar;
                final double d10 = d;
                final double d11 = d2;
                final String str2 = str;
                org.telegram.messenger.g0.g3(new Runnable() {
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
                                    tLObject3.f15281a = d10;
                                    tLObject3.f15282b = d11;
                                    tLObject3.f15283c = str3;
                                    tLObject3.d = parseFloat;
                                    qb.f15314a = str2;
                                    qb.f15315b = tLObject3;
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
