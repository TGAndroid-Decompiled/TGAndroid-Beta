package ci;

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
import org.telegram.ui.Components.hs;
public abstract class l0 extends FrameLayout {
    public boolean E;
    public final b7 f5366a;
    public qg.y1 f5367b;
    public final org.telegram.ui.Components.g6 f5368c;
    public final org.telegram.ui.Components.g6 d;
    public final k0 f5369e;
    public final FrameLayout f5370f;
    public final g0 h;
    public final lg.f f5371n;
    public final FrameLayout f5372r;
    public float f5373s;
    public final int[] v;
    public final int[] f5374w;
    public final int[] f5375x;
    public final lg.g f5376y;

    public l0(Context context, b7 b7Var) {
        super(context);
        this.f5373s = 0.0f;
        this.v = new int[2];
        this.f5374w = new int[2];
        this.f5375x = new int[2];
        this.f5376y = new Object();
        this.f5366a = b7Var;
        k0 k0Var = new k0(this, context);
        this.f5369e = k0Var;
        hs hsVar = hs.h;
        this.f5368c = new org.telegram.ui.Components.g6(k0Var, 0L, 320L, hsVar);
        this.d = new org.telegram.ui.Components.g6(k0Var, 0L, 320L, hsVar);
        g0 g0Var = new g0(this, context, 1);
        this.h = g0Var;
        g0Var.setListener(new pb.c(this, 12));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5370f = frameLayout;
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        lg.f fVar = new lg.f(context);
        this.f5371n = fVar;
        fVar.setListener(new xa.d(this, 10));
        frameLayout.addView(fVar, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 52.0f, -1, 81));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f5372r = frameLayout2;
        frameLayout.addView(frameLayout2, w7.x5.a(52.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.i6.g0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.c1.b(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, w7.x5.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final l0 f5220b;

            {
                this.f5220b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((wb) this.f5220b).F.k0(-1, false, true);
                        return;
                    case 1:
                        l0 l0Var = this.f5220b;
                        l0Var.h.l(true);
                        lg.f fVar2 = l0Var.f5371n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        l0 l0Var2 = this.f5220b;
                        qg.y1 y1Var = l0Var2.f5367b;
                        if (y1Var != null) {
                            y1Var.G0 = new MediaController.CropState();
                            l0Var2.h.b(l0Var2.f5367b.G0);
                            qg.y1 y1Var2 = l0Var2.f5367b;
                            y1Var2.G0.orientation = y1Var2.getOrientation();
                            l0Var2.f5367b.k();
                            l0Var2.f5367b.requestLayout();
                            l0Var2.f5367b.f46640z0.requestLayout();
                            l0Var2.f5367b.f46640z0.invalidate();
                            l0Var2.f5367b.f46640z0.post(new androidx.fragment.app.a0(l0Var2, 8));
                        }
                        ((wb) l0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.i6.g0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.Cells.c1.b(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, w7.x5.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final l0 f5220b;

            {
                this.f5220b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((wb) this.f5220b).F.k0(-1, false, true);
                        return;
                    case 1:
                        l0 l0Var = this.f5220b;
                        l0Var.h.l(true);
                        lg.f fVar2 = l0Var.f5371n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        l0 l0Var2 = this.f5220b;
                        qg.y1 y1Var = l0Var2.f5367b;
                        if (y1Var != null) {
                            y1Var.G0 = new MediaController.CropState();
                            l0Var2.h.b(l0Var2.f5367b.G0);
                            qg.y1 y1Var2 = l0Var2.f5367b;
                            y1Var2.G0.orientation = y1Var2.getOrientation();
                            l0Var2.f5367b.k();
                            l0Var2.f5367b.requestLayout();
                            l0Var2.f5367b.f46640z0.requestLayout();
                            l0Var2.f5367b.f46640z0.invalidate();
                            l0Var2.f5367b.f46640z0.post(new androidx.fragment.app.a0(l0Var2, 8));
                        }
                        ((wb) l0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.i6.g0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.Cells.c1.b(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, w7.x5.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final l0 f5220b;

            {
                this.f5220b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((wb) this.f5220b).F.k0(-1, false, true);
                        return;
                    case 1:
                        l0 l0Var = this.f5220b;
                        l0Var.h.l(true);
                        lg.f fVar2 = l0Var.f5371n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        l0 l0Var2 = this.f5220b;
                        qg.y1 y1Var = l0Var2.f5367b;
                        if (y1Var != null) {
                            y1Var.G0 = new MediaController.CropState();
                            l0Var2.h.b(l0Var2.f5367b.G0);
                            qg.y1 y1Var2 = l0Var2.f5367b;
                            y1Var2.G0.orientation = y1Var2.getOrientation();
                            l0Var2.f5367b.k();
                            l0Var2.f5367b.requestLayout();
                            l0Var2.f5367b.f46640z0.requestLayout();
                            l0Var2.f5367b.f46640z0.invalidate();
                            l0Var2.f5367b.f46640z0.post(new androidx.fragment.app.a0(l0Var2, 8));
                        }
                        ((wb) l0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        qg.y1 y1Var = this.f5367b;
        if (y1Var == null) {
            return 1;
        }
        if (y1Var.getOrientation() != 90 && this.f5367b.getOrientation() != 270) {
            return this.f5367b.getContentHeight();
        }
        return this.f5367b.getContentWidth();
    }

    public int getCurrentWidth() {
        qg.y1 y1Var = this.f5367b;
        if (y1Var == null) {
            return 1;
        }
        if (y1Var.getOrientation() != 90 && this.f5367b.getOrientation() != 270) {
            return this.f5367b.getContentWidth();
        }
        return this.f5367b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f5373s;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        g0 g0Var = this.h;
        g0Var.setTopPadding(AndroidUtilities.dp(52.0f));
        g0Var.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f5370f.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void set(qg.y1 y1Var) {
        if (y1Var == null) {
            return;
        }
        this.f5367b = y1Var;
        setVisibility(0);
        this.E = false;
        g0 g0Var = this.h;
        boolean z10 = true;
        g0Var.J = true;
        getLocationOnScreen(this.v);
        this.f5366a.getLocationOnScreen(this.f5374w);
        y1Var.getLocationOnScreen(this.f5375x);
        MediaController.CropState cropState = y1Var.G0;
        if (cropState == null) {
            cropState = null;
        }
        g0Var.p(y1Var.getOrientation(), this.f5376y, cropState);
        float rotation = g0Var.getRotation();
        lg.f fVar = this.f5371n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.g6 g6Var = this.f5368c;
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
        k0 k0Var = this.f5369e;
        k0Var.setVisibility(0);
        k0Var.invalidate();
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.f5373s - f7) < 0.001f) {
            return;
        }
        this.f5373s = f7;
        this.f5369e.invalidate();
        g0 g0Var = this.h;
        CropAreaView cropAreaView = g0Var.f15572a;
        CropAreaView cropAreaView2 = g0Var.f15572a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
    }
}
