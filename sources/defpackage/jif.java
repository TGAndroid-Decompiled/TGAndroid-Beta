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
public final class jif implements l99, OnSuccessListener {
    public static jif e;
    public int a;
    public final Object b;
    public Object c;
    public Object d;

    public jif(byte b) {
        switch (b) {
            case 3:
                ho hoVar = new ho(true, true, true);
                this.d = hoVar;
                Paint paint = new Paint(1);
                hoVar.w(gm.L(13.0f));
                hoVar.u(-1);
                hoVar.x(gm.o());
                paint.setColor(on2.p(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new fg3(gm.L(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new fg3(gm.L(1.0f)), 0, 1, 0);
                return;
            default:
                this.b = new Object();
                this.c = null;
                this.d = null;
                this.a = 0;
                return;
        }
    }

    public static synchronized jif t(Context context) {
        jif jifVar;
        synchronized (jif.class) {
            jifVar = e;
            if (jifVar == null) {
                jifVar = new jif(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new op7("MessengerIpcClient"))));
                e = jifVar;
            }
        }
        return jifVar;
    }

    public final jif a(y6a y6aVar) {
        byte b;
        y6aVar.getClass();
        lw5 lw5Var = (lw5) this.b;
        v0d b2 = n0f.b(lw5Var, y6aVar);
        e0c e0cVar = (e0c) this.d;
        kq kqVar = (kq) e0cVar.c;
        int i = kqVar.b + 1;
        kqVar.b = i;
        Object[] objArr = (Object[]) kqVar.c;
        if (i == objArr.length) {
            int i2 = i << 1;
            kqVar.c = Arrays.copyOf(objArr, i2);
            kqVar.d = Arrays.copyOf((int[]) kqVar.d, i2);
        }
        ((Object[]) kqVar.c)[i] = y6aVar;
        e0cVar.h(b2.a);
        String str = (String) e0cVar.f;
        int i3 = e0cVar.b;
        while (true) {
            int r = e0cVar.r(i3);
            b = 10;
            if (r != -1) {
                char charAt = str.charAt(r);
                if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                    e0cVar.b = r;
                    b = wmd.a(charAt);
                    break;
                }
                i3 = r + 1;
            } else {
                e0cVar.b = r;
                break;
            }
        }
        if (b != 4) {
            int ordinal = b2.ordinal();
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                if (((v0d) this.c) == b2) {
                    return this;
                }
                return new jif(lw5Var, b2, e0cVar, y6aVar);
            }
            return new jif(lw5Var, b2, e0cVar, y6aVar);
        }
        e0c.m(e0cVar, "Unexpected leading comma", 0, 6);
        throw null;
    }

    public final int b(y6a y6aVar) {
        Object obj;
        boolean z;
        lw5 lw5Var = (lw5) this.b;
        e0c e0cVar = (e0c) this.d;
        y6aVar.getClass();
        v0d v0dVar = (v0d) this.c;
        int ordinal = v0dVar.ordinal();
        boolean z2 = false;
        int i = -1;
        if (ordinal != 0) {
            if (ordinal != 2) {
                boolean u = e0cVar.u();
                if (e0cVar.e()) {
                    int i2 = this.a;
                    if (i2 != -1 && !u) {
                        e0c.m(e0cVar, "Expected end of the array or comma", 0, 6);
                        throw null;
                    }
                    i = i2 + 1;
                    this.a = i;
                } else if (u) {
                    rne.a(e0cVar, "array");
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
                        z2 = e0cVar.u();
                    }
                } else {
                    e0cVar.h(':');
                }
                if (e0cVar.e()) {
                    if (z) {
                        int i4 = this.a;
                        int i5 = e0cVar.b;
                        if (i4 == -1) {
                            if (z2) {
                                e0c.m(e0cVar, "Unexpected leading comma", i5, 4);
                                throw null;
                            }
                        } else if (!z2) {
                            e0c.m(e0cVar, "Expected comma after the key-value pair", i5, 4);
                            throw null;
                        }
                    }
                    i = this.a + 1;
                    this.a = i;
                } else if (z2) {
                    rne.a(e0cVar, "object");
                    throw null;
                }
            }
        } else {
            boolean u2 = e0cVar.u();
            if (e0cVar.e()) {
                String g = e0cVar.g();
                e0cVar.h(':');
                y6aVar.getClass();
                g.getClass();
                mcd.a(lw5Var, y6aVar);
                int d = y6aVar.d(g);
                if (d != -3) {
                    i = d;
                } else {
                    nl9 nl9Var = lw5Var.c;
                    i33 i33Var = new i33(y6aVar, lw5Var, (byte) 2);
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) nl9Var.b;
                    Map map = (Map) concurrentHashMap.get(y6aVar);
                    nf5 nf5Var = mcd.a;
                    if (map != null) {
                        obj = map.get(nf5Var);
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        obj = null;
                    }
                    if (obj == null) {
                        obj = i33Var.invoke();
                        Object obj2 = concurrentHashMap.get(y6aVar);
                        if (obj2 == null) {
                            obj2 = new ConcurrentHashMap(2);
                            concurrentHashMap.put(y6aVar, obj2);
                        }
                        ((Map) obj2).put(nf5Var, obj);
                    }
                    Integer num = (Integer) ((Map) obj).get(g);
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = -3;
                    }
                }
                if (i == -3) {
                    String obj3 = ((String) e0cVar.f).subSequence(0, e0cVar.b).toString();
                    obj3.getClass();
                    e0cVar.l(obj3.lastIndexOf(g, obj3.length() - 1), "Encountered an unknown key '" + g + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                    throw null;
                }
            } else if (u2) {
                rne.a(e0cVar, "object");
                throw null;
            }
        }
        if (v0dVar != v0d.e) {
            kq kqVar = (kq) e0cVar.c;
            ((int[]) kqVar.d)[kqVar.b] = i;
        }
        return i;
    }

    @Override
    public final void c() {
        q();
    }

    public final int d() {
        e0c e0cVar = (e0c) this.d;
        long i = e0cVar.i();
        int i2 = (int) i;
        if (i == i2) {
            return i2;
        }
        e0c.m(e0cVar, "Failed to parse int for input '" + i + '\'', 0, 6);
        throw null;
    }

    @Override
    public final void e(m99 m99Var) {
        q();
    }

    public final int f(y6a y6aVar, int i) {
        y6aVar.getClass();
        return d();
    }

    public final long g() {
        return ((e0c) this.d).i();
    }

    public final long h(y6a y6aVar, int i) {
        y6aVar.getClass();
        return g();
    }

    public final boolean i() {
        boolean z;
        e0c e0cVar = (e0c) this.d;
        int r = e0cVar.r(e0cVar.t());
        String str = (String) e0cVar.f;
        int length = str.length() - r;
        if (length >= 4 && r != -1) {
            int i = 0;
            while (true) {
                if (i < 4) {
                    if ("null".charAt(i) != str.charAt(r + i)) {
                        break;
                    }
                    i++;
                } else if (length <= 4 || wmd.a(str.charAt(r + 4)) != 0) {
                    e0cVar.b = r + 4;
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

    public final Object j(y6a y6aVar, int i, cx5 cx5Var, Object obj) {
        y6aVar.getClass();
        cx5Var.getClass();
        if (!cx5Var.d().c() && !i()) {
            return null;
        }
        return l(cx5Var);
    }

    public final Object k(y6a y6aVar, int i, cx5 cx5Var, Object obj) {
        boolean z;
        kq kqVar = (kq) ((e0c) this.d).c;
        y6aVar.getClass();
        cx5Var.getClass();
        if (((v0d) this.c) == v0d.e && (i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = kqVar.b;
            if (((int[]) kqVar.d)[i2] == -2) {
                ((Object[]) kqVar.c)[i2] = kg7.c;
            }
        }
        Object l = l(cx5Var);
        if (z) {
            int[] iArr = (int[]) kqVar.d;
            int i3 = kqVar.b;
            if (iArr[i3] != -2) {
                int i4 = i3 + 1;
                kqVar.b = i4;
                Object[] objArr = (Object[]) kqVar.c;
                if (i4 == objArr.length) {
                    int i5 = i4 << 1;
                    kqVar.c = Arrays.copyOf(objArr, i5);
                    iArr = Arrays.copyOf((int[]) kqVar.d, i5);
                    kqVar.d = iArr;
                }
            }
            int i6 = kqVar.b;
            ((Object[]) kqVar.c)[i6] = l;
            iArr[i6] = -2;
        }
        return l;
    }

    public final Object l(cx5 cx5Var) {
        cx5Var.getClass();
        try {
            return cx5Var.c(this);
        } catch (bg7 e2) {
            String message = e2.getMessage();
            message.getClass();
            if (hbb.f(0, 2, message, "at path") >= 0) {
                throw e2;
            }
            String message2 = e2.getMessage();
            String m = ((kq) ((e0c) this.d).c).m();
            throw new bg7(e2.a, message2 + " at path: " + m, e2);
        }
    }

    public final String m() {
        return ((e0c) this.d).j();
    }

    public final String n(y6a y6aVar, int i) {
        y6aVar.getClass();
        return m();
    }

    public final void o(y6a y6aVar) {
        e0c e0cVar = (e0c) this.d;
        y6aVar.getClass();
        if (!e0cVar.u()) {
            e0cVar.h(((v0d) this.c).b);
            kq kqVar = (kq) e0cVar.c;
            int i = kqVar.b;
            int[] iArr = (int[]) kqVar.d;
            if (iArr[i] == -2) {
                iArr[i] = -1;
                i--;
                kqVar.b = i;
            }
            if (i != -1) {
                kqVar.b = i - 1;
                return;
            }
            return;
        }
        rne.a(e0cVar, "");
        throw null;
    }

    @Override
    public final void onSuccess(java.lang.Object r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jif.onSuccess(java.lang.Object):void");
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
                jte.p(z);
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
        Iterator it = ((m99) this.d).iterator();
        while (it.hasNext()) {
            u66 u66Var = (u66) it.next();
            fArr[((Integer) u66Var.a).intValue()] = u66Var.c();
        }
        ((ho1) this.c).run();
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
            jte.p(z);
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
        int b = iqd.b(this.a, 1 << i, z);
        this.a = b;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((m99) this.d).h(Integer.valueOf(numberOfLeadingZeros2), z2);
        }
    }

    public final synchronized Task u(fdf fdfVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Queueing ".concat(fdfVar.toString()));
        }
        if (!((n9f) this.d).a(fdfVar)) {
            n9f n9fVar = new n9f(this);
            this.d = n9fVar;
            n9fVar.a(fdfVar);
        }
        return fdfVar.b.getTask();
    }

    public jif(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = new n9f(this);
        this.a = 1;
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }

    public jif(ho1 ho1Var) {
        this.b = new float[32];
        this.a = 1;
        this.d = new m99(this, uo.a, 240L);
        this.c = ho1Var;
    }

    public jif(lw5 lw5Var, v0d v0dVar, e0c e0cVar, y6a y6aVar) {
        y6aVar.getClass();
        this.b = lw5Var;
        this.c = v0dVar;
        this.d = e0cVar;
        this.a = -1;
    }

    public jif(i8e i8eVar, String str, int i, SharedPreferences sharedPreferences) {
        this.b = i8eVar;
        this.c = str;
        this.a = i;
        this.d = sharedPreferences;
    }
}
