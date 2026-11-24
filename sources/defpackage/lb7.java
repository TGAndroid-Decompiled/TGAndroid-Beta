package defpackage;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stars;
public final class lb7 implements Runnable {
    public final byte a;
    public final ad7 b;
    public final int c;
    public final ArrayList d;
    public final long e;

    public lb7(ad7 ad7Var, ArrayList arrayList, int i, long j) {
        this.a = (byte) 2;
        this.b = ad7Var;
        this.d = arrayList;
        this.c = i;
        this.e = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.e;
        int i = this.c;
        ArrayList arrayList = this.d;
        ad7 ad7Var = this.b;
        switch (b) {
            case 0:
                ad7Var.getMessagesController().o4(i, j, arrayList);
                return;
            case 1:
                ad7Var.getMessagesController().c(null, this.c, -1, this.d, this.e);
                return;
            default:
                SQLiteDatabase sQLiteDatabase = ad7Var.b;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLiteDatabase.executeFast("DELETE FROM star_gifts2").stepThis().dispose();
                        if (arrayList != null) {
                            sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO star_gifts2 VALUES(?, ?, ?, ?, ?)");
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i2);
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindLong(1, starGift.id);
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(starGift.getObjectSize());
                                starGift.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                                sQLitePreparedStatement.bindLong(3, i);
                                sQLitePreparedStatement.bindLong(4, j);
                                sQLitePreparedStatement.bindInteger(5, i2);
                                sQLitePreparedStatement.step();
                                nativeByteBuffer.reuse();
                            }
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e) {
                        fa4.g(e, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    return;
                } finally {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                }
        }
    }

    public lb7(ad7 ad7Var, int i, ArrayList arrayList, long j, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.c = i;
        this.d = arrayList;
        this.e = j;
    }
}
