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
public final class dmc implements pdd {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;

    public dmc(Context context, Looper looper, bfb bfbVar) {
        this.c = new rhb(context.getApplicationContext(), (byte) 3);
        this.d = bfbVar.a(looper, null);
        this.e = bfbVar.a(Looper.getMainLooper(), null);
    }

    public final void a(boolean z, boolean z2) {
        dfb dfbVar = (dfb) this.d;
        if (z && z2) {
            dfbVar.e(new c04(this, z, z2, (byte) 5));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        ((dfb) this.e).a.postDelayed(new qhc(this, atomicBoolean, (byte) 10), 1000L);
        dfbVar.e(new bb1(this, atomicBoolean, z, z2, (byte) 5));
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
    public final ArrayList e(gq5 gq5Var) {
        if (((v7f) this.e) == null) {
            zzb();
        }
        v7f v7fVar = (v7f) this.e;
        ite.h(v7fVar);
        if (!this.a) {
            try {
                v7fVar.V(v7fVar.R(), 1);
                this.a = true;
            } catch (RemoteException e) {
                throw new dg7("Failed to init thin image labeler.", e);
            }
        }
        int i = gq5Var.b;
        int i2 = gq5Var.c;
        int a = ytd.a(gq5Var.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmap = gq5Var.a;
        ite.h(bitmap);
        eq7 eq7Var = new eq7(bitmap);
        try {
            Parcel R = v7fVar.R();
            int i3 = wid.a;
            R.writeStrongBinder(eq7Var);
            R.writeInt(1);
            int r = mve.r(R, 20293);
            mve.q(R, 1, 4);
            R.writeInt(-1);
            mve.q(R, 2, 4);
            R.writeInt(i);
            mve.q(R, 3, 4);
            R.writeInt(i2);
            mve.q(R, 4, 4);
            R.writeInt(a);
            mve.q(R, 5, 8);
            R.writeLong(elapsedRealtime);
            mve.s(R, r);
            Parcel T = v7fVar.T(R, 3);
            ArrayList createTypedArrayList = T.createTypedArrayList(f8f.CREATOR);
            T.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = createTypedArrayList.get(i4);
                i4++;
                f8f f8fVar = (f8f) obj;
                arrayList.add(new fm5(f8fVar.b, f8fVar.d, f8fVar.a, f8fVar.c));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new dg7("Failed to run thin image labeler.", e2);
        }
    }

    @Override
    public final void zzb() {
        IInterface f1dVar;
        Context context = (Context) this.c;
        if (((v7f) this.e) != null) {
            return;
        }
        try {
            IBinder b = nt3.c(context, nt3.b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i = a8f.b;
            if (b == null) {
                f1dVar = null;
            } else {
                IInterface queryLocalInterface = b.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                if (queryLocalInterface instanceof c8f) {
                    f1dVar = (c8f) queryLocalInterface;
                } else {
                    f1dVar = new f1d(b, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", (byte) 7);
                }
            }
            this.e = ((x7f) f1dVar).Z(new eq7(context), new k8f(((im5) this.d).a, -1));
        } catch (RemoteException e) {
            throw new dg7("Failed to create thin image labeler.", e);
        } catch (kt3 unused) {
            if (!this.b) {
                ws7.a(context);
                this.b = true;
            }
            throw new dg7("Waiting for the label optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override
    public final void zzc() {
        v7f v7fVar = (v7f) this.e;
        if (v7fVar != null) {
            try {
                v7fVar.V(v7fVar.R(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.e = null;
            this.a = false;
        }
    }

    public dmc(Context context, im5 im5Var) {
        this.c = context;
        this.d = im5Var;
    }
}
