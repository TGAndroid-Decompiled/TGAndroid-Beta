package a5;

import a1.g;
import ah.l0;
import ai.c5;
import ai.cb;
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
import c3.i;
import c3.s;
import c3.u;
import c5.w;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.internal.cast.a0;
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
import m4.v;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jk;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.ry;
import org.telegram.ui.fa;
import org.telegram.ui.web.m;
import qi.e;
import tg.p;
import u2.c0;
import u2.g0;
import u2.i0;
import u2.j0;
import u2.k0;
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
import z7.ag;
import z7.jb;
import z7.x;
import z7.xe;
import z7.y;
import zf.z;
public class a implements i, t {
    public final int f280a;
    public int f281b;
    public Object f282c;
    public Object d;

    public a(char c10, int i10) {
        this.f280a = i10;
    }

    public static a5.a j(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        throw new UnsupportedOperationException("Method not decompiled: a5.a.j(android.content.res.Resources, int, android.content.res.Resources$Theme):a5.a");
    }

    public void A(int i10, long j10, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.f282c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.f282c).cancel();
        }
        int[] iArr = new int[1];
        this.f281b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i10);
        this.f282c = ofInt;
        ofInt.addUpdateListener(new l0(25, this, iArr));
        ((ValueAnimator) this.f282c).addListener(new c5(this, i10, iArr, 2));
        ((ValueAnimator) this.f282c).setDuration(j10);
        ((ValueAnimator) this.f282c).setInterpolator(interpolator);
        ((ValueAnimator) this.f282c).start();
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
        g0 g0Var = (g0) this.f282c;
        g0Var.getClass();
        l(new ry(this, g0Var, c0Var, 12));
    }

    public void D(String str, k6.c cVar) {
        int i10 = this.f281b + 1;
        Object[] objArr = (Object[]) this.f282c;
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
                this.f282c = Arrays.copyOf(objArr, i12);
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        Object[] objArr2 = (Object[]) this.f282c;
        int i13 = this.f281b;
        int i14 = i13 + i13;
        objArr2[i14] = str;
        objArr2[i14 + 1] = cVar;
        this.f281b = i13 + 1;
    }

    public void E(String str, l lVar) {
        Map map = (Map) this.f282c;
        if (!map.containsKey(str)) {
            map.put(str, lVar);
            if (this.f281b > 0) {
                new a0(Looper.getMainLooper(), 4).post(new w(this, lVar, str, false, 4));
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
        switch (this.f280a) {
            case 23:
                d9 d9Var = d9.f48007c;
                e eVar = (e) this.f282c;
                ((d8) this.d).h = false;
                d8 d8Var = (d8) this.d;
                d8Var.f48001f = Boolean.FALSE;
                eVar.f44760a = new e8(d8Var);
                try {
                    d9.b();
                    k6 k6Var = new k6(eVar);
                    u2.c cVar = new u2.c(1);
                    d9Var.a(cVar);
                    HashMap hashMap = new HashMap((HashMap) cVar.f47269b);
                    HashMap hashMap2 = new HashMap((HashMap) cVar.f47270c);
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
                ia iaVar = ia.f49429c;
                com.google.firebase.messaging.l lVar = (com.google.firebase.messaging.l) this.f282c;
                ((d8) this.d).h = false;
                d8 d8Var2 = (d8) this.d;
                d8Var2.f48001f = Boolean.FALSE;
                lVar.f7645a = new i9(d8Var2);
                try {
                    ia.b();
                    p7 p7Var = new p7(lVar);
                    u2.c cVar2 = new u2.c(9);
                    iaVar.a(cVar2);
                    HashMap hashMap3 = new HashMap((HashMap) cVar2.f47269b);
                    HashMap hashMap4 = new HashMap((HashMap) cVar2.f47270c);
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
                ag agVar = ag.f50733c;
                s3 s3Var = (s3) this.f282c;
                ((d8) this.d).h = false;
                d8 d8Var3 = (d8) this.d;
                d8Var3.f48001f = Boolean.FALSE;
                s3Var.f16334a = new xe(d8Var3);
                try {
                    ag.b();
                    jb jbVar = new jb(s3Var);
                    u2.c cVar3 = new u2.c(15);
                    agVar.a(cVar3);
                    HashMap hashMap5 = new HashMap((HashMap) cVar3.f47269b);
                    HashMap hashMap6 = new HashMap((HashMap) cVar3.f47270c);
                    x xVar = (x) cVar3.d;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        yVar = new y(byteArrayOutputStream3, hashMap5, hashMap6, xVar);
                        dVar3 = (d) hashMap5.get(jb.class);
                    } catch (IOException unused3) {
                    }
                    if (dVar3 != null) {
                        dVar3.a(jbVar, yVar);
                        return byteArrayOutputStream3.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(jb.class)));
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
        }
    }

    public void G(Bundle bundle) {
        Bundle bundle2;
        this.f281b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.f282c).entrySet()) {
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
            for (Map.Entry entry : ((Map) this.f282c).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((l) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public void a(int i10, int i11) {
        boolean z10;
        int i12 = (i11 << 16) + i10;
        if (this.f281b != i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f281b = i12;
        for (int i13 = 0; i13 < zf.e.f51541y; i13++) {
            if (z10 || ((Bitmap[]) this.d)[i13] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i13];
                if (bitmap != null) {
                    Utilities.globalQueue.postRunnable(new p(bitmap, 20));
                }
                ((Bitmap[]) this.d)[i13] = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            }
            z[] zVarArr = (z[]) this.f282c;
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
        ImageView imageView = (ImageView) this.f282c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            m1.a(drawable);
        }
        if (drawable != null && (e3Var = (e3) this.d) != null) {
            r.d(drawable, e3Var, imageView.getDrawableState());
        }
    }

    @Override
    public void d() {
        switch (this.f280a) {
            case 8:
                return;
            default:
                e2.x xVar = (e2.x) this.d;
                byte[] bArr = m0.f8253b;
                xVar.getClass();
                xVar.L(bArr.length, bArr);
                return;
        }
    }

    public c2 e(boolean z10) {
        p0 p0Var;
        p0 p0Var2;
        if (z10 && (p0Var2 = (p0) this.d) != null) {
            throw p0Var2.a();
        }
        c2 f7 = c2.f(this.f281b, (Object[]) this.f282c, this);
        if (z10 && (p0Var = (p0) this.d) != null) {
            throw p0Var.a();
        }
        return f7;
    }

    public ta.b f() {
        if ("".isEmpty()) {
            return new ta.b((String) this.f282c, ((Long) this.d).longValue(), this.f281b);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public q0 g() {
        return e(false);
    }

    public void h(int i10) {
        String str;
        int i11 = this.f281b;
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
        if (this.f281b <= 3) {
            String str2 = (String) this.f282c;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.d).concat(str));
        }
    }

    public void l(e2.j jVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            k0 k0Var = (k0) it.next();
            m0.W(k0Var.f47343a, new j0(0, jVar, k0Var.f47344b));
        }
    }

    public void m(int i10, b2.w wVar, int i11, Object obj, long j10) {
        l(new m(12, this, new c0(1, i10, wVar, i11, obj, m0.h0(j10), -9223372036854775807L)));
    }

    public long n(c3.p pVar) {
        int h;
        s sVar = (s) this.d;
        u uVar = (u) this.f282c;
        while (pVar.k() < pVar.getLength() - 6) {
            int i10 = this.f281b;
            long k10 = pVar.k();
            e2.x xVar = new e2.x(17);
            int i11 = 0;
            boolean a2 = false;
            pVar.b(0, 2, xVar.f8291a);
            if (xVar.g(0, ByteOrder.BIG_ENDIAN) != i10) {
                pVar.q();
                pVar.l((int) (k10 - pVar.getPosition()));
            } else {
                byte[] bArr = xVar.f8291a;
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
            return uVar.f4665j;
        }
        return sVar.f4655a;
    }

    public Object o(int i10) {
        SparseArray sparseArray = (SparseArray) this.f282c;
        if (this.f281b == -1) {
            this.f281b = 0;
        }
        while (true) {
            int i11 = this.f281b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f281b--;
        }
        while (this.f281b < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f281b + 1)) {
            this.f281b++;
        }
        return sparseArray.valueAt(this.f281b);
    }

    @Override
    public void onSuccess(Object obj) {
        List list = (List) obj;
        f0 f0Var = ((m4.p0) this.d).f16661g;
        Handler handler = f0Var.f16526l;
        v vVar = (v) this.f282c;
        m0.W(handler, new hi.t(f0Var, vVar, new cb(this, this.f281b, list, vVar, 7)));
    }

    public boolean p() {
        ColorStateList colorStateList;
        if (((Shader) this.f282c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void q(u2.u uVar, int i10, int i11, b2.w wVar, int i12, Object obj, long j10, long j11) {
        l(new i0(this, uVar, new c0(i10, i11, wVar, i12, obj, m0.h0(j10), m0.h0(j11)), 1));
    }

    public void r(u2.u uVar, int i10, int i11, b2.w wVar, int i12, Object obj, long j10, long j11) {
        l(new i0(this, uVar, new c0(i10, i11, wVar, i12, obj, m0.h0(j10), m0.h0(j11)), 0));
    }

    public void s(u2.u uVar, int i10, int i11, b2.w wVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        l(new jk(this, uVar, new c0(i10, i11, wVar, i12, obj, m0.h0(j10), m0.h0(j11)), iOException, z10));
    }

    public void t(u2.u uVar, int i10, IOException iOException, boolean z10) {
        s(uVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public void u(AttributeSet attributeSet, int i10) {
        int resourceId;
        ImageView imageView = (ImageView) this.f282c;
        Context context = imageView.getContext();
        int[] iArr = f.a.f10252f;
        g3 P = g3.P(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) P.f16203c;
        r0.i0.i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) P.f16203c, i10);
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

    public void v(u2.u uVar, int i10, int i11, b2.w wVar, int i12, Object obj, long j10, long j11, int i13) {
        l(new fa(this, uVar, new c0(i10, i11, wVar, i12, obj, m0.h0(j10), m0.h0(j11)), i13, 9));
    }

    public a x(Object obj, Object obj2) {
        int i10 = (this.f281b + 1) * 2;
        Object[] objArr = (Object[]) this.f282c;
        if (i10 > objArr.length) {
            this.f282c = Arrays.copyOf(objArr, h0.b(objArr.length, i10));
        }
        e9.s.e(obj, obj2);
        Object[] objArr2 = (Object[]) this.f282c;
        int i11 = this.f281b;
        int i12 = i11 * 2;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.f281b = i11 + 1;
        return this;
    }

    public a y(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.f281b) * 2;
            Object[] objArr = (Object[]) this.f282c;
            if (size > objArr.length) {
                this.f282c = Arrays.copyOf(objArr, h0.b(objArr.length, size));
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
        A(i10, 200L, bs.f25021f);
    }

    public a(int i10, int i11) {
        this.f280a = i11;
        switch (i11) {
            case 5:
                this.f282c = new Object[i10 * 2];
                this.f281b = 0;
                return;
            default:
                this.f281b = i10;
                return;
        }
    }

    public a(Object obj, int i10, Object obj2, int i11) {
        this.f280a = i11;
        this.d = obj;
        this.f281b = i10;
        this.f282c = obj2;
    }

    public a(int i10, byte b10) {
        this.f280a = i10;
        switch (i10) {
            case 14:
                this.f282c = new hh.a();
                return;
            case 19:
                this.f282c = new Object[8];
                this.f281b = 0;
                return;
            case 27:
                int i11 = zf.e.f51541y;
                this.f282c = new z[i11];
                this.d = new Bitmap[i11];
                return;
            default:
                this.f282c = DesugarCollections.synchronizedMap(new a0.l(0));
                this.f281b = 0;
                return;
        }
    }

    public a(com.google.firebase.messaging.l lVar, int i10) {
        this.f280a = 24;
        this.d = new Object();
        this.f282c = lVar;
        ia.b();
        this.f281b = i10;
    }

    public a(String str, String[] strArr) {
        String sb2;
        this.f280a = 17;
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
        this.f282c = str;
        int i10 = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i10 <= 7 && !Log.isLoggable((String) this.f282c, i10)) {
            i10++;
        }
        this.f281b = i10;
    }

    private final void w() {
    }

    @Override
    public void i(Throwable th2) {
    }

    public a(s3 s3Var, int i10) {
        this.f280a = 26;
        this.d = new Object();
        this.f282c = s3Var;
        ag.b();
        this.f281b = i10;
    }

    public a(e eVar, int i10) {
        this.f280a = 23;
        this.d = new Object();
        this.f282c = eVar;
        d9.b();
        this.f281b = i10;
    }

    public a(jm0 jm0Var) {
        this.f280a = 16;
        this.d = jm0Var;
    }

    public a(ByteBuffer byteBuffer, int i10, RectF rectF) {
        this.f280a = 18;
        this.f282c = rectF;
        this.f281b = i10;
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
        this.f280a = 12;
        this.f281b = 0;
        this.f282c = imageView;
    }

    public a(sg.y yVar) {
        this.f280a = 22;
        this.f282c = new SparseArray();
        this.d = yVar;
        this.f281b = -1;
    }

    public a(Shader shader, ColorStateList colorStateList, int i10) {
        this.f280a = 7;
        this.f282c = shader;
        this.d = colorStateList;
        this.f281b = i10;
    }

    public a(String str) {
        this.f280a = 0;
        this.f282c = str;
        this.d = null;
        this.f281b = 0;
    }

    public a(u uVar, int i10) {
        this.f280a = 8;
        this.f282c = uVar;
        this.f281b = i10;
        this.d = new Object();
    }

    public a(int i10, e2.k0 k0Var) {
        this.f280a = 10;
        this.f281b = i10;
        this.f282c = k0Var;
        this.d = new e2.x();
    }

    public a(byte[] bArr) {
        this.f280a = 0;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.f282c = null;
        this.f281b = 1;
    }

    public a(g2.g gVar) {
        this.f280a = 11;
        ?? obj = new Object();
        obj.f4730c = new t7.u(28);
        obj.f4728a = 3;
        this.d = obj;
        this.f282c = gVar;
        this.f281b = 1;
    }

    public a(a6.i iVar) {
        this.f280a = 4;
        d9.b bVar = d9.b.f7882f;
        this.d = iVar;
        this.f282c = bVar;
        this.f281b = Integer.MAX_VALUE;
    }

    public a(m4.p0 p0Var, v vVar, int i10) {
        this.f280a = 13;
        this.d = p0Var;
        this.f282c = vVar;
        this.f281b = i10;
    }
}
