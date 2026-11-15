package oi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.na;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.messenger.xt;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
public final class u extends ja {
    public final int T1;
    public final z10 U1;
    public p41 V1;
    public final FrameLayout W1;
    public final FrameLayout X1;
    public final xt Y1;
    public final FrameLayout Z1;
    public final org.telegram.ui.Cells.k3 f22020a2;
    public final hi.d f22021b2;
    public boolean f22022c2;
    public int d2;
    public TL_iv.RichMessage f22023e2;

    public u(int i7, Context context, z10 z10Var, e6 e6Var) {
        super(context, null, true, false, e6Var);
        this.T1 = i7;
        this.U1 = z10Var;
        int i10 = j6.f28792a7;
        w0(i10);
        Q(i10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(hd.M0(2131754060, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i11 = j6.G6;
        q6.U(textView, i11, e6Var);
        textView.setGravity(19);
        frameLayout.addView(textView, c8.ja.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.D1 = org.telegram.messenger.g0.L(-8.0f);
        ImageView e10 = i20.e(context, 2131231269);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        q6.s(e10, i11, e6Var, PorterDuff.Mode.SRC_IN);
        na.a(e10);
        e10.setOnClickListener(new View.OnClickListener(this) {
            public final u f21988b;

            {
                this.f21988b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f21988b.dismiss();
                        return;
                    default:
                        u uVar = this.f21988b;
                        org.telegram.ui.Cells.k3 k3Var = uVar.f22020a2;
                        if (!uVar.f22022c2) {
                            TL_iv.RichMessage richMessage = uVar.f22023e2;
                            if (richMessage != null) {
                                z10 z10Var2 = uVar.U1;
                                if (z10Var2 != null) {
                                    z10Var2.a(richMessage);
                                }
                                uVar.dismiss();
                                return;
                            }
                            String trim = k3Var.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                uVar.f22022c2 = true;
                                uVar.f22021b2.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                uVar.d2 = ConnectionsManager.getInstance(uVar.T1).sendRequest(tL_messages_composeRichMessageWithAI, new ai.e1(uVar, 21));
                                org.telegram.messenger.g0.v1(k3Var.d);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(e10, c8.ja.d(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.X1 = frameLayout2;
        xt xtVar = new xt(i7, context, e6Var);
        this.Y1 = xtVar;
        xtVar.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        int i12 = j6.f28849d6;
        ShapeDrawable d02 = j6.d0(L, j6.w0(i12, e6Var));
        m6 M = q6.M(i12);
        xtVar.setBackground(d02);
        q6.j(xtVar, d02, M, null, e6Var);
        frameLayout2.addView(xtVar, c8.ja.c(-2.0f, -1));
        frameLayout2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z1 = frameLayout3;
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, hd.M0(2131754058, null), true, false, ((org.telegram.messenger.j0) np.s1(i7).f25451y7.R.f15881b).f24498c, e6Var);
        this.f22020a2 = k3Var;
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        ShapeDrawable d03 = j6.d0(org.telegram.messenger.g0.L(20.0f), j6.w0(i12, e6Var));
        m6 M2 = q6.M(i12);
        k3Var.setBackground(d03);
        q6.j(k3Var, d03, M2, null, e6Var);
        i3Var.addTextChangedListener(new t(this));
        frameLayout3.addView(k3Var, c8.ja.c(-2.0f, -1));
        frameLayout3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        hi.d g10 = i20.g(24, context, e6Var, true);
        this.f22021b2 = g10;
        g10.i(hd.M0(2131754059, null), false, true);
        g10.setOnClickListener(new View.OnClickListener(this) {
            public final u f21988b;

            {
                this.f21988b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f21988b.dismiss();
                        return;
                    default:
                        u uVar = this.f21988b;
                        org.telegram.ui.Cells.k3 k3Var2 = uVar.f22020a2;
                        if (!uVar.f22022c2) {
                            TL_iv.RichMessage richMessage = uVar.f22023e2;
                            if (richMessage != null) {
                                z10 z10Var2 = uVar.U1;
                                if (z10Var2 != null) {
                                    z10Var2.a(richMessage);
                                }
                                uVar.dismiss();
                                return;
                            }
                            String trim = k3Var2.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                uVar.f22022c2 = true;
                                uVar.f22021b2.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                uVar.d2 = ConnectionsManager.getInstance(uVar.T1).sendRequest(tL_messages_composeRichMessageWithAI, new ai.e1(uVar, 21));
                                org.telegram.messenger.g0.v1(k3Var2.d);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.f29682b.addView(g10, c8.ja.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) g10.getLayoutParams()).leftMargin += this.f29717u0;
        ((ViewGroup.MarginLayoutParams) g10.getLayoutParams()).rightMargin += this.f29717u0;
        v4.k kVar = new v4.k();
        kVar.f58564m = false;
        kVar.C = false;
        kVar.o(er.h);
        kVar.n(350L);
        this.f35931o1.setItemAnimator(kVar);
        uj0 uj0Var = this.f35931o1;
        int i13 = this.f29717u0;
        uj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(72.0f));
        this.f35931o1.setClipToPadding(false);
        this.V1.O(false);
        d1();
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(uj0Var, getContext(), this.T1, 0, true, new hi.q4(this, 27), this.J0);
        this.V1 = p41Var;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        return hd.M0(2131754060, null);
    }

    public final void d1() {
        TL_iv.RichMessage richMessage = this.f22023e2;
        hi.d dVar = this.f22021b2;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.f22020a2.d.getText().toString().trim()));
        }
    }

    @Override
    public final void dismiss() {
        if (this.d2 != 0) {
            ConnectionsManager.getInstance(this.T1).cancelRequest(this.d2, true);
            this.d2 = 0;
        }
        org.telegram.messenger.g0.v1(this.f22020a2.d);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new kg.j1(this, 22), 200L);
    }
}
