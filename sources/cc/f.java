package cc;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.cast.p;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import m.s3;
import n6.l;
import n6.o;
import rb.g;
import rb.j;
import rb.m;
import w7.q8;
import x7.da;
import z7.cg;
import z7.fg;
import z7.gg;
import z7.hb;
import z7.hg;
import z7.i1;
import z7.ib;
import z7.ig;
import z7.jb;
import z7.jg;
import z7.kg;
import z7.lg;
import z7.ra;
import z7.yf;
public final class f extends rb.e {
    public static final k6.c[] f5096k = {j.f45220c};
    public static final xb.a f5097l = xb.a.f49780a;
    public final Context d;
    public final bc.e e;
    public final yf f5098f;
    public final ra f5099g;
    public boolean h = true;
    public boolean f5100i;
    public fg f5101j;

    public f(g gVar, bc.e eVar, yf yfVar, ra raVar) {
        l.i(gVar, "MlKitContext can not be null");
        l.i(eVar, "SubjectSegmenterOptions can not be null");
        this.d = gVar.b();
        this.e = eVar;
        this.f5098f = yfVar;
        this.f5099g = raVar;
    }

    @Override
    public final synchronized void b() {
        IInterface aVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            k6.c[] cVarArr = f5096k;
            if (!j.a(context, cVarArr)) {
                if (!this.f5100i) {
                    j.c(this.d, cVarArr);
                    this.f5100i = true;
                }
                f(ib.OPTIONAL_MODULE_NOT_AVAILABLE, elapsedRealtime);
                throw new nb.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.f5101j == null) {
                    IBinder b10 = y6.e.c(this.d, y6.e.f49971b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i10 = hg.f50917a;
                    if (b10 == null) {
                        aVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        if (queryLocalInterface instanceof ig) {
                            aVar = (ig) queryLocalInterface;
                        } else {
                            aVar = new a9.a(b10, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 11);
                        }
                    }
                    x6.b bVar = new x6.b(this.d);
                    this.e.getClass();
                    bc.e eVar = this.e;
                    this.f5101j = ((gg) aVar).V0(bVar, new lg(false, eVar.f4252a, eVar.f4253b, false, eVar.f4254c));
                }
                try {
                    fg fgVar = this.f5101j;
                    fgVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(fgVar.f319c);
                    fgVar.R0(obtain, 1);
                    f(ib.NO_ERROR, elapsedRealtime);
                } catch (RemoteException e) {
                    f(ib.OPTIONAL_MODULE_INIT_ERROR, elapsedRealtime);
                    throw new nb.a("Failed to init module subject segmenter", e);
                }
            } catch (Exception e7) {
                f(ib.OPTIONAL_MODULE_CREATE_ERROR, elapsedRealtime);
                throw new nb.a("Failed to load subject segmentation module", e7);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final synchronized void c() {
        try {
            fg fgVar = this.f5101j;
            if (fgVar != null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(fgVar.f319c);
                fgVar.R0(obtain, 2);
            }
            this.f5101j = null;
        } catch (RemoteException unused) {
            Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            this.f5101j = null;
        }
        this.h = true;
        yf yfVar = this.f5098f;
        jb jbVar = jb.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE;
        yfVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (yfVar.d(jbVar, elapsedRealtime)) {
            yfVar.f51290i.put(jbVar, Long.valueOf(elapsedRealtime));
            ?? obj = new Object();
            obj.f16330c = hb.TYPE_THIN;
            m.f45225a.execute(new p(yfVar, new a5.a((s3) obj, 0), jbVar, yfVar.c(), 8));
        }
    }

    @Override
    public final Object e(wb.a aVar) {
        Throwable th2;
        x6.b bVar;
        f fVar;
        wb.a aVar2;
        synchronized (this) {
            try {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    fg fgVar = this.f5101j;
                    l.h(fgVar);
                    cg cgVar = new cg(aVar.e, aVar.f48920b, aVar.f48921c, SystemClock.elapsedRealtime(), q8.a(aVar.d));
                    int i10 = aVar.e;
                    try {
                        if (i10 != -1) {
                            if (i10 != 17) {
                                if (i10 != 35) {
                                    if (i10 != 842094169) {
                                        int i11 = aVar.e;
                                        throw new nb.a("Unsupported image format: " + i11, 3);
                                    }
                                } else {
                                    bVar = new x6.b(null);
                                }
                            }
                            l.h(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.f48919a;
                        l.h(bitmap);
                        bVar = new x6.b(bitmap);
                        try {
                            kg V0 = fgVar.V0(bVar, cgVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.e.f4253b) {
                                for (jg jgVar : V0.f51100a) {
                                    float[] fArr = jgVar.f51080a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new bc.a(jgVar.f51081b, jgVar.f51082c, jgVar.d, jgVar.e, jgVar.f51083f));
                                }
                            }
                            fVar = this;
                            aVar2 = aVar;
                            try {
                                fVar.g(ib.NO_ERROR, elapsedRealtime, this.h, aVar2, V0);
                                fVar.h = false;
                                float[] fArr2 = V0.f51101b;
                                if (fArr2 != null) {
                                    try {
                                        try {
                                            FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                                            allocate2.put(fArr2);
                                            allocate2.rewind();
                                        } catch (RemoteException e) {
                                            e = e;
                                            fVar.g(ib.OPTIONAL_MODULE_INFERENCE_ERROR, elapsedRealtime, fVar.h, aVar2, null);
                                            throw new nb.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e7) {
                                        e = e7;
                                    }
                                }
                                return new bc.b(arrayList);
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

    public final void f(ib ibVar, long j10) {
        this.f5098f.b(new e(this, ibVar, j10), jb.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }

    public final void g(ib ibVar, long j10, boolean z10, wb.a aVar, kg kgVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f5098f.b(new d(this, elapsedRealtime, ibVar, z10, aVar, kgVar), jb.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        u2.c cVar = new u2.c(17, false);
        cVar.d = this.e.a();
        cVar.f47282b = ibVar;
        cVar.f47283c = Boolean.valueOf(z10);
        m.f45225a.execute(new da(this.f5098f, new i1(cVar), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - elapsedRealtime;
        ra raVar = this.f5099g;
        int i10 = ibVar.f50933a;
        synchronized (raVar) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (((AtomicLong) raVar.f51174b).get() != -1 && elapsedRealtime2 - ((AtomicLong) raVar.f51174b).get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            ((p6.b) raVar.f51173a).f(new o(0, Arrays.asList(new n6.j(24336, i10, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new ad.d(raVar, elapsedRealtime2, 10));
        }
    }
}
