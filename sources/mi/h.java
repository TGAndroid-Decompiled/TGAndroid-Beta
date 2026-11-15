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
import bg.n0;
import c8.ja;
import java.util.HashSet;
import li.j0;
import li.k0;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.i9;
public final class h extends FrameLayout implements z5 {
    public static final int I = 0;
    public int E;
    public e F;
    public long G;
    public long H;
    public final e6 f20661a;
    public final int f20662b;
    public final i9 f20663c;
    public final TextView d;
    public final i9 f20664e;
    public final TextView f20665f;
    public final TextView h;
    public final TextView f20666n;
    public final hi.d f20667r;
    public final eq f20668s;
    public final ui.f f20669w;
    public final fh.g f20670x;
    public boolean f20671y;

    public h(int i7, Context context, e6 e6Var) {
        super(context);
        dh.c cVar;
        this.E = q6.f29535b;
        this.f20661a = e6Var;
        this.f20662b = i7;
        if (Build.VERSION.SDK_INT >= 31) {
            ui.f fVar = new ui.f(null);
            this.f20669w = fVar;
            fVar.l(g0.L(7.0f), n0.a());
            fVar.f58441n = true;
            cVar = new dh.c(fVar, fVar, fVar);
        } else {
            this.f20669w = null;
            ui.c cVar2 = new ui.c();
            cVar2.a(-16777216);
            cVar = new dh.c(cVar2, cVar2, cVar2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        i9 i9Var = new i9(context);
        this.f20663c = i9Var;
        i9Var.setRoundRadius(g0.L(52.0f) / 2);
        addView(i9Var, ja.d(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        eq eqVar = new eq(2131231978, 0);
        this.f20668s = eqVar;
        eqVar.f34414r = g0.L(2.0f);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(g0.o());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(g0.L(1.0f), 0, g0.L(5.0f), 0);
        frameLayout.addView(textView, ja.e(-2, -1, 81));
        addView(frameLayout, ja.n(14.33f, 52, 48, 11, 48, 0, 0));
        fh.g c10 = cVar.c(textView, null, false);
        gh.e eVar = new gh.e(e6Var);
        eVar.f13313e = new g0.e(17);
        eVar.f(1627389951, 1358954495);
        eVar.e(603979776, 603979776);
        eVar.d(0, 0);
        eVar.f13315n = 0.0f;
        eVar.f13316r = 0.0f;
        float N = g0.N(0.43f);
        float N2 = g0.N(0.43f);
        eVar.f13314f = N;
        eVar.h = N2;
        c10.p(eVar);
        c10.r(g0.L(7.0f));
        this.f20670x = c10;
        textView.setBackground(c10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.f20665f = textView2;
        textView2.setTypeface(g0.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, ja.k(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        i9 i9Var2 = new i9(context);
        this.f20664e = i9Var2;
        i9Var2.setRoundRadius(g0.L(8.0f));
        i9Var2.setOnClickListener(new View.OnClickListener(this) {
            public final h f20656b;

            {
                this.f20656b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f20656b;
                        e eVar2 = hVar.F;
                        if (eVar2 != null) {
                            long j3 = hVar.H;
                            j0 j0Var = ((k0) eVar2).h;
                            if (j0Var != null) {
                                j0Var.y(j3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f20656b;
                        e eVar3 = hVar2.F;
                        if (eVar3 != null) {
                            long j10 = hVar2.H;
                            j0 j0Var2 = ((k0) eVar3).h;
                            if (j0Var2 != null) {
                                j0Var2.y(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f20656b;
                        e eVar4 = hVar3.F;
                        if (eVar4 != null) {
                            ((k0) eVar4).g(hVar3.G, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f20656b;
                        e eVar5 = hVar4.F;
                        if (eVar5 != null) {
                            ((k0) eVar5).g(hVar4.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        addView(i9Var2, ja.d(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final h f20656b;

            {
                this.f20656b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f20656b;
                        e eVar2 = hVar.F;
                        if (eVar2 != null) {
                            long j3 = hVar.H;
                            j0 j0Var = ((k0) eVar2).h;
                            if (j0Var != null) {
                                j0Var.y(j3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f20656b;
                        e eVar3 = hVar2.F;
                        if (eVar3 != null) {
                            long j10 = hVar2.H;
                            j0 j0Var2 = ((k0) eVar3).h;
                            if (j0Var2 != null) {
                                j0Var2.y(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f20656b;
                        e eVar4 = hVar3.F;
                        if (eVar4 != null) {
                            ((k0) eVar4).g(hVar3.G, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f20656b;
                        e eVar5 = hVar4.F;
                        if (eVar5 != null) {
                            ((k0) eVar5).g(hVar4.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        TextView f10 = i20.f(linearLayout, textView3, ja.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.f20666n = f10;
        f10.setTextSize(1, 13.0f);
        int L = g0.L(12.0f);
        int i10 = j6.D6;
        ShapeDrawable d02 = j6.d0(L, j6.r1(0.14f, j6.w0(i10, e6Var)));
        m6 K = q6.K(0.14f, i10);
        f10.setBackground(d02);
        q6.j(f10, d02, K, null, e6Var);
        f10.setPadding(g0.L(4.0f), g0.L(1.0f), g0.L(8.0f), g0.L(1.66f));
        f10.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new eq(2131231942, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) hd.M0(2131751899, null));
        f10.setText(spannableStringBuilder);
        f10.setVisibility(8);
        linearLayout.addView(f10, ja.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        hi.d dVar = new hi.d(context, e6Var, true);
        this.f20667r = dVar;
        dVar.setUseWrapContent(true);
        dVar.setPadding(g0.L(15.0f), 0, g0.L(15.0f), 0);
        dVar.f();
        dVar.e();
        int i11 = j6.f29260z6;
        dVar.setColor(j6.r1(0.14f, j6.w0(i11, e6Var)));
        dVar.setTextColor(j6.x0(null, j6.G6, false));
        if (dVar.getBackground() != null) {
            Drawable background = dVar.getBackground();
            m6 K2 = q6.K(0.14f, i11);
            dVar.setBackground(background);
            q6.j(dVar, background, K2, null, e6Var);
        }
        dVar.i(hd.M0(2131751604, null), false, true);
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final h f20656b;

            {
                this.f20656b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f20656b;
                        e eVar2 = hVar.F;
                        if (eVar2 != null) {
                            long j3 = hVar.H;
                            j0 j0Var = ((k0) eVar2).h;
                            if (j0Var != null) {
                                j0Var.y(j3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f20656b;
                        e eVar3 = hVar2.F;
                        if (eVar3 != null) {
                            long j10 = hVar2.H;
                            j0 j0Var2 = ((k0) eVar3).h;
                            if (j0Var2 != null) {
                                j0Var2.y(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f20656b;
                        e eVar4 = hVar3.F;
                        if (eVar4 != null) {
                            ((k0) eVar4).g(hVar3.G, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f20656b;
                        e eVar5 = hVar4.F;
                        if (eVar5 != null) {
                            ((k0) eVar5).g(hVar4.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar, ja.q(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        hi.d dVar2 = new hi.d(context, e6Var, true);
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(g0.L(15.0f), 0, g0.L(15.0f), 0);
        dVar2.f();
        dVar2.i(hd.M0(2131754486, null), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final h f20656b;

            {
                this.f20656b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f20656b;
                        e eVar2 = hVar.F;
                        if (eVar2 != null) {
                            long j3 = hVar.H;
                            j0 j0Var = ((k0) eVar2).h;
                            if (j0Var != null) {
                                j0Var.y(j3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f20656b;
                        e eVar3 = hVar2.F;
                        if (eVar3 != null) {
                            long j10 = hVar2.H;
                            j0 j0Var2 = ((k0) eVar3).h;
                            if (j0Var2 != null) {
                                j0Var2.y(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f20656b;
                        e eVar4 = hVar3.F;
                        if (eVar4 != null) {
                            ((k0) eVar4).g(hVar3.G, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f20656b;
                        e eVar5 = hVar4.F;
                        if (eVar5 != null) {
                            ((k0) eVar5).g(hVar4.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar2, ja.q(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, ja.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, ja.d(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.G6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i7 = this.E;
        int i10 = q6.f29535b;
        if (i7 != i10) {
            this.E = i10;
            try {
                hi.d dVar = this.f20667r;
                if (dVar != null) {
                    dVar.setTextColor(j6.x0(null, j6.G6, false));
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        if (this.f20671y) {
            canvas2 = canvas;
            canvas2.drawLine(g0.L(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, j6.f28972k0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ui.f fVar;
        i9 i9Var;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f20669w) != null && view == (i9Var = this.f20663c)) {
            int L = g0.L(9.0f);
            int left = i9Var.getLeft() - L;
            int top = i9Var.getTop() - L;
            int L2 = (L * 2) + g0.L(52.0f);
            RecordingCanvas h = fVar.h(L2, L2);
            h.translate(-left, -top);
            h.drawColor(j6.w0(j6.f28849d6, this.f20661a));
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
        this.f20670x.i(g0.L(9.0f) + left, g0.L(48.0f));
    }

    @Override
    public final void updateColors() {
        int i7 = j6.G6;
        e6 e6Var = this.f20661a;
        this.f20665f.setTextColor(j6.w0(i7, e6Var));
        int i10 = j6.f29260z6;
        this.h.setTextColor(j6.w0(i10, e6Var));
        this.f20666n.setTextColor(j6.w0(i10, e6Var));
    }
}
