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
public final class uib extends FrameLayout {
    public byte E;
    public boolean F;
    public int G;
    public Paint H;
    public boolean I;
    public final wjb a;
    public final TextView b;
    public final hn c;
    public final ry8 d;
    public be0 e;
    public final ImageView f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final byte s;
    public boolean w;
    public float x;
    public float y;

    public uib(int i, wjb wjbVar, Context context) {
        super(context);
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z = w01.a;
        this.I = false;
        this.a = wjbVar;
        this.s = (byte) 21;
        TextView textView = new TextView(context);
        this.b = textView;
        ug8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        textView.setGravity(i2 | 16);
        zkb.X(textView, bkb.F6, wjbVar);
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        addView(textView, nme.d(-1, -1.0f, i3 | 48, 21.0f, 0.0f, 21.0f, 0.0f));
        hn hnVar = new hn(context, true, true, !k96.a0);
        this.c = hnVar;
        hnVar.b(0.55f, 320L, s33.h);
        hnVar.setTextSize(gl.L(16.0f));
        if (k96.a0) {
            i4 = 3;
        } else {
            i4 = 5;
        }
        hnVar.setGravity(i4 | 16);
        zkb.U(hnVar, bkb.H6, wjbVar);
        if (k96.a0) {
            i5 = 3;
        } else {
            i5 = 5;
        }
        addView(hnVar, nme.d(-2, -1.0f, i5 | 48, 17.0f, 0.0f, 17.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i7 = bkb.l6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.s(imageView, i7, wjbVar, mode);
        imageView.setVisibility(8);
        if (k96.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        addView((View) imageView, nme.d(-2, -2.0f, i6 | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setVisibility(4);
        zkb.s(imageView2, i7, wjbVar, mode);
        addView(imageView2, nme.d(-2, -2.0f, (k96.a0 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(ArrayList arrayList, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        setEnabled(z);
        ImageView imageView = this.f;
        hn hnVar = this.c;
        float f5 = 0.5f;
        TextView textView = this.b;
        if (arrayList != null) {
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", f3));
            if (hnVar.getVisibility() == 0) {
                if (z) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.5f;
                }
                arrayList.add(ObjectAnimator.ofFloat(hnVar, "alpha", f4));
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
        if (hnVar.getVisibility() == 0) {
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            hnVar.setAlpha(f2);
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
        hn hnVar = this.c;
        if (charSequence2 != null) {
            hnVar.c(charSequence2, z, true);
            hnVar.setVisibility(0);
        } else {
            hnVar.setVisibility(4);
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
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        TextView textView = this.b;
        textView.setGravity(i | 16);
        removeView(textView);
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        float f = this.s;
        addView(textView, nme.d(-1, -1.0f, i2 | 48, f, 0.0f, f, 0.0f));
        if (k96.a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        hn hnVar = this.c;
        hnVar.setGravity(i3 | 16);
        removeView(hnVar);
        if (k96.a0) {
            i4 = 3;
        } else {
            i4 = 5;
        }
        addView(hnVar, nme.d(-2, -1.0f, i4 | 48, f, 0.0f, f, 0.0f));
        View view = this.d;
        removeView(view);
        if (k96.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        addView(view, nme.d(-2, -2.0f, i5 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f;
        removeView(view2);
        if (!k96.a0) {
            i6 = 5;
        }
        addView(view2, nme.d(-2, -2.0f, i6 | 16, f, 0.0f, f, 0.0f));
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
                paint.setColor(bkb.v0(bkb.N5, this.a));
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
            RectF rectF = gl.P;
            int measuredWidth = getMeasuredWidth();
            float f8 = this.s;
            rectF.set((measuredWidth - gl.L(f8)) - gl.L(this.E), measuredHeight - gl.L(3.0f), getMeasuredWidth() - gl.L(f8), gl.L(3.0f) + measuredHeight);
            if (k96.a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, gl.L(3.0f), gl.L(3.0f), this.H);
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
            int L = gl.L(f2);
            if (!k96.a0) {
                f3 = L;
            }
            float f9 = f3;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (k96.a0) {
                i = L;
            }
            canvas.drawLine(f9, measuredHeight2, measuredWidth2 - i, getMeasuredHeight() - 1, bkb.j0);
        }
    }

    public TextView getTextView() {
        return this.b;
    }

    public be0 getValueBackupImageView() {
        int i;
        if (this.e == null) {
            be0 be0Var = new be0(getContext());
            this.e = be0Var;
            if (k96.a0) {
                i = 3;
            } else {
                i = 5;
            }
            float f = this.s - 4;
            addView(be0Var, nme.d(24, 24.0f, i | 16, f, 0.0f, f, 0.0f));
        }
        return this.e;
    }

    public ImageView getValueImageView() {
        return this.f;
    }

    public hn getValueTextView() {
        return this.c;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        be0 be0Var = this.e;
        if (be0Var != null && be0Var.getImageReceiver() != null && (this.e.getImageReceiver().t() instanceof vl)) {
            ((vl) this.e.getImageReceiver().t()).o(this);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.b.getText());
        hn hnVar = this.c;
        if (hnVar != null && hnVar.getVisibility() == 0) {
            str = "\n" + ((Object) hnVar.getText());
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
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - gl.L(34.0f);
        if (this.I) {
            i3 = measuredWidth;
        } else {
            i3 = measuredWidth / 2;
        }
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        ry8 ry8Var = this.d;
        if (ry8Var.getVisibility() == 0) {
            ry8Var.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            if (this.I) {
                i3 = ug8.B(8.0f, ry8Var.getMeasuredWidth(), i3);
            }
        }
        be0 be0Var = this.e;
        if (be0Var != null) {
            be0Var.measure(View.MeasureSpec.makeMeasureSpec(be0Var.getLayoutParams().height, 1073741824), View.MeasureSpec.makeMeasureSpec(this.e.getLayoutParams().width, 1073741824));
            if (this.I) {
                i3 = ug8.B(8.0f, this.e.getMeasuredWidth(), i3);
            }
        }
        hn hnVar = this.c;
        if (hnVar.getVisibility() == 0) {
            hnVar.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            if (this.I) {
                measuredWidth = ug8.B(8.0f, hnVar.getMeasuredWidth(), i3);
            } else {
                measuredWidth = (measuredWidth - hnVar.getMeasuredWidth()) - gl.L(8.0f);
            }
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z = k96.a0;
                int i4 = this.s + 4;
                if (z) {
                    marginLayoutParams.leftMargin = hnVar.getMeasuredWidth() + gl.L(i4);
                } else {
                    marginLayoutParams.rightMargin = hnVar.getMeasuredWidth() + gl.L(i4);
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
        hn hnVar = this.c;
        if (hnVar.getVisibility() == 0) {
            if (!z && this.n) {
                f2 = 0.5f;
            } else {
                f2 = 1.0f;
            }
            hnVar.setAlpha(f2);
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
        ry8 ry8Var = this.d;
        if (i == 0) {
            ry8Var.setVisibility(8);
            boolean z = k96.a0;
            float f = this.s;
            if (z) {
                marginLayoutParams.rightMargin = gl.L(f);
                return;
            } else {
                marginLayoutParams.leftMargin = gl.L(f);
                return;
            }
        }
        ry8Var.setImageResource(i);
        zkb.s(ry8Var, bkb.l6, this.a, PorterDuff.Mode.MULTIPLY);
        ry8Var.setBackground(null);
        ry8Var.setVisibility(0);
        if (k96.a0) {
            marginLayoutParams.rightMargin = gl.L(58.0f);
        } else {
            marginLayoutParams.leftMargin = gl.L(58.0f);
        }
    }

    public void setTextColor(int i) {
        TextView textView = this.b;
        zkb.q(textView);
        textView.setTextColor(i);
    }

    public void setTextValueColor(int i) {
        hn hnVar = this.c;
        zkb.q(hnVar);
        hnVar.setTextColor(i);
    }

    public uib(Context context) {
        this(0, null, context);
    }

    public uib(Context context, wjb wjbVar) {
        this(0, wjbVar, context);
    }
}
