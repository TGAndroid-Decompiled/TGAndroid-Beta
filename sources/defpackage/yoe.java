package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
public final class yoe extends mi6 {
    public static final o94[] k = {ws7.c};
    public static final dhf l = dhf.c;
    public final Context d;
    public final hcb e;
    public final tgf f;
    public final rhb g;
    public boolean h = true;
    public boolean i;
    public mhf j;

    public yoe(cg7 cg7Var, hcb hcbVar, tgf tgfVar, rhb rhbVar) {
        ite.i(cg7Var, "MlKitContext can not be null");
        ite.i(hcbVar, "SubjectSegmenterOptions can not be null");
        this.d = cg7Var.b();
        this.e = hcbVar;
        this.f = tgfVar;
        this.g = rhbVar;
    }

    @Override
    public final synchronized void b() {
        IInterface f1dVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        try {
            z = ((og7) Tasks.await(new c05(this.d, ua4.p, wo.g, b05.c).f(new f7f(k, (byte) 1)).addOnFailureListener(new Object()))).a;
        } catch (InterruptedException | ExecutionException e) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e);
        }
        if (!z) {
            if (!this.i) {
                ws7.b(this.d, k);
                this.i = true;
            }
            f(o7f.OPTIONAL_MODULE_NOT_AVAILABLE, elapsedRealtime);
            throw new dg7("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
        }
        try {
            mhf mhfVar = this.j;
            if (mhfVar == null) {
                IBinder b = nt3.c(this.d, nt3.b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                int i = phf.a;
                if (b == null) {
                    f1dVar = null;
                } else {
                    IInterface queryLocalInterface = b.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                    if (queryLocalInterface instanceof qhf) {
                        f1dVar = (qhf) queryLocalInterface;
                    } else {
                        f1dVar = new f1d(b, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", (byte) 8);
                    }
                }
                eq7 eq7Var = new eq7(this.d);
                this.e.getClass();
                hcb hcbVar = this.e;
                mhfVar = ((ohf) f1dVar).Z(eq7Var, new whf(false, hcbVar.a, hcbVar.b, false, hcbVar.c));
                this.j = mhfVar;
            }
            try {
                mhfVar.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(mhfVar.c);
                mhfVar.V(obtain, 1);
                f(o7f.NO_ERROR, elapsedRealtime);
            } catch (RemoteException e2) {
                f(o7f.OPTIONAL_MODULE_INIT_ERROR, elapsedRealtime);
                throw new dg7("Failed to init module subject segmenter", e2);
            }
        } catch (Exception e3) {
            f(o7f.OPTIONAL_MODULE_CREATE_ERROR, elapsedRealtime);
            throw new dg7("Failed to load subject segmentation module", e3);
        }
    }

    @Override
    public final synchronized void c() {
        try {
            mhf mhfVar = this.j;
            if (mhfVar != null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(mhfVar.c);
                mhfVar.V(obtain, 2);
            }
            this.j = null;
        } catch (RemoteException unused) {
            Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            this.j = null;
        }
        this.h = true;
        tgf tgfVar = this.f;
        r7f r7fVar = r7f.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE;
        tgfVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (tgfVar.d(r7fVar, elapsedRealtime)) {
            tgfVar.i.put(r7fVar, Long.valueOf(elapsedRealtime));
            ?? obj = new Object();
            obj.c = x6f.TYPE_THIN;
            mlb.c(1, new de1(tgfVar, new ry((ovb) obj, 0), r7fVar, tgfVar.c(), (byte) 4));
        }
    }

    @Override
    public final Object e(gq5 gq5Var) {
        fcb fcbVar;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            mhf mhfVar = this.j;
            ite.h(mhfVar);
            ghf ghfVar = new ghf(-1, gq5Var.b, gq5Var.c, SystemClock.elapsedRealtime(), ytd.a(gq5Var.d));
            Bitmap bitmap = gq5Var.a;
            ite.h(bitmap);
            try {
                uhf Z = mhfVar.Z(new eq7(bitmap), ghfVar);
                ArrayList arrayList = new ArrayList();
                if (this.e.b) {
                    ArrayList arrayList2 = Z.a;
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        shf shfVar = (shf) obj;
                        float[] fArr = shfVar.a;
                        if (fArr != null) {
                            FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                            allocate.put(fArr);
                            allocate.rewind();
                        }
                        arrayList.add(new ecb(shfVar.b, shfVar.c, shfVar.d, shfVar.e, shfVar.f));
                    }
                }
                g(o7f.NO_ERROR, elapsedRealtime, this.h, gq5Var, Z);
                this.h = false;
                float[] fArr2 = Z.b;
                if (fArr2 != null) {
                    FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                    allocate2.put(fArr2);
                    allocate2.rewind();
                }
                fcbVar = new fcb(arrayList);
            } catch (RemoteException e) {
                g(o7f.OPTIONAL_MODULE_INFERENCE_ERROR, elapsedRealtime, this.h, gq5Var, null);
                throw new dg7("Failed to run thin subject segmenter.", e);
            }
        }
        return fcbVar;
    }

    public final void f(o7f o7fVar, long j) {
        this.f.b(new m30(this, j, o7fVar), r7f.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }

    public final void g(o7f o7fVar, long j, boolean z, gq5 gq5Var, uhf uhfVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f.b(new chc(this, elapsedRealtime, o7fVar, z, gq5Var, uhfVar), r7f.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        uqd uqdVar = new uqd((byte) 3);
        uqdVar.d = this.e.a();
        uqdVar.b = o7fVar;
        uqdVar.c = Boolean.valueOf(z);
        lud ludVar = new lud(uqdVar);
        r7f r7fVar = r7f.UNKNOWN_EVENT;
        mlb.c(1, new v5f(this.f, ludVar, elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - elapsedRealtime;
        rhb rhbVar = this.g;
        short s = o7fVar.a;
        synchronized (rhbVar) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (((AtomicLong) rhbVar.c).get() != -1 && elapsedRealtime2 - ((AtomicLong) rhbVar.c).get() <= 1800000) {
                return;
            }
            ((ua4) rhbVar.b).i(new nib(0, Arrays.asList(new uf7(24336, s, 0, j2, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new vh2(rhbVar, elapsedRealtime2, (byte) 12));
        }
    }
}
