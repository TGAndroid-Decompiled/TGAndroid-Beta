package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.z8;
public abstract class d extends FrameLayout {
    public final b6 f4498a;
    public final z8 f4499b;
    public final o9 f4500c;
    public final c d;
    public final h5 f4501e;
    public final RadioButton f4502f;
    public final Paint h;
    public boolean f4503n;

    public d(Context context, b6 b6Var) {
        super(context);
        int i9;
        z8 z8Var = new z8((b6) null);
        this.f4499b = z8Var;
        this.h = new Paint(1);
        this.f4498a = b6Var;
        View view = new View(context);
        addView(view, e6.n(-1, -1));
        view.setBackgroundColor(f6.v0(f6.f23072h5, b6Var));
        z8Var.f35236r = AndroidUtilities.dp(40.0f);
        o9 o9Var = new o9(context);
        this.f4500c = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(o9Var);
        c cVar = new c(context, 0);
        this.d = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        NotificationCenter.listenEmojiLoading(o9Var);
        cVar.setTextSize(16);
        int i10 = f6.f23108j5;
        cVar.setTextColor(f6.v0(i10, b6Var));
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        cVar.setGravity(i9);
        addView(cVar);
        h5 h5Var = new h5(context);
        this.f4501e = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTextColor(f6.v0(i10, b6Var));
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(h5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f4502f = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(f6.v0(f6.f23110j7, b6Var), f6.v0(f6.E5, b6Var));
        addView(radioButton);
        d();
        if (!b()) {
            radioButton.setVisibility(8);
        }
    }

    public int a() {
        return 0;
    }

    public abstract boolean b();

    public void c(boolean z10, boolean z11) {
        RadioButton radioButton = this.f4502f;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, true);
        }
    }

    public void d() {
        int i9;
        float f10;
        float f11;
        int i10;
        int i11;
        float f12;
        float f13;
        int i12;
        int i13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i14;
        int i15 = 3;
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        int i16 = i9 | 16;
        if (b()) {
            f10 = 53.0f;
        } else {
            f10 = 16.0f;
        }
        if (b()) {
            f11 = 53.0f;
        } else {
            f11 = 16.0f;
        }
        this.f4500c.setLayoutParams(e6.d(40, 40.0f, i16, f10, 0.0f, f11, 0.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i17 = i10 | 16;
        int i18 = 70;
        if (z10) {
            f12 = 20.0f;
        } else {
            if (b()) {
                i11 = 105;
            } else {
                i11 = 70;
            }
            f12 = i11;
        }
        if (LocaleController.isRTL) {
            if (b()) {
                i14 = 105;
            } else {
                i14 = 70;
            }
            f13 = i14;
        } else {
            f13 = 20.0f;
        }
        this.d.setLayoutParams(e6.d(-1, -2.0f, i17, f12, 0.0f, f13, 0.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i19 = i12 | 16;
        if (z11) {
            f14 = 20.0f;
        } else {
            if (b()) {
                i13 = 105;
            } else {
                i13 = 70;
            }
            f14 = i13;
        }
        if (LocaleController.isRTL) {
            if (b()) {
                i18 = 105;
            }
            f15 = i18;
        } else {
            f15 = 20.0f;
        }
        this.f4501e.setLayoutParams(e6.d(-1, -2.0f, i19, f14, 0.0f, f15, 0.0f));
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i15 = 5;
        }
        int i20 = i15 | 16;
        if (z12) {
            f16 = 15.0f;
        } else {
            f16 = 20.0f;
        }
        if (z12) {
            f17 = 20.0f;
        } else {
            f17 = 15.0f;
        }
        this.f4502f.setLayoutParams(e6.d(22, 22.0f, i20, f16, 0.0f, f17, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        super.dispatchDraw(canvas);
        if (this.f4503n) {
            int v02 = f6.v0(f6.f23002d7, this.f4498a);
            Paint paint = this.h;
            paint.setColor(v02);
            if (b()) {
                i9 = 105;
            } else {
                i9 = 70;
            }
            if (this.f4500c.getVisibility() == 8) {
                i9 -= 40;
            }
            int a2 = a() + i9;
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(a2), getHeight(), paint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(a2), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public final SpannableStringBuilder e(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        eq eqVar = new eq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public int getFullHeight() {
        return 56;
    }

    @Override
    public void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(getFullHeight()), 1073741824));
    }

    public void setDivider(boolean z10) {
        this.f4503n = z10;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        c cVar = this.d;
        h5 h5Var = this.f4501e;
        if (isEmpty) {
            cVar.setTranslationY(0.0f);
            h5Var.setVisibility(8);
        } else {
            cVar.setTranslationY(AndroidUtilities.dp(-9.0f));
            h5Var.setTranslationY(AndroidUtilities.dp(12.0f));
            h5Var.l(charSequence, false);
            h5Var.setVisibility(0);
        }
        if (this.f4500c.getVisibility() == 8) {
            if (LocaleController.isRTL) {
                cVar.setTranslationX(AndroidUtilities.dp(40.0f));
                h5Var.setTranslationX(AndroidUtilities.dp(40.0f));
                return;
            }
            cVar.setTranslationX(AndroidUtilities.dp(-40.0f));
            h5Var.setTranslationX(AndroidUtilities.dp(-40.0f));
        }
    }
}
