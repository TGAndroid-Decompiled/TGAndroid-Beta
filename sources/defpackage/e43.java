package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.Crop.CropAreaView;
public abstract class e43 extends FrameLayout {
    public boolean E;
    public final k9b a;
    public final ln b;
    public final ln c;
    public final d43 d;
    public final FrameLayout e;
    public final b43 f;
    public final m43 h;
    public final FrameLayout n;
    public float r;
    public final int[] s;
    public final int[] w;
    public final n43 x;
    public g6b y;

    public e43(Context context, k9b k9bVar) {
        super(context);
        this.r = 0.0f;
        this.s = new int[2];
        this.w = new int[2];
        this.x = new Object();
        this.a = k9bVar;
        d43 d43Var = new d43(this, context);
        this.d = d43Var;
        d53 d53Var = d53.h;
        this.b = new ln(d43Var, 0L, 320L, d53Var);
        this.c = new ln(this, 0L, 360L, d53Var);
        b43 b43Var = new b43(this, context, (byte) 0);
        this.f = b43Var;
        b43Var.setListener(new k6d(this, (byte) 23));
        addView(b43Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, qoe.e(-1, -1, 119));
        m43 m43Var = new m43(context);
        this.h = m43Var;
        m43Var.setListener(new c43(this, (byte) 0));
        frameLayout.addView(m43Var, qoe.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout.addView(frameLayout2, qoe.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        ts2.s(textView, 1, 14.0f);
        textView.setBackground(cmb.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(jb6.M0(2131752542, null));
        textView.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        frameLayout2.addView(textView, qoe.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final e43 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                e43 e43Var = this.b;
                switch (b) {
                    case 0:
                        ((g9b) e43Var).F.k0(-1, false, true);
                        return;
                    case 1:
                        e43Var.f.l(true);
                        m43 m43Var2 = e43Var.h;
                        m43Var2.setRotated(false);
                        m43Var2.setMirrored(false);
                        m43Var2.b(0.0f);
                        e43Var.d.invalidate();
                        return;
                    default:
                        g6b g6bVar = e43Var.y;
                        if (g6bVar != null) {
                            g6bVar.m0 = new ao6();
                            e43Var.f.a(e43Var.y.m0);
                            g6b g6bVar2 = e43Var.y;
                            g6bVar2.m0.z = g6bVar2.Q;
                        }
                        ((g9b) e43Var).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gm.o());
        textView2.setBackground(cmb.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(jb6.M0(2131751633, null));
        textView2.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        frameLayout2.addView(textView2, qoe.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final e43 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                e43 e43Var = this.b;
                switch (b) {
                    case 0:
                        ((g9b) e43Var).F.k0(-1, false, true);
                        return;
                    case 1:
                        e43Var.f.l(true);
                        m43 m43Var2 = e43Var.h;
                        m43Var2.setRotated(false);
                        m43Var2.setMirrored(false);
                        m43Var2.b(0.0f);
                        e43Var.d.invalidate();
                        return;
                    default:
                        g6b g6bVar = e43Var.y;
                        if (g6bVar != null) {
                            g6bVar.m0 = new ao6();
                            e43Var.f.a(e43Var.y.m0);
                            g6b g6bVar2 = e43Var.y;
                            g6bVar2.m0.z = g6bVar2.Q;
                        }
                        ((g9b) e43Var).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(gm.o());
        textView3.setBackground(cmb.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(jb6.M0(2131744374, null));
        textView3.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        frameLayout2.addView(textView3, qoe.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final e43 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                e43 e43Var = this.b;
                switch (b) {
                    case 0:
                        ((g9b) e43Var).F.k0(-1, false, true);
                        return;
                    case 1:
                        e43Var.f.l(true);
                        m43 m43Var2 = e43Var.h;
                        m43Var2.setRotated(false);
                        m43Var2.setMirrored(false);
                        m43Var2.b(0.0f);
                        e43Var.d.invalidate();
                        return;
                    default:
                        g6b g6bVar = e43Var.y;
                        if (g6bVar != null) {
                            g6bVar.m0 = new ao6();
                            e43Var.f.a(e43Var.y.m0);
                            g6b g6bVar2 = e43Var.y;
                            g6bVar2.m0.z = g6bVar2.Q;
                        }
                        ((g9b) e43Var).F.k0(-1, false, true);
                        return;
                }
            }
        });
    }

    public int getCurrentHeight() {
        g6b g6bVar = this.y;
        if (g6bVar == null) {
            return 1;
        }
        int i = g6bVar.Q;
        k9b k9bVar = this.a;
        if (i != 90 && i != 270) {
            return k9bVar.getContentHeight();
        }
        return k9bVar.getContentWidth();
    }

    public int getCurrentWidth() {
        g6b g6bVar = this.y;
        if (g6bVar == null) {
            return 1;
        }
        int i = g6bVar.Q;
        k9b k9bVar = this.a;
        if (i != 90 && i != 270) {
            return k9bVar.getContentWidth();
        }
        return k9bVar.getContentHeight();
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
        this.f.setBottomPadding(gm.L(116.0f) + this.e.getPaddingBottom());
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setAppearProgress(float f) {
        if (Math.abs(this.r - f) < 0.001f) {
            return;
        }
        this.r = f;
        d43 d43Var = this.d;
        d43Var.setAlpha(f);
        d43Var.invalidate();
        b43 b43Var = this.f;
        CropAreaView cropAreaView = b43Var.a;
        CropAreaView cropAreaView2 = b43Var.a;
        cropAreaView.setDimAlpha(0.5f * f);
        cropAreaView2.setFrameAlpha(f);
        cropAreaView2.invalidate();
        this.a.invalidate();
    }

    public void setEntry(g6b g6bVar) {
        n43 n43Var;
        boolean z;
        if (g6bVar == null) {
            return;
        }
        this.y = g6bVar;
        this.E = false;
        b43 b43Var = this.f;
        b43Var.K = true;
        getLocationOnScreen(this.s);
        int[] iArr = this.w;
        k9b k9bVar = this.a;
        k9bVar.getLocationOnScreen(iArr);
        ao6 ao6Var = g6bVar.m0;
        if (ao6Var == null) {
            ao6Var = null;
        }
        b43Var.p(g6bVar.Q, this.x, ao6Var);
        float rotation = b43Var.getRotation();
        m43 m43Var = this.h;
        m43Var.setRotation(rotation);
        ln lnVar = this.b;
        if (ao6Var != null) {
            m43Var.b(ao6Var.d);
            if (ao6Var.k != 0) {
                z = true;
            } else {
                z = false;
            }
            m43Var.setRotated(z);
            m43Var.setMirrored(ao6Var.l);
            lnVar.f(ao6Var.l, false);
        } else {
            m43Var.b(0.0f);
            m43Var.setRotated(false);
            m43Var.setMirrored(false);
            lnVar.getClass();
            lnVar.e(false, 0.0f);
        }
        b43Var.r(false);
        this.c.e(true, n43Var.i);
        d43 d43Var = this.d;
        d43Var.setVisibility(0);
        d43Var.invalidate();
        k9bVar.setCropEditorDrawing(this);
    }
}
