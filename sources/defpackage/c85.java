package defpackage;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class c85 implements DialogInterface.OnShowListener {
    public final byte a;
    public final he b;
    public final EditTextBoldCursor c;
    public final Object d;

    public c85(Object obj, he heVar, EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.d = obj;
        this.b = heVar;
        this.c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.c;
        he heVar = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((i85) obj).b.k1(null, heVar, editTextBoldCursor, true);
                return;
            default:
                ((d85) obj).r1.b.k1(null, heVar, editTextBoldCursor, true);
                return;
        }
    }
}
