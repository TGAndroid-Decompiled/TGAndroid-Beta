package org.telegram.messenger;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupManager;
import android.app.backup.SharedPreferencesBackupHelper;
public class BackupAgent extends BackupAgentHelper {
    public static BackupManager f22708a;

    public static void a() {
        if (f22708a == null) {
            f22708a = new BackupManager(t0.f27013b);
        }
        f22708a.dataChanged();
    }

    @Override
    public final void onCreate() {
        addHelper("prefs", new SharedPreferencesBackupHelper(this, "saved_tokens", "saved_tokens_login"));
    }
}
