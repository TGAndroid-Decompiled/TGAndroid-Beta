package org.telegram.messenger;

import java.util.HashSet;
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

        public GuardBotDecisionResultNotification(long j10, long j11, long j12, TLRPC.JoinChatBotResult joinChatBotResult) {
            this.dialogId = j10;
            this.guardBotId = j11;
            this.queryId = j12;
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
        if (botGuardHelper2 != null) {
            return botGuardHelper2;
        }
        synchronized (BotForumHelper.class) {
            try {
                botGuardHelper = Instance[i10];
                if (botGuardHelper == null) {
                    BotGuardHelper[] botGuardHelperArr = Instance;
                    BotGuardHelper botGuardHelper3 = new BotGuardHelper(i10);
                    botGuardHelperArr[i10] = botGuardHelper3;
                    botGuardHelper = botGuardHelper3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return botGuardHelper;
    }

    public void lambda$openGuardBotWebApp$0(long j10, long j11, long j12) {
        openGuardBotWebApp(j10, j11, j12, true);
        SharedPrefsHelper.setWebViewConfirmShown(this.currentAccount, j11, true);
    }

    public void closeGuardBotWebApp(long j10, long j11, TLRPC.JoinChatBotResult joinChatBotResult) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.guardBotDecisionResult, new GuardBotDecisionResultNotification(j10, this.queryIdToBotId.get(j11, 0L), j11, joinChatBotResult));
        HashSet<nh.b3> hashSet = nh.b3.S0;
        if (hashSet != null) {
            for (nh.b3 b3Var : hashSet) {
                nh.q4 q4Var = b3Var.f18591r0;
                if (q4Var != null && q4Var.f18910g == 5) {
                    long j12 = q4Var.f18906b;
                    if (j12 == j10 || j12 == 0) {
                        TLObject tLObject = q4Var.f18919q;
                        if ((tLObject instanceof TLRPC.TL_webViewResultUrl) && ((TLRPC.TL_webViewResultUrl) tLObject).query_id == j11) {
                            b3Var.k(false);
                            return;
                        }
                    }
                }
            }
        }
    }

    public void openGuardBotWebApp(long j10, long j11, long j12) {
        openGuardBotWebApp(j10, j11, j12, false);
    }

    private void openGuardBotWebApp(long j10, long j11, long j12, boolean z10) {
        org.telegram.ui.ActionBar.n2 n2VarR;
        if (LaunchActivity.C1 == null || (n2VarR = LaunchActivity.R()) == null) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j11));
        if (!z10) {
            if (SharedPrefsHelper.isWebViewConfirmShown(this.currentAccount, j11) || getMessagesController().whitelistedBots.contains(Long.valueOf(j11))) {
                openGuardBotWebApp(j10, j11, j12, true);
                return;
            } else {
                org.telegram.ui.Components.y4.o(n2VarR, user, new l0(this, j10, j11, j12, 0), new w1(6));
                return;
            }
        }
        this.queryIdToBotId.put(j12, j11);
        org.telegram.ui.ActionBar.n2 n2VarR2 = LaunchActivity.R();
        nh.q4 q4VarB = nh.q4.b(this.currentAccount, j10, j11, null, null, 5, 0, 0L, null, false, null, null, 0, false, false);
        q4VarB.d = j12;
        nh.b3 b3Var = new nh.b3(LaunchActivity.C1, null);
        b3Var.w(false);
        b3Var.f18598w0 = true;
        b3Var.f18579g0 = LaunchActivity.C1;
        b3Var.s(n2VarR2, q4VarB);
        b3Var.show();
    }

    public static void lambda$openGuardBotWebApp$1() {
    }
}
