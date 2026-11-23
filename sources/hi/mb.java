package hi;

import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final np f15042a;
    public final TLRPC.User[] f15043b;
    public final double f15044c;
    public final double d;
    public final int[] f15045e;
    public final ConnectionsManager f15046f;
    public final kb h;
    public final String f15047n;

    public mb(np npVar, TLRPC.User[] userArr, double d, double d2, int[] iArr, ConnectionsManager connectionsManager, kb kbVar, String str) {
        this.f15042a = npVar;
        this.f15043b = userArr;
        this.f15044c = d;
        this.d = d2;
        this.f15045e = iArr;
        this.f15046f = connectionsManager;
        this.h = kbVar;
        this.f15047n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f15042a.s1(this.f15043b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f15044c;
        tL_inputGeoPoint.lat = d;
        final double d2 = this.d;
        tL_inputGeoPoint._long = d2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.f15045e;
        final kb kbVar = this.h;
        final String str = this.f15047n;
        iArr[0] = this.f15046f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
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
                                    tLObject3.f15284a = d10;
                                    tLObject3.f15285b = d11;
                                    tLObject3.f15286c = str3;
                                    tLObject3.d = parseFloat;
                                    qb.f15317a = str2;
                                    qb.f15318b = tLObject3;
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
