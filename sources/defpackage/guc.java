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
public final class guc implements to6, ws4, ww6 {
    public static final int[] f = {-16106272, -16754689, -14779393, -13326081, -10235137, -6559233};
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public final Object e;

    public guc(android.content.Context r23, defpackage.fj8 r24, final defpackage.a70 r25, boolean r26, int r27, defpackage.vnb r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.guc.<init>(android.content.Context, fj8, a70, boolean, int, vnb):void");
    }

    public final void A(float f2, float f3) {
        float f4 = hl.p;
        j(f2, f3, y(0.0f, 6.2831855f), y(0.0f, 28.0f) * f4, y(1.5f, 3.5f) * f4, y(0.35f, 0.6f), 2.0f);
    }

    public final void B(int i) {
        if (System.currentTimeMillis() - this.a < 200) {
            hl.c3(new zd(this, i, (byte) 7));
            return;
        }
        b8 b8Var = (b8) this.c;
        if (i == 0) {
            b8Var.setVisibility(8);
        } else {
            b8Var.setVisibility(0);
        }
    }

    public final void C() {
        String str;
        Uri uri;
        long j;
        Uri uri2;
        nt6 nt6Var;
        Uri uri3;
        qy6 qy6Var = (qy6) this.e;
        yx6 yx6Var = qy6Var.j;
        yx6Var.t();
        og8 og8Var = yx6Var.t;
        ft6 S0 = og8Var.S0();
        nt6 U0 = og8Var.U0();
        long j2 = -9223372036854775807L;
        if ((!og8Var.m0(16) || !og8Var.P0()) && og8Var.m0(16)) {
            j2 = og8Var.getDuration();
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
        if (Objects.equals((nt6) this.b, U0) && Objects.equals((String) this.c, str2) && Objects.equals((Uri) this.d, uri) && this.a == j2) {
            return;
        }
        this.c = str2;
        this.d = uri;
        this.b = U0;
        this.a = j2;
        x76 X = yx6Var.m.X(U0);
        if (X != null) {
            qy6Var.u = null;
            if (X.isDone()) {
                try {
                    bitmap = (Bitmap) fne.a(X);
                } catch (CancellationException | ExecutionException e) {
                    efd.f("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
                }
            } else {
                j = j2;
                uri2 = uri;
                nt6Var = U0;
                guc gucVar = new guc(this, nt6Var, str2, uri2, j);
                str2 = str2;
                qy6Var.u = gucVar;
                Handler handler = yx6Var.l;
                Objects.requireNonNull(handler);
                X.b(new xs4(X, gucVar, (byte) 0), new i40(handler, (byte) 1));
                qy6Var.p.M(n26.b(nt6Var, str2, uri2, j, bitmap));
            }
        }
        j = j2;
        uri2 = uri;
        nt6Var = U0;
        qy6Var.p.M(n26.b(nt6Var, str2, uri2, j, bitmap));
    }

    public final void D(asb asbVar) {
        qy6 qy6Var = (qy6) this.e;
        yx6 yx6Var = qy6Var.j;
        if (qy6Var.l0() && !asbVar.p()) {
            int i = n26.a;
            ArrayList arrayList = new ArrayList();
            zrb zrbVar = new zrb();
            for (int i2 = 0; i2 < asbVar.o(); i2++) {
                arrayList.add(asbVar.m(i2, zrbVar, 0L).b);
            }
            ArrayList arrayList2 = new ArrayList();
            oy6 oy6Var = new oy6(this, new AtomicInteger(0), arrayList, arrayList2, (byte) 0);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                byte[] bArr = ((ft6) arrayList.get(i3)).d.k;
                if (bArr == null) {
                    arrayList2.add(null);
                    oy6Var.run();
                } else {
                    x76 b0 = yx6Var.m.b0(bArr);
                    arrayList2.add(b0);
                    Handler handler = yx6Var.l;
                    Objects.requireNonNull(handler);
                    b0.b(oy6Var, new i40(handler, (byte) 1));
                }
            }
            return;
        }
        qy6Var.p.P(null);
    }

    @Override
    public final void a(int i, h9a h9aVar) {
        Bundle bundle = Bundle.EMPTY;
        boolean isEmpty = bundle.isEmpty();
        Bundle bundle2 = h9aVar.c;
        if (isEmpty) {
            bundle = bundle2;
        } else if (!bundle2.isEmpty()) {
            Bundle bundle3 = new Bundle(bundle2);
            bundle3.putAll(bundle);
            bundle = bundle3;
        }
        qx6 qx6Var = ((qy6) this.e).p;
        String str = h9aVar.b;
        qx6Var.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((gx6) qx6Var.b).a.sendSessionEvent(str, bundle);
        } else {
            lq5.j("event cannot be null or empty");
        }
    }

    @Override
    public final void f(int i, zf8 zf8Var) {
        byte b;
        qy6 qy6Var = (qy6) this.e;
        yx6 yx6Var = qy6Var.j;
        yx6Var.t();
        og8 og8Var = yx6Var.t;
        if (og8Var.m0(20)) {
            b = 4;
        } else {
            b = 0;
        }
        if (qy6Var.v != b) {
            qy6Var.v = b;
            ((gx6) qy6Var.p.b).a.setFlags(b | 3);
        }
        qy6Var.q0(og8Var);
    }

    @Override
    public final void i(int i, daa daaVar, boolean z, boolean z2, int i2) {
        qy6 qy6Var = (qy6) this.e;
        yx6 yx6Var = qy6Var.j;
        yx6Var.t();
        qy6Var.q0(yx6Var.t);
    }

    public final fuc j(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
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
        if (this != ((qy6) ((guc) this.e).e).u) {
            return;
        }
        efd.f("MediaSessionLegacyStub", "Failed to load bitmap: " + th.getMessage());
    }

    public final void l(float f2, float f3) {
        float f4 = hl.p;
        for (int i = 0; i < 28; i++) {
            j(f2, f3, y(0.0f, 6.2831855f), y(60.0f, 300.0f) * f4, y(2.5f, 6.0f) * f4, y(0.5f, 0.9f), 3.0f);
        }
    }

    public final boolean m() {
        return ((oec) this.b).V;
    }

    public final void n(long j, float f2) {
        long j2;
        File file = (File) this.c;
        oec oecVar = (oec) this.b;
        if (!oecVar.V) {
            if (j < 0) {
                j2 = file.length();
            } else {
                j2 = j;
            }
            if (!oecVar.X && this.a == j2) {
                return;
            }
            this.a = j2;
            MediaController mediaController = (MediaController) this.e;
            so6 so6Var = (so6) this.d;
            String[] strArr = MediaController.W1;
            oec oecVar2 = so6Var.b;
            boolean z = oecVar2.W;
            if (z) {
                oecVar2.W = false;
            }
            hl.c3(new nn6(mediaController, false, false, so6Var, file, f2, 0L, z, j2));
        }
    }

    public final void o() {
        ((a70) this.d).dismiss();
        this.a = System.currentTimeMillis();
    }

    @Override
    public final void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        qy6 qy6Var = (qy6) ((guc) this.e).e;
        if (this != qy6Var.u) {
            return;
        }
        qy6Var.p.M(n26.b((nt6) this.b, (String) this.c, (Uri) this.d, this.a, bitmap));
        yx6 yx6Var = qy6Var.j;
        gcc.X(yx6Var.o, new sx6(yx6Var, (byte) 0));
    }

    public final void p(Canvas canvas) {
        Paint paint = (Paint) this.d;
        long uptimeMillis = SystemClock.uptimeMillis();
        float min = Math.min(0.033f, ((float) (uptimeMillis - this.a)) / 1000.0f);
        this.a = uptimeMillis;
        ArrayList arrayList = (ArrayList) this.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            fuc fucVar = (fuc) arrayList.get(size);
            float f2 = fucVar.j + min;
            fucVar.j = f2;
            if (f2 >= 0.0f) {
                if (f2 >= fucVar.f) {
                    arrayList.remove(size);
                } else {
                    float exp = (float) Math.exp((-fucVar.g) * min);
                    float f3 = fucVar.c * exp;
                    fucVar.c = f3;
                    float f4 = fucVar.d * exp;
                    fucVar.d = f4;
                    fucVar.a = (f3 * min) + fucVar.a;
                    fucVar.b = (f4 * min) + fucVar.b;
                    fucVar.h = (fucVar.i * min) + fucVar.h;
                    float f5 = fucVar.j / fucVar.f;
                    float max = Math.max(0.0f, Math.min(1.0f, (f5 - 0.35f) / 0.65f));
                    float min2 = (1.0f - ((3.0f - (max * 2.0f)) * (max * max))) * Math.min(1.0f, 8.0f * f5) * fucVar.l;
                    float B = xnb.B(f5, 0.5f, 1.0f, fucVar.e);
                    int save = canvas.save();
                    canvas.translate(fucVar.a, fucVar.b);
                    canvas.rotate(fucVar.h);
                    canvas.scale(B, B);
                    paint.setColor(fucVar.k);
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
        oz ozVar;
        qy6 qy6Var = (qy6) this.e;
        yx6 yx6Var = qy6Var.j;
        yx6Var.t();
        og8 og8Var = yx6Var.t;
        og8Var.H().getClass();
        qx6 qx6Var = qy6Var.p;
        if (og8Var.m0(21)) {
            ozVar = og8Var.F();
        } else {
            ozVar = oz.i;
        }
        ((gx6) qx6Var.b).a.setPlaybackToLocal(ozVar.b());
    }

    public final void s(ft6 ft6Var) {
        C();
        qy6 qy6Var = (qy6) this.e;
        qx6 qx6Var = qy6Var.p;
        if (ft6Var == null) {
            ((gx6) qx6Var.b).a.setRatingType(0);
        } else {
            ((gx6) qx6Var.b).a.setRatingType(n26.e(ft6Var.d.i));
        }
        yx6 yx6Var = qy6Var.j;
        yx6Var.t();
        qy6Var.q0(yx6Var.t);
    }

    public final void t(int i, og8 og8Var) {
        nt6 nt6Var;
        byte b;
        qy6 qy6Var = (qy6) this.e;
        x(og8Var.T0());
        if (og8Var.m0(18)) {
            nt6Var = og8Var.g0();
        } else {
            nt6Var = nt6.M;
        }
        u(nt6Var);
        og8Var.U0();
        C();
        w(og8Var.F0());
        v(og8Var.x0());
        og8Var.H();
        r();
        if (og8Var.m0(20)) {
            b = 4;
        } else {
            b = 0;
        }
        if (qy6Var.v != b) {
            qy6Var.v = b;
            ((gx6) qy6Var.p.b).a.setFlags(b | 3);
        }
        s(og8Var.S0());
    }

    public final void u(nt6 nt6Var) {
        qy6 qy6Var = (qy6) this.e;
        qx6 qx6Var = qy6Var.p;
        CharSequence queueTitle = ((xo6) ((kj4) qx6Var.c).b).a.getQueueTitle();
        CharSequence charSequence = nt6Var.a;
        if (!TextUtils.equals(queueTitle, charSequence)) {
            if (!qy6Var.l0()) {
                charSequence = null;
            }
            ((gx6) qx6Var.b).a.setQueueTitle(charSequence);
        }
    }

    public final void v(int i) {
        qx6 qx6Var = ((qy6) this.e).p;
        int i2 = n26.a;
        byte b = 0;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    efd.f("LegacyConversions", "Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                } else {
                    b = 2;
                }
            } else {
                b = 1;
            }
        }
        gx6 gx6Var = (gx6) qx6Var.b;
        if (gx6Var.j != b) {
            gx6Var.j = b;
            synchronized (gx6Var.d) {
                int beginBroadcast = gx6Var.f.beginBroadcast() - 1;
                while (true) {
                    RemoteCallbackList remoteCallbackList = gx6Var.f;
                    if (beginBroadcast >= 0) {
                        try {
                            ((jk5) remoteCallbackList.getBroadcastItem(beginBroadcast)).g(b);
                        } catch (RemoteException | SecurityException e) {
                            efd.d("MediaSessionCompat", "Dead object in setRepeatMode.", e);
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
        qx6 qx6Var = ((qy6) this.e).p;
        int i = n26.a;
        gx6 gx6Var = (gx6) qx6Var.b;
        if (gx6Var.k != z) {
            gx6Var.k = z ? 1 : 0;
            synchronized (gx6Var.d) {
                int beginBroadcast = gx6Var.f.beginBroadcast() - 1;
                while (true) {
                    RemoteCallbackList remoteCallbackList = gx6Var.f;
                    if (beginBroadcast >= 0) {
                        try {
                            ((jk5) remoteCallbackList.getBroadcastItem(beginBroadcast)).i(z ? 1 : 0);
                        } catch (RemoteException | SecurityException e) {
                            efd.d("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                        }
                        beginBroadcast--;
                    } else {
                        remoteCallbackList.finishBroadcast();
                    }
                }
            }
        }
    }

    public final void x(asb asbVar) {
        D(asbVar);
        C();
    }

    public final float y(float f2, float f3) {
        return qd4.A(f3, f2, ((Random) this.c).nextFloat(), f2);
    }

    public final void z() {
        float f2;
        ((ArrayList) this.b).clear();
        float f3 = hl.p;
        for (int i = 0; i < 48; i++) {
            int i2 = -1;
            while (i2 <= 1) {
                if (i2 < 0) {
                    f2 = 3.1415927f;
                } else {
                    f2 = 0.0f;
                }
                guc gucVar = this;
                fuc j = gucVar.j(0.0f, (this.y(-3.0f, 3.0f) * f3) + 0.0f, this.y(-0.6f, 0.6f) + f2, this.y(150.0f, 310.0f) * f3, this.y(1.3f, 3.2f) * f3, this.y(0.65f, 1.05f), 1.8f);
                j.k = -6562049;
                j.l = gucVar.y(0.3f, 1.0f);
                j.j = (-i) * 0.006f;
                i2 += 2;
                this = gucVar;
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
    public final void d(int i, u26 u26Var) {
    }

    @Override
    public final void g(int i, gaa gaaVar) {
    }

    @Override
    public final void c(int i, int i2, int i3) {
    }

    @Override
    public final void h(int i, kg8 kg8Var, zf8 zf8Var, boolean z, boolean z2) {
    }

    public guc() {
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

    public guc(qy6 qy6Var) {
        this.e = qy6Var;
        this.b = nt6.M;
        this.c = "";
        this.a = -9223372036854775807L;
    }

    public guc(guc gucVar, nt6 nt6Var, String str, Uri uri, long j) {
        this.e = gucVar;
        this.b = nt6Var;
        this.c = str;
        this.d = uri;
        this.a = j;
    }

    public guc(MediaController mediaController, oec oecVar, File file, so6 so6Var) {
        this.e = mediaController;
        this.b = oecVar;
        this.c = file;
        this.d = so6Var;
        this.a = 0L;
    }
}
