package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class s98 extends e {
    public static final yf3 E = new yf3((byte) 2);
    public final l98 a;
    public final l98 b;
    public s7 c;
    public iu3 d;
    public boolean e;
    public final Paint f;
    public ScrollSlidingTextTabStrip h;
    public final r98[] n;
    public AnimatorSet r;
    public boolean s;
    public boolean w;
    public boolean x;
    public int y;

    public s98(HashMap hashMap, ArrayList arrayList, int i, boolean z, zu1 zu1Var) {
        super(null);
        this.e = true;
        this.f = new Paint();
        this.n = new r98[2];
        this.a = new l98(0, null, hashMap, arrayList, i, z, zu1Var, false);
        this.b = new l98(1, null, hashMap, arrayList, i, z, zu1Var, false);
    }

    public static a b0(s98 s98Var) {
        return s98Var.actionBar;
    }

    public static a c0(s98 s98Var) {
        return s98Var.actionBar;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        l98 l98Var = this.a;
        if (l98Var != null) {
            l98Var.addThemeColorKeys(hashSet);
        }
        l98 l98Var2 = this.b;
        if (l98Var2 != null) {
            l98Var2.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        r98[] r98VarArr;
        View view;
        yob.h(aob.h5, null, this.actionBar);
        a aVar = this.actionBar;
        int i = aob.j5;
        yob.l(aVar, 5, i, null);
        boolean z = true;
        yob.l(this.actionBar, 1, i, null);
        yob.l(this.actionBar, 3, aob.I5, null);
        this.actionBar.setBackButtonImage(2131231243);
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f = 44.0f;
        this.actionBar.setExtraHeight(hl.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 22));
        this.hasOwnBackground = true;
        s7 a = this.actionBar.u().a(0, 2131232502);
        a.N();
        a.I = new r10(this, (byte) 18);
        this.c = a;
        a.setSearchFieldHint(ob6.M0(2131745489, null));
        EditTextBoldCursor searchField = this.c.getSearchField();
        yob.X(searchField, i, null);
        yob.v(searchField, i, null);
        yob.D(searchField, aob.Me, null);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i2 = aob.Y9;
        int i3 = aob.Z9;
        scrollSlidingTextTabStrip2.M = i2;
        scrollSlidingTextTabStrip2.N = i3;
        scrollSlidingTextTabStrip2.updateColors();
        this.actionBar.addView(this.h, tre.e(-1, 44, 83));
        this.h.setDelegate(new aj3(this, (byte) 26));
        this.y = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        q98 q98Var = new q98(this, context);
        this.fragmentView = q98Var;
        q98Var.setWillNotDraw(false);
        l98 l98Var = this.a;
        l98Var.setParentFragment(this);
        iu3 iu3Var = l98Var.e0;
        this.d = iu3Var;
        iu3Var.setSizeNotifierLayout(q98Var);
        for (int i4 = 0; i4 < 4; i4++) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        view = l98Var.d0;
                    } else {
                        view = l98Var.c0;
                    }
                } else {
                    view = l98Var.b0;
                }
            } else {
                view = l98Var.a0;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = l98Var.a0;
        d26 d26Var = l98Var.b0;
        tb tbVar = l98Var.c0;
        View view2 = l98Var.d0;
        iu3 iu3Var2 = l98Var.e0;
        l98 l98Var2 = this.b;
        l98Var2.a0 = frameLayout;
        l98Var2.b0 = d26Var;
        l98Var2.e0 = iu3Var2;
        l98Var2.c0 = tbVar;
        l98Var2.d0 = view2;
        l98Var2.r0 = false;
        l98Var2.setParentFragment(this);
        int i5 = 0;
        while (true) {
            r98VarArr = this.n;
            if (i5 >= r98VarArr.length) {
                break;
            }
            r98 r98Var = new r98(this, context);
            r98VarArr[i5] = r98Var;
            float f2 = f;
            q98Var.addView(r98Var, tre.c(-1.0f, -1));
            if (i5 == 0) {
                r98 r98Var2 = r98VarArr[i5];
                r98Var2.c = l98Var;
                r98Var2.f = l98Var.L;
            } else if (i5 == 1) {
                r98 r98Var3 = r98VarArr[i5];
                r98Var3.c = l98Var2;
                r98Var3.f = l98Var2.L;
                r98Var3.setVisibility(8);
            }
            ((d79) r98VarArr[i5].f).setScrollingTouchSlop(1);
            r98 r98Var4 = r98VarArr[i5];
            r98Var4.d = (FrameLayout) ((l98) r98Var4.c).getFragmentView();
            ((d79) r98VarArr[i5].f).setClipToPadding(false);
            r98 r98Var5 = r98VarArr[i5];
            r98Var5.e = ((l98) r98Var5.c).getActionBar();
            r98 r98Var6 = r98VarArr[i5];
            r98Var6.addView((FrameLayout) r98Var6.d, tre.c(-1.0f, -1));
            r98 r98Var7 = r98VarArr[i5];
            r98Var7.addView((a) r98Var7.e, tre.c(-2.0f, -1));
            ((a) r98VarArr[i5].e).setVisibility(8);
            ((d79) r98VarArr[i5].f).setOnScrollListener(new bj1(this, ((d79) r98VarArr[i5].f).getOnScrollListener(), (byte) 6));
            i5++;
            f = f2;
        }
        float f3 = f;
        q98Var.addView(this.actionBar, tre.c(-2.0f, -1));
        q98Var.addView(l98Var.a0, tre.e(-1, 48, 83));
        q98Var.addView(l98Var.b0, tre.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        q98Var.addView(l98Var.c0, tre.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, ob6.M0(2131749024, null), null);
            this.h.a(1, ob6.M0(2131750429, null), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(hl.L(f3));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                r98VarArr[0].b = currentTabId;
            }
            this.h.c();
        }
        n0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z = false;
        }
        this.e = z;
        if (hl.B(aob.w0(null, aob.h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h5));
        arrayList.add(new apb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Me));
        arrayList.add(new apb(this.c.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.j5));
        int i = aob.Y9;
        arrayList.add(new apb(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Z9));
        arrayList.add(new apb(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.I5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.h.getSelectorDrawable()}, (zob) null, i));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void l0(String str) {
        this.c.getSearchField().setText(str);
        this.c.getSearchField().setSelection(str.length());
        this.actionBar.D();
    }

    public final void m0(float f) {
        this.actionBar.setTranslationY(f);
        int i = 0;
        while (true) {
            r98[] r98VarArr = this.n;
            if (i < r98VarArr.length) {
                ((d79) r98VarArr[i].f).setPinnedSectionOffsetY((int) f);
                i++;
            } else {
                this.fragmentView.invalidate();
                return;
            }
        }
    }

    public final void n0(boolean z) {
        r98[] r98VarArr;
        int i = 0;
        while (true) {
            r98VarArr = this.n;
            if (i >= r98VarArr.length) {
                break;
            }
            ((d79) r98VarArr[i].f).E0();
            i++;
        }
        ((d79) r98VarArr[z ? 1 : 0].f).getAdapter();
        ((d79) r98VarArr[z ? 1 : 0].f).setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((x46) ((d79) r98VarArr[z ? 1 : 0].f).getLayoutManager()).g1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l98 l98Var = this.a;
        if (l98Var != null) {
            l98Var.onConfigurationChanged(configuration);
        }
        l98 l98Var2 = this.b;
        if (l98Var2 != null) {
            l98Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        l98 l98Var = this.a;
        if (l98Var != null) {
            l98Var.onFragmentDestroy();
        }
        l98 l98Var2 = this.b;
        if (l98Var2 != null) {
            l98Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        l98 l98Var = this.a;
        if (l98Var != null) {
            l98Var.onPause();
        }
        l98 l98Var2 = this.b;
        if (l98Var2 != null) {
            l98Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        s7 s7Var = this.c;
        if (s7Var != null) {
            s7Var.G(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        l98 l98Var = this.a;
        if (l98Var != null) {
            l98Var.onResume();
        }
        l98 l98Var2 = this.b;
        if (l98Var2 != null) {
            l98Var2.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i;
        try {
            super.onThemeColorsChanged();
            s7 s7Var = this.c;
            boolean z = false;
            if (s7Var != null && s7Var.getSearchField() != null) {
                this.c.getSearchField().setCursorColor(aob.w0(null, aob.j5, false));
            }
            if (this.fragmentView != null) {
                if (hl.B(aob.w0(null, aob.h5, false)) >= 0.721f) {
                    z = true;
                }
                int systemUiVisibility = this.fragmentView.getSystemUiVisibility();
                if (z) {
                    i = systemUiVisibility | 8192;
                } else {
                    i = systemUiVisibility & (-8193);
                }
                if (i != systemUiVisibility) {
                    this.fragmentView.setSystemUiVisibility(i);
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            l98 l98Var = this.a;
            if (l98Var != null && l98Var.fragmentView != null) {
                l98Var.onThemeColorsChanged();
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        try {
            l98 l98Var2 = this.b;
            if (l98Var2 != null && l98Var2.fragmentView != null) {
                l98Var2.onThemeColorsChanged();
            }
        } catch (Exception e3) {
            cc4.g(e3, true);
        }
    }
}
