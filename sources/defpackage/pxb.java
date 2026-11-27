package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class pxb extends LinearLayout implements snb {
    public final vnb a;
    public final de0 b;
    public final p66 c;
    public final p66 d;
    public int e;
    public int f;

    public pxb(Context context, vnb vnbVar) {
        super(context);
        this.e = 90;
        this.a = vnbVar;
        setOrientation(1);
        de0 de0Var = new de0(context);
        this.b = de0Var;
        de0Var.getImageReceiver().N(1);
        de0Var.getImageReceiver().M(1);
        de0Var.setOnClickListener(new kla(this, (byte) 23));
        addView(de0Var, tre.t(90, 90, 17, 0, 9, 0, 9));
        p66 p66Var = new p66(context, null);
        this.c = p66Var;
        p66Var.setTextSize(1, 20.0f);
        p66Var.setGravity(17);
        p66Var.setTypeface(hl.o());
        p66Var.setTextAlignment(4);
        addView(p66Var, tre.t(-1, -2, 17, 48, 0, 48, 10));
        p66 p66Var2 = new p66(context, null);
        this.d = p66Var2;
        p66Var2.setTextSize(1, 14.0f);
        p66Var2.setGravity(17);
        p66Var2.setTextAlignment(4);
        addView(p66Var2, tre.t(-1, -2, 17, 48, 0, 48, 17));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        p66 p66Var = this.c;
        p66Var.setText(charSequence);
        p66Var.setVisibility(0);
        p66 p66Var2 = this.d;
        p66Var2.setText(charSequence2);
        p66Var2.setMaxWidth(kg5.a(charSequence2, p66Var2.getPaint()));
        p66Var2.requestLayout();
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.Xc));
        hashSet.add(Integer.valueOf(aob.B6));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setEmoji(int i) {
        if (this.f != i) {
            this.f = i;
            b29 b29Var = new b29(i, hl.L(90.0f), hl.L(90.0f));
            de0 de0Var = this.b;
            de0Var.setImageDrawable(b29Var);
            de0Var.getImageReceiver().M(2);
        }
    }

    public void setEmojiSize(int i) {
        if (this.e != i) {
            this.e = i;
            updateColors();
        }
    }

    public void setEmojiStatic(int i) {
        if (this.f != i) {
            de0 de0Var = this.b;
            de0Var.b();
            this.f = i;
            de0Var.setImageResource(i);
        }
    }

    public void setText(CharSequence charSequence) {
        this.c.setVisibility(8);
        p66 p66Var = this.d;
        p66Var.setText(charSequence);
        p66Var.setMaxWidth(kg5.a(charSequence, p66Var.getPaint()));
        p66Var.requestLayout();
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i;
        int i2 = aob.G6;
        vnb vnbVar = this.a;
        int v0 = aob.v0(i2, vnbVar);
        p66 p66Var = this.c;
        p66Var.setTextColor(v0);
        int i3 = aob.Xc;
        p66Var.setLinkTextColor(aob.v0(i3, vnbVar));
        if (p66Var.getVisibility() != 0) {
            i2 = aob.B6;
        }
        int v02 = aob.v0(i2, vnbVar);
        p66 p66Var2 = this.d;
        p66Var2.setTextColor(v02);
        p66Var2.setLinkTextColor(aob.v0(i3, vnbVar));
        int i4 = this.e;
        if (p66Var.getVisibility() == 0) {
            i = 0;
        } else {
            i = 9;
        }
        this.b.setLayoutParams(tre.t(i4, i4, 17, 0, i, 0, 9));
    }
}
