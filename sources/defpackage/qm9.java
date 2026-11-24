package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.a;
public final class qm9 implements Runnable {
    public final byte a;
    public final ao9 b;

    public qm9(ao9 ao9Var, byte b) {
        this.a = b;
        this.b = ao9Var;
    }

    @Override
    public final void run() {
        boolean z;
        boolean z2;
        long j;
        boolean z3;
        boolean z4;
        String str;
        Surface surface;
        zn9 zn9Var;
        byte b = this.a;
        byte b2 = 2;
        ao9 ao9Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new qm9(ao9Var, (byte) 1));
                return;
            case 1:
                um9.a0.remove(ao9Var);
                return;
            case 2:
                pz0 pz0Var = ao9Var.e;
                ArrayDeque arrayDeque = ao9Var.j;
                if (!ao9Var.h && ao9Var.f != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    zn9 zn9Var2 = ao9Var.g;
                    if (zn9Var2 != null && zn9Var2.b()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long j2 = -1;
                    if (z) {
                        ao9Var.p = -1L;
                    } else {
                        j2 = ao9Var.p;
                        if (j2 < 0) {
                            ao9Var.p = elapsedRealtime;
                            j2 = elapsedRealtime;
                        }
                    }
                    if (!z && elapsedRealtime - j2 >= 1500) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2 != ao9Var.o) {
                        ao9Var.o = z2;
                        ao9Var.q = elapsedRealtime;
                        if (z2) {
                            str = "on";
                        } else {
                            str = "off";
                        }
                        ao9Var.d("video ".concat(str));
                        y54 y54Var = ao9Var.f;
                        if (z2 && (zn9Var = ao9Var.g) != null) {
                            surface = zn9Var.getSurface();
                        } else {
                            surface = null;
                        }
                        y54Var.r1(surface);
                        pz0Var.getClass();
                        if (!z2) {
                            b2 = 1;
                        }
                        pz0Var.E = b2;
                    }
                    int l0 = ao9Var.f.l0();
                    if (l0 > 1) {
                        int i = l0 - 1;
                        ao9Var.f.P(0, i);
                        for (int i2 = 0; i2 < i && !arrayDeque.isEmpty(); i2++) {
                            arrayDeque.pollFirst();
                        }
                    }
                    int l02 = ao9Var.f.l0();
                    Iterator it = arrayDeque.iterator();
                    int i3 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Long l = (Long) it.next();
                            int i4 = i3 + 1;
                            if (i3 == l02) {
                                j = Math.max(0L, ao9Var.f.m()) + l.longValue();
                            } else {
                                i3 = i4;
                            }
                        } else {
                            j = -1;
                        }
                    }
                    if (ao9Var.f.h() == 3 && ao9Var.f.s()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    long j3 = ao9Var.q;
                    if (j3 >= 0 && elapsedRealtime - j3 < 500) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (j >= 0 && (z3 || !z4)) {
                        pz0Var.p = j;
                        boolean z5 = pz0Var.q;
                        pz0Var.q = z3;
                        if (z3 && !pz0Var.t) {
                            pz0Var.t = true;
                            pz0Var.B();
                        }
                        if (pz0Var.c != 4 && pz0Var.g < 0 && pz0Var.f >= 0) {
                            if (z3) {
                                pz0Var.u = false;
                            } else if (pz0Var.t && !pz0Var.h && !pz0Var.u) {
                                pz0Var.h = true;
                                pz0Var.i++;
                                ez0 ez0Var = pz0Var.a;
                                StringBuilder o = ug8.o(j, "stall at ", ", buffered to ");
                                o.append(pz0Var.f);
                                ez0Var.d(o.toString());
                                pz0Var.E();
                                pz0Var.j();
                                pz0Var.w();
                            }
                            if (z3 && !z5 && pz0Var.h) {
                                pz0Var.h = false;
                            }
                            pz0Var.E();
                            pz0Var.j();
                            pz0Var.w();
                        } else {
                            pz0Var.E();
                        }
                    }
                    ao9Var.b.postDelayed(ao9Var.n, 100L);
                    return;
                }
                return;
            default:
                if (!ao9Var.h) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(uc8.c.a, 144179200);
                    lb3.a(200, 0, "bufferForPlaybackMs", "0");
                    lb3.a(200, 0, "bufferForPlaybackAfterRebufferMs", "0");
                    lb3.a(1000, 200, "minBufferMs", "bufferForPlaybackMs");
                    lb3.a(1000, 200, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
                    lb3.a(30000, 1000, "maxBufferMs", "minBufferMs");
                    lb3.a(200, 0, "bufferForPlaybackMs", "0");
                    lb3.a(200, 0, "bufferForPlaybackAfterRebufferMs", "0");
                    lb3.a(1000, 200, "minBufferMs", "bufferForPlaybackMs");
                    lb3.a(1000, 200, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
                    lb3.a(30000, 1000, "maxBufferMs", "minBufferMs");
                    lb3 lb3Var = new lb3(new af0(), 1000, 1000, 30000, 30000, 200, 200, 200, 200, true, hashMap);
                    Context context = a.b;
                    k54 k54Var = new k54(context, new ob3(new vb3(a.b), (byte) 4), new a00(context, (byte) 1));
                    Looper looper = ao9Var.a.getLooper();
                    gre.p(!k54Var.A);
                    looper.getClass();
                    k54Var.i = looper;
                    k54Var.b(lb3Var);
                    y54 a = k54Var.a();
                    ao9Var.f = a;
                    a.i0(new nz(3, 0, 1, 1, false, 0, true), false);
                    ao9Var.f.R(ao9Var.i);
                    ao9Var.f.m.a(new b30(ao9Var, (byte) 2));
                    zn9 zn9Var3 = ao9Var.g;
                    if (zn9Var3 != null && ao9Var.o) {
                        ao9Var.f.r1(zn9Var3.getSurface());
                    }
                    ao9Var.f.V(true);
                    pz0 pz0Var2 = ao9Var.e;
                    if (pz0Var2.c == 0) {
                        pz0Var2.a.d("start");
                        pz0Var2.y();
                    }
                    ao9Var.b.postDelayed(ao9Var.n, 100L);
                    return;
                }
                return;
        }
    }
}
