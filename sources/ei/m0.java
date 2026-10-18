package ei;

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
import org.telegram.ui.Components.bs;
public abstract class m0 extends FrameLayout {
    public boolean E;
    public final r6 f9429a;
    public rg.x1 f9430b;
    public final org.telegram.ui.Components.f6 f9431c;
    public final org.telegram.ui.Components.f6 d;
    public final l0 e;
    public final FrameLayout f9432f;
    public final g0 h;
    public final mg.f f9433n;
    public final FrameLayout f9434r;
    public float f9435s;
    public final int[] v;
    public final int[] f9436w;
    public final int[] f9437x;
    public final mg.g f9438y;

    public m0(Context context, r6 r6Var) {
        super(context);
        this.f9435s = 0.0f;
        this.v = new int[2];
        this.f9436w = new int[2];
        this.f9437x = new int[2];
        this.f9438y = new Object();
        this.f9429a = r6Var;
        l0 l0Var = new l0(this, context);
        this.e = l0Var;
        bs bsVar = bs.h;
        this.f9431c = new org.telegram.ui.Components.f6(l0Var, 0L, 320L, bsVar);
        this.d = new org.telegram.ui.Components.f6(l0Var, 0L, 320L, bsVar);
        g0 g0Var = new g0(this, context, 1);
        this.h = g0Var;
        g0Var.setListener(new ag.b(this, 15));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9432f = frameLayout;
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        mg.f fVar = new mg.f(context);
        this.f9433n = fVar;
        fVar.setListener(new h0(1, this));
        frameLayout.addView(fVar, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 52.0f, -1, 81));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f9434r = frameLayout2;
        frameLayout.addView(frameLayout2, w7.z5.a(52.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.h6.g0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.c1.e(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, w7.z5.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f9294b;

            {
                this.f9294b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((gb) this.f9294b).F.k0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f9294b;
                        m0Var.h.l(true);
                        mg.f fVar2 = m0Var.f9433n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f9294b;
                        rg.x1 x1Var = m0Var2.f9430b;
                        if (x1Var != null) {
                            x1Var.G0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f9430b.G0);
                            rg.x1 x1Var2 = m0Var2.f9430b;
                            x1Var2.G0.orientation = x1Var2.getOrientation();
                            m0Var2.f9430b.k();
                            m0Var2.f9430b.requestLayout();
                            m0Var2.f9430b.f45754z0.requestLayout();
                            m0Var2.f9430b.f45754z0.invalidate();
                            m0Var2.f9430b.f45754z0.post(new com.google.firebase.messaging.s(m0Var2, 8));
                        }
                        ((gb) m0Var2).F.k0(-1, false, true);
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
            public final m0 f9294b;

            {
                this.f9294b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((gb) this.f9294b).F.k0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f9294b;
                        m0Var.h.l(true);
                        mg.f fVar2 = m0Var.f9433n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f9294b;
                        rg.x1 x1Var = m0Var2.f9430b;
                        if (x1Var != null) {
                            x1Var.G0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f9430b.G0);
                            rg.x1 x1Var2 = m0Var2.f9430b;
                            x1Var2.G0.orientation = x1Var2.getOrientation();
                            m0Var2.f9430b.k();
                            m0Var2.f9430b.requestLayout();
                            m0Var2.f9430b.f45754z0.requestLayout();
                            m0Var2.f9430b.f45754z0.invalidate();
                            m0Var2.f9430b.f45754z0.post(new com.google.firebase.messaging.s(m0Var2, 8));
                        }
                        ((gb) m0Var2).F.k0(-1, false, true);
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
            public final m0 f9294b;

            {
                this.f9294b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((gb) this.f9294b).F.k0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f9294b;
                        m0Var.h.l(true);
                        mg.f fVar2 = m0Var.f9433n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f9294b;
                        rg.x1 x1Var = m0Var2.f9430b;
                        if (x1Var != null) {
                            x1Var.G0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f9430b.G0);
                            rg.x1 x1Var2 = m0Var2.f9430b;
                            x1Var2.G0.orientation = x1Var2.getOrientation();
                            m0Var2.f9430b.k();
                            m0Var2.f9430b.requestLayout();
                            m0Var2.f9430b.f45754z0.requestLayout();
                            m0Var2.f9430b.f45754z0.invalidate();
                            m0Var2.f9430b.f45754z0.post(new com.google.firebase.messaging.s(m0Var2, 8));
                        }
                        ((gb) m0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        rg.x1 x1Var = this.f9430b;
        if (x1Var == null) {
            return 1;
        }
        if (x1Var.getOrientation() != 90 && this.f9430b.getOrientation() != 270) {
            return this.f9430b.getContentHeight();
        }
        return this.f9430b.getContentWidth();
    }

    public int getCurrentWidth() {
        rg.x1 x1Var = this.f9430b;
        if (x1Var == null) {
            return 1;
        }
        if (x1Var.getOrientation() != 90 && this.f9430b.getOrientation() != 270) {
            return this.f9430b.getContentWidth();
        }
        return this.f9430b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f9435s;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        g0 g0Var = this.h;
        g0Var.setTopPadding(AndroidUtilities.dp(52.0f));
        g0Var.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f9432f.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void set(rg.x1 x1Var) {
        if (x1Var == null) {
            return;
        }
        this.f9430b = x1Var;
        setVisibility(0);
        this.E = false;
        g0 g0Var = this.h;
        boolean z10 = true;
        g0Var.J = true;
        getLocationOnScreen(this.v);
        this.f9429a.getLocationOnScreen(this.f9436w);
        x1Var.getLocationOnScreen(this.f9437x);
        MediaController.CropState cropState = x1Var.G0;
        if (cropState == null) {
            cropState = null;
        }
        g0Var.p(x1Var.getOrientation(), this.f9438y, cropState);
        float rotation = g0Var.getRotation();
        mg.f fVar = this.f9433n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.f6 f6Var = this.f9431c;
        if (cropState != null) {
            fVar.b(cropState.cropRotate);
            if (cropState.transformRotation == 0) {
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
        l0 l0Var = this.e;
        l0Var.setVisibility(0);
        l0Var.invalidate();
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.f9435s - f7) < 0.001f) {
            return;
        }
        this.f9435s = f7;
        this.e.invalidate();
        g0 g0Var = this.h;
        CropAreaView cropAreaView = g0Var.f16918a;
        CropAreaView cropAreaView2 = g0Var.f16918a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
    }
}
