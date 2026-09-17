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
import org.telegram.ui.Components.pr;
public abstract class j0 extends FrameLayout {
    public final d7 f7410a;
    public final org.telegram.ui.Components.e6 f7411b;
    public final org.telegram.ui.Components.e6 f7412c;
    public final i0 d;
    public final FrameLayout f7413e;
    public final g0 f7414f;
    public final mg.f h;
    public final FrameLayout f7415n;
    public float f7416r;
    public final int[] f7417s;
    public final int[] v;
    public final mg.g f7418w;
    public o8 f7419x;
    public boolean f7420y;

    public j0(Context context, d7 d7Var) {
        super(context);
        this.f7416r = 0.0f;
        this.f7417s = new int[2];
        this.v = new int[2];
        this.f7418w = new Object();
        this.f7410a = d7Var;
        i0 i0Var = new i0(this, context);
        this.d = i0Var;
        pr prVar = pr.h;
        this.f7411b = new org.telegram.ui.Components.e6(i0Var, 0L, 320L, prVar);
        this.f7412c = new org.telegram.ui.Components.e6(this, 0L, 360L, prVar);
        g0 g0Var = new g0(this, context, 0);
        this.f7414f = g0Var;
        g0Var.setListener(new a4.m(this, 15));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f7413e = frameLayout;
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        mg.f fVar = new mg.f(context);
        this.h = fVar;
        fVar.setListener(new h0(0, this));
        frameLayout.addView(fVar, w7.x5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f7415n = frameLayout2;
        frameLayout.addView(frameLayout2, w7.x5.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.vision.e2.m(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.p6.b(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, w7.x5.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f7190b;

            {
                this.f7190b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((zb) this.f7190b).E.l0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f7190b;
                        j0Var.f7414f.l(true);
                        mg.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f7190b;
                        o8 o8Var = j0Var2.f7419x;
                        if (o8Var != null) {
                            o8Var.m0 = new MediaController.CropState();
                            j0Var2.f7414f.b(j0Var2.f7419x.m0);
                            o8 o8Var2 = j0Var2.f7419x;
                            o8Var2.m0.orientation = o8Var2.Q;
                        }
                        ((zb) j0Var2).E.l0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.Cells.p6.b(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, w7.x5.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f7190b;

            {
                this.f7190b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((zb) this.f7190b).E.l0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f7190b;
                        j0Var.f7414f.l(true);
                        mg.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f7190b;
                        o8 o8Var = j0Var2.f7419x;
                        if (o8Var != null) {
                            o8Var.m0 = new MediaController.CropState();
                            j0Var2.f7414f.b(j0Var2.f7419x.m0);
                            o8 o8Var2 = j0Var2.f7419x;
                            o8Var2.m0.orientation = o8Var2.Q;
                        }
                        ((zb) j0Var2).E.l0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.Cells.p6.b(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, w7.x5.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f7190b;

            {
                this.f7190b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((zb) this.f7190b).E.l0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f7190b;
                        j0Var.f7414f.l(true);
                        mg.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f7190b;
                        o8 o8Var = j0Var2.f7419x;
                        if (o8Var != null) {
                            o8Var.m0 = new MediaController.CropState();
                            j0Var2.f7414f.b(j0Var2.f7419x.m0);
                            o8 o8Var2 = j0Var2.f7419x;
                            o8Var2.m0.orientation = o8Var2.Q;
                        }
                        ((zb) j0Var2).E.l0(-1, false, true);
                        return;
                }
            }
        });
    }

    public int getCurrentHeight() {
        o8 o8Var = this.f7419x;
        if (o8Var == null) {
            return 1;
        }
        int i10 = o8Var.Q;
        d7 d7Var = this.f7410a;
        if (i10 != 90 && i10 != 270) {
            return d7Var.getContentHeight();
        }
        return d7Var.getContentWidth();
    }

    public int getCurrentWidth() {
        o8 o8Var = this.f7419x;
        if (o8Var == null) {
            return 1;
        }
        int i10 = o8Var.Q;
        d7 d7Var = this.f7410a;
        if (i10 != 90 && i10 != 270) {
            return d7Var.getContentWidth();
        }
        return d7Var.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f7416r;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f7414f.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f7413e.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.f7416r - f7) < 0.001f) {
            return;
        }
        this.f7416r = f7;
        i0 i0Var = this.d;
        i0Var.setAlpha(f7);
        i0Var.invalidate();
        g0 g0Var = this.f7414f;
        CropAreaView cropAreaView = g0Var.f16303a;
        CropAreaView cropAreaView2 = g0Var.f16303a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
        this.f7410a.invalidate();
    }

    public void setEntry(o8 o8Var) {
        boolean z10;
        if (o8Var == null) {
            return;
        }
        this.f7419x = o8Var;
        this.f7420y = false;
        g0 g0Var = this.f7414f;
        g0Var.J = true;
        getLocationOnScreen(this.f7417s);
        int[] iArr = this.v;
        d7 d7Var = this.f7410a;
        d7Var.getLocationOnScreen(iArr);
        MediaController.CropState cropState = o8Var.m0;
        if (cropState == null) {
            cropState = null;
        }
        int i10 = o8Var.Q;
        mg.g gVar = this.f7418w;
        g0Var.p(i10, gVar, cropState);
        float rotation = g0Var.getRotation();
        mg.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.e6 e6Var = this.f7411b;
        if (cropState != null) {
            fVar.b(cropState.cropRotate);
            if (cropState.transformRotation != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            fVar.setRotated(z10);
            fVar.setMirrored(cropState.mirrored);
            e6Var.f(cropState.mirrored, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            e6Var.getClass();
            e6Var.d(0.0f, false);
        }
        g0Var.r(false);
        this.f7412c.d(gVar.f16262i, true);
        i0 i0Var = this.d;
        i0Var.setVisibility(0);
        i0Var.invalidate();
        d7Var.setCropEditorDrawing(this);
    }
}
