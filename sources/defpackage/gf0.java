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
public abstract class gf0 extends FrameLayout {
    public final wjb a;
    public final pb0 b;
    public final be0 c;
    public final df0 d;
    public final jia e;
    public final RadioButton f;
    public final Paint h;
    public boolean n;
    public final View r;

    public gf0(Context context, wjb wjbVar) {
        super(context);
        int i;
        pb0 pb0Var = new pb0((wjb) null);
        this.b = pb0Var;
        this.h = new Paint(1);
        this.a = wjbVar;
        View view = new View(context);
        this.r = view;
        addView(view, nme.o(-1, -1));
        zkb.h(bkb.g5, wjbVar, view);
        pb0Var.r = gl.L(40.0f);
        be0 be0Var = new be0(context);
        this.c = be0Var;
        be0Var.setRoundRadius(gl.L(20.0f));
        addView(be0Var);
        df0 df0Var = new df0(context, (byte) 0);
        this.d = df0Var;
        kk7.i(df0Var);
        kk7.i(be0Var);
        df0Var.setTextSize(16);
        int i2 = bkb.i5;
        zkb.W(df0Var, i2, wjbVar);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        df0Var.setGravity(i);
        addView(df0Var);
        jia jiaVar = new jia(context);
        this.e = jiaVar;
        jiaVar.setTextSize(14);
        zkb.W(jiaVar, i2, wjbVar);
        jiaVar.setGravity(k96.a0 ? 5 : 3);
        addView(jiaVar);
        RadioButton radioButton = new RadioButton(context);
        this.f = radioButton;
        radioButton.setSize(gl.L(20.0f));
        zkb.O(radioButton, bkb.i7, bkb.D5, wjbVar);
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
        if (k96.a0) {
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
        this.c.setLayoutParams(nme.d(40, 40.0f, i8, f, 0.0f, f2, 0.0f));
        boolean z = k96.a0;
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
        if (k96.a0) {
            if (b()) {
                i6 = 105;
            } else {
                i6 = 70;
            }
            f4 = i6;
        } else {
            f4 = 20.0f;
        }
        this.d.setLayoutParams(nme.d(-1, -2.0f, i9, f3, 0.0f, f4, 0.0f));
        boolean z2 = k96.a0;
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
        if (k96.a0) {
            if (b()) {
                i10 = 105;
            }
            f6 = i10;
        } else {
            f6 = 20.0f;
        }
        this.e.setLayoutParams(nme.d(-1, -2.0f, i11, f5, 0.0f, f6, 0.0f));
        boolean z3 = k96.a0;
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
        this.f.setLayoutParams(nme.d(22, 22.0f, i12, f7, 0.0f, f8, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        super.dispatchDraw(canvas);
        if (this.n) {
            int v0 = bkb.v0(bkb.c7, this.a);
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
            if (k96.a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - gl.L(a), getHeight(), paint);
            } else {
                canvas.drawRect(gl.L(a), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public final SpannableStringBuilder e(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(2131230875);
        cm2 cm2Var = new cm2(2, drawable);
        drawable.setBounds(0, gl.L(1.0f), gl.L(11.0f), gl.L(12.0f));
        spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public int getFullHeight() {
        return 56;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(getFullHeight()), 1073741824));
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
        jia jiaVar = this.e;
        df0 df0Var = this.d;
        if (isEmpty) {
            df0Var.setTranslationY(0.0f);
            jiaVar.setVisibility(8);
        } else {
            df0Var.setTranslationY(gl.L(-9.0f));
            jiaVar.setTranslationY(gl.L(12.0f));
            jiaVar.l(charSequence, false);
            jiaVar.setVisibility(0);
        }
        if (this.c.getVisibility() == 8) {
            if (k96.a0) {
                df0Var.setTranslationX(gl.L(40.0f));
                jiaVar.setTranslationX(gl.L(40.0f));
                return;
            }
            df0Var.setTranslationX(gl.L(-40.0f));
            jiaVar.setTranslationX(gl.L(-40.0f));
        }
    }

    public void setSubtitleColorKey(int i) {
        zkb.W(this.e, i, this.a);
    }
}
