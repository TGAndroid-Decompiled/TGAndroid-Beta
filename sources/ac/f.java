package ac;

import a8.qa;
import a8.ra;
import a8.va;
import a8.wa;
import a8.xa;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.a0;
import android.util.Log;
import c8.bg;
import c8.cg;
import c8.db;
import c8.dg;
import c8.eb;
import c8.eg;
import c8.fb;
import c8.fg;
import c8.gg;
import c8.h1;
import c8.hg;
import c8.uf;
import c8.xc;
import c8.yf;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import pb.g;
import pb.j;
import pb.n;
import q6.k;
import q6.m;
import q6.p;
public final class f extends pb.e {
    public static final n6.c[] f1024k = {j.f54956c};
    public static final vb.a f1025l = vb.a.f58788a;
    public final Context d;
    public final zb.d f1026e;
    public final uf f1027f;
    public final wa f1028g;
    public boolean h = true;
    public boolean f1029i;
    public bg f1030j;

    public f(g gVar, zb.d dVar, uf ufVar, wa waVar) {
        m.h(gVar, "MlKitContext can not be null");
        m.h(dVar, "SubjectSegmenterOptions can not be null");
        this.d = gVar.b();
        this.f1026e = dVar;
        this.f1027f = ufVar;
        this.f1028g = waVar;
    }

    @Override
    public final synchronized void b() {
        IInterface aVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            n6.c[] cVarArr = f1024k;
            if (!j.a(context, cVarArr)) {
                if (!this.f1029i) {
                    j.c(this.d, cVarArr);
                    this.f1029i = true;
                }
                f(eb.OPTIONAL_MODULE_NOT_AVAILABLE, elapsedRealtime);
                throw new lb.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.f1030j == null) {
                    IBinder b10 = b7.f.c(this.d, b7.f.f2948b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i7 = dg.f4261a;
                    if (b10 == null) {
                        aVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        if (queryLocalInterface instanceof eg) {
                            aVar = (eg) queryLocalInterface;
                        } else {
                            aVar = new a8.a(b10, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 1);
                        }
                    }
                    a7.b bVar = new a7.b(this.d);
                    this.f1026e.getClass();
                    zb.d dVar = this.f1026e;
                    this.f1030j = ((cg) aVar).x1(bVar, new hg(false, dVar.f61237a, dVar.f61238b, false, dVar.f61239c));
                }
                try {
                    bg bgVar = this.f1030j;
                    bgVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(bgVar.f307c);
                    bgVar.t1(obtain, 1);
                    f(eb.NO_ERROR, elapsedRealtime);
                } catch (RemoteException e10) {
                    f(eb.OPTIONAL_MODULE_INIT_ERROR, elapsedRealtime);
                    throw new lb.a("Failed to init module subject segmenter", e10);
                }
            } catch (Exception e11) {
                f(eb.OPTIONAL_MODULE_CREATE_ERROR, elapsedRealtime);
                throw new lb.a("Failed to load subject segmentation module", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final synchronized void c() {
        try {
            bg bgVar = this.f1030j;
            if (bgVar != null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(bgVar.f307c);
                bgVar.t1(obtain, 2);
            }
            this.f1030j = null;
        } catch (RemoteException unused) {
            Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            this.f1030j = null;
        }
        this.h = true;
        uf ufVar = this.f1027f;
        fb fbVar = fb.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE;
        ufVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (ufVar.d(fbVar, elapsedRealtime)) {
            ufVar.f4722i.put(fbVar, Long.valueOf(elapsedRealtime));
            ga.d dVar = new ga.d(1);
            dVar.d = db.TYPE_THIN;
            n.f54964a.execute(new qa(ufVar, new xa(dVar, 0), fbVar, ufVar.c(), 1));
        }
    }

    @Override
    public final Object e(ub.a aVar) {
        Throwable th2;
        a7.b bVar;
        f fVar;
        ub.a aVar2;
        synchronized (this) {
            try {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    bg bgVar = this.f1030j;
                    m.g(bgVar);
                    yf yfVar = new yf(aVar.f58000e, aVar.f57998b, aVar.f57999c, SystemClock.elapsedRealtime(), xc.a(aVar.d));
                    int i7 = aVar.f58000e;
                    try {
                        if (i7 != -1) {
                            if (i7 != 17) {
                                if (i7 != 35) {
                                    if (i7 != 842094169) {
                                        int i10 = aVar.f58000e;
                                        throw new lb.a("Unsupported image format: " + i10, 3);
                                    }
                                } else {
                                    bVar = new a7.b(null);
                                }
                            }
                            m.g(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.f57997a;
                        m.g(bitmap);
                        bVar = new a7.b(bitmap);
                        try {
                            gg x12 = bgVar.x1(bVar, yfVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.f1026e.f61238b) {
                                for (fg fgVar : x12.f4515a) {
                                    float[] fArr = fgVar.f4494a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new zb.a(fgVar.f4495b, fgVar.f4496c, fgVar.d, fgVar.f4497e, fgVar.f4498f));
                                }
                            }
                            fVar = this;
                            aVar2 = aVar;
                            try {
                                fVar.g(eb.NO_ERROR, elapsedRealtime, this.h, aVar2, x12);
                                fVar.h = false;
                                float[] fArr2 = x12.f4516b;
                                if (fArr2 != null) {
                                    try {
                                        try {
                                            FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                                            allocate2.put(fArr2);
                                            allocate2.rewind();
                                        } catch (RemoteException e10) {
                                            e = e10;
                                            fVar.g(eb.OPTIONAL_MODULE_INFERENCE_ERROR, elapsedRealtime, fVar.h, aVar2, null);
                                            throw new lb.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e11) {
                                        e = e11;
                                    }
                                }
                                return new zb.b(arrayList);
                            } catch (RemoteException e12) {
                                e = e12;
                            }
                        } catch (RemoteException e13) {
                            e = e13;
                            fVar = this;
                            aVar2 = aVar;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final void f(eb ebVar, long j3) {
        this.f1027f.b(new e(this, ebVar, j3), fb.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }

    public final void g(eb ebVar, long j3, boolean z10, ub.a aVar, gg ggVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        this.f1027f.b(new d(this, elapsedRealtime, ebVar, z10, aVar, ggVar), fb.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        a0 a0Var = new a0(16, false);
        a0Var.d = this.f1026e.a();
        a0Var.f1706b = ebVar;
        a0Var.f1707c = Boolean.valueOf(z10);
        n.f54964a.execute(new ra(this.f1027f, new h1(a0Var), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - elapsedRealtime;
        wa waVar = this.f1028g;
        int i7 = ebVar.f4275a;
        synchronized (waVar) {
            AtomicLong atomicLong = waVar.f705b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - waVar.f705b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            waVar.f704a.f(new p(0, Arrays.asList(new k(24336, i7, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new va(waVar, elapsedRealtime2, 1));
        }
    }
}
