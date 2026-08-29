package gg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.t9;
public abstract class d extends FrameLayout {
    public final c6 f7288a;
    public final e9 f7289b;
    public final t9 f7290c;
    public final c d;
    public final h5 f7291e;
    public final RadioButton f7292f;
    public final Paint h;
    public boolean f7293n;

    public d(Context context, c6 c6Var) {
        super(context);
        int i10;
        e9 e9Var = new e9((c6) null);
        this.f7289b = e9Var;
        this.h = new Paint(1);
        this.f7288a = c6Var;
        View view = new View(context);
        addView(view, f6.n(-1, -1));
        view.setBackgroundColor(g6.v0(g6.f23133h5, c6Var));
        e9Var.f27966r = AndroidUtilities.dp(40.0f);
        t9 t9Var = new t9(context);
        this.f7290c = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(t9Var);
        c cVar = new c(context, 0);
        this.d = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        NotificationCenter.listenEmojiLoading(t9Var);
        cVar.setTextSize(16);
        int i11 = g6.f23169j5;
        cVar.setTextColor(g6.v0(i11, c6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        cVar.setGravity(i10);
        addView(cVar);
        h5 h5Var = new h5(context);
        this.f7291e = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTextColor(g6.v0(i11, c6Var));
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(h5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f7292f = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(g6.v0(g6.f23171j7, c6Var), g6.v0(g6.E5, c6Var));
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
        RadioButton radioButton = this.f7292f;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, true);
        }
    }

    public void d() {
        int i10;
        float f9;
        float f10;
        int i11;
        int i12;
        float f11;
        float f12;
        int i13;
        int i14;
        float f13;
        float f14;
        float f15;
        float f16;
        int i15;
        int i16 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i17 = i10 | 16;
        if (b()) {
            f9 = 53.0f;
        } else {
            f9 = 16.0f;
        }
        if (b()) {
            f10 = 53.0f;
        } else {
            f10 = 16.0f;
        }
        this.f7290c.setLayoutParams(f6.d(40, 40.0f, i17, f9, 0.0f, f10, 0.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i18 = i11 | 16;
        int i19 = 70;
        if (z10) {
            f11 = 20.0f;
        } else {
            if (b()) {
                i12 = 105;
            } else {
                i12 = 70;
            }
            f11 = i12;
        }
        if (LocaleController.isRTL) {
            if (b()) {
                i15 = 105;
            } else {
                i15 = 70;
            }
            f12 = i15;
        } else {
            f12 = 20.0f;
        }
        this.d.setLayoutParams(f6.d(-1, -2.0f, i18, f11, 0.0f, f12, 0.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i20 = i13 | 16;
        if (z11) {
            f13 = 20.0f;
        } else {
            if (b()) {
                i14 = 105;
            } else {
                i14 = 70;
            }
            f13 = i14;
        }
        if (LocaleController.isRTL) {
            if (b()) {
                i19 = 105;
            }
            f14 = i19;
        } else {
            f14 = 20.0f;
        }
        this.f7291e.setLayoutParams(f6.d(-1, -2.0f, i20, f13, 0.0f, f14, 0.0f));
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i16 = 5;
        }
        int i21 = i16 | 16;
        if (z12) {
            f15 = 15.0f;
        } else {
            f15 = 20.0f;
        }
        if (z12) {
            f16 = 20.0f;
        } else {
            f16 = 15.0f;
        }
        this.f7292f.setLayoutParams(f6.d(22, 22.0f, i21, f15, 0.0f, f16, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f7293n) {
            int v02 = g6.v0(g6.f23063d7, this.f7288a);
            Paint paint = this.h;
            paint.setColor(v02);
            if (b()) {
                i10 = 105;
            } else {
                i10 = 70;
            }
            if (this.f7290c.getVisibility() == 8) {
                i10 -= 40;
            }
            int a2 = a() + i10;
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
        iq iqVar = new iq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(iqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public int getFullHeight() {
        return 56;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(getFullHeight()), 1073741824));
    }

    public void setDivider(boolean z10) {
        this.f7293n = z10;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        c cVar = this.d;
        h5 h5Var = this.f7291e;
        if (isEmpty) {
            cVar.setTranslationY(0.0f);
            h5Var.setVisibility(8);
        } else {
            cVar.setTranslationY(AndroidUtilities.dp(-9.0f));
            h5Var.setTranslationY(AndroidUtilities.dp(12.0f));
            h5Var.l(charSequence, false);
            h5Var.setVisibility(0);
        }
        if (this.f7290c.getVisibility() == 8) {
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
