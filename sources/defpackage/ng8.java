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
public class ng8 extends FrameLayout implements ddb, g94 {
    public final d02 E;
    public Integer F;
    public final fn0 a;
    public final fn0 b;
    public final ylb c;
    public final pz d;
    public mf8 e;
    public final ImageView f;
    public final ImageView h;
    public lka n;
    public final jh2 r;
    public boolean s;
    public boolean w;
    public AnimatorSet x;
    public boolean y;

    public ng8(Context context, int i, View.OnClickListener onClickListener, ylb ylbVar) {
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
        d53 d53Var = d53.h;
        this.a = new fn0(0, this, d53Var, 380L, false);
        this.b = new fn0(1, this, d53Var, 380L, false);
        this.c = ylbVar;
        pz pzVar = new pz(this, context, ylbVar, (byte) 2);
        this.d = pzVar;
        pzVar.setAllowTextEntitiesIntersection(true);
        anb.X(pzVar, cmb.F6, ylbVar);
        anb.G(pzVar, cmb.Wc, ylbVar);
        anb.D(pzVar, cmb.G6, ylbVar);
        pzVar.setTextSize(1, 16.0f);
        pzVar.setMaxLines(Integer.MAX_VALUE);
        pzVar.setBackground(null);
        pzVar.setImeOptions(pzVar.getImeOptions() | 268435456);
        pzVar.setInputType(pzVar.getInputType() | 16384);
        pzVar.setPadding(gm.L(4.0f), gm.L(10.0f), gm.L(4.0f), gm.L(11.0f));
        if (onClickListener != null) {
            if (i == 1) {
                i6 = 92;
            } else {
                i6 = 58;
            }
            boolean z = jb6.a0;
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
            addView(pzVar, qoe.d(-1, -2.0f, i13, f3, 0.0f, f4, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(2131231854);
            int i14 = cmb.l6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            anb.s(imageView, i14, ylbVar, mode);
            if (jb6.a0) {
                i8 = 5;
            } else {
                i8 = 3;
            }
            addView(imageView, qoe.d(48, 48.0f, i8 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            int i15 = cmb.Li;
            fg0 f0 = cmb.f0(cmb.v0(i15, ylbVar), 1, -1);
            wmb M = anb.M(i15);
            imageView2.setBackground(f0);
            anb.j(imageView2, f0, null, M, ylbVar);
            imageView2.setImageResource(2131232578);
            imageView2.setOnClickListener(onClickListener);
            anb.s(imageView2, i14, ylbVar, mode);
            imageView2.setContentDescription(jb6.M0(2131751535, null));
            boolean z2 = jb6.a0;
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
            addView(imageView2, qoe.d(48, 50.0f, i16, f5, 0.0f, f6, 0.0f));
            lka lkaVar = new lka(context);
            this.n = lkaVar;
            lkaVar.setTextSize(13);
            lka lkaVar2 = this.n;
            if (jb6.a0) {
                i10 = 3;
            } else {
                i10 = 5;
            }
            lkaVar2.setGravity(i10 | 48);
            View view = this.n;
            boolean z3 = jb6.a0;
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
            addView(view, qoe.d(48, 24.0f, i17, f7, 43.0f, f8, 0.0f));
            jh2 jh2Var = new jh2(21, ylbVar, context);
            this.r = jh2Var;
            jh2Var.b(-1, i14, cmb.j7);
            jh2Var.setContentDescription(jb6.M0(2131754795, null));
            jh2Var.setDrawUnchecked(true);
            jh2Var.a(true, false);
            jh2Var.setAlpha(0.0f);
            jh2Var.setDrawBackgroundAsArc(8);
            if (jb6.a0) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            addView(jh2Var, qoe.d(48, 48.0f, i12 | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            jh2Var.setOnClickListener(new View.OnClickListener(this) {
                public final ng8 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    byte b = r2;
                    ng8 ng8Var = this.b;
                    switch (b) {
                        case 0:
                            jh2 jh2Var2 = ng8Var.r;
                            if (jh2Var2.getTag() != null) {
                                ng8Var.i(ng8Var, !jh2Var2.a.q);
                                return;
                            }
                            return;
                        default:
                            ng8Var.k(ng8Var);
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
            boolean z4 = jb6.a0;
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
            addView(pzVar, qoe.d(-1, -2.0f, i18, f, 0.0f, z4 ? 19.0f : i2, 0.0f));
        }
        if (i == 1) {
            d02 d02Var = new d02(context);
            this.E = d02Var;
            anb.s(d02Var, cmb.l6, ylbVar, PorterDuff.Mode.SRC_IN);
            d02Var.j(b02.e, false);
            int L = gm.L(9.5f);
            d02Var.setPadding(L, L, L, L);
            d02Var.setVisibility(8);
            if (this.f == null) {
                i4 = 3;
            } else {
                i4 = 38;
            }
            boolean z5 = jb6.a0;
            if (z5) {
                f2 = i4;
                i5 = 3;
            } else {
                f2 = 0.0f;
                i5 = 5;
            }
            addView(d02Var, qoe.d(48, 48.0f, i5, f2, 0.0f, z5 ? 0.0f : i4, 0.0f));
            int i19 = cmb.Li;
            fg0 f02 = cmb.f0(cmb.v0(i19, ylbVar), 1, -1);
            wmb M2 = anb.M(i19);
            d02Var.setBackground(f02);
            anb.j(d02Var, f02, null, M2, ylbVar);
            d02Var.setOnClickListener(new View.OnClickListener(this) {
                public final ng8 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    byte b = r2;
                    ng8 ng8Var = this.b;
                    switch (b) {
                        case 0:
                            jh2 jh2Var2 = ng8Var.r;
                            if (jh2Var2.getTag() != null) {
                                ng8Var.i(ng8Var, !jh2Var2.a.q);
                                return;
                            }
                            return;
                        default:
                            ng8Var.k(ng8Var);
                            return;
                    }
                }
            });
            d02Var.setContentDescription(jb6.M0(2131751133, null));
        }
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        d02 d02Var;
        int i2;
        if (i == 0) {
            jh2 jh2Var = this.r;
            if (jh2Var != null) {
                CheckBoxBase checkBoxBase = jh2Var.getCheckBoxBase();
                float f3 = this.a.e;
                if (checkBoxBase.w != f3) {
                    checkBoxBase.w = f3;
                    checkBoxBase.b();
                }
                jh2Var.invalidate();
            }
        } else if (i == 1 && (d02Var = this.E) != null) {
            float f4 = this.b.e;
            float f5 = 0.85f * f4;
            d02Var.setScaleX(f5);
            d02Var.setScaleY(f5);
            d02Var.setAlpha(f4);
            if (f4 > 0.0f) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            d02Var.setVisibility(i2);
            lka lkaVar = this.n;
            if (lkaVar != null && this.f == null && lkaVar.getVisibility() == 0) {
                mf8 mf8Var = this.e;
                lka lkaVar2 = this.n;
                if (mf8Var != null) {
                    lkaVar2.setTranslationY(gm.L(36.0f));
                } else {
                    lkaVar2.setTranslationY(gm.L(26.0f) * f4);
                }
            }
        }
    }

    @Override
    public final boolean a() {
        return false;
    }

    public final mf8 b() {
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
        mf8 mf8Var = new mf8(getContext(), 38);
        this.e = mf8Var;
        mf8Var.setFocusable(false);
        mf8 mf8Var2 = this.e;
        int i5 = cmb.Li;
        ylb ylbVar = this.c;
        anb.R(mf8Var2, cmb.f0(cmb.v0(i5, ylbVar), 1, -1), null, anb.M(i5), ylbVar);
        rve.a(this.e);
        mf8 mf8Var3 = this.e;
        boolean z = jb6.a0;
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
        addView(mf8Var3, qoe.d(48, 50.0f, i7, f, 0.0f, f2, 0.0f));
        d02 d02Var = this.E;
        if (d02Var != null) {
            boolean z2 = jb6.a0;
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
            d02Var.setLayoutParams(qoe.d(48, 48.0f, i8, f4, 1.0f, f5, 0.0f));
        }
        pz pzVar = this.d;
        if (pzVar != null) {
            if (jb6.a0) {
                i2 = ((ViewGroup.MarginLayoutParams) pzVar.getLayoutParams()).rightMargin;
            } else {
                i2 = ((ViewGroup.MarginLayoutParams) pzVar.getLayoutParams()).leftMargin;
            }
            float f6 = i2 / gm.p;
            if (d02Var != null) {
                i3 = 70;
            } else {
                i3 = 19;
            }
            int i9 = i3 + 24;
            boolean z3 = jb6.a0;
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
            pzVar.setLayoutParams(qoe.d(-1, -2.0f, i10, f3, 0.0f, f6, 0.0f));
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
        lka lkaVar = new lka(getContext());
        this.n = lkaVar;
        lkaVar.setTextSize(13);
        lka lkaVar2 = this.n;
        int i2 = 5;
        if (jb6.a0) {
            i = 3;
        } else {
            i = 5;
        }
        lkaVar2.setGravity(i | 48);
        lka lkaVar3 = this.n;
        boolean z = jb6.a0;
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
        addView(lkaVar3, qoe.d(48, 24.0f, i3, f, 17.0f, f2, 0.0f));
    }

    public boolean f() {
        return true;
    }

    public boolean g(ng8 ng8Var) {
        return false;
    }

    public jh2 getCheckBox() {
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

    public d02 getEmojiButton() {
        return this.E;
    }

    @Override
    public CharSequence getFieldText() {
        pz pzVar = this.d;
        if (pzVar.length() > 0) {
            return pzVar.getText();
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

    public lka getTextView2() {
        return this.n;
    }

    public void i(ng8 ng8Var, boolean z) {
        this.r.a(z, true);
    }

    public boolean m(ArrayList arrayList) {
        return false;
    }

    public final void n(boolean z, boolean z2) {
        boolean z3;
        float f;
        float f2;
        jh2 jh2Var = this.r;
        if (jh2Var.getTag() != null) {
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
        jh2Var.setTag(num);
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jh2Var, property, fArr);
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
        jh2Var.setAlpha(f);
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
        pz pzVar = this.d;
        pzVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            pzVar.setSelection(pzVar.length());
        }
        pzVar.setHint(str);
        this.w = z;
        setWillNotDraw(!z);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jh2 jh2Var = this.r;
        if (jh2Var != null) {
            n(p(), false);
            jh2Var.a(g(this), false);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float L;
        int i;
        if (this.w && f()) {
            boolean z = jb6.a0;
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
                L = gm.L(f);
            }
            float f3 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                if (imageView != null) {
                    f2 = 58.0f;
                }
                i = gm.L(f2);
            } else {
                i = 0;
            }
            canvas.drawLine(f3, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        d02 d02Var;
        ImageView imageView;
        pz pzVar;
        int i3;
        float f;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        while (true) {
            int childCount = getChildCount();
            d02Var = this.E;
            imageView = this.f;
            pzVar = this.d;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt != pzVar) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
                } else if (childAt == d02Var) {
                    d02Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
                    } else {
                        lka lkaVar = this.n;
                        if (childAt == lkaVar) {
                            lkaVar.measure(View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(24.0f), 1073741824));
                        } else {
                            jh2 jh2Var = this.r;
                            if (childAt == jh2Var) {
                                jh2Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
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
        } else if (d02Var != null) {
            i3 = 144;
        } else {
            i3 = 122;
        }
        pzVar.measure(View.MeasureSpec.makeMeasureSpec(((size - getPaddingLeft()) - getPaddingRight()) - gm.L(i3), 1073741824), 0);
        int measuredHeight = pzVar.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(gm.L(50.0f), pzVar.getMeasuredHeight()) + (this.w ? 1 : 0));
        lka lkaVar2 = this.n;
        if (lkaVar2 != null && !this.y) {
            if (measuredHeight >= gm.L(52.0f)) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            lkaVar2.setAlpha(f);
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
        ylb ylbVar = this.c;
        ImageView imageView = this.h;
        if (imageView != null) {
            anb.s(imageView, i, ylbVar, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            anb.s(imageView2, i, ylbVar, PorterDuff.Mode.MULTIPLY);
        }
        d02 d02Var = this.E;
        if (d02Var != null) {
            anb.s(d02Var, i, ylbVar, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setShowNextButton(boolean z) {
        this.s = z;
    }

    public void setText2(String str) {
        lka lkaVar = this.n;
        if (lkaVar == null) {
            return;
        }
        lkaVar.l(str, false);
    }

    public void setTextColor(int i) {
        this.d.setTextColor(i);
    }

    public void setTextRight(int i) {
        this.F = Integer.valueOf(i);
    }

    public void j(boolean z) {
    }

    public void k(ng8 ng8Var) {
    }

    public void l(pz pzVar) {
    }

    @Override
    public final void V(float f, int i) {
    }

    public void h(pz pzVar, ActionMode actionMode) {
    }
}
