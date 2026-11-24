package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.Crop.CropAreaView;
public abstract class y23 extends FrameLayout {
    public final c33 E;
    public boolean F;
    public final i7b a;
    public e68 b;
    public final lm c;
    public final lm d;
    public final x23 e;
    public final FrameLayout f;
    public final q23 h;
    public final b33 n;
    public final FrameLayout r;
    public float s;
    public final int[] w;
    public final int[] x;
    public final int[] y;

    public y23(Context context, i7b i7bVar) {
        super(context);
        this.s = 0.0f;
        this.w = new int[2];
        this.x = new int[2];
        this.y = new int[2];
        this.E = new Object();
        this.a = i7bVar;
        x23 x23Var = new x23(this, context);
        this.e = x23Var;
        s33 s33Var = s33.h;
        this.c = new lm(x23Var, 0L, 320L, s33Var);
        this.d = new lm(x23Var, 0L, 320L, s33Var);
        q23 q23Var = new q23(this, context, (byte) 1);
        this.h = q23Var;
        q23Var.setListener(new i4d(this));
        addView(q23Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout, nme.e(-1, -1, 119));
        b33 b33Var = new b33(context);
        this.n = b33Var;
        b33Var.setListener(new r23(this, (byte) 1));
        frameLayout.addView(b33Var, nme.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout.addView(frameLayout2, nme.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        ir2.t(textView, 1, 14.0f);
        textView.setBackground(bkb.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(k96.M0(2131752577, null));
        textView.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        frameLayout2.addView(textView, nme.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final y23 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                y23 y23Var = this.b;
                switch (b) {
                    case 0:
                        ((f7b) y23Var).G.k0(-1, false, true);
                        return;
                    case 1:
                        y23Var.h.l(true);
                        b33 b33Var2 = y23Var.n;
                        b33Var2.setRotated(false);
                        b33Var2.setMirrored(false);
                        b33Var2.b(0.0f);
                        return;
                    default:
                        e68 e68Var = y23Var.b;
                        if (e68Var != null) {
                            e68Var.I0 = new zl6();
                            y23Var.h.a(y23Var.b.I0);
                            e68 e68Var2 = y23Var.b;
                            e68Var2.I0.z = e68Var2.getOrientation();
                            y23Var.b.k();
                            y23Var.b.requestLayout();
                            y23Var.b.B0.requestLayout();
                            y23Var.b.B0.invalidate();
                            y23Var.b.B0.post(new mk2(y23Var, (byte) 15));
                        }
                        ((f7b) y23Var).G.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gl.o());
        textView2.setBackground(bkb.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(k96.M0(2131751684, null));
        textView2.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        frameLayout2.addView(textView2, nme.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final y23 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                y23 y23Var = this.b;
                switch (b) {
                    case 0:
                        ((f7b) y23Var).G.k0(-1, false, true);
                        return;
                    case 1:
                        y23Var.h.l(true);
                        b33 b33Var2 = y23Var.n;
                        b33Var2.setRotated(false);
                        b33Var2.setMirrored(false);
                        b33Var2.b(0.0f);
                        return;
                    default:
                        e68 e68Var = y23Var.b;
                        if (e68Var != null) {
                            e68Var.I0 = new zl6();
                            y23Var.h.a(y23Var.b.I0);
                            e68 e68Var2 = y23Var.b;
                            e68Var2.I0.z = e68Var2.getOrientation();
                            y23Var.b.k();
                            y23Var.b.requestLayout();
                            y23Var.b.B0.requestLayout();
                            y23Var.b.B0.invalidate();
                            y23Var.b.B0.post(new mk2(y23Var, (byte) 15));
                        }
                        ((f7b) y23Var).G.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(gl.o());
        textView3.setBackground(bkb.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(k96.M0(2131744448, null));
        textView3.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        frameLayout2.addView(textView3, nme.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final y23 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                y23 y23Var = this.b;
                switch (b) {
                    case 0:
                        ((f7b) y23Var).G.k0(-1, false, true);
                        return;
                    case 1:
                        y23Var.h.l(true);
                        b33 b33Var2 = y23Var.n;
                        b33Var2.setRotated(false);
                        b33Var2.setMirrored(false);
                        b33Var2.b(0.0f);
                        return;
                    default:
                        e68 e68Var = y23Var.b;
                        if (e68Var != null) {
                            e68Var.I0 = new zl6();
                            y23Var.h.a(y23Var.b.I0);
                            e68 e68Var2 = y23Var.b;
                            e68Var2.I0.z = e68Var2.getOrientation();
                            y23Var.b.k();
                            y23Var.b.requestLayout();
                            y23Var.b.B0.requestLayout();
                            y23Var.b.B0.invalidate();
                            y23Var.b.B0.post(new mk2(y23Var, (byte) 15));
                        }
                        ((f7b) y23Var).G.k0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        e68 e68Var = this.b;
        if (e68Var == null) {
            return 1;
        }
        if (e68Var.getOrientation() != 90 && this.b.getOrientation() != 270) {
            return this.b.getContentHeight();
        }
        return this.b.getContentWidth();
    }

    public int getCurrentWidth() {
        e68 e68Var = this.b;
        if (e68Var == null) {
            return 1;
        }
        if (e68Var.getOrientation() != 90 && this.b.getOrientation() != 270) {
            return this.b.getContentWidth();
        }
        return this.b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.s;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        q23 q23Var = this.h;
        q23Var.setTopPadding(gl.L(52.0f));
        q23Var.setBottomPadding(gl.L(116.0f) + this.f.getPaddingBottom());
        super.onLayout(z, i, i2, i3, i4);
    }

    public void set(e68 e68Var) {
        if (e68Var == null) {
            return;
        }
        this.b = e68Var;
        setVisibility(0);
        this.F = false;
        q23 q23Var = this.h;
        boolean z = true;
        q23Var.K = true;
        getLocationOnScreen(this.w);
        this.a.getLocationOnScreen(this.x);
        e68Var.getLocationOnScreen(this.y);
        zl6 zl6Var = e68Var.I0;
        if (zl6Var == null) {
            zl6Var = null;
        }
        q23Var.p(e68Var.getOrientation(), this.E, zl6Var);
        float rotation = q23Var.getRotation();
        b33 b33Var = this.n;
        b33Var.setRotation(rotation);
        lm lmVar = this.c;
        if (zl6Var != null) {
            b33Var.b(zl6Var.d);
            if (zl6Var.k == 0) {
                z = false;
            }
            b33Var.setRotated(z);
            b33Var.setMirrored(zl6Var.l);
            lmVar.f(zl6Var.l, false);
        } else {
            b33Var.b(0.0f);
            b33Var.setRotated(false);
            b33Var.setMirrored(false);
            lmVar.getClass();
            lmVar.e(false, 0.0f);
        }
        q23Var.r(false);
        x23 x23Var = this.e;
        x23Var.setVisibility(0);
        x23Var.invalidate();
    }

    public void setAppearProgress(float f) {
        if (Math.abs(this.s - f) < 0.001f) {
            return;
        }
        this.s = f;
        this.e.invalidate();
        q23 q23Var = this.h;
        CropAreaView cropAreaView = q23Var.a;
        CropAreaView cropAreaView2 = q23Var.a;
        cropAreaView.setDimAlpha(0.5f * f);
        cropAreaView2.setFrameAlpha(f);
        cropAreaView2.invalidate();
    }
}
