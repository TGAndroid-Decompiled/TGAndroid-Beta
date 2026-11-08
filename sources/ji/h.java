package ji;

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
import c8.ha;
import ii.k0;
import ii.l0;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.wp;
public final class h extends FrameLayout implements a6 {
    public static final int H = 0;
    public int D;
    public e E;
    public long F;
    public long G;
    public final f6 f17087a;
    public final int f17088b;
    public final l9 f17089c;
    public final TextView d;
    public final l9 f17090e;
    public final TextView f17091f;
    public final TextView h;
    public final TextView f17092n;
    public final fi.d f17093r;
    public final wp f17094s;
    public final ri.f f17095w;
    public final fh.g f17096x;
    public boolean f17097y;

    public h(int i7, Context context, f6 f6Var) {
        super(context);
        dh.c cVar;
        this.D = r6.f28479b;
        this.f17087a = f6Var;
        this.f17088b = i7;
        if (Build.VERSION.SDK_INT >= 31) {
            ri.f fVar = new ri.f(null);
            this.f17095w = fVar;
            fVar.m(g0.L(7.0f), o0.a());
            fVar.f54573n = true;
            cVar = new dh.c(fVar, fVar, fVar);
        } else {
            this.f17095w = null;
            ri.c cVar2 = new ri.c();
            cVar2.a(-16777216);
            cVar = new dh.c(cVar2, cVar2, cVar2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        l9 l9Var = new l9(context);
        this.f17089c = l9Var;
        l9Var.setRoundRadius(g0.L(52.0f) / 2);
        addView(l9Var, ha.d(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        wp wpVar = new wp(2131231978, 0);
        this.f17094s = wpVar;
        wpVar.f40020r = g0.L(2.0f);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(g0.o());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(g0.L(1.0f), 0, g0.L(5.0f), 0);
        frameLayout.addView(textView, ha.e(-2, -1, 81));
        addView(frameLayout, ha.n(14.33f, 52, 48, 11, 48, 0, 0));
        fh.g c10 = cVar.c(textView, null, false);
        gh.e eVar = new gh.e(f6Var);
        eVar.f13971e = new g2.c(15);
        eVar.f(1627389951, 1358954495);
        eVar.e(603979776, 603979776);
        eVar.d(0, 0);
        eVar.f13973n = 0.0f;
        eVar.f13974r = 0.0f;
        float N = g0.N(0.43f);
        float N2 = g0.N(0.43f);
        eVar.f13972f = N;
        eVar.h = N2;
        c10.p(eVar);
        c10.r(g0.L(7.0f));
        this.f17096x = c10;
        textView.setBackground(c10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.f17091f = textView2;
        textView2.setTypeface(g0.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, ha.k(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        l9 l9Var2 = new l9(context);
        this.f17090e = l9Var2;
        l9Var2.setRoundRadius(g0.L(8.0f));
        l9Var2.setOnClickListener(new View.OnClickListener(this) {
            public final h f17082b;

            {
                this.f17082b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f17082b;
                        e eVar2 = hVar.E;
                        if (eVar2 != null) {
                            long j3 = hVar.G;
                            k0 k0Var = ((l0) eVar2).h;
                            if (k0Var != null) {
                                k0Var.k(j3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f17082b;
                        e eVar3 = hVar2.E;
                        if (eVar3 != null) {
                            long j10 = hVar2.G;
                            k0 k0Var2 = ((l0) eVar3).h;
                            if (k0Var2 != null) {
                                k0Var2.k(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f17082b;
                        e eVar4 = hVar3.E;
                        if (eVar4 != null) {
                            ((l0) eVar4).g(hVar3.F, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f17082b;
                        e eVar5 = hVar4.E;
                        if (eVar5 != null) {
                            ((l0) eVar5).g(hVar4.F, true);
                            return;
                        }
                        return;
                }
            }
        });
        addView(l9Var2, ha.d(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final h f17082b;

            {
                this.f17082b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f17082b;
                        e eVar2 = hVar.E;
                        if (eVar2 != null) {
                            long j3 = hVar.G;
                            k0 k0Var = ((l0) eVar2).h;
                            if (k0Var != null) {
                                k0Var.k(j3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f17082b;
                        e eVar3 = hVar2.E;
                        if (eVar3 != null) {
                            long j10 = hVar2.G;
                            k0 k0Var2 = ((l0) eVar3).h;
                            if (k0Var2 != null) {
                                k0Var2.k(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f17082b;
                        e eVar4 = hVar3.E;
                        if (eVar4 != null) {
                            ((l0) eVar4).g(hVar3.F, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f17082b;
                        e eVar5 = hVar4.E;
                        if (eVar5 != null) {
                            ((l0) eVar5).g(hVar4.F, true);
                            return;
                        }
                        return;
                }
            }
        });
        TextView f10 = q.f(linearLayout, textView3, ha.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.f17092n = f10;
        f10.setTextSize(1, 13.0f);
        int L = g0.L(12.0f);
        int i10 = k6.D6;
        ShapeDrawable d02 = k6.d0(L, k6.r1(0.14f, k6.w0(i10, f6Var)));
        n6 L2 = r6.L(0.14f, i10);
        f10.setBackground(d02);
        r6.k(f10, d02, L2, null, f6Var);
        f10.setPadding(g0.L(4.0f), g0.L(1.0f), g0.L(8.0f), g0.L(1.66f));
        f10.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new wp(2131231942, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) id.M0(2131751899, null));
        f10.setText(spannableStringBuilder);
        f10.setVisibility(8);
        linearLayout.addView(f10, ha.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        fi.d dVar = new fi.d(context, f6Var, true);
        this.f17093r = dVar;
        dVar.setUseWrapContent(true);
        dVar.setPadding(g0.L(15.0f), 0, g0.L(15.0f), 0);
        dVar.f();
        dVar.e();
        int i11 = k6.f28262z6;
        dVar.setColor(k6.r1(0.14f, k6.w0(i11, f6Var)));
        dVar.setTextColor(k6.x0(null, k6.G6, false));
        if (dVar.getBackground() != null) {
            Drawable background = dVar.getBackground();
            n6 L3 = r6.L(0.14f, i11);
            dVar.setBackground(background);
            r6.k(dVar, background, L3, null, f6Var);
        }
        dVar.i(id.M0(2131751605, null), false, true);
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final h f17082b;

            {
                this.f17082b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f17082b;
                        e eVar2 = hVar.E;
                        if (eVar2 != null) {
                            long j3 = hVar.G;
                            k0 k0Var = ((l0) eVar2).h;
                            if (k0Var != null) {
                                k0Var.k(j3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f17082b;
                        e eVar3 = hVar2.E;
                        if (eVar3 != null) {
                            long j10 = hVar2.G;
                            k0 k0Var2 = ((l0) eVar3).h;
                            if (k0Var2 != null) {
                                k0Var2.k(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f17082b;
                        e eVar4 = hVar3.E;
                        if (eVar4 != null) {
                            ((l0) eVar4).g(hVar3.F, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f17082b;
                        e eVar5 = hVar4.E;
                        if (eVar5 != null) {
                            ((l0) eVar5).g(hVar4.F, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar, ha.q(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        fi.d dVar2 = new fi.d(context, f6Var, true);
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(g0.L(15.0f), 0, g0.L(15.0f), 0);
        dVar2.f();
        dVar2.i(id.M0(2131754486, null), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final h f17082b;

            {
                this.f17082b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f17082b;
                        e eVar2 = hVar.E;
                        if (eVar2 != null) {
                            long j3 = hVar.G;
                            k0 k0Var = ((l0) eVar2).h;
                            if (k0Var != null) {
                                k0Var.k(j3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f17082b;
                        e eVar3 = hVar2.E;
                        if (eVar3 != null) {
                            long j10 = hVar2.G;
                            k0 k0Var2 = ((l0) eVar3).h;
                            if (k0Var2 != null) {
                                k0Var2.k(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f17082b;
                        e eVar4 = hVar3.E;
                        if (eVar4 != null) {
                            ((l0) eVar4).g(hVar3.F, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f17082b;
                        e eVar5 = hVar4.E;
                        if (eVar5 != null) {
                            ((l0) eVar5).g(hVar4.F, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar2, ha.q(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, ha.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, ha.d(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.G6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i7 = this.D;
        int i10 = r6.f28479b;
        if (i7 != i10) {
            this.D = i10;
            try {
                fi.d dVar = this.f17093r;
                if (dVar != null) {
                    dVar.setTextColor(k6.x0(null, k6.G6, false));
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        if (this.f17097y) {
            canvas2 = canvas;
            canvas2.drawLine(g0.L(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, k6.f27975k0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ri.f fVar;
        l9 l9Var;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f17095w) != null && view == (l9Var = this.f17089c)) {
            int L = g0.L(9.0f);
            int left = l9Var.getLeft() - L;
            int top = l9Var.getTop() - L;
            int L2 = (L * 2) + g0.L(52.0f);
            RecordingCanvas i7 = fVar.i(L2, L2);
            i7.translate(-left, -top);
            i7.drawColor(k6.w0(k6.f27852d6, this.f17087a));
            i7.save();
            float f10 = L2 / 2.0f;
            i7.scale(1.125f, 1.125f, f10, f10);
            super.drawChild(i7, view, j3);
            i7.restore();
            i7.drawColor(536870912);
            fVar.j();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        int left = this.d.getLeft();
        this.f17096x.i(g0.L(9.0f) + left, g0.L(48.0f));
    }

    @Override
    public final void updateColors() {
        int i7 = k6.G6;
        f6 f6Var = this.f17087a;
        this.f17091f.setTextColor(k6.w0(i7, f6Var));
        int i10 = k6.f28262z6;
        this.h.setTextColor(k6.w0(i10, f6Var));
        this.f17092n.setTextColor(k6.w0(i10, f6Var));
    }
}
