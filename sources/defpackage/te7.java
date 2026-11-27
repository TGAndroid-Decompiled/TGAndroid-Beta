package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class te7 implements Runnable {
    public final byte a;
    public final kf7 b;
    public final long c;
    public final ArrayList d;

    public te7(kf7 kf7Var, long j, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.c = j;
        this.d = arrayList;
    }

    private final void a() {
        kf7 kf7Var = this.b;
        ArrayList arrayList = this.d;
        long j = this.c;
        try {
            String join = TextUtils.join(", ", arrayList);
            SQLiteDatabase sQLiteDatabase = kf7Var.b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j + " AND topic_id IN (" + join + ")").stepThis().dispose();
            try {
                SQLiteDatabase sQLiteDatabase2 = kf7Var.b;
                sQLiteDatabase2.executeFast("DELETE FROM messages_v2 WHERE uid = " + j + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j + " AND topic_id IN (" + join + "))").stepThis().dispose();
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
            SQLiteDatabase sQLiteDatabase3 = kf7Var.b;
            Locale locale2 = Locale.US;
            sQLiteDatabase3.executeFast("DELETE FROM messages_topics WHERE uid = " + j + " AND topic_id IN (" + join + ")").stepThis().dispose();
        } catch (SQLiteException e2) {
            e2.printStackTrace();
        }
    }

    private final void b() {
        Exception exc;
        Throwable th;
        SQLitePreparedStatement executeFast;
        kf7 kf7Var = this.b;
        long j = this.c;
        ArrayList arrayList = this.d;
        long j2 = -j;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                kf7Var.b.executeFast("DELETE FROM channel_users_v2 WHERE did = " + j2).stepThis().dispose();
                kf7Var.b.beginTransaction();
                executeFast = kf7Var.b.executeFast("REPLACE INTO channel_users_v2 VALUES(?, ?, ?, ?)");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e) {
            exc = e;
        }
        try {
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) arrayList.get(i);
                executeFast.requery();
                executeFast.bindLong(1, j2);
                executeFast.bindLong(2, r47.B1(channelParticipant.peer));
                executeFast.bindInteger(3, currentTimeMillis);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(channelParticipant.getObjectSize());
                channelParticipant.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(4, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
                currentTimeMillis--;
            }
            executeFast.dispose();
            kf7Var.b.commitTransaction();
            kf7Var.F0(j, true, null, false, true, 0);
            SQLiteDatabase sQLiteDatabase = kf7Var.b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e2) {
            exc = e2;
            sQLitePreparedStatement = executeFast;
            kf7Var.p(exc, true);
            SQLiteDatabase sQLiteDatabase2 = kf7Var.b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
        } catch (Throwable th3) {
            th = th3;
            sQLitePreparedStatement = executeFast;
            SQLiteDatabase sQLiteDatabase3 = kf7Var.b;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te7.run():void");
    }

    public te7(kf7 kf7Var, ArrayList arrayList, long j, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.d = arrayList;
        this.c = j;
    }
}
