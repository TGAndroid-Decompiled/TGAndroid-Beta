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
public final class spc implements pm6, sq4, ru6 {
    public static final int[] f = {-16106272, -16754689, -14779393, -13326081, -10235137, -6559233};
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public final Object e;

    public spc(android.content.Context r23, defpackage.rf8 r24, final defpackage.y60 r25, boolean r26, int r27, defpackage.wjb r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spc.<init>(android.content.Context, rf8, y60, boolean, int, wjb):void");
    }

    public final void A(float f2, float f3) {
        float f4 = gl.p;
        j(f2, f3, y(0.0f, 6.2831855f), y(0.0f, 28.0f) * f4, y(1.5f, 3.5f) * f4, y(0.35f, 0.6f), 2.0f);
    }

    public final void B(int i) {
        if (System.currentTimeMillis() - this.a < 200) {
            gl.d3(new eg(this, i, (byte) 7));
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
        jr6 jr6Var;
        Uri uri3;
        lw6 lw6Var = (lw6) this.e;
        tv6 tv6Var = lw6Var.j;
        tv6Var.t();
        ad8 ad8Var = tv6Var.t;
        br6 S0 = ad8Var.S0();
        jr6 U0 = ad8Var.U0();
        long j2 = -9223372036854775807L;
        if ((!ad8Var.m0(16) || !ad8Var.P0()) && ad8Var.m0(16)) {
            j2 = ad8Var.getDuration();
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
        if (Objects.equals((jr6) this.b, U0) && Objects.equals((String) this.c, str2) && Objects.equals((Uri) this.d, uri) && this.a == j2) {
            return;
        }
        this.c = str2;
        this.d = uri;
        this.b = U0;
        this.a = j2;
        t56 J = tv6Var.m.J(U0);
        if (J != null) {
            lw6Var.u = null;
            if (J.isDone()) {
                try {
                    bitmap = (Bitmap) jie.a(J);
                } catch (CancellationException | ExecutionException e) {
                    lad.f("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
                }
            } else {
                j = j2;
                uri2 = uri;
                jr6Var = U0;
                spc spcVar = new spc(this, jr6Var, str2, uri2, j);
                str2 = str2;
                lw6Var.u = spcVar;
                Handler handler = tv6Var.l;
                Objects.requireNonNull(handler);
                J.b(new tq4(J, spcVar, (byte) 0), new g40(handler, (byte) 1));
                lw6Var.p.J(j06.b(jr6Var, str2, uri2, j, bitmap));
            }
        }
        j = j2;
        uri2 = uri;
        jr6Var = U0;
        lw6Var.p.J(j06.b(jr6Var, str2, uri2, j, bitmap));
    }

    public final void D(aob aobVar) {
        lw6 lw6Var = (lw6) this.e;
        tv6 tv6Var = lw6Var.j;
        if (lw6Var.l0() && !aobVar.p()) {
            int i = j06.a;
            ArrayList arrayList = new ArrayList();
            znb znbVar = new znb();
            for (int i2 = 0; i2 < aobVar.o(); i2++) {
                arrayList.add(aobVar.m(i2, znbVar, 0L).b);
            }
            ArrayList arrayList2 = new ArrayList();
            jw6 jw6Var = new jw6(this, new AtomicInteger(0), arrayList, arrayList2, (byte) 0);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                byte[] bArr = ((br6) arrayList.get(i3)).d.k;
                if (bArr == null) {
                    arrayList2.add(null);
                    jw6Var.run();
                } else {
                    t56 Z = tv6Var.m.Z(bArr);
                    arrayList2.add(Z);
                    Handler handler = tv6Var.l;
                    Objects.requireNonNull(handler);
                    Z.b(jw6Var, new g40(handler, (byte) 1));
                }
            }
            return;
        }
        lw6Var.p.M(null);
    }

    @Override
    public final void a(int i, p5a p5aVar) {
        Bundle bundle = Bundle.EMPTY;
        boolean isEmpty = bundle.isEmpty();
        Bundle bundle2 = p5aVar.c;
        if (isEmpty) {
            bundle = bundle2;
        } else if (!bundle2.isEmpty()) {
            Bundle bundle3 = new Bundle(bundle2);
            bundle3.putAll(bundle);
            bundle = bundle3;
        }
        lv6 lv6Var = ((lw6) this.e).p;
        String str = p5aVar.b;
        lv6Var.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((bv6) lv6Var.b).a.sendSessionEvent(str, bundle);
        } else {
            w26.j("event cannot be null or empty");
        }
    }

    @Override
    public final void f(int i, kc8 kc8Var) {
        byte b;
        lw6 lw6Var = (lw6) this.e;
        tv6 tv6Var = lw6Var.j;
        tv6Var.t();
        ad8 ad8Var = tv6Var.t;
        if (ad8Var.m0(20)) {
            b = 4;
        } else {
            b = 0;
        }
        if (lw6Var.v != b) {
            lw6Var.v = b;
            ((bv6) lw6Var.p.b).a.setFlags(b | 3);
        }
        lw6Var.q0(ad8Var);
    }

    @Override
    public final void i(int i, l6a l6aVar, boolean z, boolean z2, int i2) {
        lw6 lw6Var = (lw6) this.e;
        tv6 tv6Var = lw6Var.j;
        tv6Var.t();
        lw6Var.q0(tv6Var.t);
    }

    public final rpc j(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
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

    @Override
    public final void k(Throwable th) {
        if (this != ((lw6) ((spc) this.e).e).u) {
            return;
        }
        lad.f("MediaSessionLegacyStub", "Failed to load bitmap: " + th.getMessage());
    }

    public final void l(float f2, float f3) {
        float f4 = gl.p;
        for (int i = 0; i < 28; i++) {
            j(f2, f3, y(0.0f, 6.2831855f), y(60.0f, 300.0f) * f4, y(2.5f, 6.0f) * f4, y(0.5f, 0.9f), 3.0f);
        }
    }

    public final boolean m() {
        return ((oac) this.b).V;
    }

    public final void n(long j, float f2) {
        long j2;
        File file = (File) this.c;
        oac oacVar = (oac) this.b;
        if (!oacVar.V) {
            if (j < 0) {
                j2 = file.length();
            } else {
                j2 = j;
            }
            if (!oacVar.X && this.a == j2) {
                return;
            }
            this.a = j2;
            MediaController mediaController = (MediaController) this.e;
            om6 om6Var = (om6) this.d;
            String[] strArr = MediaController.W1;
            oac oacVar2 = om6Var.b;
            boolean z = oacVar2.W;
            if (z) {
                oacVar2.W = false;
            }
            gl.d3(new bl6(mediaController, false, false, om6Var, file, f2, 0L, z, j2));
        }
    }

    public final void o() {
        ((y60) this.d).dismiss();
        this.a = System.currentTimeMillis();
    }

    @Override
    public final void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        lw6 lw6Var = (lw6) ((spc) this.e).e;
        if (this != lw6Var.u) {
            return;
        }
        lw6Var.p.J(j06.b((jr6) this.b, (String) this.c, (Uri) this.d, this.a, bitmap));
        tv6 tv6Var = lw6Var.j;
        g8c.X(tv6Var.o, new nv6(tv6Var, (byte) 0));
    }

    public final void p(Canvas canvas) {
        Paint paint = (Paint) this.d;
        long uptimeMillis = SystemClock.uptimeMillis();
        float min = Math.min(0.033f, ((float) (uptimeMillis - this.a)) / 1000.0f);
        this.a = uptimeMillis;
        ArrayList arrayList = (ArrayList) this.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            rpc rpcVar = (rpc) arrayList.get(size);
            float f2 = rpcVar.j + min;
            rpcVar.j = f2;
            if (f2 >= 0.0f) {
                if (f2 >= rpcVar.f) {
                    arrayList.remove(size);
                } else {
                    float exp = (float) Math.exp((-rpcVar.g) * min);
                    float f3 = rpcVar.c * exp;
                    rpcVar.c = f3;
                    float f4 = rpcVar.d * exp;
                    rpcVar.d = f4;
                    rpcVar.a = (f3 * min) + rpcVar.a;
                    rpcVar.b = (f4 * min) + rpcVar.b;
                    rpcVar.h = (rpcVar.i * min) + rpcVar.h;
                    float f5 = rpcVar.j / rpcVar.f;
                    float max = Math.max(0.0f, Math.min(1.0f, (f5 - 0.35f) / 0.65f));
                    float min2 = (1.0f - ((3.0f - (max * 2.0f)) * (max * max))) * Math.min(1.0f, 8.0f * f5) * rpcVar.l;
                    float B = yjb.B(f5, 0.5f, 1.0f, rpcVar.e);
                    int save = canvas.save();
                    canvas.translate(rpcVar.a, rpcVar.b);
                    canvas.rotate(rpcVar.h);
                    canvas.scale(B, B);
                    paint.setColor(rpcVar.k);
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
        nz nzVar;
        lw6 lw6Var = (lw6) this.e;
        tv6 tv6Var = lw6Var.j;
        tv6Var.t();
        ad8 ad8Var = tv6Var.t;
        ad8Var.H().getClass();
        lv6 lv6Var = lw6Var.p;
        if (ad8Var.m0(21)) {
            nzVar = ad8Var.F();
        } else {
            nzVar = nz.i;
        }
        ((bv6) lv6Var.b).a.setPlaybackToLocal(nzVar.b());
    }

    public final void s(br6 br6Var) {
        C();
        lw6 lw6Var = (lw6) this.e;
        lv6 lv6Var = lw6Var.p;
        if (br6Var == null) {
            ((bv6) lv6Var.b).a.setRatingType(0);
        } else {
            ((bv6) lv6Var.b).a.setRatingType(j06.e(br6Var.d.i));
        }
        tv6 tv6Var = lw6Var.j;
        tv6Var.t();
        lw6Var.q0(tv6Var.t);
    }

    public final void t(int i, ad8 ad8Var) {
        jr6 jr6Var;
        byte b;
        lw6 lw6Var = (lw6) this.e;
        x(ad8Var.T0());
        if (ad8Var.m0(18)) {
            jr6Var = ad8Var.g0();
        } else {
            jr6Var = jr6.M;
        }
        u(jr6Var);
        ad8Var.U0();
        C();
        w(ad8Var.F0());
        v(ad8Var.x0());
        ad8Var.H();
        r();
        if (ad8Var.m0(20)) {
            b = 4;
        } else {
            b = 0;
        }
        if (lw6Var.v != b) {
            lw6Var.v = b;
            ((bv6) lw6Var.p.b).a.setFlags(b | 3);
        }
        s(ad8Var.S0());
    }

    public final void u(jr6 jr6Var) {
        lw6 lw6Var = (lw6) this.e;
        lv6 lv6Var = lw6Var.p;
        CharSequence queueTitle = ((tm6) ((gi3) lv6Var.c).a).a.getQueueTitle();
        CharSequence charSequence = jr6Var.a;
        if (!TextUtils.equals(queueTitle, charSequence)) {
            if (!lw6Var.l0()) {
                charSequence = null;
            }
            ((bv6) lv6Var.b).a.setQueueTitle(charSequence);
        }
    }

    public final void v(int i) {
        lv6 lv6Var = ((lw6) this.e).p;
        int i2 = j06.a;
        byte b = 0;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    lad.f("LegacyConversions", "Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                } else {
                    b = 2;
                }
            } else {
                b = 1;
            }
        }
        bv6 bv6Var = (bv6) lv6Var.b;
        if (bv6Var.j != b) {
            bv6Var.j = b;
            synchronized (bv6Var.d) {
                int beginBroadcast = bv6Var.f.beginBroadcast() - 1;
                while (true) {
                    RemoteCallbackList remoteCallbackList = bv6Var.f;
                    if (beginBroadcast >= 0) {
                        try {
                            ((hi5) remoteCallbackList.getBroadcastItem(beginBroadcast)).g(b);
                        } catch (RemoteException | SecurityException e) {
                            lad.d("MediaSessionCompat", "Dead object in setRepeatMode.", e);
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
        lv6 lv6Var = ((lw6) this.e).p;
        int i = j06.a;
        bv6 bv6Var = (bv6) lv6Var.b;
        if (bv6Var.k != z) {
            bv6Var.k = z ? 1 : 0;
            synchronized (bv6Var.d) {
                int beginBroadcast = bv6Var.f.beginBroadcast() - 1;
                while (true) {
                    RemoteCallbackList remoteCallbackList = bv6Var.f;
                    if (beginBroadcast >= 0) {
                        try {
                            ((hi5) remoteCallbackList.getBroadcastItem(beginBroadcast)).i(z ? 1 : 0);
                        } catch (RemoteException | SecurityException e) {
                            lad.d("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                        }
                        beginBroadcast--;
                    } else {
                        remoteCallbackList.finishBroadcast();
                    }
                }
            }
        }
    }

    public final void x(aob aobVar) {
        D(aobVar);
        C();
    }

    public final float y(float f2, float f3) {
        return tb4.A(f3, f2, ((Random) this.c).nextFloat(), f2);
    }

    public final void z() {
        float f2;
        ((ArrayList) this.b).clear();
        float f3 = gl.p;
        for (int i = 0; i < 48; i++) {
            int i2 = -1;
            while (i2 <= 1) {
                if (i2 < 0) {
                    f2 = 3.1415927f;
                } else {
                    f2 = 0.0f;
                }
                spc spcVar = this;
                rpc j = spcVar.j(0.0f, (this.y(-3.0f, 3.0f) * f3) + 0.0f, this.y(-0.6f, 0.6f) + f2, this.y(150.0f, 310.0f) * f3, this.y(1.3f, 3.2f) * f3, this.y(0.65f, 1.05f), 1.8f);
                j.k = -6562049;
                j.l = spcVar.y(0.3f, 1.0f);
                j.j = (-i) * 0.006f;
                i2 += 2;
                this = spcVar;
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
    public final void d(int i, q06 q06Var) {
    }

    @Override
    public final void g(int i, o6a o6aVar) {
    }

    @Override
    public final void c(int i, int i2, int i3) {
    }

    @Override
    public final void h(int i, wc8 wc8Var, kc8 kc8Var, boolean z, boolean z2) {
    }

    public spc() {
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

    public spc(lw6 lw6Var) {
        this.e = lw6Var;
        this.b = jr6.M;
        this.c = "";
        this.a = -9223372036854775807L;
    }

    public spc(spc spcVar, jr6 jr6Var, String str, Uri uri, long j) {
        this.e = spcVar;
        this.b = jr6Var;
        this.c = str;
        this.d = uri;
        this.a = j;
    }

    public spc(MediaController mediaController, oac oacVar, File file, om6 om6Var) {
        this.e = mediaController;
        this.b = oacVar;
        this.c = file;
        this.d = om6Var;
        this.a = 0L;
    }
}
