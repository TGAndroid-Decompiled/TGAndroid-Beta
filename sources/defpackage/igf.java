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
public final class igf implements j79, OnSuccessListener {
    public static igf e;
    public int a;
    public final Object b;
    public Object c;
    public Object d;

    public igf(byte b) {
        switch (b) {
            case 3:
                gn gnVar = new gn(true, true, true);
                this.d = gnVar;
                Paint paint = new Paint(1);
                gnVar.w(gl.L(13.0f));
                gnVar.u(-1);
                gnVar.x(gl.o());
                paint.setColor(bm2.o(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new se3(gl.L(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new se3(gl.L(1.0f)), 0, 1, 0);
                return;
            default:
                this.b = new Object();
                this.c = null;
                this.d = null;
                this.a = 0;
                return;
        }
    }

    public static synchronized igf t(Context context) {
        igf igfVar;
        synchronized (igf.class) {
            igfVar = e;
            if (igfVar == null) {
                igfVar = new igf(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new kn7("MessengerIpcClient"))));
                e = igfVar;
            }
        }
        return igfVar;
    }

    public final igf a(w4a w4aVar) {
        byte b;
        w4aVar.getClass();
        lu5 lu5Var = (lu5) this.b;
        uyc b2 = lye.b(lu5Var, w4aVar);
        cyb cybVar = (cyb) this.d;
        kp kpVar = (kp) cybVar.c;
        int i = kpVar.b + 1;
        kpVar.b = i;
        Object[] objArr = (Object[]) kpVar.c;
        if (i == objArr.length) {
            int i2 = i << 1;
            kpVar.c = Arrays.copyOf(objArr, i2);
            kpVar.d = Arrays.copyOf((int[]) kpVar.d, i2);
        }
        ((Object[]) kpVar.c)[i] = w4aVar;
        cybVar.h(b2.a);
        String str = (String) cybVar.f;
        int i3 = cybVar.b;
        while (true) {
            int r = cybVar.r(i3);
            b = 10;
            if (r != -1) {
                char charAt = str.charAt(r);
                if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                    cybVar.b = r;
                    b = ukd.a(charAt);
                    break;
                }
                i3 = r + 1;
            } else {
                cybVar.b = r;
                break;
            }
        }
        if (b != 4) {
            int ordinal = b2.ordinal();
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                if (((uyc) this.c) == b2) {
                    return this;
                }
                return new igf(lu5Var, b2, cybVar, w4aVar);
            }
            return new igf(lu5Var, b2, cybVar, w4aVar);
        }
        cyb.m(cybVar, "Unexpected leading comma", 0, 6);
        throw null;
    }

    public final int b(w4a w4aVar) {
        Object obj;
        boolean z;
        lu5 lu5Var = (lu5) this.b;
        cyb cybVar = (cyb) this.d;
        w4aVar.getClass();
        uyc uycVar = (uyc) this.c;
        int ordinal = uycVar.ordinal();
        boolean z2 = false;
        int i = -1;
        if (ordinal != 0) {
            if (ordinal != 2) {
                boolean u = cybVar.u();
                if (cybVar.e()) {
                    int i2 = this.a;
                    if (i2 != -1 && !u) {
                        cyb.m(cybVar, "Expected end of the array or comma", 0, 6);
                        throw null;
                    }
                    i = i2 + 1;
                    this.a = i;
                } else if (u) {
                    ple.a(cybVar, "array");
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
                        z2 = cybVar.u();
                    }
                } else {
                    cybVar.h(':');
                }
                if (cybVar.e()) {
                    if (z) {
                        int i4 = this.a;
                        int i5 = cybVar.b;
                        if (i4 == -1) {
                            if (z2) {
                                cyb.m(cybVar, "Unexpected leading comma", i5, 4);
                                throw null;
                            }
                        } else if (!z2) {
                            cyb.m(cybVar, "Expected comma after the key-value pair", i5, 4);
                            throw null;
                        }
                    }
                    i = this.a + 1;
                    this.a = i;
                } else if (z2) {
                    ple.a(cybVar, "object");
                    throw null;
                }
            }
        } else {
            boolean u2 = cybVar.u();
            if (cybVar.e()) {
                String g = cybVar.g();
                cybVar.h(':');
                w4aVar.getClass();
                g.getClass();
                kad.a(lu5Var, w4aVar);
                int d = w4aVar.d(g);
                if (d != -3) {
                    i = d;
                } else {
                    i4d i4dVar = lu5Var.c;
                    x13 x13Var = new x13(w4aVar, lu5Var, (byte) 2);
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) i4dVar.a;
                    Map map = (Map) concurrentHashMap.get(w4aVar);
                    pd5 pd5Var = kad.a;
                    if (map != null) {
                        obj = map.get(pd5Var);
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        obj = null;
                    }
                    if (obj == null) {
                        obj = x13Var.invoke();
                        Object obj2 = concurrentHashMap.get(w4aVar);
                        if (obj2 == null) {
                            obj2 = new ConcurrentHashMap(2);
                            concurrentHashMap.put(w4aVar, obj2);
                        }
                        ((Map) obj2).put(pd5Var, obj);
                    }
                    Integer num = (Integer) ((Map) obj).get(g);
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = -3;
                    }
                }
                if (i == -3) {
                    String obj3 = ((String) cybVar.f).subSequence(0, cybVar.b).toString();
                    obj3.getClass();
                    cybVar.l(obj3.lastIndexOf(g, obj3.length() - 1), "Encountered an unknown key '" + g + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                    throw null;
                }
            } else if (u2) {
                ple.a(cybVar, "object");
                throw null;
            }
        }
        if (uycVar != uyc.e) {
            kp kpVar = (kp) cybVar.c;
            ((int[]) kpVar.d)[kpVar.b] = i;
        }
        return i;
    }

    @Override
    public final void c() {
        q();
    }

    public final int d() {
        cyb cybVar = (cyb) this.d;
        long i = cybVar.i();
        int i2 = (int) i;
        if (i == i2) {
            return i2;
        }
        cyb.m(cybVar, "Failed to parse int for input '" + i + '\'', 0, 6);
        throw null;
    }

    public final int e(w4a w4aVar, int i) {
        w4aVar.getClass();
        return d();
    }

    @Override
    public final void f(k79 k79Var) {
        q();
    }

    public final long g() {
        return ((cyb) this.d).i();
    }

    public final long h(w4a w4aVar, int i) {
        w4aVar.getClass();
        return g();
    }

    public final boolean i() {
        boolean z;
        cyb cybVar = (cyb) this.d;
        int r = cybVar.r(cybVar.t());
        String str = (String) cybVar.f;
        int length = str.length() - r;
        if (length >= 4 && r != -1) {
            int i = 0;
            while (true) {
                if (i < 4) {
                    if ("null".charAt(i) != str.charAt(r + i)) {
                        break;
                    }
                    i++;
                } else if (length <= 4 || ukd.a(str.charAt(r + 4)) != 0) {
                    cybVar.b = r + 4;
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

    public final Object j(w4a w4aVar, int i, cv5 cv5Var, Object obj) {
        w4aVar.getClass();
        cv5Var.getClass();
        if (!cv5Var.d().c() && !i()) {
            return null;
        }
        return l(cv5Var);
    }

    public final Object k(w4a w4aVar, int i, cv5 cv5Var, Object obj) {
        boolean z;
        kp kpVar = (kp) ((cyb) this.d).c;
        w4aVar.getClass();
        cv5Var.getClass();
        if (((uyc) this.c) == uyc.e && (i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = kpVar.b;
            if (((int[]) kpVar.d)[i2] == -2) {
                ((Object[]) kpVar.c)[i2] = ie7.c;
            }
        }
        Object l = l(cv5Var);
        if (z) {
            int[] iArr = (int[]) kpVar.d;
            int i3 = kpVar.b;
            if (iArr[i3] != -2) {
                int i4 = i3 + 1;
                kpVar.b = i4;
                Object[] objArr = (Object[]) kpVar.c;
                if (i4 == objArr.length) {
                    int i5 = i4 << 1;
                    kpVar.c = Arrays.copyOf(objArr, i5);
                    iArr = Arrays.copyOf((int[]) kpVar.d, i5);
                    kpVar.d = iArr;
                }
            }
            int i6 = kpVar.b;
            ((Object[]) kpVar.c)[i6] = l;
            iArr[i6] = -2;
        }
        return l;
    }

    public final Object l(cv5 cv5Var) {
        cv5Var.getClass();
        try {
            return cv5Var.c(this);
        } catch (zd7 e2) {
            String message = e2.getMessage();
            message.getClass();
            if (f9b.f(0, 2, message, "at path") >= 0) {
                throw e2;
            }
            String message2 = e2.getMessage();
            String m = ((kp) ((cyb) this.d).c).m();
            throw new zd7(e2.a, message2 + " at path: " + m, e2);
        }
    }

    public final String m() {
        return ((cyb) this.d).j();
    }

    public final String n(w4a w4aVar, int i) {
        w4aVar.getClass();
        return m();
    }

    public final void o(w4a w4aVar) {
        cyb cybVar = (cyb) this.d;
        w4aVar.getClass();
        if (!cybVar.u()) {
            cybVar.h(((uyc) this.c).b);
            kp kpVar = (kp) cybVar.c;
            int i = kpVar.b;
            int[] iArr = (int[]) kpVar.d;
            if (iArr[i] == -2) {
                iArr[i] = -1;
                i--;
                kpVar.b = i;
            }
            if (i != -1) {
                kpVar.b = i - 1;
                return;
            }
            return;
        }
        ple.a(cybVar, "");
        throw null;
    }

    @Override
    public final void onSuccess(java.lang.Object r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.igf.onSuccess(java.lang.Object):void");
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
                gre.p(z);
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
        Iterator it = ((k79) this.d).iterator();
        while (it.hasNext()) {
            u46 u46Var = (u46) it.next();
            fArr[((Integer) u46Var.a).intValue()] = u46Var.c();
        }
        ((vm1) this.c).run();
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
            gre.p(z);
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
        int b = fod.b(this.a, 1 << i, z);
        this.a = b;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((k79) this.d).h(Integer.valueOf(numberOfLeadingZeros2), z2);
        }
    }

    public final synchronized Task u(ebf ebfVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Queueing ".concat(ebfVar.toString()));
        }
        if (!((l7f) this.d).a(ebfVar)) {
            l7f l7fVar = new l7f(this);
            this.d = l7fVar;
            l7fVar.a(ebfVar);
        }
        return ebfVar.b.getTask();
    }

    public igf(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = new l7f(this);
        this.a = 1;
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }

    public igf(vm1 vm1Var) {
        this.b = new float[32];
        this.a = 1;
        this.d = new k79(this, tn.a, 240L);
        this.c = vm1Var;
    }

    public igf(lu5 lu5Var, uyc uycVar, cyb cybVar, w4a w4aVar) {
        w4aVar.getClass();
        this.b = lu5Var;
        this.c = uycVar;
        this.d = cybVar;
        this.a = -1;
    }

    public igf(h6e h6eVar, String str, int i, SharedPreferences sharedPreferences) {
        this.b = h6eVar;
        this.c = str;
        this.a = i;
        this.d = sharedPreferences;
    }
}
