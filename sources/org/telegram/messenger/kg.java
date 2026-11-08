package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class kg implements Runnable {
    public final int f23686a;
    public final ui f23687b;
    public final String f23688c;
    public final boolean d;

    public kg(ui uiVar, String str, boolean z9, int i7) {
        this.f23686a = i7;
        this.f23687b = uiVar;
        this.f23688c = str;
        this.d = z9;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        SQLiteCursor queryFinalized;
        int i7 = 0;
        switch (this.f23686a) {
            case 0:
                this.f23687b.c1(this.f23688c, this.d, false);
                return;
            default:
                ui uiVar = this.f23687b;
                String str = this.f23688c;
                SQLiteCursor sQLiteCursor = null;
                r5 = null;
                r5 = null;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = null;
                try {
                    queryFinalized = uiVar.getMessagesStorage().f26721b.queryFinalized("SELECT data, date FROM stickers_dice WHERE emoji = ?", str);
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
                        uiVar.s1(str, this.d, tL_messages_stickerSet2, true, i7);
                        return;
                    } finally {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                    }
                }
                uiVar.s1(str, this.d, tL_messages_stickerSet2, true, i7);
                return;
        }
    }
}
