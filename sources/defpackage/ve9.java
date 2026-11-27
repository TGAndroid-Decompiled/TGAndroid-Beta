package defpackage;

import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.StickersActivity;
public final class ve9 implements qy9, hj, hf9, cg9, aea, nr7, ifc, n7a, dia, j63, tka, keb, ty9, tic, WebMessageListenerBoundaryInterface, s99, caa, s9 {
    public final byte a;
    public Object b;

    public ve9(View view) {
        this.a = (byte) 11;
        if (Build.VERSION.SDK_INT >= 30) {
            ?? pq8Var = new pq8(view, (byte) 16);
            pq8Var.c = view;
            this.b = pq8Var;
            return;
        }
        this.b = new pq8(view, (byte) 16);
    }

    public static int d0(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i3 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int l0(int i, String str) {
        int q0 = q0(i);
        int d0 = d0(str);
        return r0(d0) + d0 + q0;
    }

    public static void n0(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            char c = 57343;
            int i2 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i3 = remaining + arrayOffset;
                    while (i2 < length) {
                        int i4 = i2 + arrayOffset;
                        if (i4 >= i3 || (charAt = charSequence.charAt(i2)) >= 128) {
                            break;
                        }
                        array[i4] = (byte) charAt;
                        i2++;
                    }
                    if (i2 == length) {
                        i = arrayOffset + length;
                    } else {
                        i = arrayOffset + i2;
                        while (i2 < length) {
                            char charAt2 = charSequence.charAt(i2);
                            if (charAt2 < 128 && i < i3) {
                                array[i] = (byte) charAt2;
                                i++;
                            } else if (charAt2 < 2048 && i <= i3 - 2) {
                                int i5 = i + 1;
                                array[i] = (byte) ((charAt2 >>> 6) | 960);
                                i += 2;
                                array[i5] = (byte) ((charAt2 & '?') | 128);
                            } else if ((charAt2 < 55296 || c < charAt2) && i <= i3 - 3) {
                                array[i] = (byte) ((charAt2 >>> '\f') | 480);
                                int i6 = i + 2;
                                array[i + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i += 3;
                                array[i6] = (byte) ((charAt2 & '?') | 128);
                            } else if (i <= i3 - 4) {
                                int i7 = i2 + 1;
                                if (i7 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i7);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        array[i] = (byte) ((codePoint >>> 18) | 240);
                                        array[i + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i8 = i + 3;
                                        array[i + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i += 4;
                                        array[i8] = (byte) ((codePoint & 63) | 128);
                                        i2 = i7;
                                    } else {
                                        i2 = i7;
                                    }
                                }
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2 - 1);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i2++;
                            c = 57343;
                        }
                    }
                    byteBuffer.position(i - byteBuffer.arrayOffset());
                    return;
                } catch (ArrayIndexOutOfBoundsException e) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e);
                    throw bufferOverflowException;
                }
            }
            int length2 = charSequence.length();
            while (i2 < length2) {
                char charAt4 = charSequence.charAt(i2);
                char c2 = charAt4;
                if (charAt4 >= 128) {
                    if (charAt4 < 2048) {
                        byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                    } else if (charAt4 >= 55296 && 57343 >= charAt4) {
                        int i9 = i2 + 1;
                        if (i9 != charSequence.length()) {
                            char charAt5 = charSequence.charAt(i9);
                            if (Character.isSurrogatePair(charAt4, charAt5)) {
                                int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                i2 = i9;
                                i2++;
                            } else {
                                i2 = i9;
                            }
                        }
                        p3d.c(39, i2 - 1, "Unpaired surrogate at index ");
                        return;
                    } else {
                        byteBuffer.put((byte) ((charAt4 >>> '\f') | 480));
                        byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | 128));
                    }
                    c2 = (charAt4 & '?') | 128;
                }
                byteBuffer.put((byte) c2);
                i2++;
            }
            return;
        }
        throw new ReadOnlyBufferException();
    }

    public static int p0(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        if ((j & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    public static int q0(int i) {
        return r0(i << 3);
    }

    public static int r0(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        if ((i & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    @Override
    public final boolean A(int i) {
        nic nicVar = ((vic) this.b).M;
        if (nicVar == null) {
            return false;
        }
        return nicVar.c(i);
    }

    @Override
    public final void B(v8a v8aVar) {
        md1 md1Var = (md1) v8aVar;
    }

    @Override
    public final void B1() {
        ej9 ej9Var = ((gj9) this.b).H;
        if (ej9Var != null) {
            pi9 pi9Var = ((li9) ej9Var).a;
            ch9 ch9Var = pi9Var.R3;
            if (ch9Var != null) {
                ch9Var.g();
            }
            pi9Var.p3.onContentChanged();
        }
    }

    @Override
    public final void C(v8a v8aVar, boolean z) {
        md1 md1Var = (md1) v8aVar;
    }

    @Override
    public final void D(v8a v8aVar, int i) {
        md1 md1Var = (md1) v8aVar;
    }

    @Override
    public final boolean E() {
        switch (this.a) {
            case 4:
                if (hl.C3()) {
                    ((er9) this.b).J.k(0L, 33, null, null, null, null);
                }
                return true;
            default:
                ((StickersActivity) this.b).d0();
                return true;
        }
    }

    @Override
    public final amb E0() {
        ej9 ej9Var = ((gj9) this.b).H;
        if (ej9Var != null) {
            return ((li9) ej9Var).a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public final boolean F(dg9 dg9Var) {
        return false;
    }

    @Override
    public final void H() {
        ((fu5) this.b).j();
    }

    @Override
    public final long I(long j, long j2) {
        return 0L;
    }

    @Override
    public final void J(v8a v8aVar, int i) {
        md1 md1Var = (md1) v8aVar;
    }

    @Override
    public final b8 K(String str) {
        b8 g = ((fu5) this.b).g();
        g.setText(str);
        return g;
    }

    @Override
    public final void L(ArrayList arrayList) {
        nic nicVar = ((vic) this.b).M;
        if (nicVar == null) {
            return;
        }
        nicVar.a(arrayList);
    }

    @Override
    public final void L0(CharSequence charSequence) {
        ej9 ej9Var = ((gj9) this.b).H;
        if (ej9Var != null) {
            li9 li9Var = (li9) ej9Var;
            if (charSequence != null && charSequence.length() > 0) {
                li9Var.a.v4(charSequence.toString());
            }
        }
    }

    @Override
    public final void N(v8a v8aVar, String str) {
        md1 md1Var = (md1) v8aVar;
    }

    @Override
    public final void O() {
        r7a r7aVar = (r7a) this.b;
        HashMap hashMap = r7aVar.n;
        r7aVar.getNotificationCenter().k(jn7.R0, new HashMap(hashMap));
        hashMap.clear();
    }

    @Override
    public final void P(v8a v8aVar, String str) {
        kt6 kt6Var;
        md1 md1Var = (md1) v8aVar;
        he6 he6Var = pid.i;
        pid pidVar = (pid) this.b;
        he6Var.b("onSessionStarted with transferType = %d", Integer.valueOf(pidVar.e));
        if (pidVar.a.E && pidVar.e == 2) {
            if (pidVar.h == null) {
                he6Var.b("skip restoring session state due to null SessionState", new Object[0]);
            } else {
                v99 a = pidVar.a();
                if (a == null) {
                    he6Var.b("skip restoring session state due to null RemoteMediaClient", new Object[0]);
                } else {
                    he6Var.b("resume SessionState to current session", new Object[0]);
                    haa haaVar = pidVar.h;
                    if (haaVar != null && (kt6Var = haaVar.a) != null) {
                        v99.k.b("resume SessionState", new Object[0]);
                        xve.e("Must be called from the main thread.");
                        if (!a.w()) {
                            v99.t();
                        } else {
                            v99.x(new hed(a, kt6Var, (byte) 1));
                        }
                    }
                }
            }
        }
        pidVar.c();
    }

    @Override
    public final void Q(Editable editable) {
        ((pl9) this.b).g();
    }

    @Override
    public final boolean R() {
        return true;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        switch (this.a) {
            case 5:
                mq5 H0 = hl.H0(l2dVar, false);
                mu9 mu9Var = (mu9) this.b;
                mu9Var.w.setPadding(H0.a, H0.b, H0.c, H0.d);
                mu9Var.s.requestLayout();
                return l2d.b;
            default:
                ktb ktbVar = (ktb) this.b;
                mq5 g = l2dVar.a.g(519);
                ktbVar.n = g;
                ktbVar.c.setPadding(g.a, g.b, g.c, g.d);
                ktbVar.b.requestLayout();
                return l2d.b;
        }
    }

    @Override
    public final zlb S0() {
        return (gj9) this.b;
    }

    @Override
    public final void T(Location location) {
        r7a r7aVar = (r7a) this.b;
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeo.geo = tL_geoPoint;
        tL_geoPoint.lat = hl.b0(location.getLatitude());
        tL_messageMediaGeo.geo._long = hl.b0(location.getLongitude());
        HashMap hashMap = r7aVar.n;
        for (Map.Entry entry : hashMap.entrySet()) {
            r47 r47Var = (r47) entry.getValue();
            r7aVar.q0(p7a.d(tL_messageMediaGeo, r47.B0(r47Var.k), r47Var, null, null, null, true, 0));
        }
        hashMap.clear();
    }

    @Override
    public final void U(dg9 dg9Var) {
        mk0 mk0Var;
        pl9 pl9Var = (pl9) this.b;
        nl9 nl9Var = pl9Var.s;
        if (nl9Var != null && (mk0Var = pl9Var.a) != null) {
            pi9 pi9Var = ((wh9) nl9Var).a;
            ArrayList arrayList = pi9Var.t3;
            long j = mk0Var.t;
            if (j != 0) {
                int i = -1;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (((mk0) arrayList.get(i2)).k.contains(Long.valueOf(j))) {
                        i = i2;
                    }
                }
                if (i >= 0) {
                    ch9 ch9Var = pi9Var.R3;
                    if (ch9Var != null) {
                        ch9Var.d();
                    }
                    mk0 mk0Var2 = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = mk0Var.k;
                    ArrayList arrayList3 = mk0Var2.k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        qd4.v(1, arrayList3);
                    }
                    arrayList.add(i + 1, mk0Var2);
                    pi9Var.u4();
                    pi9Var.g3.O(false);
                    ch9 ch9Var2 = pi9Var.R3;
                    if (ch9Var2 != null) {
                        ch9Var2.h();
                    }
                    pi9Var.post(new jh9(pi9Var, mk0Var2, (byte) 26));
                }
            }
        }
    }

    @Override
    public final long V() {
        return 0L;
    }

    @Override
    public final boolean W(boolean z) {
        return false;
    }

    @Override
    public final mk0 X0() {
        return ((gj9) this.b).a;
    }

    @Override
    public final long Y(long j) {
        return 1L;
    }

    @Override
    public final b8 Z(int i, Runnable runnable, String str, boolean z, boolean z2) {
        fu5 fu5Var = (fu5) this.b;
        int y = fu5Var.y();
        fu5Var.b(i, str, new yn6(runnable, z2, fu5Var, (byte) 22), z);
        View x = fu5Var.x(y);
        if (x instanceof b8) {
            return (b8) x;
        }
        return null;
    }

    @Override
    public final void a(float f) {
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        vic vicVar = (vic) this.b;
        View[] viewArr = vicVar.e;
        if (i == 0) {
            if (viewArr[1] != null) {
                vicVar.H();
                vicVar.h.put(vicVar.f[1], viewArr[1]);
                vicVar.removeView(viewArr[1]);
                vicVar.G(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            vicVar.B(vicVar.b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (vicVar.E) {
            vicVar.G(view, (1.0f - f) * viewArr[0].getMeasuredWidth());
            View view2 = viewArr[0];
            vicVar.G(view2, (-view2.getMeasuredWidth()) * f);
        } else {
            vicVar.G(view, (1.0f - f) * (-viewArr[0].getMeasuredWidth()));
            View view3 = viewArr[0];
            vicVar.G(view3, view3.getMeasuredWidth() * f);
        }
        vicVar.y(false);
    }

    @Override
    public final long a0(long j, long j2) {
        return 1L;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 22:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                r7d r7dVar = (r7d) ((z7d) obj).k();
                Parcel c = r7dVar.c();
                v6d.b(c, (ikb) this.b);
                try {
                    r7dVar.b.transact(1, c, null, 1);
                    c.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th) {
                    c.recycle();
                    throw th;
                }
            case 23:
                g8d g8dVar = new g8d((TaskCompletionSource) obj2);
                c9d c9dVar = (c9d) ((i8d) obj).k();
                String str = ((h8d) this.b).l;
                Parcel e = c9dVar.e();
                int i = n8d.a;
                e.writeStrongBinder(g8dVar);
                e.writeString(str);
                c9dVar.f(e, 2);
                return;
            case 24:
                pt5 pt5Var = (pt5) this.b;
                nad nadVar = (nad) obj;
                nadVar.getClass();
                ead eadVar = new ead((TaskCompletionSource) obj2, (byte) 1);
                try {
                    mhf mhfVar = (mhf) nadVar.k();
                    Bundle B = nadVar.B();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i2 = rld.a;
                    obtain.writeInt(1);
                    pt5Var.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    B.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(eadVar);
                    mhfVar.a.transact(14, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e2) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e2);
                    Bundle bundle = Bundle.EMPTY;
                    vze.a(Status.h, Boolean.FALSE, eadVar.c);
                    return;
                }
            case 25:
                bmf bmfVar = (bmf) obj;
                qbd qbdVar = (qbd) bmfVar.k();
                kjd kjdVar = ((rjd) this.b).l;
                Parcel R = qbdVar.R();
                ald.d(R, kjdVar);
                qbdVar.W(R, 18);
                qbd qbdVar2 = (qbd) bmfVar.k();
                qbdVar2.W(qbdVar2.R(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
            default:
                twe tweVar = new twe((TaskCompletionSource) obj2, (byte) 1);
                gcd gcdVar = (gcd) ((v9f) obj).k();
                Parcel R2 = gcdVar.R();
                ald.d(R2, tweVar);
                R2.writeStringArray((String[]) this.b);
                gcdVar.W(R2, 6);
                return;
        }
    }

    @Override
    public final boolean b() {
        vic vicVar = (vic) this.b;
        if (!vicVar.y && !vicVar.I) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(int i, boolean z) {
        vic vicVar = (vic) this.b;
        vicVar.E = z;
        vicVar.d = i;
        vicVar.L(1);
        vicVar.A(i, z);
        View[] viewArr = vicVar.e;
        int i2 = 0;
        View view = viewArr[0];
        if (view != null) {
            i2 = view.getMeasuredWidth();
        }
        View view2 = viewArr[1];
        if (view2 != null) {
            if (z) {
                vicVar.G(view2, i2);
            } else {
                vicVar.G(view2, -i2);
            }
        }
    }

    public final hba c0(JSONObject jSONObject) {
        zba rj2Var;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            rj2Var = new faf((byte) 17);
        } else {
            rj2Var = new rj2((byte) 26);
        }
        return rj2Var.v0((z3f) this.b, jSONObject);
    }

    @Override
    public final void d() {
        ((vic) this.b).q();
    }

    @Override
    public final boolean d1() {
        ej9 ej9Var = ((gj9) this.b).H;
        if (ej9Var != null && ((li9) ej9Var).a.W4()) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(dg9 dg9Var) {
        switch (this.a) {
            case 2:
                ej9 ej9Var = ((gj9) this.b).H;
                if (ej9Var != null) {
                    pi9 pi9Var = ((li9) ej9Var).a;
                    pi9Var.j4(dg9Var);
                    pi9Var.p3.j(dg9Var, true);
                    return;
                }
                return;
            default:
                nl9 nl9Var = ((pl9) this.b).s;
                if (nl9Var != null) {
                    pi9 pi9Var2 = ((wh9) nl9Var).a;
                    pi9Var2.j4(dg9Var);
                    pi9Var2.p3.j(dg9Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final float e0() {
        int f;
        switch (this.a) {
            case 12:
                f = eg0.f(((nza) this.b).c0);
                break;
            default:
                f = eg0.f(((thb) this.b).c0);
                break;
        }
        return c00.d(9.66f, f, 0);
    }

    @Override
    public final long f(long j) {
        return 0L;
    }

    public final void f0(int i, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        m0(i, 2);
        try {
            int r0 = r0(str.length());
            if (r0 == r0(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= r0) {
                    byteBuffer.position(position + r0);
                    n0(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    k0((position2 - position) - r0);
                    byteBuffer.position(position2);
                    return;
                }
                throw new wk2(position + r0, byteBuffer.limit());
            }
            k0(d0(str));
            n0(str, byteBuffer);
        } catch (BufferOverflowException e) {
            wk2 wk2Var = new wk2(byteBuffer.position(), byteBuffer.limit());
            wk2Var.initCause(e);
            throw wk2Var;
        }
    }

    @Override
    public final void f2() {
        ej9 ej9Var = ((gj9) this.b).H;
        if (ej9Var != null) {
            ((li9) ej9Var).a.X3();
        }
    }

    @Override
    public final void g(float f) {
        xe9 xe9Var = (xe9) this.b;
        r47 r47Var = xe9Var.Q;
        if (r47Var == null) {
            return;
        }
        r47Var.b0 = f;
        MediaController.z().k0(xe9Var.Q, f);
    }

    public final void g0(int i, byte[] bArr) {
        m0(i, 2);
        k0(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new wk2(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override
    public final void h(float f) {
        r47 r47Var = ((xe9) this.b).Q;
        if (r47Var == null) {
            return;
        }
        r47Var.b0 = f;
    }

    public final void h0(int i) {
        byte b = (byte) i;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b);
            return;
        }
        throw new wk2(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final int i0() {
        return 0;
    }

    @Override
    public final int j0() {
        switch (this.a) {
            case 12:
                return ((nza) this.b).d0;
            default:
                return ((thb) this.b).d0;
        }
    }

    @Override
    public final void k(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        r9 r9Var = (r9) obj;
        Intent intent = r9Var.b;
        int i = old.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i, extras);
        }
        int i2 = r9Var.a;
        if (i2 != -1 || i != 0) {
            old.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i2 + " and billing's responseCode: " + i);
        }
        proxyBillingActivityV2.finish();
    }

    public final void k0(int i) {
        while ((i & (-128)) != 0) {
            h0((i & 127) | 128);
            i >>>= 7;
        }
        h0(i);
    }

    @Override
    public final void m(v8a v8aVar, int i) {
        md1 md1Var = (md1) v8aVar;
        he6 he6Var = pid.i;
        he6Var.b("onSessionEnded with error = %d", Integer.valueOf(i));
        pid pidVar = (pid) this.b;
        byte b = pidVar.e;
        if (b == 0) {
            he6Var.b("No need to notify transferred if the transfer type is unknown", new Object[0]);
        } else if (pidVar.h == null) {
            he6Var.b("No need to notify with null sessionState", new Object[0]);
        } else {
            he6Var.b("notify transferred with type = %d, sessionState = %s", Integer.valueOf(b), pidVar.h);
            Iterator it = new HashSet(pidVar.b).iterator();
            while (it.hasNext()) {
                pre preVar = (pre) it.next();
                byte b2 = pidVar.e;
                switch (preVar.a) {
                    case 0:
                        vwe.j.b("onTransferred with type = %d", Integer.valueOf(b2));
                        vwe vweVar = (vwe) preVar.b;
                        vweVar.c();
                        n8f b3 = vweVar.c.b(vweVar.g);
                        b8f m = c8f.m(b3.d());
                        m.c();
                        c8f.v((c8f) m.b, b2);
                        b3.e((c8f) m.a());
                        vweVar.a.a((p8f) b3.a(), 231);
                        vweVar.i = false;
                        vweVar.g = null;
                        break;
                }
            }
        }
        if (pidVar.e == 2) {
            return;
        }
        pidVar.c();
    }

    public final void m0(int i, int i2) {
        k0((i << 3) | i2);
    }

    @Override
    public final void n(v8a v8aVar) {
        md1 md1Var = (md1) v8aVar;
    }

    @Override
    public final void o(boolean z, float f) {
        pqb pqbVar = (pqb) this.b;
        pqbVar.n1 = f;
        pqbVar.p1();
    }

    public final void o0(long j) {
        while (((-128) & j) != 0) {
            h0((((int) j) & 127) | 128);
            j >>>= 7;
        }
        h0((int) j);
    }

    @Override
    public final void o1(int i, int i2) {
        ch9 ch9Var;
        ej9 ej9Var = ((gj9) this.b).H;
        if (ej9Var != null && (ch9Var = ((li9) ej9Var).a.R3) != null) {
            ch9Var.f(i, i2);
        }
    }

    @Override
    public final void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve9.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override
    public final void onRenderedFirstFrame() {
        hl.c3(new ux9(this, (byte) 2));
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        ky9 ky9Var = (ky9) this.b;
        if (i == 4) {
            ky9Var.dismiss();
            return;
        }
        hl.r(ky9Var.a0);
        hl.d3(ky9Var.a0, 16L);
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public final void p(v8a v8aVar, int i) {
        md1 md1Var = (md1) v8aVar;
    }

    @Override
    public final void q() {
        gj9 gj9Var = (gj9) this.b;
        ej9 ej9Var = gj9Var.H;
        if (ej9Var != null) {
            ((li9) ej9Var).a.U3(gj9Var.a);
        }
    }

    @Override
    public final long r(long j, long j2) {
        return 0L;
    }

    @Override
    public final void s(dg9 dg9Var, int i, int i2) {
        nl9 nl9Var;
        amb textSelectionHelper;
        pl9 pl9Var = (pl9) this.b;
        if (!pl9Var.x && i != i2 && (nl9Var = pl9Var.s) != null && (textSelectionHelper = ((wh9) nl9Var).a.getTextSelectionHelper()) != null) {
            dg9Var.post(new hz0(this, dg9Var, i2, textSelectionHelper, i, (byte) 4));
        }
    }

    @Override
    public final void t(boolean z) {
        switch (this.a) {
            case 12:
                nza nzaVar = (nza) this.b;
                fm0 fm0Var = nzaVar.Z;
                if (fm0Var != null) {
                    fm0Var.a(z, true);
                }
                l15 l15Var = nzaVar.s;
                if (l15Var != null) {
                    l15Var.invalidate();
                    return;
                }
                return;
            default:
                thb thbVar = (thb) this.b;
                fm0 fm0Var2 = thbVar.Z;
                if (fm0Var2 != null) {
                    fm0Var2.a(z, true);
                }
                l15 l15Var2 = thbVar.s;
                if (l15Var2 != null) {
                    l15Var2.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void u() {
        switch (this.a) {
            case 4:
                return;
            default:
                ((StickersActivity) this.b).d0();
                return;
        }
    }

    @Override
    public final long v(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override
    public final boolean w(dg9 dg9Var) {
        return false;
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        yg9 yg9Var = (yg9) this.b;
        yg9Var.w0(i, i2, z);
        q67 q67Var = yg9Var.P0;
        if (q67Var != null) {
            q67Var.g();
            yg9Var.P0 = null;
        }
    }

    @Override
    public final n29 z(long j) {
        return (n29) this.b;
    }

    @Override
    public final void onRenderedFirstFrame(uj ujVar) {
    }

    private final void b0() {
    }

    @Override
    public final void G() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void M(CharSequence charSequence) {
    }

    @Override
    public final void onSeekFinished(uj ujVar) {
    }

    @Override
    public final void onSeekStarted(uj ujVar) {
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public ve9(qa4 qa4Var, String[] strArr) {
        this.a = (byte) 28;
        this.b = strArr;
    }

    public ve9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public ve9(int i, byte[] bArr) {
        this.a = (byte) 29;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
        this.b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public ve9(byte b) {
        this.a = b;
        switch (b) {
            case 18:
                return;
            default:
                this.b = new uif((byte) 17);
                return;
        }
    }

    @Override
    public final long j(long j, long j2) {
        return j2;
    }

    @Override
    public final void l(int i, int i2) {
    }

    @Override
    public final void onError(kfc kfcVar, Exception exc) {
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }
}
