package ji;

import ag.t0;
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
import ii.q0;
import ii.r0;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zq;
public final class h extends FrameLayout implements p6 {
    public static final int H = 0;
    public e E;
    public long F;
    public long G;
    public final u6 f15984a;
    public final int f15985b;
    public final y9 f15986c;
    public final TextView d;
    public final y9 e;
    public final TextView f15987f;
    public final TextView h;
    public final TextView f15988n;
    public final fi.d f15989r;
    public final zq f15990s;
    public final hh.d v;
    public final eh.d f15991w;
    public boolean f15992x;
    public int f15993y;

    public h(Context context, int i10, u6 u6Var) {
        super(context);
        ch.b bVar;
        this.f15993y = f7.f22628b;
        this.f15984a = u6Var;
        this.f15985b = i10;
        if (Build.VERSION.SDK_INT >= 31) {
            hh.d dVar = new hh.d(null);
            this.v = dVar;
            dVar.e(AndroidUtilities.dp(7.0f), t0.a());
            dVar.f12842n = true;
            bVar = new ch.b(dVar);
        } else {
            this.v = null;
            hh.c cVar = new hh.c();
            cVar.a(-16777216);
            bVar = new ch.b(cVar);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        y9 y9Var = new y9(context);
        this.f15986c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(52.0f) / 2);
        addView(y9Var, gb1.h(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        zq zqVar = new zq(R.drawable.mini_user_channels_10, 0);
        this.f15990s = zqVar;
        zqVar.setTranslateX(AndroidUtilities.dp(2.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(5.0f), 0);
        frameLayout.addView(textView, gb1.i(-2, -1, 81));
        addView(frameLayout, gb1.w(52, 48, 11, 48, 0, 14.33f, 0));
        eh.d c10 = bVar.c(textView, null, false);
        fh.e eVar = new fh.e(u6Var);
        eVar.e = new gh.a(3);
        eVar.d(1627389951, 1358954495);
        eVar.c(603979776, 603979776);
        eVar.b(0, 0);
        eVar.f10485n = 0.0f;
        eVar.f10486r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.43f);
        float dpf22 = AndroidUtilities.dpf2(0.43f);
        eVar.f10484f = dpf2;
        eVar.h = dpf22;
        c10.v(eVar);
        c10.x(AndroidUtilities.dp(7.0f));
        this.f15991w = c10;
        textView.setBackground(c10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.f15987f = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 16.0f);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, gb1.o(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        y9 y9Var2 = new y9(context);
        this.e = y9Var2;
        y9Var2.setRoundRadius(AndroidUtilities.dp(8.0f));
        y9Var2.setOnClickListener(new View.OnClickListener(this) {
            public final h f15979b;

            {
                this.f15979b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f15979b;
                        e eVar2 = hVar.E;
                        if (eVar2 != null) {
                            long j10 = hVar.G;
                            q0 q0Var = ((r0) eVar2).h;
                            if (q0Var != null) {
                                q0Var.a(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f15979b;
                        e eVar3 = hVar2.E;
                        if (eVar3 != null) {
                            long j11 = hVar2.G;
                            q0 q0Var2 = ((r0) eVar3).h;
                            if (q0Var2 != null) {
                                q0Var2.a(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f15979b;
                        e eVar4 = hVar3.E;
                        if (eVar4 != null) {
                            ((r0) eVar4).g(hVar3.F, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f15979b;
                        e eVar5 = hVar4.E;
                        if (eVar5 != null) {
                            ((r0) eVar5).g(hVar4.F, true);
                            return;
                        }
                        return;
                }
            }
        });
        addView(y9Var2, gb1.h(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final h f15979b;

            {
                this.f15979b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f15979b;
                        e eVar2 = hVar.E;
                        if (eVar2 != null) {
                            long j10 = hVar.G;
                            q0 q0Var = ((r0) eVar2).h;
                            if (q0Var != null) {
                                q0Var.a(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f15979b;
                        e eVar3 = hVar2.E;
                        if (eVar3 != null) {
                            long j11 = hVar2.G;
                            q0 q0Var2 = ((r0) eVar3).h;
                            if (q0Var2 != null) {
                                q0Var2.a(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f15979b;
                        e eVar4 = hVar3.E;
                        if (eVar4 != null) {
                            ((r0) eVar4).g(hVar3.F, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f15979b;
                        e eVar5 = hVar4.E;
                        if (eVar5 != null) {
                            ((r0) eVar5).g(hVar4.F, true);
                            return;
                        }
                        return;
                }
            }
        });
        TextView e = vh.e(linearLayout, textView3, gb1.o(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.f15988n = e;
        e.setTextSize(1, 13.0f);
        int dp = AndroidUtilities.dp(12.0f);
        int i11 = y6.D6;
        ShapeDrawable c02 = y6.c0(dp, y6.o1(0.14f, y6.w0(i11, u6Var)));
        b7 L = f7.L(0.14f, i11);
        e.setBackground(c02);
        f7.k(e, c02, L, null, u6Var);
        e.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.66f));
        e.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new zq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityPendingRequestOnlyVisibleToMembers));
        e.setText(spannableStringBuilder);
        e.setVisibility(8);
        linearLayout.addView(e, gb1.o(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        fi.d dVar2 = new fi.d(context, u6Var, true);
        this.f15989r = dVar2;
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar2.f();
        dVar2.e();
        int i12 = y6.f23767z6;
        dVar2.setColor(y6.o1(0.14f, y6.w0(i12, u6Var)));
        dVar2.setTextColor(y6.x0(null, y6.G6, false));
        if (dVar2.getBackground() != null) {
            Drawable background = dVar2.getBackground();
            b7 L2 = f7.L(0.14f, i12);
            dVar2.setBackground(background);
            f7.k(dVar2, background, L2, null, u6Var);
        }
        dVar2.i(LocaleController.getString(R.string.Decline), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final h f15979b;

            {
                this.f15979b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f15979b;
                        e eVar2 = hVar.E;
                        if (eVar2 != null) {
                            long j10 = hVar.G;
                            q0 q0Var = ((r0) eVar2).h;
                            if (q0Var != null) {
                                q0Var.a(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f15979b;
                        e eVar3 = hVar2.E;
                        if (eVar3 != null) {
                            long j11 = hVar2.G;
                            q0 q0Var2 = ((r0) eVar3).h;
                            if (q0Var2 != null) {
                                q0Var2.a(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f15979b;
                        e eVar4 = hVar3.E;
                        if (eVar4 != null) {
                            ((r0) eVar4).g(hVar3.F, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f15979b;
                        e eVar5 = hVar4.E;
                        if (eVar5 != null) {
                            ((r0) eVar5).g(hVar4.F, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar2, gb1.t(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        fi.d dVar3 = new fi.d(context, u6Var, true);
        dVar3.setUseWrapContent(true);
        dVar3.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar3.f();
        dVar3.i(LocaleController.getString(R.string.Add), false, true);
        dVar3.setOnClickListener(new View.OnClickListener(this) {
            public final h f15979b;

            {
                this.f15979b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f15979b;
                        e eVar2 = hVar.E;
                        if (eVar2 != null) {
                            long j10 = hVar.G;
                            q0 q0Var = ((r0) eVar2).h;
                            if (q0Var != null) {
                                q0Var.a(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f15979b;
                        e eVar3 = hVar2.E;
                        if (eVar3 != null) {
                            long j11 = hVar2.G;
                            q0 q0Var2 = ((r0) eVar3).h;
                            if (q0Var2 != null) {
                                q0Var2.a(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f15979b;
                        e eVar4 = hVar3.E;
                        if (eVar4 != null) {
                            ((r0) eVar4).g(hVar3.F, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f15979b;
                        e eVar5 = hVar4.E;
                        if (eVar5 != null) {
                            ((r0) eVar5).g(hVar4.F, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar3, gb1.t(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, gb1.x(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, gb1.h(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.G6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10 = this.f15993y;
        int i11 = f7.f22628b;
        if (i10 != i11) {
            this.f15993y = i11;
            try {
                fi.d dVar = this.f15989r;
                if (dVar != null) {
                    dVar.setTextColor(y6.x0(null, y6.G6, false));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (this.f15992x) {
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dp(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, y6.f23478k0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        hh.d dVar;
        y9 y9Var;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.v) != null && view == (y9Var = this.f15986c)) {
            int dp = AndroidUtilities.dp(9.0f);
            int left = y9Var.getLeft() - dp;
            int top = y9Var.getTop() - dp;
            int dp2 = (dp * 2) + AndroidUtilities.dp(52.0f);
            RecordingCanvas a2 = dVar.a(dp2, dp2);
            a2.translate(-left, -top);
            a2.drawColor(y6.w0(y6.f23356d6, this.f15984a));
            a2.save();
            float f7 = dp2 / 2.0f;
            a2.scale(1.125f, 1.125f, f7, f7);
            super.drawChild(a2, view, j10);
            a2.restore();
            a2.drawColor(536870912);
            dVar.b();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int left = this.d.getLeft();
        this.f15991w.i(AndroidUtilities.dp(9.0f) + left, AndroidUtilities.dp(48.0f));
    }

    @Override
    public final void updateColors() {
        int i10 = y6.G6;
        u6 u6Var = this.f15984a;
        this.f15987f.setTextColor(y6.w0(i10, u6Var));
        int i11 = y6.f23767z6;
        this.h.setTextColor(y6.w0(i11, u6Var));
        this.f15988n.setTextColor(y6.w0(i11, u6Var));
    }
}
