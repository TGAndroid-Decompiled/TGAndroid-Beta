package ig;

import ai.wa;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.vz;
import w7.z5;
public final class i0 extends li implements NotificationCenter.NotificationCenterDelegate, ne.d {
    public final vz E;
    public final pi F;
    public final ne.b f12915n;
    public final FrameLayout f12916r;
    public final ai.u1 f12917s;
    public final e0 v;
    public final HashSet f12918w;
    public final f0 f12919x;
    public final g0 f12920y;

    public i0(Context context, d6 d6Var, ti tiVar) {
        super(context, d6Var, tiVar);
        this.f12915n = new ne.b(0, this, bs.h, 380L, false);
        this.f12918w = new HashSet();
        this.f12920y = new g0(this, context);
        si siVar = new si(context, h6.f20993d6, d6Var);
        siVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12916r = frameLayout;
        pi piVar = new pi(context, d6Var, this.f28176b);
        this.F = piVar;
        piVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        c0 c0Var = new c0(this);
        ei.e2 e2Var = piVar.f27729r;
        e2Var.addTextChangedListener(c0Var);
        e2Var.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(siVar, z5.g());
        FrameLayout.LayoutParams d = z5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(piVar, d);
        vz vzVar = new vz(context, d6Var);
        this.E = vzVar;
        vzVar.c();
        addView(vzVar, z5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ai.u1 u1Var = new ai.u1(this, context, d6Var, 4);
        this.f12917s = u1Var;
        u1Var.p1();
        this.f28177c = u1Var;
        this.d = u1Var;
        this.h = true;
        this.f28178f = true;
        NotificationCenter.getGlobalInstance().listen(u1Var, NotificationCenter.emojiLoaded, new ai.r0(this, 29));
        u1Var.setClipToPadding(false);
        getContext();
        e0 e0Var = new e0(this, AndroidUtilities.dp(9.0f), u1Var, 0);
        this.v = e0Var;
        u1Var.setLayoutManager(e0Var);
        e0Var.P = false;
        u1Var.setHorizontalScrollBarEnabled(false);
        u1Var.setVerticalScrollBarEnabled(false);
        u1Var.setClipToPadding(false);
        addView(u1Var, z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        f0 f0Var = new f0(this, context);
        this.f12919x = f0Var;
        u1Var.setAdapter(f0Var);
        u1Var.setGlowColor(h6.w0(h6.A5, this.f28175a));
        u1Var.setOnItemClickListener(new wa(this, 14));
        u1Var.setOnScrollListener(new ah.d0(this, 14));
        FrameLayout.LayoutParams e = z5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        O();
    }

    public int getCurrentTop() {
        ai.u1 u1Var = this.f12917s;
        if (u1Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = u1Var.getChildAt(0);
            tl0 tl0Var = (tl0) u1Var.G(childAt);
            if (tl0Var != null) {
                int paddingTop = u1Var.getPaddingTop();
                if (tl0Var.b() == 0 && childAt.getTop() >= 0) {
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
        ti tiVar = this.f28176b;
        if (tiVar.f30596u1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            tiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    tiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            tiVar.setAllowNestedScroll(true);
        }
        this.f12917s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override
    public final void F(li liVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f12917s.x0(0);
    }

    public final void O() {
        boolean z10;
        int i10 = 0;
        if (this.f12917s.getAdapter().h() == 2) {
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
        vz vzVar = this.E;
        if (vzVar.getVisibility() != 0 || (childAt = this.f12917s.getChildAt(0)) == null) {
            return;
        }
        vzVar.setTranslationY((childAt.getTop() + (vzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        ai.u1 u1Var = this.f12917s;
        if (u1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = u1Var.getChildAt(0);
        tl0 tl0Var = (tl0) u1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && tl0Var != null && tl0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        ne.b bVar = this.f12915n;
        if (top >= 0 && tl0Var != null && tl0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f12916r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f12917s.getPaddingTop();
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
                ai.u1 u1Var = i0.this.f12917s;
                if (u1Var != null) {
                    int childCount = u1Var.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        u1Var.getChildAt(i10);
                    }
                }
            }

            @Override
            public final void a(float f7) {
            }
        };
        ArrayList<j6> arrayList = new ArrayList<>();
        arrayList.add(new j6(this.E, 4, null, null, null, null, h6.f20975c7));
        arrayList.add(new j6(this.E, 2048, null, null, null, null, h6.f21065h6));
        int i10 = h6.A5;
        ai.u1 u1Var = this.f12917s;
        arrayList.add(new j6(u1Var, 32768, null, null, null, null, i10));
        arrayList.add(new j6(u1Var, 4096, null, null, null, null, h6.f21082i6));
        arrayList.add(new j6(u1Var, 0, new Class[]{View.class}, h6.f21114k0, null, null, h6.f20994d7));
        int i11 = h6.f21230q5;
        arrayList.add(new j6(u1Var, 0, new Class[]{h0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new j6(u1Var, 0, new Class[]{h0.class}, new String[]{"statusTextView"}, null, null, -1, i6Var, i11));
        arrayList.add(new j6(u1Var, 0, new Class[]{h0.class}, null, h6.f21244r0, null, h6.J7));
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
        this.f28176b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(bh.b bVar) {
        pi piVar = this.F;
        if (piVar != null) {
            piVar.setupBlurredBackground(bVar.c(piVar, fh.c.a(this.f28175a), false));
        }
    }

    @Override
    public final void o() {
    }

    @Override
    public final void H(float f7, int i10) {
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override
    public final void r(int i10, float f7, float f10, ne.e eVar) {
    }
}
