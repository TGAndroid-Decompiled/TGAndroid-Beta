package a6;

import a3.n0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.Window;
import androidx.fragment.app.e0;
import androidx.fragment.app.i0;
import androidx.lifecycle.a0;
import b2.b2;
import c3.k0;
import c6.y;
import c7.v;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.internal.cast.p0;
import com.google.android.gms.internal.cast.z;
import com.google.android.gms.internal.cast.z4;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import di.a7;
import di.g0;
import di.l0;
import di.m;
import di.y6;
import e9.j1;
import eb.n;
import g.r;
import g6.q;
import gb.o;
import hg.z1;
import ig.t0;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import ji.h1;
import ji.h2;
import ji.j0;
import ji.s3;
import ji.x3;
import ji.z0;
import l.w;
import n7.l1;
import n7.m1;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.lb0;
import v7.c8;
import v7.u6;
public final class i implements n0, s, a0, androidx.activity.result.b, OnSuccessListener, lb0, mg.e, e81, d9.k, SuccessContinuation, f6.a, w, o, n, z1, je.a, j0 {
    public static i f303c;
    public final int f304a;
    public Object f305b;

    public i(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.f304a = i10;
        this.f305b = obj;
    }

    public static int A(int i10, String str) {
        int J = J(i10);
        int s10 = s(str);
        return M(s10) + s10 + J;
    }

    public static void D(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            char c10 = 57343;
            int i11 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i12 = remaining + arrayOffset;
                    while (i11 < length) {
                        int i13 = i11 + arrayOffset;
                        if (i13 >= i12 || (charAt = charSequence.charAt(i11)) >= 128) {
                            break;
                        }
                        array[i13] = (byte) charAt;
                        i11++;
                    }
                    if (i11 == length) {
                        i10 = arrayOffset + length;
                    } else {
                        i10 = arrayOffset + i11;
                        while (i11 < length) {
                            char charAt2 = charSequence.charAt(i11);
                            if (charAt2 < 128 && i10 < i12) {
                                array[i10] = (byte) charAt2;
                                i10++;
                            } else if (charAt2 < 2048 && i10 <= i12 - 2) {
                                int i14 = i10 + 1;
                                array[i10] = (byte) ((charAt2 >>> 6) | 960);
                                i10 += 2;
                                array[i14] = (byte) ((charAt2 & '?') | 128);
                            } else if ((charAt2 < 55296 || c10 < charAt2) && i10 <= i12 - 3) {
                                array[i10] = (byte) ((charAt2 >>> '\f') | 480);
                                int i15 = i10 + 2;
                                array[i10 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i10 += 3;
                                array[i15] = (byte) ((charAt2 & '?') | 128);
                            } else if (i10 <= i12 - 4) {
                                int i16 = i11 + 1;
                                if (i16 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i16);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        array[i10] = (byte) ((codePoint >>> 18) | 240);
                                        array[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i17 = i10 + 3;
                                        array[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i10 += 4;
                                        array[i17] = (byte) ((codePoint & 63) | 128);
                                        i11 = i16;
                                    } else {
                                        i11 = i16;
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i11 - 1);
                                throw new IllegalArgumentException(sb2.toString());
                            } else {
                                StringBuilder sb3 = new StringBuilder(37);
                                sb3.append("Failed writing ");
                                sb3.append(charAt2);
                                sb3.append(" at index ");
                                sb3.append(i10);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            i11++;
                            c10 = 57343;
                        }
                    }
                    byteBuffer.position(i10 - byteBuffer.arrayOffset());
                    return;
                } catch (ArrayIndexOutOfBoundsException e) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e);
                    throw bufferOverflowException;
                }
            }
            int length2 = charSequence.length();
            while (i11 < length2) {
                char charAt4 = charSequence.charAt(i11);
                char c11 = charAt4;
                if (charAt4 >= 128) {
                    if (charAt4 < 2048) {
                        byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                        c11 = (charAt4 & '?') | 128;
                    } else {
                        if (charAt4 >= 55296 && 57343 >= charAt4) {
                            int i18 = i11 + 1;
                            if (i18 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i18);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                    i11 = i18;
                                } else {
                                    i11 = i18;
                                }
                            }
                            StringBuilder sb4 = new StringBuilder(39);
                            sb4.append("Unpaired surrogate at index ");
                            sb4.append(i11 - 1);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                        byteBuffer.put((byte) ((charAt4 >>> '\f') | 480));
                        byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                        i11++;
                    }
                }
                byteBuffer.put((byte) c11);
                i11++;
            }
            return;
        }
        throw new ReadOnlyBufferException();
    }

    public static int I(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        if ((j10 & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    public static int J(int i10) {
        return M(i10 << 3);
    }

    public static int M(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        if ((i10 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static synchronized i n(Context context) {
        i p5;
        synchronized (i.class) {
            p5 = p(context.getApplicationContext());
        }
        return p5;
    }

    public static synchronized i p(Context context) {
        synchronized (i.class) {
            i iVar = f303c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            f303c = iVar2;
            return iVar2;
        }
    }

    public static int s(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) >= 65536) {
                                i11++;
                            } else {
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i11);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb3 = new StringBuilder(54);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(i12 + 4294967296L);
        throw new IllegalArgumentException(sb3.toString());
    }

    public void B(int i10, int i11) {
        z((i10 << 3) | i11);
    }

    @Override
    public o9 C() {
        s3 s3Var = ((z0) this.f305b).S;
        if (s3Var == null) {
            return null;
        }
        return s3Var.f13511a.getTextSelectionHelper();
    }

    @Override
    public void F(CharSequence charSequence) {
        s3 s3Var = ((z0) this.f305b).S;
        if (s3Var != null) {
            s3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                s3Var.f13511a.u4(charSequence.toString());
            }
        }
    }

    public void G(long j10) {
        while (((-128) & j10) != 0) {
            w((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        w((int) j10);
    }

    @Override
    public void H() {
        ((l0) this.f305b).h.o();
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public n9 L() {
        return (z0) this.f305b;
    }

    @Override
    public void N0() {
        ((l0) this.f305b).h.k();
    }

    @Override
    public ji.a O() {
        return ((z0) this.f305b).f13119a;
    }

    @Override
    public void P0(float f7) {
        ((l0) this.f305b).h.setRotation(f7);
    }

    @Override
    public boolean Q() {
        z0 z0Var = (z0) this.f305b;
        s3 s3Var = z0Var.S;
        if (s3Var != null) {
            ji.a aVar = z0Var.f13119a;
            if (s3Var.f13511a.T4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void S(int i10, int i11) {
        z0 z0Var = (z0) this.f305b;
        s3 s3Var = z0Var.S;
        if (s3Var != null) {
            ji.a aVar = z0Var.f13119a;
            h2 h2Var = s3Var.f13511a.H3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void Z() {
        z0 z0Var = (z0) this.f305b;
        s3 s3Var = z0Var.S;
        if (s3Var != null) {
            ji.a aVar = z0Var.f13119a;
            x3 x3Var = s3Var.f13511a;
            h2 h2Var = x3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            x3Var.f13627f3.onContentChanged();
        }
    }

    @Override
    public void a(h1 h1Var) {
        s3 s3Var = ((z0) this.f305b).S;
        if (s3Var != null) {
            x3 x3Var = s3Var.f13511a;
            x3.N1(x3Var, h1Var);
            x3Var.f13627f3.c0(h1Var, true);
        }
    }

    @Override
    public void a0() {
        ((l0) this.f305b).h.f15824a.g(1, true);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f304a) {
            case 2:
                a8.e eVar = new a8.e(1, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.f308a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.c) this.f305b).writeToParcel(obtain, 0);
                ((a8.c) ((a8.g) obj).u()).F0(obtain, 1);
                return;
            case 7:
                b7.b bVar = new b7.b(0, (TaskCompletionSource) obj2);
                m1 m1Var = (m1) ((l1) obj).u();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(m1Var.f16205b);
                int i11 = n7.j.f16191a;
                obtain2.writeStrongBinder(bVar);
                obtain2.writeInt(1);
                ((v) this.f305b).writeToParcel(obtain2, 0);
                Parcel obtain3 = Parcel.obtain();
                try {
                    m1Var.f16204a.transact(1, obtain2, obtain3, 0);
                    obtain3.readException();
                    return;
                } finally {
                    obtain2.recycle();
                    obtain3.recycle();
                }
            case 20:
                q qVar = new q(2, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                Parcel N0 = iVar.N0();
                com.google.android.gms.internal.cast.v.d(N0, qVar);
                N0.writeStringArray((String[]) this.f305b);
                iVar.S0(N0, 7);
                return;
            default:
                i7.a aVar = new i7.a((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).u();
                String str = ((i7.b) this.f305b).f11340k;
                Parcel J0 = iVar2.J0();
                int i12 = i7.f.f11344a;
                J0.writeStrongBinder(aVar);
                J0.writeString(str);
                iVar2.K0(J0, 2);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        e9.l1 l1Var = (e9.l1) this.f305b;
        l1Var.getClass();
        entry.getClass();
        return new j1(entry, l1Var);
    }

    @Override
    public void b() {
        a3.n nVar = (a3.n) this.f305b;
        if (nVar.f163r1 != null) {
            nVar.R0(0, 1);
        }
    }

    public void c(c3.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f305b;
        long[] jArr = jVar.e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
        }
    }

    @Override
    public void d(l.k kVar, boolean z10) {
        boolean z11;
        int i10;
        g.q qVar;
        r rVar = (r) this.f305b;
        l.k k10 = kVar.k();
        int i11 = 0;
        if (k10 != kVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            kVar = k10;
        }
        g.q[] qVarArr = rVar.U;
        if (qVarArr != null) {
            i10 = qVarArr.length;
        } else {
            i10 = 0;
        }
        while (true) {
            if (i11 < i10) {
                qVar = qVarArr[i11];
                if (qVar != null && qVar.h == kVar) {
                    break;
                }
                i11++;
            } else {
                qVar = null;
                break;
            }
        }
        if (qVar != null) {
            if (z11) {
                rVar.f(qVar.f9779a, qVar, k10);
                rVar.h(qVar, true);
                return;
            }
            rVar.h(qVar, z10);
        }
    }

    @Override
    public void e() {
        i2.l0 l0Var = ((a3.n) this.f305b).Y;
        if (l0Var != null) {
            l0Var.a();
        }
    }

    @Override
    public void f() {
        z0 z0Var = (z0) this.f305b;
        s3 s3Var = z0Var.S;
        if (s3Var != null) {
            x3.Q1(s3Var.f13511a, z0Var.f13119a);
        }
    }

    @Override
    public Object f2() {
        Type type = (Type) this.f305b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new RuntimeException("Invalid EnumMap type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumMap type: " + type.toString());
    }

    public StringBuilder h() {
        ff.a aVar = (ff.a) this.f305b;
        if (aVar instanceof af.r) {
            StringBuilder sb2 = ((af.r) aVar).f623b.f609b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    @Override
    public void i(Object obj) {
        Bundle extras;
        switch (this.f304a) {
            case 5:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                i0 i0Var = (i0) this.f305b;
                e0 e0Var = (e0) i0Var.F.pollLast();
                if (e0Var == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String str = e0Var.f1559a;
                int i10 = e0Var.f1560b;
                androidx.fragment.app.r f7 = i0Var.f1573c.f(str);
                if (f7 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                    return;
                }
                f7.x(i10, aVar.f1060a, aVar.f1061b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f305b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f1061b;
                int i11 = u.e("ProxyBillingActivityV2", intent).f4381a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i11, extras);
                }
                int i12 = aVar2.f1060a;
                if (i12 != -1 || i11 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    public c3.j j() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (c3.j jVar : ((LinkedHashMap) this.f305b).values()) {
            arrayList.add(jVar.f4253b);
            arrayList2.add(jVar.f4254c);
            arrayList3.add(jVar.d);
            arrayList4.add(jVar.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()]);
        long j10 = 0;
        for (int[] iArr2 : iArr) {
            j10 += iArr2.length;
        }
        int i10 = (int) j10;
        if (j10 == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.c(j10, "the total number of elements (%s) in the arrays must fit in an int", z10);
        int[] iArr3 = new int[i10];
        int i11 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i11, iArr4.length);
            i11 += iArr4.length;
        }
        return new c3.j(iArr3, c8.a((long[][]) arrayList2.toArray(new long[arrayList2.size()])), c8.a((long[][]) arrayList3.toArray(new long[arrayList3.size()])), c8.a((long[][]) arrayList4.toArray(new long[arrayList4.size()])));
    }

    @Override
    public a0.h j0() {
        return null;
    }

    @Override
    public void k(int i10) {
        AndroidUtilities.runOnUIThread(new t0(this, 0));
    }

    @Override
    public boolean k0() {
        l0 l0Var = (l0) this.f305b;
        g0 g0Var = l0Var.h;
        boolean m10 = g0Var.m(-90.0f);
        g0Var.i();
        l0Var.e.invalidate();
        return m10;
    }

    public eb.i l(Object obj) {
        eb.g gVar = ((hb.a0) this.f305b).f10397b;
        gVar.getClass();
        if (obj == null) {
            return eb.k.f8691a;
        }
        Class<?> cls = obj.getClass();
        hb.n nVar = new hb.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    @Override
    public Paint.FontMetricsInt m() {
        return ((m) this.f305b).f7382f.getEditText().getPaint().getFontMetricsInt();
    }

    public synchronized void o() {
        synchronized (this) {
            b bVar = (b) this.f305b;
            ReentrantLock reentrantLock = bVar.f287a;
            reentrantLock.lock();
            bVar.f288b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    @Override
    public void o0() {
        z0 z0Var = (z0) this.f305b;
        s3 s3Var = z0Var.S;
        if (s3Var != null) {
            ji.a aVar = z0Var.f13119a;
            x3.P1(s3Var.f13511a);
        }
    }

    @Override
    public void onFirstFrameRendered() {
        a3.n nVar = (a3.n) this.f305b;
        Surface surface = nVar.f163r1;
        if (surface != null) {
            nVar.f148b1.y(surface);
            nVar.f166u1 = true;
        }
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        a7 a7Var = (a7) this.f305b;
        y6 y6Var = a7Var.M;
        h81 h81Var = a7Var.f6623x;
        if (h81Var == null) {
            return;
        }
        if (h81Var.y()) {
            AndroidUtilities.runOnUIThread(y6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(y6Var);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        int i10;
        int i11;
        d2 d2Var;
        d1 b10;
        d6.a aVar = (d6.a) this.f305b;
        Bundle bundle = (Bundle) obj;
        if (p0.f5293j) {
            Context context = aVar.f6373a;
            g6.r rVar = aVar.f6376f;
            p0 p0Var = new p0(context, rVar, aVar.f6375c, aVar.f6379j, aVar.f6377g);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE")) {
                i10 = bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0);
            } else if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i10 == 0) {
                if (z10) {
                    i10 = 0;
                    z10 = true;
                } else {
                    return;
                }
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String u10 = t8.b.u(packageName, ".client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            p0Var.h = i11;
            l5.s.b(context);
            p0Var.f5298g = l5.s.a().c(j5.a.e).a("CAST_SENDER_SDK", new i5.c("proto"), z.f5390a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                p0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(u10, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v b11 = com.google.android.gms.common.api.internal.w.b();
                b11.f5046c = new k0(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                b11.d = new k6.c[]{y.f4554c};
                b11.f5045b = false;
                b11.f5044a = 8426;
                Task e = rVar.e(0, b11.a());
                ?? obj2 = new Object();
                obj2.f12873b = p0Var;
                obj2.f12874c = packageName;
                obj2.f12872a = i10;
                obj2.d = sharedPreferences;
                e.addOnSuccessListener(obj2);
            }
            if (z10) {
                n6.l.h(sharedPreferences);
                g6.b bVar = d2.f5188i;
                synchronized (d2.class) {
                    try {
                        if (d2.f5190k == null) {
                            d2.f5190k = new d2(sharedPreferences, p0Var, packageName);
                        }
                        d2Var = d2.f5190k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = d2Var.f5193c;
                SharedPreferences sharedPreferences2 = d2Var.f5192b;
                HashSet hashSet = d2Var.f5194f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = d2Var.f5195g;
                hashSet2.clear();
                d2Var.h = 0L;
                String str2 = d2.f5189j;
                if (str2.equals(string) && str.equals(string2)) {
                    d2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j10 = sharedPreferences2.getLong(str3, 0L);
                            if (j10 != 0 && currentTimeMillis - j10 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                d1 b12 = d2.b(str3.substring(41));
                                if (b12 != null) {
                                    hashSet2.add(b12);
                                    hashSet.add(b12);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = d2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    d2Var.c(hashSet3);
                    n6.l.h(d2Var.e);
                    n6.l.h(d2Var.d);
                    d2Var.e.post(d2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    d2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                d2.a(d1.CAST_CONTEXT);
            }
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(b2 b2Var) {
    }

    @Override
    public boolean q(l.k kVar) {
        Window.Callback callback;
        r rVar = (r) this.f305b;
        if (kVar == kVar.k() && rVar.O && (callback = rVar.f9800f.getCallback()) != null && !rVar.Z) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    @Override
    public void t(Bitmap bitmap) {
        ((f6.h) this.f305b).e(bitmap, 3);
    }

    @Override
    public boolean t0(int i10) {
        return true;
    }

    @Override
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void r13 = (Void) obj;
        ea.b bVar = (ea.b) this.f305b;
        c5.j jVar = (c5.j) bVar.f8666f;
        ea.d dVar = (ea.d) bVar.f8664b;
        String str = jVar.f4387a;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = c5.j.b(dVar);
            androidx.biometric.e eVar = new androidx.biometric.e(str, b10);
            eVar.s("User-Agent", "Crashlytics Android SDK/18.6.0");
            eVar.s("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            c5.j.a(eVar, dVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = jVar.c(eVar.l());
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            ea.a q6 = ((k6.h) bVar.f8665c).q(jSONObject);
            qb.c cVar = (qb.c) bVar.e;
            long j10 = q6.f8661c;
            cVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) cVar.f43343b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e7) {
                        e = e7;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        x9.h.c(fileWriter, "Failed to close settings writer.");
                        ea.b.f("Loaded settings: ", jSONObject);
                        String str4 = dVar.f8672f;
                        SharedPreferences.Editor edit = ((Context) bVar.f8663a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) bVar.h).set(q6);
                        ((TaskCompletionSource) ((AtomicReference) bVar.f8668i).get()).trySetResult(q6);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    x9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                x9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            x9.h.c(fileWriter, "Failed to close settings writer.");
            ea.b.f("Loaded settings: ", jSONObject);
            String str42 = dVar.f8672f;
            SharedPreferences.Editor edit2 = ((Context) bVar.f8663a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) bVar.h).set(q6);
            ((TaskCompletionSource) ((AtomicReference) bVar.f8668i).get()).trySetResult(q6);
        }
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f304a) {
            case 22:
                return "<" + ((String) this.f305b) + '>';
            default:
                return super.toString();
        }
    }

    public void u(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f305b;
        B(i10, 2);
        try {
            int M = M(str.length());
            if (M == M(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= M) {
                    byteBuffer.position(position + M);
                    D(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    z((position2 - position) - M);
                    byteBuffer.position(position2);
                    return;
                }
                throw new z4(position + M, byteBuffer.limit());
            }
            z(s(str));
            D(str, byteBuffer);
        } catch (BufferOverflowException e) {
            z4 z4Var = new z4(byteBuffer.position(), byteBuffer.limit());
            z4Var.initCause(e);
            throw z4Var;
        }
    }

    public void v(int i10, byte[] bArr) {
        B(i10, 2);
        z(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f305b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new z4(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public void v0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.q qVar = (androidx.biometric.q) this.f305b;
        if (charSequence != null) {
            if (qVar.R()) {
                qVar.W(charSequence);
            }
            qVar.f1214l0.d(null);
        }
    }

    public void w(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.f305b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new z4(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public boolean x() {
        l0 l0Var = (l0) this.f305b;
        l0Var.e.invalidate();
        return l0Var.h.j();
    }

    @Override
    public void y(int i10, int i11, CharSequence charSequence, boolean z10) {
        di.g gVar = ((m) this.f305b).f7382f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void z(int i10) {
        while ((i10 & (-128)) != 0) {
            w((i10 & 127) | 128);
            i10 >>>= 7;
        }
        w(i10);
    }

    public i(Object obj, int i10) {
        this.f304a = i10;
        this.f305b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        rg.d2 d2Var = ((a7) this.f305b).f6621w;
        if (d2Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(d2Var.f44237y0 - f10) >= 1.0E-4f) {
                d2Var.f44237y0 = f10;
                d2Var.requestLayout();
            }
        }
    }

    public i(byte[] bArr, int i10) {
        this.f304a = 11;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.f305b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public i(Context context) {
        String d;
        this.f304a = 0;
        b a2 = b.a(context);
        this.f305b = a2;
        a2.b();
        String d10 = a2.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(d10) || (d = a2.d(b.f("googleSignInOptions", d10))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(d);
        } catch (JSONException unused) {
        }
    }

    public i(int i10) {
        this.f304a = i10;
        switch (i10) {
            case 24:
                return;
            default:
                this.f305b = new LinkedHashMap();
                return;
        }
    }

    @Override
    public void E(String str) {
    }

    @Override
    public void I0(ArrayList arrayList) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void onError(h81 h81Var, Exception exc) {
    }

    @Override
    public void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void r(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}
