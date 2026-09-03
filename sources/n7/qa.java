package n7;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.ut;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.b11;
import org.telegram.ui.cv0;
import org.telegram.ui.fn0;
import org.telegram.ui.gl0;
import org.telegram.ui.hv;
import org.telegram.ui.i41;
import org.telegram.ui.iv;
import org.telegram.ui.nm0;
import org.telegram.ui.pw;
import org.telegram.ui.py;
import org.telegram.ui.qy;
import org.telegram.ui.tm0;
import org.telegram.ui.u21;
public class qa implements OnCompleteListener, od.b, org.telegram.ui.ActionBar.f6, st, ph.ia, org.telegram.ui.Cells.j1, org.telegram.ui.m7, kl0, tm0, sg.a, f71, p2.a0 {
    public final int f14686a;
    public Object f14687b;
    public Object f14688c;

    public qa(int i10) {
        this.f14686a = i10;
    }

    public static qa V(View view) {
        return new qa(view);
    }

    @Override
    public boolean B0(MessageObject messageObject) {
        return true;
    }

    @Override
    public void C0(float f10, boolean z4) {
        dc0 dc0Var = (dc0) this.f14687b;
        pf0 pf0Var = (pf0) this.f14688c;
        i71 i71Var = pf0Var.d;
        if (i71Var != null) {
            long p10 = i71Var.p();
            float max = 2.8f / ((float) Math.max(60L, p10));
            long j10 = (((f10 / (1.0f - max)) * max) + f10) * ((float) p10);
            pf0Var.e = j10;
            pf0Var.d.L(j10, !z4);
            if (!z4) {
                AndroidUtilities.cancelRunOnUIThread(dc0Var);
                AndroidUtilities.runOnUIThread(dc0Var, 120L);
            }
        }
    }

    @Override
    public void D(String str, String str2) {
        fn0 fn0Var = ((nm0) this.f14688c).f36539a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            fn0Var.O1(true, str2, (gl0) this.f14687b, this, fn0Var.f34167y1);
        } else {
            fn0Var.N1(true, false);
        }
    }

    @Override
    public org.telegram.ui.Cells.m9 D2() {
        return null;
    }

    @Override
    public boolean F1() {
        return false;
    }

    @Override
    public Paint G(String str) {
        switch (this.f14686a) {
            case 8:
                return org.telegram.ui.ActionBar.j6.S0(str);
            case 21:
                return org.telegram.ui.ActionBar.j6.S0(str);
            default:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f14688c;
                if (f6Var == null) {
                    return org.telegram.ui.ActionBar.j6.S0(str);
                }
                return f6Var.G(str);
        }
    }

    @Override
    public void H(Canvas canvas, float f10, float f11, float f12, float f13) {
        switch (this.f14686a) {
            case 19:
                canvas.save();
                canvas.clipRect(f10, f11, f12, f13);
                ((PhotoViewer) this.f14688c).T0(canvas, (org.telegram.ui.Components.fa) this.f14687b, -14277082, 855638016, false, true, true);
                canvas.drawColor(637534208);
                canvas.restore();
                return;
            default:
                Paint paint = (Paint) this.f14687b;
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f14688c;
                eg.q1 q1Var = premiumPreviewFragment.f31938j0;
                if (premiumPreviewFragment.f31932e0) {
                    paint.setColor(premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.j6.f19827a7));
                    canvas.drawRect(f10, f11, f12, f13, paint);
                    return;
                }
                q1Var.d(0, (-premiumPreviewFragment.f31926a0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.Y, 0, premiumPreviewFragment.f31926a0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f31926a0.getMeasuredHeight());
                canvas.drawRect(f10, f11, f12, f13, q1Var.f5446f);
                return;
        }
    }

    @Override
    public void J() {
        ((ut) this.f14687b).getText();
        ((org.telegram.ui.Cells.e3) this.f14688c).b();
    }

    @Override
    public void J0(int i10, int i11) {
        switch (this.f14686a) {
            case 8:
            case 21:
                return;
            default:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f14688c;
                if (f6Var != null) {
                    f6Var.J0(i10, i11);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean K1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    public void L0(p2.n nVar) {
        this.f14687b = nVar;
        if (nVar.a() != null) {
            nVar.a().getClass();
            String str = nVar.a().d;
            if (str != null) {
                this.f14688c = str;
            }
        }
    }

    public r3.v M0(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f14687b;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return ((o4.k0[]) this.f14688c)[i11];
                }
                i11++;
            } else {
                h5.a.o("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new r3.j();
            }
        }
    }

    @Override
    public boolean M1() {
        return false;
    }

    public void O0(com.google.android.gms.internal.play_billing.g3 g3Var) {
        try {
            k1(g3Var, (com.google.android.gms.internal.play_billing.p3) this.f14687b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean P(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public boolean Q() {
        return false;
    }

    public void Q0(com.google.android.gms.internal.play_billing.g3 g3Var, int i10, long j10) {
        try {
            com.google.android.gms.internal.play_billing.o3 o3Var = (com.google.android.gms.internal.play_billing.o3) ((com.google.android.gms.internal.play_billing.p3) this.f14687b).g();
            o3Var.c();
            com.google.android.gms.internal.play_billing.p3.p((com.google.android.gms.internal.play_billing.p3) o3Var.f3578b, i10);
            com.google.android.gms.internal.play_billing.p3 p3Var = (com.google.android.gms.internal.play_billing.p3) o3Var.a();
            this.f14687b = p3Var;
            if (j10 != 0) {
                com.google.android.gms.internal.play_billing.o3 o3Var2 = (com.google.android.gms.internal.play_billing.o3) p3Var.g();
                o3Var2.c();
                com.google.android.gms.internal.play_billing.p3.r((com.google.android.gms.internal.play_billing.p3) o3Var2.f3578b, j10);
                p3Var = (com.google.android.gms.internal.play_billing.p3) o3Var2.a();
            }
            k1(g3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean R(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public boolean R0(long j10) {
        return ((f01) this.f14688c).v;
    }

    @Override
    public void R1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        ze.d.s(s1Var.getContext(), str);
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public CharacterStyle S1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    public void T0(com.google.android.gms.internal.play_billing.g3 g3Var, long j10, boolean z4) {
        com.google.android.gms.internal.play_billing.p3 p3Var;
        try {
            com.google.android.gms.internal.play_billing.f3 f3Var = (com.google.android.gms.internal.play_billing.f3) g3Var.g();
            com.google.android.gms.internal.play_billing.t3 t3Var = (com.google.android.gms.internal.play_billing.t3) g3Var.o().g();
            t3Var.c();
            com.google.android.gms.internal.play_billing.v3.n((com.google.android.gms.internal.play_billing.v3) t3Var.f3578b, z4);
            f3Var.c();
            com.google.android.gms.internal.play_billing.g3.r((com.google.android.gms.internal.play_billing.g3) f3Var.f3578b, (com.google.android.gms.internal.play_billing.v3) t3Var.a());
            com.google.android.gms.internal.play_billing.g3 g3Var2 = (com.google.android.gms.internal.play_billing.g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (com.google.android.gms.internal.play_billing.p3) this.f14687b;
            } else {
                com.google.android.gms.internal.play_billing.o3 o3Var = (com.google.android.gms.internal.play_billing.o3) ((com.google.android.gms.internal.play_billing.p3) this.f14687b).g();
                o3Var.c();
                com.google.android.gms.internal.play_billing.p3.r((com.google.android.gms.internal.play_billing.p3) o3Var.f3578b, j10);
                p3Var = (com.google.android.gms.internal.play_billing.p3) o3Var.a();
            }
            k1(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean U1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    public void V0(com.google.android.gms.internal.play_billing.g3 g3Var, int i10, long j10, boolean z4) {
        com.google.android.gms.internal.play_billing.p3 p3Var;
        try {
            com.google.android.gms.internal.play_billing.o3 o3Var = (com.google.android.gms.internal.play_billing.o3) ((com.google.android.gms.internal.play_billing.p3) this.f14687b).g();
            o3Var.c();
            com.google.android.gms.internal.play_billing.p3.p((com.google.android.gms.internal.play_billing.p3) o3Var.f3578b, i10);
            this.f14687b = (com.google.android.gms.internal.play_billing.p3) o3Var.a();
            com.google.android.gms.internal.play_billing.f3 f3Var = (com.google.android.gms.internal.play_billing.f3) g3Var.g();
            com.google.android.gms.internal.play_billing.t3 t3Var = (com.google.android.gms.internal.play_billing.t3) g3Var.o().g();
            t3Var.c();
            com.google.android.gms.internal.play_billing.v3.n((com.google.android.gms.internal.play_billing.v3) t3Var.f3578b, z4);
            f3Var.c();
            com.google.android.gms.internal.play_billing.g3.r((com.google.android.gms.internal.play_billing.g3) f3Var.f3578b, (com.google.android.gms.internal.play_billing.v3) t3Var.a());
            com.google.android.gms.internal.play_billing.g3 g3Var2 = (com.google.android.gms.internal.play_billing.g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (com.google.android.gms.internal.play_billing.p3) this.f14687b;
            } else {
                com.google.android.gms.internal.play_billing.o3 o3Var2 = (com.google.android.gms.internal.play_billing.o3) ((com.google.android.gms.internal.play_billing.p3) this.f14687b).g();
                o3Var2.c();
                com.google.android.gms.internal.play_billing.p3.r((com.google.android.gms.internal.play_billing.p3) o3Var2.f3578b, j10);
                p3Var = (com.google.android.gms.internal.play_billing.p3) o3Var2.a();
            }
            k1(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public int W() {
        return 0;
    }

    public p2.d X() {
        if (((p2.n) this.f14687b) != null) {
            return new p2.d(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    public void X0(com.google.android.gms.internal.play_billing.l3 l3Var) {
        try {
            com.google.android.gms.internal.play_billing.w3 t6 = com.google.android.gms.internal.play_billing.x3.t();
            t6.d((com.google.android.gms.internal.play_billing.p3) this.f14687b);
            t6.c();
            com.google.android.gms.internal.play_billing.x3.p((com.google.android.gms.internal.play_billing.x3) t6.f3578b, l3Var);
            ((c2.u) this.f14688c).h((com.google.android.gms.internal.play_billing.x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Y0(com.google.android.gms.internal.play_billing.a4 a4Var) {
        try {
            com.google.android.gms.internal.play_billing.w3 t6 = com.google.android.gms.internal.play_billing.x3.t();
            t6.d((com.google.android.gms.internal.play_billing.p3) this.f14687b);
            t6.c();
            com.google.android.gms.internal.play_billing.x3.r((com.google.android.gms.internal.play_billing.x3) t6.f3578b, a4Var);
            ((c2.u) this.f14688c).h((com.google.android.gms.internal.play_billing.x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public ug.a Z() {
        return null;
    }

    @Override
    public boolean a() {
        switch (this.f14686a) {
            case 8:
            case 21:
            default:
                return org.telegram.ui.ActionBar.j6.I.q();
        }
    }

    @Override
    public boolean a0(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    public void a1(com.google.android.gms.internal.play_billing.b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.w3 t6 = com.google.android.gms.internal.play_billing.x3.t();
            t6.d((com.google.android.gms.internal.play_billing.p3) this.f14687b);
            t6.c();
            com.google.android.gms.internal.play_billing.x3.s((com.google.android.gms.internal.play_billing.x3) t6.f3578b, b4Var);
            ((c2.u) this.f14688c).h((com.google.android.gms.internal.play_billing.x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean a2(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void b() {
        int i10 = this.f14686a;
    }

    @Override
    public boolean mo17c(float f10, float f11, int i10, View view) {
        qy qyVar = (qy) this.f14688c;
        if (view instanceof org.telegram.ui.Cells.q2) {
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
            if (q2Var.f21604k2) {
                qyVar.N4(q2Var.getDialogId(), view);
                return true;
            }
        }
        pw pwVar = qyVar.f37633w0;
        if (pwVar != null && pwVar.getVisibility() == 0 && qyVar.f37633w0.f26106n) {
            return false;
        }
        return qyVar.o4(view, i10, f10, ((py) this.f14687b).d);
    }

    @Override
    public boolean c0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean c1(org.telegram.ui.Cells.s1 s1Var, boolean z4) {
        return false;
    }

    @Override
    public cv0 c2() {
        return null;
    }

    @Override
    public int d0(int i10) {
        switch (this.f14686a) {
            case 8:
                return x0(i10);
            case 21:
                return x0(i10);
            default:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f14688c;
                if (f6Var == null) {
                    return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
                }
                return f6Var.d0(i10);
        }
    }

    @Override
    public void dismiss() {
        ((iv) this.f14688c).dismiss();
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean e2(long j10) {
        return ((f01) this.f14688c).f24760s;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public int f1(int i10) {
        switch (this.f14686a) {
            case 8:
                return ((SparseIntArray) this.f14687b).get(i10);
            case 21:
                return x0(i10);
            default:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f14688c;
                if (f6Var == null) {
                    return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
                }
                return f6Var.f1(i10);
        }
    }

    @Override
    public String g(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public boolean g2(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f14686a) {
            case 8:
                return null;
            case 21:
                return null;
            default:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f14688c;
                if (f6Var == null) {
                    return org.telegram.ui.ActionBar.j6.O0(str);
                }
                return f6Var.getDrawable(str);
        }
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((qy) this.f14688c).finishPreviewFragment();
        }
    }

    @Override
    public boolean h1(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    public pb.b j0() {
        if (((pb.b) this.f14688c) == null) {
            pb.f fVar = (pb.f) this.f14687b;
            int[] iArr = fVar.f41135c;
            ob.d dVar = fVar.f41133a;
            int i10 = dVar.f16505a;
            int i11 = dVar.f16506b;
            pb.b bVar = new pb.b(i10, i11);
            if (fVar.f41134b.length < i10) {
                fVar.f41134b = new byte[i10];
            }
            for (int i12 = 0; i12 < 32; i12++) {
                iArr[i12] = 0;
            }
            for (int i13 = 1; i13 < 5; i13++) {
                byte[] b10 = dVar.b((i11 * i13) / 5, fVar.f41134b);
                int i14 = (i10 * 4) / 5;
                for (int i15 = i10 / 5; i15 < i14; i15++) {
                    int i16 = (b10[i15] & 255) >> 3;
                    iArr[i16] = iArr[i16] + 1;
                }
            }
            int length = iArr.length;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < length; i20++) {
                int i21 = iArr[i20];
                if (i21 > i17) {
                    i19 = i20;
                    i17 = i21;
                }
                if (i21 > i18) {
                    i18 = i21;
                }
            }
            int i22 = 0;
            int i23 = 0;
            for (int i24 = 0; i24 < length; i24++) {
                int i25 = i24 - i19;
                int i26 = iArr[i24] * i25 * i25;
                if (i26 > i23) {
                    i22 = i24;
                    i23 = i26;
                }
            }
            if (i19 <= i22) {
                int i27 = i19;
                i19 = i22;
                i22 = i27;
            }
            if (i19 - i22 > length / 16) {
                int i28 = i19 - 1;
                int i29 = i28;
                int i30 = -1;
                while (i28 > i22) {
                    int i31 = i28 - i22;
                    int i32 = (i18 - iArr[i28]) * (i19 - i28) * i31 * i31;
                    if (i32 > i30) {
                        i29 = i28;
                        i30 = i32;
                    }
                    i28--;
                }
                int i33 = i29 << 3;
                byte[] a2 = dVar.a();
                for (int i34 = 0; i34 < i11; i34++) {
                    int i35 = i34 * i10;
                    for (int i36 = 0; i36 < i10; i36++) {
                        if ((a2[i35 + i36] & 255) < i33) {
                            int i37 = (i36 / 32) + (bVar.f41121c * i34);
                            int[] iArr2 = bVar.d;
                            iArr2[i37] = iArr2[i37] | (1 << (i36 & 31));
                        }
                    }
                }
                this.f14688c = bVar;
            } else {
                throw ob.e.a();
            }
        }
        return (pb.b) this.f14688c;
    }

    @Override
    public pg.b k() {
        switch (this.f14686a) {
            case 19:
                if (Build.VERSION.SDK_INT >= 29) {
                    pg.c cVar = new pg.c(this);
                    ((PhotoViewer) this.f14688c).W.add(cVar);
                    return cVar;
                }
                return new pg.d(this);
            default:
                return new pg.d(this);
        }
    }

    @Override
    public int k0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    public void k1(com.google.android.gms.internal.play_billing.g3 g3Var, com.google.android.gms.internal.play_billing.p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.w3 t6 = com.google.android.gms.internal.play_billing.x3.t();
            t6.d(p3Var);
            t6.c();
            com.google.android.gms.internal.play_billing.x3.n((com.google.android.gms.internal.play_billing.x3) t6.f3578b, g3Var);
            ((c2.u) this.f14688c).h((com.google.android.gms.internal.play_billing.x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void l(float f10, float f11, int i10, int i11) {
        switch (this.f14686a) {
            case 8:
                org.telegram.ui.ActionBar.j6.q(f10, f11, i10, i11);
                return;
            case 21:
                org.telegram.ui.ActionBar.j6.q(f10, f11, i10, i11);
                return;
            default:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f14688c;
                if (f6Var == null) {
                    org.telegram.ui.ActionBar.j6.q(f10, f11, i10, i11);
                    return;
                } else {
                    f6Var.l(f10, f11, i10, i11);
                    return;
                }
        }
    }

    public void l1(com.google.android.gms.internal.play_billing.i3 i3Var, com.google.android.gms.internal.play_billing.p3 p3Var) {
        try {
            com.google.android.gms.internal.play_billing.w3 t6 = com.google.android.gms.internal.play_billing.x3.t();
            t6.d(p3Var);
            t6.c();
            com.google.android.gms.internal.play_billing.x3.o((com.google.android.gms.internal.play_billing.x3) t6.f3578b, i3Var);
            ((c2.u) this.f14688c).h((com.google.android.gms.internal.play_billing.x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean m0() {
        switch (this.f14686a) {
            case 8:
                return false;
            case 21:
                return false;
            default:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f14688c;
                if (f6Var == null) {
                    return org.telegram.ui.ActionBar.j6.a1();
                }
                return f6Var.m0();
        }
    }

    @Override
    public boolean m1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    public void n0(Exception exc, boolean z4) {
        int i10;
        this.f14688c = null;
        HashSet hashSet = (HashSet) this.f14687b;
        s8.v t6 = s8.v.t(hashSet);
        hashSet.clear();
        s8.t listIterator = t6.listIterator(0);
        while (listIterator.hasNext()) {
            o3.b bVar = (o3.b) listIterator.next();
            bVar.getClass();
            if (z4) {
                i10 = 1;
            } else {
                i10 = 3;
            }
            bVar.k(exc, i10);
        }
    }

    @Override
    public void onComplete(Task task) {
        o8.c cVar = (o8.c) this.f14687b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f14688c;
        synchronized (cVar.f16453f) {
            cVar.e.remove(taskCompletionSource);
        }
    }

    @Override
    public void onError(i71 i71Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f14688c;
        int i10 = secretMediaViewer.Y;
        if (i10 > 0) {
            secretMediaViewer.Y = i10 - 1;
            AndroidUtilities.runOnUIThread(new b11(9, this, (File) this.f14687b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z4, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f14688c;
        i41 i41Var = secretMediaViewer.f32213f1;
        if (secretMediaViewer.f32249y != null && secretMediaViewer.f32209e0 != null) {
            AndroidUtilities.cancelRunOnUIThread(i41Var);
            AndroidUtilities.runOnUIThread(i41Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f32201b.getWindow().addFlags(128);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                try {
                    secretMediaViewer.f32201b.getWindow().clearFlags(128);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
            if (i10 == 3 && secretMediaViewer.f32245w.getVisibility() != 0) {
                secretMediaViewer.f32245w.setVisibility(0);
            }
            if (secretMediaViewer.f32249y.y() && i10 != 4) {
                if (!secretMediaViewer.B) {
                    secretMediaViewer.B = true;
                }
            } else if (secretMediaViewer.B) {
                secretMediaViewer.B = false;
                if (i10 == 4) {
                    secretMediaViewer.E = true;
                    if (secretMediaViewer.F) {
                        secretMediaViewer.e(true, !secretMediaViewer.f32228n1);
                        return;
                    }
                    secretMediaViewer.f32249y.L(0L, false);
                    secretMediaViewer.f32249y.C();
                }
            }
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        float f11;
        org.telegram.ui.q4 q4Var = ((SecretMediaViewer) this.f14688c).f32245w;
        if (q4Var != null) {
            if (i12 != 90 && i12 != 270) {
                i11 = i10;
                i10 = i11;
            }
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = (i11 * f10) / i10;
            }
            q4Var.a(f11, i12);
        }
    }

    @Override
    public void p(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((qy) this.f14688c).movePreviewFragment(f10);
        }
    }

    @Override
    public boolean p0() {
        return false;
    }

    public void q0(boolean z4, boolean z10, float f10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f14687b;
        nh.w3 w3Var = (nh.w3) this.f14688c;
        nh.i9 i9Var = w3Var.e;
        nh.i9.f15426y1 = f10;
        nh.h9 h9Var = i9Var.f15476w0;
        if (h9Var != null) {
            h9Var.setSpeed(f10);
        }
        nh.d4.a0(w3Var.f16007l, z4);
        if (z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    @Override
    public void r(org.telegram.ui.w6 w6Var, mh.a aVar, boolean z4) {
        iv ivVar = (iv) this.f14688c;
        hv hvVar = ivVar.U;
        if (aVar != null) {
            ((mh.b) this.f14687b).i(aVar);
            ivVar.f35032b0.d();
            mh.b bVar = ivVar.f35034d0;
            ey0[] ey0VarArr = ivVar.Y;
            org.telegram.ui.Cells.y1[] y1VarArr = ivVar.Z;
            org.telegram.ui.Cells.y1 y1Var = y1VarArr[0];
            if (y1Var != null) {
                ey0 ey0Var = ey0VarArr[0];
                boolean z10 = bVar.f14171m;
                ey0Var.f24722c = z10;
                y1Var.c(z10, true);
            }
            org.telegram.ui.Cells.y1 y1Var2 = y1VarArr[1];
            if (y1Var2 != null) {
                ey0 ey0Var2 = ey0VarArr[1];
                boolean z11 = bVar.f14172n;
                ey0Var2.f24722c = z11;
                y1Var2.c(z11, true);
            }
            org.telegram.ui.Cells.y1 y1Var3 = y1VarArr[2];
            if (y1Var3 != null) {
                ey0 ey0Var3 = ey0VarArr[2];
                boolean z12 = bVar.f14173o;
                ey0Var3.f24722c = z12;
                y1Var3.c(z12, true);
            }
            org.telegram.ui.Cells.y1 y1Var4 = y1VarArr[3];
            if (y1Var4 != null) {
                ey0 ey0Var4 = ey0VarArr[3];
                boolean z13 = bVar.f14174p;
                ey0Var4.f24722c = z13;
                y1Var4.c(z13, true);
            }
            org.telegram.ui.Cells.y1 y1Var5 = y1VarArr[4];
            if (y1Var5 != null) {
                ey0 ey0Var5 = ey0VarArr[4];
                boolean z14 = bVar.f14175q;
                ey0Var5.f24722c = z14;
                y1Var5.c(z14, true);
            }
            ivVar.X.a(hvVar.d(), true);
            hvVar.c(true);
        }
    }

    public void r0(o0.g gVar) {
        androidx.biometric.o oVar = (androidx.biometric.o) this.f14688c;
        o5.i iVar = (o5.i) this.f14687b;
        int i10 = gVar.f16142b;
        if (i10 == 0) {
            oVar.execute(new androidx.biometric.j(iVar, gVar.f16141a, false, 26));
        } else {
            oVar.execute(new m2.b(iVar, i10));
        }
    }

    @Override
    public boolean r2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean t0(org.telegram.ui.Components.u5 u5Var) {
        return false;
    }

    public String toString() {
        switch (this.f14686a) {
            case 6:
                try {
                    return j0().toString();
                } catch (ob.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    @Override
    public String w(long j10) {
        String trim = ((EditTextBoldCursor) this.f14687b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((f01) this.f14688c).f24760s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    @Override
    public ColorFilter x() {
        switch (this.f14686a) {
            case 8:
                return org.telegram.ui.ActionBar.j6.f20197v3;
            case 21:
                return org.telegram.ui.ActionBar.j6.f20197v3;
            default:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f14688c;
                if (f6Var == null) {
                    return org.telegram.ui.ActionBar.j6.f20197v3;
                }
                return f6Var.x();
        }
    }

    @Override
    public int x0(int i10) {
        switch (this.f14686a) {
            case 8:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f14687b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
            case 21:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f14687b;
                if (sparseIntArray2 != null) {
                    return sparseIntArray2.get(i10);
                }
                return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
            default:
                SparseIntArray sparseIntArray3 = (SparseIntArray) this.f14687b;
                int indexOfKey2 = sparseIntArray3.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray3.valueAt(indexOfKey2);
                }
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f14688c;
                if (f6Var == null) {
                    return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
                }
                return f6Var.x0(i10);
        }
    }

    @Override
    public java.lang.Object z(od.c r6, wc.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: n7.qa.z(od.c, wc.c):java.lang.Object");
    }

    @Override
    public boolean z2(int i10) {
        return false;
    }

    public qa(int i10, Object obj, Object obj2) {
        this.f14686a = i10;
        this.f14688c = obj;
        this.f14687b = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f14688c;
        if (secretMediaViewer.Z) {
            return;
        }
        secretMediaViewer.Z = true;
        secretMediaViewer.e.invalidate();
    }

    public qa(Object obj, Object obj2, boolean z4, int i10) {
        this.f14686a = i10;
        this.f14687b = obj;
        this.f14688c = obj2;
    }

    public qa(Context context, com.google.android.gms.internal.play_billing.p3 p3Var) {
        this.f14686a = 25;
        c2.u uVar = new c2.u(5);
        try {
            y2.q.b(context);
            uVar.f2037c = y2.q.a().c(w2.a.e).a("PLAY_BILLING_LIBRARY", new v2.c("proto"), new ab.a(19));
        } catch (Throwable unused) {
            uVar.f2036b = true;
        }
        this.f14688c = uVar;
        this.f14687b = p3Var;
    }

    public qa(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f14686a = 23;
        this.f14687b = new SparseIntArray();
        this.f14688c = f6Var;
        K();
    }

    public qa(pb.f fVar) {
        this.f14686a = 6;
        this.f14687b = fVar;
    }

    public qa(View view) {
        this.f14686a = 14;
        t61 t61Var = new t61(this, view);
        this.f14687b = t61Var;
        view.addOnLayoutChangeListener(t61Var);
    }

    public qa(pf0 pf0Var) {
        this.f14686a = 12;
        this.f14688c = pf0Var;
        this.f14687b = new dc0(this, 9);
    }

    public qa(EditText editText) {
        this.f14686a = 27;
        this.f14687b = editText;
        q1.i iVar = new q1.i(editText);
        this.f14688c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f42709b == null) {
            synchronized (q1.a.f42708a) {
                try {
                    if (q1.a.f42709b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f42710c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f42709b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f42709b);
    }

    private final void Y() {
    }

    private final void h0() {
    }

    @Override
    public void B2() {
    }

    @Override
    public void C1() {
    }

    @Override
    public void E0() {
    }

    public void K() {
    }

    @Override
    public void V1() {
    }

    @Override
    public void b0() {
    }

    @Override
    public void clear() {
    }

    @Override
    public void g1() {
    }

    @Override
    public void j() {
    }

    @Override
    public void o() {
    }

    @Override
    public void p1() {
    }

    @Override
    public void s() {
    }

    @Override
    public void v2() {
    }

    @Override
    public void A(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void B(float f10) {
    }

    @Override
    public void B1(float f10) {
    }

    @Override
    public void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void F(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void H1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void K0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void L(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void O(MessageObject messageObject) {
    }

    @Override
    public void O1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void P0(long j10) {
    }

    @Override
    public void Q1(MessageObject messageObject) {
    }

    @Override
    public void S0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void U(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void W1(float f10) {
    }

    @Override
    public void Z0(boolean z4) {
    }

    @Override
    public void d(int i10) {
    }

    @Override
    public void d1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void e0(float f10) {
    }

    @Override
    public void e1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void f0(int i10) {
    }

    @Override
    public void i2(long j10) {
    }

    @Override
    public void j1(float f10) {
    }

    @Override
    public void j2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void l0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void n(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void o0(boolean z4) {
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
    public void q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void s0(String str) {
    }

    @Override
    public void s2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void t(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void u(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void v(float f10) {
    }

    @Override
    public void v1(float f10) {
    }

    @Override
    public void y(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void z0(float f10) {
    }

    public qa(PremiumPreviewFragment premiumPreviewFragment) {
        this.f14686a = 20;
        this.f14688c = premiumPreviewFragment;
        this.f14687b = new Paint();
    }

    private final void H0(int i10, int i11) {
    }

    private final void u0(int i10, int i11) {
    }

    @Override
    public void A1(float f10, int i10) {
    }

    @Override
    public void C(long j10, boolean z4) {
    }

    @Override
    public void E(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void I1(org.telegram.ui.Cells.s1 s1Var, boolean z4) {
    }

    @Override
    public void L1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void M(org.telegram.ui.Cells.s1 s1Var, jh.f fVar) {
    }

    @Override
    public void N(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void U0(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Y1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void b2(int i10, long j10) {
    }

    @Override
    public void i1(float f10, int i10) {
    }

    @Override
    public void l2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override
    public void r1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void u1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public void w0(float f10, int i10) {
    }

    public qa() {
        this.f14686a = 4;
        this.f14687b = new HashSet();
    }

    public qa(u21 u21Var) {
        this.f14686a = 21;
        this.f14688c = u21Var;
    }

    public qa(af.c cVar) {
        this.f14686a = 28;
        this.f14687b = cVar;
        this.f14688c = "";
    }

    public qa(PhotoViewer photoViewer) {
        this.f14686a = 19;
        this.f14688c = photoViewer;
        this.f14687b = new org.telegram.ui.Components.fa(photoViewer.Y, photoViewer.f31679b0, 0, false);
    }

    @Override
    public void C2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public void G0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public void b1(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override
    public void i0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public void v0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public void z1(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public void A0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11, boolean z4) {
    }

    @Override
    public void Z1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void y0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void f2(org.telegram.ui.Cells.s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void x2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override
    public void T(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
