package bi;

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
import org.telegram.ui.Components.wr;
public abstract class q0 extends FrameLayout {
    public boolean E;
    public final e8 f3429a;
    public pg.x1 f3430b;
    public final org.telegram.ui.Components.d6 f3431c;
    public final org.telegram.ui.Components.d6 d;
    public final p0 e;
    public final FrameLayout f3432f;
    public final l0 h;
    public final kg.f f3433n;
    public final FrameLayout f3434r;
    public float f3435s;
    public final int[] v;
    public final int[] f3436w;
    public final int[] f3437x;
    public final kg.g f3438y;

    public q0(Context context, e8 e8Var) {
        super(context);
        this.f3435s = 0.0f;
        this.v = new int[2];
        this.f3436w = new int[2];
        this.f3437x = new int[2];
        this.f3438y = new Object();
        this.f3429a = e8Var;
        p0 p0Var = new p0(this, context);
        this.e = p0Var;
        wr wrVar = wr.h;
        this.f3431c = new org.telegram.ui.Components.d6(p0Var, 0L, 320L, wrVar);
        this.d = new org.telegram.ui.Components.d6(p0Var, 0L, 320L, wrVar);
        l0 l0Var = new l0(this, context, 1);
        this.h = l0Var;
        l0Var.setListener(new xa.c(this, 9));
        addView(l0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f3432f = frameLayout;
        addView(frameLayout, w7.a6.e(-1, -1, 119));
        kg.f fVar = new kg.f(context);
        this.f3433n = fVar;
        fVar.setListener(new a6.i(this, 8));
        frameLayout.addView(fVar, w7.a6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f3434r = frameLayout2;
        frameLayout.addView(frameLayout2, w7.a6.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.vision.e2.k(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.r6.b(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, w7.a6.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final q0 f3296b;

            {
                this.f3296b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((jd) this.f3296b).F.l0(-1, false, true);
                        return;
                    case 1:
                        q0 q0Var = this.f3296b;
                        q0Var.h.l(true);
                        kg.f fVar2 = q0Var.f3433n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        q0 q0Var2 = this.f3296b;
                        pg.x1 x1Var = q0Var2.f3430b;
                        if (x1Var != null) {
                            x1Var.G0 = new MediaController.CropState();
                            q0Var2.h.b(q0Var2.f3430b.G0);
                            pg.x1 x1Var2 = q0Var2.f3430b;
                            x1Var2.G0.orientation = x1Var2.getOrientation();
                            q0Var2.f3430b.k();
                            q0Var2.f3430b.requestLayout();
                            q0Var2.f3430b.f40369z0.requestLayout();
                            q0Var2.f3430b.f40369z0.invalidate();
                            q0Var2.f3430b.f40369z0.post(new a3.d(q0Var2, 14));
                        }
                        ((jd) q0Var2).F.l0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.Cells.r6.b(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, w7.a6.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final q0 f3296b;

            {
                this.f3296b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((jd) this.f3296b).F.l0(-1, false, true);
                        return;
                    case 1:
                        q0 q0Var = this.f3296b;
                        q0Var.h.l(true);
                        kg.f fVar2 = q0Var.f3433n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        q0 q0Var2 = this.f3296b;
                        pg.x1 x1Var = q0Var2.f3430b;
                        if (x1Var != null) {
                            x1Var.G0 = new MediaController.CropState();
                            q0Var2.h.b(q0Var2.f3430b.G0);
                            pg.x1 x1Var2 = q0Var2.f3430b;
                            x1Var2.G0.orientation = x1Var2.getOrientation();
                            q0Var2.f3430b.k();
                            q0Var2.f3430b.requestLayout();
                            q0Var2.f3430b.f40369z0.requestLayout();
                            q0Var2.f3430b.f40369z0.invalidate();
                            q0Var2.f3430b.f40369z0.post(new a3.d(q0Var2, 14));
                        }
                        ((jd) q0Var2).F.l0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.Cells.r6.b(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, w7.a6.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final q0 f3296b;

            {
                this.f3296b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((jd) this.f3296b).F.l0(-1, false, true);
                        return;
                    case 1:
                        q0 q0Var = this.f3296b;
                        q0Var.h.l(true);
                        kg.f fVar2 = q0Var.f3433n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        q0 q0Var2 = this.f3296b;
                        pg.x1 x1Var = q0Var2.f3430b;
                        if (x1Var != null) {
                            x1Var.G0 = new MediaController.CropState();
                            q0Var2.h.b(q0Var2.f3430b.G0);
                            pg.x1 x1Var2 = q0Var2.f3430b;
                            x1Var2.G0.orientation = x1Var2.getOrientation();
                            q0Var2.f3430b.k();
                            q0Var2.f3430b.requestLayout();
                            q0Var2.f3430b.f40369z0.requestLayout();
                            q0Var2.f3430b.f40369z0.invalidate();
                            q0Var2.f3430b.f40369z0.post(new a3.d(q0Var2, 14));
                        }
                        ((jd) q0Var2).F.l0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        pg.x1 x1Var = this.f3430b;
        if (x1Var == null) {
            return 1;
        }
        if (x1Var.getOrientation() != 90 && this.f3430b.getOrientation() != 270) {
            return this.f3430b.getContentHeight();
        }
        return this.f3430b.getContentWidth();
    }

    public int getCurrentWidth() {
        pg.x1 x1Var = this.f3430b;
        if (x1Var == null) {
            return 1;
        }
        if (x1Var.getOrientation() != 90 && this.f3430b.getOrientation() != 270) {
            return this.f3430b.getContentWidth();
        }
        return this.f3430b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f3435s;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        l0 l0Var = this.h;
        l0Var.setTopPadding(AndroidUtilities.dp(52.0f));
        l0Var.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f3432f.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void set(pg.x1 x1Var) {
        if (x1Var == null) {
            return;
        }
        this.f3430b = x1Var;
        setVisibility(0);
        this.E = false;
        l0 l0Var = this.h;
        boolean z10 = true;
        l0Var.J = true;
        getLocationOnScreen(this.v);
        this.f3429a.getLocationOnScreen(this.f3436w);
        x1Var.getLocationOnScreen(this.f3437x);
        MediaController.CropState cropState = x1Var.G0;
        if (cropState == null) {
            cropState = null;
        }
        l0Var.p(x1Var.getOrientation(), this.f3438y, cropState);
        float rotation = l0Var.getRotation();
        kg.f fVar = this.f3433n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.d6 d6Var = this.f3431c;
        if (cropState != null) {
            fVar.b(cropState.cropRotate);
            if (cropState.transformRotation == 0) {
                z10 = false;
            }
            fVar.setRotated(z10);
            fVar.setMirrored(cropState.mirrored);
            d6Var.f(cropState.mirrored, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            d6Var.getClass();
            d6Var.d(0.0f, false);
        }
        l0Var.r(false);
        p0 p0Var = this.e;
        p0Var.setVisibility(0);
        p0Var.invalidate();
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.f3435s - f7) < 0.001f) {
            return;
        }
        this.f3435s = f7;
        this.e.invalidate();
        l0 l0Var = this.h;
        CropAreaView cropAreaView = l0Var.f12495a;
        CropAreaView cropAreaView2 = l0Var.f12495a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
    }
}
