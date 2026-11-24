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
public final class gd9 extends mz0 {
    public final int S1;
    public final qac T1;
    public l7c U1;
    public final FrameLayout V1;
    public final FrameLayout W1;
    public final mi9 X1;
    public final FrameLayout Y1;
    public final su3 Z1;
    public final b61 a2;
    public boolean b2;
    public int c2;
    public TL_iv.RichMessage d2;

    public gd9(int i, ylb ylbVar, qac qacVar, Context context) {
        super(context, null, true, false, ylbVar);
        this.S1 = i;
        this.T1 = qacVar;
        int i2 = cmb.Z6;
        t0(i2);
        L(i2);
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(jb6.M0(2131754025, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        int i3 = cmb.F6;
        anb.X(textView, i3, ylbVar);
        textView.setGravity(19);
        frameLayout.addView(textView, qoe.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.C1 = gm.L(-8.0f);
        ImageView k = td4.k(context, 2131231273);
        k.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(k, i3, ylbVar, PorterDuff.Mode.SRC_IN);
        rve.a(k);
        k.setOnClickListener(new View.OnClickListener(this) {
            public final gd9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                gd9 gd9Var = this.b;
                switch (b) {
                    case 0:
                        gd9Var.dismiss();
                        return;
                    default:
                        su3 su3Var = gd9Var.Z1;
                        if (!gd9Var.b2) {
                            TL_iv.RichMessage richMessage = gd9Var.d2;
                            if (richMessage != null) {
                                qac qacVar2 = gd9Var.T1;
                                if (qacVar2 != null) {
                                    qacVar2.a(richMessage);
                                }
                                gd9Var.dismiss();
                                return;
                            }
                            String trim = su3Var.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                gd9Var.b2 = true;
                                gd9Var.a2.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                gd9Var.c2 = ConnectionsManager.getInstance(gd9Var.S1).sendRequest(tL_messages_composeRichMessageWithAI, new r15(gd9Var, (byte) 26));
                                gm.t1(su3Var.d);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(k, qoe.d(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.W1 = frameLayout2;
        mi9 mi9Var = new mi9(i, ylbVar, context);
        this.X1 = mi9Var;
        mi9Var.setPadding(gm.L(14.0f), gm.L(12.0f), gm.L(14.0f), gm.L(12.0f));
        int L = gm.L(12.0f);
        int i4 = cmb.c6;
        ShapeDrawable b0 = cmb.b0(L, cmb.v0(i4, ylbVar));
        wmb M = anb.M(i4);
        mi9Var.setBackground(b0);
        anb.j(mi9Var, b0, M, null, ylbVar);
        frameLayout2.addView(mi9Var, qoe.c(-2.0f, -1));
        frameLayout2.setPadding(gm.L(12.0f), gm.L(12.0f), gm.L(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Y1 = frameLayout3;
        su3 su3Var = new su3(context, jb6.M0(2131754023, null), true, false, oc7.r1(i).l4.V.f(), ylbVar);
        this.Z1 = su3Var;
        ru3 ru3Var = su3Var.d;
        ru3Var.setImeOptions(6);
        ru3Var.setMaxLines(5);
        ShapeDrawable b02 = cmb.b0(gm.L(20.0f), cmb.v0(i4, ylbVar));
        wmb M2 = anb.M(i4);
        su3Var.setBackground(b02);
        anb.j(su3Var, b02, M2, null, ylbVar);
        ru3Var.addTextChangedListener(new fd9(this));
        frameLayout3.addView(su3Var, qoe.c(-2.0f, -1));
        frameLayout3.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        b61 i5 = mlb.i(24, ylbVar, context, true);
        this.a2 = i5;
        i5.i(jb6.M0(2131754024, null), false, true);
        i5.setOnClickListener(new View.OnClickListener(this) {
            public final gd9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                gd9 gd9Var = this.b;
                switch (b) {
                    case 0:
                        gd9Var.dismiss();
                        return;
                    default:
                        su3 su3Var2 = gd9Var.Z1;
                        if (!gd9Var.b2) {
                            TL_iv.RichMessage richMessage = gd9Var.d2;
                            if (richMessage != null) {
                                qac qacVar2 = gd9Var.T1;
                                if (qacVar2 != null) {
                                    qacVar2.a(richMessage);
                                }
                                gd9Var.dismiss();
                                return;
                            }
                            String trim = su3Var2.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                gd9Var.b2 = true;
                                gd9Var.a2.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                gd9Var.c2 = ConnectionsManager.getInstance(gd9Var.S1).sendRequest(tL_messages_composeRichMessageWithAI, new r15(gd9Var, (byte) 26));
                                gm.t1(su3Var2.d);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.b.addView(i5, qoe.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) i5.getLayoutParams()).leftMargin += this.u0;
        ((ViewGroup.MarginLayoutParams) i5.getLayoutParams()).rightMargin += this.u0;
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        this.n1.setItemAnimator(sc3Var);
        r59 r59Var = this.n1;
        int i6 = this.u0;
        r59Var.setPadding(i6, 0, i6, gm.L(72.0f));
        this.n1.setClipToPadding(false);
        this.U1.O(false);
        Y0();
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.S1, 0, true, new vh8(this, (byte) 11), this.J0);
        this.U1 = l7cVar;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        return jb6.M0(2131754025, null);
    }

    public final void Y0() {
        TL_iv.RichMessage richMessage = this.d2;
        b61 b61Var = this.a2;
        if (richMessage != null) {
            b61Var.setEnabled(true);
        } else {
            b61Var.setEnabled(!TextUtils.isEmpty(this.Z1.d.getText().toString().trim()));
        }
    }

    @Override
    public final void dismiss() {
        if (this.c2 != 0) {
            ConnectionsManager.getInstance(this.S1).cancelRequest(this.c2, true);
            this.c2 = 0;
        }
        gm.t1(this.Z1.d);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        gm.d3(new pp8(this, (byte) 26), 200L);
    }
}
