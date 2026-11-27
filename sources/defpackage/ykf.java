package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.Log;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public final class ykf implements wa9, OnSuccessListener {
    public static ykf e;
    public int a;
    public final Object b;
    public Object c;
    public Object d;

    public ykf(byte b) {
        switch (b) {
            case 3:
                hn hnVar = new hn(true, true, true);
                this.d = hnVar;
                Paint paint = new Paint(1);
                hnVar.w(hl.L(13.0f));
                hnVar.u(-1);
                hnVar.x(hl.o());
                paint.setColor(vm2.o(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new mf3(hl.L(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new mf3(hl.L(1.0f)), 0, 1, 0);
                return;
            default:
                this.b = new Object();
                this.c = null;
                this.d = null;
                this.a = 0;
                return;
        }
    }

    public static synchronized ykf t(Context context) {
        ykf ykfVar;
        synchronized (ykf.class) {
            ykfVar = e;
            if (ykfVar == null) {
                ykfVar = new ykf(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new kq7("MessengerIpcClient"))));
                e = ykfVar;
            }
        }
        return ykfVar;
    }

    public final ykf a(o8a o8aVar) {
        byte b;
        o8aVar.getClass();
        qw5 qw5Var = (qw5) this.b;
        k3d b2 = e3f.b(qw5Var, o8aVar);
        d2c d2cVar = (d2c) this.d;
        lp lpVar = (lp) d2cVar.c;
        int i = lpVar.b + 1;
        lpVar.b = i;
        Object[] objArr = (Object[]) lpVar.c;
        if (i == objArr.length) {
            int i2 = i << 1;
            lpVar.c = Arrays.copyOf(objArr, i2);
            lpVar.d = Arrays.copyOf((int[]) lpVar.d, i2);
        }
        ((Object[]) lpVar.c)[i] = o8aVar;
        d2cVar.h(b2.a);
        String str = (String) d2cVar.f;
        int i3 = d2cVar.b;
        while (true) {
            int r = d2cVar.r(i3);
            b = 10;
            if (r != -1) {
                char charAt = str.charAt(r);
                if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                    d2cVar.b = r;
                    b = lpd.a(charAt);
                    break;
                }
                i3 = r + 1;
            } else {
                d2cVar.b = r;
                break;
            }
        }
        if (b != 4) {
            int ordinal = b2.ordinal();
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                if (((k3d) this.c) == b2) {
                    return this;
                }
                return new ykf(qw5Var, b2, d2cVar, o8aVar);
            }
            return new ykf(qw5Var, b2, d2cVar, o8aVar);
        }
        d2c.m(d2cVar, "Unexpected leading comma", 0, 6);
        throw null;
    }

    public final int b(o8a o8aVar) {
        Object obj;
        boolean z;
        qw5 qw5Var = (qw5) this.b;
        d2c d2cVar = (d2c) this.d;
        o8aVar.getClass();
        k3d k3dVar = (k3d) this.c;
        int ordinal = k3dVar.ordinal();
        boolean z2 = false;
        int i = -1;
        if (ordinal != 0) {
            if (ordinal != 2) {
                boolean u = d2cVar.u();
                if (d2cVar.e()) {
                    int i2 = this.a;
                    if (i2 != -1 && !u) {
                        d2c.m(d2cVar, "Expected end of the array or comma", 0, 6);
                        throw null;
                    }
                    i = i2 + 1;
                    this.a = i;
                } else if (u) {
                    hqe.a(d2cVar, "array");
                    throw null;
                }
            } else {
                int i3 = this.a;
                if (i3 % 2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (i3 != -1) {
                        z2 = d2cVar.u();
                    }
                } else {
                    d2cVar.h(':');
                }
                if (d2cVar.e()) {
                    if (z) {
                        int i4 = this.a;
                        int i5 = d2cVar.b;
                        if (i4 == -1) {
                            if (z2) {
                                d2c.m(d2cVar, "Unexpected leading comma", i5, 4);
                                throw null;
                            }
                        } else if (!z2) {
                            d2c.m(d2cVar, "Expected comma after the key-value pair", i5, 4);
                            throw null;
                        }
                    }
                    i = this.a + 1;
                    this.a = i;
                } else if (z2) {
                    hqe.a(d2cVar, "object");
                    throw null;
                }
            }
        } else {
            boolean u2 = d2cVar.u();
            if (d2cVar.e()) {
                String g = d2cVar.g();
                d2cVar.h(':');
                o8aVar.getClass();
                g.getClass();
                dfd.a(qw5Var, o8aVar);
                int d = o8aVar.d(g);
                if (d != -3) {
                    i = d;
                } else {
                    zm9 zm9Var = qw5Var.c;
                    p23 p23Var = new p23(o8aVar, qw5Var, (byte) 2);
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) zm9Var.b;
                    Map map = (Map) concurrentHashMap.get(o8aVar);
                    qf5 qf5Var = dfd.a;
                    if (map != null) {
                        obj = map.get(qf5Var);
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        obj = null;
                    }
                    if (obj == null) {
                        obj = p23Var.invoke();
                        Object obj2 = concurrentHashMap.get(o8aVar);
                        if (obj2 == null) {
                            obj2 = new ConcurrentHashMap(2);
                            concurrentHashMap.put(o8aVar, obj2);
                        }
                        ((Map) obj2).put(qf5Var, obj);
                    }
                    Integer num = (Integer) ((Map) obj).get(g);
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = -3;
                    }
                }
                if (i == -3) {
                    String obj3 = ((String) d2cVar.f).subSequence(0, d2cVar.b).toString();
                    obj3.getClass();
                    d2cVar.l(obj3.lastIndexOf(g, obj3.length() - 1), "Encountered an unknown key '" + g + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                    throw null;
                }
            } else if (u2) {
                hqe.a(d2cVar, "object");
                throw null;
            }
        }
        if (k3dVar != k3d.e) {
            lp lpVar = (lp) d2cVar.c;
            ((int[]) lpVar.d)[lpVar.b] = i;
        }
        return i;
    }

    @Override
    public final void c() {
        q();
    }

    public final int d() {
        d2c d2cVar = (d2c) this.d;
        long i = d2cVar.i();
        int i2 = (int) i;
        if (i == i2) {
            return i2;
        }
        d2c.m(d2cVar, "Failed to parse int for input '" + i + '\'', 0, 6);
        throw null;
    }

    public final int e(o8a o8aVar, int i) {
        o8aVar.getClass();
        return d();
    }

    @Override
    public final void f(xa9 xa9Var) {
        q();
    }

    public final long g() {
        return ((d2c) this.d).i();
    }

    public final long h(o8a o8aVar, int i) {
        o8aVar.getClass();
        return g();
    }

    public final boolean i() {
        boolean z;
        d2c d2cVar = (d2c) this.d;
        int r = d2cVar.r(d2cVar.t());
        String str = (String) d2cVar.f;
        int length = str.length() - r;
        if (length >= 4 && r != -1) {
            int i = 0;
            while (true) {
                if (i < 4) {
                    if ("null".charAt(i) != str.charAt(r + i)) {
                        break;
                    }
                    i++;
                } else if (length <= 4 || lpd.a(str.charAt(r + 4)) != 0) {
                    d2cVar.b = r + 4;
                    z = true;
                }
            }
        }
        z = false;
        if (!z) {
            return true;
        }
        return false;
    }

    public final Object j(o8a o8aVar, int i, hx5 hx5Var, Object obj) {
        o8aVar.getClass();
        hx5Var.getClass();
        if (!hx5Var.d().c() && !i()) {
            return null;
        }
        return l(hx5Var);
    }

    public final Object k(o8a o8aVar, int i, hx5 hx5Var, Object obj) {
        boolean z;
        lp lpVar = (lp) ((d2c) this.d).c;
        o8aVar.getClass();
        hx5Var.getClass();
        if (((k3d) this.c) == k3d.e && (i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = lpVar.b;
            if (((int[]) lpVar.d)[i2] == -2) {
                ((Object[]) lpVar.c)[i2] = rg7.c;
            }
        }
        Object l = l(hx5Var);
        if (z) {
            int[] iArr = (int[]) lpVar.d;
            int i3 = lpVar.b;
            if (iArr[i3] != -2) {
                int i4 = i3 + 1;
                lpVar.b = i4;
                Object[] objArr = (Object[]) lpVar.c;
                if (i4 == objArr.length) {
                    int i5 = i4 << 1;
                    lpVar.c = Arrays.copyOf(objArr, i5);
                    iArr = Arrays.copyOf((int[]) lpVar.d, i5);
                    lpVar.d = iArr;
                }
            }
            int i6 = lpVar.b;
            ((Object[]) lpVar.c)[i6] = l;
            iArr[i6] = -2;
        }
        return l;
    }

    public final Object l(hx5 hx5Var) {
        hx5Var.getClass();
        try {
            return hx5Var.c(this);
        } catch (ig7 e2) {
            String message = e2.getMessage();
            message.getClass();
            if (ddb.f(0, 2, message, "at path") >= 0) {
                throw e2;
            }
            String message2 = e2.getMessage();
            String m = ((lp) ((d2c) this.d).c).m();
            throw new ig7(e2.a, message2 + " at path: " + m, e2);
        }
    }

    public final String m() {
        return ((d2c) this.d).j();
    }

    public final String n(o8a o8aVar, int i) {
        o8aVar.getClass();
        return m();
    }

    public final void o(o8a o8aVar) {
        d2c d2cVar = (d2c) this.d;
        o8aVar.getClass();
        if (!d2cVar.u()) {
            d2cVar.h(((k3d) this.c).b);
            lp lpVar = (lp) d2cVar.c;
            int i = lpVar.b;
            int[] iArr = (int[]) lpVar.d;
            if (iArr[i] == -2) {
                iArr[i] = -1;
                i--;
                lpVar.b = i;
            }
            if (i != -1) {
                lpVar.b = i - 1;
                return;
            }
            return;
        }
        hqe.a(d2cVar, "");
        throw null;
    }

    @Override
    public final void onSuccess(java.lang.Object r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ykf.onSuccess(java.lang.Object):void");
    }

    public final Looper p() {
        Looper looper;
        boolean z;
        synchronized (this.b) {
            looper = (Looper) this.c;
            if (looper == null) {
                if (this.a == 0 && ((HandlerThread) this.d) == null) {
                    z = true;
                } else {
                    z = false;
                }
                yve.p(z);
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                this.d = handlerThread;
                handlerThread.start();
                looper = ((HandlerThread) this.d).getLooper();
                this.c = looper;
            }
            this.a++;
        }
        return looper;
    }

    public final void q() {
        float[] fArr = (float[]) this.b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((xa9) this.d).iterator();
        while (it.hasNext()) {
            y66 y66Var = (y66) it.next();
            fArr[((Integer) y66Var.a).intValue()] = y66Var.c();
        }
        ((hm1) this.c).run();
    }

    public final void r() {
        boolean z;
        HandlerThread handlerThread;
        synchronized (this.b) {
            if (this.a > 0) {
                z = true;
            } else {
                z = false;
            }
            yve.p(z);
            int i = this.a - 1;
            this.a = i;
            if (i == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                handlerThread.quit();
                this.d = null;
                this.c = null;
            }
        }
    }

    public final void s(int i, boolean z, boolean z2) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.a);
        int b = vsd.b(this.a, 1 << i, z);
        this.a = b;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((xa9) this.d).h(Integer.valueOf(numberOfLeadingZeros2), z2);
        }
    }

    public final synchronized Task u(uff uffVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Queueing ".concat(uffVar.toString()));
        }
        if (!((ccf) this.d).a(uffVar)) {
            ccf ccfVar = new ccf(this);
            this.d = ccfVar;
            ccfVar.a(uffVar);
        }
        return uffVar.b.getTask();
    }

    public ykf(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = new ccf(this);
        this.a = 1;
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }

    public ykf(hm1 hm1Var) {
        this.b = new float[32];
        this.a = 1;
        this.d = new xa9(this, un.a, 240L);
        this.c = hm1Var;
    }

    public ykf(qw5 qw5Var, k3d k3dVar, d2c d2cVar, o8a o8aVar) {
        o8aVar.getClass();
        this.b = qw5Var;
        this.c = k3dVar;
        this.d = d2cVar;
        this.a = -1;
    }

    public ykf(wae waeVar, String str, int i, SharedPreferences sharedPreferences) {
        this.b = waeVar;
        this.c = str;
        this.a = i;
        this.d = sharedPreferences;
    }
}
