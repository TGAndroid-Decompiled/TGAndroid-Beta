package defpackage;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
public final class ey3 implements KeyListener {
    public final KeyListener a;

    public ey3(KeyListener keyListener) {
        this.a = keyListener;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.a.clearMetaKeyState(view, editable, i);
    }

    @Override
    public final int getInputType() {
        return this.a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean j;
        if (i != 67) {
            if (i != 112) {
                j = false;
            } else {
                j = hi2.j(editable, keyEvent, true);
            }
        } else {
            j = hi2.j(editable, keyEvent, false);
        }
        if (j) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        } else if (this.a.onKeyDown(view, editable, i, keyEvent)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i, keyEvent);
    }
}
