package gg;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.t2;
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
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.yi;
import w7.a6;
public final class n0 extends qi implements NotificationCenter.NotificationCenterDelegate, le.d {
    public final tz E;
    public final ui F;
    public final le.b f8962n;
    public final FrameLayout f8963r;
    public final bi.y1 f8964s;
    public final j0 v;
    public final HashSet f8965w;
    public final k0 f8966x;
    public final l0 f8967y;

    public n0(Context context, f6 f6Var, yi yiVar) {
        super(context, f6Var, yiVar);
        this.f8962n = new le.b(0, this, wr.h, 380L, false);
        this.f8965w = new HashSet();
        this.f8967y = new l0(this, context);
        xi xiVar = new xi(context, j6.f17928d6, f6Var);
        xiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8963r = frameLayout;
        ui uiVar = new ui(context, f6Var, this.f26422b);
        this.F = uiVar;
        uiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        h0 h0Var = new h0(this);
        t2 t2Var = uiVar.f24572r;
        t2Var.addTextChangedListener(h0Var);
        t2Var.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(xiVar, a6.g());
        FrameLayout.LayoutParams d = a6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(uiVar, d);
        tz tzVar = new tz(context, f6Var);
        this.E = tzVar;
        tzVar.c();
        addView(tzVar, a6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        bi.y1 y1Var = new bi.y1(this, context, f6Var, 2);
        this.f8964s = y1Var;
        y1Var.o1();
        this.f26423c = y1Var;
        this.d = y1Var;
        this.h = true;
        this.f26424f = true;
        NotificationCenter.getGlobalInstance().listen(y1Var, NotificationCenter.emojiLoaded, new ai.b(this, 16));
        y1Var.setClipToPadding(false);
        getContext();
        j0 j0Var = new j0(this, AndroidUtilities.dp(9.0f), y1Var, 0);
        this.v = j0Var;
        y1Var.setLayoutManager(j0Var);
        j0Var.P = false;
        y1Var.setHorizontalScrollBarEnabled(false);
        y1Var.setVerticalScrollBarEnabled(false);
        y1Var.setClipToPadding(false);
        addView(y1Var, a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        k0 k0Var = new k0(this, context);
        this.f8966x = k0Var;
        y1Var.setAdapter(k0Var);
        y1Var.setGlowColor(j6.v0(j6.A5, this.f26421a));
        y1Var.setOnItemClickListener(new ai.g(this, 9));
        y1Var.setOnScrollListener(new bi.a2(this, 8));
        FrameLayout.LayoutParams e = a6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        L();
    }

    public int getCurrentTop() {
        bi.y1 y1Var = this.f8964s;
        if (y1Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = y1Var.getChildAt(0);
            fl0 fl0Var = (fl0) y1Var.G(childAt);
            if (fl0Var != null) {
                int paddingTop = y1Var.getPaddingTop();
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
    public final void D(qi qiVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f8964s.x0(0);
    }

    public final void L() {
        boolean z10;
        int i10 = 0;
        if (this.f8964s.getAdapter().h() == 2) {
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
        tz tzVar = this.E;
        if (tzVar.getVisibility() != 0 || (childAt = this.f8964s.getChildAt(0)) == null) {
            return;
        }
        tzVar.setTranslationY((childAt.getTop() + (tzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        bi.y1 y1Var = this.f8964s;
        if (y1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = y1Var.getChildAt(0);
        fl0 fl0Var = (fl0) y1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && fl0Var != null && fl0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        le.b bVar = this.f8962n;
        if (top >= 0 && fl0Var != null && fl0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f8963r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f8964s.getPaddingTop();
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
                bi.y1 y1Var = n0.this.f8964s;
                if (y1Var != null) {
                    int childCount = y1Var.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        y1Var.getChildAt(i10);
                    }
                }
            }

            @Override
            public final void a(float f7) {
            }
        };
        ArrayList<l6> arrayList = new ArrayList<>();
        arrayList.add(new l6(this.E, 4, null, null, null, null, j6.f17911c7));
        arrayList.add(new l6(this.E, 2048, null, null, null, null, j6.f17999h6));
        int i10 = j6.A5;
        bi.y1 y1Var = this.f8964s;
        arrayList.add(new l6(y1Var, 32768, null, null, null, null, i10));
        arrayList.add(new l6(y1Var, 4096, null, null, null, null, j6.f18017i6));
        arrayList.add(new l6(y1Var, 0, new Class[]{View.class}, j6.f18049k0, null, null, j6.f17929d7));
        int i11 = j6.f18161q5;
        arrayList.add(new l6(y1Var, 0, new Class[]{m0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new l6(y1Var, 0, new Class[]{m0.class}, new String[]{"statusTextView"}, null, null, -1, k6Var, i11));
        arrayList.add(new l6(y1Var, 0, new Class[]{m0.class}, null, j6.f18174r0, null, j6.J7));
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
        this.f26422b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(zg.a aVar) {
        ui uiVar = this.F;
        if (uiVar != null) {
            uiVar.setupBlurredBackground(aVar.c(uiVar, dh.c.a(this.f26421a), false));
        }
    }

    @Override
    public final void y(int i10, int i11) {
        int i12;
        yi yiVar = this.f26422b;
        if (yiVar.f29403r1.R() > AndroidUtilities.dp(20.0f)) {
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
        this.f8964s.n1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override
    public final void m() {
    }

    @Override
    public final void B(float f7, int i10) {
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
    }
}
