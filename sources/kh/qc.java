package kh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qc implements Runnable {
    public final MessagesController f15904a;
    public final TLRPC.User[] f15905b;
    public final double f15906c;
    public final double d;
    public final int[] f15907e;
    public final ConnectionsManager f15908f;
    public final oc h;
    public final String f15909n;

    public qc(MessagesController messagesController, TLRPC.User[] userArr, double d, double d9, int[] iArr, ConnectionsManager connectionsManager, oc ocVar, String str) {
        this.f15904a = messagesController;
        this.f15905b = userArr;
        this.f15906c = d;
        this.d = d9;
        this.f15907e = iArr;
        this.f15908f = connectionsManager;
        this.h = ocVar;
        this.f15909n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f15904a.getInputUser(this.f15905b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f15906c;
        tL_inputGeoPoint.lat = d;
        final double d9 = this.d;
        tL_inputGeoPoint._long = d9;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.f15907e;
        final oc ocVar = this.h;
        final String str = this.f15909n;
        iArr[0] = this.f15908f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final oc ocVar2 = ocVar;
                final double d10 = d;
                final double d11 = d9;
                final String str2 = str;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.messages_BotResults;
                        oc ocVar3 = ocVar2;
                        if (z10) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    ?? tLObject3 = new TLObject();
                                    tLObject3.f16111a = d10;
                                    tLObject3.f16112b = d11;
                                    tLObject3.f16113c = str3;
                                    tLObject3.d = parseFloat;
                                    uc.f16174a = str2;
                                    uc.f16175b = tLObject3;
                                    ocVar3.run(tLObject3);
                                    return;
                                } catch (Exception unused) {
                                    ocVar3.run(null);
                                    return;
                                }
                            }
                        }
                        ocVar3.run(null);
                    }
                });
            }
        });
    }
}
