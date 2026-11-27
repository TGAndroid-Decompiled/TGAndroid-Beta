package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.RadioButton;
public abstract class if0 extends FrameLayout {
    public final vnb a;
    public final rb0 b;
    public final de0 c;
    public final ff0 d;
    public final ema e;
    public final RadioButton f;
    public final Paint h;
    public boolean n;
    public final View r;

    public if0(Context context, vnb vnbVar) {
        super(context);
        int i;
        rb0 rb0Var = new rb0((vnb) null);
        this.b = rb0Var;
        this.h = new Paint(1);
        this.a = vnbVar;
        View view = new View(context);
        this.r = view;
        addView(view, tre.o(-1, -1));
        yob.h(aob.h5, vnbVar, view);
        rb0Var.r = hl.L(40.0f);
        de0 de0Var = new de0(context);
        this.c = de0Var;
        de0Var.setRoundRadius(hl.L(20.0f));
        addView(de0Var);
        ff0 ff0Var = new ff0(context, (byte) 0);
        this.d = ff0Var;
        jn7.i(ff0Var);
        jn7.i(de0Var);
        ff0Var.setTextSize(16);
        int i2 = aob.j5;
        yob.W(ff0Var, i2, vnbVar);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        ff0Var.setGravity(i);
        addView(ff0Var);
        ema emaVar = new ema(context);
        this.e = emaVar;
        emaVar.setTextSize(14);
        yob.W(emaVar, i2, vnbVar);
        emaVar.setGravity(ob6.a0 ? 5 : 3);
        addView(emaVar);
        RadioButton radioButton = new RadioButton(context);
        this.f = radioButton;
        radioButton.setSize(hl.L(20.0f));
        yob.O(radioButton, aob.j7, aob.E5, vnbVar);
        addView(radioButton);
        d();
        if (!b()) {
            radioButton.setVisibility(8);
        }
    }

    public int a() {
        return 0;
    }

    public boolean b() {
        return false;
    }

    public void c(boolean z, boolean z2) {
        RadioButton radioButton = this.f;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z, true);
        }
    }

    public void d() {
        int i;
        float f;
        float f2;
        int i2;
        int i3;
        float f3;
        float f4;
        int i4;
        int i5;
        float f5;
        float f6;
        float f7;
        float f8;
        int i6;
        int i7 = 3;
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        int i8 = i | 16;
        if (b()) {
            f = 53.0f;
        } else {
            f = 16.0f;
        }
        if (b()) {
            f2 = 53.0f;
        } else {
            f2 = 16.0f;
        }
        this.c.setLayoutParams(tre.d(40, 40.0f, i8, f, 0.0f, f2, 0.0f));
        boolean z = ob6.a0;
        if (z) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i9 = i2 | 16;
        int i10 = 70;
        if (z) {
            f3 = 20.0f;
        } else {
            if (b()) {
                i3 = 105;
            } else {
                i3 = 70;
            }
            f3 = i3;
        }
        if (ob6.a0) {
            if (b()) {
                i6 = 105;
            } else {
                i6 = 70;
            }
            f4 = i6;
        } else {
            f4 = 20.0f;
        }
        this.d.setLayoutParams(tre.d(-1, -2.0f, i9, f3, 0.0f, f4, 0.0f));
        boolean z2 = ob6.a0;
        if (z2) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        int i11 = i4 | 16;
        if (z2) {
            f5 = 20.0f;
        } else {
            if (b()) {
                i5 = 105;
            } else {
                i5 = 70;
            }
            f5 = i5;
        }
        if (ob6.a0) {
            if (b()) {
                i10 = 105;
            }
            f6 = i10;
        } else {
            f6 = 20.0f;
        }
        this.e.setLayoutParams(tre.d(-1, -2.0f, i11, f5, 0.0f, f6, 0.0f));
        boolean z3 = ob6.a0;
        if (z3) {
            i7 = 5;
        }
        int i12 = i7 | 16;
        if (z3) {
            f7 = 15.0f;
        } else {
            f7 = 20.0f;
        }
        if (z3) {
            f8 = 20.0f;
        } else {
            f8 = 15.0f;
        }
        this.f.setLayoutParams(tre.d(22, 22.0f, i12, f7, 0.0f, f8, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        super.dispatchDraw(canvas);
        if (this.n) {
            int v0 = aob.v0(aob.d7, this.a);
            Paint paint = this.h;
            paint.setColor(v0);
            if (b()) {
                i = 105;
            } else {
                i = 70;
            }
            if (this.c.getVisibility() == 8) {
                i -= 40;
            }
            int a = a() + i;
            if (ob6.a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - hl.L(a), getHeight(), paint);
            } else {
                canvas.drawRect(hl.L(a), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public final SpannableStringBuilder e(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(2131230875);
        wm2 wm2Var = new wm2(2, drawable);
        drawable.setBounds(0, hl.L(1.0f), hl.L(11.0f), hl.L(12.0f));
        spannableString.setSpan(wm2Var, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public int getFullHeight() {
        return 56;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(getFullHeight()), 1073741824));
    }

    public void setCellBackgroundVisible(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.r.setVisibility(i);
    }

    public void setDivider(boolean z) {
        this.n = z;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        ema emaVar = this.e;
        ff0 ff0Var = this.d;
        if (isEmpty) {
            ff0Var.setTranslationY(0.0f);
            emaVar.setVisibility(8);
        } else {
            ff0Var.setTranslationY(hl.L(-9.0f));
            emaVar.setTranslationY(hl.L(12.0f));
            emaVar.l(charSequence, false);
            emaVar.setVisibility(0);
        }
        if (this.c.getVisibility() == 8) {
            if (ob6.a0) {
                ff0Var.setTranslationX(hl.L(40.0f));
                emaVar.setTranslationX(hl.L(40.0f));
                return;
            }
            ff0Var.setTranslationX(hl.L(-40.0f));
            emaVar.setTranslationX(hl.L(-40.0f));
        }
    }

    public void setSubtitleColorKey(int i) {
        yob.W(this.e, i, this.a);
    }
}
