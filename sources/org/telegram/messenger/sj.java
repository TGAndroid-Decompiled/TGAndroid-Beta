package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sj implements Runnable {
    public final int f25353a;
    public final int f25354b;
    public final Object f25355c;
    public final Object d;
    public final Object f25356e;
    public final Object f25357f;

    public sj(Object obj, Object obj2, int i3, Object obj3, Object obj4, int i10) {
        this.f25353a = i10;
        this.f25355c = obj;
        this.d = obj2;
        this.f25354b = i3;
        this.f25356e = obj3;
        this.f25357f = obj4;
    }

    private final void a() {
        TLRPC.MessageMedia messageMedia;
        qr qrVar = (qr) this.f25355c;
        String str = (String) this.d;
        TLObject tLObject = (TLObject) this.f25356e;
        int i3 = this.f25354b;
        String str2 = (String) this.f25357f;
        qrVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                String a10 = Utilities.a(str);
                if (a10 != null) {
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
                        sQLitePreparedStatement = qrVar.f24936b.executeFast("REPLACE INTO sent_files_v2 VALUES(?, ?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageMedia.getObjectSize());
                        messageMedia.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatement.bindString(1, a10);
                        sQLitePreparedStatement.bindInteger(2, i3);
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
            } catch (Exception e10) {
                qrVar.o(e10, true);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sj.run():void");
    }

    public sj(Object obj, Object obj2, Object obj3, Object obj4, int i3, int i10) {
        this.f25353a = i10;
        this.f25355c = obj;
        this.d = obj2;
        this.f25356e = obj3;
        this.f25357f = obj4;
        this.f25354b = i3;
    }

    public sj(c1 c1Var, Serializable serializable, Object obj, int i3, Serializable serializable2, int i10) {
        this.f25353a = i10;
        this.f25355c = c1Var;
        this.d = serializable;
        this.f25356e = obj;
        this.f25354b = i3;
        this.f25357f = serializable2;
    }

    public sj(oz ozVar, int i3, ArrayList arrayList, a0.h hVar, a0.h hVar2) {
        this.f25353a = 6;
        this.f25355c = ozVar;
        this.f25354b = i3;
        this.d = arrayList;
        this.f25356e = hVar;
        this.f25357f = hVar2;
    }
}
