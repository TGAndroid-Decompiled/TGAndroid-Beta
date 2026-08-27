package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y8;

public abstract class d extends FrameLayout {

    public final c6 f5392a;

    public final y8 f5393b;

    public final n9 f5394c;
    public final c d;

    public final h5 f5395e;

    public final RadioButton f5396f;
    public final Paint h;

    public boolean f5397n;

    public d(Context context, c6 c6Var) {
        super(context);
        y8 y8Var = new y8((c6) null);
        this.f5393b = y8Var;
        this.h = new Paint(1);
        this.f5392a = c6Var;
        View view = new View(context);
        addView(view, z5.n(-1, -1));
        view.setBackgroundColor(g6.v0(g6.f23124h5, c6Var));
        y8Var.f34860r = AndroidUtilities.dp(40.0f);
        n9 n9Var = new n9(context);
        this.f5394c = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(n9Var);
        c cVar = new c(context, 0);
        this.d = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        NotificationCenter.listenEmojiLoading(n9Var);
        cVar.setTextSize(16);
        int i10 = g6.f23161j5;
        cVar.setTextColor(g6.v0(i10, c6Var));
        cVar.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(cVar);
        h5 h5Var = new h5(context);
        this.f5395e = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTextColor(g6.v0(i10, c6Var));
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(h5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f5396f = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(g6.v0(g6.f23163j7, c6Var), g6.v0(g6.E5, c6Var));
        addView(radioButton);
        d();
        if (b()) {
            return;
        }
        radioButton.setVisibility(8);
    }

    public int a() {
        return 0;
    }

    public abstract boolean b();

    public void c(boolean z10, boolean z11) {
        RadioButton radioButton = this.f5396f;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, true);
        }
    }

    public void d() {
        float f10;
        float f11;
        float f12;
        float f13;
        this.f5394c.setLayoutParams(z5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, b() ? 53.0f : 16.0f, 0.0f, b() ? 53.0f : 16.0f, 0.0f));
        boolean z10 = LocaleController.isRTL;
        int i10 = (z10 ? 5 : 3) | 16;
        if (z10) {
            f10 = 20.0f;
        } else {
            f10 = b() ? 105 : 70;
        }
        if (LocaleController.isRTL) {
            f11 = b() ? 105 : 70;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(z5.d(-1, -2.0f, i10, f10, 0.0f, f11, 0.0f));
        boolean z11 = LocaleController.isRTL;
        int i11 = (z11 ? 5 : 3) | 16;
        if (z11) {
            f12 = 20.0f;
        } else {
            f12 = b() ? 105 : 70;
        }
        if (LocaleController.isRTL) {
            f13 = b() ? 105 : 70;
        } else {
            f13 = 20.0f;
        }
        this.f5395e.setLayoutParams(z5.d(-1, -2.0f, i11, f12, 0.0f, f13, 0.0f));
        boolean z12 = LocaleController.isRTL;
        this.f5396f.setLayoutParams(z5.d(22, 22.0f, (z12 ? 5 : 3) | 16, z12 ? 15.0f : 20.0f, 0.0f, z12 ? 20.0f : 15.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f5397n) {
            int iV0 = g6.v0(g6.f23054d7, this.f5392a);
            Paint paint = this.h;
            paint.setColor(iV0);
            int i10 = b() ? 105 : 70;
            if (this.f5394c.getVisibility() == 8) {
                i10 -= 40;
            }
            int iA = a() + i10;
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(iA), getHeight(), paint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(iA), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public final SpannableStringBuilder e(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        cq cqVar = new cq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(cqVar, 0, spannableString.length(), 33);
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
        this.f5397n = z10;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        c cVar = this.d;
        h5 h5Var = this.f5395e;
        if (zIsEmpty) {
            cVar.setTranslationY(0.0f);
            h5Var.setVisibility(8);
        } else {
            cVar.setTranslationY(AndroidUtilities.dp(-9.0f));
            h5Var.setTranslationY(AndroidUtilities.dp(12.0f));
            h5Var.l(charSequence, false);
            h5Var.setVisibility(0);
        }
        if (this.f5394c.getVisibility() == 8) {
            if (LocaleController.isRTL) {
                cVar.setTranslationX(AndroidUtilities.dp(40.0f));
                h5Var.setTranslationX(AndroidUtilities.dp(40.0f));
            } else {
                cVar.setTranslationX(AndroidUtilities.dp(-40.0f));
                h5Var.setTranslationX(AndroidUtilities.dp(-40.0f));
            }
        }
    }
}
