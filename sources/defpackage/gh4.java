package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class gh4 extends ImageView {
    public final byte a;
    public final int b;
    public final Object c;

    public gh4(Object obj, Context context, int i, byte b) {
        super(context);
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                hh4 hh4Var = (hh4) this.c;
                qa6 qa6Var = hh4Var.s;
                if (hh4Var.r) {
                    int i = this.b / 2;
                    qa6Var.setBounds(i, i, getWidth() - i, getHeight() - i);
                    qa6Var.draw(canvas);
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        switch (this.a) {
            case 1:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((d85) ((db5) this.c).d).l1.x(this.b, true);
                    return;
                }
                return;
            default:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                return;
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                if (drawable != ((hh4) this.c).s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
