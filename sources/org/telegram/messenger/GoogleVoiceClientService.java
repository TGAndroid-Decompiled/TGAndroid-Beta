package org.telegram.messenger;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import org.telegram.tgnet.TLRPC$User;

public class GoogleVoiceClientService extends SearchActionVerificationClientService {
    @Override
    public void performAction(final Intent intent, boolean z, Bundle bundle) {
        if (z) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    GoogleVoiceClientService.lambda$performAction$0(intent);
                }
            });
        }
    }

    public static void lambda$performAction$0(Intent intent) {
        try {
            int i = UserConfig.selectedAccount;
            ApplicationLoader.postInitApplication();
            if (!AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter) {
                String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                if (!TextUtils.isEmpty(stringExtra)) {
                    String stringExtra2 = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI");
                    long parseLong = Long.parseLong(intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID"));
                    TLRPC$User user = MessagesController.getInstance(i).getUser(Long.valueOf(parseLong));
                    if (user == null && (user = MessagesStorage.getInstance(i).getUserSync(parseLong)) != null) {
                        MessagesController.getInstance(i).putUser(user, true);
                    }
                    if (user != null) {
                        ContactsController.getInstance(i).markAsContacted(stringExtra2);
                        SendMessagesHelper.getInstance(i).sendMessage(stringExtra, user.id, null, null, null, true, null, null, null, true, 0, null);
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
