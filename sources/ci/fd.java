package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fd implements Runnable {
    public final MessagesController f5096a;
    public final TLRPC.User[] f5097b;
    public final double f5098c;
    public final double d;
    public final int[] f5099e;
    public final ConnectionsManager f5100f;
    public final dd h;
    public final String f5101n;

    public fd(MessagesController messagesController, TLRPC.User[] userArr, double d, double d10, int[] iArr, ConnectionsManager connectionsManager, dd ddVar, String str) {
        this.f5096a = messagesController;
        this.f5097b = userArr;
        this.f5098c = d;
        this.d = d10;
        this.f5099e = iArr;
        this.f5100f = connectionsManager;
        this.h = ddVar;
        this.f5101n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f5096a.getInputUser(this.f5097b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f5098c;
        tL_inputGeoPoint.lat = d;
        final double d10 = this.d;
        tL_inputGeoPoint._long = d10;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.f5099e;
        final dd ddVar = this.h;
        final String str = this.f5101n;
        iArr[0] = this.f5100f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final dd ddVar2 = ddVar;
                final double d11 = d;
                final double d12 = d10;
                final String str2 = str;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.messages_BotResults;
                        dd ddVar3 = ddVar2;
                        if (z10) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    ?? tLObject3 = new TLObject();
                                    tLObject3.f5279a = d11;
                                    tLObject3.f5280b = d12;
                                    tLObject3.f5281c = str3;
                                    tLObject3.d = parseFloat;
                                    kd.f5460a = str2;
                                    kd.f5461b = tLObject3;
                                    ddVar3.run(tLObject3);
                                    return;
                                } catch (Exception unused) {
                                    ddVar3.run(null);
                                    return;
                                }
                            }
                        }
                        ddVar3.run(null);
                    }
                });
            }
        });
    }
}
