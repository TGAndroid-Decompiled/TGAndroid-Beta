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
public abstract class gg0 extends FrameLayout {
    public final ylb a;
    public final pc0 b;
    public final bf0 c;
    public final dg0 d;
    public final lka e;
    public final RadioButton f;
    public final Paint h;
    public boolean n;
    public final View r;

    public gg0(Context context, ylb ylbVar) {
        super(context);
        int i;
        pc0 pc0Var = new pc0((ylb) null);
        this.b = pc0Var;
        this.h = new Paint(1);
        this.a = ylbVar;
        View view = new View(context);
        this.r = view;
        addView(view, qoe.o(-1, -1));
        anb.h(cmb.g5, ylbVar, view);
        pc0Var.r = gm.L(40.0f);
        bf0 bf0Var = new bf0(context);
        this.c = bf0Var;
        bf0Var.setRoundRadius(gm.L(20.0f));
        addView(bf0Var);
        dg0 dg0Var = new dg0(context, (byte) 0);
        this.d = dg0Var;
        nm7.i(dg0Var);
        nm7.i(bf0Var);
        dg0Var.setTextSize(16);
        int i2 = cmb.i5;
        anb.W(dg0Var, i2, ylbVar);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        dg0Var.setGravity(i);
        addView(dg0Var);
        lka lkaVar = new lka(context);
        this.e = lkaVar;
        lkaVar.setTextSize(14);
        anb.W(lkaVar, i2, ylbVar);
        lkaVar.setGravity(jb6.a0 ? 5 : 3);
        addView(lkaVar);
        RadioButton radioButton = new RadioButton(context);
        this.f = radioButton;
        radioButton.setSize(gm.L(20.0f));
        anb.O(radioButton, cmb.i7, cmb.D5, ylbVar);
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
        if (jb6.a0) {
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
        this.c.setLayoutParams(qoe.d(40, 40.0f, i8, f, 0.0f, f2, 0.0f));
        boolean z = jb6.a0;
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
        if (jb6.a0) {
            if (b()) {
                i6 = 105;
            } else {
                i6 = 70;
            }
            f4 = i6;
        } else {
            f4 = 20.0f;
        }
        this.d.setLayoutParams(qoe.d(-1, -2.0f, i9, f3, 0.0f, f4, 0.0f));
        boolean z2 = jb6.a0;
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
        if (jb6.a0) {
            if (b()) {
                i10 = 105;
            }
            f6 = i10;
        } else {
            f6 = 20.0f;
        }
        this.e.setLayoutParams(qoe.d(-1, -2.0f, i11, f5, 0.0f, f6, 0.0f));
        boolean z3 = jb6.a0;
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
        this.f.setLayoutParams(qoe.d(22, 22.0f, i12, f7, 0.0f, f8, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        super.dispatchDraw(canvas);
        if (this.n) {
            int v0 = cmb.v0(cmb.c7, this.a);
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
            if (jb6.a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - gm.L(a), getHeight(), paint);
            } else {
                canvas.drawRect(gm.L(a), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public final SpannableStringBuilder e(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(2131230876);
        pn2 pn2Var = new pn2(2, drawable);
        drawable.setBounds(0, gm.L(1.0f), gm.L(11.0f), gm.L(12.0f));
        spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public int getFullHeight() {
        return 56;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(getFullHeight()), 1073741824));
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
        lka lkaVar = this.e;
        dg0 dg0Var = this.d;
        if (isEmpty) {
            dg0Var.setTranslationY(0.0f);
            lkaVar.setVisibility(8);
        } else {
            dg0Var.setTranslationY(gm.L(-9.0f));
            lkaVar.setTranslationY(gm.L(12.0f));
            lkaVar.l(charSequence, false);
            lkaVar.setVisibility(0);
        }
        if (this.c.getVisibility() == 8) {
            if (jb6.a0) {
                dg0Var.setTranslationX(gm.L(40.0f));
                lkaVar.setTranslationX(gm.L(40.0f));
                return;
            }
            dg0Var.setTranslationX(gm.L(-40.0f));
            lkaVar.setTranslationX(gm.L(-40.0f));
        }
    }

    public void setSubtitleColorKey(int i) {
        anb.W(this.e, i, this.a);
    }
}
