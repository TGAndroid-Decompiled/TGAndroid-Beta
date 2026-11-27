package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
public final class sq9 implements TextView.OnEditorActionListener {
    public final byte a;
    public final id b;

    public sq9(id idVar, byte b) {
        this.a = b;
        this.b = idVar;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        id idVar = this.b;
        switch (b) {
            case 0:
                hl.t1(textView);
                View c = idVar.c(-1);
                if (c != null) {
                    c.callOnClick();
                }
                return false;
            default:
                if (i != 6) {
                    return false;
                }
                idVar.c(-1).callOnClick();
                return true;
        }
    }
}
