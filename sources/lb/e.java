package lb;

import ab.f;
import ab.h;
import ab.k;
import ab.q;
import ag.j2;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import c2.p;
import h7.b9;
import h7.q7;
import j7.ja;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import k.j;
import l3.g0;
import l7.ag;
import l7.dg;
import l7.eg;
import l7.fb;
import l7.fe;
import l7.fg;
import l7.gb;
import l7.gg;
import l7.hb;
import l7.hg;
import l7.i1;
import l7.ig;
import l7.jg;
import l7.vf;
import l7.wf;
import m.s3;
import z5.l;
import z5.o;
public final class e extends f {
    public static final w5.c[] f15152k = {k.f320c};
    public static final gb.a f15153l = gb.a.f7258a;
    public final Context d;
    public final kb.e f15154e;
    public final wf f15155f;
    public final b9 f15156g;
    public boolean h = true;
    public boolean f15157i;
    public dg f15158j;

    public e(h hVar, kb.e eVar, wf wfVar, b9 b9Var) {
        l.i(hVar, "MlKitContext can not be null");
        l.i(eVar, "SubjectSegmenterOptions can not be null");
        this.d = hVar.b();
        this.f15154e = eVar;
        this.f15155f = wfVar;
        this.f15156g = b9Var;
    }

    @Override
    public final synchronized void b() {
        IInterface aVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            w5.c[] cVarArr = f15152k;
            if (!k.a(context, cVarArr)) {
                if (!this.f15157i) {
                    k.c(this.d, cVarArr);
                    this.f15157i = true;
                }
                f(gb.OPTIONAL_MODULE_NOT_AVAILABLE, elapsedRealtime);
                throw new wa.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.f15158j == null) {
                    IBinder b10 = k6.e.c(this.d, k6.e.f13450b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i10 = fg.f14582a;
                    if (b10 == null) {
                        aVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        if (queryLocalInterface instanceof gg) {
                            aVar = (gg) queryLocalInterface;
                        } else {
                            aVar = new com.google.android.gms.internal.cast.a(b10, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 6);
                        }
                    }
                    j6.b bVar = new j6.b(this.d);
                    this.f15154e.getClass();
                    kb.e eVar = this.f15154e;
                    this.f15158j = ((eg) aVar).U0(bVar, new jg(false, eVar.f13609a, eVar.f13610b, false, eVar.f13611c));
                }
                try {
                    dg dgVar = this.f15158j;
                    dgVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(dgVar.f3997c);
                    dgVar.Q0(obtain, 1);
                    f(gb.NO_ERROR, elapsedRealtime);
                } catch (RemoteException e10) {
                    f(gb.OPTIONAL_MODULE_INIT_ERROR, elapsedRealtime);
                    throw new wa.a("Failed to init module subject segmenter", e10);
                }
            } catch (Exception e11) {
                f(gb.OPTIONAL_MODULE_CREATE_ERROR, elapsedRealtime);
                throw new wa.a("Failed to load subject segmentation module", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final synchronized void c() {
        try {
            dg dgVar = this.f15158j;
            if (dgVar != null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(dgVar.f3997c);
                dgVar.Q0(obtain, 2);
            }
            this.f15158j = null;
        } catch (RemoteException unused) {
            Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            this.f15158j = null;
        }
        this.h = true;
        wf wfVar = this.f15155f;
        hb hbVar = hb.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE;
        wfVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (wfVar.d(hbVar, elapsedRealtime)) {
            wfVar.f15031i.put(hbVar, Long.valueOf(elapsedRealtime));
            ?? obj = new Object();
            obj.f16690c = fb.TYPE_THIN;
            q.f333a.execute(new p(wfVar, new j2((s3) obj, 0), hbVar, wfVar.c(), false, 7));
        }
    }

    @Override
    public final Object e(fb.a aVar) {
        Throwable th2;
        j6.b bVar;
        e eVar;
        fb.a aVar2;
        synchronized (this) {
            try {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    dg dgVar = this.f15158j;
                    l.h(dgVar);
                    ag agVar = new ag(aVar.f6702e, aVar.f6700b, aVar.f6701c, SystemClock.elapsedRealtime(), q7.a(aVar.d));
                    int i10 = aVar.f6702e;
                    try {
                        if (i10 != -1) {
                            if (i10 != 17) {
                                if (i10 != 35) {
                                    if (i10 != 842094169) {
                                        int i11 = aVar.f6702e;
                                        throw new wa.a("Unsupported image format: " + i11, 3);
                                    }
                                } else {
                                    bVar = new j6.b(null);
                                }
                            }
                            l.h(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.f6699a;
                        l.h(bitmap);
                        bVar = new j6.b(bitmap);
                        try {
                            ig U0 = dgVar.U0(bVar, agVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.f15154e.f13610b) {
                                for (hg hgVar : U0.f14837a) {
                                    float[] fArr = hgVar.f14815a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new kb.a(hgVar.f14816b, hgVar.f14817c, hgVar.d, hgVar.f14818e, hgVar.f14819f));
                                }
                            }
                            eVar = this;
                            aVar2 = aVar;
                            try {
                                eVar.g(gb.NO_ERROR, elapsedRealtime, this.h, aVar2, U0);
                                eVar.h = false;
                                float[] fArr2 = U0.f14838b;
                                if (fArr2 != null) {
                                    try {
                                        try {
                                            FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                                            allocate2.put(fArr2);
                                            allocate2.rewind();
                                        } catch (RemoteException e10) {
                                            e = e10;
                                            eVar.g(gb.OPTIONAL_MODULE_INFERENCE_ERROR, elapsedRealtime, eVar.h, aVar2, null);
                                            throw new wa.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e11) {
                                        e = e11;
                                    }
                                }
                                return new kb.b(arrayList);
                            } catch (RemoteException e12) {
                                e = e12;
                            }
                        } catch (RemoteException e13) {
                            e = e13;
                            eVar = this;
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

    public final void f(final gb gbVar, final long j10) {
        this.f15155f.b(new vf() {
            @Override
            public final j2 zza() {
                ?? obj = new Object();
                obj.f16690c = fb.TYPE_THIN;
                g0 g0Var = new g0(6, false);
                g0Var.d = e.this.f15154e.a();
                g0Var.f14096b = gbVar;
                g0Var.f14097c = Long.valueOf((SystemClock.elapsedRealtime() - j10) & Long.MAX_VALUE);
                obj.f16691e = new fe(g0Var);
                return new j2((s3) obj, 0);
            }
        }, hb.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }

    public final void g(gb gbVar, long j10, boolean z10, fb.a aVar, ig igVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f15155f.b(new j(this, elapsedRealtime, gbVar, z10, aVar, igVar), hb.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        g0 g0Var = new g0(4, false);
        g0Var.d = this.f15154e.a();
        g0Var.f14096b = gbVar;
        g0Var.f14097c = Boolean.valueOf(z10);
        q.f333a.execute(new ja(this.f15155f, new i1(g0Var), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - elapsedRealtime;
        b9 b9Var = this.f15156g;
        int i10 = gbVar.f14668a;
        synchronized (b9Var) {
            AtomicLong atomicLong = b9Var.f7568b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - b9Var.f7568b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            b9Var.f7567a.f(new o(0, Arrays.asList(new z5.j(24336, i10, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.c(b9Var, elapsedRealtime2, 5));
        }
    }
}
