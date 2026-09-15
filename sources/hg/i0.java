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
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vk0;
import w7.x5;
public final class i0 extends ni implements NotificationCenter.NotificationCenterDelegate, le.d {
    public final mz E;
    public final ri F;
    public final le.b f10305n;
    public final FrameLayout f10306r;
    public final ai.w0 f10307s;
    public final e0 v;
    public final HashSet f10308w;
    public final f0 f10309x;
    public final g0 f10310y;

    public i0(Context context, e6 e6Var, vi viVar) {
        super(context, e6Var, viVar);
        this.f10305n = new le.b(0, this, qr.h, 380L, false);
        this.f10308w = new HashSet();
        this.f10310y = new g0(this, context);
        ui uiVar = new ui(context, i6.f18836d6, e6Var);
        uiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10306r = frameLayout;
        ri riVar = new ri(context, e6Var, this.f26462b);
        this.F = riVar;
        riVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        c0 c0Var = new c0(this);
        h2 h2Var = riVar.f22573r;
        h2Var.addTextChangedListener(c0Var);
        h2Var.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(uiVar, x5.g());
        FrameLayout.LayoutParams d = x5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(riVar, d);
        mz mzVar = new mz(context, e6Var);
        this.E = mzVar;
        mzVar.c();
        addView(mzVar, x5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ai.w0 w0Var = new ai.w0(this, context, e6Var, 3);
        this.f10307s = w0Var;
        w0Var.p1();
        this.f26463c = w0Var;
        this.d = w0Var;
        this.h = true;
        this.f26464f = true;
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
        addView(w0Var, x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        f0 f0Var = new f0(this, context);
        this.f10309x = f0Var;
        w0Var.setAdapter(f0Var);
        w0Var.setGlowColor(i6.v0(i6.A5, this.f26461a));
        w0Var.setOnItemClickListener(new ai.g(this, 10));
        w0Var.setOnScrollListener(new ai.r(this, 10));
        FrameLayout.LayoutParams e = x5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        L();
    }

    public int getCurrentTop() {
        ai.w0 w0Var = this.f10307s;
        if (w0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = w0Var.getChildAt(0);
            vk0 vk0Var = (vk0) w0Var.G(childAt);
            if (vk0Var != null) {
                int paddingTop = w0Var.getPaddingTop();
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
    public final void E(ni niVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f10307s.x0(0);
    }

    public final void L() {
        boolean z10;
        int i10 = 0;
        if (this.f10307s.getAdapter().h() == 2) {
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
        if (mzVar.getVisibility() != 0 || (childAt = this.f10307s.getChildAt(0)) == null) {
            return;
        }
        mzVar.setTranslationY((childAt.getTop() + (mzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        ai.w0 w0Var = this.f10307s;
        if (w0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        vk0 vk0Var = (vk0) w0Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && vk0Var != null && vk0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        le.b bVar = this.f10305n;
        if (top >= 0 && vk0Var != null && vk0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f10306r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f10307s.getPaddingTop();
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
                ai.w0 w0Var = i0.this.f10307s;
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
        arrayList.add(new k6(this.E, 4, null, null, null, null, i6.f18819c7));
        arrayList.add(new k6(this.E, 2048, null, null, null, null, i6.f18908h6));
        int i10 = i6.A5;
        ai.w0 w0Var = this.f10307s;
        arrayList.add(new k6(w0Var, 32768, null, null, null, null, i10));
        arrayList.add(new k6(w0Var, 4096, null, null, null, null, i6.f18926i6));
        arrayList.add(new k6(w0Var, 0, new Class[]{View.class}, i6.f18958k0, null, null, i6.f18837d7));
        int i11 = i6.f19073q5;
        arrayList.add(new k6(w0Var, 0, new Class[]{h0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new k6(w0Var, 0, new Class[]{h0.class}, new String[]{"statusTextView"}, null, null, -1, j6Var, i11));
        arrayList.add(new k6(w0Var, 0, new Class[]{h0.class}, null, i6.f19086r0, null, i6.J7));
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
        this.f26462b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ah.c cVar) {
        ri riVar = this.F;
        if (riVar != null) {
            riVar.setupBlurredBackground(cVar.c(riVar, eh.b.a(this.f26461a), false));
        }
    }

    @Override
    public final void y(int i10, int i11) {
        int i12;
        vi viVar = this.f26462b;
        if (viVar.f28787r1.R() > AndroidUtilities.dp(20.0f)) {
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
        this.f10307s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
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
