package bf;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import c2.n;
import c2.t0;
import c2.z;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.internal.cast.c1;
import com.google.android.gms.internal.cast.c2;
import com.google.android.gms.internal.cast.l1;
import com.google.android.gms.internal.cast.m1;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.internal.cast.q1;
import com.google.android.gms.internal.cast.r1;
import com.google.android.gms.internal.cast.t6;
import com.google.android.gms.internal.cast.u6;
import com.google.android.gms.internal.cast.x0;
import com.google.android.gms.internal.cast.z0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.m;
import com.google.firebase.messaging.t;
import g7.b9;
import g7.e7;
import g7.e8;
import g7.f8;
import g7.i9;
import g7.k9;
import g7.l6;
import g7.m9;
import i7.ka;
import i7.n9;
import i7.q;
import i7.s;
import i7.t7;
import i7.ua;
import i7.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.hb;
import k7.i;
import k7.l4;
import k7.we;
import k7.wf;
import l.f;
import m.t3;
import m5.k;
import m5.r;
import o5.h;
import org.telegram.ui.i6;
import r0.r0;
import r0.w0;
import y5.l;

public final class e implements Runnable {

    public final int f2084a;

    public final Object f2085b;

    public final Object f2086c;
    public final Object d;

    public final Object f2087e;

    public e(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f2084a = i10;
        this.f2087e = obj;
        this.f2085b = obj2;
        this.f2086c = obj3;
        this.d = obj4;
    }

    private final void a() {
        String str;
        w wVar;
        ka kaVar = (ka) this.f2085b;
        b6.a aVar = (b6.a) this.f2086c;
        t7 t7Var = (t7) this.d;
        String str2 = (String) this.f2087e;
        m mVar = (m) aVar.f2033b;
        mVar.f4603b = t7Var;
        n9 n9Var = (n9) mVar.f4602a;
        if (n9Var != null) {
            str = n9Var.d;
            int i10 = ua.f10857a;
            if (str == null || str.isEmpty()) {
                str = "NA";
            }
        } else {
            str = "NA";
        }
        e8 e8Var = new e8();
        e8Var.f6455a = kaVar.f10708a;
        e8Var.f6456b = kaVar.f10709b;
        synchronized (ka.class) {
            wVar = ka.f10706k;
            if (wVar == null) {
                n0.c cVarA = h7.w.a(Resources.getSystem().getConfiguration());
                Object[] objArrCopyOf = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < cVarA.f18075a.size()) {
                    Locale locale = cVarA.f18075a.get(i11);
                    c9.b bVar = za.c.f50281a;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i13 = i12 + 1;
                    int length = objArrCopyOf.length;
                    if (length < i13) {
                        int i14 = length + (length >> 1) + 1;
                        if (i14 < i13) {
                            int iHighestOneBit = Integer.highestOneBit(i12);
                            i14 = iHighestOneBit + iHighestOneBit;
                        }
                        if (i14 < 0) {
                            i14 = Integer.MAX_VALUE;
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i14);
                    }
                    objArrCopyOf[i12] = languageTag;
                    i11++;
                    i12 = i13;
                }
                q qVar = s.f10800b;
                wVar = i12 == 0 ? w.f10864e : new w(i12, objArrCopyOf);
                ka.f10706k = wVar;
            }
        }
        e8Var.f6463k = wVar;
        e8Var.f6460g = Boolean.TRUE;
        e8Var.d = str;
        e8Var.f6457c = str2;
        e8Var.f6458e = kaVar.f10712f.isSuccessful() ? (String) kaVar.f10712f.getResult() : kaVar.d.a();
        e8Var.f6461i = 10;
        e8Var.f6462j = Integer.valueOf(kaVar.h);
        aVar.d = e8Var;
        kaVar.f10710c.a(aVar);
    }

    private final void b() {
        String str;
        k7.m mVarR;
        wf wfVar = (wf) this.f2085b;
        b6.a aVar = (b6.a) this.f2086c;
        hb hbVar = (hb) this.d;
        String str2 = (String) this.f2087e;
        t3 t3Var = (t3) aVar.f2033b;
        t3Var.f17474b = hbVar;
        we weVar = (we) t3Var.f17473a;
        if (weVar != null) {
            str = weVar.d;
            int i10 = l4.f14866a;
            if (str == null || str.isEmpty()) {
                str = "NA";
            }
        } else {
            str = "NA";
        }
        e8 e8Var = new e8();
        e8Var.f6455a = wfVar.f15020a;
        e8Var.f6456b = wfVar.f15021b;
        synchronized (wf.class) {
            mVarR = wf.f15018k;
            if (mVarR == null) {
                n0.c cVarA = h7.w.a(Resources.getSystem().getConfiguration());
                Object[] objArrCopyOf = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < cVarA.f18075a.size()) {
                    Locale locale = cVarA.f18075a.get(i11);
                    c9.b bVar = za.c.f50281a;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i13 = i12 + 1;
                    int length = objArrCopyOf.length;
                    if (length < i13) {
                        int i14 = length + (length >> 1) + 1;
                        if (i14 < i13) {
                            int iHighestOneBit = Integer.highestOneBit(i12);
                            i14 = iHighestOneBit + iHighestOneBit;
                        }
                        if (i14 < 0) {
                            i14 = Integer.MAX_VALUE;
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i14);
                    }
                    objArrCopyOf[i12] = languageTag;
                    i11++;
                    i12 = i13;
                }
                mVarR = i.r(i12, objArrCopyOf);
                wf.f15018k = mVarR;
            }
        }
        e8Var.f6463k = mVarR;
        e8Var.f6460g = Boolean.TRUE;
        e8Var.d = str;
        e8Var.f6457c = str2;
        e8Var.f6458e = wfVar.f15024f.isSuccessful() ? (String) wfVar.f15024f.getResult() : wfVar.d.a();
        e8Var.f6461i = 10;
        e8Var.f6462j = Integer.valueOf(wfVar.h);
        aVar.d = e8Var;
        wfVar.f15022c.a(aVar);
    }

    @Override
    public final void run() {
        int i10;
        Task task;
        String str;
        m9 m9Var;
        m5.s sVar = null;
        int i11 = 0;
        switch (this.f2084a) {
            case 0:
                Handler handler = (Handler) this.f2085b;
                if (((AtomicBoolean) this.f2087e).compareAndSet(false, true)) {
                    handler.removeCallbacks((a1.e) this.d);
                    if (Looper.myLooper() == handler.getLooper()) {
                        ((af.b) this.f2086c).a(false);
                        return;
                    } else {
                        handler.post(new af.e(this, 14));
                        return;
                    }
                }
                return;
            case 1:
                ((a9.i) this.f2085b).O((c2.q) this.f2087e, (n) this.f2086c, (Collection) this.d);
                return;
            case 2:
                ((a9.i) this.f2085b).O((c2.q) this.f2087e, (n) this.f2086c, (ArrayList) this.d);
                return;
            case 3:
                o oVar = (o) this.f2085b;
                z zVar = (z) this.f2086c;
                z zVar2 = (z) this.d;
                c0.i iVar = (c0.i) this.f2087e;
                com.google.android.gms.internal.cast.s sVar2 = oVar.f3599a;
                sVar2.getClass();
                r5.b bVar = com.google.android.gms.internal.cast.s.f3644i;
                Set set = sVar2.f3646b;
                if (new HashSet(set).isEmpty()) {
                    bVar.b("No need to prepare transfer without any callback", new Object[0]);
                    iVar.a();
                    return;
                }
                if (zVar.f2399l != 1) {
                    bVar.b("No need to prepare transfer when transferring from local", new Object[0]);
                    iVar.a();
                    return;
                }
                h hVarA = sVar2.a();
                if (hVarA == null || !hVarA.h()) {
                    bVar.b("No need to prepare transfer when there is no media session", new Object[0]);
                    iVar.a();
                    return;
                }
                bVar.b("Prepare route transfer for changing endpoint", new Object[0]);
                if (zVar2.f2399l == 0) {
                    c2.a(c1.CAST_TRANSFER_TO_LOCAL_USED);
                    i10 = 1;
                } else {
                    i10 = CastDevice.b(zVar2.f2406s) == null ? 3 : 2;
                }
                sVar2.f3648e = i10;
                sVar2.f3650g = iVar;
                bVar.b("notify transferring with type = %d", Integer.valueOf(i10));
                for (x0 x0Var : new HashSet(set)) {
                    int i12 = sVar2.f3648e;
                    switch (x0Var.f3704a) {
                        case 0:
                            z0.f3755j.b("onTransferring with type = %d", Integer.valueOf(i12));
                            z0 z0Var = (z0) x0Var.f3705b;
                            z0Var.f3762i = true;
                            z0Var.c();
                            q1 q1VarB = z0Var.f3758c.b(z0Var.f3761g);
                            l1 l1VarM = m1.m(q1VarB.d());
                            l1VarM.c();
                            m1.v((m1) l1VarM.f3502b, i12);
                            q1VarB.e((m1) l1VarM.a());
                            z0Var.f3756a.a((r1) q1VarB.a(), 230);
                            break;
                        default:
                            b6.a aVar = new b6.a(10, 3);
                            af.h hVar = (af.h) x0Var.f3705b;
                            aVar.d = Boolean.valueOf(((com.google.android.gms.internal.cast.d) hVar.f275b).d == 2);
                            af.h.E(hVar, new u6(aVar));
                            t6 t6VarF = hVar.F();
                            com.google.android.gms.internal.cast.b bVar2 = new com.google.android.gms.internal.cast.b(new com.google.android.gms.internal.cast.a(i12));
                            bVar2.f3445c = t6VarF.h;
                            t6VarF.f3667c.add(bVar2);
                            break;
                    }
                }
                sVar2.h = null;
                l.e("Must be called from the main thread.");
                if (hVarA.w()) {
                    hVarA.f19336g = new TaskCompletionSource();
                    h.f19330k.b("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
                    MediaInfo mediaInfoD = hVarA.d();
                    r rVarE = hVarA.e();
                    if (mediaInfoD != null && rVarE != null) {
                        Boolean bool = Boolean.TRUE;
                        long jA = hVarA.a();
                        m5.n nVar = rVarE.H;
                        double d = rVarE.d;
                        if (Double.compare(d, 2.0d) > 0 || Double.compare(d, 0.5d) < 0) {
                            throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                        }
                        sVar = new m5.s(new k(mediaInfoD, nVar, bool, jA, d, rVarE.v, rVarE.A, null, null, null, null, 0L), null);
                    }
                    if (sVar != null) {
                        hVarA.f19336g.setResult(sVar);
                    } else {
                        hVarA.f19336g.setException(new r5.l());
                    }
                    task = hVarA.f19336g.getTask();
                } else {
                    task = Tasks.forException(new r5.l());
                }
                task.addOnSuccessListener(new com.google.android.gms.internal.cast.q(sVar2)).addOnFailureListener(new com.google.android.gms.internal.cast.q(sVar2));
                t0 t0Var = sVar2.f3647c;
                l.h(t0Var);
                com.google.android.gms.internal.cast.r rVar = sVar2.d;
                l.h(rVar);
                t0Var.postDelayed(rVar, 10000L);
                return;
            case 4:
                b9 b9Var = (b9) this.f2085b;
                b6.a aVar2 = (b6.a) this.f2086c;
                l6 l6Var = (l6) this.d;
                String str2 = (String) this.f2087e;
                t tVar = (t) aVar2.f2033b;
                tVar.f4620c = l6Var;
                f8 f8Var = (f8) tVar.f4619b;
                if (f8Var != null) {
                    str = f8Var.d;
                    int i13 = e7.f6454a;
                    if (str == null || str.isEmpty()) {
                        str = "NA";
                    }
                } else {
                    str = "NA";
                }
                e8 e8Var = new e8();
                e8Var.f6455a = b9Var.f6420a;
                e8Var.f6456b = b9Var.f6421b;
                synchronized (b9.class) {
                    m9Var = b9.f6418j;
                    if (m9Var == null) {
                        n0.c cVarA = h7.w.a(Resources.getSystem().getConfiguration());
                        Object[] objArrCopyOf = new Object[4];
                        int i14 = 0;
                        while (i11 < cVarA.f18075a.size()) {
                            Locale locale = cVarA.f18075a.get(i11);
                            c9.b bVar3 = za.c.f50281a;
                            String languageTag = locale.toLanguageTag();
                            languageTag.getClass();
                            int i15 = i14 + 1;
                            int length = objArrCopyOf.length;
                            if (length < i15) {
                                int i16 = length + (length >> 1) + 1;
                                if (i16 < i15) {
                                    int iHighestOneBit = Integer.highestOneBit(i14);
                                    i16 = iHighestOneBit + iHighestOneBit;
                                }
                                if (i16 < 0) {
                                    i16 = Integer.MAX_VALUE;
                                }
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i16);
                            }
                            objArrCopyOf[i14] = languageTag;
                            i11++;
                            i14 = i15;
                        }
                        i9 i9Var = k9.f6537b;
                        m9Var = i14 == 0 ? m9.f6562e : new m9(i14, objArrCopyOf);
                        b9.f6418j = m9Var;
                    }
                }
                e8Var.f6463k = m9Var;
                e8Var.f6460g = Boolean.TRUE;
                e8Var.d = str;
                e8Var.f6457c = str2;
                e8Var.f6458e = b9Var.f6424f.isSuccessful() ? (String) b9Var.f6424f.getResult() : b9Var.d.a();
                e8Var.f6461i = 10;
                e8Var.f6462j = Integer.valueOf(b9Var.h);
                aVar2.d = e8Var;
                b9Var.f6422c.a(aVar2);
                return;
            case 5:
                a();
                return;
            case 6:
                b();
                return;
            case 7:
                f fVar = (f) ((a9.i) this.f2087e).f181b;
                l.n nVar2 = (l.n) this.f2086c;
                l.e eVar = (l.e) this.f2085b;
                if (eVar != null) {
                    fVar.L = true;
                    eVar.f15284b.c(false);
                    fVar.L = false;
                }
                if (nVar2.isEnabled() && nVar2.hasSubMenu()) {
                    ((l.l) this.d).q(nVar2, null, 4);
                    return;
                }
                return;
            default:
                r0.h((View) this.f2085b, (w0) this.f2086c, (i6) this.d);
                ((ValueAnimator) this.f2087e).start();
                return;
        }
    }

    public e(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f2084a = i10;
        this.f2085b = obj;
        this.f2086c = obj2;
        this.d = obj3;
        this.f2087e = obj4;
    }

    public e(Handler handler, af.b bVar, long j10) {
        this.f2084a = 0;
        this.f2087e = new AtomicBoolean(false);
        this.f2085b = handler;
        this.f2086c = bVar;
        a1.e eVar = new a1.e(11, this, bVar);
        this.d = eVar;
        if (j10 > 0) {
            handler.postDelayed(eVar, j10);
        }
    }
}
