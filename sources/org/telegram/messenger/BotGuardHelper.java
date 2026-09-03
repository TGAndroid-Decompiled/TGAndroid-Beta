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
        HashSet hashSet = sh.p2.T0;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                sh.p2 p2Var = (sh.p2) it.next();
                sh.y3 y3Var = p2Var.f47642s0;
                if (y3Var != null && y3Var.f47829g == 5) {
                    long j12 = y3Var.f47825b;
                    if (j12 == j10 || j12 == 0) {
                        TLObject tLObject = y3Var.f47838q;
                        if ((tLObject instanceof TLRPC.TL_webViewResultUrl) && ((TLRPC.TL_webViewResultUrl) tLObject).query_id == j11) {
                            p2Var.k(false);
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

    private void openGuardBotWebApp(long j10, long j11, long j12, boolean z4) {
        org.telegram.ui.ActionBar.p2 R;
        if (LaunchActivity.D1 == null || (R = LaunchActivity.R()) == null) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j11));
        if (!z4) {
            if (!SharedPrefsHelper.isWebViewConfirmShown(this.currentAccount, j11) && !getMessagesController().whitelistedBots.contains(Long.valueOf(j11))) {
                org.telegram.ui.Components.z4.o(R, user, new m0(this, j10, j11, j12, 0), new x1(6));
                return;
            } else {
                openGuardBotWebApp(j10, j11, j12, true);
                return;
            }
        }
        this.queryIdToBotId.put(j12, j11);
        org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
        sh.y3 b10 = sh.y3.b(this.currentAccount, j10, j11, null, null, 5, 0, 0L, null, false, null, null, 0, false, false);
        b10.d = j12;
        sh.p2 p2Var = new sh.p2(LaunchActivity.D1, null);
        p2Var.w(false);
        p2Var.f47649x0 = true;
        p2Var.f47629h0 = LaunchActivity.D1;
        p2Var.s(R2, b10);
        p2Var.show();
    }

    public static void lambda$openGuardBotWebApp$1() {
    }
}
