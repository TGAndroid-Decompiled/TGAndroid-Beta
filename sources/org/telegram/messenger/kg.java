package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class kg implements Runnable {
    public final int f24690a;
    public final Object f24691b;
    public final Object f24692c;
    public final Object d;

    public kg(Object obj, Object obj2, Object obj3, int i7) {
        this.f24690a = i7;
        this.f24691b = obj;
        this.f24692c = obj2;
        this.d = obj3;
    }

    private final void a() {
        vr vrVar = (vr) this.f24691b;
        String str = (String) this.f24692c;
        String str2 = (String) this.d;
        vrVar.getClass();
        try {
            if (str.length() != 0) {
                SQLiteDatabase sQLiteDatabase = vrVar.f27221b;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast("UPDATE user_phones_v7 SET deleted = 0 WHERE sphone IN(" + str + ")").stepThis().dispose();
            }
            if (str2.length() != 0) {
                SQLiteDatabase sQLiteDatabase2 = vrVar.f27221b;
                Locale locale2 = Locale.US;
                sQLiteDatabase2.executeFast("UPDATE user_phones_v7 SET deleted = 1 WHERE sphone IN(" + str2 + ")").stepThis().dispose();
            }
        } catch (Exception e10) {
            vrVar.o(e10, true);
        }
    }

    private final void b() {
        SQLiteCursor sQLiteCursor;
        NativeByteBuffer byteBufferValue;
        vr vrVar = (vr) this.f24691b;
        ArrayList arrayList = (ArrayList) this.f24692c;
        org.telegram.ui.vg vgVar = (org.telegram.ui.vg) this.d;
        long e10 = vrVar.getUserConfig().e();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            int i10 = i7 + 1;
            gj gjVar = (gj) arrayList.get(i7);
            if (!gjVar.f23848r1 && !gj.b4(gjVar.f23819k)) {
                try {
                    sQLiteCursor = vrVar.f27221b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = ? AND mid = ?", Long.valueOf(gj.B0(gjVar.f23819k)), Integer.valueOf(gjVar.e1()));
                    try {
                        try {
                            if (sQLiteCursor.next() && (byteBufferValue = sQLiteCursor.byteBufferValue(0)) != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, e10);
                                byteBufferValue.reuse();
                                gjVar.f23819k.attachPath = TLdeserialize.attachPath;
                                gjVar.K(true);
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
        g0.h3(vgVar);
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kg.c():void");
    }

    private final void d() {
        int i7;
        vr vrVar = (vr) this.f24691b;
        ArrayList arrayList = (ArrayList) this.f24692c;
        zj zjVar = (zj) this.d;
        vrVar.getClass();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
            if (ephemeralMessage.top_msg_id == 0) {
                TL_ephemeral.EphemeralMessage W = vrVar.W(ephemeralMessage.f28266id, m5.o(ephemeralMessage.peer_id));
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
        vrVar.g1(arrayList, true);
        zjVar.run();
    }

    private final void f() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kg.f():void");
    }

    private final void g() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f24692c;
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = (TLRPC.TL_messages_startHistoryImport) this.d;
        vy vyVar = ((uy) this.f24691b).f26899b;
        ez ezVar = vyVar.f27279q;
        ezVar.E.l(vyVar.f27272j);
        int i7 = ns.f25588v1;
        if (tL_error == null) {
            ezVar.getNotificationCenter().k(i7, Long.valueOf(vyVar.f27272j));
        } else {
            ezVar.getNotificationCenter().k(i7, Long.valueOf(vyVar.f27272j), tL_messages_startHistoryImport, tL_error);
        }
    }

    private final void h() {
        TLObject tLObject = (TLObject) this.f24692c;
        Runnable runnable = (Runnable) this.d;
        xy xyVar = ((wy) this.f24691b).f27436b;
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
            xyVar.f27628f = tL_inputStickerSetItem;
            tL_inputStickerSetItem.document = new TLRPC.TL_inputDocument();
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem2 = xyVar.f27628f;
            TLRPC.InputDocument inputDocument = tL_inputStickerSetItem2.document;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            inputDocument.f28063id = document.f28057id;
            inputDocument.access_hash = document.access_hash;
            inputDocument.file_reference = document.file_reference;
            String str = xyVar.f27625b;
            if (str == null) {
                str = "";
            }
            tL_inputStickerSetItem2.emoji = str;
            xyVar.d = document.mime_type;
        } else if (xyVar.f27627e) {
            xyVar.d = "application/x-bad-tgsticker";
        }
        runnable.run();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kg.run():void");
    }

    public kg(Object obj, Object obj2, String str, int i7) {
        this.f24690a = i7;
        this.f24691b = obj;
        this.d = obj2;
        this.f24692c = str;
    }
}
