package hb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import g7.p8;
import h7.c0;
import h7.o1;
import h7.p2;
import h7.q3;
import h7.r0;
import h7.r4;
import h7.s6;
import java.util.ArrayList;
import java.util.Locale;
import x5.l;
import ya.j;
public final class c implements b {
    public final Context f10388a;
    public final s6 f10389b;
    public final String f10390c;
    public boolean d;
    public r0 f10391e;

    public c(Context context, gb.b bVar) {
        String str;
        this.f10388a = context;
        Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
        this.f10389b = new s6(1, -1, bVar.f6038a, 1);
        u5.e.f48110b.getClass();
        if (u5.e.a(context) >= 200400000) {
            str = "com.google.android.gms.vision.ica";
        } else {
            str = "com.google.android.gms.vision.dynamite";
        }
        this.f10390c = str;
    }

    @Override
    public final ArrayList a(db.a aVar) {
        Bitmap createBitmap;
        if (this.f10391e == null) {
            zzb();
        }
        if (this.f10391e != null) {
            int i9 = aVar.f4469e;
            if (i9 != -1) {
                if (i9 != 17) {
                    if (i9 != 35) {
                        if (i9 != 842094169) {
                            throw new ua.a("Unsupported image format", 13);
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
            Bitmap bitmap = aVar.f4466a;
            l.h(bitmap);
            int i10 = aVar.d;
            int i11 = aVar.f4467b;
            int i12 = aVar.f4468c;
            if (i10 == 0) {
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i11, i12);
            } else {
                Matrix matrix = new Matrix();
                matrix.postRotate(i10);
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i11, i12, matrix, true);
            }
            try {
                r0 r0Var = this.f10391e;
                l.h(r0Var);
                h6.b bVar = new h6.b(createBitmap);
                Parcel M0 = r0Var.M0();
                int i13 = c0.f9893a;
                M0.writeStrongBinder(bVar);
                M0.writeInt(1);
                int q10 = p8.q(M0, 20293);
                p8.s(M0, 2, 4);
                M0.writeInt(-1);
                p8.r(M0, q10);
                Parcel O0 = r0Var.O0(M0, 1);
                r4[] r4VarArr = (r4[]) O0.createTypedArray(r4.CREATOR);
                O0.recycle();
                ArrayList arrayList = new ArrayList();
                for (r4 r4Var : r4VarArr) {
                    arrayList.add(new fb.a(r4Var.f10086c, r4Var.d, r4Var.f10085b, r4Var.f10084a));
                }
                return arrayList;
            } catch (RemoteException e10) {
                throw new ua.a("Failed to run legacy image labeler.", e10);
            }
        }
        throw new ua.a("Waiting for the image labeling module to be downloaded. Please wait.", 14);
    }

    @Override
    public final void zzb() {
        IInterface aVar;
        String str = this.f10390c;
        Context context = this.f10388a;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (this.f10391e == null) {
            try {
                IBinder b10 = i6.e.c(context, i6.e.f10927b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
                int i9 = p2.f10065b;
                if (b10 == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                    if (queryLocalInterface instanceof q3) {
                        aVar = (q3) queryLocalInterface;
                    } else {
                        aVar = new b7.a(b10, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", 5);
                    }
                }
                r0 U0 = ((o1) aVar).U0(new h6.b(context), this.f10389b);
                this.f10391e = U0;
                if (U0 == null && !this.d) {
                    Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                    j.b(context);
                    this.d = true;
                }
            } catch (RemoteException e10) {
                throw new ua.a("Failed to create legacy image labeler.", e10);
            } catch (i6.b e11) {
                if (!str.equals("com.google.android.gms.vision.dynamite")) {
                    if (!this.d) {
                        Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                        j.b(context);
                        this.d = true;
                        return;
                    }
                    return;
                }
                throw new ua.a("Failed to load deprecated vision dynamite module.", e11);
            }
        }
    }

    @Override
    public final void zzc() {
        r0 r0Var = this.f10391e;
        if (r0Var != null) {
            try {
                r0Var.Q0(r0Var.M0(), 2);
            } catch (RemoteException e10) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e10);
            }
            this.f10391e = null;
        }
    }
}
