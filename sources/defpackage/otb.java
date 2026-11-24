package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class otb extends LinearLayout implements tjb {
    public final wjb a;
    public final be0 b;
    public final l46 c;
    public final l46 d;
    public int e;
    public int f;

    public otb(Context context, wjb wjbVar) {
        super(context);
        this.e = 90;
        this.a = wjbVar;
        setOrientation(1);
        be0 be0Var = new be0(context);
        this.b = be0Var;
        be0Var.getImageReceiver().N(1);
        be0Var.getImageReceiver().M(1);
        be0Var.setOnClickListener(new bna(this, (byte) 22));
        addView(be0Var, nme.t(90, 90, 17, 0, 9, 0, 9));
        l46 l46Var = new l46(context, null);
        this.c = l46Var;
        l46Var.setTextSize(1, 20.0f);
        l46Var.setGravity(17);
        l46Var.setTypeface(gl.o());
        l46Var.setTextAlignment(4);
        addView(l46Var, nme.t(-1, -2, 17, 48, 0, 48, 10));
        l46 l46Var2 = new l46(context, null);
        this.d = l46Var2;
        l46Var2.setTextSize(1, 14.0f);
        l46Var2.setGravity(17);
        l46Var2.setTextAlignment(4);
        addView(l46Var2, nme.t(-1, -2, 17, 48, 0, 48, 17));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        l46 l46Var = this.c;
        l46Var.setText(charSequence);
        l46Var.setVisibility(0);
        l46 l46Var2 = this.d;
        l46Var2.setText(charSequence2);
        l46Var2.setMaxWidth(je5.a(charSequence2, l46Var2.getPaint()));
        l46Var2.requestLayout();
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.Wc));
        hashSet.add(Integer.valueOf(bkb.A6));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setEmoji(int i) {
        if (this.f != i) {
            this.f = i;
            oy8 oy8Var = new oy8(i, gl.L(90.0f), gl.L(90.0f));
            be0 be0Var = this.b;
            be0Var.setImageDrawable(oy8Var);
            be0Var.getImageReceiver().M(2);
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
            be0 be0Var = this.b;
            be0Var.b();
            this.f = i;
            be0Var.setImageResource(i);
        }
    }

    public void setText(CharSequence charSequence) {
        this.c.setVisibility(8);
        l46 l46Var = this.d;
        l46Var.setText(charSequence);
        l46Var.setMaxWidth(je5.a(charSequence, l46Var.getPaint()));
        l46Var.requestLayout();
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i;
        int i2 = bkb.F6;
        wjb wjbVar = this.a;
        int v0 = bkb.v0(i2, wjbVar);
        l46 l46Var = this.c;
        l46Var.setTextColor(v0);
        int i3 = bkb.Wc;
        l46Var.setLinkTextColor(bkb.v0(i3, wjbVar));
        if (l46Var.getVisibility() != 0) {
            i2 = bkb.A6;
        }
        int v02 = bkb.v0(i2, wjbVar);
        l46 l46Var2 = this.d;
        l46Var2.setTextColor(v02);
        l46Var2.setLinkTextColor(bkb.v0(i3, wjbVar));
        int i4 = this.e;
        if (l46Var.getVisibility() == 0) {
            i = 0;
        } else {
            i = 9;
        }
        this.b.setLayoutParams(nme.t(i4, i4, 17, 0, i, 0, 9));
    }
}
