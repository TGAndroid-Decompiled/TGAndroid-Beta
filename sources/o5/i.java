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
import androidx.biometric.v;
import androidx.biometric.z;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.k0;
import androidx.fragment.app.p;
import androidx.lifecycle.a0;
import androidx.profileinstaller.ProfileInstallReceiver;
import cg.f1;
import cg.f2;
import cg.m;
import cg.m1;
import cg.n1;
import cg.p1;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.i4;
import com.google.android.gms.internal.play_billing.s1;
import com.google.android.gms.tasks.TaskCompletionSource;
import dg.s2;
import gg.y1;
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
import m.y0;
import mg.q0;
import nh.d4;
import nh.z8;
import org.json.JSONException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mt0;
import org.telegram.ui.yu0;
public class i implements a0, androidx.activity.result.b, s, s2, e2.d, a3.b, o, w, t, y0, ok0, yu0, o0.a {
    public static i f16437c;
    public final int f16438a;
    public Object f16439b;

    public i(g6.g gVar, g6.a aVar) {
        this.f16438a = 19;
        this.f16439b = aVar;
    }

    public static int B(CharSequence charSequence) {
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

    public static int J(int i10, String str) {
        int R = R(i10);
        int B = B(str);
        return S(B) + B + R;
    }

    public static void M(CharSequence charSequence, ByteBuffer byteBuffer) {
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

    public static int Q(long j10) {
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

    public static int R(int i10) {
        return S(i10 << 3);
    }

    public static int S(int i10) {
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

    public static synchronized i v(Context context) {
        i z4;
        synchronized (i.class) {
            z4 = z(context.getApplicationContext());
        }
        return z4;
    }

    public static synchronized i z(Context context) {
        synchronized (i.class) {
            i iVar = f16437c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            f16437c = iVar2;
            return iVar2;
        }
    }

    @Override
    public void A(float f10) {
        mt0 mt0Var = (mt0) this.f16439b;
        f1.e(mt0Var.M1).k(String.valueOf(m.f2430a.indexOf(mt0Var.T0.getCurrentBrush())), f10);
        f2 f2Var = mt0Var.H1;
        f2Var.f2386c = f10;
        mt0Var.s0(f2Var, null);
    }

    public void C(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f16439b;
        L(i10, 2);
        try {
            int S = S(str.length());
            if (S == S(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= S) {
                    byteBuffer.position(position + S);
                    M(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    I((position2 - position) - S);
                    byteBuffer.position(position2);
                    return;
                }
                throw new b7.y0(position + S, byteBuffer.limit());
            }
            I(B(str));
            M(str, byteBuffer);
        } catch (BufferOverflowException e) {
            b7.y0 y0Var = new b7.y0(byteBuffer.position(), byteBuffer.limit());
            y0Var.initCause(e);
            throw y0Var;
        }
    }

    public void D(int i10, byte[] bArr) {
        L(i10, 2);
        I(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f16439b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new b7.y0(byteBuffer.position(), byteBuffer.limit());
    }

    public void E(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.f16439b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new b7.y0(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public void G(Object obj) {
        switch (this.f16438a) {
            case 2:
                q qVar = (q) this.f16439b;
                if (((Boolean) obj).booleanValue()) {
                    if (qVar.R()) {
                        qVar.W(qVar.q(2131689598));
                    }
                    z zVar = qVar.f497i0;
                    if (!zVar.f514n) {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    } else {
                        Executor executor = zVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.o(1);
                        }
                        executor.execute(new androidx.biometric.g(qVar, 0));
                    }
                    z zVar2 = qVar.f497i0;
                    if (zVar2.f521u == null) {
                        zVar2.f521u = new androidx.lifecycle.z();
                    }
                    z.h(zVar2.f521u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                androidx.lifecycle.t tVar = (androidx.lifecycle.t) obj;
                p pVar = (p) this.f16439b;
                if (tVar != null && pVar.f921o0) {
                    pVar.getClass();
                    throw new IllegalStateException("Fragment " + pVar + " did not return a View from onCreateView() or this was called before onCreateView().");
                }
                return;
        }
    }

    @Override
    public void H(MessageObject messageObject) {
        ((z8) ((d4) this.f16439b).N1).f(false);
    }

    public void I(int i10) {
        while ((i10 & (-128)) != 0) {
            E((i10 & 127) | 128);
            i10 >>>= 7;
        }
        E(i10);
    }

    public void K() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f16439b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long O = O();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + O);
    }

    public void L(int i10, int i11) {
        I((i10 << 3) | i11);
    }

    public void N(long j10) {
        long O = O();
        if (O != j10) {
            if (O != -1) {
                if (O == -2) {
                    O = -2;
                } else {
                    return;
                }
            }
            StringBuilder s6 = android.support.v4.media.a.s(j10, "expected non-string scope or scope ", " but found ");
            s6.append(O);
            throw new IOException(s6.toString());
        }
    }

    public long O() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f16439b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    public void P(long j10) {
        while (((-128) & j10) != 0) {
            E((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        E((int) j10);
    }

    @Override
    public void a(long j10) {
        f7.b bVar = ((com.google.android.exoplayer2.ext.ffmpeg.b) this.f16439b).B;
        Handler handler = (Handler) bVar.f6001b;
        if (handler != null) {
            handler.post(new y1(bVar, j10, 1));
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f16438a) {
            case 11:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                d6.a aVar = (d6.a) ((d6.c) obj).u();
                Parcel G0 = aVar.G0();
                y6.a.c(G0, (b6.p) this.f16439b);
                try {
                    aVar.f123b.transact(1, G0, null, 1);
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
                y6.a.c(G02, (g6.a) this.f16439b);
                eVar.H0(G02, 1);
                return;
            default:
                j8.j jVar = (j8.j) this.f16439b;
                s7.b bVar = (s7.b) obj;
                Bundle G = bVar.G();
                G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                s7.a aVar2 = new s7.a(0, (TaskCompletionSource) obj2);
                try {
                    s7.i iVar = (s7.i) bVar.u();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = s7.c.f44165a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar2);
                    iVar.f44173a.transact(19, obtain, null, 1);
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

    @Override
    public Cursor b(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f16439b;
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

    @Override
    public void c(l.k kVar, boolean z4) {
        ((g.q) this.f16439b).g(kVar);
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f16439b;
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

    @Override
    public TextureView e0() {
        return null;
    }

    @Override
    public void g(Object obj) {
        n nVar;
        u7.c cVar = (u7.c) obj;
        androidx.activity.o oVar = ((f7.j) this.f16439b).f6013b;
        synchronized (oVar) {
            oVar.f332a = false;
            nVar = ((com.google.android.gms.common.api.internal.p) oVar.f333b).f2826c;
        }
        if (nVar != null) {
            ((f7.d) oVar.f334c).c(nVar, 2441);
        }
    }

    @Override
    public Object mo28get() {
        return new f3.j((Context) ((rc.a) this.f16439b).mo28get(), "com.google.android.datatransport.events", Integer.valueOf(f3.j.d).intValue());
    }

    public void h(x5.k kVar, v vVar) {
        k0 k0Var = (k0) this.f16439b;
        if (k0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (k0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            k0 k0Var2 = (k0) this.f16439b;
            q qVar = (q) k0Var2.D("androidx.biometric.BiometricFragment");
            if (qVar == null) {
                qVar = new q();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0Var2);
                aVar.f(0, qVar, "androidx.biometric.BiometricFragment");
                aVar.e(true, true);
                k0Var2.A(true);
                k0Var2.E();
            }
            androidx.fragment.app.v k10 = qVar.k();
            if (k10 == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                return;
            }
            z zVar = qVar.f497i0;
            zVar.f507f = kVar;
            int i10 = kVar.f46890a;
            if (i10 == 0) {
                if (vVar != null) {
                    i10 = 15;
                } else {
                    i10 = 255;
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && i11 < 30 && i10 == 15 && vVar == null) {
                zVar.f508g = ee.b.b();
            } else {
                zVar.f508g = vVar;
            }
            if (qVar.Q()) {
                qVar.f497i0.f511k = qVar.q(2131689576);
            } else {
                qVar.f497i0.f511k = null;
            }
            if (qVar.Q() && new af.d(new androidx.biometric.t(k10, 0)).i(255) != 0) {
                qVar.f497i0.f514n = true;
                qVar.S();
            } else if (qVar.f497i0.f516p) {
                qVar.f496h0.postDelayed(new androidx.biometric.p(qVar), 600L);
            } else {
                qVar.X();
            }
        }
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public void j(View view, q0 q0Var, boolean z4, boolean z10) {
        mg.v vVar = (mg.v) this.f16439b;
        vVar.f14138a.ab(null, vVar.e, vVar.f14139b, view, 0.0f, 0.0f, q0Var, false, z4, z10, false);
        AndroidUtilities.runOnUIThread(new lh.b(this, 18));
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public void m0() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public void n(int i10, long j10, long j11) {
        f7.b bVar = ((com.google.android.exoplayer2.ext.ffmpeg.b) this.f16439b).B;
        Handler handler = (Handler) bVar.f6001b;
        if (handler != null) {
            handler.post(new g5.d(bVar, i10, j10, j11, 1));
        }
    }

    @Override
    public boolean o() {
        return false;
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z4) {
        f7.b bVar = ((com.google.android.exoplayer2.ext.ffmpeg.b) this.f16439b).B;
        Handler handler = (Handler) bVar.f6001b;
        if (handler != null) {
            handler.post(new jh.f(1, bVar, z4));
        }
    }

    @Override
    public boolean p(l.k kVar) {
        Window.Callback callback = ((g.q) this.f16439b).f6300f.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    public void q() {
        n1 n1Var = ((p1) this.f16439b).d;
        if (n1Var != null) {
            m1 m1Var = n1Var.f2465s;
            if (m1Var != null) {
                n1Var.cancelRunnable(m1Var);
                n1Var.f2465s = null;
            }
            m1 m1Var2 = new m1(n1Var, 1);
            n1Var.f2465s = m1Var2;
            n1Var.postRunnable(m1Var2, 1L);
        }
    }

    @Override
    public void r0(int i10, Object obj) {
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
        ((ProfileInstallReceiver) this.f16439b).setResultCode(i10);
    }

    public StringBuilder s() {
        pe.a aVar = (pe.a) this.f16439b;
        if (aVar instanceof ke.o) {
            StringBuilder sb = ((ke.o) aVar).f10382b.f10368b;
            if (sb.length() != 0) {
                return sb;
            }
            return null;
        }
        return null;
    }

    public void t(e3.g gVar, Thread thread, Throwable th2) {
        i9.n nVar = (i9.n) this.f16439b;
        synchronized (nVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    y.a(nVar.e.I(new i9.l(nVar, System.currentTimeMillis(), th2, thread, gVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    public String toString() {
        switch (this.f16438a) {
            case 7:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f16439b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override
    public void u(Exception exc) {
        h5.a.p("DecoderAudioRenderer", "Audio sink error", exc);
        f7.b bVar = ((com.google.android.exoplayer2.ext.ffmpeg.b) this.f16439b).B;
        Handler handler = (Handler) bVar.f6001b;
        if (handler != null) {
            handler.post(new l3.o(bVar, exc, 1));
        }
    }

    public synchronized void w() {
        synchronized (this) {
            b bVar = (b) this.f16439b;
            ReentrantLock reentrantLock = bVar.f16421a;
            reentrantLock.lock();
            bVar.f16422b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    @Override
    public void w0(MessageObject messageObject) {
        ((z8) ((d4) this.f16439b).N1).f(true);
    }

    @Override
    public void x(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        j0 j0Var = (j0) this.f16439b;
        f0 f0Var = (f0) j0Var.F.pollFirst();
        if (f0Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = f0Var.f854a;
        int i10 = f0Var.f855b;
        androidx.fragment.app.s r10 = j0Var.f868c.r(str);
        if (r10 == null) {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
            return;
        }
        r10.x(i10, aVar.f344a, aVar.f345b);
    }

    @Override
    public void y() {
        ((com.google.android.exoplayer2.ext.ffmpeg.b) this.f16439b).T = true;
    }

    public i(Object obj, int i10) {
        this.f16438a = i10;
        this.f16439b = obj;
    }

    public i(byte[] bArr, int i10) {
        this.f16438a = 10;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.f16439b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public i(int i10) {
        this.f16438a = i10;
        switch (i10) {
            case 20:
                return;
            case 25:
                this.f16439b = new f7.b[lf.b.values().length];
                return;
            default:
                this.f16439b = new ArrayDeque(16);
                return;
        }
    }

    @Override
    public float get() {
        mt0 mt0Var = (mt0) this.f16439b;
        int i10 = mt0Var.M1;
        m currentBrush = mt0Var.T0.getCurrentBrush();
        if (currentBrush == null) {
            return f1.e(i10).f2380i;
        }
        return f1.e(i10).f(String.valueOf(m.f2430a.indexOf(currentBrush)), currentBrush.d());
    }

    public i(Context context) {
        String d;
        this.f16438a = 0;
        b a2 = b.a(context);
        this.f16439b = a2;
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

    public i(Context context, Uri uri) {
        this.f16438a = 29;
        this.f16439b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public i(LaunchActivity launchActivity, Executor executor, s1 s1Var) {
        this.f16438a = 3;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s6 = launchActivity.s();
            z zVar = (z) new af.d(launchActivity).m(z.class);
            this.f16439b = s6;
            zVar.d = executor;
            zVar.e = s1Var;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void F() {
    }

    @Override
    public void e() {
    }

    @Override
    public void m() {
    }

    @Override
    public void r() {
    }

    public void d(int i10) {
    }

    public void f(int i10) {
    }

    @Override
    public void l(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
