package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kg implements Runnable {
    public final int f25024a;
    public final Object f25025b;
    public final Object f25026c;
    public final Object d;

    public kg(Object obj, Object obj2, Object obj3, int i7) {
        this.f25024a = i7;
        this.f25025b = obj;
        this.f25026c = obj2;
        this.d = obj3;
    }

    private final void a() {
        tr trVar = (tr) this.f25025b;
        String str = (String) this.f25026c;
        String str2 = (String) this.d;
        trVar.getClass();
        try {
            if (str.length() != 0) {
                SQLiteDatabase sQLiteDatabase = trVar.f27054b;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast("UPDATE user_phones_v7 SET deleted = 0 WHERE sphone IN(" + str + ")").stepThis().dispose();
            }
            if (str2.length() != 0) {
                SQLiteDatabase sQLiteDatabase2 = trVar.f27054b;
                Locale locale2 = Locale.US;
                sQLiteDatabase2.executeFast("UPDATE user_phones_v7 SET deleted = 1 WHERE sphone IN(" + str2 + ")").stepThis().dispose();
            }
        } catch (Exception e10) {
            trVar.o(e10, true);
        }
    }

    private final void b() {
        SQLiteCursor sQLiteCursor;
        NativeByteBuffer byteBufferValue;
        tr trVar = (tr) this.f25025b;
        ArrayList arrayList = (ArrayList) this.f25026c;
        org.telegram.ui.wg wgVar = (org.telegram.ui.wg) this.d;
        long e10 = trVar.getUserConfig().e();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            int i10 = i7 + 1;
            fj fjVar = (fj) arrayList.get(i7);
            if (!fjVar.f23994r1 && !fj.b4(fjVar.f23965k)) {
                try {
                    sQLiteCursor = trVar.f27054b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = ? AND mid = ?", Long.valueOf(fj.B0(fjVar.f23965k)), Integer.valueOf(fjVar.e1()));
                    try {
                        try {
                            if (sQLiteCursor.next() && (byteBufferValue = sQLiteCursor.byteBufferValue(0)) != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, e10);
                                byteBufferValue.reuse();
                                fjVar.f23965k.attachPath = TLdeserialize.attachPath;
                                fjVar.K(true);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kg.c():void");
    }

    private final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kg.d():void");
    }

    private final void f() {
        Runnable runnable = (Runnable) this.d;
        ((zy) this.f25025b).f28393w.remove((String) this.f25026c);
        if (runnable != null) {
            runnable.run();
        }
    }

    private final void g() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f25026c;
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = (TLRPC.TL_messages_startHistoryImport) this.d;
        qy qyVar = ((py) this.f25025b).f26322b;
        zy zyVar = qyVar.f26497q;
        zyVar.E.l(qyVar.f26490j);
        int i7 = ks.f25205v1;
        if (tL_error == null) {
            zyVar.getNotificationCenter().k(i7, Long.valueOf(qyVar.f26490j));
        } else {
            zyVar.getNotificationCenter().k(i7, Long.valueOf(qyVar.f26490j), tL_messages_startHistoryImport, tL_error);
        }
    }

    private final void h() {
        TLObject tLObject = (TLObject) this.f25026c;
        Runnable runnable = (Runnable) this.d;
        sy syVar = ((ry) this.f25025b).f26713b;
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
            syVar.f26904f = tL_inputStickerSetItem;
            tL_inputStickerSetItem.document = new TLRPC.TL_inputDocument();
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem2 = syVar.f26904f;
            TLRPC.InputDocument inputDocument = tL_inputStickerSetItem2.document;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            inputDocument.f28415id = document.f28409id;
            inputDocument.access_hash = document.access_hash;
            inputDocument.file_reference = document.file_reference;
            String str = syVar.f26901b;
            if (str == null) {
                str = "";
            }
            tL_inputStickerSetItem2.emoji = str;
            syVar.d = document.mime_type;
        } else if (syVar.f26903e) {
            syVar.d = "application/x-bad-tgsticker";
        }
        runnable.run();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kg.run():void");
    }

    public kg(Object obj, Object obj2, String str, int i7) {
        this.f25024a = i7;
        this.f25025b = obj;
        this.d = obj2;
        this.f25026c = str;
    }
}
