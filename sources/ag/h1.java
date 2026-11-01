package ag;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.vs;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.c7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.xy;
import org.telegram.ui.Components.yh;
import w7.b6;
import w7.b9;
public final class h1 extends uh implements k6, vs, fe.e {
    public final f1 D;
    public final xy E;
    public final yh F;
    public final fe.b f540n;
    public final FrameLayout f541r;
    public final b1 f542s;
    public final d1 f543w;
    public final HashSet f544x;
    public final e1 f545y;

    public h1(Context context, p6 p6Var, bi biVar) {
        super(context, p6Var, biVar);
        this.f540n = new fe.b(0, this, gr.h, 380L, false);
        this.f544x = new HashSet();
        this.D = new f1(this, context);
        ih.e eVar = new ih.e(t6.f20930d6, context, p6Var);
        eVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f541r = frameLayout;
        yh yhVar = new yh(context, p6Var, this.f30964b);
        this.F = yhVar;
        yhVar.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        a1 a1Var = new a1(this, 0);
        org.telegram.ui.ActionBar.n0 n0Var = yhVar.f26635r;
        n0Var.addTextChangedListener(a1Var);
        n0Var.setHint(dd.L0(2131752656, null));
        frameLayout.addView(eVar, b6.g());
        FrameLayout.LayoutParams d = b6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.i0.f16166m;
        frameLayout.addView(yhVar, d);
        xy xyVar = new xy(context, p6Var);
        this.E = xyVar;
        xyVar.c();
        addView(xyVar, b6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        b1 b1Var = new b1(this, context, p6Var, 0);
        this.f542s = b1Var;
        b1Var.r1();
        setBlur3Capture(b1Var);
        this.d = b1Var;
        this.h = true;
        this.f30966f = true;
        at.e().h(b1Var, at.f14726i4, new l(this, 1));
        b1Var.setClipToPadding(false);
        getContext();
        d1 d1Var = new d1(this, org.telegram.messenger.i0.L(9.0f), b1Var, 0);
        this.f543w = d1Var;
        b1Var.setLayoutManager(d1Var);
        d1Var.P = false;
        b1Var.setHorizontalScrollBarEnabled(false);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.setClipToPadding(false);
        addView(b1Var, b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        e1 e1Var = new e1(this, context);
        this.f545y = e1Var;
        b1Var.setAdapter(e1Var);
        a7.m(b1Var, 21, t6.A5, p6Var);
        b1Var.setOnItemClickListener(new y0(this, 0));
        b1Var.setOnScrollListener(new u(this, 1));
        FrameLayout.LayoutParams e = b6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += org.telegram.messenger.i0.f16166m;
        addView(frameLayout, e);
        O();
    }

    public static int N(h1 h1Var) {
        return h1Var.getCurrentTop();
    }

    public int getCurrentTop() {
        b1 b1Var = this.f542s;
        if (b1Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = b1Var.getChildAt(0);
            dk0 dk0Var = (dk0) b1Var.G(childAt);
            if (dk0Var != null) {
                int paddingTop = b1Var.getPaddingTop();
                if (dk0Var.b() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void B(int i10, int i11) {
        int i12;
        bi biVar = this.f30964b;
        if (biVar.f24786l3.Q() > org.telegram.messenger.i0.L(20.0f)) {
            i12 = org.telegram.messenger.i0.L(8.0f);
            biVar.f21611q0 = false;
        } else {
            if (!org.telegram.messenger.i0.Q1()) {
                Point point = org.telegram.messenger.i0.f16172q;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    biVar.f21611q0 = true;
                }
            }
            i12 = (i11 / 5) * 2;
            biVar.f21611q0 = true;
        }
        this.f542s.q1(0, i12 + org.telegram.messenger.i0.f16166m, 0, this.e);
    }

    @Override
    public final void G(uh uhVar) {
        this.f543w.h1(0, 0);
    }

    @Override
    public final void I() {
        this.f542s.y0(0);
    }

    public final void O() {
        boolean z10;
        int i10 = 0;
        if (this.f542s.getAdapter().b() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        this.E.setVisibility(i10);
        P();
    }

    public final void P() {
        View childAt;
        xy xyVar = this.E;
        if (xyVar.getVisibility() != 0 || (childAt = this.f542s.getChildAt(0)) == null) {
            return;
        }
        xyVar.setTranslationY((childAt.getTop() + (xyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.U7));
        hashSet.add(Integer.valueOf(t6.T7));
        hashSet.add(Integer.valueOf(t6.S7));
        hashSet.add(Integer.valueOf(t6.R7));
        hashSet.add(Integer.valueOf(t6.Q7));
        hashSet.add(Integer.valueOf(t6.P7));
        hashSet.add(Integer.valueOf(t6.O7));
        hashSet.add(Integer.valueOf(t6.J7));
        hashSet.add(Integer.valueOf(t6.f21170q5));
        hashSet.add(Integer.valueOf(t6.f20931d7));
        hashSet.add(Integer.valueOf(t6.f21021i6));
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        b1 b1Var = this.f542s;
        if (b1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = b1Var.getChildAt(0);
        dk0 dk0Var = (dk0) b1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.i0.f16166m) - org.telegram.messenger.i0.L(8.0f);
        if (top > 0 && dk0Var != null && dk0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        fe.b bVar = this.f540n;
        if (top >= 0 && dk0Var != null && dk0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f541r.setTranslationY(top);
        return org.telegram.messenger.i0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f542s.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override
    public ArrayList<c7> getThemeDescriptions() {
        ArrayList<c7> arrayList = new ArrayList<>();
        arrayList.add(new c7(this.E, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (b7) null, t6.f20912c7));
        arrayList.add(new c7(this.E, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (b7) null, t6.f21003h6));
        int i10 = t6.f21170q5;
        arrayList.add(new c7(this.f542s, 0, new Class[]{g1.class}, new String[]{"nameTextView"}, (Drawable[]) null, (b7) null, i10));
        return arrayList;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        P();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30964b.f21587b.invalidate();
    }

    public void setupBlurredSearchField(tg.b bVar) {
        yh yhVar = this.F;
        if (yhVar != null) {
            yhVar.setupBlurredBackground(bVar.c(yhVar, b9.a(this.f30963a), false));
        }
    }

    @Override
    public final void o() {
    }

    @Override
    public final void updateColors() {
    }

    @Override
    public final void E(float f7, int i10) {
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
    }
}
