package ki;

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
import b8.mf;
import cg.n0;
import gi.i8;
import java.util.HashSet;
import ji.h0;
import ji.i0;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.wp;
public final class h extends FrameLayout implements z5 {
    public static final int I = 0;
    public int E;
    public e F;
    public long G;
    public long H;
    public final e6 f17329a;
    public final int f17330b;
    public final k9 f17331c;
    public final TextView d;
    public final k9 f17332e;
    public final TextView f17333f;
    public final TextView h;
    public final TextView f17334n;
    public final gi.d f17335r;
    public final wp f17336s;
    public final si.f f17337w;
    public final gh.g f17338x;
    public boolean f17339y;

    public h(int i3, Context context, e6 e6Var) {
        super(context);
        eh.c cVar;
        this.E = r6.f28515b;
        this.f17329a = e6Var;
        this.f17330b = i3;
        if (Build.VERSION.SDK_INT >= 31) {
            si.f fVar = new si.f(null);
            this.f17337w = fVar;
            fVar.m(g0.L(7.0f), n0.a());
            fVar.f54757n = true;
            cVar = new eh.c(fVar, fVar, fVar);
        } else {
            this.f17337w = null;
            si.c cVar2 = new si.c();
            cVar2.a(-16777216);
            cVar = new eh.c(cVar2, cVar2, cVar2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        k9 k9Var = new k9(context);
        this.f17331c = k9Var;
        k9Var.setRoundRadius(g0.L(52.0f) / 2);
        addView(k9Var, mf.d(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        wp wpVar = new wp(2131231978, 0);
        this.f17336s = wpVar;
        wpVar.f40045r = g0.L(2.0f);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(g0.o());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(g0.L(1.0f), 0, g0.L(5.0f), 0);
        frameLayout.addView(textView, mf.e(-2, -1, 81));
        addView(frameLayout, mf.n(14.33f, 52, 48, 11, 48, 0, 0));
        gh.g c2 = cVar.c(textView, null, false);
        hh.e eVar = new hh.e(e6Var);
        eVar.f14417e = new i8(15);
        eVar.f(1627389951, 1358954495);
        eVar.e(603979776, 603979776);
        eVar.d(0, 0);
        eVar.f14419n = 0.0f;
        eVar.f14420r = 0.0f;
        float N = g0.N(0.43f);
        float N2 = g0.N(0.43f);
        eVar.f14418f = N;
        eVar.h = N2;
        c2.p(eVar);
        c2.r(g0.L(7.0f));
        this.f17338x = c2;
        textView.setBackground(c2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.f17333f = textView2;
        textView2.setTypeface(g0.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, mf.k(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        k9 k9Var2 = new k9(context);
        this.f17332e = k9Var2;
        k9Var2.setRoundRadius(g0.L(8.0f));
        k9Var2.setOnClickListener(new View.OnClickListener(this) {
            public final h f17324b;

            {
                this.f17324b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f17324b;
                        e eVar2 = hVar.F;
                        if (eVar2 != null) {
                            long j10 = hVar.H;
                            h0 h0Var = ((i0) eVar2).h;
                            if (h0Var != null) {
                                h0Var.i0(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f17324b;
                        e eVar3 = hVar2.F;
                        if (eVar3 != null) {
                            long j11 = hVar2.H;
                            h0 h0Var2 = ((i0) eVar3).h;
                            if (h0Var2 != null) {
                                h0Var2.i0(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f17324b;
                        e eVar4 = hVar3.F;
                        if (eVar4 != null) {
                            ((i0) eVar4).g(hVar3.G, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f17324b;
                        e eVar5 = hVar4.F;
                        if (eVar5 != null) {
                            ((i0) eVar5).g(hVar4.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        addView(k9Var2, mf.d(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final h f17324b;

            {
                this.f17324b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f17324b;
                        e eVar2 = hVar.F;
                        if (eVar2 != null) {
                            long j10 = hVar.H;
                            h0 h0Var = ((i0) eVar2).h;
                            if (h0Var != null) {
                                h0Var.i0(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f17324b;
                        e eVar3 = hVar2.F;
                        if (eVar3 != null) {
                            long j11 = hVar2.H;
                            h0 h0Var2 = ((i0) eVar3).h;
                            if (h0Var2 != null) {
                                h0Var2.i0(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f17324b;
                        e eVar4 = hVar3.F;
                        if (eVar4 != null) {
                            ((i0) eVar4).g(hVar3.G, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f17324b;
                        e eVar5 = hVar4.F;
                        if (eVar5 != null) {
                            ((i0) eVar5).g(hVar4.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        TextView f10 = q.f(linearLayout, textView3, mf.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.f17334n = f10;
        f10.setTextSize(1, 13.0f);
        int L = g0.L(12.0f);
        int i10 = k6.D6;
        ShapeDrawable d02 = k6.d0(L, k6.r1(0.14f, k6.w0(i10, e6Var)));
        n6 L2 = r6.L(0.14f, i10);
        f10.setBackground(d02);
        r6.k(f10, d02, L2, null, e6Var);
        f10.setPadding(g0.L(4.0f), g0.L(1.0f), g0.L(8.0f), g0.L(1.66f));
        f10.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new wp(2131231942, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) bd.M0(2131751899, null));
        f10.setText(spannableStringBuilder);
        f10.setVisibility(8);
        linearLayout.addView(f10, mf.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        gi.d dVar = new gi.d(context, e6Var, true);
        this.f17335r = dVar;
        dVar.setUseWrapContent(true);
        dVar.setPadding(g0.L(15.0f), 0, g0.L(15.0f), 0);
        dVar.f();
        dVar.e();
        int i11 = k6.f28290z6;
        dVar.setColor(k6.r1(0.14f, k6.w0(i11, e6Var)));
        dVar.setTextColor(k6.x0(null, k6.G6, false));
        if (dVar.getBackground() != null) {
            Drawable background = dVar.getBackground();
            n6 L3 = r6.L(0.14f, i11);
            dVar.setBackground(background);
            r6.k(dVar, background, L3, null, e6Var);
        }
        dVar.i(bd.M0(2131751605, null), false, true);
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final h f17324b;

            {
                this.f17324b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f17324b;
                        e eVar2 = hVar.F;
                        if (eVar2 != null) {
                            long j10 = hVar.H;
                            h0 h0Var = ((i0) eVar2).h;
                            if (h0Var != null) {
                                h0Var.i0(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f17324b;
                        e eVar3 = hVar2.F;
                        if (eVar3 != null) {
                            long j11 = hVar2.H;
                            h0 h0Var2 = ((i0) eVar3).h;
                            if (h0Var2 != null) {
                                h0Var2.i0(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f17324b;
                        e eVar4 = hVar3.F;
                        if (eVar4 != null) {
                            ((i0) eVar4).g(hVar3.G, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f17324b;
                        e eVar5 = hVar4.F;
                        if (eVar5 != null) {
                            ((i0) eVar5).g(hVar4.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar, mf.q(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        gi.d dVar2 = new gi.d(context, e6Var, true);
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(g0.L(15.0f), 0, g0.L(15.0f), 0);
        dVar2.f();
        dVar2.i(bd.M0(2131754486, null), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final h f17324b;

            {
                this.f17324b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f17324b;
                        e eVar2 = hVar.F;
                        if (eVar2 != null) {
                            long j10 = hVar.H;
                            h0 h0Var = ((i0) eVar2).h;
                            if (h0Var != null) {
                                h0Var.i0(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f17324b;
                        e eVar3 = hVar2.F;
                        if (eVar3 != null) {
                            long j11 = hVar2.H;
                            h0 h0Var2 = ((i0) eVar3).h;
                            if (h0Var2 != null) {
                                h0Var2.i0(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f17324b;
                        e eVar4 = hVar3.F;
                        if (eVar4 != null) {
                            ((i0) eVar4).g(hVar3.G, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f17324b;
                        e eVar5 = hVar4.F;
                        if (eVar5 != null) {
                            ((i0) eVar5).g(hVar4.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar2, mf.q(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, mf.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, mf.d(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.G6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i3 = this.E;
        int i10 = r6.f28515b;
        if (i3 != i10) {
            this.E = i10;
            try {
                gi.d dVar = this.f17335r;
                if (dVar != null) {
                    dVar.setTextColor(k6.x0(null, k6.G6, false));
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        if (this.f17339y) {
            canvas2 = canvas;
            canvas2.drawLine(g0.L(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, k6.f28002k0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        si.f fVar;
        k9 k9Var;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f17337w) != null && view == (k9Var = this.f17331c)) {
            int L = g0.L(9.0f);
            int left = k9Var.getLeft() - L;
            int top = k9Var.getTop() - L;
            int L2 = (L * 2) + g0.L(52.0f);
            RecordingCanvas h = fVar.h(L2, L2);
            h.translate(-left, -top);
            h.drawColor(k6.w0(k6.f27878d6, this.f17329a));
            h.save();
            float f10 = L2 / 2.0f;
            h.scale(1.125f, 1.125f, f10, f10);
            super.drawChild(h, view, j10);
            h.restore();
            h.drawColor(536870912);
            fVar.i();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        int left = this.d.getLeft();
        this.f17338x.i(g0.L(9.0f) + left, g0.L(48.0f));
    }

    @Override
    public final void updateColors() {
        int i3 = k6.G6;
        e6 e6Var = this.f17329a;
        this.f17333f.setTextColor(k6.w0(i3, e6Var));
        int i10 = k6.f28290z6;
        this.h.setTextColor(k6.w0(i10, e6Var));
        this.f17334n.setTextColor(k6.w0(i10, e6Var));
    }
}
