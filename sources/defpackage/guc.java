package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class guc implements Runnable {
    public final oc7 a;
    public final TLRPC.User[] b;
    public final double c;
    public final double d;
    public final int[] e;
    public final ConnectionsManager f;
    public final z52 h;
    public final String n;

    public guc(oc7 oc7Var, TLRPC.User[] userArr, double d, double d2, int[] iArr, ConnectionsManager connectionsManager, z52 z52Var, String str) {
        this.a = oc7Var;
        this.b = userArr;
        this.c = d;
        this.d = d2;
        this.e = iArr;
        this.f = connectionsManager;
        this.h = z52Var;
        this.n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.a.p1(this.b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.c;
        tL_inputGeoPoint.lat = d;
        final double d2 = this.d;
        tL_inputGeoPoint._long = d2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.e;
        final z52 z52Var = this.h;
        final String str = this.n;
        iArr[0] = this.f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final z52 z52Var2 = z52Var;
                final double d3 = d;
                final double d4 = d2;
                final String str2 = str;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z = tLObject2 instanceof TLRPC.messages_BotResults;
                        z52 z52Var3 = z52Var2;
                        if (z) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    ?? tLObject3 = new TLObject();
                                    tLObject3.a = d3;
                                    tLObject3.b = d4;
                                    tLObject3.c = str3;
                                    tLObject3.d = parseFloat;
                                    juc.a = str2;
                                    juc.b = tLObject3;
                                    z52Var3.a(tLObject3);
                                    return;
                                } catch (Exception unused) {
                                    z52Var3.a(null);
                                    return;
                                }
                            }
                        }
                        z52Var3.a(null);
                    }
                });
            }
        });
    }
}
