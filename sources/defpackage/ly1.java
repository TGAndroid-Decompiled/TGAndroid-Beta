package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.Switch;
public final class ly1 extends FrameLayout {
    public final byte a = 0;
    public boolean b;
    public final View c;
    public final Object d;
    public final Object e;
    public final Object f;

    public ly1(Activity activity, boolean z) {
        super(activity);
        int i;
        int i2;
        this.b = false;
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, nme.d(32, 32.0f, 0, 12.0f, 4.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        addView(linearLayout, nme.d(-1, -2.0f, 0, 64.0f, 4.0f, 0.0f, 4.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(2, 16.0f);
        textView.setGravity(3);
        zkb.X(textView, bkb.F6, null);
        if (z) {
            i = 64;
        } else {
            i = 0;
        }
        linearLayout.addView(textView, nme.t(-1, -2, 0, 0, 0, i, 0));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setTextSize(2, 13.0f);
        textView2.setGravity(3);
        zkb.X(textView2, bkb.x6, null);
        if (z) {
            i2 = 64;
        } else {
            i2 = 0;
        }
        linearLayout.addView(textView2, nme.t(-1, -2, 0, 0, 4, i2, 0));
        setPadding(0, gl.L(4.0f), 0, gl.L(4.0f));
        if (z) {
            Switch r3 = new Switch(activity, null);
            this.f = r3;
            r3.setDrawIconType(1);
            addView(r3, nme.d(37, 40.0f, 21, 21.0f, 0.0f, 21.0f, 0.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                if (this.b) {
                    canvas.drawRect(gl.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), bkb.j0);
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 0:
                if ((view instanceof jia) && this.b) {
                    jia jiaVar = (jia) view;
                    canvas.save();
                    canvas.scale(0.8f, 0.8f);
                    canvas.translate(-gl.L(12.0f), gl.L(6.0f));
                    int color = jiaVar.getTextPaint().getColor();
                    jiaVar.getTextPaint().setColor(-1);
                    boolean drawChild = super.drawChild(canvas, view, j);
                    jiaVar.getTextPaint().setColor(color);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.f;
                RectF rectF = (RectF) this.d;
                if (this.b) {
                    canvas.save();
                    int L = gl.L(26.0f);
                    canvas.translate(gl.L(5.0f), (getMeasuredHeight() - L) / 2.0f);
                    float f = L;
                    rectF.set(-gl.L(5.0f), 0.0f, getMeasuredWidth() - getPaddingEnd(), f);
                    float f2 = f / 2.0f;
                    canvas.drawRoundRect(rectF, f2, f2, (Paint) this.e);
                    canvas.translate(((getMeasuredWidth() - getPaddingEnd()) - gl.L(6.0f)) - drawable.getIntrinsicWidth(), gl.L(5.0f));
                    drawable.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        switch (this.a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                Switch r0 = (Switch) this.f;
                if (r0 != null) {
                    accessibilityNodeInfo.setClassName("android.widget.Switch");
                    accessibilityNodeInfo.setCheckable(true);
                    accessibilityNodeInfo.setChecked(r0.h);
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) ((TextView) this.d).getText());
                    sb.append("\n");
                    sb.append((Object) ((TextView) this.e).getText());
                    sb.append("\n");
                    if (r0.h) {
                        i = 2131747699;
                    } else {
                        i = 2131747701;
                    }
                    sb.append(k96.M0(i, null));
                    accessibilityNodeInfo.setText(sb.toString());
                    return;
                }
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                ((Paint) this.e).setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-9071617, -5999873}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    public ly1(Activity activity) {
        super(activity);
        this.d = new RectF();
        this.e = new Paint(1);
        this.b = false;
        jia jiaVar = new jia(activity);
        this.c = jiaVar;
        addView(jiaVar, nme.c(-1.0f, -1));
        setWillNotDraw(false);
        Drawable drawable = activity.getDrawable(2131232240);
        this.f = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        setClipToPadding(false);
        setClipChildren(false);
        ote.a(this);
    }
}
