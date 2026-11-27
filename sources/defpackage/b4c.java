package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class b4c extends ny0 {
    public ImageView S1;
    public FrameLayout T1;
    public c51 U1;
    public CharSequence V1;
    public boolean W1;
    public CharSequence X1;
    public st3 Y1;
    public String Z1;
    public String a2;
    public int b2;
    public String[] c2;
    public String[] d2;
    public l9c e2;
    public boolean f2;
    public int g2;
    public int h2;
    public int i2;

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, 0, true, new u3c(this, (byte) 0), this.J0);
        this.e2 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        return "Translate";
    }

    @Override
    public final void M0(float f) {
        ImageView imageView = this.S1;
        float f2 = 1.0f - f;
        imageView.setAlpha(f2);
        imageView.setScaleX(hl.R1(0.6f, 1.0f, f2));
        imageView.setScaleY(hl.R1(0.6f, 1.0f, f2));
    }

    public final void Z0(fu5 fu5Var, LinearLayout linearLayout, boolean z, String str, Runnable runnable) {
        int i = aob.E8;
        int i2 = aob.F8;
        b8 b8Var = new b8(1, this.J0, getContext(), false, false);
        b8Var.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        b8Var.setText(str);
        b8Var.setChecked(z);
        b8Var.d(aob.v0(i, this.J0), aob.v0(i2, this.J0));
        b8Var.setSelectorColor(aob.p1(0.12f, aob.v0(i, this.J0)));
        b8Var.setOnClickListener(new q(fu5Var, z, runnable, (byte) 1));
        linearLayout.addView(b8Var, tre.o(-1, -2));
    }

    public final void a1() {
        if (this.g2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.g2, true);
            this.g2 = -1;
        }
    }

    public final void b1() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.V1};
        tL_textWithEntities.entities = ls6.d0(this.a).Y(charSequenceArr, true, true);
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
        spannableStringBuilder.append((CharSequence) ob6.M0(2131748533, null));
        spannableStringBuilder.setSpan(new ya6(null, hl.L(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
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
        this.g2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_translateText, new ic((byte) 0), new u3c(this, (byte) 1));
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
            int v0 = aob.v0(aob.a7, this.J0);
            if (v0 != this.i2) {
                this.i2 = v0;
                s0(v0);
            }
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && v0 != this.h2) {
                this.h2 = v0;
                ((GradientDrawable) frameLayout.getBackground()).setColors(new int[]{aob.p1(0.0f, v0), v0, v0});
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void show() {
        c51 c51Var = this.U1;
        super.show();
        jy0 jy0Var = this.o1;
        if (jy0Var != null) {
            jy0Var.setTitle("Translate");
        }
        this.e2.O(false);
        b1();
        if (this.Y1 != null) {
            c51Var.setText("Use This Translation");
            c51Var.setOnClickListener(new t3c(this, (byte) 3));
        }
    }
}
