package hi;

import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nb implements Runnable {
    public final np f15090a;
    public final TLRPC.User[] f15091b;
    public final double f15092c;
    public final double d;
    public final int[] f15093e;
    public final ConnectionsManager f15094f;
    public final lb h;
    public final String f15095n;

    public nb(np npVar, TLRPC.User[] userArr, double d, double d2, int[] iArr, ConnectionsManager connectionsManager, lb lbVar, String str) {
        this.f15090a = npVar;
        this.f15091b = userArr;
        this.f15092c = d;
        this.d = d2;
        this.f15093e = iArr;
        this.f15094f = connectionsManager;
        this.h = lbVar;
        this.f15095n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f15090a.s1(this.f15091b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f15092c;
        tL_inputGeoPoint.lat = d;
        final double d2 = this.d;
        tL_inputGeoPoint._long = d2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.f15093e;
        final lb lbVar = this.h;
        final String str = this.f15095n;
        iArr[0] = this.f15094f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final lb lbVar2 = lbVar;
                final double d10 = d;
                final double d11 = d2;
                final String str2 = str;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.messages_BotResults;
                        lb lbVar3 = lbVar2;
                        if (z10) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    ?? tLObject3 = new TLObject();
                                    tLObject3.f15257a = d10;
                                    tLObject3.f15258b = d11;
                                    tLObject3.f15259c = str3;
                                    tLObject3.d = parseFloat;
                                    rb.f15314a = str2;
                                    rb.f15315b = tLObject3;
                                    lbVar3.a(tLObject3);
                                    return;
                                } catch (Exception unused) {
                                    lbVar3.a(null);
                                    return;
                                }
                            }
                        }
                        lbVar3.a(null);
                    }
                });
            }
        });
    }
}
