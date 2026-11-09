package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class lg implements Runnable {
    public final int f23890a;
    public final Object f23891b;
    public final Object f23892c;
    public final Object d;

    public lg(Object obj, Object obj2, Object obj3, int i7) {
        this.f23890a = i7;
        this.f23891b = obj;
        this.f23892c = obj2;
        this.d = obj3;
    }

    private final void a() {
        yr yrVar = (yr) this.f23891b;
        String str = (String) this.f23892c;
        String str2 = (String) this.d;
        yrVar.getClass();
        try {
            if (str.length() != 0) {
                SQLiteDatabase sQLiteDatabase = yrVar.f26721b;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast("UPDATE user_phones_v7 SET deleted = 0 WHERE sphone IN(" + str + ")").stepThis().dispose();
            }
            if (str2.length() != 0) {
                SQLiteDatabase sQLiteDatabase2 = yrVar.f26721b;
                Locale locale2 = Locale.US;
                sQLiteDatabase2.executeFast("UPDATE user_phones_v7 SET deleted = 1 WHERE sphone IN(" + str2 + ")").stepThis().dispose();
            }
        } catch (Exception e10) {
            yrVar.o(e10, true);
        }
    }

    private final void b() {
        SQLiteCursor sQLiteCursor;
        NativeByteBuffer byteBufferValue;
        yr yrVar = (yr) this.f23891b;
        ArrayList arrayList = (ArrayList) this.f23892c;
        org.telegram.ui.yg ygVar = (org.telegram.ui.yg) this.d;
        long e10 = yrVar.getUserConfig().e();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            int i10 = i7 + 1;
            ij ijVar = (ij) arrayList.get(i7);
            if (!ijVar.f23281p1 && !ij.b4(ijVar.f23262k)) {
                try {
                    sQLiteCursor = yrVar.f26721b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = ? AND mid = ?", Long.valueOf(ij.B0(ijVar.f23262k)), Integer.valueOf(ijVar.e1()));
                    try {
                        try {
                            if (sQLiteCursor.next() && (byteBufferValue = sQLiteCursor.byteBufferValue(0)) != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, e10);
                                byteBufferValue.reuse();
                                ijVar.f23262k.attachPath = TLdeserialize.attachPath;
                                ijVar.K(true);
                            }
                        } catch (Exception e11) {
                            e = e11;
                            a8.g(e, true);
                            if (sQLiteCursor == null) {
                                i7 = i10;
                            }
                            sQLiteCursor.dispose();
                            i7 = i10;
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
            i7 = i10;
        }
        g0.h3(ygVar);
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lg.c():void");
    }

    private final void d() {
        int i7;
        yr yrVar = (yr) this.f23891b;
        ArrayList arrayList = (ArrayList) this.f23892c;
        bk bkVar = (bk) this.d;
        yrVar.getClass();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
            if (ephemeralMessage.top_msg_id == 0) {
                TL_ephemeral.EphemeralMessage W = yrVar.W(ephemeralMessage.f27171id, m5.o(ephemeralMessage.peer_id));
                if (W != null && (i7 = W.top_msg_id) != 0) {
                    ephemeralMessage.top_msg_id = i7;
                    TLRPC.MessageReplyHeader messageReplyHeader = ephemeralMessage.reply_to;
                    if (messageReplyHeader != null) {
                        messageReplyHeader.forum_topic = true;
                    }
                    ephemeralMessage.flags |= 2;
                }
            }
        }
        yrVar.g1(arrayList, true);
        bkVar.run();
    }

    private final void f() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lg.f():void");
    }

    private final void g() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f23892c;
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = (TLRPC.TL_messages_startHistoryImport) this.d;
        xy xyVar = ((wy) this.f23891b).f26407b;
        gz gzVar = xyVar.f26558q;
        gzVar.D.l(xyVar.f26551j);
        int i7 = qs.f25091v1;
        if (tL_error == null) {
            gzVar.getNotificationCenter().k(i7, Long.valueOf(xyVar.f26551j));
        } else {
            gzVar.getNotificationCenter().k(i7, Long.valueOf(xyVar.f26551j), tL_messages_startHistoryImport, tL_error);
        }
    }

    private final void h() {
        TLObject tLObject = (TLObject) this.f23892c;
        Runnable runnable = (Runnable) this.d;
        zy zyVar = ((yy) this.f23891b).f26787b;
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
            zyVar.f26946f = tL_inputStickerSetItem;
            tL_inputStickerSetItem.document = new TLRPC.TL_inputDocument();
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem2 = zyVar.f26946f;
            TLRPC.InputDocument inputDocument = tL_inputStickerSetItem2.document;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            inputDocument.f26968id = document.f26962id;
            inputDocument.access_hash = document.access_hash;
            inputDocument.file_reference = document.file_reference;
            String str = zyVar.f26943b;
            if (str == null) {
                str = "";
            }
            tL_inputStickerSetItem2.emoji = str;
            zyVar.d = document.mime_type;
        } else if (zyVar.f26945e) {
            zyVar.d = "application/x-bad-tgsticker";
        }
        runnable.run();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lg.run():void");
    }

    public lg(Object obj, Object obj2, String str, int i7) {
        this.f23890a = i7;
        this.f23891b = obj;
        this.d = obj2;
        this.f23892c = str;
    }
}
