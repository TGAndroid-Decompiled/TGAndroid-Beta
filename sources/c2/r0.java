package c2;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

public final class r0 implements IBinder.DeathRecipient {

    public final Messenger f2332a;

    public final u0 f2333b;

    public final Messenger f2334c;

    public int f2336f;

    public int f2337g;

    public final y0 f2338i;
    public int d = 1;

    public int f2335e = 1;
    public final SparseArray h = new SparseArray();

    public r0(y0 y0Var, Messenger messenger) {
        this.f2338i = y0Var;
        this.f2332a = messenger;
        u0 u0Var = new u0(this);
        this.f2333b = u0Var;
        this.f2334c = new Messenger(u0Var);
    }

    public final void a(int i10) {
        int i11 = this.d;
        this.d = i11 + 1;
        b(5, i11, i10, null, null);
    }

    public final boolean b(int i10, int i11, int i12, Bundle bundle, Bundle bundle2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        messageObtain.arg1 = i11;
        messageObtain.arg2 = i12;
        messageObtain.obj = bundle;
        messageObtain.setData(bundle2);
        messageObtain.replyTo = this.f2334c;
        try {
            this.f2332a.send(messageObtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e9) {
            if (i10 == 2) {
                return false;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", e9);
            return false;
        }
    }

    @Override
    public final void binderDied() {
        this.f2338i.f2386s.post(new q0(this, 1));
    }

    public final void c(int i10, int i11) {
        Bundle bundleG = a9.p.g(i11, "volume");
        int i12 = this.d;
        this.d = i12 + 1;
        b(7, i12, i10, null, bundleG);
    }

    public final void d(int i10, int i11) {
        Bundle bundleG = a9.p.g(i11, "volume");
        int i12 = this.d;
        this.d = i12 + 1;
        b(8, i12, i10, null, bundleG);
    }
}
