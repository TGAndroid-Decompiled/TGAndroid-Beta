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
import m.q3;
import n6.m;
import qb.g;
import qb.j;
import v7.k;
import w7.d8;
import x7.da;
import x7.ga;
import z7.bg;
import z7.eg;
import z7.fb;
import z7.fg;
import z7.gb;
import z7.ge;
import z7.gg;
import z7.hb;
import z7.hg;
import z7.i1;
import z7.ig;
import z7.jg;
import z7.kg;
import z7.wf;
import z7.xf;
public final class f extends qb.e {
    public static final k6.c[] f3857k = {j.f46198c};
    public static final wb.a f3858l = wb.a.f50443a;
    public final Context d;
    public final ac.e f3859e;
    public final xf f3860f;
    public final ga f3861g;
    public boolean h = true;
    public boolean f3862i;
    public eg f3863j;

    public f(g gVar, ac.e eVar, xf xfVar, ga gaVar) {
        m.i(gVar, "MlKitContext can not be null");
        m.i(eVar, "SubjectSegmenterOptions can not be null");
        this.d = gVar.b();
        this.f3859e = eVar;
        this.f3860f = xfVar;
        this.f3861g = gaVar;
    }

    @Override
    public final synchronized void b() {
        IInterface aVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            k6.c[] cVarArr = f3857k;
            if (!j.a(context, cVarArr)) {
                if (!this.f3862i) {
                    j.c(this.d, cVarArr);
                    this.f3862i = true;
                }
                f(gb.OPTIONAL_MODULE_NOT_AVAILABLE, elapsedRealtime);
                throw new mb.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.f3863j == null) {
                    IBinder b10 = y6.e.c(this.d, y6.e.f51844b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i10 = gg.f53882a;
                    if (b10 == null) {
                        aVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        if (queryLocalInterface instanceof hg) {
                            aVar = (hg) queryLocalInterface;
                        } else {
                            aVar = new a9.a(b10, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 11);
                        }
                    }
                    x6.b bVar = new x6.b(this.d);
                    this.f3859e.getClass();
                    ac.e eVar = this.f3859e;
                    this.f3863j = ((fg) aVar).V0(bVar, new kg(false, eVar.f412a, eVar.f413b, false, eVar.f414c));
                }
                try {
                    eg egVar = this.f3863j;
                    egVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(egVar.f337c);
                    egVar.R0(obtain, 1);
                    f(gb.NO_ERROR, elapsedRealtime);
                } catch (RemoteException e7) {
                    f(gb.OPTIONAL_MODULE_INIT_ERROR, elapsedRealtime);
                    throw new mb.a("Failed to init module subject segmenter", e7);
                }
            } catch (Exception e10) {
                f(gb.OPTIONAL_MODULE_CREATE_ERROR, elapsedRealtime);
                throw new mb.a("Failed to load subject segmentation module", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final synchronized void c() {
        try {
            eg egVar = this.f3863j;
            if (egVar != null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(egVar.f337c);
                egVar.R0(obtain, 2);
            }
            this.f3863j = null;
        } catch (RemoteException unused) {
            Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            this.f3863j = null;
        }
        this.h = true;
        xf xfVar = this.f3860f;
        hb hbVar = hb.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE;
        xfVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (xfVar.d(hbVar, elapsedRealtime)) {
            xfVar.f54259i.put(hbVar, Long.valueOf(elapsedRealtime));
            ?? obj = new Object();
            obj.f15858c = fb.TYPE_THIN;
            qb.m.f46203a.execute(new p(xfVar, new a5.a((q3) obj, 0), hbVar, xfVar.c(), 8));
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
                    eg egVar = this.f3863j;
                    m.h(egVar);
                    bg bgVar = new bg(aVar.f49639e, aVar.f49637b, aVar.f49638c, SystemClock.elapsedRealtime(), d8.a(aVar.d));
                    int i10 = aVar.f49639e;
                    try {
                        if (i10 != -1) {
                            if (i10 != 17) {
                                if (i10 != 35) {
                                    if (i10 != 842094169) {
                                        int i11 = aVar.f49639e;
                                        throw new mb.a("Unsupported image format: " + i11, 3);
                                    }
                                } else {
                                    bVar = new x6.b(null);
                                }
                            }
                            m.h(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.f49636a;
                        m.h(bitmap);
                        bVar = new x6.b(bitmap);
                        try {
                            jg V0 = egVar.V0(bVar, bgVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.f3859e.f413b) {
                                for (ig igVar : V0.f54061a) {
                                    float[] fArr = igVar.f54045a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new ac.a(igVar.f54046b, igVar.f54047c, igVar.d, igVar.f54048e, igVar.f54049f));
                                }
                            }
                            fVar = this;
                            aVar2 = aVar;
                            try {
                                fVar.g(gb.NO_ERROR, elapsedRealtime, this.h, aVar2, V0);
                                fVar.h = false;
                                float[] fArr2 = V0.f54062b;
                                if (fArr2 != null) {
                                    try {
                                        try {
                                            FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                                            allocate2.put(fArr2);
                                            allocate2.rewind();
                                        } catch (RemoteException e7) {
                                            e = e7;
                                            fVar.g(gb.OPTIONAL_MODULE_INFERENCE_ERROR, elapsedRealtime, fVar.h, aVar2, null);
                                            throw new mb.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e10) {
                                        e = e10;
                                    }
                                }
                                return new ac.b(arrayList);
                            } catch (RemoteException e11) {
                                e = e11;
                            }
                        } catch (RemoteException e12) {
                            e = e12;
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
        this.f3860f.b(new wf() {
            @Override
            public final a5.a zza() {
                ?? obj = new Object();
                obj.f15858c = fb.TYPE_THIN;
                k kVar = new k(18, false);
                kVar.d = f.this.f3859e.a();
                kVar.f49367b = gbVar;
                kVar.f49368c = Long.valueOf((SystemClock.elapsedRealtime() - j3) & Long.MAX_VALUE);
                obj.f15859e = new ge(kVar);
                return new a5.a((q3) obj, 0);
            }
        }, hb.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }

    public final void g(gb gbVar, long j3, boolean z10, vb.a aVar, jg jgVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        this.f3860f.b(new d(this, elapsedRealtime, gbVar, z10, aVar, jgVar), hb.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        k kVar = new k(16, false);
        kVar.d = this.f3859e.a();
        kVar.f49367b = gbVar;
        kVar.f49368c = Boolean.valueOf(z10);
        qb.m.f46203a.execute(new da(this.f3860f, new i1(kVar), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - elapsedRealtime;
        ga gaVar = this.f3861g;
        int i10 = gbVar.f53878a;
        synchronized (gaVar) {
            AtomicLong atomicLong = gaVar.f50908b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - gaVar.f50908b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            gaVar.f50907a.f(new n6.p(0, Arrays.asList(new n6.j(24336, i10, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new n(gaVar, elapsedRealtime2, 9));
        }
    }
}
