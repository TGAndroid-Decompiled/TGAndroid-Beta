package a8;

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
import j$.util.DesugarCollections;
import j$.util.Objects;
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
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.nk;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.zg1;
public class ng implements c3.i, k9.t {
    public final int f638a;
    public int f639b;
    public Object f640c;
    public Object d;

    public ng(char c10, int i10) {
        this.f638a = i10;
    }

    public static a8.ng h(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        throw new UnsupportedOperationException("Method not decompiled: a8.ng.h(android.content.res.Resources, int, android.content.res.Resources$Theme):a8.ng");
    }

    public void A(int i10, long j10, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.f640c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.f640c).cancel();
        }
        int[] iArr = new int[1];
        this.f639b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i10);
        this.f640c = ofInt;
        ofInt.addUpdateListener(new bh.b0(24, this, iArr));
        ((ValueAnimator) this.f640c).addListener(new bi.x4(this, i10, iArr, 2));
        ((ValueAnimator) this.f640c).setDuration(j10);
        ((ValueAnimator) this.f640c).setInterpolator(interpolator);
        ((ValueAnimator) this.f640c).start();
    }

    public List B(CharSequence charSequence) {
        charSequence.getClass();
        za.c cVar = (za.c) this.d;
        cVar.getClass();
        e9.s sVar = new e9.s(cVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (sVar.hasNext()) {
            arrayList.add((String) sVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void C(int i10, long j10, long j11) {
        u2.c0 c0Var = new u2.c0(1, i10, null, 3, null, e2.n0.h0(j10), e2.n0.h0(j11));
        u2.g0 g0Var = (u2.g0) this.f640c;
        g0Var.getClass();
        k(new qy(this, g0Var, c0Var, 12));
    }

    public void D(String str, l6.c cVar) {
        int i10 = this.f639b + 1;
        Object[] objArr = (Object[]) this.f640c;
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
                this.f640c = Arrays.copyOf(objArr, i12);
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        Object[] objArr2 = (Object[]) this.f640c;
        int i13 = this.f639b;
        int i14 = i13 + i13;
        objArr2[i14] = str;
        objArr2[i14 + 1] = cVar;
        this.f639b = i13 + 1;
    }

    public void E(String str, com.google.android.gms.common.api.internal.l lVar) {
        Map map = (Map) this.f640c;
        if (!map.containsKey(str)) {
            map.put(str, lVar);
            if (this.f639b > 0) {
                new com.google.android.gms.internal.cast.y(Looper.getMainLooper(), 4).post(new com.google.android.gms.common.api.internal.q1(this, lVar, str, 0));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(a1.g.p("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public byte[] F() {
        g0 g0Var;
        ka.d dVar;
        w7.j jVar;
        ka.d dVar2;
        y7.d0 d0Var;
        ka.d dVar3;
        switch (this.f638a) {
            case 0:
                sg sgVar = sg.f923c;
                m.r3 r3Var = (m.r3) this.f640c;
                ((ff) this.d).f461j = false;
                ff ffVar = (ff) this.d;
                ffVar.h = Boolean.FALSE;
                r3Var.f17844a = new gf(ffVar);
                try {
                    sg.b();
                    sb sbVar = new sb(r3Var);
                    h0 h0Var = new h0(0);
                    sgVar.a(h0Var);
                    HashMap hashMap = new HashMap((HashMap) h0Var.f511b);
                    HashMap hashMap2 = new HashMap((HashMap) h0Var.f512c);
                    f0 f0Var = (f0) h0Var.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        g0Var = new g0(byteArrayOutputStream, hashMap, hashMap2, f0Var);
                        dVar = (ka.d) hashMap.get(sb.class);
                    } catch (IOException unused) {
                    }
                    if (dVar != null) {
                        dVar.a(sbVar, g0Var);
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(sb.class)));
                } catch (UnsupportedEncodingException e) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                }
            case 25:
                w7.g9 g9Var = w7.g9.f50863c;
                ti.e eVar = (ti.e) this.f640c;
                ((ff) this.d).f461j = false;
                ff ffVar2 = (ff) this.d;
                ffVar2.h = Boolean.FALSE;
                eVar.f49184b = new w7.h8(ffVar2);
                try {
                    w7.g9.b();
                    w7.n6 n6Var = new w7.n6(eVar);
                    s4.d dVar4 = new s4.d(6);
                    g9Var.a(dVar4);
                    HashMap hashMap3 = new HashMap((HashMap) dVar4.f47720b);
                    HashMap hashMap4 = new HashMap((HashMap) dVar4.f47721c);
                    w7.i iVar = (w7.i) dVar4.d;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        jVar = new w7.j(byteArrayOutputStream2, hashMap3, hashMap4, iVar);
                        dVar2 = (ka.d) hashMap3.get(w7.n6.class);
                    } catch (IOException unused2) {
                    }
                    if (dVar2 != null) {
                        dVar2.a(n6Var, jVar);
                        return byteArrayOutputStream2.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(w7.n6.class)));
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
            default:
                y7.fa faVar = y7.fa.f52147c;
                aa.m0 m0Var = (aa.m0) this.f640c;
                ((ff) this.d).f461j = false;
                ff ffVar3 = (ff) this.d;
                ffVar3.h = Boolean.FALSE;
                m0Var.f1150a = new y7.g9(ffVar3);
                try {
                    y7.fa.b();
                    y7.n7 n7Var = new y7.n7(m0Var);
                    s4.d dVar5 = new s4.d(14);
                    faVar.a(dVar5);
                    HashMap hashMap5 = new HashMap((HashMap) dVar5.f47720b);
                    HashMap hashMap6 = new HashMap((HashMap) dVar5.f47721c);
                    y7.c0 c0Var = (y7.c0) dVar5.d;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        d0Var = new y7.d0(byteArrayOutputStream3, hashMap5, hashMap6, c0Var);
                        dVar3 = (ka.d) hashMap5.get(y7.n7.class);
                    } catch (IOException unused3) {
                    }
                    if (dVar3 != null) {
                        dVar3.a(n7Var, d0Var);
                        return byteArrayOutputStream3.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(y7.n7.class)));
                } catch (UnsupportedEncodingException e11) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
                }
        }
    }

    public void G(Bundle bundle) {
        Bundle bundle2;
        this.f639b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.f640c).entrySet()) {
            com.google.android.gms.common.api.internal.l lVar = (com.google.android.gms.common.api.internal.l) entry.getValue();
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
            for (Map.Entry entry : ((Map) this.f640c).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((com.google.android.gms.common.api.internal.l) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public void a(int i10, int i11) {
        boolean z10;
        int i12 = (i11 << 16) + i10;
        if (this.f639b != i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f639b = i12;
        for (int i13 = 0; i13 < ag.k.f1309y; i13++) {
            if (z10 || ((Bitmap[]) this.d)[i13] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i13];
                if (bitmap != null) {
                    Utilities.globalQueue.postRunnable(new a3.d(bitmap, 3));
                }
                ((Bitmap[]) this.d)[i13] = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            }
            ag.i0[] i0VarArr = (ag.i0[]) this.f640c;
            if (i0VarArr[i13] == null) {
                i0VarArr[i13] = new ag.i0(i11 * i10 * 2);
            }
        }
    }

    public void b() {
        m.d3 d3Var;
        ImageView imageView = (ImageView) this.f640c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            m.l1.a(drawable);
        }
        if (drawable != null && (d3Var = (m.d3) this.d) != null) {
            m.q.d(drawable, d3Var, imageView.getDrawableState());
        }
    }

    public f9.x1 c(boolean z10) {
        f9.k0 k0Var;
        f9.k0 k0Var2;
        if (z10 && (k0Var2 = (f9.k0) this.d) != null) {
            throw k0Var2.a();
        }
        f9.x1 f7 = f9.x1.f(this.f639b, (Object[]) this.f640c, this);
        if (z10 && (k0Var = (f9.k0) this.d) != null) {
            throw k0Var.a();
        }
        return f7;
    }

    public ua.b d() {
        if ("".isEmpty()) {
            return new ua.b((String) this.f640c, ((Long) this.d).longValue(), this.f639b);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public f9.l0 e() {
        return c(false);
    }

    @Override
    public c3.h f(c3.p r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: a8.ng.f(c3.p, long):c3.h");
    }

    public void g(int i10) {
        String str;
        int i11 = this.f639b;
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
        if (this.f639b <= 3) {
            String str2 = (String) this.f640c;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.d).concat(str));
        }
    }

    public void k(e2.j jVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            u2.j0 j0Var = (u2.j0) it.next();
            e2.n0.W(j0Var.f49323a, new sg.u(12, jVar, j0Var.f49324b));
        }
    }

    public void l(int i10, b2.x xVar, int i11, Object obj, long j10) {
        k(new zg1(17, this, new u2.c0(1, i10, xVar, i11, obj, e2.n0.h0(j10), -9223372036854775807L)));
    }

    public long m(c3.p pVar) {
        int d;
        c3.s sVar = (c3.s) this.d;
        c3.u uVar = (c3.u) this.f640c;
        while (pVar.i() < pVar.getLength() - 6) {
            int i10 = this.f639b;
            long i11 = pVar.i();
            e2.x xVar = new e2.x(17);
            int i12 = 0;
            boolean a2 = false;
            pVar.b(0, 2, xVar.f9732a);
            if (xVar.g(0, ByteOrder.BIG_ENDIAN) != i10) {
                pVar.p();
                pVar.j((int) (i11 - pVar.getPosition()));
            } else {
                byte[] bArr = xVar.f9732a;
                while (i12 < 15 && (d = pVar.d(2 + i12, 15 - i12, bArr)) != -1) {
                    i12 += d;
                }
                xVar.M(i12 + 2);
                pVar.p();
                pVar.j((int) (i11 - pVar.getPosition()));
                a2 = c3.b.a(xVar, uVar, i10, sVar);
            }
            if (a2) {
                break;
            }
            pVar.j(1);
        }
        if (pVar.i() >= pVar.getLength() - 6) {
            pVar.j((int) (pVar.getLength() - pVar.i()));
            return uVar.f6102j;
        }
        return sVar.f6092a;
    }

    public Object n(int i10) {
        SparseArray sparseArray = (SparseArray) this.f640c;
        if (this.f639b == -1) {
            this.f639b = 0;
        }
        while (true) {
            int i11 = this.f639b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f639b--;
        }
        while (this.f639b < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f639b + 1)) {
            this.f639b++;
        }
        return sparseArray.valueAt(this.f639b);
    }

    public boolean o() {
        ColorStateList colorStateList;
        if (((Shader) this.f640c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    @Override
    public void onSuccess(Object obj) {
        List list = (List) obj;
        m4.f0 f0Var = ((m4.p0) this.d).f18181g;
        Handler handler = f0Var.f18049l;
        m4.w wVar = (m4.w) this.f640c;
        e2.n0.W(handler, new k2.e0(f0Var, wVar, new ai.h1(this, this.f639b, list, wVar, 9)));
    }

    public void p(u2.u uVar, int i10, int i11, b2.x xVar, int i12, Object obj, long j10, long j11) {
        k(new u2.i0(this, uVar, new u2.c0(i10, i11, xVar, i12, obj, e2.n0.h0(j10), e2.n0.h0(j11)), 1));
    }

    public void q(u2.u uVar, int i10, int i11, b2.x xVar, int i12, Object obj, long j10, long j11) {
        k(new u2.i0(this, uVar, new u2.c0(i10, i11, xVar, i12, obj, e2.n0.h0(j10), e2.n0.h0(j11)), 0));
    }

    public void r(u2.u uVar, int i10, int i11, b2.x xVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        k(new nk(this, uVar, new u2.c0(i10, i11, xVar, i12, obj, e2.n0.h0(j10), e2.n0.h0(j11)), iOException, z10));
    }

    public void s(u2.u uVar, int i10, IOException iOException, boolean z10) {
        r(uVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public void t(AttributeSet attributeSet, int i10) {
        int resourceId;
        ImageView imageView = (ImageView) this.f640c;
        Context context = imageView.getContext();
        int[] iArr = f.a.f10028f;
        k6.c D = k6.c.D(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) D.f16407c;
        r0.i0.j(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) D.f16407c, i10);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = kc.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                m.l1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(D.v(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(m.l1.b(typedArray.getInt(3, -1), null));
            }
            D.E();
        } catch (Throwable th2) {
            D.E();
            throw th2;
        }
    }

    public void u(u2.u uVar, int i10, int i11, b2.x xVar, int i12, Object obj, long j10, long j11, int i13) {
        k(new ag.k0(this, uVar, new u2.c0(i10, i11, xVar, i12, obj, e2.n0.h0(j10), e2.n0.h0(j11)), i13, 10));
    }

    public ng w(Object obj, Object obj2) {
        int i10 = (this.f639b + 1) * 2;
        Object[] objArr = (Object[]) this.f640c;
        if (i10 > objArr.length) {
            this.f640c = Arrays.copyOf(objArr, f9.c0.b(objArr.length, i10));
        }
        f9.o.e(obj, obj2);
        Object[] objArr2 = (Object[]) this.f640c;
        int i11 = this.f639b;
        int i12 = i11 * 2;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.f639b = i11 + 1;
        return this;
    }

    public ng x(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.f639b) * 2;
            Object[] objArr = (Object[]) this.f640c;
            if (size > objArr.length) {
                this.f640c = Arrays.copyOf(objArr, f9.c0.b(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            w(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public void y(int i10) {
        A(i10, 200L, ds.f27586f);
    }

    @Override
    public void z() {
        switch (this.f638a) {
            case 9:
                return;
            default:
                e2.x xVar = (e2.x) this.d;
                byte[] bArr = e2.n0.f9693b;
                xVar.getClass();
                xVar.L(bArr.length, bArr);
                return;
        }
    }

    public ng(int i10, int i11) {
        this.f638a = i11;
        switch (i11) {
            case 7:
                this.f640c = new Object[i10 * 2];
                this.f639b = 0;
                return;
            default:
                this.f639b = i10;
                return;
        }
    }

    public ng(aa.m0 m0Var, int i10) {
        this.f638a = 26;
        this.d = new Object();
        this.f640c = m0Var;
        y7.fa.b();
        this.f639b = i10;
    }

    public ng(String str, String[] strArr) {
        String sb2;
        this.f638a = 19;
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
        this.f640c = str;
        int i10 = 2;
        o6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i10 <= 7 && !Log.isLoggable((String) this.f640c, i10)) {
            i10++;
        }
        this.f639b = i10;
    }

    public ng(m.r3 r3Var, int i10) {
        this.f638a = 0;
        this.d = new Object();
        this.f640c = r3Var;
        sg.b();
        this.f639b = i10;
    }

    private final void v() {
    }

    public ng(ti.e eVar, int i10) {
        this.f638a = 25;
        this.d = new Object();
        this.f640c = eVar;
        w7.g9.b();
        this.f639b = i10;
    }

    @Override
    public void i(Throwable th2) {
    }

    public ng(mm0 mm0Var) {
        this.f638a = 18;
        this.d = mm0Var;
    }

    public ng(ByteBuffer byteBuffer, int i10, RectF rectF) {
        this.f638a = 20;
        this.f640c = rectF;
        this.f639b = i10;
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public ng(ImageView imageView) {
        this.f638a = 14;
        this.f639b = 0;
        this.f640c = imageView;
    }

    public ng(s0.b bVar) {
        this.f638a = 22;
        this.f640c = new SparseArray();
        this.d = bVar;
        this.f639b = -1;
    }

    public ng(Shader shader, ColorStateList colorStateList, int i10) {
        this.f638a = 8;
        this.f640c = shader;
        this.d = colorStateList;
        this.f639b = i10;
    }

    public ng(String str) {
        this.f638a = 2;
        this.f640c = str;
        this.d = null;
        this.f639b = 0;
    }

    public ng(c3.u uVar, int i10) {
        this.f638a = 9;
        this.f640c = uVar;
        this.f639b = i10;
        this.d = new Object();
    }

    public ng(int i10, e2.k0 k0Var) {
        this.f638a = 12;
        this.f639b = i10;
        this.f640c = k0Var;
        this.d = new e2.x();
    }

    public ng(byte[] bArr) {
        this.f638a = 2;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.f640c = null;
        this.f639b = 1;
    }

    public ng(g2.g gVar) {
        this.f638a = 13;
        ?? obj = new Object();
        obj.f7972c = new qb.a(28);
        obj.f7970a = 3;
        this.d = obj;
        this.f640c = gVar;
        this.f639b = 1;
    }

    public ng(za.c cVar) {
        this.f638a = 6;
        e9.b bVar = e9.b.f9836f;
        this.d = cVar;
        this.f640c = bVar;
        this.f639b = Integer.MAX_VALUE;
    }

    public ng(CopyOnWriteArrayList copyOnWriteArrayList, int i10, u2.g0 g0Var) {
        this.f638a = 21;
        this.d = copyOnWriteArrayList;
        this.f639b = i10;
        this.f640c = g0Var;
    }

    public ng(int i10, byte b10) {
        this.f638a = i10;
        switch (i10) {
            case 3:
                this.f640c = DesugarCollections.synchronizedMap(new a0.l(0));
                this.f639b = 0;
                return;
            case 16:
                this.f640c = new ih.a();
                return;
            case 23:
                this.f640c = new Object[8];
                this.f639b = 0;
                return;
            default:
                int i11 = ag.k.f1309y;
                this.f640c = new ag.i0[i11];
                this.d = new Bitmap[i11];
                return;
        }
    }

    public ng(b2.x xVar, int i10, String str) {
        this.f638a = 11;
        this.f640c = xVar;
        this.f639b = i10;
        this.d = str;
    }

    public ng(m4.p0 p0Var, m4.w wVar, int i10) {
        this.f638a = 15;
        this.d = p0Var;
        this.f640c = wVar;
        this.f639b = i10;
    }
}
