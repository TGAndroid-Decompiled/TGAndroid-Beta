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
public final class qoc implements ggd {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;

    public qoc(Context context, Looper looper, vgb vgbVar) {
        this.c = new zhc(context.getApplicationContext(), (byte) 1);
        this.d = vgbVar.a(looper, null);
        this.e = vgbVar.a(Looper.getMainLooper(), null);
    }

    @Override
    public final ArrayList a(jq5 jq5Var) {
        if (((kaf) this.e) == null) {
            zzb();
        }
        kaf kafVar = (kaf) this.e;
        xve.h(kafVar);
        if (!this.a) {
            try {
                kafVar.V(kafVar.R(), 1);
                this.a = true;
            } catch (RemoteException e) {
                throw new lg7("Failed to init thin image labeler.", e);
            }
        }
        int i = jq5Var.b;
        int i2 = jq5Var.c;
        int a = lwd.a(jq5Var.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmap = jq5Var.a;
        xve.h(bitmap);
        br7 br7Var = new br7(bitmap);
        try {
            Parcel R = kafVar.R();
            int i3 = mld.a;
            R.writeStrongBinder(br7Var);
            R.writeInt(1);
            int r = bye.r(R, 20293);
            bye.q(R, 1, 4);
            R.writeInt(-1);
            bye.q(R, 2, 4);
            R.writeInt(i);
            bye.q(R, 3, 4);
            R.writeInt(i2);
            bye.q(R, 4, 4);
            R.writeInt(a);
            bye.q(R, 5, 8);
            R.writeLong(elapsedRealtime);
            bye.s(R, r);
            Parcel T = kafVar.T(R, 3);
            ArrayList createTypedArrayList = T.createTypedArrayList(uaf.CREATOR);
            T.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = createTypedArrayList.get(i4);
                i4++;
                uaf uafVar = (uaf) obj;
                arrayList.add(new im5(uafVar.b, uafVar.d, uafVar.a, uafVar.c));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new lg7("Failed to run thin image labeler.", e2);
        }
    }

    public final void b(boolean z, boolean z2) {
        xgb xgbVar = (xgb) this.d;
        if (z && z2) {
            xgbVar.e(new mz3(this, z, z2, (byte) 5));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        ((xgb) this.e).a.postDelayed(new slc(this, atomicBoolean, (byte) 8), 1000L);
        xgbVar.e(new ba1(this, atomicBoolean, z, z2, (byte) 5));
    }

    public final void c(boolean z) {
        if (this.b != z) {
            this.b = z;
            if (this.a) {
                b(true, z);
            }
        }
    }

    @Override
    public final void zzb() {
        IInterface v3dVar;
        Context context = (Context) this.c;
        if (((kaf) this.e) != null) {
            return;
        }
        try {
            IBinder b = vs3.c(context, vs3.b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i = paf.b;
            if (b == null) {
                v3dVar = null;
            } else {
                IInterface queryLocalInterface = b.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                if (queryLocalInterface instanceof raf) {
                    v3dVar = (raf) queryLocalInterface;
                } else {
                    v3dVar = new v3d(b, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", (byte) 7);
                }
            }
            this.e = ((maf) v3dVar).Z(new br7(context), new zaf(((lm5) this.d).a, -1));
        } catch (RemoteException e) {
            throw new lg7("Failed to create thin image labeler.", e);
        } catch (ss3 unused) {
            if (!this.b) {
                zt7.a(context);
                this.b = true;
            }
            throw new lg7("Waiting for the label optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override
    public final void zzc() {
        kaf kafVar = (kaf) this.e;
        if (kafVar != null) {
            try {
                kafVar.V(kafVar.R(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.e = null;
            this.a = false;
        }
    }

    public qoc(Context context, lm5 lm5Var) {
        this.c = context;
        this.d = lm5Var;
    }
}
