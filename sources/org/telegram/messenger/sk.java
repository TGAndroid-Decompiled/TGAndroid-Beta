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
public final class sk implements Runnable {
    public final int f18105a;
    public final Object f18106b;
    public final long f18107c;
    public final int d;
    public final Object e;

    public sk(int i10, int i11, long j10, Object obj, Object obj2) {
        this.f18105a = i11;
        this.f18106b = obj;
        this.e = obj2;
        this.f18107c = j10;
        this.d = i10;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sk.a():void");
    }

    private final void b() {
        i00 i00Var = (i00) this.f18106b;
        is isVar = (is) this.e;
        long j10 = this.f18107c;
        int i10 = this.d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabase = isVar.f16333b;
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j10 + " AND mid > 0 AND type = 4 ORDER BY date DESC, mid DESC", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.readAttachPath(byteBufferValue, e20.i(i10).f15524n);
                    byteBufferValue.reuse();
                    if (kj.K3(TLdeserialize)) {
                        TLdeserialize.f19815id = queryFinalized.intValue(1);
                        TLdeserialize.dialog_id = j10;
                        kj kjVar = new kj(i10, TLdeserialize, false, true);
                        arrayList.add(kjVar);
                        arrayList2.add(new MediaSessionCompat$QueueItem(null, new MediaDescriptionCompat(j10 + "_" + arrayList.size(), kjVar.z1(true), kjVar.x1(true), null, null, null, null, null), arrayList2.size()));
                    }
                }
            }
            queryFinalized.dispose();
            Collections.reverse(arrayList);
            Collections.reverse(arrayList2);
        } catch (Exception e) {
            f8.g(e, true);
        }
        i0.g3(new d2(i00Var, i10, j10, arrayList, arrayList2, 6));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sk.run():void");
    }

    public sk(f1 f1Var, long j10, int i10, Object obj, int i11) {
        this.f18105a = i11;
        this.f18106b = f1Var;
        this.f18107c = j10;
        this.d = i10;
        this.e = obj;
    }

    public sk(f1 f1Var, long j10, TLObject tLObject, int i10, int i11) {
        this.f18105a = i11;
        this.f18106b = f1Var;
        this.f18107c = j10;
        this.e = tLObject;
        this.d = i10;
    }

    public sk(is isVar, int i10, long j10, TLObject tLObject, int i11) {
        this.f18105a = i11;
        this.f18106b = isVar;
        this.d = i10;
        this.f18107c = j10;
        this.e = tLObject;
    }
}
