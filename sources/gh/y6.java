package gh;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stars;
public final class y6 implements Runnable {
    public final int f9225a;
    public final MessagesStorage f9226b;
    public final int f9227c;
    public final ArrayList d;
    public final long f9228e;

    public y6(int i9, int i10, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f9225a = i10;
        this.f9226b = messagesStorage;
        this.f9227c = i9;
        this.d = arrayList;
        this.f9228e = j10;
    }

    @Override
    public final void run() {
        switch (this.f9225a) {
            case 0:
                int i9 = this.f9227c;
                long j10 = this.f9228e;
                SQLiteDatabase database = this.f9226b.getDatabase();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        database.executeFast("DELETE FROM star_gifts2").stepThis().dispose();
                        ArrayList arrayList = this.d;
                        if (arrayList != null) {
                            sQLitePreparedStatement = database.executeFast("REPLACE INTO star_gifts2 VALUES(?, ?, ?, ?, ?)");
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i10);
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindLong(1, starGift.f22607id);
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(starGift.getObjectSize());
                                starGift.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                                sQLitePreparedStatement.bindLong(3, i9);
                                sQLitePreparedStatement.bindLong(4, j10);
                                sQLitePreparedStatement.bindInteger(5, i10);
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
                } catch (Throwable th) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            case 1:
                this.f9226b.lambda$loadPendingTasks$27(this.f9227c, this.d, this.f9228e);
                return;
            default:
                this.f9226b.lambda$loadPendingTasks$28(this.f9227c, this.d, this.f9228e);
                return;
        }
    }

    public y6(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i9) {
        this.f9225a = 0;
        this.f9226b = messagesStorage;
        this.d = arrayList;
        this.f9227c = i9;
        this.f9228e = j10;
    }
}
