package org.telegram.messenger;

import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.WebViewRequestProps;

public class BotGuardHelper extends BaseController {
    private static volatile BotGuardHelper[] Instance = new BotGuardHelper[4];
    private final LongSparseLongArray queryIdToBotId;

    public static void lambda$openGuardBotWebApp$1() {
    }

    private BotGuardHelper(int i) {
        super(i);
        this.queryIdToBotId = new LongSparseLongArray();
    }

    public void openGuardBotWebApp(long j, long j2, TLRPC.TL_webViewResultUrl tL_webViewResultUrl) {
        openGuardBotWebApp(j, j2, tL_webViewResultUrl, false);
    }

    private void openGuardBotWebApp(final long j, final long j2, final TLRPC.TL_webViewResultUrl tL_webViewResultUrl, boolean z) {
        BaseFragment lastFragment;
        if (LaunchActivity.instance == null || (lastFragment = LaunchActivity.getLastFragment()) == null) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j2));
        if (!z) {
            if (SharedPrefsHelper.isWebViewConfirmShown(this.currentAccount, j2) || getMessagesController().whitelistedBots.contains(Long.valueOf(j2))) {
                openGuardBotWebApp(j, j2, tL_webViewResultUrl, true);
                return;
            } else {
                AlertsCreator.createBotLaunchAlert(lastFragment, user, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$openGuardBotWebApp$0(j, j2, tL_webViewResultUrl);
                    }
                }, new Runnable() {
                    @Override
                    public final void run() {
                        BotGuardHelper.lambda$openGuardBotWebApp$1();
                    }
                });
                return;
            }
        }
        this.queryIdToBotId.put(tL_webViewResultUrl.query_id, j2);
        BaseFragment lastFragment2 = LaunchActivity.getLastFragment();
        WebViewRequestProps webViewRequestPropsOf = WebViewRequestProps.of(this.currentAccount, j, j2, null, null, 5, 0, 0L, false, null, false, null, null, 0, false, false);
        webViewRequestPropsOf.applyResponse(tL_webViewResultUrl);
        BotWebViewSheet botWebViewSheet = new BotWebViewSheet(LaunchActivity.instance, null);
        botWebViewSheet.setDefaultFullsize(false);
        botWebViewSheet.setNeedsContext(true);
        botWebViewSheet.setParentActivity(LaunchActivity.instance);
        botWebViewSheet.requestWebView(lastFragment2, webViewRequestPropsOf);
        botWebViewSheet.show();
    }

    public void lambda$openGuardBotWebApp$0(long j, long j2, TLRPC.TL_webViewResultUrl tL_webViewResultUrl) {
        openGuardBotWebApp(j, j2, tL_webViewResultUrl, true);
        SharedPrefsHelper.setWebViewConfirmShown(this.currentAccount, j2, true);
    }

    public void closeGuardBotWebApp(long j, long j2, TLRPC.JoinChatBotResult joinChatBotResult) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.guardBotDecisionResult, new GuardBotDecisionResultNotification(j, this.queryIdToBotId.get(j2, 0L), j2, joinChatBotResult));
        HashSet hashSet = BotWebViewSheet.activeSheets;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                BotWebViewSheet botWebViewSheet = (BotWebViewSheet) it.next();
                if (botWebViewSheet.isGuardBotTab(j, j2)) {
                    botWebViewSheet.lambda$openOptions$40();
                    return;
                }
            }
        }
    }

    public static class GuardBotDecisionResultNotification {
        public final long dialogId;
        public final long guardBotId;
        public final long queryId;
        public final TLRPC.JoinChatBotResult result;

        public GuardBotDecisionResultNotification(long j, long j2, long j3, TLRPC.JoinChatBotResult joinChatBotResult) {
            this.dialogId = j;
            this.guardBotId = j2;
            this.queryId = j3;
            this.result = joinChatBotResult;
        }
    }

    public static BotGuardHelper getInstance(int i) {
        BotGuardHelper botGuardHelper = Instance[i];
        if (botGuardHelper == null) {
            synchronized (BotForumHelper.class) {
                try {
                    botGuardHelper = Instance[i];
                    if (botGuardHelper == null) {
                        BotGuardHelper[] botGuardHelperArr = Instance;
                        BotGuardHelper botGuardHelper2 = new BotGuardHelper(i);
                        botGuardHelperArr[i] = botGuardHelper2;
                        botGuardHelper = botGuardHelper2;
                    }
                } finally {
                }
            }
        }
        return botGuardHelper;
    }
}
