package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public abstract class h15 extends d {
    public ds0 E;
    public int F;
    public u46 G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public final Paint L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public final e15 a;
    public final e15 b;
    public r59 c;
    public Drawable d;
    public dta e;
    public boolean f;
    public boolean h;
    public float n;
    public int r;
    public g15 s;
    public float w;
    public final Canvas x;
    public float y;

    public h15() {
        super(null);
        int i = cmb.Fk;
        int i2 = cmb.Gk;
        int i3 = cmb.Hk;
        int i4 = cmb.Ik;
        this.a = new e15(i, i2, i3, i4, null, (byte) 0);
        e15 e15Var = new e15(i, i2, i3, i4, null, (byte) 1);
        this.b = e15Var;
        this.x = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.F = -1;
        this.H = true;
        this.L = new Paint();
        e15Var.n = true;
        this.Q = -1;
    }

    @Override
    public View createView(Context context) {
        int i;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(2131232745).mutate();
        this.d = mutate;
        int themedColor = getThemedColor(cmb.g5);
        this.P = themedColor;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).T0) {
            i = 0;
        } else {
            i = gm.m;
        }
        this.J = i;
        this.s = new g15(this, getParentActivity());
        if (this.simpleActionBar == null) {
            tk5 tk5Var2 = this.parentLayout;
            if (tk5Var2 != null && ((ActionBarLayout) tk5Var2).T0) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.actionBar.setAddToContainer(false);
        }
        this.c = new r59(context, null);
        u46 l0 = l0(context);
        this.G = l0;
        this.c.setLayoutManager(l0);
        u46 u46Var = this.G;
        if (u46Var instanceof wd4) {
            ((wd4) u46Var).R = true;
        }
        y59 k0 = k0();
        this.c.setAdapter(k0);
        boolean z = k0 instanceof l7c;
        r59 r59Var = this.c;
        if (z) {
            k22 k22Var = new k22(this, (byte) 2);
            int L = gm.L(12.0f);
            float L2 = gm.L(16.0f);
            r59Var.getClass();
            SparseIntArray sparseIntArray = new SparseIntArray();
            Pair pair = new Pair(new r(r59Var, k22Var, sparseIntArray, (byte) 3), new k22(sparseIntArray, (byte) 7));
            r59Var.t1((rac) pair.first, (rac) pair.second, L, L2, true);
        } else {
            r59Var.setSections(true);
        }
        this.c.setClipToPadding(false);
        this.c.j(new ip2(this, (byte) 16));
        this.E = new ds0(context);
        g15 g15Var = this.s;
        dta m0 = m0();
        this.e = m0;
        g15Var.addView(m0, qoe.c(-2.0f, -1));
        this.s.addView(this.E, qoe.c(-2.0f, -1));
        i0();
        this.s.addView(p0());
        this.fragmentView = this.s;
        fh2 fh2Var = new fh2(this, (byte) 22);
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null) {
            rjaVar.setBackground(null);
            this.simpleActionBar.setBackButtonImage(2131231244);
            this.simpleActionBar.setActionBarMenuOnItemClick(fh2Var);
            this.simpleActionBar.setForceSkipTouches(true);
        } else {
            this.actionBar.setBackground(null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setBackButtonImage(2131231244);
            this.actionBar.setActionBarMenuOnItemClick(fh2Var);
            this.actionBar.setForceSkipTouches(true);
        }
        x0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return kwe.a(new t10(this, (byte) 7), cmb.Bk, cmb.Ck, cmb.Dk, cmb.Ek, cmb.Fk, cmb.Gk, cmb.Hk, cmb.Ik, cmb.Jk, cmb.Lk, cmb.Mk, cmb.Kk, cmb.Pk);
    }

    public void h0() {
        r59 r59Var = this.c;
        if (r59Var != null && this.G != null && this.Q >= 0) {
            int i = this.R;
            r59Var.K(0);
            this.G.g1(this.Q, i);
            this.Q = -1;
        }
    }

    public void i0() {
        this.s.addView(this.c, qoe.c(-1.0f, -1));
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.N && !cmb.I.o()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void j0(String str, CharSequence charSequence, FrameLayout frameLayout, ip0 ip0Var) {
        ds0 ds0Var = this.E;
        FrameLayout frameLayout2 = (FrameLayout) ds0Var.e;
        ((TextView) ds0Var.b).setText(str);
        l66 l66Var = (l66) ds0Var.c;
        l66Var.setText(charSequence);
        l66Var.setMaxWidth(hg5.a(l66Var.getText(), l66Var.getPaint()));
        FrameLayout frameLayout3 = (FrameLayout) ds0Var.d;
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, qoe.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (ip0Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(ip0Var, qoe.e(-1, -2, 1));
            frameLayout2.setClickable(ip0Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        ds0Var.requestLayout();
    }

    public abstract y59 k0();

    public u46 l0(Context context) {
        if (this.H) {
            return new wd4((gm.L(68.0f) + this.J) - gm.L(16.0f), this.c);
        }
        return new u46();
    }

    public dta m0() {
        return new ub(getParentActivity(), (byte) 3);
    }

    public boolean n0() {
        return !(this instanceof nxa);
    }

    public View o0(Context context) {
        sb sbVar = new sb((byte) 14, (Activity) context, this);
        sbVar.setTag(-33024);
        return sbVar;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        y0(false);
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.c.setPadding(0, 0, 0, i4);
    }

    @Override
    public void onPause() {
        super.onPause();
        dta dtaVar = this.e;
        if (dtaVar != null) {
            dtaVar.setPaused(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.e.setPaused(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int themedColor = getThemedColor(cmb.g5);
            Drawable drawable = this.d;
            if (drawable != null && themedColor != this.P) {
                this.P = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            dta dtaVar = this.e;
            if (dtaVar != null && dtaVar.a != null && this.s != null) {
                x0();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final FrameLayout p0() {
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null) {
            return rjaVar;
        }
        return this.actionBar;
    }

    public float q0() {
        return 0.0f;
    }

    public View r0() {
        return this.c;
    }

    @Override
    public final Dialog showDialog(Dialog dialog) {
        boolean z;
        Dialog showDialog = super.showDialog(dialog);
        if (showDialog != null) {
            z = true;
        } else {
            z = false;
        }
        y0(z);
        return showDialog;
    }

    public void u0() {
        View view;
        int i;
        r59 r59Var = this.c;
        if (r59Var != null && r59Var.getChildCount() > 0) {
            int i2 = 0;
            while (true) {
                if (i2 < this.c.getChildCount()) {
                    view = this.c.getChildAt(i2);
                    this.c.getClass();
                    i = RecyclerView.R(view);
                    if (i >= 0 && view.getTop() < Integer.MAX_VALUE) {
                        view.getTop();
                        break;
                    }
                    i2++;
                } else {
                    view = null;
                    i = -1;
                    break;
                }
            }
            if (view != null) {
                this.Q = i;
                this.R = view.getTop();
            }
        }
    }

    public final Paint v0(float f, float f2) {
        int measuredWidth = this.s.getMeasuredWidth();
        int measuredHeight = this.s.getMeasuredHeight();
        e15 e15Var = this.b;
        e15Var.d(0, (-f) - ((this.s.getMeasuredWidth() * 0.1f) * this.n), 0, measuredWidth, -f2, measuredHeight);
        return e15Var.f;
    }

    public final void w0() {
        if (this.s.getMeasuredWidth() != 0 && this.s.getMeasuredHeight() != 0 && this.E != null) {
            int measuredWidth = this.s.getMeasuredWidth();
            int measuredHeight = this.s.getMeasuredHeight();
            e15 e15Var = this.a;
            e15Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.x;
            canvas.save();
            canvas.scale(100.0f / this.s.getMeasuredWidth(), 100.0f / this.s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.s.getMeasuredWidth(), this.s.getMeasuredHeight(), e15Var.f);
            canvas.restore();
        }
    }

    public final void x0() {
        if (this.E != null) {
            if (this.actionBar != null || this.simpleActionBar != null) {
                this.L.setColor(getThemedColor(cmb.g5));
                if (this.actionBar != null) {
                    int w0 = cmb.w0(null, cmb.Jk, false);
                    if (w0 != this.O) {
                        this.O = w0;
                        this.actionBar.H(w0, false);
                    }
                    int p = on2.p(w0, 60);
                    a aVar = this.actionBar;
                    if (aVar.q0 != p) {
                        aVar.G(p, false);
                    }
                }
                this.e.a.g();
                ds0 ds0Var = this.E;
                if (ds0Var != null) {
                    boolean z = this.N;
                    TextView textView = (TextView) ds0Var.b;
                    if (z) {
                        int i = cmb.F6;
                        textView.setTextColor(cmb.w0(null, i, false));
                        ((l66) this.E.c).setTextColor(cmb.w0(null, i, false));
                        ((l66) this.E.c).setLinkTextColor(cmb.w0(null, cmb.Wc, false));
                    } else {
                        int i2 = cmb.Jk;
                        textView.setTextColor(cmb.w0(null, i2, false));
                        ((l66) this.E.c).setTextColor(cmb.w0(null, i2, false));
                        ((l66) this.E.c).setLinkTextColor(cmb.w0(null, cmb.Wc, false));
                    }
                }
                w0();
            }
        }
    }

    public final void y0(boolean z) {
        if (z != this.f) {
            this.f = z;
            this.e.setPaused(z);
            this.s.invalidate();
        }
    }

    public boolean z0() {
        return this instanceof nxa;
    }

    public void s0(boolean z) {
    }

    public void t0(float f) {
    }
}
