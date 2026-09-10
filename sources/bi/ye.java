package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ye implements Runnable {
    public final MessagesController f3984a;
    public final TLRPC.User[] f3985b;
    public final double f3986c;
    public final double d;
    public final int[] e;
    public final ConnectionsManager f3987f;
    public final we h;
    public final String f3988n;

    public ye(MessagesController messagesController, TLRPC.User[] userArr, double d, double d10, int[] iArr, ConnectionsManager connectionsManager, we weVar, String str) {
        this.f3984a = messagesController;
        this.f3985b = userArr;
        this.f3986c = d;
        this.d = d10;
        this.e = iArr;
        this.f3987f = connectionsManager;
        this.h = weVar;
        this.f3988n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f3984a.getInputUser(this.f3985b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f3986c;
        tL_inputGeoPoint.lat = d;
        final double d10 = this.d;
        tL_inputGeoPoint._long = d10;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.e;
        final we weVar = this.h;
        final String str = this.f3988n;
        iArr[0] = this.f3987f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final we weVar2 = weVar;
                final double d11 = d;
                final double d12 = d10;
                final String str2 = str;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.messages_BotResults;
                        we weVar3 = weVar2;
                        if (z10) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    ?? tLObject3 = new TLObject();
                                    tLObject3.f2571a = d11;
                                    tLObject3.f2572b = d12;
                                    tLObject3.f2573c = str3;
                                    tLObject3.d = parseFloat;
                                    ef.f2679a = str2;
                                    ef.f2680b = tLObject3;
                                    weVar3.run(tLObject3);
                                    return;
                                } catch (Exception unused) {
                                    weVar3.run(null);
                                    return;
                                }
                            }
                        }
                        weVar3.run(null);
                    }
                });
            }
        });
    }
}
