package jg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.g7;
import org.telegram.ui.ActionBar.h7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.vl0;
public final class i0 extends li implements p6, NotificationCenter.NotificationCenterDelegate, oe.d {
    public final uz E;
    public final pi F;
    public final oe.b f15727n;
    public final FrameLayout f15728r;
    public final bi.r1 f15729s;
    public final e0 v;
    public final HashSet f15730w;
    public final f0 f15731x;
    public final g0 f15732y;

    public i0(Context context, u6 u6Var, ti tiVar) {
        super(context, u6Var, tiVar);
        this.f15727n = new oe.b(0, this, ds.h, 380L, false);
        this.f15730w = new HashSet();
        this.f15732y = new g0(this, context);
        si siVar = new si(context, y6.f23354d6, u6Var);
        siVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15728r = frameLayout;
        pi piVar = new pi(context, u6Var, this.f30213b);
        this.F = piVar;
        piVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        c0 c0Var = new c0(this);
        fi.c2 c2Var = piVar.f30365r;
        c2Var.addTextChangedListener(c0Var);
        c2Var.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(siVar, gb1.k());
        FrameLayout.LayoutParams h = gb1.h(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) h).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(piVar, h);
        uz uzVar = new uz(context, u6Var);
        this.E = uzVar;
        uzVar.c();
        addView(uzVar, gb1.h(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        bi.r1 r1Var = new bi.r1(this, context, u6Var, 4);
        this.f15729s = r1Var;
        r1Var.u1();
        setBlur3Capture(r1Var);
        this.d = r1Var;
        this.h = true;
        this.f30215f = true;
        NotificationCenter.getGlobalInstance().listen(r1Var, NotificationCenter.emojiLoaded, new ig.o(this, 3));
        r1Var.setClipToPadding(false);
        getContext();
        e0 e0Var = new e0(this, AndroidUtilities.dp(9.0f), r1Var, 0);
        this.v = e0Var;
        r1Var.setLayoutManager(e0Var);
        e0Var.P = false;
        r1Var.setHorizontalScrollBarEnabled(false);
        r1Var.setVerticalScrollBarEnabled(false);
        r1Var.setClipToPadding(false);
        addView(r1Var, gb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        f0 f0Var = new f0(this, context);
        this.f15731x = f0Var;
        r1Var.setAdapter(f0Var);
        f7.m(r1Var, 21, y6.A5, u6Var);
        r1Var.setOnItemClickListener(new ai.k(this, 15));
        r1Var.setOnScrollListener(new ai.b(this, 18));
        FrameLayout.LayoutParams i10 = gb1.i(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) i10).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, i10);
        O();
    }

    public int getCurrentTop() {
        bi.r1 r1Var = this.f15729s;
        if (r1Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = r1Var.getChildAt(0);
            vl0 vl0Var = (vl0) r1Var.G(childAt);
            if (vl0Var != null) {
                int paddingTop = r1Var.getPaddingTop();
                if (vl0Var.b() == 0 && childAt.getTop() >= 0) {
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
        ti tiVar = this.f30213b;
        if (tiVar.f33065u1.Q() > AndroidUtilities.dp(20.0f)) {
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
        this.f15729s.t1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override
    public final void G(li liVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f15729s.y0(0);
    }

    public final void O() {
        boolean z10;
        int i10 = 0;
        if (this.f15729s.getAdapter().h() == 2) {
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
        uz uzVar = this.E;
        if (uzVar.getVisibility() != 0 || (childAt = this.f15729s.getChildAt(0)) == null) {
            return;
        }
        uzVar.setTranslationY((childAt.getTop() + (uzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.U7));
        hashSet.add(Integer.valueOf(y6.T7));
        hashSet.add(Integer.valueOf(y6.S7));
        hashSet.add(Integer.valueOf(y6.R7));
        hashSet.add(Integer.valueOf(y6.Q7));
        hashSet.add(Integer.valueOf(y6.P7));
        hashSet.add(Integer.valueOf(y6.O7));
        hashSet.add(Integer.valueOf(y6.J7));
        hashSet.add(Integer.valueOf(y6.q5));
        hashSet.add(Integer.valueOf(y6.f23355d7));
        hashSet.add(Integer.valueOf(y6.f23446i6));
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        bi.r1 r1Var = this.f15729s;
        if (r1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = r1Var.getChildAt(0);
        vl0 vl0Var = (vl0) r1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && vl0Var != null && vl0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        oe.b bVar = this.f15727n;
        if (top >= 0 && vl0Var != null && vl0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f15728r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f15729s.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override
    public ArrayList<h7> getThemeDescriptions() {
        ArrayList<h7> arrayList = new ArrayList<>();
        arrayList.add(new h7(this.E, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (g7) null, y6.f23336c7));
        arrayList.add(new h7(this.E, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (g7) null, y6.f23426h6));
        int i10 = y6.q5;
        arrayList.add(new h7(this.f15729s, 0, new Class[]{h0.class}, new String[]{"nameTextView"}, (Drawable[]) null, (g7) null, i10));
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
        this.f30213b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ch.b bVar) {
        pi piVar = this.F;
        if (piVar != null) {
            piVar.setupBlurredBackground(bVar.c(piVar, gh.c.a(this.f30212a), false));
        }
    }

    @Override
    public final void o() {
    }

    @Override
    public final void updateColors() {
    }

    @Override
    public final void z(float f7, int i10) {
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
    }
}
