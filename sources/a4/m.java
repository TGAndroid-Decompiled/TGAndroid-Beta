package a4;

import a9.q;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.biometric.u;
import androidx.biometric.y;
import androidx.fragment.app.o;
import androidx.fragment.app.r;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.b0;
import com.google.android.gms.internal.cast.b5;
import com.google.android.gms.internal.cast.f1;
import com.google.android.gms.internal.cast.f2;
import com.google.android.gms.internal.cast.r0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.d0;
import di.d7;
import di.dc;
import di.e0;
import di.fc;
import di.k6;
import di.o8;
import di.pc;
import di.rb;
import di.tc;
import e2.v;
import fb.n;
import hg.a2;
import hg.z1;
import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import ji.g2;
import ji.h1;
import ji.j0;
import ji.p3;
import ji.v3;
import ji.z;
import m.s3;
import mg.p;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gy;
import r0.i0;
import r0.l1;
import rg.d2;
import v7.t7;
public final class m implements z3.d, q, a0, androidx.activity.result.b, WebMessageListenerBoundaryInterface, ce.b, OnSuccessListener, p, tc, f6.a, n, r0.n, db.n, s, a2, z3.m, ti, OnCompleteListener, j0 {
    public final int f294a;
    public final Object f295b;

    public m(Object obj, int i10) {
        this.f294a = i10;
        this.f295b = obj;
    }

    public static void g0(aa.a aVar, da.d dVar) {
        String str = dVar.f6685a;
        if (str != null) {
            aVar.x("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        aVar.x("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        aVar.x("X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.0");
        aVar.x("Accept", "application/json");
        String str2 = dVar.f6686b;
        if (str2 != null) {
            aVar.x("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = dVar.f6687c;
        if (str3 != null) {
            aVar.x("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = dVar.d;
        if (str4 != null) {
            aVar.x("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = dVar.f6688e.b().f48407a;
        if (str5 != null) {
            aVar.x("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap i0(da.d dVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", dVar.h);
        hashMap.put("display_version", dVar.f6690g);
        hashMap.put("source", Integer.toString(dVar.f6691i));
        String str = dVar.f6689f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public static int m0(CharSequence charSequence) {
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

    public static int s0(int i10, String str) {
        int x02 = x0(i10);
        int m0 = m0(str);
        return y0(m0) + m0 + x02;
    }

    public static void u0(CharSequence charSequence, ByteBuffer byteBuffer) {
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
                } catch (ArrayIndexOutOfBoundsException e7) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e7);
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

    public static int w0(long j3) {
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

    public static int x0(int i10) {
        return y0(i10 << 3);
    }

    public static int y0(int i10) {
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
    public void A(CharSequence charSequence) {
        p3 p3Var = ((z) this.f295b).O;
        if (p3Var != null) {
            p3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                p3Var.f14138a.s4(charSequence.toString());
            }
        }
    }

    @Override
    public void B(hh hhVar) {
        NotificationCenter.getInstance(ig.m.a0((ig.m) this.f295b)).doOnIdle(hhVar);
    }

    @Override
    public void C(float f7, boolean z10) {
        d7 d7Var = (d7) this.f295b;
        o8 o8Var = d7Var.d;
        if (o8Var != null) {
            o8Var.Z = f7;
            o8Var.f7789j = true;
            g71 g71Var = d7Var.f7103e;
            if (g71Var != null && g71Var.p() != -9223372036854775807L) {
                d7Var.m(f7 * ((float) d7Var.f7103e.p()));
            }
        }
    }

    @Override
    public p9 D() {
        return (z) this.f295b;
    }

    @Override
    public boolean D0() {
        return false;
    }

    @Override
    public ji.a F() {
        return ((z) this.f295b).f13775a;
    }

    @Override
    public a0.i G() {
        return null;
    }

    @Override
    public void I(long j3) {
        d7 d7Var = (d7) this.f295b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.f7805r0 = j3;
        o8Var.f7789j = true;
        d7Var.y(true);
    }

    @Override
    public void J(boolean z10) {
        d2 d2Var;
        pc pcVar = ((dc) ((d7) this.f295b)).C0;
        rb rbVar = pcVar.f7938v1;
        if (rbVar != null) {
            d2 d2Var2 = null;
            if (!z10 && (rbVar.getSelectedEntity() instanceof d2)) {
                pcVar.f7938v1.D0(null, true);
            } else if (z10 && !(pcVar.f7938v1.getSelectedEntity() instanceof d2)) {
                k6 k6Var = pcVar.f7938v1.R0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < k6Var.getChildCount()) {
                        View childAt = k6Var.getChildAt(i11);
                        if (childAt instanceof d2) {
                            d2Var = (d2) childAt;
                            break;
                        }
                        i11++;
                    } else {
                        d2Var = null;
                        break;
                    }
                }
                if (d2Var != null) {
                    rb rbVar2 = pcVar.f7938v1;
                    k6 k6Var2 = rbVar2.R0;
                    while (true) {
                        if (i10 >= k6Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = k6Var2.getChildAt(i10);
                        if (childAt2 instanceof d2) {
                            d2Var2 = (d2) childAt2;
                            break;
                        }
                        i10++;
                    }
                    rbVar2.D0(d2Var2, true);
                }
            }
        }
    }

    @Override
    public boolean L() {
        z zVar = (z) this.f295b;
        p3 p3Var = zVar.O;
        if (p3Var != null) {
            ji.a aVar = zVar.f13775a;
            if (p3Var.f14138a.R4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void M(int i10, int i11) {
        z zVar = (z) this.f295b;
        p3 p3Var = zVar.O;
        if (p3Var != null) {
            ji.a aVar = zVar.f13775a;
            g2 g2Var = p3Var.f14138a.J3;
            if (g2Var != null) {
                g2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void N(float f7, int i10) {
        ArrayList arrayList;
        d7 d7Var = (d7) this.f295b;
        o8 o8Var = d7Var.d;
        if (o8Var != null && (arrayList = o8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((o8) d7Var.d.T.get(i10)).V = f7;
        }
    }

    @Override
    public void O(float f7) {
        d7 d7Var = (d7) this.f295b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.F = f7;
        o8Var.f7789j = true;
        d7Var.w(true);
    }

    @Override
    public void P() {
        z zVar = (z) this.f295b;
        p3 p3Var = zVar.O;
        if (p3Var != null) {
            ji.a aVar = zVar.f13775a;
            v3 v3Var = p3Var.f14138a;
            g2 g2Var = v3Var.J3;
            if (g2Var != null) {
                g2Var.g();
            }
            v3Var.f14275h3.onContentChanged();
        }
    }

    @Override
    public boolean Q(int i10) {
        if (i10 == ((rn0) this.f295b).f11100d0) {
            return true;
        }
        return false;
    }

    @Override
    public void R(float f7) {
        d7 d7Var = (d7) this.f295b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.E = f7;
        o8Var.f7789j = true;
        d7Var.w(true);
    }

    @Override
    public void S(float f7, int i10) {
        ArrayList arrayList;
        d7 d7Var = (d7) this.f295b;
        o8 o8Var = d7Var.d;
        if (o8Var != null && (arrayList = o8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((o8) d7Var.d.T.get(i10)).W = f7;
        }
    }

    @Override
    public void T(float f7) {
        o8 o8Var = ((d7) this.f295b).d;
        if (o8Var == null) {
            return;
        }
        o8Var.f7769a0 = f7;
        o8Var.f7789j = true;
    }

    @Override
    public l1 T0(View view, l1 l1Var) {
        boolean z10;
        l1 l1Var2;
        int b10;
        int c10;
        boolean z11;
        int c11;
        int d = l1Var.d();
        g.s sVar = (g.s) this.f295b;
        Context context = sVar.f10265e;
        int d10 = l1Var.d();
        ActionBarContextView actionBarContextView = sVar.f10283y;
        int i10 = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.f10283y.getLayoutParams();
            boolean z12 = true;
            if (sVar.f10283y.isShown()) {
                if (sVar.f10274l0 == null) {
                    sVar.f10274l0 = new Rect();
                    sVar.m0 = new Rect();
                }
                Rect rect = sVar.f10274l0;
                Rect rect2 = sVar.m0;
                rect.set(l1Var.b(), l1Var.d(), l1Var.c(), l1Var.a());
                ViewGroup viewGroup = sVar.J;
                Method method = s3.f15692a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e7) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e7);
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
                sVar.f10283y.setLayoutParams(marginLayoutParams);
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
    public int U() {
        return 2;
    }

    @Override
    public void V() {
        ((d7) this.f295b).q(null);
    }

    @Override
    public void Y(ArrayList arrayList) {
        boolean z10;
        rn0 rn0Var = (rn0) this.f295b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            rn0Var.J.add(((z1) arrayList.get(i10)).f11357a);
        }
        gy gyVar = rn0Var.U;
        if (gyVar != null) {
            if (rn0Var.D0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            gyVar.d(z10, false);
        }
        rn0Var.l();
    }

    @Override
    public void Z(float f7) {
        d7 d7Var = (d7) this.f295b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.f7809t0 = f7;
        o8Var.f7789j = true;
        d7Var.y(true);
    }

    @Override
    public Object a() {
        return this.f295b;
    }

    @Override
    public void a0(int i10, long j3) {
        ArrayList arrayList;
        d7 d7Var = (d7) this.f295b;
        o8 o8Var = d7Var.d;
        if (o8Var != null && (arrayList = o8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((o8) d7Var.d.T.get(i10)).X = j3;
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        h7.f fVar = new h7.f(1, (TaskCompletionSource) obj2);
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int i10 = q7.a.f44230a;
        obtain.writeStrongBinder(fVar);
        q7.a.b(obtain, (GetCredentialRequest) this.f295b);
        q7.a.b(obtain, gVar);
        ((h7.b) ((h7.d) ((h7.e) obj).u())).G0(obtain, 1);
    }

    @Override
    public void b(int i10) {
        e0 e0Var = ((d7) this.f295b).E;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                d0 d0Var = (d0) obj;
                if (d0Var.f7053a == i10) {
                    d0Var.f7054b.d(1.0f, true);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public void c(float f7) {
        d7 d7Var = (d7) this.f295b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.f7811u0 = f7;
        o8Var.f7789j = true;
        d7Var.c();
    }

    @Override
    public void c0() {
        z zVar = (z) this.f295b;
        p3 p3Var = zVar.O;
        if (p3Var != null) {
            ji.a aVar = zVar.f13775a;
            v3.N1(p3Var.f14138a);
        }
    }

    @Override
    public int d(long j3) {
        if (j3 < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public void d0(long j3) {
        d7 d7Var = (d7) this.f295b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.D = j3;
        o8Var.f7789j = true;
        d7Var.w(true);
    }

    @Override
    public long e(int i10) {
        boolean z10;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        return 0L;
    }

    @Override
    public void e0(byte[] bArr, int i10, int i11, z3.l lVar, e2.h hVar) {
        boolean z10;
        d2.b a2;
        boolean z11;
        v vVar = (v) this.f295b;
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
                    byte[] bArr2 = vVar.f8817a;
                    int i14 = vVar.f8818b;
                    String str = e2.d0.f8765a;
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
                    aVar.f6497a = charSequence;
                    aVar.f6498b = null;
                    a2 = aVar.a();
                } else {
                    Pattern pattern = i4.h.f11876a;
                    i4.g gVar2 = new i4.g();
                    gVar2.f11869c = charSequence;
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
    public void f(int i10) {
        boolean z10;
        rn0 rn0Var = (rn0) this.f295b;
        rn0Var.D0--;
        rn0Var.f11102e0 = i10;
        if (rn0Var.f11104f0 != i10) {
            rn0Var.f11118s.clear();
        }
        if (rn0Var.f11105g0 != i10) {
            rn0Var.I.clear();
        }
        rn0Var.N = true;
        gy gyVar = rn0Var.U;
        if (gyVar != null) {
            if (rn0Var.D0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            gyVar.d(z10, true);
        }
        rn0Var.l();
        gy gyVar2 = rn0Var.U;
        if (gyVar2 != null) {
            gyVar2.c();
        }
    }

    @Override
    public void f0(Object obj) {
        int i10 = this.f294a;
        Object obj2 = this.f295b;
        switch (i10) {
            case 3:
                androidx.biometric.p pVar = (androidx.biometric.p) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (pVar.R()) {
                        pVar.W(pVar.q(2131689613));
                    }
                    y yVar = pVar.f1066l0;
                    if (!yVar.f1084n) {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    } else {
                        Executor executor = yVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.n(1);
                        }
                        executor.execute(new androidx.biometric.g(pVar, 0));
                    }
                    y yVar2 = pVar.f1066l0;
                    if (yVar2.f1091u == null) {
                        yVar2.f1091u = new androidx.lifecycle.z();
                    }
                    y.h(yVar2.f1091u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                o oVar = (o) obj2;
                if (((t) obj) != null && oVar.f1508r0) {
                    oVar.getClass();
                    throw new IllegalStateException("Fragment " + oVar + " did not return a View from onCreateView() or this was called before onCreateView().");
                }
                return;
        }
    }

    @Override
    public void g() {
        z zVar = (z) this.f295b;
        p3 p3Var = zVar.O;
        if (p3Var != null) {
            v3.O1(p3Var.f14138a, zVar.f13775a);
        }
    }

    @Override
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override
    public List h(long j3) {
        if (j3 >= 0) {
            return (List) this.f295b;
        }
        return Collections.EMPTY_LIST;
    }

    public void h0(j6.l lVar, u uVar) {
        Object obj = this.f295b;
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) obj;
        if (j0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (j0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            androidx.fragment.app.j0 j0Var2 = (androidx.fragment.app.j0) obj;
            androidx.biometric.p pVar = (androidx.biometric.p) j0Var2.D("androidx.biometric.BiometricFragment");
            if (pVar == null) {
                pVar = new androidx.biometric.p();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(j0Var2);
                aVar.f(0, pVar, "androidx.biometric.BiometricFragment");
                aVar.e(true, true);
                j0Var2.A(true);
                j0Var2.E();
            }
            androidx.fragment.app.u k10 = pVar.k();
            if (k10 == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                return;
            }
            y yVar = pVar.f1066l0;
            yVar.f1077f = lVar;
            int i10 = lVar.f13576a;
            if (i10 == 0) {
                if (uVar != null) {
                    i10 = 15;
                } else {
                    i10 = 255;
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && i11 < 30 && i10 == 15 && uVar == null) {
                yVar.f1078g = v7.o.a();
            } else {
                yVar.f1078g = uVar;
            }
            if (pVar.Q()) {
                pVar.f1066l0.f1081k = pVar.q(2131689576);
            } else {
                pVar.f1066l0.f1081k = null;
            }
            if (pVar.Q() && new aa.a(new androidx.biometric.s(k10, 0)).g(255) != 0) {
                pVar.f1066l0.f1084n = true;
                pVar.S();
            } else if (pVar.f1066l0.f1086p) {
                pVar.f1065k0.postDelayed(new androidx.biometric.o(pVar), 600L);
            } else {
                pVar.X();
            }
        }
    }

    @Override
    public Object h2() {
        Type type = (Type) this.f295b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new RuntimeException("Invalid EnumMap type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumMap type: " + type.toString());
    }

    @Override
    public void i(float f7) {
        d7 d7Var = (d7) this.f295b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.G = f7;
        o8Var.f7789j = true;
        d7Var.c();
    }

    @Override
    public void j(Object obj) {
        Bundle extras;
        switch (this.f294a) {
            case 6:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.f295b;
                androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) i0Var.F.pollFirst();
                if (e0Var == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str = e0Var.f1436a;
                int i10 = e0Var.f1437b;
                r m10 = i0Var.f1450c.m(str);
                if (m10 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    return;
                }
                m10.x(i10, aVar.f906a, aVar.f907b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f295b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f907b;
                int i11 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f4424a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i11, extras);
                }
                int i12 = aVar2.f906a;
                if (i12 != -1 || i11 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    public JSONObject j0(aa.b bVar) {
        String str = (String) this.f295b;
        int i10 = bVar.f387c;
        t9.b bVar2 = t9.b.f46507a;
        bVar2.c("Settings response code was: " + i10);
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            String str2 = "Settings request failed; (status: " + i10 + ") from " + str;
            if (bVar2.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = bVar.f386b;
        try {
            return new JSONObject(str3);
        } catch (Exception e7) {
            bVar2.d("Failed to parse settings JSON from " + str, e7);
            bVar2.d("Settings response " + str3, null);
            return null;
        }
    }

    @Override
    public int k() {
        return 1;
    }

    public db.i k0(Object obj) {
        db.g gVar = ((gb.a0) this.f295b).f10526b;
        gVar.getClass();
        if (obj == null) {
            return db.k.f6709a;
        }
        Class<?> cls = obj.getClass();
        gb.n nVar = new gb.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    @Override
    public void l(Bitmap bitmap) {
        ((f6.i) this.f295b).e(bitmap, 3);
    }

    @Override
    public void m(long j3, boolean z10) {
        d7 d7Var = (d7) this.f295b;
        if (!z10) {
            d7Var.m(j3);
            return;
        }
        g71 g71Var = d7Var.f7103e;
        if (g71Var != null) {
            g71Var.L(j3, true);
        } else if (d7Var.j()) {
            d7Var.E.m(j3, true);
        } else {
            g71 g71Var2 = d7Var.f7129y;
            if (g71Var2 != null) {
                g71Var2.L(j3, false);
            }
        }
    }

    @Override
    public void n() {
        d7 d7Var = (d7) this.f295b;
        d7Var.s(null, null, true);
        pc pcVar = ((dc) d7Var).C0;
        dc dcVar = pcVar.X0;
        if (dcVar != null) {
            dcVar.s(null, null, true);
        }
        rb rbVar = pcVar.f7938v1;
        if (rbVar != null) {
            rbVar.q0();
        }
        fc fcVar = pcVar.f7878c1;
        if (fcVar != null) {
            fcVar.setHasRoundVideo(false);
        }
        o8 o8Var = pcVar.K1;
        if (o8Var != null) {
            File file = o8Var.f7799o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                pcVar.K1.f7799o0 = null;
            }
            if (pcVar.K1.f7801p0 != null) {
                try {
                    new File(pcVar.K1.f7801p0).delete();
                } catch (Exception unused2) {
                }
                pcVar.K1.f7801p0 = null;
            }
        }
    }

    public void n0() {
        e6.h hVar = (e6.h) this.f295b;
        Iterator it = hVar.h.iterator();
        if (!it.hasNext()) {
            Iterator it2 = hVar.f8910i.iterator();
            while (it2.hasNext()) {
                ((e6.g) it2.next()).a();
            }
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override
    public void o(float f7) {
        d7 d7Var = (d7) this.f295b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.f7807s0 = f7;
        o8Var.f7789j = true;
        d7Var.y(true);
    }

    public void o0(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f295b;
        t0(i10, 2);
        try {
            int y02 = y0(str.length());
            if (y02 == y0(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= y02) {
                    byteBuffer.position(position + y02);
                    u0(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    r0((position2 - position) - y02);
                    byteBuffer.position(position2);
                    return;
                }
                throw new b5(position + y02, byteBuffer.limit());
            }
            r0(m0(str));
            u0(str, byteBuffer);
        } catch (BufferOverflowException e7) {
            b5 b5Var = new b5(byteBuffer.position(), byteBuffer.limit());
            b5Var.initCause(e7);
            throw b5Var;
        }
    }

    @Override
    public void onComplete(Task task) {
        zd.m mVar = (zd.m) this.f295b;
        Exception exception = task.getException();
        if (exception == null) {
            if (task.isCanceled()) {
                mVar.n(null);
                return;
            } else {
                mVar.resumeWith(task.getResult());
                return;
            }
        }
        mVar.resumeWith(t7.a(exception));
    }

    @Override
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        throw new UnsupportedOperationException("Method not decompiled: a4.m.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override
    public void onSuccess(Object obj) {
        int i10;
        int i11;
        f2 f2Var;
        f1 b10;
        d6.a aVar = (d6.a) this.f295b;
        Bundle bundle = (Bundle) obj;
        if (r0.f5469j) {
            Context context = aVar.f6603a;
            g6.r rVar = aVar.f6607f;
            r0 r0Var = new r0(context, rVar, aVar.f6605c, aVar.f6610j, aVar.f6608g);
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
            String t10 = p6.t(packageName, ".client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            r0Var.h = i11;
            l5.s.b(context);
            r0Var.f5475g = l5.s.a().c(j5.a.f13534e).a("CAST_SENDER_SDK", new i5.c("proto"), b0.f5225a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                r0Var.f5473e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(t10, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v e7 = w.e();
                e7.f5144c = new a6.m(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                e7.d = new k6.c[]{c6.y.f4614c};
                e7.f5143b = false;
                e7.f5142a = 8426;
                Task e10 = rVar.e(0, e7.a());
                ?? obj2 = new Object();
                obj2.f13577b = r0Var;
                obj2.f13578c = packageName;
                obj2.f13576a = i10;
                obj2.d = sharedPreferences;
                e10.addOnSuccessListener(obj2);
            }
            if (z10) {
                n6.l.h(sharedPreferences);
                g6.b bVar = f2.f5353i;
                synchronized (f2.class) {
                    try {
                        if (f2.f5355k == null) {
                            f2.f5355k = new f2(sharedPreferences, r0Var, packageName);
                        }
                        f2Var = f2.f5355k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = f2Var.f5358c;
                SharedPreferences sharedPreferences2 = f2Var.f5357b;
                HashSet hashSet = f2Var.f5360f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = f2Var.f5361g;
                hashSet2.clear();
                f2Var.h = 0L;
                String str2 = f2.f5354j;
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
                    n6.l.h(f2Var.f5359e);
                    n6.l.h(f2Var.d);
                    f2Var.f5359e.post(f2Var.d);
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
    public z3.d p(int i10, int i11, byte[] bArr) {
        return w.f.a(this, bArr, i11);
    }

    public void p0(int i10, byte[] bArr) {
        t0(i10, 2);
        r0(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f295b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new b5(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public boolean q() {
        return false;
    }

    public void q0(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.f295b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new b5(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public void r(boolean z10) {
        d7 d7Var = (d7) this.f295b;
        if (d7Var.j()) {
            d7Var.E.getClass();
        }
        d7Var.x(-4, z10);
    }

    public void r0(int i10) {
        while ((i10 & (-128)) != 0) {
            q0((i10 & 127) | 128);
            i10 >>>= 7;
        }
        q0(i10);
    }

    @Override
    public void s() {
        ((di.j0) this.f295b).d.invalidate();
    }

    @Override
    public void t(float f7, int i10) {
        ArrayList arrayList;
        d7 d7Var = (d7) this.f295b;
        o8 o8Var = d7Var.d;
        if (o8Var != null && (arrayList = o8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((o8) d7Var.d.T.get(i10)).P = f7;
        }
    }

    public void t0(int i10, int i11) {
        r0((i10 << 3) | i11);
    }

    @Override
    public q9 u() {
        p3 p3Var = ((z) this.f295b).O;
        if (p3Var != null) {
            return p3Var.f14138a.getTextSelectionHelper();
        }
        return null;
    }

    public void v(c3.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f295b;
        long[] jArr = jVar.f4300e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(jVar.f4300e[0]), jVar);
        }
    }

    public void v0(long j3) {
        while (((-128) & j3) != 0) {
            q0((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        q0((int) j3);
    }

    @Override
    public a0.i w() {
        return null;
    }

    @Override
    public void y(float f7) {
        d7 d7Var = (d7) this.f295b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.P = f7;
        d7Var.c();
    }

    @Override
    public java.lang.Object z(ce.c r7, kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: a4.m.z(ce.c, kd.c):java.lang.Object");
    }

    public m(byte[] bArr, int i10) {
        this.f294a = 12;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.f295b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public void a(h1 h1Var) {
        p3 p3Var = ((z) this.f295b).O;
        if (p3Var != null) {
            v3 v3Var = p3Var.f14138a;
            v3.L1(v3Var, h1Var);
            v3Var.f14275h3.v(h1Var, true);
        }
    }

    public m(int i10) {
        this.f294a = i10;
        switch (i10) {
            case 25:
                this.f295b = new v();
                return;
            default:
                this.f295b = new LinkedHashMap();
                return;
        }
    }

    public m(String str, ob.a aVar) {
        this.f294a = 14;
        if (str != null) {
            this.f295b = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    public m(LaunchActivity launchActivity, Executor executor, v7.n nVar) {
        this.f294a = 4;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            androidx.fragment.app.j0 s10 = launchActivity.s();
            y yVar = (y) new aa.a(launchActivity).n(y.class);
            this.f295b = s10;
            yVar.d = executor;
            yVar.f1076e = nVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void H() {
    }

    @Override
    public void b0() {
    }

    @Override
    public void reset() {
    }

    @Override
    public void x() {
    }

    @Override
    public void E(boolean z10) {
    }

    @Override
    public void K(Object obj) {
    }

    @Override
    public void W(boolean z10) {
    }

    @Override
    public void X(TLRPC.User user) {
    }

    @Override
    public void E0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override
    public void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
