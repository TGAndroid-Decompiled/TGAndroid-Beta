package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
public final class ekc implements nbd {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;

    public ekc(Context context, Looper looper, adb adbVar) {
        this.c = new aec(context.getApplicationContext(), (byte) 1);
        this.d = adbVar.a(looper, null);
        this.e = adbVar.a(Looper.getMainLooper(), null);
    }

    public final void a(boolean z, boolean z2) {
        cdb cdbVar = (cdb) this.d;
        if (z && z2) {
            cdbVar.e(new sy3(this, z, z2, (byte) 5));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        ((cdb) this.e).a.postDelayed(new mhc(this, atomicBoolean, (byte) 8), 1000L);
        cdbVar.e(new s91(this, atomicBoolean, z, z2, (byte) 5));
    }

    public final void b(boolean z) {
        if (this.b != z) {
            this.b = z;
            if (this.a) {
                a(true, z);
            }
        }
    }

    @Override
    public final ArrayList d(go5 go5Var) {
        if (((t5f) this.e) == null) {
            zzb();
        }
        t5f t5fVar = (t5f) this.e;
        fre.h(t5fVar);
        if (!this.a) {
            try {
                t5fVar.V(t5fVar.R(), 1);
                this.a = true;
            } catch (RemoteException e) {
                throw new be7("Failed to init thin image labeler.", e);
            }
        }
        int i = go5Var.b;
        int i2 = go5Var.c;
        int a = vrd.a(go5Var.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmap = go5Var.a;
        fre.h(bitmap);
        bo7 bo7Var = new bo7(bitmap);
        try {
            Parcel R = t5fVar.R();
            int i3 = vgd.a;
            R.writeStrongBinder(bo7Var);
            R.writeInt(1);
            int r = jte.r(R, 20293);
            jte.q(R, 1, 4);
            R.writeInt(-1);
            jte.q(R, 2, 4);
            R.writeInt(i);
            jte.q(R, 3, 4);
            R.writeInt(i2);
            jte.q(R, 4, 4);
            R.writeInt(a);
            jte.q(R, 5, 8);
            R.writeLong(elapsedRealtime);
            jte.s(R, r);
            Parcel T = t5fVar.T(R, 3);
            ArrayList createTypedArrayList = T.createTypedArrayList(d6f.CREATOR);
            T.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = createTypedArrayList.get(i4);
                i4++;
                d6f d6fVar = (d6f) obj;
                arrayList.add(new fk5(d6fVar.b, d6fVar.d, d6fVar.a, d6fVar.c));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new be7("Failed to run thin image labeler.", e2);
        }
    }

    @Override
    public final void zzb() {
        IInterface ezcVar;
        Context context = (Context) this.c;
        if (((t5f) this.e) != null) {
            return;
        }
        try {
            IBinder b = ds3.c(context, ds3.b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i = y5f.b;
            if (b == null) {
                ezcVar = null;
            } else {
                IInterface queryLocalInterface = b.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                if (queryLocalInterface instanceof a6f) {
                    ezcVar = (a6f) queryLocalInterface;
                } else {
                    ezcVar = new ezc(b, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", (byte) 7);
                }
            }
            this.e = ((v5f) ezcVar).Z(new bo7(context), new i6f(((ik5) this.d).a, -1));
        } catch (RemoteException e) {
            throw new be7("Failed to create thin image labeler.", e);
        } catch (as3 unused) {
            if (!this.b) {
                uq7.a(context);
                this.b = true;
            }
            throw new be7("Waiting for the label optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override
    public final void zzc() {
        t5f t5fVar = (t5f) this.e;
        if (t5fVar != null) {
            try {
                t5fVar.V(t5fVar.R(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.e = null;
            this.a = false;
        }
    }

    public ekc(Context context, ik5 ik5Var) {
        this.c = context;
        this.d = ik5Var;
    }
}
