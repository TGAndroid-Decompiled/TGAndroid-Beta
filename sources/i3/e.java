package i3;

import android.content.SharedPreferences;
import android.widget.EditText;
import jh.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.hu0;

public final class e implements d5.k, RequestDelegateTimestamp, a2, MessagesStorage.StringCallback {

    public final int f10527a;

    public final int f10528b;

    public final long f10529c;
    public final Object d;

    public e(a aVar, int i10, long j10, long j11) {
        this.f10527a = 0;
        this.d = aVar;
        this.f10528b = i10;
        this.f10529c = j10;
    }

    @Override
    public void f(b2 b2Var, int i10) {
        int i11 = this.f10527a;
        Object obj = this.d;
        int i12 = this.f10528b;
        long j10 = this.f10529c;
        switch (i11) {
            case 2:
                EditText editText = (EditText) obj;
                if (j10 > 0) {
                    TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(UserConfig.getInstance(i12).getClientUserId());
                    String strTrim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (userFull != null) {
                        String str = userFull.about;
                        if ((str != null ? str : "").equals(strTrim)) {
                            AndroidUtilities.hideKeyboard(editText);
                            b2Var.dismiss();
                        } else {
                            userFull.about = strTrim;
                            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
                        }
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = strTrim;
                    updateprofile.flags |= 4;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 2, Long.valueOf(j10));
                    ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new m5(9), 2);
                } else {
                    long j11 = -j10;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i12).getChatFull(j11);
                    String string = editText.getText().toString();
                    if (chatFull != null) {
                        String str2 = chatFull.about;
                        if ((str2 != null ? str2 : "").equals(string)) {
                            AndroidUtilities.hideKeyboard(editText);
                            b2Var.dismiss();
                        } else {
                            chatFull.about = string;
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(i12);
                            int i13 = NotificationCenter.chatInfoDidLoad;
                            Boolean bool = Boolean.FALSE;
                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, chatFull, 0, bool, bool);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 2, Long.valueOf(j10));
                    MessagesController.getInstance(i12).updateChatAbout(j11, string, chatFull);
                }
                b2Var.dismiss();
                break;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                if (j10 != 0) {
                    editorEdit.putInt("color_" + j10, 0);
                } else if (i12 == 1) {
                    editorEdit.putInt("MessagesLed", 0);
                } else if (i12 == 0) {
                    editorEdit.putInt("GroupLed", 0);
                } else if (i12 == 3) {
                    editorEdit.putInt("StoriesLed", 0);
                } else if (i12 == 5 || i12 == 4) {
                    editorEdit.putInt("ReactionsLed", 0);
                } else {
                    editorEdit.putInt("ChannelLed", 0);
                }
                editorEdit.commit();
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((b) obj).i((a) this.d, this.f10528b, this.f10529c);
    }

    @Override
    public void run(String str) {
        hu0.i((hu0) this.d, this.f10529c, this.f10528b, str);
    }

    public e(Object obj, int i10, long j10, int i11) {
        this.f10527a = i11;
        this.f10529c = j10;
        this.f10528b = i10;
        this.d = obj;
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        ((VoIPService) this.d).lambda$createGroupInstance$78(this.f10528b, this.f10529c, tLObject, tL_error, j10);
    }

    public e(VoIPService voIPService, int i10, long j10) {
        this.f10527a = 1;
        this.d = voIPService;
        this.f10528b = i10;
        this.f10529c = j10;
    }

    public e(hu0 hu0Var, long j10, int i10) {
        this.f10527a = 4;
        this.d = hu0Var;
        this.f10529c = j10;
        this.f10528b = i10;
    }
}
