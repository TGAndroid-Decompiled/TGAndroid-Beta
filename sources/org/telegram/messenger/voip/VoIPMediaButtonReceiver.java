package org.telegram.messenger.voip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import java.io.IOException;

public class VoIPMediaButtonReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) throws InterruptedException, IOException {
        if (!"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().onMediaButtonEvent((KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT"));
    }
}
