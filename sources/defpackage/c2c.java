package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class c2c extends mz0 {
    public ImageView S1;
    public FrameLayout T1;
    public b61 U1;
    public CharSequence V1;
    public boolean W1;
    public CharSequence X1;
    public ku3 Y1;
    public String Z1;
    public String a2;
    public int b2;
    public String[] c2;
    public String[] d2;
    public l7c e2;
    public boolean f2;
    public int g2;
    public int h2;
    public int i2;

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, true, new v1c(this, (byte) 0), this.J0);
        this.e2 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        return "Translate";
    }

    @Override
    public final void L0(float f) {
        ImageView imageView = this.S1;
        float f2 = 1.0f - f;
        imageView.setAlpha(f2);
        imageView.setScaleX(gm.R1(0.6f, 1.0f, f2));
        imageView.setScaleY(gm.R1(0.6f, 1.0f, f2));
    }

    public final void Y0(bu5 bu5Var, LinearLayout linearLayout, boolean z, String str, Runnable runnable) {
        int i = cmb.D8;
        int i2 = cmb.E8;
        a8 a8Var = new a8(1, this.J0, getContext(), false, false);
        a8Var.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        a8Var.setText(str);
        a8Var.setChecked(z);
        a8Var.d(cmb.v0(i, this.J0), cmb.v0(i2, this.J0));
        a8Var.setSelectorColor(cmb.p1(0.12f, cmb.v0(i, this.J0)));
        a8Var.setOnClickListener(new q(bu5Var, z, runnable, (byte) 1));
        linearLayout.addView(a8Var, qoe.o(-1, -2));
    }

    public final void Z0() {
        if (this.g2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.g2, true);
            this.g2 = -1;
        }
    }

    public final void a1() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.V1};
        tL_textWithEntities.entities = hs6.d0(this.a).Y(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.Y1 != null) {
            this.U1.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) jb6.M0(2131748536, null));
        spannableStringBuilder.setSpan(new ta6(null, gm.L(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.X1 = spannableStringBuilder;
        this.W1 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.a2;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i = this.b2;
        if (i != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.c2[i];
        }
        this.g2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_translateText, new kc((byte) 0), new v1c(this, (byte) 1));
        this.e2.O(true);
    }

    @Override
    public final void e0() {
        super.e0();
        ValueAnimator valueAnimator = this.P0;
        FrameLayout frameLayout = this.T1;
        if (valueAnimator != null) {
            frameLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            frameLayout.setTranslationY(0.0f);
        }
    }

    @Override
    public final void p0() {
        FrameLayout frameLayout = this.T1;
        try {
            super.p0();
            int v0 = cmb.v0(cmb.Z6, this.J0);
            if (v0 != this.i2) {
                this.i2 = v0;
                s0(v0);
            }
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && v0 != this.h2) {
                this.h2 = v0;
                ((GradientDrawable) frameLayout.getBackground()).setColors(new int[]{cmb.p1(0.0f, v0), v0, v0});
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void show() {
        b61 b61Var = this.U1;
        super.show();
        iz0 iz0Var = this.o1;
        if (iz0Var != null) {
            iz0Var.setTitle("Translate");
        }
        this.e2.O(false);
        a1();
        if (this.Y1 != null) {
            b61Var.setText("Use This Translation");
            b61Var.setOnClickListener(new u1c(this, (byte) 3));
        }
    }
}
