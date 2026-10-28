package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mc implements Runnable {
    public final MessagesController f11271a;
    public final TLRPC.User[] f11272b;
    public final double f11273c;
    public final double d;
    public final int[] e;
    public final ConnectionsManager f11274f;
    public final kc h;
    public final String f11275n;

    public mc(MessagesController messagesController, TLRPC.User[] userArr, double d, double d10, int[] iArr, ConnectionsManager connectionsManager, kc kcVar, String str) {
        this.f11271a = messagesController;
        this.f11272b = userArr;
        this.f11273c = d;
        this.d = d10;
        this.e = iArr;
        this.f11274f = connectionsManager;
        this.h = kcVar;
        this.f11275n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f11271a.getInputUser(this.f11272b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f11273c;
        tL_inputGeoPoint.lat = d;
        final double d10 = this.d;
        tL_inputGeoPoint._long = d10;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.e;
        final kc kcVar = this.h;
        final String str = this.f11275n;
        iArr[0] = this.f11274f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final kc kcVar2 = kcVar;
                final double d11 = d;
                final double d12 = d10;
                final String str2 = str;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.messages_BotResults;
                        kc kcVar3 = kcVar2;
                        if (z10) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    ?? tLObject3 = new TLObject();
                                    tLObject3.f11452a = d11;
                                    tLObject3.f11453b = d12;
                                    tLObject3.f11454c = str3;
                                    tLObject3.d = parseFloat;
                                    qc.f11505a = str2;
                                    qc.f11506b = tLObject3;
                                    kcVar3.run(tLObject3);
                                    return;
                                } catch (Exception unused) {
                                    kcVar3.run(null);
                                    return;
                                }
                            }
                        }
                        kcVar3.run(null);
                    }
                });
            }
        });
    }
}
