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
public final class gb9 extends fy0 {
    public final int S1;
    public final p8c T1;
    public l5c U1;
    public final FrameLayout V1;
    public final FrameLayout W1;
    public final ig9 X1;
    public final FrameLayout Y1;
    public final it3 Z1;
    public final u41 a2;
    public boolean b2;
    public int c2;
    public TL_iv.RichMessage d2;

    public gb9(int i, wjb wjbVar, p8c p8cVar, Context context) {
        super(context, null, true, false, wjbVar);
        this.S1 = i;
        this.T1 = p8cVar;
        int i2 = bkb.Z6;
        t0(i2);
        M(i2);
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(k96.M0(2131754057, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        int i3 = bkb.F6;
        zkb.X(textView, i3, wjbVar);
        textView.setGravity(19);
        frameLayout.addView(textView, nme.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.C1 = gl.L(-8.0f);
        ImageView k = tb4.k(context, 2131231272);
        k.setScaleType(ImageView.ScaleType.CENTER);
        zkb.s(k, i3, wjbVar, PorterDuff.Mode.SRC_IN);
        ote.a(k);
        k.setOnClickListener(new View.OnClickListener(this) {
            public final gb9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                gb9 gb9Var = this.b;
                switch (b) {
                    case 0:
                        gb9Var.dismiss();
                        return;
                    default:
                        it3 it3Var = gb9Var.Z1;
                        if (!gb9Var.b2) {
                            TL_iv.RichMessage richMessage = gb9Var.d2;
                            if (richMessage != null) {
                                p8c p8cVar2 = gb9Var.T1;
                                if (p8cVar2 != null) {
                                    p8cVar2.a(richMessage);
                                }
                                gb9Var.dismiss();
                                return;
                            }
                            String trim = it3Var.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                gb9Var.b2 = true;
                                gb9Var.a2.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                gb9Var.c2 = ConnectionsManager.getInstance(gb9Var.S1).sendRequest(tL_messages_composeRichMessageWithAI, new n35(gb9Var, (byte) 25));
                                gl.t1(it3Var.d);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(k, nme.d(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.W1 = frameLayout2;
        ig9 ig9Var = new ig9(i, wjbVar, context);
        this.X1 = ig9Var;
        ig9Var.setPadding(gl.L(14.0f), gl.L(12.0f), gl.L(14.0f), gl.L(12.0f));
        int L = gl.L(12.0f);
        int i4 = bkb.c6;
        ShapeDrawable b0 = bkb.b0(L, bkb.v0(i4, wjbVar));
        vkb M = zkb.M(i4);
        ig9Var.setBackground(b0);
        zkb.j(ig9Var, b0, M, null, wjbVar);
        frameLayout2.addView(ig9Var, nme.c(-2.0f, -1));
        frameLayout2.setPadding(gl.L(12.0f), gl.L(12.0f), gl.L(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Y1 = frameLayout3;
        it3 it3Var = new it3(context, k96.M0(2131754055, null), true, false, na7.q1(i).k4.V.f(), wjbVar);
        this.Z1 = it3Var;
        ht3 ht3Var = it3Var.d;
        ht3Var.setImeOptions(6);
        ht3Var.setMaxLines(5);
        ShapeDrawable b02 = bkb.b0(gl.L(20.0f), bkb.v0(i4, wjbVar));
        vkb M2 = zkb.M(i4);
        it3Var.setBackground(b02);
        zkb.j(it3Var, b02, M2, null, wjbVar);
        ht3Var.addTextChangedListener(new fb9(this));
        frameLayout3.addView(it3Var, nme.c(-2.0f, -1));
        frameLayout3.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        u41 i5 = yjb.i(24, wjbVar, context, true);
        this.a2 = i5;
        i5.i(k96.M0(2131754056, null), false, true);
        i5.setOnClickListener(new View.OnClickListener(this) {
            public final gb9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                gb9 gb9Var = this.b;
                switch (b) {
                    case 0:
                        gb9Var.dismiss();
                        return;
                    default:
                        it3 it3Var2 = gb9Var.Z1;
                        if (!gb9Var.b2) {
                            TL_iv.RichMessage richMessage = gb9Var.d2;
                            if (richMessage != null) {
                                p8c p8cVar2 = gb9Var.T1;
                                if (p8cVar2 != null) {
                                    p8cVar2.a(richMessage);
                                }
                                gb9Var.dismiss();
                                return;
                            }
                            String trim = it3Var2.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                gb9Var.b2 = true;
                                gb9Var.a2.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                gb9Var.c2 = ConnectionsManager.getInstance(gb9Var.S1).sendRequest(tL_messages_composeRichMessageWithAI, new n35(gb9Var, (byte) 25));
                                gl.t1(it3Var2.d);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.b.addView(i5, nme.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) i5.getLayoutParams()).leftMargin += this.u0;
        ((ViewGroup.MarginLayoutParams) i5.getLayoutParams()).rightMargin += this.u0;
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33.h);
        gb3Var.n(350L);
        this.n1.setItemAnimator(gb3Var);
        o39 o39Var = this.n1;
        int i6 = this.u0;
        o39Var.setPadding(i6, 0, i6, gl.L(72.0f));
        this.n1.setClipToPadding(false);
        this.U1.O(false);
        Y0();
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.S1, 0, true, new tf8(this, (byte) 11), this.J0);
        this.U1 = l5cVar;
        return l5cVar;
    }

    @Override
    public final CharSequence J0() {
        return k96.M0(2131754057, null);
    }

    public final void Y0() {
        TL_iv.RichMessage richMessage = this.d2;
        u41 u41Var = this.a2;
        if (richMessage != null) {
            u41Var.setEnabled(true);
        } else {
            u41Var.setEnabled(!TextUtils.isEmpty(this.Z1.d.getText().toString().trim()));
        }
    }

    @Override
    public final void dismiss() {
        if (this.c2 != 0) {
            ConnectionsManager.getInstance(this.S1).cancelRequest(this.c2, true);
            this.c2 = 0;
        }
        gl.t1(this.Z1.d);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        gl.d3(new sr8(this, (byte) 18), 200L);
    }
}
