package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.Crop.CropAreaView;
public abstract class t23 extends FrameLayout {
    public boolean E;
    public final i7b a;
    public final lm b;
    public final lm c;
    public final s23 d;
    public final FrameLayout e;
    public final q23 f;
    public final b33 h;
    public final FrameLayout n;
    public float r;
    public final int[] s;
    public final int[] w;
    public final c33 x;
    public f4b y;

    public t23(Context context, i7b i7bVar) {
        super(context);
        this.r = 0.0f;
        this.s = new int[2];
        this.w = new int[2];
        this.x = new Object();
        this.a = i7bVar;
        s23 s23Var = new s23(this, context);
        this.d = s23Var;
        s33 s33Var = s33.h;
        this.b = new lm(s23Var, 0L, 320L, s33Var);
        this.c = new lm(this, 0L, 360L, s33Var);
        q23 q23Var = new q23(this, context, (byte) 0);
        this.f = q23Var;
        q23Var.setListener(new l69(this, (byte) 24));
        addView(q23Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, nme.e(-1, -1, 119));
        b33 b33Var = new b33(context);
        this.h = b33Var;
        b33Var.setListener(new r23(this, (byte) 0));
        frameLayout.addView(b33Var, nme.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout.addView(frameLayout2, nme.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        ir2.t(textView, 1, 14.0f);
        textView.setBackground(bkb.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(k96.M0(2131752577, null));
        textView.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        frameLayout2.addView(textView, nme.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final t23 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                t23 t23Var = this.b;
                switch (b) {
                    case 0:
                        ((e7b) t23Var).F.k0(-1, false, true);
                        return;
                    case 1:
                        t23Var.f.l(true);
                        b33 b33Var2 = t23Var.h;
                        b33Var2.setRotated(false);
                        b33Var2.setMirrored(false);
                        b33Var2.b(0.0f);
                        t23Var.d.invalidate();
                        return;
                    default:
                        f4b f4bVar = t23Var.y;
                        if (f4bVar != null) {
                            f4bVar.m0 = new zl6();
                            t23Var.f.a(t23Var.y.m0);
                            f4b f4bVar2 = t23Var.y;
                            f4bVar2.m0.z = f4bVar2.Q;
                        }
                        ((e7b) t23Var).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gl.o());
        textView2.setBackground(bkb.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(k96.M0(2131751684, null));
        textView2.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        frameLayout2.addView(textView2, nme.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final t23 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                t23 t23Var = this.b;
                switch (b) {
                    case 0:
                        ((e7b) t23Var).F.k0(-1, false, true);
                        return;
                    case 1:
                        t23Var.f.l(true);
                        b33 b33Var2 = t23Var.h;
                        b33Var2.setRotated(false);
                        b33Var2.setMirrored(false);
                        b33Var2.b(0.0f);
                        t23Var.d.invalidate();
                        return;
                    default:
                        f4b f4bVar = t23Var.y;
                        if (f4bVar != null) {
                            f4bVar.m0 = new zl6();
                            t23Var.f.a(t23Var.y.m0);
                            f4b f4bVar2 = t23Var.y;
                            f4bVar2.m0.z = f4bVar2.Q;
                        }
                        ((e7b) t23Var).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(gl.o());
        textView3.setBackground(bkb.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(k96.M0(2131744448, null));
        textView3.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        frameLayout2.addView(textView3, nme.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final t23 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                t23 t23Var = this.b;
                switch (b) {
                    case 0:
                        ((e7b) t23Var).F.k0(-1, false, true);
                        return;
                    case 1:
                        t23Var.f.l(true);
                        b33 b33Var2 = t23Var.h;
                        b33Var2.setRotated(false);
                        b33Var2.setMirrored(false);
                        b33Var2.b(0.0f);
                        t23Var.d.invalidate();
                        return;
                    default:
                        f4b f4bVar = t23Var.y;
                        if (f4bVar != null) {
                            f4bVar.m0 = new zl6();
                            t23Var.f.a(t23Var.y.m0);
                            f4b f4bVar2 = t23Var.y;
                            f4bVar2.m0.z = f4bVar2.Q;
                        }
                        ((e7b) t23Var).F.k0(-1, false, true);
                        return;
                }
            }
        });
    }

    public int getCurrentHeight() {
        f4b f4bVar = this.y;
        if (f4bVar == null) {
            return 1;
        }
        int i = f4bVar.Q;
        i7b i7bVar = this.a;
        if (i != 90 && i != 270) {
            return i7bVar.getContentHeight();
        }
        return i7bVar.getContentWidth();
    }

    public int getCurrentWidth() {
        f4b f4bVar = this.y;
        if (f4bVar == null) {
            return 1;
        }
        int i = f4bVar.Q;
        i7b i7bVar = this.a;
        if (i != 90 && i != 270) {
            return i7bVar.getContentWidth();
        }
        return i7bVar.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.r;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f.setBottomPadding(gl.L(116.0f) + this.e.getPaddingBottom());
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setAppearProgress(float f) {
        if (Math.abs(this.r - f) < 0.001f) {
            return;
        }
        this.r = f;
        s23 s23Var = this.d;
        s23Var.setAlpha(f);
        s23Var.invalidate();
        q23 q23Var = this.f;
        CropAreaView cropAreaView = q23Var.a;
        CropAreaView cropAreaView2 = q23Var.a;
        cropAreaView.setDimAlpha(0.5f * f);
        cropAreaView2.setFrameAlpha(f);
        cropAreaView2.invalidate();
        this.a.invalidate();
    }

    public void setEntry(f4b f4bVar) {
        c33 c33Var;
        boolean z;
        if (f4bVar == null) {
            return;
        }
        this.y = f4bVar;
        this.E = false;
        q23 q23Var = this.f;
        q23Var.K = true;
        getLocationOnScreen(this.s);
        int[] iArr = this.w;
        i7b i7bVar = this.a;
        i7bVar.getLocationOnScreen(iArr);
        zl6 zl6Var = f4bVar.m0;
        if (zl6Var == null) {
            zl6Var = null;
        }
        q23Var.p(f4bVar.Q, this.x, zl6Var);
        float rotation = q23Var.getRotation();
        b33 b33Var = this.h;
        b33Var.setRotation(rotation);
        lm lmVar = this.b;
        if (zl6Var != null) {
            b33Var.b(zl6Var.d);
            if (zl6Var.k != 0) {
                z = true;
            } else {
                z = false;
            }
            b33Var.setRotated(z);
            b33Var.setMirrored(zl6Var.l);
            lmVar.f(zl6Var.l, false);
        } else {
            b33Var.b(0.0f);
            b33Var.setRotated(false);
            b33Var.setMirrored(false);
            lmVar.getClass();
            lmVar.e(false, 0.0f);
        }
        q23Var.r(false);
        this.c.e(true, c33Var.i);
        s23 s23Var = this.d;
        s23Var.setVisibility(0);
        s23Var.invalidate();
        i7bVar.setCropEditorDrawing(this);
    }
}
