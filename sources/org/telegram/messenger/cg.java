package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class cg implements Runnable {
    public final int f22017a;
    public final li f22018b;
    public final String f22019c;
    public final boolean d;

    public cg(li liVar, String str, boolean z10, int i3) {
        this.f22017a = i3;
        this.f22018b = liVar;
        this.f22019c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        SQLiteCursor queryFinalized;
        int i3 = 0;
        switch (this.f22017a) {
            case 0:
                this.f22018b.c1(this.f22019c, this.d, false);
                return;
            default:
                li liVar = this.f22018b;
                String str = this.f22019c;
                SQLiteCursor sQLiteCursor = null;
                r5 = null;
                r5 = null;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = null;
                try {
                    queryFinalized = liVar.getMessagesStorage().f24936b.queryFinalized("SELECT data, date FROM stickers_dice WHERE emoji = ?", str);
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
                        i3 = queryFinalized.intValue(1);
                    }
                    queryFinalized.dispose();
                } catch (Throwable th3) {
                    th = th3;
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                    sQLiteCursor = queryFinalized;
                    try {
                        a8.g(th, true);
                        tL_messages_stickerSet2 = tL_messages_stickerSet;
                        liVar.s1(str, this.d, tL_messages_stickerSet2, true, i3);
                        return;
                    } finally {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                    }
                }
                liVar.s1(str, this.d, tL_messages_stickerSet2, true, i3);
                return;
        }
    }
}
