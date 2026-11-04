package org.telegram.messenger;

import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class uf implements Runnable {
    public final int f25690a;
    public final li f25691b;
    public final TLRPC.TL_messages_stickerSet f25692c;

    public uf(li liVar, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i3) {
        this.f25690a = i3;
        this.f25691b = liVar;
        this.f25692c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        int i3 = this.f25690a;
        String str = "";
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f25692c;
        li liVar = this.f25691b;
        switch (i3) {
            case 0:
                liVar.N.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f27028id);
                liVar.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet.set.f27028id), tL_messages_stickerSet);
                return;
            case 1:
                liVar.N.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f27028id);
                liVar.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet.set.f27028id), tL_messages_stickerSet);
                return;
            case 2:
                a0.h hVar = liVar.I[4];
                for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
                    hVar.k(document, document.f27007id);
                }
                return;
            case 3:
                try {
                    SQLitePreparedStatement executeFast = liVar.getMessagesStorage().f24936b.executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    executeFast.requery();
                    executeFast.bindString(1, "s_" + tL_messages_stickerSet.set.f27028id);
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
                    SQLitePreparedStatement executeFast2 = liVar.getMessagesStorage().f24936b.executeFast("REPLACE INTO stickersets2 VALUES(?, ?, ?, ?, ?)");
                    executeFast2.requery();
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                    tL_messages_stickerSet.serializeToStream(nativeByteBuffer2);
                    executeFast2.bindLong(1, tL_messages_stickerSet.set.f27028id);
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
