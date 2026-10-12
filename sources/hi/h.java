package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.w2;
import com.google.android.gms.internal.play_billing.k3;
import gi.s0;
import gi.t0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.z9;
import w7.a6;
import zf.g0;
public final class h extends FrameLayout implements x5 {
    public static final int F = 0;
    public long E;
    public final c6 f10832a;
    public final int f10833b;
    public final z9 f10834c;
    public final TextView d;
    public final z9 e;
    public final TextView f10835f;
    public final TextView h;
    public final TextView f10836n;
    public final br f10837r;
    public final gh.d f10838s;
    public final dh.d v;
    public boolean f10839w;
    public e f10840x;
    public long f10841y;

    public h(Context context, int i10, c6 c6Var) {
        super(context);
        bh.b bVar;
        this.f10832a = c6Var;
        this.f10833b = i10;
        if (Build.VERSION.SDK_INT >= 31) {
            gh.d dVar = new gh.d(null);
            this.f10838s = dVar;
            dVar.h(AndroidUtilities.dp(7.0f), g0.a());
            dVar.h = true;
            bVar = new bh.b(dVar);
        } else {
            this.f10838s = null;
            gh.c cVar = new gh.c();
            cVar.a(-16777216);
            bVar = new bh.b(cVar);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        z9 z9Var = new z9(context);
        this.f10834c = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(52.0f) / 2);
        addView(z9Var, a6.a(52.0f, 11.0f, 9.0f, 0.0f, 0.0f, 52, 51));
        br brVar = new br(R.drawable.mini_user_channels_10, 0);
        this.f10837r = brVar;
        brVar.setTranslateX(AndroidUtilities.dp(2.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(5.0f), 0);
        frameLayout.addView(textView, a6.e(-2, -1, 81));
        addView(frameLayout, a6.s(52, 48, 11, 48, 0, 14.33f, 0));
        dh.d c10 = bVar.c(textView, null, false);
        eh.e eVar = new eh.e(c6Var);
        eVar.e = new w2(21);
        eVar.d(1627389951, 1358954495);
        eVar.c(603979776, 603979776);
        eVar.b(0, 0);
        eVar.f8780n = 0.0f;
        eVar.f8781r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.43f);
        float dpf22 = AndroidUtilities.dpf2(0.43f);
        eVar.f8779f = dpf2;
        eVar.h = dpf22;
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(7.0f));
        this.v = c10;
        textView.setBackground(c10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.f10835f = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 16.0f);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, a6.k(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        z9 z9Var2 = new z9(context);
        this.e = z9Var2;
        z9Var2.setRoundRadius(AndroidUtilities.dp(8.0f));
        z9Var2.setOnClickListener(new View.OnClickListener(this) {
            public final h f10827b;

            {
                this.f10827b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f10827b;
                        e eVar2 = hVar.f10840x;
                        if (eVar2 != null) {
                            long j10 = hVar.E;
                            s0 s0Var = ((t0) eVar2).h;
                            if (s0Var != null) {
                                s0Var.a(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f10827b;
                        e eVar3 = hVar2.f10840x;
                        if (eVar3 != null) {
                            long j11 = hVar2.E;
                            s0 s0Var2 = ((t0) eVar3).h;
                            if (s0Var2 != null) {
                                s0Var2.a(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f10827b;
                        e eVar4 = hVar3.f10840x;
                        if (eVar4 != null) {
                            ((t0) eVar4).g(hVar3.f10841y, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f10827b;
                        e eVar5 = hVar4.f10840x;
                        if (eVar5 != null) {
                            ((t0) eVar5).g(hVar4.f10841y, true);
                            return;
                        }
                        return;
                }
            }
        });
        addView(z9Var2, a6.a(16.0f, 75.0f, 35.0f, 0.0f, 0.0f, 16, 51));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final h f10827b;

            {
                this.f10827b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f10827b;
                        e eVar2 = hVar.f10840x;
                        if (eVar2 != null) {
                            long j10 = hVar.E;
                            s0 s0Var = ((t0) eVar2).h;
                            if (s0Var != null) {
                                s0Var.a(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f10827b;
                        e eVar3 = hVar2.f10840x;
                        if (eVar3 != null) {
                            long j11 = hVar2.E;
                            s0 s0Var2 = ((t0) eVar3).h;
                            if (s0Var2 != null) {
                                s0Var2.a(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f10827b;
                        e eVar4 = hVar3.f10840x;
                        if (eVar4 != null) {
                            ((t0) eVar4).g(hVar3.f10841y, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f10827b;
                        e eVar5 = hVar4.f10840x;
                        if (eVar5 != null) {
                            ((t0) eVar5).g(hVar4.f10841y, true);
                            return;
                        }
                        return;
                }
            }
        });
        TextView i11 = k3.i(linearLayout, textView3, a6.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.f10836n = i11;
        i11.setTextSize(1, 13.0f);
        i11.setBackground(g6.c0(AndroidUtilities.dp(12.0f), g6.m1(0.14f, g6.w0(g6.D6, c6Var))));
        i11.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.66f));
        i11.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new br(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityPendingRequestOnlyVisibleToMembers));
        i11.setText(spannableStringBuilder);
        i11.setVisibility(8);
        linearLayout.addView(i11, a6.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        di.d dVar2 = new di.d(context, c6Var, true);
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar2.e();
        dVar2.d();
        dVar2.setColor(g6.m1(0.14f, g6.w0(g6.f20305z6, c6Var)));
        dVar2.setTextColor(g6.x0(null, g6.G6, false));
        dVar2.g(LocaleController.getString(R.string.Decline), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final h f10827b;

            {
                this.f10827b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f10827b;
                        e eVar2 = hVar.f10840x;
                        if (eVar2 != null) {
                            long j10 = hVar.E;
                            s0 s0Var = ((t0) eVar2).h;
                            if (s0Var != null) {
                                s0Var.a(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f10827b;
                        e eVar3 = hVar2.f10840x;
                        if (eVar3 != null) {
                            long j11 = hVar2.E;
                            s0 s0Var2 = ((t0) eVar3).h;
                            if (s0Var2 != null) {
                                s0Var2.a(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f10827b;
                        e eVar4 = hVar3.f10840x;
                        if (eVar4 != null) {
                            ((t0) eVar4).g(hVar3.f10841y, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f10827b;
                        e eVar5 = hVar4.f10840x;
                        if (eVar5 != null) {
                            ((t0) eVar5).g(hVar4.f10841y, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar2, a6.p(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        di.d dVar3 = new di.d(context, c6Var, true);
        dVar3.setUseWrapContent(true);
        dVar3.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar3.e();
        dVar3.g(LocaleController.getString(R.string.Add), false, true);
        dVar3.setOnClickListener(new View.OnClickListener(this) {
            public final h f10827b;

            {
                this.f10827b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f10827b;
                        e eVar2 = hVar.f10840x;
                        if (eVar2 != null) {
                            long j10 = hVar.E;
                            s0 s0Var = ((t0) eVar2).h;
                            if (s0Var != null) {
                                s0Var.a(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f10827b;
                        e eVar3 = hVar2.f10840x;
                        if (eVar3 != null) {
                            long j11 = hVar2.E;
                            s0 s0Var2 = ((t0) eVar3).h;
                            if (s0Var2 != null) {
                                s0Var2.a(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f10827b;
                        e eVar4 = hVar3.f10840x;
                        if (eVar4 != null) {
                            ((t0) eVar4).g(hVar3.f10841y, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f10827b;
                        e eVar5 = hVar4.f10840x;
                        if (eVar5 != null) {
                            ((t0) eVar5).g(hVar4.f10841y, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar3, a6.p(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, a6.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, a6.a(-2.0f, 75.0f, 0.0f, 0.0f, 13.0f, -1, 48));
        d();
    }

    @Override
    public final void d() {
        int i10 = g6.G6;
        c6 c6Var = this.f10832a;
        this.f10835f.setTextColor(g6.w0(i10, c6Var));
        int i11 = g6.f20305z6;
        this.h.setTextColor(g6.w0(i11, c6Var));
        this.f10836n.setTextColor(g6.w0(i11, c6Var));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f10839w) {
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dp(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, g6.f20022k0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        gh.d dVar;
        z9 z9Var;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f10838s) != null && view == (z9Var = this.f10834c)) {
            int dp = AndroidUtilities.dp(9.0f);
            int left = z9Var.getLeft() - dp;
            int top = z9Var.getTop() - dp;
            int dp2 = (dp * 2) + AndroidUtilities.dp(52.0f);
            RecordingCanvas a2 = dVar.a(dp2, dp2);
            a2.translate(-left, -top);
            a2.drawColor(g6.w0(g6.f19901d6, this.f10832a));
            a2.save();
            float f7 = dp2 / 2.0f;
            a2.scale(1.125f, 1.125f, f7, f7);
            super.drawChild(a2, view, j10);
            a2.restore();
            a2.drawColor(536870912);
            dVar.c();
        }
        return super.drawChild(canvas, view, j10);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int left = this.d.getLeft();
        this.v.t(AndroidUtilities.dp(9.0f) + left, AndroidUtilities.dp(48.0f));
    }
}
