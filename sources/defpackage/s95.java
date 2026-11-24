package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public abstract class s95 extends FrameLayout implements tjb {
    public jia a;
    public jia b;
    public ImageView c;
    public ImageView d;
    public byte e;
    public boolean f;
    public int h;
    public byte n;
    public Paint r;

    public final void a(int i, int i2) {
        jia jiaVar = this.a;
        zkb.q(jiaVar);
        ImageView imageView = this.c;
        zkb.q(imageView);
        jiaVar.setTextColor(i2);
        jiaVar.setTag(null);
        imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        imageView.setTag(null);
    }

    public final void b(int i, String str, boolean z) {
        this.a.l(str, false);
        jia jiaVar = this.b;
        jiaVar.l(null, false);
        ImageView imageView = this.c;
        imageView.setImageResource(i);
        imageView.setVisibility(0);
        jiaVar.setVisibility(8);
        this.d.setVisibility(8);
        imageView.setPadding(0, gl.L(7.0f), 0, 0);
        this.f = z;
        setWillNotDraw(!z);
    }

    public jia getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.d;
    }

    public jia getValueTextView() {
        return this.b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float L;
        int i;
        ImageView imageView = this.c;
        if (this.f) {
            float f2 = 20.0f;
            if (k96.a0) {
                L = 0.0f;
            } else {
                if (imageView.getVisibility() == 0) {
                    f = 68.0f;
                } else {
                    f = 20.0f;
                }
                L = gl.L(f);
            }
            float f3 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                if (imageView.getVisibility() == 0) {
                    f2 = 68.0f;
                }
                i = gl.L(f2);
            } else {
                i = 0;
            }
            canvas.drawLine(f3, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, this.r);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.a.getText();
        if (!TextUtils.isEmpty(text)) {
            CharSequence text2 = this.b.getText();
            if (!TextUtils.isEmpty(text2)) {
                accessibilityNodeInfo.setText(((Object) text) + ": " + ((Object) text2));
                return;
            }
            accessibilityNodeInfo.setText(text);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        int L;
        int measuredWidth;
        int measuredWidth2;
        float f2;
        byte b = this.n;
        byte b2 = this.e;
        jia jiaVar = this.a;
        ImageView imageView = this.d;
        ImageView imageView2 = this.c;
        int i6 = i4 - i2;
        int i7 = i3 - i;
        jia jiaVar2 = this.b;
        int textHeight = (i6 - jiaVar2.getTextHeight()) / 2;
        if (k96.a0) {
            i5 = gl.L(b2);
        } else {
            i5 = 0;
        }
        jiaVar2.layout(i5, textHeight, jiaVar2.getMeasuredWidth() + i5, jiaVar2.getMeasuredHeight() + textHeight);
        int textHeight2 = (i6 - jiaVar.getTextHeight()) / 2;
        if (k96.a0) {
            int measuredWidth3 = getMeasuredWidth() - jiaVar.getMeasuredWidth();
            if (imageView2.getVisibility() == 0) {
                f2 = this.h;
            } else {
                f2 = b2;
            }
            L = measuredWidth3 - gl.L(f2);
        } else {
            if (imageView2.getVisibility() == 0) {
                f = this.h;
            } else {
                f = b2;
            }
            L = gl.L(f);
        }
        jiaVar.layout(L, textHeight2, jiaVar.getMeasuredWidth() + L, jiaVar.getMeasuredHeight() + textHeight2);
        if (imageView2.getVisibility() == 0) {
            int L2 = gl.L(5.0f);
            if (!k96.a0) {
                measuredWidth2 = gl.L(b);
            } else {
                measuredWidth2 = (i7 - imageView2.getMeasuredWidth()) - gl.L(b);
            }
            imageView2.layout(measuredWidth2, L2, imageView2.getMeasuredWidth() + measuredWidth2, imageView2.getMeasuredHeight() + L2);
        }
        if (imageView.getVisibility() == 0) {
            int measuredHeight = (i6 - imageView.getMeasuredHeight()) / 2;
            if (k96.a0) {
                measuredWidth = gl.L(23.0f);
            } else {
                measuredWidth = (i7 - imageView.getMeasuredWidth()) - gl.L(23.0f);
            }
            imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        ImageView imageView = this.d;
        int size = View.MeasureSpec.getSize(i);
        int L = gl.L(48.0f);
        jia jiaVar = this.b;
        byte b = this.e;
        jiaVar.measure(ug8.f(b, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), 1073741824));
        this.a.measure(View.MeasureSpec.makeMeasureSpec((size - gl.L(b + 71)) - jiaVar.getTextWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), 1073741824));
        ImageView imageView2 = this.c;
        if (imageView2.getVisibility() == 0) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        }
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        }
        setMeasuredDimension(size, gl.L(50.0f) + (this.f ? 1 : 0));
    }

    public void setOffsetFromImage(int i) {
        this.h = i;
    }

    public void setTextColor(int i) {
        jia jiaVar = this.a;
        zkb.q(jiaVar);
        jiaVar.setTextColor(i);
    }

    @Override
    public final void updateColors() {
        try {
            this.r.setColor(bkb.w0(null, bkb.Wg, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
