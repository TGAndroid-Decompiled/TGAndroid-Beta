package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.we;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.kr;
public abstract class s0 extends FrameLayout {
    public boolean E;
    public final f6 f15352a;
    public final org.telegram.ui.Components.c6 f15353b;
    public final org.telegram.ui.Components.c6 f15354c;
    public final r0 d;
    public final FrameLayout f15355e;
    public final p0 f15356f;
    public final og.f h;
    public final FrameLayout f15357n;
    public float f15358r;
    public final int[] f15359s;
    public final int[] f15360w;
    public final og.g f15361x;
    public x7 f15362y;

    public s0(Context context, f6 f6Var) {
        super(context);
        this.f15358r = 0.0f;
        this.f15359s = new int[2];
        this.f15360w = new int[2];
        this.f15361x = new Object();
        this.f15352a = f6Var;
        r0 r0Var = new r0(this, context);
        this.d = r0Var;
        kr krVar = kr.h;
        this.f15353b = new org.telegram.ui.Components.c6(r0Var, 0L, 320L, krVar);
        this.f15354c = new org.telegram.ui.Components.c6(this, 0L, 360L, krVar);
        p0 p0Var = new p0(this, context, 0);
        this.f15356f = p0Var;
        p0Var.setListener(new h6.o(this, 2));
        addView(p0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15355e = frameLayout;
        addView(frameLayout, c8.na.e(-1, -1, 119));
        og.f fVar = new og.f(context);
        this.h = fVar;
        fVar.setListener(new q0(0, this));
        frameLayout.addView(fVar, c8.na.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f15357n = frameLayout2;
        frameLayout.addView(frameLayout2, c8.na.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        i5.c.x(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(gd.N0(2131752577, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, c8.na.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final s0 f15142b;

            {
                this.f15142b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((xa) this.f15142b).F.k0(-1, false, true);
                        return;
                    case 1:
                        s0 s0Var = this.f15142b;
                        s0Var.f15356f.l(true);
                        og.f fVar2 = s0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        s0Var.d.invalidate();
                        return;
                    default:
                        s0 s0Var2 = this.f15142b;
                        x7 x7Var = s0Var2.f15362y;
                        if (x7Var != null) {
                            x7Var.m0 = new we();
                            s0Var2.f15356f.b(s0Var2.f15362y.m0);
                            x7 x7Var2 = s0Var2.f15362y;
                            x7Var2.m0.f27783z = x7Var2.Q;
                        }
                        ((xa) s0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(gd.N0(2131751684, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, c8.na.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final s0 f15142b;

            {
                this.f15142b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((xa) this.f15142b).F.k0(-1, false, true);
                        return;
                    case 1:
                        s0 s0Var = this.f15142b;
                        s0Var.f15356f.l(true);
                        og.f fVar2 = s0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        s0Var.d.invalidate();
                        return;
                    default:
                        s0 s0Var2 = this.f15142b;
                        x7 x7Var = s0Var2.f15362y;
                        if (x7Var != null) {
                            x7Var.m0 = new we();
                            s0Var2.f15356f.b(s0Var2.f15362y.m0);
                            x7 x7Var2 = s0Var2.f15362y;
                            x7Var2.m0.f27783z = x7Var2.Q;
                        }
                        ((xa) s0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(gd.N0(2131744444, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, c8.na.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final s0 f15142b;

            {
                this.f15142b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((xa) this.f15142b).F.k0(-1, false, true);
                        return;
                    case 1:
                        s0 s0Var = this.f15142b;
                        s0Var.f15356f.l(true);
                        og.f fVar2 = s0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        s0Var.d.invalidate();
                        return;
                    default:
                        s0 s0Var2 = this.f15142b;
                        x7 x7Var = s0Var2.f15362y;
                        if (x7Var != null) {
                            x7Var.m0 = new we();
                            s0Var2.f15356f.b(s0Var2.f15362y.m0);
                            x7 x7Var2 = s0Var2.f15362y;
                            x7Var2.m0.f27783z = x7Var2.Q;
                        }
                        ((xa) s0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
    }

    public int getCurrentHeight() {
        x7 x7Var = this.f15362y;
        if (x7Var == null) {
            return 1;
        }
        int i7 = x7Var.Q;
        f6 f6Var = this.f15352a;
        if (i7 != 90 && i7 != 270) {
            return f6Var.getContentHeight();
        }
        return f6Var.getContentWidth();
    }

    public int getCurrentWidth() {
        x7 x7Var = this.f15362y;
        if (x7Var == null) {
            return 1;
        }
        int i7 = x7Var.Q;
        f6 f6Var = this.f15352a;
        if (i7 != 90 && i7 != 270) {
            return f6Var.getContentWidth();
        }
        return f6Var.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f15358r;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        this.f15356f.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.f15355e.getPaddingBottom());
        super.onLayout(z10, i7, i10, i11, i12);
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f15358r - f10) < 0.001f) {
            return;
        }
        this.f15358r = f10;
        r0 r0Var = this.d;
        r0Var.setAlpha(f10);
        r0Var.invalidate();
        p0 p0Var = this.f15356f;
        CropAreaView cropAreaView = p0Var.f21987a;
        CropAreaView cropAreaView2 = p0Var.f21987a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
        this.f15352a.invalidate();
    }

    public void setEntry(x7 x7Var) {
        og.g gVar;
        boolean z10;
        if (x7Var == null) {
            return;
        }
        this.f15362y = x7Var;
        this.E = false;
        p0 p0Var = this.f15356f;
        p0Var.K = true;
        getLocationOnScreen(this.f15359s);
        int[] iArr = this.f15360w;
        f6 f6Var = this.f15352a;
        f6Var.getLocationOnScreen(iArr);
        we weVar = x7Var.m0;
        if (weVar == null) {
            weVar = null;
        }
        p0Var.p(x7Var.Q, this.f15361x, weVar);
        float rotation = p0Var.getRotation();
        og.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.c6 c6Var = this.f15353b;
        if (weVar != null) {
            fVar.b(weVar.d);
            if (weVar.f27775k != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            fVar.setRotated(z10);
            fVar.setMirrored(weVar.f27776l);
            c6Var.f(weVar.f27776l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            c6Var.getClass();
            c6Var.e(false, 0.0f);
        }
        p0Var.r(false);
        this.f15354c.e(true, gVar.f21950i);
        r0 r0Var = this.d;
        r0Var.setVisibility(0);
        r0Var.invalidate();
        f6Var.setCropEditorDrawing(this);
    }
}
