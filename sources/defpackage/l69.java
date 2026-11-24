package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ThemeActivity;
public class l69 implements no7, qq, co7, zu9, ca1, rz6, d39, aha, xo5, gj, x74, yr9, i33, n86, ir9 {
    public static l69 d;
    public final byte a;
    public final Object b;
    public static final Object c = new Object();
    public static final qne e = new qne((byte) 1);

    public l69(byte b) {
        due dueVar;
        this.a = b;
        switch (b) {
            case 3:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new v4(this);
                    return;
                } else {
                    this.b = new v4(this);
                    return;
                }
            case 26:
                this.b = new v39(hs4.l, (byte) 1);
                return;
            default:
                try {
                    dueVar = (due) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    dueVar = e;
                }
                due[] dueVarArr = {qne.b, dueVar};
                ?? obj = new Object();
                obj.a = dueVarArr;
                Charset charset = foe.a;
                this.b = obj;
                return;
        }
    }

    public static Task I(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        yjb.c(1, new rld(callable, taskCompletionSource, (byte) 18));
        return taskCompletionSource.getTask();
    }

    public static l69 x() {
        l69 l69Var;
        synchronized (c) {
            l69Var = d;
            if (l69Var == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                l69 l69Var2 = new l69(handlerThread.getLooper());
                d = l69Var2;
                l69Var = l69Var2;
            }
        }
        return l69Var;
    }

    public static l69 y(int i) {
        boolean z;
        Point point = gl.q;
        int i2 = (int) (point.x * 0.5f);
        int i3 = (int) (point.y * 0.5f);
        if (i2 == i3) {
            return new l69(i2, i3, new int[0]);
        }
        if (i == 3) {
            return new l69(i2, i3, new int[]{i3, i2});
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
            return new l69(i2, i3, new int[0]);
        }
        return new l69(i3, i2, new int[0]);
    }

    @Override
    public final void A() {
        switch (this.a) {
            case 11:
                ((xk0) this.b).l1.M();
                return;
            default:
                return;
        }
    }

    @Override
    public final void D(float f, int i) {
        c82 c82Var = (c82) this.b;
        c82Var.c.setLayerType(0, null);
        if (f == 0.0f && !c82Var.P) {
            c82Var.c.setVisibility(4);
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                c82Var.F.setFocusableInTouchMode(false);
            }
        }
        kk7.e().k(kk7.j1, 512);
    }

    @Override
    public final void D2(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        aj0 aj0Var = (aj0) this.b;
        if (charSequence != null) {
            if (aj0Var.S()) {
                aj0Var.X(charSequence);
            }
            lj0 lj0Var = aj0Var.m0;
            hh7 hh7Var = lj0Var.q;
            if (hh7Var == null) {
                hh7Var = new hh7();
                lj0Var.q = hh7Var;
            }
            lj0.f(hh7Var, null);
        }
    }

    public boolean F(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override
    public final void G(String str) {
        hv0 hv0Var = (hv0) this.b;
        try {
            hv0Var.Q = System.currentTimeMillis();
            hv0Var.v("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e2) {
            fa4.g(e2, true);
        }
    }

    public final JSONObject H() {
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
                        jSONObject = new JSONObject(pm2.l(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e2) {
                        e = e2;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        pm2.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    pm2.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            pm2.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            pm2.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override
    public final void K0() {
        ((t23) this.b).d.invalidate();
    }

    public final void L(int i, Object obj, nq9 nq9Var) {
        ck2 ck2Var = (ck2) this.b;
        ck2Var.A(i, 3);
        nq9Var.i((o3) obj, ck2Var.a);
        ck2Var.A(i, 4);
    }

    @Override
    public final vf6 O0() {
        return null;
    }

    @Override
    public final float P() {
        return b00.c(9.66f, dg0.d(((zi1) this.b).U0), 0);
    }

    @Override
    public final int Q() {
        zi1 zi1Var = (zi1) this.b;
        return zi1Var.V0 + zi1Var.W0;
    }

    @Override
    public final boolean U1(int i) {
        return true;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        boolean z;
        vxc vxcVar2;
        int b;
        int c2;
        boolean z2;
        int color;
        int d2 = vxcVar.d();
        bp bpVar = (bp) this.b;
        Context context = bpVar.e;
        int d3 = vxcVar.d();
        ActionBarContextView actionBarContextView = bpVar.E;
        int i = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bpVar.E.getLayoutParams();
            boolean z3 = true;
            if (bpVar.E.isShown()) {
                if (bpVar.m0 == null) {
                    bpVar.m0 = new Rect();
                    bpVar.n0 = new Rect();
                }
                Rect rect = bpVar.m0;
                Rect rect2 = bpVar.n0;
                rect.set(vxcVar.b(), vxcVar.d(), vxcVar.c(), vxcVar.a());
                ViewGroup viewGroup = bpVar.K;
                Method method = gfc.a;
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
                ViewGroup viewGroup2 = bpVar.K;
                WeakHashMap weakHashMap = jdc.a;
                vxc a = cdc.a(viewGroup2);
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
                if (i2 > 0 && bpVar.M == null) {
                    View view2 = new View(context);
                    bpVar.M = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c2;
                    bpVar.K.addView(bpVar.M, -1, layoutParams);
                } else {
                    View view3 = bpVar.M;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c2;
                            bpVar.M.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = bpVar.M;
                if (view4 == null) {
                    z3 = false;
                }
                if (z3 && view4.getVisibility() != 0) {
                    View view5 = bpVar.M;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        color = context.getColor(2131099654);
                    } else {
                        color = context.getColor(2131099653);
                    }
                    view5.setBackgroundColor(color);
                }
                if (!bpVar.R && z3) {
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
                bpVar.E.setLayoutParams(marginLayoutParams);
            }
        } else {
            z = false;
        }
        View view6 = bpVar.M;
        if (view6 != null) {
            if (z) {
                i = 0;
            }
            view6.setVisibility(i);
        }
        if (d2 != d3) {
            vxcVar2 = vxcVar.f(vxcVar.b(), d3, vxcVar.c(), vxcVar.a());
        } else {
            vxcVar2 = vxcVar;
        }
        return jdc.h(view, vxcVar2);
    }

    @Override
    public final boolean W0(String str, u91 u91Var) {
        return false;
    }

    @Override
    public final String Z0() {
        return ((hv0) this.b).j0;
    }

    @Override
    public final void a(int i, boolean z) {
        boolean z2;
        hf3 hf3Var = (hf3) this.b;
        gf3[] gf3VarArr = hf3Var.f;
        if (gf3VarArr[0].f == i) {
            return;
        }
        if (i == hf3Var.e.getFirstTabId()) {
            z2 = true;
        } else {
            z2 = false;
        }
        hf3Var.x = z2;
        gf3 gf3Var = gf3VarArr[1];
        gf3Var.f = i;
        gf3Var.setVisibility(0);
        hf3Var.q0(true);
        hf3Var.r = z;
    }

    @Override
    public final int a0() {
        byte b = this.a;
        return 0;
    }

    @Override
    public final void b() {
        q53 q53Var = (q53) this.b;
        q53Var.F.b();
        IOException iOException = q53Var.H;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }

    @Override
    public final void c(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
        byte b = this.a;
    }

    @Override
    public final Paint.FontMetricsInt d() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 15:
                return ((ib1) obj).f.getEditText().getPaint().getFontMetricsInt();
            default:
                return ((x02) obj).B2.getEditText().getPaint().getFontMetricsInt();
        }
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        k27 messageObject;
        nf1 nf1Var = (nf1) this.b;
        HashSet hashSet = nf1Var.q0;
        if ((view instanceof uk1) && (messageObject = ((uk1) view).getMessageObject()) != null) {
            long j = messageObject.J0;
            if (j != -1) {
                if (hashSet.contains(Long.valueOf(j))) {
                    hashSet.remove(Long.valueOf(messageObject.J0));
                } else {
                    hashSet.add(Long.valueOf(messageObject.J0));
                }
                nf1Var.Z0(true);
                nf1Var.N0();
                nf1Var.F.f();
                return;
            }
        }
        nf1Var.L0(view, f, f2);
    }

    @Override
    public final void g(float f) {
        hf3 hf3Var = (hf3) this.b;
        gf3[] gf3VarArr = hf3Var.f;
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i != 0 || gf3VarArr[1].getVisibility() == 0) {
            if (hf3Var.r) {
                gf3 gf3Var = gf3VarArr[0];
                gf3Var.setTranslationX((-f) * gf3Var.getMeasuredWidth());
                gf3VarArr[1].setTranslationX(gf3VarArr[0].getMeasuredWidth() - (f * gf3VarArr[0].getMeasuredWidth()));
            } else {
                gf3 gf3Var2 = gf3VarArr[0];
                gf3Var2.setTranslationX(gf3Var2.getMeasuredWidth() * f);
                gf3VarArr[1].setTranslationX((f * gf3VarArr[0].getMeasuredWidth()) - gf3VarArr[0].getMeasuredWidth());
            }
            if (i == 0) {
                gf3 gf3Var3 = gf3VarArr[0];
                gf3VarArr[0] = gf3VarArr[1];
                gf3VarArr[1] = gf3Var3;
                gf3Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.a) {
            case 11:
                return null;
            default:
                return " ";
        }
    }

    @Override
    public final void h(TLRPC.TL_document tL_document, String str, Object obj) {
        byte b = this.a;
    }

    @Override
    public final void j(boolean z, float f) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 11:
                xk0.n1 = f;
                cja cjaVar = ((xk0) obj).l1;
                cjaVar.K();
                cjaVar.M();
                return;
            default:
                okb okbVar = (okb) ((uy0) obj);
                int i = (int) (bkb.q * 100.0f);
                int i2 = (int) (f * 100.0f);
                bkb.q = f;
                if (i != i2) {
                    ThemeActivity themeActivity = okbVar.f.e;
                    y29 y29Var = (y29) themeActivity.b.K(themeActivity.g0);
                    if (y29Var != null) {
                        ((mhb) y29Var.a).setText(k96.a0("AutoNightBrightnessInfo", null, 2131753791, Integer.valueOf((int) (bkb.q * 100.0f))));
                    }
                    bkb.E(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void k(int i, int i2, CharSequence charSequence, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 15:
                cb1 cb1Var = ((ib1) obj).f;
                if (cb1Var != null) {
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cb1Var.getText());
                        spannableStringBuilder.replace(i, i2 + i, charSequence);
                        if (z) {
                            vu3.l(spannableStringBuilder, cb1Var.getEditText().getPaint().getFontMetricsInt(), false);
                        }
                        cb1Var.setText(spannableStringBuilder);
                        cb1Var.setSelection(i + charSequence.length());
                        return;
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                        return;
                    }
                }
                return;
            default:
                x02 x02Var = (x02) obj;
                if (x02Var.U0() != null) {
                    try {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(x02Var.U0().getText());
                        spannableStringBuilder2.replace(i, i2 + i, charSequence);
                        if (z) {
                            vu3.l(spannableStringBuilder2, x02Var.U0().getEditText().getPaint().getFontMetricsInt(), false);
                        }
                        x02Var.U0().setText(spannableStringBuilder2);
                        x02Var.U0().setSelection(i + charSequence.length());
                        return;
                    } catch (Exception e3) {
                        fa4.g(e3, true);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void m(String str) {
        byte b = this.a;
    }

    @Override
    public final void o(boolean z) {
        Runnable runnable = ((zi1) this.b).S0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onDismiss() {
        hv0 hv0Var = (hv0) this.b;
        hv0Var.v("scan_qr_popup_closed", null);
        hv0Var.i0 = false;
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        ((c82) this.b).i0(f);
    }

    @Override
    public final boolean q(View view) {
        return false;
    }

    @Override
    public final boolean q2(int i, View view) {
        return false;
    }

    @Override
    public final void r(int i) {
        gl.d3(new hq1(this, (byte) 27));
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        ((ev1) this.b).a(Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override
    public final vf6 t1() {
        return null;
    }

    public u4 u(int i) {
        return null;
    }

    public final defpackage.c93 v(defpackage.xf4 r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l69.v(xf4):c93");
    }

    public u4 w(int i) {
        return null;
    }

    private final void z() {
    }

    @Override
    public final void B() {
    }

    @Override
    public final void t2() {
    }

    private final void n(String str) {
    }

    private final void t(String str) {
    }

    @Override
    public final void Q1(vf7 vf7Var) {
    }

    @Override
    public void f(int i) {
    }

    @Override
    public final void h2(boolean z) {
    }

    @Override
    public void i(int i) {
    }

    @Override
    public final void m2(ArrayList arrayList) {
    }

    @Override
    public final void o1(boolean z) {
    }

    private final void C(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    private final void E(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    private final void J(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
    }

    private final void K(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
    }

    @Override
    public final void l(View view, float f, float f2) {
    }

    public l69(Looper looper) {
        this.a = (byte) 1;
        Handler handler = new Handler(looper);
        Looper.getMainLooper();
        this.b = handler;
    }

    public l69(Set set) {
        this.a = (byte) 0;
        this.b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            k69 k69Var = (k69) it.next();
            k69Var.getClass();
            ((HashMap) this.b).put(v43.class, k69Var.a);
        }
    }

    public l69(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public l69(ck2 ck2Var) {
        this.a = (byte) 23;
        Charset charset = mp5.a;
        this.b = ck2Var;
        ck2Var.a = this;
    }

    public l69(jb4 jb4Var) {
        this.a = (byte) 14;
        this.b = new File((File) jb4Var.c, "com.crashlytics.settings.json");
    }

    public l69(boolean z) {
        this.a = (byte) 7;
        this.b = new AtomicBoolean(z);
    }

    public l69(int i, int i2, int[] iArr) {
        this.a = (byte) 9;
        ip5[] ip5VarArr = new ip5[(iArr.length / 2) + 1];
        this.b = ip5VarArr;
        ip5 ip5Var = new ip5(i, i2);
        int i3 = 0;
        ip5VarArr[0] = ip5Var;
        while (i3 < iArr.length / 2) {
            int i4 = i3 + 1;
            int i5 = i3 << 1;
            ((ip5[]) this.b)[i4] = new ip5(iArr[i5], iArr[i5 + 1]);
            i3 = i4;
        }
    }
}
