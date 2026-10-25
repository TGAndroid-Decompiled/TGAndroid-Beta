package dc;

import a8.ah;
import a8.bh;
import a8.ch;
import a8.fg;
import a8.h0;
import a8.ig;
import a8.kg;
import a8.lg;
import a8.mg;
import a8.ng;
import a8.ob;
import a8.qb;
import a8.r1;
import a8.rb;
import a8.tg;
import a8.wg;
import a8.xg;
import a8.yg;
import a8.zg;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import m.r3;
import o6.l;
import o6.o;
import sb.g;
import sb.j;
import sb.m;
import w7.j5;
public final class f extends sb.e {
    public static final l6.c[] f8322k = {j.f48056c};
    public static final yb.a f8323l = yb.a.f52508a;
    public final Context d;
    public final cc.e e;
    public final kg f8324f;
    public final mg f8325g;
    public boolean h = true;
    public boolean f8326i;
    public wg f8327j;

    public f(g gVar, cc.e eVar, kg kgVar, mg mgVar) {
        l.i(gVar, "MlKitContext can not be null");
        l.i(eVar, "SubjectSegmenterOptions can not be null");
        this.d = gVar.b();
        this.e = eVar;
        this.f8324f = kgVar;
        this.f8325g = mgVar;
    }

    @Override
    public final synchronized void b() {
        IInterface aVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            l6.c[] cVarArr = f8322k;
            if (!j.a(context, cVarArr)) {
                if (!this.f8326i) {
                    j.c(this.d, cVarArr);
                    this.f8326i = true;
                }
                f(qb.OPTIONAL_MODULE_NOT_AVAILABLE, elapsedRealtime);
                throw new ob.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.f8327j == null) {
                    IBinder b10 = z6.e.c(this.d, z6.e.f52676b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i10 = yg.f997a;
                    if (b10 == null) {
                        aVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        if (queryLocalInterface instanceof zg) {
                            aVar = (zg) queryLocalInterface;
                        } else {
                            aVar = new a8.a(b10, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 0);
                        }
                    }
                    y6.b bVar = new y6.b(this.d);
                    this.e.getClass();
                    cc.e eVar = this.e;
                    this.f8327j = ((xg) aVar).V0(bVar, new ch(false, eVar.f6192a, eVar.f6193b, false, eVar.f6194c));
                }
                try {
                    wg wgVar = this.f8327j;
                    wgVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(wgVar.f344c);
                    wgVar.R0(obtain, 1);
                    f(qb.NO_ERROR, elapsedRealtime);
                } catch (RemoteException e) {
                    f(qb.OPTIONAL_MODULE_INIT_ERROR, elapsedRealtime);
                    throw new ob.a("Failed to init module subject segmenter", e);
                }
            } catch (Exception e10) {
                f(qb.OPTIONAL_MODULE_CREATE_ERROR, elapsedRealtime);
                throw new ob.a("Failed to load subject segmentation module", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final synchronized void c() {
        try {
            wg wgVar = this.f8327j;
            if (wgVar != null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(wgVar.f344c);
                wgVar.R0(obtain, 2);
            }
            this.f8327j = null;
        } catch (RemoteException unused) {
            Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            this.f8327j = null;
        }
        this.h = true;
        kg kgVar = this.f8324f;
        rb rbVar = rb.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE;
        kgVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (kgVar.d(rbVar, elapsedRealtime)) {
            kgVar.f584i.put(rbVar, Long.valueOf(elapsedRealtime));
            ?? obj = new Object();
            obj.f17846c = ob.TYPE_THIN;
            m.f48061a.execute(new fg(kgVar, new ng((r3) obj, 0), rbVar, kgVar.c(), 0));
        }
    }

    @Override
    public final Object e(xb.a aVar) {
        Throwable th2;
        y6.b bVar;
        f fVar;
        xb.a aVar2;
        synchronized (this) {
            try {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    wg wgVar = this.f8327j;
                    l.h(wgVar);
                    tg tgVar = new tg(aVar.e, aVar.f51705b, aVar.f51706c, SystemClock.elapsedRealtime(), j5.a(aVar.d));
                    int i10 = aVar.e;
                    try {
                        if (i10 != -1) {
                            if (i10 != 17) {
                                if (i10 != 35) {
                                    if (i10 != 842094169) {
                                        int i11 = aVar.e;
                                        throw new ob.a("Unsupported image format: " + i11, 3);
                                    }
                                } else {
                                    bVar = new y6.b(null);
                                }
                            }
                            l.h(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.f51704a;
                        l.h(bitmap);
                        bVar = new y6.b(bitmap);
                        try {
                            bh V0 = wgVar.V0(bVar, tgVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.e.f6193b) {
                                for (ah ahVar : V0.f376a) {
                                    float[] fArr = ahVar.f361a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new cc.a(ahVar.f362b, ahVar.f363c, ahVar.d, ahVar.e, ahVar.f364f));
                                }
                            }
                            fVar = this;
                            aVar2 = aVar;
                            try {
                                fVar.g(qb.NO_ERROR, elapsedRealtime, this.h, aVar2, V0);
                                fVar.h = false;
                                float[] fArr2 = V0.f377b;
                                if (fArr2 != null) {
                                    try {
                                        try {
                                            FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                                            allocate2.put(fArr2);
                                            allocate2.rewind();
                                        } catch (RemoteException e) {
                                            e = e;
                                            fVar.g(qb.OPTIONAL_MODULE_INFERENCE_ERROR, elapsedRealtime, fVar.h, aVar2, null);
                                            throw new ob.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e10) {
                                        e = e10;
                                    }
                                }
                                return new cc.b(arrayList);
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

    public final void f(qb qbVar, long j10) {
        this.f8324f.b(new e(this, qbVar, j10), rb.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }

    public final void g(qb qbVar, long j10, boolean z10, xb.a aVar, bh bhVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f8324f.b(new d(this, elapsedRealtime, qbVar, z10, aVar, bhVar), rb.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        h0 h0Var = new h0(2, false);
        h0Var.d = this.e.a();
        h0Var.f511b = qbVar;
        h0Var.f512c = Boolean.valueOf(z10);
        m.f48061a.execute(new ig(this.f8324f, new r1(h0Var), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - elapsedRealtime;
        mg mgVar = this.f8325g;
        int i10 = qbVar.f754a;
        synchronized (mgVar) {
            AtomicLong atomicLong = mgVar.f618b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - mgVar.f618b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            mgVar.f617a.f(new o(0, Arrays.asList(new o6.j(24336, i10, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new lg(mgVar, elapsedRealtime2, 0));
        }
    }
}
