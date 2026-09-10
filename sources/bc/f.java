package bc;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.cast.p;
import e6.n;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import m.r3;
import n6.l;
import n6.o;
import qb.g;
import qb.j;
import qb.m;
import v7.a6;
import v7.z8;
import w7.d8;
import x7.da;
import z7.ag;
import z7.dg;
import z7.eg;
import z7.fb;
import z7.fe;
import z7.fg;
import z7.gb;
import z7.gg;
import z7.hb;
import z7.hg;
import z7.i1;
import z7.ig;
import z7.jg;
import z7.vf;
import z7.wf;
public final class f extends qb.e {
    public static final k6.c[] f2196k = {j.f40626c};
    public static final wb.a f2197l = wb.a.f43964a;
    public final Context d;
    public final ac.e e;
    public final wf f2198f;
    public final z8 f2199g;
    public boolean h = true;
    public boolean f2200i;
    public dg f2201j;

    public f(g gVar, ac.e eVar, wf wfVar, z8 z8Var) {
        l.i(gVar, "MlKitContext can not be null");
        l.i(eVar, "SubjectSegmenterOptions can not be null");
        this.d = gVar.b();
        this.e = eVar;
        this.f2198f = wfVar;
        this.f2199g = z8Var;
    }

    @Override
    public final synchronized void b() {
        IInterface aVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            k6.c[] cVarArr = f2196k;
            if (!j.a(context, cVarArr)) {
                if (!this.f2200i) {
                    j.c(this.d, cVarArr);
                    this.f2200i = true;
                }
                f(gb.OPTIONAL_MODULE_NOT_AVAILABLE, elapsedRealtime);
                throw new mb.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.f2201j == null) {
                    IBinder b10 = y6.e.c(this.d, y6.e.f46469b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i10 = fg.f47368a;
                    if (b10 == null) {
                        aVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        if (queryLocalInterface instanceof gg) {
                            aVar = (gg) queryLocalInterface;
                        } else {
                            aVar = new a9.a(b10, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 11);
                        }
                    }
                    x6.b bVar = new x6.b(this.d);
                    this.e.getClass();
                    ac.e eVar = this.e;
                    this.f2201j = ((eg) aVar).W0(bVar, new jg(false, eVar.f381a, eVar.f382b, false, eVar.f383c));
                }
                try {
                    dg dgVar = this.f2201j;
                    dgVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(dgVar.f312c);
                    dgVar.S0(obtain, 1);
                    f(gb.NO_ERROR, elapsedRealtime);
                } catch (RemoteException e) {
                    f(gb.OPTIONAL_MODULE_INIT_ERROR, elapsedRealtime);
                    throw new mb.a("Failed to init module subject segmenter", e);
                }
            } catch (Exception e7) {
                f(gb.OPTIONAL_MODULE_CREATE_ERROR, elapsedRealtime);
                throw new mb.a("Failed to load subject segmentation module", e7);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final synchronized void c() {
        try {
            dg dgVar = this.f2201j;
            if (dgVar != null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(dgVar.f312c);
                dgVar.S0(obtain, 2);
            }
            this.f2201j = null;
        } catch (RemoteException unused) {
            Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            this.f2201j = null;
        }
        this.h = true;
        wf wfVar = this.f2198f;
        hb hbVar = hb.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE;
        wfVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (wfVar.d(hbVar, elapsedRealtime)) {
            wfVar.f47796i.put(hbVar, Long.valueOf(elapsedRealtime));
            ?? obj = new Object();
            obj.f13139c = fb.TYPE_THIN;
            m.f40631a.execute(new p(wfVar, new a5.a((r3) obj, 0), hbVar, wfVar.c(), 8));
        }
    }

    @Override
    public final Object e(vb.a aVar) {
        Throwable th2;
        x6.b bVar;
        f fVar;
        vb.a aVar2;
        synchronized (this) {
            try {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    dg dgVar = this.f2201j;
                    l.h(dgVar);
                    ag agVar = new ag(aVar.e, aVar.f43301b, aVar.f43302c, SystemClock.elapsedRealtime(), d8.a(aVar.d));
                    int i10 = aVar.e;
                    try {
                        if (i10 != -1) {
                            if (i10 != 17) {
                                if (i10 != 35) {
                                    if (i10 != 842094169) {
                                        int i11 = aVar.e;
                                        throw new mb.a("Unsupported image format: " + i11, 3);
                                    }
                                } else {
                                    bVar = new x6.b(null);
                                }
                            }
                            l.h(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.f43300a;
                        l.h(bitmap);
                        bVar = new x6.b(bitmap);
                        try {
                            ig W0 = dgVar.W0(bVar, agVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.e.f382b) {
                                for (hg hgVar : W0.f47616a) {
                                    float[] fArr = hgVar.f47596a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new ac.a(hgVar.f47597b, hgVar.f47598c, hgVar.d, hgVar.e, hgVar.f47599f));
                                }
                            }
                            fVar = this;
                            aVar2 = aVar;
                            try {
                                fVar.g(gb.NO_ERROR, elapsedRealtime, this.h, aVar2, W0);
                                fVar.h = false;
                                float[] fArr2 = W0.f47617b;
                                if (fArr2 != null) {
                                    try {
                                        try {
                                            FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                                            allocate2.put(fArr2);
                                            allocate2.rewind();
                                        } catch (RemoteException e) {
                                            e = e;
                                            fVar.g(gb.OPTIONAL_MODULE_INFERENCE_ERROR, elapsedRealtime, fVar.h, aVar2, null);
                                            throw new mb.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e7) {
                                        e = e7;
                                    }
                                }
                                return new ac.b(arrayList);
                            } catch (RemoteException e10) {
                                e = e10;
                            }
                        } catch (RemoteException e11) {
                            e = e11;
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

    public final void f(final gb gbVar, final long j3) {
        this.f2198f.b(new vf() {
            @Override
            public final a5.a zza() {
                ?? obj = new Object();
                obj.f13139c = fb.TYPE_THIN;
                a6 a6Var = new a6(14, false);
                a6Var.d = f.this.e.a();
                a6Var.f42935c = gbVar;
                a6Var.f42934b = Long.valueOf((SystemClock.elapsedRealtime() - j3) & Long.MAX_VALUE);
                obj.e = new fe(a6Var);
                return new a5.a((r3) obj, 0);
            }
        }, hb.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }

    public final void g(gb gbVar, long j3, boolean z10, vb.a aVar, ig igVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        this.f2198f.b(new d(this, elapsedRealtime, gbVar, z10, aVar, igVar), hb.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        a6 a6Var = new a6(12, false);
        a6Var.f42935c = this.e.a();
        a6Var.f42934b = gbVar;
        a6Var.d = Boolean.valueOf(z10);
        m.f40631a.execute(new da(this.f2198f, new i1(a6Var), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - elapsedRealtime;
        z8 z8Var = this.f2199g;
        int i10 = gbVar.f47452a;
        synchronized (z8Var) {
            AtomicLong atomicLong = z8Var.f43222b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - z8Var.f43222b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            z8Var.f43221a.f(new o(0, Arrays.asList(new n6.j(24336, i10, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new n(z8Var, elapsedRealtime2, 10));
        }
    }
}
