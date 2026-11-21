package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.we;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.nr;
public abstract class o0 extends FrameLayout {
    public final og.g E;
    public boolean F;
    public final v5 f15175a;
    public tg.p1 f15176b;
    public final org.telegram.ui.Components.d6 f15177c;
    public final org.telegram.ui.Components.d6 d;
    public final n0 f15178e;
    public final FrameLayout f15179f;
    public final i0 h;
    public final og.f f15180n;
    public final FrameLayout f15181r;
    public float f15182s;
    public final int[] f15183w;
    public final int[] f15184x;
    public final int[] f15185y;

    public o0(Context context, v5 v5Var) {
        super(context);
        this.f15182s = 0.0f;
        this.f15183w = new int[2];
        this.f15184x = new int[2];
        this.f15185y = new int[2];
        this.E = new Object();
        this.f15175a = v5Var;
        n0 n0Var = new n0(this, context);
        this.f15178e = n0Var;
        nr nrVar = nr.h;
        this.f15177c = new org.telegram.ui.Components.d6(n0Var, 0L, 320L, nrVar);
        this.d = new org.telegram.ui.Components.d6(n0Var, 0L, 320L, nrVar);
        i0 i0Var = new i0(this, context, 1);
        this.h = i0Var;
        i0Var.setListener(new h9.g1(this, 1));
        addView(i0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15179f = frameLayout;
        addView(frameLayout, c8.ma.e(-1, -1, 119));
        og.f fVar = new og.f(context);
        this.f15180n = fVar;
        fVar.setListener(new j0(1, this));
        frameLayout.addView(fVar, c8.ma.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f15181r = frameLayout2;
        frameLayout.addView(frameLayout2, c8.ma.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        i5.c.x(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(gd.N0(2131752577, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, c8.ma.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final o0 f15016b;

            {
                this.f15016b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((da) this.f15016b).G.k0(-1, false, true);
                        return;
                    case 1:
                        o0 o0Var = this.f15016b;
                        o0Var.h.l(true);
                        og.f fVar2 = o0Var.f15180n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        o0 o0Var2 = this.f15016b;
                        tg.p1 p1Var = o0Var2.f15176b;
                        if (p1Var != null) {
                            p1Var.H0 = new we();
                            o0Var2.h.b(o0Var2.f15176b.H0);
                            tg.p1 p1Var2 = o0Var2.f15176b;
                            p1Var2.H0.f27717z = p1Var2.getOrientation();
                            o0Var2.f15176b.k();
                            o0Var2.f15176b.requestLayout();
                            o0Var2.f15176b.A0.requestLayout();
                            o0Var2.f15176b.A0.invalidate();
                            o0Var2.f15176b.A0.post(new l(o0Var2, 2));
                        }
                        ((da) o0Var2).G.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(gd.N0(2131751684, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, c8.ma.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final o0 f15016b;

            {
                this.f15016b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((da) this.f15016b).G.k0(-1, false, true);
                        return;
                    case 1:
                        o0 o0Var = this.f15016b;
                        o0Var.h.l(true);
                        og.f fVar2 = o0Var.f15180n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        o0 o0Var2 = this.f15016b;
                        tg.p1 p1Var = o0Var2.f15176b;
                        if (p1Var != null) {
                            p1Var.H0 = new we();
                            o0Var2.h.b(o0Var2.f15176b.H0);
                            tg.p1 p1Var2 = o0Var2.f15176b;
                            p1Var2.H0.f27717z = p1Var2.getOrientation();
                            o0Var2.f15176b.k();
                            o0Var2.f15176b.requestLayout();
                            o0Var2.f15176b.A0.requestLayout();
                            o0Var2.f15176b.A0.invalidate();
                            o0Var2.f15176b.A0.post(new l(o0Var2, 2));
                        }
                        ((da) o0Var2).G.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(gd.N0(2131744447, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, c8.ma.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final o0 f15016b;

            {
                this.f15016b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((da) this.f15016b).G.k0(-1, false, true);
                        return;
                    case 1:
                        o0 o0Var = this.f15016b;
                        o0Var.h.l(true);
                        og.f fVar2 = o0Var.f15180n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        o0 o0Var2 = this.f15016b;
                        tg.p1 p1Var = o0Var2.f15176b;
                        if (p1Var != null) {
                            p1Var.H0 = new we();
                            o0Var2.h.b(o0Var2.f15176b.H0);
                            tg.p1 p1Var2 = o0Var2.f15176b;
                            p1Var2.H0.f27717z = p1Var2.getOrientation();
                            o0Var2.f15176b.k();
                            o0Var2.f15176b.requestLayout();
                            o0Var2.f15176b.A0.requestLayout();
                            o0Var2.f15176b.A0.invalidate();
                            o0Var2.f15176b.A0.post(new l(o0Var2, 2));
                        }
                        ((da) o0Var2).G.k0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        tg.p1 p1Var = this.f15176b;
        if (p1Var == null) {
            return 1;
        }
        if (p1Var.getOrientation() != 90 && this.f15176b.getOrientation() != 270) {
            return this.f15176b.getContentHeight();
        }
        return this.f15176b.getContentWidth();
    }

    public int getCurrentWidth() {
        tg.p1 p1Var = this.f15176b;
        if (p1Var == null) {
            return 1;
        }
        if (p1Var.getOrientation() != 90 && this.f15176b.getOrientation() != 270) {
            return this.f15176b.getContentWidth();
        }
        return this.f15176b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f15182s;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        i0 i0Var = this.h;
        i0Var.setTopPadding(org.telegram.messenger.g0.L(52.0f));
        i0Var.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.f15179f.getPaddingBottom());
        super.onLayout(z10, i7, i10, i11, i12);
    }

    public void set(tg.p1 p1Var) {
        if (p1Var == null) {
            return;
        }
        this.f15176b = p1Var;
        setVisibility(0);
        this.F = false;
        i0 i0Var = this.h;
        boolean z10 = true;
        i0Var.K = true;
        getLocationOnScreen(this.f15183w);
        this.f15175a.getLocationOnScreen(this.f15184x);
        p1Var.getLocationOnScreen(this.f15185y);
        we weVar = p1Var.H0;
        if (weVar == null) {
            weVar = null;
        }
        i0Var.p(p1Var.getOrientation(), this.E, weVar);
        float rotation = i0Var.getRotation();
        og.f fVar = this.f15180n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.d6 d6Var = this.f15177c;
        if (weVar != null) {
            fVar.b(weVar.d);
            if (weVar.f27709k == 0) {
                z10 = false;
            }
            fVar.setRotated(z10);
            fVar.setMirrored(weVar.f27710l);
            d6Var.f(weVar.f27710l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            d6Var.getClass();
            d6Var.e(false, 0.0f);
        }
        i0Var.r(false);
        n0 n0Var = this.f15178e;
        n0Var.setVisibility(0);
        n0Var.invalidate();
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f15182s - f10) < 0.001f) {
            return;
        }
        this.f15182s = f10;
        this.f15178e.invalidate();
        i0 i0Var = this.h;
        CropAreaView cropAreaView = i0Var.f21918a;
        CropAreaView cropAreaView2 = i0Var.f21918a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
    }
}
