package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.p;
import org.telegram.ui.PhotoViewer;
public final class c7 extends ImageView {
    public final byte a;
    public final Object b;

    public c7(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                getBackground().draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.a) {
            case 2:
                super.invalidate();
                c75 c75Var = (c75) this.b;
                c75Var.g0.invalidate();
                c75Var.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                super.onDetachedFromWindow();
                clearAnimation();
                Object tag = getTag();
                r7 r7Var = (r7) this.b;
                c7 c7Var = r7Var.s;
                if (tag == null) {
                    c7Var.setVisibility(4);
                    r7Var.s.setAlpha(0.0f);
                    r7Var.s.setRotation(45.0f);
                    r7Var.s.setScaleX(0.0f);
                    r7Var.s.setScaleY(0.0f);
                    return;
                }
                c7Var.setAlpha(1.0f);
                r7Var.s.setRotation(0.0f);
                r7Var.s.setScaleX(1.0f);
                r7Var.s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((p5c) this.b).n.getTransformationMethod() != null) {
                    z = false;
                }
                accessibilityNodeInfo.setChecked(z);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(a.getCurrentActionBarHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void setAlpha(float f) {
        switch (this.a) {
            case 1:
                super.setAlpha(f);
                ((p) this.b).y.invalidate();
                return;
            default:
                super.setAlpha(f);
                return;
        }
    }

    @Override
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 3:
                super.setTranslationY(f);
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ArrayList arrayList = photoViewer.i1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((hg5) obj).setTranslationY(f);
                    }
                }
                y98 y98Var = photoViewer.h1;
                if (y98Var != null) {
                    y98Var.setTranslationY(f);
                }
                o96 o96Var = photoViewer.g1;
                if (o96Var != null) {
                    o96Var.setTranslationY(f);
                    return;
                }
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }
}
