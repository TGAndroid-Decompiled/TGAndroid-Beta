package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class qx2 extends d {
    public o39 a;
    public g24 b;
    public nx2 c;
    public v22 d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public boolean n;
    public px2 r;
    public final ArrayList s;

    public qx2(ArrayList arrayList, boolean z) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.s = new ArrayList(arrayList);
        }
        this.h = z;
    }

    public static uib Y(Context context) {
        float f;
        uib uibVar = new uib(context);
        float f2 = 12.0f;
        if (k96.a0) {
            f = 16.0f;
        } else {
            f = 12.0f;
        }
        int L = gl.L(f);
        if (!k96.a0) {
            f2 = 16.0f;
        }
        uibVar.setPadding(L, 0, gl.L(f2), 0);
        wc wcVar = new wc();
        wcVar.b = new su2(uibVar, (byte) 1);
        uibVar.addOnAttachStateChangeListener(wcVar);
        return uibVar;
    }

    public static SpannableStringBuilder Z(mx2 mx2Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String E0 = k96.E0(mx2Var.d);
        if (E0 != null) {
            spannableStringBuilder.append((CharSequence) E0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new lx2((byte) 0), E0.length(), E0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) mx2Var.a);
        return spannableStringBuilder;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(k96.M0(2131752122, null));
        zkb.h(bkb.c6, null, this.actionBar);
        a aVar = this.actionBar;
        int i = bkb.F6;
        int i2 = 1;
        zkb.l(aVar, 1, i, null);
        zkb.l(this.actionBar, 3, bkb.t8, null);
        zkb.l(this.actionBar, 5, i, null);
        this.actionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 7));
        r7 a = this.actionBar.t().a(0, 2131232491);
        a.N();
        a.I = new q10(this, (byte) 8);
        a.setSearchFieldHint(k96.M0(2131745644, null));
        this.actionBar.L(bkb.w0(null, bkb.x6, false), true);
        this.actionBar.L(bkb.w0(null, i, false), false);
        this.actionBar.setSearchCursorColor(bkb.w0(null, i, false));
        this.f = false;
        this.e = false;
        nx2 nx2Var = new nx2(this, context, this.s, this.n);
        this.c = nx2Var;
        this.d = new v22(this, context, nx2Var.s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        g24 g24Var = new g24(context, null);
        this.b = g24Var;
        g24Var.c();
        this.b.setShowAtCenter(true);
        this.b.setText(k96.M0(2131747975, null));
        o39 o39Var = new o39(context, null);
        this.a = o39Var;
        o39Var.setSectionsType(3);
        this.a.setEmptyView(this.b);
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setFastScrollEnabled(0);
        this.a.setFastScrollVisible(true);
        this.a.setLayoutManager(new t26(1, false));
        this.a.setAdapter(this.c);
        o39 o39Var2 = this.a;
        if (!k96.a0) {
            i2 = 2;
        }
        o39Var2.setVerticalScrollbarPosition(i2);
        frameLayout.addView(this.a, nme.c(-1.0f, -1));
        frameLayout.addView(this.b, nme.c(-1.0f, -1));
        this.a.setOnItemClickListener(new u(this, (byte) 17));
        this.a.setOnScrollListener(new ao2(this, (byte) 2));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.B8));
        arrayList.add(new blb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.C8));
        arrayList.add(new blb(this.a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k7));
        arrayList.add(new blb(this.a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.l7));
        arrayList.add(new blb(this.a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.m7));
        arrayList.add(new blb(this.b, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.b7));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (bm2.h(bkb.w0(null, bkb.c6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        nx2 nx2Var = this.c;
        if (nx2Var != null) {
            nx2Var.X(false);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.L(bkb.w0(null, bkb.x6, false), true);
                a aVar2 = this.actionBar;
                int i = bkb.F6;
                aVar2.L(bkb.w0(null, i, false), false);
                this.actionBar.setSearchCursorColor(bkb.w0(null, i, false));
            }
            o39 o39Var = this.a;
            if (o39Var != null) {
                o39Var.x1();
                if (this.a.getFastScroll() != null) {
                    this.a.getFastScroll().invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
