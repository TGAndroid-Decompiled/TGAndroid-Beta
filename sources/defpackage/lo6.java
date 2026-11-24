package defpackage;

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lo6 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public lo6(byte b, Object obj, Object obj2, TLObject tLObject) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = tLObject;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo6.a():void");
    }

    private final void b() {
        int currentTime;
        int i;
        SQLitePreparedStatement executeFast;
        ad7 ad7Var = (ad7) this.b;
        TLObject tLObject = (TLObject) this.c;
        String str = (String) this.d;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                currentTime = ad7Var.getConnectionsManager().getCurrentTime();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            if (tLObject instanceof TLRPC.TL_messages_botCallbackAnswer) {
                i = ((TLRPC.TL_messages_botCallbackAnswer) tLObject).cache_time;
            } else {
                if (tLObject instanceof TLRPC.TL_messages_botResults) {
                    i = ((TLRPC.TL_messages_botResults) tLObject).cache_time;
                }
                executeFast = ad7Var.b.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject.getObjectSize());
                tLObject.serializeToStream(nativeByteBuffer);
                executeFast.bindString(1, str);
                executeFast.bindInteger(2, currentTime);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                executeFast.step();
                executeFast.dispose();
                nativeByteBuffer.reuse();
                return;
            }
            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tLObject.getObjectSize());
            tLObject.serializeToStream(nativeByteBuffer2);
            executeFast.bindString(1, str);
            executeFast.bindInteger(2, currentTime);
            executeFast.bindByteBuffer(3, nativeByteBuffer2);
            executeFast.step();
            executeFast.dispose();
            nativeByteBuffer2.reuse();
            return;
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement = executeFast;
            ad7Var.n(e, true);
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
                return;
            }
            return;
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement = executeFast;
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
        currentTime += i;
        executeFast = ad7Var.b.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
    }

    private final void c() {
        ((ad7) this.b).getNotificationCenter().k(kk7.l0, Long.valueOf(k27.B0(((k27) this.c).k)), (ArrayList) this.d);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo6.run():void");
    }

    public lo6(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
