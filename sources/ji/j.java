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
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.da0;
public final class j extends LinearLayout implements a6 {
    public final f6 f17096a;
    public final da0 f17097b;
    public final FrameLayout f17098c;
    public final ImageView d;
    public final TextView f17099e;
    public final TextView f17100f;
    public final boolean h;
    public boolean f17101n;

    public j(Context context, f6 f6Var, boolean z9) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        this.f17096a = f6Var;
        this.h = z9;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17098c = frameLayout;
        da0 da0Var = new da0(1);
        this.f17097b = da0Var;
        frameLayout.setBackground(da0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, ha.e(24, 24, 17));
        LinearLayout f10 = k5.f(context, 1);
        TextView textView = new TextView(context);
        this.f17099e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f11 = q.f(f10, textView, ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f17100f = f11;
        f11.setGravity(17);
        f11.setMinWidth(g0.L(20.66f));
        f11.setPadding(g0.L(6.33f), 0, g0.L(6.33f), 0);
        f11.setTextSize(1, 16.0f);
        if (hd.f22878a0) {
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
        this.f17098c.setVisibility(i12);
        if (i11 == 0) {
            f10 = g0.L(2.0f);
        } else {
            f10 = 0.0f;
        }
        this.f17099e.setTranslationX(f10);
        this.f17097b.b(i7, i10);
        this.d.setImageResource(i11);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z9);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.G6));
        hashSet.add(Integer.valueOf(k6.U8));
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
        this.f17099e.setText(charSequence);
    }

    public void setUnreadMode(boolean z9) {
        float f10;
        Typeface typeface;
        int i7;
        if (this.f17101n != z9) {
            this.f17101n = z9;
            if (z9) {
                f10 = 13.0f;
            } else {
                f10 = 16.0f;
            }
            TextView textView = this.f17100f;
            textView.setTextSize(1, f10);
            ShapeDrawable shapeDrawable = null;
            if (z9) {
                typeface = g0.o();
            } else {
                typeface = null;
            }
            textView.setTypeface(typeface);
            if (z9) {
                i7 = k6.W8;
            } else {
                i7 = k6.f28031n6;
            }
            f6 f6Var = this.f17096a;
            r6.V(textView, i7, f6Var);
            if (z9) {
                shapeDrawable = k6.d0(g0.L(10.33f), k6.w0(k6.U8, f6Var));
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
        TextView textView = this.f17100f;
        textView.setVisibility(i7);
        textView.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i7;
        ShapeDrawable shapeDrawable;
        boolean q10;
        int i10 = k6.G6;
        f6 f6Var = this.f17096a;
        this.f17099e.setTextColor(k6.w0(i10, f6Var));
        if (this.f17101n) {
            i7 = k6.W8;
        } else {
            i7 = k6.f28031n6;
        }
        int w02 = k6.w0(i7, f6Var);
        TextView textView = this.f17100f;
        textView.setTextColor(w02);
        if (this.f17101n) {
            shapeDrawable = k6.d0(g0.L(10.33f), k6.w0(k6.U8, f6Var));
        } else {
            shapeDrawable = null;
        }
        textView.setBackground(shapeDrawable);
        if (f6Var != null) {
            q10 = f6Var.a();
        } else {
            q10 = k6.I.q();
        }
        this.f17097b.f32849b = q10;
    }
}
