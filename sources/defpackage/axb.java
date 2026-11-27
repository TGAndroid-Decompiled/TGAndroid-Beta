package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgressView;
public final class axb extends e {
    public ValueAnimator E;
    public float F;
    public RadialProgressView G;
    public int H;
    public final int I;
    public final bva J;
    public final t39 K;
    public final ftb L;
    public PorterDuffColorFilter M;
    public int N;
    public int O;
    public boolean P;
    public d79 a;
    public d79 b;
    public TextView c;
    public xwb d;
    public zwb e;
    public final ArrayList f;
    public final ArrayList h;
    public ir8 n;
    public b34 r;
    public FrameLayout s;
    public int w;
    public final HashSet x;
    public bxb y;

    public axb(int i) {
        super(null);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.x = new HashSet();
        this.I = hl.L(64.0f);
        this.J = new bva(this, (byte) 7);
        this.K = new t39(this, (byte) 23);
        this.L = new ftb(this, (byte) 1);
        this.arguments = qu6.j(i, "type");
    }

    public final void Y() {
        int w0;
        if (this.c != null && ((w0 = aob.w0(null, aob.Fi, false)) != this.O || this.P != aob.I.o())) {
            this.P = aob.I.o();
            this.O = w0;
            aob.F1(this.c.getBackground(), w0, false);
            aob.F1(this.c.getBackground(), rnb.b(w0), true);
        }
        RadialProgressView radialProgressView = this.G;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(aob.w0(null, aob.h6, false));
        }
    }

    public final void Z() {
        try {
            if (this.a != null) {
                int w0 = aob.w0(null, aob.b7, false);
                if (this.M == null || this.N != w0) {
                    this.N = w0;
                    this.M = new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY);
                }
                for (int i = 0; i < this.a.getChildCount(); i++) {
                    View childAt = this.a.getChildAt(i);
                    if ((childAt instanceof rca) && (childAt.getBackground() instanceof zm2)) {
                        aob.z1(childAt.getBackground(), aob.w0(null, aob.a7, false), false);
                        Drawable drawable = ((zm2) childAt.getBackground()).b;
                        if (drawable != null) {
                            drawable.setColorFilter(this.M);
                        }
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.p7));
        hashSet.add(Integer.valueOf(aob.Hi));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.a7));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.g9));
        hashSet.add(Integer.valueOf(aob.m9));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override
    public final View createView(Context context) {
        this.H = this.arguments.getInt("type", 0);
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(ob6.M0(2131748732, null));
        this.actionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 22));
        s7 a = this.actionBar.u().a(0, 2131232502);
        a.N();
        a.I = new vwb(this);
        a.setContentDescription(ob6.M0(2131745564, null));
        a.setSearchFieldHint(ob6.M0(2131745564, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        d79 d79Var = new d79(context, null);
        this.a = d79Var;
        d79Var.setLayoutManager(new x46());
        d79 d79Var2 = this.a;
        xwb xwbVar = new xwb(this);
        this.d = xwbVar;
        d79Var2.setAdapter(xwbVar);
        this.a.setClipToPadding(false);
        d79 d79Var3 = this.a;
        t39 t39Var = this.K;
        d79Var3.setOnItemClickListener(t39Var);
        d79 d79Var4 = this.a;
        ftb ftbVar = this.L;
        d79Var4.setOnItemLongClickListener(ftbVar);
        d79 d79Var5 = new d79(context, null);
        this.b = d79Var5;
        d79Var5.setLayoutManager(new x46());
        d79 d79Var6 = this.b;
        zwb zwbVar = new zwb(this);
        this.e = zwbVar;
        d79Var6.setAdapter(zwbVar);
        this.b.setOnItemClickListener(t39Var);
        this.b.setOnItemLongClickListener(ftbVar);
        this.b.setOnScrollListener(new qhb(this, (byte) 3));
        b34 b34Var = new b34(context, null);
        this.r = b34Var;
        b34Var.setShowAtCenter(true);
        this.r.setText(ob6.M0(2131747898, null));
        this.r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.G = radialProgressView;
        frameLayout.addView(radialProgressView, tre.c(-2.0f, -2));
        this.d.E();
        this.G.setVisibility(8);
        frameLayout.addView(this.a);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        frameLayout2.addView(this.b);
        this.s.addView(this.r);
        this.s.setVisibility(8);
        frameLayout.addView(this.s);
        this.d.f();
        this.F = 0.0f;
        hl.d3(this.J, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new yp9(this, (byte) 14));
        View view = this.fragmentView;
        int i = aob.d6;
        yob.h(i, null, view);
        ir8 ir8Var = new ir8(context, (byte) 17);
        this.n = ir8Var;
        ir8Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        yob.X(textView, aob.Ji, null);
        this.c.setGravity(17);
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(hl.o());
        this.c.setBackground(rnb.f(aob.Fi, 4.0f));
        frameLayout.addView(this.n, tre.e(-1, 64, 80));
        yob.h(i, null, this.n);
        this.n.addView(this.c, tre.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.n.setVisibility(8);
        this.c.setOnClickListener(new kla(this, (byte) 22));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        u00 u00Var = new u00(this, (byte) 23);
        arrayList.add(new apb(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.C8));
        arrayList.add(new apb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.D8));
        int i = aob.Ri;
        arrayList.add(new apb(this.a, 4, new Class[]{bd5.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, i));
        int i2 = aob.i7;
        arrayList.add(new apb(this.a, 4, new Class[]{bd5.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i2));
        int i3 = aob.j7;
        arrayList.add(new apb(this.a, 4, new Class[]{bd5.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i3));
        int i4 = aob.k7;
        arrayList.add(new apb(this.a, 4, new Class[]{bd5.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i4));
        arrayList.add(new apb(this.b, 4, new Class[]{bd5.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.b, 4, new Class[]{bd5.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.b, 4, new Class[]{bd5.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i3));
        arrayList.add(new apb(this.b, 4, new Class[]{bd5.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i4));
        arrayList.add(new apb(this.r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.c7));
        arrayList.add(new apb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, aob.Fi));
        arrayList.add(new apb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, aob.Hi));
        return arrayList;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            Y();
            Z();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
