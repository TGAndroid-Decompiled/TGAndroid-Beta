package ig;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import di.h2;
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
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vk0;
import w7.x5;
public final class i0 extends ni implements NotificationCenter.NotificationCenterDelegate, le.d {
    public final mz E;
    public final ri F;
    public final le.b f12117n;
    public final FrameLayout f12118r;
    public final bi.o0 f12119s;
    public final e0 v;
    public final HashSet f12120w;
    public final f0 f12121x;
    public final g0 f12122y;

    public i0(Context context, f6 f6Var, vi viVar) {
        super(context, f6Var, viVar);
        this.f12117n = new le.b(0, this, pr.h, 380L, false);
        this.f12120w = new HashSet();
        this.f12122y = new g0(this, context);
        ui uiVar = new ui(context, j6.f20690d6, f6Var);
        uiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12118r = frameLayout;
        ri riVar = new ri(context, f6Var, this.f28780b);
        this.F = riVar;
        riVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        c0 c0Var = new c0(this);
        h2 h2Var = riVar.f24549r;
        h2Var.addTextChangedListener(c0Var);
        h2Var.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(uiVar, x5.g());
        FrameLayout.LayoutParams d = x5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(riVar, d);
        mz mzVar = new mz(context, f6Var);
        this.E = mzVar;
        mzVar.c();
        addView(mzVar, x5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        bi.o0 o0Var = new bi.o0(this, context, f6Var, 3);
        this.f12119s = o0Var;
        o0Var.o1();
        this.f28781c = o0Var;
        this.d = o0Var;
        this.h = true;
        this.f28783f = true;
        NotificationCenter.getGlobalInstance().listen(o0Var, NotificationCenter.emojiLoaded, new bi.o1(this, 20));
        o0Var.setClipToPadding(false);
        getContext();
        e0 e0Var = new e0(this, AndroidUtilities.dp(9.0f), o0Var, 0);
        this.v = e0Var;
        o0Var.setLayoutManager(e0Var);
        e0Var.P = false;
        o0Var.setHorizontalScrollBarEnabled(false);
        o0Var.setVerticalScrollBarEnabled(false);
        o0Var.setClipToPadding(false);
        addView(o0Var, x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        f0 f0Var = new f0(this, context);
        this.f12121x = f0Var;
        o0Var.setAdapter(f0Var);
        o0Var.setGlowColor(j6.v0(j6.A5, this.f28779a));
        o0Var.setOnItemClickListener(new bi.d(this, 10));
        o0Var.setOnScrollListener(new ah.e0(this, 11));
        FrameLayout.LayoutParams e7 = x5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e7).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e7);
        L();
    }

    public int getCurrentTop() {
        bi.o0 o0Var = this.f12119s;
        if (o0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = o0Var.getChildAt(0);
            vk0 vk0Var = (vk0) o0Var.G(childAt);
            if (vk0Var != null) {
                int paddingTop = o0Var.getPaddingTop();
                if (vk0Var.b() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void D(ni niVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f12119s.x0(0);
    }

    public final void L() {
        boolean z10;
        int i10 = 0;
        if (this.f12119s.getAdapter().h() == 2) {
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
        if (mzVar.getVisibility() != 0 || (childAt = this.f12119s.getChildAt(0)) == null) {
            return;
        }
        mzVar.setTranslationY((childAt.getTop() + (mzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        bi.o0 o0Var = this.f12119s;
        if (o0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = o0Var.getChildAt(0);
        vk0 vk0Var = (vk0) o0Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && vk0Var != null && vk0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        le.b bVar = this.f12117n;
        if (top >= 0 && vk0Var != null && vk0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f12118r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f12119s.getPaddingTop();
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
                bi.o0 o0Var = i0.this.f12119s;
                if (o0Var != null) {
                    int childCount = o0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        o0Var.getChildAt(i10);
                    }
                }
            }

            @Override
            public final void a(float f7) {
            }
        };
        ArrayList<l6> arrayList = new ArrayList<>();
        arrayList.add(new l6(this.E, 4, null, null, null, null, j6.f20673c7));
        arrayList.add(new l6(this.E, 2048, null, null, null, null, j6.f20762h6));
        int i10 = j6.A5;
        bi.o0 o0Var = this.f12119s;
        arrayList.add(new l6(o0Var, 32768, null, null, null, null, i10));
        arrayList.add(new l6(o0Var, 4096, null, null, null, null, j6.f20780i6));
        arrayList.add(new l6(o0Var, 0, new Class[]{View.class}, j6.f20812k0, null, null, j6.f20691d7));
        int i11 = j6.f20924q5;
        arrayList.add(new l6(o0Var, 0, new Class[]{h0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new l6(o0Var, 0, new Class[]{h0.class}, new String[]{"statusTextView"}, null, null, -1, k6Var, i11));
        arrayList.add(new l6(o0Var, 0, new Class[]{h0.class}, null, j6.f20937r0, null, j6.J7));
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
        this.f28780b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(bh.b bVar) {
        ri riVar = this.F;
        if (riVar != null) {
            riVar.setupBlurredBackground(bVar.c(riVar, fh.b.a(this.f28779a), false));
        }
    }

    @Override
    public final void y(int i10, int i11) {
        int i12;
        vi viVar = this.f28780b;
        if (viVar.f31343r1.R() > AndroidUtilities.dp(20.0f)) {
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
        this.f12119s.n1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.f28782e);
    }

    @Override
    public final void m() {
    }

    @Override
    public final void z(float f7, int i10) {
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
    }
}
