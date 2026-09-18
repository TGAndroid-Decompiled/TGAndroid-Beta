package gi;

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
import com.google.android.gms.internal.vision.e2;
import fi.s0;
import fi.t0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.w9;
import w7.y5;
import yf.g0;
public final class h extends FrameLayout implements z5 {
    public static final int F = 0;
    public long E;
    public final e6 f10030a;
    public final int f10031b;
    public final w9 f10032c;
    public final TextView d;
    public final w9 e;
    public final TextView f10033f;
    public final TextView h;
    public final TextView f10034n;
    public final oq f10035r;
    public final fh.d f10036s;
    public final ch.d v;
    public boolean f10037w;
    public e f10038x;
    public long f10039y;

    public h(Context context, int i10, e6 e6Var) {
        super(context);
        ah.c cVar;
        this.f10030a = e6Var;
        this.f10031b = i10;
        if (Build.VERSION.SDK_INT >= 31) {
            fh.d dVar = new fh.d(null);
            this.f10036s = dVar;
            dVar.i(AndroidUtilities.dp(7.0f), g0.a());
            dVar.h = true;
            cVar = new ah.c(dVar);
        } else {
            this.f10036s = null;
            fh.c cVar2 = new fh.c();
            cVar2.a(-16777216);
            cVar = new ah.c(cVar2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        w9 w9Var = new w9(context);
        this.f10032c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(52.0f) / 2);
        addView(w9Var, y5.d(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        oq oqVar = new oq(R.drawable.mini_user_channels_10, 0);
        this.f10035r = oqVar;
        oqVar.setTranslateX(AndroidUtilities.dp(2.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(5.0f), 0);
        frameLayout.addView(textView, y5.e(-2, -1, 81));
        addView(frameLayout, y5.s(52, 48, 11, 48, 0, 14.33f, 0));
        ch.d c10 = cVar.c(textView, null, false);
        dh.e eVar = new dh.e(e6Var);
        eVar.e = new d2.c(8);
        eVar.f(1627389951, 1358954495);
        eVar.e(603979776, 603979776);
        eVar.d(0, 0);
        eVar.f7742n = 0.0f;
        eVar.f7743r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.43f);
        float dpf22 = AndroidUtilities.dpf2(0.43f);
        eVar.f7741f = dpf2;
        eVar.h = dpf22;
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(7.0f));
        this.v = c10;
        textView.setBackground(c10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.f10033f = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 16.0f);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, y5.k(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        w9 w9Var2 = new w9(context);
        this.e = w9Var2;
        w9Var2.setRoundRadius(AndroidUtilities.dp(8.0f));
        w9Var2.setOnClickListener(new View.OnClickListener(this) {
            public final h f10025b;

            {
                this.f10025b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f10025b;
                        e eVar2 = hVar.f10038x;
                        if (eVar2 != null) {
                            long j3 = hVar.E;
                            s0 s0Var = ((t0) eVar2).h;
                            if (s0Var != null) {
                                s0Var.e(j3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f10025b;
                        e eVar3 = hVar2.f10038x;
                        if (eVar3 != null) {
                            long j10 = hVar2.E;
                            s0 s0Var2 = ((t0) eVar3).h;
                            if (s0Var2 != null) {
                                s0Var2.e(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f10025b;
                        e eVar4 = hVar3.f10038x;
                        if (eVar4 != null) {
                            ((t0) eVar4).g(hVar3.f10039y, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f10025b;
                        e eVar5 = hVar4.f10038x;
                        if (eVar5 != null) {
                            ((t0) eVar5).g(hVar4.f10039y, true);
                            return;
                        }
                        return;
                }
            }
        });
        addView(w9Var2, y5.d(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final h f10025b;

            {
                this.f10025b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f10025b;
                        e eVar2 = hVar.f10038x;
                        if (eVar2 != null) {
                            long j3 = hVar.E;
                            s0 s0Var = ((t0) eVar2).h;
                            if (s0Var != null) {
                                s0Var.e(j3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f10025b;
                        e eVar3 = hVar2.f10038x;
                        if (eVar3 != null) {
                            long j10 = hVar2.E;
                            s0 s0Var2 = ((t0) eVar3).h;
                            if (s0Var2 != null) {
                                s0Var2.e(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f10025b;
                        e eVar4 = hVar3.f10038x;
                        if (eVar4 != null) {
                            ((t0) eVar4).g(hVar3.f10039y, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f10025b;
                        e eVar5 = hVar4.f10038x;
                        if (eVar5 != null) {
                            ((t0) eVar5).g(hVar4.f10039y, true);
                            return;
                        }
                        return;
                }
            }
        });
        TextView h = e2.h(linearLayout, textView3, y5.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.f10034n = h;
        h.setTextSize(1, 13.0f);
        h.setBackground(j6.b0(AndroidUtilities.dp(12.0f), j6.l1(0.14f, j6.v0(j6.D6, e6Var))));
        h.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.66f));
        h.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new oq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityPendingRequestOnlyVisibleToMembers));
        h.setText(spannableStringBuilder);
        h.setVisibility(8);
        linearLayout.addView(h, y5.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        ci.d dVar2 = new ci.d(context, e6Var, true);
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar2.e();
        dVar2.d();
        dVar2.setColor(j6.l1(0.14f, j6.v0(j6.f19464z6, e6Var)));
        dVar2.setTextColor(j6.w0(null, j6.G6, false));
        dVar2.g(LocaleController.getString(R.string.Decline), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final h f10025b;

            {
                this.f10025b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f10025b;
                        e eVar2 = hVar.f10038x;
                        if (eVar2 != null) {
                            long j3 = hVar.E;
                            s0 s0Var = ((t0) eVar2).h;
                            if (s0Var != null) {
                                s0Var.e(j3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f10025b;
                        e eVar3 = hVar2.f10038x;
                        if (eVar3 != null) {
                            long j10 = hVar2.E;
                            s0 s0Var2 = ((t0) eVar3).h;
                            if (s0Var2 != null) {
                                s0Var2.e(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f10025b;
                        e eVar4 = hVar3.f10038x;
                        if (eVar4 != null) {
                            ((t0) eVar4).g(hVar3.f10039y, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f10025b;
                        e eVar5 = hVar4.f10038x;
                        if (eVar5 != null) {
                            ((t0) eVar5).g(hVar4.f10039y, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar2, y5.p(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        ci.d dVar3 = new ci.d(context, e6Var, true);
        dVar3.setUseWrapContent(true);
        dVar3.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar3.e();
        dVar3.g(LocaleController.getString(R.string.Add), false, true);
        dVar3.setOnClickListener(new View.OnClickListener(this) {
            public final h f10025b;

            {
                this.f10025b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f10025b;
                        e eVar2 = hVar.f10038x;
                        if (eVar2 != null) {
                            long j3 = hVar.E;
                            s0 s0Var = ((t0) eVar2).h;
                            if (s0Var != null) {
                                s0Var.e(j3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f10025b;
                        e eVar3 = hVar2.f10038x;
                        if (eVar3 != null) {
                            long j10 = hVar2.E;
                            s0 s0Var2 = ((t0) eVar3).h;
                            if (s0Var2 != null) {
                                s0Var2.e(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f10025b;
                        e eVar4 = hVar3.f10038x;
                        if (eVar4 != null) {
                            ((t0) eVar4).g(hVar3.f10039y, false);
                            return;
                        }
                        return;
                    default:
                        h hVar4 = this.f10025b;
                        e eVar5 = hVar4.f10038x;
                        if (eVar5 != null) {
                            ((t0) eVar5).g(hVar4.f10039y, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar3, y5.p(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, y5.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, y5.d(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f10037w) {
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dp(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, j6.f19184k0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        fh.d dVar;
        w9 w9Var;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f10036s) != null && view == (w9Var = this.f10032c)) {
            int dp = AndroidUtilities.dp(9.0f);
            int left = w9Var.getLeft() - dp;
            int top = w9Var.getTop() - dp;
            int dp2 = (dp * 2) + AndroidUtilities.dp(52.0f);
            RecordingCanvas a2 = dVar.a(dp2, dp2);
            a2.translate(-left, -top);
            a2.drawColor(j6.v0(j6.f19062d6, this.f10030a));
            a2.save();
            float f7 = dp2 / 2.0f;
            a2.scale(1.125f, 1.125f, f7, f7);
            super.drawChild(a2, view, j3);
            a2.restore();
            a2.drawColor(536870912);
            dVar.c();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        int i10 = j6.G6;
        e6 e6Var = this.f10030a;
        this.f10033f.setTextColor(j6.v0(i10, e6Var));
        int i11 = j6.f19464z6;
        this.h.setTextColor(j6.v0(i11, e6Var));
        this.f10034n.setTextColor(j6.v0(i11, e6Var));
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
