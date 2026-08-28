package jb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import f7.d9;
import f7.z6;
import h7.ia;
import j7.ag;
import j7.dg;
import j7.eg;
import j7.fb;
import j7.fe;
import j7.fg;
import j7.gb;
import j7.gg;
import j7.hb;
import j7.hg;
import j7.i1;
import j7.ig;
import j7.jg;
import j7.vf;
import j7.wf;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import m.t3;
import x5.l;
import x5.o;
import ya.g;
import ya.j;
import ya.m;
public final class f extends ya.e {
    public static final u5.c[] f14299k = {j.f49701c};
    public static final eb.a f14300l = eb.a.f5102a;
    public final Context d;
    public final ib.e f14301e;
    public final wf f14302f;
    public final d9 f14303g;
    public boolean h = true;
    public boolean f14304i;
    public dg f14305j;

    public f(g gVar, ib.e eVar, wf wfVar, d9 d9Var) {
        l.i(gVar, "MlKitContext can not be null");
        l.i(eVar, "SubjectSegmenterOptions can not be null");
        this.d = gVar.b();
        this.f14301e = eVar;
        this.f14302f = wfVar;
        this.f14303g = d9Var;
    }

    @Override
    public final synchronized void b() {
        IInterface aVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            u5.c[] cVarArr = f14299k;
            if (!j.a(context, cVarArr)) {
                if (!this.f14304i) {
                    j.c(this.d, cVarArr);
                    this.f14304i = true;
                }
                f(gb.OPTIONAL_MODULE_NOT_AVAILABLE, elapsedRealtime);
                throw new ua.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.f14305j == null) {
                    IBinder b10 = i6.e.c(this.d, i6.e.f10927b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i9 = fg.f13723a;
                    if (b10 == null) {
                        aVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        if (queryLocalInterface instanceof gg) {
                            aVar = (gg) queryLocalInterface;
                        } else {
                            aVar = new b7.a(b10, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 6);
                        }
                    }
                    h6.b bVar = new h6.b(this.d);
                    this.f14301e.getClass();
                    ib.e eVar = this.f14301e;
                    this.f14305j = ((eg) aVar).U0(bVar, new jg(false, eVar.f11086a, eVar.f11087b, false, eVar.f11088c));
                }
                try {
                    dg dgVar = this.f14305j;
                    dgVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(dgVar.f1550c);
                    dgVar.Q0(obtain, 1);
                    f(gb.NO_ERROR, elapsedRealtime);
                } catch (RemoteException e10) {
                    f(gb.OPTIONAL_MODULE_INIT_ERROR, elapsedRealtime);
                    throw new ua.a("Failed to init module subject segmenter", e10);
                }
            } catch (Exception e11) {
                f(gb.OPTIONAL_MODULE_CREATE_ERROR, elapsedRealtime);
                throw new ua.a("Failed to load subject segmentation module", e11);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public final synchronized void c() {
        try {
            dg dgVar = this.f14305j;
            if (dgVar != null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(dgVar.f1550c);
                dgVar.Q0(obtain, 2);
            }
            this.f14305j = null;
        } catch (RemoteException unused) {
            Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            this.f14305j = null;
        }
        this.h = true;
        wf wfVar = this.f14302f;
        hb hbVar = hb.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE;
        wfVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (wfVar.d(hbVar, elapsedRealtime)) {
            wfVar.f14172i.put(hbVar, Long.valueOf(elapsedRealtime));
            ?? obj = new Object();
            obj.f17100c = fb.TYPE_THIN;
            m.f49706a.execute(new af.f(wfVar, new a6.a((t3) obj, 0), hbVar, wfVar.c(), false, 6));
        }
    }

    @Override
    public final Object e(db.a aVar) {
        Throwable th;
        h6.b bVar;
        f fVar;
        db.a aVar2;
        synchronized (this) {
            try {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    dg dgVar = this.f14305j;
                    l.h(dgVar);
                    ag agVar = new ag(aVar.f4469e, aVar.f4467b, aVar.f4468c, SystemClock.elapsedRealtime(), z6.a(aVar.d));
                    int i9 = aVar.f4469e;
                    try {
                        if (i9 != -1) {
                            if (i9 != 17) {
                                if (i9 != 35) {
                                    if (i9 != 842094169) {
                                        int i10 = aVar.f4469e;
                                        throw new ua.a("Unsupported image format: " + i10, 3);
                                    }
                                } else {
                                    bVar = new h6.b(null);
                                }
                            }
                            l.h(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.f4466a;
                        l.h(bitmap);
                        bVar = new h6.b(bitmap);
                        try {
                            ig U0 = dgVar.U0(bVar, agVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.f14301e.f11087b) {
                                for (hg hgVar : U0.f13978a) {
                                    float[] fArr = hgVar.f13956a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new ib.a(hgVar.f13957b, hgVar.f13958c, hgVar.d, hgVar.f13959e, hgVar.f13960f));
                                }
                            }
                            fVar = this;
                            aVar2 = aVar;
                            try {
                                fVar.g(gb.NO_ERROR, elapsedRealtime, this.h, aVar2, U0);
                                fVar.h = false;
                                float[] fArr2 = U0.f13979b;
                                if (fArr2 != null) {
                                    try {
                                        try {
                                            FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                                            allocate2.put(fArr2);
                                            allocate2.rewind();
                                        } catch (RemoteException e10) {
                                            e = e10;
                                            fVar.g(gb.OPTIONAL_MODULE_INFERENCE_ERROR, elapsedRealtime, fVar.h, aVar2, null);
                                            throw new ua.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e11) {
                                        e = e11;
                                    }
                                }
                                return new ib.b(arrayList);
                            } catch (RemoteException e12) {
                                e = e12;
                            }
                        } catch (RemoteException e13) {
                            e = e13;
                            fVar = this;
                            aVar2 = aVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void f(final gb gbVar, final long j10) {
        this.f14302f.b(new vf() {
            @Override
            public final a6.a zza() {
                ?? obj = new Object();
                obj.f17100c = fb.TYPE_THIN;
                j4.c cVar = new j4.c(5, false);
                cVar.d = f.this.f14301e.a();
                cVar.f13431b = gbVar;
                cVar.f13432c = Long.valueOf((SystemClock.elapsedRealtime() - j10) & Long.MAX_VALUE);
                obj.f17101e = new fe(cVar);
                return new a6.a((t3) obj, 0);
            }
        }, hb.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }

    public final void g(gb gbVar, long j10, boolean z10, db.a aVar, ig igVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f14302f.b(new d(this, elapsedRealtime, gbVar, z10, aVar, igVar), hb.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        j4.c cVar = new j4.c(3, false);
        cVar.d = this.f14301e.a();
        cVar.f13431b = gbVar;
        cVar.f13432c = Boolean.valueOf(z10);
        m.f49706a.execute(new ia(this.f14302f, new i1(cVar), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - elapsedRealtime;
        d9 d9Var = this.f14303g;
        int i9 = gbVar.f13809a;
        synchronized (d9Var) {
            AtomicLong atomicLong = d9Var.f5644b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - d9Var.f5644b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            d9Var.f5643a.f(new o(0, Arrays.asList(new x5.j(24336, i9, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.d(d9Var, elapsedRealtime2, 5));
        }
    }
}
