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
public abstract class iz4 extends d {
    public dr0 E;
    public int F;
    public t26 G;
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
    public final fz4 a;
    public final fz4 b;
    public o39 c;
    public Drawable d;
    public cra e;
    public boolean f;
    public boolean h;
    public float n;
    public int r;
    public hz4 s;
    public float w;
    public final Canvas x;
    public float y;

    public iz4() {
        super(null);
        int i = bkb.Fk;
        int i2 = bkb.Gk;
        int i3 = bkb.Hk;
        int i4 = bkb.Ik;
        this.a = new fz4(i, i2, i3, i4, null, (byte) 0);
        fz4 fz4Var = new fz4(i, i2, i3, i4, null, (byte) 1);
        this.b = fz4Var;
        this.x = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.F = -1;
        this.H = true;
        this.L = new Paint();
        fz4Var.n = true;
        this.Q = -1;
    }

    @Override
    public View createView(Context context) {
        int i;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(2131232733).mutate();
        this.d = mutate;
        int themedColor = getThemedColor(bkb.g5);
        this.P = themedColor;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).T0) {
            i = 0;
        } else {
            i = gl.m;
        }
        this.J = i;
        this.s = new hz4(this, getParentActivity());
        if (this.simpleActionBar == null) {
            ui5 ui5Var2 = this.parentLayout;
            if (ui5Var2 != null && ((ActionBarLayout) ui5Var2).T0) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.actionBar.setAddToContainer(false);
        }
        this.c = new o39(context, null);
        t26 k0 = k0(context);
        this.G = k0;
        this.c.setLayoutManager(k0);
        t26 t26Var = this.G;
        if (t26Var instanceof wb4) {
            ((wb4) t26Var).R = true;
        }
        w39 j0 = j0();
        this.c.setAdapter(j0);
        boolean z = j0 instanceof l5c;
        o39 o39Var = this.c;
        if (z) {
            z02 z02Var = new z02(this, (byte) 2);
            int L = gl.L(12.0f);
            float L2 = gl.L(16.0f);
            o39Var.getClass();
            SparseIntArray sparseIntArray = new SparseIntArray();
            Pair pair = new Pair(new r(o39Var, z02Var, sparseIntArray, (byte) 3), new z02(sparseIntArray, (byte) 7));
            o39Var.t1((q8c) pair.first, (q8c) pair.second, L, L2, true);
        } else {
            o39Var.setSections(true);
        }
        this.c.setClipToPadding(false);
        this.c.j(new ao2(this, (byte) 15));
        this.E = new dr0(context);
        hz4 hz4Var = this.s;
        cra l0 = l0();
        this.e = l0;
        hz4Var.addView(l0, nme.c(-2.0f, -1));
        this.s.addView(this.E, nme.c(-2.0f, -1));
        h0();
        this.s.addView(o0());
        this.fragmentView = this.s;
        vm2 vm2Var = new vm2(this, (byte) 21);
        pha phaVar = this.simpleActionBar;
        if (phaVar != null) {
            phaVar.setBackground(null);
            this.simpleActionBar.setBackButtonImage(2131231243);
            this.simpleActionBar.setActionBarMenuOnItemClick(vm2Var);
            this.simpleActionBar.setForceSkipTouches(true);
        } else {
            this.actionBar.setBackground(null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setBackButtonImage(2131231243);
            this.actionBar.setActionBarMenuOnItemClick(vm2Var);
            this.actionBar.setForceSkipTouches(true);
        }
        w0();
        return this.fragmentView;
    }

    public void g0() {
        o39 o39Var = this.c;
        if (o39Var != null && this.G != null && this.Q >= 0) {
            int i = this.R;
            o39Var.K(0);
            this.G.g1(this.Q, i);
            this.Q = -1;
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return hue.a(new t00(this, (byte) 7), bkb.Bk, bkb.Ck, bkb.Dk, bkb.Ek, bkb.Fk, bkb.Gk, bkb.Hk, bkb.Ik, bkb.Jk, bkb.Lk, bkb.Mk, bkb.Kk, bkb.Pk);
    }

    public void h0() {
        this.s.addView(this.c, nme.c(-1.0f, -1));
    }

    public final void i0(String str, CharSequence charSequence, FrameLayout frameLayout, io0 io0Var) {
        dr0 dr0Var = this.E;
        FrameLayout frameLayout2 = (FrameLayout) dr0Var.e;
        ((TextView) dr0Var.b).setText(str);
        l46 l46Var = (l46) dr0Var.c;
        l46Var.setText(charSequence);
        l46Var.setMaxWidth(je5.a(l46Var.getText(), l46Var.getPaint()));
        FrameLayout frameLayout3 = (FrameLayout) dr0Var.d;
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, nme.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (io0Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(io0Var, nme.e(-1, -2, 1));
            frameLayout2.setClickable(io0Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        dr0Var.requestLayout();
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.N && !bkb.I.o()) {
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

    public abstract w39 j0();

    public t26 k0(Context context) {
        if (this.H) {
            return new wb4((gl.L(68.0f) + this.J) - gl.L(16.0f), this.c);
        }
        return new t26();
    }

    public cra l0() {
        return new ub(getParentActivity(), (byte) 3);
    }

    public boolean m0() {
        return !(this instanceof jva);
    }

    public View n0(Context context) {
        sb sbVar = new sb((byte) 13, (Activity) context, this);
        sbVar.setTag(-33024);
        return sbVar;
    }

    public final FrameLayout o0() {
        pha phaVar = this.simpleActionBar;
        if (phaVar != null) {
            return phaVar;
        }
        return this.actionBar;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        x0(false);
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.c.setPadding(0, 0, 0, i4);
    }

    @Override
    public void onPause() {
        super.onPause();
        cra craVar = this.e;
        if (craVar != null) {
            craVar.setPaused(true);
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
            int themedColor = getThemedColor(bkb.g5);
            Drawable drawable = this.d;
            if (drawable != null && themedColor != this.P) {
                this.P = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            cra craVar = this.e;
            if (craVar != null && craVar.a != null && this.s != null) {
                w0();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public float p0() {
        return 0.0f;
    }

    public View q0() {
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
        x0(z);
        return showDialog;
    }

    public void t0() {
        View view;
        int i;
        o39 o39Var = this.c;
        if (o39Var != null && o39Var.getChildCount() > 0) {
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

    public final Paint u0(float f, float f2) {
        int measuredWidth = this.s.getMeasuredWidth();
        int measuredHeight = this.s.getMeasuredHeight();
        fz4 fz4Var = this.b;
        fz4Var.d(0, (-f) - ((this.s.getMeasuredWidth() * 0.1f) * this.n), 0, measuredWidth, -f2, measuredHeight);
        return fz4Var.f;
    }

    public final void v0() {
        if (this.s.getMeasuredWidth() != 0 && this.s.getMeasuredHeight() != 0 && this.E != null) {
            int measuredWidth = this.s.getMeasuredWidth();
            int measuredHeight = this.s.getMeasuredHeight();
            fz4 fz4Var = this.a;
            fz4Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.x;
            canvas.save();
            canvas.scale(100.0f / this.s.getMeasuredWidth(), 100.0f / this.s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.s.getMeasuredWidth(), this.s.getMeasuredHeight(), fz4Var.f);
            canvas.restore();
        }
    }

    public final void w0() {
        if (this.E != null) {
            if (this.actionBar != null || this.simpleActionBar != null) {
                this.L.setColor(getThemedColor(bkb.g5));
                if (this.actionBar != null) {
                    int w0 = bkb.w0(null, bkb.Jk, false);
                    if (w0 != this.O) {
                        this.O = w0;
                        this.actionBar.H(w0, false);
                    }
                    int o = bm2.o(w0, 60);
                    a aVar = this.actionBar;
                    if (aVar.q0 != o) {
                        aVar.G(o, false);
                    }
                }
                this.e.a.g();
                dr0 dr0Var = this.E;
                if (dr0Var != null) {
                    boolean z = this.N;
                    TextView textView = (TextView) dr0Var.b;
                    if (z) {
                        int i = bkb.F6;
                        textView.setTextColor(bkb.w0(null, i, false));
                        ((l46) this.E.c).setTextColor(bkb.w0(null, i, false));
                        ((l46) this.E.c).setLinkTextColor(bkb.w0(null, bkb.Wc, false));
                    } else {
                        int i2 = bkb.Jk;
                        textView.setTextColor(bkb.w0(null, i2, false));
                        ((l46) this.E.c).setTextColor(bkb.w0(null, i2, false));
                        ((l46) this.E.c).setLinkTextColor(bkb.w0(null, bkb.Wc, false));
                    }
                }
                v0();
            }
        }
    }

    public final void x0(boolean z) {
        if (z != this.f) {
            this.f = z;
            this.e.setPaused(z);
            this.s.invalidate();
        }
    }

    public boolean y0() {
        return this instanceof jva;
    }

    public void r0(boolean z) {
    }

    public void s0(float f) {
    }
}
