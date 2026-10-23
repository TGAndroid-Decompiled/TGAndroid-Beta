package a4;

import ai.t7;
import ai.u2;
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
import ci.s4;
import ci.t3;
import ci.w9;
import ci.x9;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.r;
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
import java.lang.reflect.Method;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
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
import m.s3;
import m.v3;
import mg.o;
import n7.m1;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.z71;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.nx;
import org.telegram.ui.oz0;
import org.telegram.ui.uy0;
import r0.b0;
import r0.i0;
import r0.k1;
import r0.n;
import rg.c2;
import t7.u;
import v7.u6;
public final class l implements z3.d, a0, androidx.activity.result.b, r, w9, OnSuccessListener, l1, o, z71, n, gb.n, z1, x, j0, u3 {
    public final int f278a;
    public final Object f279b;

    public l(com.google.android.gms.common.api.j jVar, o6.a aVar, int i10) {
        this.f278a = i10;
        this.f279b = aVar;
    }

    public static int d0(CharSequence charSequence) {
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

    public static int i0(int i10, String str) {
        int n02 = n0(i10);
        int d02 = d0(str);
        return o0(d02) + d02 + n02;
    }

    public static void k0(CharSequence charSequence, ByteBuffer byteBuffer) {
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

    public static int m0(long j10) {
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

    public static int n0(int i10) {
        return o0(i10 << 3);
    }

    public static int o0(int i10) {
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
    public void B() {
        x2.n nVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f279b;
        synchronized (ffmpegAudioRenderer.f12311a) {
            nVar = ffmpegAudioRenderer.H;
        }
        if (nVar != null) {
            nVar.m();
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
        g.r rVar = (g.r) this.f279b;
        Context context = rVar.e;
        int d10 = k1Var.d();
        ActionBarContextView actionBarContextView = rVar.f10724y;
        int i10 = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rVar.f10724y.getLayoutParams();
            boolean z12 = true;
            if (rVar.f10724y.isShown()) {
                if (rVar.f10715l0 == null) {
                    rVar.f10715l0 = new Rect();
                    rVar.m0 = new Rect();
                }
                Rect rect = rVar.f10715l0;
                Rect rect2 = rVar.m0;
                rect.set(k1Var.b(), k1Var.d(), k1Var.c(), k1Var.a());
                ViewGroup viewGroup = rVar.J;
                Method method = v3.f16358a;
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
                WeakHashMap weakHashMap = i0.f44830a;
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
                rVar.f10724y.setLayoutParams(marginLayoutParams);
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
    public void C(c6 c6Var, String str) {
        d2 d2Var = (d2) this.f279b;
        if (d2Var.f15230z0 == null) {
            d2Var.f15230z0 = new s3(new j5.b(this, 4), d2Var.getResourceProvider());
        }
        d2Var.f15230z0.f(c6Var, str);
    }

    @Override
    public m9 D() {
        switch (this.f278a) {
            case 25:
                return (z) this.f279b;
            default:
                return (u4) this.f279b;
        }
    }

    @Override
    public ki.a F() {
        switch (this.f278a) {
            case 25:
                return ((z) this.f279b).f15111a;
            default:
                return ((u4) this.f279b).f15111a;
        }
    }

    @Override
    public a0.h G() {
        return null;
    }

    @Override
    public boolean H() {
        switch (this.f278a) {
            case 25:
                z zVar = (z) this.f279b;
                q3 q3Var = zVar.O;
                if (q3Var != null) {
                    ki.a aVar = zVar.f15111a;
                    if (q3Var.f15459a.T4()) {
                        return true;
                    }
                }
                return false;
            default:
                u4 u4Var = (u4) this.f279b;
                p3 p3Var = u4Var.N;
                if (p3Var != null) {
                    ki.a aVar2 = u4Var.f15111a;
                    if (p3Var.f15445a.T4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public void I(Exception exc) {
        e2.a.d("DecoderAudioRenderer", "Audio sink error", exc);
        qf.b bVar = ((FfmpegAudioRenderer) this.f279b).I;
        Handler handler = (Handler) bVar.f44451b;
        if (handler != null) {
            handler.post(new q(bVar, exc, 1));
        }
    }

    @Override
    public void J() {
        d2 d2Var = (d2) this.f279b;
        int i10 = 0;
        d2.Z(d2Var, false, true);
        int i11 = d2Var.I0;
        if (i11 != 2) {
            i10 = i11;
        }
        d2Var.x0(i10, true);
    }

    @Override
    public void K(int i10, int i11) {
        switch (this.f278a) {
            case 25:
                z zVar = (z) this.f279b;
                q3 q3Var = zVar.O;
                if (q3Var != null) {
                    ki.a aVar = zVar.f15111a;
                    h2 h2Var = q3Var.f15459a.H3;
                    if (h2Var != null) {
                        h2Var.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                u4 u4Var = (u4) this.f279b;
                p3 p3Var = u4Var.N;
                if (p3Var != null) {
                    ki.a aVar2 = u4Var.f15111a;
                    h2 h2Var2 = p3Var.f15445a.H3;
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
        ((FfmpegAudioRenderer) this.f279b).Z = true;
    }

    @Override
    public i80 M(View view) {
        return i80.H((d2) this.f279b, view);
    }

    @Override
    public void N() {
        switch (this.f278a) {
            case 25:
                z zVar = (z) this.f279b;
                q3 q3Var = zVar.O;
                if (q3Var != null) {
                    ki.a aVar = zVar.f15111a;
                    w3 w3Var = q3Var.f15459a;
                    h2 h2Var = w3Var.H3;
                    if (h2Var != null) {
                        h2Var.g();
                    }
                    w3Var.f15592f3.onContentChanged();
                    return;
                }
                return;
            default:
                u4 u4Var = (u4) this.f279b;
                p3 p3Var = u4Var.N;
                if (p3Var != null) {
                    ki.a aVar2 = u4Var.f15111a;
                    w3 w3Var2 = p3Var.f15445a;
                    h2 h2Var2 = w3Var2.H3;
                    if (h2Var2 != null) {
                        h2Var2.g();
                    }
                    w3Var2.f15592f3.onContentChanged();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean O(int i10) {
        if (i10 == ((po0) this.f279b).f11876d0) {
            return true;
        }
        return false;
    }

    @Override
    public void P() {
        d2 d2Var = (d2) this.f279b;
        d2Var.z0();
        d2Var.C0();
    }

    @Override
    public void Q(u0 u0Var) {
        qf.b bVar = ((FfmpegAudioRenderer) this.f279b).I;
        Handler handler = (Handler) bVar.f44451b;
        if (handler != null) {
            handler.post(new t(bVar, u0Var, 1));
        }
    }

    @Override
    public boolean Q0(long j10, int i10, int i11, int i12, x9 x9Var) {
        ImageReceiver imageReceiver;
        s4 s4Var;
        s4 s4Var2;
        s4 s4Var3;
        s4 s4Var4;
        x9Var.f6173b = null;
        x9Var.f6174c = null;
        uy0 uy0Var = (uy0) this.f279b;
        oz0 oz0Var = uy0Var.h;
        ArrayList arrayList = uy0Var.f33895w;
        if (uy0Var.N < 0.2f) {
            x9Var.f6173b = oz0Var.getImageReceiver();
            x9Var.f6174c = null;
            x9Var.f6172a = oz0Var;
            x9Var.h = 0.0f;
            x9Var.f6177i = AndroidUtilities.displaySize.y;
            x9Var.f6176g = (View) uy0Var.getParent();
            x9Var.d = uy0Var.f33897y;
            x9Var.f6182n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 < arrayList.size()) {
                s4 s4Var5 = (s4) arrayList.get(i13);
                if (s4Var5.e >= 1.0f && s4Var5.f5958a == i11) {
                    int i14 = i13 - 1;
                    if (i14 >= 0) {
                        s4Var3 = (s4) arrayList.get(i14);
                    } else {
                        s4Var3 = null;
                    }
                    int i15 = i13 - 2;
                    if (i15 >= 0) {
                        s4Var4 = (s4) arrayList.get(i15);
                    } else {
                        s4Var4 = null;
                    }
                    s4 d = ProfileStoriesView.d(s4Var3, s4Var4, s4Var5);
                    imageReceiver = s4Var5.f5959b;
                    s4Var2 = d;
                    s4Var = s4Var5;
                } else {
                    i13++;
                }
            } else {
                imageReceiver = null;
                s4Var = null;
                s4Var2 = null;
                break;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        x9Var.f6174c = imageReceiver;
        x9Var.f6173b = null;
        x9Var.f6172a = uy0Var;
        x9Var.h = 0.0f;
        x9Var.f6177i = AndroidUtilities.displaySize.y;
        x9Var.f6176g = (View) uy0Var.getParent();
        if (s4Var != null && s4Var2 != null) {
            x9Var.f6175f = new t7(this, new RectF(s4Var.f5967m), s4Var, new RectF(s4Var2.f5967m), s4Var2);
            return true;
        }
        x9Var.f6175f = null;
        return true;
    }

    @Override
    public void S(ArrayList arrayList) {
        boolean z10;
        po0 po0Var = (po0) this.f279b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            po0Var.J.add(((y1) arrayList.get(i10)).f12109a);
        }
        nx nxVar = po0Var.U;
        if (nxVar != null) {
            if (po0Var.D0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            nxVar.d(z10, false);
        }
        po0Var.l();
    }

    @Override
    public void T(u0 u0Var) {
        qf.b bVar = ((FfmpegAudioRenderer) this.f279b).I;
        Handler handler = (Handler) bVar.f44451b;
        if (handler != null) {
            handler.post(new t(bVar, u0Var, 0));
        }
    }

    @Override
    public void V(ki.v3 v3Var, View view) {
        d2 d2Var = (d2) this.f279b;
        i80 H = i80.H(d2Var, view);
        H.Q = true;
        d2Var.getParentActivity();
        d2Var.getResourceProvider();
        d2Var.f15227x0 = j4.b(H, d2Var, v3Var, false);
    }

    @Override
    public void X() {
        switch (this.f278a) {
            case 25:
                z zVar = (z) this.f279b;
                q3 q3Var = zVar.O;
                if (q3Var != null) {
                    ki.a aVar = zVar.f15111a;
                    w3.P1(q3Var.f15459a);
                    return;
                }
                return;
            default:
                u4 u4Var = (u4) this.f279b;
                p3 p3Var = u4Var.N;
                if (p3Var != null) {
                    ki.a aVar2 = u4Var.f15111a;
                    w3.P1(p3Var.f15445a);
                    return;
                }
                return;
        }
    }

    @Override
    public void X0(long j10, int i10, t3 t3Var) {
        int i11 = ProfileStoriesView.f33870s0;
        ((uy0) this.f279b).f(true, false);
        t3Var.run();
    }

    @Override
    public void Y(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.q qVar = (androidx.biometric.q) this.f279b;
        if (charSequence != null) {
            if (qVar.R()) {
                qVar.W(charSequence);
            }
            qVar.f2833l0.d(null);
        }
    }

    public ea.a Z(JSONObject jSONObject) {
        ea.c dVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            dVar = new u(7);
        } else {
            dVar = new oa.d(8);
        }
        return dVar.s0((u) this.f279b, jSONObject);
    }

    @Override
    public void a(long j10) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f279b;
        ffmpegAudioRenderer.f3421g0 = true;
        qf.b bVar = ffmpegAudioRenderer.I;
        Handler handler = (Handler) bVar.f44451b;
        if (handler != null) {
            handler.post(new ai.v3(bVar, j10, 13));
        }
    }

    public void a0(String str, Bitmap bitmap) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f279b).putParcelable(str, bitmap);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i10 = this.f278a;
        Object obj3 = this.f279b;
        switch (i10) {
            case 6:
                b7.b bVar = new b7.b(0, (TaskCompletionSource) obj2);
                m1 m1Var = (m1) ((n7.l1) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(m1Var.f17296b);
                int i11 = n7.j.f17282a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                ((v) obj3).writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    m1Var.f17295a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            case 8:
                w wVar = (w) obj;
                g6.f fVar = (g6.f) wVar.u();
                d0 d0Var = ((e0) obj3).f4836k;
                Parcel N0 = fVar.N0();
                com.google.android.gms.internal.cast.v.d(N0, d0Var);
                fVar.S0(N0, 18);
                g6.f fVar2 = (g6.f) wVar.u();
                fVar2.S0(fVar2.N0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
            case 21:
                h7.f fVar3 = new h7.f(0, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i12 = q7.a.f44420a;
                obtain3.writeStrongBinder(fVar3);
                q7.a.b(obtain3, (g7.f) obj3);
                q7.a.b(obtain3, gVar);
                ((h7.b) ((h7.d) ((h7.e) obj).u())).F0(obtain3, 6);
                return;
            default:
                a6.l lVar = new a6.l((TaskCompletionSource) obj2);
                i7.i iVar = (i7.i) ((i7.c) obj).u();
                Parcel J0 = iVar.J0();
                int i13 = i7.f.f12733a;
                J0.writeStrongBinder(lVar);
                i7.f.c(J0, (x5.e) obj3);
                iVar.K0(J0, 1);
                return;
        }
    }

    public void b0(long j10) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey("android.media.metadata.DURATION") && ((Integer) fVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        ((Bundle) this.f279b).putLong("android.media.metadata.DURATION", j10);
    }

    @Override
    public void c(h1 h1Var) {
        switch (this.f278a) {
            case 25:
                q3 q3Var = ((z) this.f279b).O;
                if (q3Var != null) {
                    w3 w3Var = q3Var.f15459a;
                    w3.N1(w3Var, h1Var);
                    w3Var.f15592f3.o(h1Var, true);
                    return;
                }
                return;
            default:
                p3 p3Var = ((u4) this.f279b).N;
                if (p3Var != null) {
                    w3 w3Var2 = p3Var.f15445a;
                    w3.N1(w3Var2, h1Var);
                    w3Var2.f15592f3.o(h1Var, true);
                    return;
                }
                return;
        }
    }

    public void c0(String str, String str2) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f279b).putCharSequence(str, str2);
    }

    @Override
    public int d(long j10) {
        if (j10 < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public boolean e(float f7) {
        boolean z10;
        int[] iArr;
        d2 d2Var = (d2) this.f279b;
        FrameLayout frameLayout = d2Var.f15223v0;
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

    public void e0(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f279b;
        j0(i10, 2);
        try {
            int o02 = o0(str.length());
            if (o02 == o0(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= o02) {
                    byteBuffer.position(position + o02);
                    k0(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    h0((position2 - position) - o02);
                    byteBuffer.position(position2);
                    return;
                }
                throw new z4(position + o02, byteBuffer.limit());
            }
            h0(d0(str));
            k0(str, byteBuffer);
        } catch (BufferOverflowException e) {
            z4 z4Var = new z4(byteBuffer.position(), byteBuffer.limit());
            z4Var.initCause(e);
            throw z4Var;
        }
    }

    @Override
    public void f(int i10) {
        boolean z10;
        po0 po0Var = (po0) this.f279b;
        po0Var.D0--;
        po0Var.f11877e0 = i10;
        if (po0Var.f11879f0 != i10) {
            po0Var.f11893s.clear();
        }
        if (po0Var.f11880g0 != i10) {
            po0Var.I.clear();
        }
        po0Var.N = true;
        nx nxVar = po0Var.U;
        if (nxVar != null) {
            if (po0Var.D0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            nxVar.d(z10, true);
        }
        po0Var.l();
        nx nxVar2 = po0Var.U;
        if (nxVar2 != null) {
            nxVar2.c();
        }
    }

    public void f0(int i10, byte[] bArr) {
        j0(i10, 2);
        h0(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f279b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new z4(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public Object f2() {
        Class cls = (Class) this.f279b;
        try {
            return s.f10984a.a(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    @Override
    public void g() {
        switch (this.f278a) {
            case 25:
                z zVar = (z) this.f279b;
                q3 q3Var = zVar.O;
                if (q3Var != null) {
                    w3.Q1(q3Var.f15459a, zVar.f15111a);
                    return;
                }
                return;
            default:
                u4 u4Var = (u4) this.f279b;
                p3 p3Var = u4Var.N;
                if (p3Var != null) {
                    w3.Q1(p3Var.f15445a, u4Var.f15111a);
                    return;
                }
                return;
        }
    }

    public void g0(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.f279b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new z4(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public void h(Object obj) {
        Bundle extras;
        switch (this.f278a) {
            case 4:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f279b;
                f0 f0Var = (f0) j0Var.F.pollLast();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String str = f0Var.f3176a;
                int i10 = f0Var.f3177b;
                androidx.fragment.app.s f7 = j0Var.f3190c.f(str);
                if (f7 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                    return;
                }
                f7.x(i10, aVar.f2679a, aVar.f2680b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f279b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f2680b;
                int i11 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f4752a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.M;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i11, extras);
                }
                int i12 = aVar2.f2679a;
                if (i12 != -1 || i11 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    public void h0(int i10) {
        while ((i10 & (-128)) != 0) {
            g0((i10 & 127) | 128);
            i10 >>>= 7;
        }
        g0(i10);
    }

    @Override
    public void i(ki.a aVar) {
        d2 d2Var = (d2) this.f279b;
        if (aVar != null && (aVar.f15095b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(d2Var)) {
            ti tiVar = new ti(d2Var.getParentActivity(), d2Var, false, false, false, d2Var.getResourceProvider());
            tiVar.f30542c2 = new oa.d(12);
            tiVar.P = true;
            tiVar.A1.setVisibility(8);
            tiVar.f30605w2 = new u2(d2Var, aVar, tiVar, 12);
            tiVar.t1();
            tiVar.show();
        }
    }

    @Override
    public void j() {
        ((FfmpegAudioRenderer) this.f279b).f3420f0 = true;
    }

    public void j0(int i10, int i11) {
        h0((i10 << 3) | i11);
    }

    @Override
    public long k(int i10) {
        boolean z10;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        return 0L;
    }

    public void l0(long j10) {
        while (((-128) & j10) != 0) {
            g0((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        g0((int) j10);
    }

    @Override
    public void m(int i10) {
        ((d2) this.f279b).o0(74, i10);
    }

    @Override
    public void n(ki.t3 t3Var, View view) {
        d2 d2Var = (d2) this.f279b;
        i80 H = i80.H(d2Var, view);
        H.Q = true;
        d2Var.f15227x0 = j4.c(H, d2Var, d2Var.getParentActivity(), d2Var.getResourceProvider(), t3Var, false);
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        qf.b bVar = ((FfmpegAudioRenderer) this.f279b).I;
        Handler handler = (Handler) bVar.f44451b;
        if (handler != null) {
            handler.post(new ah.g(bVar, i10, 14));
        }
    }

    @Override
    public void onContentChanged() {
        d2 d2Var = (d2) this.f279b;
        if (d2Var.f15229y0 != null) {
            boolean n32 = d2Var.P.n3();
            d2Var.L0 = n32;
            d2Var.f15229y0.h(n32);
            d2Var.f15229y0.invalidate();
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
        qf.b bVar = ((FfmpegAudioRenderer) this.f279b).I;
        Handler handler = (Handler) bVar.f44451b;
        if (handler != null) {
            handler.post(new ah.t(12, bVar, z10));
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        r6 r6Var = (r6) this.f279b;
        o6 o6Var = r6Var.M;
        c81 c81Var = r6Var.f9735x;
        if (c81Var == null) {
            return;
        }
        if (c81Var.y()) {
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
        d6.a aVar = (d6.a) this.f279b;
        Bundle bundle = (Bundle) obj;
        if (p0.f6748j) {
            Context context = aVar.f7829a;
            g6.r rVar = aVar.f7832f;
            p0 p0Var = new p0(context, rVar, aVar.f7831c, aVar.f7835j, aVar.f7833g);
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
            p0Var.f6753g = l5.t.a().c(j5.a.e).a("CAST_SENDER_SDK", new i5.c("proto"), com.google.android.gms.internal.cast.z.f6845a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                p0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(u10, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.u b11 = com.google.android.gms.common.api.internal.v.b();
                b11.f6497c = new qb.c(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                b11.d = new k6.c[]{y.f4925c};
                b11.f6496b = false;
                b11.f6495a = 8426;
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
                g6.b bVar = com.google.android.gms.internal.cast.d2.f6643i;
                synchronized (com.google.android.gms.internal.cast.d2.class) {
                    try {
                        if (com.google.android.gms.internal.cast.d2.f6645k == null) {
                            com.google.android.gms.internal.cast.d2.f6645k = new com.google.android.gms.internal.cast.d2(sharedPreferences, p0Var, packageName);
                        }
                        d2Var = com.google.android.gms.internal.cast.d2.f6645k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = d2Var.f6648c;
                SharedPreferences sharedPreferences2 = d2Var.f6647b;
                HashSet hashSet = d2Var.f6649f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = d2Var.f6650g;
                hashSet2.clear();
                d2Var.h = 0L;
                String str2 = com.google.android.gms.internal.cast.d2.f6644j;
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
        c2 c2Var = ((r6) this.f279b).f9733w;
        if (c2Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(c2Var.f45321y0 - f10) >= 1.0E-4f) {
                c2Var.f45321y0 = f10;
                c2Var.requestLayout();
            }
        }
    }

    @Override
    public void p() {
        int i10;
        d2 d2Var = (d2) this.f279b;
        j3 j3Var = d2Var.P.f15604l3;
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
    public Object q(Object obj, Object obj2) {
        return ((d9.k) this.f279b).apply(obj2);
    }

    @Override
    public void r() {
        d2 d2Var = (d2) this.f279b;
        d2Var.I0 = d2Var.K0;
        d2.Z(d2Var, false, false);
        d2Var.x0(2, true);
    }

    @Override
    public List s(long j10) {
        if (j10 >= 0) {
            return (List) this.f279b;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public void t(int i10, long j10, long j11) {
        qf.b bVar = ((FfmpegAudioRenderer) this.f279b).I;
        Handler handler = (Handler) bVar.f44451b;
        if (handler != null) {
            handler.post(new k2.s(bVar, i10, j10, j11, 0));
        }
    }

    @Override
    public int u() {
        return 1;
    }

    @Override
    public void v() {
        ((m0) this.f279b).e.invalidate();
    }

    @Override
    public n9 w() {
        switch (this.f278a) {
            case 25:
                q3 q3Var = ((z) this.f279b).O;
                if (q3Var != null) {
                    return q3Var.f15459a.getTextSelectionHelper();
                }
                return null;
            default:
                p3 p3Var = ((u4) this.f279b).N;
                if (p3Var != null) {
                    return p3Var.f15445a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void z(CharSequence charSequence) {
        switch (this.f278a) {
            case 25:
                q3 q3Var = ((z) this.f279b).O;
                if (q3Var != null) {
                    q3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        q3Var.f15459a.u4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                p3 p3Var = ((u4) this.f279b).N;
                if (p3Var != null) {
                    p3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        p3Var.f15445a.u4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public l(Object obj, int i10) {
        this.f278a = i10;
        this.f279b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public l(byte[] bArr, int i10) {
        this.f278a = 11;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.f279b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public l(int i10) {
        this.f278a = i10;
        switch (i10) {
            case 2:
                this.f279b = new Bundle();
                return;
            case 13:
                this.f279b = new ArrayList();
                new ArrayList();
                new ArrayList();
                return;
            default:
                this.f279b = new n4.s[ag.b.values().length];
                return;
        }
    }

    public l(MediaMetadataCompat mediaMetadataCompat) {
        this.f278a = 2;
        Bundle bundle = new Bundle(mediaMetadataCompat.f2567a);
        this.f279b = bundle;
        android.support.v4.media.session.b0.a(bundle);
    }

    @Override
    public void U() {
    }

    @Override
    public void W() {
    }

    @Override
    public void l() {
    }

    @Override
    public void x() {
    }

    @Override
    public void A(int i10) {
    }

    @Override
    public void E(boolean z10) {
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
    public void o(h1 h1Var, boolean z10) {
    }

    @Override
    public void onError(c81 c81Var, Exception exc) {
    }
}
