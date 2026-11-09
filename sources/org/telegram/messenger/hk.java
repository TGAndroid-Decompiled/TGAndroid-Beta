package org.telegram.messenger;

import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hk implements Runnable {
    public final int f22922a;
    public final Object f22923b;
    public final long f22924c;
    public final int d;
    public final Object f22925e;

    public hk(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f22922a = i10;
        this.f22923b = obj;
        this.f22925e = obj2;
        this.f22924c = j3;
        this.d = i7;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hk.a():void");
    }

    private final void b() {
        wz wzVar = (wz) this.f22923b;
        yr yrVar = (yr) this.f22925e;
        long j3 = this.f22924c;
        int i7 = this.d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabase = yrVar.f26721b;
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j3 + " AND mid > 0 AND type = 4 ORDER BY date DESC, mid DESC", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.readAttachPath(byteBufferValue, p10.i(i7).f24489n);
                    byteBufferValue.reuse();
                    if (ij.K3(TLdeserialize)) {
                        TLdeserialize.f26977id = queryFinalized.intValue(1);
                        TLdeserialize.dialog_id = j3;
                        ij ijVar = new ij(i7, TLdeserialize, false, true);
                        arrayList.add(ijVar);
                        arrayList2.add(new MediaSessionCompat$QueueItem(null, new MediaDescriptionCompat(j3 + "_" + arrayList.size(), ijVar.y1(true), ijVar.w1(true), null, null, null, null, null), arrayList2.size()));
                    }
                }
            }
            queryFinalized.dispose();
            Collections.reverse(arrayList);
            Collections.reverse(arrayList2);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        g0.h3(new z1(wzVar, i7, j3, arrayList, arrayList2, 6));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hk.run():void");
    }

    public hk(c1 c1Var, long j3, int i7, Object obj, int i10) {
        this.f22922a = i10;
        this.f22923b = c1Var;
        this.f22924c = j3;
        this.d = i7;
        this.f22925e = obj;
    }

    public hk(c1 c1Var, long j3, TLObject tLObject, int i7, int i10) {
        this.f22922a = i10;
        this.f22923b = c1Var;
        this.f22924c = j3;
        this.f22925e = tLObject;
        this.d = i7;
    }

    public hk(yr yrVar, int i7, long j3, TLObject tLObject, int i10) {
        this.f22922a = i10;
        this.f22923b = yrVar;
        this.d = i7;
        this.f22924c = j3;
        this.f22925e = tLObject;
    }
}
