package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bg.o0;
import c8.ma;
import java.util.HashSet;
import li.j0;
import li.k0;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.q9;
public final class h extends FrameLayout implements c6 {
    public static final int I = 0;
    public int E;
    public e F;
    public long G;
    public long H;
    public final i6 f21022a;
    public final int f21023b;
    public final q9 f21024c;
    public final TextView d;
    public final q9 f21025e;
    public final TextView f21026f;
    public final TextView h;
    public final TextView f21027n;
    public final hi.d f21028r;
    public final lq f21029s;
    public final ui.f f21030w;
    public final fh.g f21031x;
    public boolean f21032y;

    public h(int i7, Context context, i6 i6Var) {
        super(context);
        dh.c cVar;
        this.E = u6.f30083b;
        this.f21022a = i6Var;
        this.f21023b = i7;
        if (Build.VERSION.SDK_INT >= 31) {
            ui.f fVar = new ui.f(null);
            this.f21030w = fVar;
            fVar.l(g0.L(7.0f), o0.a());
            fVar.f59009n = true;
            cVar = new dh.c(fVar, fVar, fVar);
        } else {
            this.f21030w = null;
            ui.c cVar2 = new ui.c();
            cVar2.a(-16777216);
            cVar = new dh.c(cVar2, cVar2, cVar2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        q9 q9Var = new q9(context);
        this.f21024c = q9Var;
        q9Var.setRoundRadius(g0.L(52.0f) / 2);
        addView(q9Var, ma.d(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        lq lqVar = new lq(2131231979, 0);
        this.f21029s = lqVar;
        lqVar.f37198r = g0.L(2.0f);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(g0.o());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(g0.L(1.0f), 0, g0.L(5.0f), 0);
        frameLayout.addView(textView, ma.e(-2, -1, 81));
        addView(frameLayout, ma.n(14.33f, 52, 48, 11, 48, 0, 0));
        fh.g c10 = cVar.c(textView, null, false);
        gh.e eVar = new gh.e(i6Var);
        eVar.f13625e = new g0.e(18);
        eVar.f(1627389951, 1358954495);
        eVar.e(603979776, 603979776);
        eVar.d(0, 0);
        eVar.f13627n = 0.0f;
        eVar.f13628r = 0.0f;
        float N = g0.N(0.43f);
        float N2 = g0.N(0.43f);
        eVar.f13626f = N;
        eVar.h = N2;
        c10.p(eVar);
        c10.r(g0.L(7.0f));
        this.f21031x = c10;
        textView.setBackground(c10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.f21026f = textView2;
        textView2.setTypeface(g0.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, ma.k(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        q9 q9Var2 = new q9(context);
        this.f21025e = q9Var2;
        q9Var2.setRoundRadius(g0.L(8.0f));
        q9Var2.setOnClickListener(new View.OnClickListener(this) {
            public final h f21017b;

            {
                this.f21017b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f21017b;
                        e eVar2 = hVar.F;
                        if (eVar2 != null) {
                            long j3 = hVar.H;
                            j0 j0Var = ((k0) eVar2).h;
                            if (j0Var != null) {
                                j0Var.A(j3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f21017b;
                        e eVar3 = hVar2.F;
                        if (eVar3 != null) {
                            long j10 = hVar2.H;
                            j0 j0Var2 = ((k0) eVar3).h;
                            if (j0Var2 != null) {
                                j0Var2.A(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f21017b;
                        e eVar4 = hVar3.F;
                        if (eVar4 != null) {
                            ((k0) eVar4).g(hVar3.G, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f21017b;
                        e eVar5 = hVar4.F;
                        if (eVar5 != null) {
                            ((k0) eVar5).g(hVar4.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        addView(q9Var2, ma.d(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final h f21017b;

            {
                this.f21017b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f21017b;
                        e eVar2 = hVar.F;
                        if (eVar2 != null) {
                            long j3 = hVar.H;
                            j0 j0Var = ((k0) eVar2).h;
                            if (j0Var != null) {
                                j0Var.A(j3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f21017b;
                        e eVar3 = hVar2.F;
                        if (eVar3 != null) {
                            long j10 = hVar2.H;
                            j0 j0Var2 = ((k0) eVar3).h;
                            if (j0Var2 != null) {
                                j0Var2.A(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f21017b;
                        e eVar4 = hVar3.F;
                        if (eVar4 != null) {
                            ((k0) eVar4).g(hVar3.G, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f21017b;
                        e eVar5 = hVar4.F;
                        if (eVar5 != null) {
                            ((k0) eVar5).g(hVar4.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        TextView f10 = n10.f(linearLayout, textView3, ma.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.f21027n = f10;
        f10.setTextSize(1, 13.0f);
        int L = g0.L(12.0f);
        int i10 = n6.D6;
        ShapeDrawable d02 = n6.d0(L, n6.r1(0.14f, n6.w0(i10, i6Var)));
        q6 K = u6.K(0.14f, i10);
        f10.setBackground(d02);
        u6.j(f10, d02, K, null, i6Var);
        f10.setPadding(g0.L(4.0f), g0.L(1.0f), g0.L(8.0f), g0.L(1.66f));
        f10.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new lq(2131231943, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) gd.M0(2131751888, null));
        f10.setText(spannableStringBuilder);
        f10.setVisibility(8);
        linearLayout.addView(f10, ma.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        hi.d dVar = new hi.d(context, i6Var, true);
        this.f21028r = dVar;
        dVar.setUseWrapContent(true);
        dVar.setPadding(g0.L(15.0f), 0, g0.L(15.0f), 0);
        dVar.f();
        dVar.e();
        int i11 = n6.f29805z6;
        dVar.setColor(n6.r1(0.14f, n6.w0(i11, i6Var)));
        dVar.setTextColor(n6.x0(null, n6.G6, false));
        if (dVar.getBackground() != null) {
            Drawable background = dVar.getBackground();
            q6 K2 = u6.K(0.14f, i11);
            dVar.setBackground(background);
            u6.j(dVar, background, K2, null, i6Var);
        }
        dVar.i(gd.M0(2131751593, null), false, true);
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final h f21017b;

            {
                this.f21017b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f21017b;
                        e eVar2 = hVar.F;
                        if (eVar2 != null) {
                            long j3 = hVar.H;
                            j0 j0Var = ((k0) eVar2).h;
                            if (j0Var != null) {
                                j0Var.A(j3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f21017b;
                        e eVar3 = hVar2.F;
                        if (eVar3 != null) {
                            long j10 = hVar2.H;
                            j0 j0Var2 = ((k0) eVar3).h;
                            if (j0Var2 != null) {
                                j0Var2.A(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f21017b;
                        e eVar4 = hVar3.F;
                        if (eVar4 != null) {
                            ((k0) eVar4).g(hVar3.G, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f21017b;
                        e eVar5 = hVar4.F;
                        if (eVar5 != null) {
                            ((k0) eVar5).g(hVar4.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar, ma.q(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        hi.d dVar2 = new hi.d(context, i6Var, true);
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(g0.L(15.0f), 0, g0.L(15.0f), 0);
        dVar2.f();
        dVar2.i(gd.M0(2131754484, null), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final h f21017b;

            {
                this.f21017b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f21017b;
                        e eVar2 = hVar.F;
                        if (eVar2 != null) {
                            long j3 = hVar.H;
                            j0 j0Var = ((k0) eVar2).h;
                            if (j0Var != null) {
                                j0Var.A(j3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f21017b;
                        e eVar3 = hVar2.F;
                        if (eVar3 != null) {
                            long j10 = hVar2.H;
                            j0 j0Var2 = ((k0) eVar3).h;
                            if (j0Var2 != null) {
                                j0Var2.A(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f21017b;
                        e eVar4 = hVar3.F;
                        if (eVar4 != null) {
                            ((k0) eVar4).g(hVar3.G, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f21017b;
                        e eVar5 = hVar4.F;
                        if (eVar5 != null) {
                            ((k0) eVar5).g(hVar4.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar2, ma.q(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, ma.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, ma.d(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.G6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i7 = this.E;
        int i10 = u6.f30083b;
        if (i7 != i10) {
            this.E = i10;
            try {
                hi.d dVar = this.f21028r;
                if (dVar != null) {
                    dVar.setTextColor(n6.x0(null, n6.G6, false));
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        if (this.f21032y) {
            canvas2 = canvas;
            canvas2.drawLine(g0.L(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, n6.f29517k0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ui.f fVar;
        q9 q9Var;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f21030w) != null && view == (q9Var = this.f21024c)) {
            int L = g0.L(9.0f);
            int left = q9Var.getLeft() - L;
            int top = q9Var.getTop() - L;
            int L2 = (L * 2) + g0.L(52.0f);
            RecordingCanvas h = fVar.h(L2, L2);
            h.translate(-left, -top);
            h.drawColor(n6.w0(n6.f29394d6, this.f21022a));
            h.save();
            float f10 = L2 / 2.0f;
            h.scale(1.125f, 1.125f, f10, f10);
            super.drawChild(h, view, j3);
            h.restore();
            h.drawColor(536870912);
            fVar.i();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int left = this.d.getLeft();
        this.f21031x.i(g0.L(9.0f) + left, g0.L(48.0f));
    }

    @Override
    public final void updateColors() {
        int i7 = n6.G6;
        i6 i6Var = this.f21022a;
        this.f21026f.setTextColor(n6.w0(i7, i6Var));
        int i10 = n6.f29805z6;
        this.h.setTextColor(n6.w0(i10, i6Var));
        this.f21027n.setTextColor(n6.w0(i10, i6Var));
    }
}
