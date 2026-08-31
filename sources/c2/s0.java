package c2;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
public final class s0 implements IBinder.DeathRecipient {
    public final Messenger f2165a;
    public final u0 f2166b;
    public final Messenger f2167c;
    public int f2169f;
    public int f2170g;
    public final y0 f2171i;
    public int d = 1;
    public int f2168e = 1;
    public final SparseArray h = new SparseArray();

    public s0(y0 y0Var, Messenger messenger) {
        this.f2171i = y0Var;
        this.f2165a = messenger;
        u0 u0Var = new u0(this);
        this.f2166b = u0Var;
        this.f2167c = new Messenger(u0Var);
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
        obtain.replyTo = this.f2167c;
        try {
            this.f2165a.send(obtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e6) {
            if (i10 != 2) {
                Log.e("MediaRouteProviderProxy", "Could not send message to service.", e6);
                return false;
            }
            return false;
        }
    }

    @Override
    public final void binderDied() {
        this.f2171i.f2215s.post(new r0(this, 1));
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
