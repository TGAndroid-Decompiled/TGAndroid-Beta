package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ed implements Runnable {
    public final MessagesController f6929a;
    public final TLRPC.User[] f6930b;
    public final double f6931c;
    public final double d;
    public final int[] e;
    public final ConnectionsManager f6932f;
    public final cd h;
    public final String f6933n;

    public ed(MessagesController messagesController, TLRPC.User[] userArr, double d, double d10, int[] iArr, ConnectionsManager connectionsManager, cd cdVar, String str) {
        this.f6929a = messagesController;
        this.f6930b = userArr;
        this.f6931c = d;
        this.d = d10;
        this.e = iArr;
        this.f6932f = connectionsManager;
        this.h = cdVar;
        this.f6933n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f6929a.getInputUser(this.f6930b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f6931c;
        tL_inputGeoPoint.lat = d;
        final double d10 = this.d;
        tL_inputGeoPoint._long = d10;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.e;
        final cd cdVar = this.h;
        final String str = this.f6933n;
        iArr[0] = this.f6932f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final cd cdVar2 = cdVar;
                final double d11 = d;
                final double d12 = d10;
                final String str2 = str;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.messages_BotResults;
                        cd cdVar3 = cdVar2;
                        if (z10) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    ?? tLObject3 = new TLObject();
                                    tLObject3.f7089a = d11;
                                    tLObject3.f7090b = d12;
                                    tLObject3.f7091c = str3;
                                    tLObject3.d = parseFloat;
                                    jd.f7146a = str2;
                                    jd.f7147b = tLObject3;
                                    cdVar3.run(tLObject3);
                                    return;
                                } catch (Exception unused) {
                                    cdVar3.run(null);
                                    return;
                                }
                            }
                        }
                        cdVar3.run(null);
                    }
                });
            }
        });
    }
}
