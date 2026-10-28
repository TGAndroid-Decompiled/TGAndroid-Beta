package jg;

import a8.ic;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import bi.u7;
import fi.ua;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import li.d6;
import li.h5;
import li.j3;
import li.j4;
import li.o3;
import li.p3;
import li.s3;
import li.t3;
import li.u3;
import li.u4;
import li.v3;
import m.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.zu0;
public final class s0 implements ig.z1, y2.m, li.i0, t3, l.i, l2.h, k1.f, o5.b, oe.d, j81, e5, eb0, q81, r0.n, zu0, r4.c {
    public final int f15826a;
    public final Object f15827b;

    public s0(Object obj, int i10) {
        this.f15826a = i10;
        this.f15827b = obj;
    }

    public static s0 e0(float f7, int i10) {
        boolean z10;
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f7);
        int i12 = (int) (point.y * f7);
        if (i11 == i12) {
            return new s0(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new s0(i11, i12, new int[]{i12, i11});
        }
        boolean z11 = true;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 >= i12) {
            z11 = false;
        }
        if (z10 == z11) {
            return new s0(i11, i12, new int[0]);
        }
        return new s0(i12, i11, new int[0]);
    }

    @Override
    public void B(s3 s3Var, View view) {
        li.b2 b2Var = (li.b2) this.f15827b;
        l80 H = l80.H(b2Var, view);
        H.Q = true;
        b2Var.f17149x0 = j4.c(H, b2Var, b2Var.getParentActivity(), b2Var.getResourceProvider(), s3Var, false);
    }

    @Override
    public s9 C() {
        switch (this.f15826a) {
            case 5:
                p3 p3Var = ((li.y) this.f15827b).O;
                if (p3Var != null) {
                    return p3Var.f17408a.getTextSelectionHelper();
                }
                return null;
            default:
                o3 o3Var = ((u4) this.f15827b).N;
                if (o3Var != null) {
                    return o3Var.f17390a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override
    public Paint.FontMetricsInt D() {
        return ((ti) this.f15827b).H0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        ((oe.j) this.f15827b).h(f7);
    }

    @Override
    public boolean F(l.k kVar, MenuItem menuItem) {
        m.k kVar2 = ((ActionMenuView) this.f15827b).P;
        if (kVar2 != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((h5) kVar2).f17284a).W.f16406c).iterator();
            while (it.hasNext()) {
                if (((androidx.fragment.app.a0) it.next()).f2604a.p()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.f15827b).Q0(i10, z10, 0, true, 0L);
    }

    @Override
    public void H() {
        li.b2 b2Var = (li.b2) this.f15827b;
        int i10 = 0;
        li.b2.a0(b2Var, false, true);
        int i11 = b2Var.I0;
        if (i11 != 2) {
            i10 = i11;
        }
        b2Var.y0(i10, true);
    }

    @Override
    public void I(CharSequence charSequence) {
        switch (this.f15826a) {
            case 5:
                p3 p3Var = ((li.y) this.f15827b).O;
                if (p3Var != null) {
                    p3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        p3Var.f17408a.z4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                o3 o3Var = ((u4) this.f15827b).N;
                if (o3Var != null) {
                    o3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        o3Var.f17390a.z4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public r9 K() {
        switch (this.f15826a) {
            case 5:
                return (li.y) this.f15827b;
            default:
                return (u4) this.f15827b;
        }
    }

    @Override
    public li.a L() {
        switch (this.f15826a) {
            case 5:
                return ((li.y) this.f15827b).f17652a;
            default:
                return ((u4) this.f15827b).f17652a;
        }
    }

    @Override
    public boolean M() {
        switch (this.f15826a) {
            case 5:
                li.y yVar = (li.y) this.f15827b;
                p3 p3Var = yVar.O;
                if (p3Var != null) {
                    li.a aVar = yVar.f17652a;
                    if (p3Var.f17408a.Y4()) {
                        return true;
                    }
                }
                return false;
            default:
                u4 u4Var = (u4) this.f15827b;
                o3 o3Var = u4Var.N;
                if (o3Var != null) {
                    li.a aVar2 = u4Var.f17652a;
                    if (o3Var.f17390a.Y4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public boolean N() {
        return true;
    }

    @Override
    public void O(int i10, int i11) {
        switch (this.f15826a) {
            case 5:
                li.y yVar = (li.y) this.f15827b;
                p3 p3Var = yVar.O;
                if (p3Var != null) {
                    li.a aVar = yVar.f17652a;
                    li.f2 f2Var = p3Var.f17408a.R3;
                    if (f2Var != null) {
                        f2Var.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                u4 u4Var = (u4) this.f15827b;
                o3 o3Var = u4Var.N;
                if (o3Var != null) {
                    li.a aVar2 = u4Var.f17652a;
                    li.f2 f2Var2 = o3Var.f17390a.R3;
                    if (f2Var2 != null) {
                        f2Var2.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public l80 P(View view) {
        return l80.H((li.b2) this.f15827b, view);
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        in0 in0Var = (in0) this.f15827b;
        in0Var.v.setPadding(defaultWindowInsets.f13449a, defaultWindowInsets.f13450b, defaultWindowInsets.f13451c, defaultWindowInsets.d);
        in0Var.f29395s.requestLayout();
        return r0.k1.f47152b;
    }

    @Override
    public void Q() {
        li.b2 b2Var = (li.b2) this.f15827b;
        b2Var.A0();
        b2Var.D0();
    }

    @Override
    public long R() {
        return 0L;
    }

    @Override
    public void S() {
        switch (this.f15826a) {
            case 5:
                li.y yVar = (li.y) this.f15827b;
                p3 p3Var = yVar.O;
                if (p3Var != null) {
                    li.a aVar = yVar.f17652a;
                    v3 v3Var = p3Var.f17408a;
                    li.f2 f2Var = v3Var.R3;
                    if (f2Var != null) {
                        f2Var.g();
                    }
                    v3Var.f17556p3.onContentChanged();
                    return;
                }
                return;
            default:
                u4 u4Var = (u4) this.f15827b;
                o3 o3Var = u4Var.N;
                if (o3Var != null) {
                    li.a aVar2 = u4Var.f17652a;
                    v3 v3Var2 = o3Var.f17390a;
                    li.f2 f2Var2 = v3Var2.R3;
                    if (f2Var2 != null) {
                        f2Var2.g();
                    }
                    v3Var2.f17556p3.onContentChanged();
                    return;
                }
                return;
        }
    }

    @Override
    public void T() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public a0.h U() {
        switch (this.f15826a) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override
    public long V(long j10) {
        return 1L;
    }

    @Override
    public long W(long j10, long j11) {
        return 1L;
    }

    @Override
    public void X(int i10, int i11, CharSequence charSequence, boolean z10) {
        ti tiVar = (ti) this.f15827b;
        if (tiVar.s1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tiVar.s1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, tiVar.s1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            tiVar.s1().setText(spannableStringBuilder);
            tiVar.s1().setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public void Y(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f15827b).setResultCode(i10);
    }

    @Override
    public org.telegram.ui.ActionBar.g1 Z(int i10, Runnable runnable, String str, boolean z10, boolean z11) {
        l80 l80Var = (l80) this.f15827b;
        int x9 = l80Var.x();
        l80Var.c(i10, str, new u7(runnable, z11, l80Var, 25), z10);
        View w10 = l80Var.w(x9);
        if (w10 instanceof org.telegram.ui.ActionBar.g1) {
            return (org.telegram.ui.ActionBar.g1) w10;
        }
        return null;
    }

    @Override
    public long a(long j10) {
        return 0L;
    }

    @Override
    public void a0() {
        switch (this.f15826a) {
            case 5:
                li.y yVar = (li.y) this.f15827b;
                p3 p3Var = yVar.O;
                if (p3Var != null) {
                    li.a aVar = yVar.f17652a;
                    v3.U1(p3Var.f17408a);
                    return;
                }
                return;
            default:
                u4 u4Var = (u4) this.f15827b;
                o3 o3Var = u4Var.N;
                if (o3Var != null) {
                    li.a aVar2 = u4Var.f17652a;
                    v3.U1(o3Var.f17390a);
                    return;
                }
                return;
        }
    }

    @Override
    public void b(li.g1 g1Var) {
        switch (this.f15826a) {
            case 5:
                p3 p3Var = ((li.y) this.f15827b).O;
                if (p3Var != null) {
                    v3 v3Var = p3Var.f17408a;
                    v3.S1(v3Var, g1Var);
                    v3Var.f17556p3.s(g1Var, true);
                    return;
                }
                return;
            default:
                o3 o3Var = ((u4) this.f15827b).N;
                if (o3Var != null) {
                    v3 v3Var2 = o3Var.f17390a;
                    v3.S1(v3Var2, g1Var);
                    v3Var2.f17556p3.s(g1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean c(float f7) {
        boolean z10;
        int[] iArr;
        li.b2 b2Var = (li.b2) this.f15827b;
        FrameLayout frameLayout = b2Var.f17145v0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f7 >= iArr[1]) {
                z10 = true;
                li.b2.a0(b2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        li.b2.a0(b2Var, z10, true);
        return z10;
    }

    public float c0(kc.c cVar, kc.c cVar2) {
        int i10 = (int) cVar.f9892b;
        int i11 = (int) cVar2.f9892b;
        float j02 = j0((int) cVar.f9891a, i10, (int) cVar2.f9891a, i11);
        float j03 = j0((int) cVar2.f9891a, i11, (int) cVar.f9891a, i10);
        if (Float.isNaN(j02)) {
            return j03 / 7.0f;
        }
        if (Float.isNaN(j03)) {
            return j02 / 7.0f;
        }
        return (j02 + j03) / 14.0f;
    }

    @Override
    public void d() {
        l2.g gVar = (l2.g) this.f15827b;
        gVar.A.d();
        IOException iOException = gVar.C;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }

    public kc.a d0(float f7, float f10, int i10, int i11) {
        int i12;
        kc.a b10;
        kc.a b11;
        int i13 = (int) (f10 * f7);
        int max = Math.max(0, i10 - i13);
        fc.b bVar = (fc.b) this.f15827b;
        int min = Math.min(bVar.f10404a - 1, i10 + i13) - max;
        float f11 = 3.0f * f7;
        if (min >= f11) {
            int max2 = Math.max(0, i11 - i13);
            int min2 = Math.min(bVar.f10405b - 1, i11 + i13) - max2;
            if (min2 >= f11) {
                fc.b bVar2 = (fc.b) this.f15827b;
                kc.b bVar3 = new kc.b(bVar2, max, max2, min, min2, f7);
                int i14 = bVar3.e;
                int i15 = bVar3.f16508c;
                int i16 = i14 + i15;
                int i17 = bVar3.f16509f;
                int i18 = (i17 / 2) + bVar3.d;
                int[] iArr = new int[3];
                for (int i19 = 0; i19 < i17; i19++) {
                    if ((i19 & 1) == 0) {
                        i12 = (i19 + 1) / 2;
                    } else {
                        i12 = -((i19 + 1) / 2);
                    }
                    int i20 = i12 + i18;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i21 = i15;
                    while (i21 < i16 && !bVar2.b(i21, i20)) {
                        i21++;
                    }
                    int i22 = 0;
                    while (i21 < i16) {
                        if (bVar2.b(i21, i20)) {
                            if (i22 == 1) {
                                iArr[1] = iArr[1] + 1;
                            } else if (i22 == 2) {
                                if (bVar3.a(iArr) && (b11 = bVar3.b(i20, i21, iArr)) != null) {
                                    return b11;
                                }
                                iArr[0] = iArr[2];
                                iArr[1] = 1;
                                iArr[2] = 0;
                                i22 = 1;
                            } else {
                                i22++;
                                iArr[i22] = iArr[i22] + 1;
                            }
                        } else {
                            if (i22 == 1) {
                                i22++;
                            }
                            iArr[i22] = iArr[i22] + 1;
                        }
                        i21++;
                    }
                    if (bVar3.a(iArr) && (b10 = bVar3.b(i20, i16, iArr)) != null) {
                        return b10;
                    }
                }
                ArrayList arrayList = bVar3.f16507b;
                if (!arrayList.isEmpty()) {
                    return (kc.a) arrayList.get(0);
                }
                throw ec.e.a();
            }
            throw ec.e.a();
        }
        throw ec.e.a();
    }

    @Override
    public void f(int i10) {
        switch (this.f15826a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ua(this, 25));
                return;
            default:
                org.telegram.ui.Wallet.r9 r9Var = (org.telegram.ui.Wallet.r9) this.f15827b;
                if (!r9Var.f37226r && i10 == r9Var.J) {
                    r9Var.f0(r9Var.N.getText().toString().trim());
                    return;
                }
                return;
        }
    }

    @Override
    public long g(long j10, long j11) {
        return 0L;
    }

    @Override
    public Object mo27get() {
        return new k6.c((Context) ((b9.p) this.f15827b).f3714a, new Object(), new u7.s(24), 9);
    }

    @Override
    public fe.b getData() {
        return ((k1.z) this.f15827b).f16110c;
    }

    @Override
    public void h() {
        switch (this.f15826a) {
            case 5:
                li.y yVar = (li.y) this.f15827b;
                p3 p3Var = yVar.O;
                if (p3Var != null) {
                    v3.V1(p3Var.f17408a, yVar.f17652a);
                    return;
                }
                return;
            default:
                u4 u4Var = (u4) this.f15827b;
                o3 o3Var = u4Var.N;
                if (o3Var != null) {
                    v3.V1(o3Var.f17390a, u4Var.f17652a);
                    return;
                }
                return;
        }
    }

    public void h0(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f15827b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    @Override
    public void i(u3 u3Var, View view) {
        li.b2 b2Var = (li.b2) this.f15827b;
        l80 H = l80.H(b2Var, view);
        H.Q = true;
        b2Var.getParentActivity();
        b2Var.getResourceProvider();
        b2Var.f17149x0 = j4.b(H, b2Var, u3Var, false);
    }

    public float i0(int i10, int i11, int i12, int i13) {
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z11;
        s0 s0Var;
        int i22;
        boolean z12 = true;
        if (Math.abs(i13 - i11) > Math.abs(i12 - i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i23 = 2;
        int i24 = (-abs) / 2;
        int i25 = -1;
        if (i14 < i16) {
            i18 = 1;
        } else {
            i18 = -1;
        }
        if (i15 < i17) {
            i25 = 1;
        }
        int i26 = i16 + i18;
        int i27 = i14;
        int i28 = i15;
        int i29 = 0;
        while (true) {
            if (i27 != i26) {
                if (z10) {
                    i20 = i28;
                } else {
                    i20 = i27;
                }
                if (z10) {
                    i21 = i27;
                } else {
                    i21 = i28;
                }
                boolean z13 = z10;
                if (i29 == z12) {
                    z11 = z12;
                    i22 = abs;
                    s0Var = this;
                } else {
                    z11 = false;
                    s0Var = this;
                    i22 = abs;
                }
                if (z11 == ((fc.b) s0Var.f15827b).b(i20, i21)) {
                    if (i29 == 2) {
                        return ic.b(i27, i28, i14, i15);
                    }
                    i29++;
                }
                i24 += abs2;
                if (i24 > 0) {
                    if (i28 == i17) {
                        i19 = 2;
                        break;
                    }
                    i28 += i25;
                    i24 -= i22;
                }
                i27 += i18;
                abs = i22;
                z10 = z13;
                z12 = true;
                i23 = 2;
            } else {
                i19 = i23;
                break;
            }
        }
        if (i29 == i19) {
            return ic.b(i26, i17, i14, i15);
        }
        return Float.NaN;
    }

    @Override
    public void invalidate() {
        switch (this.f15826a) {
            case 15:
                ((org.telegram.ui.Cells.s1) ((org.telegram.ui.Cells.f1) this.f15827b).f24059b).invalidate();
                return;
            default:
                ((dh0) this.f15827b).h.invalidate();
                return;
        }
    }

    public float j0(int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        fc.b bVar = (fc.b) this.f15827b;
        float i02 = i0(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f7 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.f10404a;
            if (i14 >= i16) {
                int i17 = i16 - 1;
                f7 = ((i16 - 1) - i10) / (i14 - i10);
                i14 = i17;
            } else {
                f7 = 1.0f;
            }
        }
        float f11 = i11;
        int i18 = (int) (f11 - ((i13 - i11) * f7));
        if (i18 < 0) {
            f10 = f11 / (i11 - i18);
        } else {
            int i19 = bVar.f10405b;
            if (i18 >= i19) {
                f10 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f10 = 1.0f;
            }
        }
        return (i0(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + i02) - 1.0f;
    }

    @Override
    public long k(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public boolean k0(int i10) {
        switch (this.f15826a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public m2.j l(long j10) {
        return (m2.j) this.f15827b;
    }

    @Override
    public void m(int i10) {
        ((li.b2) this.f15827b).p0(74, i10);
    }

    @Override
    public void n() {
        int i10;
        li.b2 b2Var = (li.b2) this.f15827b;
        j3 j3Var = b2Var.P.f17568v3;
        if (j3Var != null && j3Var.x() && b2Var.P.I4()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        b2Var.y0(i10, true);
        b2Var.z0();
        b2Var.x0();
    }

    @Override
    public void o(li.a aVar) {
        li.b2 b2Var = (li.b2) this.f15827b;
        if (aVar != null && (aVar.f17053b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(b2Var)) {
            ti tiVar = new ti(b2Var.getParentActivity(), b2Var, false, false, false, b2Var.getResourceProvider());
            tiVar.f32982c2 = new tb.a(12);
            tiVar.P = true;
            tiVar.A1.setVisibility(8);
            tiVar.f33056z2 = new androidx.car.app.utils.a(b2Var, aVar, tiVar, 12);
            tiVar.w1();
            tiVar.show();
        }
    }

    @Override
    public void onContentChanged() {
        li.b2 b2Var = (li.b2) this.f15827b;
        if (b2Var.f17151y0 != null) {
            boolean s32 = b2Var.P.s3();
            b2Var.L0 = s32;
            b2Var.f17151y0.h(s32);
            b2Var.f17151y0.invalidate();
        }
        b2Var.D0();
        Runnable runnable = b2Var.M0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override
    public void onError(t81 t81Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        p60 p60Var;
        VideoEditedInfo videoEditedInfo;
        h60 h60Var = (h60) this.f15827b;
        t81 t81Var = h60Var.H0.S;
        if (t81Var != null && t81Var.y() && i10 == 4 && (videoEditedInfo = (p60Var = h60Var.H0).R) != null) {
            t81 t81Var2 = p60Var.S;
            long j10 = videoEditedInfo.startTime;
            if (j10 <= 0) {
                j10 = 0;
            }
            t81Var2.K(j10);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void p(d6 d6Var, String str) {
        li.b2 b2Var = (li.b2) this.f15827b;
        if (b2Var.f17152z0 == null) {
            b2Var.f17152z0 = new r3(new e1(this, 8), b2Var.getResourceProvider());
        }
        b2Var.f17152z0.f(d6Var, str);
    }

    @Override
    public void p0(ArrayList arrayList) {
        int i10 = this.f15826a;
    }

    @Override
    public void q() {
        li.b2 b2Var = (li.b2) this.f15827b;
        b2Var.I0 = b2Var.K0;
        li.b2.a0(b2Var, false, false);
        b2Var.y0(2, true);
    }

    @Override
    public void r(l.k kVar) {
        i iVar = ((ActionMenuView) this.f15827b).K;
        if (iVar != null) {
            iVar.r(kVar);
        }
    }

    @Override
    public long t(long j10, long j11) {
        return 0L;
    }

    @Override
    public void v() {
        ((l80) this.f15827b).k();
    }

    @Override
    public Object w(ud.p pVar, nd.c cVar) {
        return ((k1.z) this.f15827b).w(new n1.c(pVar, null, 0), cVar);
    }

    @Override
    public org.telegram.ui.ActionBar.g1 x(String str) {
        org.telegram.ui.ActionBar.g1 h = ((l80) this.f15827b).h();
        h.setText(str);
        return h;
    }

    @Override
    public a0.h y() {
        switch (this.f15826a) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void z(float f7, int i10) {
        ((oe.j) this.f15827b).h(f7);
    }

    public s0() {
        this.f15826a = 13;
        this.f15827b = new SparseArray();
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public s0(int i10, int i11, int[] iArr) {
        this.f15826a = 16;
        w60[] w60VarArr = new w60[(iArr.length / 2) + 1];
        this.f15827b = w60VarArr;
        w60 w60Var = new w60(i10, i11);
        int i12 = 0;
        w60VarArr[0] = w60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((w60[]) this.f15827b)[i13] = new w60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public s0(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f15826a = 26;
        this.f15827b = new GestureDetector(context, onGestureListener, null);
    }

    public s0(ArrayList arrayList) {
        this.f15826a = 28;
        this.f15827b = DesugarCollections.unmodifiableList(arrayList);
    }

    public s0(EditText editText) {
        this.f15826a = 25;
        this.f15827b = new m4.c(editText);
    }

    @Override
    public void u() {
    }

    private final void f0(ArrayList arrayList) {
    }

    private final void g0(ArrayList arrayList) {
    }

    @Override
    public void A(int i10) {
    }

    @Override
    public void b0(String str) {
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
    public long e(long j10, long j11) {
        return j11;
    }

    @Override
    public void s(li.g1 g1Var, boolean z10) {
    }

    @Override
    public void J(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void j(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
