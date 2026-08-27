package hh;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stars;

public final class x6 implements Runnable {

    public final int f10340a;

    public final MessagesStorage f10341b;

    public final int f10342c;
    public final ArrayList d;

    public final long f10343e;

    public x6(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f10340a = i11;
        this.f10341b = messagesStorage;
        this.f10342c = i10;
        this.d = arrayList;
        this.f10343e = j10;
    }

    @Override
    public final void run() {
        switch (this.f10340a) {
            case 0:
                int i10 = this.f10342c;
                long j10 = this.f10343e;
                SQLiteDatabase database = this.f10341b.getDatabase();
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
                try {
                    try {
                        database.executeFast("DELETE FROM star_gifts2").stepThis().dispose();
                        ArrayList arrayList = this.d;
                        if (arrayList != null) {
                            sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO star_gifts2 VALUES(?, ?, ?, ?, ?)");
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i11);
                                sQLitePreparedStatementExecuteFast.requery();
                                sQLitePreparedStatementExecuteFast.bindLong(1, starGift.f22607id);
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(starGift.getObjectSize());
                                starGift.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer);
                                sQLitePreparedStatementExecuteFast.bindLong(3, i10);
                                sQLitePreparedStatementExecuteFast.bindLong(4, j10);
                                sQLitePreparedStatementExecuteFast.bindInteger(5, i11);
                                sQLitePreparedStatementExecuteFast.step();
                                nativeByteBuffer.reuse();
                            }
                        }
                        if (sQLitePreparedStatementExecuteFast == null) {
                            return;
                        }
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        if (sQLitePreparedStatementExecuteFast == null) {
                            return;
                        }
                    }
                    return;
                } finally {
                    if (sQLitePreparedStatementExecuteFast != null) {
                        sQLitePreparedStatementExecuteFast.dispose();
                    }
                }
            case 1:
                this.f10341b.lambda$loadPendingTasks$27(this.f10342c, this.d, this.f10343e);
                return;
            default:
                this.f10341b.lambda$loadPendingTasks$28(this.f10342c, this.d, this.f10343e);
                return;
        }
    }

    public x6(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f10340a = 0;
        this.f10341b = messagesStorage;
        this.d = arrayList;
        this.f10342c = i10;
        this.f10343e = j10;
    }
}
