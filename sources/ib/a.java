package ib;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import g7.z6;
import h7.r8;
import i7.c0;
import i7.oa;
import i7.pa;
import i7.qa;
import i7.ra;
import i7.sa;
import i7.ta;
import java.util.ArrayList;
import y5.l;
import za.j;

public final class a implements b {

    public final Context f11093a;

    public final hb.b f11094b;

    public boolean f11095c;
    public boolean d;

    public oa f11096e;

    public a(Context context, hb.b bVar) {
        this.f11093a = context;
        this.f11094b = bVar;
    }

    @Override
    public final ArrayList a(eb.a aVar) throws va.a {
        i6.b bVar;
        if (this.f11096e == null) {
            zzb();
        }
        oa oaVar = this.f11096e;
        l.h(oaVar);
        if (!this.f11095c) {
            try {
                oaVar.Q0(oaVar.M0(), 1);
                this.f11095c = true;
            } catch (RemoteException e9) {
                throw new va.a("Failed to init thin image labeler.", e9);
            }
        }
        int i10 = aVar.f5366e;
        int i11 = aVar.f5364b;
        int i12 = aVar.f5365c;
        int iA = z6.a(aVar.d);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i13 = aVar.f5366e;
        if (i13 != -1) {
            if (i13 != 17) {
                if (i13 == 35) {
                    bVar = new i6.b(null);
                } else if (i13 != 842094169) {
                    throw new va.a(i0.a.k(aVar.f5366e, "Unsupported image format: "), 3);
                }
            }
            l.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.f5363a;
        l.h(bitmap);
        bVar = new i6.b(bitmap);
        try {
            Parcel parcelM0 = oaVar.M0();
            int i14 = c0.f10602a;
            parcelM0.writeStrongBinder(bVar);
            parcelM0.writeInt(1);
            int iQ = r8.q(parcelM0, 20293);
            r8.s(parcelM0, 1, 4);
            parcelM0.writeInt(i10);
            r8.s(parcelM0, 2, 4);
            parcelM0.writeInt(i11);
            r8.s(parcelM0, 3, 4);
            parcelM0.writeInt(i12);
            r8.s(parcelM0, 4, 4);
            parcelM0.writeInt(iA);
            r8.s(parcelM0, 5, 8);
            parcelM0.writeLong(jElapsedRealtime);
            r8.r(parcelM0, iQ);
            Parcel parcelO0 = oaVar.O0(parcelM0, 3);
            ArrayList arrayListCreateTypedArrayList = parcelO0.createTypedArrayList(sa.CREATOR);
            parcelO0.recycle();
            ArrayList arrayList = new ArrayList();
            int size = arrayListCreateTypedArrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayListCreateTypedArrayList.get(i15);
                i15++;
                sa saVar = (sa) obj;
                arrayList.add(new gb.a(saVar.f10826b, saVar.d, saVar.f10825a, saVar.f10827c));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new va.a("Failed to run thin image labeler.", e10);
        }
    }

    @Override
    public final void zzb() throws va.a {
        ra paVar;
        Context context = this.f11093a;
        if (this.f11096e != null) {
            return;
        }
        try {
            IBinder iBinderB = j6.e.c(context, j6.e.f12727b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i10 = qa.f10787b;
            if (iBinderB == null) {
                paVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                paVar = iInterfaceQueryLocalInterface instanceof ra ? (ra) iInterfaceQueryLocalInterface : new pa(iBinderB, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 5);
            }
            this.f11096e = ((pa) paVar).U0(new i6.b(context), new ta(this.f11094b.f6838a, -1));
        } catch (RemoteException e9) {
            throw new va.a("Failed to create thin image labeler.", e9);
        } catch (j6.b unused) {
            if (!this.d) {
                j.b(context);
                this.d = true;
            }
            throw new va.a("Waiting for the label optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override
    public final void zzc() {
        oa oaVar = this.f11096e;
        if (oaVar != null) {
            try {
                oaVar.Q0(oaVar.M0(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.f11096e = null;
            this.f11095c = false;
        }
    }
}
