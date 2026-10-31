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
public final class rk implements Runnable {
    public final int f17741a;
    public final Object f17742b;
    public final long f17743c;
    public final int d;
    public final Object e;

    public rk(int i10, int i11, long j10, Object obj, Object obj2) {
        this.f17741a = i11;
        this.f17742b = obj;
        this.e = obj2;
        this.f17743c = j10;
        this.d = i10;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rk.a():void");
    }

    private final void b() {
        h00 h00Var = (h00) this.f17742b;
        hs hsVar = (hs) this.e;
        long j10 = this.f17743c;
        int i10 = this.d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabase = hsVar.f15940b;
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j10 + " AND mid > 0 AND type = 4 ORDER BY date DESC, mid DESC", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.readAttachPath(byteBufferValue, d20.i(i10).f15165n);
                    byteBufferValue.reuse();
                    if (jj.K3(TLdeserialize)) {
                        TLdeserialize.f19814id = queryFinalized.intValue(1);
                        TLdeserialize.dialog_id = j10;
                        jj jjVar = new jj(i10, TLdeserialize, false, true);
                        arrayList.add(jjVar);
                        arrayList2.add(new MediaSessionCompat$QueueItem(null, new MediaDescriptionCompat(j10 + "_" + arrayList.size(), jjVar.z1(true), jjVar.x1(true), null, null, null, null, null), arrayList2.size()));
                    }
                }
            }
            queryFinalized.dispose();
            Collections.reverse(arrayList);
            Collections.reverse(arrayList2);
        } catch (Exception e) {
            f8.g(e, true);
        }
        i0.g3(new d2(h00Var, i10, j10, arrayList, arrayList2, 6));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rk.run():void");
    }

    public rk(f1 f1Var, long j10, int i10, Object obj, int i11) {
        this.f17741a = i11;
        this.f17742b = f1Var;
        this.f17743c = j10;
        this.d = i10;
        this.e = obj;
    }

    public rk(f1 f1Var, long j10, TLObject tLObject, int i10, int i11) {
        this.f17741a = i11;
        this.f17742b = f1Var;
        this.f17743c = j10;
        this.e = tLObject;
        this.d = i10;
    }

    public rk(hs hsVar, int i10, long j10, TLObject tLObject, int i11) {
        this.f17741a = i11;
        this.f17742b = hsVar;
        this.d = i10;
        this.f17743c = j10;
        this.e = tLObject;
    }
}
