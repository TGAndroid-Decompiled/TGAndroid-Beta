package kg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.k8;
import c8.ma;
import hi.s6;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.v6;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.vy;
public final class h0 extends mi implements b6, gs, te.b {
    public final f0 E;
    public final vy F;
    public final qi G;
    public final te.a f18363n;
    public final FrameLayout f18364r;
    public final di.b1 f18365s;
    public final d0 f18366w;
    public final HashSet f18367x;
    public final e0 f18368y;

    public h0(Context context, h6 h6Var, ui uiVar) {
        super(context, h6Var, uiVar);
        this.f18363n = new te.a(0, this, nr.h, 380L, false);
        this.f18367x = new HashSet();
        this.E = new f0(this, context);
        ti tiVar = new ti(m6.f29381d6, context, h6Var);
        tiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18364r = frameLayout;
        qi qiVar = new qi(context, h6Var, this.f37519b);
        this.G = qiVar;
        qiVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        ah.j jVar = new ah.j(this, 10);
        ah.i iVar = qiVar.f34642r;
        iVar.addTextChangedListener(jVar);
        iVar.setHint(hd.N0(2131752644, null));
        frameLayout.addView(tiVar, ma.g());
        FrameLayout.LayoutParams d = ma.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.f24040m;
        frameLayout.addView(qiVar, d);
        vy vyVar = new vy(context, h6Var);
        this.F = vyVar;
        vyVar.c();
        addView(vyVar, ma.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        di.b1 b1Var = new di.b1(this, context, h6Var, 4);
        this.f18365s = b1Var;
        b1Var.r1();
        setBlur3Capture(b1Var);
        this.d = b1Var;
        this.h = true;
        this.f37522f = true;
        ls.e().h(b1Var, ls.f25342l4, new s6(this, 8));
        b1Var.setClipToPadding(false);
        getContext();
        d0 d0Var = new d0(this, org.telegram.messenger.g0.L(9.0f), b1Var, 0);
        this.f18366w = d0Var;
        b1Var.setLayoutManager(d0Var);
        d0Var.P = false;
        b1Var.setHorizontalScrollBarEnabled(false);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.setClipToPadding(false);
        addView(b1Var, ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        e0 e0Var = new e0(this, context);
        this.f18368y = e0Var;
        b1Var.setAdapter(e0Var);
        t6.l(b1Var, 21, m6.A5, h6Var);
        b1Var.setOnItemClickListener(new k8(this, 15));
        b1Var.setOnScrollListener(new bi.u1(this, 19));
        FrameLayout.LayoutParams e10 = ma.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += org.telegram.messenger.g0.f24040m;
        addView(frameLayout, e10);
        Q();
    }

    public static int P(h0 h0Var) {
        return h0Var.getCurrentTop();
    }

    public int getCurrentTop() {
        di.b1 b1Var = this.f18365s;
        if (b1Var.getChildCount() != 0) {
            int i7 = 0;
            View childAt = b1Var.getChildAt(0);
            mj0 mj0Var = (mj0) b1Var.G(childAt);
            if (mj0Var != null) {
                int paddingTop = b1Var.getPaddingTop();
                if (mj0Var.b() == 0 && childAt.getTop() >= 0) {
                    i7 = childAt.getTop();
                }
                return paddingTop - i7;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void B(int i7, int i10) {
        int i11;
        ui uiVar = this.f37519b;
        if (uiVar.f40413p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i11 = org.telegram.messenger.g0.L(8.0f);
            uiVar.f30207r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f24046q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    uiVar.f30207r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            uiVar.f30207r0 = true;
        }
        this.f18365s.q1(0, i11 + org.telegram.messenger.g0.f24040m, 0, this.f37521e);
    }

    @Override
    public final void I(mi miVar) {
        this.f18366w.h1(0, 0);
    }

    @Override
    public final void K() {
        this.f18365s.y0(0);
    }

    public final void Q() {
        boolean z10;
        int i7 = 0;
        if (this.f18365s.getAdapter().b() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i7 = 8;
        }
        this.F.setVisibility(i7);
        R();
    }

    public final void R() {
        View childAt;
        vy vyVar = this.F;
        if (vyVar.getVisibility() != 0 || (childAt = this.f18365s.getChildAt(0)) == null) {
            return;
        }
        vyVar.setTranslationY((childAt.getTop() + (vyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.U7));
        hashSet.add(Integer.valueOf(m6.T7));
        hashSet.add(Integer.valueOf(m6.S7));
        hashSet.add(Integer.valueOf(m6.R7));
        hashSet.add(Integer.valueOf(m6.Q7));
        hashSet.add(Integer.valueOf(m6.P7));
        hashSet.add(Integer.valueOf(m6.O7));
        hashSet.add(Integer.valueOf(m6.J7));
        hashSet.add(Integer.valueOf(m6.f29620q5));
        hashSet.add(Integer.valueOf(m6.f29382d7));
        hashSet.add(Integer.valueOf(m6.f29473i6));
    }

    @Override
    public int getCurrentItemTop() {
        int i7;
        di.b1 b1Var = this.f18365s;
        if (b1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = b1Var.getChildAt(0);
        mj0 mj0Var = (mj0) b1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.g0.f24040m) - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && mj0Var != null && mj0Var.b() == 0) {
            i7 = top;
        } else {
            i7 = 0;
        }
        te.a aVar = this.f18363n;
        if (top >= 0 && mj0Var != null && mj0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i7;
        }
        this.f18364r.setTranslationY(top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f18365s.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override
    public ArrayList<v6> getThemeDescriptions() {
        ArrayList<v6> arrayList = new ArrayList<>();
        arrayList.add(new v6(this.F, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (u6) null, m6.f29364c7));
        arrayList.add(new v6(this.F, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (u6) null, m6.f29455h6));
        int i7 = m6.f29620q5;
        arrayList.add(new v6(this.f18365s, 0, new Class[]{g0.class}, new String[]{"nameTextView"}, (Drawable[]) null, (u6) null, i7));
        return arrayList;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        R();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f37519b.f30176b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        qi qiVar = this.G;
        if (qiVar != null) {
            qiVar.setupBlurredBackground(cVar.c(qiVar, c8.i0.a(this.f37518a), false));
        }
    }

    @Override
    public final void p() {
    }

    @Override
    public final void updateColors() {
    }

    @Override
    public final void D(float f10, int i7) {
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
    }
}
