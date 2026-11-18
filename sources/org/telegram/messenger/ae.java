package org.telegram.messenger;

import android.content.DialogInterface;
public final class ae implements DialogInterface.OnCancelListener {
    public final int f22864a;
    public final Object f22865b;

    public ae(Object obj, int i7) {
        this.f22864a = i7;
        this.f22865b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f22864a;
        Object obj = this.f22865b;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.W1;
                ((boolean[]) obj)[0] = true;
                return;
            case 1:
                String[] strArr2 = MediaController.W1;
                ((boolean[]) obj)[0] = true;
                return;
            case 2:
                ((boolean[]) obj)[0] = true;
                return;
            default:
                ((af) obj).f22870f = true;
                return;
        }
    }
}
