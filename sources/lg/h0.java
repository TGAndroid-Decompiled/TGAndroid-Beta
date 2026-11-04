package lg;

import ai.j5;
import ai.j6;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b8.cd;
import b8.mf;
import gi.j8;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.xh;
import org.telegram.ui.Components.xq;
public final class h0 extends th implements z5, cs, qe.b {
    public final f0 E;
    public final gy F;
    public final xh G;
    public final qe.a f18320n;
    public final FrameLayout f18321r;
    public final ci.j1 f18322s;
    public final d0 f18323w;
    public final HashSet f18324x;
    public final e0 f18325y;

    public h0(Context context, e6 e6Var, bi biVar) {
        super(context, e6Var, biVar);
        this.f18320n = new qe.a(0, this, xq.h, 380L, false);
        this.f18324x = new HashSet();
        this.E = new f0(this, context);
        ai aiVar = new ai(k6.f27878d6, context, e6Var);
        aiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18321r = frameLayout;
        xh xhVar = new xh(context, e6Var, this.f38416b);
        this.G = xhVar;
        xhVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        bh.h hVar = new bh.h(this, 8);
        bh.g gVar = xhVar.f36302r;
        gVar.addTextChangedListener(hVar);
        gVar.setHint(bd.M0(2131752656, null));
        frameLayout.addView(aiVar, mf.g());
        FrameLayout.LayoutParams d = mf.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.f22602m;
        frameLayout.addView(xhVar, d);
        gy gyVar = new gy(context, e6Var);
        this.F = gyVar;
        gyVar.c();
        addView(gyVar, mf.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ci.j1 j1Var = new ci.j1(this, context, e6Var, 5);
        this.f18322s = j1Var;
        j1Var.r1();
        setBlur3Capture(j1Var);
        this.d = j1Var;
        this.h = true;
        this.f38419f = true;
        hs.e().h(j1Var, hs.f23246i4, new j8(this, 7));
        j1Var.setClipToPadding(false);
        getContext();
        d0 d0Var = new d0(this, org.telegram.messenger.g0.L(9.0f), j1Var, 0);
        this.f18323w = d0Var;
        j1Var.setLayoutManager(d0Var);
        d0Var.P = false;
        j1Var.setHorizontalScrollBarEnabled(false);
        j1Var.setVerticalScrollBarEnabled(false);
        j1Var.setClipToPadding(false);
        addView(j1Var, mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        e0 e0Var = new e0(this, context);
        this.f18325y = e0Var;
        j1Var.setAdapter(e0Var);
        r6.m(j1Var, 21, k6.A5, e6Var);
        j1Var.setOnItemClickListener(new j6(this, 16));
        j1Var.setOnScrollListener(new j5(this, 24));
        FrameLayout.LayoutParams e10 = mf.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += org.telegram.messenger.g0.f22602m;
        addView(frameLayout, e10);
        P();
    }

    public static int O(h0 h0Var) {
        return h0Var.getCurrentTop();
    }

    public int getCurrentTop() {
        ci.j1 j1Var = this.f18322s;
        if (j1Var.getChildCount() != 0) {
            int i3 = 0;
            View childAt = j1Var.getChildAt(0);
            bj0 bj0Var = (bj0) j1Var.G(childAt);
            if (bj0Var != null) {
                int paddingTop = j1Var.getPaddingTop();
                if (bj0Var.b() == 0 && childAt.getTop() >= 0) {
                    i3 = childAt.getTop();
                }
                return paddingTop - i3;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void B(int i3, int i10) {
        int i11;
        bi biVar = this.f38416b;
        if (biVar.f32249m3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i11 = org.telegram.messenger.g0.L(8.0f);
            biVar.f28614r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f22608q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    biVar.f28614r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            biVar.f28614r0 = true;
        }
        this.f18322s.q1(0, i11 + org.telegram.messenger.g0.f22602m, 0, this.f38418e);
    }

    @Override
    public final void H(th thVar) {
        this.f18323w.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f18322s.y0(0);
    }

    public final void P() {
        boolean z10;
        int i3 = 0;
        if (this.f18322s.getAdapter().b() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i3 = 8;
        }
        this.F.setVisibility(i3);
        Q();
    }

    public final void Q() {
        View childAt;
        gy gyVar = this.F;
        if (gyVar.getVisibility() != 0 || (childAt = this.f18322s.getChildAt(0)) == null) {
            return;
        }
        gyVar.setTranslationY((childAt.getTop() + (gyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.U7));
        hashSet.add(Integer.valueOf(k6.T7));
        hashSet.add(Integer.valueOf(k6.S7));
        hashSet.add(Integer.valueOf(k6.R7));
        hashSet.add(Integer.valueOf(k6.Q7));
        hashSet.add(Integer.valueOf(k6.P7));
        hashSet.add(Integer.valueOf(k6.O7));
        hashSet.add(Integer.valueOf(k6.J7));
        hashSet.add(Integer.valueOf(k6.f28120q5));
        hashSet.add(Integer.valueOf(k6.f27879d7));
        hashSet.add(Integer.valueOf(k6.f27972i6));
    }

    @Override
    public int getCurrentItemTop() {
        int i3;
        ci.j1 j1Var = this.f18322s;
        if (j1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = j1Var.getChildAt(0);
        bj0 bj0Var = (bj0) j1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.g0.f22602m) - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && bj0Var != null && bj0Var.b() == 0) {
            i3 = top;
        } else {
            i3 = 0;
        }
        qe.a aVar = this.f18320n;
        if (top >= 0 && bj0Var != null && bj0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i3;
        }
        this.f18321r.setTranslationY(top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f18322s.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override
    public ArrayList<t6> getThemeDescriptions() {
        ArrayList<t6> arrayList = new ArrayList<>();
        arrayList.add(new t6(this.F, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (s6) null, k6.f27862c7));
        arrayList.add(new t6(this.F, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (s6) null, k6.f27955h6));
        int i3 = k6.f28120q5;
        arrayList.add(new t6(this.f18322s, 0, new Class[]{g0.class}, new String[]{"nameTextView"}, (Drawable[]) null, (s6) null, i3));
        return arrayList;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        Q();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38416b.f28586b.invalidate();
    }

    public void setupBlurredSearchField(eh.c cVar) {
        xh xhVar = this.G;
        if (xhVar != null) {
            xhVar.setupBlurredBackground(cVar.c(xhVar, cd.a(this.f38415a), false));
        }
    }

    @Override
    public final void p() {
    }

    @Override
    public final void updateColors() {
    }

    @Override
    public final void F(float f10, int i3) {
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
    }
}
