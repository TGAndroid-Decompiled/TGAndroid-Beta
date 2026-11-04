package mi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.st;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
public final class v extends ma {
    public final int Q1;
    public final u10 R1;
    public f41 S1;
    public final FrameLayout T1;
    public final FrameLayout U1;
    public final st V1;
    public final FrameLayout W1;
    public final org.telegram.ui.Cells.k3 X1;
    public final gi.d Y1;
    public boolean Z1;
    public int f19974a2;
    public TL_iv.RichMessage f19975b2;

    public v(int i3, Context context, u10 u10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, true, false, e6Var);
        this.Q1 = i3;
        this.R1 = u10Var;
        int i10 = k6.f27824a7;
        w0(i10);
        P(i10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(bd.M0(2131754060, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i11 = k6.G6;
        r6.V(textView, i11, e6Var);
        textView.setGravity(19);
        frameLayout.addView(textView, mf.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.A1 = org.telegram.messenger.g0.L(-8.0f);
        ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131231269);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        r6.t(e10, i11, e6Var, PorterDuff.Mode.SRC_IN);
        pf.a(e10);
        e10.setOnClickListener(new View.OnClickListener(this) {
            public final v f19889b;

            {
                this.f19889b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f19889b.dismiss();
                        return;
                    default:
                        v vVar = this.f19889b;
                        org.telegram.ui.Cells.k3 k3Var = vVar.X1;
                        if (!vVar.Z1) {
                            TL_iv.RichMessage richMessage = vVar.f19975b2;
                            if (richMessage != null) {
                                u10 u10Var2 = vVar.R1;
                                if (u10Var2 != null) {
                                    u10Var2.a(richMessage);
                                }
                                vVar.dismiss();
                                return;
                            }
                            String trim = k3Var.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                vVar.Z1 = true;
                                vVar.Y1.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                vVar.f19974a2 = ConnectionsManager.getInstance(vVar.Q1).sendRequest(tL_messages_composeRichMessageWithAI, new ci.d0(vVar, 20));
                                org.telegram.messenger.g0.v1(k3Var.d);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(e10, mf.d(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.U1 = frameLayout2;
        st stVar = new st(i3, context, e6Var);
        this.V1 = stVar;
        stVar.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        int i12 = k6.f27878d6;
        ShapeDrawable d02 = k6.d0(L, k6.w0(i12, e6Var));
        n6 N = r6.N(i12);
        stVar.setBackground(d02);
        r6.k(stVar, d02, N, null, e6Var);
        frameLayout2.addView(stVar, mf.c(-2.0f, -1));
        frameLayout2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.W1 = frameLayout3;
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, bd.M0(2131754058, null), true, false, ((org.telegram.messenger.j0) hp.s1(i3).f23167x7.R.f13798b).f23620c, e6Var);
        this.X1 = k3Var;
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        ShapeDrawable d03 = k6.d0(org.telegram.messenger.g0.L(20.0f), k6.w0(i12, e6Var));
        n6 N2 = r6.N(i12);
        k3Var.setBackground(d03);
        r6.k(k3Var, d03, N2, null, e6Var);
        i3Var.addTextChangedListener(new u(this));
        frameLayout3.addView(k3Var, mf.c(-2.0f, -1));
        frameLayout3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        this.Y1 = h;
        h.i(bd.M0(2131754059, null), false, true);
        h.setOnClickListener(new View.OnClickListener(this) {
            public final v f19889b;

            {
                this.f19889b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f19889b.dismiss();
                        return;
                    default:
                        v vVar = this.f19889b;
                        org.telegram.ui.Cells.k3 k3Var2 = vVar.X1;
                        if (!vVar.Z1) {
                            TL_iv.RichMessage richMessage = vVar.f19975b2;
                            if (richMessage != null) {
                                u10 u10Var2 = vVar.R1;
                                if (u10Var2 != null) {
                                    u10Var2.a(richMessage);
                                }
                                vVar.dismiss();
                                return;
                            }
                            String trim = k3Var2.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                vVar.Z1 = true;
                                vVar.Y1.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                vVar.f19974a2 = ConnectionsManager.getInstance(vVar.Q1).sendRequest(tL_messages_composeRichMessageWithAI, new ci.d0(vVar, 20));
                                org.telegram.messenger.g0.v1(k3Var2.d);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.f28586b.addView(h, mf.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) h.getLayoutParams()).leftMargin += this.f28618u0;
        ((ViewGroup.MarginLayoutParams) h.getLayoutParams()).rightMargin += this.f28618u0;
        u4.k kVar = new u4.k();
        kVar.f55567m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.f36102l1.setItemAnimator(kVar);
        tj0 tj0Var = this.f36102l1;
        int i13 = this.f28618u0;
        tj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(72.0f));
        this.f36102l1.setClipToPadding(false);
        this.S1.O(false);
        d1();
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.Q1, 0, true, new gi.q4(this, 27), this.J0);
        this.S1 = f41Var;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return bd.M0(2131754060, null);
    }

    public final void d1() {
        TL_iv.RichMessage richMessage = this.f19975b2;
        gi.d dVar = this.Y1;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.X1.d.getText().toString().trim()));
        }
    }

    @Override
    public final void dismiss() {
        if (this.f19974a2 != 0) {
            ConnectionsManager.getInstance(this.Q1).cancelRequest(this.f19974a2, true);
            this.f19974a2 = 0;
        }
        org.telegram.messenger.g0.v1(this.X1.d);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new lg.n(this, 11), 200L);
    }
}
