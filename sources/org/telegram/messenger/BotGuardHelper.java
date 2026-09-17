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
        HashSet hashSet = fi.k3.W0;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                fi.k3 k3Var = (fi.k3) it.next();
                fi.f5 f5Var = k3Var.f9786v0;
                if (f5Var != null && f5Var.f9668g == 5) {
                    long j11 = f5Var.f9664b;
                    if (j11 == j3 || j11 == 0) {
                        TLObject tLObject = f5Var.f9677q;
                        if ((tLObject instanceof TLRPC.TL_webViewResultUrl) && ((TLRPC.TL_webViewResultUrl) tLObject).query_id == j10) {
                            k3Var.k(false);
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
        org.telegram.ui.ActionBar.n2 R;
        if (LaunchActivity.G1 == null || (R = LaunchActivity.R()) == null) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        if (!z10) {
            if (!SharedPrefsHelper.isWebViewConfirmShown(this.currentAccount, j10) && !getMessagesController().whitelistedBots.contains(Long.valueOf(j10))) {
                org.telegram.ui.Components.e5.o(R, user, new l0(this, j3, j10, j11, 0), new u1(6));
                return;
            } else {
                openGuardBotWebApp(j3, j10, j11, true);
                return;
            }
        }
        this.queryIdToBotId.put(j11, j10);
        org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
        fi.f5 b10 = fi.f5.b(this.currentAccount, j3, j10, null, null, 5, 0, 0L, null, false, null, null, 0, false, false);
        b10.d = j11;
        fi.k3 k3Var = new fi.k3(LaunchActivity.G1, null);
        k3Var.w(false);
        k3Var.A0 = true;
        k3Var.f9773k0 = LaunchActivity.G1;
        k3Var.s(R2, b10);
        k3Var.show();
    }

    public static void lambda$openGuardBotWebApp$1() {
    }
}
