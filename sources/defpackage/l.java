package defpackage;

import java.util.ArrayList;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l implements Runnable {
    public final byte a;
    public final EditTextBoldCursor b;

    public l(EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        EditTextBoldCursor editTextBoldCursor = this.b;
        switch (b) {
            case 0:
                hl.t1(editTextBoldCursor);
                return;
            case 1:
                editTextBoldCursor.y = false;
                editTextBoldCursor.d = false;
                editTextBoldCursor.h();
                ArrayList arrayList = editTextBoldCursor.a;
                if (!arrayList.isEmpty()) {
                    ((npa) arrayList.get(0)).q = new l(editTextBoldCursor, (byte) 2);
                    float sqrt = (float) Math.sqrt(Math.pow(editTextBoldCursor.getHeight(), 2.0d) + Math.pow(editTextBoldCursor.getWidth(), 2.0d));
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((npa) obj).j(editTextBoldCursor.w, editTextBoldCursor.x, sqrt, true);
                    }
                    return;
                }
                return;
            case 2:
                editTextBoldCursor.post(new l(editTextBoldCursor, (byte) 3));
                return;
            case 3:
                editTextBoldCursor.j(false, true);
                return;
            case 4:
                editTextBoldCursor.requestFocus();
                hl.E3(editTextBoldCursor);
                return;
            case 5:
                editTextBoldCursor.requestFocus();
                hl.E3(editTextBoldCursor);
                return;
            case 6:
                hl.E3(editTextBoldCursor);
                return;
            case 7:
                hl.E3(editTextBoldCursor);
                return;
            case 8:
                editTextBoldCursor.requestFocus();
                hl.E3(editTextBoldCursor);
                return;
            case 9:
                hl.E3(editTextBoldCursor);
                return;
            case 10:
                editTextBoldCursor.requestFocus();
                hl.E3(editTextBoldCursor);
                return;
            default:
                editTextBoldCursor.requestFocus();
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                hl.E3(editTextBoldCursor);
                return;
        }
    }
}
