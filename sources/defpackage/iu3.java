package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class iu3 extends ShapeDrawable {
    public final byte a = 1;
    public final EditTextBoldCursor b;

    public iu3(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.b;
        switch (b) {
            case 0:
                super.draw(canvas);
                editTextBoldCursor.H0 = true;
                return;
            default:
                if (editTextBoldCursor.e1) {
                    editTextBoldCursor.H0 = true;
                    return;
                } else {
                    super.draw(canvas);
                    return;
                }
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return gm.L(this.b.j0 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return gm.L(this.b.F0);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public iu3(EditTextBoldCursor editTextBoldCursor) {
        this.b = editTextBoldCursor;
    }
}
