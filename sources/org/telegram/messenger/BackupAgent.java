package org.telegram.messenger;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupManager;
import android.app.backup.SharedPreferencesBackupHelper;
public class BackupAgent extends BackupAgentHelper {
    public static BackupManager a;

    public static void a() {
        BackupManager backupManager = a;
        if (backupManager == null) {
            backupManager = new BackupManager(a.b);
            a = backupManager;
        }
        backupManager.dataChanged();
    }

    @Override
    public final void onCreate() {
        addHelper("prefs", new SharedPreferencesBackupHelper(this, "saved_tokens", "saved_tokens_login"));
    }
}
