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
public final class zsb extends d {
    public ValueAnimator E;
    public float F;
    public RadialProgressView G;
    public int H;
    public final int I;
    public final xia J;
    public final f09 K;
    public final hza L;
    public PorterDuffColorFilter M;
    public int N;
    public int O;
    public boolean P;
    public o39 a;
    public o39 b;
    public TextView c;
    public wsb d;
    public ysb e;
    public final ArrayList f;
    public final ArrayList h;
    public ar8 n;
    public g24 r;
    public FrameLayout s;
    public int w;
    public final HashSet x;
    public atb y;

    public zsb(int i) {
        super(null);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.x = new HashSet();
        this.I = gl.L(64.0f);
        this.J = new xia(this, (byte) 8);
        this.K = new f09(this, (byte) 23);
        this.L = new hza(this, (byte) 18);
        this.arguments = ls6.j(i, "type");
    }

    public final void Y() {
        int w0;
        if (this.c != null && ((w0 = bkb.w0(null, bkb.Ei, false)) != this.O || this.P != bkb.I.o())) {
            this.P = bkb.I.o();
            this.O = w0;
            bkb.F1(this.c.getBackground(), w0, false);
            bkb.F1(this.c.getBackground(), sjb.b(w0), true);
        }
        RadialProgressView radialProgressView = this.G;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(bkb.w0(null, bkb.g6, false));
        }
    }

    public final void Z() {
        try {
            if (this.a != null) {
                int w0 = bkb.w0(null, bkb.a7, false);
                if (this.M == null || this.N != w0) {
                    this.N = w0;
                    this.M = new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY);
                }
                for (int i = 0; i < this.a.getChildCount(); i++) {
                    View childAt = this.a.getChildAt(i);
                    if ((childAt instanceof b9a) && (childAt.getBackground() instanceof fm2)) {
                        bkb.z1(childAt.getBackground(), bkb.w0(null, bkb.Z6, false), false);
                        Drawable drawable = ((fm2) childAt.getBackground()).b;
                        if (drawable != null) {
                            drawable.setColorFilter(this.M);
                        }
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.o7));
        hashSet.add(Integer.valueOf(bkb.Gi));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.Z6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.f9));
        hashSet.add(Integer.valueOf(bkb.l9));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override
    public final View createView(Context context) {
        this.H = this.arguments.getInt("type", 0);
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(k96.M0(2131748786, null));
        this.actionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 20));
        r7 a = this.actionBar.t().a(0, 2131232491);
        a.N();
        a.I = new usb(this);
        a.setContentDescription(k96.M0(2131745644, null));
        a.setSearchFieldHint(k96.M0(2131745644, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        o39 o39Var = new o39(context, null);
        this.a = o39Var;
        o39Var.setLayoutManager(new t26());
        o39 o39Var2 = this.a;
        wsb wsbVar = new wsb(this);
        this.d = wsbVar;
        o39Var2.setAdapter(wsbVar);
        this.a.setClipToPadding(false);
        o39 o39Var3 = this.a;
        f09 f09Var = this.K;
        o39Var3.setOnItemClickListener(f09Var);
        o39 o39Var4 = this.a;
        hza hzaVar = this.L;
        o39Var4.setOnItemLongClickListener(hzaVar);
        o39 o39Var5 = new o39(context, null);
        this.b = o39Var5;
        o39Var5.setLayoutManager(new t26());
        o39 o39Var6 = this.b;
        ysb ysbVar = new ysb(this);
        this.e = ysbVar;
        o39Var6.setAdapter(ysbVar);
        this.b.setOnItemClickListener(f09Var);
        this.b.setOnItemLongClickListener(hzaVar);
        this.b.setOnScrollListener(new vdb(this, (byte) 3));
        g24 g24Var = new g24(context, null);
        this.r = g24Var;
        g24Var.setShowAtCenter(true);
        this.r.setText(k96.M0(2131747975, null));
        this.r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.G = radialProgressView;
        frameLayout.addView(radialProgressView, nme.c(-2.0f, -2));
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
        gl.d3(this.J, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new wx9(this, (byte) 13));
        View view = this.fragmentView;
        int i = bkb.c6;
        zkb.h(i, null, view);
        ar8 ar8Var = new ar8(context, (byte) 16);
        this.n = ar8Var;
        ar8Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        zkb.X(textView, bkb.Ii, null);
        this.c.setGravity(17);
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(gl.o());
        this.c.setBackground(sjb.f(bkb.Ei, 4.0f));
        frameLayout.addView(this.n, nme.e(-1, 64, 80));
        zkb.h(i, null, this.n);
        this.n.addView(this.c, nme.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.n.setVisibility(8);
        this.c.setOnClickListener(new bna(this, (byte) 21));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        t00 t00Var = new t00(this, (byte) 23);
        arrayList.add(new blb(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.B8));
        arrayList.add(new blb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.C8));
        int i = bkb.Qi;
        arrayList.add(new blb(this.a, 4, new Class[]{za5.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, i));
        int i2 = bkb.h7;
        arrayList.add(new blb(this.a, 4, new Class[]{za5.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        int i3 = bkb.i7;
        arrayList.add(new blb(this.a, 4, new Class[]{za5.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i3));
        int i4 = bkb.j7;
        arrayList.add(new blb(this.a, 4, new Class[]{za5.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i4));
        arrayList.add(new blb(this.b, 4, new Class[]{za5.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.b, 4, new Class[]{za5.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.b, 4, new Class[]{za5.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i3));
        arrayList.add(new blb(this.b, 4, new Class[]{za5.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i4));
        arrayList.add(new blb(this.r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.b7));
        arrayList.add(new blb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, bkb.Ei));
        arrayList.add(new blb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, bkb.Gi));
        return arrayList;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            Y();
            Z();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
