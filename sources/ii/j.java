package ii;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.tl;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.kc0;
import w7.z5;
public final class j extends LinearLayout implements b6 {
    public final g6 f13220a;
    public final kc0 f13221b;
    public final FrameLayout f13222c;
    public final ImageView d;
    public final TextView e;
    public final TextView f13223f;
    public final boolean h;
    public boolean f13224n;

    public j(Context context, g6 g6Var, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        this.f13220a = g6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f13222c = frameLayout;
        kc0 kc0Var = new kc0(1);
        this.f13221b = kc0Var;
        frameLayout.setBackground(kc0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, z5.e(24, 24, 17));
        LinearLayout e = tl.e(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f7 = tl.f(e, textView, z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f13223f = f7;
        f7.setGravity(17);
        f7.setMinWidth(AndroidUtilities.dp(20.66f));
        f7.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        f7.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(f7, z5.j(13.33f, 0.0f));
            if (z10) {
                i12 = 12;
            } else {
                i12 = 16;
            }
            addView(e, z5.p(0, -2, 1.0f, 23, 20, 0, i12, 0));
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
            addView(e, z5.p(0, -2, 1.0f, 23, i11, 0, 20, 0));
            addView(f7, z5.j(0.0f, 13.33f));
        }
        updateColors();
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
        this.f13222c.setVisibility(i13);
        if (i12 == 0) {
            f7 = AndroidUtilities.dp(2.0f);
        } else {
            f7 = 0.0f;
        }
        this.e.setTranslationX(f7);
        this.f13221b.b(i10, i11);
        this.d.setImageResource(i12);
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
        if (this.f13224n != z10) {
            this.f13224n = z10;
            if (z10) {
                f7 = 13.0f;
            } else {
                f7 = 16.0f;
            }
            TextView textView = this.f13223f;
            textView.setTextSize(1, f7);
            ShapeDrawable shapeDrawable = null;
            if (z10) {
                typeface = AndroidUtilities.bold();
            } else {
                typeface = null;
            }
            textView.setTypeface(typeface);
            if (z10) {
                i10 = k6.W8;
            } else {
                i10 = k6.f21367n6;
            }
            g6 g6Var = this.f13220a;
            r6.W(textView, i10, g6Var);
            if (z10) {
                shapeDrawable = k6.c0(AndroidUtilities.dp(10.33f), k6.w0(k6.U8, g6Var));
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
        TextView textView = this.f13223f;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i10;
        ShapeDrawable shapeDrawable;
        boolean q6;
        int i11 = k6.G6;
        g6 g6Var = this.f13220a;
        this.e.setTextColor(k6.w0(i11, g6Var));
        if (this.f13224n) {
            i10 = k6.W8;
        } else {
            i10 = k6.f21367n6;
        }
        int w02 = k6.w0(i10, g6Var);
        TextView textView = this.f13223f;
        textView.setTextColor(w02);
        if (this.f13224n) {
            shapeDrawable = k6.c0(AndroidUtilities.dp(10.33f), k6.w0(k6.U8, g6Var));
        } else {
            shapeDrawable = null;
        }
        textView.setBackground(shapeDrawable);
        if (g6Var != null) {
            q6 = g6Var.a();
        } else {
            q6 = k6.I.q();
        }
        this.f13221b.f28004b = q6;
    }
}
