package hb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import f7.z6;
import g7.p8;
import h7.c0;
import h7.oa;
import h7.pa;
import h7.qa;
import h7.ra;
import h7.sa;
import h7.ta;
import j3.r0;
import java.util.ArrayList;
import x5.l;
import ya.j;
public final class a implements b {
    public final Context f10384a;
    public final gb.b f10385b;
    public boolean f10386c;
    public boolean d;
    public oa f10387e;

    public a(Context context, gb.b bVar) {
        this.f10384a = context;
        this.f10385b = bVar;
    }

    @Override
    public final ArrayList a(db.a aVar) {
        h6.b bVar;
        if (this.f10387e == null) {
            zzb();
        }
        oa oaVar = this.f10387e;
        l.h(oaVar);
        if (!this.f10386c) {
            try {
                oaVar.Q0(oaVar.M0(), 1);
                this.f10386c = true;
            } catch (RemoteException e10) {
                throw new ua.a("Failed to init thin image labeler.", e10);
            }
        }
        int i9 = aVar.f4469e;
        int i10 = aVar.f4467b;
        int i11 = aVar.f4468c;
        int a2 = z6.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i12 = aVar.f4469e;
        if (i12 != -1) {
            if (i12 != 17) {
                if (i12 != 35) {
                    if (i12 != 842094169) {
                        throw new ua.a(r0.l(aVar.f4469e, "Unsupported image format: "), 3);
                    }
                } else {
                    bVar = new h6.b(null);
                }
            }
            l.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.f4466a;
        l.h(bitmap);
        bVar = new h6.b(bitmap);
        try {
            Parcel M0 = oaVar.M0();
            int i13 = c0.f9893a;
            M0.writeStrongBinder(bVar);
            M0.writeInt(1);
            int q10 = p8.q(M0, 20293);
            p8.s(M0, 1, 4);
            M0.writeInt(i9);
            p8.s(M0, 2, 4);
            M0.writeInt(i10);
            p8.s(M0, 3, 4);
            M0.writeInt(i11);
            p8.s(M0, 4, 4);
            M0.writeInt(a2);
            p8.s(M0, 5, 8);
            M0.writeLong(elapsedRealtime);
            p8.r(M0, q10);
            Parcel O0 = oaVar.O0(M0, 3);
            ArrayList createTypedArrayList = O0.createTypedArrayList(sa.CREATOR);
            O0.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = createTypedArrayList.get(i14);
                i14++;
                sa saVar = (sa) obj;
                arrayList.add(new fb.a(saVar.f10117b, saVar.d, saVar.f10116a, saVar.f10118c));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new ua.a("Failed to run thin image labeler.", e11);
        }
    }

    @Override
    public final void zzb() {
        IInterface aVar;
        Context context = this.f10384a;
        if (this.f10387e != null) {
            return;
        }
        try {
            IBinder b10 = i6.e.c(context, i6.e.f10927b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i9 = qa.f10078b;
            if (b10 == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                if (queryLocalInterface instanceof ra) {
                    aVar = (ra) queryLocalInterface;
                } else {
                    aVar = new b7.a(b10, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 5);
                }
            }
            this.f10387e = ((pa) aVar).U0(new h6.b(context), new ta(this.f10385b.f6038a, -1));
        } catch (RemoteException e10) {
            throw new ua.a("Failed to create thin image labeler.", e10);
        } catch (i6.b unused) {
            if (!this.d) {
                j.b(context);
                this.d = true;
            }
            throw new ua.a("Waiting for the label optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override
    public final void zzc() {
        oa oaVar = this.f10387e;
        if (oaVar != null) {
            try {
                oaVar.Q0(oaVar.M0(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.f10387e = null;
            this.f10386c = false;
        }
    }
}
