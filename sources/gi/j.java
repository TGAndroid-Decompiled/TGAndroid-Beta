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
import org.telegram.messenger.am;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.uc0;
import w7.w5;
public final class j extends LinearLayout implements x5 {
    public final c6 f10921a;
    public final uc0 f10922b;
    public final FrameLayout f10923c;
    public final ImageView d;
    public final TextView f10924e;
    public final TextView f10925f;
    public final boolean h;
    public boolean f10926n;

    public j(Context context, c6 c6Var, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        this.f10921a = c6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10923c = frameLayout;
        uc0 uc0Var = new uc0(1);
        this.f10922b = uc0Var;
        frameLayout.setBackground(uc0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, w5.e(24, 24, 17));
        LinearLayout e7 = am.e(context, 1);
        TextView textView = new TextView(context);
        this.f10924e = textView;
        textView.setTextSize(1, 16.0f);
        TextView h = e2.h(e7, textView, w5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f10925f = h;
        h.setGravity(17);
        h.setMinWidth(AndroidUtilities.dp(20.66f));
        h.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        h.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(h, w5.j(13.33f, 0.0f));
            if (z10) {
                i12 = 12;
            } else {
                i12 = 16;
            }
            addView(e7, w5.p(0, -2, 1.0f, 23, 20, 0, i12, 0));
            if (z10) {
                i13 = 9;
            } else {
                i13 = 14;
            }
            addView(frameLayout, w5.t(28, 28, 21, 0, 0, i13, 0));
        } else {
            if (z10) {
                i10 = 9;
            } else {
                i10 = 14;
            }
            addView(frameLayout, w5.t(28, 28, 19, i10, 0, 0, 0));
            if (z10) {
                i11 = 12;
            } else {
                i11 = 16;
            }
            addView(e7, w5.p(0, -2, 1.0f, 23, i11, 0, 20, 0));
            addView(h, w5.j(0.0f, 13.33f));
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
        this.f10923c.setVisibility(i13);
        if (i12 == 0) {
            f7 = AndroidUtilities.dp(2.0f);
        } else {
            f7 = 0.0f;
        }
        this.f10924e.setTranslationX(f7);
        this.f10922b.b(i10, i11);
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
        int i11 = h6.G6;
        c6 c6Var = this.f10921a;
        this.f10924e.setTextColor(h6.w0(i11, c6Var));
        if (this.f10926n) {
            i10 = h6.W8;
        } else {
            i10 = h6.f20745n6;
        }
        int w02 = h6.w0(i10, c6Var);
        TextView textView = this.f10925f;
        textView.setTextColor(w02);
        if (this.f10926n) {
            shapeDrawable = h6.c0(AndroidUtilities.dp(10.33f), h6.w0(h6.U8, c6Var));
        } else {
            shapeDrawable = null;
        }
        textView.setBackground(shapeDrawable);
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = h6.I.q();
        }
        this.f10922b.f31135b = q6;
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
        this.f10924e.setText(charSequence);
    }

    public void setUnreadMode(boolean z10) {
        float f7;
        Typeface typeface;
        int i10;
        if (this.f10926n != z10) {
            this.f10926n = z10;
            if (z10) {
                f7 = 13.0f;
            } else {
                f7 = 16.0f;
            }
            TextView textView = this.f10925f;
            textView.setTextSize(1, f7);
            ShapeDrawable shapeDrawable = null;
            if (z10) {
                typeface = AndroidUtilities.bold();
            } else {
                typeface = null;
            }
            textView.setTypeface(typeface);
            if (z10) {
                i10 = h6.W8;
            } else {
                i10 = h6.f20745n6;
            }
            c6 c6Var = this.f10921a;
            textView.setTextColor(h6.w0(i10, c6Var));
            if (z10) {
                shapeDrawable = h6.c0(AndroidUtilities.dp(10.33f), h6.w0(h6.U8, c6Var));
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
        TextView textView = this.f10925f;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }
}
