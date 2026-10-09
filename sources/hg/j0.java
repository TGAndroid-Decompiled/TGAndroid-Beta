package hg;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.yi;
import w7.x5;
public final class j0 extends qi implements NotificationCenter.NotificationCenterDelegate, me.d {
    public final c00 E;
    public final ui F;
    public final me.b f11274n;
    public final FrameLayout f11275r;
    public final ai.w0 f11276s;
    public final f0 v;
    public final HashSet f11277w;
    public final g0 f11278x;
    public final h0 f11279y;

    public j0(Context context, e6 e6Var, yi yiVar) {
        super(context, e6Var, yiVar);
        this.f11274n = new me.b(0, this, hs.h, 380L, false);
        this.f11277w = new HashSet();
        this.f11279y = new h0(this, context);
        xi xiVar = new xi(context, i6.f20797d6, e6Var);
        xiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f11275r = frameLayout;
        ui uiVar = new ui(context, e6Var, this.f30173b);
        this.F = uiVar;
        uiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        d0 d0Var = new d0(this);
        ci.g2 g2Var = uiVar.f30614r;
        g2Var.addTextChangedListener(d0Var);
        g2Var.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(xiVar, x5.g());
        FrameLayout.LayoutParams a2 = x5.a(48.0f, 7.0f, 8.0f, 7.0f, 4.0f, -1, 51);
        ((ViewGroup.MarginLayoutParams) a2).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(uiVar, a2);
        c00 c00Var = new c00(context, e6Var);
        this.E = c00Var;
        c00Var.c();
        addView(c00Var, x5.a(-1.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 51));
        ai.w0 w0Var = new ai.w0(this, context, e6Var, 3);
        this.f11276s = w0Var;
        w0Var.p1();
        this.f30174c = w0Var;
        this.d = w0Var;
        this.h = true;
        this.f30176f = true;
        NotificationCenter.getGlobalInstance().listen(w0Var, NotificationCenter.emojiLoaded, new ai.y1(this, 23));
        w0Var.setClipToPadding(false);
        getContext();
        f0 f0Var = new f0(this, AndroidUtilities.dp(9.0f), w0Var, 0);
        this.v = f0Var;
        w0Var.setLayoutManager(f0Var);
        f0Var.P = false;
        w0Var.setHorizontalScrollBarEnabled(false);
        w0Var.setVerticalScrollBarEnabled(false);
        w0Var.setClipToPadding(false);
        addView(w0Var, x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        g0 g0Var = new g0(this, context);
        this.f11278x = g0Var;
        w0Var.setAdapter(g0Var);
        w0Var.setGlowColor(i6.w0(i6.A5, this.f30172a));
        w0Var.setOnItemClickListener(new ai.g(this, 10));
        w0Var.setOnScrollListener(new ai.r(this, 9));
        FrameLayout.LayoutParams e7 = x5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e7).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e7);
        O();
    }

    public int getCurrentTop() {
        ai.w0 w0Var = this.f11276s;
        if (w0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = w0Var.getChildAt(0);
            am0 am0Var = (am0) w0Var.G(childAt);
            if (am0Var != null) {
                int paddingTop = w0Var.getPaddingTop();
                if (am0Var.b() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void C(int i10, int i11) {
        int i12;
        yi yiVar = this.f30173b;
        if (yiVar.f33275u1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            yiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    yiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            yiVar.setAllowNestedScroll(true);
        }
        this.f11276s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.f30175e);
    }

    @Override
    public final void G(qi qiVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f11276s.x0(0);
    }

    public final void O() {
        boolean z10;
        int i10 = 0;
        if (this.f11276s.getAdapter().h() == 2) {
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
        c00 c00Var = this.E;
        if (c00Var.getVisibility() != 0 || (childAt = this.f11276s.getChildAt(0)) == null) {
            return;
        }
        c00Var.setTranslationY((childAt.getTop() + (c00Var.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        ai.w0 w0Var = this.f11276s;
        if (w0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        am0 am0Var = (am0) w0Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && am0Var != null && am0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        me.b bVar = this.f11274n;
        if (top >= 0 && am0Var != null && am0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f11275r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f11276s.getPaddingTop();
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
                ai.w0 w0Var = j0.this.f11276s;
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
        arrayList.add(new k6(this.E, 4, null, null, null, null, i6.f20781c7));
        arrayList.add(new k6(this.E, 2048, null, null, null, null, i6.f20869h6));
        int i10 = i6.A5;
        ai.w0 w0Var = this.f11276s;
        arrayList.add(new k6(w0Var, 32768, null, null, null, null, i10));
        arrayList.add(new k6(w0Var, 4096, null, null, null, null, i6.f20888i6));
        arrayList.add(new k6(w0Var, 0, new Class[]{View.class}, i6.f20919k0, null, null, i6.f20798d7));
        int i11 = i6.f21036q5;
        arrayList.add(new k6(w0Var, 0, new Class[]{i0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new k6(w0Var, 0, new Class[]{i0.class}, new String[]{"statusTextView"}, null, null, -1, j6Var, i11));
        arrayList.add(new k6(w0Var, 0, new Class[]{i0.class}, null, i6.f21049r0, null, i6.J7));
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
        P();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30173b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ah.c cVar) {
        ui uiVar = this.F;
        if (uiVar != null) {
            uiVar.setupBlurredBackground(cVar.c(uiVar, eh.b.a(this.f30172a), false));
        }
    }

    @Override
    public final void p() {
    }

    @Override
    public final void A(float f7, int i10) {
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
    }
}
