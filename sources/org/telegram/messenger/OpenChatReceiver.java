package org.telegram.messenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import org.telegram.p009ui.LaunchActivity;

public class OpenChatReceiver extends Activity {
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
        } else if (intent.getAction() == null || !intent.getAction().startsWith("com.tmessages.openchat")) {
            finish();
        } else {
            try {
                long longExtra = intent.getLongExtra("chatId", intent.getIntExtra("chatId", 0));
                long longExtra2 = intent.getLongExtra("userId", intent.getIntExtra("userId", 0));
                int intExtra = intent.getIntExtra("encId", 0);
                if (longExtra != 0 || longExtra2 != 0 || intExtra != 0) {
                    Intent intent2 = new Intent(this, LaunchActivity.class);
                    intent2.setAction(intent.getAction());
                    intent2.putExtras(intent);
                    startActivity(intent2);
                    finish();
                }
            } catch (Throwable th) {
                FileLog.m30e(th);
            }
        }
    }
}
