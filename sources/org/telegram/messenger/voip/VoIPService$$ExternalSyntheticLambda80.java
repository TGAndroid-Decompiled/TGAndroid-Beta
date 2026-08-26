package org.telegram.messenger.voip;

import android.content.SharedPreferences;
import android.widget.EditText;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda1;

public final class VoIPService$$ExternalSyntheticLambda80 implements ListenerSet.Event, RequestDelegateTimestamp, AlertDialog.OnButtonClickListener, MessagesStorage.StringCallback {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final long f$2;

    public VoIPService$$ExternalSyntheticLambda80(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        this.$r8$classId = 1;
        this.f$0 = eventTime;
        this.f$1 = i;
        this.f$2 = j;
    }

    @Override
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onBandwidthEstimate((AnalyticsListener.EventTime) this.f$0, this.f$1, this.f$2);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        Object obj = this.f$0;
        int i2 = this.f$1;
        long j = this.f$2;
        switch (this.$r8$classId) {
            case 2:
                EditText editText = (EditText) obj;
                if (j > 0) {
                    TLRPC.UserFull userFull = MessagesController.getInstance(i2).getUserFull(UserConfig.getInstance(i2).getClientUserId());
                    String strTrim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (userFull != null) {
                        String str = userFull.about;
                        if ((str != null ? str : "").equals(strTrim)) {
                            AndroidUtilities.hideKeyboard(editText);
                            alertDialog.dismiss();
                        } else {
                            userFull.about = strTrim;
                            NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j), userFull);
                        }
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = strTrim;
                    updateprofile.flags |= 4;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 2, Long.valueOf(j));
                    ConnectionsManager.getInstance(i2).sendRequest(updateprofile, new PassportActivity$$ExternalSyntheticLambda1(8), 2);
                } else {
                    long j2 = -j;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i2).getChatFull(j2);
                    String string = editText.getText().toString();
                    if (chatFull != null) {
                        String str2 = chatFull.about;
                        if ((str2 != null ? str2 : "").equals(string)) {
                            AndroidUtilities.hideKeyboard(editText);
                            alertDialog.dismiss();
                        } else {
                            chatFull.about = string;
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(i2);
                            int i3 = NotificationCenter.chatInfoDidLoad;
                            Boolean bool = Boolean.FALSE;
                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i3, chatFull, 0, bool, bool);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 2, Long.valueOf(j));
                    MessagesController.getInstance(i2).updateChatAbout(j2, string, chatFull);
                }
                alertDialog.dismiss();
                break;
            default:
                SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                if (j != 0) {
                    editorEdit.putInt("color_" + j, 0);
                } else if (i2 == 1) {
                    editorEdit.putInt("MessagesLed", 0);
                } else if (i2 == 0) {
                    editorEdit.putInt("GroupLed", 0);
                } else if (i2 == 3) {
                    editorEdit.putInt("StoriesLed", 0);
                } else if (i2 == 5 || i2 == 4) {
                    editorEdit.putInt("ReactionsLed", 0);
                } else {
                    editorEdit.putInt("ChannelLed", 0);
                }
                editorEdit.commit();
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }

    @Override
    public void run(String str) {
        ((SharedMediaLayout) this.f$0).lambda$openRenameStoriesAlbumAlert$70(this.f$1, str, this.f$2);
    }

    public VoIPService$$ExternalSyntheticLambda80(Object obj, int i, long j, int i2) {
        this.$r8$classId = i2;
        this.f$2 = j;
        this.f$1 = i;
        this.f$0 = obj;
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j) {
        ((VoIPService) this.f$0).lambda$createGroupInstance$78(this.f$1, this.f$2, tLObject, tL_error, j);
    }

    public VoIPService$$ExternalSyntheticLambda80(VoIPService voIPService, int i, long j) {
        this.$r8$classId = 0;
        this.f$0 = voIPService;
        this.f$1 = i;
        this.f$2 = j;
    }

    public VoIPService$$ExternalSyntheticLambda80(SharedMediaLayout sharedMediaLayout, long j, int i) {
        this.$r8$classId = 4;
        this.f$0 = sharedMediaLayout;
        this.f$2 = j;
        this.f$1 = i;
    }
}
