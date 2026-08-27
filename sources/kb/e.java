package kb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import g7.c9;
import g7.z6;
import i7.ia;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import k7.ag;
import k7.dg;
import k7.eg;
import k7.fb;
import k7.fe;
import k7.fg;
import k7.gb;
import k7.gg;
import k7.hb;
import k7.hg;
import k7.i1;
import k7.ig;
import k7.jg;
import k7.vf;
import k7.wf;
import m.t3;
import y5.l;
import y5.o;
import za.g;
import za.j;
import za.m;

public final class e extends za.e {

    public static final v5.c[] f15148k = {j.f50296c};

    public static final fb.a f15149l = fb.a.f6033a;
    public final Context d;

    public final jb.e f15150e;

    public final wf f15151f;

    public final c9 f15152g;
    public boolean h = true;

    public boolean f15153i;

    public dg f15154j;

    public e(g gVar, jb.e eVar, wf wfVar, c9 c9Var) {
        l.i(gVar, "MlKitContext can not be null");
        l.i(eVar, "SubjectSegmenterOptions can not be null");
        this.d = gVar.b();
        this.f15150e = eVar;
        this.f15151f = wfVar;
        this.f15152g = c9Var;
    }

    @Override
    public final synchronized void b() {
        gg egVar;
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            v5.c[] cVarArr = f15148k;
            if (!j.a(context, cVarArr)) {
                if (!this.f15153i) {
                    j.c(this.d, cVarArr);
                    this.f15153i = true;
                }
                f(gb.OPTIONAL_MODULE_NOT_AVAILABLE, jElapsedRealtime);
                throw new va.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.f15154j == null) {
                    IBinder iBinderB = j6.e.c(this.d, j6.e.f12727b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i10 = fg.f14577a;
                    if (iBinderB == null) {
                        egVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        egVar = iInterfaceQueryLocalInterface instanceof gg ? (gg) iInterfaceQueryLocalInterface : new eg(iBinderB, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 6);
                    }
                    i6.b bVar = new i6.b(this.d);
                    this.f15150e.getClass();
                    jb.e eVar = this.f15150e;
                    this.f15154j = ((eg) egVar).U0(bVar, new jg(false, eVar.f12888a, eVar.f12889b, false, eVar.f12890c));
                }
                try {
                    dg dgVar = this.f15154j;
                    dgVar.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken(dgVar.f2457c);
                    dgVar.Q0(parcelObtain, 1);
                    f(gb.NO_ERROR, jElapsedRealtime);
                } catch (RemoteException e9) {
                    f(gb.OPTIONAL_MODULE_INIT_ERROR, jElapsedRealtime);
                    throw new va.a("Failed to init module subject segmenter", e9);
                }
            } catch (Exception e10) {
                f(gb.OPTIONAL_MODULE_CREATE_ERROR, jElapsedRealtime);
                throw new va.a("Failed to load subject segmentation module", e10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public final synchronized void c() {
        try {
            try {
                dg dgVar = this.f15154j;
                if (dgVar != null) {
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken(dgVar.f2457c);
                    dgVar.Q0(parcelObtain, 2);
                }
                this.f15154j = null;
            } catch (RemoteException unused) {
                Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
                this.f15154j = null;
            }
            this.h = true;
            wf wfVar = this.f15151f;
            hb hbVar = hb.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE;
            wfVar.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (wfVar.d(hbVar, jElapsedRealtime)) {
                wfVar.f15026i.put(hbVar, Long.valueOf(jElapsedRealtime));
                t3 t3Var = new t3();
                t3Var.f17475c = fb.TYPE_THIN;
                m.f50301a.execute(new bf.e(wfVar, new b6.a(t3Var, 0), hbVar, wfVar.c(), false, 6));
            }
        } catch (Throwable th) {
            this.f15154j = null;
            throw th;
        }
    }

    @Override
    public final Object e(eb.a aVar) throws Throwable {
        Throwable th;
        i6.b bVar;
        e eVar;
        eb.a aVar2;
        synchronized (this) {
            try {
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    dg dgVar = this.f15154j;
                    l.h(dgVar);
                    ag agVar = new ag(aVar.f5366e, aVar.f5364b, aVar.f5365c, SystemClock.elapsedRealtime(), z6.a(aVar.d));
                    int i10 = aVar.f5366e;
                    try {
                        if (i10 != -1) {
                            if (i10 != 17) {
                                if (i10 == 35) {
                                    bVar = new i6.b(null);
                                } else if (i10 != 842094169) {
                                    throw new va.a("Unsupported image format: " + aVar.f5366e, 3);
                                }
                            }
                            l.h(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.f5363a;
                        l.h(bitmap);
                        bVar = new i6.b(bitmap);
                        try {
                            ig igVarU0 = dgVar.U0(bVar, agVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.f15150e.f12889b) {
                                for (hg hgVar : igVarU0.f14832a) {
                                    float[] fArr = hgVar.f14810a;
                                    if (fArr != null) {
                                        FloatBuffer floatBufferAllocate = FloatBuffer.allocate(fArr.length);
                                        floatBufferAllocate.put(fArr);
                                        floatBufferAllocate.rewind();
                                    }
                                    arrayList.add(new jb.a(hgVar.f14811b, hgVar.f14812c, hgVar.d, hgVar.f14813e, hgVar.f14814f));
                                }
                            }
                            eVar = this;
                            aVar2 = aVar;
                            try {
                                eVar.g(gb.NO_ERROR, jElapsedRealtime, this.h, aVar2, igVarU0);
                                eVar.h = false;
                                float[] fArr2 = igVarU0.f14833b;
                                if (fArr2 != null) {
                                    try {
                                        try {
                                            FloatBuffer floatBufferAllocate2 = FloatBuffer.allocate(fArr2.length);
                                            floatBufferAllocate2.put(fArr2);
                                            floatBufferAllocate2.rewind();
                                        } catch (RemoteException e9) {
                                            e = e9;
                                            eVar.g(gb.OPTIONAL_MODULE_INFERENCE_ERROR, jElapsedRealtime, eVar.h, aVar2, null);
                                            throw new va.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e10) {
                                        e = e10;
                                    }
                                }
                                return new jb.b(arrayList);
                            } catch (RemoteException e11) {
                                e = e11;
                            }
                        } catch (RemoteException e12) {
                            e = e12;
                            eVar = this;
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
        this.f15151f.b(new vf() {
            @Override
            public final b6.a zza() {
                t3 t3Var = new t3();
                t3Var.f17475c = fb.TYPE_THIN;
                j9.a aVar = new j9.a(6, false);
                aVar.d = this.f15145a.f15150e.a();
                aVar.f12863b = gbVar;
                aVar.f12864c = Long.valueOf((SystemClock.elapsedRealtime() - j10) & Long.MAX_VALUE);
                t3Var.f17476e = new fe(aVar);
                return new b6.a(t3Var, 0);
            }
        }, hb.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }

    public final void g(gb gbVar, long j10, boolean z10, eb.a aVar, ig igVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f15151f.b(new k.j(this, jElapsedRealtime, gbVar, z10, aVar, igVar), hb.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        j9.a aVar2 = new j9.a(4, false);
        aVar2.d = this.f15150e.a();
        aVar2.f12863b = gbVar;
        aVar2.f12864c = Boolean.valueOf(z10);
        m.f50301a.execute(new ia(this.f15151f, new i1(aVar2), jElapsedRealtime));
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = jCurrentTimeMillis - jElapsedRealtime;
        c9 c9Var = this.f15152g;
        int i10 = gbVar.f14663a;
        synchronized (c9Var) {
            AtomicLong atomicLong = c9Var.f6435b;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && jElapsedRealtime2 - c9Var.f6435b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            c9Var.f6434a.f(new o(0, Arrays.asList(new y5.j(24336, i10, 0, j11, jCurrentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.c(c9Var, jElapsedRealtime2, 5));
        }
    }
}
