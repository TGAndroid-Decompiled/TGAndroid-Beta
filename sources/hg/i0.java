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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wi;
import w7.y5;
public final class i0 extends oi implements NotificationCenter.NotificationCenterDelegate, le.e {
    public final oz E;
    public final si F;
    public final le.c f10298n;
    public final FrameLayout f10299r;
    public final ai.w0 f10300s;
    public final e0 v;
    public final HashSet f10301w;
    public final f0 f10302x;
    public final g0 f10303y;

    public i0(Context context, e6 e6Var, wi wiVar) {
        super(context, e6Var, wiVar);
        this.f10298n = new le.c(0, this, sr.h, 380L, false);
        this.f10301w = new HashSet();
        this.f10303y = new g0(this, context);
        vi viVar = new vi(context, i6.f19057d6, e6Var);
        viVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10299r = frameLayout;
        si siVar = new si(context, e6Var, this.f27104b);
        this.F = siVar;
        siVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        c0 c0Var = new c0(this);
        h2 h2Var = siVar.f23850r;
        h2Var.addTextChangedListener(c0Var);
        h2Var.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(viVar, y5.g());
        FrameLayout.LayoutParams d = y5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(siVar, d);
        oz ozVar = new oz(context, e6Var);
        this.E = ozVar;
        ozVar.c();
        addView(ozVar, y5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ai.w0 w0Var = new ai.w0(this, context, e6Var, 3);
        this.f10300s = w0Var;
        w0Var.q1();
        setBlur3Capture(w0Var);
        this.d = w0Var;
        this.h = true;
        this.f27106f = true;
        NotificationCenter.getGlobalInstance().listen(w0Var, NotificationCenter.emojiLoaded, new ai.y1(this, 23));
        w0Var.setClipToPadding(false);
        getContext();
        e0 e0Var = new e0(this, AndroidUtilities.dp(9.0f), w0Var, 0);
        this.v = e0Var;
        w0Var.setLayoutManager(e0Var);
        e0Var.P = false;
        w0Var.setHorizontalScrollBarEnabled(false);
        w0Var.setVerticalScrollBarEnabled(false);
        w0Var.setClipToPadding(false);
        addView(w0Var, y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        f0 f0Var = new f0(this, context);
        this.f10302x = f0Var;
        w0Var.setAdapter(f0Var);
        w0Var.setGlowColor(i6.v0(i6.A5, this.f27103a));
        w0Var.setOnItemClickListener(new ai.g(this, 10));
        w0Var.setOnScrollListener(new ai.r(this, 9));
        FrameLayout.LayoutParams e = y5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        L();
    }

    public int getCurrentTop() {
        ai.w0 w0Var = this.f10300s;
        if (w0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = w0Var.getChildAt(0);
            il0 il0Var = (il0) w0Var.H(childAt);
            if (il0Var != null) {
                int paddingTop = w0Var.getPaddingTop();
                if (il0Var.b() == 0 && childAt.getTop() >= 0) {
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
        this.f10300s.y0(0);
    }

    public final void L() {
        boolean z10;
        int i10 = 0;
        if (this.f10300s.getAdapter().h() == 2) {
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
        oz ozVar = this.E;
        if (ozVar.getVisibility() != 0 || (childAt = this.f10300s.getChildAt(0)) == null) {
            return;
        }
        ozVar.setTranslationY((childAt.getTop() + (ozVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        ai.w0 w0Var = this.f10300s;
        if (w0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        il0 il0Var = (il0) w0Var.H(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && il0Var != null && il0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        le.c cVar = this.f10298n;
        if (top >= 0 && il0Var != null && il0Var.b() == 0) {
            cVar.a(false, true);
        } else {
            cVar.a(true, true);
            top = i10;
        }
        this.f10299r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f10300s.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override
    public ArrayList<k6> getThemeDescriptions() {
        j6 j6Var = new j6() {
            @Override
            public final void b() {
                ai.w0 w0Var = i0.this.f10300s;
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
        ArrayList<k6> arrayList = new ArrayList<>();
        arrayList.add(new k6(this.E, 4, null, null, null, null, i6.f19040c7));
        arrayList.add(new k6(this.E, 2048, null, null, null, null, i6.f19129h6));
        int i10 = i6.A5;
        ai.w0 w0Var = this.f10300s;
        arrayList.add(new k6(w0Var, 32768, null, null, null, null, i10));
        arrayList.add(new k6(w0Var, 4096, null, null, null, null, i6.f19147i6));
        arrayList.add(new k6(w0Var, 0, new Class[]{View.class}, i6.f19179k0, null, null, i6.f19058d7));
        int i11 = i6.f19296q5;
        arrayList.add(new k6(w0Var, 0, new Class[]{h0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new k6(w0Var, 0, new Class[]{h0.class}, new String[]{"statusTextView"}, null, null, -1, j6Var, i11));
        arrayList.add(new k6(w0Var, 0, new Class[]{h0.class}, null, i6.f19310r0, null, i6.J7));
        arrayList.add(new k6(null, 0, null, null, null, j6Var, i6.O7));
        arrayList.add(new k6(null, 0, null, null, null, j6Var, i6.P7));
        arrayList.add(new k6(null, 0, null, null, null, j6Var, i6.Q7));
        arrayList.add(new k6(null, 0, null, null, null, j6Var, i6.R7));
        arrayList.add(new k6(null, 0, null, null, null, j6Var, i6.S7));
        arrayList.add(new k6(null, 0, null, null, null, j6Var, i6.T7));
        arrayList.add(new k6(null, 0, null, null, null, j6Var, i6.U7));
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
        this.f27104b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ah.c cVar) {
        si siVar = this.F;
        if (siVar != null) {
            siVar.setupBlurredBackground(cVar.c(siVar, eh.b.a(this.f27103a), false));
        }
    }

    @Override
    public final void y(int i10, int i11) {
        int i12;
        wi wiVar = this.f27104b;
        if (wiVar.f29999r1.R() > AndroidUtilities.dp(20.0f)) {
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
        this.f10300s.p1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
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
