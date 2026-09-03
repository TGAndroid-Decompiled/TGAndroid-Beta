package b4;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import com.google.android.gms.common.api.internal.s1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j3.n0;
import j3.n1;
import j7.g8;
import j7.h8;
import j7.h9;
import j7.n6;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
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
import k7.v6;
import l7.j0;
import l7.o9;
import l7.oa;
import l7.v7;
import l7.w0;
import m.r3;
import mh.k3;
import mh.p6;
import n7.ag;
import n7.jb;
import n7.xe;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sl0;
public final class e0 implements r3.e {
    public final int f1473a;
    public int f1474b;
    public Object f1475c;
    public Object d;

    public e0(char c3, int i10) {
        this.f1473a = i10;
    }

    public static b4.e0 f(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        throw new UnsupportedOperationException("Method not decompiled: b4.e0.f(android.content.res.Resources, int, android.content.res.Resources$Theme):b4.e0");
    }

    public List A(CharSequence charSequence) {
        charSequence.getClass();
        org.telegram.ui.web.e0 e0Var = (org.telegram.ui.web.e0) this.d;
        e0Var.getClass();
        r8.h hVar = new r8.h(e0Var, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (hVar.hasNext()) {
            arrayList.add((String) hVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void B(o4.r rVar) {
        o4.v vVar = (o4.v) this.f1475c;
        vVar.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            o4.y yVar = (o4.y) it.next();
            h5.d0.K(yVar.f16592a, new androidx.car.app.utils.c(this, yVar.f16593b, vVar, rVar, 12));
        }
    }

    public void C(String str, y5.c cVar) {
        int i10 = this.f1474b + 1;
        Object[] objArr = (Object[]) this.f1475c;
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
                this.f1475c = Arrays.copyOf(objArr, i12);
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        Object[] objArr2 = (Object[]) this.f1475c;
        int i13 = this.f1474b;
        int i14 = i13 + i13;
        objArr2[i14] = str;
        objArr2[i14 + 1] = cVar;
        this.f1474b = i13 + 1;
    }

    public void D(String str, com.google.android.gms.common.api.internal.l lVar) {
        Map map = (Map) this.f1475c;
        if (!map.containsKey(str)) {
            map.put(str, lVar);
            if (this.f1474b > 0) {
                new a7.e(Looper.getMainLooper(), 0).post(new s1(this, lVar, str, 0));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.o("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public byte[] E() {
        j7.k kVar;
        u9.d dVar;
        j0 j0Var;
        u9.d dVar2;
        n7.y yVar;
        u9.d dVar3;
        switch (this.f1473a) {
            case 10:
                h9 h9Var = h9.f9643c;
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f1475c;
                ((g8) this.d).h = false;
                g8 g8Var = (g8) this.d;
                g8Var.f9619f = Boolean.FALSE;
                sVar.f4080a = new h8(g8Var);
                try {
                    h9.b();
                    n6 n6Var = new n6(sVar);
                    androidx.biometric.e eVar = new androidx.biometric.e(20);
                    h9Var.a(eVar);
                    HashMap hashMap = new HashMap((HashMap) eVar.f527b);
                    HashMap hashMap2 = new HashMap((HashMap) eVar.f528c);
                    j7.j jVar = (j7.j) eVar.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        kVar = new j7.k(byteArrayOutputStream, hashMap, hashMap2, jVar);
                        dVar = (u9.d) hashMap.get(n6.class);
                    } catch (IOException unused) {
                    }
                    if (dVar != null) {
                        dVar.a(n6Var, kVar);
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(n6.class)));
                } catch (UnsupportedEncodingException e6) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e6);
                }
            case 11:
            default:
                ag agVar = ag.f15268c;
                r3 r3Var = (r3) this.f1475c;
                ((g8) this.d).h = false;
                g8 g8Var2 = (g8) this.d;
                g8Var2.f9619f = Boolean.FALSE;
                r3Var.f13329a = new xe(g8Var2);
                try {
                    ag.b();
                    jb jbVar = new jb(r3Var);
                    w0 w0Var = new w0(7);
                    agVar.a(w0Var);
                    HashMap hashMap3 = new HashMap((HashMap) w0Var.f12080b);
                    HashMap hashMap4 = new HashMap((HashMap) w0Var.f12081c);
                    n7.x xVar = (n7.x) w0Var.d;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        yVar = new n7.y(byteArrayOutputStream2, hashMap3, hashMap4, xVar);
                        dVar3 = (u9.d) hashMap3.get(jb.class);
                    } catch (IOException unused2) {
                    }
                    if (dVar3 != null) {
                        dVar3.a(jbVar, yVar);
                        return byteArrayOutputStream2.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(jb.class)));
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
            case 12:
                oa oaVar = oa.f11983c;
                a9.a aVar = (a9.a) this.f1475c;
                ((g8) this.d).h = false;
                g8 g8Var3 = (g8) this.d;
                g8Var3.f9619f = Boolean.FALSE;
                aVar.f155a = new o9(g8Var3);
                try {
                    oa.b();
                    v7 v7Var = new v7(aVar);
                    androidx.biometric.e eVar2 = new androidx.biometric.e(29);
                    oaVar.a(eVar2);
                    HashMap hashMap5 = new HashMap((HashMap) eVar2.f527b);
                    HashMap hashMap6 = new HashMap((HashMap) eVar2.f528c);
                    l7.i0 i0Var = (l7.i0) eVar2.d;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        j0Var = new j0(byteArrayOutputStream3, hashMap5, hashMap6, i0Var);
                        dVar2 = (u9.d) hashMap5.get(v7.class);
                    } catch (IOException unused3) {
                    }
                    if (dVar2 != null) {
                        dVar2.a(v7Var, j0Var);
                        return byteArrayOutputStream3.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(v7.class)));
                } catch (UnsupportedEncodingException e11) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
                }
        }
    }

    public void F(Bundle bundle) {
        Bundle bundle2;
        this.f1474b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.f1475c).entrySet()) {
            com.google.android.gms.common.api.internal.l lVar = (com.google.android.gms.common.api.internal.l) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lVar.onCreate(bundle2);
        }
    }

    public void G(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.f1475c).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((com.google.android.gms.common.api.internal.l) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public void a(int i10, int i11) {
        boolean z4;
        int i12 = (i11 << 16) + i10;
        if (this.f1474b != i12) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f1474b = i12;
        for (int i13 = 0; i13 < lf.g.f12428y; i13++) {
            if (z4 || ((Bitmap[]) this.d)[i13] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i13];
                if (bitmap != null) {
                    Utilities.globalQueue.postRunnable(new eh.m(bitmap, 22));
                }
                ((Bitmap[]) this.d)[i13] = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            }
            lf.c0[] c0VarArr = (lf.c0[]) this.f1475c;
            if (c0VarArr[i13] == null) {
                c0VarArr[i13] = new lf.c0(i11 * i10 * 2);
            }
        }
    }

    @Override
    public r3.d b(r3.l r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: b4.e0.b(r3.l, long):r3.d");
    }

    public ea.b c() {
        if ("".isEmpty()) {
            return new ea.b((String) this.f1475c, ((Long) this.d).longValue(), this.f1474b);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public s8.n0 d() {
        throw new UnsupportedOperationException("Method not decompiled: b4.e0.d():s8.n0");
    }

    public void e(int i10) {
        String str;
        int i11 = this.f1474b;
        if (i10 == i11) {
            return;
        }
        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        String str2 = "String";
        if (i11 == 0) {
            str = "String";
        } else if (i11 == 1) {
            str = "ArrayBuffer";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" expected, but got ");
        if (i10 != 0) {
            if (i10 == 1) {
                str2 = "ArrayBuffer";
            } else {
                str2 = "Unknown";
            }
        }
        sb.append(str2);
        throw new IllegalStateException(sb.toString());
    }

    public void g(String str, Object... objArr) {
        if (this.f1474b <= 3) {
            String str2 = (String) this.f1475c;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.d).concat(str));
        }
    }

    public void h(int i10, n0 n0Var, int i11, Object obj, long j10) {
        i(new o4.r(1, i10, n0Var, i11, obj, h5.d0.S(j10), -9223372036854775807L));
    }

    public void i(o4.r rVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            o4.y yVar = (o4.y) it.next();
            h5.d0.K(yVar.f16592a, new p6(this, yVar.f16593b, rVar, 3));
        }
    }

    public long j(r3.l lVar) {
        int e6;
        org.telegram.ui.Components.jb jbVar = (org.telegram.ui.Components.jb) this.d;
        r3.o oVar = (r3.o) this.f1475c;
        while (lVar.g() < lVar.getLength() - 6) {
            int i10 = this.f1474b;
            long g10 = lVar.g();
            byte[] bArr = new byte[2];
            int i11 = 0;
            boolean a2 = false;
            lVar.b(0, 2, bArr);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                lVar.r();
                lVar.i((int) (g10 - lVar.getPosition()));
            } else {
                h5.w wVar = new h5.w(16);
                System.arraycopy(bArr, 0, wVar.f7308a, 0, 2);
                byte[] bArr2 = wVar.f7308a;
                while (i11 < 14 && (e6 = lVar.e(2 + i11, 14 - i11, bArr2)) != -1) {
                    i11 += e6;
                }
                wVar.E(i11);
                lVar.r();
                lVar.i((int) (g10 - lVar.getPosition()));
                a2 = v6.a(wVar, oVar, i10, jbVar);
            }
            if (a2) {
                break;
            }
            lVar.i(1);
        }
        if (lVar.g() >= lVar.getLength() - 6) {
            lVar.i((int) (lVar.getLength() - lVar.g()));
            return oVar.f46604j;
        }
        return jbVar.f28078a;
    }

    public Object k(int i10) {
        SparseArray sparseArray = (SparseArray) this.f1475c;
        if (this.f1474b == -1) {
            this.f1474b = 0;
        }
        while (true) {
            int i11 = this.f1474b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f1474b--;
        }
        while (this.f1474b < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f1474b + 1)) {
            this.f1474b++;
        }
        return sparseArray.valueAt(this.f1474b);
    }

    public boolean l() {
        ColorStateList colorStateList;
        if (((Shader) this.f1475c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void m(o4.j jVar, int i10, int i11, n0 n0Var, int i12, Object obj, long j10, long j11) {
        o(jVar, new o4.r(i10, i11, n0Var, i12, obj, h5.d0.S(j10), h5.d0.S(j11)));
    }

    @Override
    public void n() {
        switch (this.f1473a) {
            case 0:
                h5.w wVar = (h5.w) this.d;
                byte[] bArr = h5.d0.f7241f;
                wVar.getClass();
                wVar.D(bArr.length, bArr);
                return;
            default:
                return;
        }
    }

    public void o(o4.j jVar, o4.r rVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            o4.y yVar = (o4.y) it.next();
            h5.d0.K(yVar.f16592a, new o4.x(this, yVar.f16593b, jVar, rVar, 1));
        }
    }

    public void p(o4.j jVar, int i10, int i11, n0 n0Var, int i12, Object obj, long j10, long j11) {
        q(jVar, new o4.r(i10, i11, n0Var, i12, obj, h5.d0.S(j10), h5.d0.S(j11)));
    }

    public void q(o4.j jVar, o4.r rVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            o4.y yVar = (o4.y) it.next();
            h5.d0.K(yVar.f16592a, new o4.x(this, yVar.f16593b, jVar, rVar, 0));
        }
    }

    public void r(o4.j jVar, int i10, int i11, n0 n0Var, int i12, Object obj, long j10, long j11, IOException iOException, boolean z4) {
        t(jVar, new o4.r(i10, i11, n0Var, i12, obj, h5.d0.S(j10), h5.d0.S(j11)), iOException, z4);
    }

    public void s(o4.j jVar, int i10, IOException iOException, boolean z4) {
        r(jVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z4);
    }

    public void t(o4.j jVar, o4.r rVar, IOException iOException, boolean z4) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            o4.y yVar = (o4.y) it.next();
            h5.d0.K(yVar.f16592a, new n1(this, yVar.f16593b, jVar, rVar, iOException, z4, 1));
        }
    }

    public void u(o4.j jVar, int i10, int i11, n0 n0Var, int i12, Object obj, long j10, long j11) {
        v(jVar, new o4.r(i10, i11, n0Var, i12, obj, h5.d0.S(j10), h5.d0.S(j11)));
    }

    public void v(o4.j jVar, o4.r rVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            o4.y yVar = (o4.y) it.next();
            h5.d0.K(yVar.f16592a, new o4.x(this, yVar.f16593b, jVar, rVar, 2));
        }
    }

    public void x(Object obj, Object obj2) {
        int i10 = (this.f1474b + 1) * 2;
        Object[] objArr = (Object[]) this.f1475c;
        if (i10 > objArr.length) {
            this.f1475c = Arrays.copyOf(objArr, com.google.android.gms.common.api.internal.w.g(objArr.length, i10));
        }
        if (obj != null) {
            if (obj2 != null) {
                Object[] objArr2 = (Object[]) this.f1475c;
                int i11 = this.f1474b;
                int i12 = i11 * 2;
                objArr2[i12] = obj;
                objArr2[i12 + 1] = obj2;
                this.f1474b = i11 + 1;
                return;
            }
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 26);
            sb.append("null value in entry: ");
            sb.append(valueOf);
            sb.append("=null");
            throw new NullPointerException(sb.toString());
        }
        String valueOf2 = String.valueOf(obj2);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 24);
        sb2.append("null key in entry: null=");
        sb2.append(valueOf2);
        throw new NullPointerException(sb2.toString());
    }

    public void y(int i10) {
        z(i10, 200L, pr.f30168f);
    }

    public void z(int i10, long j10, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.f1475c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.f1475c).cancel();
        }
        int[] iArr = new int[1];
        this.f1474b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i10);
        this.f1475c = ofInt;
        ofInt.addUpdateListener(new bg.a(23, this, iArr));
        ((ValueAnimator) this.f1475c).addListener(new k3(this, i10, iArr, 2));
        ((ValueAnimator) this.f1475c).setDuration(j10);
        ((ValueAnimator) this.f1475c).setInterpolator(interpolator);
        ((ValueAnimator) this.f1475c).start();
    }

    public e0(int i10, int i11) {
        this.f1473a = i11;
        switch (i11) {
            case 22:
                this.f1475c = new Object[i10 * 2];
                this.f1474b = 0;
                return;
            default:
                this.f1474b = i10;
                return;
        }
    }

    public e0(Object obj, int i10, Serializable serializable, int i11) {
        this.f1473a = i11;
        this.f1475c = obj;
        this.f1474b = i10;
        this.d = serializable;
    }

    public e0(int i10, byte b10) {
        this.f1473a = i10;
        switch (i10) {
            case 8:
                this.f1475c = new Object[8];
                this.f1474b = 0;
                return;
            case 13:
                int i11 = lf.g.f12428y;
                this.f1475c = new lf.c0[i11];
                this.d = new Bitmap[i11];
                return;
            case 18:
                this.f1475c = new ug.a();
                return;
            default:
                this.f1475c = DesugarCollections.synchronizedMap(new a0.k(0));
                this.f1474b = 0;
                return;
        }
    }

    public e0(a9.a aVar, int i10) {
        this.f1473a = 12;
        this.d = new Object();
        this.f1475c = aVar;
        oa.b();
        this.f1474b = i10;
    }

    public e0(com.google.firebase.messaging.s sVar, int i10) {
        this.f1473a = 10;
        this.d = new Object();
        this.f1475c = sVar;
        h9.b();
        this.f1474b = i10;
    }

    public e0(String str, String[] strArr) {
        String sb;
        this.f1473a = 5;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.d = sb;
        this.f1475c = str;
        int i10 = 2;
        b6.m.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i10 <= 7 && !Log.isLoggable((String) this.f1475c, i10)) {
            i10++;
        }
        this.f1474b = i10;
    }

    private final void w() {
    }

    public e0(r3 r3Var, int i10) {
        this.f1473a = 15;
        this.d = new Object();
        this.f1475c = r3Var;
        ag.b();
        this.f1474b = i10;
    }

    public e0(sl0 sl0Var) {
        this.f1473a = 20;
        this.d = sl0Var;
    }

    public e0(ByteBuffer byteBuffer, int i10, RectF rectF) {
        this.f1473a = 4;
        this.f1475c = rectF;
        this.f1474b = i10;
        try {
            this.d = File.createTempFile("paint", ".bin", ApplicationLoader.applicationContext.getCacheDir());
        } catch (Exception e6) {
            FileLog.e(e6);
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

    public e0(ag.d dVar) {
        this.f1473a = 17;
        this.f1475c = new SparseArray();
        this.d = dVar;
        this.f1474b = -1;
    }

    public e0(Shader shader, ColorStateList colorStateList, int i10) {
        this.f1473a = 7;
        this.f1475c = shader;
        this.d = colorStateList;
        this.f1474b = i10;
    }

    public e0(String str) {
        this.f1473a = 14;
        this.f1475c = str;
        this.d = null;
        this.f1474b = 0;
    }

    public e0(r3.o oVar, int i10) {
        this.f1473a = 24;
        this.f1475c = oVar;
        this.f1474b = i10;
        this.d = new Object();
    }

    public e0(int i10, h5.c0 c0Var) {
        this.f1473a = 0;
        this.f1474b = i10;
        this.f1475c = c0Var;
        this.d = new h5.w();
    }

    public e0(byte[] bArr) {
        this.f1473a = 14;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.f1475c = null;
        this.f1474b = 1;
    }

    public e0(org.telegram.ui.web.e0 e0Var) {
        this.f1473a = 21;
        this.d = e0Var;
        this.f1475c = r8.c.f46766a;
        this.f1474b = Integer.MAX_VALUE;
    }

    public e0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, o4.v vVar) {
        this.f1473a = 16;
        this.d = copyOnWriteArrayList;
        this.f1474b = i10;
        this.f1475c = vVar;
    }
}
