package li;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ha;
import c8.ka;
import org.telegram.messenger.au;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.xq;
public final class v extends na {
    public final int P1;
    public final c20 Q1;
    public m41 R1;
    public final FrameLayout S1;
    public final FrameLayout T1;
    public final au U1;
    public final FrameLayout V1;
    public final org.telegram.ui.Cells.k3 W1;
    public final fi.d X1;
    public boolean Y1;
    public int Z1;
    public TL_iv.RichMessage f18926a2;

    public v(int i7, Context context, c20 c20Var, g6 g6Var) {
        super(context, null, true, false, g6Var);
        this.P1 = i7;
        this.Q1 = c20Var;
        int i10 = l6.f27809a7;
        w0(i10);
        P(i10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(id.M0(2131754060, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i11 = l6.G6;
        s6.U(textView, i11, g6Var);
        textView.setGravity(19);
        frameLayout.addView(textView, ha.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.f36316z1 = org.telegram.messenger.g0.L(-8.0f);
        ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131231269);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        s6.s(e10, i11, g6Var, PorterDuff.Mode.SRC_IN);
        ka.a(e10);
        e10.setOnClickListener(new View.OnClickListener(this) {
            public final v f18862b;

            {
                this.f18862b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f18862b.dismiss();
                        return;
                    default:
                        v vVar = this.f18862b;
                        org.telegram.ui.Cells.k3 k3Var = vVar.W1;
                        if (!vVar.Y1) {
                            TL_iv.RichMessage richMessage = vVar.f18926a2;
                            if (richMessage != null) {
                                c20 c20Var2 = vVar.Q1;
                                if (c20Var2 != null) {
                                    c20Var2.a(richMessage);
                                }
                                vVar.dismiss();
                                return;
                            }
                            String trim = k3Var.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                vVar.Y1 = true;
                                vVar.X1.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                vVar.Z1 = ConnectionsManager.getInstance(vVar.P1).sendRequest(tL_messages_composeRichMessageWithAI, new bi.j0(vVar, 20));
                                org.telegram.messenger.g0.v1(k3Var.d);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(e10, ha.d(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.T1 = frameLayout2;
        au auVar = new au(i7, context, g6Var);
        this.U1 = auVar;
        auVar.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        int i12 = l6.f27865d6;
        ShapeDrawable d02 = l6.d0(L, l6.w0(i12, g6Var));
        o6 M = s6.M(i12);
        auVar.setBackground(d02);
        s6.j(auVar, d02, M, null, g6Var);
        frameLayout2.addView(auVar, ha.c(-2.0f, -1));
        frameLayout2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.V1 = frameLayout3;
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, id.M0(2131754058, null), true, false, ((org.telegram.messenger.j0) qp.s1(i7).f24942x7.R.f13555b).f23460c, g6Var);
        this.W1 = k3Var;
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        ShapeDrawable d03 = l6.d0(org.telegram.messenger.g0.L(20.0f), l6.w0(i12, g6Var));
        o6 M2 = s6.M(i12);
        k3Var.setBackground(d03);
        s6.j(k3Var, d03, M2, null, g6Var);
        i3Var.addTextChangedListener(new u(this));
        frameLayout3.addView(k3Var, ha.c(-2.0f, -1));
        frameLayout3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        fi.d h = org.telegram.messenger.k5.h(24, context, g6Var, true);
        this.X1 = h;
        h.i(id.M0(2131754059, null), false, true);
        h.setOnClickListener(new View.OnClickListener(this) {
            public final v f18862b;

            {
                this.f18862b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f18862b.dismiss();
                        return;
                    default:
                        v vVar = this.f18862b;
                        org.telegram.ui.Cells.k3 k3Var2 = vVar.W1;
                        if (!vVar.Y1) {
                            TL_iv.RichMessage richMessage = vVar.f18926a2;
                            if (richMessage != null) {
                                c20 c20Var2 = vVar.Q1;
                                if (c20Var2 != null) {
                                    c20Var2.a(richMessage);
                                }
                                vVar.dismiss();
                                return;
                            }
                            String trim = k3Var2.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                vVar.Y1 = true;
                                vVar.X1.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                vVar.Z1 = ConnectionsManager.getInstance(vVar.P1).sendRequest(tL_messages_composeRichMessageWithAI, new bi.j0(vVar, 20));
                                org.telegram.messenger.g0.v1(k3Var2.d);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.f28624b.addView(h, ha.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) h.getLayoutParams()).leftMargin += this.f28654t0;
        ((ViewGroup.MarginLayoutParams) h.getLayoutParams()).rightMargin += this.f28654t0;
        v4.k kVar = new v4.k();
        kVar.f57083m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.f36303k1.setItemAnimator(kVar);
        qj0 qj0Var = this.f36303k1;
        int i13 = this.f28654t0;
        qj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(72.0f));
        this.f36303k1.setClipToPadding(false);
        this.R1.O(false);
        d1();
    }

    @Override
    public final pj0 L0(qj0 qj0Var) {
        m41 m41Var = new m41(qj0Var, getContext(), this.P1, 0, true, new hi.u1(this, 17), this.I0);
        this.R1 = m41Var;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return id.M0(2131754060, null);
    }

    public final void d1() {
        TL_iv.RichMessage richMessage = this.f18926a2;
        fi.d dVar = this.X1;
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
        org.telegram.messenger.g0.v1(this.W1.d);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new l2.a0(this, 3), 200L);
    }
}
