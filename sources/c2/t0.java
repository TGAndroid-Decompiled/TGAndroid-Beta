package c2;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
public final class t0 implements IBinder.DeathRecipient {
    public final Messenger f2029a;
    public final v0 f2030b;
    public final Messenger f2031c;
    public int f2032f;
    public int f2033g;
    public final z0 f2034i;
    public int d = 1;
    public int e = 1;
    public final SparseArray h = new SparseArray();

    public t0(z0 z0Var, Messenger messenger) {
        this.f2034i = z0Var;
        this.f2029a = messenger;
        v0 v0Var = new v0(this);
        this.f2030b = v0Var;
        this.f2031c = new Messenger(v0Var);
    }

    public final void a(int i10) {
        int i11 = this.d;
        this.d = i11 + 1;
        b(5, i11, i10, null, null);
    }

    public final boolean b(int i10, int i11, int i12, Bundle bundle, Bundle bundle2) {
        Message obtain = Message.obtain();
        obtain.what = i10;
        obtain.arg1 = i11;
        obtain.arg2 = i12;
        obtain.obj = bundle;
        obtain.setData(bundle2);
        obtain.replyTo = this.f2031c;
        try {
            this.f2029a.send(obtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e) {
            if (i10 != 2) {
                Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
                return false;
            }
            return false;
        }
    }

    @Override
    public final void binderDied() {
        this.f2034i.f2070s.post(new s0(this, 1));
    }

    public final void c(int i10, int i11) {
        Bundle h = android.support.v4.media.a.h(i11, "volume");
        int i12 = this.d;
        this.d = i12 + 1;
        b(7, i12, i10, null, h);
    }

    public final void d(int i10, int i11) {
        Bundle h = android.support.v4.media.a.h(i11, "volume");
        int i12 = this.d;
        this.d = i12 + 1;
        b(8, i12, i10, null, h);
    }
}
