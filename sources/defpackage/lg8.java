package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.Components.Switch;
public final class lg8 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final Switch d;
    public boolean e;
    public boolean f;
    public final ylb h;

    public lg8(Context context, ylb ylbVar) {
        super(context);
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        int i4;
        int i5;
        float f3;
        float f4;
        this.h = ylbVar;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(imageView, qoe.d(28, 28.0f, i | 48, 18.0f, 16.0f, 18.0f, 9.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        anb.X(textView, cmb.F6, ylbVar);
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        textView.setGravity(i2 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z = jb6.a0;
        if (z) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        int i6 = i3 | 48;
        if (z) {
            f = 66.0f;
        } else {
            f = 64.0f;
        }
        if (z) {
            f2 = 64.0f;
        } else {
            f2 = 66.0f;
        }
        addView(textView, qoe.d(-1, -2.0f, i6, f, 8.0f, f2, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        anb.X(textView2, cmb.y6, ylbVar);
        textView2.setTextSize(1, 13.0f);
        if (jb6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        textView2.setGravity(i4);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setLineSpacing(gm.L(1.66f), 1.0f);
        boolean z2 = jb6.a0;
        if (z2) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        int i7 = i5 | 48;
        if (z2) {
            f3 = 66.0f;
        } else {
            f3 = 64.0f;
        }
        if (z2) {
            f4 = 64.0f;
        } else {
            f4 = 66.0f;
        }
        addView(textView2, qoe.d(-2, -2.0f, i7, f3, 31.0f, f4, 10.0f));
        Switch r3 = new Switch(context, ylbVar);
        this.d = r3;
        int i8 = cmb.L6;
        int i9 = cmb.M6;
        int i10 = cmb.c6;
        r3.d(i8, i9, i10, i10);
        addView(r3, qoe.d(37, 40.0f, (jb6.a0 ? 3 : 5) | 48, 21.0f, 10.0f, 19.0f, 0.0f));
        r3.setFocusable(false);
    }

    public final void a(String str, String str2, ll5 ll5Var, int i, boolean z) {
        boolean o;
        this.a.setText(str);
        ylb ylbVar = this.h;
        if (ylbVar != null) {
            o = ylbVar.a();
        } else {
            o = cmb.I.o();
        }
        g57 g57Var = new g57((byte) 1);
        g57Var.b(ll5Var.a, ll5Var.b);
        g57Var.b = o;
        ImageView imageView = this.c;
        imageView.setBackground(g57Var);
        imageView.setImageResource(i);
        boolean z2 = this.e;
        Switch r0 = this.d;
        r0.b(0, z, z2);
        this.b.setText(str2);
        r0.setContentDescription(str);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float L;
        int i;
        super.dispatchDraw(canvas);
        if (this.f) {
            ylb ylbVar = this.h;
            if (ylbVar != null) {
                paint = ylbVar.d("paintDivider");
            } else {
                paint = cmb.j0;
            }
            if (paint == null) {
                paint = cmb.j0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (jb6.a0) {
                    L = 0.0f;
                } else {
                    L = gm.L(19.0f);
                }
                float f = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (jb6.a0) {
                    i = gm.L(19.0f);
                } else {
                    i = 0;
                }
                canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    public Switch getCheckBox() {
        return this.d;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.getText());
        TextView textView = this.b;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            sb.append("\n");
            sb.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.d.h);
    }

    public void setAnimationsEnabled(boolean z) {
        this.e = z;
    }

    public void setChecked(boolean z) {
        this.d.b(0, z, true);
    }

    public void setDivider(boolean z) {
        this.f = z;
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
