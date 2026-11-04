package org.telegram.messenger;

import android.content.DialogInterface;
public final class wd implements DialogInterface.OnCancelListener {
    public final int f26189a;
    public final Object f26190b;

    public wd(Object obj, int i3) {
        this.f26189a = i3;
        this.f26190b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i3 = this.f26189a;
        Object obj = this.f26190b;
        switch (i3) {
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
                ((ve) obj).f25857f = true;
                return;
        }
    }
}
