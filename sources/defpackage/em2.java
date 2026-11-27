package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.p;
public final class em2 extends EditTextBoldCursor {
    public final byte N1;
    public final int O1;
    public final p P1;

    public em2(p pVar, Context context, int i, byte b) {
        super(context);
        this.N1 = b;
        this.P1 = pVar;
        this.O1 = i;
    }

    @Override
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.N1) {
            case 1:
                boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
                rect.bottom = hl.L(40.0f) + rect.bottom;
                return globalVisibleRect;
            default:
                return super.getGlobalVisibleRect(rect, point);
        }
    }

    @Override
    public final void invalidate() {
        switch (this.N1) {
            case 1:
                super.invalidate();
                this.P1.F[this.O1 - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.N1) {
            case 0:
                EditTextBoldCursor[] editTextBoldCursorArr = this.P1.F;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    int i = this.O1 + 1;
                    if (editTextBoldCursorArr[i].isFocused()) {
                        hl.E3(editTextBoldCursorArr[i]);
                    } else {
                        editTextBoldCursorArr[i].requestFocus();
                    }
                }
                return false;
            default:
                if (getAlpha() != 1.0f) {
                    return false;
                }
                if (!isFocused()) {
                    requestFocus();
                    return false;
                }
                hl.E3(this);
                return super.onTouchEvent(motionEvent);
        }
    }
}
