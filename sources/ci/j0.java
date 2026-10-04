package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.tr;
public abstract class j0 extends FrameLayout {
    public final b7 f5188a;
    public final org.telegram.ui.Components.e6 f5189b;
    public final org.telegram.ui.Components.e6 f5190c;
    public final i0 d;
    public final FrameLayout f5191e;
    public final g0 f5192f;
    public final lg.f h;
    public final FrameLayout f5193n;
    public float f5194r;
    public final int[] f5195s;
    public final int[] v;
    public final lg.g f5196w;
    public k8 f5197x;
    public boolean f5198y;

    public j0(Context context, b7 b7Var) {
        super(context);
        this.f5194r = 0.0f;
        this.f5195s = new int[2];
        this.v = new int[2];
        this.f5196w = new Object();
        this.f5188a = b7Var;
        i0 i0Var = new i0(this, context);
        this.d = i0Var;
        tr trVar = tr.h;
        this.f5189b = new org.telegram.ui.Components.e6(i0Var, 0L, 320L, trVar);
        this.f5190c = new org.telegram.ui.Components.e6(this, 0L, 360L, trVar);
        g0 g0Var = new g0(this, context, 0);
        this.f5192f = g0Var;
        g0Var.setListener(new a4.m(this, 8));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5191e = frameLayout;
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        lg.f fVar = new lg.f(context);
        this.h = fVar;
        fVar.setListener(new h0(0, this));
        frameLayout.addView(fVar, w7.z5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f5193n = frameLayout2;
        frameLayout.addView(frameLayout2, w7.z5.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.i6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.c1.d(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, w7.z5.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f5067b;

            {
                this.f5067b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ub) this.f5067b).E.l0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f5067b;
                        j0Var.f5192f.l(true);
                        lg.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f5067b;
                        k8 k8Var = j0Var2.f5197x;
                        if (k8Var != null) {
                            k8Var.m0 = new MediaController.CropState();
                            j0Var2.f5192f.b(j0Var2.f5197x.m0);
                            k8 k8Var2 = j0Var2.f5197x;
                            k8Var2.m0.orientation = k8Var2.Q;
                        }
                        ((ub) j0Var2).E.l0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.i6.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.Cells.c1.d(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, w7.z5.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f5067b;

            {
                this.f5067b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ub) this.f5067b).E.l0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f5067b;
                        j0Var.f5192f.l(true);
                        lg.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f5067b;
                        k8 k8Var = j0Var2.f5197x;
                        if (k8Var != null) {
                            k8Var.m0 = new MediaController.CropState();
                            j0Var2.f5192f.b(j0Var2.f5197x.m0);
                            k8 k8Var2 = j0Var2.f5197x;
                            k8Var2.m0.orientation = k8Var2.Q;
                        }
                        ((ub) j0Var2).E.l0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.i6.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.Cells.c1.d(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, w7.z5.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f5067b;

            {
                this.f5067b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ub) this.f5067b).E.l0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f5067b;
                        j0Var.f5192f.l(true);
                        lg.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f5067b;
                        k8 k8Var = j0Var2.f5197x;
                        if (k8Var != null) {
                            k8Var.m0 = new MediaController.CropState();
                            j0Var2.f5192f.b(j0Var2.f5197x.m0);
                            k8 k8Var2 = j0Var2.f5197x;
                            k8Var2.m0.orientation = k8Var2.Q;
                        }
                        ((ub) j0Var2).E.l0(-1, false, true);
                        return;
                }
            }
        });
    }

    public int getCurrentHeight() {
        k8 k8Var = this.f5197x;
        if (k8Var == null) {
            return 1;
        }
        int i10 = k8Var.Q;
        b7 b7Var = this.f5188a;
        if (i10 != 90 && i10 != 270) {
            return b7Var.getContentHeight();
        }
        return b7Var.getContentWidth();
    }

    public int getCurrentWidth() {
        k8 k8Var = this.f5197x;
        if (k8Var == null) {
            return 1;
        }
        int i10 = k8Var.Q;
        b7 b7Var = this.f5188a;
        if (i10 != 90 && i10 != 270) {
            return b7Var.getContentWidth();
        }
        return b7Var.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f5194r;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f5192f.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f5191e.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.f5194r - f7) < 0.001f) {
            return;
        }
        this.f5194r = f7;
        i0 i0Var = this.d;
        i0Var.setAlpha(f7);
        i0Var.invalidate();
        g0 g0Var = this.f5192f;
        CropAreaView cropAreaView = g0Var.f15575a;
        CropAreaView cropAreaView2 = g0Var.f15575a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
        this.f5188a.invalidate();
    }

    public void setEntry(k8 k8Var) {
        boolean z10;
        if (k8Var == null) {
            return;
        }
        this.f5197x = k8Var;
        this.f5198y = false;
        g0 g0Var = this.f5192f;
        g0Var.J = true;
        getLocationOnScreen(this.f5195s);
        int[] iArr = this.v;
        b7 b7Var = this.f5188a;
        b7Var.getLocationOnScreen(iArr);
        MediaController.CropState cropState = k8Var.m0;
        if (cropState == null) {
            cropState = null;
        }
        int i10 = k8Var.Q;
        lg.g gVar = this.f5196w;
        g0Var.p(i10, gVar, cropState);
        float rotation = g0Var.getRotation();
        lg.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.e6 e6Var = this.f5189b;
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
        this.f5190c.d(gVar.f15536i, true);
        i0 i0Var = this.d;
        i0Var.setVisibility(0);
        i0Var.invalidate();
        b7Var.setCropEditorDrawing(this);
    }
}
