package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class jg implements Runnable {
    public final int f24853a;
    public final ri f24854b;
    public final String f24855c;
    public final boolean d;

    public jg(ri riVar, String str, boolean z10, int i7) {
        this.f24853a = i7;
        this.f24854b = riVar;
        this.f24855c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        SQLiteCursor queryFinalized;
        int i7 = 0;
        switch (this.f24853a) {
            case 0:
                this.f24854b.f1(this.f24855c, this.d, false);
                return;
            default:
                ri riVar = this.f24854b;
                String str = this.f24855c;
                SQLiteCursor sQLiteCursor = null;
                r5 = null;
                r5 = null;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = null;
                try {
                    queryFinalized = riVar.getMessagesStorage().f27056b.queryFinalized("SELECT data, date FROM stickers_dice WHERE emoji = ?", str);
                } catch (Throwable th2) {
                    th = th2;
                    tL_messages_stickerSet = null;
                }
                try {
                    if (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            tL_messages_stickerSet2 = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                        }
                        i7 = queryFinalized.intValue(1);
                    }
                    queryFinalized.dispose();
                } catch (Throwable th3) {
                    th = th3;
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                    sQLiteCursor = queryFinalized;
                    try {
                        a8.g(th, true);
                        tL_messages_stickerSet2 = tL_messages_stickerSet;
                        riVar.v1(str, this.d, tL_messages_stickerSet2, true, i7);
                        return;
                    } finally {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                    }
                }
                riVar.v1(str, this.d, tL_messages_stickerSet2, true, i7);
                return;
        }
    }
}
