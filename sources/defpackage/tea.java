package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class tea extends FrameLayout {
    public final de0 a;
    public final lea b;
    public final TextView c;
    public long d;
    public long e;
    public final int f;
    public final vnb h;

    public tea(Context context, vnb vnbVar) {
        super(context);
        this.f = yac.t0;
        this.h = vnbVar;
        setWillNotDraw(false);
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.setRoundRadius(hl.L(28.0f));
        addView(de0Var, tre.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        yob.X(textView, aob.j5, vnbVar);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, tre.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.b = new lea(this, vnbVar, (byte) 1);
        int i = aob.i6;
        Drawable Y = aob.Y(aob.w0(null, i, false), hl.L(2.0f), hl.L(2.0f));
        uob M = yob.M(i);
        setBackground(Y);
        yob.j(this, Y, null, M, null);
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.e;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(103.0f), 1073741824));
    }

    public void setAsNewBotForumTopic(boolean z) {
        int i;
        if (z) {
            i = 2131745163;
        } else {
            i = 2131745162;
        }
        this.c.setText(ob6.M0(i, null));
        de0 de0Var = this.a;
        de0Var.setAnimatedEmojiDrawable(null);
        oo4 oo4Var = new oo4(oo4.k[0]);
        s26 s26Var = new s26(1, null);
        s26Var.a("");
        s26Var.i = 1.8f;
        zm2 zm2Var = new zm2(oo4Var, s26Var, 0, 0);
        zm2Var.x = true;
        de0Var.setImageDrawable(zm2Var);
    }
}
