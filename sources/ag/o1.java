package ag;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import bg.v2;
import com.google.android.gms.internal.cast.z4;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import lh.d4;
import lh.z8;
import nh.ja;
import org.json.JSONObject;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.hu0;
public final class o1 implements androidx.lifecycle.a0, androidx.activity.result.b, com.google.android.gms.common.api.internal.s, f2.s1, l.w, Continuation, OnCompleteListener, m.f2, hu0, l.i, md.b, v2, o0.a {
    public final int f623a;
    public Object f624b;

    public o1(int i10, boolean z10) {
        this.f623a = i10;
    }

    public static void A(CharSequence charSequence, ByteBuffer byteBuffer) {
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
                            c3 = 57343;
                        }
                    }
                    byteBuffer.position(i10 - byteBuffer.arrayOffset());
                    return;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e10);
                    throw bufferOverflowException;
                }
            }
            int length2 = charSequence.length();
            while (i11 < length2) {
                char charAt4 = charSequence.charAt(i11);
                char c6 = charAt4;
                if (charAt4 >= 128) {
                    if (charAt4 < 2048) {
                        byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                        c6 = (charAt4 & '?') | 128;
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
                byteBuffer.put((byte) c6);
                i11++;
            }
            return;
        }
        throw new ReadOnlyBufferException();
    }

    public static int C(long j10) {
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

    public static int E(int i10) {
        return F(i10 << 3);
    }

    public static int F(int i10) {
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

    public static int p(CharSequence charSequence) {
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

    public static int w(int i10, String str) {
        int E = E(i10);
        int p10 = p(str);
        return F(p10) + p10 + E;
    }

    public void B(long j10) {
        while (((-128) & j10) != 0) {
            u((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        u((int) j10);
    }

    @Override
    public void D(MessageObject messageObject) {
        ((z8) ((d4) this.f624b).M1).f(false);
    }

    @Override
    public void K(float f9) {
        ja jaVar = (ja) this.f624b;
        h1.e(jaVar.B1).k(String.valueOf(m.f584a.indexOf(jaVar.K0.getCurrentBrush())), f9);
        k2 k2Var = jaVar.f18665w1;
        k2Var.f573c = f9;
        jaVar.E0(k2Var, null, false);
    }

    @Override
    public void S(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.g0 g0Var = (androidx.biometric.g0) this.f624b;
        Handler handler = g0Var.f1037w0;
        q1 q1Var = g0Var.f1038x0;
        handler.removeCallbacks(q1Var);
        TextView textView = g0Var.C0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(q1Var, 2000L);
    }

    public void a(int i10, boolean z10) {
        c2.u uVar = (c2.u) this.f624b;
        if (z10) {
            uVar.b(i10);
        } else {
            uVar.getClass();
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f623a) {
            case 9:
                d7.z zVar = (d7.z) ((d7.k) obj).u();
                d7.f fVar = new d7.f(1, (TaskCompletionSource) obj2);
                Parcel M0 = zVar.M0();
                d7.d.c(M0, (s7.e) this.f624b);
                d7.d.d(M0, fVar);
                M0.writeString(null);
                zVar.Q0(M0, 63);
                return;
            case 10:
            default:
                n6.b bVar = new n6.b(0, (TaskCompletionSource) obj2);
                z6.m1 m1Var = (z6.m1) ((z6.l1) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(m1Var.f50741b);
                int i10 = z6.j.f50724a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                ((o6.v) this.f624b).writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    m1Var.f50740a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            case 11:
                e6.f fVar2 = new e6.f(1, (TaskCompletionSource) obj2);
                e6.e eVar = (e6.e) ((e6.h) obj).u();
                Parcel G0 = eVar.G0();
                w6.a.d(G0, fVar2);
                w6.a.c(G0, (e6.a) this.f624b);
                G0.writeStrongBinder(null);
                eVar.H0(G0, 2);
                return;
        }
    }

    @Override
    public void b(l.k kVar, boolean z10) {
        boolean z11;
        int i10;
        g.p pVar;
        g.q qVar = (g.q) this.f624b;
        l.k k9 = kVar.k();
        int i11 = 0;
        if (k9 != kVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            kVar = k9;
        }
        g.p[] pVarArr = qVar.Q;
        if (pVarArr != null) {
            i10 = pVarArr.length;
        } else {
            i10 = 0;
        }
        while (true) {
            if (i11 < i10) {
                pVar = pVarArr[i11];
                if (pVar != null && pVar.h == kVar) {
                    break;
                }
                i11++;
            } else {
                pVar = null;
                break;
            }
        }
        if (pVar != null) {
            if (z11) {
                qVar.f(pVar.f6905a, pVar, k9);
                qVar.h(pVar, true);
                return;
            }
            qVar.h(pVar, z10);
        }
    }

    @Override
    public TextureView b0() {
        return null;
    }

    public void c() {
        r1 r1Var = ((t1) this.f624b).d;
        if (r1Var != null) {
            p1 p1Var = r1Var.f647s;
            if (p1Var != null) {
                r1Var.cancelRunnable(p1Var);
                r1Var.f647s = null;
            }
            p1 p1Var2 = new p1(r1Var, 1);
            r1Var.f647s = p1Var2;
            r1Var.postRunnable(p1Var2, 1L);
        }
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f624b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public int d(View view) {
        return f2.w0.z(view) - ((ViewGroup.MarginLayoutParams) ((f2.x0) view.getLayoutParams())).topMargin;
    }

    @Override
    public java.lang.Object e(md.c r7, uc.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: ag.o1.e(md.c, uc.c):java.lang.Object");
    }

    public void f(c2.r rVar, c2.n nVar, Collection collection) {
        c2.e eVar = (c2.e) this.f624b;
        if (rVar == eVar.f2825y && nVar != null) {
            c2.a0 a0Var = eVar.f2824x.f2771a;
            String d = nVar.d();
            c2.b0 b0Var = new c2.b0(a0Var, d, eVar.b(a0Var, d), false);
            b0Var.i(nVar);
            if (eVar.d != b0Var) {
                eVar.h(eVar, b0Var, eVar.f2825y, 3, eVar.f2824x, collection);
                eVar.f2824x = null;
                eVar.f2825y = null;
            }
        } else if (rVar == eVar.f2807e) {
            if (nVar != null) {
                eVar.n(eVar.d, nVar);
            }
            eVar.d.n(collection);
        }
    }

    @Override
    public void g(l.k kVar, MenuItem menuItem) {
        ((l.e) this.f624b).f13962f.removeCallbacksAndMessages(kVar);
    }

    @Override
    public float get() {
        ja jaVar = (ja) this.f624b;
        int i10 = jaVar.B1;
        m currentBrush = jaVar.K0.getCurrentBrush();
        if (currentBrush == null) {
            return h1.e(i10).f521i;
        }
        return h1.e(i10).f(String.valueOf(m.f584a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public boolean h(l.k kVar) {
        Window.Callback callback;
        g.q qVar = (g.q) this.f624b;
        if (kVar == kVar.k() && qVar.K && (callback = qVar.f6927f.getCallback()) != null && !qVar.V) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    @Override
    public void i(l.k kVar) {
        m5.i iVar = ((ActionMenuView) this.f624b).G;
        if (iVar != null) {
            iVar.i(kVar);
        }
    }

    public n9.a j(JSONObject jSONObject) {
        n9.b dVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            dVar = new f7.v(14);
        } else {
            dVar = new x9.d(14);
        }
        return dVar.d((ya.a) this.f624b, jSONObject);
    }

    public void k(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f624b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    @Override
    public void l(Object obj) {
        int i10;
        Map map = (Map) obj;
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f624b;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((Boolean) arrayList.get(i11)).booleanValue()) {
                i10 = 0;
            } else {
                i10 = -1;
            }
            iArr[i11] = i10;
        }
        androidx.fragment.app.f0 f0Var = (androidx.fragment.app.f0) j0Var.F.pollFirst();
        if (f0Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        String str = f0Var.f1432a;
        if (j0Var.f1446c.q(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    @Override
    public Cursor m(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f624b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    @Override
    public int n() {
        return ((f2.w0) this.f624b).G();
    }

    @Override
    public void o(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.f624b;
        Handler handler = eVar.f13962f;
        l.d dVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f13963n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (kVar == ((l.d) arrayList.get(i10)).f13956b) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            dVar = (l.d) arrayList.get(i11);
        }
        handler.postAtTime(new c2.p(this, dVar, mVar, kVar, 6), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override
    public void onComplete(Task task) {
        k8.e0 e0Var = (k8.e0) this.f624b;
        if (task.isSuccessful()) {
            j8.m.K0(e0Var, true, (byte[]) task.getResult());
            return;
        }
        Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
        j8.m.K0(e0Var, false, null);
    }

    @Override
    public boolean q(l.k kVar, MenuItem menuItem) {
        m.l lVar = ((ActionMenuView) this.f624b).L;
        if (lVar != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((ha.c) lVar).f7981b).S.f14097c).iterator();
            while (it.hasNext()) {
                if (((androidx.fragment.app.b0) it.next()).f1419a.p()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void r(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f624b;
        x(i10, 2);
        try {
            int F = F(str.length());
            if (F == F(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= F) {
                    byteBuffer.position(position + F);
                    A(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    v((position2 - position) - F);
                    byteBuffer.position(position2);
                    return;
                }
                throw new z4(position + F, byteBuffer.limit());
            }
            v(p(str));
            A(str, byteBuffer);
        } catch (BufferOverflowException e10) {
            z4 z4Var = new z4(byteBuffer.position(), byteBuffer.limit());
            z4Var.initCause(e10);
            throw z4Var;
        }
    }

    @Override
    public int s() {
        f2.w0 w0Var = (f2.w0) this.f624b;
        return w0Var.f6507n - w0Var.C();
    }

    public void t(int i10, byte[] bArr) {
        x(i10, 2);
        v(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f624b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new z4(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public Object then(Task task) {
        return ((Callable) this.f624b).call();
    }

    public void u(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.f624b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new z4(byteBuffer.position(), byteBuffer.limit());
    }

    public void v(int i10) {
        while ((i10 & (-128)) != 0) {
            u((i10 & 127) | 128);
            i10 >>>= 7;
        }
        u(i10);
    }

    public void x(int i10, int i11) {
        v((i10 << 3) | i11);
    }

    @Override
    public void x0(MessageObject messageObject) {
        ((z8) ((d4) this.f624b).M1).f(true);
    }

    @Override
    public View y(int i10) {
        return ((f2.w0) this.f624b).q(i10);
    }

    @Override
    public int z(View view) {
        return f2.w0.v(view) + ((ViewGroup.MarginLayoutParams) ((f2.x0) view.getLayoutParams())).bottomMargin;
    }

    public o1(com.google.android.gms.common.api.j jVar, a6.a aVar, int i10) {
        this.f623a = i10;
        this.f624b = aVar;
    }

    public o1(Object obj, int i10) {
        this.f623a = i10;
        this.f624b = obj;
    }

    public o1(byte[] bArr, int i10) {
        this.f623a = 8;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.f624b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public o1(int i10) {
        this.f623a = i10;
        switch (i10) {
            case 6:
                this.f624b = new CopyOnWriteArrayList();
                return;
            case 17:
                this.f624b = new c2.u();
                return;
            default:
                this.f624b = new LinkedHashMap(0, 0.75f, true);
                return;
        }
    }

    public o1(Context context, Uri uri) {
        this.f623a = 28;
        this.f624b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }
}
