package hi;

import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hc implements Runnable {
    public final mp f14608a;
    public final TLRPC.User[] f14609b;
    public final double f14610c;
    public final double d;
    public final int[] f14611e;
    public final ConnectionsManager f14612f;
    public final fc h;
    public final String f14613n;

    public hc(mp mpVar, TLRPC.User[] userArr, double d, double d2, int[] iArr, ConnectionsManager connectionsManager, fc fcVar, String str) {
        this.f14608a = mpVar;
        this.f14609b = userArr;
        this.f14610c = d;
        this.d = d2;
        this.f14611e = iArr;
        this.f14612f = connectionsManager;
        this.h = fcVar;
        this.f14613n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f14608a.s1(this.f14609b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f14610c;
        tL_inputGeoPoint.lat = d;
        final double d2 = this.d;
        tL_inputGeoPoint._long = d2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.f14611e;
        final fc fcVar = this.h;
        final String str = this.f14613n;
        iArr[0] = this.f14612f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final fc fcVar2 = fcVar;
                final double d10 = d;
                final double d11 = d2;
                final String str2 = str;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.messages_BotResults;
                        fc fcVar3 = fcVar2;
                        if (z10) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    ?? tLObject3 = new TLObject();
                                    tLObject3.f14802a = d10;
                                    tLObject3.f14803b = d11;
                                    tLObject3.f14804c = str3;
                                    tLObject3.d = parseFloat;
                                    lc.f14849a = str2;
                                    lc.f14850b = tLObject3;
                                    fcVar3.a(tLObject3);
                                    return;
                                } catch (Exception unused) {
                                    fcVar3.a(null);
                                    return;
                                }
                            }
                        }
                        fcVar3.a(null);
                    }
                });
            }
        });
    }
}
