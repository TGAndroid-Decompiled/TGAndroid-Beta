package oc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import c2.u;
import cg.r1;
import com.google.android.exoplayer2.upstream.s0;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.u3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.z3;
import java.io.File;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import m.s3;
import nh.kb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.y1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.uz0;
import org.telegram.ui.Components.voip.w1;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.a21;
import org.telegram.ui.dm0;
import org.telegram.ui.ew;
import org.telegram.ui.ey;
import org.telegram.ui.fi1;
import org.telegram.ui.fy;
import org.telegram.ui.g7;
import org.telegram.ui.jm0;
import org.telegram.ui.lu0;
import org.telegram.ui.q31;
import org.telegram.ui.q6;
import org.telegram.ui.t31;
import org.telegram.ui.vk0;
import org.telegram.ui.vm0;
import org.telegram.ui.xu;
import org.telegram.ui.yu;
import p2.y;
import r4.m;
import r4.q;
import th.b4;
import th.c1;
import th.d1;
import th.d3;
import th.g0;
import th.h0;
import th.m3;
import th.n3;
import th.p;
import th.p3;
import th.t3;
import th.t5;
public class i implements me.b, c6, qt, kb, j1, g7, cl0, jm0, qg.a, u61, y, q, r5.a, n3, c1 {
    public final int f19482a;
    public Object f19483b;
    public Object f19484c;

    public i(int i10) {
        this.f19482a = i10;
    }

    public static i K1(View view) {
        return new i(view);
    }

    public static String T1(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
        }
        return null;
    }

    @Override
    public boolean A1() {
        return false;
    }

    public void A2(h3 h3Var, o3 o3Var) {
        try {
            v3 t10 = w3.t();
            t10.d(o3Var);
            t10.c();
            w3.o((w3) t10.f4701b, h3Var);
            ((u) this.f19484c).h((w3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public ColorFilter B() {
        switch (this.f19482a) {
            case 1:
                return g6.f23380v3;
            case 13:
                return g6.f23380v3;
            default:
                c6 c6Var = (c6) this.f19484c;
                if (c6Var == null) {
                    return g6.f23380v3;
                }
                return c6Var.B();
        }
    }

    @Override
    public int C0(int i10) {
        switch (this.f19482a) {
            case 1:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f19483b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return g6.w0(null, i10, false);
            case 13:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f19483b;
                if (sparseIntArray2 != null) {
                    return sparseIntArray2.get(i10);
                }
                return g6.w0(null, i10, false);
            default:
                SparseIntArray sparseIntArray3 = (SparseIntArray) this.f19483b;
                int indexOfKey2 = sparseIntArray3.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray3.valueAt(indexOfKey2);
                }
                c6 c6Var = (c6) this.f19484c;
                if (c6Var == null) {
                    return g6.w0(null, i10, false);
                }
                return c6Var.C0(i10);
        }
    }

    @Override
    public void E0(Canvas canvas, float f9, float f10, float f11, float f12) {
        switch (this.f19482a) {
            case 11:
                canvas.save();
                canvas.clipRect(f9, f10, f11, f12);
                ((PhotoViewer) this.f19484c).T0(canvas, (ka) this.f19483b, -14277082, 855638016, false, true, true);
                canvas.drawColor(637534208);
                canvas.restore();
                return;
            default:
                Paint paint = (Paint) this.f19483b;
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f19484c;
                r1 r1Var = premiumPreviewFragment.f35918i0;
                if (premiumPreviewFragment.f35911d0) {
                    paint.setColor(premiumPreviewFragment.getThemedColor(g6.f23009a7));
                    canvas.drawRect(f9, f10, f11, f12, paint);
                    return;
                }
                r1Var.d(0, (-premiumPreviewFragment.Z.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.X, 0, premiumPreviewFragment.Z.getMeasuredWidth(), 0.0f, premiumPreviewFragment.Z.getMeasuredHeight());
                canvas.drawRect(f9, f10, f11, f12, r1Var.f3319f);
                return;
        }
    }

    @Override
    public me.a E1(g9.l lVar) {
        int i10;
        List list = (List) this.f19484c;
        List list2 = (List) lVar.f7168b;
        if (list2 != null) {
            i10 = list2.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new j(lVar, (List) this.f19483b, list);
    }

    @Override
    public Paint G(String str) {
        switch (this.f19482a) {
            case 1:
                return g6.S0(str);
            case 13:
                return g6.S0(str);
            default:
                c6 c6Var = (c6) this.f19484c;
                if (c6Var == null) {
                    return g6.S0(str);
                }
                return c6Var.G(str);
        }
    }

    @Override
    public void G0() {
        p pVar = (p) this.f19484c;
        if (pVar.getCurrentItemTop() != pVar.E) {
            pVar.f28403b.X1(pVar, 0);
        }
        pVar.a0();
        p.J(pVar);
    }

    @Override
    public boolean H1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void I0(float f9, boolean z10) {
        xb0 xb0Var = (xb0) this.f19483b;
        ff0 ff0Var = (ff0) this.f19484c;
        x61 x61Var = ff0Var.d;
        if (x61Var != null) {
            long q6 = x61Var.q();
            float max = 2.8f / ((float) Math.max(60L, q6));
            long j10 = (((f9 / (1.0f - max)) * max) + f9) * ((float) q6);
            ff0Var.f28393e = j10;
            ff0Var.d.M(j10, !z10);
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(xb0Var);
                AndroidUtilities.runOnUIThread(xb0Var, 120L);
            }
        }
    }

    @Override
    public void J(th.a aVar) {
        p pVar = (p) this.f19484c;
        ni niVar = pVar.f28403b;
        o2 o2Var = niVar.f30990b0;
        if (o2Var != null && aVar != null && (aVar.f48328b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(o2Var)) {
            ni niVar2 = new ni(pVar.getContext(), niVar.f30990b0, false, false, false, null);
            niVar2.V1 = new ya.a(22);
            niVar2.L = true;
            niVar2.f31049t1.setVisibility(8);
            niVar2.f31036p2 = new w1(pVar, aVar, niVar2, 5);
            niVar2.r1();
            niVar2.show();
        }
    }

    @Override
    public boolean J1() {
        return false;
    }

    @Override
    public void K0(int i10) {
        p pVar = (p) this.f19484c;
        pVar.f28403b.X1(pVar, i10);
        pVar.a0();
        p.J(pVar);
    }

    @Override
    public void L0(int i10, int i11) {
        switch (this.f19482a) {
            case 1:
            case 13:
                return;
            default:
                c6 c6Var = (c6) this.f19484c;
                if (c6Var != null) {
                    c6Var.L0(i10, i11);
                    return;
                }
                return;
        }
    }

    @Override
    public void M(String str, String str2) {
        vm0 vm0Var = ((dm0) this.f19484c).f37561a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            vm0Var.O1(true, str2, (vk0) this.f19483b, this, vm0Var.f43677x1);
        } else {
            vm0Var.N1(true, false);
        }
    }

    @Override
    public boolean M0(long j10) {
        return ((uz0) this.f19484c).v;
    }

    public p2.d M1() {
        if (((p2.l) this.f19483b) != null) {
            return new p2.d(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    @Override
    public boolean O(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void O0(q6 q6Var, kh.a aVar, boolean z10) {
        yu yuVar = (yu) this.f19484c;
        xu xuVar = yuVar.T;
        if (aVar != null) {
            ((kh.b) this.f19483b).i(aVar);
            yuVar.f44968a0.d();
            kh.b bVar = yuVar.f44970c0;
            ux0[] ux0VarArr = yuVar.X;
            y1[] y1VarArr = yuVar.Y;
            y1 y1Var = y1VarArr[0];
            if (y1Var != null) {
                ux0 ux0Var = ux0VarArr[0];
                boolean z11 = bVar.f13905m;
                ux0Var.f33335c = z11;
                y1Var.c(z11, true);
            }
            y1 y1Var2 = y1VarArr[1];
            if (y1Var2 != null) {
                ux0 ux0Var2 = ux0VarArr[1];
                boolean z12 = bVar.f13906n;
                ux0Var2.f33335c = z12;
                y1Var2.c(z12, true);
            }
            y1 y1Var3 = y1VarArr[2];
            if (y1Var3 != null) {
                ux0 ux0Var3 = ux0VarArr[2];
                boolean z13 = bVar.f13907o;
                ux0Var3.f33335c = z13;
                y1Var3.c(z13, true);
            }
            y1 y1Var4 = y1VarArr[3];
            if (y1Var4 != null) {
                ux0 ux0Var4 = ux0VarArr[3];
                boolean z14 = bVar.f13908p;
                ux0Var4.f33335c = z14;
                y1Var4.c(z14, true);
            }
            y1 y1Var5 = y1VarArr[4];
            if (y1Var5 != null) {
                ux0 ux0Var5 = ux0VarArr[4];
                boolean z15 = bVar.f13909q;
                ux0Var5.f33335c = z15;
                y1Var5.c(z15, true);
            }
            yuVar.W.a(xuVar.d(), true);
            xuVar.c(true);
        }
    }

    @Override
    public void O1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ye.d.s(s1Var.getContext(), str);
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public CharacterStyle P1(s1 s1Var) {
        return null;
    }

    @Override
    public boolean Q(s1 s1Var) {
        return false;
    }

    @Override
    public void Q0(m3 m3Var, View view) {
        p pVar = (p) this.f19484c;
        j70 j70Var = new j70(pVar, (c6) this.f19483b, view, false, false, true);
        j70Var.Q = true;
        pVar.D = b4.c(j70Var, pVar.f28403b.f30990b0, pVar.getContext(), (c6) this.f19483b, m3Var, true);
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void S0(d1 d1Var) {
        ((g0) this.f19483b).i();
    }

    @Override
    public void T0(d1 d1Var, int i10, int i11) {
        k9 x4;
        g0 g0Var = (g0) this.f19483b;
        if (!((h0) this.f19484c).d && i10 != i11 && (x4 = g0Var.x()) != null) {
            if (!x4.y() || x4.W != g0Var.D()) {
                d1Var.post(new nj(this, d1Var, i11, x4, g0Var, i10));
            }
        }
    }

    @Override
    public void U(d1 d1Var, boolean z10) {
        ((p) this.f19484c).f28403b.t1(d1Var, z10);
    }

    @Override
    public void U0(th.o3 o3Var, View view) {
        p pVar = (p) this.f19484c;
        j70 j70Var = new j70(pVar, (c6) this.f19483b, view, false, false, true);
        j70Var.Q = true;
        o2 o2Var = pVar.f28403b.f30990b0;
        pVar.getContext();
        pVar.D = b4.b(j70Var, o2Var, o3Var, true);
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public void W(int i10) {
        p.O((p) this.f19484c, 74, i10);
    }

    @Override
    public boolean W0(s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean W1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public sg.a X() {
        return null;
    }

    @Override
    public boolean Y(s1 s1Var) {
        return false;
    }

    @Override
    public lu0 Y1() {
        return null;
    }

    @Override
    public boolean Z(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void Z0(CharSequence charSequence) {
        ((g0) this.f19483b).B(charSequence);
    }

    @Override
    public boolean a() {
        switch (this.f19482a) {
            case 1:
            case 13:
            default:
                return g6.I.q();
        }
    }

    @Override
    public void a1(t5 t5Var, String str) {
        p pVar = (p) this.f19484c;
        if (pVar.v == null) {
            c6 c6Var = (c6) this.f19483b;
            pVar.v = new s3(new fi1(10, this, c6Var), c6Var);
        }
        pVar.v.f(t5Var, str);
    }

    @Override
    public boolean a2(long j10) {
        return ((uz0) this.f19484c).f33404s;
    }

    @Override
    public boolean mo17b(float f9, float f10, int i10, View view) {
        fy fyVar = (fy) this.f19484c;
        if (view instanceof p2) {
            p2 p2Var = (p2) view;
            if (p2Var.f24874j2) {
                fyVar.N4(p2Var.getDialogId(), view);
                return true;
            }
        }
        ew ewVar = fyVar.f38362v0;
        if (ewVar != null && ewVar.getVisibility() == 0 && fyVar.f38362v0.f28243n) {
            return false;
        }
        return fyVar.o4(view, i10, f9, ((ey) this.f19483b).d);
    }

    @Override
    public void b0() {
        int i10;
        p pVar = (p) this.f19484c;
        p3 p3Var = pVar.f48623r;
        t3 t3Var = pVar.f48624s;
        if (t3Var != null) {
            d3 d3Var = p3Var.f48650j3;
            if (d3Var != null && d3Var.y() && p3Var.C4()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (t3Var.T == 2) {
                t3Var.U = i10;
            } else {
                t3Var.f(i10, true);
            }
            if (i10 != 0) {
                pVar.W();
            }
        }
        pVar.Z();
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c1(int i10, s1 s1Var) {
        return false;
    }

    @Override
    public boolean c2(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean d(float r6) {
        throw new UnsupportedOperationException("Method not decompiled: oc.i.d(float):boolean");
    }

    @Override
    public boolean d0() {
        return false;
    }

    public pa.m d2(ua.a r7) {
        throw new UnsupportedOperationException("Method not decompiled: oc.i.d2(ua.a):pa.m");
    }

    @Override
    public void dismiss() {
        ((yu) this.f19484c).dismiss();
    }

    @Override
    public void e(d1 d1Var) {
        ((g0) this.f19483b).e(d1Var);
    }

    @Override
    public void e1() {
        ((st) this.f19483b).getText();
        ((org.telegram.ui.Cells.d3) this.f19484c).b();
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public int f0(s1 s1Var) {
        return 0;
    }

    @Override
    public String g(s1 s1Var) {
        return null;
    }

    @Override
    public int g1(int i10) {
        switch (this.f19482a) {
            case 1:
                return ((SparseIntArray) this.f19483b).get(i10);
            case 13:
                return C0(i10);
            default:
                c6 c6Var = (c6) this.f19484c;
                if (c6Var == null) {
                    return g6.w0(null, i10, false);
                }
                return c6Var.g1(i10);
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f19482a) {
            case 1:
                return null;
            case 13:
                return null;
            default:
                c6 c6Var = (c6) this.f19484c;
                if (c6Var == null) {
                    return g6.O0(str);
                }
                return c6Var.getDrawable(str);
        }
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((fy) this.f19484c).finishPreviewFragment();
        }
    }

    @Override
    public int h0(int i10) {
        switch (this.f19482a) {
            case 1:
                return C0(i10);
            case 13:
                return C0(i10);
            default:
                c6 c6Var = (c6) this.f19484c;
                if (c6Var == null) {
                    return g6.w0(null, i10, false);
                }
                return c6Var.h0(i10);
        }
    }

    @Override
    public boolean h1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public boolean i1(d1 d1Var) {
        return false;
    }

    public void i2(p2.l lVar) {
        this.f19483b = lVar;
        if (lVar.a() != null) {
            lVar.a().getClass();
            String str = lVar.a().d;
            if (str != null) {
                this.f19484c = str;
            }
        }
    }

    @Override
    public boolean j0() {
        return false;
    }

    @Override
    public void k0() {
        t3 t3Var = ((p) this.f19484c).f48624s;
        if (t3Var != null) {
            int i10 = t3Var.T;
            if (i10 == 2) {
                i10 = 0;
            }
            t3Var.U = i10;
            t3Var.e(false, false);
            t3Var.f(2, true);
        }
    }

    public void k2(f3 f3Var) {
        try {
            z2(f3Var, (o3) this.f19483b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void l(float f9, float f10, int i10, int i11) {
        switch (this.f19482a) {
            case 1:
                g6.q(f9, f10, i10, i11);
                return;
            case 13:
                g6.q(f9, f10, i10, i11);
                return;
            default:
                c6 c6Var = (c6) this.f19484c;
                if (c6Var == null) {
                    g6.q(f9, f10, i10, i11);
                    return;
                } else {
                    c6Var.l(f9, f10, i10, i11);
                    return;
                }
        }
    }

    @Override
    public boolean l0() {
        switch (this.f19482a) {
            case 1:
                return false;
            case 13:
                return false;
            default:
                c6 c6Var = (c6) this.f19484c;
                if (c6Var == null) {
                    return g6.a1();
                }
                return c6Var.l0();
        }
    }

    @Override
    public void l1() {
        t3 t3Var = ((p) this.f19484c).f48624s;
        if (t3Var != null) {
            int i10 = 0;
            t3Var.e(false, true);
            int i11 = t3Var.U;
            if (i11 != 2) {
                i10 = i11;
            }
            t3Var.f(i10, true);
        }
    }

    public void l2(f3 f3Var, int i10, long j10) {
        try {
            com.google.android.gms.internal.play_billing.n3 n3Var = (com.google.android.gms.internal.play_billing.n3) ((o3) this.f19483b).g();
            n3Var.c();
            o3.p((o3) n3Var.f4701b, i10);
            o3 o3Var = (o3) n3Var.a();
            this.f19483b = o3Var;
            if (j10 != 0) {
                com.google.android.gms.internal.play_billing.n3 n3Var2 = (com.google.android.gms.internal.play_billing.n3) o3Var.g();
                n3Var2.c();
                o3.r((o3) n3Var2.f4701b, j10);
                o3Var = (o3) n3Var2.a();
            }
            z2(f3Var, o3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean m() {
        return ((g0) this.f19483b).M();
    }

    @Override
    public boolean m2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean n0(y5 y5Var) {
        return false;
    }

    @Override
    public void n1(Editable editable) {
        ((h0) this.f19484c).i();
        ((g0) this.f19483b).i0();
    }

    @Override
    public void o0(Bitmap bitmap) {
        i iVar = (i) this.f19483b;
        iVar.f19484c = bitmap;
        r5.f fVar = (r5.f) this.f19484c;
        fVar.f47053l = iVar;
        fVar.b();
    }

    public void o2(f3 f3Var, long j10, boolean z10) {
        o3 o3Var;
        try {
            e3 e3Var = (e3) f3Var.g();
            com.google.android.gms.internal.play_billing.s3 s3Var = (com.google.android.gms.internal.play_billing.s3) f3Var.o().g();
            s3Var.c();
            u3.n((u3) s3Var.f4701b, z10);
            e3Var.c();
            f3.r((f3) e3Var.f4701b, (u3) s3Var.a());
            f3 f3Var2 = (f3) e3Var.a();
            if (j10 == 0) {
                o3Var = (o3) this.f19483b;
            } else {
                com.google.android.gms.internal.play_billing.n3 n3Var = (com.google.android.gms.internal.play_billing.n3) ((o3) this.f19483b).g();
                n3Var.c();
                o3.r((o3) n3Var.f4701b, j10);
                o3Var = (o3) n3Var.a();
            }
            z2(f3Var2, o3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void onContentChanged() {
        p pVar = (p) this.f19484c;
        t3 t3Var = pVar.f48624s;
        if (t3Var != null) {
            t3Var.setSendLoading(pVar.f48623r.m3());
        }
        pVar.V(true);
        pVar.Y();
        th.d dVar = pVar.L;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override
    public void onError(x61 x61Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f19484c;
        int i10 = secretMediaViewer.X;
        if (i10 > 0) {
            secretMediaViewer.X = i10 - 1;
            AndroidUtilities.runOnUIThread(new t31(1, this, (File) this.f19483b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f19484c;
        q31 q31Var = secretMediaViewer.f36194e1;
        if (secretMediaViewer.f36232y != null && secretMediaViewer.f36190d0 != null) {
            AndroidUtilities.cancelRunOnUIThread(q31Var);
            AndroidUtilities.runOnUIThread(q31Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f36184b.getWindow().addFlags(128);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else {
                try {
                    secretMediaViewer.f36184b.getWindow().clearFlags(128);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            if (i10 == 3 && secretMediaViewer.f36228w.getVisibility() != 0) {
                secretMediaViewer.f36228w.setVisibility(0);
            }
            if (secretMediaViewer.f36232y.z() && i10 != 4) {
                if (!secretMediaViewer.A) {
                    secretMediaViewer.A = true;
                }
            } else if (secretMediaViewer.A) {
                secretMediaViewer.A = false;
                if (i10 == 4) {
                    secretMediaViewer.D = true;
                    if (secretMediaViewer.E) {
                        secretMediaViewer.e(true, !secretMediaViewer.f36209m1);
                        return;
                    }
                    secretMediaViewer.f36232y.M(0L, false);
                    secretMediaViewer.f36232y.D();
                }
            }
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f9) {
        float f10;
        e5.c cVar = ((SecretMediaViewer) this.f19484c).f36228w;
        if (cVar != null) {
            if (i12 != 90 && i12 != 270) {
                i11 = i10;
                i10 = i11;
            }
            if (i10 == 0) {
                f10 = 1.0f;
            } else {
                f10 = (i11 * f9) / i10;
            }
            cVar.a(f10, i12);
        }
    }

    public void p2(f3 f3Var, int i10, long j10, boolean z10) {
        o3 o3Var;
        try {
            com.google.android.gms.internal.play_billing.n3 n3Var = (com.google.android.gms.internal.play_billing.n3) ((o3) this.f19483b).g();
            n3Var.c();
            o3.p((o3) n3Var.f4701b, i10);
            this.f19483b = (o3) n3Var.a();
            e3 e3Var = (e3) f3Var.g();
            com.google.android.gms.internal.play_billing.s3 s3Var = (com.google.android.gms.internal.play_billing.s3) f3Var.o().g();
            s3Var.c();
            u3.n((u3) s3Var.f4701b, z10);
            e3Var.c();
            f3.r((f3) e3Var.f4701b, (u3) s3Var.a());
            f3 f3Var2 = (f3) e3Var.a();
            if (j10 == 0) {
                o3Var = (o3) this.f19483b;
            } else {
                com.google.android.gms.internal.play_billing.n3 n3Var2 = (com.google.android.gms.internal.play_billing.n3) ((o3) this.f19483b).g();
                n3Var2.c();
                o3.r((o3) n3Var2.f4701b, j10);
                o3Var = (o3) n3Var2.a();
            }
            z2(f3Var2, o3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void q() {
        int i10 = this.f19482a;
    }

    @Override
    public s0 q0(m mVar, r4.j jVar) {
        return new g9.l(((q) this.f19484c).q0(mVar, jVar), (List) this.f19483b, false, 15);
    }

    @Override
    public j70 q1(View view) {
        p pVar = (p) this.f19484c;
        j70 j70Var = new j70(pVar, (c6) this.f19483b, view, false, false, true);
        pVar.D = j70Var;
        return j70Var;
    }

    @Override
    public void r(float f9) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((fy) this.f19484c).movePreviewFragment(f9);
        }
    }

    @Override
    public boolean r0(d1 d1Var) {
        return false;
    }

    public void r2(k3 k3Var) {
        try {
            v3 t10 = w3.t();
            t10.d((o3) this.f19483b);
            t10.c();
            w3.p((w3) t10.f4701b, k3Var);
            ((u) this.f19484c).h((w3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void s1() {
        p pVar = (p) this.f19484c;
        pVar.X();
        pVar.Y();
    }

    @Override
    public boolean t1(boolean z10) {
        return false;
    }

    public void t2(z3 z3Var) {
        try {
            v3 t10 = w3.t();
            t10.d((o3) this.f19483b);
            t10.c();
            w3.r((w3) t10.f4701b, z3Var);
            ((u) this.f19484c).h((w3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public String toString() {
        switch (this.f19482a) {
            case 19:
                return ((HashMap) this.f19483b).toString();
            case 20:
            default:
                return super.toString();
            case 21:
                return "Bounds{lower=" + ((i0.b) this.f19483b) + " upper=" + ((i0.b) this.f19484c) + "}";
        }
    }

    @Override
    public boolean u2(int i10) {
        return false;
    }

    @Override
    public ng.d v() {
        switch (this.f19482a) {
            case 11:
                if (Build.VERSION.SDK_INT >= 29) {
                    ng.e eVar = new ng.e(this);
                    ((PhotoViewer) this.f19484c).V.add(eVar);
                    return eVar;
                }
                return new ng.f(this);
            default:
                return new ng.f(this);
        }
    }

    @Override
    public s0 v1() {
        return new g9.l(((q) this.f19484c).v1(), (List) this.f19483b, false, 15);
    }

    public void v2(a4 a4Var) {
        if (a4Var == null) {
            return;
        }
        try {
            v3 t10 = w3.t();
            t10.d((o3) this.f19483b);
            t10.c();
            w3.s((w3) t10.f4701b, a4Var);
            ((u) this.f19484c).h((w3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public String y(long j10) {
        String trim = ((EditTextBoldCursor) this.f19483b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((uz0) this.f19484c).f33404s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    @Override
    public l9 y2() {
        return null;
    }

    @Override
    public void z(int i10, int i11) {
        ((g0) this.f19483b).h0(i10, i11);
    }

    public void z2(f3 f3Var, o3 o3Var) {
        if (f3Var == null) {
            return;
        }
        try {
            v3 t10 = w3.t();
            t10.d(o3Var);
            t10.c();
            w3.n((w3) t10.f4701b, f3Var);
            ((u) this.f19484c).h((w3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public i(int i10, Object obj, Object obj2) {
        this.f19482a = i10;
        this.f19483b = obj;
        this.f19484c = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f19484c;
        if (secretMediaViewer.Y) {
            return;
        }
        secretMediaViewer.Y = true;
        secretMediaViewer.f36192e.invalidate();
    }

    public i(Object obj, Object obj2, boolean z10, int i10) {
        this.f19482a = i10;
        this.f19484c = obj;
        this.f19483b = obj2;
    }

    public i(Context context, o3 o3Var) {
        this.f19482a = 17;
        u uVar = new u(6);
        try {
            y2.q.b(context);
            uVar.f2912c = y2.q.a().c(w2.a.f49622e).a("PLAY_BILLING_LIBRARY", new v2.c("proto"), new x9.d(19));
        } catch (Throwable unused) {
            uVar.f2911b = true;
        }
        this.f19484c = uVar;
        this.f19483b = o3Var;
    }

    public i(IBinder iBinder) {
        this.f19482a = 29;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f19484c = new v5.g(iBinder);
            this.f19483b = null;
            return;
        }
        this.f19483b = new Messenger(iBinder);
        this.f19484c = null;
    }

    public i(y5.a aVar) {
        this.f19482a = 24;
        this.f19483b = aVar == null ? null : aVar.f50494b;
    }

    public i(c6 c6Var) {
        this.f19482a = 15;
        this.f19483b = new SparseIntArray();
        this.f19484c = c6Var;
        G1();
    }

    private final void X1() {
    }

    private final void Z1() {
    }

    public void G1() {
    }

    @Override
    public void S1() {
    }

    @Override
    public void a0() {
    }

    @Override
    public void clear() {
    }

    @Override
    public void k() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void o1() {
    }

    @Override
    public void p() {
    }

    @Override
    public void q2() {
    }

    @Override
    public void t() {
    }

    @Override
    public void u0() {
    }

    @Override
    public void w2() {
    }

    @Override
    public void y1() {
    }

    @Override
    public void z0() {
    }

    public i(View view) {
        this.f19482a = 7;
        i61 i61Var = new i61(this, view);
        this.f19483b = i61Var;
        view.addOnLayoutChangeListener(i61Var);
    }

    @Override
    public void A(s1 s1Var) {
    }

    @Override
    public void C(s1 s1Var) {
    }

    @Override
    public void C1(s1 s1Var) {
    }

    @Override
    public void D(float f9) {
    }

    @Override
    public void D0(s1 s1Var) {
    }

    @Override
    public void D1(long j10) {
    }

    @Override
    public void F(s1 s1Var) {
    }

    @Override
    public void F0(s1 s1Var) {
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void H0(float f9) {
    }

    @Override
    public void J0(s1 s1Var) {
    }

    @Override
    public void K(s1 s1Var) {
    }

    @Override
    public void L1(s1 s1Var) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void N0(s1 s1Var) {
    }

    @Override
    public void N1(MessageObject messageObject) {
    }

    @Override
    public void T(s1 s1Var) {
    }

    @Override
    public void X0(s1 s1Var) {
    }

    @Override
    public void Y0(s1 s1Var) {
    }

    @Override
    public void b1(long j10) {
    }

    @Override
    public void c0(int i10) {
    }

    @Override
    public void d1(boolean z10) {
    }

    @Override
    public void e2(s1 s1Var) {
    }

    @Override
    public void g0(s1 s1Var) {
    }

    @Override
    public void i(int i10) {
    }

    @Override
    public void i0(float f9) {
    }

    @Override
    public void j1(float f9) {
    }

    @Override
    public void m0(String str) {
    }

    @Override
    public void n2(s1 s1Var) {
    }

    @Override
    public void o(s1 s1Var) {
    }

    @Override
    public void onSeekFinished(k3.a aVar) {
    }

    @Override
    public void onSeekStarted(k3.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void r1(float f9) {
    }

    @Override
    public void s(s1 s1Var) {
    }

    @Override
    public void s0(boolean z10) {
    }

    @Override
    public void u(s1 s1Var) {
    }

    @Override
    public void w(s1 s1Var) {
    }

    @Override
    public void x(float f9) {
    }

    @Override
    public void x1(float f9) {
    }

    @Override
    public void y0(s1 s1Var) {
    }

    @Override
    public void z1(float f9) {
    }

    public i(ff0 ff0Var) {
        this.f19482a = 5;
        this.f19484c = ff0Var;
        this.f19483b = new xb0(this, 9);
    }

    public i(String str, String str2) {
        this.f19482a = 28;
        this.f19483b = str;
        this.f19484c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public i(String str) {
        this.f19482a = 25;
        this.f19484c = null;
        this.f19483b = str;
    }

    private final void f2(int i10, int i11) {
    }

    private final void h2(int i10, int i11) {
    }

    @Override
    public void B1(int i10, long j10) {
    }

    @Override
    public void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void F1(s1 s1Var, boolean z10) {
    }

    @Override
    public void I(long j10, boolean z10) {
    }

    @Override
    public void I1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void L(int i10, s1 s1Var) {
    }

    @Override
    public void P0(int i10, s1 s1Var) {
    }

    @Override
    public void R0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void U1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void f1(float f9, int i10) {
    }

    @Override
    public void g2(s1 s1Var, long j10) {
    }

    @Override
    public void j2(s1 s1Var, hh.f fVar) {
    }

    @Override
    public void m1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void p1(s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public void w1(float f9, int i10) {
    }

    @Override
    public void x0(float f9, int i10) {
    }

    public i(EditText editText) {
        this.f19482a = 20;
        this.f19483b = editText;
        q1.i iVar = new q1.i(editText);
        this.f19484c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f46197b == null) {
            synchronized (q1.a.f46196a) {
                try {
                    if (q1.a.f46197b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f46198c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f46197b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f46197b);
    }

    public i(PremiumPreviewFragment premiumPreviewFragment) {
        this.f19482a = 12;
        this.f19484c = premiumPreviewFragment;
        this.f19483b = new Paint();
    }

    public i(a21 a21Var) {
        this.f19482a = 13;
        this.f19484c = a21Var;
    }

    public i(PhotoViewer photoViewer) {
        this.f19482a = 11;
        this.f19484c = photoViewer;
        this.f19483b = new ka(photoViewer.X, photoViewer.f35647a0, 0, false);
    }

    @Override
    public void A0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(s1 s1Var, float f9, float f10) {
    }

    @Override
    public void V0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void e0(s1 s1Var, float f9, float f10) {
    }

    @Override
    public void p0(s1 s1Var, float f9, float f10) {
    }

    @Override
    public void u1(s1 s1Var, float f9, float f10) {
    }

    @Override
    public void x2(s1 s1Var, int i10, int i11) {
    }

    @Override
    public void V1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void t0(s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    @Override
    public void v0(s1 s1Var, float f9, float f10, boolean z10) {
    }

    @Override
    public void b2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    @Override
    public void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void s2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    @Override
    public void S(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    @Override
    public void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
