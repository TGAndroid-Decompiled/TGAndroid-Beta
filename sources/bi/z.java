package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.mu;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;
public final class z extends ha {
    public final int P1;
    public final r20 Q1;
    public q51 R1;
    public final FrameLayout S1;
    public final FrameLayout T1;
    public final mu U1;
    public final FrameLayout V1;
    public final org.telegram.ui.Cells.m3 W1;
    public final vh.d X1;
    public boolean Y1;
    public int Z1;
    public TL_iv.RichMessage a2;

    public z(int i10, Context context, r20 r20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, true, false, p6Var);
        this.P1 = i10;
        this.Q1 = r20Var;
        int i11 = org.telegram.ui.ActionBar.t6.f20873a7;
        w0(i11);
        Q(i11);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(dd.L0(2131754060, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        int i12 = org.telegram.ui.ActionBar.t6.G6;
        a7.V(textView, i12, p6Var);
        textView.setGravity(19);
        frameLayout.addView(textView, w7.b6.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.f26738z1 = org.telegram.messenger.i0.L(-8.0f);
        ImageView e = a30.e(context, 2131231270);
        e.setScaleType(ImageView.ScaleType.CENTER);
        a7.t(e, i12, p6Var, PorterDuff.Mode.SRC_IN);
        w7.e6.a(e);
        e.setOnClickListener(new View.OnClickListener(this) {
            public final z f3443b;

            {
                this.f3443b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f3443b.dismiss();
                        return;
                    default:
                        z zVar = this.f3443b;
                        org.telegram.ui.Cells.m3 m3Var = zVar.W1;
                        if (!zVar.Y1) {
                            TL_iv.RichMessage richMessage = zVar.a2;
                            if (richMessage != null) {
                                r20 r20Var2 = zVar.Q1;
                                if (r20Var2 != null) {
                                    r20Var2.a(richMessage);
                                }
                                zVar.dismiss();
                                return;
                            }
                            String trim = m3Var.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                zVar.Y1 = true;
                                zVar.X1.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                zVar.Z1 = ConnectionsManager.getInstance(zVar.P1).sendRequest(tL_messages_composeRichMessageWithAI, new ag.c(zVar, 6));
                                org.telegram.messenger.i0.v1(m3Var.d);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(e, w7.b6.d(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.T1 = frameLayout2;
        mu muVar = new mu(i10, context, p6Var);
        this.U1 = muVar;
        muVar.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(12.0f));
        int L = org.telegram.messenger.i0.L(12.0f);
        int i13 = org.telegram.ui.ActionBar.t6.f20930d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        org.telegram.ui.ActionBar.w6 N = a7.N(i13);
        muVar.setBackground(d02);
        a7.k(muVar, d02, N, null, p6Var);
        frameLayout2.addView(muVar, w7.b6.c(-2.0f, -1));
        frameLayout2.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.V1 = frameLayout3;
        org.telegram.ui.Cells.m3 m3Var = new org.telegram.ui.Cells.m3(context, dd.L0(2131754058, null), true, false, ((org.telegram.messenger.l0) wp.r1(i10).f19300y7.R.f10701a).f16855c, p6Var);
        this.W1 = m3Var;
        org.telegram.ui.Cells.k3 k3Var = m3Var.d;
        k3Var.setImeOptions(6);
        k3Var.setMaxLines(5);
        ShapeDrawable d03 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(20.0f), org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        org.telegram.ui.ActionBar.w6 N2 = a7.N(i13);
        m3Var.setBackground(d03);
        a7.k(m3Var, d03, N2, null, p6Var);
        k3Var.addTextChangedListener(new y(this));
        frameLayout3.addView(m3Var, w7.b6.c(-2.0f, -1));
        frameLayout3.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        vh.d i14 = a30.i(24, context, p6Var, true);
        this.X1 = i14;
        i14.i(dd.L0(2131754059, null), false, true);
        i14.setOnClickListener(new View.OnClickListener(this) {
            public final z f3443b;

            {
                this.f3443b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f3443b.dismiss();
                        return;
                    default:
                        z zVar = this.f3443b;
                        org.telegram.ui.Cells.m3 m3Var2 = zVar.W1;
                        if (!zVar.Y1) {
                            TL_iv.RichMessage richMessage = zVar.a2;
                            if (richMessage != null) {
                                r20 r20Var2 = zVar.Q1;
                                if (r20Var2 != null) {
                                    r20Var2.a(richMessage);
                                }
                                zVar.dismiss();
                                return;
                            }
                            String trim = m3Var2.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                zVar.Y1 = true;
                                zVar.X1.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                zVar.Z1 = ConnectionsManager.getInstance(zVar.P1).sendRequest(tL_messages_composeRichMessageWithAI, new ag.c(zVar, 6));
                                org.telegram.messenger.i0.v1(m3Var2.d);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.f21587b.addView(i14, w7.b6.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) i14.getLayoutParams()).leftMargin += this.f21616t0;
        ((ViewGroup.MarginLayoutParams) i14.getLayoutParams()).rightMargin += this.f21616t0;
        s4.j jVar = new s4.j();
        jVar.f47938m = false;
        jVar.C = false;
        jVar.o(gr.h);
        jVar.n(350L);
        this.f26724k1.setItemAnimator(jVar);
        uk0 uk0Var = this.f26724k1;
        int i15 = this.f21616t0;
        uk0Var.setPadding(i15, 0, i15, org.telegram.messenger.i0.L(72.0f));
        this.f26724k1.setClipToPadding(false);
        this.R1.O(false);
        d1();
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(uk0Var, getContext(), this.P1, 0, true, new ag.a(this, 12), this.I0);
        this.R1 = q51Var;
        return q51Var;
    }

    @Override
    public final CharSequence O0() {
        return dd.L0(2131754060, null);
    }

    public final void d1() {
        TL_iv.RichMessage richMessage = this.a2;
        vh.d dVar = this.X1;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.W1.d.getText().toString().trim()));
        }
    }

    @Override
    public final void dismiss() {
        if (this.Z1 != 0) {
            ConnectionsManager.getInstance(this.P1).cancelRequest(this.Z1, true);
            this.Z1 = 0;
        }
        org.telegram.messenger.i0.v1(this.W1.d);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.i0.h3(new a3.d(this, 19), 200L);
    }
}
