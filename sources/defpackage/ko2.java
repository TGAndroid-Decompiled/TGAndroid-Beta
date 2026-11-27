package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class ko2 extends LinearLayout implements snb {
    public final vnb a;
    public final n57 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final boolean h;
    public boolean n;

    public ko2(vnb vnbVar, Context context, boolean z) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        this.a = vnbVar;
        this.h = z;
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
        m.setGravity(17);
        m.setMinWidth(hl.L(20.66f));
        m.setPadding(hl.L(6.33f), 0, hl.L(6.33f), 0);
        m.setTextSize(1, 16.0f);
        if (ob6.a0) {
            addView(m, tre.j(13.33f, 0.0f));
            if (z) {
                i3 = 12;
            } else {
                i3 = 16;
            }
            addView(j, tre.q(0, -2, 1.0f, 23, 20, 0, i3, 0));
            if (z) {
                i4 = 9;
            } else {
                i4 = 14;
            }
            addView(frameLayout, tre.t(28, 28, 21, 0, 0, i4, 0));
        } else {
            if (z) {
                i = 9;
            } else {
                i = 14;
            }
            addView(frameLayout, tre.t(28, 28, 19, i, 0, 0, 0));
            if (z) {
                i2 = 12;
            } else {
                i2 = 16;
            }
            addView(j, tre.q(0, -2, 1.0f, 23, i2, 0, 20, 0));
            addView(m, tre.j(0.0f, 13.33f));
        }
        updateColors();
        setUnreadMode(true);
    }

    public final void a(int i, int i2, int i3, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        int i4;
        float f;
        if (i3 != 0) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        this.c.setVisibility(i4);
        if (i3 == 0) {
            f = hl.L(2.0f);
        } else {
            f = 0.0f;
        }
        this.e.setTranslationX(f);
        this.b.b(i, i2);
        this.d.setImageResource(i3);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.U8));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (this.h) {
            f = 44.0f;
        } else {
            f = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(hl.L(f), 1073741824));
    }

    public void setTitle(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    public void setUnreadMode(boolean z) {
        float f;
        Typeface typeface;
        int i;
        if (this.n != z) {
            this.n = z;
            if (z) {
                f = 13.0f;
            } else {
                f = 16.0f;
            }
            TextView textView = this.f;
            textView.setTextSize(1, f);
            ShapeDrawable shapeDrawable = null;
            if (z) {
                typeface = hl.o();
            } else {
                typeface = null;
            }
            textView.setTypeface(typeface);
            if (z) {
                i = aob.W8;
            } else {
                i = aob.n6;
            }
            vnb vnbVar = this.a;
            yob.X(textView, i, vnbVar);
            if (z) {
                shapeDrawable = aob.b0(hl.L(10.33f), aob.v0(aob.U8, vnbVar));
            }
            textView.setBackground(shapeDrawable);
        }
    }

    public void setValue(CharSequence charSequence) {
        int i;
        if (!TextUtils.isEmpty(charSequence)) {
            i = 0;
        } else {
            i = 8;
        }
        TextView textView = this.f;
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i;
        ShapeDrawable shapeDrawable;
        boolean o;
        int i2 = aob.G6;
        vnb vnbVar = this.a;
        this.e.setTextColor(aob.v0(i2, vnbVar));
        if (this.n) {
            i = aob.W8;
        } else {
            i = aob.n6;
        }
        int v0 = aob.v0(i, vnbVar);
        TextView textView = this.f;
        textView.setTextColor(v0);
        if (this.n) {
            shapeDrawable = aob.b0(hl.L(10.33f), aob.v0(aob.U8, vnbVar));
        } else {
            shapeDrawable = null;
        }
        textView.setBackground(shapeDrawable);
        if (vnbVar != null) {
            o = vnbVar.a();
        } else {
            o = aob.I.o();
        }
        this.b.b = o;
    }
}
