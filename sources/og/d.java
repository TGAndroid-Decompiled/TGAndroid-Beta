package og;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import w7.b6;
public abstract class d extends FrameLayout {
    public final p6 f14177a;
    public final r8 f14178b;
    public final g9 f14179c;
    public final c d;
    public final u5 e;
    public final RadioButton f14180f;
    public final Paint h;
    public boolean f14181n;
    public final View f14182r;

    public d(Context context, p6 p6Var) {
        super(context);
        int i10;
        r8 r8Var = new r8((p6) null);
        this.f14178b = r8Var;
        this.h = new Paint(1);
        this.f14177a = p6Var;
        View view = new View(context);
        this.f14182r = view;
        addView(view, b6.o(-1, -1));
        a7.i(t6.f21002h5, view, p6Var);
        r8Var.f29929r = i0.L(40.0f);
        g9 g9Var = new g9(context);
        this.f14179c = g9Var;
        g9Var.setRoundRadius(i0.L(20.0f));
        addView(g9Var);
        c cVar = new c(context, 0);
        this.d = cVar;
        at.i(cVar);
        at.i(g9Var);
        cVar.setTextSize(16);
        int i11 = t6.f21038j5;
        a7.Y(cVar, i11, p6Var);
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        cVar.setGravity(i10);
        addView(cVar);
        u5 u5Var = new u5(context);
        this.e = u5Var;
        u5Var.setTextSize(14);
        a7.Y(u5Var, i11, p6Var);
        u5Var.setGravity(dd.X ? 5 : 3);
        addView(u5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f14180f = radioButton;
        radioButton.setSize(i0.L(20.0f));
        a7.P(radioButton, t6.f21040j7, t6.E5, p6Var);
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
        RadioButton radioButton = this.f14180f;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, true);
        }
    }

    public void d() {
        int i10;
        float f7;
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
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i17 = i10 | 16;
        if (b()) {
            f7 = 53.0f;
        } else {
            f7 = 16.0f;
        }
        if (b()) {
            f10 = 53.0f;
        } else {
            f10 = 16.0f;
        }
        this.f14179c.setLayoutParams(b6.d(40, 40.0f, i17, f7, 0.0f, f10, 0.0f));
        boolean z10 = dd.X;
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
        if (dd.X) {
            if (b()) {
                i15 = 105;
            } else {
                i15 = 70;
            }
            f12 = i15;
        } else {
            f12 = 20.0f;
        }
        this.d.setLayoutParams(b6.d(-1, -2.0f, i18, f11, 0.0f, f12, 0.0f));
        boolean z11 = dd.X;
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
        if (dd.X) {
            if (b()) {
                i19 = 105;
            }
            f14 = i19;
        } else {
            f14 = 20.0f;
        }
        this.e.setLayoutParams(b6.d(-1, -2.0f, i20, f13, 0.0f, f14, 0.0f));
        boolean z12 = dd.X;
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
        this.f14180f.setLayoutParams(b6.d(22, 22.0f, i21, f15, 0.0f, f16, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f14181n) {
            int w02 = t6.w0(t6.f20931d7, this.f14177a);
            Paint paint = this.h;
            paint.setColor(w02);
            if (b()) {
                i10 = 105;
            } else {
                i10 = 70;
            }
            if (this.f14179c.getVisibility() == 8) {
                i10 -= 40;
            }
            int a2 = a() + i10;
            if (dd.X) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - i0.L(a2), getHeight(), paint);
            } else {
                canvas.drawRect(i0.L(a2), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public final SpannableStringBuilder e(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(2131230875);
        dq dqVar = new dq(2, drawable);
        drawable.setBounds(0, i0.L(1.0f), i0.L(11.0f), i0.L(12.0f));
        spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public int getFullHeight() {
        return 56;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(i0.L(getFullHeight()), 1073741824));
    }

    public void setDivider(boolean z10) {
        this.f14181n = z10;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        c cVar = this.d;
        u5 u5Var = this.e;
        if (isEmpty) {
            cVar.setTranslationY(0.0f);
            u5Var.setVisibility(8);
        } else {
            cVar.setTranslationY(i0.L(-9.0f));
            u5Var.setTranslationY(i0.L(12.0f));
            u5Var.l(charSequence, false);
            u5Var.setVisibility(0);
        }
        if (this.f14179c.getVisibility() == 8) {
            if (dd.X) {
                cVar.setTranslationX(i0.L(40.0f));
                u5Var.setTranslationX(i0.L(40.0f));
                return;
            }
            cVar.setTranslationX(i0.L(-40.0f));
            u5Var.setTranslationX(i0.L(-40.0f));
        }
    }
}
