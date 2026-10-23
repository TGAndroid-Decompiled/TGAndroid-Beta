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
import w7.p8;
import x7.da;
import z7.bg;
import z7.eg;
import z7.fb;
import z7.fg;
import z7.gb;
import z7.gg;
import z7.hb;
import z7.hg;
import z7.i1;
import z7.ig;
import z7.jg;
import z7.kg;
import z7.wf;
import z7.xf;
public final class f extends rb.e {
    public static final k6.c[] f5099k = {j.f45618c};
    public static final xb.a f5100l = xb.a.f50210a;
    public final Context d;
    public final bc.e e;
    public final wf f5101f;
    public final xf f5102g;
    public boolean h = true;
    public boolean f5103i;
    public eg f5104j;

    public f(g gVar, bc.e eVar, wf wfVar, xf xfVar) {
        l.i(gVar, "MlKitContext can not be null");
        l.i(eVar, "SubjectSegmenterOptions can not be null");
        this.d = gVar.b();
        this.e = eVar;
        this.f5101f = wfVar;
        this.f5102g = xfVar;
    }

    @Override
    public final synchronized void b() {
        IInterface aVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            k6.c[] cVarArr = f5099k;
            if (!j.a(context, cVarArr)) {
                if (!this.f5103i) {
                    j.c(this.d, cVarArr);
                    this.f5103i = true;
                }
                f(gb.OPTIONAL_MODULE_NOT_AVAILABLE, elapsedRealtime);
                throw new nb.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.f5104j == null) {
                    IBinder b10 = y6.e.c(this.d, y6.e.f50399b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i10 = gg.f51362a;
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
                    this.e.getClass();
                    bc.e eVar = this.e;
                    this.f5104j = ((fg) aVar).V0(bVar, new kg(false, eVar.f4256a, eVar.f4257b, false, eVar.f4258c));
                }
                try {
                    eg egVar = this.f5104j;
                    egVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(egVar.f318c);
                    egVar.R0(obtain, 1);
                    f(gb.NO_ERROR, elapsedRealtime);
                } catch (RemoteException e) {
                    f(gb.OPTIONAL_MODULE_INIT_ERROR, elapsedRealtime);
                    throw new nb.a("Failed to init module subject segmenter", e);
                }
            } catch (Exception e7) {
                f(gb.OPTIONAL_MODULE_CREATE_ERROR, elapsedRealtime);
                throw new nb.a("Failed to load subject segmentation module", e7);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final synchronized void c() {
        try {
            eg egVar = this.f5104j;
            if (egVar != null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(egVar.f318c);
                egVar.R0(obtain, 2);
            }
            this.f5104j = null;
        } catch (RemoteException unused) {
            Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            this.f5104j = null;
        }
        this.h = true;
        wf wfVar = this.f5101f;
        hb hbVar = hb.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE;
        wfVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (wfVar.d(hbVar, elapsedRealtime)) {
            wfVar.f51707i.put(hbVar, Long.valueOf(elapsedRealtime));
            ?? obj = new Object();
            obj.f16399c = fb.TYPE_THIN;
            m.f45623a.execute(new p(wfVar, new a5.a((s3) obj, 0), hbVar, wfVar.c(), 8));
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
                    eg egVar = this.f5104j;
                    l.h(egVar);
                    bg bgVar = new bg(aVar.e, aVar.f49346b, aVar.f49347c, SystemClock.elapsedRealtime(), p8.a(aVar.d));
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
                        Bitmap bitmap = aVar.f49345a;
                        l.h(bitmap);
                        bVar = new x6.b(bitmap);
                        try {
                            jg V0 = egVar.V0(bVar, bgVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.e.f4257b) {
                                for (ig igVar : V0.f51538a) {
                                    float[] fArr = igVar.f51523a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new bc.a(igVar.f51524b, igVar.f51525c, igVar.d, igVar.e, igVar.f51526f));
                                }
                            }
                            fVar = this;
                            aVar2 = aVar;
                            try {
                                fVar.g(gb.NO_ERROR, elapsedRealtime, this.h, aVar2, V0);
                                fVar.h = false;
                                float[] fArr2 = V0.f51539b;
                                if (fArr2 != null) {
                                    try {
                                        try {
                                            FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                                            allocate2.put(fArr2);
                                            allocate2.rewind();
                                        } catch (RemoteException e) {
                                            e = e;
                                            fVar.g(gb.OPTIONAL_MODULE_INFERENCE_ERROR, elapsedRealtime, fVar.h, aVar2, null);
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

    public final void f(gb gbVar, long j10) {
        this.f5101f.b(new e(this, gbVar, j10), hb.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }

    public final void g(gb gbVar, long j10, boolean z10, wb.a aVar, jg jgVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f5101f.b(new d(this, elapsedRealtime, gbVar, z10, aVar, jgVar), hb.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        u2.c cVar = new u2.c(17, false);
        cVar.d = this.e.a();
        cVar.f47712b = gbVar;
        cVar.f47713c = Boolean.valueOf(z10);
        m.f45623a.execute(new da(this.f5101f, new i1(cVar), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - elapsedRealtime;
        xf xfVar = this.f5102g;
        int i10 = gbVar.f51361a;
        synchronized (xfVar) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (((AtomicLong) xfVar.f51724b).get() != -1 && elapsedRealtime2 - ((AtomicLong) xfVar.f51724b).get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            ((p6.b) xfVar.f51723a).f(new o(0, Arrays.asList(new n6.j(24336, i10, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new ad.d(xfVar, elapsedRealtime2, 10));
        }
    }
}
