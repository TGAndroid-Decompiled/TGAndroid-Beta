package ki;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.y90;
public final class j extends LinearLayout implements z5 {
    public final e6 f17341a;
    public final y90 f17342b;
    public final FrameLayout f17343c;
    public final ImageView d;
    public final TextView f17344e;
    public final TextView f17345f;
    public final boolean h;
    public boolean f17346n;

    public j(Context context, e6 e6Var, boolean z10) {
        super(context);
        int i3;
        int i10;
        int i11;
        int i12;
        this.f17341a = e6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17343c = frameLayout;
        y90 y90Var = new y90(1);
        this.f17342b = y90Var;
        frameLayout.setBackground(y90Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, mf.e(24, 24, 17));
        LinearLayout f10 = k5.f(context, 1);
        TextView textView = new TextView(context);
        this.f17344e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f11 = q.f(f10, textView, mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f17345f = f11;
        f11.setGravity(17);
        f11.setMinWidth(g0.L(20.66f));
        f11.setPadding(g0.L(6.33f), 0, g0.L(6.33f), 0);
        f11.setTextSize(1, 16.0f);
        if (bd.f21784a0) {
            addView(f11, mf.j(13.33f, 0.0f));
            if (z10) {
                i11 = 12;
            } else {
                i11 = 16;
            }
            addView(f10, mf.q(0, -2, 1.0f, 23, 20, 0, i11, 0));
            if (z10) {
                i12 = 9;
            } else {
                i12 = 14;
            }
            addView(frameLayout, mf.t(28, 28, 21, 0, 0, i12, 0));
        } else {
            if (z10) {
                i3 = 9;
            } else {
                i3 = 14;
            }
            addView(frameLayout, mf.t(28, 28, 19, i3, 0, 0, 0));
            if (z10) {
                i10 = 12;
            } else {
                i10 = 16;
            }
            addView(f10, mf.q(0, -2, 1.0f, 23, i10, 0, 20, 0));
            addView(f11, mf.j(0.0f, 13.33f));
        }
        updateColors();
        setUnreadMode(true);
    }

    public final void a(int i3, int i10, int i11, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        int i12;
        float f10;
        if (i11 != 0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f17343c.setVisibility(i12);
        if (i11 == 0) {
            f10 = g0.L(2.0f);
        } else {
            f10 = 0.0f;
        }
        this.f17344e.setTranslationX(f10);
        this.f17342b.b(i3, i10);
        this.d.setImageResource(i11);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.G6));
        hashSet.add(Integer.valueOf(k6.U8));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        if (this.h) {
            f10 = 44.0f;
        } else {
            f10 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(g0.L(f10), 1073741824));
    }

    public void setTitle(CharSequence charSequence) {
        this.f17344e.setText(charSequence);
    }

    public void setUnreadMode(boolean z10) {
        float f10;
        Typeface typeface;
        int i3;
        if (this.f17346n != z10) {
            this.f17346n = z10;
            if (z10) {
                f10 = 13.0f;
            } else {
                f10 = 16.0f;
            }
            TextView textView = this.f17345f;
            textView.setTextSize(1, f10);
            ShapeDrawable shapeDrawable = null;
            if (z10) {
                typeface = g0.o();
            } else {
                typeface = null;
            }
            textView.setTypeface(typeface);
            if (z10) {
                i3 = k6.W8;
            } else {
                i3 = k6.f28062n6;
            }
            e6 e6Var = this.f17341a;
            r6.V(textView, i3, e6Var);
            if (z10) {
                shapeDrawable = k6.d0(g0.L(10.33f), k6.w0(k6.U8, e6Var));
            }
            textView.setBackground(shapeDrawable);
        }
    }

    public void setValue(CharSequence charSequence) {
        int i3;
        if (!TextUtils.isEmpty(charSequence)) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        TextView textView = this.f17345f;
        textView.setVisibility(i3);
        textView.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i3;
        ShapeDrawable shapeDrawable;
        boolean q10;
        int i10 = k6.G6;
        e6 e6Var = this.f17341a;
        this.f17344e.setTextColor(k6.w0(i10, e6Var));
        if (this.f17346n) {
            i3 = k6.W8;
        } else {
            i3 = k6.f28062n6;
        }
        int w02 = k6.w0(i3, e6Var);
        TextView textView = this.f17345f;
        textView.setTextColor(w02);
        if (this.f17346n) {
            shapeDrawable = k6.d0(g0.L(10.33f), k6.w0(k6.U8, e6Var));
        } else {
            shapeDrawable = null;
        }
        textView.setBackground(shapeDrawable);
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = k6.I.q();
        }
        this.f17342b.f40668b = q10;
    }
}
