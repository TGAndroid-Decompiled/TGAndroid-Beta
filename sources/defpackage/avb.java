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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;
public final class avb extends d {
    public ValueAnimator E;
    public float F;
    public RadialProgressView G;
    public int H;
    public final int I;
    public final zka J;
    public final s19 K;
    public final wta L;
    public PorterDuffColorFilter M;
    public int N;
    public int O;
    public boolean P;
    public r59 a;
    public r59 b;
    public TextView c;
    public xub d;
    public zub e;
    public final ArrayList f;
    public final ArrayList h;
    public ct8 n;
    public r34 r;
    public FrameLayout s;
    public int w;
    public final HashSet x;
    public bvb y;

    public avb(int i) {
        super(null);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.x = new HashSet();
        this.I = gm.L(64.0f);
        this.J = new zka(this, (byte) 8);
        this.K = new s19(this, (byte) 24);
        this.L = new wta(this, (byte) 22);
        this.arguments = kt6.j(i, "type");
    }

    public final void Z() {
        int w0;
        if (this.c != null && ((w0 = cmb.w0(null, cmb.Ei, false)) != this.O || this.P != cmb.I.o())) {
            this.P = cmb.I.o();
            this.O = w0;
            cmb.F1(this.c.getBackground(), w0, false);
            cmb.F1(this.c.getBackground(), ulb.b(w0), true);
        }
        RadialProgressView radialProgressView = this.G;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(cmb.w0(null, cmb.g6, false));
        }
    }

    public final void a0() {
        try {
            if (this.a != null) {
                int w0 = cmb.w0(null, cmb.a7, false);
                if (this.M == null || this.N != w0) {
                    this.N = w0;
                    this.M = new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY);
                }
                for (int i = 0; i < this.a.getChildCount(); i++) {
                    View childAt = this.a.getChildAt(i);
                    if ((childAt instanceof bba) && (childAt.getBackground() instanceof sn2)) {
                        cmb.z1(childAt.getBackground(), cmb.w0(null, cmb.Z6, false), false);
                        Drawable drawable = ((sn2) childAt.getBackground()).b;
                        if (drawable != null) {
                            drawable.setColorFilter(this.M);
                        }
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.o7));
        hashSet.add(Integer.valueOf(cmb.Gi));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.Z6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.f9));
        hashSet.add(Integer.valueOf(cmb.l9));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override
    public final View createView(Context context) {
        this.H = this.arguments.getInt("type", 0);
        this.actionBar.setBackButtonImage(2131231244);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(jb6.M0(2131748735, null));
        this.actionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 21));
        r7 a = this.actionBar.t().a(0, 2131232503);
        a.N();
        a.I = new vub(this);
        a.setContentDescription(jb6.M0(2131745570, null));
        a.setSearchFieldHint(jb6.M0(2131745570, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r59 r59Var = new r59(context, null);
        this.a = r59Var;
        r59Var.setLayoutManager(new u46());
        r59 r59Var2 = this.a;
        xub xubVar = new xub(this);
        this.d = xubVar;
        r59Var2.setAdapter(xubVar);
        this.a.setClipToPadding(false);
        r59 r59Var3 = this.a;
        s19 s19Var = this.K;
        r59Var3.setOnItemClickListener(s19Var);
        r59 r59Var4 = this.a;
        wta wtaVar = this.L;
        r59Var4.setOnItemLongClickListener(wtaVar);
        r59 r59Var5 = new r59(context, null);
        this.b = r59Var5;
        r59Var5.setLayoutManager(new u46());
        r59 r59Var6 = this.b;
        zub zubVar = new zub(this);
        this.e = zubVar;
        r59Var6.setAdapter(zubVar);
        this.b.setOnItemClickListener(s19Var);
        this.b.setOnItemLongClickListener(wtaVar);
        this.b.setOnScrollListener(new k2b(this, (byte) 4));
        r34 r34Var = new r34(context, null);
        this.r = r34Var;
        r34Var.setShowAtCenter(true);
        this.r.setText(jb6.M0(2131747901, null));
        this.r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.G = radialProgressView;
        frameLayout.addView(radialProgressView, qoe.c(-2.0f, -2));
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
        gm.d3(this.J, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new go9(this, (byte) 14));
        View view = this.fragmentView;
        int i = cmb.c6;
        anb.h(i, null, view);
        ct8 ct8Var = new ct8(context, (byte) 16);
        this.n = ct8Var;
        ct8Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        anb.X(textView, cmb.Ii, null);
        this.c.setGravity(17);
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(gm.o());
        this.c.setBackground(ulb.f(cmb.Ei, 4.0f));
        frameLayout.addView(this.n, qoe.e(-1, 64, 80));
        anb.h(i, null, this.n);
        this.n.addView(this.c, qoe.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.n.setVisibility(8);
        this.c.setOnClickListener(new oha(this, (byte) 24));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        t10 t10Var = new t10(this, (byte) 23);
        arrayList.add(new cnb(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.B8));
        arrayList.add(new cnb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.C8));
        int i = cmb.Qi;
        arrayList.add(new cnb(this.a, 4, new Class[]{xc5.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, i));
        int i2 = cmb.h7;
        arrayList.add(new cnb(this.a, 4, new Class[]{xc5.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i2));
        int i3 = cmb.i7;
        arrayList.add(new cnb(this.a, 4, new Class[]{xc5.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i3));
        int i4 = cmb.j7;
        arrayList.add(new cnb(this.a, 4, new Class[]{xc5.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i4));
        arrayList.add(new cnb(this.b, 4, new Class[]{xc5.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.b, 4, new Class[]{xc5.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.b, 4, new Class[]{xc5.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i3));
        arrayList.add(new cnb(this.b, 4, new Class[]{xc5.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i4));
        arrayList.add(new cnb(this.r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.b7));
        arrayList.add(new cnb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, cmb.Ei));
        arrayList.add(new cnb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, cmb.Gi));
        return arrayList;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            Z();
            a0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
