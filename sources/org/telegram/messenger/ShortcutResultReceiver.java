package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ShortcutResultReceiver extends BroadcastReceiver {
    public static void lambda$onReceive$0(Utilities.Callback callback) {
        callback.run(Boolean.TRUE);
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", UserConfig.selectedAccount);
        Utilities.Callback<Boolean> callbackRemove = MediaDataController.getInstance(intExtra).shortcutCallbacks.remove(intent.getStringExtra("req_id"));
        if (callbackRemove != null) {
            AndroidUtilities.runOnUIThread(new MessagesStorage$$ExternalSyntheticLambda257(10, callbackRemove));
        }
    }
}
