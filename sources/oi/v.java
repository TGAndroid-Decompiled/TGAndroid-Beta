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
import c8.sa;
import hi.y7;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.ut;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ra;
public final class v extends ra {
    public final int T1;
    public final w10 U1;
    public b51 V1;
    public final FrameLayout W1;
    public final FrameLayout X1;
    public final ut Y1;
    public final FrameLayout Z1;
    public final org.telegram.ui.Cells.l3 f22538a2;
    public final hi.e f22539b2;
    public boolean f22540c2;
    public int d2;
    public TL_iv.RichMessage f22541e2;

    public v(int i7, Context context, w10 w10Var, i6 i6Var) {
        super(context, null, true, false, i6Var);
        this.T1 = i7;
        this.U1 = w10Var;
        int i10 = n6.f29394a7;
        w0(i10);
        Q(i10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(gd.N0(2131754057, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i11 = n6.G6;
        u6.U(textView, i11, i6Var);
        textView.setGravity(19);
        frameLayout.addView(textView, na.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.D1 = org.telegram.messenger.g0.L(-8.0f);
        ImageView e10 = m10.e(context, 2131231272);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        u6.s(e10, i11, i6Var, PorterDuff.Mode.SRC_IN);
        sa.a(e10);
        e10.setOnClickListener(new View.OnClickListener(this) {
            public final v f22465b;

            {
                this.f22465b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f22465b.dismiss();
                        return;
                    default:
                        v vVar = this.f22465b;
                        org.telegram.ui.Cells.l3 l3Var = vVar.f22538a2;
                        if (!vVar.f22540c2) {
                            TL_iv.RichMessage richMessage = vVar.f22541e2;
                            if (richMessage != null) {
                                w10 w10Var2 = vVar.U1;
                                if (w10Var2 != null) {
                                    w10Var2.a(richMessage);
                                }
                                vVar.dismiss();
                                return;
                            }
                            String trim = l3Var.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                vVar.f22540c2 = true;
                                vVar.f22539b2.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                vVar.d2 = ConnectionsManager.getInstance(vVar.T1).sendRequest(tL_messages_composeRichMessageWithAI, new ai.b1(vVar, 23));
                                org.telegram.messenger.g0.v1(l3Var.d);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(e10, na.d(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.X1 = frameLayout2;
        ut utVar = new ut(i7, context, i6Var);
        this.Y1 = utVar;
        utVar.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        int i12 = n6.f29451d6;
        ShapeDrawable d02 = n6.d0(L, n6.w0(i12, i6Var));
        q6 M = u6.M(i12);
        utVar.setBackground(d02);
        u6.j(utVar, d02, M, null, i6Var);
        frameLayout2.addView(utVar, na.c(-2.0f, -1));
        frameLayout2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z1 = frameLayout3;
        org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context, gd.N0(2131754055, null), true, false, ((org.telegram.messenger.j0) mp.u1(i7).A7.W.f15482b).f24899c, i6Var);
        this.f22538a2 = l3Var;
        org.telegram.ui.Cells.j3 j3Var = l3Var.d;
        j3Var.setImeOptions(6);
        j3Var.setMaxLines(5);
        ShapeDrawable d03 = n6.d0(org.telegram.messenger.g0.L(20.0f), n6.w0(i12, i6Var));
        q6 M2 = u6.M(i12);
        l3Var.setBackground(d03);
        u6.j(l3Var, d03, M2, null, i6Var);
        j3Var.addTextChangedListener(new u(this));
        frameLayout3.addView(l3Var, na.c(-2.0f, -1));
        frameLayout3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        hi.e g10 = m10.g(24, context, i6Var, true);
        this.f22539b2 = g10;
        g10.i(gd.N0(2131754056, null), false, true);
        g10.setOnClickListener(new View.OnClickListener(this) {
            public final v f22465b;

            {
                this.f22465b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f22465b.dismiss();
                        return;
                    default:
                        v vVar = this.f22465b;
                        org.telegram.ui.Cells.l3 l3Var2 = vVar.f22538a2;
                        if (!vVar.f22540c2) {
                            TL_iv.RichMessage richMessage = vVar.f22541e2;
                            if (richMessage != null) {
                                w10 w10Var2 = vVar.U1;
                                if (w10Var2 != null) {
                                    w10Var2.a(richMessage);
                                }
                                vVar.dismiss();
                                return;
                            }
                            String trim = l3Var2.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                vVar.f22540c2 = true;
                                vVar.f22539b2.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                vVar.d2 = ConnectionsManager.getInstance(vVar.T1).sendRequest(tL_messages_composeRichMessageWithAI, new ai.b1(vVar, 23));
                                org.telegram.messenger.g0.v1(l3Var2.d);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.f30226b.addView(g10, na.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) g10.getLayoutParams()).leftMargin += this.f30261u0;
        ((ViewGroup.MarginLayoutParams) g10.getLayoutParams()).rightMargin += this.f30261u0;
        v4.l lVar = new v4.l();
        lVar.f59274m = false;
        lVar.C = false;
        lVar.o(kr.h);
        lVar.n(350L);
        this.f39246o1.setItemAnimator(lVar);
        ek0 ek0Var = this.f39246o1;
        int i13 = this.f30261u0;
        ek0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(72.0f));
        this.f39246o1.setClipToPadding(false);
        this.V1.O(false);
        e1();
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(ek0Var, getContext(), this.T1, 0, true, new y7(this, 27), this.J0);
        this.V1 = b51Var;
        return b51Var;
    }

    @Override
    public final CharSequence P0() {
        return gd.N0(2131754057, null);
    }

    @Override
    public final void dismiss() {
        if (this.d2 != 0) {
            ConnectionsManager.getInstance(this.T1).cancelRequest(this.d2, true);
            this.d2 = 0;
        }
        org.telegram.messenger.g0.v1(this.f22538a2.d);
        super.dismiss();
    }

    public final void e1() {
        TL_iv.RichMessage richMessage = this.f22541e2;
        hi.e eVar = this.f22539b2;
        if (richMessage != null) {
            eVar.setEnabled(true);
        } else {
            eVar.setEnabled(!TextUtils.isEmpty(this.f22538a2.d.getText().toString().trim()));
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.h3(new kg.i0(this, 26), 200L);
    }
}
