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
import org.telegram.ui.Components.is;
public abstract class i0 extends FrameLayout {
    public final b7 f5179a;
    public final org.telegram.ui.Components.g6 f5180b;
    public final org.telegram.ui.Components.g6 f5181c;
    public final h0 d;
    public final FrameLayout f5182e;
    public final g0 f5183f;
    public final lg.f h;
    public final FrameLayout f5184n;
    public float f5185r;
    public final int[] f5186s;
    public final int[] v;
    public final lg.g f5187w;
    public l8 f5188x;
    public boolean f5189y;

    public i0(Context context, b7 b7Var) {
        super(context);
        this.f5185r = 0.0f;
        this.f5186s = new int[2];
        this.v = new int[2];
        this.f5187w = new Object();
        this.f5179a = b7Var;
        h0 h0Var = new h0(this, context);
        this.d = h0Var;
        is isVar = is.h;
        this.f5180b = new org.telegram.ui.Components.g6(h0Var, 0L, 320L, isVar);
        this.f5181c = new org.telegram.ui.Components.g6(this, 0L, 360L, isVar);
        g0 g0Var = new g0(this, context, 0);
        this.f5183f = g0Var;
        g0Var.setListener(new a6.i(this, 11));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5182e = frameLayout;
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        lg.f fVar = new lg.f(context);
        this.h = fVar;
        fVar.setListener(new a4.l(this, 8));
        frameLayout.addView(fVar, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 52.0f, -1, 81));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f5184n = frameLayout2;
        frameLayout.addView(frameLayout2, w7.x5.a(52.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.h6.g0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.c1.b(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, w7.x5.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f5061b;

            {
                this.f5061b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((vb) this.f5061b).E.k0(-1, false, true);
                        return;
                    case 1:
                        i0 i0Var = this.f5061b;
                        i0Var.f5183f.l(true);
                        lg.f fVar2 = i0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        i0Var.d.invalidate();
                        return;
                    default:
                        i0 i0Var2 = this.f5061b;
                        l8 l8Var = i0Var2.f5188x;
                        if (l8Var != null) {
                            l8Var.m0 = new MediaController.CropState();
                            i0Var2.f5183f.b(i0Var2.f5188x.m0);
                            l8 l8Var2 = i0Var2.f5188x;
                            l8Var2.m0.orientation = l8Var2.Q;
                        }
                        ((vb) i0Var2).E.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.h6.g0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.Cells.c1.b(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, w7.x5.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f5061b;

            {
                this.f5061b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((vb) this.f5061b).E.k0(-1, false, true);
                        return;
                    case 1:
                        i0 i0Var = this.f5061b;
                        i0Var.f5183f.l(true);
                        lg.f fVar2 = i0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        i0Var.d.invalidate();
                        return;
                    default:
                        i0 i0Var2 = this.f5061b;
                        l8 l8Var = i0Var2.f5188x;
                        if (l8Var != null) {
                            l8Var.m0 = new MediaController.CropState();
                            i0Var2.f5183f.b(i0Var2.f5188x.m0);
                            l8 l8Var2 = i0Var2.f5188x;
                            l8Var2.m0.orientation = l8Var2.Q;
                        }
                        ((vb) i0Var2).E.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.h6.g0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.Cells.c1.b(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, w7.x5.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f5061b;

            {
                this.f5061b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((vb) this.f5061b).E.k0(-1, false, true);
                        return;
                    case 1:
                        i0 i0Var = this.f5061b;
                        i0Var.f5183f.l(true);
                        lg.f fVar2 = i0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        i0Var.d.invalidate();
                        return;
                    default:
                        i0 i0Var2 = this.f5061b;
                        l8 l8Var = i0Var2.f5188x;
                        if (l8Var != null) {
                            l8Var.m0 = new MediaController.CropState();
                            i0Var2.f5183f.b(i0Var2.f5188x.m0);
                            l8 l8Var2 = i0Var2.f5188x;
                            l8Var2.m0.orientation = l8Var2.Q;
                        }
                        ((vb) i0Var2).E.k0(-1, false, true);
                        return;
                }
            }
        });
    }

    public int getCurrentHeight() {
        l8 l8Var = this.f5188x;
        if (l8Var == null) {
            return 1;
        }
        int i10 = l8Var.Q;
        b7 b7Var = this.f5179a;
        if (i10 != 90 && i10 != 270) {
            return b7Var.getContentHeight();
        }
        return b7Var.getContentWidth();
    }

    public int getCurrentWidth() {
        l8 l8Var = this.f5188x;
        if (l8Var == null) {
            return 1;
        }
        int i10 = l8Var.Q;
        b7 b7Var = this.f5179a;
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
        return this.f5185r;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f5183f.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f5182e.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.f5185r - f7) < 0.001f) {
            return;
        }
        this.f5185r = f7;
        h0 h0Var = this.d;
        h0Var.setAlpha(f7);
        h0Var.invalidate();
        g0 g0Var = this.f5183f;
        CropAreaView cropAreaView = g0Var.f15575a;
        CropAreaView cropAreaView2 = g0Var.f15575a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
        this.f5179a.invalidate();
    }

    public void setEntry(l8 l8Var) {
        lg.g gVar;
        boolean z10;
        if (l8Var == null) {
            return;
        }
        this.f5188x = l8Var;
        this.f5189y = false;
        g0 g0Var = this.f5183f;
        g0Var.J = true;
        getLocationOnScreen(this.f5186s);
        int[] iArr = this.v;
        b7 b7Var = this.f5179a;
        b7Var.getLocationOnScreen(iArr);
        MediaController.CropState cropState = l8Var.m0;
        if (cropState == null) {
            cropState = null;
        }
        g0Var.p(l8Var.Q, this.f5187w, cropState);
        float rotation = g0Var.getRotation();
        lg.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.g6 g6Var = this.f5180b;
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
        this.f5181c.d(gVar.f15536i, true);
        h0 h0Var = this.d;
        h0Var.setVisibility(0);
        h0Var.invalidate();
        b7Var.setCropEditorDrawing(this);
    }
}
