package defpackage;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
public final class tw3 implements KeyListener {
    public final KeyListener a;

    public tw3(KeyListener keyListener) {
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
        boolean o;
        if (i != 67) {
            if (i != 112) {
                o = false;
            } else {
                o = lv6.o(editable, keyEvent, true);
            }
        } else {
            o = lv6.o(editable, keyEvent, false);
        }
        if (o) {
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
