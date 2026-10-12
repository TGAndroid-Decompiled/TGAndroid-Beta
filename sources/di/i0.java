package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.es;
public abstract class i0 extends FrameLayout {
    public final a7 f7019a;
    public final org.telegram.ui.Components.g6 f7020b;
    public final org.telegram.ui.Components.g6 f7021c;
    public final h0 d;
    public final FrameLayout e;
    public final g0 f7022f;
    public final mg.f h;
    public final FrameLayout f7023n;
    public float f7024r;
    public final int[] f7025s;
    public final int[] v;
    public final mg.g f7026w;
    public k8 f7027x;
    public boolean f7028y;

    public i0(Context context, a7 a7Var) {
        super(context);
        this.f7024r = 0.0f;
        this.f7025s = new int[2];
        this.v = new int[2];
        this.f7026w = new Object();
        this.f7019a = a7Var;
        h0 h0Var = new h0(this, context);
        this.d = h0Var;
        es esVar = es.h;
        this.f7020b = new org.telegram.ui.Components.g6(h0Var, 0L, 320L, esVar);
        this.f7021c = new org.telegram.ui.Components.g6(this, 0L, 360L, esVar);
        g0 g0Var = new g0(this, context, 0);
        this.f7022f = g0Var;
        g0Var.setListener(new k6.h(this, 18));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, w7.a6.e(-1, -1, 119));
        mg.f fVar = new mg.f(context);
        this.h = fVar;
        fVar.setListener(new qb.c(this, 15));
        frameLayout.addView(fVar, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 52.0f, -1, 81));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f7023n = frameLayout2;
        frameLayout.addView(frameLayout2, w7.a6.a(52.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.g6.g0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.d0.c(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, w7.a6.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f6936b;

            {
                this.f6936b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ub) this.f6936b).E.k0(-1, false, true);
                        return;
                    case 1:
                        i0 i0Var = this.f6936b;
                        i0Var.f7022f.l(true);
                        mg.f fVar2 = i0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        i0Var.d.invalidate();
                        return;
                    default:
                        i0 i0Var2 = this.f6936b;
                        k8 k8Var = i0Var2.f7027x;
                        if (k8Var != null) {
                            k8Var.m0 = new MediaController.CropState();
                            i0Var2.f7022f.b(i0Var2.f7027x.m0);
                            k8 k8Var2 = i0Var2.f7027x;
                            k8Var2.m0.orientation = k8Var2.Q;
                        }
                        ((ub) i0Var2).E.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.g6.g0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.Cells.d0.c(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, w7.a6.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f6936b;

            {
                this.f6936b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ub) this.f6936b).E.k0(-1, false, true);
                        return;
                    case 1:
                        i0 i0Var = this.f6936b;
                        i0Var.f7022f.l(true);
                        mg.f fVar2 = i0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        i0Var.d.invalidate();
                        return;
                    default:
                        i0 i0Var2 = this.f6936b;
                        k8 k8Var = i0Var2.f7027x;
                        if (k8Var != null) {
                            k8Var.m0 = new MediaController.CropState();
                            i0Var2.f7022f.b(i0Var2.f7027x.m0);
                            k8 k8Var2 = i0Var2.f7027x;
                            k8Var2.m0.orientation = k8Var2.Q;
                        }
                        ((ub) i0Var2).E.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.g6.g0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.Cells.d0.c(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, w7.a6.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f6936b;

            {
                this.f6936b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ub) this.f6936b).E.k0(-1, false, true);
                        return;
                    case 1:
                        i0 i0Var = this.f6936b;
                        i0Var.f7022f.l(true);
                        mg.f fVar2 = i0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        i0Var.d.invalidate();
                        return;
                    default:
                        i0 i0Var2 = this.f6936b;
                        k8 k8Var = i0Var2.f7027x;
                        if (k8Var != null) {
                            k8Var.m0 = new MediaController.CropState();
                            i0Var2.f7022f.b(i0Var2.f7027x.m0);
                            k8 k8Var2 = i0Var2.f7027x;
                            k8Var2.m0.orientation = k8Var2.Q;
                        }
                        ((ub) i0Var2).E.k0(-1, false, true);
                        return;
                }
            }
        });
    }

    public int getCurrentHeight() {
        k8 k8Var = this.f7027x;
        if (k8Var == null) {
            return 1;
        }
        int i10 = k8Var.Q;
        a7 a7Var = this.f7019a;
        if (i10 != 90 && i10 != 270) {
            return a7Var.getContentHeight();
        }
        return a7Var.getContentWidth();
    }

    public int getCurrentWidth() {
        k8 k8Var = this.f7027x;
        if (k8Var == null) {
            return 1;
        }
        int i10 = k8Var.Q;
        a7 a7Var = this.f7019a;
        if (i10 != 90 && i10 != 270) {
            return a7Var.getContentWidth();
        }
        return a7Var.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f7024r;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f7022f.setBottomPadding(AndroidUtilities.dp(116.0f) + this.e.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.f7024r - f7) < 0.001f) {
            return;
        }
        this.f7024r = f7;
        h0 h0Var = this.d;
        h0Var.setAlpha(f7);
        h0Var.invalidate();
        g0 g0Var = this.f7022f;
        CropAreaView cropAreaView = g0Var.f15824a;
        CropAreaView cropAreaView2 = g0Var.f15824a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
        this.f7019a.invalidate();
    }

    public void setEntry(k8 k8Var) {
        mg.g gVar;
        boolean z10;
        if (k8Var == null) {
            return;
        }
        this.f7027x = k8Var;
        this.f7028y = false;
        g0 g0Var = this.f7022f;
        g0Var.J = true;
        getLocationOnScreen(this.f7025s);
        int[] iArr = this.v;
        a7 a7Var = this.f7019a;
        a7Var.getLocationOnScreen(iArr);
        MediaController.CropState cropState = k8Var.m0;
        if (cropState == null) {
            cropState = null;
        }
        g0Var.p(k8Var.Q, this.f7026w, cropState);
        float rotation = g0Var.getRotation();
        mg.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.g6 g6Var = this.f7020b;
        if (cropState != null) {
            fVar.b(cropState.cropRotate);
            if (cropState.transformRotation != 0) {
                z10 = true;
            } else {
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
        this.f7021c.d(gVar.f15789i, true);
        h0 h0Var = this.d;
        h0Var.setVisibility(0);
        h0Var.invalidate();
        a7Var.setCropEditorDrawing(this);
    }
}
