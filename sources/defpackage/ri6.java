package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ThemeActivity;
public class ri6 implements nr7, rq, cr7, ty9, ka1, y17, s69, tka, ar5, hj, h49, SuccessContinuation, l1a, la6, tf4 {
    public static ri6 d;
    public final byte a;
    public final Object b;
    public static final Object c = new Object();
    public static final hse e = new hse((byte) 1);

    public ri6(byte b) {
        uye uyeVar;
        this.a = b;
        switch (b) {
            case 2:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new w4(this);
                    return;
                } else {
                    this.b = new w4(this);
                    return;
                }
            case 24:
                this.b = new k0b(n8c.b);
                return;
            default:
                try {
                    uyeVar = (uye) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    uyeVar = e;
                }
                uye[] uyeVarArr = {hse.b, uyeVar};
                ?? obj = new Object();
                obj.a = uyeVarArr;
                Charset charset = xse.a;
                this.b = obj;
                return;
        }
    }

    public static ri6 A(int i) {
        boolean z;
        Point point = hl.q;
        int i2 = (int) (point.x * 0.5f);
        int i3 = (int) (point.y * 0.5f);
        if (i2 == i3) {
            return new ri6(i2, i3, new int[0]);
        }
        if (i == 3) {
            return new ri6(i2, i3, new int[]{i3, i2});
        }
        boolean z2 = true;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (i2 >= i3) {
            z2 = false;
        }
        if (z == z2) {
            return new ri6(i2, i3, new int[0]);
        }
        return new ri6(i3, i2, new int[0]);
    }

    public static Task G(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        xnb.c(1, new iqd(callable, taskCompletionSource, (byte) 18));
        return taskCompletionSource.getTask();
    }

    public static ri6 v() {
        ri6 ri6Var;
        synchronized (c) {
            ri6Var = d;
            if (ri6Var == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                ri6 ri6Var2 = new ri6(handlerThread.getLooper());
                d = ri6Var2;
                ri6Var = ri6Var2;
            }
        }
        return ri6Var;
    }

    @Override
    public final boolean B(String str, da1 da1Var) {
        return false;
    }

    @Override
    public final boolean C(View view) {
        return false;
    }

    public boolean E(int i, int i2, Bundle bundle) {
        return false;
    }

    public final JSONObject F() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(jn2.l(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e2) {
                        e = e2;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        jn2.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    jn2.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            jn2.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            jn2.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public final void H(defpackage.i0b r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri6.H(i0b):void");
    }

    @Override
    public final void H0(int i, int i2, CharSequence charSequence, boolean z) {
        kb1 kb1Var = ((qb1) this.b).f;
        if (kb1Var == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(kb1Var.getText());
            spannableStringBuilder.replace(i, i2 + i, charSequence);
            if (z) {
                pv3.l(spannableStringBuilder, kb1Var.getEditText().getPaint().getFontMetricsInt(), false);
            }
            kb1Var.setText(spannableStringBuilder);
            kb1Var.setSelection(i + charSequence.length());
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override
    public final String I() {
        return ((rv0) this.b).j0;
    }

    @Override
    public final void R0(oa6 oa6Var, long j, long j2, int i) {
        jy7 jy7Var = (jy7) oa6Var;
        i63 i63Var = (i63) this.b;
        ia6 ia6Var = new ia6(jy7Var.a, jy7Var.b, j);
        if (i != 0) {
            b2b b2bVar = jy7Var.d;
            ia6Var.d = b2bVar.c;
            ia6Var.e = b2bVar.d;
            ia6Var.f = j2;
            ia6Var.g = b2bVar.b;
        }
        i63Var.r.v(new ja6(ia6Var), jy7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        boolean z;
        l2d l2dVar2;
        int b;
        int c2;
        boolean z2;
        int color;
        int d2 = l2dVar.d();
        cp cpVar = (cp) this.b;
        Context context = cpVar.e;
        int d3 = l2dVar.d();
        ActionBarContextView actionBarContextView = cpVar.E;
        int i = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cpVar.E.getLayoutParams();
            boolean z3 = true;
            if (cpVar.E.isShown()) {
                if (cpVar.m0 == null) {
                    cpVar.m0 = new Rect();
                    cpVar.n0 = new Rect();
                }
                Rect rect = cpVar.m0;
                Rect rect2 = cpVar.n0;
                rect.set(l2dVar.b(), l2dVar.d(), l2dVar.c(), l2dVar.a());
                ViewGroup viewGroup = cpVar.K;
                Method method = fjc.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e2) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
                    }
                }
                int i2 = rect.top;
                int i3 = rect.left;
                int i4 = rect.right;
                ViewGroup viewGroup2 = cpVar.K;
                WeakHashMap weakHashMap = ihc.a;
                l2d a = bhc.a(viewGroup2);
                if (a == null) {
                    c2 = 0;
                    b = 0;
                } else {
                    b = a.b();
                    c2 = a.c();
                }
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 > 0 && cpVar.M == null) {
                    View view2 = new View(context);
                    cpVar.M = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c2;
                    cpVar.K.addView(cpVar.M, -1, layoutParams);
                } else {
                    View view3 = cpVar.M;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c2;
                            cpVar.M.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = cpVar.M;
                if (view4 == null) {
                    z3 = false;
                }
                if (z3 && view4.getVisibility() != 0) {
                    View view5 = cpVar.M;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        color = context.getColor(2131099654);
                    } else {
                        color = context.getColor(2131099653);
                    }
                    view5.setBackgroundColor(color);
                }
                if (!cpVar.R && z3) {
                    d3 = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                cpVar.E.setLayoutParams(marginLayoutParams);
            }
        } else {
            z = false;
        }
        View view6 = cpVar.M;
        if (view6 != null) {
            if (z) {
                i = 0;
            }
            view6.setVisibility(i);
        }
        if (d2 != d3) {
            l2dVar2 = l2dVar.f(l2dVar.b(), d3, l2dVar.c(), l2dVar.a());
        } else {
            l2dVar2 = l2dVar;
        }
        return ihc.i(view, l2dVar2);
    }

    @Override
    public final void S0(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 9:
                CharSequence charSequence = (CharSequence) obj;
                bj0 bj0Var = (bj0) obj2;
                if (charSequence != null) {
                    if (bj0Var.S()) {
                        bj0Var.X(charSequence);
                    }
                    mj0 mj0Var = bj0Var.m0;
                    qj7 qj7Var = mj0Var.q;
                    if (qj7Var == null) {
                        qj7Var = new qj7();
                        mj0Var.q = qj7Var;
                    }
                    mj0.f(qj7Var, null);
                    return;
                }
                return;
            default:
                tf3 tf3Var = (tf3) obj2;
                if (((i36) obj) != null && tf3Var.s0) {
                    xi4.j(tf3Var, " did not return a View from onCreateView() or this was called before onCreateView().", "Fragment ");
                    return;
                }
                return;
        }
    }

    @Override
    public final ByteBuffer a() {
        po6 po6Var = (po6) this.b;
        po6Var.p.c();
        return (ByteBuffer) po6Var.p.f;
    }

    @Override
    public final ma6 c2(oa6 oa6Var, long j, long j2, IOException iOException, int i) {
        int size;
        int i2;
        ma6 ma6Var;
        wb6 wb6Var;
        jy7 jy7Var = (jy7) oa6Var;
        i63 i63Var = (i63) this.b;
        ia6 ia6Var = new ia6(jy7Var.a, jy7Var.b, j);
        b2b b2bVar = jy7Var.d;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        ed edVar = new ed(iOException, i, (byte) 8);
        synchronized (i63Var.u) {
            size = i63Var.B.size();
            no5 listIterator = i63Var.B.listIterator(0);
            i2 = 0;
            while (listIterator.hasNext()) {
                Long l = (Long) i63Var.A.get(((wb6) listIterator.next()).b);
                if (l != null && l.longValue() > j) {
                    i2++;
                }
            }
        }
        ga6 ga6Var = new ga6(false, size, i2, 1, 0);
        i63Var.n.getClass();
        ha6 u3 = z6f.u3(ga6Var, edVar);
        if (u3 != null && u3.a == 1) {
            Uri uri = jy7Var.b.a;
            synchronized (i63Var.u) {
                no5 listIterator2 = i63Var.B.listIterator(0);
                while (true) {
                    if (listIterator2.hasNext()) {
                        wb6Var = (wb6) listIterator2.next();
                        if (uri.equals(wb6Var.a)) {
                            break;
                        }
                    } else {
                        wb6Var = null;
                        break;
                    }
                }
                if (wb6Var != null) {
                    i63Var.A.put(wb6Var.b, Long.valueOf(u3.b + j));
                }
            }
            if (wb6Var != null) {
                i63Var.I.postDelayed(i63Var.w, 0L);
                i63Var.r.s(ja6Var, jy7Var.c, iOException, true);
                i63Var.n.getClass();
                return rx6.y;
            }
        }
        i63Var.n.getClass();
        long w3 = z6f.w3(edVar);
        if (w3 == -9223372036854775807L) {
            ma6Var = rx6.E;
        } else {
            ma6Var = new ma6(0, w3);
        }
        boolean a = ma6Var.a();
        i63Var.r.s(ja6Var, jy7Var.c, iOException, !a);
        if (!a) {
            i63Var.n.getClass();
        }
        return ma6Var;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        r47 messageObject;
        wf1 wf1Var = (wf1) this.b;
        HashSet hashSet = wf1Var.q0;
        if ((view instanceof dl1) && (messageObject = ((dl1) view).getMessageObject()) != null) {
            long j = messageObject.J0;
            if (j != -1) {
                if (hashSet.contains(Long.valueOf(j))) {
                    hashSet.remove(Long.valueOf(messageObject.J0));
                } else {
                    hashSet.add(Long.valueOf(messageObject.J0));
                }
                wf1Var.a1(true);
                wf1Var.O0();
                wf1Var.F.f();
                return;
            }
        }
        wf1Var.M0(view, f, f2);
    }

    @Override
    public final void e(View view, w49 w49Var, boolean z, boolean z2) {
        wd2 wd2Var = (wd2) this.b;
        wd2Var.a.wb(null, wd2Var.e, wd2Var.b, view, 0.0f, 0.0f, w49Var, false, z, z2, false);
        hl.c3(new vd2(this, (byte) 0));
    }

    @Override
    public final float e0() {
        return c00.d(9.66f, eg0.f(((ij1) this.b).U0), 0);
    }

    @Override
    public final void f(oa6 oa6Var, long j, long j2, boolean z) {
        ((i63) this.b).x((jy7) oa6Var, j, j2);
    }

    @Override
    public final void f0(oa6 oa6Var, long j, long j2) {
        int size;
        long j3;
        jy7 jy7Var = (jy7) oa6Var;
        i63 i63Var = (i63) this.b;
        ia6 ia6Var = new ia6(jy7Var.a, jy7Var.b, j);
        b2b b2bVar = jy7Var.d;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        i63Var.n.getClass();
        i63Var.r.p(ja6Var, jy7Var.c);
        z53 z53Var = (z53) jy7Var.f;
        z53 z53Var2 = i63Var.J;
        if (z53Var2 == null) {
            size = 0;
        } else {
            size = z53Var2.l.size();
        }
        long j4 = z53Var.b(0).b;
        int i = 0;
        while (i < size && i63Var.J.b(i).b < j4) {
            i++;
        }
        if (z53Var.d) {
            if (size - i > z53Var.l.size()) {
                efd.f("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j5 = i63Var.P;
                j3 = -9223372036854775807L;
                if (j5 != -9223372036854775807L && z53Var.h * 1000 <= j5) {
                    efd.f("DashMediaSource", "Loaded stale dynamic manifest: " + z53Var.h + ", " + i63Var.P);
                } else {
                    i63Var.O = 0;
                }
            }
            int i2 = i63Var.O;
            i63Var.O = i2 + 1;
            if (i2 < i63Var.n.v3(jy7Var.c)) {
                i63Var.I.postDelayed(i63Var.w, Math.min((i63Var.O - 1) * 1000, 5000));
                return;
            }
            i63Var.H = new IOException();
            return;
        }
        j3 = -9223372036854775807L;
        i63Var.J = z53Var;
        i63Var.K &= z53Var.d;
        i63Var.L = j - j2;
        i63Var.M = j;
        i63Var.Q += i;
        Uri uri = jy7Var.b.a;
        synchronized (i63Var.u) {
            no5 listIterator = i63Var.B.listIterator(0);
            while (true) {
                if (!listIterator.hasNext()) {
                    break;
                } else if (uri.equals(((wb6) listIterator.next()).a)) {
                    if (!z53Var.m.isEmpty()) {
                        i63Var.B = z53Var.m;
                    } else {
                        i63Var.B = po5.u(new wb6(zvd.a(jy7Var.d.c)));
                    }
                }
            }
        }
        z53 z53Var3 = i63Var.J;
        if (z53Var3.d && i63Var.N == j3) {
            j5 j5Var = z53Var3.i;
            if (j5Var != null) {
                String str = j5Var.b;
                if (!Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                    if (!Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        if (!Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                            if (!Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                i63Var.y(new IOException("Unsupported UTC timing scheme"));
                                return;
                            } else {
                                i63Var.w();
                                return;
                            }
                        }
                        i63Var.A(j5Var, new uif((byte) 16));
                        return;
                    }
                    i63Var.A(j5Var, new Object());
                    return;
                }
                try {
                    i63Var.N = gcc.W(j5Var.c) - i63Var.M;
                    i63Var.z(true);
                    return;
                } catch (hy7 e2) {
                    i63Var.y(e2);
                    return;
                }
            }
            i63Var.w();
            return;
        }
        i63Var.z(true);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final float getBlurAngle() {
        return ((po6) this.b).t;
    }

    @Override
    public final float getBlurExcludeBlurSize() {
        return ((po6) this.b).s;
    }

    @Override
    public final PointF getBlurExcludePoint() {
        return ((po6) this.b).r;
    }

    @Override
    public final float getBlurExcludeSize() {
        return ((po6) this.b).q;
    }

    @Override
    public final int getBlurType() {
        return ((po6) this.b).n;
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.a) {
            case 10:
                return null;
            default:
                return " ";
        }
    }

    @Override
    public final float getContrastValue() {
        return c00.B(((po6) this.b).d, 100.0f, 0.3f, 1.0f);
    }

    @Override
    public final float getEnhanceValue() {
        return ((po6) this.b).a / 100.0f;
    }

    @Override
    public final float getExposureValue() {
        return ((po6) this.b).c / 100.0f;
    }

    @Override
    public final float getFadeValue() {
        return ((po6) this.b).g / 100.0f;
    }

    @Override
    public final float getGrainValue() {
        return (((po6) this.b).m / 100.0f) * 0.04f;
    }

    @Override
    public final float getHighlightsValue() {
        return c00.z(((po6) this.b).j, 0.75f, 100.0f, 100.0f);
    }

    @Override
    public final float getSaturationValue() {
        float f = ((po6) this.b).f / 100.0f;
        if (f > 0.0f) {
            f *= 1.05f;
        }
        return f + 1.0f;
    }

    @Override
    public final float getShadowsValue() {
        return c00.z(((po6) this.b).k, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public final float getSharpenValue() {
        return c00.B(((po6) this.b).o, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public final float getSoftenSkinValue() {
        return ((po6) this.b).b / 100.0f;
    }

    @Override
    public final int getTintHighlightsColor() {
        return ((po6) this.b).i;
    }

    @Override
    public final float getTintHighlightsIntensityValue() {
        if (((po6) this.b).i == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final int getTintShadowsColor() {
        return ((po6) this.b).h;
    }

    @Override
    public final float getTintShadowsIntensityValue() {
        if (((po6) this.b).h == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final float getVignetteValue() {
        return ((po6) this.b).l / 100.0f;
    }

    @Override
    public final float getWarmthValue() {
        return ((po6) this.b).e / 100.0f;
    }

    public v4 h(int i) {
        return null;
    }

    @Override
    public final boolean i() {
        return !((po6) this.b).p.o();
    }

    @Override
    public final int i0() {
        byte b = this.a;
        return 0;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final int j0() {
        ij1 ij1Var = (ij1) this.b;
        return ij1Var.V0 + ij1Var.W0;
    }

    @Override
    public final boolean k() {
        return false;
    }

    public v4 l(int i) {
        return null;
    }

    @Override
    public final void o(boolean z, float f) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 10:
                yk0.n1 = f;
                wma wmaVar = ((yk0) obj).l1;
                wmaVar.K();
                wmaVar.M();
                return;
            default:
                nob nobVar = (nob) ((cz0) obj);
                int i = (int) (aob.q * 100.0f);
                int i2 = (int) (f * 100.0f);
                aob.q = f;
                if (i != i2) {
                    ThemeActivity themeActivity = nobVar.f.e;
                    n69 n69Var = (n69) themeActivity.b.L(themeActivity.g0);
                    if (n69Var != null) {
                        ((ilb) n69Var.a).setText(ob6.a0("AutoNightBrightnessInfo", null, 2131753787, Integer.valueOf((int) (aob.q * 100.0f))));
                    }
                    aob.E(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDismiss() {
        rv0 rv0Var = (rv0) this.b;
        rv0Var.v("scan_qr_popup_closed", null);
        rv0Var.i0 = false;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void q(String str) {
        rv0 rv0Var = (rv0) this.b;
        try {
            rv0Var.Q = System.currentTimeMillis();
            rv0Var.v("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e2) {
            cc4.g(e2, true);
        }
    }

    public final i0b r() {
        Object objectVolatile = fx.a.getObjectVolatile((k0b) this.b, k0b.e);
        if (objectVolatile == sfd.a) {
            objectVolatile = null;
        }
        return (i0b) objectVolatile;
    }

    @Override
    public final void t(boolean z) {
        Runnable runnable = ((ij1) this.b).S0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final Task then(Object obj) {
        hba hbaVar = (hba) obj;
        qx6 qx6Var = (qx6) this.b;
        if (hbaVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        yy2 yy2Var = (yy2) qx6Var.c;
        sy2 sy2Var = yy2.r;
        yy2Var.h();
        yy2Var.m.h((i03) yy2Var.e.b, null);
        yy2Var.q.trySetResult(null);
        return Tasks.forResult(null);
    }

    @Override
    public final Paint.FontMetricsInt w() {
        return ((qb1) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public final void x() {
        switch (this.a) {
            case 10:
                ((yk0) this.b).l1.M();
                return;
            default:
                return;
        }
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        v72 v72Var = (v72) this.b;
        v72Var.K(z, i, i2, 0L, false);
        q67 q67Var = v72Var.P;
        if (q67Var != null) {
            q67Var.g();
            v72Var.P = null;
        }
    }

    public final StringBuilder z() {
        y1 y1Var = (y1) this.b;
        if (y1Var instanceof by7) {
            StringBuilder sb = ((by7) y1Var).b.b;
            if (sb.length() != 0) {
                return sb;
            }
            return null;
        }
        return null;
    }

    private final void D() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void T0(String str) {
    }

    @Override
    public void b(int i) {
    }

    @Override
    public void c(int i) {
    }

    @Override
    public final void p0(ei7 ei7Var) {
    }

    @Override
    public final void m0(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public final void s(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
    }

    @Override
    public final void u(View view, float f, float f2) {
    }

    public ri6(Looper looper) {
        this.a = (byte) 0;
        Handler handler = new Handler(looper);
        Looper.getMainLooper();
        this.b = handler;
    }

    public ri6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public ri6(gd4 gd4Var) {
        this.a = (byte) 13;
        this.b = new File((File) gd4Var.c, "com.crashlytics.settings.json");
    }

    public ri6(boolean z) {
        this.a = (byte) 6;
        this.b = new AtomicBoolean(z);
    }

    public ri6(int i, int i2, int[] iArr) {
        this.a = (byte) 8;
        lr5[] lr5VarArr = new lr5[(iArr.length / 2) + 1];
        this.b = lr5VarArr;
        lr5 lr5Var = new lr5(i, i2);
        int i3 = 0;
        lr5VarArr[0] = lr5Var;
        while (i3 < iArr.length / 2) {
            int i4 = i3 + 1;
            int i5 = i3 << 1;
            ((lr5[]) this.b)[i4] = new lr5(iArr[i5], iArr[i5 + 1]);
            i3 = i4;
        }
    }

    public ri6(EditText editText) {
        this.a = (byte) 28;
        this.b = new lh2(editText);
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
