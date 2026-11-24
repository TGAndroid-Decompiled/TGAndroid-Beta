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
public final class gq5 extends d implements gk7, View.OnClickListener, x74, swc {
    public final HashMap E;
    public final ArrayList F;
    public ya5 G;
    public int H;
    public int I;
    public int J;
    public final y74 a;
    public un4 b;
    public xha c;
    public eq5 d;
    public ScrollView e;
    public fq5 f;
    public o39 h;
    public t26 n;
    public zya r;
    public dq5 s;
    public ArrayList w;
    public int x;
    public boolean y;

    public gq5() {
        super(null);
        this.a = new y74(3, this, s33.h, 350L, 0.0f);
        this.E = new HashMap();
        this.F = new ArrayList();
    }

    public static pha Y(gq5 gq5Var) {
        return gq5Var.simpleActionBar;
    }

    public static pha Z(gq5 gq5Var) {
        return gq5Var.simpleActionBar;
    }

    @Override
    public final View R() {
        return this.fragmentView;
    }

    public final void a0() {
        int i;
        if (this.h == null) {
            return;
        }
        float f = this.a.f;
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        if (f > 0.0f) {
            i = gl.L(4.0f) + ((int) f);
        } else {
            i = 0;
        }
        dg0.e(this.h, this.H, this.I, currentActionBarHeight + i, 0);
        this.r.setPadding(0, a.getCurrentActionBarHeight() + this.H, 0, this.I);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.Ri));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.Qi));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
    }

    public final void b0() {
        this.y = false;
        dq5 dq5Var = this.s;
        if (dq5Var.h) {
            dq5Var.h = false;
            dq5Var.f();
        }
        this.s.E(null);
        this.h.setFastScrollVisible(true);
        this.h.setVerticalScrollBarEnabled(false);
        this.r.e(false, true);
        this.r.setStickerType(0);
        this.r.d.setText(k96.M0(2131748031, null));
        this.r.e.setText("");
    }

    public final void c0() {
        ArrayList arrayList = new ArrayList(qu2.r(this.currentAccount).b0);
        this.w = arrayList;
        Collections.sort(arrayList, new mz2((byte) 23));
        zya zyaVar = this.r;
        if (zyaVar != null) {
            zyaVar.e(false, true);
        }
        dq5 dq5Var = this.s;
        if (dq5Var != null) {
            dq5Var.f();
        }
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
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(k96.M0(2131748959, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 0));
        xha a = this.simpleActionBar.t().a(1, 2131232491);
        this.c = a;
        a.setContentDescription(k96.M0(2131745644, null));
        xha xhaVar = this.c;
        xhaVar.N();
        xhaVar.C0 = new q10(this, (byte) 13);
        this.c.setSearchFieldHint(k96.M0(2131745644, null));
        yc ycVar = new yc((byte) 27, context, this);
        this.fragmentView = ycVar;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        fq5 fq5Var = new fq5(this, context);
        this.f = fq5Var;
        this.e.addView(fq5Var, nme.c(-2.0f, -1));
        this.d = new eq5(this, context);
        pi4 pi4Var = new pi4(context, null);
        pi4Var.setViewType(6);
        pi4Var.x = false;
        zya zyaVar = new zya(context, pi4Var, 0, null);
        this.r = zyaVar;
        zyaVar.addView(pi4Var, 0);
        this.r.setAnimateLayoutChange(true);
        this.r.d.setText(k96.M0(2131748031, null));
        this.r.e.setText("");
        this.r.e(qu2.r(this.currentAccount).y(), true);
        this.n = new t26(1, false);
        this.s = new dq5(this, context);
        o39 o39Var = new o39(context, null);
        this.h = o39Var;
        o39Var.r1();
        this.h.setSectionsDrawBackground(true);
        this.h.setEmptyView(this.r);
        this.h.setAdapter(this.s);
        this.h.setLayoutManager(this.n);
        this.h.setVerticalScrollBarEnabled(false);
        o39 o39Var2 = this.h;
        if (!k96.a0) {
            i = 2;
        }
        o39Var2.setVerticalScrollbarPosition(i);
        ycVar.addView(this.h, nme.c(-1.0f, -1));
        ycVar.addView(this.r);
        this.h.setOnItemClickListener(new bf4(this, (byte) 6));
        this.h.setOnScrollListener(new ao2(this, (byte) 21));
        ed0 ed0Var = new ed0(false);
        ed0Var.l = (short) 180;
        ed0Var.invalidateSelf();
        un4 un4Var = new un4(this.resourceProvider, context, false);
        this.b = un4Var;
        un4Var.c.setImageDrawable(ed0Var);
        this.b.e(false, false);
        this.b.setContentDescription(k96.M0(2131748058, null));
        this.b.setOnClickListener(new b95(this, (byte) 9));
        dq5 dq5Var = this.s;
        if (dq5Var != null && !this.y) {
            int b = dq5Var.b();
            zya zyaVar2 = this.r;
            if (b != 2) {
                i2 = 4;
            }
            zyaVar2.setVisibility(i2);
        }
        ycVar.addView(this.d, nme.d(-1, -2.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        ycVar.addView(this.b, un4.b());
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.g1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0(int i, View view) {
        kr5 kr5Var;
        nu2 contact;
        boolean z = false;
        if (i == 0 && !this.y) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String s = qu2.r(this.currentAccount).s(0);
                intent.putExtra("android.intent.extra.TEXT", s);
                getParentActivity().startActivityForResult(Intent.createChooser(intent, s), 500);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        } else if ((view instanceof kr5) && (contact = (kr5Var = (kr5) view).getContact()) != null) {
            ya5 ya5Var = (ya5) this.E.get(contact.b);
            if (ya5Var != null) {
                this.f.a(ya5Var);
            } else {
                ya5 ya5Var2 = new ya5(getParentActivity(), null, contact, true, this.resourceProvider);
                fq5 fq5Var = this.f;
                ArrayList arrayList = fq5Var.c;
                gq5 gq5Var = fq5Var.f;
                gq5Var.F.add(ya5Var2);
                gq5Var.E.put(ya5Var2.getKey(), ya5Var2);
                AnimatorSet animatorSet = fq5Var.a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    fq5Var.a.cancel();
                }
                fq5Var.b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                fq5Var.a = animatorSet2;
                animatorSet2.addListener(new v85(fq5Var, (byte) 5));
                fq5Var.a.setInterpolator(s33.h);
                fq5Var.a.setDuration(320L);
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(ya5Var2, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(ya5Var2, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(ya5Var2, View.ALPHA, 0.0f, 1.0f));
                fq5Var.addView(ya5Var2);
                gq5Var.e.post(new tp5(fq5Var, (byte) 3));
                ya5Var2.setOnClickListener(this);
            }
            this.b.e(!this.F.isEmpty(), true);
            if (ya5Var == null) {
                z = true;
            }
            wf2 wf2Var = kr5Var.e;
            if (wf2Var != null) {
                wf2Var.a(z, true);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        zya zyaVar;
        if (i == kk7.O) {
            c0();
        } else if (i == kk7.N && (zyaVar = this.r) != null) {
            zyaVar.e(false, true);
        }
    }

    public final void e0() {
        ArrayList arrayList = this.F;
        try {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                nu2 contact = ((ya5) arrayList.get(i2)).getContact();
                if (sb.length() != 0) {
                    sb.append(';');
                }
                sb.append((String) contact.e.get(0));
                if (i2 == 0 && arrayList.size() == 1) {
                    i = contact.l;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb.toString()));
            intent.putExtra("sms_body", qu2.r(this.currentAccount).s(i));
            getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            fa4.g(e, true);
        }
        finishFragment();
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.h;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k7));
        arrayList.add(new blb(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.l7));
        arrayList.add(new blb(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.m7));
        arrayList.add(new blb(this.h, 4, new Class[]{kr5.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.Qi));
        arrayList.add(new blb(this.h, 4, new Class[]{kr5.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.h7));
        arrayList.add(new blb(this.h, 4, new Class[]{kr5.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.j7));
        arrayList.add(new blb(this.h, 262148, new Class[]{kr5.class}, new String[]{"statusTextView"}, (Drawable[]) null, (alb) null, bkb.m6));
        arrayList.add(new blb(this.f, 0, new Class[]{ya5.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Si));
        arrayList.add(new blb(this.f, 0, new Class[]{ya5.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Ti));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void o(vxc vxcVar) {
        int i = vxcVar.a.f(8).d;
        this.J = i;
        un4 un4Var = this.b;
        if (un4Var != null) {
            un4Var.setTranslationY(-Math.max(this.I, i));
        }
    }

    @Override
    public final void onClick(View view) {
        kr5 kr5Var;
        nu2 contact;
        ya5 ya5Var = (ya5) view;
        if (ya5Var.E) {
            this.G = null;
            this.f.a(ya5Var);
            this.b.e(!this.F.isEmpty(), true);
            int childCount = this.h.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.h.getChildAt(i);
                if ((childAt instanceof kr5) && (contact = (kr5Var = (kr5) childAt).getContact()) != null) {
                    boolean containsKey = this.E.containsKey(contact.b);
                    wf2 wf2Var = kr5Var.e;
                    if (wf2Var != null) {
                        wf2Var.a(containsKey, true);
                    }
                }
            }
            return;
        }
        ya5 ya5Var2 = this.G;
        if (ya5Var2 != null) {
            ya5Var2.a();
        }
        this.G = ya5Var;
        ya5Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        kk7.f(this.currentAccount).b(this, kk7.O);
        kk7.f(this.currentAccount).b(this, kk7.N);
        c0();
        if (!y6c.h(this.currentAccount).I) {
            qu2.r(this.currentAccount).l();
            y6c.h(this.currentAccount).I = true;
            y6c.h(this.currentAccount).u(false);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, kk7.O);
        kk7.f(this.currentAccount).n(this, kk7.N);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.H = i2;
        this.I = i4;
        a0();
        eq5 eq5Var = this.d;
        if (eq5Var != null) {
            eq5Var.setTranslationY(gl.L(4.0f) + a.getCurrentActionBarHeight() + this.H);
        }
        un4 un4Var = this.b;
        if (un4Var != null) {
            un4Var.setTranslationY(-Math.max(this.I, this.J));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            o39 o39Var = this.h;
            if (o39Var != null) {
                o39Var.x1();
            }
            if (this.f != null) {
                for (int i = 0; i < this.f.getChildCount(); i++) {
                    View childAt = this.f.getChildAt(i);
                    if (childAt instanceof ya5) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 3) {
            int paddingTop = this.h.getPaddingTop();
            this.d.invalidate();
            a0();
            int paddingTop2 = this.h.getPaddingTop();
            if (paddingTop2 != paddingTop) {
                this.h.scrollBy(0, paddingTop - paddingTop2);
            }
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
    public final void w() {
    }

    @Override
    public final void F(float f, int i) {
    }
}
