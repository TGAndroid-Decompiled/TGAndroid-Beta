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
public final class mre extends qi6 {
    public static final a94[] k = {zt7.c};
    public static final sjf l = sjf.c;
    public final Context d;
    public final deb e;
    public final ijf f;
    public final zhc g;
    public boolean h = true;
    public boolean i;
    public bkf j;

    public mre(jg7 jg7Var, deb debVar, ijf ijfVar, zhc zhcVar) {
        xve.i(jg7Var, "MlKitContext can not be null");
        xve.i(debVar, "SubjectSegmenterOptions can not be null");
        this.d = jg7Var.b();
        this.e = debVar;
        this.f = ijfVar;
        this.g = zhcVar;
    }

    @Override
    public final synchronized void b() {
        IInterface v3dVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        try {
            z = ((vg7) Tasks.await(new h05(this.d, qa4.p, wn.g, g05.c).f(new u9f(k, (byte) 1)).addOnFailureListener(new Object()))).a;
        } catch (InterruptedException | ExecutionException e) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e);
        }
        if (!z) {
            if (!this.i) {
                zt7.b(this.d, k);
                this.i = true;
            }
            f(daf.OPTIONAL_MODULE_NOT_AVAILABLE, elapsedRealtime);
            throw new kg7("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
        }
        try {
            bkf bkfVar = this.j;
            if (bkfVar == null) {
                IBinder b = vs3.c(this.d, vs3.b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                int i = ekf.a;
                if (b == null) {
                    v3dVar = null;
                } else {
                    IInterface queryLocalInterface = b.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                    if (queryLocalInterface instanceof fkf) {
                        v3dVar = (fkf) queryLocalInterface;
                    } else {
                        v3dVar = new v3d(b, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", (byte) 8);
                    }
                }
                br7 br7Var = new br7(this.d);
                this.e.getClass();
                deb debVar = this.e;
                bkfVar = ((dkf) v3dVar).Z(br7Var, new lkf(false, debVar.a, debVar.b, false, debVar.c));
                this.j = bkfVar;
            }
            try {
                bkfVar.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(bkfVar.c);
                bkfVar.V(obtain, 1);
                f(daf.NO_ERROR, elapsedRealtime);
            } catch (RemoteException e2) {
                f(daf.OPTIONAL_MODULE_INIT_ERROR, elapsedRealtime);
                throw new kg7("Failed to init module subject segmenter", e2);
            }
        } catch (Exception e3) {
            f(daf.OPTIONAL_MODULE_CREATE_ERROR, elapsedRealtime);
            throw new kg7("Failed to load subject segmentation module", e3);
        }
    }

    @Override
    public final synchronized void c() {
        try {
            bkf bkfVar = this.j;
            if (bkfVar != null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(bkfVar.c);
                bkfVar.V(obtain, 2);
            }
            this.j = null;
        } catch (RemoteException unused) {
            Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            this.j = null;
        }
        this.h = true;
        ijf ijfVar = this.f;
        gaf gafVar = gaf.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE;
        ijfVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (ijfVar.d(gafVar, elapsedRealtime)) {
            ijfVar.i.put(gafVar, Long.valueOf(elapsedRealtime));
            ?? obj = new Object();
            obj.c = m9f.TYPE_THIN;
            xnb.c(1, new dd1(ijfVar, new rx((oxb) obj, 0), gafVar, ijfVar.c(), (byte) 4));
        }
    }

    @Override
    public final Object e(jq5 jq5Var) {
        beb bebVar;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bkf bkfVar = this.j;
            xve.h(bkfVar);
            vjf vjfVar = new vjf(-1, jq5Var.b, jq5Var.c, SystemClock.elapsedRealtime(), lwd.a(jq5Var.d));
            Bitmap bitmap = jq5Var.a;
            xve.h(bitmap);
            try {
                jkf Z = bkfVar.Z(new br7(bitmap), vjfVar);
                ArrayList arrayList = new ArrayList();
                if (this.e.b) {
                    ArrayList arrayList2 = Z.a;
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        hkf hkfVar = (hkf) obj;
                        float[] fArr = hkfVar.a;
                        if (fArr != null) {
                            FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                            allocate.put(fArr);
                            allocate.rewind();
                        }
                        arrayList.add(new aeb(hkfVar.b, hkfVar.c, hkfVar.d, hkfVar.e, hkfVar.f));
                    }
                }
                g(daf.NO_ERROR, elapsedRealtime, this.h, jq5Var, Z);
                this.h = false;
                float[] fArr2 = Z.b;
                if (fArr2 != null) {
                    FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                    allocate2.put(fArr2);
                    allocate2.rewind();
                }
                bebVar = new beb(arrayList);
            } catch (RemoteException e) {
                g(daf.OPTIONAL_MODULE_INFERENCE_ERROR, elapsedRealtime, this.h, jq5Var, null);
                throw new kg7("Failed to run thin subject segmenter.", e);
            }
        }
        return bebVar;
    }

    public final void f(daf dafVar, long j) {
        this.f.b(new n20(j, this, dafVar), gaf.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }

    public final void g(daf dafVar, long j, boolean z, jq5 jq5Var, jkf jkfVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f.b(new bjc(this, elapsedRealtime, dafVar, z, jq5Var, jkfVar), gaf.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        htd htdVar = new htd((byte) 3);
        htdVar.d = this.e.a();
        htdVar.b = dafVar;
        htdVar.c = Boolean.valueOf(z);
        ywd ywdVar = new ywd(htdVar);
        gaf gafVar = gaf.UNKNOWN_EVENT;
        xnb.c(1, new k8f(this.f, ywdVar, elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - elapsedRealtime;
        zhc zhcVar = this.g;
        short s = dafVar.a;
        synchronized (zhcVar) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (((AtomicLong) zhcVar.c).get() != -1 && elapsedRealtime2 - ((AtomicLong) zhcVar.c).get() <= 1800000) {
                return;
            }
            ((qa4) zhcVar.b).i(new ikb(0, Arrays.asList(new bg7(24336, s, 0, j2, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new zg2(zhcVar, elapsedRealtime2, (byte) 12));
        }
    }
}
