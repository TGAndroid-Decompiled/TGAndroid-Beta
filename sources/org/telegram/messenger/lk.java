package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lk implements Runnable {
    public final int f16952a;
    public final int f16953b;
    public final Object f16954c;
    public final Object d;
    public final Object e;
    public final Object f16955f;

    public lk(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.f16952a = i11;
        this.f16954c = obj;
        this.d = obj2;
        this.f16953b = i10;
        this.e = obj3;
        this.f16955f = obj4;
    }

    private final void a() {
        TLRPC.MessageMedia messageMedia;
        is isVar = (is) this.f16954c;
        String str = (String) this.d;
        TLObject tLObject = (TLObject) this.e;
        int i10 = this.f16953b;
        String str2 = (String) this.f16955f;
        isVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                String a2 = Utilities.a(str);
                if (a2 != null) {
                    if (tLObject instanceof TLRPC.Photo) {
                        messageMedia = new TLRPC.TL_messageMediaPhoto();
                        messageMedia.photo = (TLRPC.Photo) tLObject;
                        messageMedia.flags |= 1;
                    } else if (tLObject instanceof TLRPC.Document) {
                        messageMedia = new TLRPC.TL_messageMediaDocument();
                        messageMedia.document = (TLRPC.Document) tLObject;
                        messageMedia.flags |= 1;
                    } else {
                        messageMedia = null;
                    }
                    if (messageMedia != null) {
                        sQLitePreparedStatement = isVar.f16333b.executeFast("REPLACE INTO sent_files_v2 VALUES(?, ?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageMedia.getObjectSize());
                        messageMedia.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatement.bindString(1, a2);
                        sQLitePreparedStatement.bindInteger(2, i10);
                        sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer);
                        sQLitePreparedStatement.bindString(4, str2);
                        sQLitePreparedStatement.step();
                        nativeByteBuffer.reuse();
                    } else {
                        return;
                    }
                }
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            } catch (Exception e) {
                isVar.o(e, true);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lk.run():void");
    }

    public lk(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f16952a = i11;
        this.f16954c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16955f = obj4;
        this.f16953b = i10;
    }

    public lk(f1 f1Var, Serializable serializable, Object obj, int i10, Serializable serializable2, int i11) {
        this.f16952a = i11;
        this.f16954c = f1Var;
        this.d = serializable;
        this.e = obj;
        this.f16953b = i10;
        this.f16955f = serializable2;
    }

    public lk(i00 i00Var, int i10, ArrayList arrayList, a0.h hVar, a0.h hVar2) {
        this.f16952a = 6;
        this.f16954c = i00Var;
        this.f16953b = i10;
        this.d = arrayList;
        this.e = hVar;
        this.f16955f = hVar2;
    }
}
