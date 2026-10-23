package ii;

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
import c3.m;
import hi.r0;
import hi.s0;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.sl;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xq;
import w7.z5;
import zf.g0;
public final class h extends FrameLayout implements b6 {
    public static final int H = 0;
    public e E;
    public long F;
    public long G;
    public final g6 f13209a;
    public final int f13210b;
    public final w9 f13211c;
    public final TextView d;
    public final w9 e;
    public final TextView f13212f;
    public final TextView h;
    public final TextView f13213n;
    public final ei.d f13214r;
    public final xq f13215s;
    public final gh.d v;
    public final dh.d f13216w;
    public boolean f13217x;
    public int f13218y;

    public h(Context context, int i10, g6 g6Var) {
        super(context);
        bh.b bVar;
        this.f13218y = r6.f21817b;
        this.f13209a = g6Var;
        this.f13210b = i10;
        if (Build.VERSION.SDK_INT >= 31) {
            gh.d dVar = new gh.d(null);
            this.v = dVar;
            dVar.i(AndroidUtilities.dp(7.0f), g0.a());
            dVar.h = true;
            bVar = new bh.b(dVar);
        } else {
            this.v = null;
            gh.c cVar = new gh.c();
            cVar.a(-16777216);
            bVar = new bh.b(cVar);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        w9 w9Var = new w9(context);
        this.f13211c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(52.0f) / 2);
        addView(w9Var, z5.d(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        xq xqVar = new xq(R.drawable.mini_user_channels_10, 0);
        this.f13215s = xqVar;
        xqVar.setTranslateX(AndroidUtilities.dp(2.0f));
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
        eh.e eVar = new eh.e(g6Var);
        eVar.e = new m(25);
        eVar.d(1627389951, 1358954495);
        eVar.c(603979776, 603979776);
        eVar.b(0, 0);
        eVar.f8669n = 0.0f;
        eVar.f8670r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.43f);
        float dpf22 = AndroidUtilities.dpf2(0.43f);
        eVar.f8668f = dpf2;
        eVar.h = dpf22;
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(7.0f));
        this.f13216w = c10;
        textView.setBackground(c10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.f13212f = textView2;
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
            public final h f13204b;

            {
                this.f13204b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f13204b;
                        e eVar2 = hVar.E;
                        if (eVar2 != null) {
                            long j10 = hVar.G;
                            r0 r0Var = ((s0) eVar2).h;
                            if (r0Var != null) {
                                r0Var.j(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f13204b;
                        e eVar3 = hVar2.E;
                        if (eVar3 != null) {
                            long j11 = hVar2.G;
                            r0 r0Var2 = ((s0) eVar3).h;
                            if (r0Var2 != null) {
                                r0Var2.j(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f13204b;
                        e eVar4 = hVar3.E;
                        if (eVar4 != null) {
                            ((s0) eVar4).g(hVar3.F, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f13204b;
                        e eVar5 = hVar4.E;
                        if (eVar5 != null) {
                            ((s0) eVar5).g(hVar4.F, true);
                            return;
                        }
                        return;
                }
            }
        });
        addView(w9Var2, z5.d(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final h f13204b;

            {
                this.f13204b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f13204b;
                        e eVar2 = hVar.E;
                        if (eVar2 != null) {
                            long j10 = hVar.G;
                            r0 r0Var = ((s0) eVar2).h;
                            if (r0Var != null) {
                                r0Var.j(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f13204b;
                        e eVar3 = hVar2.E;
                        if (eVar3 != null) {
                            long j11 = hVar2.G;
                            r0 r0Var2 = ((s0) eVar3).h;
                            if (r0Var2 != null) {
                                r0Var2.j(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f13204b;
                        e eVar4 = hVar3.E;
                        if (eVar4 != null) {
                            ((s0) eVar4).g(hVar3.F, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f13204b;
                        e eVar5 = hVar4.E;
                        if (eVar5 != null) {
                            ((s0) eVar5).g(hVar4.F, true);
                            return;
                        }
                        return;
                }
            }
        });
        TextView f7 = sl.f(linearLayout, textView3, z5.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.f13213n = f7;
        f7.setTextSize(1, 13.0f);
        int dp = AndroidUtilities.dp(12.0f);
        int i11 = k6.D6;
        ShapeDrawable c02 = k6.c0(dp, k6.o1(0.14f, k6.w0(i11, g6Var)));
        n6 M = r6.M(0.14f, i11);
        f7.setBackground(c02);
        r6.k(f7, c02, M, null, g6Var);
        f7.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.66f));
        f7.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new xq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityPendingRequestOnlyVisibleToMembers));
        f7.setText(spannableStringBuilder);
        f7.setVisibility(8);
        linearLayout.addView(f7, z5.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        ei.d dVar2 = new ei.d(context, g6Var, true);
        this.f13214r = dVar2;
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar2.f();
        dVar2.e();
        int i12 = k6.f21588z6;
        dVar2.setColor(k6.o1(0.14f, k6.w0(i12, g6Var)));
        dVar2.setTextColor(k6.x0(null, k6.G6, false));
        if (dVar2.getBackground() != null) {
            Drawable background = dVar2.getBackground();
            n6 M2 = r6.M(0.14f, i12);
            dVar2.setBackground(background);
            r6.k(dVar2, background, M2, null, g6Var);
        }
        dVar2.i(LocaleController.getString(R.string.Decline), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final h f13204b;

            {
                this.f13204b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f13204b;
                        e eVar2 = hVar.E;
                        if (eVar2 != null) {
                            long j10 = hVar.G;
                            r0 r0Var = ((s0) eVar2).h;
                            if (r0Var != null) {
                                r0Var.j(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f13204b;
                        e eVar3 = hVar2.E;
                        if (eVar3 != null) {
                            long j11 = hVar2.G;
                            r0 r0Var2 = ((s0) eVar3).h;
                            if (r0Var2 != null) {
                                r0Var2.j(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f13204b;
                        e eVar4 = hVar3.E;
                        if (eVar4 != null) {
                            ((s0) eVar4).g(hVar3.F, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f13204b;
                        e eVar5 = hVar4.E;
                        if (eVar5 != null) {
                            ((s0) eVar5).g(hVar4.F, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar2, z5.p(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        ei.d dVar3 = new ei.d(context, g6Var, true);
        dVar3.setUseWrapContent(true);
        dVar3.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar3.f();
        dVar3.i(LocaleController.getString(R.string.Add), false, true);
        dVar3.setOnClickListener(new View.OnClickListener(this) {
            public final h f13204b;

            {
                this.f13204b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f13204b;
                        e eVar2 = hVar.E;
                        if (eVar2 != null) {
                            long j10 = hVar.G;
                            r0 r0Var = ((s0) eVar2).h;
                            if (r0Var != null) {
                                r0Var.j(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f13204b;
                        e eVar3 = hVar2.E;
                        if (eVar3 != null) {
                            long j11 = hVar2.G;
                            r0 r0Var2 = ((s0) eVar3).h;
                            if (r0Var2 != null) {
                                r0Var2.j(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f13204b;
                        e eVar4 = hVar3.E;
                        if (eVar4 != null) {
                            ((s0) eVar4).g(hVar3.F, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f13204b;
                        e eVar5 = hVar4.E;
                        if (eVar5 != null) {
                            ((s0) eVar5).g(hVar4.F, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar3, z5.p(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, z5.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, z5.d(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.G6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10 = this.f13218y;
        int i11 = r6.f21817b;
        if (i10 != i11) {
            this.f13218y = i11;
            try {
                ei.d dVar = this.f13214r;
                if (dVar != null) {
                    dVar.setTextColor(k6.x0(null, k6.G6, false));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (this.f13217x) {
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dp(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, k6.f21304k0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        gh.d dVar;
        w9 w9Var;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.v) != null && view == (w9Var = this.f13211c)) {
            int dp = AndroidUtilities.dp(9.0f);
            int left = w9Var.getLeft() - dp;
            int top = w9Var.getTop() - dp;
            int dp2 = (dp * 2) + AndroidUtilities.dp(52.0f);
            RecordingCanvas a2 = dVar.a(dp2, dp2);
            a2.translate(-left, -top);
            a2.drawColor(k6.w0(k6.f21183d6, this.f13209a));
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

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int left = this.d.getLeft();
        this.f13216w.t(AndroidUtilities.dp(9.0f) + left, AndroidUtilities.dp(48.0f));
    }

    @Override
    public final void updateColors() {
        int i10 = k6.G6;
        g6 g6Var = this.f13209a;
        this.f13212f.setTextColor(k6.w0(i10, g6Var));
        int i11 = k6.f21588z6;
        this.h.setTextColor(k6.w0(i11, g6Var));
        this.f13213n.setTextColor(k6.w0(i11, g6Var));
    }
}
