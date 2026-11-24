package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.p;
public final class kl2 extends EditTextBoldCursor {
    public final byte M1;
    public final int N1;
    public final p O1;

    public kl2(p pVar, Context context, int i, byte b) {
        super(context);
        this.M1 = b;
        this.O1 = pVar;
        this.N1 = i;
    }

    @Override
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.M1) {
            case 1:
                boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
                rect.bottom = gl.L(40.0f) + rect.bottom;
                return globalVisibleRect;
            default:
                return super.getGlobalVisibleRect(rect, point);
        }
    }

    @Override
    public final void invalidate() {
        switch (this.M1) {
            case 1:
                super.invalidate();
                this.O1.F[this.N1 - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.M1) {
            case 0:
                EditTextBoldCursor[] editTextBoldCursorArr = this.O1.F;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    int i = this.N1 + 1;
                    if (editTextBoldCursorArr[i].isFocused()) {
                        gl.F3(editTextBoldCursorArr[i]);
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
                gl.F3(this);
                return super.onTouchEvent(motionEvent);
        }
    }
}
