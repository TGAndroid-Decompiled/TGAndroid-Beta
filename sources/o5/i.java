package o5;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.c0;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.biometric.r;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.a0;
import b6.p;
import b7.y0;
import c2.u;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import dg.l1;
import dg.m1;
import dg.o1;
import f2.l0;
import f2.p0;
import h5.d0;
import j7.p5;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import la.b0;
import m.i1;
import mh.g5;
import oh.f4;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.json.JSONException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.aq0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.u5;
import org.telegram.ui.cv0;
import org.telegram.ui.u61;
import s5.m;
public final class i implements a0, androidx.activity.result.b, s, l0, a3.b, o, i1, Continuation, m.k, aq0, u61, WebMessageListenerBoundaryInterface, k1 {
    public static i f16615c;
    public final int f16616a;
    public final Object f16617b;

    public i(Object obj, int i10) {
        this.f16616a = i10;
        this.f16617b = obj;
    }

    public static synchronized i B(Context context) {
        i G;
        synchronized (i.class) {
            G = G(context.getApplicationContext());
        }
        return G;
    }

    public static synchronized i G(Context context) {
        synchronized (i.class) {
            i iVar = f16615c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            f16615c = iVar2;
            return iVar2;
        }
    }

    public static int I(CharSequence charSequence) {
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

    public static int d0(int i10, String str) {
        int r02 = r0(i10);
        int I = I(str);
        return t0(I) + I + r02;
    }

    public static void h0(CharSequence charSequence, ByteBuffer byteBuffer) {
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
                } catch (ArrayIndexOutOfBoundsException e6) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e6);
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

    public static int o0(long j10) {
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

    public static int r0(int i10) {
        return t0(i10 << 3);
    }

    public static int t0(int i10) {
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

    public void A(String str, String str2) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(android.support.v4.media.a.o("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f16617b).putCharSequence(str, str2);
    }

    @Override
    public boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override
    public void C(int i10, int i11) {
        ((p0) this.f16617b).p(i10, i11);
    }

    @Override
    public boolean E2(int i10) {
        return false;
    }

    public synchronized void F() {
        synchronized (this) {
            b bVar = (b) this.f16617b;
            ReentrantLock reentrantLock = bVar.f16598a;
            reentrantLock.lock();
            bVar.f16599b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    @Override
    public boolean H1() {
        return false;
    }

    @Override
    public n9 I2() {
        return null;
    }

    public void J(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f16617b;
        e0(i10, 2);
        try {
            int t02 = t0(str.length());
            if (t02 == t0(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= t02) {
                    byteBuffer.position(position + t02);
                    h0(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    b0((position2 - position) - t02);
                    byteBuffer.position(position2);
                    return;
                }
                throw new y0(position + t02, byteBuffer.limit());
            }
            b0(I(str));
            h0(str, byteBuffer);
        } catch (BufferOverflowException e6) {
            y0 y0Var = new y0(byteBuffer.position(), byteBuffer.limit());
            y0Var.initCause(e6);
            throw y0Var;
        }
    }

    @Override
    public void L0(int i10, int i11) {
        ((p0) this.f16617b).t(i10, i11);
    }

    @Override
    public boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public boolean N1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public boolean P(t1 t1Var) {
        return false;
    }

    @Override
    public boolean P1() {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R0(long j10) {
        return false;
    }

    @Override
    public void U() {
        int i10 = this.f16616a;
    }

    @Override
    public void U0(int i10, t1 t1Var) {
        ea eaVar = (ea) this.f16617b;
        org.telegram.ui.Cells.g gVar = eaVar.v;
        if (eaVar.a()) {
            eaVar.f22784s = 2;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public void U1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        af.g.s(t1Var.getContext(), str);
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public void W(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        r rVar = (r) this.f16617b;
        if (charSequence != null) {
            if (rVar.R()) {
                rVar.W(charSequence);
            }
            rVar.f553i0.d(null);
        }
    }

    @Override
    public CharacterStyle W1(t1 t1Var) {
        return null;
    }

    public void X(int i10, byte[] bArr) {
        e0(i10, 2);
        b0(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f16617b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new y0(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public void X1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ea eaVar = (ea) this.f16617b;
        org.telegram.ui.Cells.g gVar = eaVar.v;
        if (eaVar.a()) {
            eaVar.f22784s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    public void Y(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.f16617b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new y0(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public boolean Y1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public vg.a Z() {
        return null;
    }

    public void a(int i10, boolean z4) {
        u uVar = (u) this.f16617b;
        if (z4) {
            uVar.b(i10);
        } else {
            uVar.getClass();
        }
    }

    @Override
    public boolean a0(t1 t1Var) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i10 = this.f16616a;
        Object obj3 = this.f16617b;
        switch (i10) {
            case 8:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                d6.a aVar = (d6.a) ((d6.c) obj).u();
                Parcel G0 = aVar.G0();
                y6.a.c(G0, (p) obj3);
                try {
                    aVar.f135b.transact(1, G0, null, 1);
                    G0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    G0.recycle();
                    throw th2;
                }
            case 18:
                j8.e eVar = (j8.e) obj3;
                s7.b bVar = (s7.b) obj;
                bVar.getClass();
                s7.a aVar2 = new s7.a(1, (TaskCompletionSource) obj2);
                try {
                    s7.i iVar = (s7.i) bVar.u();
                    Bundle G = bVar.G();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i11 = s7.c.f47105a;
                    obtain.writeInt(1);
                    eVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar2);
                    iVar.f47113a.transact(14, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e6) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e6);
                    Bundle bundle = Bundle.EMPTY;
                    p5.a(Status.h, Boolean.FALSE, aVar2.f47104b);
                    return;
                }
            default:
                o7.d dVar = new o7.d(1, (TaskCompletionSource) obj2);
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i12 = o7.a.f16620a;
                obtain2.writeStrongBinder(dVar);
                obtain2.writeInt(1);
                ((z7.c) obj3).writeToParcel(obtain2, 0);
                ((o7.c) ((o7.f) obj).u()).E0(obtain2, 1);
                return;
        }
    }

    public MediaMetadataCompat b() {
        return new MediaMetadataCompat((Bundle) this.f16617b);
    }

    public void b0(int i10) {
        while ((i10 & (-128)) != 0) {
            Y((i10 & 127) | 128);
            i10 >>>= 7;
        }
        Y(i10);
    }

    @Override
    public boolean b1(t1 t1Var, boolean z4) {
        return false;
    }

    public void c() {
        m1 m1Var = ((o1) this.f16617b).d;
        if (m1Var != null) {
            l1 l1Var = m1Var.f4612s;
            if (l1Var != null) {
                m1Var.cancelRunnable(l1Var);
                m1Var.f4612s = null;
            }
            l1 l1Var2 = new l1(m1Var, 1);
            m1Var.f4612s = l1Var2;
            m1Var.postRunnable(l1Var2, 1L);
        }
    }

    @Override
    public boolean c0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean d() {
        return ((ea) this.f16617b).a();
    }

    @Override
    public boolean e() {
        return true;
    }

    public void e0(int i10, int i11) {
        b0((i10 << 3) | i11);
    }

    @Override
    public boolean e2(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void f(Object obj) {
        ((u7.c) obj).onLocationAvailability((LocationAvailability) this.f16617b);
    }

    @Override
    public String g(t1 t1Var) {
        return null;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public boolean g1(int i10, t1 t1Var) {
        if (i10 == ((ea) this.f16617b).f22784s) {
            return true;
        }
        return false;
    }

    @Override
    public cv0 g2() {
        return null;
    }

    @Override
    public Object mo38get() {
        String packageName = ((Context) ((rc.a) this.f16617b).mo38get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override
    public void i1(int i10, int i11) {
        ((p0) this.f16617b).r(i10, i11, null);
    }

    @Override
    public void j0(int i10, int i11) {
        ((p0) this.f16617b).s(i10, i11);
    }

    @Override
    public boolean j2(long j10) {
        return false;
    }

    @Override
    public void k(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        j0 j0Var = (j0) this.f16617b;
        f0 f0Var = (f0) j0Var.F.pollLast();
        if (f0Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = f0Var.f915a;
        int i10 = f0Var.f916b;
        androidx.fragment.app.s r10 = j0Var.f929c.r(str);
        if (r10 == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            return;
        }
        r10.x(i10, aVar.f367a, aVar.f368b);
    }

    @Override
    public int k0(t1 t1Var) {
        return 0;
    }

    @Override
    public void k2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
        ea eaVar = (ea) this.f16617b;
        org.telegram.ui.Cells.g gVar = eaVar.v;
        if (eaVar.a()) {
            eaVar.f22784s = 0;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean l2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    public void m0(long j10) {
        while (((-128) & j10) != 0) {
            Y((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        Y((int) j10);
    }

    @Override
    public boolean m1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public boolean n0() {
        return d();
    }

    @Override
    public void onPostMessage(android.webkit.WebView r9, java.lang.reflect.InvocationHandler r10, android.net.Uri r11, boolean r12, java.lang.reflect.InvocationHandler r13) {
        throw new UnsupportedOperationException("Method not decompiled: o5.i.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    public void p(b0 b0Var) {
        ((y2.o) ((v2.f) ((ba.b) this.f16617b).get())).a("FIREBASE_APPQUALITY_SESSION", new v2.c("json"), new hg.f(this, 20)).a(new v2.a(null, b0Var, v2.d.f48886a, null), new sg.a(29));
    }

    @Override
    public boolean q0(u5 u5Var) {
        return false;
    }

    @Override
    public Object then(Task task) {
        return ((Callable) this.f16617b).call();
    }

    public void u(m mVar) {
        v7.j jVar = (v7.j) this.f16617b;
        jVar.f48963a = mVar;
        Iterator it = jVar.f48965c.iterator();
        while (it.hasNext()) {
            ((l6.e) it.next()).b();
        }
        jVar.f48965c.clear();
        jVar.f48964b = null;
    }

    @Override
    public void u0() {
        switch (this.f16616a) {
            case 23:
                ic k10 = ((g5) this.f16617b).getBulletinFactory().k(false);
                k10.f27788t = true;
                k10.j();
                return;
            default:
                f4.j0((f4) this.f16617b);
                return;
        }
    }

    @Override
    public String v(long j10) {
        return null;
    }

    @Override
    public boolean v2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    public void w(String str, Bitmap bitmap) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(android.support.v4.media.a.o("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f16617b).putParcelable(str, bitmap);
    }

    public void x(long j10, String str) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.o("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f16617b).putLong(str, j10);
    }

    public i(byte[] bArr, int i10) {
        this.f16616a = 7;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.f16617b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public i(Context context) {
        String d;
        this.f16616a = 0;
        b a2 = b.a(context);
        this.f16617b = a2;
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

    public i(l3.d dVar) {
        this.f16616a = 19;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(dVar.f11494a).setFlags(dVar.f11495b).setUsage(dVar.f11496c);
        int i10 = d0.f7237a;
        if (i10 >= 29) {
            l3.b.a(usage, dVar.d);
        }
        if (i10 >= 32) {
            l3.c.a(usage, dVar.f11497e);
        }
        this.f16617b = usage.build();
    }

    public i(int i10) {
        this.f16616a = i10;
        switch (i10) {
            case 15:
                this.f16617b = new CopyOnWriteArrayList();
                return;
            case 16:
            default:
                this.f16617b = new Bundle();
                return;
            case 17:
                this.f16617b = new u();
                return;
        }
    }

    public i(MediaMetadataCompat mediaMetadataCompat) {
        this.f16616a = 1;
        Bundle bundle = new Bundle(mediaMetadataCompat.f245a);
        this.f16617b = bundle;
        c0.a(bundle);
    }

    private final void h() {
    }

    private final void l() {
    }

    @Override
    public void D0() {
    }

    @Override
    public void G2() {
    }

    @Override
    public void a2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void o() {
    }

    @Override
    public void p1() {
    }

    @Override
    public void r() {
    }

    @Override
    public void z2() {
    }

    @Override
    public void C0(t1 t1Var) {
    }

    @Override
    public void E(t1 t1Var) {
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(t1 t1Var) {
    }

    @Override
    public void J1(t1 t1Var) {
    }

    @Override
    public void K(t1 t1Var) {
    }

    @Override
    public void K0(t1 t1Var) {
    }

    @Override
    public void M(MessageObject messageObject) {
    }

    @Override
    public void N0(t1 t1Var) {
    }

    @Override
    public void R1(t1 t1Var) {
    }

    @Override
    public void S0(t1 t1Var) {
    }

    @Override
    public void T(t1 t1Var) {
    }

    @Override
    public void T1(MessageObject messageObject) {
    }

    @Override
    public void c1(t1 t1Var) {
    }

    @Override
    public void d1(t1 t1Var) {
    }

    @Override
    public void f0(int i10) {
    }

    @Override
    public void l0(t1 t1Var) {
    }

    @Override
    public void n(t1 t1Var) {
    }

    @Override
    public void o2(t1 t1Var) {
    }

    @Override
    public void p0(String str) {
    }

    @Override
    public void q(t1 t1Var) {
    }

    @Override
    public void s(t1 t1Var) {
    }

    @Override
    public void t(t1 t1Var) {
    }

    @Override
    public void w2(t1 t1Var) {
    }

    @Override
    public void y(t1 t1Var) {
    }

    @Override
    public void z(t1 t1Var) {
    }

    @Override
    public void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void L(int i10, t1 t1Var) {
    }

    @Override
    public void L1(t1 t1Var, boolean z4) {
    }

    @Override
    public void O1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void Q(t1 t1Var, kh.f fVar) {
    }

    @Override
    public void W0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void c2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void q2(t1 t1Var, long j10) {
    }

    @Override
    public void s1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void v1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void B1(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void F0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public void G0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void H2(t1 t1Var, int i10, int i11) {
    }

    @Override
    public void a1(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override
    public void i0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void s0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void d2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void x0(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void z0(t1 t1Var, float f10, float f11, boolean z4) {
    }

    @Override
    public void B2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }
}
