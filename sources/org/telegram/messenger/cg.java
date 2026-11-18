package org.telegram.messenger;

import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class cg implements Runnable {
    public final int f23348a;
    public final ri f23349b;
    public final TLRPC.TL_messages_stickerSet f23350c;

    public cg(ri riVar, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i7) {
        this.f23348a = i7;
        this.f23349b = riVar;
        this.f23350c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        int i7 = this.f23348a;
        String str = "";
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f23350c;
        ri riVar = this.f23349b;
        switch (i7) {
            case 0:
                riVar.N.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f28430id);
                riVar.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet.set.f28430id), tL_messages_stickerSet);
                return;
            case 1:
                riVar.N.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f28430id);
                riVar.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet.set.f28430id), tL_messages_stickerSet);
                return;
            case 2:
                a0.h hVar = riVar.I[4];
                for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
                    hVar.k(document, document.f28409id);
                }
                return;
            case 3:
                try {
                    SQLitePreparedStatement executeFast = riVar.getMessagesStorage().f27054b.executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    executeFast.requery();
                    executeFast.bindString(1, "s_" + tL_messages_stickerSet.set.f28430id);
                    executeFast.bindInteger(2, 6);
                    executeFast.bindString(3, "");
                    executeFast.bindString(4, "");
                    executeFast.bindString(5, "");
                    executeFast.bindInteger(6, 0);
                    executeFast.bindInteger(7, 0);
                    executeFast.bindInteger(8, 0);
                    executeFast.bindInteger(9, 0);
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                    tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                    executeFast.bindByteBuffer(10, nativeByteBuffer);
                    executeFast.step();
                    nativeByteBuffer.reuse();
                    executeFast.dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                try {
                    SQLitePreparedStatement executeFast2 = riVar.getMessagesStorage().f27054b.executeFast("REPLACE INTO stickersets2 VALUES(?, ?, ?, ?, ?)");
                    executeFast2.requery();
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                    tL_messages_stickerSet.serializeToStream(nativeByteBuffer2);
                    executeFast2.bindLong(1, tL_messages_stickerSet.set.f28430id);
                    executeFast2.bindByteBuffer(2, nativeByteBuffer2);
                    executeFast2.bindInteger(3, tL_messages_stickerSet.set.hash);
                    executeFast2.bindLong(4, System.currentTimeMillis());
                    String str2 = tL_messages_stickerSet.set.short_name;
                    if (str2 != null) {
                        str = str2.toLowerCase();
                    }
                    executeFast2.bindString(5, str);
                    executeFast2.step();
                    nativeByteBuffer2.reuse();
                    executeFast2.dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
