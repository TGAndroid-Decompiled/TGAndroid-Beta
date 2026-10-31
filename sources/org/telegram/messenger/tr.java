package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
public final class tr implements Runnable {
    public final int f18099a;
    public final hs f18100b;
    public final ArrayList f18101c;
    public final long d;

    public tr(hs hsVar, long j10, ArrayList arrayList, int i10) {
        this.f18099a = i10;
        this.f18100b = hsVar;
        this.d = j10;
        this.f18101c = arrayList;
    }

    private final void a() {
        ArrayList arrayList = this.f18101c;
        long j10 = this.d;
        hs hsVar = this.f18100b;
        hsVar.getClass();
        try {
            String join = TextUtils.join(", ", arrayList);
            SQLiteDatabase sQLiteDatabase = hsVar.f15940b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j10 + " AND topic_id IN (" + join + ")").stepThis().dispose();
            try {
                SQLiteDatabase sQLiteDatabase2 = hsVar.f15940b;
                sQLiteDatabase2.executeFast("DELETE FROM messages_v2 WHERE uid = " + j10 + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j10 + " AND topic_id IN (" + join + "))").stepThis().dispose();
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
            SQLiteDatabase sQLiteDatabase3 = hsVar.f15940b;
            Locale locale2 = Locale.US;
            sQLiteDatabase3.executeFast("DELETE FROM messages_topics WHERE uid = " + j10 + " AND topic_id IN (" + join + ")").stepThis().dispose();
        } catch (SQLiteException e7) {
            e7.printStackTrace();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tr.run():void");
    }

    public tr(hs hsVar, ArrayList arrayList, long j10, int i10) {
        this.f18099a = i10;
        this.f18100b = hsVar;
        this.f18101c = arrayList;
        this.d = j10;
    }
}
