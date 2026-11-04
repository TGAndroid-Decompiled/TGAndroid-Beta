package g2;

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
import k2.p1;
import z7.ha;
import z7.ia;
import z7.ja;
import z7.ka;
import z7.la;
import z7.ma;
public final class q0 implements vb.a {
    public final int f11892a = 1;
    public boolean f11893b;
    public boolean f11894c;
    public final Object d;
    public final Object f11895e;
    public Object f11896f;

    public q0(Context context, ub.a aVar) {
        this.d = context;
        this.f11895e = aVar;
    }

    @Override
    public ArrayList a(rb.a aVar) {
        z6.b bVar;
        if (((ha) this.f11896f) == null) {
            zzb();
        }
        ha haVar = (ha) this.f11896f;
        p6.m.g(haVar);
        if (!this.f11893b) {
            try {
                haVar.T0(haVar.P0(), 1);
                this.f11893b = true;
            } catch (RemoteException e10) {
                throw new ib.a("Failed to init thin image labeler.", e10);
            }
        }
        int i3 = aVar.f54471e;
        int i10 = aVar.f54469b;
        int i11 = aVar.f54470c;
        int a10 = x7.s.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i12 = aVar.f54471e;
        if (i12 != -1) {
            if (i12 != 17) {
                if (i12 != 35) {
                    if (i12 != 842094169) {
                        throw new ib.a(p1.i(aVar.f54471e, "Unsupported image format: "), 3);
                    }
                } else {
                    bVar = new z6.b(null);
                }
            }
            p6.m.g(null);
            throw null;
        }
        Bitmap bitmap = aVar.f54468a;
        p6.m.g(bitmap);
        bVar = new z6.b(bitmap);
        try {
            Parcel P0 = haVar.P0();
            int i13 = z7.x.f60126a;
            P0.writeStrongBinder(bVar);
            P0.writeInt(1);
            int s6 = j8.a.s(P0, 20293);
            j8.a.r(P0, 1, 4);
            P0.writeInt(i3);
            j8.a.r(P0, 2, 4);
            P0.writeInt(i10);
            j8.a.r(P0, 3, 4);
            P0.writeInt(i11);
            j8.a.r(P0, 4, 4);
            P0.writeInt(a10);
            j8.a.r(P0, 5, 8);
            P0.writeLong(elapsedRealtime);
            j8.a.t(P0, s6);
            Parcel R0 = haVar.R0(P0, 3);
            ArrayList createTypedArrayList = R0.createTypedArrayList(la.CREATOR);
            R0.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = createTypedArrayList.get(i14);
                i14++;
                la laVar = (la) obj;
                arrayList.add(new tb.a(laVar.f59943b, laVar.d, laVar.f59942a, laVar.f59944c));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new ib.a("Failed to run thin image labeler.", e11);
        }
    }

    public void b(boolean z10, boolean z11) {
        j0 j0Var = (j0) this.f11895e;
        if (z10 && z11) {
            j0Var.d(new o0(this, z10, z11, 0));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        ((j0) this.f11896f).f11857a.postDelayed(new c(4, this, atomicBoolean), 1000L);
        j0Var.d(new p0(this, atomicBoolean, z10, z11, 0));
    }

    public void c(boolean z10) {
        if (this.f11894c != z10) {
            this.f11894c = z10;
            if (this.f11893b) {
                b(true, z10);
            }
        }
    }

    public String toString() {
        switch (this.f11892a) {
            case 1:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f11893b + ", prettyPrintIndent='" + ((String) this.d) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f11895e) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f11894c + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((me.a) this.f11896f) + ')';
            default:
                return super.toString();
        }
    }

    @Override
    public void zzb() {
        IInterface aVar;
        Context context = (Context) this.d;
        if (((ha) this.f11896f) != null) {
            return;
        }
        try {
            IBinder b10 = a7.f.c(context, a7.f.f141b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i3 = ja.f59922b;
            if (b10 == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                if (queryLocalInterface instanceof ka) {
                    aVar = (ka) queryLocalInterface;
                } else {
                    aVar = new b8.a(b10, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 11);
                }
            }
            this.f11896f = ((ia) aVar).X0(new z6.b(context), new ma(((ub.a) this.f11895e).f55080a, -1));
        } catch (a7.b unused) {
            if (!this.f11894c) {
                mb.j.b(context);
                this.f11894c = true;
            }
            throw new ib.a("Waiting for the label optional module to be downloaded. Please wait.", 14);
        } catch (RemoteException e10) {
            throw new ib.a("Failed to create thin image labeler.", e10);
        }
    }

    @Override
    public void zzc() {
        ha haVar = (ha) this.f11896f;
        if (haVar != null) {
            try {
                haVar.T0(haVar.P0(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.f11896f = null;
            this.f11893b = false;
        }
    }

    public q0() {
        me.a aVar = me.a.f19275a;
        this.f11893b = true;
        this.d = "    ";
        this.f11895e = "type";
        this.f11894c = true;
        this.f11896f = aVar;
    }

    public q0(Context context, Looper looper, h0 h0Var) {
        this.d = new p4.q(context.getApplicationContext());
        this.f11895e = h0Var.a(looper, null);
        this.f11896f = h0Var.a(Looper.getMainLooper(), null);
    }
}
