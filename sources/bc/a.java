package bc;

import a8.df;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import di.b4;
import e2.g0;
import e2.i0;
import e2.o0;
import e2.p0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import n4.s;
import o6.l;
import sb.j;
import w7.j5;
import y7.ga;
import y7.ha;
import y7.ia;
import y7.ja;
import y7.ka;
import y7.la;
import y7.x;
public final class a implements b {
    public boolean f3835a;
    public boolean f3836b;
    public final Object f3837c;
    public final Object d;
    public Object e;

    public a(Context context, ac.b bVar) {
        this.f3837c = context;
        this.d = bVar;
    }

    @Override
    public ArrayList a(xb.a aVar) {
        y6.b bVar;
        if (((ga) this.e) == null) {
            zzb();
        }
        ga gaVar = (ga) this.e;
        l.h(gaVar);
        if (!this.f3835a) {
            try {
                gaVar.R0(gaVar.N0(), 1);
                this.f3835a = true;
            } catch (RemoteException e) {
                throw new ob.a("Failed to init thin image labeler.", e);
            }
        }
        int i10 = aVar.e;
        int i11 = aVar.f51705b;
        int i12 = aVar.f51706c;
        int a2 = j5.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i13 = aVar.e;
        if (i13 != -1) {
            if (i13 != 17) {
                if (i13 != 35) {
                    if (i13 != 842094169) {
                        throw new ob.a(ic.a.i(aVar.e, "Unsupported image format: "), 3);
                    }
                } else {
                    bVar = new y6.b(null);
                }
            }
            l.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.f51704a;
        l.h(bitmap);
        bVar = new y6.b(bitmap);
        try {
            Parcel N0 = gaVar.N0();
            int i14 = x.f52371a;
            N0.writeStrongBinder(bVar);
            N0.writeInt(1);
            int q5 = df.q(N0, 20293);
            df.s(N0, 1, 4);
            N0.writeInt(i10);
            df.s(N0, 2, 4);
            N0.writeInt(i11);
            df.s(N0, 3, 4);
            N0.writeInt(i12);
            df.s(N0, 4, 4);
            N0.writeInt(a2);
            df.s(N0, 5, 8);
            N0.writeLong(elapsedRealtime);
            df.r(N0, q5);
            Parcel P0 = gaVar.P0(N0, 3);
            ArrayList createTypedArrayList = P0.createTypedArrayList(ka.CREATOR);
            P0.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = createTypedArrayList.get(i15);
                i15++;
                ka kaVar = (ka) obj;
                arrayList.add(new zb.a(kaVar.f52198b, kaVar.d, kaVar.f52197a, kaVar.f52199c));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new ob.a("Failed to run thin image labeler.", e10);
        }
    }

    public void b(boolean z10, boolean z11) {
        i0 i0Var = (i0) this.d;
        if (z10 && z11) {
            i0Var.d(new o0(this, z10, z11, 0));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        ((i0) this.e).f9672a.postDelayed(new b4(29, this, atomicBoolean), 1000L);
        i0Var.d(new p0(this, atomicBoolean, z10, z11, 0));
    }

    public void c(boolean z10) {
        if (this.f3836b != z10) {
            this.f3836b = z10;
            if (this.f3835a) {
                b(true, z10);
            }
        }
    }

    @Override
    public void zzb() {
        IInterface aVar;
        Context context = (Context) this.f3837c;
        if (((ga) this.e) != null) {
            return;
        }
        try {
            IBinder b10 = z6.e.c(context, z6.e.f52676b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i10 = ia.f52179b;
            if (b10 == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                if (queryLocalInterface instanceof ja) {
                    aVar = (ja) queryLocalInterface;
                } else {
                    aVar = new a8.a(b10, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 11);
                }
            }
            this.e = ((ha) aVar).V0(new y6.b(context), new la(((ac.b) this.d).f52845a, -1));
        } catch (RemoteException e) {
            throw new ob.a("Failed to create thin image labeler.", e);
        } catch (z6.b unused) {
            if (!this.f3836b) {
                j.b(context);
                this.f3836b = true;
            }
            throw new ob.a("Waiting for the label optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override
    public void zzc() {
        ga gaVar = (ga) this.e;
        if (gaVar != null) {
            try {
                gaVar.R0(gaVar.N0(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.e = null;
            this.f3835a = false;
        }
    }

    public a(Context context, Looper looper, g0 g0Var) {
        this.f3837c = new s(context.getApplicationContext(), 14);
        this.d = g0Var.a(looper, null);
        this.e = g0Var.a(Looper.getMainLooper(), null);
    }
}
