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
import c8.ja;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.fa0;
public final class j extends LinearLayout implements z5 {
    public final e6 f20673a;
    public final fa0 f20674b;
    public final FrameLayout f20675c;
    public final ImageView d;
    public final TextView f20676e;
    public final TextView f20677f;
    public final boolean h;
    public boolean f20678n;

    public j(Context context, e6 e6Var, boolean z10) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        this.f20673a = e6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f20675c = frameLayout;
        fa0 fa0Var = new fa0(1);
        this.f20674b = fa0Var;
        frameLayout.setBackground(fa0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, ja.e(24, 24, 17));
        LinearLayout f10 = k5.f(context, 1);
        TextView textView = new TextView(context);
        this.f20676e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f11 = i20.f(f10, textView, ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f20677f = f11;
        f11.setGravity(17);
        f11.setMinWidth(g0.L(20.66f));
        f11.setPadding(g0.L(6.33f), 0, g0.L(6.33f), 0);
        f11.setTextSize(1, 16.0f);
        if (hd.f24104a0) {
            addView(f11, ja.j(13.33f, 0.0f));
            if (z10) {
                i11 = 12;
            } else {
                i11 = 16;
            }
            addView(f10, ja.q(0, -2, 1.0f, 23, 20, 0, i11, 0));
            if (z10) {
                i12 = 9;
            } else {
                i12 = 14;
            }
            addView(frameLayout, ja.t(28, 28, 21, 0, 0, i12, 0));
        } else {
            if (z10) {
                i7 = 9;
            } else {
                i7 = 14;
            }
            addView(frameLayout, ja.t(28, 28, 19, i7, 0, 0, 0));
            if (z10) {
                i10 = 12;
            } else {
                i10 = 16;
            }
            addView(f10, ja.q(0, -2, 1.0f, 23, i10, 0, 20, 0));
            addView(f11, ja.j(0.0f, 13.33f));
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
        this.f20675c.setVisibility(i12);
        if (i11 == 0) {
            f10 = g0.L(2.0f);
        } else {
            f10 = 0.0f;
        }
        this.f20676e.setTranslationX(f10);
        this.f20674b.b(i7, i10);
        this.d.setImageResource(i11);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.G6));
        hashSet.add(Integer.valueOf(j6.U8));
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
        this.f20676e.setText(charSequence);
    }

    public void setUnreadMode(boolean z10) {
        float f10;
        Typeface typeface;
        int i7;
        if (this.f20678n != z10) {
            this.f20678n = z10;
            if (z10) {
                f10 = 13.0f;
            } else {
                f10 = 16.0f;
            }
            TextView textView = this.f20677f;
            textView.setTextSize(1, f10);
            ShapeDrawable shapeDrawable = null;
            if (z10) {
                typeface = g0.o();
            } else {
                typeface = null;
            }
            textView.setTypeface(typeface);
            if (z10) {
                i7 = j6.W8;
            } else {
                i7 = j6.f29031n6;
            }
            e6 e6Var = this.f20673a;
            q6.U(textView, i7, e6Var);
            if (z10) {
                shapeDrawable = j6.d0(g0.L(10.33f), j6.w0(j6.U8, e6Var));
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
        TextView textView = this.f20677f;
        textView.setVisibility(i7);
        textView.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i7;
        ShapeDrawable shapeDrawable;
        boolean q10;
        int i10 = j6.G6;
        e6 e6Var = this.f20673a;
        this.f20676e.setTextColor(j6.w0(i10, e6Var));
        if (this.f20678n) {
            i7 = j6.W8;
        } else {
            i7 = j6.f29031n6;
        }
        int w02 = j6.w0(i7, e6Var);
        TextView textView = this.f20677f;
        textView.setTextColor(w02);
        if (this.f20678n) {
            shapeDrawable = j6.d0(g0.L(10.33f), j6.w0(j6.U8, e6Var));
        } else {
            shapeDrawable = null;
        }
        textView.setBackground(shapeDrawable);
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = j6.I.q();
        }
        this.f20674b.f34552b = q10;
    }
}
