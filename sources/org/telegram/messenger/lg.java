package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lg implements Runnable {
    public final int f25182a;
    public final Object f25183b;
    public final Object f25184c;
    public final Object d;

    public lg(Object obj, Object obj2, Object obj3, int i7) {
        this.f25182a = i7;
        this.f25183b = obj;
        this.f25184c = obj2;
        this.d = obj3;
    }

    private final void a() {
        ur urVar = (ur) this.f25183b;
        String str = (String) this.f25184c;
        String str2 = (String) this.d;
        urVar.getClass();
        try {
            if (str.length() != 0) {
                SQLiteDatabase sQLiteDatabase = urVar.f27216b;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast("UPDATE user_phones_v7 SET deleted = 0 WHERE sphone IN(" + str + ")").stepThis().dispose();
            }
            if (str2.length() != 0) {
                SQLiteDatabase sQLiteDatabase2 = urVar.f27216b;
                Locale locale2 = Locale.US;
                sQLiteDatabase2.executeFast("UPDATE user_phones_v7 SET deleted = 1 WHERE sphone IN(" + str2 + ")").stepThis().dispose();
            }
        } catch (Exception e10) {
            urVar.o(e10, true);
        }
    }

    private final void b() {
        SQLiteCursor sQLiteCursor;
        NativeByteBuffer byteBufferValue;
        ur urVar = (ur) this.f25183b;
        ArrayList arrayList = (ArrayList) this.f25184c;
        org.telegram.ui.wg wgVar = (org.telegram.ui.wg) this.d;
        long e10 = urVar.getUserConfig().e();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            int i10 = i7 + 1;
            gj gjVar = (gj) arrayList.get(i7);
            if (!gjVar.f24206r1 && !gj.b4(gjVar.f24177k)) {
                try {
                    sQLiteCursor = urVar.f27216b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = ? AND mid = ?", Long.valueOf(gj.B0(gjVar.f24177k)), Integer.valueOf(gjVar.e1()));
                    try {
                        try {
                            if (sQLiteCursor.next() && (byteBufferValue = sQLiteCursor.byteBufferValue(0)) != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, e10);
                                byteBufferValue.reuse();
                                gjVar.f24177k.attachPath = TLdeserialize.attachPath;
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
        g0.g3(wgVar);
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lg.c():void");
    }

    private final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lg.d():void");
    }

    private final void f() {
        Runnable runnable = (Runnable) this.d;
        ((az) this.f25183b).f22976w.remove((String) this.f25184c);
        if (runnable != null) {
            runnable.run();
        }
    }

    private final void g() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f25184c;
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = (TLRPC.TL_messages_startHistoryImport) this.d;
        ry ryVar = ((qy) this.f25183b).f26495b;
        az azVar = ryVar.f26672q;
        azVar.E.l(ryVar.f26665j);
        int i7 = ls.f25363v1;
        if (tL_error == null) {
            azVar.getNotificationCenter().k(i7, Long.valueOf(ryVar.f26665j));
        } else {
            azVar.getNotificationCenter().k(i7, Long.valueOf(ryVar.f26665j), tL_messages_startHistoryImport, tL_error);
        }
    }

    private final void h() {
        TLObject tLObject = (TLObject) this.f25184c;
        Runnable runnable = (Runnable) this.d;
        ty tyVar = ((sy) this.f25183b).f26891b;
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
            tyVar.f27096f = tL_inputStickerSetItem;
            tL_inputStickerSetItem.document = new TLRPC.TL_inputDocument();
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem2 = tyVar.f27096f;
            TLRPC.InputDocument inputDocument = tL_inputStickerSetItem2.document;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            inputDocument.f28410id = document.f28404id;
            inputDocument.access_hash = document.access_hash;
            inputDocument.file_reference = document.file_reference;
            String str = tyVar.f27093b;
            if (str == null) {
                str = "";
            }
            tL_inputStickerSetItem2.emoji = str;
            tyVar.d = document.mime_type;
        } else if (tyVar.f27095e) {
            tyVar.d = "application/x-bad-tgsticker";
        }
        runnable.run();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lg.run():void");
    }

    public lg(Object obj, Object obj2, String str, int i7) {
        this.f25182a = i7;
        this.f25183b = obj;
        this.d = obj2;
        this.f25184c = str;
    }
}
