package ai;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stars;
public final class g9 implements Runnable {
    public final int f1349a;
    public final MessagesStorage f1350b;
    public final int f1351c;
    public final ArrayList d;
    public final long e;

    public g9(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f1349a = i11;
        this.f1350b = messagesStorage;
        this.f1351c = i10;
        this.d = arrayList;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f1349a) {
            case 0:
                int i10 = this.f1351c;
                long j10 = this.e;
                SQLiteDatabase database = this.f1350b.getDatabase();
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
                                sQLitePreparedStatement.bindLong(1, starGift.f20496id);
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
            case 1:
                this.f1350b.lambda$loadPendingTasks$27(this.f1351c, this.d, this.e);
                return;
            default:
                this.f1350b.lambda$loadPendingTasks$28(this.f1351c, this.d, this.e);
                return;
        }
    }

    public g9(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f1349a = 0;
        this.f1350b = messagesStorage;
        this.d = arrayList;
        this.f1351c = i10;
        this.e = j10;
    }
}
