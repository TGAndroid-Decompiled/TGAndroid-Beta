package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
public final class lr implements Runnable {
    public final int f23922a;
    public final yr f23923b;
    public final ArrayList f23924c;
    public final long d;

    public lr(yr yrVar, long j3, ArrayList arrayList, int i7) {
        this.f23922a = i7;
        this.f23923b = yrVar;
        this.d = j3;
        this.f23924c = arrayList;
    }

    private final void a() {
        ArrayList arrayList = this.f23924c;
        long j3 = this.d;
        yr yrVar = this.f23923b;
        yrVar.getClass();
        try {
            String join = TextUtils.join(", ", arrayList);
            SQLiteDatabase sQLiteDatabase = yrVar.f26698b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j3 + " AND topic_id IN (" + join + ")").stepThis().dispose();
            try {
                SQLiteDatabase sQLiteDatabase2 = yrVar.f26698b;
                sQLiteDatabase2.executeFast("DELETE FROM messages_v2 WHERE uid = " + j3 + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j3 + " AND topic_id IN (" + join + "))").stepThis().dispose();
            } catch (SQLiteException e10) {
                e10.printStackTrace();
            }
            SQLiteDatabase sQLiteDatabase3 = yrVar.f26698b;
            Locale locale2 = Locale.US;
            sQLiteDatabase3.executeFast("DELETE FROM messages_topics WHERE uid = " + j3 + " AND topic_id IN (" + join + ")").stepThis().dispose();
        } catch (SQLiteException e11) {
            e11.printStackTrace();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lr.run():void");
    }

    public lr(yr yrVar, ArrayList arrayList, long j3, int i7) {
        this.f23922a = i7;
        this.f23923b = yrVar;
        this.f23924c = arrayList;
        this.d = j3;
    }
}
