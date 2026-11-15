package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.xe;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.er;
public abstract class j0 extends FrameLayout {
    public boolean E;
    public final x5 f14441a;
    public final org.telegram.ui.Components.u5 f14442b;
    public final org.telegram.ui.Components.u5 f14443c;
    public final i0 d;
    public final FrameLayout f14444e;
    public final g0 f14445f;
    public final og.f h;
    public final FrameLayout f14446n;
    public float f14447r;
    public final int[] f14448s;
    public final int[] f14449w;
    public final og.g f14450x;
    public d7 f14451y;

    public j0(Context context, x5 x5Var) {
        super(context);
        this.f14447r = 0.0f;
        this.f14448s = new int[2];
        this.f14449w = new int[2];
        this.f14450x = new Object();
        this.f14441a = x5Var;
        i0 i0Var = new i0(this, context);
        this.d = i0Var;
        er erVar = er.h;
        this.f14442b = new org.telegram.ui.Components.u5(i0Var, 0L, 320L, erVar);
        this.f14443c = new org.telegram.ui.Components.u5(this, 0L, 360L, erVar);
        g0 g0Var = new g0(this, context, 0);
        this.f14445f = g0Var;
        g0Var.setListener(new d6.i(this, 25));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14444e = frameLayout;
        addView(frameLayout, c8.ja.e(-1, -1, 119));
        og.f fVar = new og.f(context);
        this.h = fVar;
        fVar.setListener(new h0(0, this));
        frameLayout.addView(fVar, c8.ja.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f14446n = frameLayout2;
        frameLayout.addView(frameLayout2, c8.ja.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        i5.c.v(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.j6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(hd.M0(2131752589, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, c8.ja.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f14260b;

            {
                this.f14260b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ca) this.f14260b).F.k0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f14260b;
                        j0Var.f14445f.l(true);
                        og.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f14260b;
                        d7 d7Var = j0Var2.f14451y;
                        if (d7Var != null) {
                            d7Var.m0 = new xe();
                            j0Var2.f14445f.b(j0Var2.f14451y.m0);
                            d7 d7Var2 = j0Var2.f14451y;
                            d7Var2.m0.f27503z = d7Var2.Q;
                        }
                        ((ca) j0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.j6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(hd.M0(2131751696, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, c8.ja.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f14260b;

            {
                this.f14260b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ca) this.f14260b).F.k0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f14260b;
                        j0Var.f14445f.l(true);
                        og.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f14260b;
                        d7 d7Var = j0Var2.f14451y;
                        if (d7Var != null) {
                            d7Var.m0 = new xe();
                            j0Var2.f14445f.b(j0Var2.f14451y.m0);
                            d7 d7Var2 = j0Var2.f14451y;
                            d7Var2.m0.f27503z = d7Var2.Q;
                        }
                        ((ca) j0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.j6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(hd.M0(2131744688, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, c8.ja.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f14260b;

            {
                this.f14260b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ca) this.f14260b).F.k0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f14260b;
                        j0Var.f14445f.l(true);
                        og.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f14260b;
                        d7 d7Var = j0Var2.f14451y;
                        if (d7Var != null) {
                            d7Var.m0 = new xe();
                            j0Var2.f14445f.b(j0Var2.f14451y.m0);
                            d7 d7Var2 = j0Var2.f14451y;
                            d7Var2.m0.f27503z = d7Var2.Q;
                        }
                        ((ca) j0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
    }

    public int getCurrentHeight() {
        d7 d7Var = this.f14451y;
        if (d7Var == null) {
            return 1;
        }
        int i7 = d7Var.Q;
        x5 x5Var = this.f14441a;
        if (i7 != 90 && i7 != 270) {
            return x5Var.getContentHeight();
        }
        return x5Var.getContentWidth();
    }

    public int getCurrentWidth() {
        d7 d7Var = this.f14451y;
        if (d7Var == null) {
            return 1;
        }
        int i7 = d7Var.Q;
        x5 x5Var = this.f14441a;
        if (i7 != 90 && i7 != 270) {
            return x5Var.getContentWidth();
        }
        return x5Var.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f14447r;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        this.f14445f.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.f14444e.getPaddingBottom());
        super.onLayout(z10, i7, i10, i11, i12);
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f14447r - f10) < 0.001f) {
            return;
        }
        this.f14447r = f10;
        i0 i0Var = this.d;
        i0Var.setAlpha(f10);
        i0Var.invalidate();
        g0 g0Var = this.f14445f;
        CropAreaView cropAreaView = g0Var.f21530a;
        CropAreaView cropAreaView2 = g0Var.f21530a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
        this.f14441a.invalidate();
    }

    public void setEntry(d7 d7Var) {
        og.g gVar;
        boolean z10;
        if (d7Var == null) {
            return;
        }
        this.f14451y = d7Var;
        this.E = false;
        g0 g0Var = this.f14445f;
        g0Var.K = true;
        getLocationOnScreen(this.f14448s);
        int[] iArr = this.f14449w;
        x5 x5Var = this.f14441a;
        x5Var.getLocationOnScreen(iArr);
        xe xeVar = d7Var.m0;
        if (xeVar == null) {
            xeVar = null;
        }
        g0Var.p(d7Var.Q, this.f14450x, xeVar);
        float rotation = g0Var.getRotation();
        og.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.u5 u5Var = this.f14442b;
        if (xeVar != null) {
            fVar.b(xeVar.d);
            if (xeVar.f27495k != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            fVar.setRotated(z10);
            fVar.setMirrored(xeVar.f27496l);
            u5Var.f(xeVar.f27496l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            u5Var.getClass();
            u5Var.e(false, 0.0f);
        }
        g0Var.r(false);
        this.f14443c.e(true, gVar.f21493i);
        i0 i0Var = this.d;
        i0Var.setVisibility(0);
        i0Var.invalidate();
        x5Var.setCropEditorDrawing(this);
    }
}
