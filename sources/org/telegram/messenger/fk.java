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
public final class fk implements Runnable {
    public final int f23934a;
    public final Object f23935b;
    public final long f23936c;
    public final int d;
    public final Object f23937e;

    public fk(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f23934a = i10;
        this.f23935b = obj;
        this.f23937e = obj2;
        this.f23936c = j3;
        this.d = i7;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fk.a():void");
    }

    private final void b() {
        rz rzVar = (rz) this.f23935b;
        ur urVar = (ur) this.f23937e;
        long j3 = this.f23936c;
        int i7 = this.d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabase = urVar.f27252b;
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j3 + " AND mid > 0 AND type = 4 ORDER BY date DESC, mid DESC", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.readAttachPath(byteBufferValue, k10.i(i7).f24987n);
                    byteBufferValue.reuse();
                    if (gj.K3(TLdeserialize)) {
                        TLdeserialize.f28455id = queryFinalized.intValue(1);
                        TLdeserialize.dialog_id = j3;
                        gj gjVar = new gj(i7, TLdeserialize, false, true);
                        arrayList.add(gjVar);
                        arrayList2.add(new MediaSessionCompat$QueueItem(null, new MediaDescriptionCompat(j3 + "_" + arrayList.size(), gjVar.y1(true), gjVar.w1(true), null, null, null, null, null), arrayList2.size()));
                    }
                }
            }
            queryFinalized.dispose();
            Collections.reverse(arrayList);
            Collections.reverse(arrayList2);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        g0.g3(new z1(rzVar, i7, j3, arrayList, arrayList2, 6));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fk.run():void");
    }

    public fk(c1 c1Var, long j3, int i7, Object obj, int i10) {
        this.f23934a = i10;
        this.f23935b = c1Var;
        this.f23936c = j3;
        this.d = i7;
        this.f23937e = obj;
    }

    public fk(c1 c1Var, long j3, TLObject tLObject, int i7, int i10) {
        this.f23934a = i10;
        this.f23935b = c1Var;
        this.f23936c = j3;
        this.f23937e = tLObject;
        this.d = i7;
    }

    public fk(ur urVar, int i7, long j3, TLObject tLObject, int i10) {
        this.f23934a = i10;
        this.f23935b = urVar;
        this.d = i7;
        this.f23936c = j3;
        this.f23937e = tLObject;
    }
}
