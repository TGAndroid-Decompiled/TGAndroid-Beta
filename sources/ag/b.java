package ag;

import a0.f;
import a0.h;
import a1.g;
import a6.l;
import ai.r2;
import ai.s7;
import ai.t3;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.fragment.app.f0;
import androidx.lifecycle.a0;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import c6.d0;
import c6.e0;
import c6.y;
import c7.v;
import ci.r4;
import ci.s3;
import ci.v9;
import ci.w9;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.p0;
import com.google.android.gms.internal.cast.z4;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.l1;
import ei.m0;
import ei.o6;
import ei.r6;
import g6.w;
import gb.s;
import hg.y1;
import hg.z1;
import i7.i;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k2.q;
import k2.t;
import k2.u0;
import k2.x;
import ki.c6;
import ki.d2;
import ki.h1;
import ki.h2;
import ki.j0;
import ki.j3;
import ki.j4;
import ki.p3;
import ki.q3;
import ki.u3;
import ki.u4;
import ki.w3;
import ki.z;
import m.v3;
import mg.o;
import n7.k;
import n7.m1;
import n7.n1;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.x71;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.px;
import org.telegram.ui.qz0;
import org.telegram.ui.wy0;
import r0.b0;
import r0.i0;
import r0.k1;
import r0.n;
import rg.b2;
import t7.u;
import y2.m;
public final class b implements a0, androidx.activity.result.b, r, v9, OnSuccessListener, l1, o, x71, n, gb.n, z1, x, j0, u3, m {
    public final int f633a;
    public final Object f634b;

    public b(j jVar, o6.a aVar, int i10) {
        this.f633a = i10;
        this.f634b = aVar;
    }

    public static int a0(CharSequence charSequence) {
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

    public static int f0(int i10, String str) {
        int k02 = k0(i10);
        int a02 = a0(str);
        return l0(a02) + a02 + k02;
    }

    public static void h0(CharSequence charSequence, ByteBuffer byteBuffer) {
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

    public static int j0(long j10) {
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

    public static int k0(int i10) {
        return l0(i10 << 3);
    }

    public static int l0(int i10) {
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
    public void A() {
        x2.n nVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f634b;
        synchronized (ffmpegAudioRenderer.f12312a) {
            nVar = ffmpegAudioRenderer.H;
        }
        if (nVar != null) {
            nVar.m();
        }
    }

    @Override
    public m9 B() {
        switch (this.f633a) {
            case 25:
                return (z) this.f634b;
            default:
                return (u4) this.f634b;
        }
    }

    @Override
    public k1 B0(View view, k1 k1Var) {
        boolean z10;
        k1 k1Var2;
        int b10;
        int c10;
        boolean z11;
        int color;
        int d = k1Var.d();
        g.r rVar = (g.r) this.f634b;
        Context context = rVar.e;
        int d10 = k1Var.d();
        ActionBarContextView actionBarContextView = rVar.f10725y;
        int i10 = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rVar.f10725y.getLayoutParams();
            boolean z12 = true;
            if (rVar.f10725y.isShown()) {
                if (rVar.f10716l0 == null) {
                    rVar.f10716l0 = new Rect();
                    rVar.m0 = new Rect();
                }
                Rect rect = rVar.f10716l0;
                Rect rect2 = rVar.m0;
                rect.set(k1Var.b(), k1Var.d(), k1Var.c(), k1Var.a());
                ViewGroup viewGroup = rVar.J;
                Method method = v3.f16357a;
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
                ViewGroup viewGroup2 = rVar.J;
                WeakHashMap weakHashMap = i0.f44818a;
                k1 a2 = b0.a(viewGroup2);
                if (a2 == null) {
                    b10 = 0;
                } else {
                    b10 = a2.b();
                }
                if (a2 == null) {
                    c10 = 0;
                } else {
                    c10 = a2.c();
                }
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z11 = true;
                }
                if (i11 > 0 && rVar.L == null) {
                    View view2 = new View(context);
                    rVar.L = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    rVar.J.addView(rVar.L, -1, layoutParams);
                } else {
                    View view3 = rVar.L;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            rVar.L.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = rVar.L;
                if (view4 == null) {
                    z12 = false;
                }
                if (z12 && view4.getVisibility() != 0) {
                    View view5 = rVar.L;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        color = context.getColor(2131099654);
                    } else {
                        color = context.getColor(2131099653);
                    }
                    view5.setBackgroundColor(color);
                }
                if (!rVar.Q && z12) {
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
                rVar.f10725y.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view6 = rVar.L;
        if (view6 != null) {
            if (z10) {
                i10 = 0;
            }
            view6.setVisibility(i10);
        }
        if (d != d10) {
            k1Var2 = k1Var.f(k1Var.b(), d10, k1Var.c(), k1Var.a());
        } else {
            k1Var2 = k1Var;
        }
        return i0.g(view, k1Var2);
    }

    @Override
    public i80 C(View view) {
        return i80.H((d2) this.f634b, view);
    }

    @Override
    public void E() {
        d2 d2Var = (d2) this.f634b;
        d2Var.z0();
        d2Var.C0();
    }

    @Override
    public ki.a F() {
        switch (this.f633a) {
            case 25:
                return ((z) this.f634b).f15110a;
            default:
                return ((u4) this.f634b).f15110a;
        }
    }

    @Override
    public boolean G() {
        switch (this.f633a) {
            case 25:
                z zVar = (z) this.f634b;
                q3 q3Var = zVar.O;
                if (q3Var != null) {
                    ki.a aVar = zVar.f15110a;
                    if (q3Var.f15458a.T4()) {
                        return true;
                    }
                }
                return false;
            default:
                u4 u4Var = (u4) this.f634b;
                p3 p3Var = u4Var.N;
                if (p3Var != null) {
                    ki.a aVar2 = u4Var.f15110a;
                    if (p3Var.f15444a.T4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public void H(ki.v3 v3Var, View view) {
        d2 d2Var = (d2) this.f634b;
        i80 H = i80.H(d2Var, view);
        H.Q = true;
        d2Var.getParentActivity();
        d2Var.getResourceProvider();
        d2Var.f15226x0 = j4.b(H, d2Var, v3Var, false);
    }

    @Override
    public void I(Exception exc) {
        e2.a.d("DecoderAudioRenderer", "Audio sink error", exc);
        qf.b bVar = ((FfmpegAudioRenderer) this.f634b).I;
        Handler handler = (Handler) bVar.f44442b;
        if (handler != null) {
            handler.post(new q(bVar, exc, 1));
        }
    }

    @Override
    public h J() {
        return null;
    }

    @Override
    public void K(int i10, int i11) {
        switch (this.f633a) {
            case 25:
                z zVar = (z) this.f634b;
                q3 q3Var = zVar.O;
                if (q3Var != null) {
                    ki.a aVar = zVar.f15110a;
                    h2 h2Var = q3Var.f15458a.H3;
                    if (h2Var != null) {
                        h2Var.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                u4 u4Var = (u4) this.f634b;
                p3 p3Var = u4Var.N;
                if (p3Var != null) {
                    ki.a aVar2 = u4Var.f15110a;
                    h2 h2Var2 = p3Var.f15444a.H3;
                    if (h2Var2 != null) {
                        h2Var2.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void L() {
        ((FfmpegAudioRenderer) this.f634b).Z = true;
    }

    public ea.a M(JSONObject jSONObject) {
        ea.c dVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            dVar = new u(7);
        } else {
            dVar = new oa.d(8);
        }
        return dVar.s0((u) this.f634b, jSONObject);
    }

    @Override
    public void N() {
        switch (this.f633a) {
            case 25:
                z zVar = (z) this.f634b;
                q3 q3Var = zVar.O;
                if (q3Var != null) {
                    ki.a aVar = zVar.f15110a;
                    w3 w3Var = q3Var.f15458a;
                    h2 h2Var = w3Var.H3;
                    if (h2Var != null) {
                        h2Var.g();
                    }
                    w3Var.f15591f3.onContentChanged();
                    return;
                }
                return;
            default:
                u4 u4Var = (u4) this.f634b;
                p3 p3Var = u4Var.N;
                if (p3Var != null) {
                    ki.a aVar2 = u4Var.f15110a;
                    w3 w3Var2 = p3Var.f15444a;
                    h2 h2Var2 = w3Var2.H3;
                    if (h2Var2 != null) {
                        h2Var2.g();
                    }
                    w3Var2.f15591f3.onContentChanged();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean O(int i10) {
        if (i10 == ((oo0) this.f634b).f11877d0) {
            return true;
        }
        return false;
    }

    @Override
    public void P(u0 u0Var) {
        qf.b bVar = ((FfmpegAudioRenderer) this.f634b).I;
        Handler handler = (Handler) bVar.f44442b;
        if (handler != null) {
            handler.post(new t(bVar, u0Var, 1));
        }
    }

    public void Q(String str, Bitmap bitmap) {
        f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(g.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f634b).putParcelable(str, bitmap);
    }

    @Override
    public boolean Q0(long j10, int i10, int i11, int i12, w9 w9Var) {
        ImageReceiver imageReceiver;
        r4 r4Var;
        r4 r4Var2;
        r4 r4Var3;
        r4 r4Var4;
        w9Var.f6061b = null;
        w9Var.f6062c = null;
        wy0 wy0Var = (wy0) this.f634b;
        qz0 qz0Var = wy0Var.h;
        ArrayList arrayList = wy0Var.f33876w;
        if (wy0Var.N < 0.2f) {
            w9Var.f6061b = qz0Var.getImageReceiver();
            w9Var.f6062c = null;
            w9Var.f6060a = qz0Var;
            w9Var.h = 0.0f;
            w9Var.f6065i = AndroidUtilities.displaySize.y;
            w9Var.f6064g = (View) wy0Var.getParent();
            w9Var.d = wy0Var.f33878y;
            w9Var.f6070n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 < arrayList.size()) {
                r4 r4Var5 = (r4) arrayList.get(i13);
                if (r4Var5.e >= 1.0f && r4Var5.f5853a == i11) {
                    int i14 = i13 - 1;
                    if (i14 >= 0) {
                        r4Var3 = (r4) arrayList.get(i14);
                    } else {
                        r4Var3 = null;
                    }
                    int i15 = i13 - 2;
                    if (i15 >= 0) {
                        r4Var4 = (r4) arrayList.get(i15);
                    } else {
                        r4Var4 = null;
                    }
                    r4 d = ProfileStoriesView.d(r4Var3, r4Var4, r4Var5);
                    imageReceiver = r4Var5.f5854b;
                    r4Var2 = d;
                    r4Var = r4Var5;
                } else {
                    i13++;
                }
            } else {
                imageReceiver = null;
                r4Var = null;
                r4Var2 = null;
                break;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        w9Var.f6062c = imageReceiver;
        w9Var.f6061b = null;
        w9Var.f6060a = wy0Var;
        w9Var.h = 0.0f;
        w9Var.f6065i = AndroidUtilities.displaySize.y;
        w9Var.f6064g = (View) wy0Var.getParent();
        if (r4Var != null && r4Var2 != null) {
            w9Var.f6063f = new s7(this, new RectF(r4Var.f5862m), r4Var, new RectF(r4Var2.f5862m), r4Var2);
            return true;
        }
        w9Var.f6063f = null;
        return true;
    }

    @Override
    public void S(u0 u0Var) {
        qf.b bVar = ((FfmpegAudioRenderer) this.f634b).I;
        Handler handler = (Handler) bVar.f44442b;
        if (handler != null) {
            handler.post(new t(bVar, u0Var, 0));
        }
    }

    public void U(long j10) {
        f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey("android.media.metadata.DURATION") && ((Integer) fVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        ((Bundle) this.f634b).putLong("android.media.metadata.DURATION", j10);
    }

    @Override
    public void W() {
        switch (this.f633a) {
            case 25:
                z zVar = (z) this.f634b;
                q3 q3Var = zVar.O;
                if (q3Var != null) {
                    ki.a aVar = zVar.f15110a;
                    w3.P1(q3Var.f15458a);
                    return;
                }
                return;
            default:
                u4 u4Var = (u4) this.f634b;
                p3 p3Var = u4Var.N;
                if (p3Var != null) {
                    ki.a aVar2 = u4Var.f15110a;
                    w3.P1(p3Var.f15444a);
                    return;
                }
                return;
        }
    }

    public void X(String str, String str2) {
        f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(g.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f634b).putCharSequence(str, str2);
    }

    @Override
    public void X0(long j10, int i10, s3 s3Var) {
        int i11 = ProfileStoriesView.f33851s0;
        ((wy0) this.f634b).f(true, false);
        s3Var.run();
    }

    @Override
    public void Y(ArrayList arrayList) {
        boolean z10;
        oo0 oo0Var = (oo0) this.f634b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            oo0Var.J.add(((y1) arrayList.get(i10)).f12110a);
        }
        px pxVar = oo0Var.U;
        if (pxVar != null) {
            if (oo0Var.D0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            pxVar.d(z10, false);
        }
        oo0Var.l();
    }

    @Override
    public void Z(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.q qVar = (androidx.biometric.q) this.f634b;
        if (charSequence != null) {
            if (qVar.R()) {
                qVar.W(charSequence);
            }
            qVar.f2837l0.d(null);
        }
    }

    @Override
    public void a() {
        l2.h hVar = (l2.h) this.f634b;
        hVar.A.a();
        IOException iOException = hVar.C;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i10 = this.f633a;
        Object obj3 = this.f634b;
        switch (i10) {
            case 5:
                b7.b bVar = new b7.b(0, (TaskCompletionSource) obj2);
                n1 n1Var = (n1) ((m1) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(n1Var.f17298b);
                int i11 = k.f17284a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                ((v) obj3).writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    n1Var.f17297a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            case 7:
                w wVar = (w) obj;
                g6.f fVar = (g6.f) wVar.u();
                d0 d0Var = ((e0) obj3).f4839k;
                Parcel N0 = fVar.N0();
                com.google.android.gms.internal.cast.v.d(N0, d0Var);
                fVar.S0(N0, 18);
                g6.f fVar2 = (g6.f) wVar.u();
                fVar2.S0(fVar2.N0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
            case 20:
                h7.f fVar3 = new h7.f(0, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i12 = q7.a.f44412a;
                obtain3.writeStrongBinder(fVar3);
                q7.a.b(obtain3, (g7.f) obj3);
                q7.a.b(obtain3, gVar);
                ((h7.b) ((h7.d) ((h7.e) obj).u())).F0(obtain3, 6);
                return;
            default:
                l lVar = new l((TaskCompletionSource) obj2);
                i iVar = (i) ((i7.c) obj).u();
                Parcel J0 = iVar.J0();
                int i13 = i7.f.f12733a;
                J0.writeStrongBinder(lVar);
                i7.f.c(J0, (x5.e) obj3);
                iVar.K0(J0, 1);
                return;
        }
    }

    public void b0(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f634b;
        g0(i10, 2);
        try {
            int l02 = l0(str.length());
            if (l02 == l0(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= l02) {
                    byteBuffer.position(position + l02);
                    h0(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    e0((position2 - position) - l02);
                    byteBuffer.position(position2);
                    return;
                }
                throw new z4(position + l02, byteBuffer.limit());
            }
            e0(a0(str));
            h0(str, byteBuffer);
        } catch (BufferOverflowException e) {
            z4 z4Var = new z4(byteBuffer.position(), byteBuffer.limit());
            z4Var.initCause(e);
            throw z4Var;
        }
    }

    @Override
    public void c(h1 h1Var) {
        switch (this.f633a) {
            case 25:
                q3 q3Var = ((z) this.f634b).O;
                if (q3Var != null) {
                    w3 w3Var = q3Var.f15458a;
                    w3.N1(w3Var, h1Var);
                    w3Var.f15591f3.n(h1Var, true);
                    return;
                }
                return;
            default:
                p3 p3Var = ((u4) this.f634b).N;
                if (p3Var != null) {
                    w3 w3Var2 = p3Var.f15444a;
                    w3.N1(w3Var2, h1Var);
                    w3Var2.f15591f3.n(h1Var, true);
                    return;
                }
                return;
        }
    }

    public void c0(int i10, byte[] bArr) {
        g0(i10, 2);
        e0(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f634b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new z4(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public boolean d(float f7) {
        boolean z10;
        int[] iArr;
        d2 d2Var = (d2) this.f634b;
        FrameLayout frameLayout = d2Var.f15222v0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f7 >= iArr[1]) {
                z10 = true;
                d2.Z(d2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        d2.Z(d2Var, z10, true);
        return z10;
    }

    public void d0(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.f634b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new z4(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public void e(long j10) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f634b;
        ffmpegAudioRenderer.f3425g0 = true;
        qf.b bVar = ffmpegAudioRenderer.I;
        Handler handler = (Handler) bVar.f44442b;
        if (handler != null) {
            handler.post(new t3(bVar, j10, 13));
        }
    }

    public void e0(int i10) {
        while ((i10 & (-128)) != 0) {
            d0((i10 & 127) | 128);
            i10 >>>= 7;
        }
        d0(i10);
    }

    @Override
    public void f(int i10) {
        boolean z10;
        oo0 oo0Var = (oo0) this.f634b;
        oo0Var.D0--;
        oo0Var.f11878e0 = i10;
        if (oo0Var.f11880f0 != i10) {
            oo0Var.f11894s.clear();
        }
        if (oo0Var.f11881g0 != i10) {
            oo0Var.I.clear();
        }
        oo0Var.N = true;
        px pxVar = oo0Var.U;
        if (pxVar != null) {
            if (oo0Var.D0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            pxVar.d(z10, true);
        }
        oo0Var.l();
        px pxVar2 = oo0Var.U;
        if (pxVar2 != null) {
            pxVar2.c();
        }
    }

    @Override
    public Object f2() {
        Class cls = (Class) this.f634b;
        try {
            return s.f10985a.a(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    @Override
    public void g() {
        switch (this.f633a) {
            case 25:
                z zVar = (z) this.f634b;
                q3 q3Var = zVar.O;
                if (q3Var != null) {
                    w3.Q1(q3Var.f15458a, zVar.f15110a);
                    return;
                }
                return;
            default:
                u4 u4Var = (u4) this.f634b;
                p3 p3Var = u4Var.N;
                if (p3Var != null) {
                    w3.Q1(p3Var.f15444a, u4Var.f15110a);
                    return;
                }
                return;
        }
    }

    public void g0(int i10, int i11) {
        e0((i10 << 3) | i11);
    }

    @Override
    public void h(ki.a aVar) {
        d2 d2Var = (d2) this.f634b;
        if (aVar != null && (aVar.f15094b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(d2Var)) {
            ti tiVar = new ti(d2Var.getParentActivity(), d2Var, false, false, false, d2Var.getResourceProvider());
            tiVar.f30566c2 = new oa.d(12);
            tiVar.P = true;
            tiVar.A1.setVisibility(8);
            tiVar.f30629w2 = new r2(d2Var, aVar, tiVar, 12);
            tiVar.t1();
            tiVar.show();
        }
    }

    @Override
    public void i(Object obj) {
        Bundle extras;
        switch (this.f633a) {
            case 3:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f634b;
                f0 f0Var = (f0) j0Var.F.pollLast();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String str = f0Var.f3180a;
                int i10 = f0Var.f3181b;
                androidx.fragment.app.s f7 = j0Var.f3194c.f(str);
                if (f7 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                    return;
                }
                f7.x(i10, aVar.f2683a, aVar.f2684b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f634b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f2684b;
                int i11 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f4757a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.M;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i11, extras);
                }
                int i12 = aVar2.f2683a;
                if (i12 != -1 || i11 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    public void i0(long j10) {
        while (((-128) & j10) != 0) {
            d0((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        d0((int) j10);
    }

    @Override
    public void j() {
        ((FfmpegAudioRenderer) this.f634b).f3424f0 = true;
    }

    @Override
    public void l(int i10) {
        ((d2) this.f634b).o0(74, i10);
    }

    @Override
    public void m(ki.t3 t3Var, View view) {
        d2 d2Var = (d2) this.f634b;
        i80 H = i80.H(d2Var, view);
        H.Q = true;
        d2Var.f15226x0 = j4.c(H, d2Var, d2Var.getParentActivity(), d2Var.getResourceProvider(), t3Var, false);
    }

    @Override
    public void o() {
        int i10;
        d2 d2Var = (d2) this.f634b;
        j3 j3Var = d2Var.P.f15603l3;
        if (j3Var != null && j3Var.x() && d2Var.P.D4()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        d2Var.x0(i10, true);
        d2Var.y0();
        d2Var.w0();
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        qf.b bVar = ((FfmpegAudioRenderer) this.f634b).I;
        Handler handler = (Handler) bVar.f44442b;
        if (handler != null) {
            handler.post(new ah.g(bVar, i10, 14));
        }
    }

    @Override
    public void onContentChanged() {
        d2 d2Var = (d2) this.f634b;
        if (d2Var.f15228y0 != null) {
            boolean n32 = d2Var.P.n3();
            d2Var.L0 = n32;
            d2Var.f15228y0.h(n32);
            d2Var.f15228y0.invalidate();
        }
        d2Var.C0();
        Runnable runnable = d2Var.M0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        qf.b bVar = ((FfmpegAudioRenderer) this.f634b).I;
        Handler handler = (Handler) bVar.f44442b;
        if (handler != null) {
            handler.post(new ah.t(12, bVar, z10));
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        r6 r6Var = (r6) this.f634b;
        o6 o6Var = r6Var.M;
        a81 a81Var = r6Var.f9736x;
        if (a81Var == null) {
            return;
        }
        if (a81Var.y()) {
            AndroidUtilities.runOnUIThread(o6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(o6Var);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        int i10;
        int i11;
        com.google.android.gms.internal.cast.d2 d2Var;
        d1 b10;
        d6.a aVar = (d6.a) this.f634b;
        Bundle bundle = (Bundle) obj;
        if (p0.f6749j) {
            Context context = aVar.f7830a;
            g6.r rVar = aVar.f7833f;
            p0 p0Var = new p0(context, rVar, aVar.f7832c, aVar.f7836j, aVar.f7834g);
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
            String u10 = r4.c.u(packageName, ".client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            p0Var.h = i11;
            l5.t.b(context);
            p0Var.f6754g = l5.t.a().c(j5.a.e).a("CAST_SENDER_SDK", new i5.c("proto"), com.google.android.gms.internal.cast.z.f6846a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                p0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(u10, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.u b11 = com.google.android.gms.common.api.internal.v.b();
                b11.f6498c = new a6.m(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                b11.d = new k6.c[]{y.f4928c};
                b11.f6497b = false;
                b11.f6496a = 8426;
                Task e = rVar.e(0, b11.a());
                ?? obj2 = new Object();
                obj2.f14289b = p0Var;
                obj2.f14290c = packageName;
                obj2.f14288a = i10;
                obj2.d = sharedPreferences;
                e.addOnSuccessListener(obj2);
            }
            if (z10) {
                n6.l.h(sharedPreferences);
                g6.b bVar = com.google.android.gms.internal.cast.d2.f6644i;
                synchronized (com.google.android.gms.internal.cast.d2.class) {
                    try {
                        if (com.google.android.gms.internal.cast.d2.f6646k == null) {
                            com.google.android.gms.internal.cast.d2.f6646k = new com.google.android.gms.internal.cast.d2(sharedPreferences, p0Var, packageName);
                        }
                        d2Var = com.google.android.gms.internal.cast.d2.f6646k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = d2Var.f6649c;
                SharedPreferences sharedPreferences2 = d2Var.f6648b;
                HashSet hashSet = d2Var.f6650f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = d2Var.f6651g;
                hashSet2.clear();
                d2Var.h = 0L;
                String str2 = com.google.android.gms.internal.cast.d2.f6645j;
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
                                d1 b12 = com.google.android.gms.internal.cast.d2.b(str3.substring(41));
                                if (b12 != null) {
                                    hashSet2.add(b12);
                                    hashSet.add(b12);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = com.google.android.gms.internal.cast.d2.b(str3.substring(41))) != null) {
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
                com.google.android.gms.internal.cast.d2.a(d1.CAST_CONTEXT);
            }
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        b2 b2Var = ((r6) this.f634b).f9734w;
        if (b2Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(b2Var.f45304y0 - f10) >= 1.0E-4f) {
                b2Var.f45304y0 = f10;
                b2Var.requestLayout();
            }
        }
    }

    @Override
    public Object p(Object obj, Object obj2) {
        return ((d9.k) this.f634b).apply(obj2);
    }

    @Override
    public void q() {
        d2 d2Var = (d2) this.f634b;
        d2Var.I0 = d2Var.K0;
        d2.Z(d2Var, false, false);
        d2Var.x0(2, true);
    }

    @Override
    public void r() {
        ((m0) this.f634b).e.invalidate();
    }

    @Override
    public void s(int i10, long j10, long j11) {
        qf.b bVar = ((FfmpegAudioRenderer) this.f634b).I;
        Handler handler = (Handler) bVar.f44442b;
        if (handler != null) {
            handler.post(new k2.s(bVar, i10, j10, j11, 0));
        }
    }

    @Override
    public n9 t() {
        switch (this.f633a) {
            case 25:
                q3 q3Var = ((z) this.f634b).O;
                if (q3Var != null) {
                    return q3Var.f15458a.getTextSelectionHelper();
                }
                return null;
            default:
                p3 p3Var = ((u4) this.f634b).N;
                if (p3Var != null) {
                    return p3Var.f15444a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override
    public void v(CharSequence charSequence) {
        switch (this.f633a) {
            case 25:
                q3 q3Var = ((z) this.f634b).O;
                if (q3Var != null) {
                    q3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        q3Var.f15458a.u4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                p3 p3Var = ((u4) this.f634b).N;
                if (p3Var != null) {
                    p3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        p3Var.f15444a.u4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void x(c6 c6Var, String str) {
        d2 d2Var = (d2) this.f634b;
        if (d2Var.f15229z0 == null) {
            d2Var.f15229z0 = new m.s3(new j5.b(this, 4), d2Var.getResourceProvider());
        }
        d2Var.f15229z0.f(c6Var, str);
    }

    @Override
    public h y() {
        return null;
    }

    @Override
    public void z() {
        d2 d2Var = (d2) this.f634b;
        int i10 = 0;
        d2.Z(d2Var, false, true);
        int i11 = d2Var.I0;
        if (i11 != 2) {
            i10 = i11;
        }
        d2Var.x0(i10, true);
    }

    public b(Object obj, int i10) {
        this.f633a = i10;
        this.f634b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public b(byte[] bArr, int i10) {
        this.f633a = 10;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.f634b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public b(int i10) {
        this.f633a = i10;
        switch (i10) {
            case 1:
                this.f634b = new Bundle();
                return;
            case 12:
                this.f634b = new ArrayList();
                new ArrayList();
                new ArrayList();
                return;
            case 22:
                this.f634b = new HashMap();
                return;
            default:
                this.f634b = new n4.s[c.values().length];
                return;
        }
    }

    public b(MediaMetadataCompat mediaMetadataCompat) {
        this.f633a = 1;
        Bundle bundle = new Bundle(mediaMetadataCompat.f2571a);
        this.f634b = bundle;
        android.support.v4.media.session.b0.a(bundle);
    }

    @Override
    public void T() {
    }

    @Override
    public void V() {
    }

    @Override
    public void k() {
    }

    @Override
    public void u() {
    }

    @Override
    public void D(boolean z10) {
    }

    @Override
    public void R(boolean z10) {
    }

    @Override
    public void b(boolean z10) {
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
    public void w(int i10) {
    }

    @Override
    public void n(h1 h1Var, boolean z10) {
    }

    @Override
    public void onError(a81 a81Var, Exception exc) {
    }
}
