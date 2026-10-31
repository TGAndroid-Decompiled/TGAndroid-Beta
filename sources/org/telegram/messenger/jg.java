package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class jg implements Runnable {
    public final int f16273a;
    public final ui f16274b;
    public final String f16275c;
    public final boolean d;

    public jg(ui uiVar, String str, boolean z10, int i10) {
        this.f16273a = i10;
        this.f16274b = uiVar;
        this.f16275c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        SQLiteCursor queryFinalized;
        int i10 = 0;
        switch (this.f16273a) {
            case 0:
                this.f16274b.c1(this.f16275c, this.d, false);
                return;
            default:
                ui uiVar = this.f16274b;
                String str = this.f16275c;
                SQLiteCursor sQLiteCursor = null;
                r5 = null;
                r5 = null;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = null;
                try {
                    queryFinalized = uiVar.getMessagesStorage().f15940b.queryFinalized("SELECT data, date FROM stickers_dice WHERE emoji = ?", str);
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
                        uiVar.s1(str, this.d, tL_messages_stickerSet2, true, i10);
                        return;
                    } finally {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                    }
                }
                uiVar.s1(str, this.d, tL_messages_stickerSet2, true, i10);
                return;
        }
    }
}
