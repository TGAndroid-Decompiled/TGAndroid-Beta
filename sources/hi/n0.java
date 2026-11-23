package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.xe;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.nr;
public abstract class n0 extends FrameLayout {
    public final og.g E;
    public boolean F;
    public final w5 f15028a;
    public tg.p1 f15029b;
    public final org.telegram.ui.Components.d6 f15030c;
    public final org.telegram.ui.Components.d6 d;
    public final m0 f15031e;
    public final FrameLayout f15032f;
    public final h0 h;
    public final og.f f15033n;
    public final FrameLayout f15034r;
    public float f15035s;
    public final int[] f15036w;
    public final int[] f15037x;
    public final int[] f15038y;

    public n0(Context context, w5 w5Var) {
        super(context);
        this.f15035s = 0.0f;
        this.f15036w = new int[2];
        this.f15037x = new int[2];
        this.f15038y = new int[2];
        this.E = new Object();
        this.f15028a = w5Var;
        m0 m0Var = new m0(this, context);
        this.f15031e = m0Var;
        nr nrVar = nr.h;
        this.f15030c = new org.telegram.ui.Components.d6(m0Var, 0L, 320L, nrVar);
        this.d = new org.telegram.ui.Components.d6(m0Var, 0L, 320L, nrVar);
        h0 h0Var = new h0(this, context, 1);
        this.h = h0Var;
        h0Var.setListener(new h9.g1(this, 1));
        addView(h0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15032f = frameLayout;
        addView(frameLayout, c8.na.e(-1, -1, 119));
        og.f fVar = new og.f(context);
        this.f15033n = fVar;
        fVar.setListener(new i0(1, this));
        frameLayout.addView(fVar, c8.na.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f15034r = frameLayout2;
        frameLayout.addView(frameLayout2, c8.na.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        i5.c.x(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(hd.N0(2131752577, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, c8.na.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final n0 f14844b;

            {
                this.f14844b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ea) this.f14844b).G.k0(-1, false, true);
                        return;
                    case 1:
                        n0 n0Var = this.f14844b;
                        n0Var.h.l(true);
                        og.f fVar2 = n0Var.f15033n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        n0 n0Var2 = this.f14844b;
                        tg.p1 p1Var = n0Var2.f15029b;
                        if (p1Var != null) {
                            p1Var.H0 = new xe();
                            n0Var2.h.b(n0Var2.f15029b.H0);
                            tg.p1 p1Var2 = n0Var2.f15029b;
                            p1Var2.H0.f27853z = p1Var2.getOrientation();
                            n0Var2.f15029b.k();
                            n0Var2.f15029b.requestLayout();
                            n0Var2.f15029b.A0.requestLayout();
                            n0Var2.f15029b.A0.invalidate();
                            n0Var2.f15029b.A0.post(new b0(n0Var2, 1));
                        }
                        ((ea) n0Var2).G.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(hd.N0(2131751684, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, c8.na.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final n0 f14844b;

            {
                this.f14844b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ea) this.f14844b).G.k0(-1, false, true);
                        return;
                    case 1:
                        n0 n0Var = this.f14844b;
                        n0Var.h.l(true);
                        og.f fVar2 = n0Var.f15033n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        n0 n0Var2 = this.f14844b;
                        tg.p1 p1Var = n0Var2.f15029b;
                        if (p1Var != null) {
                            p1Var.H0 = new xe();
                            n0Var2.h.b(n0Var2.f15029b.H0);
                            tg.p1 p1Var2 = n0Var2.f15029b;
                            p1Var2.H0.f27853z = p1Var2.getOrientation();
                            n0Var2.f15029b.k();
                            n0Var2.f15029b.requestLayout();
                            n0Var2.f15029b.A0.requestLayout();
                            n0Var2.f15029b.A0.invalidate();
                            n0Var2.f15029b.A0.post(new b0(n0Var2, 1));
                        }
                        ((ea) n0Var2).G.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(hd.N0(2131744447, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, c8.na.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final n0 f14844b;

            {
                this.f14844b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ea) this.f14844b).G.k0(-1, false, true);
                        return;
                    case 1:
                        n0 n0Var = this.f14844b;
                        n0Var.h.l(true);
                        og.f fVar2 = n0Var.f15033n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        n0 n0Var2 = this.f14844b;
                        tg.p1 p1Var = n0Var2.f15029b;
                        if (p1Var != null) {
                            p1Var.H0 = new xe();
                            n0Var2.h.b(n0Var2.f15029b.H0);
                            tg.p1 p1Var2 = n0Var2.f15029b;
                            p1Var2.H0.f27853z = p1Var2.getOrientation();
                            n0Var2.f15029b.k();
                            n0Var2.f15029b.requestLayout();
                            n0Var2.f15029b.A0.requestLayout();
                            n0Var2.f15029b.A0.invalidate();
                            n0Var2.f15029b.A0.post(new b0(n0Var2, 1));
                        }
                        ((ea) n0Var2).G.k0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        tg.p1 p1Var = this.f15029b;
        if (p1Var == null) {
            return 1;
        }
        if (p1Var.getOrientation() != 90 && this.f15029b.getOrientation() != 270) {
            return this.f15029b.getContentHeight();
        }
        return this.f15029b.getContentWidth();
    }

    public int getCurrentWidth() {
        tg.p1 p1Var = this.f15029b;
        if (p1Var == null) {
            return 1;
        }
        if (p1Var.getOrientation() != 90 && this.f15029b.getOrientation() != 270) {
            return this.f15029b.getContentWidth();
        }
        return this.f15029b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f15035s;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        h0 h0Var = this.h;
        h0Var.setTopPadding(org.telegram.messenger.g0.L(52.0f));
        h0Var.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.f15032f.getPaddingBottom());
        super.onLayout(z10, i7, i10, i11, i12);
    }

    public void set(tg.p1 p1Var) {
        if (p1Var == null) {
            return;
        }
        this.f15029b = p1Var;
        setVisibility(0);
        this.F = false;
        h0 h0Var = this.h;
        boolean z10 = true;
        h0Var.K = true;
        getLocationOnScreen(this.f15036w);
        this.f15028a.getLocationOnScreen(this.f15037x);
        p1Var.getLocationOnScreen(this.f15038y);
        xe xeVar = p1Var.H0;
        if (xeVar == null) {
            xeVar = null;
        }
        h0Var.p(p1Var.getOrientation(), this.E, xeVar);
        float rotation = h0Var.getRotation();
        og.f fVar = this.f15033n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.d6 d6Var = this.f15030c;
        if (xeVar != null) {
            fVar.b(xeVar.d);
            if (xeVar.f27845k == 0) {
                z10 = false;
            }
            fVar.setRotated(z10);
            fVar.setMirrored(xeVar.f27846l);
            d6Var.f(xeVar.f27846l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            d6Var.getClass();
            d6Var.e(false, 0.0f);
        }
        h0Var.r(false);
        m0 m0Var = this.f15031e;
        m0Var.setVisibility(0);
        m0Var.invalidate();
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f15035s - f10) < 0.001f) {
            return;
        }
        this.f15035s = f10;
        this.f15031e.invalidate();
        h0 h0Var = this.h;
        CropAreaView cropAreaView = h0Var.f21887a;
        CropAreaView cropAreaView2 = h0Var.f21887a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
    }
}
