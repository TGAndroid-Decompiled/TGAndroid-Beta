package org.telegram.messenger;

import org.telegram.SQLite.SQLiteDatabase;

public abstract class DatabaseMigrationHelper$$ExternalSyntheticOutline0 {
    public static void m(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
    }
}
