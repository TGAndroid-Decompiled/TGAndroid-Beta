package bc;

import a8.df;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;
import o6.l;
import sb.j;
import y7.i1;
import y7.j2;
import y7.k3;
import y7.l0;
import y7.l4;
import y7.m6;
import y7.x;
public final class c implements b {
    public final Context f3838a;
    public final m6 f3839b;
    public final String f3840c;
    public boolean d;
    public l0 e;

    public c(Context context, ac.b bVar) {
        String str;
        this.f3838a = context;
        Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
        this.f3839b = new m6(1, -1, bVar.f52906a, 1);
        l6.e.f16931b.getClass();
        if (l6.e.a(context) >= 200400000) {
            str = "com.google.android.gms.vision.ica";
        } else {
            str = "com.google.android.gms.vision.dynamite";
        }
        this.f3840c = str;
    }

    @Override
    public final ArrayList a(xb.a aVar) {
        Bitmap createBitmap;
        if (this.e == null) {
            zzb();
        }
        if (this.e != null) {
            int i10 = aVar.e;
            if (i10 != -1) {
                if (i10 != 17) {
                    if (i10 != 35) {
                        if (i10 != 842094169) {
                            throw new ob.a("Unsupported image format", 13);
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
            Bitmap bitmap = aVar.f51765a;
            l.h(bitmap);
            int i11 = aVar.d;
            int i12 = aVar.f51766b;
            int i13 = aVar.f51767c;
            if (i11 == 0) {
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i12, i13);
            } else {
                Matrix matrix = new Matrix();
                matrix.postRotate(i11);
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i12, i13, matrix, true);
            }
            try {
                l0 l0Var = this.e;
                l.h(l0Var);
                y6.b bVar = new y6.b(createBitmap);
                Parcel N0 = l0Var.N0();
                int i14 = x.f52432a;
                N0.writeStrongBinder(bVar);
                N0.writeInt(1);
                int q5 = df.q(N0, 20293);
                df.s(N0, 2, 4);
                N0.writeInt(-1);
                df.r(N0, q5);
                Parcel P0 = l0Var.P0(N0, 1);
                l4[] l4VarArr = (l4[]) P0.createTypedArray(l4.CREATOR);
                P0.recycle();
                ArrayList arrayList = new ArrayList();
                for (l4 l4Var : l4VarArr) {
                    arrayList.add(new zb.a(l4Var.f52268c, l4Var.d, l4Var.f52267b, l4Var.f52266a));
                }
                return arrayList;
            } catch (RemoteException e) {
                throw new ob.a("Failed to run legacy image labeler.", e);
            }
        }
        throw new ob.a("Waiting for the image labeling module to be downloaded. Please wait.", 14);
    }

    @Override
    public final void zzb() {
        IInterface aVar;
        String str = this.f3840c;
        Context context = this.f3838a;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (this.e == null) {
            try {
                IBinder b10 = z6.e.c(context, z6.e.f52737b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
                int i10 = j2.f52243b;
                if (b10 == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                    if (queryLocalInterface instanceof k3) {
                        aVar = (k3) queryLocalInterface;
                    } else {
                        aVar = new a8.a(b10, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", 11);
                    }
                }
                l0 V0 = ((i1) aVar).V0(new y6.b(context), this.f3839b);
                this.e = V0;
                if (V0 == null && !this.d) {
                    Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                    j.b(context);
                    this.d = true;
                }
            } catch (RemoteException e) {
                throw new ob.a("Failed to create legacy image labeler.", e);
            } catch (z6.b e10) {
                if (!str.equals("com.google.android.gms.vision.dynamite")) {
                    if (!this.d) {
                        Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                        j.b(context);
                        this.d = true;
                        return;
                    }
                    return;
                }
                throw new ob.a("Failed to load deprecated vision dynamite module.", e10);
            }
        }
    }

    @Override
    public final void zzc() {
        l0 l0Var = this.e;
        if (l0Var != null) {
            try {
                l0Var.R0(l0Var.N0(), 2);
            } catch (RemoteException e) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e);
            }
            this.e = null;
        }
    }
}
