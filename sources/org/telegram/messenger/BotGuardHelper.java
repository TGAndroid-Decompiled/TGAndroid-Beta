package org.telegram.messenger;

import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public class BotGuardHelper extends BaseController {
    private static volatile BotGuardHelper[] Instance = new BotGuardHelper[4];
    private final LongSparseLongArray queryIdToBotId;

    public static class GuardBotDecisionResultNotification {
        public final long dialogId;
        public final long guardBotId;
        public final long queryId;
        public final TLRPC.JoinChatBotResult result;

        public GuardBotDecisionResultNotification(long j3, long j10, long j11, TLRPC.JoinChatBotResult joinChatBotResult) {
            this.dialogId = j3;
            this.guardBotId = j10;
            this.queryId = j11;
            this.result = joinChatBotResult;
        }
    }

    private BotGuardHelper(int i10) {
        super(i10);
        this.queryIdToBotId = new LongSparseLongArray();
    }

    public static BotGuardHelper getInstance(int i10) {
        BotGuardHelper botGuardHelper;
        BotGuardHelper botGuardHelper2 = Instance[i10];
        if (botGuardHelper2 == null) {
            synchronized (BotForumHelper.class) {
                try {
                    botGuardHelper = Instance[i10];
                    if (botGuardHelper == null) {
                        BotGuardHelper[] botGuardHelperArr = Instance;
                        BotGuardHelper botGuardHelper3 = new BotGuardHelper(i10);
                        botGuardHelperArr[i10] = botGuardHelper3;
                        botGuardHelper = botGuardHelper3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return botGuardHelper;
        }
        return botGuardHelper2;
    }

    public void lambda$openGuardBotWebApp$0(long j3, long j10, long j11) {
        openGuardBotWebApp(j3, j10, j11, true);
        SharedPrefsHelper.setWebViewConfirmShown(this.currentAccount, j10, true);
    }

    public void closeGuardBotWebApp(long j3, long j10, TLRPC.JoinChatBotResult joinChatBotResult) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.guardBotDecisionResult, new GuardBotDecisionResultNotification(j3, this.queryIdToBotId.get(j10, 0L), j10, joinChatBotResult));
        HashSet hashSet = di.n3.W0;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                di.n3 n3Var = (di.n3) it.next();
                di.j5 j5Var = n3Var.f6809v0;
                if (j5Var != null && j5Var.f6709g == 5) {
                    long j11 = j5Var.f6706b;
                    if (j11 == j3 || j11 == 0) {
                        TLObject tLObject = j5Var.f6718q;
                        if ((tLObject instanceof TLRPC.TL_webViewResultUrl) && ((TLRPC.TL_webViewResultUrl) tLObject).query_id == j10) {
                            n3Var.k(false);
                            return;
                        }
                    }
                }
            }
        }
    }

    public void openGuardBotWebApp(long j3, long j10, long j11) {
        openGuardBotWebApp(j3, j10, j11, false);
    }

    private void openGuardBotWebApp(long j3, long j10, long j11, boolean z10) {
        org.telegram.ui.ActionBar.p2 R;
        if (LaunchActivity.G1 == null || (R = LaunchActivity.R()) == null) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        if (!z10) {
            if (!SharedPrefsHelper.isWebViewConfirmShown(this.currentAccount, j10) && !getMessagesController().whitelistedBots.contains(Long.valueOf(j10))) {
                org.telegram.ui.Components.d5.o(R, user, new m0(this, j3, j10, j11, 0), new y1(6));
                return;
            } else {
                openGuardBotWebApp(j3, j10, j11, true);
                return;
            }
        }
        this.queryIdToBotId.put(j11, j10);
        org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
        di.j5 b10 = di.j5.b(this.currentAccount, j3, j10, null, null, 5, 0, 0L, null, false, null, null, 0, false, false);
        b10.d = j11;
        di.n3 n3Var = new di.n3(LaunchActivity.G1, null);
        n3Var.w(false);
        n3Var.A0 = true;
        n3Var.f6796k0 = LaunchActivity.G1;
        n3Var.s(R2, b10);
        n3Var.show();
    }

    public static void lambda$openGuardBotWebApp$1() {
    }
}
