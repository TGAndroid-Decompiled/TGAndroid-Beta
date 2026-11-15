package kg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.b6;
import bi.z4;
import c8.ja;
import hi.g7;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.ny;
public final class g0 extends ci implements z5, is, te.b {
    public final e0 E;
    public final ny F;
    public final gi G;
    public final te.a f17943n;
    public final FrameLayout f17944r;
    public final di.c1 f17945s;
    public final c0 f17946w;
    public final HashSet f17947x;
    public final d0 f17948y;

    public g0(Context context, e6 e6Var, ki kiVar) {
        super(context, e6Var, kiVar);
        this.f17943n = new te.a(0, this, er.h, 380L, false);
        this.f17947x = new HashSet();
        this.E = new e0(this, context);
        ji jiVar = new ji(j6.f28849d6, context, e6Var);
        jiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17944r = frameLayout;
        gi giVar = new gi(context, e6Var, this.f33609b);
        this.G = giVar;
        giVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        ah.j jVar = new ah.j(this, 9);
        ah.i iVar = giVar.f40202r;
        iVar.addTextChangedListener(jVar);
        iVar.setHint(hd.M0(2131752656, null));
        frameLayout.addView(jiVar, ja.g());
        FrameLayout.LayoutParams d = ja.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.f23605m;
        frameLayout.addView(giVar, d);
        ny nyVar = new ny(context, e6Var);
        this.F = nyVar;
        nyVar.c();
        addView(nyVar, ja.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        di.c1 c1Var = new di.c1(this, context, e6Var, 4);
        this.f17945s = c1Var;
        c1Var.r1();
        setBlur3Capture(c1Var);
        this.d = c1Var;
        this.h = true;
        this.f33612f = true;
        ns.e().h(c1Var, ns.f25515i4, new g7(this, 7));
        c1Var.setClipToPadding(false);
        getContext();
        c0 c0Var = new c0(this, org.telegram.messenger.g0.L(9.0f), c1Var, 0);
        this.f17946w = c0Var;
        c1Var.setLayoutManager(c0Var);
        c0Var.P = false;
        c1Var.setHorizontalScrollBarEnabled(false);
        c1Var.setVerticalScrollBarEnabled(false);
        c1Var.setClipToPadding(false);
        addView(c1Var, ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        d0 d0Var = new d0(this, context);
        this.f17948y = d0Var;
        c1Var.setAdapter(d0Var);
        q6.l(c1Var, 21, j6.A5, e6Var);
        c1Var.setOnItemClickListener(new b6(this, 15));
        c1Var.setOnScrollListener(new z4(this, 18));
        FrameLayout.LayoutParams e10 = ja.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += org.telegram.messenger.g0.f23605m;
        addView(frameLayout, e10);
        Q();
    }

    public static int P(g0 g0Var) {
        return g0Var.getCurrentTop();
    }

    public int getCurrentTop() {
        di.c1 c1Var = this.f17945s;
        if (c1Var.getChildCount() != 0) {
            int i7 = 0;
            View childAt = c1Var.getChildAt(0);
            cj0 cj0Var = (cj0) c1Var.G(childAt);
            if (cj0Var != null) {
                int paddingTop = c1Var.getPaddingTop();
                if (cj0Var.b() == 0 && childAt.getTop() >= 0) {
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
        ki kiVar = this.f33609b;
        if (kiVar.f36470p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i11 = org.telegram.messenger.g0.L(8.0f);
            kiVar.f29713r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f23611q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    kiVar.f29713r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            kiVar.f29713r0 = true;
        }
        this.f17945s.q1(0, i11 + org.telegram.messenger.g0.f23605m, 0, this.f33611e);
    }

    @Override
    public final void I(ci ciVar) {
        this.f17946w.h1(0, 0);
    }

    @Override
    public final void K() {
        this.f17945s.y0(0);
    }

    public final void Q() {
        boolean z10;
        int i7 = 0;
        if (this.f17945s.getAdapter().b() == 2) {
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
        ny nyVar = this.F;
        if (nyVar.getVisibility() != 0 || (childAt = this.f17945s.getChildAt(0)) == null) {
            return;
        }
        nyVar.setTranslationY((childAt.getTop() + (nyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.U7));
        hashSet.add(Integer.valueOf(j6.T7));
        hashSet.add(Integer.valueOf(j6.S7));
        hashSet.add(Integer.valueOf(j6.R7));
        hashSet.add(Integer.valueOf(j6.Q7));
        hashSet.add(Integer.valueOf(j6.P7));
        hashSet.add(Integer.valueOf(j6.O7));
        hashSet.add(Integer.valueOf(j6.J7));
        hashSet.add(Integer.valueOf(j6.f29088q5));
        hashSet.add(Integer.valueOf(j6.f28850d7));
        hashSet.add(Integer.valueOf(j6.f28941i6));
    }

    @Override
    public int getCurrentItemTop() {
        int i7;
        di.c1 c1Var = this.f17945s;
        if (c1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = c1Var.getChildAt(0);
        cj0 cj0Var = (cj0) c1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.g0.f23605m) - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && cj0Var != null && cj0Var.b() == 0) {
            i7 = top;
        } else {
            i7 = 0;
        }
        te.a aVar = this.f17943n;
        if (top >= 0 && cj0Var != null && cj0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i7;
        }
        this.f17944r.setTranslationY(top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f17945s.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override
    public ArrayList<s6> getThemeDescriptions() {
        ArrayList<s6> arrayList = new ArrayList<>();
        arrayList.add(new s6(this.F, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (r6) null, j6.f28832c7));
        arrayList.add(new s6(this.F, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (r6) null, j6.f28923h6));
        int i7 = j6.f29088q5;
        arrayList.add(new s6(this.f17945s, 0, new Class[]{f0.class}, new String[]{"nameTextView"}, (Drawable[]) null, (r6) null, i7));
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
        this.f33609b.f29682b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        gi giVar = this.G;
        if (giVar != null) {
            giVar.setupBlurredBackground(cVar.c(giVar, c8.g0.a(this.f33608a), false));
        }
    }

    @Override
    public final void p() {
    }

    @Override
    public final void updateColors() {
    }

    @Override
    public final void E(float f10, int i7) {
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
    }
}
