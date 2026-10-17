package a5;

import a1.g;
import ah.l0;
import ai.b5;
import ai.bb;
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
import b2.w;
import c3.i;
import c3.s;
import c3.u;
import c5.v;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.internal.cast.a0;
import e2.k0;
import e2.m0;
import e9.c2;
import e9.h0;
import e9.p0;
import e9.q0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j9.t;
import ja.d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Deflater;
import m.e3;
import m.g3;
import m.m1;
import m.r;
import m.s3;
import m4.f0;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ik;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.ry;
import org.telegram.ui.ha;
import qi.e;
import tg.p;
import u2.c0;
import u2.g0;
import u2.i0;
import u2.j0;
import v7.d8;
import v7.d9;
import v7.e8;
import v7.j;
import v7.k6;
import v7.q7;
import x7.d0;
import x7.e0;
import x7.i9;
import x7.ia;
import x7.p7;
import z7.bg;
import z7.kb;
import z7.x;
import z7.y;
import z7.ye;
import zf.z;
public class a implements i, t {
    public final int f279a;
    public int f280b;
    public Object f281c;
    public Object d;

    public a(char c10, int i10) {
        this.f279a = i10;
    }

    public static a5.a j(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        throw new UnsupportedOperationException("Method not decompiled: a5.a.j(android.content.res.Resources, int, android.content.res.Resources$Theme):a5.a");
    }

    public void A(int i10, long j10, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.f281c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.f281c).cancel();
        }
        int[] iArr = new int[1];
        this.f280b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i10);
        this.f281c = ofInt;
        ofInt.addUpdateListener(new l0(25, this, iArr));
        ((ValueAnimator) this.f281c).addListener(new b5(this, i10, iArr, 2));
        ((ValueAnimator) this.f281c).setDuration(j10);
        ((ValueAnimator) this.f281c).setInterpolator(interpolator);
        ((ValueAnimator) this.f281c).start();
    }

    public List B(CharSequence charSequence) {
        charSequence.getClass();
        a6.i iVar = (a6.i) this.d;
        iVar.getClass();
        d9.t tVar = new d9.t(iVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (tVar.hasNext()) {
            arrayList.add((String) tVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void C(int i10, long j10, long j11) {
        c0 c0Var = new c0(1, i10, null, 3, null, m0.h0(j10), m0.h0(j11));
        g0 g0Var = (g0) this.f281c;
        g0Var.getClass();
        l(new ry(this, g0Var, c0Var, 12));
    }

    public void D(String str, k6.c cVar) {
        int i10 = this.f280b + 1;
        Object[] objArr = (Object[]) this.f281c;
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
                this.f281c = Arrays.copyOf(objArr, i12);
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        Object[] objArr2 = (Object[]) this.f281c;
        int i13 = this.f280b;
        int i14 = i13 + i13;
        objArr2[i14] = str;
        objArr2[i14 + 1] = cVar;
        this.f280b = i13 + 1;
    }

    public void E(String str, l lVar) {
        Map map = (Map) this.f281c;
        if (!map.containsKey(str)) {
            map.put(str, lVar);
            if (this.f280b > 0) {
                new a0(Looper.getMainLooper(), 4).post(new v(this, lVar, str, false, 4));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(g.p("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public byte[] F() {
        j jVar;
        d dVar;
        e0 e0Var;
        d dVar2;
        y yVar;
        d dVar3;
        switch (this.f279a) {
            case 23:
                d9 d9Var = d9.f48022c;
                e eVar = (e) this.f281c;
                ((d8) this.d).h = false;
                d8 d8Var = (d8) this.d;
                d8Var.f48016f = Boolean.FALSE;
                eVar.f44777a = new e8(d8Var);
                try {
                    d9.b();
                    k6 k6Var = new k6(eVar);
                    u2.c cVar = new u2.c(1);
                    d9Var.a(cVar);
                    HashMap hashMap = new HashMap((HashMap) cVar.f47282b);
                    HashMap hashMap2 = new HashMap((HashMap) cVar.f47283c);
                    v7.i iVar = (v7.i) cVar.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        jVar = new j(byteArrayOutputStream, hashMap, hashMap2, iVar);
                        dVar = (d) hashMap.get(k6.class);
                    } catch (IOException unused) {
                    }
                    if (dVar != null) {
                        dVar.a(k6Var, jVar);
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(k6.class)));
                } catch (UnsupportedEncodingException e) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                }
            case 24:
                ia iaVar = ia.f49445c;
                com.google.firebase.messaging.l lVar = (com.google.firebase.messaging.l) this.f281c;
                ((d8) this.d).h = false;
                d8 d8Var2 = (d8) this.d;
                d8Var2.f48016f = Boolean.FALSE;
                lVar.f7647a = new i9(d8Var2);
                try {
                    ia.b();
                    p7 p7Var = new p7(lVar);
                    u2.c cVar2 = new u2.c(9);
                    iaVar.a(cVar2);
                    HashMap hashMap3 = new HashMap((HashMap) cVar2.f47282b);
                    HashMap hashMap4 = new HashMap((HashMap) cVar2.f47283c);
                    d0 d0Var = (d0) cVar2.d;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        e0Var = new e0(byteArrayOutputStream2, hashMap3, hashMap4, d0Var);
                        dVar2 = (d) hashMap3.get(p7.class);
                    } catch (IOException unused2) {
                    }
                    if (dVar2 != null) {
                        dVar2.a(p7Var, e0Var);
                        return byteArrayOutputStream2.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(p7.class)));
                } catch (UnsupportedEncodingException e7) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
                }
            default:
                bg bgVar = bg.f50759c;
                s3 s3Var = (s3) this.f281c;
                ((d8) this.d).h = false;
                d8 d8Var3 = (d8) this.d;
                d8Var3.f48016f = Boolean.FALSE;
                s3Var.f16328a = new ye(d8Var3);
                try {
                    bg.b();
                    kb kbVar = new kb(s3Var);
                    u2.c cVar3 = new u2.c(15);
                    bgVar.a(cVar3);
                    HashMap hashMap5 = new HashMap((HashMap) cVar3.f47282b);
                    HashMap hashMap6 = new HashMap((HashMap) cVar3.f47283c);
                    x xVar = (x) cVar3.d;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        yVar = new y(byteArrayOutputStream3, hashMap5, hashMap6, xVar);
                        dVar3 = (d) hashMap5.get(kb.class);
                    } catch (IOException unused3) {
                    }
                    if (dVar3 != null) {
                        dVar3.a(kbVar, yVar);
                        return byteArrayOutputStream3.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(kb.class)));
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
        }
    }

    public void G(Bundle bundle) {
        Bundle bundle2;
        this.f280b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.f281c).entrySet()) {
            l lVar = (l) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lVar.onCreate(bundle2);
        }
    }

    public void H(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.f281c).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((l) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public void a(int i10, int i11) {
        boolean z10;
        int i12 = (i11 << 16) + i10;
        if (this.f280b != i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f280b = i12;
        for (int i13 = 0; i13 < zf.e.f51556y; i13++) {
            if (z10 || ((Bitmap[]) this.d)[i13] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i13];
                if (bitmap != null) {
                    Utilities.globalQueue.postRunnable(new p(bitmap, 20));
                }
                ((Bitmap[]) this.d)[i13] = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            }
            z[] zVarArr = (z[]) this.f281c;
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
        e3 e3Var;
        ImageView imageView = (ImageView) this.f281c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            m1.a(drawable);
        }
        if (drawable != null && (e3Var = (e3) this.d) != null) {
            r.d(drawable, e3Var, imageView.getDrawableState());
        }
    }

    public c2 d(boolean z10) {
        p0 p0Var;
        p0 p0Var2;
        if (z10 && (p0Var2 = (p0) this.d) != null) {
            throw p0Var2.a();
        }
        c2 f7 = c2.f(this.f280b, (Object[]) this.f281c, this);
        if (z10 && (p0Var = (p0) this.d) != null) {
            throw p0Var.a();
        }
        return f7;
    }

    public ta.b e() {
        if ("".isEmpty()) {
            return new ta.b((String) this.f281c, ((Long) this.d).longValue(), this.f280b);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    @Override
    public void f() {
        switch (this.f279a) {
            case 8:
                return;
            default:
                e2.x xVar = (e2.x) this.d;
                byte[] bArr = m0.f8255b;
                xVar.getClass();
                xVar.L(bArr.length, bArr);
                return;
        }
    }

    public q0 g() {
        return d(false);
    }

    public void h(int i10) {
        String str;
        int i11 = this.f280b;
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

    public void k(String str, Object... objArr) {
        if (this.f280b <= 3) {
            String str2 = (String) this.f281c;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.d).concat(str));
        }
    }

    public void l(e2.j jVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            m0.W(j0Var.f47350a, new p2.b(28, jVar, j0Var.f47351b));
        }
    }

    public void m(int i10, w wVar, int i11, Object obj, long j10) {
        l(new org.telegram.ui.web.c0(11, this, new c0(1, i10, wVar, i11, obj, m0.h0(j10), -9223372036854775807L)));
    }

    public long n(c3.p pVar) {
        int h;
        s sVar = (s) this.d;
        u uVar = (u) this.f281c;
        while (pVar.k() < pVar.getLength() - 6) {
            int i10 = this.f280b;
            long k10 = pVar.k();
            e2.x xVar = new e2.x(17);
            int i11 = 0;
            boolean a2 = false;
            pVar.b(0, 2, xVar.f8293a);
            if (xVar.g(0, ByteOrder.BIG_ENDIAN) != i10) {
                pVar.q();
                pVar.l((int) (k10 - pVar.getPosition()));
            } else {
                byte[] bArr = xVar.f8293a;
                while (i11 < 15 && (h = pVar.h(2 + i11, 15 - i11, bArr)) != -1) {
                    i11 += h;
                }
                xVar.M(i11 + 2);
                pVar.q();
                pVar.l((int) (k10 - pVar.getPosition()));
                a2 = c3.b.a(xVar, uVar, i10, sVar);
            }
            if (a2) {
                break;
            }
            pVar.l(1);
        }
        if (pVar.k() >= pVar.getLength() - 6) {
            pVar.l((int) (pVar.getLength() - pVar.k()));
            return uVar.f4668j;
        }
        return sVar.f4658a;
    }

    public Object o(int i10) {
        SparseArray sparseArray = (SparseArray) this.f281c;
        if (this.f280b == -1) {
            this.f280b = 0;
        }
        while (true) {
            int i11 = this.f280b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f280b--;
        }
        while (this.f280b < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f280b + 1)) {
            this.f280b++;
        }
        return sparseArray.valueAt(this.f280b);
    }

    @Override
    public void onSuccess(Object obj) {
        List list = (List) obj;
        f0 f0Var = ((m4.p0) this.d).f16655g;
        Handler handler = f0Var.f16520l;
        m4.v vVar = (m4.v) this.f281c;
        m0.W(handler, new hi.t(f0Var, vVar, new bb(this, this.f280b, list, vVar, 7)));
    }

    public boolean p() {
        ColorStateList colorStateList;
        if (((Shader) this.f281c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void q(u2.u uVar, int i10, int i11, w wVar, int i12, Object obj, long j10, long j11) {
        l(new i0(this, uVar, new c0(i10, i11, wVar, i12, obj, m0.h0(j10), m0.h0(j11)), 1));
    }

    public void r(u2.u uVar, int i10, int i11, w wVar, int i12, Object obj, long j10, long j11) {
        l(new i0(this, uVar, new c0(i10, i11, wVar, i12, obj, m0.h0(j10), m0.h0(j11)), 0));
    }

    public void s(u2.u uVar, int i10, int i11, w wVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        l(new ik(this, uVar, new c0(i10, i11, wVar, i12, obj, m0.h0(j10), m0.h0(j11)), iOException, z10));
    }

    public void t(u2.u uVar, int i10, IOException iOException, boolean z10) {
        s(uVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public void u(AttributeSet attributeSet, int i10) {
        int resourceId;
        ImageView imageView = (ImageView) this.f281c;
        Context context = imageView.getContext();
        int[] iArr = f.a.f10253f;
        g3 P = g3.P(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) P.f16197c;
        r0.i0.i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) P.f16197c, i10);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = q7.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                m1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(P.E(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(m1.b(typedArray.getInt(3, -1), null));
            }
            P.Q();
        } catch (Throwable th2) {
            P.Q();
            throw th2;
        }
    }

    public void v(u2.u uVar, int i10, int i11, w wVar, int i12, Object obj, long j10, long j11, int i13) {
        l(new ha(this, uVar, new c0(i10, i11, wVar, i12, obj, m0.h0(j10), m0.h0(j11)), i13, 9));
    }

    public a x(Object obj, Object obj2) {
        int i10 = (this.f280b + 1) * 2;
        Object[] objArr = (Object[]) this.f281c;
        if (i10 > objArr.length) {
            this.f281c = Arrays.copyOf(objArr, h0.b(objArr.length, i10));
        }
        e9.s.e(obj, obj2);
        Object[] objArr2 = (Object[]) this.f281c;
        int i11 = this.f280b;
        int i12 = i11 * 2;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.f280b = i11 + 1;
        return this;
    }

    public a y(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.f280b) * 2;
            Object[] objArr = (Object[]) this.f281c;
            if (size > objArr.length) {
                this.f281c = Arrays.copyOf(objArr, h0.b(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            x(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public void z(int i10) {
        A(i10, 200L, bs.f25030f);
    }

    public a(int i10, int i11) {
        this.f279a = i11;
        switch (i11) {
            case 5:
                this.f281c = new Object[i10 * 2];
                this.f280b = 0;
                return;
            default:
                this.f280b = i10;
                return;
        }
    }

    public a(Object obj, int i10, Object obj2, int i11) {
        this.f279a = i11;
        this.d = obj;
        this.f280b = i10;
        this.f281c = obj2;
    }

    public a(int i10, byte b10) {
        this.f279a = i10;
        switch (i10) {
            case 14:
                this.f281c = new hh.a();
                return;
            case 19:
                this.f281c = new Object[8];
                this.f280b = 0;
                return;
            case 27:
                int i11 = zf.e.f51556y;
                this.f281c = new z[i11];
                this.d = new Bitmap[i11];
                return;
            default:
                this.f281c = DesugarCollections.synchronizedMap(new a0.l(0));
                this.f280b = 0;
                return;
        }
    }

    public a(com.google.firebase.messaging.l lVar, int i10) {
        this.f279a = 24;
        this.d = new Object();
        this.f281c = lVar;
        ia.b();
        this.f280b = i10;
    }

    public a(String str, String[] strArr) {
        String sb2;
        this.f279a = 17;
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
        this.f281c = str;
        int i10 = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i10 <= 7 && !Log.isLoggable((String) this.f281c, i10)) {
            i10++;
        }
        this.f280b = i10;
    }

    private final void w() {
    }

    @Override
    public void i(Throwable th2) {
    }

    public a(s3 s3Var, int i10) {
        this.f279a = 26;
        this.d = new Object();
        this.f281c = s3Var;
        bg.b();
        this.f280b = i10;
    }

    public a(e eVar, int i10) {
        this.f279a = 23;
        this.d = new Object();
        this.f281c = eVar;
        d9.b();
        this.f280b = i10;
    }

    public a(im0 im0Var) {
        this.f279a = 16;
        this.d = im0Var;
    }

    public a(ByteBuffer byteBuffer, int i10, RectF rectF) {
        this.f279a = 18;
        this.f281c = rectF;
        this.f280b = i10;
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

    public a(ImageView imageView) {
        this.f279a = 12;
        this.f280b = 0;
        this.f281c = imageView;
    }

    public a(si.a aVar) {
        this.f279a = 22;
        this.f281c = new SparseArray();
        this.d = aVar;
        this.f280b = -1;
    }

    public a(Shader shader, ColorStateList colorStateList, int i10) {
        this.f279a = 7;
        this.f281c = shader;
        this.d = colorStateList;
        this.f280b = i10;
    }

    public a(String str) {
        this.f279a = 0;
        this.f281c = str;
        this.d = null;
        this.f280b = 0;
    }

    public a(u uVar, int i10) {
        this.f279a = 8;
        this.f281c = uVar;
        this.f280b = i10;
        this.d = new Object();
    }

    public a(int i10, k0 k0Var) {
        this.f279a = 10;
        this.f280b = i10;
        this.f281c = k0Var;
        this.d = new e2.x();
    }

    public a(byte[] bArr) {
        this.f279a = 0;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.f281c = null;
        this.f280b = 1;
    }

    public a(g2.g gVar) {
        this.f279a = 11;
        ?? obj = new Object();
        obj.f4732c = new t7.u(28);
        obj.f4730a = 3;
        this.d = obj;
        this.f281c = gVar;
        this.f280b = 1;
    }

    public a(a6.i iVar) {
        this.f279a = 4;
        d9.b bVar = d9.b.f7884f;
        this.d = iVar;
        this.f281c = bVar;
        this.f280b = Integer.MAX_VALUE;
    }

    public a(m4.p0 p0Var, m4.v vVar, int i10) {
        this.f279a = 13;
        this.d = p0Var;
        this.f281c = vVar;
        this.f280b = i10;
    }
}
