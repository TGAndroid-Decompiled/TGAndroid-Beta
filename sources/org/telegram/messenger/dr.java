package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
public final class dr implements Runnable {
    public final int f22237a;
    public final qr f22238b;
    public final ArrayList f22239c;
    public final long d;

    public dr(qr qrVar, long j10, ArrayList arrayList, int i3) {
        this.f22237a = i3;
        this.f22238b = qrVar;
        this.d = j10;
        this.f22239c = arrayList;
    }

    private final void a() {
        ArrayList arrayList = this.f22239c;
        long j10 = this.d;
        qr qrVar = this.f22238b;
        qrVar.getClass();
        try {
            String join = TextUtils.join(", ", arrayList);
            SQLiteDatabase sQLiteDatabase = qrVar.f24936b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j10 + " AND topic_id IN (" + join + ")").stepThis().dispose();
            try {
                SQLiteDatabase sQLiteDatabase2 = qrVar.f24936b;
                sQLiteDatabase2.executeFast("DELETE FROM messages_v2 WHERE uid = " + j10 + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j10 + " AND topic_id IN (" + join + "))").stepThis().dispose();
            } catch (SQLiteException e10) {
                e10.printStackTrace();
            }
            SQLiteDatabase sQLiteDatabase3 = qrVar.f24936b;
            Locale locale2 = Locale.US;
            sQLiteDatabase3.executeFast("DELETE FROM messages_topics WHERE uid = " + j10 + " AND topic_id IN (" + join + ")").stepThis().dispose();
        } catch (SQLiteException e11) {
            e11.printStackTrace();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dr.run():void");
    }

    public dr(qr qrVar, ArrayList arrayList, long j10, int i3) {
        this.f22237a = i3;
        this.f22238b = qrVar;
        this.f22239c = arrayList;
        this.d = j10;
    }
}
