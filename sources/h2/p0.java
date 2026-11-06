package h2;

import a8.cb;
import a8.db;
import a8.eb;
import a8.fb;
import a8.gb;
import a8.hb;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import c8.wb;
import c8.wc;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
public final class p0 implements yb.a {
    public final int f14131a = 1;
    public boolean f14132b;
    public boolean f14133c;
    public final Object d;
    public final Object f14134e;
    public Object f14135f;

    public p0(Context context, xb.a aVar) {
        this.d = context;
        this.f14134e = aVar;
    }

    @Override
    public ArrayList a(ub.a aVar) {
        a7.b bVar;
        if (((cb) this.f14135f) == null) {
            zzb();
        }
        cb cbVar = (cb) this.f14135f;
        q6.m.g(cbVar);
        if (!this.f14132b) {
            try {
                cbVar.T0(cbVar.P0(), 1);
                this.f14132b = true;
            } catch (RemoteException e10) {
                throw new lb.a("Failed to init thin image labeler.", e10);
            }
        }
        int i7 = aVar.f56401e;
        int i10 = aVar.f56399b;
        int i11 = aVar.f56400c;
        int a10 = wc.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i12 = aVar.f56401e;
        if (i12 != -1) {
            if (i12 != 17) {
                if (i12 != 35) {
                    if (i12 != 842094169) {
                        throw new lb.a(jg.g.j(aVar.f56401e, "Unsupported image format: "), 3);
                    }
                } else {
                    bVar = new a7.b(null);
                }
            }
            q6.m.g(null);
            throw null;
        }
        Bitmap bitmap = aVar.f56398a;
        q6.m.g(bitmap);
        bVar = new a7.b(bitmap);
        try {
            Parcel P0 = cbVar.P0();
            int i13 = a8.g0.f404a;
            P0.writeStrongBinder(bVar);
            P0.writeInt(1);
            int r10 = wb.r(P0, 20293);
            wb.q(P0, 1, 4);
            P0.writeInt(i7);
            wb.q(P0, 2, 4);
            P0.writeInt(i10);
            wb.q(P0, 3, 4);
            P0.writeInt(i11);
            wb.q(P0, 4, 4);
            P0.writeInt(a10);
            wb.q(P0, 5, 8);
            P0.writeLong(elapsedRealtime);
            wb.s(P0, r10);
            Parcel R0 = cbVar.R0(P0, 3);
            ArrayList createTypedArrayList = R0.createTypedArrayList(gb.CREATOR);
            R0.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = createTypedArrayList.get(i14);
                i14++;
                gb gbVar = (gb) obj;
                arrayList.add(new wb.a(gbVar.f457b, gbVar.d, gbVar.f456a, gbVar.f458c));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new lb.a("Failed to run thin image labeler.", e11);
        }
    }

    public void b(boolean z9, boolean z10) {
        i0 i0Var = (i0) this.f14134e;
        if (z9 && z10) {
            i0Var.d(new n0(this, z9, z10, 0));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        ((i0) this.f14135f).f14096a.postDelayed(new f2.h(28, this, atomicBoolean), 1000L);
        i0Var.d(new o0(this, atomicBoolean, z9, z10, 0));
    }

    public void c(boolean z9) {
        if (this.f14133c != z9) {
            this.f14133c = z9;
            if (this.f14132b) {
                b(true, z9);
            }
        }
    }

    public String toString() {
        switch (this.f14131a) {
            case 1:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f14132b + ", prettyPrintIndent='" + ((String) this.d) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f14134e) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f14133c + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((pe.a) this.f14135f) + ')';
            default:
                return super.toString();
        }
    }

    @Override
    public void zzb() {
        IInterface aVar;
        Context context = (Context) this.d;
        if (((cb) this.f14135f) != null) {
            return;
        }
        try {
            IBinder b10 = b7.f.c(context, b7.f.f2994b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i7 = eb.f385b;
            if (b10 == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                if (queryLocalInterface instanceof fb) {
                    aVar = (fb) queryLocalInterface;
                } else {
                    aVar = new a8.a(b10, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 0);
                }
            }
            this.f14135f = ((db) aVar).X0(new a7.b(context), new hb(((xb.a) this.f14134e).f57549a, -1));
        } catch (RemoteException e10) {
            throw new lb.a("Failed to create thin image labeler.", e10);
        } catch (b7.b unused) {
            if (!this.f14133c) {
                pb.j.b(context);
                this.f14133c = true;
            }
            throw new lb.a("Waiting for the label optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override
    public void zzc() {
        cb cbVar = (cb) this.f14135f;
        if (cbVar != null) {
            try {
                cbVar.T0(cbVar.P0(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.f14135f = null;
            this.f14132b = false;
        }
    }

    public p0() {
        pe.a aVar = pe.a.f53483a;
        this.f14132b = true;
        this.d = "    ";
        this.f14134e = "type";
        this.f14133c = true;
        this.f14135f = aVar;
    }

    public p0(Context context, Looper looper, g0 g0Var) {
        this.d = new wf.b(context.getApplicationContext(), 21);
        this.f14134e = g0Var.a(looper, null);
        this.f14135f = g0Var.a(Looper.getMainLooper(), null);
    }
}
