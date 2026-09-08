package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stars;
public final class cg implements Runnable {
    public final int f17433a;
    public final MessagesStorage f17434b;
    public final int f17435c;
    public final ArrayList d;
    public final long f17436e;

    public cg(int i10, int i11, long j3, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f17433a = i11;
        this.f17434b = messagesStorage;
        this.f17435c = i10;
        this.d = arrayList;
        this.f17436e = j3;
    }

    @Override
    public final void run() {
        switch (this.f17433a) {
            case 0:
                this.f17434b.lambda$loadPendingTasks$27(this.f17435c, this.d, this.f17436e);
                return;
            case 1:
                this.f17434b.lambda$loadPendingTasks$28(this.f17435c, this.d, this.f17436e);
                return;
            default:
                int i10 = this.f17435c;
                long j3 = this.f17436e;
                SQLiteDatabase database = this.f17434b.getDatabase();
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
                                sQLitePreparedStatement.bindLong(1, starGift.f20124id);
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
                    } catch (Exception e7) {
                        FileLog.e(e7);
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

    public cg(MessagesStorage messagesStorage, long j3, ArrayList arrayList, int i10) {
        this.f17433a = 2;
        this.f17434b = messagesStorage;
        this.d = arrayList;
        this.f17435c = i10;
        this.f17436e = j3;
    }
}
