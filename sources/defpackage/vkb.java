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
public final class vkb extends FrameLayout {
    public byte E;
    public boolean F;
    public int G;
    public Paint H;
    public boolean I;
    public final ylb a;
    public final TextView b;
    public final io c;
    public final s09 d;
    public bf0 e;
    public final ImageView f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final byte s;
    public boolean w;
    public float x;
    public float y;

    public vkb(int i, ylb ylbVar, Context context) {
        super(context);
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z = e21.a;
        this.I = false;
        this.a = ylbVar;
        this.s = (byte) 21;
        TextView textView = new TextView(context);
        this.b = textView;
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        textView.setGravity(i2 | 16);
        anb.X(textView, cmb.F6, ylbVar);
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        addView(textView, qoe.d(-1, -1.0f, i3 | 48, 21.0f, 0.0f, 21.0f, 0.0f));
        io ioVar = new io(context, true, true, !jb6.a0);
        this.c = ioVar;
        ioVar.b(0.55f, 320L, d53.h);
        ioVar.setTextSize(gm.L(16.0f));
        if (jb6.a0) {
            i4 = 3;
        } else {
            i4 = 5;
        }
        ioVar.setGravity(i4 | 16);
        anb.U(ioVar, cmb.H6, ylbVar);
        if (jb6.a0) {
            i5 = 3;
        } else {
            i5 = 5;
        }
        addView(ioVar, qoe.d(-2, -1.0f, i5 | 48, 17.0f, 0.0f, 17.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i7 = cmb.l6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.s(imageView, i7, ylbVar, mode);
        imageView.setVisibility(8);
        if (jb6.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        addView((View) imageView, qoe.d(-2, -2.0f, i6 | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setVisibility(4);
        anb.s(imageView2, i7, ylbVar, mode);
        addView(imageView2, qoe.d(-2, -2.0f, (jb6.a0 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(ArrayList arrayList, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        setEnabled(z);
        ImageView imageView = this.f;
        io ioVar = this.c;
        float f5 = 0.5f;
        TextView textView = this.b;
        if (arrayList != null) {
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", f3));
            if (ioVar.getVisibility() == 0) {
                if (z) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.5f;
                }
                arrayList.add(ObjectAnimator.ofFloat(ioVar, "alpha", f4));
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
        if (ioVar.getVisibility() == 0) {
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            ioVar.setAlpha(f2);
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
        io ioVar = this.c;
        if (charSequence2 != null) {
            ioVar.c(charSequence2, z, true);
            ioVar.setVisibility(0);
        } else {
            ioVar.setVisibility(4);
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
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        TextView textView = this.b;
        textView.setGravity(i | 16);
        removeView(textView);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        float f = this.s;
        addView(textView, qoe.d(-1, -1.0f, i2 | 48, f, 0.0f, f, 0.0f));
        if (jb6.a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        io ioVar = this.c;
        ioVar.setGravity(i3 | 16);
        removeView(ioVar);
        if (jb6.a0) {
            i4 = 3;
        } else {
            i4 = 5;
        }
        addView(ioVar, qoe.d(-2, -1.0f, i4 | 48, f, 0.0f, f, 0.0f));
        View view = this.d;
        removeView(view);
        if (jb6.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        addView(view, qoe.d(-2, -2.0f, i5 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f;
        removeView(view2);
        if (!jb6.a0) {
            i6 = 5;
        }
        addView(view2, qoe.d(-2, -2.0f, i6 | 16, f, 0.0f, f, 0.0f));
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
                paint.setColor(cmb.v0(cmb.N5, this.a));
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
            RectF rectF = gm.P;
            int measuredWidth = getMeasuredWidth();
            float f8 = this.s;
            rectF.set((measuredWidth - gm.L(f8)) - gm.L(this.E), measuredHeight - gm.L(3.0f), getMeasuredWidth() - gm.L(f8), gm.L(3.0f) + measuredHeight);
            if (jb6.a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, gm.L(3.0f), gm.L(3.0f), this.H);
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
            int L = gm.L(f2);
            if (!jb6.a0) {
                f3 = L;
            }
            float f9 = f3;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (jb6.a0) {
                i = L;
            }
            canvas.drawLine(f9, measuredHeight2, measuredWidth2 - i, getMeasuredHeight() - 1, cmb.j0);
        }
    }

    public TextView getTextView() {
        return this.b;
    }

    public bf0 getValueBackupImageView() {
        int i;
        if (this.e == null) {
            bf0 bf0Var = new bf0(getContext());
            this.e = bf0Var;
            if (jb6.a0) {
                i = 3;
            } else {
                i = 5;
            }
            float f = this.s - 4;
            addView(bf0Var, qoe.d(24, 24.0f, i | 16, f, 0.0f, f, 0.0f));
        }
        return this.e;
    }

    public ImageView getValueImageView() {
        return this.f;
    }

    public io getValueTextView() {
        return this.c;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bf0 bf0Var = this.e;
        if (bf0Var != null && bf0Var.getImageReceiver() != null && (this.e.getImageReceiver().t() instanceof vm)) {
            ((vm) this.e.getImageReceiver().t()).o(this);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.b.getText());
        io ioVar = this.c;
        if (ioVar != null && ioVar.getVisibility() == 0) {
            str = "\n" + ((Object) ioVar.getText());
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
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - gm.L(34.0f);
        if (this.I) {
            i3 = measuredWidth;
        } else {
            i3 = measuredWidth / 2;
        }
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        s09 s09Var = this.d;
        if (s09Var.getVisibility() == 0) {
            s09Var.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            if (this.I) {
                i3 = wi8.B(8.0f, s09Var.getMeasuredWidth(), i3);
            }
        }
        bf0 bf0Var = this.e;
        if (bf0Var != null) {
            bf0Var.measure(View.MeasureSpec.makeMeasureSpec(bf0Var.getLayoutParams().height, 1073741824), View.MeasureSpec.makeMeasureSpec(this.e.getLayoutParams().width, 1073741824));
            if (this.I) {
                i3 = wi8.B(8.0f, this.e.getMeasuredWidth(), i3);
            }
        }
        io ioVar = this.c;
        if (ioVar.getVisibility() == 0) {
            ioVar.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            if (this.I) {
                measuredWidth = wi8.B(8.0f, ioVar.getMeasuredWidth(), i3);
            } else {
                measuredWidth = (measuredWidth - ioVar.getMeasuredWidth()) - gm.L(8.0f);
            }
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z = jb6.a0;
                int i4 = this.s + 4;
                if (z) {
                    marginLayoutParams.leftMargin = ioVar.getMeasuredWidth() + gm.L(i4);
                } else {
                    marginLayoutParams.rightMargin = ioVar.getMeasuredWidth() + gm.L(i4);
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
        io ioVar = this.c;
        if (ioVar.getVisibility() == 0) {
            if (!z && this.n) {
                f2 = 0.5f;
            } else {
                f2 = 1.0f;
            }
            ioVar.setAlpha(f2);
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
        s09 s09Var = this.d;
        if (i == 0) {
            s09Var.setVisibility(8);
            boolean z = jb6.a0;
            float f = this.s;
            if (z) {
                marginLayoutParams.rightMargin = gm.L(f);
                return;
            } else {
                marginLayoutParams.leftMargin = gm.L(f);
                return;
            }
        }
        s09Var.setImageResource(i);
        anb.s(s09Var, cmb.l6, this.a, PorterDuff.Mode.MULTIPLY);
        s09Var.setBackground(null);
        s09Var.setVisibility(0);
        if (jb6.a0) {
            marginLayoutParams.rightMargin = gm.L(58.0f);
        } else {
            marginLayoutParams.leftMargin = gm.L(58.0f);
        }
    }

    public void setTextColor(int i) {
        TextView textView = this.b;
        anb.q(textView);
        textView.setTextColor(i);
    }

    public void setTextValueColor(int i) {
        io ioVar = this.c;
        anb.q(ioVar);
        ioVar.setTextColor(i);
    }

    public vkb(Context context) {
        this(0, null, context);
    }

    public vkb(Context context, ylb ylbVar) {
        this(0, ylbVar, context);
    }
}
