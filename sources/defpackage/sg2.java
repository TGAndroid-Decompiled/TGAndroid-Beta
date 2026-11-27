package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
public final class sg2 extends FrameLayout {
    public final byte E;
    public final byte F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public View J;
    public View K;
    public int a;
    public final vnb b;
    public final te1 c;
    public final qg2 d;
    public final View e;
    public final TextView f;
    public final View h;
    public final CheckBoxSquare n;
    public final og2 r;
    public View s;
    public final rg2 w;
    public final de0 x;
    public final rb0 y;

    public sg2(Context context, int i, int i2, boolean z, vnb vnbVar) {
        super(context);
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        this.b = vnbVar;
        this.E = i;
        this.I = z;
        boolean z2 = true;
        if (z) {
            qg2 qg2Var = new qg2(this, context, (byte) 0);
            this.d = qg2Var;
            jn7.i(qg2Var);
            qg2Var.setEllipsizeByGradient(true);
            qg2Var.setRightPadding(hl.L(8.0f));
            qg2Var.getDrawable().r(true, false);
            if (i != 1 && i != 5) {
                i22 = aob.G6;
            } else {
                i22 = aob.j5;
            }
            qg2Var.setTag(Integer.valueOf(aob.v0(i22, vnbVar)));
            qg2Var.setTextSize(hl.L(16.0f));
            if (i == 7) {
                qg2Var.setTypeface(hl.o());
            }
            if (i == 3) {
                qg2Var.setGravity(19);
                addView(qg2Var, tre.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                qg2Var.setPadding(0, 0, 0, hl.L(3.0f));
            } else {
                qg2Var.setRightPadding(hl.L(i2));
                if (ob6.a0) {
                    i23 = 5;
                } else {
                    i23 = 3;
                }
                qg2Var.setGravity(i23 | 16);
                if (i == 2) {
                    boolean z3 = ob6.a0;
                    if (z3) {
                        i28 = 5;
                    } else {
                        i28 = 3;
                    }
                    int i31 = i28 | 16;
                    if (z3) {
                        i29 = 8;
                    } else {
                        i29 = 29;
                    }
                    float f = i29;
                    if (z3) {
                        i30 = 29;
                    } else {
                        i30 = 8;
                    }
                    addView(qg2Var, tre.d(-1, -2.0f, i31, f, 0.0f, i30, 0.0f));
                } else {
                    if (a()) {
                        i24 = 56;
                    } else {
                        i24 = 46;
                    }
                    i24 = i == 7 ? i24 + 39 : i24;
                    boolean z4 = ob6.a0;
                    if (z4) {
                        i25 = 5;
                    } else {
                        i25 = 3;
                    }
                    int i32 = i25 | 16;
                    if (z4) {
                        i26 = i2;
                    } else {
                        i26 = (i2 - 17) + i24;
                    }
                    float f2 = i26;
                    if (z4) {
                        i27 = (i2 - 17) + i24;
                    } else {
                        i27 = i2;
                    }
                    addView(qg2Var, tre.d(-1, -2.0f, i32, f2, 0.0f, i27, 0.0f));
                }
            }
            this.e = qg2Var;
        } else {
            te1 te1Var = new te1((byte) 2, context, this);
            this.c = te1Var;
            jn7.i(te1Var);
            if (i != 1 && i != 5) {
                i3 = aob.G6;
            } else {
                i3 = aob.j5;
            }
            te1Var.setTag(Integer.valueOf(aob.v0(i3, vnbVar)));
            te1Var.setTextSize(1, 16.0f);
            te1Var.setLines(1);
            te1Var.setMaxLines(1);
            te1Var.setSingleLine(true);
            te1Var.setEllipsize(TextUtils.TruncateAt.END);
            if (i == 7) {
                te1Var.setTypeface(hl.o());
            }
            if (i == 3) {
                te1Var.setGravity(19);
                addView(te1Var, tre.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                te1Var.setPadding(0, 0, 0, hl.L(3.0f));
            } else {
                if (ob6.a0) {
                    i4 = 5;
                } else {
                    i4 = 3;
                }
                te1Var.setGravity(i4 | 16);
                if (i == 2) {
                    boolean z5 = ob6.a0;
                    if (z5) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    int i33 = i10 | 16;
                    if (z5) {
                        i11 = 8;
                    } else {
                        i11 = 29;
                    }
                    float f3 = i11;
                    if (z5) {
                        i12 = 29;
                    } else {
                        i12 = 8;
                    }
                    addView(te1Var, tre.d(-1, -2.0f, i33, f3, 0.0f, i12, 0.0f));
                } else {
                    if (a()) {
                        i5 = 56;
                    } else {
                        i5 = 46;
                    }
                    i5 = i == 7 ? i5 + 39 : i5;
                    if (a()) {
                        i6 = -2;
                    } else {
                        i6 = -1;
                    }
                    int i34 = i6;
                    boolean z6 = ob6.a0;
                    if (z6) {
                        i7 = 5;
                    } else {
                        i7 = 3;
                    }
                    int i35 = i7 | 16;
                    if (z6) {
                        i8 = i2;
                    } else {
                        i8 = (i2 - 17) + i5;
                    }
                    float f4 = i8;
                    if (z6) {
                        i9 = (i2 - 17) + i5;
                    } else {
                        i9 = i2;
                    }
                    addView(te1Var, tre.d(i34, -2.0f, i35, f4, 0.0f, i9, 0.0f));
                }
            }
            this.e = te1Var;
        }
        TextView textView = new TextView(context);
        this.f = textView;
        if (i != 1 && i != 5) {
            i13 = aob.I6;
        } else {
            i13 = aob.m5;
        }
        textView.setTag(Integer.valueOf(i13));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (ob6.a0) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        textView.setGravity(i14 | 16);
        if (ob6.a0) {
            i15 = 3;
        } else {
            i15 = 5;
        }
        int i36 = i15 | 48;
        float f5 = i2;
        addView(textView, tre.d(-2, -1.0f, i36, f5, 0.0f, f5, 0.0f));
        if (a()) {
            og2 og2Var = new og2(21, vnbVar, context);
            this.r = og2Var;
            this.h = og2Var;
            og2Var.setDrawUnchecked(true);
            og2Var.a(true, false);
            og2Var.setDrawBackgroundAsArc(10);
            this.F = (byte) 21;
            boolean z7 = ob6.a0;
            int i37 = (z7 ? 5 : 3) | 48;
            if (z7) {
                i20 = 0;
            } else {
                i20 = i2;
            }
            float f6 = i20;
            if (z7) {
                i21 = i2;
            } else {
                i21 = 0;
            }
            addView(og2Var, tre.d(21, 21.0f, i37, f6, 16.0f, i21, 0.0f));
        } else {
            if (i != 1 && i != 5) {
                z2 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(vnbVar, context, z2);
            this.n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.F = (byte) 18;
            if (i == 5) {
                boolean z8 = ob6.a0;
                int i38 = (z8 ? 5 : 3) | 16;
                if (z8) {
                    i18 = 0;
                } else {
                    i18 = i2;
                }
                float f7 = i18;
                if (z8) {
                    i19 = i2;
                } else {
                    i19 = 0;
                }
                addView(checkBoxSquare, tre.d(18, 18.0f, i38, f7, 0.0f, i19, 0.0f));
            } else if (i == 3) {
                addView(checkBoxSquare, tre.d(18, 18.0f, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                boolean z9 = ob6.a0;
                if (i == 2) {
                    addView(checkBoxSquare, tre.d(18, 18.0f, (z9 ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
                } else {
                    int i39 = (z9 ? 5 : 3) | 48;
                    if (z9) {
                        i16 = 0;
                    } else {
                        i16 = i2;
                    }
                    float f8 = i16;
                    if (z9) {
                        i17 = i2;
                    } else {
                        i17 = 0;
                    }
                    addView(checkBoxSquare, tre.d(18, 18.0f, i39, f8, 16.0f, i17, 0.0f));
                }
            }
        }
        if (i == 6) {
            rg2 rg2Var = new rg2(this, context, 2131232165);
            this.w = rg2Var;
            addView(rg2Var, tre.i(-2.0f, -2.0f, 8388629, f5, 0.0f, i2 - 11, 0.0f));
        } else if (i == 8) {
            rg2 rg2Var2 = new rg2(this, context, 0);
            this.w = rg2Var2;
            addView(rg2Var2, tre.i(-2.0f, -2.0f, 8388629, f5, 0.0f, i2 - 11, 0.0f));
        } else if (i == 7) {
            this.y = new rb0((vnb) null);
            de0 de0Var = new de0(context);
            this.x = de0Var;
            de0Var.setRoundRadius(hl.L(17.0f));
            addView(de0Var, tre.i(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
        }
        g();
    }

    public final boolean a() {
        byte b = this.E;
        if (b != 4 && b != 8 && b != 6 && b != 7) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        og2 og2Var = this.r;
        if (og2Var != null) {
            return og2Var.a.q;
        }
        return this.n.h;
    }

    public final void c(boolean z, boolean z2) {
        og2 og2Var = this.r;
        if (og2Var != null) {
            og2Var.a(z, z2);
        } else {
            this.n.a(z, z2);
        }
    }

    public final void d(k1 k1Var, t tVar) {
        int i;
        View view = this.J;
        if (k1Var == null) {
            if (view != null) {
                removeView(view);
                this.J = null;
            }
        } else {
            if (view == null) {
                View view2 = new View(getContext());
                this.J = view2;
                int i2 = aob.i6;
                vnb vnbVar = this.b;
                hf0 f0 = aob.f0(aob.v0(i2, vnbVar), 2, -1);
                uob M = yob.M(i2);
                view2.setBackground(f0);
                yob.j(view2, f0, null, M, vnbVar);
                addView(this.J, tre.e(-1, -1, 119));
            }
            this.J.setOnClickListener(k1Var);
        }
        View view3 = this.K;
        if (tVar == null) {
            if (view3 != null) {
                removeView(view3);
                this.K = null;
                return;
            }
            return;
        }
        if (view3 == null) {
            View view4 = new View(getContext());
            this.K = view4;
            if (ob6.a0) {
                i = 5;
            } else {
                i = 3;
            }
            addView(view4, tre.e(56, -1, i));
        }
        this.K.setOnClickListener(tVar);
    }

    public final void e(CharSequence charSequence, String str, boolean z, boolean z2, boolean z3) {
        if (this.I) {
            qg2 qg2Var = this.d;
            qg2Var.c(pv3.m(charSequence, qg2Var.getPaint().getFontMetricsInt(), false, null, 0), z3, true);
        } else {
            this.c.setText(charSequence);
        }
        og2 og2Var = this.r;
        if (og2Var != null) {
            og2Var.a(z, z3);
        } else {
            this.n.a(z, z3);
        }
        this.f.setText(str);
        this.G = z2;
        setWillNotDraw(!z2);
    }

    public final void f() {
        float f;
        float left;
        View view = this.e;
        if (this.s == null) {
            return;
        }
        try {
            f = view.getMeasuredWidth();
        } catch (Exception unused) {
            f = 0.0f;
        }
        if (ob6.a0) {
            left = (view.getRight() - f) - hl.L(20.0f);
        } else {
            left = view.getLeft() + f + hl.L(4.0f);
        }
        this.s.setTranslationX(left);
    }

    public final void g() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = this.I;
        vnb vnbVar = this.b;
        byte b = this.E;
        if (z) {
            if (b != 1 && b != 5) {
                i4 = aob.G6;
            } else {
                i4 = aob.j5;
            }
            yob.U(this.d, i4, vnbVar);
        } else {
            if (b != 1 && b != 5) {
                i = aob.G6;
            } else {
                i = aob.j5;
            }
            te1 te1Var = this.c;
            yob.X(te1Var, i, vnbVar);
            if (b != 1 && b != 5) {
                i2 = aob.J6;
            } else {
                i2 = aob.k5;
            }
            yob.G(te1Var, i2, vnbVar);
        }
        if (b != 1 && b != 5) {
            i3 = aob.I6;
        } else {
            i3 = aob.m5;
        }
        yob.X(this.f, i3, vnbVar);
    }

    public in getAnimatedTextView() {
        return this.d;
    }

    public og2 getCheckBoxRound() {
        return this.r;
    }

    public View getCheckBoxView() {
        return this.h;
    }

    public TextView getTextView() {
        return this.c;
    }

    public TextView getValueTextView() {
        return this.f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        Paint paint;
        float f2;
        if (this.G) {
            if (a()) {
                f = 60.0f;
            } else {
                f = 20.0f;
            }
            int L = hl.L(f) + ((int) Math.abs(this.e.getTranslationX()));
            if (this.E == 7) {
                L += hl.L(39.0f);
            }
            vnb vnbVar = this.b;
            if (vnbVar != null) {
                paint = vnbVar.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = aob.j0;
            }
            Paint paint2 = paint;
            if (ob6.a0) {
                f2 = 0.0f;
            } else {
                f2 = L;
            }
            float f3 = f2;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!ob6.a0) {
                L = 0;
            }
            canvas.drawLine(f3, measuredHeight, measuredWidth - L, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        qg2 qg2Var = this.d;
        if (qg2Var != null) {
            accessibilityNodeInfo.setText(qg2Var.getText());
        } else {
            te1 te1Var = this.c;
            if (te1Var != null) {
                accessibilityNodeInfo.setText(te1Var.getText());
            }
        }
        accessibilityNodeInfo.setChecked(b());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int size = View.MeasureSpec.getSize(i);
        View view = this.h;
        byte b = this.F;
        View view2 = this.e;
        TextView textView = this.f;
        byte b2 = this.E;
        if (b2 == 3) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(hl.L(10.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), 1073741824));
            view2.measure(View.MeasureSpec.makeMeasureSpec(size - hl.L(34.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), Integer.MIN_VALUE));
            float f2 = b;
            view.measure(View.MeasureSpec.makeMeasureSpec(hl.L(f2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(f2), 1073741824));
            setMeasuredDimension(hl.L(29.0f) + view2.getMeasuredWidth(), hl.L(50.0f));
        } else if (this.H) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), 0);
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(50.0f) + (this.G ? 1 : 0));
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            if (a()) {
                f = 60.0f;
            } else {
                f = 34.0f;
            }
            int L = measuredWidth - hl.L(f);
            if (this.I) {
                L += (int) this.d.getRightPadding();
            }
            if (b2 == 7) {
                L -= hl.L(34.0f);
            }
            if (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                L -= ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin;
            }
            int i3 = L / 2;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            int measuredWidth2 = textView.getMeasuredWidth();
            rg2 rg2Var = this.w;
            if (rg2Var != null) {
                rg2Var.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                measuredWidth2 = c00.A(11.0f, rg2Var.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(ik8.f(8.0f, (L - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            } else {
                view2.measure(ik8.f(8.0f, (L - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            }
            de0 de0Var = this.x;
            if (de0Var != null) {
                de0Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(34.0f), 1073741824));
            }
            float f3 = b;
            view.measure(View.MeasureSpec.makeMeasureSpec(hl.L(f3), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(f3), 1073741824));
        }
        View view3 = this.J;
        if (view3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            this.J.measure(View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), 1073741824));
        }
        View view4 = this.K;
        if (view4 != null) {
            view4.measure(View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), 1073741824));
        }
        View view5 = this.s;
        if (view5 != null) {
            view5.measure(View.MeasureSpec.makeMeasureSpec(hl.L(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(16.0f), 1073741824));
        }
    }

    public void setCollapsed(Boolean bool) {
        float f;
        View view = this.s;
        if (bool == null) {
            if (view != null) {
                removeView(view);
                this.s = null;
                return;
            }
            return;
        }
        if (view == null) {
            this.s = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
            yob.x(this, mutate, aob.G6, this.b, PorterDuff.Mode.MULTIPLY);
            this.s.setBackground(mutate);
            addView(this.s, tre.e(16, 16, 16));
        }
        f();
        this.s.animate().cancel();
        ViewPropertyAnimator animate = this.s.animate();
        if (bool.booleanValue()) {
            f = 0.0f;
        } else {
            f = 180.0f;
        }
        animate.rotation(f).setDuration(340L).setInterpolator(k43.h).start();
    }

    @Override
    public void setEnabled(boolean z) {
        float f;
        float f2;
        super.setEnabled(z);
        float f3 = 0.5f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        this.e.setAlpha(f);
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.5f;
        }
        this.f.setAlpha(f2);
        if (z) {
            f3 = 1.0f;
        }
        this.h.setAlpha(f3);
    }

    public void setIcon(int i) {
        this.r.setIcon(i);
    }

    public void setMultiline(boolean z) {
        if (this.I) {
            return;
        }
        this.H = z;
        View view = this.e;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        View view2 = this.h;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        boolean z2 = this.H;
        te1 te1Var = this.c;
        if (z2) {
            te1Var.setLines(0);
            te1Var.setMaxLines(0);
            te1Var.setSingleLine(false);
            te1Var.setEllipsize(null);
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 16;
            layoutParams2.topMargin = 0;
        } else {
            te1Var.setLines(1);
            te1Var.setMaxLines(1);
            te1Var.setSingleLine(true);
            te1Var.setEllipsize(TextUtils.TruncateAt.END);
            view.setPadding(0, 0, 0, 0);
            layoutParams.height = -1;
            layoutParams.topMargin = 0;
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 48;
            layoutParams2.topMargin = hl.L(15.0f);
        }
        view.setLayoutParams(layoutParams);
        view2.setLayoutParams(layoutParams2);
    }

    public void setNeedDivider(boolean z) {
        this.G = z;
    }

    public void setPad(int i) {
        int i2;
        int i3 = i * 40;
        if (ob6.a0) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        int L = hl.L(i3 * i2);
        View view = this.h;
        if (view != null) {
            view.setTranslationX(L);
        }
        float f = L;
        this.e.setTranslationX(f);
        de0 de0Var = this.x;
        if (de0Var != null) {
            de0Var.setTranslationX(f);
        }
        View view2 = this.J;
        if (view2 != null) {
            view2.setTranslationX(f);
        }
        View view3 = this.K;
        if (view3 != null) {
            view3.setTranslationX(f);
        }
    }

    public void setTextColor(int i) {
        int i2;
        if (this.I) {
            qg2 qg2Var = this.d;
            yob.q(qg2Var);
            qg2Var.setTextColor(i);
            return;
        }
        te1 te1Var = this.c;
        yob.q(te1Var);
        te1Var.setTextColor(i);
        byte b = this.E;
        if (b != 1 && b != 5) {
            i2 = aob.J6;
        } else {
            i2 = aob.k5;
        }
        if (te1Var.getLinkTextColors() != null) {
            int defaultColor = te1Var.getLinkTextColors().getDefaultColor();
            vnb vnbVar = this.b;
            if (defaultColor == aob.v0(i2, vnbVar)) {
                yob.G(te1Var, i2, vnbVar);
            }
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        String o;
        rb0 rb0Var = this.y;
        rb0Var.k(tLObject);
        this.x.f(tLObject, rb0Var);
        boolean z = tLObject instanceof TLRPC.User;
        if (z) {
            o = lbc.r((TLRPC.User) tLObject);
        } else {
            o = lv2.o(tLObject);
        }
        if (z && ((TLRPC.User) tLObject).id == uc7.s1(yac.t0).L3) {
            o = ob6.M0(2131752435, null);
        }
        if (this.I) {
            qg2 qg2Var = this.d;
            qg2Var.setText(pv3.m(o, qg2Var.getPaint().getFontMetricsInt(), false, null, 0));
            return;
        }
        this.c.setText(o);
    }

    public sg2(Context context, int i) {
        this(context, i, 17, false, null);
    }

    public sg2(int i, vnb vnbVar, Context context) {
        this(context, i, 17, false, vnbVar);
    }
}
