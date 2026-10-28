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

    public void lambda$openGuardBotWebApp$0(long j10, long j11, long j12) {
        openGuardBotWebApp(j10, j11, j12, true);
        SharedPrefsHelper.setWebViewConfirmShown(this.currentAccount, j11, true);
    }

    public void closeGuardBotWebApp(long j10, long j11, TLRPC.JoinChatBotResult joinChatBotResult) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.guardBotDecisionResult, new GuardBotDecisionResultNotification(j10, this.queryIdToBotId.get(j11, 0L), j11, joinChatBotResult));
        HashSet hashSet = hi.m3.f13097a1;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                hi.m3 m3Var = (hi.m3) it.next();
                hi.c5 c5Var = m3Var.f13129w0;
                if (c5Var != null && c5Var.f12918g == 5) {
                    long j12 = c5Var.f12915b;
                    if (j12 == j10 || j12 == 0) {
                        TLObject tLObject = c5Var.f12927q;
                        if ((tLObject instanceof TLRPC.TL_webViewResultUrl) && ((TLRPC.TL_webViewResultUrl) tLObject).query_id == j11) {
                            m3Var.k(false);
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
        org.telegram.ui.ActionBar.r2 R;
        if (LaunchActivity.I1 == null || (R = LaunchActivity.R()) == null) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j11));
        if (!z10) {
            if (!SharedPrefsHelper.isWebViewConfirmShown(this.currentAccount, j11) && !getMessagesController().whitelistedBots.contains(Long.valueOf(j11))) {
                org.telegram.ui.Components.g5.n(R, user, new q0(this, j10, j11, j12, 0), new a2(8));
                return;
            } else {
                openGuardBotWebApp(j10, j11, j12, true);
                return;
            }
        }
        this.queryIdToBotId.put(j12, j11);
        org.telegram.ui.ActionBar.r2 R2 = LaunchActivity.R();
        hi.c5 b10 = hi.c5.b(this.currentAccount, j10, j11, null, null, 5, 0, 0L, null, false, null, null, 0, false, false);
        b10.d = j12;
        hi.m3 m3Var = new hi.m3(LaunchActivity.I1, null);
        m3Var.x(false);
        m3Var.B0 = true;
        m3Var.f13115l0 = LaunchActivity.I1;
        m3Var.t(R2, b10);
        m3Var.show();
    }

    public static void lambda$openGuardBotWebApp$1() {
    }
}
