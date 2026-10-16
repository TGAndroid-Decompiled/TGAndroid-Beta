package hi;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.sk;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.qc0;
import w7.z5;
public final class j extends LinearLayout implements x5 {
    public final c6 f10847a;
    public final qc0 f10848b;
    public final FrameLayout f10849c;
    public final ImageView d;
    public final TextView e;
    public final TextView f10850f;
    public final boolean h;
    public boolean f10851n;

    public j(Context context, c6 c6Var, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        this.f10847a = c6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10849c = frameLayout;
        qc0 qc0Var = new qc0(1);
        this.f10848b = qc0Var;
        frameLayout.setBackground(qc0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, z5.e(24, 24, 17));
        LinearLayout e = sk.e(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView i14 = k3.i(e, textView, z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f10850f = i14;
        i14.setGravity(17);
        i14.setMinWidth(AndroidUtilities.dp(20.66f));
        i14.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        i14.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(i14, z5.j(13.33f, 0.0f));
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
            addView(i14, z5.j(0.0f, 13.33f));
        }
        d();
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
        this.f10849c.setVisibility(i13);
        if (i12 == 0) {
            f7 = AndroidUtilities.dp(2.0f);
        } else {
            f7 = 0.0f;
        }
        this.e.setTranslationX(f7);
        this.f10848b.b(i10, i11);
        this.d.setImageResource(i12);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z10);
    }

    @Override
    public final void d() {
        int i10;
        ShapeDrawable shapeDrawable;
        boolean q6;
        int i11 = g6.G6;
        c6 c6Var = this.f10847a;
        this.e.setTextColor(g6.w0(i11, c6Var));
        if (this.f10851n) {
            i10 = g6.W8;
        } else {
            i10 = g6.f19784n6;
        }
        int w02 = g6.w0(i10, c6Var);
        TextView textView = this.f10850f;
        textView.setTextColor(w02);
        if (this.f10851n) {
            shapeDrawable = g6.c0(AndroidUtilities.dp(10.33f), g6.w0(g6.U8, c6Var));
        } else {
            shapeDrawable = null;
        }
        textView.setBackground(shapeDrawable);
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = g6.I.q();
        }
        this.f10848b.f28270b = q6;
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
        if (this.f10851n != z10) {
            this.f10851n = z10;
            if (z10) {
                f7 = 13.0f;
            } else {
                f7 = 16.0f;
            }
            TextView textView = this.f10850f;
            textView.setTextSize(1, f7);
            ShapeDrawable shapeDrawable = null;
            if (z10) {
                typeface = AndroidUtilities.bold();
            } else {
                typeface = null;
            }
            textView.setTypeface(typeface);
            if (z10) {
                i10 = g6.W8;
            } else {
                i10 = g6.f19784n6;
            }
            c6 c6Var = this.f10847a;
            textView.setTextColor(g6.w0(i10, c6Var));
            if (z10) {
                shapeDrawable = g6.c0(AndroidUtilities.dp(10.33f), g6.w0(g6.U8, c6Var));
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
        TextView textView = this.f10850f;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }
}
