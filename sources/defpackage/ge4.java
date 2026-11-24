package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ge4 implements TextView.OnEditorActionListener {
    public final byte a;
    public final AlertDialog$Builder b;

    public ge4(AlertDialog$Builder alertDialog$Builder, byte b) {
        this.a = b;
        this.b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        AlertDialog$Builder alertDialog$Builder = this.b;
        switch (b) {
            case 0:
                gm.t1(textView);
                alertDialog$Builder.a.c(-1).callOnClick();
                return false;
            case 1:
                gm.t1(textView);
                alertDialog$Builder.a.c(-1).callOnClick();
                return false;
            case 2:
                gm.t1(textView);
                alertDialog$Builder.a.c(-1).callOnClick();
                return false;
            default:
                if (i != 5) {
                    return false;
                }
                alertDialog$Builder.a.c(-1).callOnClick();
                return true;
        }
    }
}
