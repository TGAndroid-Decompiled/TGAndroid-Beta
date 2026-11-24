package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class amc extends FrameLayout implements tjb {
    public final wjb a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public amc(Context context, wjb wjbVar) {
        super(context);
        this.a = wjbVar;
        setPadding(gl.L(36.0f), gl.L(8.0f), gl.L(36.0f), gl.L(8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        addView(imageView, nme.d(28, 28.0f, 51, 0.0f, 2.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, nme.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        ir2.t(textView, 1, 14.0f);
        TextView m = ug8.m(linearLayout, textView, nme.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.d = m;
        m.setTextSize(1, 14.0f);
        linearLayout.addView(m, nme.t(-1, -2, 55, 0, 0, 0, 2));
        updateColors();
    }

    public final void a(int i, CharSequence charSequence, CharSequence charSequence2) {
        this.b.setImageResource(i);
        this.c.setText(charSequence);
        this.d.setText(charSequence2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.y6));
    }

    @Override
    public final void updateColors() {
        int i = bkb.F6;
        wjb wjbVar = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(bkb.v0(i, wjbVar), PorterDuff.Mode.SRC_IN));
        this.c.setTextColor(bkb.v0(i, wjbVar));
        this.d.setTextColor(bkb.v0(bkb.y6, wjbVar));
    }
}
