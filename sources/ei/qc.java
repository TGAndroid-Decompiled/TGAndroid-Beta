package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qc implements Runnable {
    public final MessagesController f9670a;
    public final TLRPC.User[] f9671b;
    public final double f9672c;
    public final double d;
    public final int[] e;
    public final ConnectionsManager f9673f;
    public final oc h;
    public final String f9674n;

    public qc(MessagesController messagesController, TLRPC.User[] userArr, double d, double d10, int[] iArr, ConnectionsManager connectionsManager, oc ocVar, String str) {
        this.f9670a = messagesController;
        this.f9671b = userArr;
        this.f9672c = d;
        this.d = d10;
        this.e = iArr;
        this.f9673f = connectionsManager;
        this.h = ocVar;
        this.f9674n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f9670a.getInputUser(this.f9671b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f9672c;
        tL_inputGeoPoint.lat = d;
        final double d10 = this.d;
        tL_inputGeoPoint._long = d10;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.e;
        final oc ocVar = this.h;
        final String str = this.f9674n;
        iArr[0] = this.f9673f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final oc ocVar2 = ocVar;
                final double d11 = d;
                final double d12 = d10;
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
                                    tLObject3.f9869a = d11;
                                    tLObject3.f9870b = d12;
                                    tLObject3.f9871c = str3;
                                    tLObject3.d = parseFloat;
                                    uc.f9922a = str2;
                                    uc.f9923b = tLObject3;
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
