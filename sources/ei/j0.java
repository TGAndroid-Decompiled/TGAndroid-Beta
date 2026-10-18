package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.bs;
public abstract class j0 extends FrameLayout {
    public final r6 f9220a;
    public final org.telegram.ui.Components.f6 f9221b;
    public final org.telegram.ui.Components.f6 f9222c;
    public final i0 d;
    public final FrameLayout e;
    public final g0 f9223f;
    public final mg.f h;
    public final FrameLayout f9224n;
    public float f9225r;
    public final int[] f9226s;
    public final int[] v;
    public final mg.g f9227w;
    public a8 f9228x;
    public boolean f9229y;

    public j0(Context context, r6 r6Var) {
        super(context);
        this.f9225r = 0.0f;
        this.f9226s = new int[2];
        this.v = new int[2];
        this.f9227w = new Object();
        this.f9220a = r6Var;
        i0 i0Var = new i0(this, context);
        this.d = i0Var;
        bs bsVar = bs.h;
        this.f9221b = new org.telegram.ui.Components.f6(i0Var, 0L, 320L, bsVar);
        this.f9222c = new org.telegram.ui.Components.f6(this, 0L, 360L, bsVar);
        g0 g0Var = new g0(this, context, 0);
        this.f9223f = g0Var;
        g0Var.setListener(new a6.i(this, 18));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        mg.f fVar = new mg.f(context);
        this.h = fVar;
        fVar.setListener(new h0(0, this));
        frameLayout.addView(fVar, w7.z5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f9224n = frameLayout2;
        frameLayout.addView(frameLayout2, w7.z5.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.h6.g0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.c1.e(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, w7.z5.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f8994b;

            {
                this.f8994b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((fb) this.f8994b).E.k0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f8994b;
                        j0Var.f9223f.l(true);
                        mg.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f8994b;
                        a8 a8Var = j0Var2.f9228x;
                        if (a8Var != null) {
                            a8Var.m0 = new MediaController.CropState();
                            j0Var2.f9223f.b(j0Var2.f9228x.m0);
                            a8 a8Var2 = j0Var2.f9228x;
                            a8Var2.m0.orientation = a8Var2.Q;
                        }
                        ((fb) j0Var2).E.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.h6.g0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.Cells.c1.e(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, w7.z5.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f8994b;

            {
                this.f8994b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((fb) this.f8994b).E.k0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f8994b;
                        j0Var.f9223f.l(true);
                        mg.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f8994b;
                        a8 a8Var = j0Var2.f9228x;
                        if (a8Var != null) {
                            a8Var.m0 = new MediaController.CropState();
                            j0Var2.f9223f.b(j0Var2.f9228x.m0);
                            a8 a8Var2 = j0Var2.f9228x;
                            a8Var2.m0.orientation = a8Var2.Q;
                        }
                        ((fb) j0Var2).E.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.h6.g0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.Cells.c1.e(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, w7.z5.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f8994b;

            {
                this.f8994b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((fb) this.f8994b).E.k0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f8994b;
                        j0Var.f9223f.l(true);
                        mg.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f8994b;
                        a8 a8Var = j0Var2.f9228x;
                        if (a8Var != null) {
                            a8Var.m0 = new MediaController.CropState();
                            j0Var2.f9223f.b(j0Var2.f9228x.m0);
                            a8 a8Var2 = j0Var2.f9228x;
                            a8Var2.m0.orientation = a8Var2.Q;
                        }
                        ((fb) j0Var2).E.k0(-1, false, true);
                        return;
                }
            }
        });
    }

    public int getCurrentHeight() {
        a8 a8Var = this.f9228x;
        if (a8Var == null) {
            return 1;
        }
        int i10 = a8Var.Q;
        r6 r6Var = this.f9220a;
        if (i10 != 90 && i10 != 270) {
            return r6Var.getContentHeight();
        }
        return r6Var.getContentWidth();
    }

    public int getCurrentWidth() {
        a8 a8Var = this.f9228x;
        if (a8Var == null) {
            return 1;
        }
        int i10 = a8Var.Q;
        r6 r6Var = this.f9220a;
        if (i10 != 90 && i10 != 270) {
            return r6Var.getContentWidth();
        }
        return r6Var.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f9225r;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f9223f.setBottomPadding(AndroidUtilities.dp(116.0f) + this.e.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.f9225r - f7) < 0.001f) {
            return;
        }
        this.f9225r = f7;
        i0 i0Var = this.d;
        i0Var.setAlpha(f7);
        i0Var.invalidate();
        g0 g0Var = this.f9223f;
        CropAreaView cropAreaView = g0Var.f16916a;
        CropAreaView cropAreaView2 = g0Var.f16916a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
        this.f9220a.invalidate();
    }

    public void setEntry(a8 a8Var) {
        mg.g gVar;
        boolean z10;
        if (a8Var == null) {
            return;
        }
        this.f9228x = a8Var;
        this.f9229y = false;
        g0 g0Var = this.f9223f;
        g0Var.J = true;
        getLocationOnScreen(this.f9226s);
        int[] iArr = this.v;
        r6 r6Var = this.f9220a;
        r6Var.getLocationOnScreen(iArr);
        MediaController.CropState cropState = a8Var.m0;
        if (cropState == null) {
            cropState = null;
        }
        g0Var.p(a8Var.Q, this.f9227w, cropState);
        float rotation = g0Var.getRotation();
        mg.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.f6 f6Var = this.f9221b;
        if (cropState != null) {
            fVar.b(cropState.cropRotate);
            if (cropState.transformRotation != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            fVar.setRotated(z10);
            fVar.setMirrored(cropState.mirrored);
            f6Var.f(cropState.mirrored, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            f6Var.getClass();
            f6Var.d(0.0f, false);
        }
        g0Var.r(false);
        this.f9222c.d(gVar.f16881i, true);
        i0 i0Var = this.d;
        i0Var.setVisibility(0);
        i0Var.invalidate();
        r6Var.setCropEditorDrawing(this);
    }
}
