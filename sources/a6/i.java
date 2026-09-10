package a6;

import a3.m0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.lifecycle.a0;
import bi.b8;
import bi.e8;
import bi.q0;
import c6.e0;
import c6.y;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.b0;
import com.google.android.gms.internal.cast.b5;
import com.google.android.gms.internal.cast.f1;
import com.google.android.gms.internal.cast.f2;
import com.google.android.gms.internal.cast.r0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.d0;
import e2.v;
import e6.o;
import e6.p;
import g6.n;
import g6.r;
import g6.w;
import hi.c1;
import hi.e3;
import hi.h5;
import hi.j1;
import hi.j5;
import hi.k1;
import hi.k2;
import hi.l0;
import hi.r2;
import hi.u3;
import hi.z3;
import i2.h0;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import l.x;
import org.json.JSONException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.ua0;
import pg.b2;
import r0.i0;
import r0.l1;
import v7.p8;
import z3.m;
public final class i implements m0, s, a0, ua0, kg.e, q71, androidx.activity.result.b, OnSuccessListener, n, fb.n, r0.n, db.n, he.a, l0, j1, m, x {
    public static i f299c;
    public final int f300a;
    public Object f301b;

    public i(Object obj, int i10) {
        this.f300a = i10;
        this.f301b = obj;
    }

    public static synchronized i L(Context context) {
        i Q;
        synchronized (i.class) {
            Q = Q(context.getApplicationContext());
        }
        return Q;
    }

    public static synchronized i Q(Context context) {
        synchronized (i.class) {
            i iVar = f299c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            f299c = iVar2;
            return iVar2;
        }
    }

    public static int S(CharSequence charSequence) {
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

    public static int Z(int i10, String str) {
        int f02 = f0(i10);
        int S = S(str);
        return g0(S) + S + f02;
    }

    public static void c0(CharSequence charSequence, ByteBuffer byteBuffer) {
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

    public static int e0(long j3) {
        if (((-128) & j3) == 0) {
            return 1;
        }
        if (((-16384) & j3) == 0) {
            return 2;
        }
        if (((-2097152) & j3) == 0) {
            return 3;
        }
        if (((-268435456) & j3) == 0) {
            return 4;
        }
        if (((-34359738368L) & j3) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j3) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j3) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j3) == 0) {
            return 8;
        }
        if ((j3 & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    public static int f0(int i10) {
        return g0(i10 << 3);
    }

    public static int g0(int i10) {
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

    @Override
    public void A(byte[] bArr, int i10, int i11, z3.l lVar, e2.h hVar) {
        boolean z10;
        d2.b a2;
        boolean z11;
        v vVar = (v) this.f301b;
        vVar.H(i10 + i11, bArr);
        vVar.J(i10);
        ArrayList arrayList = new ArrayList();
        while (vVar.a() > 0) {
            if (vVar.a() >= 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.a("Incomplete Mp4Webvtt Top Level box header found.", z10);
            int j3 = vVar.j();
            if (vVar.j() == 1987343459) {
                int i12 = j3 - 8;
                CharSequence charSequence = null;
                d2.a aVar = null;
                while (i12 > 0) {
                    if (i12 >= 8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    e2.d.a("Incomplete vtt cue box header found.", z11);
                    int j10 = vVar.j();
                    int j11 = vVar.j();
                    int i13 = j10 - 8;
                    byte[] bArr2 = vVar.f7234a;
                    int i14 = vVar.f7235b;
                    String str = d0.f7188a;
                    String str2 = new String(bArr2, i14, i13, StandardCharsets.UTF_8);
                    vVar.K(i13);
                    i12 = (i12 - 8) - i13;
                    if (j11 == 1937011815) {
                        i4.g gVar = new i4.g();
                        i4.h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (j11 == 1885436268) {
                        charSequence = i4.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.f6187a = charSequence;
                    aVar.f6188b = null;
                    a2 = aVar.a();
                } else {
                    Pattern pattern = i4.h.f10468a;
                    i4.g gVar2 = new i4.g();
                    gVar2.f10462c = charSequence;
                    a2 = gVar2.a().a();
                }
                arrayList.add(a2);
            } else {
                vVar.K(j3 - 8);
            }
        }
        hVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override
    public void B(float f7) {
        ((q0) this.f301b).h.setRotation(f7);
    }

    @Override
    public void C() {
        h0 h0Var = ((a3.n) this.f301b).W;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override
    public s9 E() {
        u3 u3Var = ((c1) this.f301b).S;
        if (u3Var == null) {
            return null;
        }
        return u3Var.f9889a.getTextSelectionHelper();
    }

    @Override
    public boolean F(k1 k1Var) {
        return false;
    }

    @Override
    public void G(Editable editable) {
        ((j5) this.f301b).h();
    }

    @Override
    public boolean H(boolean z10) {
        return false;
    }

    public db.i I(Object obj) {
        db.g gVar = ((gb.a0) this.f301b).f8662b;
        gVar.getClass();
        if (obj == null) {
            return db.k.f6380a;
        }
        Class<?> cls = obj.getClass();
        gb.n nVar = new gb.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    @Override
    public void J(CharSequence charSequence) {
        u3 u3Var = ((c1) this.f301b).S;
        if (u3Var != null) {
            u3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                u3Var.f9889a.s4(charSequence.toString());
            }
        }
    }

    @Override
    public r9 M() {
        return (c1) this.f301b;
    }

    public synchronized void N() {
        synchronized (this) {
            b bVar = (b) this.f301b;
            ReentrantLock reentrantLock = bVar.f283a;
            reentrantLock.lock();
            bVar.f284b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    @Override
    public hi.a O() {
        return ((c1) this.f301b).f9464a;
    }

    @Override
    public boolean P(k1 k1Var) {
        return false;
    }

    @Override
    public l1 Q0(View view, l1 l1Var) {
        boolean z10;
        l1 l1Var2;
        int b10;
        int c10;
        boolean z11;
        int c11;
        int d = l1Var.d();
        g.s sVar = (g.s) this.f301b;
        Context context = sVar.e;
        int d10 = l1Var.d();
        ActionBarContextView actionBarContextView = sVar.f8442y;
        int i10 = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.f8442y.getLayoutParams();
            boolean z12 = true;
            if (sVar.f8442y.isShown()) {
                if (sVar.f8433l0 == null) {
                    sVar.f8433l0 = new Rect();
                    sVar.m0 = new Rect();
                }
                Rect rect = sVar.f8433l0;
                Rect rect2 = sVar.m0;
                rect.set(l1Var.b(), l1Var.d(), l1Var.c(), l1Var.a());
                ViewGroup viewGroup = sVar.J;
                Method method = m.u3.f13161a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                    }
                }
                int i11 = rect.top;
                int i12 = rect.left;
                int i13 = rect.right;
                l1 f7 = i0.f(sVar.J);
                if (f7 == null) {
                    b10 = 0;
                } else {
                    b10 = f7.b();
                }
                if (f7 == null) {
                    c10 = 0;
                } else {
                    c10 = f7.c();
                }
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z11 = true;
                }
                if (i11 > 0 && sVar.L == null) {
                    View view2 = new View(context);
                    sVar.L = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    sVar.J.addView(sVar.L, -1, layoutParams);
                } else {
                    View view3 = sVar.L;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            sVar.L.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = sVar.L;
                if (view4 == null) {
                    z12 = false;
                }
                if (z12 && view4.getVisibility() != 0) {
                    View view5 = sVar.L;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        c11 = f0.e.c(context, 2131099654);
                    } else {
                        c11 = f0.e.c(context, 2131099653);
                    }
                    view5.setBackgroundColor(c11);
                }
                if (!sVar.Q && z12) {
                    d10 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                sVar.f8442y.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view6 = sVar.L;
        if (view6 != null) {
            if (z10) {
                i10 = 0;
            }
            view6.setVisibility(i10);
        }
        if (d != d10) {
            l1Var2 = l1Var.f(l1Var.b(), d10, l1Var.c(), l1Var.a());
        } else {
            l1Var2 = l1Var;
        }
        return i0.h(view, l1Var2);
    }

    @Override
    public boolean R() {
        c1 c1Var = (c1) this.f301b;
        u3 u3Var = c1Var.S;
        if (u3Var != null) {
            hi.a aVar = c1Var.f9464a;
            if (u3Var.f9889a.R4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void U(int i10, int i11) {
        c1 c1Var = (c1) this.f301b;
        u3 u3Var = c1Var.S;
        if (u3Var != null) {
            hi.a aVar = c1Var.f9464a;
            k2 k2Var = u3Var.f9889a.J3;
            if (k2Var != null) {
                k2Var.f(i10, i11);
            }
        }
    }

    public void V(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f301b;
        a0(i10, 2);
        try {
            int g02 = g0(str.length());
            if (g02 == g0(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= g02) {
                    byteBuffer.position(position + g02);
                    c0(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    Y((position2 - position) - g02);
                    byteBuffer.position(position2);
                    return;
                }
                throw new b5(position + g02, byteBuffer.limit());
            }
            Y(S(str));
            c0(str, byteBuffer);
        } catch (BufferOverflowException e) {
            b5 b5Var = new b5(byteBuffer.position(), byteBuffer.limit());
            b5Var.initCause(e);
            throw b5Var;
        }
    }

    public void W(int i10, byte[] bArr) {
        a0(i10, 2);
        Y(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f301b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new b5(byteBuffer.position(), byteBuffer.limit());
    }

    public void X(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.f301b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new b5(byteBuffer.position(), byteBuffer.limit());
    }

    public void Y(int i10) {
        while ((i10 & (-128)) != 0) {
            X((i10 & 127) | 128);
            i10 >>>= 7;
        }
        X(i10);
    }

    public String a(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            ka.d dVar = (ka.d) this.f301b;
            ka.e eVar = new ka.e(stringWriter, dVar.f12412a, dVar.f12413b, dVar.f12414c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f12416b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public void a0(int i10, int i11) {
        Y((i10 << 3) | i11);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f300a) {
            case 2:
                a8.e eVar = new a8.e(1, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.f304a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.c) this.f301b).writeToParcel(obtain, 0);
                ((a8.c) ((a8.g) obj).u()).G0(obtain, 1);
                return;
            default:
                w wVar = (w) obj;
                g6.f fVar = (g6.f) wVar.u();
                c6.d0 d0Var = ((e0) this.f301b).f4394k;
                Parcel O0 = fVar.O0();
                com.google.android.gms.internal.cast.v.d(O0, d0Var);
                fVar.T0(O0, 18);
                g6.f fVar2 = (g6.f) wVar.u();
                fVar2.T0(fVar2.O0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
        }
    }

    @Override
    public void b(k1 k1Var) {
        switch (this.f300a) {
            case 22:
                u3 u3Var = ((c1) this.f301b).S;
                if (u3Var != null) {
                    z3 z3Var = u3Var.f9889a;
                    z3.L1(z3Var, k1Var);
                    z3Var.f10001h3.C(k1Var, true);
                    return;
                }
                return;
            default:
                h5 h5Var = ((j5) this.f301b).f9681s;
                if (h5Var != null) {
                    z3 z3Var2 = ((e3) h5Var).f9542a;
                    z3.L1(z3Var2, k1Var);
                    z3Var2.f10001h3.C(k1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public void b0() {
        c1 c1Var = (c1) this.f301b;
        u3 u3Var = c1Var.S;
        if (u3Var != null) {
            hi.a aVar = c1Var.f9464a;
            z3 z3Var = u3Var.f9889a;
            k2 k2Var = z3Var.J3;
            if (k2Var != null) {
                k2Var.g();
            }
            z3Var.f10001h3.onContentChanged();
        }
    }

    @Override
    public void c(l.l lVar, boolean z10) {
        if (lVar instanceof l.e0) {
            ((l.e0) lVar).f12607z.k().c(false);
        }
        x xVar = ((m.h) this.f301b).e;
        if (xVar != null) {
            xVar.c(lVar, z10);
        }
    }

    public void d0(long j3) {
        while (((-128) & j3) != 0) {
            X((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        X((int) j3);
    }

    @Override
    public boolean e() {
        q0 q0Var = (q0) this.f301b;
        q0Var.e.invalidate();
        return q0Var.h.j();
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void g() {
        c1 c1Var = (c1) this.f301b;
        u3 u3Var = c1Var.S;
        if (u3Var != null) {
            z3.O1(u3Var.f9889a, c1Var.f9464a);
        }
    }

    @Override
    public void i() {
        ((q0) this.f301b).h.o();
    }

    @Override
    public void j(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f301b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f603b;
        int i10 = u.e("ProxyBillingActivityV2", intent).f4308a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.M;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i10, extras);
        }
        int i11 = aVar.f602a;
        if (i11 != -1 || i10 != 0) {
            u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public z3.d k(int i10, int i11, byte[] bArr) {
        return w.f.a(this, bArr, i11);
    }

    @Override
    public void l() {
        a3.n nVar = (a3.n) this.f301b;
        if (nVar.f158n1 != null) {
            nVar.N0(0, 1);
        }
    }

    @Override
    public void m(String str, long j3, long j10, long j11) {
        p pVar = (p) this.f301b;
        try {
            pVar.a(new o(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e) {
            g6.b bVar = e6.h.f7313k;
            Log.e(bVar.f8558a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = pVar.f7337q.f7319i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j3, 2103, j10, j11);
        }
    }

    @Override
    public int n() {
        return 2;
    }

    @Override
    public Object n2() {
        Constructor constructor = (Constructor) this.f301b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            p8 p8Var = ib.c.f10550a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e10.getCause());
        }
    }

    @Override
    public Paint.FontMetricsInt o() {
        return ((bi.o) this.f301b).f3268f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void onFirstFrameRendered() {
        a3.n nVar = (a3.n) this.f301b;
        Surface surface = nVar.f158n1;
        if (surface != null) {
            nVar.Z0.n0(surface);
            nVar.f161q1 = true;
        }
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        e8 e8Var = (e8) this.f301b;
        b8 b8Var = e8Var.M;
        t71 t71Var = e8Var.f2661x;
        if (t71Var == null) {
            return;
        }
        if (t71Var.y()) {
            AndroidUtilities.runOnUIThread(b8Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(b8Var);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        int i10;
        int i11;
        f2 f2Var;
        f1 b10;
        d6.a aVar = (d6.a) this.f301b;
        Bundle bundle = (Bundle) obj;
        if (r0.f5252j) {
            Context context = aVar.f6284a;
            r rVar = aVar.f6287f;
            r0 r0Var = new r0(context, rVar, aVar.f6286c, aVar.f6290j, aVar.f6288g);
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
            String t10 = r6.t(packageName, ".client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            r0Var.h = i11;
            l5.s.b(context);
            r0Var.f5257g = l5.s.a().c(j5.a.e).a("CAST_SENDER_SDK", new i5.c("proto"), b0.f5032a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                r0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(t10, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                e.f4957c = new a4.m(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                e.d = new k6.c[]{y.f4483c};
                e.f4956b = false;
                e.f4955a = 8426;
                Task e7 = rVar.e(0, e.a());
                ?? obj2 = new Object();
                obj2.f11802b = r0Var;
                obj2.f11803c = packageName;
                obj2.f11801a = i10;
                obj2.d = sharedPreferences;
                e7.addOnSuccessListener(obj2);
            }
            if (z10) {
                n6.l.h(sharedPreferences);
                g6.b bVar = f2.f5148i;
                synchronized (f2.class) {
                    try {
                        if (f2.f5150k == null) {
                            f2.f5150k = new f2(sharedPreferences, r0Var, packageName);
                        }
                        f2Var = f2.f5150k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = f2Var.f5153c;
                SharedPreferences sharedPreferences2 = f2Var.f5152b;
                HashSet hashSet = f2Var.f5154f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = f2Var.f5155g;
                hashSet2.clear();
                f2Var.h = 0L;
                String str2 = f2.f5149j;
                if (str2.equals(string) && str.equals(string2)) {
                    f2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j3 = sharedPreferences2.getLong(str3, 0L);
                            if (j3 != 0 && currentTimeMillis - j3 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                f1 b11 = f2.b(str3.substring(41));
                                if (b11 != null) {
                                    hashSet2.add(b11);
                                    hashSet.add(b11);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = f2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    f2Var.c(hashSet3);
                    n6.l.h(f2Var.e);
                    n6.l.h(f2Var.d);
                    f2Var.e.post(f2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    f2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                f2.a(f1.CAST_CONTEXT);
            }
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        b2 b2Var = ((e8) this.f301b).f2659w;
        if (b2Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(b2Var.f39962y0 - f10) >= 1.0E-4f) {
                b2Var.f39962y0 = f10;
                b2Var.requestLayout();
            }
        }
    }

    @Override
    public void p() {
        ((q0) this.f301b).h.f12495a.g(1, true);
    }

    @Override
    public void p0() {
        c1 c1Var = (c1) this.f301b;
        u3 u3Var = c1Var.S;
        if (u3Var != null) {
            hi.a aVar = c1Var.f9464a;
            z3.N1(u3Var.f9889a);
        }
    }

    @Override
    public boolean q() {
        q0 q0Var = (q0) this.f301b;
        bi.l0 l0Var = q0Var.h;
        boolean m10 = l0Var.m(-90.0f);
        l0Var.i();
        q0Var.e.invalidate();
        return m10;
    }

    @Override
    public void r(k1 k1Var, int i10, int i11) {
        h5 h5Var;
        s9 textSelectionHelper;
        j5 j5Var = (j5) this.f301b;
        if (!j5Var.f9682w && i10 != i11 && (h5Var = j5Var.f9681s) != null && (textSelectionHelper = ((e3) h5Var).f9542a.getTextSelectionHelper()) != null) {
            k1Var.post(new di.b5(this, k1Var, i11, textSelectionHelper, i10, 3));
        }
    }

    @Override
    public void r0(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: a6.i.r0(java.lang.Object):void");
    }

    public void s() {
        ((androidx.fragment.app.u) this.f301b).d.R();
    }

    @Override
    public boolean u(l.l lVar) {
        m.h hVar = (m.h) this.f301b;
        if (lVar == hVar.f13021c) {
            return false;
        }
        ((l.e0) lVar).A.getClass();
        hVar.getClass();
        x xVar = hVar.e;
        if (xVar == null) {
            return false;
        }
        return xVar.u(lVar);
    }

    @Override
    public void w() {
        ((q0) this.f301b).h.k();
    }

    @Override
    public void x(k1 k1Var) {
        hi.a aVar;
        j5 j5Var = (j5) this.f301b;
        h5 h5Var = j5Var.f9681s;
        if (h5Var != null && (aVar = j5Var.f9464a) != null) {
            z3 z3Var = ((e3) h5Var).f9542a;
            ArrayList arrayList = z3Var.f10008l3;
            long j3 = aVar.f9436t;
            if (j3 != 0) {
                int i10 = -1;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((hi.a) arrayList.get(i11)).f9427k.contains(Long.valueOf(j3))) {
                        i10 = i11;
                    }
                }
                if (i10 >= 0) {
                    k2 k2Var = z3Var.J3;
                    if (k2Var != null) {
                        k2Var.d();
                    }
                    hi.a aVar2 = new hi.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f9427k;
                    ArrayList arrayList3 = aVar2.f9427k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        a4.a.x(1, arrayList3);
                    }
                    arrayList.add(i10 + 1, aVar2);
                    z3Var.r4();
                    z3Var.Y2.N(false);
                    k2 k2Var2 = z3Var.J3;
                    if (k2Var2 != null) {
                        k2Var2.h();
                    }
                    z3Var.post(new r2(z3Var, aVar2, 26));
                }
            }
        }
    }

    @Override
    public void y(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: a6.i.y(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    @Override
    public void z(int i10, int i11, CharSequence charSequence, boolean z10) {
        bi.i iVar = ((bi.o) this.f301b).f3268f;
        if (iVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(iVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, iVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            iVar.setText(spannableStringBuilder);
            iVar.setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public i(byte[] bArr, int i10) {
        this.f300a = 13;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.f301b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public i(Context context) {
        String d;
        this.f300a = 0;
        b a2 = b.a(context);
        this.f301b = a2;
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

    public i(x6.a aVar) {
        this.f300a = 26;
        n6.l.h(aVar);
        this.f301b = aVar;
    }

    public i(int i10) {
        this.f300a = i10;
        switch (i10) {
            case 15:
                this.f301b = new ArrayList();
                new ArrayList();
                new ArrayList();
                return;
            case 25:
                this.f301b = new v();
                return;
            default:
                return;
        }
    }

    @Override
    public void T() {
    }

    @Override
    public void reset() {
    }

    @Override
    public void t() {
    }

    @Override
    public void D(CharSequence charSequence) {
    }

    @Override
    public void K(String str) {
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
    public void h(int i10, int i11) {
    }

    @Override
    public void onError(t71 t71Var, Exception exc) {
    }

    @Override
    public void d(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void v(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}
