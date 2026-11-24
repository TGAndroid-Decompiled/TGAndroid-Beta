package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class es5 extends d implements jm7, View.OnClickListener, g94, tyc {
    public final HashMap E;
    public final ArrayList F;
    public wc5 G;
    public int H;
    public int I;
    public int J;
    public final h94 a;
    public wp4 b;
    public zja c;
    public cs5 d;
    public ScrollView e;
    public ds5 f;
    public r59 h;
    public u46 n;
    public a1b r;
    public bs5 s;
    public ArrayList w;
    public int x;
    public boolean y;

    public es5() {
        super(null);
        this.a = new h94(3, this, d53.h, 350L, 0.0f);
        this.E = new HashMap();
        this.F = new ArrayList();
    }

    public static rja Z(es5 es5Var) {
        return es5Var.simpleActionBar;
    }

    public static rja a0(es5 es5Var) {
        return es5Var.simpleActionBar;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 3) {
            int paddingTop = this.h.getPaddingTop();
            this.d.invalidate();
            b0();
            int paddingTop2 = this.h.getPaddingTop();
            if (paddingTop2 != paddingTop) {
                this.h.scrollBy(0, paddingTop - paddingTop2);
            }
        }
    }

    @Override
    public final View R() {
        return this.fragmentView;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.Ri));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.Qi));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
    }

    public final void b0() {
        int i;
        if (this.h == null) {
            return;
        }
        float f = this.a.f;
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        if (f > 0.0f) {
            i = gm.L(4.0f) + ((int) f);
        } else {
            i = 0;
        }
        eh0.e(this.h, this.H, this.I, currentActionBarHeight + i, 0);
        this.r.setPadding(0, a.getCurrentActionBarHeight() + this.H, 0, this.I);
    }

    public final void c0() {
        this.y = false;
        bs5 bs5Var = this.s;
        if (bs5Var.h) {
            bs5Var.h = false;
            bs5Var.f();
        }
        this.s.E(null);
        this.h.setFastScrollVisible(true);
        this.h.setVerticalScrollBarEnabled(false);
        this.r.e(false, true);
        this.r.setStickerType(0);
        this.r.d.setText(jb6.M0(2131747957, null));
        this.r.e.setText("");
    }

    @Override
    public final View createView(Context context) {
        int i = 1;
        setHasOwnBackground(true);
        int i2 = 0;
        this.y = false;
        this.F.clear();
        this.E.clear();
        this.G = null;
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setTitle(jb6.M0(2131748908, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 1));
        zja a = this.simpleActionBar.t().a(1, 2131232503);
        this.c = a;
        a.setContentDescription(jb6.M0(2131745570, null));
        zja zjaVar = this.c;
        zjaVar.N();
        zjaVar.C0 = new q20(this, (byte) 13);
        this.c.setSearchFieldHint(jb6.M0(2131745570, null));
        yd ydVar = new yd((byte) 27, context, this);
        this.fragmentView = ydVar;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        ds5 ds5Var = new ds5(this, context);
        this.f = ds5Var;
        this.e.addView(ds5Var, qoe.c(-2.0f, -1));
        this.d = new cs5(this, context);
        tk4 tk4Var = new tk4(context, null);
        tk4Var.setViewType(6);
        tk4Var.x = false;
        a1b a1bVar = new a1b(context, tk4Var, 0, null);
        this.r = a1bVar;
        a1bVar.addView(tk4Var, 0);
        this.r.setAnimateLayoutChange(true);
        this.r.d.setText(jb6.M0(2131747957, null));
        this.r.e.setText("");
        this.r.e(bw2.r(this.currentAccount).y(), true);
        this.n = new u46(1, false);
        this.s = new bs5(this, context);
        r59 r59Var = new r59(context, null);
        this.h = r59Var;
        r59Var.r1();
        this.h.setSectionsDrawBackground(true);
        this.h.setEmptyView(this.r);
        this.h.setAdapter(this.s);
        this.h.setLayoutManager(this.n);
        this.h.setVerticalScrollBarEnabled(false);
        r59 r59Var2 = this.h;
        if (!jb6.a0) {
            i = 2;
        }
        r59Var2.setVerticalScrollbarPosition(i);
        ydVar.addView(this.h, qoe.c(-1.0f, -1));
        ydVar.addView(this.r);
        this.h.setOnItemClickListener(new kg4(this, (byte) 7));
        this.h.setOnScrollListener(new ip2(this, (byte) 22));
        ee0 ee0Var = new ee0(false);
        ee0Var.l = (short) 180;
        ee0Var.invalidateSelf();
        wp4 wp4Var = new wp4(this.resourceProvider, context, false);
        this.b = wp4Var;
        wp4Var.c.setImageDrawable(ee0Var);
        this.b.e(false, false);
        this.b.setContentDescription(jb6.M0(2131747984, null));
        this.b.setOnClickListener(new ca5(this, (byte) 12));
        bs5 bs5Var = this.s;
        if (bs5Var != null && !this.y) {
            int b = bs5Var.b();
            a1b a1bVar2 = this.r;
            if (b != 2) {
                i2 = 4;
            }
            a1bVar2.setVisibility(i2);
        }
        ydVar.addView(this.d, qoe.d(-1, -2.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        ydVar.addView(this.b, wp4.b());
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.g1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(bw2.r(this.currentAccount).b0);
        this.w = arrayList;
        Collections.sort(arrayList, new x03((byte) 24));
        a1b a1bVar = this.r;
        if (a1bVar != null) {
            a1bVar.e(false, true);
        }
        bs5 bs5Var = this.s;
        if (bs5Var != null) {
            bs5Var.f();
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        a1b a1bVar;
        if (i == nm7.O) {
            d0();
        } else if (i == nm7.N && (a1bVar = this.r) != null) {
            a1bVar.e(false, true);
        }
    }

    public final void e0(int i, View view) {
        jt5 jt5Var;
        yv2 contact;
        boolean z = false;
        if (i == 0 && !this.y) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String s = bw2.r(this.currentAccount).s(0);
                intent.putExtra("android.intent.extra.TEXT", s);
                getParentActivity().startActivityForResult(Intent.createChooser(intent, s), 500);
            } catch (Exception e) {
                fc4.g(e, true);
            }
        } else if ((view instanceof jt5) && (contact = (jt5Var = (jt5) view).getContact()) != null) {
            wc5 wc5Var = (wc5) this.E.get(contact.b);
            if (wc5Var != null) {
                this.f.a(wc5Var);
            } else {
                wc5 wc5Var2 = new wc5(getParentActivity(), null, contact, true, this.resourceProvider);
                ds5 ds5Var = this.f;
                ArrayList arrayList = ds5Var.c;
                es5 es5Var = ds5Var.f;
                es5Var.F.add(wc5Var2);
                es5Var.E.put(wc5Var2.getKey(), wc5Var2);
                AnimatorSet animatorSet = ds5Var.a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    ds5Var.a.cancel();
                }
                ds5Var.b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                ds5Var.a = animatorSet2;
                animatorSet2.addListener(new v85(ds5Var, (byte) 7));
                ds5Var.a.setInterpolator(d53.h);
                ds5Var.a.setDuration(320L);
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(wc5Var2, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(wc5Var2, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(wc5Var2, View.ALPHA, 0.0f, 1.0f));
                ds5Var.addView(wc5Var2);
                es5Var.e.post(new kg5(ds5Var, (byte) 10));
                wc5Var2.setOnClickListener(this);
            }
            this.b.e(!this.F.isEmpty(), true);
            if (wc5Var == null) {
                z = true;
            }
            jh2 jh2Var = jt5Var.e;
            if (jh2Var != null) {
                jh2Var.a(z, true);
            }
        }
    }

    public final void f0() {
        ArrayList arrayList = this.F;
        try {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                yv2 contact = ((wc5) arrayList.get(i2)).getContact();
                if (sb.length() != 0) {
                    sb.append(';');
                }
                sb.append((String) contact.e.get(0));
                if (i2 == 0 && arrayList.size() == 1) {
                    i = contact.l;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb.toString()));
            intent.putExtra("sms_body", bw2.r(this.currentAccount).s(i));
            getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            fc4.g(e, true);
        }
        finishFragment();
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.h;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k7));
        arrayList.add(new cnb(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.l7));
        arrayList.add(new cnb(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.m7));
        arrayList.add(new cnb(this.h, 4, new Class[]{jt5.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.Qi));
        arrayList.add(new cnb(this.h, 4, new Class[]{jt5.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.h7));
        arrayList.add(new cnb(this.h, 4, new Class[]{jt5.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.j7));
        arrayList.add(new cnb(this.h, 262148, new Class[]{jt5.class}, new String[]{"statusTextView"}, (Drawable[]) null, (bnb) null, cmb.m6));
        arrayList.add(new cnb(this.f, 0, new Class[]{wc5.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Si));
        arrayList.add(new cnb(this.f, 0, new Class[]{wc5.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Ti));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void o(wzc wzcVar) {
        int i = wzcVar.a.f(8).d;
        this.J = i;
        wp4 wp4Var = this.b;
        if (wp4Var != null) {
            wp4Var.setTranslationY(-Math.max(this.I, i));
        }
    }

    @Override
    public final void onClick(View view) {
        jt5 jt5Var;
        yv2 contact;
        wc5 wc5Var = (wc5) view;
        if (wc5Var.E) {
            this.G = null;
            this.f.a(wc5Var);
            this.b.e(!this.F.isEmpty(), true);
            int childCount = this.h.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.h.getChildAt(i);
                if ((childAt instanceof jt5) && (contact = (jt5Var = (jt5) childAt).getContact()) != null) {
                    boolean containsKey = this.E.containsKey(contact.b);
                    jh2 jh2Var = jt5Var.e;
                    if (jh2Var != null) {
                        jh2Var.a(containsKey, true);
                    }
                }
            }
            return;
        }
        wc5 wc5Var2 = this.G;
        if (wc5Var2 != null) {
            wc5Var2.a();
        }
        this.G = wc5Var;
        wc5Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        nm7.f(this.currentAccount).b(this, nm7.O);
        nm7.f(this.currentAccount).b(this, nm7.N);
        d0();
        if (!z8c.h(this.currentAccount).I) {
            bw2.r(this.currentAccount).l();
            z8c.h(this.currentAccount).I = true;
            z8c.h(this.currentAccount).u(false);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.f(this.currentAccount).n(this, nm7.O);
        nm7.f(this.currentAccount).n(this, nm7.N);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.H = i2;
        this.I = i4;
        b0();
        cs5 cs5Var = this.d;
        if (cs5Var != null) {
            cs5Var.setTranslationY(gm.L(4.0f) + a.getCurrentActionBarHeight() + this.H);
        }
        wp4 wp4Var = this.b;
        if (wp4Var != null) {
            wp4Var.setTranslationY(-Math.max(this.I, this.J));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            r59 r59Var = this.h;
            if (r59Var != null) {
                r59Var.x1();
            }
            if (this.f != null) {
                for (int i = 0; i < this.f.getChildCount(); i++) {
                    View childAt = this.f.getChildAt(i);
                    if (childAt instanceof wc5) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void P() {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void V(float f, int i) {
    }
}
