package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class se7 implements Runnable {
    public final byte a;
    public final jf7 b;
    public final ArrayList c;
    public final long d;

    public se7(jf7 jf7Var, long j, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = jf7Var;
        this.d = j;
        this.c = arrayList;
    }

    private final void a() {
        jf7 jf7Var = this.b;
        ArrayList arrayList = this.c;
        long j = this.d;
        try {
            String join = TextUtils.join(", ", arrayList);
            SQLiteDatabase sQLiteDatabase = jf7Var.b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j + " AND topic_id IN (" + join + ")").stepThis().dispose();
            try {
                SQLiteDatabase sQLiteDatabase2 = jf7Var.b;
                sQLiteDatabase2.executeFast("DELETE FROM messages_v2 WHERE uid = " + j + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j + " AND topic_id IN (" + join + "))").stepThis().dispose();
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
            SQLiteDatabase sQLiteDatabase3 = jf7Var.b;
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
        jf7 jf7Var = this.b;
        long j = this.d;
        ArrayList arrayList = this.c;
        long j2 = -j;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                jf7Var.b.executeFast("DELETE FROM channel_users_v2 WHERE did = " + j2).stepThis().dispose();
                jf7Var.b.beginTransaction();
                executeFast = jf7Var.b.executeFast("REPLACE INTO channel_users_v2 VALUES(?, ?, ?, ?)");
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
            jf7Var.b.commitTransaction();
            jf7Var.C0(j, true, null, false, true, 0);
            SQLiteDatabase sQLiteDatabase = jf7Var.b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e2) {
            exc = e2;
            sQLitePreparedStatement = executeFast;
            jf7Var.n(exc, true);
            SQLiteDatabase sQLiteDatabase2 = jf7Var.b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
        } catch (Throwable th3) {
            th = th3;
            sQLitePreparedStatement = executeFast;
            SQLiteDatabase sQLiteDatabase3 = jf7Var.b;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se7.run():void");
    }

    public se7(jf7 jf7Var, ArrayList arrayList, long j, byte b) {
        this.a = b;
        this.b = jf7Var;
        this.c = arrayList;
        this.d = j;
    }
}
