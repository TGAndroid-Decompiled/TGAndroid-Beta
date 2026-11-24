package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class a8a extends LinearLayout implements tjb {
    public final wjb a;
    public final g37 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public boolean n;
    public boolean r;

    public a8a(Context context, wjb wjbVar) {
        super(context);
        this.n = true;
        this.a = wjbVar;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        g37 g37Var = new g37((byte) 1);
        this.b = g37Var;
        frameLayout.setBackground(g37Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, nme.e(24, 24, 17));
        LinearLayout j = de9.j(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView m = ug8.m(j, textView, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = m;
        m.setTextSize(1, 13.0f);
        TextView m2 = ug8.m(j, m, nme.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = m2;
        m2.setTextSize(1, 16.0f);
        if (k96.a0) {
            addView(m2, nme.t(-2, -2, 16, 20, 0, 0, 0));
            addView(j, nme.q(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, nme.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, nme.t(28, 28, 19, 18, 0, 0, 0));
            addView(j, nme.q(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(m2, nme.t(-2, -2, 16, 0, 0, 20, 0));
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.m6));
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
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gl.L(f), 1073741824));
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
        int i = bkb.F6;
        wjb wjbVar = this.a;
        this.e.setTextColor(bkb.v0(i, wjbVar));
        this.f.setTextColor(bkb.v0(bkb.x6, wjbVar));
        this.h.setTextColor(bkb.v0(bkb.m6, wjbVar));
        if (this.n && (wjbVar == null ? bkb.I.o() : wjbVar.a())) {
            z = true;
        } else {
            z = false;
        }
        this.b.b = z;
    }
}
