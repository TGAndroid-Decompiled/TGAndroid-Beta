package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
public final class dp9 implements TextView.OnEditorActionListener {
    public final byte a;
    public final he b;

    public dp9(he heVar, byte b) {
        this.a = b;
        this.b = heVar;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        he heVar = this.b;
        switch (b) {
            case 0:
                gm.t1(textView);
                View c = heVar.c(-1);
                if (c != null) {
                    c.callOnClick();
                }
                return false;
            default:
                if (i != 6) {
                    return false;
                }
                heVar.c(-1).callOnClick();
                return true;
        }
    }
}
