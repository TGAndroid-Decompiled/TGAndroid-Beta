package hg;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ci.h2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wi;
import w7.y5;
public final class k0 extends oi implements NotificationCenter.NotificationCenterDelegate, le.e {
    public final nz E;
    public final si F;
    public final le.c f10310n;
    public final FrameLayout f10311r;
    public final ai.w0 f10312s;
    public final g0 v;
    public final HashSet f10313w;
    public final h0 f10314x;
    public final i0 f10315y;

    public k0(Context context, d6 d6Var, wi wiVar) {
        super(context, d6Var, wiVar);
        this.f10310n = new le.c(0, this, rr.h, 380L, false);
        this.f10313w = new HashSet();
        this.f10315y = new i0(this, context);
        vi viVar = new vi(context, h6.f19060d6, d6Var);
        viVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10311r = frameLayout;
        si siVar = new si(context, d6Var, this.f27088b);
        this.F = siVar;
        siVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        e0 e0Var = new e0(this);
        h2 h2Var = siVar.f23161r;
        h2Var.addTextChangedListener(e0Var);
        h2Var.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(viVar, y5.g());
        FrameLayout.LayoutParams d = y5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(siVar, d);
        nz nzVar = new nz(context, d6Var);
        this.E = nzVar;
        nzVar.c();
        addView(nzVar, y5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ai.w0 w0Var = new ai.w0(this, context, d6Var, 3);
        this.f10312s = w0Var;
        w0Var.p1();
        this.f27089c = w0Var;
        this.d = w0Var;
        this.h = true;
        this.f27090f = true;
        NotificationCenter.getGlobalInstance().listen(w0Var, NotificationCenter.emojiLoaded, new ai.y1(this, 23));
        w0Var.setClipToPadding(false);
        getContext();
        g0 g0Var = new g0(this, AndroidUtilities.dp(9.0f), w0Var, 0);
        this.v = g0Var;
        w0Var.setLayoutManager(g0Var);
        g0Var.P = false;
        w0Var.setHorizontalScrollBarEnabled(false);
        w0Var.setVerticalScrollBarEnabled(false);
        w0Var.setClipToPadding(false);
        addView(w0Var, y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        h0 h0Var = new h0(this, context);
        this.f10314x = h0Var;
        w0Var.setAdapter(h0Var);
        w0Var.setGlowColor(h6.v0(h6.A5, this.f27087a));
        w0Var.setOnItemClickListener(new ai.g(this, 10));
        w0Var.setOnScrollListener(new ai.r(this, 9));
        FrameLayout.LayoutParams e = y5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        L();
    }

    public int getCurrentTop() {
        ai.w0 w0Var = this.f10312s;
        if (w0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = w0Var.getChildAt(0);
            gl0 gl0Var = (gl0) w0Var.G(childAt);
            if (gl0Var != null) {
                int paddingTop = w0Var.getPaddingTop();
                if (gl0Var.b() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void E(oi oiVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f10312s.x0(0);
    }

    public final void L() {
        boolean z10;
        int i10 = 0;
        if (this.f10312s.getAdapter().h() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        this.E.setVisibility(i10);
        M();
    }

    public final void M() {
        View childAt;
        nz nzVar = this.E;
        if (nzVar.getVisibility() != 0 || (childAt = this.f10312s.getChildAt(0)) == null) {
            return;
        }
        nzVar.setTranslationY((childAt.getTop() + (nzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        ai.w0 w0Var = this.f10312s;
        if (w0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        gl0 gl0Var = (gl0) w0Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && gl0Var != null && gl0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        le.c cVar = this.f10310n;
        if (top >= 0 && gl0Var != null && gl0Var.b() == 0) {
            cVar.a(false, true);
        } else {
            cVar.a(true, true);
            top = i10;
        }
        this.f10311r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f10312s.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override
    public ArrayList<j6> getThemeDescriptions() {
        i6 i6Var = new i6() {
            @Override
            public final void b() {
                ai.w0 w0Var = k0.this.f10312s;
                if (w0Var != null) {
                    int childCount = w0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        w0Var.getChildAt(i10);
                    }
                }
            }

            @Override
            public final void a(float f7) {
            }
        };
        ArrayList<j6> arrayList = new ArrayList<>();
        arrayList.add(new j6(this.E, 4, null, null, null, null, h6.f19043c7));
        arrayList.add(new j6(this.E, 2048, null, null, null, null, h6.f19131h6));
        int i10 = h6.A5;
        ai.w0 w0Var = this.f10312s;
        arrayList.add(new j6(w0Var, 32768, null, null, null, null, i10));
        arrayList.add(new j6(w0Var, 4096, null, null, null, null, h6.f19149i6));
        arrayList.add(new j6(w0Var, 0, new Class[]{View.class}, h6.f19181k0, null, null, h6.f19061d7));
        int i11 = h6.f19298q5;
        arrayList.add(new j6(w0Var, 0, new Class[]{j0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new j6(w0Var, 0, new Class[]{j0.class}, new String[]{"statusTextView"}, null, null, -1, i6Var, i11));
        arrayList.add(new j6(w0Var, 0, new Class[]{j0.class}, null, h6.f19311r0, null, h6.J7));
        arrayList.add(new j6(null, 0, null, null, null, i6Var, h6.O7));
        arrayList.add(new j6(null, 0, null, null, null, i6Var, h6.P7));
        arrayList.add(new j6(null, 0, null, null, null, i6Var, h6.Q7));
        arrayList.add(new j6(null, 0, null, null, null, i6Var, h6.R7));
        arrayList.add(new j6(null, 0, null, null, null, i6Var, h6.S7));
        arrayList.add(new j6(null, 0, null, null, null, i6Var, h6.T7));
        arrayList.add(new j6(null, 0, null, null, null, i6Var, h6.U7));
        return arrayList;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        M();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27088b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ah.c cVar) {
        si siVar = this.F;
        if (siVar != null) {
            siVar.setupBlurredBackground(cVar.c(siVar, eh.b.a(this.f27087a), false));
        }
    }

    @Override
    public final void y(int i10, int i11) {
        int i12;
        wi wiVar = this.f27088b;
        if (wiVar.f30043r1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            wiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    wiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            wiVar.setAllowNestedScroll(true);
        }
        this.f10312s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override
    public final void m() {
    }

    @Override
    public final void C(float f7, int i10) {
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
    }
}
