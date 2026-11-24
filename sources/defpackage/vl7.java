package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.Components.Switch;
public class vl7 extends FrameLayout {
    public final TextView a;
    public final hn b;
    public final TextView c;
    public final ImageView d;
    public final ul7 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public final byte r;
    public boolean s;

    public vl7(Context context, int i, int i2, boolean z, wjb wjbVar) {
        super(context);
        int i3;
        int i4;
        int i5;
        float f;
        float f2;
        int i6;
        int i7;
        int i8;
        float f3;
        int i9;
        float f4;
        int i10;
        int i11;
        int i12;
        float f5;
        float f6;
        int i13;
        int i14;
        int i15;
        this.h = true;
        setWillNotDraw(false);
        this.r = i2;
        if (z) {
            ImageView imageView = new ImageView(context);
            this.d = imageView;
            imageView.setFocusable(false);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            if (k96.a0) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            addView(imageView, nme.d(48, 48.0f, i15 | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.a = textView;
        zkb.X(textView, bkb.F6, wjbVar);
        ug8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z2 = k96.a0;
        if (z2) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        int i16 = i4 | 48;
        if (z2) {
            f = 80.0f;
        } else {
            if (z) {
                i5 = 64;
            } else {
                i5 = i;
            }
            f = i5;
        }
        int i17 = (i2 - 70) / 2;
        float f7 = i17 + 13;
        if (z2) {
            if (z) {
                i14 = 64;
            } else {
                i14 = i;
            }
            f2 = i14;
        } else {
            f2 = 80.0f;
        }
        addView(textView, nme.d(-1, -2.0f, i16, f, f7, f2, 0.0f));
        hn hnVar = new hn(context, false, false, false);
        this.b = hnVar;
        hnVar.b(0.55f, 320L, s33.h);
        int i18 = bkb.y6;
        zkb.U(hnVar, i18, wjbVar);
        hnVar.setTextSize(gl.L(13.0f));
        if (k96.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        hnVar.setGravity(i6);
        hnVar.setPadding(0, 0, 0, 0);
        hnVar.setEllipsizeByGradient(true);
        boolean z3 = k96.a0;
        if (z3) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i19 = i7 | 48;
        if (z3) {
            f3 = 80.0f;
        } else {
            if (z) {
                i8 = 64;
            } else {
                i8 = i;
            }
            f3 = i8;
        }
        if (z) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        float f8 = (29 - i9) + i17;
        if (z3) {
            if (z) {
                i13 = 64;
            } else {
                i13 = i;
            }
            f4 = i13;
        } else {
            f4 = 80.0f;
        }
        addView(hnVar, nme.d(-1, -2.0f, i19, f3, f8, f4, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        zkb.X(textView2, i18, wjbVar);
        textView2.setTextSize(1, 13.0f);
        if (k96.a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView2.setGravity(i10);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setVisibility(8);
        boolean z4 = k96.a0;
        if (z4) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i20 = i11 | 48;
        if (z4) {
            f5 = 80.0f;
        } else {
            if (z) {
                i12 = 64;
            } else {
                i12 = i;
            }
            f5 = i12;
        }
        float f9 = (38 - (z ? 2 : 0)) + i17;
        if (z4) {
            f6 = z ? 64 : i;
        } else {
            f6 = 80.0f;
        }
        addView(textView2, nme.d(-2, -2.0f, i20, f5, f9, f6, 0.0f));
        ul7 ul7Var = new ul7(this, context, wjbVar);
        this.e = ul7Var;
        int i21 = bkb.L6;
        int i22 = bkb.M6;
        int i23 = bkb.c6;
        ul7Var.d(i21, i22, i23, i23);
        addView(ul7Var, nme.d(37, 40.0f, (k96.a0 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        ul7Var.setFocusable(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, int i, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
        this.a.setText(charSequence);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(i);
            zkb.s(imageView, bkb.I5, null, PorterDuff.Mode.MULTIPLY);
        }
        boolean z5 = this.s;
        ul7 ul7Var = this.e;
        ul7Var.b(i2, z, z5);
        setMultiline(z2);
        boolean z6 = this.n;
        hn hnVar = this.b;
        TextView textView = this.c;
        if (z6) {
            textView.setText(charSequence2);
        } else {
            hnVar.c(charSequence2, z4, true);
        }
        if (this.n) {
            hnVar = textView;
        }
        hnVar.setVisibility(0);
        ul7Var.setContentDescription(charSequence);
        this.f = z3;
    }

    public Switch getCheckBox() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x;
        int D;
        float f;
        float L;
        int i;
        if (this.f) {
            boolean z = k96.a0;
            float f2 = 20.0f;
            ImageView imageView = this.d;
            if (z) {
                L = 0.0f;
            } else {
                if (imageView != null) {
                    f = 64.0f;
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
                    f2 = 64.0f;
                }
                i = gl.L(f2);
            } else {
                i = 0;
            }
            canvas.drawLine(f3, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, bkb.j0);
        }
        if (this.h) {
            if (k96.a0) {
                x = gl.L(76.0f);
            } else {
                x = ls6.x(76.0f, getMeasuredWidth(), 1);
            }
            canvas.drawRect(x, ug8.D(22.0f, getMeasuredHeight(), 2), x + 2, gl.L(22.0f) + D, bkb.j0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.getText());
        if (this.n) {
            TextView textView = this.c;
            if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                sb.append("\n");
                sb.append(textView.getText());
            }
        } else {
            hn hnVar = this.b;
            if (hnVar != null && !TextUtils.isEmpty(hnVar.getText())) {
                sb.append("\n");
                sb.append(hnVar.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.e.h);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.n) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), 0);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(this.r), 1073741824));
        }
    }

    public void setAnimationsEnabled(boolean z) {
        this.s = z;
    }

    public void setChecked(boolean z) {
        this.e.c(z, true);
    }

    public void setDrawLine(boolean z) {
        this.h = z;
    }

    public void setMultiline(boolean z) {
        this.n = z;
        hn hnVar = this.b;
        TextView textView = this.c;
        if (z) {
            textView.setVisibility(0);
            hnVar.setVisibility(8);
            textView.setPadding(0, 0, 0, gl.L(14.0f));
            return;
        }
        textView.setVisibility(8);
        hnVar.setVisibility(0);
        hnVar.setPadding(0, 0, 0, 0);
    }

    public void setValue(CharSequence charSequence) {
        if (this.n) {
            this.c.setText(charSequence);
        } else {
            this.b.c(charSequence, true, true);
        }
    }

    public int a(int i) {
        return i;
    }

    public vl7(Context context) {
        this(context, 21, 70, false, null);
    }
}
