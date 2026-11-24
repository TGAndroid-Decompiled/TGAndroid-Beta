package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.RadioButton;
public final class z92 extends FrameLayout {
    public final byte a;
    public Object b;
    public boolean c;
    public Object d;
    public Object e;

    public z92(xt5 xt5Var, Context context, boolean z) {
        super(context);
        float f;
        int L;
        this.a = (byte) 2;
        this.e = xt5Var;
        this.b = new TextView[2];
        this.c = !z;
        setBackground(null);
        View view = new View(context);
        this.d = view;
        if (!z) {
            view.setBackground(sjb.f(bkb.Ei, 4.0f));
        }
        if (z) {
            f = 0.0f;
        } else {
            f = 16.0f;
        }
        addView(view, nme.d(-1, -1.0f, 0, 16.0f, f, 16.0f, 16.0f));
        for (int i = 0; i < 2; i++) {
            ((TextView[]) this.b)[i] = new TextView(context);
            ((TextView[]) this.b)[i].setFocusable(false);
            ((TextView[]) this.b)[i].setLines(1);
            ((TextView[]) this.b)[i].setSingleLine(true);
            ((TextView[]) this.b)[i].setGravity(1);
            ((TextView[]) this.b)[i].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.b)[i].setGravity(17);
            boolean z2 = this.c;
            TextView[] textViewArr = (TextView[]) this.b;
            if (z2) {
                zkb.X(textViewArr[i], bkb.Ii, null);
                ((TextView[]) this.b)[i].setTypeface(gl.o());
            } else {
                zkb.X(textViewArr[i], bkb.Ei, null);
            }
            ((TextView[]) this.b)[i].setImportantForAccessibility(2);
            ((TextView[]) this.b)[i].setTextSize(1, 14.0f);
            TextView textView = ((TextView[]) this.b)[i];
            if (this.c) {
                L = 0;
            } else {
                L = gl.L(13.0f);
            }
            textView.setPadding(0, 0, 0, L);
            addView(((TextView[]) this.b)[i], nme.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i == 1) {
                ((TextView[]) this.b)[i].setAlpha(0.0f);
            }
        }
    }

    public final void a(String str, boolean z) {
        TextView[] textViewArr = (TextView[]) this.b;
        if (!z) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((xt5) this.e).A1 = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(s33.g);
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textViewArr[0], property, 1.0f, 0.0f);
        TextView textView = textViewArr[0];
        float[] fArr = {0.0f, -gl.L(10.0f)};
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(textView, property2, fArr), ObjectAnimator.ofFloat(textViewArr[1], property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, gl.L(10.0f), 0.0f));
        animatorSet.addListener(new v85(this, (byte) 7));
        animatorSet.start();
    }

    public final void b() {
        int i;
        boolean z = this.c;
        TextView textView = (TextView) this.b;
        ((TextView) this.e).setVisibility(8);
        if (z) {
            i = -1;
        } else {
            i = -15095832;
        }
        textView.setTextColor(i);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        switch (this.a) {
            case 4:
                mmc mmcVar = (mmc) this.e;
                jmc jmcVar = mmcVar.b;
                if (jmcVar != null) {
                    float[] fArr = (float[]) mmcVar.h.b;
                    float[] fArr2 = jmcVar.k;
                    float[] fArr3 = jmcVar.l;
                    Paint paint = jmcVar.b;
                    Paint paint2 = jmcVar.d;
                    Path path = jmcVar.p;
                    if (jmcVar.q != 0.0f && (Math.abs(Math.sin(Math.toRadians(jmcVar.S))) >= 0.009999999776482582d || Math.abs(Math.sin(Math.toRadians(jmcVar.T))) >= 0.009999999776482582d)) {
                        int a = znc.a(-16216082, fArr);
                        int a2 = znc.a(-15291399, fArr);
                        paint.setShader(null);
                        paint.setAlpha(255);
                        paint.setColor(jmc.d(0.82500005f, 0.0f, 0.0f, a, a2));
                        path.rewind();
                        int i = 1;
                        path.moveTo(fArr3[0], fArr3[1]);
                        for (int i2 = 1; i2 < 76; i2++) {
                            int i3 = i2 << 1;
                            path.lineTo(fArr3[i3], fArr3[i3 + 1]);
                        }
                        path.close();
                        canvas.drawPath(path, paint);
                        paint2.setShader(null);
                        paint2.setAlpha(255);
                        paint2.setStrokeWidth(jmcVar.q * 0.6f);
                        int[] iArr = jmcVar.o;
                        int length = iArr.length;
                        int i4 = 0;
                        while (i4 < length) {
                            int i5 = iArr[i4];
                            int i6 = i5 << i;
                            int i7 = ((i5 + 1) % 76) << 1;
                            float[] fArr4 = jmcVar.j;
                            float f2 = (fArr4[i6] + fArr4[i7]) * 0.5f;
                            int i8 = i6 + 1;
                            int i9 = i7 + 1;
                            float f3 = (fArr4[i8] + fArr4[i9]) * 0.5f;
                            int[] iArr2 = iArr;
                            int i10 = length;
                            float sqrt = 1.0f / ((float) Math.sqrt(ir2.i(f3, f3, f2 * f2, 0.0144f)));
                            float f4 = f2 * sqrt;
                            float f5 = f3 * sqrt;
                            if (jmcVar.r) {
                                f = -0.12f;
                            } else {
                                f = 0.12f;
                            }
                            float f6 = f * sqrt;
                            float c = jmc.c((jmcVar.Y * f6) + (jmcVar.X * f5) + (jmcVar.W * f4));
                            float f7 = f4 * jmcVar.Z;
                            float f8 = jmcVar.b0 * f6;
                            int i11 = i4;
                            float[] fArr5 = fArr2;
                            float[] fArr6 = fArr3;
                            float z = yjb.z(c, 0.38f, 0.36f, 1.5f);
                            float pow = ((float) Math.pow(jmc.c(f8 + (f5 * jmcVar.a0) + f7), 24.0d)) * 0.1f * 1.5f;
                            int d = jmc.d(z, 0.089999996f, pow, a, a2);
                            paint.setColor(d);
                            paint2.setColor(d);
                            path.rewind();
                            path.moveTo(fArr5[i6], fArr5[i8]);
                            path.lineTo(fArr5[i7], fArr5[i9]);
                            path.lineTo(fArr6[i7], fArr6[i9]);
                            path.lineTo(fArr6[i6], fArr6[i8]);
                            path.close();
                            paint2.setStrokeWidth(jmcVar.q * 0.6f);
                            canvas.drawPath(path, paint);
                            canvas.drawPath(path, paint2);
                            paint2.setColor(jmc.d(z * 0.75f, 0.067499995f, pow * 0.75f, a, a2));
                            paint2.setStrokeWidth(jmcVar.q * 0.7f);
                            canvas.drawLine(fArr6[i6], fArr6[i8], fArr6[i7], fArr6[i9], paint2);
                            i4 = i11 + 1;
                            length = i10;
                            fArr2 = fArr5;
                            iArr = iArr2;
                            fArr3 = fArr6;
                            i = 1;
                        }
                    }
                }
                if (this.c) {
                    int save = canvas.save();
                    canvas.concat((Matrix) this.d);
                    super.dispatchDraw(canvas);
                    canvas.restoreToCount(save);
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z92.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((y92) this.d).f);
                accessibilityNodeInfo.setCheckable(true);
                if (this.c) {
                    i = 2131752211;
                } else {
                    i = 2131752212;
                }
                accessibilityNodeInfo.setContentDescription(k96.M0(i, null));
                return;
            case 1:
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                accessibilityNodeInfo.setClickable(true);
                return;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                cf4 cf4Var = (cf4) this.e;
                if (motionEvent.getAction() == 0 && cf4Var.r1 != 0 && motionEvent.getY() < cf4Var.r1) {
                    cf4Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                ((cf4) this.e).F0();
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        float f;
        switch (this.a) {
            case 1:
                int size = View.MeasureSpec.getSize(i2);
                cf4 cf4Var = (cf4) this.e;
                fu fuVar = cf4Var.m1;
                boolean z = true;
                cf4Var.s1 = true;
                int i4 = cf4Var.u0;
                setPadding(i4, gl.m, i4, 0);
                cf4Var.s1 = false;
                int L = gl.L(48.0f);
                int L2 = gl.L(48.0f);
                int i5 = cf4Var.t0;
                int b = (cf4Var.n1.b() * L2) + L + i5 + gl.m;
                int i6 = size / 5;
                if (b < i6 * 3.2d) {
                    i3 = 0;
                } else {
                    i3 = i6 << 1;
                }
                if (i3 != 0 && b < size) {
                    i3 -= size - b;
                }
                if (i3 != 0) {
                    i5 = i3;
                }
                if (fuVar.getPaddingTop() != i5) {
                    cf4Var.s1 = true;
                    fuVar.setPadding(gl.L(10.0f), i5, gl.L(10.0f), 0);
                    cf4Var.s1 = false;
                }
                if (b < size) {
                    z = false;
                }
                this.c = z;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(b, size), 1073741824));
                return;
            case 2:
                if (this.c) {
                    f = 80.0f;
                } else {
                    f = 50.0f;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(f), 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 4:
                super.onSizeChanged(i, i2, i3, i4);
                mmc mmcVar = (mmc) this.e;
                mmcVar.j0 = -1;
                mmcVar.b(mmcVar.d0, mmcVar.g0);
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                if (!((cf4) this.e).J && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.a) {
            case 1:
                if (!((cf4) this.e).s1) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public z92(cf4 cf4Var, Activity activity) {
        super(activity);
        this.a = (byte) 1;
        this.e = cf4Var;
        this.b = new RectF();
    }

    public z92(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 3:
                super(context);
                this.c = true;
                setBackgroundColor(-15066598);
                TextView textView = new TextView(context);
                this.d = textView;
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                textView.setBackground(bkb.f0(-12763843, 0, -1));
                textView.setPadding(gl.L(20.0f), 0, gl.L(20.0f), 0);
                textView.setText(k96.M0(2131752577, null).toUpperCase());
                textView.setTypeface(gl.o());
                addView(textView, nme.e(-2, -1, 51));
                TextView textView2 = new TextView(context);
                this.b = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(-1);
                textView2.setGravity(17);
                textView2.setBackgroundDrawable(bkb.f0(-12763843, 0, -1));
                textView2.setPadding(gl.L(20.0f), 0, gl.L(20.0f), 0);
                textView2.setText(k96.M0(2131745448, null).toUpperCase());
                textView2.setTypeface(gl.o());
                addView(textView2, nme.e(-2, -1, 53));
                TextView textView3 = new TextView(context);
                this.e = textView3;
                textView3.setTypeface(gl.o());
                textView3.setTextSize(1, 13.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(17);
                textView3.setBackgroundResource(2131232538);
                textView3.setMinWidth(gl.L(23.0f));
                textView3.setPadding(gl.L(8.0f), 0, gl.L(8.0f), gl.L(1.0f));
                addView(textView3, nme.d(-2, 23.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
                return;
            default:
                return;
        }
    }

    public z92(mmc mmcVar, Context context) {
        super(context);
        this.a = (byte) 4;
        this.e = mmcVar;
        this.d = new Matrix();
        this.b = new float[8];
        setClipChildren(false);
        setClipToPadding(false);
    }
}
