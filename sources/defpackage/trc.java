package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
public final class trc implements po6, ts4, rw6 {
    public static final int[] f = {-16106272, -16754689, -14779393, -13326081, -10235137, -6559233};
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public final Object e;

    public trc(android.content.Context r23, defpackage.th8 r24, final defpackage.y70 r25, boolean r26, int r27, defpackage.ylb r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.trc.<init>(android.content.Context, th8, y70, boolean, int, ylb):void");
    }

    public final void A(float f2, float f3) {
        float f4 = gm.p;
        k(f2, f3, y(0.0f, 6.2831855f), y(0.0f, 28.0f) * f4, y(1.5f, 3.5f) * f4, y(0.35f, 0.6f), 2.0f);
    }

    public final void B(int i) {
        if (System.currentTimeMillis() - this.a < 200) {
            gm.c3(new eh(this, i, (byte) 7));
            return;
        }
        a8 a8Var = (a8) this.c;
        if (i == 0) {
            a8Var.setVisibility(8);
        } else {
            a8Var.setVisibility(0);
        }
    }

    public final void C() {
        String str;
        Uri uri;
        long j;
        Uri uri2;
        jt6 jt6Var;
        Uri uri3;
        ly6 ly6Var = (ly6) this.e;
        tx6 tx6Var = ly6Var.j;
        tx6Var.t();
        cf8 cf8Var = tx6Var.t;
        bt6 S0 = cf8Var.S0();
        jt6 U0 = cf8Var.U0();
        long j2 = -9223372036854775807L;
        if ((!cf8Var.m0(16) || !cf8Var.P0()) && cf8Var.m0(16)) {
            j2 = cf8Var.getDuration();
        }
        if (S0 != null) {
            str = S0.a;
        } else {
            str = "";
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (S0 != null && (uri3 = S0.f.a) != null) {
            uri = uri3;
        } else {
            uri = null;
        }
        if (Objects.equals((jt6) this.b, U0) && Objects.equals((String) this.c, str2) && Objects.equals((Uri) this.d, uri) && this.a == j2) {
            return;
        }
        this.c = str2;
        this.d = uri;
        this.b = U0;
        this.a = j2;
        t76 F = tx6Var.m.F(U0);
        if (F != null) {
            ly6Var.u = null;
            if (F.isDone()) {
                try {
                    bitmap = (Bitmap) kke.a(F);
                } catch (CancellationException | ExecutionException e) {
                    ncd.f("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
                }
            } else {
                j = j2;
                uri2 = uri;
                jt6Var = U0;
                trc trcVar = new trc(this, jt6Var, str2, uri2, j);
                str2 = str2;
                ly6Var.u = trcVar;
                Handler handler = tx6Var.l;
                Objects.requireNonNull(handler);
                F.b(new us4(F, trcVar, (byte) 0), new g50(handler, (byte) 1));
                ly6Var.p.O(j26.b(jt6Var, str2, uri2, j, bitmap));
            }
        }
        j = j2;
        uri2 = uri;
        jt6Var = U0;
        ly6Var.p.O(j26.b(jt6Var, str2, uri2, j, bitmap));
    }

    public final void D(bqb bqbVar) {
        ly6 ly6Var = (ly6) this.e;
        tx6 tx6Var = ly6Var.j;
        if (ly6Var.l0() && !bqbVar.p()) {
            int i = j26.a;
            ArrayList arrayList = new ArrayList();
            aqb aqbVar = new aqb();
            for (int i2 = 0; i2 < bqbVar.o(); i2++) {
                arrayList.add(bqbVar.m(i2, aqbVar, 0L).b);
            }
            ArrayList arrayList2 = new ArrayList();
            jy6 jy6Var = new jy6(this, new AtomicInteger(0), arrayList, arrayList2, (byte) 0);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                byte[] bArr = ((bt6) arrayList.get(i3)).d.k;
                if (bArr == null) {
                    arrayList2.add(null);
                    jy6Var.run();
                } else {
                    t76 N = tx6Var.m.N(bArr);
                    arrayList2.add(N);
                    Handler handler = tx6Var.l;
                    Objects.requireNonNull(handler);
                    N.b(jy6Var, new g50(handler, (byte) 1));
                }
            }
            return;
        }
        ly6Var.p.Q(null);
    }

    @Override
    public final void a(int i, r7a r7aVar) {
        Bundle bundle = Bundle.EMPTY;
        boolean isEmpty = bundle.isEmpty();
        Bundle bundle2 = r7aVar.c;
        if (isEmpty) {
            bundle = bundle2;
        } else if (!bundle2.isEmpty()) {
            Bundle bundle3 = new Bundle(bundle2);
            bundle3.putAll(bundle);
            bundle = bundle3;
        }
        lx6 lx6Var = ((ly6) this.e).p;
        String str = r7aVar.b;
        lx6Var.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((bx6) lx6Var.b).a.sendSessionEvent(str, bundle);
        } else {
            u36.j("event cannot be null or empty");
        }
    }

    @Override
    public final void f(int i, ne8 ne8Var) {
        byte b;
        ly6 ly6Var = (ly6) this.e;
        tx6 tx6Var = ly6Var.j;
        tx6Var.t();
        cf8 cf8Var = tx6Var.t;
        if (cf8Var.m0(20)) {
            b = 4;
        } else {
            b = 0;
        }
        if (ly6Var.v != b) {
            ly6Var.v = b;
            ((bx6) ly6Var.p.b).a.setFlags(b | 3);
        }
        ly6Var.q0(cf8Var);
    }

    @Override
    public final void i(int i, n8a n8aVar, boolean z, boolean z2, int i2) {
        ly6 ly6Var = (ly6) this.e;
        tx6 tx6Var = ly6Var.j;
        tx6Var.t();
        ly6Var.q0(tx6Var.t);
    }

    @Override
    public final void j(Throwable th) {
        if (this != ((ly6) ((trc) this.e).e).u) {
            return;
        }
        ncd.f("MediaSessionLegacyStub", "Failed to load bitmap: " + th.getMessage());
    }

    public final src k(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            this.a = SystemClock.uptimeMillis();
        }
        ?? obj = new Object();
        obj.l = 1.0f;
        obj.a = f2;
        obj.b = f3;
        double d = f4;
        obj.c = ((float) Math.cos(d)) * f5;
        obj.d = ((float) Math.sin(d)) * f5;
        obj.e = f6;
        obj.f = f7;
        obj.g = f8;
        obj.k = f[((Random) this.c).nextInt(6)];
        obj.h = y(0.0f, 90.0f);
        obj.i = y(-180.0f, 180.0f);
        arrayList.add(obj);
        return obj;
    }

    public final void l(float f2, float f3) {
        float f4 = gm.p;
        for (int i = 0; i < 28; i++) {
            k(f2, f3, y(0.0f, 6.2831855f), y(60.0f, 300.0f) * f4, y(2.5f, 6.0f) * f4, y(0.5f, 0.9f), 3.0f);
        }
    }

    public final boolean m() {
        return ((rcc) this.b).V;
    }

    public final void n(long j, float f2) {
        long j2;
        File file = (File) this.c;
        rcc rccVar = (rcc) this.b;
        if (!rccVar.V) {
            if (j < 0) {
                j2 = file.length();
            } else {
                j2 = j;
            }
            if (!rccVar.X && this.a == j2) {
                return;
            }
            this.a = j2;
            MediaController mediaController = (MediaController) this.e;
            oo6 oo6Var = (oo6) this.d;
            String[] strArr = MediaController.W1;
            rcc rccVar2 = oo6Var.b;
            boolean z = rccVar2.W;
            if (z) {
                rccVar2.W = false;
            }
            gm.c3(new en6(mediaController, false, false, oo6Var, file, f2, 0L, z, j2));
        }
    }

    public final void o() {
        ((y70) this.d).dismiss();
        this.a = System.currentTimeMillis();
    }

    @Override
    public final void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ly6 ly6Var = (ly6) ((trc) this.e).e;
        if (this != ly6Var.u) {
            return;
        }
        ly6Var.p.O(j26.b((jt6) this.b, (String) this.c, (Uri) this.d, this.a, bitmap));
        tx6 tx6Var = ly6Var.j;
        hac.X(tx6Var.o, new nx6(tx6Var, (byte) 0));
    }

    public final void p(Canvas canvas) {
        Paint paint = (Paint) this.d;
        long uptimeMillis = SystemClock.uptimeMillis();
        float min = Math.min(0.033f, ((float) (uptimeMillis - this.a)) / 1000.0f);
        this.a = uptimeMillis;
        ArrayList arrayList = (ArrayList) this.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            src srcVar = (src) arrayList.get(size);
            float f2 = srcVar.j + min;
            srcVar.j = f2;
            if (f2 >= 0.0f) {
                if (f2 >= srcVar.f) {
                    arrayList.remove(size);
                } else {
                    float exp = (float) Math.exp((-srcVar.g) * min);
                    float f3 = srcVar.c * exp;
                    srcVar.c = f3;
                    float f4 = srcVar.d * exp;
                    srcVar.d = f4;
                    srcVar.a = (f3 * min) + srcVar.a;
                    srcVar.b = (f4 * min) + srcVar.b;
                    srcVar.h = (srcVar.i * min) + srcVar.h;
                    float f5 = srcVar.j / srcVar.f;
                    float max = Math.max(0.0f, Math.min(1.0f, (f5 - 0.35f) / 0.65f));
                    float min2 = (1.0f - ((3.0f - (max * 2.0f)) * (max * max))) * Math.min(1.0f, 8.0f * f5) * srcVar.l;
                    float B = mlb.B(f5, 0.5f, 1.0f, srcVar.e);
                    int save = canvas.save();
                    canvas.translate(srcVar.a, srcVar.b);
                    canvas.rotate(srcVar.h);
                    canvas.scale(B, B);
                    paint.setColor(srcVar.k);
                    paint.setAlpha(Math.round(20.4f * min2));
                    canvas.drawCircle(0.0f, 0.0f, 1.4f, paint);
                    paint.setAlpha(Math.round(min2 * 255.0f));
                    canvas.drawPath((Path) this.e, paint);
                    canvas.restoreToCount(save);
                }
            }
        }
    }

    public final boolean q() {
        return !((ArrayList) this.b).isEmpty();
    }

    public final void r() {
        o00 o00Var;
        ly6 ly6Var = (ly6) this.e;
        tx6 tx6Var = ly6Var.j;
        tx6Var.t();
        cf8 cf8Var = tx6Var.t;
        cf8Var.H().getClass();
        lx6 lx6Var = ly6Var.p;
        if (cf8Var.m0(21)) {
            o00Var = cf8Var.F();
        } else {
            o00Var = o00.i;
        }
        ((bx6) lx6Var.b).a.setPlaybackToLocal(o00Var.b());
    }

    public final void s(bt6 bt6Var) {
        C();
        ly6 ly6Var = (ly6) this.e;
        lx6 lx6Var = ly6Var.p;
        if (bt6Var == null) {
            ((bx6) lx6Var.b).a.setRatingType(0);
        } else {
            ((bx6) lx6Var.b).a.setRatingType(j26.e(bt6Var.d.i));
        }
        tx6 tx6Var = ly6Var.j;
        tx6Var.t();
        ly6Var.q0(tx6Var.t);
    }

    public final void t(int i, cf8 cf8Var) {
        jt6 jt6Var;
        byte b;
        ly6 ly6Var = (ly6) this.e;
        x(cf8Var.T0());
        if (cf8Var.m0(18)) {
            jt6Var = cf8Var.g0();
        } else {
            jt6Var = jt6.M;
        }
        u(jt6Var);
        cf8Var.U0();
        C();
        w(cf8Var.F0());
        v(cf8Var.x0());
        cf8Var.H();
        r();
        if (cf8Var.m0(20)) {
            b = 4;
        } else {
            b = 0;
        }
        if (ly6Var.v != b) {
            ly6Var.v = b;
            ((bx6) ly6Var.p.b).a.setFlags(b | 3);
        }
        s(cf8Var.S0());
    }

    public final void u(jt6 jt6Var) {
        ly6 ly6Var = (ly6) this.e;
        lx6 lx6Var = ly6Var.p;
        CharSequence queueTitle = ((to6) ((lj4) lx6Var.c).a).a.getQueueTitle();
        CharSequence charSequence = jt6Var.a;
        if (!TextUtils.equals(queueTitle, charSequence)) {
            if (!ly6Var.l0()) {
                charSequence = null;
            }
            ((bx6) lx6Var.b).a.setQueueTitle(charSequence);
        }
    }

    public final void v(int i) {
        lx6 lx6Var = ((ly6) this.e).p;
        int i2 = j26.a;
        byte b = 0;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ncd.f("LegacyConversions", "Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                } else {
                    b = 2;
                }
            } else {
                b = 1;
            }
        }
        bx6 bx6Var = (bx6) lx6Var.b;
        if (bx6Var.j != b) {
            bx6Var.j = b;
            synchronized (bx6Var.d) {
                int beginBroadcast = bx6Var.f.beginBroadcast() - 1;
                while (true) {
                    RemoteCallbackList remoteCallbackList = bx6Var.f;
                    if (beginBroadcast >= 0) {
                        try {
                            ((gk5) remoteCallbackList.getBroadcastItem(beginBroadcast)).g(b);
                        } catch (RemoteException | SecurityException e) {
                            ncd.d("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                        }
                        beginBroadcast--;
                    } else {
                        remoteCallbackList.finishBroadcast();
                    }
                }
            }
        }
    }

    public final void w(boolean z) {
        lx6 lx6Var = ((ly6) this.e).p;
        int i = j26.a;
        bx6 bx6Var = (bx6) lx6Var.b;
        if (bx6Var.k != z) {
            bx6Var.k = z ? 1 : 0;
            synchronized (bx6Var.d) {
                int beginBroadcast = bx6Var.f.beginBroadcast() - 1;
                while (true) {
                    RemoteCallbackList remoteCallbackList = bx6Var.f;
                    if (beginBroadcast >= 0) {
                        try {
                            ((gk5) remoteCallbackList.getBroadcastItem(beginBroadcast)).i(z ? 1 : 0);
                        } catch (RemoteException | SecurityException e) {
                            ncd.d("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                        }
                        beginBroadcast--;
                    } else {
                        remoteCallbackList.finishBroadcast();
                    }
                }
            }
        }
    }

    public final void x(bqb bqbVar) {
        D(bqbVar);
        C();
    }

    public final float y(float f2, float f3) {
        return td4.A(f3, f2, ((Random) this.c).nextFloat(), f2);
    }

    public final void z() {
        float f2;
        ((ArrayList) this.b).clear();
        float f3 = gm.p;
        for (int i = 0; i < 48; i++) {
            int i2 = -1;
            while (i2 <= 1) {
                if (i2 < 0) {
                    f2 = 3.1415927f;
                } else {
                    f2 = 0.0f;
                }
                trc trcVar = this;
                src k = trcVar.k(0.0f, (this.y(-3.0f, 3.0f) * f3) + 0.0f, this.y(-0.6f, 0.6f) + f2, this.y(150.0f, 310.0f) * f3, this.y(1.3f, 3.2f) * f3, this.y(0.65f, 1.05f), 1.8f);
                k.k = -6562049;
                k.l = trcVar.y(0.3f, 1.0f);
                k.j = (-i) * 0.006f;
                i2 += 2;
                this = trcVar;
            }
        }
    }

    @Override
    public final void e() {
    }

    @Override
    public final void b(int i) {
    }

    @Override
    public final void d(int i, q26 q26Var) {
    }

    @Override
    public final void g(int i, q8a q8aVar) {
    }

    @Override
    public final void c(int i, int i2, int i3) {
    }

    @Override
    public final void h(int i, ye8 ye8Var, ne8 ne8Var, boolean z, boolean z2) {
    }

    public trc() {
        this.b = new ArrayList();
        this.c = new Random();
        this.d = new Paint(1);
        Path path = new Path();
        this.e = path;
        path.moveTo(0.0f, -1.0f);
        path.quadTo(0.12f, -0.12f, 1.0f, 0.0f);
        path.quadTo(0.12f, 0.12f, 0.0f, 1.0f);
        path.quadTo(-0.12f, 0.12f, -1.0f, 0.0f);
        path.quadTo(-0.12f, -0.12f, 0.0f, -1.0f);
        path.close();
    }

    public trc(ly6 ly6Var) {
        this.e = ly6Var;
        this.b = jt6.M;
        this.c = "";
        this.a = -9223372036854775807L;
    }

    public trc(trc trcVar, jt6 jt6Var, String str, Uri uri, long j) {
        this.e = trcVar;
        this.b = jt6Var;
        this.c = str;
        this.d = uri;
        this.a = j;
    }

    public trc(MediaController mediaController, rcc rccVar, File file, oo6 oo6Var) {
        this.e = mediaController;
        this.b = rccVar;
        this.c = file;
        this.d = oo6Var;
        this.a = 0L;
    }
}
