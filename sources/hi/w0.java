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
import org.telegram.ui.Components.kr;
public abstract class w0 extends FrameLayout {
    public final og.g E;
    public boolean F;
    public final f6 f15632a;
    public tg.s1 f15633b;
    public final org.telegram.ui.Components.c6 f15634c;
    public final org.telegram.ui.Components.c6 d;
    public final v0 f15635e;
    public final FrameLayout f15636f;
    public final p0 h;
    public final og.f f15637n;
    public final FrameLayout f15638r;
    public float f15639s;
    public final int[] f15640w;
    public final int[] f15641x;
    public final int[] f15642y;

    public w0(Context context, f6 f6Var) {
        super(context);
        this.f15639s = 0.0f;
        this.f15640w = new int[2];
        this.f15641x = new int[2];
        this.f15642y = new int[2];
        this.E = new Object();
        this.f15632a = f6Var;
        v0 v0Var = new v0(this, context);
        this.f15635e = v0Var;
        kr krVar = kr.h;
        this.f15634c = new org.telegram.ui.Components.c6(v0Var, 0L, 320L, krVar);
        this.d = new org.telegram.ui.Components.c6(v0Var, 0L, 320L, krVar);
        p0 p0Var = new p0(this, context, 1);
        this.h = p0Var;
        p0Var.setListener(new u0(this, 0));
        addView(p0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15636f = frameLayout;
        addView(frameLayout, c8.na.e(-1, -1, 119));
        og.f fVar = new og.f(context);
        this.f15637n = fVar;
        fVar.setListener(new q0(1, this));
        frameLayout.addView(fVar, c8.na.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f15638r = frameLayout2;
        frameLayout.addView(frameLayout2, c8.na.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        i5.c.x(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(gd.N0(2131752577, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, c8.na.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final w0 f15429b;

            {
                this.f15429b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ya) this.f15429b).G.k0(-1, false, true);
                        return;
                    case 1:
                        w0 w0Var = this.f15429b;
                        w0Var.h.l(true);
                        og.f fVar2 = w0Var.f15637n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        w0 w0Var2 = this.f15429b;
                        tg.s1 s1Var = w0Var2.f15633b;
                        if (s1Var != null) {
                            s1Var.I0 = new we();
                            w0Var2.h.b(w0Var2.f15633b.I0);
                            tg.s1 s1Var2 = w0Var2.f15633b;
                            s1Var2.I0.f27783z = s1Var2.getOrientation();
                            w0Var2.f15633b.k();
                            w0Var2.f15633b.requestLayout();
                            w0Var2.f15633b.B0.requestLayout();
                            w0Var2.f15633b.B0.invalidate();
                            w0Var2.f15633b.B0.post(new w(w0Var2, 3));
                        }
                        ((ya) w0Var2).G.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(gd.N0(2131751684, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, c8.na.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final w0 f15429b;

            {
                this.f15429b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ya) this.f15429b).G.k0(-1, false, true);
                        return;
                    case 1:
                        w0 w0Var = this.f15429b;
                        w0Var.h.l(true);
                        og.f fVar2 = w0Var.f15637n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        w0 w0Var2 = this.f15429b;
                        tg.s1 s1Var = w0Var2.f15633b;
                        if (s1Var != null) {
                            s1Var.I0 = new we();
                            w0Var2.h.b(w0Var2.f15633b.I0);
                            tg.s1 s1Var2 = w0Var2.f15633b;
                            s1Var2.I0.f27783z = s1Var2.getOrientation();
                            w0Var2.f15633b.k();
                            w0Var2.f15633b.requestLayout();
                            w0Var2.f15633b.B0.requestLayout();
                            w0Var2.f15633b.B0.invalidate();
                            w0Var2.f15633b.B0.post(new w(w0Var2, 3));
                        }
                        ((ya) w0Var2).G.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(gd.N0(2131744444, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, c8.na.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final w0 f15429b;

            {
                this.f15429b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ya) this.f15429b).G.k0(-1, false, true);
                        return;
                    case 1:
                        w0 w0Var = this.f15429b;
                        w0Var.h.l(true);
                        og.f fVar2 = w0Var.f15637n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        w0 w0Var2 = this.f15429b;
                        tg.s1 s1Var = w0Var2.f15633b;
                        if (s1Var != null) {
                            s1Var.I0 = new we();
                            w0Var2.h.b(w0Var2.f15633b.I0);
                            tg.s1 s1Var2 = w0Var2.f15633b;
                            s1Var2.I0.f27783z = s1Var2.getOrientation();
                            w0Var2.f15633b.k();
                            w0Var2.f15633b.requestLayout();
                            w0Var2.f15633b.B0.requestLayout();
                            w0Var2.f15633b.B0.invalidate();
                            w0Var2.f15633b.B0.post(new w(w0Var2, 3));
                        }
                        ((ya) w0Var2).G.k0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        tg.s1 s1Var = this.f15633b;
        if (s1Var == null) {
            return 1;
        }
        if (s1Var.getOrientation() != 90 && this.f15633b.getOrientation() != 270) {
            return this.f15633b.getContentHeight();
        }
        return this.f15633b.getContentWidth();
    }

    public int getCurrentWidth() {
        tg.s1 s1Var = this.f15633b;
        if (s1Var == null) {
            return 1;
        }
        if (s1Var.getOrientation() != 90 && this.f15633b.getOrientation() != 270) {
            return this.f15633b.getContentWidth();
        }
        return this.f15633b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f15639s;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        p0 p0Var = this.h;
        p0Var.setTopPadding(org.telegram.messenger.g0.L(52.0f));
        p0Var.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.f15636f.getPaddingBottom());
        super.onLayout(z10, i7, i10, i11, i12);
    }

    public void set(tg.s1 s1Var) {
        if (s1Var == null) {
            return;
        }
        this.f15633b = s1Var;
        setVisibility(0);
        this.F = false;
        p0 p0Var = this.h;
        boolean z10 = true;
        p0Var.K = true;
        getLocationOnScreen(this.f15640w);
        this.f15632a.getLocationOnScreen(this.f15641x);
        s1Var.getLocationOnScreen(this.f15642y);
        we weVar = s1Var.I0;
        if (weVar == null) {
            weVar = null;
        }
        p0Var.p(s1Var.getOrientation(), this.E, weVar);
        float rotation = p0Var.getRotation();
        og.f fVar = this.f15637n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.c6 c6Var = this.f15634c;
        if (weVar != null) {
            fVar.b(weVar.d);
            if (weVar.f27775k == 0) {
                z10 = false;
            }
            fVar.setRotated(z10);
            fVar.setMirrored(weVar.f27776l);
            c6Var.f(weVar.f27776l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            c6Var.getClass();
            c6Var.e(false, 0.0f);
        }
        p0Var.r(false);
        v0 v0Var = this.f15635e;
        v0Var.setVisibility(0);
        v0Var.invalidate();
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f15639s - f10) < 0.001f) {
            return;
        }
        this.f15639s = f10;
        this.f15635e.invalidate();
        p0 p0Var = this.h;
        CropAreaView cropAreaView = p0Var.f21987a;
        CropAreaView cropAreaView2 = p0Var.f21987a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
    }
}
