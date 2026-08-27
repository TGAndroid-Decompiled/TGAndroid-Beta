package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class mc implements Runnable {

    public final MessagesController f16404a;

    public final TLRPC.User[] f16405b;

    public final double f16406c;
    public final double d;

    public final int[] f16407e;

    public final ConnectionsManager f16408f;
    public final kc h;

    public final String f16409n;

    public mc(MessagesController messagesController, TLRPC.User[] userArr, double d, double d10, int[] iArr, ConnectionsManager connectionsManager, kc kcVar, String str) {
        this.f16404a = messagesController;
        this.f16405b = userArr;
        this.f16406c = d;
        this.d = d10;
        this.f16407e = iArr;
        this.f16408f = connectionsManager;
        this.h = kcVar;
        this.f16409n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f16404a.getInputUser(this.f16405b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f16406c;
        tL_inputGeoPoint.lat = d;
        final double d10 = this.d;
        tL_inputGeoPoint._long = d10;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.f16407e;
        final kc kcVar = this.h;
        final String str = this.f16409n;
        iArr[0] = this.f16408f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
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
                                    float f10 = Float.parseFloat(botInlineResult.description);
                                    pc pcVar = new pc();
                                    pcVar.f16548a = d11;
                                    pcVar.f16549b = d12;
                                    pcVar.f16550c = str3;
                                    pcVar.d = f10;
                                    qc.f16607a = str2;
                                    qc.f16608b = pcVar;
                                    kcVar3.run(pcVar);
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
