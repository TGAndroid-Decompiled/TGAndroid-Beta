package a6;

import a5.m;
import aa.b;
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
import c2.u0;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.gms.common.api.internal.q1;
import com.google.firebase.messaging.t;
import d5.e0;
import d5.f0;
import d5.y;
import f2.g;
import f7.f8;
import f7.g8;
import f7.h9;
import f7.j;
import f7.k;
import f7.m6;
import ff.d0;
import ff.h;
import g7.a8;
import g7.r;
import gh.m3;
import h7.i0;
import h7.j0;
import h7.n9;
import h7.na;
import h7.u7;
import j$.util.DesugarCollections;
import j7.ib;
import j7.we;
import j7.x;
import j7.zf;
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
import java.util.zip.Deflater;
import m.t3;
import m3.d;
import m3.e;
import m3.l;
import m3.n;
import o8.w;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.wk0;
import u5.c;
public final class a implements e {
    public final int f100a;
    public Object f101b;
    public int f102c;
    public Object d;

    public a(char c10, int i9) {
        this.f100a = i9;
    }

    public static a6.a d(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        throw new UnsupportedOperationException("Method not decompiled: a6.a.d(android.content.res.Resources, int, android.content.res.Resources$Theme):a6.a");
    }

    @Override
    public d Q1(l lVar, long j10) {
        long j11;
        switch (this.f100a) {
            case 21:
                long position = lVar.getPosition();
                long f10 = f(lVar);
                long k10 = lVar.k();
                lVar.n(Math.max(6, ((FlacStreamMetadata) this.f101b).minFrameSize));
                long f11 = f(lVar);
                long k11 = lVar.k();
                if (f10 <= j10 && f11 > j10) {
                    return new d(0, -9223372036854775807L, k10);
                }
                if (f11 <= j10) {
                    return new d(-2, f11, k11);
                }
                return new d(-1, f10, position);
            default:
                long position2 = lVar.getPosition();
                int min = (int) Math.min(112800, lVar.getLength() - position2);
                y yVar = (y) this.d;
                yVar.z(min);
                lVar.c(0, min, yVar.f4410a);
                int i9 = yVar.f4412c;
                long j12 = -1;
                long j13 = -1;
                long j14 = -9223372036854775807L;
                while (true) {
                    if (yVar.a() >= 188) {
                        byte[] bArr = yVar.f4410a;
                        int i10 = yVar.f4411b;
                        while (true) {
                            if (i10 < i9) {
                                j11 = -9223372036854775807L;
                                if (bArr[i10] != 71) {
                                    i10++;
                                }
                            } else {
                                j11 = -9223372036854775807L;
                            }
                        }
                        int i11 = i10 + 188;
                        if (i11 <= i9) {
                            long a2 = a8.a(yVar, i10, this.f102c);
                            if (a2 != j11) {
                                long b10 = ((e0) this.f101b).b(a2);
                                if (b10 > j10) {
                                    if (j14 == j11) {
                                        return new d(-1, b10, position2);
                                    }
                                    return new d(0, -9223372036854775807L, position2 + j13);
                                }
                                j14 = b10;
                                if (100000 + j14 > j10) {
                                    return new d(0, -9223372036854775807L, position2 + i10);
                                }
                                j13 = i10;
                            }
                            yVar.C(i11);
                            j12 = i11;
                        }
                    } else {
                        j11 = -9223372036854775807L;
                    }
                }
                if (j14 != j11) {
                    return new d(-2, j14, position2 + j12);
                }
                return d.d;
        }
    }

    public void a(int i9, int i10) {
        boolean z10;
        int i11 = (i10 << 16) + i9;
        if (this.f102c != i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f102c = i11;
        for (int i12 = 0; i12 < h.f6178y; i12++) {
            if (z10 || ((Bitmap[]) this.d)[i12] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i12];
                if (bitmap != null) {
                    Utilities.globalQueue.postRunnable(new af.e(bitmap, 25));
                }
                ((Bitmap[]) this.d)[i12] = Bitmap.createBitmap(i10, i9, Bitmap.Config.ARGB_8888);
            }
            d0[] d0VarArr = (d0[]) this.f101b;
            if (d0VarArr[i12] == null) {
                d0VarArr[i12] = new d0(i10 * i9 * 2);
            }
        }
    }

    public b b() {
        if ("".isEmpty()) {
            return new b((String) this.f101b, ((Long) this.d).longValue(), this.f102c);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public o8.q0 c() {
        throw new UnsupportedOperationException("Method not decompiled: a6.a.c():o8.q0");
    }

    public void e(String str, Object... objArr) {
        if (this.f102c <= 3) {
            String str2 = (String) this.f101b;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.d).concat(str));
        }
    }

    public long f(l lVar) {
        int e10;
        n nVar = (n) this.d;
        FlacStreamMetadata flacStreamMetadata = (FlacStreamMetadata) this.f101b;
        while (lVar.k() < lVar.getLength() - 6) {
            int i9 = this.f102c;
            long k10 = lVar.k();
            byte[] bArr = new byte[2];
            int i10 = 0;
            boolean a2 = false;
            lVar.c(0, 2, bArr);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i9) {
                lVar.t();
                lVar.n((int) (k10 - lVar.getPosition()));
            } else {
                y yVar = new y(16);
                System.arraycopy(bArr, 0, yVar.f4410a, 0, 2);
                byte[] bArr2 = yVar.f4410a;
                while (i10 < 14 && (e10 = lVar.e(2 + i10, 14 - i10, bArr2)) != -1) {
                    i10 += e10;
                }
                yVar.B(i10);
                lVar.t();
                lVar.n((int) (k10 - lVar.getPosition()));
                a2 = r.a(yVar, flacStreamMetadata, i9, nVar);
            }
            if (a2) {
                break;
            }
            lVar.n(1);
        }
        if (lVar.k() >= lVar.getLength() - 6) {
            lVar.n((int) (lVar.getLength() - lVar.k()));
            return flacStreamMetadata.totalSamples;
        }
        return nVar.f17244a;
    }

    public Object g(int i9) {
        SparseArray sparseArray = (SparseArray) this.f101b;
        if (this.f102c == -1) {
            this.f102c = 0;
        }
        while (true) {
            int i10 = this.f102c;
            if (i10 <= 0 || i9 >= sparseArray.keyAt(i10)) {
                break;
            }
            this.f102c--;
        }
        while (this.f102c < sparseArray.size() - 1 && i9 >= sparseArray.keyAt(this.f102c + 1)) {
            this.f102c++;
        }
        return sparseArray.valueAt(this.f102c);
    }

    public boolean h() {
        ColorStateList colorStateList;
        if (((Shader) this.f101b) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    @Override
    public void i2() {
        switch (this.f100a) {
            case 21:
                return;
            default:
                y yVar = (y) this.d;
                byte[] bArr = f0.f4353f;
                yVar.getClass();
                yVar.A(bArr.length, bArr);
                return;
        }
    }

    public void j(Object obj, Object obj2) {
        int i9 = (this.f102c + 1) * 2;
        Object[] objArr = (Object[]) this.f101b;
        if (i9 > objArr.length) {
            this.f101b = Arrays.copyOf(objArr, w.d(objArr.length, i9));
        }
        if (obj != null) {
            if (obj2 != null) {
                Object[] objArr2 = (Object[]) this.f101b;
                int i10 = this.f102c;
                int i11 = i10 * 2;
                objArr2[i11] = obj;
                objArr2[i11 + 1] = obj2;
                this.f102c = i10 + 1;
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

    public void k(int i9) {
        l(i9, 200L, gr.f28844f);
    }

    public void l(int i9, long j10, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.f101b;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.f101b).cancel();
        }
        int[] iArr = new int[1];
        this.f102c = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i9);
        this.f101b = ofInt;
        ofInt.addUpdateListener(new g(20, this, iArr));
        ((ValueAnimator) this.f101b).addListener(new m3(this, i9, iArr, 2));
        ((ValueAnimator) this.f101b).setDuration(j10);
        ((ValueAnimator) this.f101b).setInterpolator(interpolator);
        ((ValueAnimator) this.f101b).start();
    }

    public List m(CharSequence charSequence) {
        charSequence.getClass();
        n5.e0 e0Var = (n5.e0) this.d;
        e0Var.getClass();
        n8.h hVar = new n8.h(e0Var, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (hVar.hasNext()) {
            arrayList.add((String) hVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void n(String str, c cVar) {
        int i9 = this.f102c + 1;
        Object[] objArr = (Object[]) this.f101b;
        int length = objArr.length;
        int i10 = i9 + i9;
        if (i10 > length) {
            if (i10 >= 0) {
                int i11 = length + (length >> 1) + 1;
                if (i11 < i10) {
                    int highestOneBit = Integer.highestOneBit(i10 - 1);
                    i11 = highestOneBit + highestOneBit;
                }
                if (i11 < 0) {
                    i11 = Integer.MAX_VALUE;
                }
                this.f101b = Arrays.copyOf(objArr, i11);
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        Object[] objArr2 = (Object[]) this.f101b;
        int i12 = this.f102c;
        int i13 = i12 + i12;
        objArr2[i13] = str;
        objArr2[i13 + 1] = cVar;
        this.f102c = i12 + 1;
    }

    public void o(String str, com.google.android.gms.common.api.internal.l lVar) {
        Map map = (Map) this.f101b;
        if (!map.containsKey(str)) {
            map.put(str, lVar);
            if (this.f102c > 0) {
                new u0(Looper.getMainLooper(), 6).post(new q1(this, lVar, str, 0));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(aa.d.o("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public byte[] p() {
        k kVar;
        q9.d dVar;
        j0 j0Var;
        q9.d dVar2;
        j7.y yVar;
        q9.d dVar3;
        switch (this.f100a) {
            case 7:
                h9 h9Var = h9.f5695c;
                t tVar = (t) this.f101b;
                ((f8) this.d).h = false;
                f8 f8Var = (f8) this.d;
                f8Var.f5665f = Boolean.FALSE;
                tVar.f4177b = new g8(f8Var);
                try {
                    h9.b();
                    m6 m6Var = new m6(tVar);
                    m mVar = new m(12);
                    h9Var.a(mVar);
                    HashMap hashMap = new HashMap((HashMap) mVar.f98b);
                    HashMap hashMap2 = new HashMap((HashMap) mVar.f99c);
                    j jVar = (j) mVar.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        kVar = new k(byteArrayOutputStream, hashMap, hashMap2, jVar);
                        dVar = (q9.d) hashMap.get(m6.class);
                    } catch (IOException unused) {
                    }
                    if (dVar != null) {
                        dVar.a(m6Var, kVar);
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(m6.class)));
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
            case 10:
                na naVar = na.f10054c;
                com.google.firebase.messaging.m mVar2 = (com.google.firebase.messaging.m) this.f101b;
                ((f8) this.d).h = false;
                f8 f8Var2 = (f8) this.d;
                f8Var2.f5665f = Boolean.FALSE;
                mVar2.f4160a = new n9(f8Var2);
                try {
                    na.b();
                    u7 u7Var = new u7(mVar2);
                    m mVar3 = new m(21);
                    naVar.a(mVar3);
                    HashMap hashMap3 = new HashMap((HashMap) mVar3.f98b);
                    HashMap hashMap4 = new HashMap((HashMap) mVar3.f99c);
                    i0 i0Var = (i0) mVar3.d;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        j0Var = new j0(byteArrayOutputStream2, hashMap3, hashMap4, i0Var);
                        dVar2 = (q9.d) hashMap3.get(u7.class);
                    } catch (IOException unused2) {
                    }
                    if (dVar2 != null) {
                        dVar2.a(u7Var, j0Var);
                        return byteArrayOutputStream2.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(u7.class)));
                } catch (UnsupportedEncodingException e11) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
                }
            default:
                zf zfVar = zf.f14233c;
                t3 t3Var = (t3) this.f101b;
                ((f8) this.d).h = false;
                f8 f8Var3 = (f8) this.d;
                f8Var3.f5665f = Boolean.FALSE;
                t3Var.f17098a = new we(f8Var3);
                try {
                    zf.b();
                    ib ibVar = new ib(t3Var);
                    j4.c cVar = new j4.c(1);
                    zfVar.a(cVar);
                    HashMap hashMap5 = new HashMap((HashMap) cVar.f13431b);
                    HashMap hashMap6 = new HashMap((HashMap) cVar.f13432c);
                    x xVar = (x) cVar.d;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        yVar = new j7.y(byteArrayOutputStream3, hashMap5, hashMap6, xVar);
                        dVar3 = (q9.d) hashMap5.get(ib.class);
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

    public void q(Bundle bundle) {
        Bundle bundle2;
        this.f102c = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.f101b).entrySet()) {
            com.google.android.gms.common.api.internal.l lVar = (com.google.android.gms.common.api.internal.l) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lVar.onCreate(bundle2);
        }
    }

    public void r(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.f101b).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((com.google.android.gms.common.api.internal.l) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public a(int i9, int i10) {
        this.f100a = i10;
        switch (i10) {
            case 17:
                this.f101b = new Object[i9 * 2];
                this.f102c = 0;
                return;
            default:
                this.f102c = i9;
                return;
        }
    }

    public a(Object obj, int i9, Object obj2, int i10) {
        this.f100a = i10;
        this.d = obj;
        this.f102c = i9;
        this.f101b = obj2;
    }

    public a(int i9, byte b10) {
        this.f100a = i9;
        switch (i9) {
            case 5:
                this.f101b = new Object[8];
                this.f102c = 0;
                return;
            case 8:
                int i10 = h.f6178y;
                this.f101b = new d0[i10];
                this.d = new Bitmap[i10];
                return;
            case 18:
                this.f101b = new og.a();
                return;
            default:
                this.f101b = DesugarCollections.synchronizedMap(new a0.k(0));
                this.f102c = 0;
                return;
        }
    }

    public a(com.google.firebase.messaging.m mVar, int i9) {
        this.f100a = 10;
        this.d = new Object();
        this.f101b = mVar;
        na.b();
        this.f102c = i9;
    }

    public a(t tVar, int i9) {
        this.f100a = 7;
        this.d = new Object();
        this.f101b = tVar;
        h9.b();
        this.f102c = i9;
    }

    public a(String str, String[] strArr) {
        String sb2;
        this.f100a = 0;
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
        this.f101b = str;
        int i9 = 2;
        x5.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i9 <= 7 && !Log.isLoggable((String) this.f101b, i9)) {
            i9++;
        }
        this.f102c = i9;
    }

    private final void i() {
    }

    public a(t3 t3Var, int i9) {
        this.f100a = 13;
        this.d = new Object();
        this.f101b = t3Var;
        zf.b();
        this.f102c = i9;
    }

    public a(wk0 wk0Var) {
        this.f100a = 20;
        this.d = wk0Var;
    }

    public a(ByteBuffer byteBuffer, int i9, RectF rectF) {
        this.f100a = 23;
        this.f101b = rectF;
        this.f102c = i9;
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

    public a(ih.e eVar) {
        this.f100a = 12;
        this.f101b = new SparseArray();
        this.d = eVar;
        this.f102c = -1;
    }

    public a(Shader shader, ColorStateList colorStateList, int i9) {
        this.f100a = 9;
        this.f101b = shader;
        this.d = colorStateList;
        this.f102c = i9;
    }

    public a(FlacStreamMetadata flacStreamMetadata, int i9) {
        this.f100a = 21;
        this.f101b = flacStreamMetadata;
        this.f102c = i9;
        this.d = new Object();
    }

    public a(int i9, e0 e0Var) {
        this.f100a = 22;
        this.f102c = i9;
        this.f101b = e0Var;
        this.d = new y();
    }

    public a(n5.e0 e0Var) {
        this.f100a = 16;
        this.d = e0Var;
        this.f101b = n8.c.f18510a;
        this.f102c = Integer.MAX_VALUE;
    }
}
