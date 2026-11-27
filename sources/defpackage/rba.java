package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class rba extends LinearLayout implements snb {
    public final vnb a;
    public final n57 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public boolean n;
    public boolean r;

    public rba(Context context, vnb vnbVar) {
        super(context);
        this.n = true;
        this.a = vnbVar;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        n57 n57Var = new n57((byte) 1);
        this.b = n57Var;
        frameLayout.setBackground(n57Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, tre.e(24, 24, 17));
        LinearLayout j = uh9.j(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView m = ik8.m(j, textView, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = m;
        m.setTextSize(1, 13.0f);
        TextView m2 = ik8.m(j, m, tre.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = m2;
        m2.setTextSize(1, 16.0f);
        if (ob6.a0) {
            addView(m2, tre.t(-2, -2, 16, 20, 0, 0, 0));
            addView(j, tre.q(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, tre.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, tre.t(28, 28, 19, 18, 0, 0, 0));
            addView(j, tre.q(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(m2, tre.t(-2, -2, 16, 0, 0, 20, 0));
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.n6));
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
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(hl.L(f), 1073741824));
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
        int i = aob.G6;
        vnb vnbVar = this.a;
        this.e.setTextColor(aob.v0(i, vnbVar));
        this.f.setTextColor(aob.v0(aob.y6, vnbVar));
        this.h.setTextColor(aob.v0(aob.n6, vnbVar));
        if (this.n && (vnbVar == null ? aob.I.o() : vnbVar.a())) {
            z = true;
        } else {
            z = false;
        }
        this.b.b = z;
    }
}
