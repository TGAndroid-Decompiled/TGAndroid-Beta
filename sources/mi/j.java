package mi;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ra0;
public final class j extends LinearLayout implements b6 {
    public final h6 f21062a;
    public final ra0 f21063b;
    public final FrameLayout f21064c;
    public final ImageView d;
    public final TextView f21065e;
    public final TextView f21066f;
    public final boolean h;
    public boolean f21067n;

    public j(Context context, h6 h6Var, boolean z10) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        this.f21062a = h6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f21064c = frameLayout;
        ra0 ra0Var = new ra0(1);
        this.f21063b = ra0Var;
        frameLayout.setBackground(ra0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, ma.e(24, 24, 17));
        LinearLayout g10 = f3.g(context, 1);
        TextView textView = new TextView(context);
        this.f21065e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f10 = n10.f(g10, textView, ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f21066f = f10;
        f10.setGravity(17);
        f10.setMinWidth(g0.L(20.66f));
        f10.setPadding(g0.L(6.33f), 0, g0.L(6.33f), 0);
        f10.setTextSize(1, 16.0f);
        if (gd.f24241a0) {
            addView(f10, ma.j(13.33f, 0.0f));
            if (z10) {
                i11 = 12;
            } else {
                i11 = 16;
            }
            addView(g10, ma.q(0, -2, 1.0f, 23, 20, 0, i11, 0));
            if (z10) {
                i12 = 9;
            } else {
                i12 = 14;
            }
            addView(frameLayout, ma.t(28, 28, 21, 0, 0, i12, 0));
        } else {
            if (z10) {
                i7 = 9;
            } else {
                i7 = 14;
            }
            addView(frameLayout, ma.t(28, 28, 19, i7, 0, 0, 0));
            if (z10) {
                i10 = 12;
            } else {
                i10 = 16;
            }
            addView(g10, ma.q(0, -2, 1.0f, 23, i10, 0, 20, 0));
            addView(f10, ma.j(0.0f, 13.33f));
        }
        updateColors();
        setUnreadMode(true);
    }

    public final void a(int i7, int i10, int i11, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        int i12;
        float f10;
        if (i11 != 0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f21064c.setVisibility(i12);
        if (i11 == 0) {
            f10 = g0.L(2.0f);
        } else {
            f10 = 0.0f;
        }
        this.f21065e.setTranslationX(f10);
        this.f21063b.b(i7, i10);
        this.d.setImageResource(i11);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.G6));
        hashSet.add(Integer.valueOf(m6.U8));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.h) {
            f10 = 44.0f;
        } else {
            f10 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(g0.L(f10), 1073741824));
    }

    public void setTitle(CharSequence charSequence) {
        this.f21065e.setText(charSequence);
    }

    public void setUnreadMode(boolean z10) {
        float f10;
        Typeface typeface;
        int i7;
        if (this.f21067n != z10) {
            this.f21067n = z10;
            if (z10) {
                f10 = 13.0f;
            } else {
                f10 = 16.0f;
            }
            TextView textView = this.f21066f;
            textView.setTextSize(1, f10);
            ShapeDrawable shapeDrawable = null;
            if (z10) {
                typeface = g0.o();
            } else {
                typeface = null;
            }
            textView.setTypeface(typeface);
            if (z10) {
                i7 = m6.W8;
            } else {
                i7 = m6.f29560n6;
            }
            h6 h6Var = this.f21062a;
            t6.U(textView, i7, h6Var);
            if (z10) {
                shapeDrawable = m6.d0(g0.L(10.33f), m6.w0(m6.U8, h6Var));
            }
            textView.setBackground(shapeDrawable);
        }
    }

    public void setValue(CharSequence charSequence) {
        int i7;
        if (!TextUtils.isEmpty(charSequence)) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        TextView textView = this.f21066f;
        textView.setVisibility(i7);
        textView.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i7;
        ShapeDrawable shapeDrawable;
        boolean q10;
        int i10 = m6.G6;
        h6 h6Var = this.f21062a;
        this.f21065e.setTextColor(m6.w0(i10, h6Var));
        if (this.f21067n) {
            i7 = m6.W8;
        } else {
            i7 = m6.f29560n6;
        }
        int w02 = m6.w0(i7, h6Var);
        TextView textView = this.f21066f;
        textView.setTextColor(w02);
        if (this.f21067n) {
            shapeDrawable = m6.d0(g0.L(10.33f), m6.w0(m6.U8, h6Var));
        } else {
            shapeDrawable = null;
        }
        textView.setBackground(shapeDrawable);
        if (h6Var != null) {
            q10 = h6Var.d();
        } else {
            q10 = m6.I.q();
        }
        this.f21063b.f39128b = q10;
    }
}
