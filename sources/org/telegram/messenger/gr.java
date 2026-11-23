package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
public final class gr implements Runnable {
    public final int f24398a;
    public final tr f24399b;
    public final long f24400c;
    public final ArrayList d;

    public gr(tr trVar, long j3, ArrayList arrayList, int i7) {
        this.f24398a = i7;
        this.f24399b = trVar;
        this.f24400c = j3;
        this.d = arrayList;
    }

    private final void a() {
        ArrayList arrayList = this.d;
        long j3 = this.f24400c;
        tr trVar = this.f24399b;
        trVar.getClass();
        try {
            String join = TextUtils.join(", ", arrayList);
            SQLiteDatabase sQLiteDatabase = trVar.f27151b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j3 + " AND topic_id IN (" + join + ")").stepThis().dispose();
            try {
                SQLiteDatabase sQLiteDatabase2 = trVar.f27151b;
                sQLiteDatabase2.executeFast("DELETE FROM messages_v2 WHERE uid = " + j3 + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j3 + " AND topic_id IN (" + join + "))").stepThis().dispose();
            } catch (SQLiteException e10) {
                e10.printStackTrace();
            }
            SQLiteDatabase sQLiteDatabase3 = trVar.f27151b;
            Locale locale2 = Locale.US;
            sQLiteDatabase3.executeFast("DELETE FROM messages_topics WHERE uid = " + j3 + " AND topic_id IN (" + join + ")").stepThis().dispose();
        } catch (SQLiteException e11) {
            e11.printStackTrace();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gr.run():void");
    }

    public gr(tr trVar, ArrayList arrayList, long j3, int i7) {
        this.f24398a = i7;
        this.f24399b = trVar;
        this.d = arrayList;
        this.f24400c = j3;
    }
}
