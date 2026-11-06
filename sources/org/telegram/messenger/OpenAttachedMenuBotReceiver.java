package org.telegram.messenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import org.telegram.ui.LaunchActivity;
public class OpenAttachedMenuBotReceiver extends Activity {
    public static final int f21327a = 0;

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
        } else if (intent.getAction() != null && intent.getAction().startsWith("com.tmessages.openshortcutbot")) {
            try {
                if (intent.getLongExtra("botId", 0L) == 0) {
                    return;
                }
                Intent intent2 = new Intent(this, LaunchActivity.class);
                intent2.setAction(intent.getAction());
                intent2.putExtras(intent);
                startActivity(intent2);
                finish();
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        } else {
            finish();
        }
    }
}
