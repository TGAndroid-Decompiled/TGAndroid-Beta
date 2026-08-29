package jb;

import ab.k;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.cast.o;
import j7.c0;
import j7.p1;
import j7.q2;
import j7.r0;
import j7.r3;
import j7.s4;
import j7.t6;
import java.util.ArrayList;
import java.util.Locale;
import z5.l;
public final class c implements b {
    public final Context f11423a;
    public final t6 f11424b;
    public final String f11425c;
    public boolean d;
    public r0 f11426e;

    public c(Context context, ib.b bVar) {
        String str;
        this.f11423a = context;
        Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
        this.f11424b = new t6(1, -1, bVar.f7985a, 1);
        w5.e.f49769b.getClass();
        if (w5.e.a(context) >= 200400000) {
            str = "com.google.android.gms.vision.ica";
        } else {
            str = "com.google.android.gms.vision.dynamite";
        }
        this.f11425c = str;
    }

    @Override
    public final ArrayList a(fb.a aVar) {
        Bitmap createBitmap;
        if (this.f11426e == null) {
            zzb();
        }
        if (this.f11426e != null) {
            int i10 = aVar.f6702e;
            if (i10 != -1) {
                if (i10 != 17) {
                    if (i10 != 35) {
                        if (i10 != 842094169) {
                            throw new wa.a("Unsupported image format", 13);
                        }
                        l.h(null);
                        throw null;
                    }
                    l.h(null);
                    throw null;
                }
                l.h(null);
                throw null;
            }
            Bitmap bitmap = aVar.f6699a;
            l.h(bitmap);
            int i11 = aVar.d;
            int i12 = aVar.f6700b;
            int i13 = aVar.f6701c;
            if (i11 == 0) {
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i12, i13);
            } else {
                Matrix matrix = new Matrix();
                matrix.postRotate(i11);
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i12, i13, matrix, true);
            }
            try {
                r0 r0Var = this.f11426e;
                l.h(r0Var);
                j6.b bVar = new j6.b(createBitmap);
                Parcel M0 = r0Var.M0();
                int i14 = c0.f10975a;
                M0.writeStrongBinder(bVar);
                M0.writeInt(1);
                int q6 = o.q(M0, 20293);
                o.s(M0, 2, 4);
                M0.writeInt(-1);
                o.r(M0, q6);
                Parcel O0 = r0Var.O0(M0, 1);
                s4[] s4VarArr = (s4[]) O0.createTypedArray(s4.CREATOR);
                O0.recycle();
                ArrayList arrayList = new ArrayList();
                for (s4 s4Var : s4VarArr) {
                    arrayList.add(new hb.a(s4Var.f11174c, s4Var.d, s4Var.f11173b, s4Var.f11172a));
                }
                return arrayList;
            } catch (RemoteException e10) {
                throw new wa.a("Failed to run legacy image labeler.", e10);
            }
        }
        throw new wa.a("Waiting for the image labeling module to be downloaded. Please wait.", 14);
    }

    @Override
    public final void zzb() {
        IInterface aVar;
        String str = this.f11425c;
        Context context = this.f11423a;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (this.f11426e == null) {
            try {
                IBinder b10 = k6.e.c(context, k6.e.f13450b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
                int i10 = q2.f11154b;
                if (b10 == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                    if (queryLocalInterface instanceof r3) {
                        aVar = (r3) queryLocalInterface;
                    } else {
                        aVar = new com.google.android.gms.internal.cast.a(b10, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", 5);
                    }
                }
                r0 U0 = ((p1) aVar).U0(new j6.b(context), this.f11424b);
                this.f11426e = U0;
                if (U0 == null && !this.d) {
                    Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                    k.b(context);
                    this.d = true;
                }
            } catch (RemoteException e10) {
                throw new wa.a("Failed to create legacy image labeler.", e10);
            } catch (k6.b e11) {
                if (!str.equals("com.google.android.gms.vision.dynamite")) {
                    if (!this.d) {
                        Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                        k.b(context);
                        this.d = true;
                        return;
                    }
                    return;
                }
                throw new wa.a("Failed to load deprecated vision dynamite module.", e11);
            }
        }
    }

    @Override
    public final void zzc() {
        r0 r0Var = this.f11426e;
        if (r0Var != null) {
            try {
                r0Var.Q0(r0Var.M0(), 2);
            } catch (RemoteException e10) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e10);
            }
            this.f11426e = null;
        }
    }
}
