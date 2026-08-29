package ag;

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
import bg.b3;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import h7.d8;
import h7.e8;
import h7.f9;
import h7.l6;
import i7.s8;
import j$.util.DesugarCollections;
import j7.o9;
import j7.oa;
import j7.v7;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Deflater;
import jh.l3;
import l7.ib;
import l7.we;
import l7.zf;
import m.s3;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
public final class j2 implements o3.e {
    public final int f557a;
    public int f558b;
    public Object f559c;
    public Object d;

    public j2(char c3, int i10) {
        this.f557a = i10;
    }

    public static ag.j2 e(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        throw new UnsupportedOperationException("Method not decompiled: ag.j2.e(android.content.res.Resources, int, android.content.res.Resources$Theme):ag.j2");
    }

    public void a(int i10, int i11) {
        boolean z10;
        int i12 = (i11 << 16) + i10;
        if (this.f558b != i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f558b = i12;
        for (int i13 = 0; i13 < jf.g.f11592y; i13++) {
            if (z10 || ((Bitmap[]) this.d)[i13] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i13];
                if (bitmap != null) {
                    Utilities.globalQueue.postRunnable(new cg.m2(bitmap, 27));
                }
                ((Bitmap[]) this.d)[i13] = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            }
            jf.c0[] c0VarArr = (jf.c0[]) this.f559c;
            if (c0VarArr[i13] == null) {
                c0VarArr[i13] = new jf.c0(i11 * i10 * 2);
            }
        }
    }

    public ca.b b() {
        if ("".isEmpty()) {
            return new ca.b((String) this.f559c, ((Long) this.d).longValue(), this.f558b);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public q8.q0 c() {
        throw new UnsupportedOperationException("Method not decompiled: ag.j2.c():q8.q0");
    }

    @Override
    public o3.d d(o3.l lVar, long j10) {
        long j11;
        switch (this.f557a) {
            case 22:
                long position = lVar.getPosition();
                long h = h(lVar);
                long h10 = lVar.h();
                lVar.i(Math.max(6, ((FlacStreamMetadata) this.f559c).minFrameSize));
                long h11 = h(lVar);
                long h12 = lVar.h();
                if (h <= j10 && h11 > j10) {
                    return new o3.d(0, -9223372036854775807L, h10);
                }
                if (h11 <= j10) {
                    return new o3.d(-2, h11, h12);
                }
                return new o3.d(-1, h, position);
            default:
                long position2 = lVar.getPosition();
                int min = (int) Math.min(112800, lVar.getLength() - position2);
                f5.w wVar = (f5.w) this.d;
                wVar.z(min);
                lVar.a(0, min, wVar.f6640a);
                int i10 = wVar.f6642c;
                long j12 = -1;
                long j13 = -1;
                long j14 = -9223372036854775807L;
                while (true) {
                    if (wVar.a() >= 188) {
                        byte[] bArr = wVar.f6640a;
                        int i11 = wVar.f6641b;
                        while (true) {
                            if (i11 < i10) {
                                j11 = -9223372036854775807L;
                                if (bArr[i11] != 71) {
                                    i11++;
                                }
                            } else {
                                j11 = -9223372036854775807L;
                            }
                        }
                        int i12 = i11 + 188;
                        if (i12 <= i10) {
                            long a2 = s8.a(wVar, i11, this.f558b);
                            if (a2 != j11) {
                                long b10 = ((f5.c0) this.f559c).b(a2);
                                if (b10 > j10) {
                                    if (j14 == j11) {
                                        return new o3.d(-1, b10, position2);
                                    }
                                    return new o3.d(0, -9223372036854775807L, position2 + j13);
                                }
                                j14 = b10;
                                if (100000 + j14 > j10) {
                                    return new o3.d(0, -9223372036854775807L, position2 + i11);
                                }
                                j13 = i11;
                            }
                            wVar.C(i12);
                            j12 = i12;
                        }
                    } else {
                        j11 = -9223372036854775807L;
                    }
                }
                if (j14 != j11) {
                    return new o3.d(-2, j14, position2 + j12);
                }
                return o3.d.d;
        }
    }

    @Override
    public void f() {
        switch (this.f557a) {
            case 22:
                return;
            default:
                f5.w wVar = (f5.w) this.d;
                byte[] bArr = f5.d0.f6583f;
                wVar.getClass();
                wVar.A(bArr.length, bArr);
                return;
        }
    }

    public void g(String str, Object... objArr) {
        if (this.f558b <= 3) {
            String str2 = (String) this.f559c;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.d).concat(str));
        }
    }

    public long h(o3.l lVar) {
        int d;
        o3.n nVar = (o3.n) this.d;
        FlacStreamMetadata flacStreamMetadata = (FlacStreamMetadata) this.f559c;
        while (lVar.h() < lVar.getLength() - 6) {
            int i10 = this.f558b;
            long h = lVar.h();
            byte[] bArr = new byte[2];
            int i11 = 0;
            boolean a2 = false;
            lVar.a(0, 2, bArr);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                lVar.s();
                lVar.i((int) (h - lVar.getPosition()));
            } else {
                f5.w wVar = new f5.w(16);
                System.arraycopy(bArr, 0, wVar.f6640a, 0, 2);
                byte[] bArr2 = wVar.f6640a;
                while (i11 < 14 && (d = lVar.d(2 + i11, 14 - i11, bArr2)) != -1) {
                    i11 += d;
                }
                wVar.B(i11);
                lVar.s();
                lVar.i((int) (h - lVar.getPosition()));
                a2 = i7.i0.a(wVar, flacStreamMetadata, i10, nVar);
            }
            if (a2) {
                break;
            }
            lVar.i(1);
        }
        if (lVar.h() >= lVar.getLength() - 6) {
            lVar.i((int) (lVar.getLength() - lVar.h()));
            return flacStreamMetadata.totalSamples;
        }
        return nVar.f19103a;
    }

    public Object i(int i10) {
        SparseArray sparseArray = (SparseArray) this.f559c;
        if (this.f558b == -1) {
            this.f558b = 0;
        }
        while (true) {
            int i11 = this.f558b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f558b--;
        }
        while (this.f558b < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f558b + 1)) {
            this.f558b++;
        }
        return sparseArray.valueAt(this.f558b);
    }

    public boolean j() {
        ColorStateList colorStateList;
        if (((Shader) this.f559c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void l(Object obj, Object obj2) {
        int i10 = (this.f558b + 1) * 2;
        Object[] objArr = (Object[]) this.f559c;
        if (i10 > objArr.length) {
            this.f559c = Arrays.copyOf(objArr, q8.w.d(objArr.length, i10));
        }
        if (obj != null) {
            if (obj2 != null) {
                Object[] objArr2 = (Object[]) this.f559c;
                int i11 = this.f558b;
                int i12 = i11 * 2;
                objArr2[i12] = obj;
                objArr2[i12 + 1] = obj2;
                this.f558b = i11 + 1;
                return;
            }
            String valueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 26);
            sb2.append("null value in entry: ");
            sb2.append(valueOf);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
        String valueOf2 = String.valueOf(obj2);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 24);
        sb3.append("null key in entry: null=");
        sb3.append(valueOf2);
        throw new NullPointerException(sb3.toString());
    }

    public void m(int i10) {
        n(i10, 200L, jr.f29800f);
    }

    public void n(int i10, long j10, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.f559c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.f559c).cancel();
        }
        int[] iArr = new int[1];
        this.f558b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i10);
        this.f559c = ofInt;
        ofInt.addUpdateListener(new b3(22, this, iArr));
        ((ValueAnimator) this.f559c).addListener(new l3(this, i10, iArr, 2));
        ((ValueAnimator) this.f559c).setDuration(j10);
        ((ValueAnimator) this.f559c).setInterpolator(interpolator);
        ((ValueAnimator) this.f559c).start();
    }

    public List o(CharSequence charSequence) {
        charSequence.getClass();
        org.telegram.ui.Components.n nVar = (org.telegram.ui.Components.n) this.d;
        nVar.getClass();
        p8.h hVar = new p8.h(nVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (hVar.hasNext()) {
            arrayList.add((String) hVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void p(String str, w5.c cVar) {
        int i10 = this.f558b + 1;
        Object[] objArr = (Object[]) this.f559c;
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
                this.f559c = Arrays.copyOf(objArr, i12);
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        Object[] objArr2 = (Object[]) this.f559c;
        int i13 = this.f558b;
        int i14 = i13 + i13;
        objArr2[i14] = str;
        objArr2[i14 + 1] = cVar;
        this.f558b = i13 + 1;
    }

    public void q(String str, com.google.android.gms.common.api.internal.l lVar) {
        Map map = (Map) this.f559c;
        if (!map.containsKey(str)) {
            map.put(str, lVar);
            if (this.f558b > 0) {
                new c2.v0(Looper.getMainLooper(), 6).post(new com.google.android.gms.common.api.internal.q1(this, lVar, str, 0));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(a4.w.n("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public byte[] r() {
        h7.k kVar;
        s9.d dVar;
        j7.j0 j0Var;
        s9.d dVar2;
        l7.y yVar;
        s9.d dVar3;
        switch (this.f557a) {
            case 9:
                f9 f9Var = f9.f7623c;
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f559c;
                ((d8) this.d).h = false;
                d8 d8Var = (d8) this.d;
                d8Var.f7592f = Boolean.FALSE;
                sVar.f5185b = new e8(d8Var);
                try {
                    f9.b();
                    l6 l6Var = new l6(sVar);
                    androidx.biometric.e eVar = new androidx.biometric.e(13);
                    f9Var.a(eVar);
                    HashMap hashMap = new HashMap((HashMap) eVar.f1030b);
                    HashMap hashMap2 = new HashMap((HashMap) eVar.f1031c);
                    h7.j jVar = (h7.j) eVar.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        kVar = new h7.k(byteArrayOutputStream, hashMap, hashMap2, jVar);
                        dVar = (s9.d) hashMap.get(l6.class);
                    } catch (IOException unused) {
                    }
                    if (dVar != null) {
                        dVar.a(l6Var, kVar);
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(l6.class)));
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
            case 10:
                oa oaVar = oa.f11142c;
                bg.c2 c2Var = (bg.c2) this.f559c;
                ((d8) this.d).h = false;
                d8 d8Var2 = (d8) this.d;
                d8Var2.f7592f = Boolean.FALSE;
                c2Var.f2118a = new o9(d8Var2);
                try {
                    oa.b();
                    v7 v7Var = new v7(c2Var);
                    androidx.biometric.e eVar2 = new androidx.biometric.e(21);
                    oaVar.a(eVar2);
                    HashMap hashMap3 = new HashMap((HashMap) eVar2.f1030b);
                    HashMap hashMap4 = new HashMap((HashMap) eVar2.f1031c);
                    j7.i0 i0Var = (j7.i0) eVar2.d;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        j0Var = new j7.j0(byteArrayOutputStream2, hashMap3, hashMap4, i0Var);
                        dVar2 = (s9.d) hashMap3.get(v7.class);
                    } catch (IOException unused2) {
                    }
                    if (dVar2 != null) {
                        dVar2.a(v7Var, j0Var);
                        return byteArrayOutputStream2.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(v7.class)));
                } catch (UnsupportedEncodingException e11) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
                }
            default:
                zf zfVar = zf.f15092c;
                s3 s3Var = (s3) this.f559c;
                ((d8) this.d).h = false;
                d8 d8Var3 = (d8) this.d;
                d8Var3.f7592f = Boolean.FALSE;
                s3Var.f16688a = new we(d8Var3);
                try {
                    zf.b();
                    ib ibVar = new ib(s3Var);
                    l3.g0 g0Var = new l3.g0(2);
                    zfVar.a(g0Var);
                    HashMap hashMap5 = new HashMap((HashMap) g0Var.f14096b);
                    HashMap hashMap6 = new HashMap((HashMap) g0Var.f14097c);
                    l7.x xVar = (l7.x) g0Var.d;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        yVar = new l7.y(byteArrayOutputStream3, hashMap5, hashMap6, xVar);
                        dVar3 = (s9.d) hashMap5.get(ib.class);
                    } catch (IOException unused3) {
                    }
                    if (dVar3 != null) {
                        dVar3.a(ibVar, yVar);
                        return byteArrayOutputStream3.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(ib.class)));
                } catch (UnsupportedEncodingException e12) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e12);
                }
        }
    }

    public void s(Bundle bundle) {
        Bundle bundle2;
        this.f558b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.f559c).entrySet()) {
            com.google.android.gms.common.api.internal.l lVar = (com.google.android.gms.common.api.internal.l) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lVar.onCreate(bundle2);
        }
    }

    public void t(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.f559c).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((com.google.android.gms.common.api.internal.l) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public j2(int i10, int i11) {
        this.f557a = i11;
        switch (i11) {
            case 21:
                this.f559c = new Object[i10 * 2];
                this.f558b = 0;
                return;
            default:
                this.f558b = i10;
                return;
        }
    }

    public j2(int i10, byte b10) {
        this.f557a = i10;
        switch (i10) {
            case 6:
                this.f559c = new Object[8];
                this.f558b = 0;
                return;
            case 11:
                int i11 = jf.g.f11592y;
                this.f559c = new jf.c0[i11];
                this.d = new Bitmap[i11];
                return;
            case 16:
                this.f559c = new rg.a();
                return;
            default:
                this.f559c = DesugarCollections.synchronizedMap(new a0.k(0));
                this.f558b = 0;
                return;
        }
    }

    public j2(bg.c2 c2Var, int i10) {
        this.f557a = 10;
        this.d = new Object();
        this.f559c = c2Var;
        oa.b();
        this.f558b = i10;
    }

    public j2(com.google.firebase.messaging.s sVar, int i10) {
        this.f557a = 9;
        this.d = new Object();
        this.f559c = sVar;
        f9.b();
        this.f558b = i10;
    }

    public j2(String str, String[] strArr) {
        String sb2;
        this.f557a = 1;
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
        this.f559c = str;
        int i10 = 2;
        z5.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i10 <= 7 && !Log.isLoggable((String) this.f559c, i10)) {
            i10++;
        }
        this.f558b = i10;
    }

    private final void k() {
    }

    public j2(s3 s3Var, int i10) {
        this.f557a = 14;
        this.d = new Object();
        this.f559c = s3Var;
        zf.b();
        this.f558b = i10;
    }

    public j2(jl0 jl0Var) {
        this.f557a = 18;
        this.d = jl0Var;
    }

    public j2(ByteBuffer byteBuffer, int i10, RectF rectF) {
        this.f557a = 0;
        this.f559c = rectF;
        this.f558b = i10;
        try {
            this.d = File.createTempFile("paint", ".bin", ApplicationLoader.applicationContext.getCacheDir());
        } catch (Exception e10) {
            FileLog.e(e10);
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
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    public j2(l4.x0 x0Var) {
        this.f557a = 13;
        this.f559c = new SparseArray();
        this.d = x0Var;
        this.f558b = -1;
    }

    public j2(Shader shader, ColorStateList colorStateList, int i10) {
        this.f557a = 8;
        this.f559c = shader;
        this.d = colorStateList;
        this.f558b = i10;
    }

    public j2(FlacStreamMetadata flacStreamMetadata, int i10) {
        this.f557a = 22;
        this.f559c = flacStreamMetadata;
        this.f558b = i10;
        this.d = new Object();
    }

    public j2(int i10, f5.c0 c0Var) {
        this.f557a = 23;
        this.f558b = i10;
        this.f559c = c0Var;
        this.d = new f5.w();
    }

    public j2(org.telegram.ui.Components.n nVar) {
        this.f557a = 19;
        this.d = nVar;
        this.f559c = p8.c.f45655a;
        this.f558b = Integer.MAX_VALUE;
    }

    public j2(CopyOnWriteArrayList copyOnWriteArrayList, int i10, l4.c0 c0Var) {
        this.f557a = 15;
        this.d = copyOnWriteArrayList;
        this.f558b = i10;
        this.f559c = c0Var;
    }

    public j2(j3.t0 t0Var, int i10, String str) {
        this.f557a = 12;
        this.f559c = t0Var;
        this.f558b = i10;
        this.d = str;
    }
}
