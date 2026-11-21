package h2;

import a8.db;
import a8.eb;
import a8.fb;
import a8.gb;
import a8.hb;
import a8.ib;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import c8.ad;
import c8.bc;
import fi.l4;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
public final class o0 implements yb.a {
    public final int f13831a = 1;
    public boolean f13832b;
    public boolean f13833c;
    public final Object d;
    public final Object f13834e;
    public Object f13835f;

    public o0(Context context, xb.a aVar) {
        this.d = context;
        this.f13834e = aVar;
    }

    public void a(boolean z10, boolean z11) {
        i0 i0Var = (i0) this.f13834e;
        if (z10 && z11) {
            i0Var.d(new m0(this, z10, z11, 0));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        ((i0) this.f13835f).f13797a.postDelayed(new l4(27, this, atomicBoolean), 1000L);
        i0Var.d(new n0(this, atomicBoolean, z10, z11, 0));
    }

    public void b(boolean z10) {
        if (this.f13833c != z10) {
            this.f13833c = z10;
            if (this.f13832b) {
                a(true, z10);
            }
        }
    }

    @Override
    public ArrayList c(ub.a aVar) {
        a7.b bVar;
        if (((db) this.f13835f) == null) {
            zzb();
        }
        db dbVar = (db) this.f13835f;
        q6.m.h(dbVar);
        if (!this.f13832b) {
            try {
                dbVar.t1(dbVar.p1(), 1);
                this.f13832b = true;
            } catch (RemoteException e10) {
                throw new lb.a("Failed to init thin image labeler.", e10);
            }
        }
        int i7 = aVar.f58607e;
        int i10 = aVar.f58605b;
        int i11 = aVar.f58606c;
        int a10 = ad.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i12 = aVar.f58607e;
        if (i12 != -1) {
            if (i12 != 17) {
                if (i12 != 35) {
                    if (i12 != 842094169) {
                        throw new lb.a(i5.c.i(aVar.f58607e, "Unsupported image format: "), 3);
                    }
                } else {
                    bVar = new a7.b(null);
                }
            }
            q6.m.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.f58604a;
        q6.m.h(bitmap);
        bVar = new a7.b(bitmap);
        try {
            Parcel p12 = dbVar.p1();
            int i13 = a8.g0.f404a;
            p12.writeStrongBinder(bVar);
            p12.writeInt(1);
            int r10 = bc.r(p12, 20293);
            bc.q(p12, 1, 4);
            p12.writeInt(i7);
            bc.q(p12, 2, 4);
            p12.writeInt(i10);
            bc.q(p12, 3, 4);
            p12.writeInt(i11);
            bc.q(p12, 4, 4);
            p12.writeInt(a10);
            bc.q(p12, 5, 8);
            p12.writeLong(elapsedRealtime);
            bc.s(p12, r10);
            Parcel r12 = dbVar.r1(p12, 3);
            ArrayList createTypedArrayList = r12.createTypedArrayList(hb.CREATOR);
            r12.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = createTypedArrayList.get(i14);
                i14++;
                hb hbVar = (hb) obj;
                arrayList.add(new wb.a(hbVar.f484b, hbVar.d, hbVar.f483a, hbVar.f485c));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new lb.a("Failed to run thin image labeler.", e11);
        }
    }

    public String toString() {
        switch (this.f13831a) {
            case 1:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f13832b + ", prettyPrintIndent='" + ((String) this.d) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f13834e) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f13833c + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((pe.a) this.f13835f) + ')';
            default:
                return super.toString();
        }
    }

    @Override
    public void zzb() {
        IInterface aVar;
        Context context = (Context) this.d;
        if (((db) this.f13835f) != null) {
            return;
        }
        try {
            IBinder b10 = b7.f.c(context, b7.f.f2958b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i7 = fb.f402b;
            if (b10 == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                if (queryLocalInterface instanceof gb) {
                    aVar = (gb) queryLocalInterface;
                } else {
                    aVar = new a8.a(b10, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 0);
                }
            }
            this.f13835f = ((eb) aVar).x1(new a7.b(context), new ib(((xb.a) this.f13834e).f59697a, -1));
        } catch (RemoteException e10) {
            throw new lb.a("Failed to create thin image labeler.", e10);
        } catch (b7.b unused) {
            if (!this.f13833c) {
                pb.j.b(context);
                this.f13833c = true;
            }
            throw new lb.a("Waiting for the label optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override
    public void zzc() {
        db dbVar = (db) this.f13835f;
        if (dbVar != null) {
            try {
                dbVar.t1(dbVar.p1(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.f13835f = null;
            this.f13832b = false;
        }
    }

    public o0() {
        pe.a aVar = pe.a.f55611a;
        this.f13832b = true;
        this.d = "    ";
        this.f13834e = "type";
        this.f13833c = true;
        this.f13835f = aVar;
    }

    public o0(Context context, Looper looper, g0 g0Var) {
        this.d = new wf.b(context.getApplicationContext(), 24);
        this.f13834e = g0Var.a(looper, null);
        this.f13835f = g0Var.a(Looper.getMainLooper(), null);
    }
}
