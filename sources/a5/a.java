package a5;

import a0.m;
import ai.c9;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import b2.s;
import c3.h;
import c3.i;
import c3.p;
import c3.u;
import c5.v;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.internal.cast.c0;
import com.google.firebase.messaging.n;
import e2.b0;
import e9.f1;
import e9.j0;
import e9.k0;
import e9.m0;
import g2.g;
import i9.r;
import ia.d;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Deflater;
import k6.c;
import m.p3;
import m4.a0;
import oi.f;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.zj;
import org.telegram.ui.Components.hi;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.da;
import org.telegram.ui.web.o1;
import rg.q1;
import u2.f0;
import u2.h0;
import u2.i0;
import u2.t;
import v7.e8;
import v7.e9;
import v7.f8;
import v7.k;
import v7.l6;
import v7.u6;
import v7.u8;
import x7.d0;
import x7.e0;
import x7.i9;
import x7.ia;
import x7.p7;
import yf.e;
import yf.z;
import z7.ib;
import z7.we;
import z7.x;
import z7.y;
import z7.zf;
public class a implements i, r {
    public final int f276a;
    public int f277b;
    public Object f278c;
    public Object d;

    public a(char c10, int i10) {
        this.f276a = i10;
    }

    public static a5.a g(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        throw new UnsupportedOperationException("Method not decompiled: a5.a.g(android.content.res.Resources, int, android.content.res.Resources$Theme):a5.a");
    }

    public void A(String str, l lVar) {
        Map map = (Map) this.f278c;
        if (!map.containsKey(str)) {
            map.put(str, lVar);
            if (this.f277b > 0) {
                new c0(Looper.getMainLooper(), 4).post(new v(this, lVar, str, false, 5));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(a4.a.q("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public byte[] B() {
        k kVar;
        d dVar;
        e0 e0Var;
        d dVar2;
        y yVar;
        d dVar3;
        switch (this.f276a) {
            case 22:
                e9 e9Var = e9.f44245c;
                f fVar = (f) this.f278c;
                ((e8) this.d).h = false;
                e8 e8Var = (e8) this.d;
                e8Var.f44239f = Boolean.FALSE;
                fVar.f15759a = new f8(e8Var);
                try {
                    e9.b();
                    l6 l6Var = new l6(fVar);
                    v7.l lVar = new v7.l(0);
                    e9Var.a(lVar);
                    HashMap hashMap = new HashMap((HashMap) lVar.f44314b);
                    HashMap hashMap2 = new HashMap((HashMap) lVar.f44315c);
                    v7.i iVar = (v7.i) lVar.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        kVar = new k(byteArrayOutputStream, hashMap, hashMap2, iVar);
                        dVar = (d) hashMap.get(l6.class);
                    } catch (IOException unused) {
                    }
                    if (dVar != null) {
                        dVar.a(l6Var, kVar);
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(l6.class)));
                } catch (UnsupportedEncodingException e) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                }
            case 23:
            default:
                zf zfVar = zf.f49009c;
                p3 p3Var = (p3) this.f278c;
                ((e8) this.d).h = false;
                e8 e8Var2 = (e8) this.d;
                e8Var2.f44239f = Boolean.FALSE;
                p3Var.f14523a = new we(e8Var2);
                try {
                    zf.b();
                    ib ibVar = new ib(p3Var);
                    v7.l lVar2 = new v7.l(13);
                    zfVar.a(lVar2);
                    HashMap hashMap3 = new HashMap((HashMap) lVar2.f44314b);
                    HashMap hashMap4 = new HashMap((HashMap) lVar2.f44315c);
                    x xVar = (x) lVar2.d;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        yVar = new y(byteArrayOutputStream2, hashMap3, hashMap4, xVar);
                        dVar3 = (d) hashMap3.get(ib.class);
                    } catch (IOException unused2) {
                    }
                    if (dVar3 != null) {
                        dVar3.a(ibVar, yVar);
                        return byteArrayOutputStream2.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(ib.class)));
                } catch (UnsupportedEncodingException e7) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
                }
            case 24:
                ia iaVar = ia.f45746c;
                n nVar = (n) this.f278c;
                ((e8) this.d).h = false;
                e8 e8Var3 = (e8) this.d;
                e8Var3.f44239f = Boolean.FALSE;
                nVar.f7312a = new i9(e8Var3);
                try {
                    ia.b();
                    p7 p7Var = new p7(nVar);
                    v7.l lVar3 = new v7.l(7);
                    iaVar.a(lVar3);
                    HashMap hashMap5 = new HashMap((HashMap) lVar3.f44314b);
                    HashMap hashMap6 = new HashMap((HashMap) lVar3.f44315c);
                    d0 d0Var = (d0) lVar3.d;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        e0Var = new e0(byteArrayOutputStream3, hashMap5, hashMap6, d0Var);
                        dVar2 = (d) hashMap5.get(p7.class);
                    } catch (IOException unused3) {
                    }
                    if (dVar2 != null) {
                        dVar2.a(p7Var, e0Var);
                        return byteArrayOutputStream3.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(p7.class)));
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
        }
    }

    public void C(Bundle bundle) {
        Bundle bundle2;
        this.f277b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.f278c).entrySet()) {
            l lVar = (l) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lVar.onCreate(bundle2);
        }
    }

    public void D(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.f278c).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((l) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public void a(int i10, int i11) {
        boolean z10;
        int i12 = (i11 << 16) + i10;
        if (this.f277b != i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f277b = i12;
        for (int i13 = 0; i13 < e.f47074y; i13++) {
            if (z10 || ((Bitmap[]) this.d)[i13] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i13];
                if (bitmap != null) {
                    Utilities.globalQueue.postRunnable(new q1(bitmap, 19));
                }
                ((Bitmap[]) this.d)[i13] = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            }
            z[] zVarArr = (z[]) this.f278c;
            if (zVarArr[i13] == null) {
                zVarArr[i13] = new z(i11 * i10 * 2);
            }
        }
    }

    @Override
    public h b(p pVar, long j3) {
        long j10;
        switch (this.f276a) {
            case 8:
                long position = pVar.getPosition();
                long l4 = l(pVar);
                long i10 = pVar.i();
                pVar.l(Math.max(6, ((u) this.f278c).f3796c));
                long l10 = l(pVar);
                long i11 = pVar.i();
                if (l4 <= j3 && l10 > j3) {
                    return new h(0, -9223372036854775807L, i10);
                }
                if (l10 <= j3) {
                    return new h(-2, l10, i11);
                }
                return new h(-1, l4, position);
            default:
                long position2 = pVar.getPosition();
                int min = (int) Math.min(112800, pVar.getLength() - position2);
                e2.v vVar = (e2.v) this.d;
                vVar.G(min);
                pVar.a(0, min, vVar.f7916a);
                int i12 = vVar.f7918c;
                long j11 = -1;
                long j12 = -1;
                long j13 = -9223372036854775807L;
                while (true) {
                    if (vVar.a() >= 188) {
                        byte[] bArr = vVar.f7916a;
                        int i13 = vVar.f7917b;
                        while (true) {
                            if (i13 < i12) {
                                j10 = -9223372036854775807L;
                                if (bArr[i13] != 71) {
                                    i13++;
                                }
                            } else {
                                j10 = -9223372036854775807L;
                            }
                        }
                        int i14 = i13 + 188;
                        if (i14 <= i12) {
                            long a2 = u8.a(vVar, i13, this.f277b);
                            if (a2 != j10) {
                                long b10 = ((b0) this.f278c).b(a2);
                                if (b10 > j3) {
                                    if (j13 == j10) {
                                        return new h(-1, b10, position2);
                                    }
                                    return new h(0, -9223372036854775807L, position2 + j12);
                                }
                                j13 = b10;
                                if (100000 + j13 > j3) {
                                    return new h(0, -9223372036854775807L, position2 + i13);
                                }
                                j12 = i13;
                            }
                            vVar.J(i14);
                            j11 = i14;
                        }
                    } else {
                        j10 = -9223372036854775807L;
                    }
                }
                if (j13 != j10) {
                    return new h(-2, j13, position2 + j11);
                }
                return h.d;
        }
    }

    public sa.b c() {
        if ("".isEmpty()) {
            return new sa.b((String) this.f278c, ((Long) this.d).longValue(), this.f277b);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    @Override
    public void d() {
        switch (this.f276a) {
            case 8:
                return;
            default:
                e2.v vVar = (e2.v) this.d;
                byte[] bArr = e2.d0.f7871b;
                vVar.getClass();
                vVar.H(bArr.length, bArr);
                return;
        }
    }

    public k0 e() {
        f1 f1Var;
        j0 j0Var = (j0) this.d;
        if (j0Var == null) {
            int i10 = this.f277b;
            Object[] objArr = (Object[]) this.f278c;
            if (i10 == 0) {
                f1Var = f1.h;
            } else if (i10 == 1) {
                Objects.requireNonNull(objArr[0]);
                Objects.requireNonNull(objArr[1]);
                f1Var = new f1(null, objArr, 1);
            } else {
                u6.e(i10, objArr.length >> 1);
                Object f7 = f1.f(objArr, i10, m0.t(i10), 0);
                if (f7 instanceof Object[]) {
                    Object[] objArr2 = (Object[]) f7;
                    this.d = (j0) objArr2[2];
                    Object obj = objArr2[0];
                    int intValue = ((Integer) objArr2[1]).intValue();
                    objArr = Arrays.copyOf(objArr, intValue * 2);
                    f7 = obj;
                    i10 = intValue;
                }
                f1Var = new f1(f7, objArr, i10);
            }
            j0 j0Var2 = (j0) this.d;
            if (j0Var2 == null) {
                return f1Var;
            }
            throw j0Var2.a();
        }
        throw j0Var.a();
    }

    public void f(int i10) {
        String str;
        int i11 = this.f277b;
        if (i10 == i11) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Wrong data accessor type detected. ");
        String str2 = "String";
        if (i11 == 0) {
            str = "String";
        } else if (i11 == 1) {
            str = "ArrayBuffer";
        } else {
            str = "Unknown";
        }
        sb2.append(str);
        sb2.append(" expected, but got ");
        if (i10 != 0) {
            if (i10 == 1) {
                str2 = "ArrayBuffer";
            } else {
                str2 = "Unknown";
            }
        }
        sb2.append(str2);
        throw new IllegalStateException(sb2.toString());
    }

    public void i(String str, Object... objArr) {
        if (this.f277b <= 3) {
            String str2 = (String) this.f278c;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.d).concat(str));
        }
    }

    public void j(e2.h hVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            e2.d0.U(i0Var.f43673a, new o1(29, hVar, i0Var.f43674b));
        }
    }

    public void k(int i10, s sVar, int i11, Object obj, long j3) {
        j(new s5.e(7, this, new u2.b0(1, i10, sVar, i11, obj, e2.d0.e0(j3), -9223372036854775807L)));
    }

    public long l(p pVar) {
        int e;
        c3.s sVar = (c3.s) this.d;
        u uVar = (u) this.f278c;
        while (pVar.i() < pVar.getLength() - 6) {
            int i10 = this.f277b;
            long i11 = pVar.i();
            byte[] bArr = new byte[2];
            int i12 = 0;
            boolean b10 = false;
            pVar.a(0, 2, bArr);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                pVar.p();
                pVar.l((int) (i11 - pVar.getPosition()));
            } else {
                e2.v vVar = new e2.v(16);
                System.arraycopy(bArr, 0, vVar.f7916a, 0, 2);
                byte[] bArr2 = vVar.f7916a;
                while (i12 < 14 && (e = pVar.e(2 + i12, 14 - i12, bArr2)) != -1) {
                    i12 += e;
                }
                vVar.I(i12);
                pVar.p();
                pVar.l((int) (i11 - pVar.getPosition()));
                b10 = c3.b.b(vVar, uVar, i10, sVar);
            }
            if (b10) {
                break;
            }
            pVar.l(1);
        }
        if (pVar.i() >= pVar.getLength() - 6) {
            pVar.l((int) (pVar.getLength() - pVar.i()));
            return uVar.f3800j;
        }
        return sVar.f3790a;
    }

    public Object m(int i10) {
        SparseArray sparseArray = (SparseArray) this.f278c;
        if (this.f277b == -1) {
            this.f277b = 0;
        }
        while (true) {
            int i11 = this.f277b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f277b--;
        }
        while (this.f277b < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f277b + 1)) {
            this.f277b++;
        }
        return sparseArray.valueAt(this.f277b);
    }

    public boolean n() {
        ColorStateList colorStateList;
        if (((Shader) this.f278c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void o(t tVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10) {
        j(new h0(this, tVar, new u2.b0(i10, i11, sVar, i12, obj, e2.d0.e0(j3), e2.d0.e0(j10)), 1));
    }

    @Override
    public void onSuccess(Object obj) {
        List list = (List) obj;
        a0 a0Var = ((m4.k0) this.d).f14852g;
        Handler handler = a0Var.f14699l;
        m4.r rVar = (m4.r) this.f278c;
        e2.d0.U(handler, new ki.h0(a0Var, rVar, new c9(this, this.f277b, list, rVar, 6)));
    }

    public void p(t tVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10) {
        j(new h0(this, tVar, new u2.b0(i10, i11, sVar, i12, obj, e2.d0.e0(j3), e2.d0.e0(j10)), 0));
    }

    public void q(t tVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10, IOException iOException, boolean z10) {
        j(new zj(this, tVar, new u2.b0(i10, i11, sVar, i12, obj, e2.d0.e0(j3), e2.d0.e0(j10)), iOException, z10));
    }

    public void r(t tVar, int i10, IOException iOException, boolean z10) {
        q(tVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public void s(t tVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10, int i13) {
        j(new da(this, tVar, new u2.b0(i10, i11, sVar, i12, obj, e2.d0.e0(j3), e2.d0.e0(j10)), i13, 10));
    }

    public a u(Object obj, Object obj2) {
        int i10 = (this.f277b + 1) * 2;
        Object[] objArr = (Object[]) this.f278c;
        if (i10 > objArr.length) {
            this.f278c = Arrays.copyOf(objArr, w.h(objArr.length, i10));
        }
        if (obj != null) {
            if (obj2 != null) {
                Object[] objArr2 = (Object[]) this.f278c;
                int i11 = this.f277b;
                int i12 = i11 * 2;
                objArr2[i12] = obj;
                objArr2[i12 + 1] = obj2;
                this.f277b = i11 + 1;
                return this;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        throw new NullPointerException("null key in entry: null=" + obj2);
    }

    public void v(int i10) {
        w(i10, 200L, rr.f28031f);
    }

    public void w(int i10, long j3, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.f278c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.f278c).cancel();
        }
        int[] iArr = new int[1];
        this.f277b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i10);
        this.f278c = ofInt;
        ofInt.addUpdateListener(new ai.x(24, this, iArr));
        ((ValueAnimator) this.f278c).addListener(new hi(this, i10, iArr, 1));
        ((ValueAnimator) this.f278c).setDuration(j3);
        ((ValueAnimator) this.f278c).setInterpolator(interpolator);
        ((ValueAnimator) this.f278c).start();
    }

    public List x(CharSequence charSequence) {
        charSequence.getClass();
        a6.i iVar = (a6.i) this.d;
        iVar.getClass();
        d9.h hVar = new d9.h(iVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (hVar.hasNext()) {
            arrayList.add((String) hVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void y(int i10, long j3, long j10) {
        u2.b0 b0Var = new u2.b0(1, i10, null, 3, null, e2.d0.e0(j3), e2.d0.e0(j10));
        f0 f0Var = (f0) this.f278c;
        f0Var.getClass();
        j(new s50(this, f0Var, b0Var, 10));
    }

    public void z(String str, c cVar) {
        int i10 = this.f277b + 1;
        Object[] objArr = (Object[]) this.f278c;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            if (i11 >= 0) {
                int i12 = length + (length >> 1) + 1;
                if (i12 < i11) {
                    int highestOneBit = Integer.highestOneBit(i11 - 1);
                    i12 = highestOneBit + highestOneBit;
                }
                if (i12 < 0) {
                    i12 = Integer.MAX_VALUE;
                }
                this.f278c = Arrays.copyOf(objArr, i12);
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        Object[] objArr2 = (Object[]) this.f278c;
        int i13 = this.f277b;
        int i14 = i13 + i13;
        objArr2[i14] = str;
        objArr2[i14 + 1] = cVar;
        this.f277b = i13 + 1;
    }

    public a(int i10, int i11) {
        this.f276a = i11;
        switch (i11) {
            case 5:
                this.f278c = new Object[i10 * 2];
                this.f277b = 0;
                return;
            default:
                this.f277b = i10;
                return;
        }
    }

    public a(Object obj, int i10, Object obj2, int i11) {
        this.f276a = i11;
        this.d = obj;
        this.f277b = i10;
        this.f278c = obj2;
    }

    public a(int i10, byte b10) {
        this.f276a = i10;
        switch (i10) {
            case 13:
                this.f278c = new gh.a();
                return;
            case 19:
                this.f278c = new Object[8];
                this.f277b = 0;
                return;
            case 25:
                int i11 = e.f47074y;
                this.f278c = new z[i11];
                this.d = new Bitmap[i11];
                return;
            default:
                this.f278c = DesugarCollections.synchronizedMap(new m(0));
                this.f277b = 0;
                return;
        }
    }

    public a(n nVar, int i10) {
        this.f276a = 24;
        this.d = new Object();
        this.f278c = nVar;
        ia.b();
        this.f277b = i10;
    }

    public a(String str, String[] strArr) {
        String sb2;
        this.f276a = 17;
        if (strArr.length == 0) {
            sb2 = "";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.d = sb2;
        this.f278c = str;
        int i10 = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i10 <= 7 && !Log.isLoggable((String) this.f278c, i10)) {
            i10++;
        }
        this.f277b = i10;
    }

    private final void t() {
    }

    @Override
    public void h(Throwable th2) {
    }

    public a(p3 p3Var, int i10) {
        this.f276a = 26;
        this.d = new Object();
        this.f278c = p3Var;
        zf.b();
        this.f277b = i10;
    }

    public a(f fVar, int i10) {
        this.f276a = 22;
        this.d = new Object();
        this.f278c = fVar;
        e9.b();
        this.f277b = i10;
    }

    public a(wl0 wl0Var) {
        this.f276a = 15;
        this.d = wl0Var;
    }

    public a(ByteBuffer byteBuffer, int i10, RectF rectF) {
        this.f276a = 16;
        this.f278c = rectF;
        this.f277b = i10;
        try {
            this.d = File.createTempFile("paint", ".bin", ApplicationLoader.applicationContext.getCacheDir());
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (((File) this.d) == null) {
            return;
        }
        try {
            byte[] array = byteBuffer.array();
            FileOutputStream fileOutputStream = new FileOutputStream((File) this.d);
            Deflater deflater = new Deflater(1, true);
            deflater.setInput(array, byteBuffer.arrayOffset(), byteBuffer.remaining());
            deflater.finish();
            byte[] bArr = new byte[1024];
            while (!deflater.finished()) {
                fileOutputStream.write(bArr, 0, deflater.deflate(bArr));
            }
            deflater.end();
            fileOutputStream.close();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public a(s0.b bVar) {
        this.f276a = 21;
        this.f278c = new SparseArray();
        this.d = bVar;
        this.f277b = -1;
    }

    public a(Shader shader, ColorStateList colorStateList, int i10) {
        this.f276a = 7;
        this.f278c = shader;
        this.d = colorStateList;
        this.f277b = i10;
    }

    public a(String str) {
        this.f276a = 0;
        this.f278c = str;
        this.d = null;
        this.f277b = 0;
    }

    public a(u uVar, int i10) {
        this.f276a = 8;
        this.f278c = uVar;
        this.f277b = i10;
        this.d = new Object();
    }

    public a(int i10, b0 b0Var) {
        this.f276a = 10;
        this.f277b = i10;
        this.f278c = b0Var;
        this.d = new e2.v();
    }

    public a(byte[] bArr) {
        this.f276a = 0;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.f278c = null;
        this.f277b = 1;
    }

    public a(g gVar) {
        this.f276a = 11;
        b2.p pVar = new b2.p(6);
        pVar.f3169c = new qb.b(28);
        this.d = pVar;
        this.f278c = gVar;
        this.f277b = 1;
    }

    public a(a6.i iVar) {
        this.f276a = 4;
        this.d = iVar;
        this.f278c = d9.c.f7546a;
        this.f277b = Integer.MAX_VALUE;
    }

    public a(m4.k0 k0Var, m4.r rVar, int i10) {
        this.f276a = 12;
        this.d = k0Var;
        this.f278c = rVar;
        this.f277b = i10;
    }
}
