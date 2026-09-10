package n4;

import android.os.Binder;
import android.os.IBinder;
import java.lang.ref.WeakReference;
public final class q extends Binder implements h {
    public static final int f13803b = 0;
    public final WeakReference f13804a;

    public q(r rVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f13804a = new WeakReference(rVar);
    }

    public final void G0(f fVar) {
        r rVar = (r) this.f13804a.get();
        if (rVar != null && fVar != null) {
            rVar.f13808f.register(fVar, new a0("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
            synchronized (rVar.d) {
            }
        }
    }

    @Override
    public final boolean onTransact(int r33, android.os.Parcel r34, android.os.Parcel r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: n4.q.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
