package defpackage;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class yn6 implements Runnable {
    public final byte a;
    public final hq6 b;
    public final String c;
    public final boolean d;

    public yn6(hq6 hq6Var, String str, boolean z, byte b) {
        this.a = b;
        this.b = hq6Var;
        this.c = str;
        this.d = z;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        SQLiteCursor queryFinalized;
        int i = 0;
        switch (this.a) {
            case 0:
                this.b.d1(this.c, this.d, false);
                return;
            default:
                hq6 hq6Var = this.b;
                String str = this.c;
                SQLiteCursor sQLiteCursor = null;
                r5 = null;
                r5 = null;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = null;
                try {
                    queryFinalized = hq6Var.getMessagesStorage().b.queryFinalized("SELECT data, date FROM stickers_dice WHERE emoji = ?", str);
                } catch (Throwable th) {
                    th = th;
                    tL_messages_stickerSet = null;
                }
                try {
                    if (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            tL_messages_stickerSet2 = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                        }
                        i = queryFinalized.intValue(1);
                    }
                    queryFinalized.dispose();
                } catch (Throwable th2) {
                    th = th2;
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                    sQLiteCursor = queryFinalized;
                    try {
                        fa4.g(th, true);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        tL_messages_stickerSet2 = tL_messages_stickerSet;
                        hq6Var.t1(str, this.d, tL_messages_stickerSet2, true, i);
                        return;
                    } catch (Throwable th3) {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th3;
                    }
                }
                hq6Var.t1(str, this.d, tL_messages_stickerSet2, true, i);
                return;
        }
    }
}
