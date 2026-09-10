package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stars;
public final class kg implements Runnable {
    public final int f15637a;
    public final MessagesStorage f15638b;
    public final int f15639c;
    public final ArrayList d;
    public final long e;

    public kg(int i10, int i11, long j3, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f15637a = i11;
        this.f15638b = messagesStorage;
        this.f15639c = i10;
        this.d = arrayList;
        this.e = j3;
    }

    @Override
    public final void run() {
        switch (this.f15637a) {
            case 0:
                this.f15638b.lambda$loadPendingTasks$27(this.f15639c, this.d, this.e);
                return;
            case 1:
                this.f15638b.lambda$loadPendingTasks$28(this.f15639c, this.d, this.e);
                return;
            default:
                int i10 = this.f15639c;
                long j3 = this.e;
                SQLiteDatabase database = this.f15638b.getDatabase();
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
                                sQLitePreparedStatement.bindLong(1, starGift.f17425id);
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(starGift.getObjectSize());
                                starGift.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                                sQLitePreparedStatement.bindLong(3, i10);
                                sQLitePreparedStatement.bindLong(4, j3);
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

    public kg(MessagesStorage messagesStorage, long j3, ArrayList arrayList, int i10) {
        this.f15637a = 2;
        this.f15638b = messagesStorage;
        this.d = arrayList;
        this.f15639c = i10;
        this.e = j3;
    }
}
