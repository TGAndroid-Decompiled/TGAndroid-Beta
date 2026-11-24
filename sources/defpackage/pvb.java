package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class pvb extends LinearLayout implements vlb {
    public final ylb a;
    public final bf0 b;
    public final l66 c;
    public final l66 d;
    public int e;
    public int f;

    public pvb(Context context, ylb ylbVar) {
        super(context);
        this.e = 90;
        this.a = ylbVar;
        setOrientation(1);
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        bf0Var.getImageReceiver().N(1);
        bf0Var.getImageReceiver().M(1);
        bf0Var.setOnClickListener(new oha(this, (byte) 25));
        addView(bf0Var, qoe.t(90, 90, 17, 0, 9, 0, 9));
        l66 l66Var = new l66(context, null);
        this.c = l66Var;
        l66Var.setTextSize(1, 20.0f);
        l66Var.setGravity(17);
        l66Var.setTypeface(gm.o());
        l66Var.setTextAlignment(4);
        addView(l66Var, qoe.t(-1, -2, 17, 48, 0, 48, 10));
        l66 l66Var2 = new l66(context, null);
        this.d = l66Var2;
        l66Var2.setTextSize(1, 14.0f);
        l66Var2.setGravity(17);
        l66Var2.setTextAlignment(4);
        addView(l66Var2, qoe.t(-1, -2, 17, 48, 0, 48, 17));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        l66 l66Var = this.c;
        l66Var.setText(charSequence);
        l66Var.setVisibility(0);
        l66 l66Var2 = this.d;
        l66Var2.setText(charSequence2);
        l66Var2.setMaxWidth(hg5.a(charSequence2, l66Var2.getPaint()));
        l66Var2.requestLayout();
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.Wc));
        hashSet.add(Integer.valueOf(cmb.A6));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setEmoji(int i) {
        if (this.f != i) {
            this.f = i;
            p09 p09Var = new p09(i, gm.L(90.0f), gm.L(90.0f));
            bf0 bf0Var = this.b;
            bf0Var.setImageDrawable(p09Var);
            bf0Var.getImageReceiver().M(2);
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
            bf0 bf0Var = this.b;
            bf0Var.b();
            this.f = i;
            bf0Var.setImageResource(i);
        }
    }

    public void setText(CharSequence charSequence) {
        this.c.setVisibility(8);
        l66 l66Var = this.d;
        l66Var.setText(charSequence);
        l66Var.setMaxWidth(hg5.a(charSequence, l66Var.getPaint()));
        l66Var.requestLayout();
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i;
        int i2 = cmb.F6;
        ylb ylbVar = this.a;
        int v0 = cmb.v0(i2, ylbVar);
        l66 l66Var = this.c;
        l66Var.setTextColor(v0);
        int i3 = cmb.Wc;
        l66Var.setLinkTextColor(cmb.v0(i3, ylbVar));
        if (l66Var.getVisibility() != 0) {
            i2 = cmb.A6;
        }
        int v02 = cmb.v0(i2, ylbVar);
        l66 l66Var2 = this.d;
        l66Var2.setTextColor(v02);
        l66Var2.setLinkTextColor(cmb.v0(i3, ylbVar));
        int i4 = this.e;
        if (l66Var.getVisibility() == 0) {
            i = 0;
        } else {
            i = 9;
        }
        this.b.setLayoutParams(qoe.t(i4, i4, 17, 0, i, 0, 9));
    }
}
