package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.es;
public abstract class l0 extends FrameLayout {
    public boolean E;
    public final a7 f7334a;
    public rg.z1 f7335b;
    public final org.telegram.ui.Components.g6 f7336c;
    public final org.telegram.ui.Components.g6 d;
    public final k0 e;
    public final FrameLayout f7337f;
    public final g0 h;
    public final mg.f f7338n;
    public final FrameLayout f7339r;
    public float f7340s;
    public final int[] v;
    public final int[] f7341w;
    public final int[] f7342x;
    public final mg.g f7343y;

    public l0(Context context, a7 a7Var) {
        super(context);
        this.f7340s = 0.0f;
        this.v = new int[2];
        this.f7341w = new int[2];
        this.f7342x = new int[2];
        this.f7343y = new Object();
        this.f7334a = a7Var;
        k0 k0Var = new k0(this, context);
        this.e = k0Var;
        es esVar = es.h;
        this.f7336c = new org.telegram.ui.Components.g6(k0Var, 0L, 320L, esVar);
        this.d = new org.telegram.ui.Components.g6(k0Var, 0L, 320L, esVar);
        g0 g0Var = new g0(this, context, 1);
        this.h = g0Var;
        g0Var.setListener(new ya.c(this, 15));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f7337f = frameLayout;
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        mg.f fVar = new mg.f(context);
        this.f7338n = fVar;
        fVar.setListener(new a6.i(this, 14));
        frameLayout.addView(fVar, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 52.0f, -1, 81));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f7339r = frameLayout2;
        frameLayout.addView(frameLayout2, w7.z5.a(52.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.g6.g0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.c1.b(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, w7.z5.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final l0 f7098b;

            {
                this.f7098b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((vb) this.f7098b).F.k0(-1, false, true);
                        return;
                    case 1:
                        l0 l0Var = this.f7098b;
                        l0Var.h.l(true);
                        mg.f fVar2 = l0Var.f7338n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        l0 l0Var2 = this.f7098b;
                        rg.z1 z1Var = l0Var2.f7335b;
                        if (z1Var != null) {
                            z1Var.G0 = new MediaController.CropState();
                            l0Var2.h.b(l0Var2.f7335b.G0);
                            rg.z1 z1Var2 = l0Var2.f7335b;
                            z1Var2.G0.orientation = z1Var2.getOrientation();
                            l0Var2.f7335b.k();
                            l0Var2.f7335b.requestLayout();
                            l0Var2.f7335b.f44402z0.requestLayout();
                            l0Var2.f7335b.f44402z0.invalidate();
                            l0Var2.f7335b.f44402z0.post(new bi.la(l0Var2, 17));
                        }
                        ((vb) l0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.g6.g0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.Cells.c1.b(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, w7.z5.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final l0 f7098b;

            {
                this.f7098b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((vb) this.f7098b).F.k0(-1, false, true);
                        return;
                    case 1:
                        l0 l0Var = this.f7098b;
                        l0Var.h.l(true);
                        mg.f fVar2 = l0Var.f7338n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        l0 l0Var2 = this.f7098b;
                        rg.z1 z1Var = l0Var2.f7335b;
                        if (z1Var != null) {
                            z1Var.G0 = new MediaController.CropState();
                            l0Var2.h.b(l0Var2.f7335b.G0);
                            rg.z1 z1Var2 = l0Var2.f7335b;
                            z1Var2.G0.orientation = z1Var2.getOrientation();
                            l0Var2.f7335b.k();
                            l0Var2.f7335b.requestLayout();
                            l0Var2.f7335b.f44402z0.requestLayout();
                            l0Var2.f7335b.f44402z0.invalidate();
                            l0Var2.f7335b.f44402z0.post(new bi.la(l0Var2, 17));
                        }
                        ((vb) l0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.g6.g0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.Cells.c1.b(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, w7.z5.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final l0 f7098b;

            {
                this.f7098b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((vb) this.f7098b).F.k0(-1, false, true);
                        return;
                    case 1:
                        l0 l0Var = this.f7098b;
                        l0Var.h.l(true);
                        mg.f fVar2 = l0Var.f7338n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        l0 l0Var2 = this.f7098b;
                        rg.z1 z1Var = l0Var2.f7335b;
                        if (z1Var != null) {
                            z1Var.G0 = new MediaController.CropState();
                            l0Var2.h.b(l0Var2.f7335b.G0);
                            rg.z1 z1Var2 = l0Var2.f7335b;
                            z1Var2.G0.orientation = z1Var2.getOrientation();
                            l0Var2.f7335b.k();
                            l0Var2.f7335b.requestLayout();
                            l0Var2.f7335b.f44402z0.requestLayout();
                            l0Var2.f7335b.f44402z0.invalidate();
                            l0Var2.f7335b.f44402z0.post(new bi.la(l0Var2, 17));
                        }
                        ((vb) l0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        rg.z1 z1Var = this.f7335b;
        if (z1Var == null) {
            return 1;
        }
        if (z1Var.getOrientation() != 90 && this.f7335b.getOrientation() != 270) {
            return this.f7335b.getContentHeight();
        }
        return this.f7335b.getContentWidth();
    }

    public int getCurrentWidth() {
        rg.z1 z1Var = this.f7335b;
        if (z1Var == null) {
            return 1;
        }
        if (z1Var.getOrientation() != 90 && this.f7335b.getOrientation() != 270) {
            return this.f7335b.getContentWidth();
        }
        return this.f7335b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f7340s;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        g0 g0Var = this.h;
        g0Var.setTopPadding(AndroidUtilities.dp(52.0f));
        g0Var.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f7337f.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void set(rg.z1 z1Var) {
        if (z1Var == null) {
            return;
        }
        this.f7335b = z1Var;
        setVisibility(0);
        this.E = false;
        g0 g0Var = this.h;
        boolean z10 = true;
        g0Var.J = true;
        getLocationOnScreen(this.v);
        this.f7334a.getLocationOnScreen(this.f7341w);
        z1Var.getLocationOnScreen(this.f7342x);
        MediaController.CropState cropState = z1Var.G0;
        if (cropState == null) {
            cropState = null;
        }
        g0Var.p(z1Var.getOrientation(), this.f7343y, cropState);
        float rotation = g0Var.getRotation();
        mg.f fVar = this.f7338n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.g6 g6Var = this.f7336c;
        if (cropState != null) {
            fVar.b(cropState.cropRotate);
            if (cropState.transformRotation == 0) {
                z10 = false;
            }
            fVar.setRotated(z10);
            fVar.setMirrored(cropState.mirrored);
            g6Var.f(cropState.mirrored, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            g6Var.getClass();
            g6Var.d(0.0f, false);
        }
        g0Var.r(false);
        k0 k0Var = this.e;
        k0Var.setVisibility(0);
        k0Var.invalidate();
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.f7340s - f7) < 0.001f) {
            return;
        }
        this.f7340s = f7;
        this.e.invalidate();
        g0 g0Var = this.h;
        CropAreaView cropAreaView = g0Var.f15559a;
        CropAreaView cropAreaView2 = g0Var.f15559a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
    }
}
