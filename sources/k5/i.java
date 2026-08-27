package k5;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.p;
import androidx.fragment.app.b0;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.a0;
import c2.t;
import cg.b2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.x4;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import f2.t1;
import f2.x0;
import f2.y0;
import g.q;
import h3.l0;
import h7.k6;
import hh.i5;
import j3.n;
import j3.n0;
import j3.r;
import java.io.File;
import java.io.FileInputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import jh.e4;
import l.e0;
import l.x;
import lh.va;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.y51;
import yf.m;
import yf.p1;
import yf.r0;
import zf.v1;

public final class i implements s, a0, androidx.activity.result.b, o, y2.b, e5.o, t1, x, gp0, y51, r, l3.f, ld.b, v1, l.j {

    public static i f14478c;

    public final int f14479a;

    public Object f14480b;

    public i(d6.g gVar, d6.a aVar) {
        this.f14479a = 11;
        this.f14480b = aVar;
    }

    public static synchronized i H(Context context) {
        return K(context.getApplicationContext());
    }

    public static synchronized i K(Context context) {
        i iVar = f14478c;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(context);
        f14478c = iVar2;
        return iVar2;
    }

    public static int L(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char cCharAt2 = charSequence.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i11);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
                break;
            }
            i12 += (127 - cCharAt) >>> 31;
            i11++;
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb3 = new StringBuilder(54);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(((long) i12) + 4294967296L);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static int Q(int i10, String str) {
        int iV = V(i10);
        int iL = L(str);
        return W(iL) + iL + iV;
    }

    public static void S(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        char cCharAt;
        int i11;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        char c10 = 57343;
        int i12 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i12 < length) {
                char cCharAt2 = charSequence.charAt(i12);
                if (cCharAt2 < 128) {
                    i11 = cCharAt2;
                    byteBuffer.put((byte) i11);
                } else if (cCharAt2 < 2048) {
                    byteBuffer.put((byte) ((cCharAt2 >>> 6) | 960));
                    i11 = (cCharAt2 & '?') | 128;
                    i11 = cCharAt2;
                    byteBuffer.put((byte) i11);
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i13 = i12 + 1;
                        if (i13 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i13);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                                byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((codePoint & 63) | 128));
                                i12 = i13;
                            } else {
                                i12 = i13;
                            }
                        }
                        StringBuilder sb2 = new StringBuilder(39);
                        sb2.append("Unpaired surrogate at index ");
                        sb2.append(i12 - 1);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    byteBuffer.put((byte) ((cCharAt2 >>> '\f') | 480));
                    byteBuffer.put((byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put((byte) ((cCharAt2 & '?') | 128));
                }
                i12++;
            }
            return;
        }
        try {
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int iRemaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i14 = iRemaining + iArrayOffset;
            while (i12 < length2) {
                int i15 = i12 + iArrayOffset;
                if (i15 >= i14 || (cCharAt = charSequence.charAt(i12)) >= 128) {
                    break;
                }
                bArrArray[i15] = (byte) cCharAt;
                i12++;
            }
            if (i12 == length2) {
                i10 = iArrayOffset + length2;
            } else {
                i10 = iArrayOffset + i12;
                while (i12 < length2) {
                    char cCharAt4 = charSequence.charAt(i12);
                    if (cCharAt4 < 128 && i10 < i14) {
                        bArrArray[i10] = (byte) cCharAt4;
                        i10++;
                    } else if (cCharAt4 < 2048 && i10 <= i14 - 2) {
                        int i16 = i10 + 1;
                        bArrArray[i10] = (byte) ((cCharAt4 >>> 6) | 960);
                        i10 += 2;
                        bArrArray[i16] = (byte) ((cCharAt4 & '?') | 128);
                    } else {
                        if ((cCharAt4 >= 55296 && c10 >= cCharAt4) || i10 > i14 - 3) {
                            if (i10 > i14 - 4) {
                                StringBuilder sb3 = new StringBuilder(37);
                                sb3.append("Failed writing ");
                                sb3.append(cCharAt4);
                                sb3.append(" at index ");
                                sb3.append(i10);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            int i17 = i12 + 1;
                            if (i17 != charSequence.length()) {
                                char cCharAt5 = charSequence.charAt(i17);
                                if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt4, cCharAt5);
                                    bArrArray[i10] = (byte) ((codePoint2 >>> 18) | 240);
                                    bArrArray[i10 + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i18 = i10 + 3;
                                    bArrArray[i10 + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i10 += 4;
                                    bArrArray[i18] = (byte) ((codePoint2 & 63) | 128);
                                    i12 = i17;
                                } else {
                                    i12 = i17;
                                }
                            }
                            StringBuilder sb4 = new StringBuilder(39);
                            sb4.append("Unpaired surrogate at index ");
                            sb4.append(i12 - 1);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                        bArrArray[i10] = (byte) ((cCharAt4 >>> '\f') | 480);
                        int i19 = i10 + 2;
                        bArrArray[i10 + 1] = (byte) (((cCharAt4 >>> 6) & 63) | 128);
                        i10 += 3;
                        bArrArray[i19] = (byte) ((cCharAt4 & '?') | 128);
                    }
                    i12++;
                    c10 = 57343;
                }
            }
            byteBuffer.position(i10 - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e9) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e9);
            throw bufferOverflowException;
        }
    }

    public static int U(long j10) {
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
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int V(int i10) {
        return W(i10 << 3);
    }

    public static int W(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    @Override
    public View A(int i10) {
        return ((x0) this.f14480b).q(i10);
    }

    @Override
    public void B() {
        int i10 = this.f14479a;
    }

    @Override
    public void E() {
        l0 l0Var = ((n0) this.f14480b).O0;
        if (l0Var != null) {
            l0Var.f8011a.f8079n.d(2);
        }
    }

    public JSONObject F() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f14480b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(f9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e9) {
                        e = e9;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        f9.h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    f9.h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            f9.h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            f9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override
    public int G(View view) {
        return x0.y(view) + ((ViewGroup.MarginLayoutParams) ((y0) view.getLayoutParams())).rightMargin;
    }

    public synchronized void I() {
        b bVar = (b) this.f14480b;
        ReentrantLock reentrantLock = bVar.f14461a;
        reentrantLock.lock();
        try {
            bVar.f14462b.edit().clear().apply();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override
    public void J(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        p pVar = (p) this.f14480b;
        if (charSequence != null) {
            if (pVar.R()) {
                pVar.W(charSequence);
            }
            pVar.f1062h0.d(null);
        }
    }

    public void M(int i10, String str) throws x4 {
        ByteBuffer byteBuffer = (ByteBuffer) this.f14480b;
        R(i10, 2);
        try {
            int iW = W(str.length());
            if (iW != W(str.length() * 3)) {
                P(L(str));
                S(str, byteBuffer);
                return;
            }
            int iPosition = byteBuffer.position();
            if (byteBuffer.remaining() < iW) {
                throw new x4(iPosition + iW, byteBuffer.limit());
            }
            byteBuffer.position(iPosition + iW);
            S(str, byteBuffer);
            int iPosition2 = byteBuffer.position();
            byteBuffer.position(iPosition);
            P((iPosition2 - iPosition) - iW);
            byteBuffer.position(iPosition2);
        } catch (BufferOverflowException e9) {
            x4 x4Var = new x4(byteBuffer.position(), byteBuffer.limit());
            x4Var.initCause(e9);
            throw x4Var;
        }
    }

    public void N(int i10, byte[] bArr) throws x4 {
        R(i10, 2);
        P(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f14480b;
        if (byteBuffer.remaining() < length) {
            throw new x4(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    public void O(int i10) throws x4 {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.f14480b;
        if (!byteBuffer.hasRemaining()) {
            throw new x4(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b10);
    }

    public void P(int i10) throws x4 {
        while ((i10 & (-128)) != 0) {
            O((i10 & 127) | 128);
            i10 >>>= 7;
        }
        O(i10);
    }

    public void R(int i10, int i11) throws x4 {
        P((i10 << 3) | i11);
    }

    public void T(long j10) throws x4 {
        while (((-128) & j10) != 0) {
            O((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        O((int) j10);
    }

    @Override
    public void a(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        j0 j0Var = (j0) this.f14480b;
        f0 f0Var = (f0) j0Var.F.pollLast();
        if (f0Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = f0Var.f1433a;
        int i10 = f0Var.f1434b;
        androidx.fragment.app.s sVarQ = j0Var.f1447c.q(str);
        if (sVarQ != null) {
            sVarQ.x(i10, aVar.f906a, aVar.f907b);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f14479a) {
            case 1:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                a6.a aVar = (a6.a) ((a6.d) obj).u();
                y5.o oVar = (y5.o) this.f14480b;
                Parcel parcelG0 = aVar.G0();
                v6.a.c(parcelG0, oVar);
                try {
                    aVar.f2456b.transact(1, parcelG0, null, 1);
                    parcelG0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th) {
                    parcelG0.recycle();
                    throw th;
                }
            default:
                d6.f fVar = new d6.f(1, (TaskCompletionSource) obj2);
                d6.e eVar = (d6.e) ((d6.h) obj).u();
                d6.a aVar2 = (d6.a) this.f14480b;
                Parcel parcelG1 = eVar.G0();
                v6.a.d(parcelG1, fVar);
                v6.a.c(parcelG1, aVar2);
                parcelG1.writeStrongBinder(null);
                eVar.H0(parcelG1, 2);
                return;
        }
    }

    @Override
    public void b(l.l lVar, boolean z10) {
        q qVar;
        switch (this.f14479a) {
            case 14:
                g.r rVar = (g.r) this.f14480b;
                l.l lVarK = lVar.k();
                int i10 = 0;
                boolean z11 = lVarK != lVar;
                if (z11) {
                    lVar = lVarK;
                }
                q[] qVarArr = rVar.Q;
                int length = qVarArr != null ? qVarArr.length : 0;
                while (true) {
                    if (i10 >= length) {
                        qVar = null;
                    } else {
                        qVar = qVarArr[i10];
                        if (qVar == null || qVar.h != lVar) {
                            i10++;
                        }
                    }
                }
                if (qVar != null) {
                    if (!z11) {
                        rVar.h(qVar, z10);
                    } else {
                        rVar.f(qVar.f6276a, qVar, lVarK);
                        rVar.h(qVar, true);
                    }
                }
                break;
            default:
                if (lVar instanceof e0) {
                    ((e0) lVar).f15286z.k().c(false);
                }
                x xVar = ((m.i) this.f14480b).f17340e;
                if (xVar != null) {
                    xVar.b(lVar, z10);
                }
                break;
        }
    }

    @Override
    public void c(long j10) {
        n nVar = ((n0) this.f14480b).F0;
        Handler handler = nVar.f12391a;
        if (handler != null) {
            handler.post(new b2(nVar, j10, 3));
        }
    }

    @Override
    public void c0(float f10) {
        va vaVar = (va) this.f14480b;
        r0.e(vaVar.B1).k(String.valueOf(m.f49979a.indexOf(vaVar.K0.getCurrentBrush())), f10);
        p1 p1Var = vaVar.f16000w1;
        p1Var.f50036c = f10;
        vaVar.E0(p1Var, null, false);
    }

    @Override
    public UUID d() {
        return h3.h.f7866a;
    }

    @Override
    public int f(View view) {
        return x0.x(view) - ((ViewGroup.MarginLayoutParams) ((y0) view.getLayoutParams())).leftMargin;
    }

    @Override
    public void g() {
        l0 l0Var = ((n0) this.f14480b).O0;
        if (l0Var != null) {
            l0Var.f8011a.S = true;
        }
    }

    @Override
    public Object mo28get() {
        String packageName = ((Context) ((oc.a) this.f14480b).mo28get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override
    public void h0() {
        switch (this.f14479a) {
            case 17:
                ec ecVarK = ((i5) this.f14480b).getBulletinFactory().k(false);
                ecVarK.f28030t = true;
                ecVarK.j();
                break;
            default:
                e4.j0((e4) this.f14480b);
                break;
        }
    }

    @Override
    public void i(Object obj) {
        ((r7.c) obj).onLocationResult((LocationResult) this.f14480b);
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public void k(l.l lVar) {
        Toolbar toolbar = (Toolbar) this.f14480b;
        m.i iVar = toolbar.f1018a.F;
        if (iVar == null || !iVar.g()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.S.d).iterator();
            while (it.hasNext()) {
                ((b0) it.next()).f1420a.t();
            }
        }
    }

    @Override
    public boolean l(l.l lVar) {
        Window.Callback callback;
        switch (this.f14479a) {
            case 14:
                g.r rVar = (g.r) this.f14480b;
                if (lVar != lVar.k() || !rVar.K || (callback = rVar.f6298f.getCallback()) == null || rVar.V) {
                    return true;
                }
                callback.onMenuOpened(108, lVar);
                return true;
            default:
                m.i iVar = (m.i) this.f14480b;
                if (lVar == iVar.f17339c) {
                    return false;
                }
                ((e0) lVar).A.getClass();
                iVar.getClass();
                x xVar = iVar.f17340e;
                if (xVar != null) {
                    return xVar.l(lVar);
                }
                return false;
        }
    }

    @Override
    public void m(a1.c cVar) {
        cVar.a(((WindowManager) this.f14480b).getDefaultDisplay());
    }

    @Override
    public int n() {
        return ((x0) this.f14480b).D();
    }

    @Override
    public void o(int i10, long j10, long j11) {
        n nVar = ((n0) this.f14480b).F0;
        Handler handler = nVar.f12391a;
        if (handler != null) {
            handler.post(new com.google.android.exoplayer2.upstream.d(nVar, i10, j10, j11, 1));
        }
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n nVar = ((n0) this.f14480b).F0;
        Handler handler = nVar.f12391a;
        if (handler != null) {
            handler.post(new fh.f(5, nVar, z10));
        }
    }

    @Override
    public int p() {
        return 1;
    }

    @Override
    public Object q(ld.c cVar, tc.c cVar2) throws Throwable {
        ld.a aVar;
        Throwable th;
        md.g gVar;
        if (cVar2 instanceof ld.a) {
            aVar = (ld.a) cVar2;
            int i10 = aVar.d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new ld.a(this, cVar2);
            }
        } else {
            aVar = new ld.a(this, cVar2);
        }
        Object obj = aVar.f15539b;
        sc.a aVar2 = sc.a.f47847a;
        int i11 = aVar.d;
        pc.i iVar = pc.i.f45696a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = aVar.f15538a;
            try {
                k6.b(obj);
                gVar.releaseIntercepted();
                return iVar;
            } catch (Throwable th2) {
                th = th2;
                gVar.releaseIntercepted();
                throw th;
            }
        }
        k6.b(obj);
        md.g gVar2 = new md.g(cVar, aVar.getContext());
        try {
            aVar.f15538a = gVar2;
            aVar.d = 1;
            Object objInvoke = ((k1.n) this.f14480b).invoke(gVar2, aVar);
            if (objInvoke != aVar2) {
                objInvoke = iVar;
            }
            if (objInvoke == aVar2) {
                return aVar2;
            }
            gVar = gVar2;
            gVar.releaseIntercepted();
            return iVar;
        } catch (Throwable th3) {
            th = th3;
            gVar = gVar2;
            gVar.releaseIntercepted();
            throw th;
        }
    }

    @Override
    public boolean s(String str) {
        return false;
    }

    @Override
    public boolean t(l.l lVar, MenuItem menuItem) {
        ((Toolbar) this.f14480b).getClass();
        return false;
    }

    public String toString() {
        switch (this.f14479a) {
            case 5:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f14480b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override
    public void u(Exception exc) {
        d5.a.p("MediaCodecAudioRenderer", "Audio sink error", exc);
        n nVar = ((n0) this.f14480b).F0;
        Handler handler = nVar.f12391a;
        if (handler != null) {
            handler.post(new j3.k(nVar, exc, 1));
        }
    }

    @Override
    public int v() {
        x0 x0Var = (x0) this.f14480b;
        return x0Var.f5862m - x0Var.E();
    }

    @Override
    public void w() {
        ((n0) this.f14480b).M0 = true;
    }

    @Override
    public l3.e x() {
        return (l3.e) this.f14480b;
    }

    @Override
    public k3.b y() {
        return null;
    }

    public void z(int i10, boolean z10) {
        t tVar = (t) this.f14480b;
        if (z10) {
            tVar.b(i10);
        } else {
            tVar.getClass();
        }
    }

    public i(Object obj, int i10) {
        this.f14479a = i10;
        this.f14480b = obj;
    }

    public i(byte[] bArr, int i10) {
        this.f14479a = 9;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i10);
        this.f14480b = byteBufferWrap;
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public i(Context context) {
        String strD;
        this.f14479a = 0;
        b bVarA = b.a(context);
        this.f14480b = bVarA;
        bVarA.b();
        String strD2 = bVarA.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strD2) || (strD = bVarA.d(b.f("googleSignInOptions", strD2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(strD);
        } catch (JSONException unused) {
        }
    }

    @Override
    public float get() {
        va vaVar = (va) this.f14480b;
        int i10 = vaVar.B1;
        m currentBrush = vaVar.K0.getCurrentBrush();
        if (currentBrush == null) {
            return r0.e(i10).f50060i;
        }
        return r0.e(i10).f(String.valueOf(m.f49979a.indexOf(currentBrush)), currentBrush.d());
    }

    public i(k9.c cVar) {
        this.f14479a = 29;
        this.f14480b = new File(cVar.f15099b, "com.crashlytics.settings.json");
    }

    public i(int i10) {
        this.f14479a = i10;
        switch (i10) {
            case 15:
                break;
            case 16:
                this.f14480b = new t();
                break;
            default:
                this.f14480b = new CopyOnWriteArrayList();
                break;
        }
    }

    private final void C() {
    }

    private final void D() {
    }

    @Override
    public void r() {
    }

    @Override
    public void e(b6.a aVar) {
    }

    @Override
    public void h(b6.a aVar) {
    }
}
