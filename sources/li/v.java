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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.wq;
public final class v extends ma {
    public final int S1;
    public final c20 T1;
    public m41 U1;
    public final FrameLayout V1;
    public final FrameLayout W1;
    public final au X1;
    public final FrameLayout Y1;
    public final org.telegram.ui.Cells.k3 Z1;
    public final fi.d f18929a2;
    public boolean f18930b2;
    public int f18931c2;
    public TL_iv.RichMessage d2;

    public v(int i7, Context context, c20 c20Var, h6 h6Var) {
        super(context, null, true, false, h6Var);
        this.S1 = i7;
        this.T1 = c20Var;
        int i10 = m6.f27834a7;
        w0(i10);
        P(i10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(id.M0(2131754060, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i11 = m6.G6;
        t6.U(textView, i11, h6Var);
        textView.setGravity(19);
        frameLayout.addView(textView, ha.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.C1 = org.telegram.messenger.g0.L(-8.0f);
        ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131231269);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        t6.s(e10, i11, h6Var, PorterDuff.Mode.SRC_IN);
        ka.a(e10);
        e10.setOnClickListener(new View.OnClickListener(this) {
            public final v f18865b;

            {
                this.f18865b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f18865b.dismiss();
                        return;
                    default:
                        v vVar = this.f18865b;
                        org.telegram.ui.Cells.k3 k3Var = vVar.Z1;
                        if (!vVar.f18930b2) {
                            TL_iv.RichMessage richMessage = vVar.d2;
                            if (richMessage != null) {
                                c20 c20Var2 = vVar.T1;
                                if (c20Var2 != null) {
                                    c20Var2.a(richMessage);
                                }
                                vVar.dismiss();
                                return;
                            }
                            String trim = k3Var.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                vVar.f18930b2 = true;
                                vVar.f18929a2.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                vVar.f18931c2 = ConnectionsManager.getInstance(vVar.S1).sendRequest(tL_messages_composeRichMessageWithAI, new bi.j0(vVar, 20));
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
        this.W1 = frameLayout2;
        au auVar = new au(i7, context, h6Var);
        this.X1 = auVar;
        auVar.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        int i12 = m6.f27890d6;
        ShapeDrawable d02 = m6.d0(L, m6.w0(i12, h6Var));
        p6 M = t6.M(i12);
        auVar.setBackground(d02);
        t6.j(auVar, d02, M, null, h6Var);
        frameLayout2.addView(auVar, ha.c(-2.0f, -1));
        frameLayout2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Y1 = frameLayout3;
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, id.M0(2131754058, null), true, false, ((org.telegram.messenger.j0) qp.s1(i7).f24946x7.R.f13557b).f23464c, h6Var);
        this.Z1 = k3Var;
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        ShapeDrawable d03 = m6.d0(org.telegram.messenger.g0.L(20.0f), m6.w0(i12, h6Var));
        p6 M2 = t6.M(i12);
        k3Var.setBackground(d03);
        t6.j(k3Var, d03, M2, null, h6Var);
        i3Var.addTextChangedListener(new u(this));
        frameLayout3.addView(k3Var, ha.c(-2.0f, -1));
        frameLayout3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        fi.d h = org.telegram.messenger.k5.h(24, context, h6Var, true);
        this.f18929a2 = h;
        h.i(id.M0(2131754059, null), false, true);
        h.setOnClickListener(new View.OnClickListener(this) {
            public final v f18865b;

            {
                this.f18865b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f18865b.dismiss();
                        return;
                    default:
                        v vVar = this.f18865b;
                        org.telegram.ui.Cells.k3 k3Var2 = vVar.Z1;
                        if (!vVar.f18930b2) {
                            TL_iv.RichMessage richMessage = vVar.d2;
                            if (richMessage != null) {
                                c20 c20Var2 = vVar.T1;
                                if (c20Var2 != null) {
                                    c20Var2.a(richMessage);
                                }
                                vVar.dismiss();
                                return;
                            }
                            String trim = k3Var2.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                vVar.f18930b2 = true;
                                vVar.f18929a2.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                vVar.f18931c2 = ConnectionsManager.getInstance(vVar.S1).sendRequest(tL_messages_composeRichMessageWithAI, new bi.j0(vVar, 20));
                                org.telegram.messenger.g0.v1(k3Var2.d);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.f28672b.addView(h, ha.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) h.getLayoutParams()).leftMargin += this.f28705t0;
        ((ViewGroup.MarginLayoutParams) h.getLayoutParams()).rightMargin += this.f28705t0;
        v4.k kVar = new v4.k();
        kVar.f57079m = false;
        kVar.C = false;
        kVar.o(wq.h);
        kVar.n(350L);
        this.n1.setItemAnimator(kVar);
        pj0 pj0Var = this.n1;
        int i13 = this.f28705t0;
        pj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(72.0f));
        this.n1.setClipToPadding(false);
        this.U1.O(false);
        d1();
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.S1, 0, true, new hi.u1(this, 17), this.I0);
        this.U1 = m41Var;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return id.M0(2131754060, null);
    }

    public final void d1() {
        TL_iv.RichMessage richMessage = this.d2;
        fi.d dVar = this.f18929a2;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.Z1.d.getText().toString().trim()));
        }
    }

    @Override
    public final void dismiss() {
        if (this.f18931c2 != 0) {
            ConnectionsManager.getInstance(this.S1).cancelRequest(this.f18931c2, true);
            this.f18931c2 = 0;
        }
        org.telegram.messenger.g0.v1(this.Z1.d);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new l2.a0(this, 3), 200L);
    }
}
