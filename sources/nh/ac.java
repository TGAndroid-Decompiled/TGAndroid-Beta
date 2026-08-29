package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ac implements Runnable {
    public final MessagesController f17399a;
    public final TLRPC.User[] f17400b;
    public final double f17401c;
    public final double d;
    public final int[] f17402e;
    public final ConnectionsManager f17403f;
    public final yb h;
    public final String f17404n;

    public ac(MessagesController messagesController, TLRPC.User[] userArr, double d, double d10, int[] iArr, ConnectionsManager connectionsManager, yb ybVar, String str) {
        this.f17399a = messagesController;
        this.f17400b = userArr;
        this.f17401c = d;
        this.d = d10;
        this.f17402e = iArr;
        this.f17403f = connectionsManager;
        this.h = ybVar;
        this.f17404n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f17399a.getInputUser(this.f17400b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f17401c;
        tL_inputGeoPoint.lat = d;
        final double d10 = this.d;
        tL_inputGeoPoint._long = d10;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.f17402e;
        final yb ybVar = this.h;
        final String str = this.f17404n;
        iArr[0] = this.f17403f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final yb ybVar2 = ybVar;
                final double d11 = d;
                final double d12 = d10;
                final String str2 = str;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.messages_BotResults;
                        yb ybVar3 = ybVar2;
                        if (z10) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    ?? tLObject3 = new TLObject();
                                    tLObject3.f17550a = d11;
                                    tLObject3.f17551b = d12;
                                    tLObject3.f17552c = str3;
                                    tLObject3.d = parseFloat;
                                    ec.f17617a = str2;
                                    ec.f17618b = tLObject3;
                                    ybVar3.run(tLObject3);
                                    return;
                                } catch (Exception unused) {
                                    ybVar3.run(null);
                                    return;
                                }
                            }
                        }
                        ybVar3.run(null);
                    }
                });
            }
        });
    }
}
