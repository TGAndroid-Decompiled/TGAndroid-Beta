package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.ContactsActivity;
public final class bg3 extends e {
    public static final yf3 y = new yf3((byte) 0);
    public uj3 a;
    public ContactsActivity b;
    public s7 c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public ag3[] f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public int w;
    public boolean x;

    public static a d0(bg3 bg3Var) {
        return bg3Var.actionBar;
    }

    public static a e0(bg3 bg3Var) {
        return bg3Var.actionBar;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
        uj3 uj3Var = this.a;
        if (uj3Var != null) {
            uj3Var.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        float f;
        d79 d79Var;
        gw9 gw9Var;
        ContactsActivity contactsActivity = this.b;
        uj3 uj3Var = this.a;
        ag3[] ag3VarArr = this.f;
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setTitle(ob6.M0(2131753680, null));
        wk5 wk5Var = this.parentLayout;
        boolean z = false;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f2 = 44.0f;
        this.actionBar.setExtraHeight(hl.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 12));
        this.hasOwnBackground = true;
        s7 a = this.actionBar.u().a(0, 2131232502);
        a.N();
        a.I = new r10(this, (byte) 9);
        this.c = a;
        a.setSearchFieldHint(ob6.M0(2131745564, null));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, tre.e(-1, 44, 83));
        this.e.setDelegate(new z8d(this, (byte) 29));
        this.w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        zf3 zf3Var = new zf3(this, context);
        this.fragmentView = zf3Var;
        zf3Var.setWillNotDraw(false);
        uj3Var.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i = 0;
        while (i < ag3VarArr.length) {
            ag3 ag3Var = new ag3(this, context);
            ag3VarArr[i] = ag3Var;
            zf3Var.addView(ag3Var, tre.c(-1.0f, -1));
            if (i == 0) {
                ag3 ag3Var2 = ag3VarArr[i];
                ag3Var2.a = uj3Var;
                f = f2;
                ag3Var2.d = uj3Var.f0[0].a;
                uj3Var.i3();
                bj3 bj3Var = uj3Var.D0;
                if (bj3Var != null) {
                    gw9Var = bj3Var.b0;
                } else {
                    gw9Var = null;
                }
                ag3Var2.e = gw9Var;
            } else {
                f = f2;
                if (i == 1) {
                    ag3 ag3Var3 = ag3VarArr[i];
                    ag3Var3.a = contactsActivity;
                    ag3Var3.d = contactsActivity.d;
                    ag3Var3.setVisibility(8);
                }
            }
            ag3VarArr[i].d.setScrollingTouchSlop(1);
            ag3 ag3Var4 = ag3VarArr[i];
            ag3Var4.b = (FrameLayout) ag3Var4.a.getFragmentView();
            ag3 ag3Var5 = ag3VarArr[i];
            ag3Var5.c = ag3Var5.a.getActionBar();
            ag3 ag3Var6 = ag3VarArr[i];
            ag3Var6.addView(ag3Var6.b, tre.c(-1.0f, -1));
            hl.B2(ag3VarArr[i].c);
            ag3 ag3Var7 = ag3VarArr[i];
            ag3Var7.addView(ag3Var7.c, tre.c(-2.0f, -1));
            ag3VarArr[i].c.setVisibility(8);
            for (int i2 = 0; i2 < 2; i2++) {
                if (i2 == 0) {
                    d79Var = ag3VarArr[i].d;
                } else {
                    d79Var = ag3VarArr[i].e;
                }
                if (d79Var != null) {
                    d79Var.setClipToPadding(false);
                    d79Var.setOnScrollListener(new bj1(this, d79Var.getOnScrollListener(), (byte) 3));
                }
            }
            i++;
            f2 = f;
        }
        float f3 = f2;
        zf3Var.addView(this.actionBar, tre.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, ob6.M0(2131753683, null), null);
            this.e.a(1, ob6.M0(2131753682, null), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(hl.L(f3));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                ag3VarArr[0].f = currentTabId;
            }
            this.e.c();
        }
        q0(false);
        if (this.e.getCurrentTabId() == this.e.getFirstTabId()) {
            z = true;
        }
        this.x = z;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.I8));
        arrayList.add(new apb(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.J8));
        arrayList.add(new apb(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.K8));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.e.getSelectorDrawable()}, (zob) null, aob.L8));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.x;
    }

    public final void n0(TLRPC.User user) {
        if (uc7.K2(user)) {
            jj.t0(ob6.M0(2131751070, null), this);
        } else {
            uc7.s1(this.currentAccount).u(user.id);
            jj.t0(ob6.M0(2131743416, null), this);
        }
        finishFragment();
    }

    public final void o0(float f) {
        ag3[] ag3VarArr = this.f;
        this.actionBar.setTranslationY(f);
        for (int i = 0; i < ag3VarArr.length; i++) {
            int i2 = (int) f;
            ag3VarArr[i].d.setPinnedSectionOffsetY(i2);
            gw9 gw9Var = ag3VarArr[i].e;
            if (gw9Var != null) {
                gw9Var.setPinnedSectionOffsetY(i2);
            }
        }
        this.fragmentView.invalidate();
    }

    @Override
    public final void onFragmentDestroy() {
        uj3 uj3Var = this.a;
        if (uj3Var != null) {
            uj3Var.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        uj3 uj3Var = this.a;
        if (uj3Var != null) {
            uj3Var.onPause();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        uj3 uj3Var = this.a;
        if (uj3Var != null) {
            uj3Var.onResume();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            uj3 uj3Var = this.a;
            if (uj3Var != null && uj3Var.fragmentView != null) {
                uj3Var.onThemeColorsChanged();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            ContactsActivity contactsActivity = this.b;
            if (contactsActivity != null && contactsActivity.fragmentView != null) {
                contactsActivity.onThemeColorsChanged();
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    public final void p0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = ob6.M0(2131753685, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = hl.S2(ob6.a0("AreYouSureBlockContact2", null, 2131754112, lv2.m(0, user.first_name, user.last_name)));
            alertDialog$Builder.j(ob6.M0(2131753686, null), new q72(this, user, (byte) 23));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            showDialog(idVar);
            TextView textView = (TextView) idVar.c(-1);
            if (textView != null) {
                yob.X(textView, aob.q7, null);
            }
        }
    }

    public final void q0(boolean z) {
        d79 d79Var;
        ag3[] ag3VarArr = this.f;
        for (int i = 0; i < ag3VarArr.length; i++) {
            ag3VarArr[i].d.E0();
            gw9 gw9Var = ag3VarArr[i].e;
            if (gw9Var != null) {
                gw9Var.E0();
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            if (i2 == 0) {
                d79Var = ag3VarArr[z ? 1 : 0].d;
            } else {
                d79Var = ag3VarArr[z ? 1 : 0].e;
            }
            if (d79Var != null) {
                d79Var.getAdapter();
                d79Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((x46) d79Var.getLayoutManager()).g1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }
}
