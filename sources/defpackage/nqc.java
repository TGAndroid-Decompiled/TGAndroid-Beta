package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class nqc extends FrameLayout implements snb {
    public final vnb a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public nqc(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
        setPadding(hl.L(36.0f), hl.L(8.0f), hl.L(36.0f), hl.L(8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        addView(imageView, tre.d(28, 28.0f, 51, 0.0f, 2.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, tre.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        bs2.t(textView, 1, 14.0f);
        TextView m = ik8.m(linearLayout, textView, tre.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.d = m;
        m.setTextSize(1, 14.0f);
        linearLayout.addView(m, tre.t(-1, -2, 55, 0, 0, 0, 2));
        updateColors();
    }

    public final void a(int i, CharSequence charSequence, CharSequence charSequence2) {
        this.b.setImageResource(i);
        this.c.setText(charSequence);
        this.d.setText(charSequence2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.z6));
    }

    @Override
    public final void updateColors() {
        int i = aob.G6;
        vnb vnbVar = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(aob.v0(i, vnbVar), PorterDuff.Mode.SRC_IN));
        this.c.setTextColor(aob.v0(i, vnbVar));
        this.d.setTextColor(aob.v0(aob.z6, vnbVar));
    }
}
