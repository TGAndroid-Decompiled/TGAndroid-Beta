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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class hs5 extends e implements fn7, View.OnClickListener, s84, i1d {
    public final HashMap E;
    public final ArrayList F;
    public zc5 G;
    public int H;
    public int I;
    public int J;
    public final t84 a;
    public zp4 b;
    public sla c;
    public fs5 d;
    public ScrollView e;
    public gs5 f;
    public d79 h;
    public x46 n;
    public z2b r;
    public es5 s;
    public ArrayList w;
    public int x;
    public boolean y;

    public hs5() {
        super(null);
        this.a = new t84(3, this, k43.h, 350L, 0.0f);
        this.E = new HashMap();
        this.F = new ArrayList();
    }

    public static jla Y(hs5 hs5Var) {
        return hs5Var.simpleActionBar;
    }

    public static jla Z(hs5 hs5Var) {
        return hs5Var.simpleActionBar;
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
            i = hl.L(4.0f) + ((int) f);
        } else {
            i = 0;
        }
        eg0.g(this.h, this.H, this.I, currentActionBarHeight + i, 0);
        this.r.setPadding(0, a.getCurrentActionBarHeight() + this.H, 0, this.I);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.Si));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.Ri));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
    }

    public final void b0() {
        this.y = false;
        es5 es5Var = this.s;
        if (es5Var.h) {
            es5Var.h = false;
            es5Var.f();
        }
        this.s.E(null);
        this.h.setFastScrollVisible(true);
        this.h.setVerticalScrollBarEnabled(false);
        this.r.e(false, true);
        this.r.setStickerType(0);
        this.r.d.setText(ob6.M0(2131747954, null));
        this.r.e.setText("");
    }

    public final void c0() {
        ArrayList arrayList = new ArrayList(lv2.r(this.currentAccount).b0);
        this.w = arrayList;
        Collections.sort(arrayList, new f03((byte) 24));
        z2b z2bVar = this.r;
        if (z2bVar != null) {
            z2bVar.e(false, true);
        }
        es5 es5Var = this.s;
        if (es5Var != null) {
            es5Var.f();
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
        this.simpleActionBar.setTitle(ob6.M0(2131748905, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 1));
        sla a = this.simpleActionBar.v().a(1, 2131232502);
        this.c = a;
        a.setContentDescription(ob6.M0(2131745564, null));
        sla slaVar = this.c;
        slaVar.N();
        slaVar.C0 = new r10(this, (byte) 13);
        this.c.setSearchFieldHint(ob6.M0(2131745564, null));
        zc zcVar = new zc((byte) 28, context, this);
        this.fragmentView = zcVar;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        gs5 gs5Var = new gs5(this, context);
        this.f = gs5Var;
        this.e.addView(gs5Var, tre.c(-2.0f, -1));
        this.d = new fs5(this, context);
        tk4 tk4Var = new tk4(context, null);
        tk4Var.setViewType(6);
        tk4Var.x = false;
        z2b z2bVar = new z2b(context, tk4Var, 0, null);
        this.r = z2bVar;
        z2bVar.addView(tk4Var, 0);
        this.r.setAnimateLayoutChange(true);
        this.r.d.setText(ob6.M0(2131747954, null));
        this.r.e.setText("");
        this.r.e(lv2.r(this.currentAccount).y(), true);
        this.n = new x46(1, false);
        this.s = new es5(this, context);
        d79 d79Var = new d79(context, null);
        this.h = d79Var;
        d79Var.s1();
        this.h.setSectionsDrawBackground(true);
        this.h.setEmptyView(this.r);
        this.h.setAdapter(this.s);
        this.h.setLayoutManager(this.n);
        this.h.setVerticalScrollBarEnabled(false);
        d79 d79Var2 = this.h;
        if (!ob6.a0) {
            i = 2;
        }
        d79Var2.setVerticalScrollbarPosition(i);
        zcVar.addView(this.h, tre.c(-1.0f, -1));
        zcVar.addView(this.r);
        this.h.setOnItemClickListener(new zg4(this, (byte) 6));
        this.h.setOnScrollListener(new to2(this, (byte) 21));
        gd0 gd0Var = new gd0(false);
        gd0Var.l = (short) 180;
        gd0Var.invalidateSelf();
        zp4 zp4Var = new zp4(this.resourceProvider, context, false);
        this.b = zp4Var;
        zp4Var.c.setImageDrawable(gd0Var);
        this.b.e(false, false);
        this.b.setContentDescription(ob6.M0(2131747981, null));
        this.b.setOnClickListener(new sa5(this, (byte) 10));
        es5 es5Var = this.s;
        if (es5Var != null && !this.y) {
            int b = es5Var.b();
            z2b z2bVar2 = this.r;
            if (b != 2) {
                i2 = 4;
            }
            z2bVar2.setVisibility(i2);
        }
        zcVar.addView(this.d, tre.d(-1, -2.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        zcVar.addView(this.b, zp4.b());
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.g1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0(int i, View view) {
        mt5 mt5Var;
        iv2 contact;
        boolean z = false;
        if (i == 0 && !this.y) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String s = lv2.r(this.currentAccount).s(0);
                intent.putExtra("android.intent.extra.TEXT", s);
                getParentActivity().startActivityForResult(Intent.createChooser(intent, s), 500);
            } catch (Exception e) {
                cc4.g(e, true);
            }
        } else if ((view instanceof mt5) && (contact = (mt5Var = (mt5) view).getContact()) != null) {
            zc5 zc5Var = (zc5) this.E.get(contact.b);
            if (zc5Var != null) {
                this.f.a(zc5Var);
            } else {
                zc5 zc5Var2 = new zc5(getParentActivity(), null, contact, true, this.resourceProvider);
                gs5 gs5Var = this.f;
                ArrayList arrayList = gs5Var.c;
                hs5 hs5Var = gs5Var.f;
                hs5Var.F.add(zc5Var2);
                hs5Var.E.put(zc5Var2.getKey(), zc5Var2);
                AnimatorSet animatorSet = gs5Var.a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    gs5Var.a.cancel();
                }
                gs5Var.b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                gs5Var.a = animatorSet2;
                animatorSet2.addListener(new ad5(gs5Var, (byte) 4));
                gs5Var.a.setInterpolator(k43.h);
                gs5Var.a.setDuration(320L);
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(zc5Var2, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(zc5Var2, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(zc5Var2, View.ALPHA, 0.0f, 1.0f));
                gs5Var.addView(zc5Var2);
                hs5Var.e.post(new ea5(gs5Var, (byte) 18));
                zc5Var2.setOnClickListener(this);
            }
            this.b.e(!this.F.isEmpty(), true);
            if (zc5Var == null) {
                z = true;
            }
            og2 og2Var = mt5Var.e;
            if (og2Var != null) {
                og2Var.a(z, true);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        z2b z2bVar;
        if (i == jn7.O) {
            c0();
        } else if (i == jn7.N && (z2bVar = this.r) != null) {
            z2bVar.e(false, true);
        }
    }

    public final void e0() {
        ArrayList arrayList = this.F;
        try {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iv2 contact = ((zc5) arrayList.get(i2)).getContact();
                if (sb.length() != 0) {
                    sb.append(';');
                }
                sb.append((String) contact.e.get(0));
                if (i2 == 0 && arrayList.size() == 1) {
                    i = contact.l;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb.toString()));
            intent.putExtra("sms_body", lv2.r(this.currentAccount).s(i));
            getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            cc4.g(e, true);
        }
        finishFragment();
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.h;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.l7));
        arrayList.add(new apb(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.m7));
        arrayList.add(new apb(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.n7));
        arrayList.add(new apb(this.h, 4, new Class[]{mt5.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.Ri));
        arrayList.add(new apb(this.h, 4, new Class[]{mt5.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.i7));
        arrayList.add(new apb(this.h, 4, new Class[]{mt5.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.k7));
        arrayList.add(new apb(this.h, 262148, new Class[]{mt5.class}, new String[]{"statusTextView"}, (Drawable[]) null, (zob) null, aob.n6));
        arrayList.add(new apb(this.f, 0, new Class[]{zc5.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Ti));
        arrayList.add(new apb(this.f, 0, new Class[]{zc5.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Ui));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void o(l2d l2dVar) {
        int i = l2dVar.a.f(8).d;
        this.J = i;
        zp4 zp4Var = this.b;
        if (zp4Var != null) {
            zp4Var.setTranslationY(-Math.max(this.I, i));
        }
    }

    @Override
    public final void onClick(View view) {
        mt5 mt5Var;
        iv2 contact;
        zc5 zc5Var = (zc5) view;
        if (zc5Var.E) {
            this.G = null;
            this.f.a(zc5Var);
            this.b.e(!this.F.isEmpty(), true);
            int childCount = this.h.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.h.getChildAt(i);
                if ((childAt instanceof mt5) && (contact = (mt5Var = (mt5) childAt).getContact()) != null) {
                    boolean containsKey = this.E.containsKey(contact.b);
                    og2 og2Var = mt5Var.e;
                    if (og2Var != null) {
                        og2Var.a(containsKey, true);
                    }
                }
            }
            return;
        }
        zc5 zc5Var2 = this.G;
        if (zc5Var2 != null) {
            zc5Var2.a();
        }
        this.G = zc5Var;
        zc5Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        jn7.f(this.currentAccount).b(this, jn7.O);
        jn7.f(this.currentAccount).b(this, jn7.N);
        c0();
        if (!yac.h(this.currentAccount).I) {
            lv2.r(this.currentAccount).l();
            yac.h(this.currentAccount).I = true;
            yac.h(this.currentAccount).u(false);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.f(this.currentAccount).n(this, jn7.O);
        jn7.f(this.currentAccount).n(this, jn7.N);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.H = i2;
        this.I = i4;
        a0();
        fs5 fs5Var = this.d;
        if (fs5Var != null) {
            fs5Var.setTranslationY(hl.L(4.0f) + a.getCurrentActionBarHeight() + this.H);
        }
        zp4 zp4Var = this.b;
        if (zp4Var != null) {
            zp4Var.setTranslationY(-Math.max(this.I, this.J));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            d79 d79Var = this.h;
            if (d79Var != null) {
                d79Var.y1();
            }
            if (this.f != null) {
                for (int i = 0; i < this.f.getChildCount(); i++) {
                    View childAt = this.f.getChildAt(i);
                    if (childAt instanceof zc5) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
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
    public final void v0(float f, int i) {
    }
}
