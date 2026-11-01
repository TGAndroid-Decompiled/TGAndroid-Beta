package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class kg implements Runnable {
    public final int f16626a;
    public final vi f16627b;
    public final String f16628c;
    public final boolean d;

    public kg(vi viVar, String str, boolean z10, int i10) {
        this.f16626a = i10;
        this.f16627b = viVar;
        this.f16628c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        SQLiteCursor queryFinalized;
        int i10 = 0;
        switch (this.f16626a) {
            case 0:
                this.f16627b.c1(this.f16628c, this.d, false);
                return;
            default:
                vi viVar = this.f16627b;
                String str = this.f16628c;
                SQLiteCursor sQLiteCursor = null;
                r5 = null;
                r5 = null;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = null;
                try {
                    queryFinalized = viVar.getMessagesStorage().f16333b.queryFinalized("SELECT data, date FROM stickers_dice WHERE emoji = ?", str);
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
                        i10 = queryFinalized.intValue(1);
                    }
                    queryFinalized.dispose();
                } catch (Throwable th3) {
                    th = th3;
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                    sQLiteCursor = queryFinalized;
                    try {
                        f8.g(th, true);
                        tL_messages_stickerSet2 = tL_messages_stickerSet;
                        viVar.s1(str, this.d, tL_messages_stickerSet2, true, i10);
                        return;
                    } finally {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                    }
                }
                viVar.s1(str, this.d, tL_messages_stickerSet2, true, i10);
                return;
        }
    }
}
