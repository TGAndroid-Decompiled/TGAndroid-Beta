package nb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import b4.e0;
import b6.m;
import c2.p;
import cb.f;
import cb.h;
import cb.k;
import cb.o;
import j7.d9;
import j7.f8;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import k.j;
import l7.ja;
import l7.w0;
import m.s3;
import n7.bg;
import n7.eg;
import n7.fg;
import n7.gb;
import n7.ge;
import n7.gg;
import n7.hb;
import n7.hg;
import n7.i1;
import n7.ib;
import n7.ig;
import n7.jg;
import n7.kg;
import n7.wf;
import n7.xf;
public final class e extends f {
    public static final y5.c[] f14891k = {k.f2252c};
    public static final ib.a f14892l = ib.a.f7454a;
    public final Context d;
    public final mb.e e;
    public final xf f14893f;
    public final d9 f14894g;
    public boolean h = true;
    public boolean f14895i;
    public eg f14896j;

    public e(h hVar, mb.e eVar, xf xfVar, d9 d9Var) {
        m.i(hVar, "MlKitContext can not be null");
        m.i(eVar, "SubjectSegmenterOptions can not be null");
        this.d = hVar.b();
        this.e = eVar;
        this.f14893f = xfVar;
        this.f14894g = d9Var;
    }

    @Override
    public final synchronized void b() {
        IInterface aVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            y5.c[] cVarArr = f14891k;
            if (!k.a(context, cVarArr)) {
                if (!this.f14895i) {
                    k.c(this.d, cVarArr);
                    this.f14895i = true;
                }
                f(hb.OPTIONAL_MODULE_NOT_AVAILABLE, elapsedRealtime);
                throw new ya.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.f14896j == null) {
                    IBinder b10 = m6.e.c(this.d, m6.e.f13739b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i10 = gg.f14432a;
                    if (b10 == null) {
                        aVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        if (queryLocalInterface instanceof hg) {
                            aVar = (hg) queryLocalInterface;
                        } else {
                            aVar = new a7.a(b10, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 7);
                        }
                    }
                    l6.b bVar = new l6.b(this.d);
                    this.e.getClass();
                    mb.e eVar = this.e;
                    this.f14896j = ((fg) aVar).U0(bVar, new kg(false, eVar.f13891a, eVar.f13892b, false, eVar.f13893c));
                }
                try {
                    eg egVar = this.f14896j;
                    egVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(egVar.f124c);
                    egVar.Q0(obtain, 1);
                    f(hb.NO_ERROR, elapsedRealtime);
                } catch (RemoteException e) {
                    f(hb.OPTIONAL_MODULE_INIT_ERROR, elapsedRealtime);
                    throw new ya.a("Failed to init module subject segmenter", e);
                }
            } catch (Exception e6) {
                f(hb.OPTIONAL_MODULE_CREATE_ERROR, elapsedRealtime);
                throw new ya.a("Failed to load subject segmentation module", e6);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final synchronized void c() {
        try {
            eg egVar = this.f14896j;
            if (egVar != null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(egVar.f124c);
                egVar.Q0(obtain, 2);
            }
            this.f14896j = null;
        } catch (RemoteException unused) {
            Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            this.f14896j = null;
        }
        this.h = true;
        xf xfVar = this.f14893f;
        ib ibVar = ib.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE;
        xfVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (xfVar.d(ibVar, elapsedRealtime)) {
            xfVar.f14798i.put(ibVar, Long.valueOf(elapsedRealtime));
            ?? obj = new Object();
            obj.f13627c = gb.TYPE_THIN;
            o.f2260a.execute(new p(xfVar, new e0((s3) obj, 0), ibVar, xfVar.c(), false, 7));
        }
    }

    @Override
    public final Object e(hb.a aVar) {
        Throwable th2;
        l6.b bVar;
        e eVar;
        hb.a aVar2;
        synchronized (this) {
            try {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    eg egVar = this.f14896j;
                    m.h(egVar);
                    bg bgVar = new bg(aVar.e, aVar.f7039b, aVar.f7040c, SystemClock.elapsedRealtime(), f8.a(aVar.d));
                    int i10 = aVar.e;
                    try {
                        if (i10 != -1) {
                            if (i10 != 17) {
                                if (i10 != 35) {
                                    if (i10 != 842094169) {
                                        int i11 = aVar.e;
                                        throw new ya.a("Unsupported image format: " + i11, 3);
                                    }
                                } else {
                                    bVar = new l6.b(null);
                                }
                            }
                            m.h(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.f7038a;
                        m.h(bitmap);
                        bVar = new l6.b(bitmap);
                        try {
                            jg U0 = egVar.U0(bVar, bgVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.e.f13892b) {
                                for (ig igVar : U0.f14612a) {
                                    float[] fArr = igVar.f14592a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new mb.a(igVar.f14593b, igVar.f14594c, igVar.d, igVar.e, igVar.f14595f));
                                }
                            }
                            eVar = this;
                            aVar2 = aVar;
                            try {
                                eVar.g(hb.NO_ERROR, elapsedRealtime, this.h, aVar2, U0);
                                eVar.h = false;
                                float[] fArr2 = U0.f14613b;
                                if (fArr2 != null) {
                                    try {
                                        try {
                                            FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                                            allocate2.put(fArr2);
                                            allocate2.rewind();
                                        } catch (RemoteException e) {
                                            e = e;
                                            eVar.g(hb.OPTIONAL_MODULE_INFERENCE_ERROR, elapsedRealtime, eVar.h, aVar2, null);
                                            throw new ya.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e6) {
                                        e = e6;
                                    }
                                }
                                return new mb.b(arrayList);
                            } catch (RemoteException e10) {
                                e = e10;
                            }
                        } catch (RemoteException e11) {
                            e = e11;
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

    public final void f(final hb hbVar, final long j10) {
        this.f14893f.b(new wf() {
            @Override
            public final e0 zza() {
                ?? obj = new Object();
                obj.f13627c = gb.TYPE_THIN;
                w0 w0Var = new w0(11, false);
                w0Var.d = e.this.e.a();
                w0Var.f11786b = hbVar;
                w0Var.f11787c = Long.valueOf((SystemClock.elapsedRealtime() - j10) & Long.MAX_VALUE);
                obj.e = new ge(w0Var);
                return new e0((s3) obj, 0);
            }
        }, ib.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }

    public final void g(hb hbVar, long j10, boolean z4, hb.a aVar, jg jgVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f14893f.b(new j(this, elapsedRealtime, hbVar, z4, aVar, jgVar), ib.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        w0 w0Var = new w0(9, false);
        w0Var.d = this.e.a();
        w0Var.f11786b = hbVar;
        w0Var.f11787c = Boolean.valueOf(z4);
        o.f2260a.execute(new ja(this.f14893f, new i1(w0Var), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - elapsedRealtime;
        d9 d9Var = this.f14894g;
        int i10 = hbVar.f14445a;
        synchronized (d9Var) {
            AtomicLong atomicLong = d9Var.f8959b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - d9Var.f8959b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            d9Var.f8958a.f(new b6.p(0, Arrays.asList(new b6.k(24336, i10, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.c(d9Var, elapsedRealtime2, 5));
        }
    }
}
