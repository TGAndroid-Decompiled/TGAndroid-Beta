package oh;

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
import ff.n0;
import g7.e6;
import j3.r0;
import nh.p0;
import nh.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.o9;
public final class g extends FrameLayout implements w5 {
    public static final int B = 0;
    public long A;
    public final b6 f19590a;
    public final int f19591b;
    public final o9 f19592c;
    public final TextView d;
    public final o9 f19593e;
    public final TextView f19594f;
    public final TextView h;
    public final TextView f19595n;
    public final eq f19596r;
    public final ng.d f19597s;
    public final kg.d v;
    public boolean f19598w;
    public d f19599x;
    public long f19600y;

    public g(Context context, int i9, b6 b6Var) {
        super(context);
        ig.a aVar;
        this.f19590a = b6Var;
        this.f19591b = i9;
        if (Build.VERSION.SDK_INT >= 31) {
            ng.d dVar = new ng.d(null);
            this.f19597s = dVar;
            dVar.g(AndroidUtilities.dp(7.0f), n0.a());
            dVar.h = true;
            aVar = new ig.a(dVar);
        } else {
            this.f19597s = null;
            ng.c cVar = new ng.c();
            cVar.a(-16777216);
            aVar = new ig.a(cVar);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        o9 o9Var = new o9(context);
        this.f19592c = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(52.0f) / 2);
        addView(o9Var, e6.d(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        eq eqVar = new eq(R.drawable.mini_user_channels_10, 0);
        this.f19596r = eqVar;
        eqVar.setTranslateX(AndroidUtilities.dp(2.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(5.0f), 0);
        frameLayout.addView(textView, e6.e(-2, -1, 81));
        addView(frameLayout, e6.s(52, 48, 11, 48, 0, 14.33f, 0));
        kg.d c10 = aVar.c(textView, null, false);
        lg.d dVar2 = new lg.d(b6Var);
        dVar2.f16866e = new i3.i(28);
        dVar2.d(1627389951, 1358954495);
        dVar2.c(603979776, 603979776);
        dVar2.b(0, 0);
        dVar2.f16868n = 0.0f;
        dVar2.f16869r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.43f);
        float dpf22 = AndroidUtilities.dpf2(0.43f);
        dVar2.f16867f = dpf2;
        dVar2.h = dpf22;
        c10.n(dVar2);
        c10.p(AndroidUtilities.dp(7.0f));
        this.v = c10;
        textView.setBackground(c10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.f19594f = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 16.0f);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, e6.k(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        o9 o9Var2 = new o9(context);
        this.f19593e = o9Var2;
        o9Var2.setRoundRadius(AndroidUtilities.dp(8.0f));
        o9Var2.setOnClickListener(new View.OnClickListener(this) {
            public final g f19585b;

            {
                this.f19585b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g gVar = this.f19585b;
                        d dVar3 = gVar.f19599x;
                        if (dVar3 != null) {
                            long j10 = gVar.A;
                            p0 p0Var = ((q0) dVar3).h;
                            if (p0Var != null) {
                                p0Var.a(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        g gVar2 = this.f19585b;
                        d dVar4 = gVar2.f19599x;
                        if (dVar4 != null) {
                            long j11 = gVar2.A;
                            p0 p0Var2 = ((q0) dVar4).h;
                            if (p0Var2 != null) {
                                p0Var2.a(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        g gVar3 = this.f19585b;
                        d dVar5 = gVar3.f19599x;
                        if (dVar5 != null) {
                            ((q0) dVar5).g(gVar3.f19600y, false);
                            return;
                        }
                        return;
                    default:
                        g gVar4 = this.f19585b;
                        d dVar6 = gVar4.f19599x;
                        if (dVar6 != null) {
                            ((q0) dVar6).g(gVar4.f19600y, true);
                            return;
                        }
                        return;
                }
            }
        });
        addView(o9Var2, e6.d(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final g f19585b;

            {
                this.f19585b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g gVar = this.f19585b;
                        d dVar3 = gVar.f19599x;
                        if (dVar3 != null) {
                            long j10 = gVar.A;
                            p0 p0Var = ((q0) dVar3).h;
                            if (p0Var != null) {
                                p0Var.a(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        g gVar2 = this.f19585b;
                        d dVar4 = gVar2.f19599x;
                        if (dVar4 != null) {
                            long j11 = gVar2.A;
                            p0 p0Var2 = ((q0) dVar4).h;
                            if (p0Var2 != null) {
                                p0Var2.a(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        g gVar3 = this.f19585b;
                        d dVar5 = gVar3.f19599x;
                        if (dVar5 != null) {
                            ((q0) dVar5).g(gVar3.f19600y, false);
                            return;
                        }
                        return;
                    default:
                        g gVar4 = this.f19585b;
                        d dVar6 = gVar4.f19599x;
                        if (dVar6 != null) {
                            ((q0) dVar6).g(gVar4.f19600y, true);
                            return;
                        }
                        return;
                }
            }
        });
        TextView h = r0.h(linearLayout, textView3, e6.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.f19595n = h;
        h.setTextSize(1, 13.0f);
        h.setBackground(f6.b0(AndroidUtilities.dp(12.0f), f6.l1(0.14f, f6.v0(f6.D6, b6Var))));
        h.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.66f));
        h.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new eq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityPendingRequestOnlyVisibleToMembers));
        h.setText(spannableStringBuilder);
        h.setVisibility(8);
        linearLayout.addView(h, e6.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        kh.d dVar3 = new kh.d(context, b6Var, true);
        dVar3.setUseWrapContent(true);
        dVar3.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar3.e();
        dVar3.d();
        dVar3.setColor(f6.l1(0.14f, f6.v0(f6.f23386z6, b6Var)));
        dVar3.setTextColor(f6.w0(null, f6.G6, false));
        dVar3.g(LocaleController.getString(R.string.Decline), false, true);
        dVar3.setOnClickListener(new View.OnClickListener(this) {
            public final g f19585b;

            {
                this.f19585b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g gVar = this.f19585b;
                        d dVar32 = gVar.f19599x;
                        if (dVar32 != null) {
                            long j10 = gVar.A;
                            p0 p0Var = ((q0) dVar32).h;
                            if (p0Var != null) {
                                p0Var.a(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        g gVar2 = this.f19585b;
                        d dVar4 = gVar2.f19599x;
                        if (dVar4 != null) {
                            long j11 = gVar2.A;
                            p0 p0Var2 = ((q0) dVar4).h;
                            if (p0Var2 != null) {
                                p0Var2.a(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        g gVar3 = this.f19585b;
                        d dVar5 = gVar3.f19599x;
                        if (dVar5 != null) {
                            ((q0) dVar5).g(gVar3.f19600y, false);
                            return;
                        }
                        return;
                    default:
                        g gVar4 = this.f19585b;
                        d dVar6 = gVar4.f19599x;
                        if (dVar6 != null) {
                            ((q0) dVar6).g(gVar4.f19600y, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar3, e6.p(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        kh.d dVar4 = new kh.d(context, b6Var, true);
        dVar4.setUseWrapContent(true);
        dVar4.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar4.e();
        dVar4.g(LocaleController.getString(R.string.Add), false, true);
        dVar4.setOnClickListener(new View.OnClickListener(this) {
            public final g f19585b;

            {
                this.f19585b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g gVar = this.f19585b;
                        d dVar32 = gVar.f19599x;
                        if (dVar32 != null) {
                            long j10 = gVar.A;
                            p0 p0Var = ((q0) dVar32).h;
                            if (p0Var != null) {
                                p0Var.a(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        g gVar2 = this.f19585b;
                        d dVar42 = gVar2.f19599x;
                        if (dVar42 != null) {
                            long j11 = gVar2.A;
                            p0 p0Var2 = ((q0) dVar42).h;
                            if (p0Var2 != null) {
                                p0Var2.a(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        g gVar3 = this.f19585b;
                        d dVar5 = gVar3.f19599x;
                        if (dVar5 != null) {
                            ((q0) dVar5).g(gVar3.f19600y, false);
                            return;
                        }
                        return;
                    default:
                        g gVar4 = this.f19585b;
                        d dVar6 = gVar4.f19599x;
                        if (dVar6 != null) {
                            ((q0) dVar6).g(gVar4.f19600y, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar4, e6.p(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, e6.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, e6.d(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        d();
    }

    @Override
    public final void d() {
        int i9 = f6.G6;
        b6 b6Var = this.f19590a;
        this.f19594f.setTextColor(f6.v0(i9, b6Var));
        int i10 = f6.f23386z6;
        this.h.setTextColor(f6.v0(i10, b6Var));
        this.f19595n.setTextColor(f6.v0(i10, b6Var));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f19598w) {
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dp(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, f6.f23121k0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ng.d dVar;
        o9 o9Var;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f19597s) != null && view == (o9Var = this.f19592c)) {
            int dp = AndroidUtilities.dp(9.0f);
            int left = o9Var.getLeft() - dp;
            int top = o9Var.getTop() - dp;
            int dp2 = (dp * 2) + AndroidUtilities.dp(52.0f);
            RecordingCanvas a2 = dVar.a(dp2, dp2);
            a2.translate(-left, -top);
            a2.drawColor(f6.v0(f6.f23001d6, this.f19590a));
            a2.save();
            float f10 = dp2 / 2.0f;
            a2.scale(1.125f, 1.125f, f10, f10);
            super.drawChild(a2, view, j10);
            a2.restore();
            a2.drawColor(536870912);
            dVar.b();
        }
        return super.drawChild(canvas, view, j10);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        int left = this.d.getLeft();
        this.v.s(AndroidUtilities.dp(9.0f) + left, AndroidUtilities.dp(48.0f));
    }
}
