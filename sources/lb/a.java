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
import j7.f8;
import j7.g5;
import java.util.ArrayList;
import l7.c0;
import l7.pa;
import l7.qa;
import l7.ra;
import l7.sa;
import l7.ta;
import l7.ua;
public final class a implements b {
    public final Context f12255a;
    public final kb.b f12256b;
    public boolean f12257c;
    public boolean d;
    public pa f12258e;

    public a(Context context, kb.b bVar) {
        this.f12255a = context;
        this.f12256b = bVar;
    }

    @Override
    public final ArrayList a(hb.a aVar) {
        l6.b bVar;
        if (this.f12258e == null) {
            zzb();
        }
        pa paVar = this.f12258e;
        m.h(paVar);
        if (!this.f12257c) {
            try {
                paVar.Q0(paVar.M0(), 1);
                this.f12257c = true;
            } catch (RemoteException e6) {
                throw new ya.a("Failed to init thin image labeler.", e6);
            }
        }
        int i10 = aVar.f7369e;
        int i11 = aVar.f7367b;
        int i12 = aVar.f7368c;
        int a2 = f8.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i13 = aVar.f7369e;
        if (i13 != -1) {
            if (i13 != 17) {
                if (i13 != 35) {
                    if (i13 != 842094169) {
                        throw new ya.a(l.d.j(aVar.f7369e, "Unsupported image format: "), 3);
                    }
                } else {
                    bVar = new l6.b(null);
                }
            }
            m.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.f7366a;
        m.h(bitmap);
        bVar = new l6.b(bitmap);
        try {
            Parcel M0 = paVar.M0();
            int i14 = c0.f11816a;
            M0.writeStrongBinder(bVar);
            M0.writeInt(1);
            int q10 = g5.q(M0, 20293);
            g5.s(M0, 1, 4);
            M0.writeInt(i10);
            g5.s(M0, 2, 4);
            M0.writeInt(i11);
            g5.s(M0, 3, 4);
            M0.writeInt(i12);
            g5.s(M0, 4, 4);
            M0.writeInt(a2);
            g5.s(M0, 5, 8);
            M0.writeLong(elapsedRealtime);
            g5.r(M0, q10);
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
                arrayList.add(new jb.a(taVar.f12046b, taVar.d, taVar.f12045a, taVar.f12047c));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new ya.a("Failed to run thin image labeler.", e10);
        }
    }

    @Override
    public final void zzb() {
        IInterface aVar;
        Context context = this.f12255a;
        if (this.f12258e != null) {
            return;
        }
        try {
            IBinder b10 = m6.e.c(context, m6.e.f13468b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i10 = ra.f12008b;
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
            this.f12258e = ((qa) aVar).U0(new l6.b(context), new ua(this.f12256b.f9992a, -1));
        } catch (RemoteException e6) {
            throw new ya.a("Failed to create thin image labeler.", e6);
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
        pa paVar = this.f12258e;
        if (paVar != null) {
            try {
                paVar.Q0(paVar.M0(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.f12258e = null;
            this.f12257c = false;
        }
    }
}
