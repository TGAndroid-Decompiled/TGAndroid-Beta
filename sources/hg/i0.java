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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.vi;
import w7.y5;
public final class i0 extends ni implements NotificationCenter.NotificationCenterDelegate, le.d {
    public final mz E;
    public final ri F;
    public final le.b f10311n;
    public final FrameLayout f10312r;
    public final ai.w0 f10313s;
    public final e0 v;
    public final HashSet f10314w;
    public final f0 f10315x;
    public final g0 f10316y;

    public i0(Context context, f6 f6Var, vi viVar) {
        super(context, f6Var, viVar);
        this.f10311n = new le.b(0, this, qr.h, 380L, false);
        this.f10314w = new HashSet();
        this.f10316y = new g0(this, context);
        ui uiVar = new ui(context, j6.f19094d6, f6Var);
        uiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10312r = frameLayout;
        ri riVar = new ri(context, f6Var, this.f26655b);
        this.F = riVar;
        riVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        c0 c0Var = new c0(this);
        h2 h2Var = riVar.f22856r;
        h2Var.addTextChangedListener(c0Var);
        h2Var.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(uiVar, y5.g());
        FrameLayout.LayoutParams d = y5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(riVar, d);
        mz mzVar = new mz(context, f6Var);
        this.E = mzVar;
        mzVar.c();
        addView(mzVar, y5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ai.w0 w0Var = new ai.w0(this, context, f6Var, 3);
        this.f10313s = w0Var;
        w0Var.q1();
        this.f26656c = w0Var;
        this.d = w0Var;
        this.h = true;
        this.f26657f = true;
        NotificationCenter.getGlobalInstance().listen(w0Var, NotificationCenter.emojiLoaded, new ai.y1(this, 20));
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
        this.f10315x = f0Var;
        w0Var.setAdapter(f0Var);
        w0Var.setGlowColor(j6.v0(j6.A5, this.f26654a));
        w0Var.setOnItemClickListener(new ai.g(this, 10));
        w0Var.setOnScrollListener(new ai.r(this, 10));
        FrameLayout.LayoutParams e = y5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        L();
    }

    public int getCurrentTop() {
        ai.w0 w0Var = this.f10313s;
        if (w0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = w0Var.getChildAt(0);
            fl0 fl0Var = (fl0) w0Var.H(childAt);
            if (fl0Var != null) {
                int paddingTop = w0Var.getPaddingTop();
                if (fl0Var.b() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void E(ni niVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f10313s.y0(0);
    }

    public final void L() {
        boolean z10;
        int i10 = 0;
        if (this.f10313s.getAdapter().h() == 2) {
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
        mz mzVar = this.E;
        if (mzVar.getVisibility() != 0 || (childAt = this.f10313s.getChildAt(0)) == null) {
            return;
        }
        mzVar.setTranslationY((childAt.getTop() + (mzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        ai.w0 w0Var = this.f10313s;
        if (w0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        fl0 fl0Var = (fl0) w0Var.H(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && fl0Var != null && fl0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        le.b bVar = this.f10311n;
        if (top >= 0 && fl0Var != null && fl0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f10312r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f10313s.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override
    public ArrayList<l6> getThemeDescriptions() {
        k6 k6Var = new k6() {
            @Override
            public final void b() {
                ai.w0 w0Var = i0.this.f10313s;
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
        ArrayList<l6> arrayList = new ArrayList<>();
        arrayList.add(new l6(this.E, 4, null, null, null, null, j6.f19077c7));
        arrayList.add(new l6(this.E, 2048, null, null, null, null, j6.f19166h6));
        int i10 = j6.A5;
        ai.w0 w0Var = this.f10313s;
        arrayList.add(new l6(w0Var, 32768, null, null, null, null, i10));
        arrayList.add(new l6(w0Var, 4096, null, null, null, null, j6.f19184i6));
        arrayList.add(new l6(w0Var, 0, new Class[]{View.class}, j6.f19216k0, null, null, j6.f19095d7));
        int i11 = j6.f19332q5;
        arrayList.add(new l6(w0Var, 0, new Class[]{h0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new l6(w0Var, 0, new Class[]{h0.class}, new String[]{"statusTextView"}, null, null, -1, k6Var, i11));
        arrayList.add(new l6(w0Var, 0, new Class[]{h0.class}, null, j6.f19345r0, null, j6.J7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.O7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.P7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.Q7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.R7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.S7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.T7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.U7));
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
        this.f26655b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ah.c cVar) {
        ri riVar = this.F;
        if (riVar != null) {
            riVar.setupBlurredBackground(cVar.c(riVar, eh.b.a(this.f26654a), false));
        }
    }

    @Override
    public final void y(int i10, int i11) {
        int i12;
        vi viVar = this.f26655b;
        if (viVar.f29135r1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            viVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    viVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            viVar.setAllowNestedScroll(true);
        }
        this.f10313s.p1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
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
    public final void D(int i10, float f7, float f10, le.e eVar) {
    }
}
