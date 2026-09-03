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
import m.r3;
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
    public static final y5.c[] f15923k = {k.f2420c};
    public static final ib.a f15924l = ib.a.f8044a;
    public final Context d;
    public final mb.e f15925e;
    public final xf f15926f;
    public final d9 f15927g;
    public boolean h = true;
    public boolean f15928i;
    public eg f15929j;

    public e(h hVar, mb.e eVar, xf xfVar, d9 d9Var) {
        m.i(hVar, "MlKitContext can not be null");
        m.i(eVar, "SubjectSegmenterOptions can not be null");
        this.d = hVar.b();
        this.f15925e = eVar;
        this.f15926f = xfVar;
        this.f15927g = d9Var;
    }

    @Override
    public final synchronized void b() {
        IInterface aVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            y5.c[] cVarArr = f15923k;
            if (!k.a(context, cVarArr)) {
                if (!this.f15928i) {
                    k.c(this.d, cVarArr);
                    this.f15928i = true;
                }
                f(hb.OPTIONAL_MODULE_NOT_AVAILABLE, elapsedRealtime);
                throw new ya.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.f15929j == null) {
                    IBinder b10 = m6.e.c(this.d, m6.e.f13468b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i10 = gg.f15435a;
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
                    this.f15925e.getClass();
                    mb.e eVar = this.f15925e;
                    this.f15929j = ((fg) aVar).U0(bVar, new kg(false, eVar.f13627a, eVar.f13628b, false, eVar.f13629c));
                }
                try {
                    eg egVar = this.f15929j;
                    egVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(egVar.f136c);
                    egVar.Q0(obtain, 1);
                    f(hb.NO_ERROR, elapsedRealtime);
                } catch (RemoteException e6) {
                    f(hb.OPTIONAL_MODULE_INIT_ERROR, elapsedRealtime);
                    throw new ya.a("Failed to init module subject segmenter", e6);
                }
            } catch (Exception e10) {
                f(hb.OPTIONAL_MODULE_CREATE_ERROR, elapsedRealtime);
                throw new ya.a("Failed to load subject segmentation module", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final synchronized void c() {
        try {
            eg egVar = this.f15929j;
            if (egVar != null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(egVar.f136c);
                egVar.Q0(obtain, 2);
            }
            this.f15929j = null;
        } catch (RemoteException unused) {
            Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            this.f15929j = null;
        }
        this.h = true;
        xf xfVar = this.f15926f;
        ib ibVar = ib.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE;
        xfVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (xfVar.d(ibVar, elapsedRealtime)) {
            xfVar.f15821i.put(ibVar, Long.valueOf(elapsedRealtime));
            ?? obj = new Object();
            obj.f13331c = gb.TYPE_THIN;
            o.f2429a.execute(new p(xfVar, new e0((r3) obj, 0), ibVar, xfVar.c(), false, 7));
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
                    eg egVar = this.f15929j;
                    m.h(egVar);
                    bg bgVar = new bg(aVar.f7369e, aVar.f7367b, aVar.f7368c, SystemClock.elapsedRealtime(), f8.a(aVar.d));
                    int i10 = aVar.f7369e;
                    try {
                        if (i10 != -1) {
                            if (i10 != 17) {
                                if (i10 != 35) {
                                    if (i10 != 842094169) {
                                        int i11 = aVar.f7369e;
                                        throw new ya.a("Unsupported image format: " + i11, 3);
                                    }
                                } else {
                                    bVar = new l6.b(null);
                                }
                            }
                            m.h(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.f7366a;
                        m.h(bitmap);
                        bVar = new l6.b(bitmap);
                        try {
                            jg U0 = egVar.U0(bVar, bgVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.f15925e.f13628b) {
                                for (ig igVar : U0.f15620a) {
                                    float[] fArr = igVar.f15598a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new mb.a(igVar.f15599b, igVar.f15600c, igVar.d, igVar.f15601e, igVar.f15602f));
                                }
                            }
                            eVar = this;
                            aVar2 = aVar;
                            try {
                                eVar.g(hb.NO_ERROR, elapsedRealtime, this.h, aVar2, U0);
                                eVar.h = false;
                                float[] fArr2 = U0.f15621b;
                                if (fArr2 != null) {
                                    try {
                                        try {
                                            FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                                            allocate2.put(fArr2);
                                            allocate2.rewind();
                                        } catch (RemoteException e6) {
                                            e = e6;
                                            eVar.g(hb.OPTIONAL_MODULE_INFERENCE_ERROR, elapsedRealtime, eVar.h, aVar2, null);
                                            throw new ya.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e10) {
                                        e = e10;
                                    }
                                }
                                return new mb.b(arrayList);
                            } catch (RemoteException e11) {
                                e = e11;
                            }
                        } catch (RemoteException e12) {
                            e = e12;
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
        this.f15926f.b(new wf() {
            @Override
            public final e0 zza() {
                ?? obj = new Object();
                obj.f13331c = gb.TYPE_THIN;
                w0 w0Var = new w0(11, false);
                w0Var.d = e.this.f15925e.a();
                w0Var.f12080b = hbVar;
                w0Var.f12081c = Long.valueOf((SystemClock.elapsedRealtime() - j10) & Long.MAX_VALUE);
                obj.f13332e = new ge(w0Var);
                return new e0((r3) obj, 0);
            }
        }, ib.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }

    public final void g(hb hbVar, long j10, boolean z4, hb.a aVar, jg jgVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f15926f.b(new j(this, elapsedRealtime, hbVar, z4, aVar, jgVar), ib.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        w0 w0Var = new w0(9, false);
        w0Var.d = this.f15925e.a();
        w0Var.f12080b = hbVar;
        w0Var.f12081c = Boolean.valueOf(z4);
        o.f2429a.execute(new ja(this.f15926f, new i1(w0Var), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - elapsedRealtime;
        d9 d9Var = this.f15927g;
        int i10 = hbVar.f15450a;
        synchronized (d9Var) {
            AtomicLong atomicLong = d9Var.f9589b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - d9Var.f9589b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            d9Var.f9588a.f(new b6.p(0, Arrays.asList(new b6.k(24336, i10, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.c(d9Var, elapsedRealtime2, 5));
        }
    }
}
