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
    public final Messenger f2903a;
    public final w0 f2904b;
    public final Messenger f2905c;
    public int f2907f;
    public int f2908g;
    public final a1 f2909i;
    public int d = 1;
    public int f2906e = 1;
    public final SparseArray h = new SparseArray();

    public t0(a1 a1Var, Messenger messenger) {
        this.f2909i = a1Var;
        this.f2903a = messenger;
        w0 w0Var = new w0(this);
        this.f2904b = w0Var;
        this.f2905c = new Messenger(w0Var);
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
        obtain.replyTo = this.f2905c;
        try {
            this.f2903a.send(obtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e10) {
            if (i10 != 2) {
                Log.e("MediaRouteProviderProxy", "Could not send message to service.", e10);
                return false;
            }
            return false;
        }
    }

    @Override
    public final void binderDied() {
        this.f2909i.f2764s.post(new s0(this, 1));
    }

    public final void c(int i10, int i11) {
        Bundle h = a4.w.h(i11, "volume");
        int i12 = this.d;
        this.d = i12 + 1;
        b(7, i12, i10, null, h);
    }

    public final void d(int i10, int i11) {
        Bundle h = a4.w.h(i11, "volume");
        int i12 = this.d;
        this.d = i12 + 1;
        b(8, i12, i10, null, h);
    }
}
