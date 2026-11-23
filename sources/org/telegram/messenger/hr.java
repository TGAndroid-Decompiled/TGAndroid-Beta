package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
public final class hr implements Runnable {
    public final int f24528a;
    public final ur f24529b;
    public final long f24530c;
    public final ArrayList d;

    public hr(ur urVar, long j3, ArrayList arrayList, int i7) {
        this.f24528a = i7;
        this.f24529b = urVar;
        this.f24530c = j3;
        this.d = arrayList;
    }

    private final void a() {
        ArrayList arrayList = this.d;
        long j3 = this.f24530c;
        ur urVar = this.f24529b;
        urVar.getClass();
        try {
            String join = TextUtils.join(", ", arrayList);
            SQLiteDatabase sQLiteDatabase = urVar.f27252b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j3 + " AND topic_id IN (" + join + ")").stepThis().dispose();
            try {
                SQLiteDatabase sQLiteDatabase2 = urVar.f27252b;
                sQLiteDatabase2.executeFast("DELETE FROM messages_v2 WHERE uid = " + j3 + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j3 + " AND topic_id IN (" + join + "))").stepThis().dispose();
            } catch (SQLiteException e10) {
                e10.printStackTrace();
            }
            SQLiteDatabase sQLiteDatabase3 = urVar.f27252b;
            Locale locale2 = Locale.US;
            sQLiteDatabase3.executeFast("DELETE FROM messages_topics WHERE uid = " + j3 + " AND topic_id IN (" + join + ")").stepThis().dispose();
        } catch (SQLiteException e11) {
            e11.printStackTrace();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hr.run():void");
    }

    public hr(ur urVar, ArrayList arrayList, long j3, int i7) {
        this.f24528a = i7;
        this.f24529b = urVar;
        this.d = arrayList;
        this.f24530c = j3;
    }
}
