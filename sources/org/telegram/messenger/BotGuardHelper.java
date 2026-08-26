package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.WebViewRequestProps;

public class BotGuardHelper extends BaseController {
    private static volatile BotGuardHelper[] Instance = new BotGuardHelper[4];
    private final LongSparseLongArray queryIdToBotId;

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

    private BotGuardHelper(int i) {
        super(i);
        this.queryIdToBotId = new LongSparseLongArray();
    }

    public static BotGuardHelper getInstance(int i) {
        BotGuardHelper botGuardHelper;
        BotGuardHelper botGuardHelper2 = Instance[i];
        if (botGuardHelper2 != null) {
            return botGuardHelper2;
        }
        synchronized (BotForumHelper.class) {
            try {
                botGuardHelper = Instance[i];
                if (botGuardHelper == null) {
                    BotGuardHelper[] botGuardHelperArr = Instance;
                    BotGuardHelper botGuardHelper3 = new BotGuardHelper(i);
                    botGuardHelperArr[i] = botGuardHelper3;
                    botGuardHelper = botGuardHelper3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return botGuardHelper;
    }

    public void lambda$openGuardBotWebApp$0(long j, long j2, long j3) {
        openGuardBotWebApp(j, j2, j3, true);
        SharedPrefsHelper.setWebViewConfirmShown(this.currentAccount, j2, true);
    }

    public static void lambda$openGuardBotWebApp$1() {
    }

    public void closeGuardBotWebApp(long j, long j2, TLRPC.JoinChatBotResult joinChatBotResult) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.guardBotDecisionResult, new GuardBotDecisionResultNotification(j, this.queryIdToBotId.get(j2, 0L), j2, joinChatBotResult));
        HashSet<BotWebViewSheet> hashSet = BotWebViewSheet.activeSheets;
        if (hashSet != null) {
            for (BotWebViewSheet botWebViewSheet : hashSet) {
                WebViewRequestProps webViewRequestProps = botWebViewSheet.requestProps;
                if (webViewRequestProps != null && webViewRequestProps.type == 5) {
                    long j3 = webViewRequestProps.peerId;
                    if (j3 == j || j3 == 0) {
                        TLObject tLObject = webViewRequestProps.response;
                        if ((tLObject instanceof TLRPC.TL_webViewResultUrl) && ((TLRPC.TL_webViewResultUrl) tLObject).query_id == j2) {
                            botWebViewSheet.dismiss$1(false);
                            return;
                        }
                    }
                }
            }
        }
    }

    public void openGuardBotWebApp(long j, long j2, long j3) {
        openGuardBotWebApp(j, j2, j3, false);
    }

    private void openGuardBotWebApp(long j, long j2, long j3, boolean z) {
        BaseFragment lastFragment;
        if (LaunchActivity.instance == null || (lastFragment = LaunchActivity.getLastFragment()) == null) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j2));
        if (!z) {
            if (SharedPrefsHelper.isWebViewConfirmShown(this.currentAccount, j2) || getMessagesController().whitelistedBots.contains(Long.valueOf(j2))) {
                openGuardBotWebApp(j, j2, j3, true);
                return;
            } else {
                AlertsCreator.createBotLaunchAlert(lastFragment, user, new BotGuardHelper$$ExternalSyntheticLambda0(this, j, j2, j3, 0), new Emoji$$ExternalSyntheticLambda1(7));
                return;
            }
        }
        this.queryIdToBotId.put(j3, j2);
        BaseFragment lastFragment2 = LaunchActivity.getLastFragment();
        WebViewRequestProps webViewRequestPropsOf = WebViewRequestProps.of(this.currentAccount, j, j2, null, null, 5, 0, 0L, null, false, null, null, 0, false, false);
        webViewRequestPropsOf.queryId = j3;
        BotWebViewSheet botWebViewSheet = new BotWebViewSheet(LaunchActivity.instance, null);
        botWebViewSheet.setDefaultFullsize(false);
        botWebViewSheet.needsContext = true;
        botWebViewSheet.parentActivity = LaunchActivity.instance;
        botWebViewSheet.requestWebView(lastFragment2, webViewRequestPropsOf);
        botWebViewSheet.show();
    }
}
