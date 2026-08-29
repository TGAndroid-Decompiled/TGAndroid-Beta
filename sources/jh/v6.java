package jh;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stars;
public final class v6 implements Runnable {
    public final int f12966a;
    public final MessagesStorage f12967b;
    public final int f12968c;
    public final ArrayList d;
    public final long f12969e;

    public v6(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f12966a = i11;
        this.f12967b = messagesStorage;
        this.f12968c = i10;
        this.d = arrayList;
        this.f12969e = j10;
    }

    @Override
    public final void run() {
        switch (this.f12966a) {
            case 0:
                int i10 = this.f12968c;
                long j10 = this.f12969e;
                SQLiteDatabase database = this.f12967b.getDatabase();
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
                                sQLitePreparedStatement.bindLong(1, starGift.f22619id);
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
                    } catch (Exception e10) {
                        FileLog.e(e10);
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
            case 1:
                this.f12967b.lambda$loadPendingTasks$27(this.f12968c, this.d, this.f12969e);
                return;
            default:
                this.f12967b.lambda$loadPendingTasks$28(this.f12968c, this.d, this.f12969e);
                return;
        }
    }

    public v6(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f12966a = 0;
        this.f12967b = messagesStorage;
        this.d = arrayList;
        this.f12968c = i10;
        this.f12969e = j10;
    }
}
