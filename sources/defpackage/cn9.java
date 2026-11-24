package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
public final class cn9 implements TextView.OnEditorActionListener {
    public final byte a;
    public final hd b;

    public cn9(hd hdVar, byte b) {
        this.a = b;
        this.b = hdVar;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        hd hdVar = this.b;
        switch (b) {
            case 0:
                gl.t1(textView);
                View c = hdVar.c(-1);
                if (c != null) {
                    c.callOnClick();
                }
                return false;
            default:
                if (i != 6) {
                    return false;
                }
                hdVar.c(-1).callOnClick();
                return true;
        }
    }
}
