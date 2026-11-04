package g2;

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
import b8.kg;
import b8.zb;
import gi.w5;
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
import org.telegram.messenger.cc;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.mk;
public final class d {
    public int f11818a;
    public Object f11819b;
    public Object f11820c;
    public Object d;
    public Object f11821e;
    public Object f11822f;

    public d(me.b bVar, ne.j jVar, e0.e0 e0Var, je.d descriptor) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        this.f11819b = bVar;
        this.f11820c = jVar;
        this.d = e0Var;
        this.f11818a = -1;
        q0 q0Var = bVar.f19277a;
        this.f11821e = q0Var;
        this.f11822f = q0Var.f11893b ? null : new ne.e(descriptor);
    }

    public void A(Runnable runnable) {
        j0 j0Var = (j0) this.f11819b;
        if (!j0Var.f11857a.getLooper().getThread().isAlive()) {
            return;
        }
        j0Var.d(runnable);
    }

    public void B(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((b3) this.d) == null) {
                this.d = new Object();
            }
            b3 b3Var = (b3) this.d;
            b3Var.f18547c = colorStateList;
            b3Var.f18546b = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void C(int i3) {
        boolean z10;
        if (i3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        this.f11818a = i3;
        r(i3);
    }

    public void D(ColorStateList colorStateList) {
        if (((b3) this.f11821e) == null) {
            this.f11821e = new Object();
        }
        b3 b3Var = (b3) this.f11821e;
        b3Var.f18547c = colorStateList;
        b3Var.f18546b = true;
        b();
    }

    public void E(PorterDuff.Mode mode) {
        if (((b3) this.f11821e) == null) {
            this.f11821e = new Object();
        }
        b3 b3Var = (b3) this.f11821e;
        b3Var.d = mode;
        b3Var.f18545a = true;
        b();
    }

    public boolean F() {
        if (((ld0) this.f11819b).b() && ((ld0) this.f11820c).b() && ((ld0) this.d).b() && ((ld0) this.f11821e).b()) {
            return true;
        }
        return false;
    }

    public void G(Object obj) {
        Object obj2 = this.f11821e;
        this.f11821e = obj;
        if (!obj2.equals(obj)) {
            k2.i0 i0Var = ((k2.w) this.d).f16757b;
            ((Integer) obj2).getClass();
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            i0Var.F1();
            i0Var.t1(1, 10, num);
            i0Var.t1(2, 10, num);
            i0Var.f16561m.e(21, new k2.v(intValue, 1));
        }
    }

    public void a(long r10, g2.y r12) {
        throw new UnsupportedOperationException("Method not decompiled: g2.d.a(long, g2.y):void");
    }

    public void b() {
        View view = (View) this.f11819b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((b3) this.d) != null) {
                if (((b3) this.f11822f) == null) {
                    this.f11822f = new Object();
                }
                b3 b3Var = (b3) this.f11822f;
                b3Var.f18547c = null;
                b3Var.f18546b = false;
                b3Var.d = null;
                b3Var.f18545a = false;
                WeakHashMap weakHashMap = r0.i0.f54015a;
                ColorStateList c2 = r0.a0.c(view);
                if (c2 != null) {
                    b3Var.f18546b = true;
                    b3Var.f18547c = c2;
                }
                PorterDuff.Mode d = r0.a0.d(view);
                if (d != null) {
                    b3Var.f18545a = true;
                    b3Var.d = d;
                }
                if (b3Var.f18546b || b3Var.f18545a) {
                    m.q.d(background, b3Var, view.getDrawableState());
                    return;
                }
            }
            b3 b3Var2 = (b3) this.f11821e;
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

    public d c(je.d descriptor) {
        byte b10;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        me.b bVar = (me.b) this.f11819b;
        ne.j f10 = ne.f.f(descriptor, bVar);
        e0.e0 e0Var = (e0.e0) this.d;
        kg kgVar = (kg) e0Var.f9226c;
        int i3 = kgVar.f2722b + 1;
        kgVar.f2722b = i3;
        Object[] objArr = (Object[]) kgVar.f2723c;
        if (i3 == objArr.length) {
            int i10 = i3 * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i10);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            kgVar.f2723c = copyOf;
            int[] copyOf2 = Arrays.copyOf((int[]) kgVar.d, i10);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(...)");
            kgVar.d = copyOf2;
        }
        ((Object[]) kgVar.f2723c)[i3] = descriptor;
        e0Var.h(f10.f20364a);
        String str = (String) e0Var.f9228f;
        int i11 = e0Var.f9225b;
        while (true) {
            int r5 = e0Var.r(i11);
            b10 = 10;
            if (r5 != -1) {
                char charAt = str.charAt(r5);
                if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                    e0Var.f9225b = r5;
                    b10 = ne.f.b(charAt);
                    break;
                }
                i11 = r5 + 1;
            } else {
                e0Var.f9225b = r5;
                break;
            }
        }
        if (b10 != 4) {
            int ordinal = f10.ordinal();
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                if (((ne.j) this.f11820c) == f10 && bVar.f19277a.f11893b) {
                    return this;
                }
                return new d(bVar, f10, e0Var, descriptor);
            }
            return new d(bVar, f10, e0Var, descriptor);
        }
        e0.e0.n(e0Var, "Unexpected leading comma", 0, 6);
        throw null;
    }

    public int d(je.d descriptor) {
        Object obj;
        boolean z10;
        me.b json = (me.b) this.f11819b;
        q0 q0Var = json.f19277a;
        e0.e0 e0Var = (e0.e0) this.d;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        ne.j jVar = (ne.j) this.f11820c;
        int ordinal = jVar.ordinal();
        int i3 = 0;
        r10 = false;
        boolean z11 = false;
        int i10 = -1;
        if (ordinal != 0) {
            if (ordinal != 2) {
                boolean v = e0Var.v();
                if (e0Var.e()) {
                    int i11 = this.f11818a;
                    if (i11 != -1 && !v) {
                        e0.e0.n(e0Var, "Expected end of the array or comma", 0, 6);
                        throw null;
                    }
                    i10 = i11 + 1;
                    this.f11818a = i10;
                } else if (v) {
                    q0Var.getClass();
                    ne.f.c(e0Var, "array");
                    throw null;
                }
            } else {
                int i12 = this.f11818a;
                if (i12 % 2 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (i12 != -1) {
                        z11 = e0Var.v();
                    }
                } else {
                    e0Var.h(':');
                }
                if (e0Var.e()) {
                    if (z10) {
                        if (this.f11818a == -1) {
                            int i13 = e0Var.f9225b;
                            if (z11) {
                                e0.e0.n(e0Var, "Unexpected leading comma", i13, 4);
                                throw null;
                            }
                        } else {
                            int i14 = e0Var.f9225b;
                            if (!z11) {
                                e0.e0.n(e0Var, "Expected comma after the key-value pair", i14, 4);
                                throw null;
                            }
                        }
                    }
                    i10 = this.f11818a + 1;
                    this.f11818a = i10;
                } else if (z11) {
                    q0Var.getClass();
                    ne.f.c(e0Var, "object");
                    throw null;
                }
            }
        } else {
            ne.e eVar = (ne.e) this.f11822f;
            q0 q0Var2 = (q0) this.f11821e;
            boolean v10 = e0Var.v();
            if (e0Var.e()) {
                q0Var2.getClass();
                String name = e0Var.g();
                e0Var.h(':');
                kotlin.jvm.internal.j.e(descriptor, "<this>");
                kotlin.jvm.internal.j.e(json, "json");
                kotlin.jvm.internal.j.e(name, "name");
                q0 q0Var3 = json.f19277a;
                q0Var3.getClass();
                ne.f.e(descriptor, json);
                int d = descriptor.d(name);
                i10 = -3;
                if (d != -3 || !q0Var3.f11894c) {
                    i10 = d;
                } else {
                    w5 w5Var = json.f19279c;
                    b1.f fVar = new b1.f(2, descriptor, json);
                    w5Var.getClass();
                    w5Var.getClass();
                    kotlin.jvm.internal.j.e(descriptor, "descriptor");
                    Map map = (Map) ((ConcurrentHashMap) w5Var.f13798b).get(descriptor);
                    ne.g gVar = ne.f.f20350a;
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
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) w5Var.f13798b;
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
                        le.d dVar = eVar.f20348a;
                        if (i10 < 64) {
                            dVar.f18186c |= 1 << i10;
                        } else {
                            int i15 = (i10 >>> 6) - 1;
                            long[] jArr = dVar.d;
                            jArr[i15] = jArr[i15] | (1 << (i10 & 63));
                        }
                    }
                } else {
                    String obj4 = ((String) e0Var.f9228f).subSequence(0, e0Var.f9225b).toString();
                    int f10 = ud.d.f(obj4);
                    kotlin.jvm.internal.j.e(obj4, "<this>");
                    e0Var.m(obj4.lastIndexOf(name, f10), "Encountered an unknown key '" + name + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                    throw null;
                }
            } else if (!v10) {
                if (eVar != null) {
                    le.d dVar2 = eVar.f20348a;
                    c1.c cVar = dVar2.f18185b;
                    je.d dVar3 = dVar2.f18184a;
                    int f11 = dVar3.f();
                    while (true) {
                        long j10 = dVar2.f18186c;
                        if (j10 != -1) {
                            int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                            dVar2.f18186c |= 1 << numberOfTrailingZeros;
                            if (((Boolean) cVar.invoke(dVar3, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                i10 = numberOfTrailingZeros;
                                break;
                            }
                        } else if (f11 > 64) {
                            long[] jArr2 = dVar2.d;
                            int length = jArr2.length;
                            loop1: while (true) {
                                if (i3 >= length) {
                                    break;
                                }
                                int i16 = i3 + 1;
                                int i17 = i16 * 64;
                                long j11 = jArr2[i3];
                                while (j11 != -1) {
                                    long[] jArr3 = jArr2;
                                    int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j11);
                                    j11 |= 1 << numberOfTrailingZeros2;
                                    int i18 = numberOfTrailingZeros2 + i17;
                                    if (((Boolean) cVar.invoke(dVar3, Integer.valueOf(i18))).booleanValue()) {
                                        jArr3[i3] = j11;
                                        i10 = i18;
                                        break loop1;
                                    }
                                    jArr2 = jArr3;
                                }
                                jArr2[i3] = j11;
                                i3 = i16;
                            }
                        }
                    }
                }
            } else {
                q0Var.getClass();
                ne.f.c(e0Var, "object");
                throw null;
            }
        }
        if (jVar != ne.j.f20361e) {
            kg kgVar = (kg) e0Var.f9226c;
            ((int[]) kgVar.d)[kgVar.f2722b] = i10;
        }
        return i10;
    }

    public int e() {
        e0.e0 e0Var = (e0.e0) this.d;
        long i3 = e0Var.i();
        int i10 = (int) i3;
        if (i3 == i10) {
            return i10;
        }
        e0.e0.n(e0Var, "Failed to parse int for input '" + i3 + '\'', 0, 6);
        throw null;
    }

    public int f(je.d descriptor, int i3) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        return e();
    }

    public long g() {
        return ((e0.e0) this.d).i();
    }

    public long h(je.d descriptor, int i3) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        return g();
    }

    public boolean i() {
        boolean z10;
        ne.e eVar = (ne.e) this.f11822f;
        if (eVar != null) {
            z10 = eVar.f20349b;
        } else {
            z10 = false;
        }
        if (!z10) {
            e0.e0 e0Var = (e0.e0) this.d;
            int r5 = e0Var.r(e0Var.u());
            String str = (String) e0Var.f9228f;
            int length = str.length() - r5;
            boolean z11 = false;
            if (length >= 4 && r5 != -1) {
                int i3 = 0;
                while (true) {
                    if (i3 < 4) {
                        if ("null".charAt(i3) != str.charAt(r5 + i3)) {
                            break;
                        }
                        i3++;
                    } else if (length <= 4 || ne.f.b(str.charAt(r5 + 4)) != 0) {
                        z11 = true;
                        e0Var.f9225b = r5 + 4;
                    }
                }
            }
            if (!z11) {
                return true;
            }
        }
        return false;
    }

    public Object j(je.d descriptor, int i3, he.a deserializer, Object obj) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(deserializer, "deserializer");
        if (!deserializer.d().c() && !i()) {
            return null;
        }
        return l(deserializer);
    }

    public Object k(je.d descriptor, int i3, he.a deserializer, Object obj) {
        boolean z10;
        kg kgVar = (kg) ((e0.e0) this.d).f9226c;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(deserializer, "deserializer");
        if (((ne.j) this.f11820c) == ne.j.f20361e && (i3 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i10 = kgVar.f2722b;
            if (((int[]) kgVar.d)[i10] == -2) {
                ((Object[]) kgVar.f2723c)[i10] = ne.g.f20351a;
            }
        }
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(deserializer, "deserializer");
        Object l10 = l(deserializer);
        if (z10) {
            int i11 = kgVar.f2722b;
            if (((int[]) kgVar.d)[i11] != -2) {
                int i12 = i11 + 1;
                kgVar.f2722b = i12;
                Object[] objArr = (Object[]) kgVar.f2723c;
                if (i12 == objArr.length) {
                    int i13 = i12 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i13);
                    kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
                    kgVar.f2723c = copyOf;
                    int[] copyOf2 = Arrays.copyOf((int[]) kgVar.d, i13);
                    kotlin.jvm.internal.j.d(copyOf2, "copyOf(...)");
                    kgVar.d = copyOf2;
                }
            }
            int i14 = kgVar.f2722b;
            ((Object[]) kgVar.f2723c)[i14] = l10;
            ((int[]) kgVar.d)[i14] = -2;
        }
        return l10;
    }

    public Object l(he.a deserializer) {
        kotlin.jvm.internal.j.e(deserializer, "deserializer");
        try {
            return deserializer.a(this);
        } catch (he.b e10) {
            String message = e10.getMessage();
            kotlin.jvm.internal.j.b(message);
            if (ud.d.e(message, "at path")) {
                throw e10;
            }
            throw new he.b(e10.f14398a, e10.getMessage() + " at path: " + ((kg) ((e0.e0) this.d).f9226c).n(), e10);
        }
    }

    public String m() {
        ((q0) this.f11821e).getClass();
        return ((e0.e0) this.d).j();
    }

    public String n(je.d descriptor, int i3) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        return m();
    }

    public void o() {
        this.f11819b = null;
        if (((mk) this.f11822f) != null) {
            Utilities.f21387e.a((mk) this.f11822f);
        }
        Bitmap bitmap = (Bitmap) this.f11820c;
        if (bitmap != null && !bitmap.isRecycled()) {
            ((Bitmap) this.f11820c).recycle();
        }
        this.f11820c = null;
    }

    public void p(je.d descriptor) {
        e0.e0 e0Var = (e0.e0) this.d;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        q0 q0Var = ((me.b) this.f11819b).f19277a;
        q0Var.getClass();
        if (!e0Var.v()) {
            e0Var.h(((ne.j) this.f11820c).f20365b);
            kg kgVar = (kg) e0Var.f9226c;
            int i3 = kgVar.f2722b;
            int[] iArr = (int[]) kgVar.d;
            if (iArr[i3] == -2) {
                iArr[i3] = -1;
                kgVar.f2722b = i3 - 1;
            }
            int i10 = kgVar.f2722b;
            if (i10 != -1) {
                kgVar.f2722b = i10 - 1;
                return;
            }
            return;
        }
        q0Var.getClass();
        ne.f.c(e0Var, "");
        throw null;
    }

    public void q() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f11822f;
        byteBuffer.position(0);
        ld0 ld0Var = (ld0) this.f11819b;
        if (ld0Var.f35711f == null) {
            ld0Var.a();
        }
        float[] fArr = ld0Var.f35711f;
        ld0 ld0Var2 = (ld0) this.f11820c;
        if (ld0Var2.f35711f == null) {
            ld0Var2.a();
        }
        float[] fArr2 = ld0Var2.f35711f;
        ld0 ld0Var3 = (ld0) this.d;
        if (ld0Var3.f35711f == null) {
            ld0Var3.a();
        }
        float[] fArr3 = ld0Var3.f35711f;
        ld0 ld0Var4 = (ld0) this.f11821e;
        if (ld0Var4.f35711f == null) {
            ld0Var4.a();
        }
        float[] fArr4 = ld0Var4.f35711f;
        for (int i3 = 0; i3 < 200; i3++) {
            byteBuffer.put((byte) (fArr2[i3] * 255.0f));
            byteBuffer.put((byte) (fArr3[i3] * 255.0f));
            byteBuffer.put((byte) (fArr4[i3] * 255.0f));
            byteBuffer.put((byte) (fArr[i3] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public void r(int i3) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.f11821e;
        while (priorityQueue.size() > i3) {
            h2.t tVar = (h2.t) priorityQueue.poll();
            String str = n0.f11873a;
            int i10 = 0;
            while (true) {
                arrayList = tVar.f14180a;
                if (i10 >= arrayList.size()) {
                    break;
                }
                ((h2.u) this.f11819b).a(tVar.f14181b, (y) arrayList.get(i10));
                ((ArrayDeque) this.f11820c).push((y) arrayList.get(i10));
                i10++;
            }
            arrayList.clear();
            h2.t tVar2 = (h2.t) this.f11822f;
            if (tVar2 != null && tVar2.f14181b == tVar.f14181b) {
                this.f11822f = null;
            }
            ((ArrayDeque) this.d).push(tVar);
        }
    }

    public android.graphics.Bitmap s(android.graphics.Bitmap r9, java.lang.String r10, int r11, int r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: g2.d.s(android.graphics.Bitmap, java.lang.String, int, int, boolean):android.graphics.Bitmap");
    }

    public Bitmap t(cc ccVar) {
        if (ccVar == null) {
            return null;
        }
        return s(ccVar.f22007c, ccVar.f22005a, ccVar.f22008e, 0, false);
    }

    public Bitmap u(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return null;
        }
        return s(imageReceiver.n(), imageReceiver.R, imageReceiver.V, imageReceiver.W, false);
    }

    public ColorStateList v() {
        b3 b3Var = (b3) this.f11821e;
        if (b3Var != null) {
            return (ColorStateList) b3Var.f18547c;
        }
        return null;
    }

    public PorterDuff.Mode w() {
        b3 b3Var = (b3) this.f11821e;
        if (b3Var != null) {
            return (PorterDuff.Mode) b3Var.d;
        }
        return null;
    }

    public void x(AttributeSet attributeSet, int i3) {
        ColorStateList i10;
        View view = (View) this.f11819b;
        Context context = view.getContext();
        int[] iArr = f.a.f11329z;
        k4.j F = k4.j.F(context, attributeSet, iArr, i3);
        TypedArray typedArray = (TypedArray) F.f16870b;
        View view2 = (View) this.f11819b;
        r0.i0.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) F.f16870b, i3);
        try {
            if (typedArray.hasValue(0)) {
                this.f11818a = typedArray.getResourceId(0, -1);
                m.q qVar = (m.q) this.f11820c;
                Context context2 = view.getContext();
                int i11 = this.f11818a;
                synchronized (qVar) {
                    i10 = qVar.f18705a.i(context2, i11);
                }
                if (i10 != null) {
                    B(i10);
                }
            }
            if (typedArray.hasValue(1)) {
                r0.a0.f(view, F.y(1));
            }
            if (typedArray.hasValue(2)) {
                r0.a0.g(view, l1.b(typedArray.getInt(2, -1), null));
            }
            F.H();
        } catch (Throwable th2) {
            F.H();
            throw th2;
        }
    }

    public void y() {
        this.f11818a = -1;
        B(null);
        b();
    }

    public void z(int i3) {
        ColorStateList colorStateList;
        this.f11818a = i3;
        m.q qVar = (m.q) this.f11820c;
        if (qVar != null) {
            Context context = ((View) this.f11819b).getContext();
            synchronized (qVar) {
                colorStateList = qVar.f18705a.i(context, i3);
            }
        } else {
            colorStateList = null;
        }
        B(colorStateList);
        b();
    }

    public d(View view) {
        this.f11818a = -1;
        this.f11819b = view;
        this.f11820c = m.q.a();
    }

    public d(h2.u uVar) {
        this.f11819b = uVar;
        this.f11820c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.f11821e = new PriorityQueue();
        this.f11818a = -1;
    }

    public d() {
        this.f11819b = new ld0();
        this.f11820c = new ld0();
        this.d = new ld0();
        this.f11821e = new ld0();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.f11822f = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public d(int i3, Runnable runnable) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f11818a = i3;
        this.f11821e = runnable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
