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
import c8.ad;
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
    public static final n6.c[] f1023k = {j.f55573c};
    public static final vb.a f1024l = vb.a.f59396a;
    public final Context d;
    public final zb.d f1025e;
    public final uf f1026f;
    public final wa f1027g;
    public boolean h = true;
    public boolean f1028i;
    public bg f1029j;

    public f(g gVar, zb.d dVar, uf ufVar, wa waVar) {
        m.i(gVar, "MlKitContext can not be null");
        m.i(dVar, "SubjectSegmenterOptions can not be null");
        this.d = gVar.b();
        this.f1025e = dVar;
        this.f1026f = ufVar;
        this.f1027g = waVar;
    }

    @Override
    public final synchronized void b() {
        IInterface aVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            n6.c[] cVarArr = f1023k;
            if (!j.a(context, cVarArr)) {
                if (!this.f1028i) {
                    j.c(this.d, cVarArr);
                    this.f1028i = true;
                }
                f(eb.OPTIONAL_MODULE_NOT_AVAILABLE, elapsedRealtime);
                throw new lb.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.f1029j == null) {
                    IBinder b10 = b7.f.c(this.d, b7.f.f2958b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i7 = dg.f4576a;
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
                    this.f1025e.getClass();
                    zb.d dVar = this.f1025e;
                    this.f1029j = ((cg) aVar).x1(bVar, new hg(false, dVar.f61843a, dVar.f61844b, false, dVar.f61845c));
                }
                try {
                    bg bgVar = this.f1029j;
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
            bg bgVar = this.f1029j;
            if (bgVar != null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(bgVar.f307c);
                bgVar.t1(obtain, 2);
            }
            this.f1029j = null;
        } catch (RemoteException unused) {
            Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            this.f1029j = null;
        }
        this.h = true;
        uf ufVar = this.f1026f;
        fb fbVar = fb.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE;
        ufVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (ufVar.d(fbVar, elapsedRealtime)) {
            ufVar.f5037i.put(fbVar, Long.valueOf(elapsedRealtime));
            ga.d dVar = new ga.d(1);
            dVar.d = db.TYPE_THIN;
            n.f55581a.execute(new qa(ufVar, new xa(dVar, 0), fbVar, ufVar.c(), 1));
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
                    bg bgVar = this.f1029j;
                    m.h(bgVar);
                    yf yfVar = new yf(aVar.f58607e, aVar.f58605b, aVar.f58606c, SystemClock.elapsedRealtime(), ad.a(aVar.d));
                    int i7 = aVar.f58607e;
                    try {
                        if (i7 != -1) {
                            if (i7 != 17) {
                                if (i7 != 35) {
                                    if (i7 != 842094169) {
                                        int i10 = aVar.f58607e;
                                        throw new lb.a("Unsupported image format: " + i10, 3);
                                    }
                                } else {
                                    bVar = new a7.b(null);
                                }
                            }
                            m.h(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.f58604a;
                        m.h(bitmap);
                        bVar = new a7.b(bitmap);
                        try {
                            gg x12 = bgVar.x1(bVar, yfVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.f1025e.f61844b) {
                                for (fg fgVar : x12.f4828a) {
                                    float[] fArr = fgVar.f4807a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new zb.a(fgVar.f4808b, fgVar.f4809c, fgVar.d, fgVar.f4810e, fgVar.f4811f));
                                }
                            }
                            fVar = this;
                            aVar2 = aVar;
                            try {
                                fVar.g(eb.NO_ERROR, elapsedRealtime, this.h, aVar2, x12);
                                fVar.h = false;
                                float[] fArr2 = x12.f4829b;
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
        this.f1026f.b(new e(this, ebVar, j3), fb.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }

    public final void g(eb ebVar, long j3, boolean z10, ub.a aVar, gg ggVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        this.f1026f.b(new d(this, elapsedRealtime, ebVar, z10, aVar, ggVar), fb.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        a0 a0Var = new a0(16, false);
        a0Var.d = this.f1025e.a();
        a0Var.f1717b = ebVar;
        a0Var.f1718c = Boolean.valueOf(z10);
        n.f55581a.execute(new ra(this.f1026f, new h1(a0Var), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - elapsedRealtime;
        wa waVar = this.f1027g;
        int i7 = ebVar.f4590a;
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
