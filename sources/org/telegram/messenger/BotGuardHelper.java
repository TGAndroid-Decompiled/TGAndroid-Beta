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
        HashSet hashSet = gi.d3.f11153a1;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                gi.d3 d3Var = (gi.d3) it.next();
                gi.t4 t4Var = d3Var.f11185w0;
                if (t4Var != null && t4Var.f11495g == 5) {
                    long j12 = t4Var.f11492b;
                    if (j12 == j10 || j12 == 0) {
                        TLObject tLObject = t4Var.f11504q;
                        if ((tLObject instanceof TLRPC.TL_webViewResultUrl) && ((TLRPC.TL_webViewResultUrl) tLObject).query_id == j11) {
                            d3Var.k(false);
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
        org.telegram.ui.ActionBar.o2 R;
        if (LaunchActivity.I1 == null || (R = LaunchActivity.R()) == null) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j11));
        if (!z10) {
            if (!SharedPrefsHelper.isWebViewConfirmShown(this.currentAccount, j11) && !getMessagesController().whitelistedBots.contains(Long.valueOf(j11))) {
                org.telegram.ui.Components.d5.n(R, user, new n0(this, j10, j11, j12, 0), new z1(8));
                return;
            } else {
                openGuardBotWebApp(j10, j11, j12, true);
                return;
            }
        }
        this.queryIdToBotId.put(j12, j11);
        org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
        gi.t4 b10 = gi.t4.b(this.currentAccount, j10, j11, null, null, 5, 0, 0L, null, false, null, null, 0, false, false);
        b10.d = j12;
        gi.d3 d3Var = new gi.d3(LaunchActivity.I1, null);
        d3Var.x(false);
        d3Var.B0 = true;
        d3Var.f11171l0 = LaunchActivity.I1;
        d3Var.t(R2, b10);
        d3Var.show();
    }

    public static void lambda$openGuardBotWebApp$1() {
    }
}
