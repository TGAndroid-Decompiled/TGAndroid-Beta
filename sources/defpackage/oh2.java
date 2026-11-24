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
public final class oh2 extends FrameLayout {
    public final byte E;
    public final byte F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public View J;
    public View K;
    public int a;
    public final ylb b;
    public final sf1 c;
    public final mh2 d;
    public final View e;
    public final TextView f;
    public final View h;
    public final CheckBoxSquare n;
    public final jh2 r;
    public View s;
    public final nh2 w;
    public final bf0 x;
    public final pc0 y;

    public oh2(Context context, int i, int i2, boolean z, ylb ylbVar) {
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
        this.b = ylbVar;
        this.E = i;
        this.I = z;
        boolean z2 = true;
        if (z) {
            mh2 mh2Var = new mh2(this, context, (byte) 0);
            this.d = mh2Var;
            nm7.i(mh2Var);
            mh2Var.setEllipsizeByGradient(true);
            mh2Var.setRightPadding(gm.L(8.0f));
            mh2Var.getDrawable().r(true, false);
            if (i != 1 && i != 5) {
                i22 = cmb.F6;
            } else {
                i22 = cmb.i5;
            }
            mh2Var.setTag(Integer.valueOf(cmb.v0(i22, ylbVar)));
            mh2Var.setTextSize(gm.L(16.0f));
            if (i == 7) {
                mh2Var.setTypeface(gm.o());
            }
            if (i == 3) {
                mh2Var.setGravity(19);
                addView(mh2Var, qoe.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                mh2Var.setPadding(0, 0, 0, gm.L(3.0f));
            } else {
                mh2Var.setRightPadding(gm.L(i2));
                if (jb6.a0) {
                    i23 = 5;
                } else {
                    i23 = 3;
                }
                mh2Var.setGravity(i23 | 16);
                if (i == 2) {
                    boolean z3 = jb6.a0;
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
                    addView(mh2Var, qoe.d(-1, -2.0f, i31, f, 0.0f, i30, 0.0f));
                } else {
                    if (a()) {
                        i24 = 56;
                    } else {
                        i24 = 46;
                    }
                    i24 = i == 7 ? i24 + 39 : i24;
                    boolean z4 = jb6.a0;
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
                    addView(mh2Var, qoe.d(-1, -2.0f, i32, f2, 0.0f, i27, 0.0f));
                }
            }
            this.e = mh2Var;
        } else {
            sf1 sf1Var = new sf1((byte) 2, context, this);
            this.c = sf1Var;
            nm7.i(sf1Var);
            if (i != 1 && i != 5) {
                i3 = cmb.F6;
            } else {
                i3 = cmb.i5;
            }
            sf1Var.setTag(Integer.valueOf(cmb.v0(i3, ylbVar)));
            sf1Var.setTextSize(1, 16.0f);
            sf1Var.setLines(1);
            sf1Var.setMaxLines(1);
            sf1Var.setSingleLine(true);
            sf1Var.setEllipsize(TextUtils.TruncateAt.END);
            if (i == 7) {
                sf1Var.setTypeface(gm.o());
            }
            if (i == 3) {
                sf1Var.setGravity(19);
                addView(sf1Var, qoe.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                sf1Var.setPadding(0, 0, 0, gm.L(3.0f));
            } else {
                if (jb6.a0) {
                    i4 = 5;
                } else {
                    i4 = 3;
                }
                sf1Var.setGravity(i4 | 16);
                if (i == 2) {
                    boolean z5 = jb6.a0;
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
                    addView(sf1Var, qoe.d(-1, -2.0f, i33, f3, 0.0f, i12, 0.0f));
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
                    boolean z6 = jb6.a0;
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
                    addView(sf1Var, qoe.d(i34, -2.0f, i35, f4, 0.0f, i9, 0.0f));
                }
            }
            this.e = sf1Var;
        }
        TextView textView = new TextView(context);
        this.f = textView;
        if (i != 1 && i != 5) {
            i13 = cmb.H6;
        } else {
            i13 = cmb.l5;
        }
        textView.setTag(Integer.valueOf(i13));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (jb6.a0) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        textView.setGravity(i14 | 16);
        if (jb6.a0) {
            i15 = 3;
        } else {
            i15 = 5;
        }
        int i36 = i15 | 48;
        float f5 = i2;
        addView(textView, qoe.d(-2, -1.0f, i36, f5, 0.0f, f5, 0.0f));
        if (a()) {
            jh2 jh2Var = new jh2(21, ylbVar, context);
            this.r = jh2Var;
            this.h = jh2Var;
            jh2Var.setDrawUnchecked(true);
            jh2Var.a(true, false);
            jh2Var.setDrawBackgroundAsArc(10);
            this.F = (byte) 21;
            boolean z7 = jb6.a0;
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
            addView(jh2Var, qoe.d(21, 21.0f, i37, f6, 16.0f, i21, 0.0f));
        } else {
            if (i != 1 && i != 5) {
                z2 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(ylbVar, context, z2);
            this.n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.F = (byte) 18;
            if (i == 5) {
                boolean z8 = jb6.a0;
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
                addView(checkBoxSquare, qoe.d(18, 18.0f, i38, f7, 0.0f, i19, 0.0f));
            } else if (i == 3) {
                addView(checkBoxSquare, qoe.d(18, 18.0f, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                boolean z9 = jb6.a0;
                if (i == 2) {
                    addView(checkBoxSquare, qoe.d(18, 18.0f, (z9 ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
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
                    addView(checkBoxSquare, qoe.d(18, 18.0f, i39, f8, 16.0f, i17, 0.0f));
                }
            }
        }
        if (i == 6) {
            nh2 nh2Var = new nh2(this, context, 2131232166);
            this.w = nh2Var;
            addView(nh2Var, qoe.i(-2.0f, -2.0f, 8388629, f5, 0.0f, i2 - 11, 0.0f));
        } else if (i == 8) {
            nh2 nh2Var2 = new nh2(this, context, 0);
            this.w = nh2Var2;
            addView(nh2Var2, qoe.i(-2.0f, -2.0f, 8388629, f5, 0.0f, i2 - 11, 0.0f));
        } else if (i == 7) {
            this.y = new pc0((ylb) null);
            bf0 bf0Var = new bf0(context);
            this.x = bf0Var;
            bf0Var.setRoundRadius(gm.L(17.0f));
            addView(bf0Var, qoe.i(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
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
        jh2 jh2Var = this.r;
        if (jh2Var != null) {
            return jh2Var.a.q;
        }
        return this.n.h;
    }

    public final void c(boolean z, boolean z2) {
        jh2 jh2Var = this.r;
        if (jh2Var != null) {
            jh2Var.a(z, z2);
        } else {
            this.n.a(z, z2);
        }
    }

    public final void d(j1 j1Var, t tVar) {
        int i;
        View view = this.J;
        if (j1Var == null) {
            if (view != null) {
                removeView(view);
                this.J = null;
            }
        } else {
            if (view == null) {
                View view2 = new View(getContext());
                this.J = view2;
                int i2 = cmb.h6;
                ylb ylbVar = this.b;
                fg0 f0 = cmb.f0(cmb.v0(i2, ylbVar), 2, -1);
                wmb M = anb.M(i2);
                view2.setBackground(f0);
                anb.j(view2, f0, null, M, ylbVar);
                addView(this.J, qoe.e(-1, -1, 119));
            }
            this.J.setOnClickListener(j1Var);
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
            if (jb6.a0) {
                i = 5;
            } else {
                i = 3;
            }
            addView(view4, qoe.e(56, -1, i));
        }
        this.K.setOnClickListener(tVar);
    }

    public final void e(CharSequence charSequence, String str, boolean z, boolean z2, boolean z3) {
        if (this.I) {
            mh2 mh2Var = this.d;
            mh2Var.c(gw3.m(charSequence, mh2Var.getPaint().getFontMetricsInt(), false, null, 0), z3, true);
        } else {
            this.c.setText(charSequence);
        }
        jh2 jh2Var = this.r;
        if (jh2Var != null) {
            jh2Var.a(z, z3);
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
        if (jb6.a0) {
            left = (view.getRight() - f) - gm.L(20.0f);
        } else {
            left = view.getLeft() + f + gm.L(4.0f);
        }
        this.s.setTranslationX(left);
    }

    public final void g() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = this.I;
        ylb ylbVar = this.b;
        byte b = this.E;
        if (z) {
            if (b != 1 && b != 5) {
                i4 = cmb.F6;
            } else {
                i4 = cmb.i5;
            }
            anb.U(this.d, i4, ylbVar);
        } else {
            if (b != 1 && b != 5) {
                i = cmb.F6;
            } else {
                i = cmb.i5;
            }
            sf1 sf1Var = this.c;
            anb.X(sf1Var, i, ylbVar);
            if (b != 1 && b != 5) {
                i2 = cmb.I6;
            } else {
                i2 = cmb.j5;
            }
            anb.G(sf1Var, i2, ylbVar);
        }
        if (b != 1 && b != 5) {
            i3 = cmb.H6;
        } else {
            i3 = cmb.l5;
        }
        anb.X(this.f, i3, ylbVar);
    }

    public io getAnimatedTextView() {
        return this.d;
    }

    public jh2 getCheckBoxRound() {
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
            int L = gm.L(f) + ((int) Math.abs(this.e.getTranslationX()));
            if (this.E == 7) {
                L += gm.L(39.0f);
            }
            ylb ylbVar = this.b;
            if (ylbVar != null) {
                paint = ylbVar.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = cmb.j0;
            }
            Paint paint2 = paint;
            if (jb6.a0) {
                f2 = 0.0f;
            } else {
                f2 = L;
            }
            float f3 = f2;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!jb6.a0) {
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
        mh2 mh2Var = this.d;
        if (mh2Var != null) {
            accessibilityNodeInfo.setText(mh2Var.getText());
        } else {
            sf1 sf1Var = this.c;
            if (sf1Var != null) {
                accessibilityNodeInfo.setText(sf1Var.getText());
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
            textView.measure(View.MeasureSpec.makeMeasureSpec(gm.L(10.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), 1073741824));
            view2.measure(View.MeasureSpec.makeMeasureSpec(size - gm.L(34.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), Integer.MIN_VALUE));
            float f2 = b;
            view.measure(View.MeasureSpec.makeMeasureSpec(gm.L(f2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(f2), 1073741824));
            setMeasuredDimension(gm.L(29.0f) + view2.getMeasuredWidth(), gm.L(50.0f));
        } else if (this.H) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), 0);
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(50.0f) + (this.G ? 1 : 0));
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            if (a()) {
                f = 60.0f;
            } else {
                f = 34.0f;
            }
            int L = measuredWidth - gm.L(f);
            if (this.I) {
                L += (int) this.d.getRightPadding();
            }
            if (b2 == 7) {
                L -= gm.L(34.0f);
            }
            if (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                L -= ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin;
            }
            int i3 = L / 2;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            int measuredWidth2 = textView.getMeasuredWidth();
            nh2 nh2Var = this.w;
            if (nh2Var != null) {
                nh2Var.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                measuredWidth2 = b10.z(11.0f, nh2Var.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(wi8.f(8.0f, (L - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            } else {
                view2.measure(wi8.f(8.0f, (L - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            }
            bf0 bf0Var = this.x;
            if (bf0Var != null) {
                bf0Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(34.0f), 1073741824));
            }
            float f3 = b;
            view.measure(View.MeasureSpec.makeMeasureSpec(gm.L(f3), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(f3), 1073741824));
        }
        View view3 = this.J;
        if (view3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            this.J.measure(View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), 1073741824));
        }
        View view4 = this.K;
        if (view4 != null) {
            view4.measure(View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), 1073741824));
        }
        View view5 = this.s;
        if (view5 != null) {
            view5.measure(View.MeasureSpec.makeMeasureSpec(gm.L(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(16.0f), 1073741824));
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
            Drawable mutate = getContext().getResources().getDrawable(2131230872).mutate();
            anb.x(this, mutate, cmb.F6, this.b, PorterDuff.Mode.MULTIPLY);
            this.s.setBackground(mutate);
            addView(this.s, qoe.e(16, 16, 16));
        }
        f();
        this.s.animate().cancel();
        ViewPropertyAnimator animate = this.s.animate();
        if (bool.booleanValue()) {
            f = 0.0f;
        } else {
            f = 180.0f;
        }
        animate.rotation(f).setDuration(340L).setInterpolator(d53.h).start();
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
        sf1 sf1Var = this.c;
        if (z2) {
            sf1Var.setLines(0);
            sf1Var.setMaxLines(0);
            sf1Var.setSingleLine(false);
            sf1Var.setEllipsize(null);
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 16;
            layoutParams2.topMargin = 0;
        } else {
            sf1Var.setLines(1);
            sf1Var.setMaxLines(1);
            sf1Var.setSingleLine(true);
            sf1Var.setEllipsize(TextUtils.TruncateAt.END);
            view.setPadding(0, 0, 0, 0);
            layoutParams.height = -1;
            layoutParams.topMargin = 0;
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 48;
            layoutParams2.topMargin = gm.L(15.0f);
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
        if (jb6.a0) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        int L = gm.L(i3 * i2);
        View view = this.h;
        if (view != null) {
            view.setTranslationX(L);
        }
        float f = L;
        this.e.setTranslationX(f);
        bf0 bf0Var = this.x;
        if (bf0Var != null) {
            bf0Var.setTranslationX(f);
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
            mh2 mh2Var = this.d;
            anb.q(mh2Var);
            mh2Var.setTextColor(i);
            return;
        }
        sf1 sf1Var = this.c;
        anb.q(sf1Var);
        sf1Var.setTextColor(i);
        byte b = this.E;
        if (b != 1 && b != 5) {
            i2 = cmb.I6;
        } else {
            i2 = cmb.j5;
        }
        if (sf1Var.getLinkTextColors() != null) {
            int defaultColor = sf1Var.getLinkTextColors().getDefaultColor();
            ylb ylbVar = this.b;
            if (defaultColor == cmb.v0(i2, ylbVar)) {
                anb.G(sf1Var, i2, ylbVar);
            }
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        String o;
        pc0 pc0Var = this.y;
        pc0Var.k(tLObject);
        this.x.f(tLObject, pc0Var);
        boolean z = tLObject instanceof TLRPC.User;
        if (z) {
            o = m9c.r((TLRPC.User) tLObject);
        } else {
            o = bw2.o(tLObject);
        }
        if (z && ((TLRPC.User) tLObject).id == oc7.r1(z8c.t0).L3) {
            o = jb6.M0(2131752407, null);
        }
        if (this.I) {
            mh2 mh2Var = this.d;
            mh2Var.setText(gw3.m(o, mh2Var.getPaint().getFontMetricsInt(), false, null, 0));
            return;
        }
        this.c.setText(o);
    }

    public oh2(Context context, int i) {
        this(context, i, 17, false, null);
    }

    public oh2(int i, ylb ylbVar, Context context) {
        this(context, i, 17, false, ylbVar);
    }
}
