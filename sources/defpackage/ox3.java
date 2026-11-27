package defpackage;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
public final class ox3 implements KeyListener {
    public final KeyListener a;

    public ox3(KeyListener keyListener) {
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
        boolean r;
        if (i != 67) {
            if (i != 112) {
                r = false;
            } else {
                r = qx6.r(editable, keyEvent, true);
            }
        } else {
            r = qx6.r(editable, keyEvent, false);
        }
        if (r) {
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
