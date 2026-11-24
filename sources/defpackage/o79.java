package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
public final class o79 implements IBinder.DeathRecipient {
    public final Messenger a;
    public final qd b;
    public final Messenger c;
    public int f;
    public int h;
    public final u79 r;
    public int d = 1;
    public int e = 1;
    public final SparseArray n = new SparseArray();

    public o79(u79 u79Var, Messenger messenger) {
        this.r = u79Var;
        this.a = messenger;
        qd qdVar = new qd(this);
        this.b = qdVar;
        this.c = new Messenger(qdVar);
    }

    public final void a(int i) {
        int i2 = this.d;
        this.d = i2 + 1;
        b(5, i2, i, null, null);
    }

    public final boolean b(int i, int i2, int i3, Object obj, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = obj;
        obtain.setData(bundle);
        obtain.replyTo = this.c;
        try {
            this.a.send(obtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e) {
            if (i != 2) {
                Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
                return false;
            }
            return false;
        }
    }

    @Override
    public final void binderDied() {
        this.r.s.post(new n79(this, (byte) 1));
    }

    public final void c(int i, int i2) {
        Bundle j = kt6.j(i2, "volume");
        int i3 = this.d;
        this.d = i3 + 1;
        b(7, i3, i, null, j);
    }

    public final void d(int i, int i2) {
        Bundle j = kt6.j(i2, "volume");
        int i3 = this.d;
        this.d = i3 + 1;
        b(8, i3, i, null, j);
    }
}
