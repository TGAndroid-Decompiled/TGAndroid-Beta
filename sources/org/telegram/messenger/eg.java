package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stars;
public final class eg implements Runnable {
    public final int f16877a;
    public final MessagesStorage f16878b;
    public final int f16879c;
    public final ArrayList d;
    public final long e;

    public eg(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f16877a = i11;
        this.f16878b = messagesStorage;
        this.f16879c = i10;
        this.d = arrayList;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f16877a) {
            case 0:
                this.f16878b.lambda$loadPendingTasks$27(this.f16879c, this.d, this.e);
                return;
            case 1:
                this.f16878b.lambda$loadPendingTasks$28(this.f16879c, this.d, this.e);
                return;
            default:
                int i10 = this.f16879c;
                long j10 = this.e;
                SQLiteDatabase database = this.f16878b.getDatabase();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        database.executeFast("DELETE FROM star_gifts2").stepThis().dispose();
                        ArrayList arrayList = this.d;
                        if (arrayList != null) {
                            sQLitePreparedStatement = database.executeFast("REPLACE INTO star_gifts2 VALUES(?, ?, ?, ?, ?)");
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i11);
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindLong(1, starGift.f19141id);
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(starGift.getObjectSize());
                                starGift.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                                sQLitePreparedStatement.bindLong(3, i10);
                                sQLitePreparedStatement.bindLong(4, j10);
                                sQLitePreparedStatement.bindInteger(5, i11);
                                sQLitePreparedStatement.step();
                                nativeByteBuffer.reuse();
                            }
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
        }
    }

    public eg(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f16877a = 2;
        this.f16878b = messagesStorage;
        this.d = arrayList;
        this.f16879c = i10;
        this.e = j10;
    }
}
