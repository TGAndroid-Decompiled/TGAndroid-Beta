package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class dg implements Runnable {
    public final int f22181a;
    public final Object f22182b;
    public final Object f22183c;
    public final Object d;

    public dg(Object obj, Object obj2, Object obj3, int i3) {
        this.f22181a = i3;
        this.f22182b = obj;
        this.f22183c = obj2;
        this.d = obj3;
    }

    private final void a() {
        qr qrVar = (qr) this.f22182b;
        String str = (String) this.f22183c;
        String str2 = (String) this.d;
        qrVar.getClass();
        try {
            if (str.length() != 0) {
                SQLiteDatabase sQLiteDatabase = qrVar.f24936b;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast("UPDATE user_phones_v7 SET deleted = 0 WHERE sphone IN(" + str + ")").stepThis().dispose();
            }
            if (str2.length() != 0) {
                SQLiteDatabase sQLiteDatabase2 = qrVar.f24936b;
                Locale locale2 = Locale.US;
                sQLiteDatabase2.executeFast("UPDATE user_phones_v7 SET deleted = 1 WHERE sphone IN(" + str2 + ")").stepThis().dispose();
            }
        } catch (Exception e10) {
            qrVar.o(e10, true);
        }
    }

    private final void b() {
        SQLiteCursor sQLiteCursor;
        NativeByteBuffer byteBufferValue;
        qr qrVar = (qr) this.f22182b;
        ArrayList arrayList = (ArrayList) this.f22183c;
        org.telegram.ui.sg sgVar = (org.telegram.ui.sg) this.d;
        long e10 = qrVar.getUserConfig().e();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i10 = i3 + 1;
            zi ziVar = (zi) arrayList.get(i3);
            if (!ziVar.f26887p1 && !zi.c4(ziVar.f26868k)) {
                try {
                    sQLiteCursor = qrVar.f24936b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = ? AND mid = ?", Long.valueOf(zi.B0(ziVar.f26868k)), Integer.valueOf(ziVar.f1()));
                    try {
                        try {
                            if (sQLiteCursor.next() && (byteBufferValue = sQLiteCursor.byteBufferValue(0)) != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, e10);
                                byteBufferValue.reuse();
                                ziVar.f26868k.attachPath = TLdeserialize.attachPath;
                                ziVar.K(true);
                            }
                        } catch (Exception e11) {
                            e = e11;
                            a8.g(e, true);
                            if (sQLiteCursor == null) {
                                i3 = i10;
                            }
                            sQLiteCursor.dispose();
                            i3 = i10;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                }
                sQLiteCursor.dispose();
            }
            i3 = i10;
        }
        g0.h3(sgVar);
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dg.c():void");
    }

    private final void e() {
        int i3;
        qr qrVar = (qr) this.f22182b;
        ArrayList arrayList = (ArrayList) this.f22183c;
        sj sjVar = (sj) this.d;
        qrVar.getClass();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
            if (ephemeralMessage.top_msg_id == 0) {
                TL_ephemeral.EphemeralMessage W = qrVar.W(ephemeralMessage.f27216id, m5.o(ephemeralMessage.peer_id));
                if (W != null && (i3 = W.top_msg_id) != 0) {
                    ephemeralMessage.top_msg_id = i3;
                    TLRPC.MessageReplyHeader messageReplyHeader = ephemeralMessage.reply_to;
                    if (messageReplyHeader != null) {
                        messageReplyHeader.forum_topic = true;
                    }
                    ephemeralMessage.flags |= 2;
                }
            }
        }
        qrVar.g1(arrayList, true);
        sjVar.run();
    }

    private final void f() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dg.f():void");
    }

    private final void g() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f22183c;
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = (TLRPC.TL_messages_startHistoryImport) this.d;
        py pyVar = ((oy) this.f22182b).f24628b;
        yy yyVar = pyVar.f24833q;
        yyVar.E.l(pyVar.f24826j);
        int i3 = hs.f23320v1;
        if (tL_error == null) {
            yyVar.getNotificationCenter().k(i3, Long.valueOf(pyVar.f24826j));
        } else {
            yyVar.getNotificationCenter().k(i3, Long.valueOf(pyVar.f24826j), tL_messages_startHistoryImport, tL_error);
        }
    }

    private final void h() {
        TLObject tLObject = (TLObject) this.f22183c;
        Runnable runnable = (Runnable) this.d;
        ry ryVar = ((qy) this.f22182b).f25012b;
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
            ryVar.f25253f = tL_inputStickerSetItem;
            tL_inputStickerSetItem.document = new TLRPC.TL_inputDocument();
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem2 = ryVar.f25253f;
            TLRPC.InputDocument inputDocument = tL_inputStickerSetItem2.document;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            inputDocument.f27013id = document.f27007id;
            inputDocument.access_hash = document.access_hash;
            inputDocument.file_reference = document.file_reference;
            String str = ryVar.f25250b;
            if (str == null) {
                str = "";
            }
            tL_inputStickerSetItem2.emoji = str;
            ryVar.d = document.mime_type;
        } else if (ryVar.f25252e) {
            ryVar.d = "application/x-bad-tgsticker";
        }
        runnable.run();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dg.run():void");
    }

    public dg(Object obj, Object obj2, String str, int i3) {
        this.f22181a = i3;
        this.f22182b = obj;
        this.d = obj2;
        this.f22183c = str;
    }
}
