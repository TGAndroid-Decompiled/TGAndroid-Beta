package h2;

import a8.ma;
import a8.xa;
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
import m.b3;
import m.l1;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hc;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Components.be0;
import org.telegram.ui.rk;
public final class c {
    public int f13724a;
    public Object f13725b;
    public Object f13726c;
    public Object d;
    public Object f13727e;
    public Object f13728f;

    public c(pe.b bVar, qe.j jVar, a4.k kVar, me.d descriptor) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        this.f13725b = bVar;
        this.f13726c = jVar;
        this.d = kVar;
        this.f13724a = -1;
        o0 o0Var = bVar.f55695a;
        this.f13727e = o0Var;
        this.f13728f = o0Var.f13798b ? null : new qe.e(descriptor);
    }

    public void A(Runnable runnable) {
        i0 i0Var = (i0) this.f13725b;
        if (!i0Var.f13763a.getLooper().getThread().isAlive()) {
            return;
        }
        i0Var.d(runnable);
    }

    public void B(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((b3) this.d) == null) {
                this.d = new Object();
            }
            b3 b3Var = (b3) this.d;
            b3Var.f20117c = colorStateList;
            b3Var.f20116b = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void C(int i7) {
        boolean z10;
        if (i7 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.p(z10);
        this.f13724a = i7;
        r(i7);
    }

    public void D(ColorStateList colorStateList) {
        if (((b3) this.f13727e) == null) {
            this.f13727e = new Object();
        }
        b3 b3Var = (b3) this.f13727e;
        b3Var.f20117c = colorStateList;
        b3Var.f20116b = true;
        b();
    }

    public void E(PorterDuff.Mode mode) {
        if (((b3) this.f13727e) == null) {
            this.f13727e = new Object();
        }
        b3 b3Var = (b3) this.f13727e;
        b3Var.d = mode;
        b3Var.f20115a = true;
        b();
    }

    public boolean F() {
        if (((be0) this.f13725b).b() && ((be0) this.f13726c).b() && ((be0) this.d).b() && ((be0) this.f13727e).b()) {
            return true;
        }
        return false;
    }

    public void G(Object obj) {
        Object obj2 = this.f13727e;
        this.f13727e = obj;
        if (!obj2.equals(obj)) {
            l2.g0 g0Var = ((l2.v) this.d).f19648b;
            ((Integer) obj2).getClass();
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            g0Var.F1();
            g0Var.t1(1, 10, num);
            g0Var.t1(2, 10, num);
            g0Var.f19434m.e(21, new l2.u(intValue, 1));
        }
    }

    public void a(long r10, h2.x r12) {
        throw new UnsupportedOperationException("Method not decompiled: h2.c.a(long, h2.x):void");
    }

    public void b() {
        View view = (View) this.f13725b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((b3) this.d) != null) {
                if (((b3) this.f13728f) == null) {
                    this.f13728f = new Object();
                }
                b3 b3Var = (b3) this.f13728f;
                b3Var.f20117c = null;
                b3Var.f20116b = false;
                b3Var.d = null;
                b3Var.f20115a = false;
                WeakHashMap weakHashMap = r0.i0.f56367a;
                ColorStateList c10 = r0.a0.c(view);
                if (c10 != null) {
                    b3Var.f20116b = true;
                    b3Var.f20117c = c10;
                }
                PorterDuff.Mode d = r0.a0.d(view);
                if (d != null) {
                    b3Var.f20115a = true;
                    b3Var.d = d;
                }
                if (b3Var.f20116b || b3Var.f20115a) {
                    m.q.d(background, b3Var, view.getDrawableState());
                    return;
                }
            }
            b3 b3Var2 = (b3) this.f13727e;
            if (b3Var2 != null) {
                m.q.d(background, b3Var2, view.getDrawableState());
                return;
            }
            b3 b3Var3 = (b3) this.d;
            if (b3Var3 != null) {
                m.q.d(background, b3Var3, view.getDrawableState());
            }
        }
    }

    public c c(me.d descriptor) {
        byte b10;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        pe.b bVar = (pe.b) this.f13725b;
        qe.j f10 = qe.f.f(descriptor, bVar);
        a4.k kVar = (a4.k) this.d;
        xa xaVar = (xa) kVar.f192c;
        int i7 = xaVar.f713b + 1;
        xaVar.f713b = i7;
        Object[] objArr = (Object[]) xaVar.f714c;
        if (i7 == objArr.length) {
            int i10 = i7 * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i10);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            xaVar.f714c = copyOf;
            int[] copyOf2 = Arrays.copyOf((int[]) xaVar.d, i10);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(...)");
            xaVar.d = copyOf2;
        }
        ((Object[]) xaVar.f714c)[i7] = descriptor;
        kVar.h(f10.f56252a);
        String str = (String) kVar.f194f;
        int i11 = kVar.f191b;
        while (true) {
            int q10 = kVar.q(i11);
            b10 = 10;
            if (q10 != -1) {
                char charAt = str.charAt(q10);
                if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                    kVar.f191b = q10;
                    b10 = qe.f.b(charAt);
                    break;
                }
                i11 = q10 + 1;
            } else {
                kVar.f191b = q10;
                break;
            }
        }
        if (b10 != 4) {
            int ordinal = f10.ordinal();
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                if (((qe.j) this.f13726c) == f10 && bVar.f55695a.f13798b) {
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
        boolean z10;
        pe.b json = (pe.b) this.f13725b;
        o0 o0Var = json.f55695a;
        a4.k kVar = (a4.k) this.d;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        qe.j jVar = (qe.j) this.f13726c;
        int ordinal = jVar.ordinal();
        int i7 = 0;
        r10 = false;
        boolean z11 = false;
        int i10 = -1;
        if (ordinal != 0) {
            if (ordinal != 2) {
                boolean u10 = kVar.u();
                if (kVar.e()) {
                    int i11 = this.f13724a;
                    if (i11 != -1 && !u10) {
                        a4.k.n(kVar, "Expected end of the array or comma", 0, 6);
                        throw null;
                    }
                    i10 = i11 + 1;
                    this.f13724a = i10;
                } else if (u10) {
                    o0Var.getClass();
                    qe.f.c(kVar, "array");
                    throw null;
                }
            } else {
                int i12 = this.f13724a;
                if (i12 % 2 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (i12 != -1) {
                        z11 = kVar.u();
                    }
                } else {
                    kVar.h(':');
                }
                if (kVar.e()) {
                    if (z10) {
                        if (this.f13724a == -1) {
                            int i13 = kVar.f191b;
                            if (z11) {
                                a4.k.n(kVar, "Unexpected leading comma", i13, 4);
                                throw null;
                            }
                        } else {
                            int i14 = kVar.f191b;
                            if (!z11) {
                                a4.k.n(kVar, "Expected comma after the key-value pair", i14, 4);
                                throw null;
                            }
                        }
                    }
                    i10 = this.f13724a + 1;
                    this.f13724a = i10;
                } else if (z11) {
                    o0Var.getClass();
                    qe.f.c(kVar, "object");
                    throw null;
                }
            }
        } else {
            qe.e eVar = (qe.e) this.f13728f;
            o0 o0Var2 = (o0) this.f13727e;
            boolean u11 = kVar.u();
            if (kVar.e()) {
                o0Var2.getClass();
                String name = kVar.g();
                kVar.h(':');
                kotlin.jvm.internal.j.e(descriptor, "<this>");
                kotlin.jvm.internal.j.e(json, "json");
                kotlin.jvm.internal.j.e(name, "name");
                o0 o0Var3 = json.f55695a;
                o0Var3.getClass();
                qe.f.e(descriptor, json);
                int d = descriptor.d(name);
                i10 = -3;
                if (d != -3 || !o0Var3.f13799c) {
                    i10 = d;
                } else {
                    i5 i5Var = json.f55697c;
                    b1.f fVar = new b1.f(2, descriptor, json);
                    i5Var.getClass();
                    i5Var.getClass();
                    kotlin.jvm.internal.j.e(descriptor, "descriptor");
                    Map map = (Map) ((ConcurrentHashMap) i5Var.f29095a).get(descriptor);
                    qe.g gVar = qe.f.f56238a;
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
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) i5Var.f29095a;
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
                        oe.d dVar = eVar.f56236a;
                        if (i10 < 64) {
                            dVar.f21888c |= 1 << i10;
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
            } else if (!u11) {
                if (eVar != null) {
                    oe.d dVar2 = eVar.f56236a;
                    c1.d dVar3 = dVar2.f21887b;
                    me.d dVar4 = dVar2.f21886a;
                    int f11 = dVar4.f();
                    while (true) {
                        long j3 = dVar2.f21888c;
                        if (j3 != -1) {
                            int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j3);
                            dVar2.f21888c |= 1 << numberOfTrailingZeros;
                            if (((Boolean) dVar3.invoke(dVar4, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
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
                                    if (((Boolean) dVar3.invoke(dVar4, Integer.valueOf(i18))).booleanValue()) {
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
                o0Var.getClass();
                qe.f.c(kVar, "object");
                throw null;
            }
        }
        if (jVar != qe.j.f56249e) {
            xa xaVar = (xa) kVar.f192c;
            ((int[]) xaVar.d)[xaVar.f713b] = i10;
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
        boolean z10;
        qe.e eVar = (qe.e) this.f13728f;
        if (eVar != null) {
            z10 = eVar.f56237b;
        } else {
            z10 = false;
        }
        if (!z10) {
            a4.k kVar = (a4.k) this.d;
            int q10 = kVar.q(kVar.t());
            String str = (String) kVar.f194f;
            int length = str.length() - q10;
            boolean z11 = false;
            if (length >= 4 && q10 != -1) {
                int i7 = 0;
                while (true) {
                    if (i7 < 4) {
                        if ("null".charAt(i7) != str.charAt(q10 + i7)) {
                            break;
                        }
                        i7++;
                    } else if (length <= 4 || qe.f.b(str.charAt(q10 + 4)) != 0) {
                        z11 = true;
                        kVar.f191b = q10 + 4;
                    }
                }
            }
            if (!z11) {
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
        boolean z10;
        xa xaVar = (xa) ((a4.k) this.d).f192c;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(deserializer, "deserializer");
        if (((qe.j) this.f13726c) == qe.j.f56249e && (i7 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i10 = xaVar.f713b;
            if (((int[]) xaVar.d)[i10] == -2) {
                ((Object[]) xaVar.f714c)[i10] = qe.g.f56239a;
            }
        }
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(deserializer, "deserializer");
        Object l10 = l(deserializer);
        if (z10) {
            int i11 = xaVar.f713b;
            if (((int[]) xaVar.d)[i11] != -2) {
                int i12 = i11 + 1;
                xaVar.f713b = i12;
                Object[] objArr = (Object[]) xaVar.f714c;
                if (i12 == objArr.length) {
                    int i13 = i12 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i13);
                    kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
                    xaVar.f714c = copyOf;
                    int[] copyOf2 = Arrays.copyOf((int[]) xaVar.d, i13);
                    kotlin.jvm.internal.j.d(copyOf2, "copyOf(...)");
                    xaVar.d = copyOf2;
                }
            }
            int i14 = xaVar.f713b;
            ((Object[]) xaVar.f714c)[i14] = l10;
            ((int[]) xaVar.d)[i14] = -2;
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
            throw new ke.b(e10.f18312a, e10.getMessage() + " at path: " + ((xa) ((a4.k) this.d).f192c).l(), e10);
        }
    }

    public String m() {
        ((o0) this.f13727e).getClass();
        return ((a4.k) this.d).j();
    }

    public String n(me.d descriptor, int i7) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        return m();
    }

    public void o() {
        this.f13725b = null;
        if (((rk) this.f13728f) != null) {
            Utilities.f22877e.a((rk) this.f13728f);
        }
        Bitmap bitmap = (Bitmap) this.f13726c;
        if (bitmap != null && !bitmap.isRecycled()) {
            ((Bitmap) this.f13726c).recycle();
        }
        this.f13726c = null;
    }

    public void p(me.d descriptor) {
        a4.k kVar = (a4.k) this.d;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        o0 o0Var = ((pe.b) this.f13725b).f55695a;
        o0Var.getClass();
        if (!kVar.u()) {
            kVar.h(((qe.j) this.f13726c).f56253b);
            xa xaVar = (xa) kVar.f192c;
            int i7 = xaVar.f713b;
            int[] iArr = (int[]) xaVar.d;
            if (iArr[i7] == -2) {
                iArr[i7] = -1;
                xaVar.f713b = i7 - 1;
            }
            int i10 = xaVar.f713b;
            if (i10 != -1) {
                xaVar.f713b = i10 - 1;
                return;
            }
            return;
        }
        o0Var.getClass();
        qe.f.c(kVar, "");
        throw null;
    }

    public void q() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f13728f;
        byteBuffer.position(0);
        be0 be0Var = (be0) this.f13725b;
        if (be0Var.f33748f == null) {
            be0Var.a();
        }
        float[] fArr = be0Var.f33748f;
        be0 be0Var2 = (be0) this.f13726c;
        if (be0Var2.f33748f == null) {
            be0Var2.a();
        }
        float[] fArr2 = be0Var2.f33748f;
        be0 be0Var3 = (be0) this.d;
        if (be0Var3.f33748f == null) {
            be0Var3.a();
        }
        float[] fArr3 = be0Var3.f33748f;
        be0 be0Var4 = (be0) this.f13727e;
        if (be0Var4.f33748f == null) {
            be0Var4.a();
        }
        float[] fArr4 = be0Var4.f33748f;
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
        PriorityQueue priorityQueue = (PriorityQueue) this.f13727e;
        while (priorityQueue.size() > i7) {
            i2.t tVar = (i2.t) priorityQueue.poll();
            String str = l0.f13778a;
            int i10 = 0;
            while (true) {
                arrayList = tVar.f16085a;
                if (i10 >= arrayList.size()) {
                    break;
                }
                ((i2.u) this.f13725b).a(tVar.f16086b, (x) arrayList.get(i10));
                ((ArrayDeque) this.f13726c).push((x) arrayList.get(i10));
                i10++;
            }
            arrayList.clear();
            i2.t tVar2 = (i2.t) this.f13728f;
            if (tVar2 != null && tVar2.f16086b == tVar.f16086b) {
                this.f13728f = null;
            }
            ((ArrayDeque) this.d).push(tVar);
        }
    }

    public android.graphics.Bitmap s(android.graphics.Bitmap r9, java.lang.String r10, int r11, int r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: h2.c.s(android.graphics.Bitmap, java.lang.String, int, int, boolean):android.graphics.Bitmap");
    }

    public Bitmap t(hc hcVar) {
        if (hcVar == null) {
            return null;
        }
        return s(hcVar.f24522c, hcVar.f24520a, hcVar.f24523e, 0, false);
    }

    public Bitmap u(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return null;
        }
        return s(imageReceiver.n(), imageReceiver.R, imageReceiver.V, imageReceiver.W, false);
    }

    public ColorStateList v() {
        b3 b3Var = (b3) this.f13727e;
        if (b3Var != null) {
            return (ColorStateList) b3Var.f20117c;
        }
        return null;
    }

    public PorterDuff.Mode w() {
        b3 b3Var = (b3) this.f13727e;
        if (b3Var != null) {
            return (PorterDuff.Mode) b3Var.d;
        }
        return null;
    }

    public void x(AttributeSet attributeSet, int i7) {
        ColorStateList i10;
        View view = (View) this.f13725b;
        Context context = view.getContext();
        int[] iArr = f.a.f11003z;
        h6.m E = h6.m.E(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) E.f13932c;
        View view2 = (View) this.f13725b;
        r0.i0.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) E.f13932c, i7);
        try {
            if (typedArray.hasValue(0)) {
                this.f13724a = typedArray.getResourceId(0, -1);
                m.q qVar = (m.q) this.f13726c;
                Context context2 = view.getContext();
                int i11 = this.f13724a;
                synchronized (qVar) {
                    i10 = qVar.f20274a.i(context2, i11);
                }
                if (i10 != null) {
                    B(i10);
                }
            }
            if (typedArray.hasValue(1)) {
                r0.a0.f(view, E.y(1));
            }
            if (typedArray.hasValue(2)) {
                r0.a0.g(view, l1.b(typedArray.getInt(2, -1), null));
            }
            E.G();
        } catch (Throwable th2) {
            E.G();
            throw th2;
        }
    }

    public void y() {
        this.f13724a = -1;
        B(null);
        b();
    }

    public void z(int i7) {
        ColorStateList colorStateList;
        this.f13724a = i7;
        m.q qVar = (m.q) this.f13726c;
        if (qVar != null) {
            Context context = ((View) this.f13725b).getContext();
            synchronized (qVar) {
                colorStateList = qVar.f20274a.i(context, i7);
            }
        } else {
            colorStateList = null;
        }
        B(colorStateList);
        b();
    }

    public c(View view) {
        this.f13724a = -1;
        this.f13725b = view;
        this.f13726c = m.q.a();
    }

    public c(i2.u uVar) {
        this.f13725b = uVar;
        this.f13726c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.f13727e = new PriorityQueue();
        this.f13724a = -1;
    }

    public c() {
        this.f13725b = new be0();
        this.f13726c = new be0();
        this.d = new be0();
        this.f13727e = new be0();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.f13728f = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public c(int i7, Runnable runnable) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f13724a = i7;
        this.f13727e = runnable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
