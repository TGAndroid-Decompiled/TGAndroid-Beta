package org.telegram.messenger;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupManager;
import android.app.backup.SharedPreferencesBackupHelper;
public class BackupAgent extends BackupAgentHelper {
    public static BackupManager f21173a;

    public static void a() {
        if (f21173a == null) {
            f21173a = new BackupManager(t0.f25570b);
        }
        f21173a.dataChanged();
    }

    @Override
    public final void onCreate() {
        addHelper("prefs", new SharedPreferencesBackupHelper(this, "saved_tokens", "saved_tokens_login"));
    }
}
