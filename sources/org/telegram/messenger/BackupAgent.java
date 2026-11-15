package org.telegram.messenger;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupManager;
import android.app.backup.SharedPreferencesBackupHelper;
public class BackupAgent extends BackupAgentHelper {
    public static BackupManager f22247a;

    public static void a() {
        if (f22247a == null) {
            f22247a = new BackupManager(t0.f26609b);
        }
        f22247a.dataChanged();
    }

    @Override
    public final void onCreate() {
        addHelper("prefs", new SharedPreferencesBackupHelper(this, "saved_tokens", "saved_tokens_login"));
    }
}
