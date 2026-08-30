package k3;

import android.content.SharedPreferences;
import android.widget.EditText;
import nh.p5;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.yu0;
public final class d implements h5.j, RequestDelegateTimestamp, c2, MessagesStorage.StringCallback {
    public final int f9702a;
    public final int f9703b;
    public final long f9704c;
    public final Object d;

    public d(Object obj, int i10, long j10, int i11) {
        this.f9702a = i11;
        this.f9704c = j10;
        this.f9703b = i10;
        this.d = obj;
    }

    @Override
    public void i(d2 d2Var, int i10) {
        int i11 = this.f9702a;
        Object obj = this.d;
        int i12 = this.f9703b;
        long j10 = this.f9704c;
        switch (i11) {
            case 2:
                EditText editText = (EditText) obj;
                String str = "";
                if (j10 > 0) {
                    TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(UserConfig.getInstance(i12).getClientUserId());
                    String trim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (userFull != null) {
                        String str2 = userFull.about;
                        if (str2 != null) {
                            str = str2;
                        }
                        if (str.equals(trim)) {
                            AndroidUtilities.hideKeyboard(editText);
                            d2Var.dismiss();
                            return;
                        }
                        userFull.about = trim;
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 2, Long.valueOf(j10));
                    ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new p5(8), 2);
                } else {
                    long j11 = -j10;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i12).getChatFull(j11);
                    String obj2 = editText.getText().toString();
                    if (chatFull != null) {
                        String str3 = chatFull.about;
                        if (str3 != null) {
                            str = str3;
                        }
                        if (str.equals(obj2)) {
                            AndroidUtilities.hideKeyboard(editText);
                            d2Var.dismiss();
                            return;
                        }
                        chatFull.about = obj2;
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(i12);
                        int i13 = NotificationCenter.chatInfoDidLoad;
                        Boolean bool = Boolean.FALSE;
                        notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, chatFull, 0, bool, bool);
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 2, Long.valueOf(j10));
                    MessagesController.getInstance(i12).updateChatAbout(j11, obj2, chatFull);
                }
                d2Var.dismiss();
                return;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                if (j10 != 0) {
                    edit.putInt("color_" + j10, 0);
                } else if (i12 == 1) {
                    edit.putInt("MessagesLed", 0);
                } else if (i12 == 0) {
                    edit.putInt("GroupLed", 0);
                } else if (i12 == 3) {
                    edit.putInt("StoriesLed", 0);
                } else if (i12 != 5 && i12 != 4) {
                    edit.putInt("ChannelLed", 0);
                } else {
                    edit.putInt("ReactionsLed", 0);
                }
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        b bVar = (b) obj;
        bVar.e((a) this.d, this.f9703b, this.f9704c);
    }

    @Override
    public void run(String str) {
        yu0.i((yu0) this.d, this.f9704c, this.f9703b, str);
    }

    public d(a aVar, int i10, long j10, long j11) {
        this.f9702a = 0;
        this.d = aVar;
        this.f9703b = i10;
        this.f9704c = j10;
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        ((VoIPService) this.d).lambda$createGroupInstance$78(this.f9703b, this.f9704c, tLObject, tL_error, j10);
    }

    public d(VoIPService voIPService, int i10, long j10) {
        this.f9702a = 1;
        this.d = voIPService;
        this.f9703b = i10;
        this.f9704c = j10;
    }

    public d(yu0 yu0Var, long j10, int i10) {
        this.f9702a = 4;
        this.d = yu0Var;
        this.f9704c = j10;
        this.f9703b = i10;
    }
}
