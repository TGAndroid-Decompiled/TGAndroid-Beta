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
public class ni6 implements qq7, qr, fq7, cx9, kb1, r17, g59, cja, xq5, gk, u29, SuccessContinuation, tz9, ga6, wf4 {
    public static ni6 d;
    public final byte a;
    public final Object b;
    public static final Object c = new Object();
    public static final tpe e = new tpe((byte) 1);

    public ni6(byte b) {
        gwe gweVar;
        this.a = b;
        switch (b) {
            case 2:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new v4(this);
                    return;
                } else {
                    this.b = new v4(this);
                    return;
                }
            case 24:
                this.b = new kya(o6c.b);
                return;
            default:
                try {
                    gweVar = (gwe) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    gweVar = e;
                }
                gwe[] gweVarArr = {tpe.b, gweVar};
                ?? obj = new Object();
                obj.a = gweVarArr;
                Charset charset = iqe.a;
                this.b = obj;
                return;
        }
    }

    public static ni6 A(int i) {
        boolean z;
        Point point = gm.q;
        int i2 = (int) (point.x * 0.5f);
        int i3 = (int) (point.y * 0.5f);
        if (i2 == i3) {
            return new ni6(i2, i3, new int[0]);
        }
        if (i == 3) {
            return new ni6(i2, i3, new int[]{i3, i2});
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
            return new ni6(i2, i3, new int[0]);
        }
        return new ni6(i3, i2, new int[0]);
    }

    public static Task E(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        mlb.c(1, new tnd(callable, taskCompletionSource, (byte) 18));
        return taskCompletionSource.getTask();
    }

    public static ni6 q() {
        ni6 ni6Var;
        synchronized (c) {
            ni6Var = d;
            if (ni6Var == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                ni6 ni6Var2 = new ni6(handlerThread.getLooper());
                d = ni6Var2;
                ni6Var = ni6Var2;
            }
        }
        return ni6Var;
    }

    @Override
    public final String B0() {
        return ((qw0) this.b).j0;
    }

    public boolean C(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        boolean z;
        wzc wzcVar2;
        int b;
        int c2;
        boolean z2;
        int color;
        int d2 = wzcVar.d();
        bq bqVar = (bq) this.b;
        Context context = bqVar.e;
        int d3 = wzcVar.d();
        ActionBarContextView actionBarContextView = bqVar.E;
        int i = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bqVar.E.getLayoutParams();
            boolean z3 = true;
            if (bqVar.E.isShown()) {
                if (bqVar.m0 == null) {
                    bqVar.m0 = new Rect();
                    bqVar.n0 = new Rect();
                }
                Rect rect = bqVar.m0;
                Rect rect2 = bqVar.n0;
                rect.set(wzcVar.b(), wzcVar.d(), wzcVar.c(), wzcVar.a());
                ViewGroup viewGroup = bqVar.K;
                Method method = ghc.a;
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
                ViewGroup viewGroup2 = bqVar.K;
                WeakHashMap weakHashMap = kfc.a;
                wzc a = dfc.a(viewGroup2);
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
                if (i2 > 0 && bqVar.M == null) {
                    View view2 = new View(context);
                    bqVar.M = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c2;
                    bqVar.K.addView(bqVar.M, -1, layoutParams);
                } else {
                    View view3 = bqVar.M;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c2;
                            bqVar.M.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = bqVar.M;
                if (view4 == null) {
                    z3 = false;
                }
                if (z3 && view4.getVisibility() != 0) {
                    View view5 = bqVar.M;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        color = context.getColor(2131099654);
                    } else {
                        color = context.getColor(2131099653);
                    }
                    view5.setBackgroundColor(color);
                }
                if (!bqVar.R && z3) {
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
                bqVar.E.setLayoutParams(marginLayoutParams);
            }
        } else {
            z = false;
        }
        View view6 = bqVar.M;
        if (view6 != null) {
            if (z) {
                i = 0;
            }
            view6.setVisibility(i);
        }
        if (d2 != d3) {
            wzcVar2 = wzcVar.f(wzcVar.b(), d3, wzcVar.c(), wzcVar.a());
        } else {
            wzcVar2 = wzcVar;
        }
        return kfc.h(view, wzcVar2);
    }

    public final JSONObject D() {
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
                        jSONObject = new JSONObject(bo2.l(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e2) {
                        e = e2;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        bo2.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    bo2.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            bo2.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            bo2.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public final void F(defpackage.iya r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ni6.F(iya):void");
    }

    @Override
    public final void W0(ja6 ja6Var, long j, long j2, int i) {
        dx7 dx7Var = (dx7) ja6Var;
        c73 c73Var = (c73) this.b;
        da6 da6Var = new da6(dx7Var.a, dx7Var.b, j);
        if (i != 0) {
            c0b c0bVar = dx7Var.d;
            da6Var.d = c0bVar.c;
            da6Var.e = c0bVar.d;
            da6Var.f = j2;
            da6Var.g = c0bVar.b;
        }
        c73Var.r.u(new ea6(da6Var), dx7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override
    public final boolean X(String str, db1 db1Var) {
        return false;
    }

    @Override
    public final void Y0(int i, int i2, CharSequence charSequence, boolean z) {
        jc1 jc1Var = ((pc1) this.b).f;
        if (jc1Var == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jc1Var.getText());
            spannableStringBuilder.replace(i, i2 + i, charSequence);
            if (z) {
                gw3.l(spannableStringBuilder, jc1Var.getEditText().getPaint().getFontMetricsInt(), false);
            }
            jc1Var.setText(spannableStringBuilder);
            jc1Var.setSelection(i + charSequence.length());
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override
    public final ByteBuffer a() {
        lo6 lo6Var = (lo6) this.b;
        lo6Var.p.c();
        return (ByteBuffer) lo6Var.p.f;
    }

    @Override
    public final float b0() {
        return b10.c(9.66f, eh0.d(((ik1) this.b).U0), 0);
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        k47 messageObject;
        vg1 vg1Var = (vg1) this.b;
        HashSet hashSet = vg1Var.q0;
        if ((view instanceof cm1) && (messageObject = ((cm1) view).getMessageObject()) != null) {
            long j = messageObject.J0;
            if (j != -1) {
                if (hashSet.contains(Long.valueOf(j))) {
                    hashSet.remove(Long.valueOf(messageObject.J0));
                } else {
                    hashSet.add(Long.valueOf(messageObject.J0));
                }
                vg1Var.a1(true);
                vg1Var.O0();
                vg1Var.F.f();
                return;
            }
        }
        vg1Var.M0(view, f, f2);
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final boolean f() {
        return !((lo6) this.b).p.o();
    }

    @Override
    public final ha6 f2(ja6 ja6Var, long j, long j2, IOException iOException, int i) {
        int size;
        int i2;
        ha6 ha6Var;
        rb6 rb6Var;
        dx7 dx7Var = (dx7) ja6Var;
        c73 c73Var = (c73) this.b;
        da6 da6Var = new da6(dx7Var.a, dx7Var.b, j);
        c0b c0bVar = dx7Var.d;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        de deVar = new de(iOException, i, (byte) 8);
        synchronized (c73Var.u) {
            size = c73Var.B.size();
            ko5 listIterator = c73Var.B.listIterator(0);
            i2 = 0;
            while (listIterator.hasNext()) {
                Long l = (Long) c73Var.A.get(((rb6) listIterator.next()).b);
                if (l != null && l.longValue() > j) {
                    i2++;
                }
            }
        }
        ba6 ba6Var = new ba6(false, size, i2, 1, 0);
        c73Var.n.getClass();
        ca6 u3 = k4f.u3(ba6Var, deVar);
        if (u3 != null && u3.a == 1) {
            Uri uri = dx7Var.b.a;
            synchronized (c73Var.u) {
                ko5 listIterator2 = c73Var.B.listIterator(0);
                while (true) {
                    if (listIterator2.hasNext()) {
                        rb6Var = (rb6) listIterator2.next();
                        if (uri.equals(rb6Var.a)) {
                            break;
                        }
                    } else {
                        rb6Var = null;
                        break;
                    }
                }
                if (rb6Var != null) {
                    c73Var.A.put(rb6Var.b, Long.valueOf(u3.b + j));
                }
            }
            if (rb6Var != null) {
                c73Var.I.postDelayed(c73Var.w, 0L);
                c73Var.r.s(ea6Var, dx7Var.c, iOException, true);
                c73Var.n.getClass();
                return mx6.y;
            }
        }
        c73Var.n.getClass();
        long w3 = k4f.w3(deVar);
        if (w3 == -9223372036854775807L) {
            ha6Var = mx6.E;
        } else {
            ha6Var = new ha6(0, w3);
        }
        boolean a = ha6Var.a();
        c73Var.r.s(ea6Var, dx7Var.c, iOException, !a);
        if (!a) {
            c73Var.n.getClass();
        }
        return ha6Var;
    }

    @Override
    public final void g(View view, k39 k39Var, boolean z, boolean z2) {
        qe2 qe2Var = (qe2) this.b;
        qe2Var.a.vb(null, qe2Var.e, qe2Var.b, view, 0.0f, 0.0f, k39Var, false, z, z2, false);
        gm.c3(new fo1(this, (byte) 29));
    }

    @Override
    public final void g0(ja6 ja6Var, long j, long j2) {
        int size;
        long j3;
        dx7 dx7Var = (dx7) ja6Var;
        c73 c73Var = (c73) this.b;
        da6 da6Var = new da6(dx7Var.a, dx7Var.b, j);
        c0b c0bVar = dx7Var.d;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        c73Var.n.getClass();
        c73Var.r.p(ea6Var, dx7Var.c);
        t63 t63Var = (t63) dx7Var.f;
        t63 t63Var2 = c73Var.J;
        if (t63Var2 == null) {
            size = 0;
        } else {
            size = t63Var2.l.size();
        }
        long j4 = t63Var.b(0).b;
        int i = 0;
        while (i < size && c73Var.J.b(i).b < j4) {
            i++;
        }
        if (t63Var.d) {
            if (size - i > t63Var.l.size()) {
                ncd.f("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j5 = c73Var.P;
                j3 = -9223372036854775807L;
                if (j5 != -9223372036854775807L && t63Var.h * 1000 <= j5) {
                    ncd.f("DashMediaSource", "Loaded stale dynamic manifest: " + t63Var.h + ", " + c73Var.P);
                } else {
                    c73Var.O = 0;
                }
            }
            int i2 = c73Var.O;
            c73Var.O = i2 + 1;
            if (i2 < c73Var.n.v3(dx7Var.c)) {
                c73Var.I.postDelayed(c73Var.w, Math.min((c73Var.O - 1) * 1000, 5000));
                return;
            }
            c73Var.H = new IOException();
            return;
        }
        j3 = -9223372036854775807L;
        c73Var.J = t63Var;
        c73Var.K &= t63Var.d;
        c73Var.L = j - j2;
        c73Var.M = j;
        c73Var.Q += i;
        Uri uri = dx7Var.b.a;
        synchronized (c73Var.u) {
            ko5 listIterator = c73Var.B.listIterator(0);
            while (true) {
                if (!listIterator.hasNext()) {
                    break;
                } else if (uri.equals(((rb6) listIterator.next()).a)) {
                    if (!t63Var.m.isEmpty()) {
                        c73Var.B = t63Var.m;
                    } else {
                        c73Var.B = mo5.u(new rb6(mtd.a(dx7Var.d.c)));
                    }
                }
            }
        }
        t63 t63Var3 = c73Var.J;
        if (t63Var3.d && c73Var.N == j3) {
            s13 s13Var = t63Var3.i;
            if (s13Var != null) {
                String str = s13Var.b;
                if (!Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                    if (!Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        if (!Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                            if (!Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                c73Var.y(new IOException("Unsupported UTC timing scheme"));
                                return;
                            } else {
                                c73Var.w();
                                return;
                            }
                        }
                        c73Var.A(s13Var, new fgf((byte) 16));
                        return;
                    }
                    c73Var.A(s13Var, new Object());
                    return;
                }
                try {
                    c73Var.N = hac.W(s13Var.c) - c73Var.M;
                    c73Var.z(true);
                    return;
                } catch (bx7 e2) {
                    c73Var.y(e2);
                    return;
                }
            }
            c73Var.w();
            return;
        }
        c73Var.z(true);
    }

    @Override
    public final float getBlurAngle() {
        return ((lo6) this.b).t;
    }

    @Override
    public final float getBlurExcludeBlurSize() {
        return ((lo6) this.b).s;
    }

    @Override
    public final PointF getBlurExcludePoint() {
        return ((lo6) this.b).r;
    }

    @Override
    public final float getBlurExcludeSize() {
        return ((lo6) this.b).q;
    }

    @Override
    public final int getBlurType() {
        return ((lo6) this.b).n;
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
        return b10.A(((lo6) this.b).d, 100.0f, 0.3f, 1.0f);
    }

    @Override
    public final float getEnhanceValue() {
        return ((lo6) this.b).a / 100.0f;
    }

    @Override
    public final float getExposureValue() {
        return ((lo6) this.b).c / 100.0f;
    }

    @Override
    public final float getFadeValue() {
        return ((lo6) this.b).g / 100.0f;
    }

    @Override
    public final float getGrainValue() {
        return (((lo6) this.b).m / 100.0f) * 0.04f;
    }

    @Override
    public final float getHighlightsValue() {
        return b10.y(((lo6) this.b).j, 0.75f, 100.0f, 100.0f);
    }

    @Override
    public final float getSaturationValue() {
        float f = ((lo6) this.b).f / 100.0f;
        if (f > 0.0f) {
            f *= 1.05f;
        }
        return f + 1.0f;
    }

    @Override
    public final float getShadowsValue() {
        return b10.y(((lo6) this.b).k, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public final float getSharpenValue() {
        return b10.A(((lo6) this.b).o, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public final float getSoftenSkinValue() {
        return ((lo6) this.b).b / 100.0f;
    }

    @Override
    public final int getTintHighlightsColor() {
        return ((lo6) this.b).i;
    }

    @Override
    public final float getTintHighlightsIntensityValue() {
        if (((lo6) this.b).i == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final int getTintShadowsColor() {
        return ((lo6) this.b).h;
    }

    @Override
    public final float getTintShadowsIntensityValue() {
        if (((lo6) this.b).h == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final float getVignetteValue() {
        return ((lo6) this.b).l / 100.0f;
    }

    @Override
    public final float getWarmthValue() {
        return ((lo6) this.b).e / 100.0f;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final int h0() {
        ik1 ik1Var = (ik1) this.b;
        return ik1Var.V0 + ik1Var.W0;
    }

    public u4 i(int i) {
        return null;
    }

    public u4 j(int i) {
        return null;
    }

    @Override
    public final int j0() {
        byte b = this.a;
        return 0;
    }

    @Override
    public final void j1(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 9:
                CharSequence charSequence = (CharSequence) obj;
                ak0 ak0Var = (ak0) obj2;
                if (charSequence != null) {
                    if (ak0Var.S()) {
                        ak0Var.X(charSequence);
                    }
                    lk0 lk0Var = ak0Var.m0;
                    kj7 kj7Var = lk0Var.q;
                    if (kj7Var == null) {
                        kj7Var = new kj7();
                        lk0Var.q = kj7Var;
                    }
                    lk0.f(kj7Var, null);
                    return;
                }
                return;
            default:
                mg3 mg3Var = (mg3) obj2;
                if (((e36) obj) != null && mg3Var.s0) {
                    zo4.i(mg3Var, " did not return a View from onCreateView() or this was called before onCreateView().", "Fragment ");
                    return;
                }
                return;
        }
    }

    public final iya k() {
        Object objectVolatile = fy.a.getObjectVolatile((kya) this.b, kya.e);
        if (objectVolatile == bdd.a) {
            objectVolatile = null;
        }
        return (iya) objectVolatile;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final void n(boolean z, float f) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 10:
                xl0.n1 = f;
                ela elaVar = ((xl0) obj).l1;
                elaVar.K();
                elaVar.M();
                return;
            default:
                pmb pmbVar = (pmb) ((b01) obj);
                int i = (int) (cmb.q * 100.0f);
                int i2 = (int) (f * 100.0f);
                cmb.q = f;
                if (i != i2) {
                    ThemeActivity themeActivity = pmbVar.f.e;
                    b59 b59Var = (b59) themeActivity.b.K(themeActivity.g0);
                    if (b59Var != null) {
                        ((njb) b59Var.a).setText(jb6.a0("AutoNightBrightnessInfo", null, 2131753759, Integer.valueOf((int) (cmb.q * 100.0f))));
                    }
                    cmb.E(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDismiss() {
        qw0 qw0Var = (qw0) this.b;
        qw0Var.v("scan_qr_popup_closed", null);
        qw0Var.i0 = false;
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void t(boolean z) {
        Runnable runnable = ((ik1) this.b).S0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final Task then(Object obj) {
        r9a r9aVar = (r9a) obj;
        hi2 hi2Var = (hi2) this.b;
        if (r9aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        nz2 nz2Var = (nz2) hi2Var.c;
        iz2 iz2Var = nz2.r;
        nz2Var.h();
        nz2Var.m.h((a13) nz2Var.e.b, null);
        nz2Var.q.trySetResult(null);
        return Tasks.forResult(null);
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    @Override
    public final Paint.FontMetricsInt u0() {
        return ((pc1) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public final void v(String str) {
        qw0 qw0Var = (qw0) this.b;
        try {
            qw0Var.Q = System.currentTimeMillis();
            qw0Var.v("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e2) {
            fc4.g(e2, true);
        }
    }

    @Override
    public final void w(ja6 ja6Var, long j, long j2, boolean z) {
        ((c73) this.b).x((dx7) ja6Var, j, j2);
    }

    @Override
    public final void x() {
        switch (this.a) {
            case 10:
                ((xl0) this.b).l1.M();
                return;
            default:
                return;
        }
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        p82 p82Var = (p82) this.b;
        p82Var.K(z, i, i2, 0L, false);
        j67 j67Var = p82Var.P;
        if (j67Var != null) {
            j67Var.g();
            p82Var.P = null;
        }
    }

    public final StringBuilder z() {
        x1 x1Var = (x1) this.b;
        if (x1Var instanceof vw7) {
            StringBuilder sb = ((vw7) x1Var).b.b;
            if (sb.length() != 0) {
                return sb;
            }
            return null;
        }
        return null;
    }

    private final void B() {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void I0(yh7 yh7Var) {
    }

    @Override
    public void b(int i) {
    }

    @Override
    public void c(int i) {
    }

    @Override
    public final void c1(String str) {
    }

    @Override
    public final void p(View view, float f, float f2) {
    }

    @Override
    public final void r(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
    }

    @Override
    public final void w0(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    public ni6(Looper looper) {
        this.a = (byte) 0;
        Handler handler = new Handler(looper);
        Looper.getMainLooper();
        this.b = handler;
    }

    public ni6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public ni6(jd4 jd4Var) {
        this.a = (byte) 13;
        this.b = new File((File) jd4Var.c, "com.crashlytics.settings.json");
    }

    public ni6(boolean z) {
        this.a = (byte) 6;
        this.b = new AtomicBoolean(z);
    }

    public ni6(int i, int i2, int[] iArr) {
        this.a = (byte) 8;
        ir5[] ir5VarArr = new ir5[(iArr.length / 2) + 1];
        this.b = ir5VarArr;
        ir5 ir5Var = new ir5(i, i2);
        int i3 = 0;
        ir5VarArr[0] = ir5Var;
        while (i3 < iArr.length / 2) {
            int i4 = i3 + 1;
            int i5 = i3 << 1;
            ((ir5[]) this.b)[i4] = new ir5(iArr[i5], iArr[i5 + 1]);
            i3 = i4;
        }
    }

    public ni6(EditText editText) {
        this.a = (byte) 28;
        this.b = new lx6(editText);
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
