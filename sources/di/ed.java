package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ed implements Runnable {
    public final MessagesController f6932a;
    public final TLRPC.User[] f6933b;
    public final double f6934c;
    public final double d;
    public final int[] e;
    public final ConnectionsManager f6935f;
    public final cd h;
    public final String f6936n;

    public ed(MessagesController messagesController, TLRPC.User[] userArr, double d, double d10, int[] iArr, ConnectionsManager connectionsManager, cd cdVar, String str) {
        this.f6932a = messagesController;
        this.f6933b = userArr;
        this.f6934c = d;
        this.d = d10;
        this.e = iArr;
        this.f6935f = connectionsManager;
        this.h = cdVar;
        this.f6936n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f6932a.getInputUser(this.f6933b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f6934c;
        tL_inputGeoPoint.lat = d;
        final double d10 = this.d;
        tL_inputGeoPoint._long = d10;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.e;
        final cd cdVar = this.h;
        final String str = this.f6936n;
        iArr[0] = this.f6935f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
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
                                    tLObject3.f7092a = d11;
                                    tLObject3.f7093b = d12;
                                    tLObject3.f7094c = str3;
                                    tLObject3.d = parseFloat;
                                    jd.f7149a = str2;
                                    jd.f7150b = tLObject3;
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
