package h2;

import a8.ia;
import a8.wa;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import m.c3;
import m.m1;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jc;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.qk;
public final class c {
    public int f14057a;
    public Object f14058b;
    public Object f14059c;
    public Object d;
    public Object f14060e;
    public Object f14061f;

    public c(pe.b bVar, qe.j jVar, a4.k kVar, me.d descriptor) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        this.f14058b = bVar;
        this.f14059c = jVar;
        this.d = kVar;
        this.f14057a = -1;
        p0 p0Var = bVar.f53459a;
        this.f14060e = p0Var;
        this.f14061f = p0Var.f14132b ? null : new qe.e(descriptor);
    }

    public void A(Runnable runnable) {
        i0 i0Var = (i0) this.f14058b;
        if (!i0Var.f14096a.getLooper().getThread().isAlive()) {
            return;
        }
        i0Var.d(runnable);
    }

    public void B(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((c3) this.d) == null) {
                this.d = new Object();
            }
            c3 c3Var = (c3) this.d;
            c3Var.f19074c = colorStateList;
            c3Var.f19073b = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void C(int i7) {
        boolean z9;
        if (i7 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        this.f14057a = i7;
        r(i7);
    }

    public void D(ColorStateList colorStateList) {
        if (((c3) this.f14060e) == null) {
            this.f14060e = new Object();
        }
        c3 c3Var = (c3) this.f14060e;
        c3Var.f19074c = colorStateList;
        c3Var.f19073b = true;
        b();
    }

    public void E(PorterDuff.Mode mode) {
        if (((c3) this.f14060e) == null) {
            this.f14060e = new Object();
        }
        c3 c3Var = (c3) this.f14060e;
        c3Var.d = mode;
        c3Var.f19072a = true;
        b();
    }

    public boolean F() {
        if (((qd0) this.f14058b).b() && ((qd0) this.f14059c).b() && ((qd0) this.d).b() && ((qd0) this.f14060e).b()) {
            return true;
        }
        return false;
    }

    public void G(Object obj) {
        Object obj2 = this.f14060e;
        this.f14060e = obj;
        if (!obj2.equals(obj)) {
            l2.i0 i0Var = ((l2.v) this.d).f18063b;
            ((Integer) obj2).getClass();
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            i0Var.F1();
            i0Var.t1(1, 10, num);
            i0Var.t1(2, 10, num);
            i0Var.f17870m.e(21, new l2.u(intValue, 1));
        }
    }

    public void a(long r10, h2.x r12) {
        throw new UnsupportedOperationException("Method not decompiled: h2.c.a(long, h2.x):void");
    }

    public void b() {
        View view = (View) this.f14058b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((c3) this.d) != null) {
                if (((c3) this.f14061f) == null) {
                    this.f14061f = new Object();
                }
                c3 c3Var = (c3) this.f14061f;
                c3Var.f19074c = null;
                c3Var.f19073b = false;
                c3Var.d = null;
                c3Var.f19072a = false;
                WeakHashMap weakHashMap = r0.i0.f54073a;
                ColorStateList c10 = r0.a0.c(view);
                if (c10 != null) {
                    c3Var.f19073b = true;
                    c3Var.f19074c = c10;
                }
                PorterDuff.Mode d = r0.a0.d(view);
                if (d != null) {
                    c3Var.f19072a = true;
                    c3Var.d = d;
                }
                if (c3Var.f19073b || c3Var.f19072a) {
                    m.r.d(background, c3Var, view.getDrawableState());
                    return;
                }
            }
            c3 c3Var2 = (c3) this.f14060e;
            if (c3Var2 != null) {
                m.r.d(background, c3Var2, view.getDrawableState());
                return;
            }
            c3 c3Var3 = (c3) this.d;
            if (c3Var3 != null) {
                m.r.d(background, c3Var3, view.getDrawableState());
            }
        }
    }

    public c c(me.d descriptor) {
        byte b10;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        pe.b bVar = (pe.b) this.f14058b;
        qe.j f10 = qe.f.f(descriptor, bVar);
        a4.k kVar = (a4.k) this.d;
        wa waVar = (wa) kVar.f192c;
        int i7 = waVar.f700b + 1;
        waVar.f700b = i7;
        Object[] objArr = (Object[]) waVar.f701c;
        if (i7 == objArr.length) {
            int i10 = i7 * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i10);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            waVar.f701c = copyOf;
            int[] copyOf2 = Arrays.copyOf((int[]) waVar.d, i10);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(...)");
            waVar.d = copyOf2;
        }
        ((Object[]) waVar.f701c)[i7] = descriptor;
        kVar.h(f10.f53991a);
        String str = (String) kVar.f194f;
        int i11 = kVar.f191b;
        while (true) {
            int r10 = kVar.r(i11);
            b10 = 10;
            if (r10 != -1) {
                char charAt = str.charAt(r10);
                if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                    kVar.f191b = r10;
                    b10 = qe.f.b(charAt);
                    break;
                }
                i11 = r10 + 1;
            } else {
                kVar.f191b = r10;
                break;
            }
        }
        if (b10 != 4) {
            int ordinal = f10.ordinal();
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                if (((qe.j) this.f14059c) == f10 && bVar.f53459a.f14132b) {
                    return this;
                }
                return new c(bVar, f10, kVar, descriptor);
            }
            return new c(bVar, f10, kVar, descriptor);
        }
        a4.k.n(kVar, "Unexpected leading comma", 0, 6);
        throw null;
    }

    public int d(me.d descriptor) {
        Object obj;
        boolean z9;
        pe.b json = (pe.b) this.f14058b;
        p0 p0Var = json.f53459a;
        a4.k kVar = (a4.k) this.d;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        qe.j jVar = (qe.j) this.f14059c;
        int ordinal = jVar.ordinal();
        int i7 = 0;
        r10 = false;
        boolean z10 = false;
        int i10 = -1;
        if (ordinal != 0) {
            if (ordinal != 2) {
                boolean v = kVar.v();
                if (kVar.e()) {
                    int i11 = this.f14057a;
                    if (i11 != -1 && !v) {
                        a4.k.n(kVar, "Expected end of the array or comma", 0, 6);
                        throw null;
                    }
                    i10 = i11 + 1;
                    this.f14057a = i10;
                } else if (v) {
                    p0Var.getClass();
                    qe.f.c(kVar, "array");
                    throw null;
                }
            } else {
                int i12 = this.f14057a;
                if (i12 % 2 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    if (i12 != -1) {
                        z10 = kVar.v();
                    }
                } else {
                    kVar.h(':');
                }
                if (kVar.e()) {
                    if (z9) {
                        if (this.f14057a == -1) {
                            int i13 = kVar.f191b;
                            if (z10) {
                                a4.k.n(kVar, "Unexpected leading comma", i13, 4);
                                throw null;
                            }
                        } else {
                            int i14 = kVar.f191b;
                            if (!z10) {
                                a4.k.n(kVar, "Expected comma after the key-value pair", i14, 4);
                                throw null;
                            }
                        }
                    }
                    i10 = this.f14057a + 1;
                    this.f14057a = i10;
                } else if (z10) {
                    p0Var.getClass();
                    qe.f.c(kVar, "object");
                    throw null;
                }
            }
        } else {
            qe.e eVar = (qe.e) this.f14061f;
            p0 p0Var2 = (p0) this.f14060e;
            boolean v10 = kVar.v();
            if (kVar.e()) {
                p0Var2.getClass();
                String name = kVar.g();
                kVar.h(':');
                kotlin.jvm.internal.j.e(descriptor, "<this>");
                kotlin.jvm.internal.j.e(json, "json");
                kotlin.jvm.internal.j.e(name, "name");
                p0 p0Var3 = json.f53459a;
                p0Var3.getClass();
                qe.f.e(descriptor, json);
                int d = descriptor.d(name);
                i10 = -3;
                if (d != -3 || !p0Var3.f14133c) {
                    i10 = d;
                } else {
                    org.telegram.ui.Components.n nVar = json.f53461c;
                    b1.f fVar = new b1.f(2, descriptor, json);
                    nVar.getClass();
                    nVar.getClass();
                    kotlin.jvm.internal.j.e(descriptor, "descriptor");
                    Map map = (Map) ((ConcurrentHashMap) nVar.f36166a).get(descriptor);
                    qe.g gVar = qe.f.f53977a;
                    Object obj2 = null;
                    if (map != null) {
                        obj = map.get(gVar);
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        obj2 = obj;
                    }
                    if (obj2 == null) {
                        obj2 = fVar.invoke();
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) nVar.f36166a;
                        Object obj3 = concurrentHashMap.get(descriptor);
                        ConcurrentHashMap concurrentHashMap2 = obj3;
                        if (obj3 == null) {
                            ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap(2);
                            concurrentHashMap.put(descriptor, concurrentHashMap3);
                            concurrentHashMap2 = concurrentHashMap3;
                        }
                        ((Map) concurrentHashMap2).put(gVar, obj2);
                    }
                    Integer num = (Integer) ((Map) obj2).get(name);
                    if (num != null) {
                        i10 = num.intValue();
                    }
                }
                if (i10 != -3) {
                    if (eVar != null) {
                        oe.d dVar = eVar.f53975a;
                        if (i10 < 64) {
                            dVar.f20905c |= 1 << i10;
                        } else {
                            int i15 = (i10 >>> 6) - 1;
                            long[] jArr = dVar.d;
                            jArr[i15] = jArr[i15] | (1 << (i10 & 63));
                        }
                    }
                } else {
                    String obj4 = ((String) kVar.f194f).subSequence(0, kVar.f191b).toString();
                    int f10 = xd.d.f(obj4);
                    kotlin.jvm.internal.j.e(obj4, "<this>");
                    kVar.m(obj4.lastIndexOf(name, f10), "Encountered an unknown key '" + name + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                    throw null;
                }
            } else if (!v10) {
                if (eVar != null) {
                    oe.d dVar2 = eVar.f53975a;
                    c1.c cVar = dVar2.f20904b;
                    me.d dVar3 = dVar2.f20903a;
                    int f11 = dVar3.f();
                    while (true) {
                        long j3 = dVar2.f20905c;
                        if (j3 != -1) {
                            int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j3);
                            dVar2.f20905c |= 1 << numberOfTrailingZeros;
                            if (((Boolean) cVar.invoke(dVar3, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                i10 = numberOfTrailingZeros;
                                break;
                            }
                        } else if (f11 > 64) {
                            long[] jArr2 = dVar2.d;
                            int length = jArr2.length;
                            loop1: while (true) {
                                if (i7 >= length) {
                                    break;
                                }
                                int i16 = i7 + 1;
                                int i17 = i16 * 64;
                                long j10 = jArr2[i7];
                                while (j10 != -1) {
                                    long[] jArr3 = jArr2;
                                    int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j10);
                                    j10 |= 1 << numberOfTrailingZeros2;
                                    int i18 = numberOfTrailingZeros2 + i17;
                                    if (((Boolean) cVar.invoke(dVar3, Integer.valueOf(i18))).booleanValue()) {
                                        jArr3[i7] = j10;
                                        i10 = i18;
                                        break loop1;
                                    }
                                    jArr2 = jArr3;
                                }
                                jArr2[i7] = j10;
                                i7 = i16;
                            }
                        }
                    }
                }
            } else {
                p0Var.getClass();
                qe.f.c(kVar, "object");
                throw null;
            }
        }
        if (jVar != qe.j.f53988e) {
            wa waVar = (wa) kVar.f192c;
            ((int[]) waVar.d)[waVar.f700b] = i10;
        }
        return i10;
    }

    public int e() {
        a4.k kVar = (a4.k) this.d;
        long i7 = kVar.i();
        int i10 = (int) i7;
        if (i7 == i10) {
            return i10;
        }
        a4.k.n(kVar, "Failed to parse int for input '" + i7 + '\'', 0, 6);
        throw null;
    }

    public int f(me.d descriptor, int i7) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        return e();
    }

    public long g() {
        return ((a4.k) this.d).i();
    }

    public long h(me.d descriptor, int i7) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        return g();
    }

    public boolean i() {
        boolean z9;
        qe.e eVar = (qe.e) this.f14061f;
        if (eVar != null) {
            z9 = eVar.f53976b;
        } else {
            z9 = false;
        }
        if (!z9) {
            a4.k kVar = (a4.k) this.d;
            int r10 = kVar.r(kVar.u());
            String str = (String) kVar.f194f;
            int length = str.length() - r10;
            boolean z10 = false;
            if (length >= 4 && r10 != -1) {
                int i7 = 0;
                while (true) {
                    if (i7 < 4) {
                        if ("null".charAt(i7) != str.charAt(r10 + i7)) {
                            break;
                        }
                        i7++;
                    } else if (length <= 4 || qe.f.b(str.charAt(r10 + 4)) != 0) {
                        z10 = true;
                        kVar.f191b = r10 + 4;
                    }
                }
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    public Object j(me.d descriptor, int i7, ke.a deserializer, Object obj) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(deserializer, "deserializer");
        if (!deserializer.d().c() && !i()) {
            return null;
        }
        return l(deserializer);
    }

    public Object k(me.d descriptor, int i7, ke.a deserializer, Object obj) {
        boolean z9;
        wa waVar = (wa) ((a4.k) this.d).f192c;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(deserializer, "deserializer");
        if (((qe.j) this.f14059c) == qe.j.f53988e && (i7 & 1) == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            int i10 = waVar.f700b;
            if (((int[]) waVar.d)[i10] == -2) {
                ((Object[]) waVar.f701c)[i10] = qe.g.f53978a;
            }
        }
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(deserializer, "deserializer");
        Object l10 = l(deserializer);
        if (z9) {
            int i11 = waVar.f700b;
            if (((int[]) waVar.d)[i11] != -2) {
                int i12 = i11 + 1;
                waVar.f700b = i12;
                Object[] objArr = (Object[]) waVar.f701c;
                if (i12 == objArr.length) {
                    int i13 = i12 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i13);
                    kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
                    waVar.f701c = copyOf;
                    int[] copyOf2 = Arrays.copyOf((int[]) waVar.d, i13);
                    kotlin.jvm.internal.j.d(copyOf2, "copyOf(...)");
                    waVar.d = copyOf2;
                }
            }
            int i14 = waVar.f700b;
            ((Object[]) waVar.f701c)[i14] = l10;
            ((int[]) waVar.d)[i14] = -2;
        }
        return l10;
    }

    public Object l(ke.a deserializer) {
        kotlin.jvm.internal.j.e(deserializer, "deserializer");
        try {
            return deserializer.b(this);
        } catch (ke.b e10) {
            String message = e10.getMessage();
            kotlin.jvm.internal.j.b(message);
            if (xd.d.e(message, "at path")) {
                throw e10;
            }
            throw new ke.b(e10.f17262a, e10.getMessage() + " at path: " + ((wa) ((a4.k) this.d).f192c).m(), e10);
        }
    }

    public String m() {
        ((p0) this.f14060e).getClass();
        return ((a4.k) this.d).j();
    }

    public String n(me.d descriptor, int i7) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        return m();
    }

    public void o() {
        this.f14058b = null;
        if (((qk) this.f14061f) != null) {
            Utilities.f21333e.a((qk) this.f14061f);
        }
        Bitmap bitmap = (Bitmap) this.f14059c;
        if (bitmap != null && !bitmap.isRecycled()) {
            ((Bitmap) this.f14059c).recycle();
        }
        this.f14059c = null;
    }

    public void p(me.d descriptor) {
        a4.k kVar = (a4.k) this.d;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        p0 p0Var = ((pe.b) this.f14058b).f53459a;
        p0Var.getClass();
        if (!kVar.v()) {
            kVar.h(((qe.j) this.f14059c).f53992b);
            wa waVar = (wa) kVar.f192c;
            int i7 = waVar.f700b;
            int[] iArr = (int[]) waVar.d;
            if (iArr[i7] == -2) {
                iArr[i7] = -1;
                waVar.f700b = i7 - 1;
            }
            int i10 = waVar.f700b;
            if (i10 != -1) {
                waVar.f700b = i10 - 1;
                return;
            }
            return;
        }
        p0Var.getClass();
        qe.f.c(kVar, "");
        throw null;
    }

    public void q() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f14061f;
        byteBuffer.position(0);
        qd0 qd0Var = (qd0) this.f14058b;
        if (qd0Var.f37380f == null) {
            qd0Var.a();
        }
        float[] fArr = qd0Var.f37380f;
        qd0 qd0Var2 = (qd0) this.f14059c;
        if (qd0Var2.f37380f == null) {
            qd0Var2.a();
        }
        float[] fArr2 = qd0Var2.f37380f;
        qd0 qd0Var3 = (qd0) this.d;
        if (qd0Var3.f37380f == null) {
            qd0Var3.a();
        }
        float[] fArr3 = qd0Var3.f37380f;
        qd0 qd0Var4 = (qd0) this.f14060e;
        if (qd0Var4.f37380f == null) {
            qd0Var4.a();
        }
        float[] fArr4 = qd0Var4.f37380f;
        for (int i7 = 0; i7 < 200; i7++) {
            byteBuffer.put((byte) (fArr2[i7] * 255.0f));
            byteBuffer.put((byte) (fArr3[i7] * 255.0f));
            byteBuffer.put((byte) (fArr4[i7] * 255.0f));
            byteBuffer.put((byte) (fArr[i7] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public void r(int i7) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.f14060e;
        while (priorityQueue.size() > i7) {
            i2.t tVar = (i2.t) priorityQueue.poll();
            String str = m0.f14112a;
            int i10 = 0;
            while (true) {
                arrayList = tVar.f15224a;
                if (i10 >= arrayList.size()) {
                    break;
                }
                ((i2.u) this.f14058b).b(tVar.f15225b, (x) arrayList.get(i10));
                ((ArrayDeque) this.f14059c).push((x) arrayList.get(i10));
                i10++;
            }
            arrayList.clear();
            i2.t tVar2 = (i2.t) this.f14061f;
            if (tVar2 != null && tVar2.f15225b == tVar.f15225b) {
                this.f14061f = null;
            }
            ((ArrayDeque) this.d).push(tVar);
        }
    }

    public android.graphics.Bitmap s(android.graphics.Bitmap r9, java.lang.String r10, int r11, int r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: h2.c.s(android.graphics.Bitmap, java.lang.String, int, int, boolean):android.graphics.Bitmap");
    }

    public Bitmap t(jc jcVar) {
        if (jcVar == null) {
            return null;
        }
        return s(jcVar.f23509c, jcVar.f23507a, jcVar.f23510e, 0, false);
    }

    public Bitmap u(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return null;
        }
        return s(imageReceiver.n(), imageReceiver.Q, imageReceiver.U, imageReceiver.V, false);
    }

    public ColorStateList v() {
        c3 c3Var = (c3) this.f14060e;
        if (c3Var != null) {
            return (ColorStateList) c3Var.f19074c;
        }
        return null;
    }

    public PorterDuff.Mode w() {
        c3 c3Var = (c3) this.f14060e;
        if (c3Var != null) {
            return (PorterDuff.Mode) c3Var.d;
        }
        return null;
    }

    public void x(AttributeSet attributeSet, int i7) {
        ColorStateList i10;
        View view = (View) this.f14058b;
        Context context = view.getContext();
        int[] iArr = f.a.f10877z;
        h6.m x10 = h6.m.x(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) x10.f14265c;
        View view2 = (View) this.f14058b;
        r0.i0.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) x10.f14265c, i7);
        try {
            if (typedArray.hasValue(0)) {
                this.f14057a = typedArray.getResourceId(0, -1);
                m.r rVar = (m.r) this.f14059c;
                Context context2 = view.getContext();
                int i11 = this.f14057a;
                synchronized (rVar) {
                    i10 = rVar.f19233a.i(context2, i11);
                }
                if (i10 != null) {
                    B(i10);
                }
            }
            if (typedArray.hasValue(1)) {
                r0.a0.f(view, x10.o(1));
            }
            if (typedArray.hasValue(2)) {
                r0.a0.g(view, m1.b(typedArray.getInt(2, -1), null));
            }
            x10.C();
        } catch (Throwable th2) {
            x10.C();
            throw th2;
        }
    }

    public void y() {
        this.f14057a = -1;
        B(null);
        b();
    }

    public void z(int i7) {
        ColorStateList colorStateList;
        this.f14057a = i7;
        m.r rVar = (m.r) this.f14059c;
        if (rVar != null) {
            Context context = ((View) this.f14058b).getContext();
            synchronized (rVar) {
                colorStateList = rVar.f19233a.i(context, i7);
            }
        } else {
            colorStateList = null;
        }
        B(colorStateList);
        b();
    }

    public c(View view) {
        this.f14057a = -1;
        this.f14058b = view;
        this.f14059c = m.r.a();
    }

    public c(i2.u uVar) {
        this.f14058b = uVar;
        this.f14059c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.f14060e = new PriorityQueue();
        this.f14057a = -1;
    }

    public c() {
        this.f14058b = new qd0();
        this.f14059c = new qd0();
        this.d = new qd0();
        this.f14060e = new qd0();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.f14061f = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public c(int i7, Runnable runnable) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f14057a = i7;
        this.f14060e = runnable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
