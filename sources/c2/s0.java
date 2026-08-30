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
    public final Messenger f1994a;
    public final u0 f1995b;
    public final Messenger f1996c;
    public int f1997f;
    public int f1998g;
    public final y0 f1999i;
    public int d = 1;
    public int e = 1;
    public final SparseArray h = new SparseArray();

    public s0(y0 y0Var, Messenger messenger) {
        this.f1999i = y0Var;
        this.f1994a = messenger;
        u0 u0Var = new u0(this);
        this.f1995b = u0Var;
        this.f1996c = new Messenger(u0Var);
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
        obtain.replyTo = this.f1996c;
        try {
            this.f1994a.send(obtain);
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
        this.f1999i.f2039s.post(new r0(this, 1));
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
