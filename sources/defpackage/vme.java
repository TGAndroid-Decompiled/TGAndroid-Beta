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
public final class vme extends mg6 {
    public static final f84[] k = {uq7.c};
    public static final cff l = cff.c;
    public final Context d;
    public final fab e;
    public final sef f;
    public final aec g;
    public boolean h = true;
    public boolean i;
    public lff j;

    public vme(ae7 ae7Var, fab fabVar, sef sefVar, aec aecVar) {
        fre.i(ae7Var, "MlKitContext can not be null");
        fre.i(fabVar, "SubjectSegmenterOptions can not be null");
        this.d = ae7Var.b();
        this.e = fabVar;
        this.f = sefVar;
        this.g = aecVar;
    }

    @Override
    public final synchronized void b() {
        IInterface ezcVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        try {
            z = ((me7) Tasks.await(new by4(this.d, u84.p, vn.g, ay4.c).f(new d5f(k, (byte) 1)).addOnFailureListener(new Object()))).a;
        } catch (InterruptedException | ExecutionException e) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e);
        }
        if (!z) {
            if (!this.i) {
                uq7.b(this.d, k);
                this.i = true;
            }
            f(m5f.OPTIONAL_MODULE_NOT_AVAILABLE, elapsedRealtime);
            throw new be7("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
        }
        try {
            lff lffVar = this.j;
            if (lffVar == null) {
                IBinder b = ds3.c(this.d, ds3.b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                int i = off.a;
                if (b == null) {
                    ezcVar = null;
                } else {
                    IInterface queryLocalInterface = b.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                    if (queryLocalInterface instanceof pff) {
                        ezcVar = (pff) queryLocalInterface;
                    } else {
                        ezcVar = new ezc(b, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", (byte) 8);
                    }
                }
                bo7 bo7Var = new bo7(this.d);
                this.e.getClass();
                fab fabVar = this.e;
                lffVar = ((nff) ezcVar).Z(bo7Var, new vff(false, fabVar.a, fabVar.b, false, fabVar.c));
                this.j = lffVar;
            }
            try {
                lffVar.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(lffVar.c);
                lffVar.V(obtain, 1);
                f(m5f.NO_ERROR, elapsedRealtime);
            } catch (RemoteException e2) {
                f(m5f.OPTIONAL_MODULE_INIT_ERROR, elapsedRealtime);
                throw new be7("Failed to init module subject segmenter", e2);
            }
        } catch (Exception e3) {
            f(m5f.OPTIONAL_MODULE_CREATE_ERROR, elapsedRealtime);
            throw new be7("Failed to load subject segmentation module", e3);
        }
    }

    @Override
    public final synchronized void c() {
        try {
            lff lffVar = this.j;
            if (lffVar != null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(lffVar.c);
                lffVar.V(obtain, 2);
            }
            this.j = null;
        } catch (RemoteException unused) {
            Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            this.j = null;
        }
        this.h = true;
        sef sefVar = this.f;
        p5f p5fVar = p5f.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE;
        sefVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (sefVar.d(p5fVar, elapsedRealtime)) {
            sefVar.i.put(p5fVar, Long.valueOf(elapsedRealtime));
            ?? obj = new Object();
            obj.c = v4f.TYPE_THIN;
            yjb.c(1, new vc1(sefVar, new qx((ntb) obj, 0), p5fVar, sefVar.c(), (byte) 4));
        }
    }

    @Override
    public final Object e(go5 go5Var) {
        dab dabVar;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            lff lffVar = this.j;
            fre.h(lffVar);
            fff fffVar = new fff(-1, go5Var.b, go5Var.c, SystemClock.elapsedRealtime(), vrd.a(go5Var.d));
            Bitmap bitmap = go5Var.a;
            fre.h(bitmap);
            try {
                tff Z = lffVar.Z(new bo7(bitmap), fffVar);
                ArrayList arrayList = new ArrayList();
                if (this.e.b) {
                    ArrayList arrayList2 = Z.a;
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        rff rffVar = (rff) obj;
                        float[] fArr = rffVar.a;
                        if (fArr != null) {
                            FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                            allocate.put(fArr);
                            allocate.rewind();
                        }
                        arrayList.add(new cab(rffVar.b, rffVar.c, rffVar.d, rffVar.e, rffVar.f));
                    }
                }
                g(m5f.NO_ERROR, elapsedRealtime, this.h, go5Var, Z);
                this.h = false;
                float[] fArr2 = Z.b;
                if (fArr2 != null) {
                    FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                    allocate2.put(fArr2);
                    allocate2.rewind();
                }
                dabVar = new dab(arrayList);
            } catch (RemoteException e) {
                g(m5f.OPTIONAL_MODULE_INFERENCE_ERROR, elapsedRealtime, this.h, go5Var, null);
                throw new be7("Failed to run thin subject segmenter.", e);
            }
        }
        return dabVar;
    }

    public final void f(m5f m5fVar, long j) {
        this.f.b(new m20(this, j, m5fVar), p5f.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }

    public final void g(m5f m5fVar, long j, boolean z, go5 go5Var, tff tffVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f.b(new cfc(this, elapsedRealtime, m5fVar, z, go5Var, tffVar), p5f.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        rod rodVar = new rod((byte) 3);
        rodVar.d = this.e.a();
        rodVar.b = m5fVar;
        rodVar.c = Boolean.valueOf(z);
        isd isdVar = new isd(rodVar);
        p5f p5fVar = p5f.UNKNOWN_EVENT;
        yjb.c(1, new t3f(this.f, isdVar, elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - elapsedRealtime;
        aec aecVar = this.g;
        short s = m5fVar.a;
        synchronized (aecVar) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (((AtomicLong) aecVar.c).get() != -1 && elapsedRealtime2 - ((AtomicLong) aecVar.c).get() <= 1800000) {
                return;
            }
            ((u84) aecVar.b).i(new mgb(0, Arrays.asList(new sd7(24336, s, 0, j2, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new hg2(aecVar, elapsedRealtime2, (byte) 11));
        }
    }
}
