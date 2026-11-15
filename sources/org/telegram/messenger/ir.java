package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
public final class ir implements Runnable {
    public final int f24431a;
    public final vr f24432b;
    public final ArrayList f24433c;
    public final long d;

    public ir(vr vrVar, long j3, ArrayList arrayList, int i7) {
        this.f24431a = i7;
        this.f24432b = vrVar;
        this.d = j3;
        this.f24433c = arrayList;
    }

    private final void a() {
        ArrayList arrayList = this.f24433c;
        long j3 = this.d;
        vr vrVar = this.f24432b;
        vrVar.getClass();
        try {
            String join = TextUtils.join(", ", arrayList);
            SQLiteDatabase sQLiteDatabase = vrVar.f27222b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j3 + " AND topic_id IN (" + join + ")").stepThis().dispose();
            try {
                SQLiteDatabase sQLiteDatabase2 = vrVar.f27222b;
                sQLiteDatabase2.executeFast("DELETE FROM messages_v2 WHERE uid = " + j3 + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j3 + " AND topic_id IN (" + join + "))").stepThis().dispose();
            } catch (SQLiteException e10) {
                e10.printStackTrace();
            }
            SQLiteDatabase sQLiteDatabase3 = vrVar.f27222b;
            Locale locale2 = Locale.US;
            sQLiteDatabase3.executeFast("DELETE FROM messages_topics WHERE uid = " + j3 + " AND topic_id IN (" + join + ")").stepThis().dispose();
        } catch (SQLiteException e11) {
            e11.printStackTrace();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ir.run():void");
    }

    public ir(vr vrVar, ArrayList arrayList, long j3, int i7) {
        this.f24431a = i7;
        this.f24432b = vrVar;
        this.f24433c = arrayList;
        this.d = j3;
    }
}
