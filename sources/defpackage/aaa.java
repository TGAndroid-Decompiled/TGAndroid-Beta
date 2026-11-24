package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class aaa extends LinearLayout implements vlb {
    public final ylb a;
    public final g57 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public boolean n;
    public boolean r;

    public aaa(Context context, ylb ylbVar) {
        super(context);
        this.n = true;
        this.a = ylbVar;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        g57 g57Var = new g57((byte) 1);
        this.b = g57Var;
        frameLayout.setBackground(g57Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, qoe.e(24, 24, 17));
        LinearLayout i = hg9.i(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView m = wi8.m(i, textView, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = m;
        m.setTextSize(1, 13.0f);
        TextView m2 = wi8.m(i, m, qoe.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = m2;
        m2.setTextSize(1, 16.0f);
        if (jb6.a0) {
            addView(m2, qoe.t(-2, -2, 16, 20, 0, 0, 0));
            addView(i, qoe.q(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, qoe.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, qoe.t(28, 28, 19, 18, 0, 0, 0));
            addView(i, qoe.q(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(m2, qoe.t(-2, -2, 16, 0, 0, 20, 0));
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.m6));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (this.r) {
            f = 60.0f;
        } else {
            f = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gm.L(f), 1073741824));
    }

    public void setValue(CharSequence charSequence) {
        int i;
        if (!TextUtils.isEmpty(charSequence)) {
            i = 0;
        } else {
            i = 8;
        }
        TextView textView = this.h;
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        boolean z;
        int i = cmb.F6;
        ylb ylbVar = this.a;
        this.e.setTextColor(cmb.v0(i, ylbVar));
        this.f.setTextColor(cmb.v0(cmb.x6, ylbVar));
        this.h.setTextColor(cmb.v0(cmb.m6, ylbVar));
        if (this.n && (ylbVar == null ? cmb.I.o() : ylbVar.a())) {
            z = true;
        } else {
            z = false;
        }
        this.b.b = z;
    }
}
