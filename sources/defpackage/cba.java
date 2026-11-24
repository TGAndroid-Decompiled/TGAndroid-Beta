package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class cba extends FrameLayout {
    public final be0 a;
    public final uaa b;
    public final TextView c;
    public long d;
    public long e;
    public final int f;
    public final wjb h;

    public cba(Context context, wjb wjbVar) {
        super(context);
        this.f = y6c.t0;
        this.h = wjbVar;
        setWillNotDraw(false);
        be0 be0Var = new be0(context);
        this.a = be0Var;
        be0Var.setRoundRadius(gl.L(28.0f));
        addView(be0Var, nme.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        zkb.X(textView, bkb.i5, wjbVar);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, nme.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.b = new uaa(this, wjbVar, (byte) 1);
        int i = bkb.h6;
        Drawable Y = bkb.Y(bkb.w0(null, i, false), gl.L(2.0f), gl.L(2.0f));
        vkb M = zkb.M(i);
        setBackground(Y);
        zkb.j(this, Y, null, M, null);
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.e;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(103.0f), 1073741824));
    }

    public void setAsNewBotForumTopic(boolean z) {
        int i;
        if (z) {
            i = 2131745243;
        } else {
            i = 2131745242;
        }
        this.c.setText(k96.M0(i, null));
        be0 be0Var = this.a;
        be0Var.setAnimatedEmojiDrawable(null);
        jm4 jm4Var = new jm4(jm4.k[0]);
        o06 o06Var = new o06(1, null);
        o06Var.a("");
        o06Var.i = 1.8f;
        fm2 fm2Var = new fm2(jm4Var, o06Var, 0, 0);
        fm2Var.x = true;
        be0Var.setImageDrawable(fm2Var);
    }
}
