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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.yi;
import w7.x5;
public final class j0 extends qi implements NotificationCenter.NotificationCenterDelegate, me.d {
    public final d00 E;
    public final ui F;
    public final me.b f11273n;
    public final FrameLayout f11274r;
    public final ai.w0 f11275s;
    public final f0 v;
    public final HashSet f11276w;
    public final g0 f11277x;
    public final h0 f11278y;

    public j0(Context context, d6 d6Var, yi yiVar) {
        super(context, d6Var, yiVar);
        this.f11273n = new me.b(0, this, is.h, 380L, false);
        this.f11276w = new HashSet();
        this.f11278y = new h0(this, context);
        xi xiVar = new xi(context, h6.f20786d6, d6Var);
        xiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f11274r = frameLayout;
        ui uiVar = new ui(context, d6Var, this.f30161b);
        this.F = uiVar;
        uiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        d0 d0Var = new d0(this);
        ci.g2 g2Var = uiVar.f30964r;
        g2Var.addTextChangedListener(d0Var);
        g2Var.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(xiVar, x5.g());
        FrameLayout.LayoutParams a2 = x5.a(48.0f, 7.0f, 8.0f, 7.0f, 4.0f, -1, 51);
        ((ViewGroup.MarginLayoutParams) a2).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(uiVar, a2);
        d00 d00Var = new d00(context, d6Var);
        this.E = d00Var;
        d00Var.c();
        addView(d00Var, x5.a(-1.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 51));
        ai.w0 w0Var = new ai.w0(this, context, d6Var, 3);
        this.f11275s = w0Var;
        w0Var.p1();
        this.f30162c = w0Var;
        this.d = w0Var;
        this.h = true;
        this.f30164f = true;
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
        this.f11277x = g0Var;
        w0Var.setAdapter(g0Var);
        w0Var.setGlowColor(h6.w0(h6.A5, this.f30160a));
        w0Var.setOnItemClickListener(new ai.g(this, 10));
        w0Var.setOnScrollListener(new ai.r(this, 9));
        FrameLayout.LayoutParams e7 = x5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e7).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e7);
        O();
    }

    public int getCurrentTop() {
        ai.w0 w0Var = this.f11275s;
        if (w0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = w0Var.getChildAt(0);
            cm0 cm0Var = (cm0) w0Var.G(childAt);
            if (cm0Var != null) {
                int paddingTop = w0Var.getPaddingTop();
                if (cm0Var.b() == 0 && childAt.getTop() >= 0) {
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
        yi yiVar = this.f30161b;
        if (yiVar.f33263u1.R() > AndroidUtilities.dp(20.0f)) {
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
        this.f11275s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.f30163e);
    }

    @Override
    public final void G(qi qiVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f11275s.x0(0);
    }

    public final void O() {
        boolean z10;
        int i10 = 0;
        if (this.f11275s.getAdapter().h() == 2) {
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
        d00 d00Var = this.E;
        if (d00Var.getVisibility() != 0 || (childAt = this.f11275s.getChildAt(0)) == null) {
            return;
        }
        d00Var.setTranslationY((childAt.getTop() + (d00Var.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        ai.w0 w0Var = this.f11275s;
        if (w0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        cm0 cm0Var = (cm0) w0Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && cm0Var != null && cm0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        me.b bVar = this.f11273n;
        if (top >= 0 && cm0Var != null && cm0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f11274r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f11275s.getPaddingTop();
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
                ai.w0 w0Var = j0.this.f11275s;
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
        arrayList.add(new j6(this.E, 4, null, null, null, null, h6.f20770c7));
        arrayList.add(new j6(this.E, 2048, null, null, null, null, h6.f20858h6));
        int i10 = h6.A5;
        ai.w0 w0Var = this.f11275s;
        arrayList.add(new j6(w0Var, 32768, null, null, null, null, i10));
        arrayList.add(new j6(w0Var, 4096, null, null, null, null, h6.f20877i6));
        arrayList.add(new j6(w0Var, 0, new Class[]{View.class}, h6.f20908k0, null, null, h6.f20787d7));
        int i11 = h6.f21025q5;
        arrayList.add(new j6(w0Var, 0, new Class[]{i0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new j6(w0Var, 0, new Class[]{i0.class}, new String[]{"statusTextView"}, null, null, -1, i6Var, i11));
        arrayList.add(new j6(w0Var, 0, new Class[]{i0.class}, null, h6.f21039r0, null, h6.J7));
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
        P();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30161b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ah.c cVar) {
        ui uiVar = this.F;
        if (uiVar != null) {
            uiVar.setupBlurredBackground(cVar.c(uiVar, eh.b.a(this.f30160a), false));
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
