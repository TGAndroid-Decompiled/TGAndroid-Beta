package org.telegram.messenger;

import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class ag implements Runnable {
    public final int f14607a;
    public final ui f14608b;
    public final TLRPC.TL_messages_stickerSet f14609c;

    public ag(ui uiVar, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f14607a = i10;
        this.f14608b = uiVar;
        this.f14609c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        int i10 = this.f14607a;
        String str = "";
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f14609c;
        ui uiVar = this.f14608b;
        switch (i10) {
            case 0:
                uiVar.M.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f19820id);
                uiVar.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet.set.f19820id), tL_messages_stickerSet);
                return;
            case 1:
                uiVar.M.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f19820id);
                uiVar.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet.set.f19820id), tL_messages_stickerSet);
                return;
            case 2:
                a0.h hVar = uiVar.H[4];
                for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                    hVar.k(document, document.f19799id);
                }
                return;
            case 3:
                try {
                    SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().f15940b.executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    executeFast.requery();
                    executeFast.bindString(1, "s_" + tL_messages_stickerSet.set.f19820id);
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
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            default:
                try {
                    SQLitePreparedStatement executeFast2 = uiVar.getMessagesStorage().f15940b.executeFast("REPLACE INTO stickersets2 VALUES(?, ?, ?, ?, ?)");
                    executeFast2.requery();
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                    tL_messages_stickerSet.serializeToStream(nativeByteBuffer2);
                    executeFast2.bindLong(1, tL_messages_stickerSet.set.f19820id);
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
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
        }
    }
}
