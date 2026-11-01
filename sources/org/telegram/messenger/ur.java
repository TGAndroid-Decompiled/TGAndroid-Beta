package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
public final class ur implements Runnable {
    public final int f18468a;
    public final is f18469b;
    public final ArrayList f18470c;
    public final long d;

    public ur(is isVar, long j10, ArrayList arrayList, int i10) {
        this.f18468a = i10;
        this.f18469b = isVar;
        this.d = j10;
        this.f18470c = arrayList;
    }

    private final void a() {
        ArrayList arrayList = this.f18470c;
        long j10 = this.d;
        is isVar = this.f18469b;
        isVar.getClass();
        try {
            String join = TextUtils.join(", ", arrayList);
            SQLiteDatabase sQLiteDatabase = isVar.f16333b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j10 + " AND topic_id IN (" + join + ")").stepThis().dispose();
            try {
                SQLiteDatabase sQLiteDatabase2 = isVar.f16333b;
                sQLiteDatabase2.executeFast("DELETE FROM messages_v2 WHERE uid = " + j10 + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j10 + " AND topic_id IN (" + join + "))").stepThis().dispose();
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
            SQLiteDatabase sQLiteDatabase3 = isVar.f16333b;
            Locale locale2 = Locale.US;
            sQLiteDatabase3.executeFast("DELETE FROM messages_topics WHERE uid = " + j10 + " AND topic_id IN (" + join + ")").stepThis().dispose();
        } catch (SQLiteException e7) {
            e7.printStackTrace();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ur.run():void");
    }

    public ur(is isVar, ArrayList arrayList, long j10, int i10) {
        this.f18468a = i10;
        this.f18469b = isVar;
        this.f18470c = arrayList;
        this.d = j10;
    }
}
