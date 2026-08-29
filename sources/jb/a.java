package jb;

import ab.k;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.cast.o;
import h7.q7;
import j7.c0;
import j7.l1;
import j7.pa;
import j7.qa;
import j7.ra;
import j7.sa;
import j7.ta;
import j7.ua;
import java.util.ArrayList;
import z5.l;
public final class a implements b {
    public final Context f11419a;
    public final ib.b f11420b;
    public boolean f11421c;
    public boolean d;
    public pa f11422e;

    public a(Context context, ib.b bVar) {
        this.f11419a = context;
        this.f11420b = bVar;
    }

    @Override
    public final ArrayList a(fb.a aVar) {
        j6.b bVar;
        if (this.f11422e == null) {
            zzb();
        }
        pa paVar = this.f11422e;
        l.h(paVar);
        if (!this.f11421c) {
            try {
                paVar.Q0(paVar.M0(), 1);
                this.f11421c = true;
            } catch (RemoteException e10) {
                throw new wa.a("Failed to init thin image labeler.", e10);
            }
        }
        int i10 = aVar.f6702e;
        int i11 = aVar.f6700b;
        int i12 = aVar.f6701c;
        int a2 = q7.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i13 = aVar.f6702e;
        if (i13 != -1) {
            if (i13 != 17) {
                if (i13 != 35) {
                    if (i13 != 842094169) {
                        throw new wa.a(l1.k(aVar.f6702e, "Unsupported image format: "), 3);
                    }
                } else {
                    bVar = new j6.b(null);
                }
            }
            l.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.f6699a;
        l.h(bitmap);
        bVar = new j6.b(bitmap);
        try {
            Parcel M0 = paVar.M0();
            int i14 = c0.f10975a;
            M0.writeStrongBinder(bVar);
            M0.writeInt(1);
            int q6 = o.q(M0, 20293);
            o.s(M0, 1, 4);
            M0.writeInt(i10);
            o.s(M0, 2, 4);
            M0.writeInt(i11);
            o.s(M0, 3, 4);
            M0.writeInt(i12);
            o.s(M0, 4, 4);
            M0.writeInt(a2);
            o.s(M0, 5, 8);
            M0.writeLong(elapsedRealtime);
            o.r(M0, q6);
            Parcel O0 = paVar.O0(M0, 3);
            ArrayList createTypedArrayList = O0.createTypedArrayList(ta.CREATOR);
            O0.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = createTypedArrayList.get(i15);
                i15++;
                ta taVar = (ta) obj;
                arrayList.add(new hb.a(taVar.f11205b, taVar.d, taVar.f11204a, taVar.f11206c));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new wa.a("Failed to run thin image labeler.", e11);
        }
    }

    @Override
    public final void zzb() {
        IInterface aVar;
        Context context = this.f11419a;
        if (this.f11422e != null) {
            return;
        }
        try {
            IBinder b10 = k6.e.c(context, k6.e.f13450b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i10 = ra.f11167b;
            if (b10 == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                if (queryLocalInterface instanceof sa) {
                    aVar = (sa) queryLocalInterface;
                } else {
                    aVar = new com.google.android.gms.internal.cast.a(b10, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 5);
                }
            }
            this.f11422e = ((qa) aVar).U0(new j6.b(context), new ua(this.f11420b.f7985a, -1));
        } catch (RemoteException e10) {
            throw new wa.a("Failed to create thin image labeler.", e10);
        } catch (k6.b unused) {
            if (!this.d) {
                k.b(context);
                this.d = true;
            }
            throw new wa.a("Waiting for the label optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override
    public final void zzc() {
        pa paVar = this.f11422e;
        if (paVar != null) {
            try {
                paVar.Q0(paVar.M0(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.f11422e = null;
            this.f11421c = false;
        }
    }
}
