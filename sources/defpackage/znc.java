package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class znc extends FrameLayout implements vlb {
    public final ylb a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public znc(Context context, ylb ylbVar) {
        super(context);
        this.a = ylbVar;
        setPadding(gm.L(36.0f), gm.L(8.0f), gm.L(36.0f), gm.L(8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        addView(imageView, qoe.d(28, 28.0f, 51, 0.0f, 2.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, qoe.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        ts2.s(textView, 1, 14.0f);
        TextView m = wi8.m(linearLayout, textView, qoe.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.d = m;
        m.setTextSize(1, 14.0f);
        linearLayout.addView(m, qoe.t(-1, -2, 55, 0, 0, 0, 2));
        updateColors();
    }

    public final void a(int i, CharSequence charSequence, CharSequence charSequence2) {
        this.b.setImageResource(i);
        this.c.setText(charSequence);
        this.d.setText(charSequence2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.y6));
    }

    @Override
    public final void updateColors() {
        int i = cmb.F6;
        ylb ylbVar = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(cmb.v0(i, ylbVar), PorterDuff.Mode.SRC_IN));
        this.c.setTextColor(cmb.v0(i, ylbVar));
        this.d.setTextColor(cmb.v0(cmb.y6, ylbVar));
    }
}
