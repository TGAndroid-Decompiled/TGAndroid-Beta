package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
public abstract class rhe {
    public static KeyEvent a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("android.intent.extra.KEY_EVENT")) {
                    return (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
                }
            } catch (RuntimeException e) {
                efd.g("DefaultActionFactory", "Failed to get parcelable key event", e);
            }
        }
        return null;
    }
}
