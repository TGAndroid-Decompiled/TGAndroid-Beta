package oh;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import j3.r0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.xa0;
public final class i extends LinearLayout implements w5 {
    public final b6 f19602a;
    public final xa0 f19603b;
    public final FrameLayout f19604c;
    public final ImageView d;
    public final TextView f19605e;
    public final TextView f19606f;
    public final boolean h;
    public boolean f19607n;

    public i(Context context, b6 b6Var, boolean z10) {
        super(context);
        int i9;
        int i10;
        int i11;
        int i12;
        this.f19602a = b6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f19604c = frameLayout;
        xa0 xa0Var = new xa0(1);
        this.f19603b = xa0Var;
        frameLayout.setBackground(xa0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, e6.e(24, 24, 17));
        LinearLayout f10 = ll.f(context, 1);
        TextView textView = new TextView(context);
        this.f19605e = textView;
        textView.setTextSize(1, 16.0f);
        TextView h = r0.h(f10, textView, e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f19606f = h;
        h.setGravity(17);
        h.setMinWidth(AndroidUtilities.dp(20.66f));
        h.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        h.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(h, e6.j(13.33f, 0.0f));
            if (z10) {
                i11 = 12;
            } else {
                i11 = 16;
            }
            addView(f10, e6.p(0, -2, 1.0f, 23, 20, 0, i11, 0));
            if (z10) {
                i12 = 9;
            } else {
                i12 = 14;
            }
            addView(frameLayout, e6.t(28, 28, 21, 0, 0, i12, 0));
        } else {
            if (z10) {
                i9 = 9;
            } else {
                i9 = 14;
            }
            addView(frameLayout, e6.t(28, 28, 19, i9, 0, 0, 0));
            if (z10) {
                i10 = 12;
            } else {
                i10 = 16;
            }
            addView(f10, e6.p(0, -2, 1.0f, 23, i10, 0, 20, 0));
            addView(h, e6.j(0.0f, 13.33f));
        }
        d();
        setUnreadMode(true);
    }

    public final void a(int i9, int i10, int i11, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        int i12;
        float f10;
        if (i11 != 0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f19604c.setVisibility(i12);
        if (i11 == 0) {
            f10 = AndroidUtilities.dp(2.0f);
        } else {
            f10 = 0.0f;
        }
        this.f19605e.setTranslationX(f10);
        this.f19603b.b(i9, i10);
        this.d.setImageResource(i11);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z10);
    }

    @Override
    public final void d() {
        int i9;
        ShapeDrawable shapeDrawable;
        boolean q10;
        int i10 = f6.G6;
        b6 b6Var = this.f19602a;
        this.f19605e.setTextColor(f6.v0(i10, b6Var));
        if (this.f19607n) {
            i9 = f6.W8;
        } else {
            i9 = f6.f23179n6;
        }
        int v02 = f6.v0(i9, b6Var);
        TextView textView = this.f19606f;
        textView.setTextColor(v02);
        if (this.f19607n) {
            shapeDrawable = f6.b0(AndroidUtilities.dp(10.33f), f6.v0(f6.U8, b6Var));
        } else {
            shapeDrawable = null;
        }
        textView.setBackground(shapeDrawable);
        if (b6Var != null) {
            q10 = b6Var.a();
        } else {
            q10 = f6.I.q();
        }
        this.f19603b.f34630b = q10;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824);
        if (this.h) {
            f10 = 44.0f;
        } else {
            f10 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }

    public void setTitle(CharSequence charSequence) {
        this.f19605e.setText(charSequence);
    }

    public void setUnreadMode(boolean z10) {
        float f10;
        Typeface typeface;
        int i9;
        if (this.f19607n != z10) {
            this.f19607n = z10;
            if (z10) {
                f10 = 13.0f;
            } else {
                f10 = 16.0f;
            }
            TextView textView = this.f19606f;
            textView.setTextSize(1, f10);
            ShapeDrawable shapeDrawable = null;
            if (z10) {
                typeface = AndroidUtilities.bold();
            } else {
                typeface = null;
            }
            textView.setTypeface(typeface);
            if (z10) {
                i9 = f6.W8;
            } else {
                i9 = f6.f23179n6;
            }
            b6 b6Var = this.f19602a;
            textView.setTextColor(f6.v0(i9, b6Var));
            if (z10) {
                shapeDrawable = f6.b0(AndroidUtilities.dp(10.33f), f6.v0(f6.U8, b6Var));
            }
            textView.setBackground(shapeDrawable);
        }
    }

    public void setValue(CharSequence charSequence) {
        int i9;
        if (!TextUtils.isEmpty(charSequence)) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        TextView textView = this.f19606f;
        textView.setVisibility(i9);
        textView.setText(charSequence);
    }
}
