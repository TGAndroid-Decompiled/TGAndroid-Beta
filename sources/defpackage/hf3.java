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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.ContactsActivity;
public final class hf3 extends d {
    public static final ef3 y = new ef3((byte) 0);
    public cj3 a;
    public ContactsActivity b;
    public r7 c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public gf3[] f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public int w;
    public boolean x;

    public static a k0(hf3 hf3Var) {
        return hf3Var.actionBar;
    }

    public static a l0(hf3 hf3Var) {
        return hf3Var.actionBar;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
        cj3 cj3Var = this.a;
        if (cj3Var != null) {
            cj3Var.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        float f;
        o39 o39Var;
        ns9 ns9Var;
        ContactsActivity contactsActivity = this.b;
        cj3 cj3Var = this.a;
        gf3[] gf3VarArr = this.f;
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setTitle(k96.M0(2131753684, null));
        ui5 ui5Var = this.parentLayout;
        boolean z = false;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f2 = 44.0f;
        this.actionBar.setExtraHeight(gl.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 11));
        this.hasOwnBackground = true;
        r7 a = this.actionBar.t().a(0, 2131232491);
        a.N();
        a.I = new q10(this, (byte) 9);
        this.c = a;
        a.setSearchFieldHint(k96.M0(2131745644, null));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, nme.e(-1, 44, 83));
        this.e.setDelegate(new l69(this, (byte) 29));
        this.w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        ff3 ff3Var = new ff3(this, context);
        this.fragmentView = ff3Var;
        ff3Var.setWillNotDraw(false);
        cj3Var.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i = 0;
        while (i < gf3VarArr.length) {
            gf3 gf3Var = new gf3(this, context);
            gf3VarArr[i] = gf3Var;
            ff3Var.addView(gf3Var, nme.c(-1.0f, -1));
            if (i == 0) {
                gf3 gf3Var2 = gf3VarArr[i];
                gf3Var2.a = cj3Var;
                f = f2;
                gf3Var2.d = cj3Var.f0[0].a;
                cj3Var.g3();
                hi3 hi3Var = cj3Var.D0;
                if (hi3Var != null) {
                    ns9Var = hi3Var.b0;
                } else {
                    ns9Var = null;
                }
                gf3Var2.e = ns9Var;
            } else {
                f = f2;
                if (i == 1) {
                    gf3 gf3Var3 = gf3VarArr[i];
                    gf3Var3.a = contactsActivity;
                    gf3Var3.d = contactsActivity.d;
                    gf3Var3.setVisibility(8);
                }
            }
            gf3VarArr[i].d.setScrollingTouchSlop(1);
            gf3 gf3Var4 = gf3VarArr[i];
            gf3Var4.b = (FrameLayout) gf3Var4.a.getFragmentView();
            gf3 gf3Var5 = gf3VarArr[i];
            gf3Var5.c = gf3Var5.a.getActionBar();
            gf3 gf3Var6 = gf3VarArr[i];
            gf3Var6.addView(gf3Var6.b, nme.c(-1.0f, -1));
            gl.B2(gf3VarArr[i].c);
            gf3 gf3Var7 = gf3VarArr[i];
            gf3Var7.addView(gf3Var7.c, nme.c(-2.0f, -1));
            gf3VarArr[i].c.setVisibility(8);
            for (int i2 = 0; i2 < 2; i2++) {
                if (i2 == 0) {
                    o39Var = gf3VarArr[i].d;
                } else {
                    o39Var = gf3VarArr[i].e;
                }
                if (o39Var != null) {
                    o39Var.setClipToPadding(false);
                    o39Var.setOnScrollListener(new si1(this, o39Var.getOnScrollListener(), (byte) 3));
                }
            }
            i++;
            f2 = f;
        }
        float f3 = f2;
        ff3Var.addView(this.actionBar, nme.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, k96.M0(2131753687, null), null);
            this.e.a(1, k96.M0(2131753686, null), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(gl.L(f3));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                gf3VarArr[0].f = currentTabId;
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
        arrayList.add(new blb(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.H8));
        arrayList.add(new blb(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.I8));
        arrayList.add(new blb(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.J8));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.e.getSelectorDrawable()}, (alb) null, bkb.K8));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.x;
    }

    public final void n0(TLRPC.User user) {
        if (na7.E2(user)) {
            ij.t0(k96.M0(2131751093, null), this);
        } else {
            na7.q1(this.currentAccount).t(user.id);
            ij.t0(k96.M0(2131743522, null), this);
        }
        finishFragment();
    }

    public final void o0(float f) {
        gf3[] gf3VarArr = this.f;
        this.actionBar.setTranslationY(f);
        for (int i = 0; i < gf3VarArr.length; i++) {
            int i2 = (int) f;
            gf3VarArr[i].d.setPinnedSectionOffsetY(i2);
            ns9 ns9Var = gf3VarArr[i].e;
            if (ns9Var != null) {
                ns9Var.setPinnedSectionOffsetY(i2);
            }
        }
        this.fragmentView.invalidate();
    }

    @Override
    public final void onFragmentDestroy() {
        cj3 cj3Var = this.a;
        if (cj3Var != null) {
            cj3Var.onFragmentDestroy();
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
        cj3 cj3Var = this.a;
        if (cj3Var != null) {
            cj3Var.onPause();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        cj3 cj3Var = this.a;
        if (cj3Var != null) {
            cj3Var.onResume();
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
            cj3 cj3Var = this.a;
            if (cj3Var != null && cj3Var.fragmentView != null) {
                cj3Var.onThemeColorsChanged();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            ContactsActivity contactsActivity = this.b;
            if (contactsActivity != null && contactsActivity.fragmentView != null) {
                contactsActivity.onThemeColorsChanged();
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    public final void p0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = k96.M0(2131753689, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = gl.S2(k96.a0("AreYouSureBlockContact2", null, 2131754116, qu2.m(0, user.first_name, user.last_name)));
            alertDialog$Builder.j(k96.M0(2131753690, null), new v82(this, user, (byte) 19));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            showDialog(hdVar);
            TextView textView = (TextView) hdVar.c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.p7, null);
            }
        }
    }

    public final void q0(boolean z) {
        o39 o39Var;
        gf3[] gf3VarArr = this.f;
        for (int i = 0; i < gf3VarArr.length; i++) {
            gf3VarArr[i].d.D0();
            ns9 ns9Var = gf3VarArr[i].e;
            if (ns9Var != null) {
                ns9Var.D0();
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            if (i2 == 0) {
                o39Var = gf3VarArr[z ? 1 : 0].d;
            } else {
                o39Var = gf3VarArr[z ? 1 : 0].e;
            }
            if (o39Var != null) {
                o39Var.getAdapter();
                o39Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((t26) o39Var.getLayoutManager()).g1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }
}
