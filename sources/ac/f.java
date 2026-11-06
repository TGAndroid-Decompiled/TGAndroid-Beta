package ac;

import a8.pa;
import a8.qa;
import a8.ua;
import a8.va;
import a8.wa;
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
import q6.k;
import q6.m;
import q6.p;
public final class f extends pb.e {
    public static final n6.c[] f1026k = {j.f53446c};
    public static final vb.a f1027l = vb.a.f57214a;
    public final Context d;
    public final zb.d f1028e;
    public final uf f1029f;
    public final va f1030g;
    public boolean h = true;
    public boolean f1031i;
    public bg f1032j;

    public f(g gVar, zb.d dVar, uf ufVar, va vaVar) {
        m.h(gVar, "MlKitContext can not be null");
        m.h(dVar, "SubjectSegmenterOptions can not be null");
        this.d = gVar.b();
        this.f1028e = dVar;
        this.f1029f = ufVar;
        this.f1030g = vaVar;
    }

    @Override
    public final synchronized void b() {
        IInterface aVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            n6.c[] cVarArr = f1026k;
            if (!j.a(context, cVarArr)) {
                if (!this.f1031i) {
                    j.c(this.d, cVarArr);
                    this.f1031i = true;
                }
                f(eb.OPTIONAL_MODULE_NOT_AVAILABLE, elapsedRealtime);
                throw new lb.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.f1032j == null) {
                    IBinder b10 = b7.f.c(this.d, b7.f.f2994b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i7 = dg.f5437a;
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
                    this.f1028e.getClass();
                    zb.d dVar = this.f1028e;
                    this.f1032j = ((cg) aVar).X0(bVar, new hg(false, dVar.f59929a, dVar.f59930b, false, dVar.f59931c));
                }
                try {
                    bg bgVar = this.f1032j;
                    bgVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(bgVar.f307c);
                    bgVar.T0(obtain, 1);
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
            bg bgVar = this.f1032j;
            if (bgVar != null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(bgVar.f307c);
                bgVar.T0(obtain, 2);
            }
            this.f1032j = null;
        } catch (RemoteException unused) {
            Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            this.f1032j = null;
        }
        this.h = true;
        uf ufVar = this.f1029f;
        fb fbVar = fb.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE;
        ufVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (ufVar.d(fbVar, elapsedRealtime)) {
            ufVar.f5898i.put(fbVar, Long.valueOf(elapsedRealtime));
            ga.d dVar = new ga.d(1);
            dVar.d = db.TYPE_THIN;
            pb.m.f53451a.execute(new pa(ufVar, new wa(dVar, 0), fbVar, ufVar.c(), 1));
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
                    bg bgVar = this.f1032j;
                    m.g(bgVar);
                    yf yfVar = new yf(aVar.f56400e, aVar.f56398b, aVar.f56399c, SystemClock.elapsedRealtime(), xc.a(aVar.d));
                    int i7 = aVar.f56400e;
                    try {
                        if (i7 != -1) {
                            if (i7 != 17) {
                                if (i7 != 35) {
                                    if (i7 != 842094169) {
                                        int i10 = aVar.f56400e;
                                        throw new lb.a("Unsupported image format: " + i10, 3);
                                    }
                                } else {
                                    bVar = new a7.b(null);
                                }
                            }
                            m.g(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.f56397a;
                        m.g(bitmap);
                        bVar = new a7.b(bitmap);
                        try {
                            gg X0 = bgVar.X0(bVar, yfVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.f1028e.f59930b) {
                                for (fg fgVar : X0.f5690a) {
                                    float[] fArr = fgVar.f5669a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new zb.a(fgVar.f5670b, fgVar.f5671c, fgVar.d, fgVar.f5672e, fgVar.f5673f));
                                }
                            }
                            fVar = this;
                            aVar2 = aVar;
                            try {
                                fVar.g(eb.NO_ERROR, elapsedRealtime, this.h, aVar2, X0);
                                fVar.h = false;
                                float[] fArr2 = X0.f5691b;
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
        this.f1029f.b(new e(this, ebVar, j3), fb.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }

    public final void g(eb ebVar, long j3, boolean z9, ub.a aVar, gg ggVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        this.f1029f.b(new d(this, elapsedRealtime, ebVar, z9, aVar, ggVar), fb.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        a0 a0Var = new a0(16, false);
        a0Var.d = this.f1028e.a();
        a0Var.f1763b = ebVar;
        a0Var.f1764c = Boolean.valueOf(z9);
        pb.m.f53451a.execute(new qa(this.f1029f, new h1(a0Var), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - elapsedRealtime;
        va vaVar = this.f1030g;
        int i7 = ebVar.f5451a;
        synchronized (vaVar) {
            AtomicLong atomicLong = vaVar.f689b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - vaVar.f689b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            vaVar.f688a.f(new p(0, Arrays.asList(new k(24336, i7, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new ua(vaVar, elapsedRealtime2, 1));
        }
    }
}
