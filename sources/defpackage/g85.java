package defpackage;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class g85 implements DialogInterface.OnShowListener {
    public final byte a;
    public final id b;
    public final EditTextBoldCursor c;
    public final Object d;

    public g85(Object obj, id idVar, EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.d = obj;
        this.b = idVar;
        this.c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.c;
        id idVar = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((m85) obj).b.l1(null, idVar, editTextBoldCursor, true);
                return;
            default:
                ((h85) obj).r1.b.l1(null, idVar, editTextBoldCursor, true);
                return;
        }
    }
}
