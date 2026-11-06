package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ck implements Runnable {
    public final int f21841a;
    public final int f21842b;
    public final Object f21843c;
    public final Object d;
    public final Object f21844e;
    public final Object f21845f;

    public ck(Object obj, Object obj2, int i7, Object obj3, Object obj4, int i10) {
        this.f21841a = i10;
        this.f21843c = obj;
        this.d = obj2;
        this.f21842b = i7;
        this.f21844e = obj3;
        this.f21845f = obj4;
    }

    private final void a() {
        TLRPC.MessageMedia messageMedia;
        yr yrVar = (yr) this.f21843c;
        String str = (String) this.d;
        TLObject tLObject = (TLObject) this.f21844e;
        int i7 = this.f21842b;
        String str2 = (String) this.f21845f;
        yrVar.getClass();
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
                        sQLitePreparedStatement = yrVar.f26698b.executeFast("REPLACE INTO sent_files_v2 VALUES(?, ?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageMedia.getObjectSize());
                        messageMedia.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatement.bindString(1, a10);
                        sQLitePreparedStatement.bindInteger(2, i7);
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
                yrVar.o(e10, true);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ck.run():void");
    }

    public ck(Object obj, Object obj2, Object obj3, Object obj4, int i7, int i10) {
        this.f21841a = i10;
        this.f21843c = obj;
        this.d = obj2;
        this.f21844e = obj3;
        this.f21845f = obj4;
        this.f21842b = i7;
    }

    public ck(c1 c1Var, Serializable serializable, Object obj, int i7, Serializable serializable2, int i10) {
        this.f21841a = i10;
        this.f21843c = c1Var;
        this.d = serializable;
        this.f21844e = obj;
        this.f21842b = i7;
        this.f21845f = serializable2;
    }

    public ck(wz wzVar, int i7, ArrayList arrayList, a0.h hVar, a0.h hVar2) {
        this.f21841a = 6;
        this.f21843c = wzVar;
        this.f21842b = i7;
        this.d = arrayList;
        this.f21844e = hVar;
        this.f21845f = hVar2;
    }
}
