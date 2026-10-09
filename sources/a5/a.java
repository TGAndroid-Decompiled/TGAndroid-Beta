package a5;

import a0.m;
import a1.g;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import b2.s;
import c3.i;
import c3.p;
import c3.u;
import c5.v;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.internal.cast.a0;
import com.google.firebase.messaging.n;
import e2.d0;
import e2.h;
import e9.f1;
import e9.j0;
import e9.k0;
import e9.m0;
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
import m.c3;
import m.l1;
import m.q;
import m.q3;
import m4.l0;
import oi.f;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.mk;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.ea;
import org.telegram.ui.web.w1;
import rg.x1;
import u2.b0;
import u2.f0;
import u2.h0;
import u2.i0;
import u2.t;
import v7.d9;
import v7.e8;
import v7.f8;
import v7.j;
import v7.k;
import v7.l6;
import v7.s7;
import v7.t6;
import x7.e0;
import x7.i9;
import x7.ja;
import x7.p7;
import yf.e;
import yf.z;
import z7.ib;
import z7.we;
import z7.x;
import z7.y;
import z7.zf;
public class a implements i, r {
    public final int f298a;
    public int f299b;
    public Object f300c;
    public Object d;

    public a(char c10, int i10) {
        this.f298a = i10;
    }

    public static a5.a i(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        throw new UnsupportedOperationException("Method not decompiled: a5.a.i(android.content.res.Resources, int, android.content.res.Resources$Theme):a5.a");
    }

    public void A(int i10, long j3, long j10) {
        b0 b0Var = new b0(1, i10, null, 3, null, d0.d0(j3), d0.d0(j10));
        f0 f0Var = (f0) this.f300c;
        f0Var.getClass();
        k(new rz(this, f0Var, b0Var, 11));
    }

    public void B(String str, c cVar) {
        int i10 = this.f299b + 1;
        Object[] objArr = (Object[]) this.f300c;
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
                this.f300c = Arrays.copyOf(objArr, i12);
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        Object[] objArr2 = (Object[]) this.f300c;
        int i13 = this.f299b;
        int i14 = i13 + i13;
        objArr2[i14] = str;
        objArr2[i14 + 1] = cVar;
        this.f299b = i13 + 1;
    }

    public void C(String str, l lVar) {
        Map map = (Map) this.f300c;
        if (!map.containsKey(str)) {
            map.put(str, lVar);
            if (this.f299b > 0) {
                new a0(Looper.getMainLooper(), 4).post(new v(this, lVar, str, false, 5));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(g.q("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public byte[] D() {
        j jVar;
        d dVar;
        e0 e0Var;
        d dVar2;
        y yVar;
        d dVar3;
        switch (this.f298a) {
            case 23:
                d9 d9Var = d9.f49156c;
                f fVar = (f) this.f300c;
                ((e8) this.d).h = false;
                e8 e8Var = (e8) this.d;
                e8Var.f49169f = Boolean.FALSE;
                fVar.f17175a = new f8(e8Var);
                try {
                    d9.b();
                    l6 l6Var = new l6(fVar);
                    k kVar = new k(0);
                    d9Var.a(kVar);
                    HashMap hashMap = new HashMap((HashMap) kVar.f49244b);
                    HashMap hashMap2 = new HashMap((HashMap) kVar.f49245c);
                    v7.i iVar = (v7.i) kVar.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        jVar = new j(byteArrayOutputStream, hashMap, hashMap2, iVar);
                        dVar = (d) hashMap.get(l6.class);
                    } catch (IOException unused) {
                    }
                    if (dVar != null) {
                        dVar.a(l6Var, jVar);
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(l6.class)));
                } catch (UnsupportedEncodingException e7) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
                }
            case 24:
            default:
                zf zfVar = zf.f54176c;
                q3 q3Var = (q3) this.f300c;
                ((e8) this.d).h = false;
                e8 e8Var2 = (e8) this.d;
                e8Var2.f49169f = Boolean.FALSE;
                q3Var.f15795a = new we(e8Var2);
                try {
                    zf.b();
                    ib ibVar = new ib(q3Var);
                    k kVar2 = new k(14);
                    zfVar.a(kVar2);
                    HashMap hashMap3 = new HashMap((HashMap) kVar2.f49244b);
                    HashMap hashMap4 = new HashMap((HashMap) kVar2.f49245c);
                    x xVar = (x) kVar2.d;
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
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
            case 25:
                ja jaVar = ja.f50825c;
                n nVar = (n) this.f300c;
                ((e8) this.d).h = false;
                e8 e8Var3 = (e8) this.d;
                e8Var3.f49169f = Boolean.FALSE;
                nVar.f7954a = new i9(e8Var3);
                try {
                    ja.b();
                    p7 p7Var = new p7(nVar);
                    k kVar3 = new k(8);
                    jaVar.a(kVar3);
                    HashMap hashMap5 = new HashMap((HashMap) kVar3.f49244b);
                    HashMap hashMap6 = new HashMap((HashMap) kVar3.f49245c);
                    x7.d0 d0Var = (x7.d0) kVar3.d;
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
                } catch (UnsupportedEncodingException e11) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
                }
        }
    }

    public void E(Bundle bundle) {
        Bundle bundle2;
        this.f299b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.f300c).entrySet()) {
            l lVar = (l) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lVar.onCreate(bundle2);
        }
    }

    public void F(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.f300c).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((l) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public void a(int i10, int i11) {
        boolean z10;
        int i12 = (i11 << 16) + i10;
        if (this.f299b != i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f299b = i12;
        for (int i13 = 0; i13 < e.f52129y; i13++) {
            if (z10 || ((Bitmap[]) this.d)[i13] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i13];
                if (bitmap != null) {
                    Utilities.globalQueue.postRunnable(new x1(bitmap, 23));
                }
                ((Bitmap[]) this.d)[i13] = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            }
            z[] zVarArr = (z[]) this.f300c;
            if (zVarArr[i13] == null) {
                zVarArr[i13] = new z(i11 * i10 * 2);
            }
        }
    }

    @Override
    public c3.h b(c3.p r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: a5.a.b(c3.p, long):c3.h");
    }

    public void c() {
        c3 c3Var;
        ImageView imageView = (ImageView) this.f300c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            l1.a(drawable);
        }
        if (drawable != null && (c3Var = (c3) this.d) != null) {
            q.d(drawable, c3Var, imageView.getDrawableState());
        }
    }

    @Override
    public void d() {
        switch (this.f298a) {
            case 8:
                return;
            default:
                e2.v vVar = (e2.v) this.d;
                byte[] bArr = d0.f8533b;
                vVar.getClass();
                vVar.H(bArr.length, bArr);
                return;
        }
    }

    public sa.b e() {
        if ("".isEmpty()) {
            return new sa.b((String) this.f300c, ((Long) this.d).longValue(), this.f299b);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public k0 f() {
        f1 f1Var;
        j0 j0Var = (j0) this.d;
        if (j0Var == null) {
            int i10 = this.f299b;
            Object[] objArr = (Object[]) this.f300c;
            if (i10 == 0) {
                f1Var = f1.h;
            } else if (i10 == 1) {
                Objects.requireNonNull(objArr[0]);
                Objects.requireNonNull(objArr[1]);
                f1Var = new f1(null, objArr, 1);
            } else {
                t6.e(i10, objArr.length >> 1);
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

    public void g(int i10) {
        String str;
        int i11 = this.f299b;
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

    public void j(String str, Object... objArr) {
        if (this.f299b <= 3) {
            String str2 = (String) this.f300c;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.d).concat(str));
        }
    }

    public void k(h hVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            d0.T(i0Var.f48603a, new w1(29, hVar, i0Var.f48604b));
        }
    }

    public void l(int i10, s sVar, int i11, Object obj, long j3) {
        k(new qg.x1(11, this, new b0(1, i10, sVar, i11, obj, d0.d0(j3), -9223372036854775807L)));
    }

    public long m(p pVar) {
        int e7;
        c3.s sVar = (c3.s) this.d;
        u uVar = (u) this.f300c;
        while (pVar.j() < pVar.getLength() - 6) {
            int i10 = this.f299b;
            long j3 = pVar.j();
            byte[] bArr = new byte[2];
            int i11 = 0;
            boolean b10 = false;
            pVar.a(0, 2, bArr);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                pVar.q();
                pVar.l((int) (j3 - pVar.getPosition()));
            } else {
                e2.v vVar = new e2.v(16);
                System.arraycopy(bArr, 0, vVar.f8584a, 0, 2);
                byte[] bArr2 = vVar.f8584a;
                while (i11 < 14 && (e7 = pVar.e(2 + i11, 14 - i11, bArr2)) != -1) {
                    i11 += e7;
                }
                vVar.I(i11);
                pVar.q();
                pVar.l((int) (j3 - pVar.getPosition()));
                b10 = c3.b.b(vVar, uVar, i10, sVar);
            }
            if (b10) {
                break;
            }
            pVar.l(1);
        }
        if (pVar.j() >= pVar.getLength() - 6) {
            pVar.l((int) (pVar.getLength() - pVar.j()));
            return uVar.f4161j;
        }
        return sVar.f4150a;
    }

    public Object n(int i10) {
        SparseArray sparseArray = (SparseArray) this.f300c;
        if (this.f299b == -1) {
            this.f299b = 0;
        }
        while (true) {
            int i11 = this.f299b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f299b--;
        }
        while (this.f299b < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f299b + 1)) {
            this.f299b++;
        }
        return sparseArray.valueAt(this.f299b);
    }

    public boolean o() {
        ColorStateList colorStateList;
        if (((Shader) this.f300c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    @Override
    public void onSuccess(Object obj) {
        List list = (List) obj;
        m4.b0 b0Var = ((l0) this.d).f16156g;
        Handler handler = b0Var.f15989l;
        m4.r rVar = (m4.r) this.f300c;
        d0.T(handler, new ki.i0(b0Var, rVar, new ai.d9(this, this.f299b, list, rVar, 6)));
    }

    public void p(t tVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10) {
        k(new h0(this, tVar, new b0(i10, i11, sVar, i12, obj, d0.d0(j3), d0.d0(j10)), 1));
    }

    public void q(t tVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10) {
        k(new h0(this, tVar, new b0(i10, i11, sVar, i12, obj, d0.d0(j3), d0.d0(j10)), 0));
    }

    public void r(t tVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10, IOException iOException, boolean z10) {
        k(new mk(this, tVar, new b0(i10, i11, sVar, i12, obj, d0.d0(j3), d0.d0(j10)), iOException, z10));
    }

    public void s(t tVar, int i10, IOException iOException, boolean z10) {
        r(tVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public void t(AttributeSet attributeSet, int i10) {
        int resourceId;
        ImageView imageView = (ImageView) this.f300c;
        Context context = imageView.getContext();
        int[] iArr = f.a.f9530f;
        la.h R = la.h.R(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) R.f15463c;
        r0.i0.i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) R.f15463c, i10);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = s7.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                l1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(R.E(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(l1.b(typedArray.getInt(3, -1), null));
            }
            R.S();
        } catch (Throwable th2) {
            R.S();
            throw th2;
        }
    }

    public void u(t tVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10, int i13) {
        k(new ea(this, tVar, new b0(i10, i11, sVar, i12, obj, d0.d0(j3), d0.d0(j10)), i13, 10));
    }

    public a w(Object obj, Object obj2) {
        int i10 = (this.f299b + 1) * 2;
        Object[] objArr = (Object[]) this.f300c;
        if (i10 > objArr.length) {
            this.f300c = Arrays.copyOf(objArr, w.h(objArr.length, i10));
        }
        if (obj != null) {
            if (obj2 != null) {
                Object[] objArr2 = (Object[]) this.f300c;
                int i11 = this.f299b;
                int i12 = i11 * 2;
                objArr2[i12] = obj;
                objArr2[i12 + 1] = obj2;
                this.f299b = i11 + 1;
                return this;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        throw new NullPointerException("null key in entry: null=" + obj2);
    }

    public void x(int i10) {
        y(i10, 200L, hs.f27118f);
    }

    public void y(int i10, long j3, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.f300c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.f300c).cancel();
        }
        int[] iArr = new int[1];
        this.f299b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i10);
        this.f300c = ofInt;
        ofInt.addUpdateListener(new ai.x(24, this, iArr));
        ((ValueAnimator) this.f300c).addListener(new ji(this, i10, iArr, 1));
        ((ValueAnimator) this.f300c).setDuration(j3);
        ((ValueAnimator) this.f300c).setInterpolator(interpolator);
        ((ValueAnimator) this.f300c).start();
    }

    public List z(CharSequence charSequence) {
        charSequence.getClass();
        a4.l lVar = (a4.l) this.d;
        lVar.getClass();
        d9.i iVar = new d9.i(lVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (iVar.hasNext()) {
            arrayList.add((String) iVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public a(int i10, int i11) {
        this.f298a = i11;
        switch (i11) {
            case 5:
                this.f300c = new Object[i10 * 2];
                this.f299b = 0;
                return;
            default:
                this.f299b = i10;
                return;
        }
    }

    public a(Object obj, int i10, Object obj2, int i11) {
        this.f298a = i11;
        this.d = obj;
        this.f299b = i10;
        this.f300c = obj2;
    }

    public a(int i10, byte b10) {
        this.f298a = i10;
        switch (i10) {
            case 14:
                this.f300c = new gh.a();
                return;
            case 20:
                this.f300c = new Object[8];
                this.f299b = 0;
                return;
            case 26:
                int i11 = e.f52129y;
                this.f300c = new z[i11];
                this.d = new Bitmap[i11];
                return;
            default:
                this.f300c = DesugarCollections.synchronizedMap(new m(0));
                this.f299b = 0;
                return;
        }
    }

    public a(n nVar, int i10) {
        this.f298a = 25;
        this.d = new Object();
        this.f300c = nVar;
        ja.b();
        this.f299b = i10;
    }

    public a(String str, String[] strArr) {
        String sb2;
        this.f298a = 18;
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
        this.f300c = str;
        int i10 = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i10 <= 7 && !Log.isLoggable((String) this.f300c, i10)) {
            i10++;
        }
        this.f299b = i10;
    }

    private final void v() {
    }

    @Override
    public void h(Throwable th2) {
    }

    public a(q3 q3Var, int i10) {
        this.f298a = 27;
        this.d = new Object();
        this.f300c = q3Var;
        zf.b();
        this.f299b = i10;
    }

    public a(f fVar, int i10) {
        this.f298a = 23;
        this.d = new Object();
        this.f300c = fVar;
        d9.b();
        this.f299b = i10;
    }

    public a(qm0 qm0Var) {
        this.f298a = 16;
        this.d = qm0Var;
    }

    public a(ByteBuffer byteBuffer, int i10, RectF rectF) {
        this.f298a = 17;
        this.f300c = rectF;
        this.f299b = i10;
        try {
            this.d = File.createTempFile("paint", ".bin", ApplicationLoader.applicationContext.getCacheDir());
        } catch (Exception e7) {
            FileLog.e(e7);
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public a(ImageView imageView) {
        this.f298a = 12;
        this.f299b = 0;
        this.f300c = imageView;
    }

    public a(s0.b bVar) {
        this.f298a = 22;
        this.f300c = new SparseArray();
        this.d = bVar;
        this.f299b = -1;
    }

    public a(Shader shader, ColorStateList colorStateList, int i10) {
        this.f298a = 7;
        this.f300c = shader;
        this.d = colorStateList;
        this.f299b = i10;
    }

    public a(String str) {
        this.f298a = 0;
        this.f300c = str;
        this.d = null;
        this.f299b = 0;
    }

    public a(u uVar, int i10) {
        this.f298a = 8;
        this.f300c = uVar;
        this.f299b = i10;
        this.d = new Object();
    }

    public a(int i10, e2.b0 b0Var) {
        this.f298a = 10;
        this.f299b = i10;
        this.f300c = b0Var;
        this.d = new e2.v();
    }

    public a(byte[] bArr) {
        this.f298a = 0;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.f300c = null;
        this.f299b = 1;
    }

    public a(g2.g gVar) {
        this.f298a = 11;
        b2.p pVar = new b2.p(6);
        pVar.f3506c = new ob.a(28);
        this.d = pVar;
        this.f300c = gVar;
        this.f299b = 1;
    }

    public a(a4.l lVar) {
        this.f298a = 4;
        this.d = lVar;
        this.f300c = d9.c.f8210a;
        this.f299b = Integer.MAX_VALUE;
    }

    public a(l0 l0Var, m4.r rVar, int i10) {
        this.f298a = 13;
        this.d = l0Var;
        this.f300c = rVar;
        this.f299b = i10;
    }
}
