package ii;

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
import ci.i1;
import com.google.android.gms.internal.play_billing.k3;
import hi.r0;
import hi.s0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yq;
import w7.z5;
import zf.g0;
public final class g extends FrameLayout implements y5 {
    public static final int F = 0;
    public long E;
    public final d6 f13165a;
    public final int f13166b;
    public final w9 f13167c;
    public final TextView d;
    public final w9 e;
    public final TextView f13168f;
    public final TextView h;
    public final TextView f13169n;
    public final yq f13170r;
    public final gh.d f13171s;
    public final dh.d v;
    public boolean f13172w;
    public d f13173x;
    public long f13174y;

    public g(Context context, int i10, d6 d6Var) {
        super(context);
        bh.b bVar;
        this.f13165a = d6Var;
        this.f13166b = i10;
        if (Build.VERSION.SDK_INT >= 31) {
            gh.d dVar = new gh.d(null);
            this.f13171s = dVar;
            dVar.i(AndroidUtilities.dp(7.0f), g0.a());
            dVar.h = true;
            bVar = new bh.b(dVar);
        } else {
            this.f13171s = null;
            gh.c cVar = new gh.c();
            cVar.a(-16777216);
            bVar = new bh.b(cVar);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        w9 w9Var = new w9(context);
        this.f13167c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(52.0f) / 2);
        addView(w9Var, z5.a(52.0f, 11.0f, 9.0f, 0.0f, 0.0f, 52, 51));
        yq yqVar = new yq(R.drawable.mini_user_channels_10, 0);
        this.f13170r = yqVar;
        yqVar.setTranslateX(AndroidUtilities.dp(2.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(5.0f), 0);
        frameLayout.addView(textView, z5.e(-2, -1, 81));
        addView(frameLayout, z5.s(52, 48, 11, 48, 0, 14.33f, 0));
        dh.d c10 = bVar.c(textView, null, false);
        eh.e eVar = new eh.e(d6Var);
        eVar.e = new i1(23);
        eVar.d(1627389951, 1358954495);
        eVar.c(603979776, 603979776);
        eVar.b(0, 0);
        eVar.f8664n = 0.0f;
        eVar.f8665r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.43f);
        float dpf22 = AndroidUtilities.dpf2(0.43f);
        eVar.f8663f = dpf2;
        eVar.h = dpf22;
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(7.0f));
        this.v = c10;
        textView.setBackground(c10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.f13168f = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 16.0f);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, z5.k(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        w9 w9Var2 = new w9(context);
        this.e = w9Var2;
        w9Var2.setRoundRadius(AndroidUtilities.dp(8.0f));
        w9Var2.setOnClickListener(new View.OnClickListener(this) {
            public final g f13160b;

            {
                this.f13160b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g gVar = this.f13160b;
                        d dVar2 = gVar.f13173x;
                        if (dVar2 != null) {
                            long j10 = gVar.E;
                            r0 r0Var = ((s0) dVar2).h;
                            if (r0Var != null) {
                                r0Var.j(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        g gVar2 = this.f13160b;
                        d dVar3 = gVar2.f13173x;
                        if (dVar3 != null) {
                            long j11 = gVar2.E;
                            r0 r0Var2 = ((s0) dVar3).h;
                            if (r0Var2 != null) {
                                r0Var2.j(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        g gVar3 = this.f13160b;
                        d dVar4 = gVar3.f13173x;
                        if (dVar4 != null) {
                            ((s0) dVar4).g(gVar3.f13174y, false);
                            return;
                        }
                        return;
                    default:
                        g gVar4 = this.f13160b;
                        d dVar5 = gVar4.f13173x;
                        if (dVar5 != null) {
                            ((s0) dVar5).g(gVar4.f13174y, true);
                            return;
                        }
                        return;
                }
            }
        });
        addView(w9Var2, z5.a(16.0f, 75.0f, 35.0f, 0.0f, 0.0f, 16, 51));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final g f13160b;

            {
                this.f13160b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g gVar = this.f13160b;
                        d dVar2 = gVar.f13173x;
                        if (dVar2 != null) {
                            long j10 = gVar.E;
                            r0 r0Var = ((s0) dVar2).h;
                            if (r0Var != null) {
                                r0Var.j(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        g gVar2 = this.f13160b;
                        d dVar3 = gVar2.f13173x;
                        if (dVar3 != null) {
                            long j11 = gVar2.E;
                            r0 r0Var2 = ((s0) dVar3).h;
                            if (r0Var2 != null) {
                                r0Var2.j(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        g gVar3 = this.f13160b;
                        d dVar4 = gVar3.f13173x;
                        if (dVar4 != null) {
                            ((s0) dVar4).g(gVar3.f13174y, false);
                            return;
                        }
                        return;
                    default:
                        g gVar4 = this.f13160b;
                        d dVar5 = gVar4.f13173x;
                        if (dVar5 != null) {
                            ((s0) dVar5).g(gVar4.f13174y, true);
                            return;
                        }
                        return;
                }
            }
        });
        TextView i11 = k3.i(linearLayout, textView3, z5.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.f13169n = i11;
        i11.setTextSize(1, 13.0f);
        i11.setBackground(h6.c0(AndroidUtilities.dp(12.0f), h6.m1(0.14f, h6.w0(h6.D6, d6Var))));
        i11.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.66f));
        i11.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new yq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityPendingRequestOnlyVisibleToMembers));
        i11.setText(spannableStringBuilder);
        i11.setVisibility(8);
        linearLayout.addView(i11, z5.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        ei.d dVar2 = new ei.d(context, d6Var, true);
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar2.e();
        dVar2.d();
        dVar2.setColor(h6.m1(0.14f, h6.w0(h6.f21398z6, d6Var)));
        dVar2.setTextColor(h6.x0(null, h6.G6, false));
        dVar2.g(LocaleController.getString(R.string.Decline), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final g f13160b;

            {
                this.f13160b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g gVar = this.f13160b;
                        d dVar22 = gVar.f13173x;
                        if (dVar22 != null) {
                            long j10 = gVar.E;
                            r0 r0Var = ((s0) dVar22).h;
                            if (r0Var != null) {
                                r0Var.j(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        g gVar2 = this.f13160b;
                        d dVar3 = gVar2.f13173x;
                        if (dVar3 != null) {
                            long j11 = gVar2.E;
                            r0 r0Var2 = ((s0) dVar3).h;
                            if (r0Var2 != null) {
                                r0Var2.j(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        g gVar3 = this.f13160b;
                        d dVar4 = gVar3.f13173x;
                        if (dVar4 != null) {
                            ((s0) dVar4).g(gVar3.f13174y, false);
                            return;
                        }
                        return;
                    default:
                        g gVar4 = this.f13160b;
                        d dVar5 = gVar4.f13173x;
                        if (dVar5 != null) {
                            ((s0) dVar5).g(gVar4.f13174y, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar2, z5.p(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        ei.d dVar3 = new ei.d(context, d6Var, true);
        dVar3.setUseWrapContent(true);
        dVar3.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar3.e();
        dVar3.g(LocaleController.getString(R.string.Add), false, true);
        dVar3.setOnClickListener(new View.OnClickListener(this) {
            public final g f13160b;

            {
                this.f13160b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g gVar = this.f13160b;
                        d dVar22 = gVar.f13173x;
                        if (dVar22 != null) {
                            long j10 = gVar.E;
                            r0 r0Var = ((s0) dVar22).h;
                            if (r0Var != null) {
                                r0Var.j(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        g gVar2 = this.f13160b;
                        d dVar32 = gVar2.f13173x;
                        if (dVar32 != null) {
                            long j11 = gVar2.E;
                            r0 r0Var2 = ((s0) dVar32).h;
                            if (r0Var2 != null) {
                                r0Var2.j(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        g gVar3 = this.f13160b;
                        d dVar4 = gVar3.f13173x;
                        if (dVar4 != null) {
                            ((s0) dVar4).g(gVar3.f13174y, false);
                            return;
                        }
                        return;
                    default:
                        g gVar4 = this.f13160b;
                        d dVar5 = gVar4.f13173x;
                        if (dVar5 != null) {
                            ((s0) dVar5).g(gVar4.f13174y, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar3, z5.p(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, z5.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, z5.a(-2.0f, 75.0f, 0.0f, 0.0f, 13.0f, -1, 48));
        d();
    }

    @Override
    public final void d() {
        int i10 = h6.G6;
        d6 d6Var = this.f13165a;
        this.f13168f.setTextColor(h6.w0(i10, d6Var));
        int i11 = h6.f21398z6;
        this.h.setTextColor(h6.w0(i11, d6Var));
        this.f13169n.setTextColor(h6.w0(i11, d6Var));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f13172w) {
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dp(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, h6.f21114k0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        gh.d dVar;
        w9 w9Var;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f13171s) != null && view == (w9Var = this.f13167c)) {
            int dp = AndroidUtilities.dp(9.0f);
            int left = w9Var.getLeft() - dp;
            int top = w9Var.getTop() - dp;
            int dp2 = (dp * 2) + AndroidUtilities.dp(52.0f);
            RecordingCanvas a2 = dVar.a(dp2, dp2);
            a2.translate(-left, -top);
            a2.drawColor(h6.w0(h6.f20993d6, this.f13165a));
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
