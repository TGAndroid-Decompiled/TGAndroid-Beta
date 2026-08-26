package org.telegram.messenger;

import org.telegram.SQLite.SQLiteDatabase;

public abstract class DatabaseMigrationHelper$$ExternalSyntheticOutline3 {
    public static void m(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        sQLiteDatabase.executeFast(str2).stepThis().dispose();
        sQLiteDatabase.executeFast(str3).stepThis().dispose();
        sQLiteDatabase.executeFast(str4).stepThis().dispose();
    }
}
