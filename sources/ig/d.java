package ig;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;
public abstract class d extends FrameLayout {
    public final f6 f7499a;
    public final z8 f7500b;
    public final p9 f7501c;
    public final c d;
    public final k5 e;
    public final RadioButton f7502f;
    public final Paint h;
    public boolean f7503n;

    public d(Context context, f6 f6Var) {
        super(context);
        int i10;
        z8 z8Var = new z8((f6) null);
        this.f7500b = z8Var;
        this.h = new Paint(1);
        this.f7499a = f6Var;
        View view = new View(context);
        addView(view, b6.n(-1, -1));
        view.setBackgroundColor(j6.v0(j6.f19977h5, f6Var));
        z8Var.f31278r = AndroidUtilities.dp(40.0f);
        p9 p9Var = new p9(context);
        this.f7501c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(p9Var);
        c cVar = new c(context, 0);
        this.d = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        NotificationCenter.listenEmojiLoading(p9Var);
        cVar.setTextSize(16);
        int i11 = j6.f20012j5;
        cVar.setTextColor(j6.v0(i11, f6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        cVar.setGravity(i10);
        addView(cVar);
        k5 k5Var = new k5(context);
        this.e = k5Var;
        k5Var.setTextSize(14);
        k5Var.setTextColor(j6.v0(i11, f6Var));
        k5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(k5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f7502f = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(j6.v0(j6.f20014j7, f6Var), j6.v0(j6.E5, f6Var));
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

    public void c(boolean z4, boolean z10) {
        RadioButton radioButton = this.f7502f;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z4, true);
        }
    }

    public void d() {
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        int i13;
        int i14;
        float f14;
        float f15;
        float f16;
        float f17;
        int i15;
        int i16 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i17 = i10 | 16;
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
        this.f7501c.setLayoutParams(b6.d(40, 40.0f, i17, f10, 0.0f, f11, 0.0f));
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i18 = i11 | 16;
        int i19 = 70;
        if (z4) {
            f12 = 20.0f;
        } else {
            if (b()) {
                i12 = 105;
            } else {
                i12 = 70;
            }
            f12 = i12;
        }
        if (LocaleController.isRTL) {
            if (b()) {
                i15 = 105;
            } else {
                i15 = 70;
            }
            f13 = i15;
        } else {
            f13 = 20.0f;
        }
        this.d.setLayoutParams(b6.d(-1, -2.0f, i18, f12, 0.0f, f13, 0.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i20 = i13 | 16;
        if (z10) {
            f14 = 20.0f;
        } else {
            if (b()) {
                i14 = 105;
            } else {
                i14 = 70;
            }
            f14 = i14;
        }
        if (LocaleController.isRTL) {
            if (b()) {
                i19 = 105;
            }
            f15 = i19;
        } else {
            f15 = 20.0f;
        }
        this.e.setLayoutParams(b6.d(-1, -2.0f, i20, f14, 0.0f, f15, 0.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i16 = 5;
        }
        int i21 = i16 | 16;
        if (z11) {
            f16 = 15.0f;
        } else {
            f16 = 20.0f;
        }
        if (z11) {
            f17 = 20.0f;
        } else {
            f17 = 15.0f;
        }
        this.f7502f.setLayoutParams(b6.d(22, 22.0f, i21, f16, 0.0f, f17, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f7503n) {
            int v02 = j6.v0(j6.f19907d7, this.f7499a);
            Paint paint = this.h;
            paint.setColor(v02);
            if (b()) {
                i10 = 105;
            } else {
                i10 = 70;
            }
            if (this.f7501c.getVisibility() == 8) {
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
        mq mqVar = new mq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(mqVar, 0, spannableString.length(), 33);
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

    public void setDivider(boolean z4) {
        this.f7503n = z4;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        c cVar = this.d;
        k5 k5Var = this.e;
        if (isEmpty) {
            cVar.setTranslationY(0.0f);
            k5Var.setVisibility(8);
        } else {
            cVar.setTranslationY(AndroidUtilities.dp(-9.0f));
            k5Var.setTranslationY(AndroidUtilities.dp(12.0f));
            k5Var.l(charSequence, false);
            k5Var.setVisibility(0);
        }
        if (this.f7501c.getVisibility() == 8) {
            if (LocaleController.isRTL) {
                cVar.setTranslationX(AndroidUtilities.dp(40.0f));
                k5Var.setTranslationX(AndroidUtilities.dp(40.0f));
                return;
            }
            cVar.setTranslationX(AndroidUtilities.dp(-40.0f));
            k5Var.setTranslationX(AndroidUtilities.dp(-40.0f));
        }
    }
}
