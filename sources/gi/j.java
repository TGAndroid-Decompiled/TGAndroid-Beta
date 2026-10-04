package gi;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ok;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Components.dc0;
import w7.z5;
public final class j extends LinearLayout implements y5 {
    public final d6 f10917a;
    public final dc0 f10918b;
    public final FrameLayout f10919c;
    public final ImageView d;
    public final TextView f10920e;
    public final TextView f10921f;
    public final boolean h;
    public boolean f10922n;

    public j(Context context, d6 d6Var, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        this.f10917a = d6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10919c = frameLayout;
        dc0 dc0Var = new dc0(1);
        this.f10918b = dc0Var;
        frameLayout.setBackground(dc0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, z5.e(24, 24, 17));
        LinearLayout f7 = ok.f(context, 1);
        TextView textView = new TextView(context);
        this.f10920e = textView;
        textView.setTextSize(1, 16.0f);
        TextView h = e2.h(f7, textView, z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f10921f = h;
        h.setGravity(17);
        h.setMinWidth(AndroidUtilities.dp(20.66f));
        h.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        h.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(h, z5.j(13.33f, 0.0f));
            if (z10) {
                i12 = 12;
            } else {
                i12 = 16;
            }
            addView(f7, z5.p(0, -2, 1.0f, 23, 20, 0, i12, 0));
            if (z10) {
                i13 = 9;
            } else {
                i13 = 14;
            }
            addView(frameLayout, z5.t(28, 28, 21, 0, 0, i13, 0));
        } else {
            if (z10) {
                i10 = 9;
            } else {
                i10 = 14;
            }
            addView(frameLayout, z5.t(28, 28, 19, i10, 0, 0, 0));
            if (z10) {
                i11 = 12;
            } else {
                i11 = 16;
            }
            addView(f7, z5.p(0, -2, 1.0f, 23, i11, 0, 20, 0));
            addView(h, z5.j(0.0f, 13.33f));
        }
        e();
        setUnreadMode(true);
    }

    public final void a(int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        int i13;
        float f7;
        if (i12 != 0) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        this.f10919c.setVisibility(i13);
        if (i12 == 0) {
            f7 = AndroidUtilities.dp(2.0f);
        } else {
            f7 = 0.0f;
        }
        this.f10920e.setTranslationX(f7);
        this.f10918b.b(i10, i11);
        this.d.setImageResource(i12);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z10);
    }

    @Override
    public final void e() {
        int i10;
        ShapeDrawable shapeDrawable;
        boolean q6;
        int i11 = i6.G6;
        d6 d6Var = this.f10917a;
        this.f10920e.setTextColor(i6.v0(i11, d6Var));
        if (this.f10922n) {
            i10 = i6.W8;
        } else {
            i10 = i6.f21003n6;
        }
        int v02 = i6.v0(i10, d6Var);
        TextView textView = this.f10921f;
        textView.setTextColor(v02);
        if (this.f10922n) {
            shapeDrawable = i6.b0(AndroidUtilities.dp(10.33f), i6.v0(i6.U8, d6Var));
        } else {
            shapeDrawable = null;
        }
        textView.setBackground(shapeDrawable);
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = i6.I.q();
        }
        this.f10918b.f25693b = q6;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.h) {
            f7 = 44.0f;
        } else {
            f7 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }

    public void setTitle(CharSequence charSequence) {
        this.f10920e.setText(charSequence);
    }

    public void setUnreadMode(boolean z10) {
        float f7;
        Typeface typeface;
        int i10;
        if (this.f10922n != z10) {
            this.f10922n = z10;
            if (z10) {
                f7 = 13.0f;
            } else {
                f7 = 16.0f;
            }
            TextView textView = this.f10921f;
            textView.setTextSize(1, f7);
            ShapeDrawable shapeDrawable = null;
            if (z10) {
                typeface = AndroidUtilities.bold();
            } else {
                typeface = null;
            }
            textView.setTypeface(typeface);
            if (z10) {
                i10 = i6.W8;
            } else {
                i10 = i6.f21003n6;
            }
            d6 d6Var = this.f10917a;
            textView.setTextColor(i6.v0(i10, d6Var));
            if (z10) {
                shapeDrawable = i6.b0(AndroidUtilities.dp(10.33f), i6.v0(i6.U8, d6Var));
            }
            textView.setBackground(shapeDrawable);
        }
    }

    public void setValue(CharSequence charSequence) {
        int i10;
        if (!TextUtils.isEmpty(charSequence)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        TextView textView = this.f10921f;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }
}
