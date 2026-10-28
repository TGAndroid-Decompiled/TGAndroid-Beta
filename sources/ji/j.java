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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.kb1;
public final class j extends LinearLayout implements p6 {
    public final u6 f15994a;
    public final jc0 f15995b;
    public final FrameLayout f15996c;
    public final ImageView d;
    public final TextView e;
    public final TextView f15997f;
    public final boolean h;
    public boolean f15998n;

    public j(Context context, u6 u6Var, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        this.f15994a = u6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15996c = frameLayout;
        jc0 jc0Var = new jc0(1);
        this.f15995b = jc0Var;
        frameLayout.setBackground(jc0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, kb1.i(24, 24, 17));
        LinearLayout d = wh.d(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView e = wh.e(d, textView, kb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f15997f = e;
        e.setGravity(17);
        e.setMinWidth(AndroidUtilities.dp(20.66f));
        e.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        e.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(e, kb1.n(13.33f, 0.0f));
            if (z10) {
                i12 = 12;
            } else {
                i12 = 16;
            }
            addView(d, kb1.t(0, -2, 1.0f, 23, 20, 0, i12, 0));
            if (z10) {
                i13 = 9;
            } else {
                i13 = 14;
            }
            addView(frameLayout, kb1.x(28, 28, 21, 0, 0, i13, 0));
        } else {
            if (z10) {
                i10 = 9;
            } else {
                i10 = 14;
            }
            addView(frameLayout, kb1.x(28, 28, 19, i10, 0, 0, 0));
            if (z10) {
                i11 = 12;
            } else {
                i11 = 16;
            }
            addView(d, kb1.t(0, -2, 1.0f, 23, i11, 0, 20, 0));
            addView(e, kb1.n(0.0f, 13.33f));
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
        this.f15996c.setVisibility(i13);
        if (i12 == 0) {
            f7 = AndroidUtilities.dp(2.0f);
        } else {
            f7 = 0.0f;
        }
        this.e.setTranslationX(f7);
        this.f15995b.b(i10, i11);
        this.d.setImageResource(i12);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.G6));
        hashSet.add(Integer.valueOf(y6.U8));
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
        if (this.f15998n != z10) {
            this.f15998n = z10;
            if (z10) {
                f7 = 13.0f;
            } else {
                f7 = 16.0f;
            }
            TextView textView = this.f15997f;
            textView.setTextSize(1, f7);
            ShapeDrawable shapeDrawable = null;
            if (z10) {
                typeface = AndroidUtilities.bold();
            } else {
                typeface = null;
            }
            textView.setTypeface(typeface);
            if (z10) {
                i10 = y6.W8;
            } else {
                i10 = y6.f23541n6;
            }
            u6 u6Var = this.f15994a;
            f7.V(textView, i10, u6Var);
            if (z10) {
                shapeDrawable = y6.c0(AndroidUtilities.dp(10.33f), y6.w0(y6.U8, u6Var));
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
        TextView textView = this.f15997f;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i10;
        ShapeDrawable shapeDrawable;
        boolean q5;
        int i11 = y6.G6;
        u6 u6Var = this.f15994a;
        this.e.setTextColor(y6.w0(i11, u6Var));
        if (this.f15998n) {
            i10 = y6.W8;
        } else {
            i10 = y6.f23541n6;
        }
        int w02 = y6.w0(i10, u6Var);
        TextView textView = this.f15997f;
        textView.setTextColor(w02);
        if (this.f15998n) {
            shapeDrawable = y6.c0(AndroidUtilities.dp(10.33f), y6.w0(y6.U8, u6Var));
        } else {
            shapeDrawable = null;
        }
        textView.setBackground(shapeDrawable);
        if (u6Var != null) {
            q5 = u6Var.a();
        } else {
            q5 = y6.I.q();
        }
        this.f15995b.f29642b = q5;
    }
}
