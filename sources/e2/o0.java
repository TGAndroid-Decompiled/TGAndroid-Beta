package e2;

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
import w7.o6;
import x7.ka;
import x7.la;
import x7.ma;
import x7.na;
import x7.oa;
import x7.pa;
public final class o0 implements sb.a {
    public boolean f6182a;
    public boolean f6183b;
    public final Object f6184c;
    public final Object d;
    public Object e;

    public o0(Context context, rb.a aVar) {
        this.f6184c = context;
        this.d = aVar;
    }

    @Override
    public ArrayList a(ob.a aVar) {
        x6.b bVar;
        if (((ka) this.e) == null) {
            zzb();
        }
        ka kaVar = (ka) this.e;
        n6.l.g(kaVar);
        if (!this.f6182a) {
            try {
                kaVar.T0(kaVar.P0(), 1);
                this.f6182a = true;
            } catch (RemoteException e) {
                throw new fb.a("Failed to init thin image labeler.", e);
            }
        }
        int i10 = aVar.e;
        int i11 = aVar.f14122b;
        int i12 = aVar.f14123c;
        int a2 = o6.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i13 = aVar.e;
        if (i13 != -1) {
            if (i13 != 17) {
                if (i13 != 35) {
                    if (i13 != 842094169) {
                        throw new fb.a(i0.a.i(aVar.e, "Unsupported image format: "), 3);
                    }
                } else {
                    bVar = new x6.b(null);
                }
            }
            n6.l.g(null);
            throw null;
        }
        Bitmap bitmap = aVar.f14121a;
        n6.l.g(bitmap);
        bVar = new x6.b(bitmap);
        try {
            Parcel P0 = kaVar.P0();
            int i14 = x7.y.f53409a;
            P0.writeStrongBinder(bVar);
            P0.writeInt(1);
            int q6 = w7.h0.q(P0, 20293);
            w7.h0.s(P0, 1, 4);
            P0.writeInt(i10);
            w7.h0.s(P0, 2, 4);
            P0.writeInt(i11);
            w7.h0.s(P0, 3, 4);
            P0.writeInt(i12);
            w7.h0.s(P0, 4, 4);
            P0.writeInt(a2);
            w7.h0.s(P0, 5, 8);
            P0.writeLong(elapsedRealtime);
            w7.h0.r(P0, q6);
            Parcel R0 = kaVar.R0(P0, 3);
            ArrayList createTypedArrayList = R0.createTypedArrayList(oa.CREATOR);
            R0.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = createTypedArrayList.get(i15);
                i15++;
                oa oaVar = (oa) obj;
                arrayList.add(new qb.a(oaVar.f53280b, oaVar.d, oaVar.f53279a, oaVar.f53281c));
            }
            return arrayList;
        } catch (RemoteException e7) {
            throw new fb.a("Failed to run thin image labeler.", e7);
        }
    }

    public void b(boolean z10, boolean z11) {
        i0 i0Var = (i0) this.d;
        if (z10 && z11) {
            i0Var.d(new m0(this, z10, z11, 0));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        ((i0) this.e).f6151a.postDelayed(new d1.e(11, this, atomicBoolean), 1000L);
        i0Var.d(new n0(this, atomicBoolean, z10, z11, 0));
    }

    public void c(boolean z10) {
        if (this.f6183b != z10) {
            this.f6183b = z10;
            if (this.f6182a) {
                b(true, z10);
            }
        }
    }

    @Override
    public void zzb() {
        IInterface aVar;
        Context context = (Context) this.f6184c;
        if (((ka) this.e) != null) {
            return;
        }
        try {
            IBinder b10 = y6.e.c(context, y6.e.f54188b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i10 = ma.f53243b;
            if (b10 == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                if (queryLocalInterface instanceof na) {
                    aVar = (na) queryLocalInterface;
                } else {
                    aVar = new a9.a(b10, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 10);
                }
            }
            this.e = ((la) aVar).X0(new x6.b(context), new pa(((rb.a) this.d).f45509a, -1));
        } catch (RemoteException e) {
            throw new fb.a("Failed to create thin image labeler.", e);
        } catch (y6.b unused) {
            if (!this.f6183b) {
                jb.j.b(context);
                this.f6183b = true;
            }
            throw new fb.a("Waiting for the label optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override
    public void zzc() {
        ka kaVar = (ka) this.e;
        if (kaVar != null) {
            try {
                kaVar.T0(kaVar.P0(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.e = null;
            this.f6182a = false;
        }
    }

    public o0(Context context, Looper looper, g0 g0Var) {
        this.f6184c = new hf.b(context.getApplicationContext(), 15);
        this.d = g0Var.a(looper, null);
        this.e = g0Var.a(Looper.getMainLooper(), null);
    }
}
