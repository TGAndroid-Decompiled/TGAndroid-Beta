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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
public class le8 extends FrameLayout implements bbb, x74 {
    public final qy1 E;
    public Integer F;
    public final fm0 a;
    public final fm0 b;
    public final wjb c;
    public final py d;
    public kd8 e;
    public final ImageView f;
    public final ImageView h;
    public jia n;
    public final wf2 r;
    public boolean s;
    public boolean w;
    public AnimatorSet x;
    public boolean y;

    public le8(Context context, int i, View.OnClickListener onClickListener, wjb wjbVar) {
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
        s33 s33Var = s33.h;
        this.a = new fm0(0, this, s33Var, 380L, false);
        this.b = new fm0(1, this, s33Var, 380L, false);
        this.c = wjbVar;
        py pyVar = new py(this, context, wjbVar, (byte) 2);
        this.d = pyVar;
        pyVar.setAllowTextEntitiesIntersection(true);
        zkb.X(pyVar, bkb.F6, wjbVar);
        zkb.G(pyVar, bkb.Wc, wjbVar);
        zkb.D(pyVar, bkb.G6, wjbVar);
        pyVar.setTextSize(1, 16.0f);
        pyVar.setMaxLines(Integer.MAX_VALUE);
        pyVar.setBackground(null);
        pyVar.setImeOptions(pyVar.getImeOptions() | 268435456);
        pyVar.setInputType(pyVar.getInputType() | 16384);
        pyVar.setPadding(gl.L(4.0f), gl.L(10.0f), gl.L(4.0f), gl.L(11.0f));
        if (onClickListener != null) {
            if (i == 1) {
                i6 = 92;
            } else {
                i6 = 58;
            }
            boolean z = k96.a0;
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
            addView(pyVar, nme.d(-1, -2.0f, i13, f3, 0.0f, f4, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(2131231853);
            int i14 = bkb.l6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            zkb.s(imageView, i14, wjbVar, mode);
            if (k96.a0) {
                i8 = 5;
            } else {
                i8 = 3;
            }
            addView(imageView, nme.d(48, 48.0f, i8 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            int i15 = bkb.Li;
            ff0 f0 = bkb.f0(bkb.v0(i15, wjbVar), 1, -1);
            vkb M = zkb.M(i15);
            imageView2.setBackground(f0);
            zkb.j(imageView2, f0, null, M, wjbVar);
            imageView2.setImageResource(2131232566);
            imageView2.setOnClickListener(onClickListener);
            zkb.s(imageView2, i14, wjbVar, mode);
            imageView2.setContentDescription(k96.M0(2131751586, null));
            boolean z2 = k96.a0;
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
            addView(imageView2, nme.d(48, 50.0f, i16, f5, 0.0f, f6, 0.0f));
            jia jiaVar = new jia(context);
            this.n = jiaVar;
            jiaVar.setTextSize(13);
            jia jiaVar2 = this.n;
            if (k96.a0) {
                i10 = 3;
            } else {
                i10 = 5;
            }
            jiaVar2.setGravity(i10 | 48);
            View view = this.n;
            boolean z3 = k96.a0;
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
            addView(view, nme.d(48, 24.0f, i17, f7, 43.0f, f8, 0.0f));
            wf2 wf2Var = new wf2(21, wjbVar, context);
            this.r = wf2Var;
            wf2Var.b(-1, i14, bkb.j7);
            wf2Var.setContentDescription(k96.M0(2131754795, null));
            wf2Var.setDrawUnchecked(true);
            wf2Var.a(true, false);
            wf2Var.setAlpha(0.0f);
            wf2Var.setDrawBackgroundAsArc(8);
            if (k96.a0) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            addView(wf2Var, nme.d(48, 48.0f, i12 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            wf2Var.setOnClickListener(new View.OnClickListener(this) {
                public final le8 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    byte b = r2;
                    le8 le8Var = this.b;
                    switch (b) {
                        case 0:
                            wf2 wf2Var2 = le8Var.r;
                            if (wf2Var2.getTag() != null) {
                                le8Var.i(le8Var, !wf2Var2.a.q);
                                return;
                            }
                            return;
                        default:
                            le8Var.k(le8Var);
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
            boolean z4 = k96.a0;
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
            addView(pyVar, nme.d(-1, -2.0f, i18, f, 0.0f, z4 ? 19.0f : i2, 0.0f));
        }
        if (i == 1) {
            qy1 qy1Var = new qy1(context);
            this.E = qy1Var;
            zkb.s(qy1Var, bkb.l6, wjbVar, PorterDuff.Mode.SRC_IN);
            qy1Var.j(oy1.e, false);
            int L = gl.L(9.5f);
            qy1Var.setPadding(L, L, L, L);
            qy1Var.setVisibility(8);
            if (this.f == null) {
                i4 = 3;
            } else {
                i4 = 38;
            }
            boolean z5 = k96.a0;
            if (z5) {
                f2 = i4;
                i5 = 3;
            } else {
                f2 = 0.0f;
                i5 = 5;
            }
            addView(qy1Var, nme.d(48, 48.0f, i5, f2, 0.0f, z5 ? 0.0f : i4, 0.0f));
            int i19 = bkb.Li;
            ff0 f02 = bkb.f0(bkb.v0(i19, wjbVar), 1, -1);
            vkb M2 = zkb.M(i19);
            qy1Var.setBackground(f02);
            zkb.j(qy1Var, f02, null, M2, wjbVar);
            qy1Var.setOnClickListener(new View.OnClickListener(this) {
                public final le8 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    byte b = r2;
                    le8 le8Var = this.b;
                    switch (b) {
                        case 0:
                            wf2 wf2Var2 = le8Var.r;
                            if (wf2Var2.getTag() != null) {
                                le8Var.i(le8Var, !wf2Var2.a.q);
                                return;
                            }
                            return;
                        default:
                            le8Var.k(le8Var);
                            return;
                    }
                }
            });
            qy1Var.setContentDescription(k96.M0(2131751184, null));
        }
    }

    @Override
    public final boolean a() {
        return false;
    }

    public final kd8 b() {
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
        kd8 kd8Var = new kd8(getContext(), 38);
        this.e = kd8Var;
        kd8Var.setFocusable(false);
        kd8 kd8Var2 = this.e;
        int i5 = bkb.Li;
        wjb wjbVar = this.c;
        zkb.R(kd8Var2, bkb.f0(bkb.v0(i5, wjbVar), 1, -1), null, zkb.M(i5), wjbVar);
        ote.a(this.e);
        kd8 kd8Var3 = this.e;
        boolean z = k96.a0;
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
        addView(kd8Var3, nme.d(48, 50.0f, i7, f, 0.0f, f2, 0.0f));
        qy1 qy1Var = this.E;
        if (qy1Var != null) {
            boolean z2 = k96.a0;
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
            qy1Var.setLayoutParams(nme.d(48, 48.0f, i8, f4, 1.0f, f5, 0.0f));
        }
        py pyVar = this.d;
        if (pyVar != null) {
            if (k96.a0) {
                i2 = ((ViewGroup.MarginLayoutParams) pyVar.getLayoutParams()).rightMargin;
            } else {
                i2 = ((ViewGroup.MarginLayoutParams) pyVar.getLayoutParams()).leftMargin;
            }
            float f6 = i2 / gl.p;
            if (qy1Var != null) {
                i3 = 70;
            } else {
                i3 = 19;
            }
            int i9 = i3 + 24;
            boolean z3 = k96.a0;
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
            pyVar.setLayoutParams(nme.d(-1, -2.0f, i10, f3, 0.0f, f6, 0.0f));
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
        jia jiaVar = new jia(getContext());
        this.n = jiaVar;
        jiaVar.setTextSize(13);
        jia jiaVar2 = this.n;
        int i2 = 5;
        if (k96.a0) {
            i = 3;
        } else {
            i = 5;
        }
        jiaVar2.setGravity(i | 48);
        jia jiaVar3 = this.n;
        boolean z = k96.a0;
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
        addView(jiaVar3, nme.d(48, 24.0f, i3, f, 17.0f, f2, 0.0f));
    }

    public boolean f() {
        return true;
    }

    public boolean g(le8 le8Var) {
        return false;
    }

    public wf2 getCheckBox() {
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

    public qy1 getEmojiButton() {
        return this.E;
    }

    @Override
    public CharSequence getFieldText() {
        py pyVar = this.d;
        if (pyVar.length() > 0) {
            return pyVar.getText();
        }
        return null;
    }

    @Override
    public d getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public jia getTextView2() {
        return this.n;
    }

    public void i(le8 le8Var, boolean z) {
        this.r.a(z, true);
    }

    public boolean m(ArrayList arrayList) {
        return false;
    }

    public final void n(boolean z, boolean z2) {
        boolean z3;
        float f;
        float f2;
        wf2 wf2Var = this.r;
        if (wf2Var.getTag() != null) {
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
        wf2Var.setTag(num);
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wf2Var, property, fArr);
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
        wf2Var.setAlpha(f);
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
        py pyVar = this.d;
        pyVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            pyVar.setSelection(pyVar.length());
        }
        pyVar.setHint(str);
        this.w = z;
        setWillNotDraw(!z);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wf2 wf2Var = this.r;
        if (wf2Var != null) {
            n(q(), false);
            wf2Var.a(g(this), false);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float L;
        int i;
        if (this.w && f()) {
            boolean z = k96.a0;
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
                L = gl.L(f);
            }
            float f3 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                if (imageView != null) {
                    f2 = 58.0f;
                }
                i = gl.L(f2);
            } else {
                i = 0;
            }
            canvas.drawLine(f3, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, bkb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        qy1 qy1Var;
        ImageView imageView;
        py pyVar;
        int i3;
        float f;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        while (true) {
            int childCount = getChildCount();
            qy1Var = this.E;
            imageView = this.f;
            pyVar = this.d;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt != pyVar) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824));
                } else if (childAt == qy1Var) {
                    qy1Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824));
                    } else {
                        jia jiaVar = this.n;
                        if (childAt == jiaVar) {
                            jiaVar.measure(View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), 1073741824));
                        } else {
                            wf2 wf2Var = this.r;
                            if (childAt == wf2Var) {
                                wf2Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824));
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
        } else if (qy1Var != null) {
            i3 = 144;
        } else {
            i3 = 122;
        }
        pyVar.measure(View.MeasureSpec.makeMeasureSpec(((size - getPaddingLeft()) - getPaddingRight()) - gl.L(i3), 1073741824), 0);
        int measuredHeight = pyVar.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(gl.L(50.0f), pyVar.getMeasuredHeight()) + (this.w ? 1 : 0));
        jia jiaVar2 = this.n;
        if (jiaVar2 != null && !this.y) {
            if (measuredHeight >= gl.L(52.0f)) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            jiaVar2.setAlpha(f);
        }
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        qy1 qy1Var;
        int i2;
        if (i == 0) {
            wf2 wf2Var = this.r;
            if (wf2Var != null) {
                CheckBoxBase checkBoxBase = wf2Var.getCheckBoxBase();
                float f3 = this.a.e;
                if (checkBoxBase.w != f3) {
                    checkBoxBase.w = f3;
                    checkBoxBase.b();
                }
                wf2Var.invalidate();
            }
        } else if (i == 1 && (qy1Var = this.E) != null) {
            float f4 = this.b.e;
            float f5 = 0.85f * f4;
            qy1Var.setScaleX(f5);
            qy1Var.setScaleY(f5);
            qy1Var.setAlpha(f4);
            if (f4 > 0.0f) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            qy1Var.setVisibility(i2);
            jia jiaVar = this.n;
            if (jiaVar != null && this.f == null && jiaVar.getVisibility() == 0) {
                kd8 kd8Var = this.e;
                jia jiaVar2 = this.n;
                if (kd8Var != null) {
                    jiaVar2.setTranslationY(gl.L(36.0f));
                } else {
                    jiaVar2.setTranslationY(gl.L(26.0f) * f4);
                }
            }
        }
    }

    public boolean q() {
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
        wjb wjbVar = this.c;
        ImageView imageView = this.h;
        if (imageView != null) {
            zkb.s(imageView, i, wjbVar, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            zkb.s(imageView2, i, wjbVar, PorterDuff.Mode.MULTIPLY);
        }
        qy1 qy1Var = this.E;
        if (qy1Var != null) {
            zkb.s(qy1Var, i, wjbVar, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setShowNextButton(boolean z) {
        this.s = z;
    }

    public void setText2(String str) {
        jia jiaVar = this.n;
        if (jiaVar == null) {
            return;
        }
        jiaVar.l(str, false);
    }

    public void setTextColor(int i) {
        this.d.setTextColor(i);
    }

    public void setTextRight(int i) {
        this.F = Integer.valueOf(i);
    }

    public void j(boolean z) {
    }

    public void k(le8 le8Var) {
    }

    public void l(py pyVar) {
    }

    @Override
    public final void D(float f, int i) {
    }

    public void h(py pyVar, ActionMode actionMode) {
    }
}
