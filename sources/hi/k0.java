package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.we;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.lr;
public abstract class k0 extends FrameLayout {
    public boolean E;
    public final w5 f14837a;
    public final org.telegram.ui.Components.c6 f14838b;
    public final org.telegram.ui.Components.c6 f14839c;
    public final j0 d;
    public final FrameLayout f14840e;
    public final h0 f14841f;
    public final og.f h;
    public final FrameLayout f14842n;
    public float f14843r;
    public final int[] f14844s;
    public final int[] f14845w;
    public final og.g f14846x;
    public d7 f14847y;

    public k0(Context context, w5 w5Var) {
        super(context);
        this.f14843r = 0.0f;
        this.f14844s = new int[2];
        this.f14845w = new int[2];
        this.f14846x = new Object();
        this.f14837a = w5Var;
        j0 j0Var = new j0(this, context);
        this.d = j0Var;
        lr lrVar = lr.h;
        this.f14838b = new org.telegram.ui.Components.c6(j0Var, 0L, 320L, lrVar);
        this.f14839c = new org.telegram.ui.Components.c6(this, 0L, 360L, lrVar);
        h0 h0Var = new h0(this, context, 0);
        this.f14841f = h0Var;
        h0Var.setListener(new ob.c(this, 28));
        addView(h0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14840e = frameLayout;
        addView(frameLayout, c8.ma.e(-1, -1, 119));
        og.f fVar = new og.f(context);
        this.h = fVar;
        fVar.setListener(new i0(0, this));
        frameLayout.addView(fVar, c8.ma.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f14842n = frameLayout2;
        frameLayout.addView(frameLayout2, c8.ma.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        i5.c.x(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(gd.M0(2131752578, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, c8.ma.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final k0 f14674b;

            {
                this.f14674b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((da) this.f14674b).F.k0(-1, false, true);
                        return;
                    case 1:
                        k0 k0Var = this.f14674b;
                        k0Var.f14841f.l(true);
                        og.f fVar2 = k0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        k0Var.d.invalidate();
                        return;
                    default:
                        k0 k0Var2 = this.f14674b;
                        d7 d7Var = k0Var2.f14847y;
                        if (d7Var != null) {
                            d7Var.m0 = new we();
                            k0Var2.f14841f.b(k0Var2.f14847y.m0);
                            d7 d7Var2 = k0Var2.f14847y;
                            d7Var2.m0.f27689z = d7Var2.Q;
                        }
                        ((da) k0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(gd.M0(2131751685, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, c8.ma.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final k0 f14674b;

            {
                this.f14674b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((da) this.f14674b).F.k0(-1, false, true);
                        return;
                    case 1:
                        k0 k0Var = this.f14674b;
                        k0Var.f14841f.l(true);
                        og.f fVar2 = k0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        k0Var.d.invalidate();
                        return;
                    default:
                        k0 k0Var2 = this.f14674b;
                        d7 d7Var = k0Var2.f14847y;
                        if (d7Var != null) {
                            d7Var.m0 = new we();
                            k0Var2.f14841f.b(k0Var2.f14847y.m0);
                            d7 d7Var2 = k0Var2.f14847y;
                            d7Var2.m0.f27689z = d7Var2.Q;
                        }
                        ((da) k0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(gd.M0(2131744453, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, c8.ma.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final k0 f14674b;

            {
                this.f14674b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((da) this.f14674b).F.k0(-1, false, true);
                        return;
                    case 1:
                        k0 k0Var = this.f14674b;
                        k0Var.f14841f.l(true);
                        og.f fVar2 = k0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        k0Var.d.invalidate();
                        return;
                    default:
                        k0 k0Var2 = this.f14674b;
                        d7 d7Var = k0Var2.f14847y;
                        if (d7Var != null) {
                            d7Var.m0 = new we();
                            k0Var2.f14841f.b(k0Var2.f14847y.m0);
                            d7 d7Var2 = k0Var2.f14847y;
                            d7Var2.m0.f27689z = d7Var2.Q;
                        }
                        ((da) k0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
    }

    public int getCurrentHeight() {
        d7 d7Var = this.f14847y;
        if (d7Var == null) {
            return 1;
        }
        int i7 = d7Var.Q;
        w5 w5Var = this.f14837a;
        if (i7 != 90 && i7 != 270) {
            return w5Var.getContentHeight();
        }
        return w5Var.getContentWidth();
    }

    public int getCurrentWidth() {
        d7 d7Var = this.f14847y;
        if (d7Var == null) {
            return 1;
        }
        int i7 = d7Var.Q;
        w5 w5Var = this.f14837a;
        if (i7 != 90 && i7 != 270) {
            return w5Var.getContentWidth();
        }
        return w5Var.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f14843r;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        this.f14841f.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.f14840e.getPaddingBottom());
        super.onLayout(z10, i7, i10, i11, i12);
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f14843r - f10) < 0.001f) {
            return;
        }
        this.f14843r = f10;
        j0 j0Var = this.d;
        j0Var.setAlpha(f10);
        j0Var.invalidate();
        h0 h0Var = this.f14841f;
        CropAreaView cropAreaView = h0Var.f21893a;
        CropAreaView cropAreaView2 = h0Var.f21893a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
        this.f14837a.invalidate();
    }

    public void setEntry(d7 d7Var) {
        og.g gVar;
        boolean z10;
        if (d7Var == null) {
            return;
        }
        this.f14847y = d7Var;
        this.E = false;
        h0 h0Var = this.f14841f;
        h0Var.K = true;
        getLocationOnScreen(this.f14844s);
        int[] iArr = this.f14845w;
        w5 w5Var = this.f14837a;
        w5Var.getLocationOnScreen(iArr);
        we weVar = d7Var.m0;
        if (weVar == null) {
            weVar = null;
        }
        h0Var.p(d7Var.Q, this.f14846x, weVar);
        float rotation = h0Var.getRotation();
        og.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.c6 c6Var = this.f14838b;
        if (weVar != null) {
            fVar.b(weVar.d);
            if (weVar.f27681k != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            fVar.setRotated(z10);
            fVar.setMirrored(weVar.f27682l);
            c6Var.f(weVar.f27682l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            c6Var.getClass();
            c6Var.e(false, 0.0f);
        }
        h0Var.r(false);
        this.f14839c.e(true, gVar.f21856i);
        j0 j0Var = this.d;
        j0Var.setVisibility(0);
        j0Var.invalidate();
        w5Var.setCropEditorDrawing(this);
    }
}
