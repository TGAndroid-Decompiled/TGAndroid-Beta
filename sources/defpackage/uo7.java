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
public class uo7 extends FrameLayout {
    public final TextView a;
    public final in b;
    public final TextView c;
    public final ImageView d;
    public final to7 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public final byte r;
    public boolean s;

    public uo7(Context context, int i, int i2, boolean z, vnb vnbVar) {
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
            if (ob6.a0) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            addView(imageView, tre.d(48, 48.0f, i15 | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.a = textView;
        yob.X(textView, aob.G6, vnbVar);
        ik8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z2 = ob6.a0;
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
        addView(textView, tre.d(-1, -2.0f, i16, f, f7, f2, 0.0f));
        in inVar = new in(context, false, false, false);
        this.b = inVar;
        inVar.b(0.55f, 320L, k43.h);
        int i18 = aob.z6;
        yob.U(inVar, i18, vnbVar);
        inVar.setTextSize(hl.L(13.0f));
        if (ob6.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        inVar.setGravity(i6);
        inVar.setPadding(0, 0, 0, 0);
        inVar.setEllipsizeByGradient(true);
        boolean z3 = ob6.a0;
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
        addView(inVar, tre.d(-1, -2.0f, i19, f3, f8, f4, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        yob.X(textView2, i18, vnbVar);
        textView2.setTextSize(1, 13.0f);
        if (ob6.a0) {
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
        boolean z4 = ob6.a0;
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
        addView(textView2, tre.d(-2, -2.0f, i20, f5, f9, f6, 0.0f));
        to7 to7Var = new to7(this, context, vnbVar);
        this.e = to7Var;
        int i21 = aob.M6;
        int i22 = aob.N6;
        int i23 = aob.d6;
        to7Var.d(i21, i22, i23, i23);
        addView(to7Var, tre.d(37, 40.0f, (ob6.a0 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        to7Var.setFocusable(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, int i, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
        this.a.setText(charSequence);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(i);
            yob.s(imageView, aob.J5, null, PorterDuff.Mode.MULTIPLY);
        }
        boolean z5 = this.s;
        to7 to7Var = this.e;
        to7Var.b(i2, z, z5);
        setMultiline(z2);
        boolean z6 = this.n;
        in inVar = this.b;
        TextView textView = this.c;
        if (z6) {
            textView.setText(charSequence2);
        } else {
            inVar.c(charSequence2, z4, true);
        }
        if (this.n) {
            inVar = textView;
        }
        inVar.setVisibility(0);
        to7Var.setContentDescription(charSequence);
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
            boolean z = ob6.a0;
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
                L = hl.L(f);
            }
            float f3 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                if (imageView != null) {
                    f2 = 64.0f;
                }
                i = hl.L(f2);
            } else {
                i = 0;
            }
            canvas.drawLine(f3, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, aob.j0);
        }
        if (this.h) {
            if (ob6.a0) {
                x = hl.L(76.0f);
            } else {
                x = qu6.x(76.0f, getMeasuredWidth(), 1);
            }
            canvas.drawRect(x, ik8.D(22.0f, getMeasuredHeight(), 2), x + 2, hl.L(22.0f) + D, aob.j0);
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
            in inVar = this.b;
            if (inVar != null && !TextUtils.isEmpty(inVar.getText())) {
                sb.append("\n");
                sb.append(inVar.getText());
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
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(this.r), 1073741824));
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
        in inVar = this.b;
        TextView textView = this.c;
        if (z) {
            textView.setVisibility(0);
            inVar.setVisibility(8);
            textView.setPadding(0, 0, 0, hl.L(14.0f));
            return;
        }
        textView.setVisibility(8);
        inVar.setVisibility(0);
        inVar.setPadding(0, 0, 0, 0);
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

    public uo7(Context context) {
        this(context, 21, 70, false, null);
    }
}
