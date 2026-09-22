package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jd implements Runnable {
    public final MessagesController f4861a;
    public final TLRPC.User[] f4862b;
    public final double f4863c;
    public final double d;
    public final int[] e;
    public final ConnectionsManager f4864f;
    public final hd h;
    public final String f4865n;

    public jd(MessagesController messagesController, TLRPC.User[] userArr, double d, double d10, int[] iArr, ConnectionsManager connectionsManager, hd hdVar, String str) {
        this.f4861a = messagesController;
        this.f4862b = userArr;
        this.f4863c = d;
        this.d = d10;
        this.e = iArr;
        this.f4864f = connectionsManager;
        this.h = hdVar;
        this.f4865n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f4861a.getInputUser(this.f4862b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f4863c;
        tL_inputGeoPoint.lat = d;
        final double d10 = this.d;
        tL_inputGeoPoint._long = d10;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.e;
        final hd hdVar = this.h;
        final String str = this.f4865n;
        iArr[0] = this.f4864f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final hd hdVar2 = hdVar;
                final double d11 = d;
                final double d12 = d10;
                final String str2 = str;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.messages_BotResults;
                        hd hdVar3 = hdVar2;
                        if (z10) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    ?? tLObject3 = new TLObject();
                                    tLObject3.f5099a = d11;
                                    tLObject3.f5100b = d12;
                                    tLObject3.f5101c = str3;
                                    tLObject3.d = parseFloat;
                                    od.f5286a = str2;
                                    od.f5287b = tLObject3;
                                    hdVar3.run(tLObject3);
                                    return;
                                } catch (Exception unused) {
                                    hdVar3.run(null);
                                    return;
                                }
                            }
                        }
                        hdVar3.run(null);
                    }
                });
            }
        });
    }
}
