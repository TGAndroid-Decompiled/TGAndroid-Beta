package lb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import b6.m;
import cb.k;
import j7.f5;
import j7.f8;
import java.util.ArrayList;
import kf.k0;
import l7.c0;
import l7.pa;
import l7.qa;
import l7.ra;
import l7.sa;
import l7.ta;
import l7.ua;
public final class a implements b {
    public final Context f11947a;
    public final kb.b f11948b;
    public boolean f11949c;
    public boolean d;
    public pa e;

    public a(Context context, kb.b bVar) {
        this.f11947a = context;
        this.f11948b = bVar;
    }

    @Override
    public final ArrayList a(hb.a aVar) {
        l6.b bVar;
        if (this.e == null) {
            zzb();
        }
        pa paVar = this.e;
        m.h(paVar);
        if (!this.f11949c) {
            try {
                paVar.Q0(paVar.M0(), 1);
                this.f11949c = true;
            } catch (RemoteException e) {
                throw new ya.a("Failed to init thin image labeler.", e);
            }
        }
        int i10 = aVar.e;
        int i11 = aVar.f7039b;
        int i12 = aVar.f7040c;
        int a2 = f8.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i13 = aVar.e;
        if (i13 != -1) {
            if (i13 != 17) {
                if (i13 != 35) {
                    if (i13 != 842094169) {
                        throw new ya.a(k0.j(aVar.e, "Unsupported image format: "), 3);
                    }
                } else {
                    bVar = new l6.b(null);
                }
            }
            m.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.f7038a;
        m.h(bitmap);
        bVar = new l6.b(bitmap);
        try {
            Parcel M0 = paVar.M0();
            int i14 = c0.f11544a;
            M0.writeStrongBinder(bVar);
            M0.writeInt(1);
            int q10 = f5.q(M0, 20293);
            f5.s(M0, 1, 4);
            M0.writeInt(i10);
            f5.s(M0, 2, 4);
            M0.writeInt(i11);
            f5.s(M0, 3, 4);
            M0.writeInt(i12);
            f5.s(M0, 4, 4);
            M0.writeInt(a2);
            f5.s(M0, 5, 8);
            M0.writeLong(elapsedRealtime);
            f5.r(M0, q10);
            Parcel O0 = paVar.O0(M0, 3);
            ArrayList createTypedArrayList = O0.createTypedArrayList(ta.CREATOR);
            O0.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = createTypedArrayList.get(i15);
                i15++;
                ta taVar = (ta) obj;
                arrayList.add(new jb.a(taVar.f11756b, taVar.d, taVar.f11755a, taVar.f11757c));
            }
            return arrayList;
        } catch (RemoteException e6) {
            throw new ya.a("Failed to run thin image labeler.", e6);
        }
    }

    @Override
    public final void zzb() {
        IInterface aVar;
        Context context = this.f11947a;
        if (this.e != null) {
            return;
        }
        try {
            IBinder b10 = m6.e.c(context, m6.e.f13739b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i10 = ra.f11721b;
            if (b10 == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                if (queryLocalInterface instanceof sa) {
                    aVar = (sa) queryLocalInterface;
                } else {
                    aVar = new a7.a(b10, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 6);
                }
            }
            this.e = ((qa) aVar).U0(new l6.b(context), new ua(this.f11948b.f9340a, -1));
        } catch (RemoteException e) {
            throw new ya.a("Failed to create thin image labeler.", e);
        } catch (m6.b unused) {
            if (!this.d) {
                k.b(context);
                this.d = true;
            }
            throw new ya.a("Waiting for the label optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override
    public final void zzc() {
        pa paVar = this.e;
        if (paVar != null) {
            try {
                paVar.Q0(paVar.M0(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.e = null;
            this.f11949c = false;
        }
    }
}
