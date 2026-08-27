package ib;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import h7.r8;
import i7.c0;
import i7.o1;
import i7.p2;
import i7.q3;
import i7.r0;
import i7.r4;
import i7.s6;
import java.util.ArrayList;
import java.util.Locale;
import y5.l;
import za.j;

public final class c implements b {

    public final Context f11097a;

    public final s6 f11098b;

    public final String f11099c;
    public boolean d;

    public r0 f11100e;

    public c(Context context, hb.b bVar) {
        this.f11097a = context;
        Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
        this.f11098b = new s6(1, -1, bVar.f6838a, 1);
        v5.e.f48795b.getClass();
        this.f11099c = v5.e.a(context) >= 200400000 ? "com.google.android.gms.vision.ica" : "com.google.android.gms.vision.dynamite";
    }

    @Override
    public final ArrayList a(eb.a aVar) throws va.a {
        Bitmap bitmapCreateBitmap;
        if (this.f11100e == null) {
            zzb();
        }
        if (this.f11100e == null) {
            throw new va.a("Waiting for the image labeling module to be downloaded. Please wait.", 14);
        }
        int i10 = aVar.f5366e;
        if (i10 != -1) {
            if (i10 == 17) {
                l.h(null);
                throw null;
            }
            if (i10 == 35) {
                l.h(null);
                throw null;
            }
            if (i10 != 842094169) {
                throw new va.a("Unsupported image format", 13);
            }
            l.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.f5363a;
        l.h(bitmap);
        int i11 = aVar.d;
        int i12 = aVar.f5364b;
        int i13 = aVar.f5365c;
        if (i11 == 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, i12, i13);
        } else {
            Matrix matrix = new Matrix();
            matrix.postRotate(i11);
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, i12, i13, matrix, true);
        }
        try {
            r0 r0Var = this.f11100e;
            l.h(r0Var);
            i6.b bVar = new i6.b(bitmapCreateBitmap);
            Parcel parcelM0 = r0Var.M0();
            int i14 = c0.f10602a;
            parcelM0.writeStrongBinder(bVar);
            parcelM0.writeInt(1);
            int iQ = r8.q(parcelM0, 20293);
            r8.s(parcelM0, 2, 4);
            parcelM0.writeInt(-1);
            r8.r(parcelM0, iQ);
            Parcel parcelO0 = r0Var.O0(parcelM0, 1);
            r4[] r4VarArr = (r4[]) parcelO0.createTypedArray(r4.CREATOR);
            parcelO0.recycle();
            ArrayList arrayList = new ArrayList();
            for (r4 r4Var : r4VarArr) {
                arrayList.add(new gb.a(r4Var.f10795c, r4Var.d, r4Var.f10794b, r4Var.f10793a));
            }
            return arrayList;
        } catch (RemoteException e9) {
            throw new va.a("Failed to run legacy image labeler.", e9);
        }
    }

    @Override
    public final void zzb() throws va.a {
        q3 o1Var;
        String str = this.f11099c;
        Context context = this.f11097a;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (this.f11100e != null) {
            return;
        }
        try {
            IBinder iBinderB = j6.e.c(context, j6.e.f12727b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
            int i10 = p2.f10774b;
            if (iBinderB == null) {
                o1Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                o1Var = iInterfaceQueryLocalInterface instanceof q3 ? (q3) iInterfaceQueryLocalInterface : new o1(iBinderB, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", 5);
            }
            r0 r0VarU0 = ((o1) o1Var).U0(new i6.b(context), this.f11098b);
            this.f11100e = r0VarU0;
            if (r0VarU0 != null || this.d) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            j.b(context);
            this.d = true;
        } catch (RemoteException e9) {
            throw new va.a("Failed to create legacy image labeler.", e9);
        } catch (j6.b e10) {
            if (str.equals("com.google.android.gms.vision.dynamite")) {
                throw new va.a("Failed to load deprecated vision dynamite module.", e10);
            }
            if (this.d) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            j.b(context);
            this.d = true;
        }
    }

    @Override
    public final void zzc() {
        r0 r0Var = this.f11100e;
        if (r0Var != null) {
            try {
                r0Var.Q0(r0Var.M0(), 2);
            } catch (RemoteException e9) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e9);
            }
            this.f11100e = null;
        }
    }
}
