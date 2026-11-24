package defpackage;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class e65 implements DialogInterface.OnShowListener {
    public final byte a;
    public final hd b;
    public final EditTextBoldCursor c;
    public final Object d;

    public e65(Object obj, hd hdVar, EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.d = obj;
        this.b = hdVar;
        this.c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.c;
        hd hdVar = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((k65) obj).b.k1(null, hdVar, editTextBoldCursor, true);
                return;
            default:
                ((f65) obj).r1.b.k1(null, hdVar, editTextBoldCursor, true);
                return;
        }
    }
}
