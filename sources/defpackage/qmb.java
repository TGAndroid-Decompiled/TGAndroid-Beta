package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public final class qmb extends FrameLayout {
    public byte E;
    public boolean F;
    public int G;
    public Paint H;
    public boolean I;
    public final vnb a;
    public final TextView b;
    public final in c;
    public final e29 d;
    public de0 e;
    public final ImageView f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final byte s;
    public boolean w;
    public float x;
    public float y;

    public qmb(int i, vnb vnbVar, Context context) {
        super(context);
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z = f11.a;
        this.I = false;
        this.a = vnbVar;
        this.s = (byte) 21;
        TextView textView = new TextView(context);
        this.b = textView;
        ik8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        textView.setGravity(i2 | 16);
        yob.X(textView, aob.G6, vnbVar);
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        addView(textView, tre.d(-1, -1.0f, i3 | 48, 21.0f, 0.0f, 21.0f, 0.0f));
        in inVar = new in(context, true, true, !ob6.a0);
        this.c = inVar;
        inVar.b(0.55f, 320L, k43.h);
        inVar.setTextSize(hl.L(16.0f));
        if (ob6.a0) {
            i4 = 3;
        } else {
            i4 = 5;
        }
        inVar.setGravity(i4 | 16);
        yob.U(inVar, aob.I6, vnbVar);
        if (ob6.a0) {
            i5 = 3;
        } else {
            i5 = 5;
        }
        addView(inVar, tre.d(-2, -1.0f, i5 | 48, 17.0f, 0.0f, 17.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i7 = aob.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.s(imageView, i7, vnbVar, mode);
        imageView.setVisibility(8);
        if (ob6.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        addView((View) imageView, tre.d(-2, -2.0f, i6 | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setVisibility(4);
        yob.s(imageView2, i7, vnbVar, mode);
        addView(imageView2, tre.d(-2, -2.0f, (ob6.a0 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(ArrayList arrayList, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        setEnabled(z);
        ImageView imageView = this.f;
        in inVar = this.c;
        float f5 = 0.5f;
        TextView textView = this.b;
        if (arrayList != null) {
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", f3));
            if (inVar.getVisibility() == 0) {
                if (z) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.5f;
                }
                arrayList.add(ObjectAnimator.ofFloat(inVar, "alpha", f4));
            }
            if (imageView.getVisibility() == 0) {
                if (z) {
                    f5 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView, "alpha", f5));
                return;
            }
            return;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        textView.setAlpha(f);
        if (inVar.getVisibility() == 0) {
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            inVar.setAlpha(f2);
        }
        if (imageView.getVisibility() == 0) {
            if (z) {
                f5 = 1.0f;
            }
            imageView.setAlpha(f5);
        }
    }

    public final void b(CharSequence charSequence, boolean z) {
        this.b.setText(charSequence);
        this.c.setVisibility(4);
        this.f.setVisibility(4);
        this.h = z;
        setWillNotDraw(!z);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        this.b.setText(charSequence);
        this.f.setVisibility(4);
        in inVar = this.c;
        if (charSequence2 != null) {
            inVar.c(charSequence2, z, true);
            inVar.setVisibility(0);
        } else {
            inVar.setVisibility(4);
        }
        this.h = z2;
        setWillNotDraw(!z2);
        requestLayout();
    }

    public final void d() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 3;
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        TextView textView = this.b;
        textView.setGravity(i | 16);
        removeView(textView);
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        float f = this.s;
        addView(textView, tre.d(-1, -1.0f, i2 | 48, f, 0.0f, f, 0.0f));
        if (ob6.a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        in inVar = this.c;
        inVar.setGravity(i3 | 16);
        removeView(inVar);
        if (ob6.a0) {
            i4 = 3;
        } else {
            i4 = 5;
        }
        addView(inVar, tre.d(-2, -1.0f, i4 | 48, f, 0.0f, f, 0.0f));
        View view = this.d;
        removeView(view);
        if (ob6.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        addView(view, tre.d(-2, -2.0f, i5 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f;
        removeView(view2);
        if (!ob6.a0) {
            i6 = 5;
        }
        addView(view2, tre.d(-2, -2.0f, i6 | 16, f, 0.0f, f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        int i = 0;
        float f3 = 0.0f;
        if (this.r || this.y != 0.0f) {
            if (this.H == null) {
                Paint paint = new Paint(1);
                this.H = paint;
                paint.setColor(aob.v0(aob.O5, this.a));
            }
            boolean z = this.w;
            float f4 = this.x;
            if (z) {
                f = f4 + 0.016f;
                this.x = f;
                if (f > 1.0f) {
                    this.x = 1.0f;
                    this.w = false;
                    f = 1.0f;
                }
            } else {
                f = f4 - 0.016f;
                this.x = f;
                if (f < 0.0f) {
                    this.x = 0.0f;
                    this.w = true;
                    f = 0.0f;
                }
            }
            int i2 = this.G;
            if (i2 > 0) {
                this.G = i2 - 15;
            } else {
                boolean z2 = this.r;
                float f5 = this.y;
                if (z2) {
                    if (f5 != 1.0f) {
                        float f6 = f5 + 0.10666667f;
                        this.y = f6;
                        if (f6 > 1.0f) {
                            this.y = 1.0f;
                        }
                    }
                } else if (f5 != 0.0f) {
                    float f7 = f5 - 0.10666667f;
                    this.y = f7;
                    if (f7 < 0.0f) {
                        this.y = 0.0f;
                    }
                }
            }
            this.H.setAlpha((int) (((f * 0.4f) + 0.6f) * this.y * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = hl.P;
            int measuredWidth = getMeasuredWidth();
            float f8 = this.s;
            rectF.set((measuredWidth - hl.L(f8)) - hl.L(this.E), measuredHeight - hl.L(3.0f), getMeasuredWidth() - hl.L(f8), hl.L(3.0f) + measuredHeight);
            if (ob6.a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, hl.L(3.0f), hl.L(3.0f), this.H);
            invalidate();
        }
        this.c.setAlpha(1.0f - this.y);
        super.dispatchDraw(canvas);
        if (this.h) {
            if (this.d.getVisibility() == 0) {
                f2 = 58.0f;
            } else {
                f2 = 20.0f;
            }
            int L = hl.L(f2);
            if (!ob6.a0) {
                f3 = L;
            }
            float f9 = f3;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (ob6.a0) {
                i = L;
            }
            canvas.drawLine(f9, measuredHeight2, measuredWidth2 - i, getMeasuredHeight() - 1, aob.j0);
        }
    }

    public TextView getTextView() {
        return this.b;
    }

    public de0 getValueBackupImageView() {
        int i;
        if (this.e == null) {
            de0 de0Var = new de0(getContext());
            this.e = de0Var;
            if (ob6.a0) {
                i = 3;
            } else {
                i = 5;
            }
            float f = this.s - 4;
            addView(de0Var, tre.d(24, 24.0f, i | 16, f, 0.0f, f, 0.0f));
        }
        return this.e;
    }

    public ImageView getValueImageView() {
        return this.f;
    }

    public in getValueTextView() {
        return this.c;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        de0 de0Var = this.e;
        if (de0Var != null && de0Var.getImageReceiver() != null && (this.e.getImageReceiver().t() instanceof wl)) {
            ((wl) this.e.getImageReceiver().t()).o(this);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.b.getText());
        in inVar = this.c;
        if (inVar != null && inVar.getVisibility() == 0) {
            str = "\n" + ((Object) inVar.getText());
        } else {
            str = "";
        }
        sb.append(str);
        accessibilityNodeInfo.setText(sb.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.F && getParent() != null) {
            this.G = (int) ((getTop() / ((View) getParent()).getMeasuredHeight()) * 150.0f);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - hl.L(34.0f);
        if (this.I) {
            i3 = measuredWidth;
        } else {
            i3 = measuredWidth / 2;
        }
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        e29 e29Var = this.d;
        if (e29Var.getVisibility() == 0) {
            e29Var.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            if (this.I) {
                i3 = ik8.B(8.0f, e29Var.getMeasuredWidth(), i3);
            }
        }
        de0 de0Var = this.e;
        if (de0Var != null) {
            de0Var.measure(View.MeasureSpec.makeMeasureSpec(de0Var.getLayoutParams().height, 1073741824), View.MeasureSpec.makeMeasureSpec(this.e.getLayoutParams().width, 1073741824));
            if (this.I) {
                i3 = ik8.B(8.0f, this.e.getMeasuredWidth(), i3);
            }
        }
        in inVar = this.c;
        if (inVar.getVisibility() == 0) {
            inVar.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            if (this.I) {
                measuredWidth = ik8.B(8.0f, inVar.getMeasuredWidth(), i3);
            } else {
                measuredWidth = (measuredWidth - inVar.getMeasuredWidth()) - hl.L(8.0f);
            }
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z = ob6.a0;
                int i4 = this.s + 4;
                if (z) {
                    marginLayoutParams.leftMargin = inVar.getMeasuredWidth() + hl.L(i4);
                } else {
                    marginLayoutParams.rightMargin = inVar.getMeasuredWidth() + hl.L(i4);
                }
            }
        }
        this.b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setBetterLayout(boolean z) {
        this.I = z;
    }

    public void setCanDisable(boolean z) {
        this.n = z;
    }

    @Override
    public void setEnabled(boolean z) {
        float f;
        float f2;
        super.setEnabled(z);
        float f3 = 1.0f;
        if (!z && this.n) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        this.b.setAlpha(f);
        in inVar = this.c;
        if (inVar.getVisibility() == 0) {
            if (!z && this.n) {
                f2 = 0.5f;
            } else {
                f2 = 1.0f;
            }
            inVar.setAlpha(f2);
        }
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            if (!z && this.n) {
                f3 = 0.5f;
            }
            imageView.setAlpha(f3);
        }
    }

    public void setIcon(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        e29 e29Var = this.d;
        if (i == 0) {
            e29Var.setVisibility(8);
            boolean z = ob6.a0;
            float f = this.s;
            if (z) {
                marginLayoutParams.rightMargin = hl.L(f);
                return;
            } else {
                marginLayoutParams.leftMargin = hl.L(f);
                return;
            }
        }
        e29Var.setImageResource(i);
        yob.s(e29Var, aob.m6, this.a, PorterDuff.Mode.MULTIPLY);
        e29Var.setBackground(null);
        e29Var.setVisibility(0);
        if (ob6.a0) {
            marginLayoutParams.rightMargin = hl.L(58.0f);
        } else {
            marginLayoutParams.leftMargin = hl.L(58.0f);
        }
    }

    public void setTextColor(int i) {
        TextView textView = this.b;
        yob.q(textView);
        textView.setTextColor(i);
    }

    public void setTextValueColor(int i) {
        in inVar = this.c;
        yob.q(inVar);
        inVar.setTextColor(i);
    }

    public qmb(Context context) {
        this(0, null, context);
    }

    public qmb(Context context, vnb vnbVar) {
        this(0, vnbVar, context);
    }
}
