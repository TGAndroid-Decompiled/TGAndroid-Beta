package org.telegram.messenger;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupManager;
import android.app.backup.SharedPreferencesBackupHelper;
public class BackupAgent extends BackupAgentHelper {
    public static BackupManager f22605a;

    public static void a() {
        if (f22605a == null) {
            f22605a = new BackupManager(t0.f26895b);
        }
        f22605a.dataChanged();
    }

    @Override
    public final void onCreate() {
        addHelper("prefs", new SharedPreferencesBackupHelper(this, "saved_tokens", "saved_tokens_login"));
    }
}
