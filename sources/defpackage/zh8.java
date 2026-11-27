package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
public class zh8 extends FrameLayout implements xeb, s84 {
    public final iz1 E;
    public Integer F;
    public final fm0 a;
    public final fm0 b;
    public final vnb c;
    public final qy d;
    public yg8 e;
    public final ImageView f;
    public final ImageView h;
    public ema n;
    public final og2 r;
    public boolean s;
    public boolean w;
    public AnimatorSet x;
    public boolean y;

    public zh8(Context context, int i, View.OnClickListener onClickListener, vnb vnbVar) {
        super(context);
        int i2;
        int i3;
        float f;
        int i4;
        float f2;
        int i5;
        int i6;
        int i7;
        float f3;
        float f4;
        int i8;
        int i9;
        float f5;
        float f6;
        int i10;
        int i11;
        float f7;
        float f8;
        int i12;
        k43 k43Var = k43.h;
        this.a = new fm0(0, this, k43Var, 380L, false);
        this.b = new fm0(1, this, k43Var, 380L, false);
        this.c = vnbVar;
        qy qyVar = new qy(this, context, vnbVar, (byte) 2);
        this.d = qyVar;
        qyVar.setAllowTextEntitiesIntersection(true);
        yob.X(qyVar, aob.G6, vnbVar);
        yob.G(qyVar, aob.Xc, vnbVar);
        yob.D(qyVar, aob.H6, vnbVar);
        qyVar.setTextSize(1, 16.0f);
        qyVar.setMaxLines(Integer.MAX_VALUE);
        qyVar.setBackground(null);
        qyVar.setImeOptions(qyVar.getImeOptions() | 268435456);
        qyVar.setInputType(qyVar.getInputType() | 16384);
        qyVar.setPadding(hl.L(4.0f), hl.L(10.0f), hl.L(4.0f), hl.L(11.0f));
        if (onClickListener != null) {
            if (i == 1) {
                i6 = 92;
            } else {
                i6 = 58;
            }
            boolean z = ob6.a0;
            if (z) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            int i13 = i7 | 16;
            if (z) {
                f3 = i6;
            } else {
                f3 = 54.0f;
            }
            if (!z) {
                f4 = i6;
            } else {
                f4 = 54.0f;
            }
            addView(qyVar, tre.d(-1, -2.0f, i13, f3, 0.0f, f4, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(2131231853);
            int i14 = aob.m6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            yob.s(imageView, i14, vnbVar, mode);
            if (ob6.a0) {
                i8 = 5;
            } else {
                i8 = 3;
            }
            addView(imageView, tre.d(48, 48.0f, i8 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            int i15 = aob.Mi;
            hf0 f0 = aob.f0(aob.v0(i15, vnbVar), 1, -1);
            uob M = yob.M(i15);
            imageView2.setBackground(f0);
            yob.j(imageView2, f0, null, M, vnbVar);
            imageView2.setImageResource(2131232577);
            imageView2.setOnClickListener(onClickListener);
            yob.s(imageView2, i14, vnbVar, mode);
            imageView2.setContentDescription(ob6.M0(2131751563, null));
            boolean z2 = ob6.a0;
            if (z2) {
                i9 = 3;
            } else {
                i9 = 5;
            }
            int i16 = i9 | 48;
            if (z2) {
                f5 = 3.0f;
            } else {
                f5 = 0.0f;
            }
            if (z2) {
                f6 = 0.0f;
            } else {
                f6 = 3.0f;
            }
            addView(imageView2, tre.d(48, 50.0f, i16, f5, 0.0f, f6, 0.0f));
            ema emaVar = new ema(context);
            this.n = emaVar;
            emaVar.setTextSize(13);
            ema emaVar2 = this.n;
            if (ob6.a0) {
                i10 = 3;
            } else {
                i10 = 5;
            }
            emaVar2.setGravity(i10 | 48);
            View view = this.n;
            boolean z3 = ob6.a0;
            if (z3) {
                i11 = 3;
            } else {
                i11 = 5;
            }
            int i17 = i11 | 48;
            if (z3) {
                f7 = 20.0f;
            } else {
                f7 = 0.0f;
            }
            if (z3) {
                f8 = 0.0f;
            } else {
                f8 = 20.0f;
            }
            addView(view, tre.d(48, 24.0f, i17, f7, 43.0f, f8, 0.0f));
            og2 og2Var = new og2(21, vnbVar, context);
            this.r = og2Var;
            og2Var.b(-1, i14, aob.k7);
            og2Var.setContentDescription(ob6.M0(2131754791, null));
            og2Var.setDrawUnchecked(true);
            og2Var.a(true, false);
            og2Var.setAlpha(0.0f);
            og2Var.setDrawBackgroundAsArc(8);
            if (ob6.a0) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            addView(og2Var, tre.d(48, 48.0f, i12 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            og2Var.setOnClickListener(new View.OnClickListener(this) {
                public final zh8 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    byte b = r2;
                    zh8 zh8Var = this.b;
                    switch (b) {
                        case 0:
                            og2 og2Var2 = zh8Var.r;
                            if (og2Var2.getTag() != null) {
                                zh8Var.i(zh8Var, !og2Var2.a.q);
                                return;
                            }
                            return;
                        default:
                            zh8Var.k(zh8Var);
                            return;
                    }
                }
            });
        } else {
            if (i == 1) {
                i2 = 70;
            } else {
                i2 = 19;
            }
            boolean z4 = ob6.a0;
            if (z4) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            int i18 = i3 | 16;
            if (z4) {
                f = i2;
            } else {
                f = 19.0f;
            }
            addView(qyVar, tre.d(-1, -2.0f, i18, f, 0.0f, z4 ? 19.0f : i2, 0.0f));
        }
        if (i == 1) {
            iz1 iz1Var = new iz1(context);
            this.E = iz1Var;
            yob.s(iz1Var, aob.m6, vnbVar, PorterDuff.Mode.SRC_IN);
            iz1Var.j(gz1.e, false);
            int L = hl.L(9.5f);
            iz1Var.setPadding(L, L, L, L);
            iz1Var.setVisibility(8);
            if (this.f == null) {
                i4 = 3;
            } else {
                i4 = 38;
            }
            boolean z5 = ob6.a0;
            if (z5) {
                f2 = i4;
                i5 = 3;
            } else {
                f2 = 0.0f;
                i5 = 5;
            }
            addView(iz1Var, tre.d(48, 48.0f, i5, f2, 0.0f, z5 ? 0.0f : i4, 0.0f));
            int i19 = aob.Mi;
            hf0 f02 = aob.f0(aob.v0(i19, vnbVar), 1, -1);
            uob M2 = yob.M(i19);
            iz1Var.setBackground(f02);
            yob.j(iz1Var, f02, null, M2, vnbVar);
            iz1Var.setOnClickListener(new View.OnClickListener(this) {
                public final zh8 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    byte b = r2;
                    zh8 zh8Var = this.b;
                    switch (b) {
                        case 0:
                            og2 og2Var2 = zh8Var.r;
                            if (og2Var2.getTag() != null) {
                                zh8Var.i(zh8Var, !og2Var2.a.q);
                                return;
                            }
                            return;
                        default:
                            zh8Var.k(zh8Var);
                            return;
                    }
                }
            });
            iz1Var.setContentDescription(ob6.M0(2131751161, null));
        }
    }

    @Override
    public final boolean a() {
        return false;
    }

    public final yg8 b() {
        int i;
        float f;
        float f2;
        int i2;
        int i3;
        float f3;
        int i4;
        float f4;
        float f5;
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        yg8 yg8Var = new yg8(getContext(), 38);
        this.e = yg8Var;
        yg8Var.setFocusable(false);
        yg8 yg8Var2 = this.e;
        int i5 = aob.Mi;
        vnb vnbVar = this.c;
        yob.R(yg8Var2, aob.f0(aob.v0(i5, vnbVar), 1, -1), null, yob.M(i5), vnbVar);
        iye.a(this.e);
        yg8 yg8Var3 = this.e;
        boolean z = ob6.a0;
        int i6 = 5;
        if (z) {
            i = 3;
        } else {
            i = 5;
        }
        int i7 = i | 48;
        if (z) {
            f = 4.0f;
        } else {
            f = 0.0f;
        }
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = 4.0f;
        }
        addView(yg8Var3, tre.d(48, 50.0f, i7, f, 0.0f, f2, 0.0f));
        iz1 iz1Var = this.E;
        if (iz1Var != null) {
            boolean z2 = ob6.a0;
            if (z2) {
                i4 = 3;
            } else {
                i4 = 5;
            }
            int i8 = i4 | 48;
            if (z2) {
                f4 = 44.0f;
            } else {
                f4 = 0.0f;
            }
            if (z2) {
                f5 = 0.0f;
            } else {
                f5 = 44.0f;
            }
            iz1Var.setLayoutParams(tre.d(48, 48.0f, i8, f4, 1.0f, f5, 0.0f));
        }
        qy qyVar = this.d;
        if (qyVar != null) {
            if (ob6.a0) {
                i2 = ((ViewGroup.MarginLayoutParams) qyVar.getLayoutParams()).rightMargin;
            } else {
                i2 = ((ViewGroup.MarginLayoutParams) qyVar.getLayoutParams()).leftMargin;
            }
            float f6 = i2 / hl.p;
            if (iz1Var != null) {
                i3 = 70;
            } else {
                i3 = 19;
            }
            int i9 = i3 + 24;
            boolean z3 = ob6.a0;
            if (!z3) {
                i6 = 3;
            }
            int i10 = i6 | 16;
            if (z3) {
                f3 = i9;
            } else {
                f3 = f6;
            }
            if (!z3) {
                f6 = i9;
            }
            qyVar.setLayoutParams(tre.d(-1, -2.0f, i10, f3, 0.0f, f6, 0.0f));
        }
        return this.e;
    }

    public final void c(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    @Override
    public final void d(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void e() {
        int i;
        float f;
        float f2;
        this.y = true;
        ema emaVar = new ema(getContext());
        this.n = emaVar;
        emaVar.setTextSize(13);
        ema emaVar2 = this.n;
        int i2 = 5;
        if (ob6.a0) {
            i = 3;
        } else {
            i = 5;
        }
        emaVar2.setGravity(i | 48);
        ema emaVar3 = this.n;
        boolean z = ob6.a0;
        if (z) {
            i2 = 3;
        }
        int i3 = i2 | 48;
        if (z) {
            f = 20.0f;
        } else {
            f = 0.0f;
        }
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = 20.0f;
        }
        addView(emaVar3, tre.d(48, 24.0f, i3, f, 17.0f, f2, 0.0f));
    }

    public boolean f() {
        return true;
    }

    public boolean g(zh8 zh8Var) {
        return false;
    }

    public og2 getCheckBox() {
        return this.r;
    }

    @Override
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override
    public float getEditFieldBottomOffset() {
        return 0.0f;
    }

    @Override
    public Editable getEditText() {
        return this.d.getText();
    }

    public iz1 getEmojiButton() {
        return this.E;
    }

    @Override
    public CharSequence getFieldText() {
        qy qyVar = this.d;
        if (qyVar.length() > 0) {
            return qyVar.getText();
        }
        return null;
    }

    @Override
    public e getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public ema getTextView2() {
        return this.n;
    }

    public void i(zh8 zh8Var, boolean z) {
        this.r.a(z, true);
    }

    public boolean m(ArrayList arrayList) {
        return false;
    }

    public final void n(boolean z, boolean z2) {
        boolean z3;
        float f;
        float f2;
        og2 og2Var = this.r;
        if (og2Var.getTag() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z == z3) {
            return;
        }
        AnimatorSet animatorSet = this.x;
        Integer num = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x = null;
        }
        if (z) {
            num = 1;
        }
        og2Var.setTag(num);
        ImageView imageView = this.h;
        float f3 = 0.0f;
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.x = animatorSet2;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            float[] fArr = {f2};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(og2Var, property, fArr);
            if (!z) {
                f3 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(imageView, property, f3));
            this.x.setDuration(180L);
            this.x.start();
            return;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        og2Var.setAlpha(f);
        if (!z) {
            f3 = 1.0f;
        }
        imageView.setAlpha(f3);
    }

    public final void o(CharSequence charSequence, String str, boolean z) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        qy qyVar = this.d;
        qyVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            qyVar.setSelection(qyVar.length());
        }
        qyVar.setHint(str);
        this.w = z;
        setWillNotDraw(!z);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        og2 og2Var = this.r;
        if (og2Var != null) {
            n(p(), false);
            og2Var.a(g(this), false);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float L;
        int i;
        if (this.w && f()) {
            boolean z = ob6.a0;
            float f2 = 20.0f;
            ImageView imageView = this.h;
            if (z) {
                L = 0.0f;
            } else {
                if (imageView != null) {
                    f = 58.0f;
                } else {
                    f = 20.0f;
                }
                L = hl.L(f);
            }
            float f3 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                if (imageView != null) {
                    f2 = 58.0f;
                }
                i = hl.L(f2);
            } else {
                i = 0;
            }
            canvas.drawLine(f3, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, aob.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        iz1 iz1Var;
        ImageView imageView;
        qy qyVar;
        int i3;
        float f;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        while (true) {
            int childCount = getChildCount();
            iz1Var = this.E;
            imageView = this.f;
            qyVar = this.d;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt != qyVar) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
                } else if (childAt == iz1Var) {
                    iz1Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
                    } else {
                        ema emaVar = this.n;
                        if (childAt == emaVar) {
                            emaVar.measure(View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(24.0f), 1073741824));
                        } else {
                            og2 og2Var = this.r;
                            if (childAt == og2Var) {
                                og2Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
                            } else {
                                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                if (layoutParams != null) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                                } else {
                                    childAt.measure(i, i2);
                                }
                            }
                        }
                    }
                }
            }
            i4++;
        }
        Integer num = this.F;
        if (num != null) {
            i3 = num.intValue();
        } else if (this.n == null) {
            i3 = 42;
        } else if (imageView == null) {
            i3 = 70;
        } else if (iz1Var != null) {
            i3 = 144;
        } else {
            i3 = 122;
        }
        qyVar.measure(View.MeasureSpec.makeMeasureSpec(((size - getPaddingLeft()) - getPaddingRight()) - hl.L(i3), 1073741824), 0);
        int measuredHeight = qyVar.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(hl.L(50.0f), qyVar.getMeasuredHeight()) + (this.w ? 1 : 0));
        ema emaVar2 = this.n;
        if (emaVar2 != null && !this.y) {
            if (measuredHeight >= hl.L(52.0f)) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            emaVar2.setAlpha(f);
        }
    }

    public boolean p() {
        return false;
    }

    public void setEmojiButtonVisibility(boolean z) {
        this.b.a(z, true);
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i) {
        vnb vnbVar = this.c;
        ImageView imageView = this.h;
        if (imageView != null) {
            yob.s(imageView, i, vnbVar, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            yob.s(imageView2, i, vnbVar, PorterDuff.Mode.MULTIPLY);
        }
        iz1 iz1Var = this.E;
        if (iz1Var != null) {
            yob.s(iz1Var, i, vnbVar, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setShowNextButton(boolean z) {
        this.s = z;
    }

    public void setText2(String str) {
        ema emaVar = this.n;
        if (emaVar == null) {
            return;
        }
        emaVar.l(str, false);
    }

    public void setTextColor(int i) {
        this.d.setTextColor(i);
    }

    public void setTextRight(int i) {
        this.F = Integer.valueOf(i);
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        iz1 iz1Var;
        int i2;
        if (i == 0) {
            og2 og2Var = this.r;
            if (og2Var != null) {
                CheckBoxBase checkBoxBase = og2Var.getCheckBoxBase();
                float f3 = this.a.e;
                if (checkBoxBase.w != f3) {
                    checkBoxBase.w = f3;
                    checkBoxBase.b();
                }
                og2Var.invalidate();
            }
        } else if (i == 1 && (iz1Var = this.E) != null) {
            float f4 = this.b.e;
            float f5 = 0.85f * f4;
            iz1Var.setScaleX(f5);
            iz1Var.setScaleY(f5);
            iz1Var.setAlpha(f4);
            if (f4 > 0.0f) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            iz1Var.setVisibility(i2);
            ema emaVar = this.n;
            if (emaVar != null && this.f == null && emaVar.getVisibility() == 0) {
                yg8 yg8Var = this.e;
                ema emaVar2 = this.n;
                if (yg8Var != null) {
                    emaVar2.setTranslationY(hl.L(36.0f));
                } else {
                    emaVar2.setTranslationY(hl.L(26.0f) * f4);
                }
            }
        }
    }

    public void j(boolean z) {
    }

    public void k(zh8 zh8Var) {
    }

    public void l(qy qyVar) {
    }

    public void h(qy qyVar, ActionMode actionMode) {
    }

    @Override
    public final void v0(float f, int i) {
    }
}
