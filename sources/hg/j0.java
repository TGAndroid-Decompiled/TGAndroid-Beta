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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.zi;
import w7.w5;
public final class j0 extends si implements NotificationCenter.NotificationCenterDelegate, me.d {
    public final f00 E;
    public final wi F;
    public final me.b f11272n;
    public final FrameLayout f11273r;
    public final ai.w0 f11274s;
    public final f0 v;
    public final HashSet f11275w;
    public final g0 f11276x;
    public final h0 f11277y;

    public j0(Context context, c6 c6Var, aj ajVar) {
        super(context, c6Var, ajVar);
        this.f11272n = new me.b(0, this, js.h, 380L, false);
        this.f11275w = new HashSet();
        this.f11277y = new h0(this, context);
        zi ziVar = new zi(context, h6.f20559d6, c6Var);
        ziVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f11273r = frameLayout;
        wi wiVar = new wi(context, c6Var, this.f30574b);
        this.F = wiVar;
        wiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        d0 d0Var = new d0(this);
        ci.g2 g2Var = wiVar.f31362r;
        g2Var.addTextChangedListener(d0Var);
        g2Var.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(ziVar, w5.g());
        FrameLayout.LayoutParams a2 = w5.a(48.0f, 7.0f, 8.0f, 7.0f, 4.0f, -1, 51);
        ((ViewGroup.MarginLayoutParams) a2).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(wiVar, a2);
        f00 f00Var = new f00(context, c6Var);
        this.E = f00Var;
        f00Var.c();
        addView(f00Var, w5.a(-1.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 51));
        ai.w0 w0Var = new ai.w0(this, context, c6Var, 3);
        this.f11274s = w0Var;
        w0Var.p1();
        this.f30575c = w0Var;
        this.d = w0Var;
        this.h = true;
        this.f30577f = true;
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
        addView(w0Var, w5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        g0 g0Var = new g0(this, context);
        this.f11276x = g0Var;
        w0Var.setAdapter(g0Var);
        w0Var.setGlowColor(h6.w0(h6.A5, this.f30573a));
        w0Var.setOnItemClickListener(new ai.g(this, 10));
        w0Var.setOnScrollListener(new ai.r(this, 9));
        FrameLayout.LayoutParams e7 = w5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e7).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e7);
        O();
    }

    public int getCurrentTop() {
        ai.w0 w0Var = this.f11274s;
        if (w0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = w0Var.getChildAt(0);
            gm0 gm0Var = (gm0) w0Var.G(childAt);
            if (gm0Var != null) {
                int paddingTop = w0Var.getPaddingTop();
                if (gm0Var.b() == 0 && childAt.getTop() >= 0) {
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
        aj ajVar = this.f30574b;
        if (ajVar.f24389u1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            ajVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    ajVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            ajVar.setAllowNestedScroll(true);
        }
        this.f11274s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.f30576e);
    }

    @Override
    public final void G(si siVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f11274s.x0(0);
    }

    public final void O() {
        boolean z10;
        int i10 = 0;
        if (this.f11274s.getAdapter().h() == 2) {
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
        f00 f00Var = this.E;
        if (f00Var.getVisibility() != 0 || (childAt = this.f11274s.getChildAt(0)) == null) {
            return;
        }
        f00Var.setTranslationY((childAt.getTop() + (f00Var.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        ai.w0 w0Var = this.f11274s;
        if (w0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        gm0 gm0Var = (gm0) w0Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && gm0Var != null && gm0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        me.b bVar = this.f11272n;
        if (top >= 0 && gm0Var != null && gm0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f11273r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f11274s.getPaddingTop();
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
                ai.w0 w0Var = j0.this.f11274s;
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
        arrayList.add(new j6(this.E, 4, null, null, null, null, h6.f20543c7));
        arrayList.add(new j6(this.E, 2048, null, null, null, null, h6.f20631h6));
        int i10 = h6.A5;
        ai.w0 w0Var = this.f11274s;
        arrayList.add(new j6(w0Var, 32768, null, null, null, null, i10));
        arrayList.add(new j6(w0Var, 4096, null, null, null, null, h6.f20650i6));
        arrayList.add(new j6(w0Var, 0, new Class[]{View.class}, h6.f20681k0, null, null, h6.f20560d7));
        int i11 = h6.f20798q5;
        arrayList.add(new j6(w0Var, 0, new Class[]{i0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new j6(w0Var, 0, new Class[]{i0.class}, new String[]{"statusTextView"}, null, null, -1, i6Var, i11));
        arrayList.add(new j6(w0Var, 0, new Class[]{i0.class}, null, h6.f20812r0, null, h6.J7));
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
        this.f30574b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ah.c cVar) {
        wi wiVar = this.F;
        if (wiVar != null) {
            wiVar.setupBlurredBackground(cVar.c(wiVar, eh.b.a(this.f30573a), false));
        }
    }

    @Override
    public final void p() {
    }

    @Override
    public final void C(float f7, int i10) {
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
    }
}
