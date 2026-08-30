package o5;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.Window;
import androidx.biometric.q;
import androidx.biometric.r;
import androidx.biometric.u;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.k0;
import androidx.fragment.app.v;
import androidx.lifecycle.a0;
import androidx.lifecycle.z;
import androidx.profileinstaller.ProfileInstallReceiver;
import b6.p;
import b7.y0;
import cg.f1;
import cg.f2;
import cg.m;
import cg.m1;
import cg.n1;
import cg.p1;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.i4;
import com.google.android.gms.internal.play_billing.s1;
import com.google.android.gms.tasks.TaskCompletionSource;
import dg.s2;
import gg.y1;
import i9.n;
import i9.y;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import l.w;
import l3.t;
import lh.g5;
import mg.q0;
import nh.d4;
import nh.z8;
import org.json.JSONException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.aq0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ft0;
import org.telegram.ui.ru0;
public final class i implements a0, androidx.activity.result.b, s, s2, e2.d, a3.b, o, w, t, aq0, m.k, ok0, ru0, o0.a {
    public static i f16455c;
    public final int f16456a;
    public Object f16457b;

    public i(g6.g gVar, g6.a aVar) {
        this.f16456a = 19;
        this.f16457b = aVar;
    }

    public static int D(int i10, String str) {
        int P = P(i10);
        int x10 = x(str);
        return Q(x10) + x10 + P;
    }

    public static void K(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            char c3 = 57343;
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
                            } else if ((charAt2 < 55296 || c3 < charAt2) && i10 <= i12 - 3) {
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
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i11 - 1);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i10);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i11++;
                            c3 = 57343;
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
                char c10 = charAt4;
                if (charAt4 >= 128) {
                    if (charAt4 < 2048) {
                        byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                        c10 = (charAt4 & '?') | 128;
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
                            StringBuilder sb3 = new StringBuilder(39);
                            sb3.append("Unpaired surrogate at index ");
                            sb3.append(i11 - 1);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        byteBuffer.put((byte) ((charAt4 >>> '\f') | 480));
                        byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                        i11++;
                    }
                }
                byteBuffer.put((byte) c10);
                i11++;
            }
            return;
        }
        throw new ReadOnlyBufferException();
    }

    public static int O(long j10) {
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

    public static int P(int i10) {
        return Q(i10 << 3);
    }

    public static int Q(int i10) {
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

    public static synchronized i p(Context context) {
        i u10;
        synchronized (i.class) {
            u10 = u(context.getApplicationContext());
        }
        return u10;
    }

    public static synchronized i u(Context context) {
        synchronized (i.class) {
            i iVar = f16455c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            f16455c = iVar2;
            return iVar2;
        }
    }

    public static int x(CharSequence charSequence) {
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
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i11);
                                throw new IllegalArgumentException(sb.toString());
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
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i12 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    public void A(int i10, byte[] bArr) {
        I(i10, 2);
        C(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f16457b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new y0(byteBuffer.position(), byteBuffer.limit());
    }

    public void B(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.f16457b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new y0(byteBuffer.position(), byteBuffer.limit());
    }

    public void C(int i10) {
        while ((i10 & (-128)) != 0) {
            B((i10 & 127) | 128);
            i10 >>>= 7;
        }
        B(i10);
    }

    public void E() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f16457b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long M = M();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + M);
    }

    @Override
    public void F(float f10) {
        ft0 ft0Var = (ft0) this.f16457b;
        f1.e(ft0Var.M1).k(String.valueOf(m.f2447a.indexOf(ft0Var.T0.getCurrentBrush())), f10);
        f2 f2Var = ft0Var.H1;
        f2Var.f2403c = f10;
        ft0Var.s0(f2Var, null);
    }

    @Override
    public void H(MessageObject messageObject) {
        ((z8) ((d4) this.f16457b).N1).f(false);
    }

    public void I(int i10, int i11) {
        C((i10 << 3) | i11);
    }

    @Override
    public Cursor J(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f16457b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    public void L(long j10) {
        long M = M();
        if (M != j10) {
            if (M != -1) {
                if (M == -2) {
                    M = -2;
                } else {
                    return;
                }
            }
            StringBuilder s6 = android.support.v4.media.a.s(j10, "expected non-string scope or scope ", " but found ");
            s6.append(M);
            throw new IOException(s6.toString());
        }
    }

    public long M() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f16457b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    public void N(long j10) {
        while (((-128) & j10) != 0) {
            B((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        B((int) j10);
    }

    @Override
    public void a(long j10) {
        f7.b bVar = ((com.google.android.exoplayer2.ext.ffmpeg.b) this.f16457b).B;
        Handler handler = (Handler) bVar.f6012b;
        if (handler != null) {
            handler.post(new y1(bVar, j10, 1));
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f16456a) {
            case 11:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                d6.a aVar = (d6.a) ((d6.c) obj).u();
                Parcel G0 = aVar.G0();
                y6.a.c(G0, (p) this.f16457b);
                try {
                    aVar.f124b.transact(1, G0, null, 1);
                    G0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    G0.recycle();
                    throw th2;
                }
            case 19:
                g6.f fVar = new g6.f(0, (TaskCompletionSource) obj2);
                g6.e eVar = (g6.e) ((g6.h) obj).u();
                Parcel G02 = eVar.G0();
                y6.a.d(G02, fVar);
                y6.a.c(G02, (g6.a) this.f16457b);
                eVar.H0(G02, 1);
                return;
            default:
                j8.j jVar = (j8.j) this.f16457b;
                s7.b bVar = (s7.b) obj;
                Bundle G = bVar.G();
                G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                s7.a aVar2 = new s7.a(0, (TaskCompletionSource) obj2);
                try {
                    s7.i iVar = (s7.i) bVar.u();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = s7.c.f44100a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar2);
                    iVar.f44108a.transact(19, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e);
                    Bundle bundle = Bundle.EMPTY;
                    aVar2.l0(Status.h, null);
                    return;
                }
        }
    }

    public void b(x5.k kVar, androidx.biometric.w wVar) {
        k0 k0Var = (k0) this.f16457b;
        if (k0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (k0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            k0 k0Var2 = (k0) this.f16457b;
            r rVar = (r) k0Var2.D("androidx.biometric.BiometricFragment");
            if (rVar == null) {
                rVar = new r();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0Var2);
                aVar.f(0, rVar, "androidx.biometric.BiometricFragment");
                aVar.e(true, true);
                k0Var2.A(true);
                k0Var2.E();
            }
            v k10 = rVar.k();
            if (k10 == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                return;
            }
            androidx.biometric.a0 a0Var = rVar.f504i0;
            a0Var.f458f = kVar;
            int i10 = kVar.f46823a;
            if (i10 == 0) {
                if (wVar != null) {
                    i10 = 15;
                } else {
                    i10 = 255;
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && i11 < 30 && i10 == 15 && wVar == null) {
                a0Var.f459g = ee.b.b();
            } else {
                a0Var.f459g = wVar;
            }
            if (rVar.Q()) {
                rVar.f504i0.f462k = rVar.q(2131701341);
            } else {
                rVar.f504i0.f462k = null;
            }
            if (rVar.Q() && new androidx.biometric.e(new u(k10, 0)).i(255) != 0) {
                rVar.f504i0.f465n = true;
                rVar.S();
            } else if (rVar.f504i0.f467p) {
                rVar.f503h0.postDelayed(new q(rVar), 600L);
            } else {
                rVar.X();
            }
        }
    }

    @Override
    public void c(l.k kVar, boolean z4) {
        ((g.q) this.f16457b).g(kVar);
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f16457b;
        if (contentProviderClient != null) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                i4.g((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    public void d() {
        n1 n1Var = ((p1) this.f16457b).d;
        if (n1Var != null) {
            m1 m1Var = n1Var.f2482s;
            if (m1Var != null) {
                n1Var.cancelRunnable(m1Var);
                n1Var.f2482s = null;
            }
            m1 m1Var2 = new m1(n1Var, 1);
            n1Var.f2482s = m1Var2;
            n1Var.postRunnable(m1Var2, 1L);
        }
    }

    @Override
    public boolean e0(l.k kVar) {
        Window.Callback callback = ((g.q) this.f16457b).f6300f.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    @Override
    public void f(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        j0 j0Var = (j0) this.f16457b;
        f0 f0Var = (f0) j0Var.F.pollFirst();
        if (f0Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = f0Var.f843a;
        int i10 = f0Var.f844b;
        androidx.fragment.app.s v = j0Var.f857c.v(str);
        if (v == null) {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
            return;
        }
        v.x(i10, aVar.f329a, aVar.f330b);
    }

    @Override
    public TextureView f0() {
        return null;
    }

    public StringBuilder g() {
        pe.a aVar = (pe.a) this.f16457b;
        if (aVar instanceof ke.o) {
            StringBuilder sb = ((ke.o) aVar).f10403b.f10389b;
            if (sb.length() != 0) {
                return sb;
            }
            return null;
        }
        return null;
    }

    @Override
    public Object mo0get() {
        return new f3.j((Context) ((rc.a) this.f16457b).mo0get(), "com.google.android.datatransport.events", Integer.valueOf(f3.j.d).intValue());
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public void i(View view, q0 q0Var, boolean z4, boolean z10) {
        mg.v vVar = (mg.v) this.f16457b;
        vVar.f14150a.ab(null, vVar.e, vVar.f14151b, view, 0.0f, 0.0f, q0Var, false, z4, z10, false);
        AndroidUtilities.runOnUIThread(new lh.b(this, 18));
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public void k(int i10, long j10, long j11) {
        f7.b bVar = ((com.google.android.exoplayer2.ext.ffmpeg.b) this.f16457b).B;
        Handler handler = (Handler) bVar.f6012b;
        if (handler != null) {
            handler.post(new g5.d(bVar, i10, j10, j11, 1));
        }
    }

    @Override
    public void l() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public void m(e3.g gVar, Thread thread, Throwable th2) {
        n nVar = (n) this.f16457b;
        synchronized (nVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    y.a(nVar.e.W(new i9.l(nVar, System.currentTimeMillis(), th2, thread, gVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    @Override
    public void m0(Object obj) {
        switch (this.f16456a) {
            case 2:
                r rVar = (r) this.f16457b;
                if (((Boolean) obj).booleanValue()) {
                    if (rVar.R()) {
                        rVar.W(rVar.q(2131701363));
                    }
                    androidx.biometric.a0 a0Var = rVar.f504i0;
                    if (!a0Var.f465n) {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    } else {
                        Executor executor = a0Var.d;
                        if (executor == null) {
                            executor = new androidx.biometric.p(1);
                        }
                        executor.execute(new androidx.biometric.h(rVar, 0));
                    }
                    androidx.biometric.a0 a0Var2 = rVar.f504i0;
                    if (a0Var2.f472u == null) {
                        a0Var2.f472u = new z();
                    }
                    androidx.biometric.a0.h(a0Var2.f472u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                androidx.lifecycle.t tVar = (androidx.lifecycle.t) obj;
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.f16457b;
                if (tVar != null && pVar.f910o0) {
                    pVar.getClass();
                    throw new IllegalStateException("Fragment " + pVar + " did not return a View from onCreateView() or this was called before onCreateView().");
                }
                return;
        }
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z4) {
        f7.b bVar = ((com.google.android.exoplayer2.ext.ffmpeg.b) this.f16457b).B;
        Handler handler = (Handler) bVar.f6012b;
        if (handler != null) {
            handler.post(new jh.f(1, bVar, z4));
        }
    }

    @Override
    public void r(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        u7.c cVar = (u7.c) obj;
        androidx.activity.o oVar = ((f7.j) this.f16457b).f6024b;
        synchronized (oVar) {
            oVar.f317a = false;
            nVar = ((com.google.android.gms.common.api.internal.p) oVar.f318b).f2843c;
        }
        if (nVar != null) {
            ((f7.d) oVar.f319c).c(nVar, 2441);
        }
    }

    @Override
    public boolean s() {
        return false;
    }

    public synchronized void t() {
        synchronized (this) {
            b bVar = (b) this.f16457b;
            ReentrantLock reentrantLock = bVar.f16439a;
            reentrantLock.lock();
            bVar.f16440b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    @Override
    public void t0() {
        ic k10 = ((g5) this.f16457b).getBulletinFactory().k(false);
        k10.f25682t = true;
        k10.j();
    }

    public String toString() {
        switch (this.f16456a) {
            case 7:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f16457b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override
    public void v(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f16457b).setResultCode(i10);
    }

    @Override
    public void w(Exception exc) {
        h5.a.p("DecoderAudioRenderer", "Audio sink error", exc);
        f7.b bVar = ((com.google.android.exoplayer2.ext.ffmpeg.b) this.f16457b).B;
        Handler handler = (Handler) bVar.f6012b;
        if (handler != null) {
            handler.post(new l3.o(bVar, exc, 1));
        }
    }

    @Override
    public void w0(MessageObject messageObject) {
        ((z8) ((d4) this.f16457b).N1).f(true);
    }

    @Override
    public void y() {
        ((com.google.android.exoplayer2.ext.ffmpeg.b) this.f16457b).T = true;
    }

    public void z(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f16457b;
        I(i10, 2);
        try {
            int Q = Q(str.length());
            if (Q == Q(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= Q) {
                    byteBuffer.position(position + Q);
                    K(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    C((position2 - position) - Q);
                    byteBuffer.position(position2);
                    return;
                }
                throw new y0(position + Q, byteBuffer.limit());
            }
            C(x(str));
            K(str, byteBuffer);
        } catch (BufferOverflowException e) {
            y0 y0Var = new y0(byteBuffer.position(), byteBuffer.limit());
            y0Var.initCause(e);
            throw y0Var;
        }
    }

    public i(Object obj, int i10) {
        this.f16456a = i10;
        this.f16457b = obj;
    }

    public i(byte[] bArr, int i10) {
        this.f16456a = 10;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.f16457b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public i(int i10) {
        this.f16456a = i10;
        switch (i10) {
            case 20:
                return;
            default:
                this.f16457b = new ArrayDeque(16);
                return;
        }
    }

    public i(Context context) {
        String d;
        this.f16456a = 0;
        b a2 = b.a(context);
        this.f16457b = a2;
        a2.b();
        String d10 = a2.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(d10) || (d = a2.d(b.f("googleSignInOptions", d10))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.e(d);
        } catch (JSONException unused) {
        }
    }

    @Override
    public float get() {
        ft0 ft0Var = (ft0) this.f16457b;
        int i10 = ft0Var.M1;
        m currentBrush = ft0Var.T0.getCurrentBrush();
        if (currentBrush == null) {
            return f1.e(i10).f2397i;
        }
        return f1.e(i10).f(String.valueOf(m.f2447a.indexOf(currentBrush)), currentBrush.d());
    }

    public i(Context context, Uri uri) {
        this.f16456a = 29;
        this.f16457b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public i(LaunchActivity launchActivity, Executor executor, s1 s1Var) {
        this.f16456a = 3;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s6 = launchActivity.s();
            androidx.biometric.a0 a0Var = (androidx.biometric.a0) new androidx.biometric.e(launchActivity).n(androidx.biometric.a0.class);
            this.f16457b = s6;
            a0Var.d = executor;
            a0Var.e = s1Var;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void G() {
    }

    @Override
    public void V() {
    }

    @Override
    public void e() {
    }

    @Override
    public void o() {
    }

    @Override
    public void q() {
    }

    @Override
    public void n(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
