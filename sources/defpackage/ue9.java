package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
public final class ue9 extends ny0 {
    public final int S1;
    public final pcc T1;
    public l9c U1;
    public final FrameLayout V1;
    public final FrameLayout W1;
    public final zj9 X1;
    public final FrameLayout Y1;
    public final zt3 Z1;
    public final c51 a2;
    public boolean b2;
    public int c2;
    public TL_iv.RichMessage d2;

    public ue9(int i, vnb vnbVar, pcc pccVar, Context context) {
        super(context, null, true, false, vnbVar);
        this.S1 = i;
        this.T1 = pccVar;
        int i2 = aob.a7;
        t0(i2);
        L(i2);
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(2131754053, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        int i3 = aob.G6;
        yob.X(textView, i3, vnbVar);
        textView.setGravity(19);
        frameLayout.addView(textView, tre.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.C1 = hl.L(-8.0f);
        ImageView k = qd4.k(context, 2131231272);
        k.setScaleType(ImageView.ScaleType.CENTER);
        yob.s(k, i3, vnbVar, PorterDuff.Mode.SRC_IN);
        iye.a(k);
        k.setOnClickListener(new View.OnClickListener(this) {
            public final ue9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                ue9 ue9Var = this.b;
                switch (b) {
                    case 0:
                        ue9Var.dismiss();
                        return;
                    default:
                        zt3 zt3Var = ue9Var.Z1;
                        if (!ue9Var.b2) {
                            TL_iv.RichMessage richMessage = ue9Var.d2;
                            if (richMessage != null) {
                                pcc pccVar2 = ue9Var.T1;
                                if (pccVar2 != null) {
                                    pccVar2.a(richMessage);
                                }
                                ue9Var.dismiss();
                                return;
                            }
                            String trim = zt3Var.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                ue9Var.b2 = true;
                                ue9Var.a2.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                ue9Var.c2 = ConnectionsManager.getInstance(ue9Var.S1).sendRequest(tL_messages_composeRichMessageWithAI, new w15(ue9Var, (byte) 26));
                                hl.t1(zt3Var.d);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(k, tre.d(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.W1 = frameLayout2;
        zj9 zj9Var = new zj9(i, vnbVar, context);
        this.X1 = zj9Var;
        zj9Var.setPadding(hl.L(14.0f), hl.L(12.0f), hl.L(14.0f), hl.L(12.0f));
        int L = hl.L(12.0f);
        int i4 = aob.d6;
        ShapeDrawable b0 = aob.b0(L, aob.v0(i4, vnbVar));
        uob M = yob.M(i4);
        zj9Var.setBackground(b0);
        yob.j(zj9Var, b0, M, null, vnbVar);
        frameLayout2.addView(zj9Var, tre.c(-2.0f, -1));
        frameLayout2.setPadding(hl.L(12.0f), hl.L(12.0f), hl.L(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Y1 = frameLayout3;
        zt3 zt3Var = new zt3(context, ob6.M0(2131754051, null), true, false, uc7.s1(i).k4.c0.f(), vnbVar);
        this.Z1 = zt3Var;
        yt3 yt3Var = zt3Var.d;
        yt3Var.setImeOptions(6);
        yt3Var.setMaxLines(5);
        ShapeDrawable b02 = aob.b0(hl.L(20.0f), aob.v0(i4, vnbVar));
        uob M2 = yob.M(i4);
        zt3Var.setBackground(b02);
        yob.j(zt3Var, b02, M2, null, vnbVar);
        yt3Var.addTextChangedListener(new te9(this));
        frameLayout3.addView(zt3Var, tre.c(-2.0f, -1));
        frameLayout3.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        c51 i5 = xnb.i(24, vnbVar, context, true);
        this.a2 = i5;
        i5.i(ob6.M0(2131754052, null), false, true);
        i5.setOnClickListener(new View.OnClickListener(this) {
            public final ue9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                ue9 ue9Var = this.b;
                switch (b) {
                    case 0:
                        ue9Var.dismiss();
                        return;
                    default:
                        zt3 zt3Var2 = ue9Var.Z1;
                        if (!ue9Var.b2) {
                            TL_iv.RichMessage richMessage = ue9Var.d2;
                            if (richMessage != null) {
                                pcc pccVar2 = ue9Var.T1;
                                if (pccVar2 != null) {
                                    pccVar2.a(richMessage);
                                }
                                ue9Var.dismiss();
                                return;
                            }
                            String trim = zt3Var2.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                ue9Var.b2 = true;
                                ue9Var.a2.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                ue9Var.c2 = ConnectionsManager.getInstance(ue9Var.S1).sendRequest(tL_messages_composeRichMessageWithAI, new w15(ue9Var, (byte) 26));
                                hl.t1(zt3Var2.d);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.b.addView(i5, tre.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) i5.getLayoutParams()).leftMargin += this.u0;
        ((ViewGroup.MarginLayoutParams) i5.getLayoutParams()).rightMargin += this.u0;
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43.h);
        zb3Var.n(350L);
        this.n1.setItemAnimator(zb3Var);
        d79 d79Var = this.n1;
        int i6 = this.u0;
        d79Var.setPadding(i6, 0, i6, hl.L(72.0f));
        this.n1.setClipToPadding(false);
        this.U1.O(false);
        Z0();
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.S1, 0, true, new hj8(this, (byte) 11), this.J0);
        this.U1 = l9cVar;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        return ob6.M0(2131754053, null);
    }

    public final void Z0() {
        TL_iv.RichMessage richMessage = this.d2;
        c51 c51Var = this.a2;
        if (richMessage != null) {
            c51Var.setEnabled(true);
        } else {
            c51Var.setEnabled(!TextUtils.isEmpty(this.Z1.d.getText().toString().trim()));
        }
    }

    @Override
    public final void dismiss() {
        if (this.c2 != 0) {
            ConnectionsManager.getInstance(this.S1).cancelRequest(this.c2, true);
            this.c2 = 0;
        }
        hl.t1(this.Z1.d);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        hl.d3(new v59(this, (byte) 4), 200L);
    }
}
