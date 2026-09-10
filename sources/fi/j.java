package fi;

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
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.zb0;
public final class j extends LinearLayout implements a6 {
    public final f6 f8322a;
    public final zb0 f8323b;
    public final FrameLayout f8324c;
    public final ImageView d;
    public final TextView e;
    public final TextView f8325f;
    public final boolean h;
    public boolean f8326n;

    public j(Context context, f6 f6Var, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        this.f8322a = f6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8324c = frameLayout;
        zb0 zb0Var = new zb0(1);
        this.f8323b = zb0Var;
        frameLayout.setBackground(zb0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, w7.a6.e(24, 24, 17));
        LinearLayout f7 = em.f(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView g10 = e2.g(f7, textView, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f8325f = g10;
        g10.setGravity(17);
        g10.setMinWidth(AndroidUtilities.dp(20.66f));
        g10.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        g10.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(g10, w7.a6.j(13.33f, 0.0f));
            if (z10) {
                i12 = 12;
            } else {
                i12 = 16;
            }
            addView(f7, w7.a6.p(0, -2, 1.0f, 23, 20, 0, i12, 0));
            if (z10) {
                i13 = 9;
            } else {
                i13 = 14;
            }
            addView(frameLayout, w7.a6.t(28, 28, 21, 0, 0, i13, 0));
        } else {
            if (z10) {
                i10 = 9;
            } else {
                i10 = 14;
            }
            addView(frameLayout, w7.a6.t(28, 28, 19, i10, 0, 0, 0));
            if (z10) {
                i11 = 12;
            } else {
                i11 = 16;
            }
            addView(f7, w7.a6.p(0, -2, 1.0f, 23, i11, 0, 20, 0));
            addView(g10, w7.a6.j(0.0f, 13.33f));
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
        this.f8324c.setVisibility(i13);
        if (i12 == 0) {
            f7 = AndroidUtilities.dp(2.0f);
        } else {
            f7 = 0.0f;
        }
        this.e.setTranslationX(f7);
        this.f8323b.b(i10, i11);
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
        int i11 = j6.G6;
        f6 f6Var = this.f8322a;
        this.e.setTextColor(j6.v0(i11, f6Var));
        if (this.f8326n) {
            i10 = j6.W8;
        } else {
            i10 = j6.f18110n6;
        }
        int v02 = j6.v0(i10, f6Var);
        TextView textView = this.f8325f;
        textView.setTextColor(v02);
        if (this.f8326n) {
            shapeDrawable = j6.b0(AndroidUtilities.dp(10.33f), j6.v0(j6.U8, f6Var));
        } else {
            shapeDrawable = null;
        }
        textView.setBackground(shapeDrawable);
        if (f6Var != null) {
            q6 = f6Var.a();
        } else {
            q6 = j6.I.q();
        }
        this.f8323b.f29639b = q6;
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
        this.e.setText(charSequence);
    }

    public void setUnreadMode(boolean z10) {
        float f7;
        Typeface typeface;
        int i10;
        if (this.f8326n != z10) {
            this.f8326n = z10;
            if (z10) {
                f7 = 13.0f;
            } else {
                f7 = 16.0f;
            }
            TextView textView = this.f8325f;
            textView.setTextSize(1, f7);
            ShapeDrawable shapeDrawable = null;
            if (z10) {
                typeface = AndroidUtilities.bold();
            } else {
                typeface = null;
            }
            textView.setTypeface(typeface);
            if (z10) {
                i10 = j6.W8;
            } else {
                i10 = j6.f18110n6;
            }
            f6 f6Var = this.f8322a;
            textView.setTextColor(j6.v0(i10, f6Var));
            if (z10) {
                shapeDrawable = j6.b0(AndroidUtilities.dp(10.33f), j6.v0(j6.U8, f6Var));
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
        TextView textView = this.f8325f;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }
}
