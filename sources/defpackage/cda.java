package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class cda extends FrameLayout {
    public final bf0 a;
    public final uca b;
    public final TextView c;
    public long d;
    public long e;
    public final int f;
    public final ylb h;

    public cda(Context context, ylb ylbVar) {
        super(context);
        this.f = z8c.t0;
        this.h = ylbVar;
        setWillNotDraw(false);
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        bf0Var.setRoundRadius(gm.L(28.0f));
        addView(bf0Var, qoe.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        anb.X(textView, cmb.i5, ylbVar);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, qoe.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.b = new uca(this, ylbVar, (byte) 1);
        int i = cmb.h6;
        Drawable Y = cmb.Y(cmb.w0(null, i, false), gm.L(2.0f), gm.L(2.0f));
        wmb M = anb.M(i);
        setBackground(Y);
        anb.j(this, Y, null, M, null);
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.e;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(103.0f), 1073741824));
    }

    public void setAsNewBotForumTopic(boolean z) {
        int i;
        if (z) {
            i = 2131745169;
        } else {
            i = 2131745168;
        }
        this.c.setText(jb6.M0(i, null));
        bf0 bf0Var = this.a;
        bf0Var.setAnimatedEmojiDrawable(null);
        ko4 ko4Var = new ko4(ko4.k[0]);
        o26 o26Var = new o26(1, null);
        o26Var.a("");
        o26Var.i = 1.8f;
        sn2 sn2Var = new sn2(ko4Var, o26Var, 0, 0);
        sn2Var.x = true;
        bf0Var.setImageDrawable(sn2Var);
    }
}
