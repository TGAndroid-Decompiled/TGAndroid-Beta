package n7;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.common.api.Status;
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
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.xt;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.d41;
import org.telegram.ui.fn0;
import org.telegram.ui.gl0;
import org.telegram.ui.gv;
import org.telegram.ui.hv;
import org.telegram.ui.nm0;
import org.telegram.ui.o21;
import org.telegram.ui.ow;
import org.telegram.ui.oy;
import org.telegram.ui.py;
import org.telegram.ui.tm0;
import org.telegram.ui.w01;
import org.telegram.ui.xu0;
public class qa implements OnCompleteListener, od.b, org.telegram.ui.ActionBar.g6, vt, qh.ga, org.telegram.ui.Cells.k1, org.telegram.ui.k7, ml0, tm0, tg.a, h71, p2.z, com.google.android.gms.common.api.internal.s {
    public final int f15698a;
    public Object f15699b;
    public Object f15700c;

    public qa(int i10) {
        this.f15698a = i10;
    }

    public static qa M0(View view) {
        return new qa(view);
    }

    @Override
    public boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override
    public int B0(int i10) {
        switch (this.f15698a) {
            case 8:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f15699b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return org.telegram.ui.ActionBar.k6.w0(null, i10, false);
            case 20:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f15699b;
                if (sparseIntArray2 != null) {
                    return sparseIntArray2.get(i10);
                }
                return org.telegram.ui.ActionBar.k6.w0(null, i10, false);
            default:
                SparseIntArray sparseIntArray3 = (SparseIntArray) this.f15699b;
                int indexOfKey2 = sparseIntArray3.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray3.valueAt(indexOfKey2);
                }
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f15700c;
                if (g6Var == null) {
                    return org.telegram.ui.ActionBar.k6.w0(null, i10, false);
                }
                return g6Var.B0(i10);
        }
    }

    @Override
    public void C(String str, String str2) {
        fn0 fn0Var = ((nm0) this.f15700c).f39483a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            fn0Var.O1(true, str2, (gl0) this.f15699b, this, fn0Var.f36975y1);
        } else {
            fn0Var.N1(true, false);
        }
    }

    @Override
    public boolean E2(int i10) {
        return false;
    }

    @Override
    public Paint F(String str) {
        switch (this.f15698a) {
            case 8:
                return org.telegram.ui.ActionBar.k6.S0(str);
            case 20:
                return org.telegram.ui.ActionBar.k6.S0(str);
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f15700c;
                if (g6Var == null) {
                    return org.telegram.ui.ActionBar.k6.S0(str);
                }
                return g6Var.F(str);
        }
    }

    @Override
    public boolean H1() {
        return false;
    }

    @Override
    public void I(Canvas canvas, float f10, float f11, float f12, float f13) {
        switch (this.f15698a) {
            case 18:
                canvas.save();
                canvas.clipRect(f10, f11, f12, f13);
                ((PhotoViewer) this.f15700c).T0(canvas, (org.telegram.ui.Components.fa) this.f15699b, -14277082, 855638016, false, true, true);
                canvas.drawColor(637534208);
                canvas.restore();
                return;
            default:
                Paint paint = (Paint) this.f15699b;
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f15700c;
                fg.p1 p1Var = premiumPreviewFragment.f34494j0;
                if (premiumPreviewFragment.f34488e0) {
                    paint.setColor(premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.k6.f21605a7));
                    canvas.drawRect(f10, f11, f12, f13, paint);
                    return;
                }
                p1Var.d(0, (-premiumPreviewFragment.f34481a0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.Y, 0, premiumPreviewFragment.f34481a0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f34481a0.getMeasuredHeight());
                canvas.drawRect(f10, f11, f12, f13, p1Var.f6490f);
                return;
        }
    }

    @Override
    public org.telegram.ui.Cells.n9 I2() {
        return null;
    }

    @Override
    public void J0(int i10, int i11) {
        switch (this.f15698a) {
            case 8:
            case 20:
                return;
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f15700c;
                if (g6Var != null) {
                    g6Var.J0(i10, i11);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean N(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public boolean N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean O() {
        return false;
    }

    public p2.d O0() {
        if (((p2.m) this.f15699b) != null) {
            return new p2.d(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    @Override
    public boolean P(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public boolean P1() {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R0(long j10) {
        return ((g01) this.f15700c).v;
    }

    public pb.b T0() {
        if (((pb.b) this.f15700c) == null) {
            pb.f fVar = (pb.f) this.f15699b;
            int[] iArr = fVar.f44273c;
            ob.d dVar = fVar.f44271a;
            int i10 = dVar.f16688a;
            int i11 = dVar.f16689b;
            pb.b bVar = new pb.b(i10, i11);
            if (fVar.f44272b.length < i10) {
                fVar.f44272b = new byte[i10];
            }
            for (int i12 = 0; i12 < 32; i12++) {
                iArr[i12] = 0;
            }
            for (int i13 = 1; i13 < 5; i13++) {
                byte[] b10 = dVar.b((i11 * i13) / 5, fVar.f44272b);
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
                            int i37 = (i36 / 32) + (bVar.f44257c * i34);
                            int[] iArr2 = bVar.d;
                            iArr2[i37] = iArr2[i37] | (1 << (i36 & 31));
                        }
                    }
                }
                this.f15700c = bVar;
            } else {
                throw ob.e.a();
            }
        }
        return (pb.b) this.f15700c;
    }

    @Override
    public void U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        af.g.s(t1Var.getContext(), str);
    }

    @Override
    public int V() {
        return 0;
    }

    public void V0(Exception exc, boolean z4) {
        int i10;
        this.f15700c = null;
        HashSet hashSet = (HashSet) this.f15699b;
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
    public CharacterStyle W1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    public void X0(boolean z4, boolean z10, float f10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f15699b;
        oh.y3 y3Var = (oh.y3) this.f15700c;
        oh.i9 i9Var = y3Var.f17944e;
        oh.i9.f17250y1 = f10;
        oh.h9 h9Var = i9Var.f17301w0;
        if (h9Var != null) {
            h9Var.setSpeed(f10);
        }
        oh.f4.a0(y3Var.f17950l, z4);
        if (z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    @Override
    public void Y(org.telegram.ui.u6 u6Var, nh.a aVar, boolean z4) {
        hv hvVar = (hv) this.f15700c;
        gv gvVar = hvVar.U;
        if (aVar != null) {
            ((nh.b) this.f15699b).i(aVar);
            hvVar.f37637b0.d();
            nh.b bVar = hvVar.f37639d0;
            fy0[] fy0VarArr = hvVar.Y;
            org.telegram.ui.Cells.z1[] z1VarArr = hvVar.Z;
            org.telegram.ui.Cells.z1 z1Var = z1VarArr[0];
            if (z1Var != null) {
                fy0 fy0Var = fy0VarArr[0];
                boolean z10 = bVar.f16259m;
                fy0Var.f27038c = z10;
                z1Var.c(z10, true);
            }
            org.telegram.ui.Cells.z1 z1Var2 = z1VarArr[1];
            if (z1Var2 != null) {
                fy0 fy0Var2 = fy0VarArr[1];
                boolean z11 = bVar.f16260n;
                fy0Var2.f27038c = z11;
                z1Var2.c(z11, true);
            }
            org.telegram.ui.Cells.z1 z1Var3 = z1VarArr[2];
            if (z1Var3 != null) {
                fy0 fy0Var3 = fy0VarArr[2];
                boolean z12 = bVar.f16261o;
                fy0Var3.f27038c = z12;
                z1Var3.c(z12, true);
            }
            org.telegram.ui.Cells.z1 z1Var4 = z1VarArr[3];
            if (z1Var4 != null) {
                fy0 fy0Var4 = fy0VarArr[3];
                boolean z13 = bVar.f16262p;
                fy0Var4.f27038c = z13;
                z1Var4.c(z13, true);
            }
            org.telegram.ui.Cells.z1 z1Var5 = z1VarArr[4];
            if (z1Var5 != null) {
                fy0 fy0Var5 = fy0VarArr[4];
                boolean z14 = bVar.f16263q;
                fy0Var5.f27038c = z14;
                z1Var5.c(z14, true);
            }
            hvVar.X.a(gvVar.d(), true);
            gvVar.c(true);
        }
    }

    public void Y0(o0.g gVar) {
        androidx.biometric.p pVar = (androidx.biometric.p) this.f15700c;
        y5.h hVar = (y5.h) this.f15699b;
        int i10 = gVar.f16297b;
        if (i10 == 0) {
            pVar.execute(new androidx.biometric.k(hVar, gVar.f16296a, false, 26));
        } else {
            pVar.execute(new m2.b(hVar, i10));
        }
    }

    @Override
    public boolean Y1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public vg.a Z() {
        return null;
    }

    @Override
    public int Z0(int i10) {
        switch (this.f15698a) {
            case 8:
                return ((SparseIntArray) this.f15699b).get(i10);
            case 20:
                return B0(i10);
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f15700c;
                if (g6Var == null) {
                    return org.telegram.ui.ActionBar.k6.w0(null, i10, false);
                }
                return g6Var.Z0(i10);
        }
    }

    @Override
    public boolean a() {
        switch (this.f15698a) {
            case 8:
            case 20:
            default:
                return org.telegram.ui.ActionBar.k6.I.q();
        }
    }

    @Override
    public boolean a0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z4;
        q5.e0 e0Var = (q5.e0) this.f15699b;
        String str = (String) this.f15700c;
        u5.x xVar = (u5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (e0Var.F == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        b6.m.j("Not connected to device", z4);
        u5.f fVar = (u5.f) xVar.u();
        Parcel M0 = fVar.M0();
        M0.writeString(str);
        fVar.R0(M0, 5);
        synchronized (e0Var.f44548s) {
            try {
                if (e0Var.f44545p != null) {
                    taskCompletionSource.setException(b6.m.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.f44545p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void b() {
        int i10 = this.f15698a;
    }

    @Override
    public void b0() {
        ((xt) this.f15699b).getText();
        ((org.telegram.ui.Cells.f3) this.f15700c).b();
    }

    @Override
    public boolean b1(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
        return false;
    }

    @Override
    public boolean mo17c(float f10, float f11, int i10, View view) {
        py pyVar = (py) this.f15700c;
        if (view instanceof org.telegram.ui.Cells.r2) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            if (r2Var.f23462k2) {
                pyVar.N4(r2Var.getDialogId(), view);
                return true;
            }
        }
        ow owVar = pyVar.f40292w0;
        if (owVar != null && owVar.getVisibility() == 0 && pyVar.f40292w0.f28503n) {
            return false;
        }
        return pyVar.o4(view, i10, f10, ((oy) this.f15699b).d);
    }

    @Override
    public boolean c0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public void d0(float f10, boolean z4) {
        ec0 ec0Var = (ec0) this.f15699b;
        qf0 qf0Var = (qf0) this.f15700c;
        k71 k71Var = qf0Var.d;
        if (k71Var != null) {
            long p10 = k71Var.p();
            float max = 2.8f / ((float) Math.max(60L, p10));
            long j10 = (((f10 / (1.0f - max)) * max) + f10) * ((float) p10);
            qf0Var.f30387e = j10;
            qf0Var.d.L(j10, !z4);
            if (!z4) {
                AndroidUtilities.cancelRunOnUIThread(ec0Var);
                AndroidUtilities.runOnUIThread(ec0Var, 120L);
            }
        }
    }

    @Override
    public void dismiss() {
        ((hv) this.f15700c).dismiss();
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public int e0(int i10) {
        switch (this.f15698a) {
            case 8:
                return B0(i10);
            case 20:
                return B0(i10);
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f15700c;
                if (g6Var == null) {
                    return org.telegram.ui.ActionBar.k6.w0(null, i10, false);
                }
                return g6Var.e0(i10);
        }
    }

    @Override
    public boolean e2(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public String g(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public boolean g1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public xu0 g2() {
        return null;
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f15698a) {
            case 8:
                return null;
            case 20:
                return null;
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f15700c;
                if (g6Var == null) {
                    return org.telegram.ui.ActionBar.k6.O0(str);
                }
                return g6Var.getDrawable(str);
        }
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((py) this.f15700c).finishPreviewFragment();
        }
    }

    public void i1(p2.m mVar) {
        this.f15699b = mVar;
        if (mVar.a() != null) {
            mVar.a().getClass();
            String str = mVar.a().d;
            if (str != null) {
                this.f15700c = str;
            }
        }
    }

    public r3.v j1(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f15699b;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return ((o4.k0[]) this.f15700c)[i11];
                }
                i11++;
            } else {
                h5.a.o("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new r3.j();
            }
        }
    }

    @Override
    public boolean j2(long j10) {
        return ((g01) this.f15700c).f27064s;
    }

    @Override
    public qg.b k() {
        switch (this.f15698a) {
            case 18:
                if (Build.VERSION.SDK_INT >= 29) {
                    qg.c cVar = new qg.c(this);
                    ((PhotoViewer) this.f15700c).W.add(cVar);
                    return cVar;
                }
                return new qg.d(this);
            default:
                return new qg.d(this);
        }
    }

    @Override
    public int k0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    public void k1(com.google.android.gms.internal.play_billing.g3 g3Var) {
        try {
            u1(g3Var, (com.google.android.gms.internal.play_billing.p3) this.f15699b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void l(float f10, float f11, int i10, int i11) {
        switch (this.f15698a) {
            case 8:
                org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
                return;
            case 20:
                org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
                return;
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f15700c;
                if (g6Var == null) {
                    org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
                    return;
                } else {
                    g6Var.l(f10, f11, i10, i11);
                    return;
                }
        }
    }

    public void l1(com.google.android.gms.internal.play_billing.g3 g3Var, int i10, long j10) {
        try {
            com.google.android.gms.internal.play_billing.o3 o3Var = (com.google.android.gms.internal.play_billing.o3) ((com.google.android.gms.internal.play_billing.p3) this.f15699b).g();
            o3Var.c();
            com.google.android.gms.internal.play_billing.p3.p((com.google.android.gms.internal.play_billing.p3) o3Var.f3602b, i10);
            com.google.android.gms.internal.play_billing.p3 p3Var = (com.google.android.gms.internal.play_billing.p3) o3Var.a();
            this.f15699b = p3Var;
            if (j10 != 0) {
                com.google.android.gms.internal.play_billing.o3 o3Var2 = (com.google.android.gms.internal.play_billing.o3) p3Var.g();
                o3Var2.c();
                com.google.android.gms.internal.play_billing.p3.r((com.google.android.gms.internal.play_billing.p3) o3Var2.f3602b, j10);
                p3Var = (com.google.android.gms.internal.play_billing.p3) o3Var2.a();
            }
            u1(g3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean l2(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean m1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public boolean n0() {
        return false;
    }

    public void n1(com.google.android.gms.internal.play_billing.g3 g3Var, long j10, boolean z4) {
        com.google.android.gms.internal.play_billing.p3 p3Var;
        try {
            com.google.android.gms.internal.play_billing.f3 f3Var = (com.google.android.gms.internal.play_billing.f3) g3Var.g();
            com.google.android.gms.internal.play_billing.t3 t3Var = (com.google.android.gms.internal.play_billing.t3) g3Var.o().g();
            t3Var.c();
            com.google.android.gms.internal.play_billing.v3.n((com.google.android.gms.internal.play_billing.v3) t3Var.f3602b, z4);
            f3Var.c();
            com.google.android.gms.internal.play_billing.g3.r((com.google.android.gms.internal.play_billing.g3) f3Var.f3602b, (com.google.android.gms.internal.play_billing.v3) t3Var.a());
            com.google.android.gms.internal.play_billing.g3 g3Var2 = (com.google.android.gms.internal.play_billing.g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (com.google.android.gms.internal.play_billing.p3) this.f15699b;
            } else {
                com.google.android.gms.internal.play_billing.o3 o3Var = (com.google.android.gms.internal.play_billing.o3) ((com.google.android.gms.internal.play_billing.p3) this.f15699b).g();
                o3Var.c();
                com.google.android.gms.internal.play_billing.p3.r((com.google.android.gms.internal.play_billing.p3) o3Var.f3602b, j10);
                p3Var = (com.google.android.gms.internal.play_billing.p3) o3Var.a();
            }
            u1(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean o0() {
        switch (this.f15698a) {
            case 8:
                return false;
            case 20:
                return false;
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f15700c;
                if (g6Var == null) {
                    return org.telegram.ui.ActionBar.k6.a1();
                }
                return g6Var.o0();
        }
    }

    public void o1(com.google.android.gms.internal.play_billing.g3 g3Var, int i10, long j10, boolean z4) {
        com.google.android.gms.internal.play_billing.p3 p3Var;
        try {
            com.google.android.gms.internal.play_billing.o3 o3Var = (com.google.android.gms.internal.play_billing.o3) ((com.google.android.gms.internal.play_billing.p3) this.f15699b).g();
            o3Var.c();
            com.google.android.gms.internal.play_billing.p3.p((com.google.android.gms.internal.play_billing.p3) o3Var.f3602b, i10);
            this.f15699b = (com.google.android.gms.internal.play_billing.p3) o3Var.a();
            com.google.android.gms.internal.play_billing.f3 f3Var = (com.google.android.gms.internal.play_billing.f3) g3Var.g();
            com.google.android.gms.internal.play_billing.t3 t3Var = (com.google.android.gms.internal.play_billing.t3) g3Var.o().g();
            t3Var.c();
            com.google.android.gms.internal.play_billing.v3.n((com.google.android.gms.internal.play_billing.v3) t3Var.f3602b, z4);
            f3Var.c();
            com.google.android.gms.internal.play_billing.g3.r((com.google.android.gms.internal.play_billing.g3) f3Var.f3602b, (com.google.android.gms.internal.play_billing.v3) t3Var.a());
            com.google.android.gms.internal.play_billing.g3 g3Var2 = (com.google.android.gms.internal.play_billing.g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (com.google.android.gms.internal.play_billing.p3) this.f15699b;
            } else {
                com.google.android.gms.internal.play_billing.o3 o3Var2 = (com.google.android.gms.internal.play_billing.o3) ((com.google.android.gms.internal.play_billing.p3) this.f15699b).g();
                o3Var2.c();
                com.google.android.gms.internal.play_billing.p3.r((com.google.android.gms.internal.play_billing.p3) o3Var2.f3602b, j10);
                p3Var = (com.google.android.gms.internal.play_billing.p3) o3Var2.a();
            }
            u1(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void onComplete(Task task) {
        o8.c cVar = (o8.c) this.f15699b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f15700c;
        synchronized (cVar.f16630f) {
            cVar.f16629e.remove(taskCompletionSource);
        }
    }

    @Override
    public void onError(k71 k71Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f15700c;
        int i10 = secretMediaViewer.Y;
        if (i10 > 0) {
            secretMediaViewer.Y = i10 - 1;
            AndroidUtilities.runOnUIThread(new w01(9, this, (File) this.f15699b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z4, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f15700c;
        d41 d41Var = secretMediaViewer.f34775f1;
        if (secretMediaViewer.f34811y != null && secretMediaViewer.f34771e0 != null) {
            AndroidUtilities.cancelRunOnUIThread(d41Var);
            AndroidUtilities.runOnUIThread(d41Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f34762b.getWindow().addFlags(128);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            } else {
                try {
                    secretMediaViewer.f34762b.getWindow().clearFlags(128);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            if (i10 == 3 && secretMediaViewer.f34807w.getVisibility() != 0) {
                secretMediaViewer.f34807w.setVisibility(0);
            }
            if (secretMediaViewer.f34811y.y() && i10 != 4) {
                if (!secretMediaViewer.B) {
                    secretMediaViewer.B = true;
                }
            } else if (secretMediaViewer.B) {
                secretMediaViewer.B = false;
                if (i10 == 4) {
                    secretMediaViewer.E = true;
                    if (secretMediaViewer.F) {
                        secretMediaViewer.e(true, !secretMediaViewer.f34790n1);
                        return;
                    }
                    secretMediaViewer.f34811y.L(0L, false);
                    secretMediaViewer.f34811y.C();
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
        org.telegram.ui.o4 o4Var = ((SecretMediaViewer) this.f15700c).f34807w;
        if (o4Var != null) {
            if (i12 != 90 && i12 != 270) {
                i11 = i10;
                i10 = i11;
            }
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = (i11 * f10) / i10;
            }
            o4Var.a(f11, i12);
        }
    }

    @Override
    public void p(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((py) this.f15700c).movePreviewFragment(f10);
        }
    }

    @Override
    public boolean q0(org.telegram.ui.Components.u5 u5Var) {
        return false;
    }

    public void q1(com.google.android.gms.internal.play_billing.l3 l3Var) {
        try {
            com.google.android.gms.internal.play_billing.w3 t6 = com.google.android.gms.internal.play_billing.x3.t();
            t6.d((com.google.android.gms.internal.play_billing.p3) this.f15699b);
            t6.c();
            com.google.android.gms.internal.play_billing.x3.p((com.google.android.gms.internal.play_billing.x3) t6.f3602b, l3Var);
            ((c2.u) this.f15700c).h((com.google.android.gms.internal.play_billing.x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void r1(com.google.android.gms.internal.play_billing.a4 a4Var) {
        try {
            com.google.android.gms.internal.play_billing.w3 t6 = com.google.android.gms.internal.play_billing.x3.t();
            t6.d((com.google.android.gms.internal.play_billing.p3) this.f15699b);
            t6.c();
            com.google.android.gms.internal.play_billing.x3.r((com.google.android.gms.internal.play_billing.x3) t6.f3602b, a4Var);
            ((c2.u) this.f15700c).h((com.google.android.gms.internal.play_billing.x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void t1(com.google.android.gms.internal.play_billing.b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.w3 t6 = com.google.android.gms.internal.play_billing.x3.t();
            t6.d((com.google.android.gms.internal.play_billing.p3) this.f15699b);
            t6.c();
            com.google.android.gms.internal.play_billing.x3.s((com.google.android.gms.internal.play_billing.x3) t6.f3602b, b4Var);
            ((c2.u) this.f15700c).h((com.google.android.gms.internal.play_billing.x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public String toString() {
        switch (this.f15698a) {
            case 5:
                try {
                    return T0().toString();
                } catch (ob.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public void u1(com.google.android.gms.internal.play_billing.g3 g3Var, com.google.android.gms.internal.play_billing.p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.w3 t6 = com.google.android.gms.internal.play_billing.x3.t();
            t6.d(p3Var);
            t6.c();
            com.google.android.gms.internal.play_billing.x3.n((com.google.android.gms.internal.play_billing.x3) t6.f3602b, g3Var);
            ((c2.u) this.f15700c).h((com.google.android.gms.internal.play_billing.x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public String v(long j10) {
        String trim = ((EditTextBoldCursor) this.f15699b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((g01) this.f15700c).f27064s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    @Override
    public boolean v2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public ColorFilter w() {
        switch (this.f15698a) {
            case 8:
                return org.telegram.ui.ActionBar.k6.f21976v3;
            case 20:
                return org.telegram.ui.ActionBar.k6.f21976v3;
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f15700c;
                if (g6Var == null) {
                    return org.telegram.ui.ActionBar.k6.f21976v3;
                }
                return g6Var.w();
        }
    }

    public void w1(com.google.android.gms.internal.play_billing.i3 i3Var, com.google.android.gms.internal.play_billing.p3 p3Var) {
        try {
            com.google.android.gms.internal.play_billing.w3 t6 = com.google.android.gms.internal.play_billing.x3.t();
            t6.d(p3Var);
            t6.c();
            com.google.android.gms.internal.play_billing.x3.o((com.google.android.gms.internal.play_billing.x3) t6.f3602b, i3Var);
            ((c2.u) this.f15700c).h((com.google.android.gms.internal.play_billing.x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public java.lang.Object x(od.c r6, wc.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: n7.qa.x(od.c, wc.c):java.lang.Object");
    }

    public qa(int i10, Object obj, Object obj2) {
        this.f15698a = i10;
        this.f15699b = obj;
        this.f15700c = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f15700c;
        if (secretMediaViewer.Z) {
            return;
        }
        secretMediaViewer.Z = true;
        secretMediaViewer.f34770e.invalidate();
    }

    public qa(Object obj, Object obj2, boolean z4, int i10) {
        this.f15698a = i10;
        this.f15700c = obj;
        this.f15699b = obj2;
    }

    public qa(Context context, com.google.android.gms.internal.play_billing.p3 p3Var) {
        this.f15698a = 24;
        c2.u uVar = new c2.u(5);
        try {
            y2.q.b(context);
            uVar.f2180c = y2.q.a().c(w2.a.f49325e).a("PLAY_BILLING_LIBRARY", new v2.c("proto"), new db.a(18));
        } catch (Throwable unused) {
            uVar.f2179b = true;
        }
        this.f15700c = uVar;
        this.f15699b = p3Var;
    }

    public qa(org.telegram.ui.ActionBar.g6 g6Var) {
        this.f15698a = 22;
        this.f15699b = new SparseIntArray();
        this.f15700c = g6Var;
        L0();
    }

    public qa(pb.f fVar) {
        this.f15698a = 5;
        this.f15699b = fVar;
    }

    public qa(View view) {
        this.f15698a = 14;
        v61 v61Var = new v61(this, view);
        this.f15699b = v61Var;
        view.addOnLayoutChangeListener(v61Var);
    }

    public qa(qf0 qf0Var) {
        this.f15698a = 12;
        this.f15700c = qf0Var;
        this.f15699b = new ec0(this, 9);
    }

    public qa(EditText editText) {
        this.f15698a = 26;
        this.f15699b = editText;
        q1.i iVar = new q1.i(editText);
        this.f15700c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f44420b == null) {
            synchronized (q1.a.f44419a) {
                try {
                    if (q1.a.f44420b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f44421c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f44420b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f44420b);
    }

    private final void P0() {
    }

    private final void Q0() {
    }

    @Override
    public void D0() {
    }

    @Override
    public void G() {
    }

    @Override
    public void G2() {
    }

    public void L0() {
    }

    @Override
    public void a2() {
    }

    @Override
    public void clear() {
    }

    @Override
    public void f1() {
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
    public void r() {
    }

    @Override
    public void w0() {
    }

    @Override
    public void z2() {
    }

    @Override
    public void A(float f10) {
    }

    @Override
    public void C0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void E(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void H0(long j10) {
    }

    @Override
    public void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void J(float f10) {
    }

    @Override
    public void J1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void K(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void K0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void M(MessageObject messageObject) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void R1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void S0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void T(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void T1(MessageObject messageObject) {
    }

    @Override
    public void U(boolean z4) {
    }

    @Override
    public void X(float f10) {
    }

    @Override
    public void c1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void d1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void f(int i10) {
    }

    @Override
    public void f0(int i10) {
    }

    @Override
    public void h0(long j10) {
    }

    @Override
    public void j0(boolean z4) {
    }

    @Override
    public void l0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void n(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void o2(org.telegram.ui.Cells.t1 t1Var) {
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
    public void p0(String str) {
    }

    @Override
    public void q(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void r0(float f10) {
    }

    @Override
    public void s(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void t(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void t0(float f10) {
    }

    @Override
    public void u(float f10) {
    }

    @Override
    public void v0(float f10) {
    }

    @Override
    public void w2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void y(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void y0(float f10) {
    }

    @Override
    public void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    public qa(PremiumPreviewFragment premiumPreviewFragment) {
        this.f15698a = 19;
        this.f15700c = premiumPreviewFragment;
        this.f15699b = new Paint();
    }

    private final void e1(int i10, int i11) {
    }

    private final void h1(int i10, int i11) {
    }

    @Override
    public void B(long j10, boolean z4) {
    }

    @Override
    public void D(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void E0(int i10, long j10) {
    }

    @Override
    public void L(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void L1(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
    }

    @Override
    public void O1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void Q(org.telegram.ui.Cells.t1 t1Var, kh.f fVar) {
    }

    @Override
    public void U0(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void W(float f10, int i10) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void c2(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void m0(float f10, int i10) {
    }

    @Override
    public void q2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override
    public void s1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void u0(float f10, int i10) {
    }

    @Override
    public void v1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    public qa() {
        this.f15698a = 3;
        this.f15699b = new HashSet();
    }

    public qa(o21 o21Var) {
        this.f15698a = 20;
        this.f15700c = o21Var;
    }

    public qa(bf.b bVar) {
        this.f15698a = 27;
        this.f15699b = bVar;
        this.f15700c = "";
    }

    public qa(PhotoViewer photoViewer) {
        this.f15698a = 18;
        this.f15700c = photoViewer;
        this.f15699b = new org.telegram.ui.Components.fa(photoViewer.Y, photoViewer.f34230b0, 0, false);
    }

    @Override
    public void B1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public void G0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public void H2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override
    public void a1(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override
    public void i0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public void d2(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void x0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void z0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z4) {
    }

    @Override
    public void B2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override
    public void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void k2(org.telegram.ui.Cells.t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void X1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
