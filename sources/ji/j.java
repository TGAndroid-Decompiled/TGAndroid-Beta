package ji;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.ea0;
public final class j extends LinearLayout implements b6 {
    public final g6 f17099a;
    public final ea0 f17100b;
    public final FrameLayout f17101c;
    public final ImageView d;
    public final TextView f17102e;
    public final TextView f17103f;
    public final boolean h;
    public boolean f17104n;

    public j(Context context, g6 g6Var, boolean z9) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        this.f17099a = g6Var;
        this.h = z9;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17101c = frameLayout;
        ea0 ea0Var = new ea0(1);
        this.f17100b = ea0Var;
        frameLayout.setBackground(ea0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, ha.e(24, 24, 17));
        LinearLayout f10 = k5.f(context, 1);
        TextView textView = new TextView(context);
        this.f17102e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f11 = q.f(f10, textView, ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f17103f = f11;
        f11.setGravity(17);
        f11.setMinWidth(g0.L(20.66f));
        f11.setPadding(g0.L(6.33f), 0, g0.L(6.33f), 0);
        f11.setTextSize(1, 16.0f);
        if (id.f23157a0) {
            addView(f11, ha.j(13.33f, 0.0f));
            if (z9) {
                i11 = 12;
            } else {
                i11 = 16;
            }
            addView(f10, ha.q(0, -2, 1.0f, 23, 20, 0, i11, 0));
            if (z9) {
                i12 = 9;
            } else {
                i12 = 14;
            }
            addView(frameLayout, ha.t(28, 28, 21, 0, 0, i12, 0));
        } else {
            if (z9) {
                i7 = 9;
            } else {
                i7 = 14;
            }
            addView(frameLayout, ha.t(28, 28, 19, i7, 0, 0, 0));
            if (z9) {
                i10 = 12;
            } else {
                i10 = 16;
            }
            addView(f10, ha.q(0, -2, 1.0f, 23, i10, 0, 20, 0));
            addView(f11, ha.j(0.0f, 13.33f));
        }
        updateColors();
        setUnreadMode(true);
    }

    public final void a(int i7, int i10, int i11, CharSequence charSequence, CharSequence charSequence2, boolean z9) {
        int i12;
        float f10;
        if (i11 != 0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f17101c.setVisibility(i12);
        if (i11 == 0) {
            f10 = g0.L(2.0f);
        } else {
            f10 = 0.0f;
        }
        this.f17102e.setTranslationX(f10);
        this.f17100b.b(i7, i10);
        this.d.setImageResource(i11);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z9);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6.G6));
        hashSet.add(Integer.valueOf(l6.U8));
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
        this.f17102e.setText(charSequence);
    }

    public void setUnreadMode(boolean z9) {
        float f10;
        Typeface typeface;
        int i7;
        if (this.f17104n != z9) {
            this.f17104n = z9;
            if (z9) {
                f10 = 13.0f;
            } else {
                f10 = 16.0f;
            }
            TextView textView = this.f17103f;
            textView.setTextSize(1, f10);
            ShapeDrawable shapeDrawable = null;
            if (z9) {
                typeface = g0.o();
            } else {
                typeface = null;
            }
            textView.setTypeface(typeface);
            if (z9) {
                i7 = l6.W8;
            } else {
                i7 = l6.f28047n6;
            }
            g6 g6Var = this.f17099a;
            s6.U(textView, i7, g6Var);
            if (z9) {
                shapeDrawable = l6.d0(g0.L(10.33f), l6.w0(l6.U8, g6Var));
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
        TextView textView = this.f17103f;
        textView.setVisibility(i7);
        textView.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i7;
        ShapeDrawable shapeDrawable;
        boolean q10;
        int i10 = l6.G6;
        g6 g6Var = this.f17099a;
        this.f17102e.setTextColor(l6.w0(i10, g6Var));
        if (this.f17104n) {
            i7 = l6.W8;
        } else {
            i7 = l6.f28047n6;
        }
        int w02 = l6.w0(i7, g6Var);
        TextView textView = this.f17103f;
        textView.setTextColor(w02);
        if (this.f17104n) {
            shapeDrawable = l6.d0(g0.L(10.33f), l6.w0(l6.U8, g6Var));
        } else {
            shapeDrawable = null;
        }
        textView.setBackground(shapeDrawable);
        if (g6Var != null) {
            q10 = g6Var.a();
        } else {
            q10 = l6.I.q();
        }
        this.f17100b.f33353b = q10;
    }
}
