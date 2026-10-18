package ac;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import ci.u7;
import e2.g0;
import e2.i0;
import e2.n0;
import e2.o0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import n6.l;
import rb.j;
import w7.f0;
import w7.q8;
import x7.ja;
import x7.ka;
import x7.la;
import x7.ma;
import x7.na;
import x7.oa;
import x7.y;
public final class a implements b {
    public boolean f480a;
    public boolean f481b;
    public final Object f482c;
    public final Object d;
    public Object e;

    public a(Context context, zb.a aVar) {
        this.f482c = context;
        this.d = aVar;
    }

    @Override
    public ArrayList a(wb.a aVar) {
        x6.b bVar;
        if (((ja) this.e) == null) {
            zzb();
        }
        ja jaVar = (ja) this.e;
        l.h(jaVar);
        if (!this.f480a) {
            try {
                jaVar.R0(jaVar.N0(), 1);
                this.f480a = true;
            } catch (RemoteException e) {
                throw new nb.a("Failed to init thin image labeler.", e);
            }
        }
        int i10 = aVar.e;
        int i11 = aVar.f48898b;
        int i12 = aVar.f48899c;
        int a2 = q8.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i13 = aVar.e;
        if (i13 != -1) {
            if (i13 != 17) {
                if (i13 != 35) {
                    if (i13 != 842094169) {
                        throw new nb.a(i2.d.j(aVar.e, "Unsupported image format: "), 3);
                    }
                } else {
                    bVar = new x6.b(null);
                }
            }
            l.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.f48897a;
        l.h(bitmap);
        bVar = new x6.b(bitmap);
        try {
            Parcel N0 = jaVar.N0();
            int i14 = y.f49628a;
            N0.writeStrongBinder(bVar);
            N0.writeInt(1);
            int q6 = f0.q(N0, 20293);
            f0.s(N0, 1, 4);
            N0.writeInt(i10);
            f0.s(N0, 2, 4);
            N0.writeInt(i11);
            f0.s(N0, 3, 4);
            N0.writeInt(i12);
            f0.s(N0, 4, 4);
            N0.writeInt(a2);
            f0.s(N0, 5, 8);
            N0.writeLong(elapsedRealtime);
            f0.r(N0, q6);
            Parcel P0 = jaVar.P0(N0, 3);
            ArrayList createTypedArrayList = P0.createTypedArrayList(na.CREATOR);
            P0.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = createTypedArrayList.get(i15);
                i15++;
                na naVar = (na) obj;
                arrayList.add(new yb.a(naVar.f49486b, naVar.d, naVar.f49485a, naVar.f49487c));
            }
            return arrayList;
        } catch (RemoteException e7) {
            throw new nb.a("Failed to run thin image labeler.", e7);
        }
    }

    public void b(boolean z10, boolean z11) {
        i0 i0Var = (i0) this.d;
        if (z10 && z11) {
            i0Var.d(new n0(this, z10, z11, 0));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        ((i0) this.e).f8238a.postDelayed(new u7(20, this, atomicBoolean), 1000L);
        i0Var.d(new o0(this, atomicBoolean, z10, z11, 0));
    }

    public void c(boolean z10) {
        if (this.f481b != z10) {
            this.f481b = z10;
            if (this.f480a) {
                b(true, z10);
            }
        }
    }

    @Override
    public void zzb() {
        IInterface aVar;
        Context context = (Context) this.f482c;
        if (((ja) this.e) != null) {
            return;
        }
        try {
            IBinder b10 = y6.e.c(context, y6.e.f49949b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i10 = la.f49450b;
            if (b10 == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                if (queryLocalInterface instanceof ma) {
                    aVar = (ma) queryLocalInterface;
                } else {
                    aVar = new a9.a(b10, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 10);
                }
            }
            this.e = ((ka) aVar).V0(new x6.b(context), new oa(((zb.a) this.d).f50119a, -1));
        } catch (RemoteException e) {
            throw new nb.a("Failed to create thin image labeler.", e);
        } catch (y6.b unused) {
            if (!this.f481b) {
                j.b(context);
                this.f481b = true;
            }
            throw new nb.a("Waiting for the label optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override
    public void zzc() {
        ja jaVar = (ja) this.e;
        if (jaVar != null) {
            try {
                jaVar.R0(jaVar.N0(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.e = null;
            this.f480a = false;
        }
    }

    public a(Context context, Looper looper, g0 g0Var) {
        this.f482c = new qf.b((Object) context.getApplicationContext(), 13);
        this.d = g0Var.a(looper, null);
        this.e = g0Var.a(Looper.getMainLooper(), null);
    }
}
