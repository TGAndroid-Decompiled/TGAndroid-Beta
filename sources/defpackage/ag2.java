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
public final class ag2 extends FrameLayout {
    public final byte E;
    public final byte F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public View J;
    public View K;
    public int a;
    public final wjb b;
    public final ke1 c;
    public final yf2 d;
    public final View e;
    public final TextView f;
    public final View h;
    public final CheckBoxSquare n;
    public final wf2 r;
    public View s;
    public final zf2 w;
    public final be0 x;
    public final pb0 y;

    public ag2(Context context, int i, int i2, boolean z, wjb wjbVar) {
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
        this.b = wjbVar;
        this.E = i;
        this.I = z;
        boolean z2 = true;
        if (z) {
            yf2 yf2Var = new yf2(this, context, (byte) 0);
            this.d = yf2Var;
            kk7.i(yf2Var);
            yf2Var.setEllipsizeByGradient(true);
            yf2Var.setRightPadding(gl.L(8.0f));
            yf2Var.getDrawable().r(true, false);
            if (i != 1 && i != 5) {
                i22 = bkb.F6;
            } else {
                i22 = bkb.i5;
            }
            yf2Var.setTag(Integer.valueOf(bkb.v0(i22, wjbVar)));
            yf2Var.setTextSize(gl.L(16.0f));
            if (i == 7) {
                yf2Var.setTypeface(gl.o());
            }
            if (i == 3) {
                yf2Var.setGravity(19);
                addView(yf2Var, nme.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                yf2Var.setPadding(0, 0, 0, gl.L(3.0f));
            } else {
                yf2Var.setRightPadding(gl.L(i2));
                if (k96.a0) {
                    i23 = 5;
                } else {
                    i23 = 3;
                }
                yf2Var.setGravity(i23 | 16);
                if (i == 2) {
                    boolean z3 = k96.a0;
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
                    addView(yf2Var, nme.d(-1, -2.0f, i31, f, 0.0f, i30, 0.0f));
                } else {
                    if (a()) {
                        i24 = 56;
                    } else {
                        i24 = 46;
                    }
                    i24 = i == 7 ? i24 + 39 : i24;
                    boolean z4 = k96.a0;
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
                    addView(yf2Var, nme.d(-1, -2.0f, i32, f2, 0.0f, i27, 0.0f));
                }
            }
            this.e = yf2Var;
        } else {
            ke1 ke1Var = new ke1((byte) 2, context, this);
            this.c = ke1Var;
            kk7.i(ke1Var);
            if (i != 1 && i != 5) {
                i3 = bkb.F6;
            } else {
                i3 = bkb.i5;
            }
            ke1Var.setTag(Integer.valueOf(bkb.v0(i3, wjbVar)));
            ke1Var.setTextSize(1, 16.0f);
            ke1Var.setLines(1);
            ke1Var.setMaxLines(1);
            ke1Var.setSingleLine(true);
            ke1Var.setEllipsize(TextUtils.TruncateAt.END);
            if (i == 7) {
                ke1Var.setTypeface(gl.o());
            }
            if (i == 3) {
                ke1Var.setGravity(19);
                addView(ke1Var, nme.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                ke1Var.setPadding(0, 0, 0, gl.L(3.0f));
            } else {
                if (k96.a0) {
                    i4 = 5;
                } else {
                    i4 = 3;
                }
                ke1Var.setGravity(i4 | 16);
                if (i == 2) {
                    boolean z5 = k96.a0;
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
                    addView(ke1Var, nme.d(-1, -2.0f, i33, f3, 0.0f, i12, 0.0f));
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
                    boolean z6 = k96.a0;
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
                    addView(ke1Var, nme.d(i34, -2.0f, i35, f4, 0.0f, i9, 0.0f));
                }
            }
            this.e = ke1Var;
        }
        TextView textView = new TextView(context);
        this.f = textView;
        if (i != 1 && i != 5) {
            i13 = bkb.H6;
        } else {
            i13 = bkb.l5;
        }
        textView.setTag(Integer.valueOf(i13));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (k96.a0) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        textView.setGravity(i14 | 16);
        if (k96.a0) {
            i15 = 3;
        } else {
            i15 = 5;
        }
        int i36 = i15 | 48;
        float f5 = i2;
        addView(textView, nme.d(-2, -1.0f, i36, f5, 0.0f, f5, 0.0f));
        if (a()) {
            wf2 wf2Var = new wf2(21, wjbVar, context);
            this.r = wf2Var;
            this.h = wf2Var;
            wf2Var.setDrawUnchecked(true);
            wf2Var.a(true, false);
            wf2Var.setDrawBackgroundAsArc(10);
            this.F = (byte) 21;
            boolean z7 = k96.a0;
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
            addView(wf2Var, nme.d(21, 21.0f, i37, f6, 16.0f, i21, 0.0f));
        } else {
            if (i != 1 && i != 5) {
                z2 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(wjbVar, context, z2);
            this.n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.F = (byte) 18;
            if (i == 5) {
                boolean z8 = k96.a0;
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
                addView(checkBoxSquare, nme.d(18, 18.0f, i38, f7, 0.0f, i19, 0.0f));
            } else if (i == 3) {
                addView(checkBoxSquare, nme.d(18, 18.0f, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                boolean z9 = k96.a0;
                if (i == 2) {
                    addView(checkBoxSquare, nme.d(18, 18.0f, (z9 ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
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
                    addView(checkBoxSquare, nme.d(18, 18.0f, i39, f8, 16.0f, i17, 0.0f));
                }
            }
        }
        if (i == 6) {
            zf2 zf2Var = new zf2(this, context, 2131232165);
            this.w = zf2Var;
            addView(zf2Var, nme.i(-2.0f, -2.0f, 8388629, f5, 0.0f, i2 - 11, 0.0f));
        } else if (i == 8) {
            zf2 zf2Var2 = new zf2(this, context, 0);
            this.w = zf2Var2;
            addView(zf2Var2, nme.i(-2.0f, -2.0f, 8388629, f5, 0.0f, i2 - 11, 0.0f));
        } else if (i == 7) {
            this.y = new pb0((wjb) null);
            be0 be0Var = new be0(context);
            this.x = be0Var;
            be0Var.setRoundRadius(gl.L(17.0f));
            addView(be0Var, nme.i(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
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
        wf2 wf2Var = this.r;
        if (wf2Var != null) {
            return wf2Var.a.q;
        }
        return this.n.h;
    }

    public final void c(boolean z, boolean z2) {
        wf2 wf2Var = this.r;
        if (wf2Var != null) {
            wf2Var.a(z, z2);
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
                int i2 = bkb.h6;
                wjb wjbVar = this.b;
                ff0 f0 = bkb.f0(bkb.v0(i2, wjbVar), 2, -1);
                vkb M = zkb.M(i2);
                view2.setBackground(f0);
                zkb.j(view2, f0, null, M, wjbVar);
                addView(this.J, nme.e(-1, -1, 119));
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
            if (k96.a0) {
                i = 5;
            } else {
                i = 3;
            }
            addView(view4, nme.e(56, -1, i));
        }
        this.K.setOnClickListener(tVar);
    }

    public final void e(CharSequence charSequence, String str, boolean z, boolean z2, boolean z3) {
        if (this.I) {
            yf2 yf2Var = this.d;
            yf2Var.c(vu3.m(charSequence, yf2Var.getPaint().getFontMetricsInt(), false, null, 0), z3, true);
        } else {
            this.c.setText(charSequence);
        }
        wf2 wf2Var = this.r;
        if (wf2Var != null) {
            wf2Var.a(z, z3);
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
        if (k96.a0) {
            left = (view.getRight() - f) - gl.L(20.0f);
        } else {
            left = view.getLeft() + f + gl.L(4.0f);
        }
        this.s.setTranslationX(left);
    }

    public final void g() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = this.I;
        wjb wjbVar = this.b;
        byte b = this.E;
        if (z) {
            if (b != 1 && b != 5) {
                i4 = bkb.F6;
            } else {
                i4 = bkb.i5;
            }
            zkb.U(this.d, i4, wjbVar);
        } else {
            if (b != 1 && b != 5) {
                i = bkb.F6;
            } else {
                i = bkb.i5;
            }
            ke1 ke1Var = this.c;
            zkb.X(ke1Var, i, wjbVar);
            if (b != 1 && b != 5) {
                i2 = bkb.I6;
            } else {
                i2 = bkb.j5;
            }
            zkb.G(ke1Var, i2, wjbVar);
        }
        if (b != 1 && b != 5) {
            i3 = bkb.H6;
        } else {
            i3 = bkb.l5;
        }
        zkb.X(this.f, i3, wjbVar);
    }

    public hn getAnimatedTextView() {
        return this.d;
    }

    public wf2 getCheckBoxRound() {
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
            int L = gl.L(f) + ((int) Math.abs(this.e.getTranslationX()));
            if (this.E == 7) {
                L += gl.L(39.0f);
            }
            wjb wjbVar = this.b;
            if (wjbVar != null) {
                paint = wjbVar.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = bkb.j0;
            }
            Paint paint2 = paint;
            if (k96.a0) {
                f2 = 0.0f;
            } else {
                f2 = L;
            }
            float f3 = f2;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!k96.a0) {
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
        yf2 yf2Var = this.d;
        if (yf2Var != null) {
            accessibilityNodeInfo.setText(yf2Var.getText());
        } else {
            ke1 ke1Var = this.c;
            if (ke1Var != null) {
                accessibilityNodeInfo.setText(ke1Var.getText());
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
            textView.measure(View.MeasureSpec.makeMeasureSpec(gl.L(10.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), 1073741824));
            view2.measure(View.MeasureSpec.makeMeasureSpec(size - gl.L(34.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), Integer.MIN_VALUE));
            float f2 = b;
            view.measure(View.MeasureSpec.makeMeasureSpec(gl.L(f2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(f2), 1073741824));
            setMeasuredDimension(gl.L(29.0f) + view2.getMeasuredWidth(), gl.L(50.0f));
        } else if (this.H) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), 0);
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(50.0f) + (this.G ? 1 : 0));
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            if (a()) {
                f = 60.0f;
            } else {
                f = 34.0f;
            }
            int L = measuredWidth - gl.L(f);
            if (this.I) {
                L += (int) this.d.getRightPadding();
            }
            if (b2 == 7) {
                L -= gl.L(34.0f);
            }
            if (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                L -= ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin;
            }
            int i3 = L / 2;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            int measuredWidth2 = textView.getMeasuredWidth();
            zf2 zf2Var = this.w;
            if (zf2Var != null) {
                zf2Var.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                measuredWidth2 = b00.z(11.0f, zf2Var.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(ug8.f(8.0f, (L - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            } else {
                view2.measure(ug8.f(8.0f, (L - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            }
            be0 be0Var = this.x;
            if (be0Var != null) {
                be0Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(34.0f), 1073741824));
            }
            float f3 = b;
            view.measure(View.MeasureSpec.makeMeasureSpec(gl.L(f3), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(f3), 1073741824));
        }
        View view3 = this.J;
        if (view3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            this.J.measure(View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), 1073741824));
        }
        View view4 = this.K;
        if (view4 != null) {
            view4.measure(View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), 1073741824));
        }
        View view5 = this.s;
        if (view5 != null) {
            view5.measure(View.MeasureSpec.makeMeasureSpec(gl.L(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(16.0f), 1073741824));
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
            zkb.x(this, mutate, bkb.F6, this.b, PorterDuff.Mode.MULTIPLY);
            this.s.setBackground(mutate);
            addView(this.s, nme.e(16, 16, 16));
        }
        f();
        this.s.animate().cancel();
        ViewPropertyAnimator animate = this.s.animate();
        if (bool.booleanValue()) {
            f = 0.0f;
        } else {
            f = 180.0f;
        }
        animate.rotation(f).setDuration(340L).setInterpolator(s33.h).start();
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
        ke1 ke1Var = this.c;
        if (z2) {
            ke1Var.setLines(0);
            ke1Var.setMaxLines(0);
            ke1Var.setSingleLine(false);
            ke1Var.setEllipsize(null);
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 16;
            layoutParams2.topMargin = 0;
        } else {
            ke1Var.setLines(1);
            ke1Var.setMaxLines(1);
            ke1Var.setSingleLine(true);
            ke1Var.setEllipsize(TextUtils.TruncateAt.END);
            view.setPadding(0, 0, 0, 0);
            layoutParams.height = -1;
            layoutParams.topMargin = 0;
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 48;
            layoutParams2.topMargin = gl.L(15.0f);
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
        if (k96.a0) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        int L = gl.L(i3 * i2);
        View view = this.h;
        if (view != null) {
            view.setTranslationX(L);
        }
        float f = L;
        this.e.setTranslationX(f);
        be0 be0Var = this.x;
        if (be0Var != null) {
            be0Var.setTranslationX(f);
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
            yf2 yf2Var = this.d;
            zkb.q(yf2Var);
            yf2Var.setTextColor(i);
            return;
        }
        ke1 ke1Var = this.c;
        zkb.q(ke1Var);
        ke1Var.setTextColor(i);
        byte b = this.E;
        if (b != 1 && b != 5) {
            i2 = bkb.I6;
        } else {
            i2 = bkb.j5;
        }
        if (ke1Var.getLinkTextColors() != null) {
            int defaultColor = ke1Var.getLinkTextColors().getDefaultColor();
            wjb wjbVar = this.b;
            if (defaultColor == bkb.v0(i2, wjbVar)) {
                zkb.G(ke1Var, i2, wjbVar);
            }
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        String o;
        pb0 pb0Var = this.y;
        pb0Var.k(tLObject);
        this.x.f(tLObject, pb0Var);
        boolean z = tLObject instanceof TLRPC.User;
        if (z) {
            o = l7c.q((TLRPC.User) tLObject);
        } else {
            o = qu2.o(tLObject);
        }
        if (z && ((TLRPC.User) tLObject).id == na7.q1(y6c.t0).L3) {
            o = k96.M0(2131752448, null);
        }
        if (this.I) {
            yf2 yf2Var = this.d;
            yf2Var.setText(vu3.m(o, yf2Var.getPaint().getFontMetricsInt(), false, null, 0));
            return;
        }
        this.c.setText(o);
    }

    public ag2(Context context, int i) {
        this(context, i, 17, false, null);
    }

    public ag2(int i, wjb wjbVar, Context context) {
        this(context, i, 17, false, wjbVar);
    }
}
