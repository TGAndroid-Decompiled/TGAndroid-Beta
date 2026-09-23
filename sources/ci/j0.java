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
import org.telegram.ui.Components.rr;
public abstract class j0 extends FrameLayout {
    public final b7 f4802a;
    public final org.telegram.ui.Components.e6 f4803b;
    public final org.telegram.ui.Components.e6 f4804c;
    public final i0 d;
    public final FrameLayout e;
    public final g0 f4805f;
    public final lg.f h;
    public final FrameLayout f4806n;
    public float f4807r;
    public final int[] f4808s;
    public final int[] v;
    public final lg.g f4809w;
    public l8 f4810x;
    public boolean f4811y;

    public j0(Context context, b7 b7Var) {
        super(context);
        this.f4807r = 0.0f;
        this.f4808s = new int[2];
        this.v = new int[2];
        this.f4809w = new Object();
        this.f4802a = b7Var;
        i0 i0Var = new i0(this, context);
        this.d = i0Var;
        rr rrVar = rr.h;
        this.f4803b = new org.telegram.ui.Components.e6(i0Var, 0L, 320L, rrVar);
        this.f4804c = new org.telegram.ui.Components.e6(this, 0L, 360L, rrVar);
        g0 g0Var = new g0(this, context, 0);
        this.f4805f = g0Var;
        g0Var.setListener(new a4.m(this, 8));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        lg.f fVar = new lg.f(context);
        this.h = fVar;
        fVar.setListener(new h0(0, this));
        frameLayout.addView(fVar, w7.x5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f4806n = frameLayout2;
        frameLayout.addView(frameLayout2, w7.x5.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.h6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.q3.b(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, w7.x5.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f4668b;

            {
                this.f4668b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((vb) this.f4668b).E.l0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f4668b;
                        j0Var.f4805f.l(true);
                        lg.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f4668b;
                        l8 l8Var = j0Var2.f4810x;
                        if (l8Var != null) {
                            l8Var.m0 = new MediaController.CropState();
                            j0Var2.f4805f.b(j0Var2.f4810x.m0);
                            l8 l8Var2 = j0Var2.f4810x;
                            l8Var2.m0.orientation = l8Var2.Q;
                        }
                        ((vb) j0Var2).E.l0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.h6.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.Cells.q3.b(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, w7.x5.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f4668b;

            {
                this.f4668b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((vb) this.f4668b).E.l0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f4668b;
                        j0Var.f4805f.l(true);
                        lg.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f4668b;
                        l8 l8Var = j0Var2.f4810x;
                        if (l8Var != null) {
                            l8Var.m0 = new MediaController.CropState();
                            j0Var2.f4805f.b(j0Var2.f4810x.m0);
                            l8 l8Var2 = j0Var2.f4810x;
                            l8Var2.m0.orientation = l8Var2.Q;
                        }
                        ((vb) j0Var2).E.l0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.h6.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.Cells.q3.b(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, w7.x5.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f4668b;

            {
                this.f4668b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((vb) this.f4668b).E.l0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f4668b;
                        j0Var.f4805f.l(true);
                        lg.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f4668b;
                        l8 l8Var = j0Var2.f4810x;
                        if (l8Var != null) {
                            l8Var.m0 = new MediaController.CropState();
                            j0Var2.f4805f.b(j0Var2.f4810x.m0);
                            l8 l8Var2 = j0Var2.f4810x;
                            l8Var2.m0.orientation = l8Var2.Q;
                        }
                        ((vb) j0Var2).E.l0(-1, false, true);
                        return;
                }
            }
        });
    }

    public int getCurrentHeight() {
        l8 l8Var = this.f4810x;
        if (l8Var == null) {
            return 1;
        }
        int i10 = l8Var.Q;
        b7 b7Var = this.f4802a;
        if (i10 != 90 && i10 != 270) {
            return b7Var.getContentHeight();
        }
        return b7Var.getContentWidth();
    }

    public int getCurrentWidth() {
        l8 l8Var = this.f4810x;
        if (l8Var == null) {
            return 1;
        }
        int i10 = l8Var.Q;
        b7 b7Var = this.f4802a;
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
        return this.f4807r;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f4805f.setBottomPadding(AndroidUtilities.dp(116.0f) + this.e.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.f4807r - f7) < 0.001f) {
            return;
        }
        this.f4807r = f7;
        i0 i0Var = this.d;
        i0Var.setAlpha(f7);
        i0Var.invalidate();
        g0 g0Var = this.f4805f;
        CropAreaView cropAreaView = g0Var.f14088a;
        CropAreaView cropAreaView2 = g0Var.f14088a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
        this.f4802a.invalidate();
    }

    public void setEntry(l8 l8Var) {
        boolean z10;
        if (l8Var == null) {
            return;
        }
        this.f4810x = l8Var;
        this.f4811y = false;
        g0 g0Var = this.f4805f;
        g0Var.J = true;
        getLocationOnScreen(this.f4808s);
        int[] iArr = this.v;
        b7 b7Var = this.f4802a;
        b7Var.getLocationOnScreen(iArr);
        MediaController.CropState cropState = l8Var.m0;
        if (cropState == null) {
            cropState = null;
        }
        int i10 = l8Var.Q;
        lg.g gVar = this.f4809w;
        g0Var.p(i10, gVar, cropState);
        float rotation = g0Var.getRotation();
        lg.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.e6 e6Var = this.f4803b;
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
        this.f4804c.d(gVar.f14053i, true);
        i0 i0Var = this.d;
        i0Var.setVisibility(0);
        i0Var.invalidate();
        b7Var.setCropEditorDrawing(this);
    }
}
