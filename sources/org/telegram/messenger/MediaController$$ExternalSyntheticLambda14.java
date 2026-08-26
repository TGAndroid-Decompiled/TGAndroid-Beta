package org.telegram.messenger;

import org.telegram.ui.ActionBar.AlertDialog;

public final class MediaController$$ExternalSyntheticLambda14 implements Runnable {
    public final int $r8$classId;
    public final AlertDialog f$0;
    public final boolean[] f$1;

    public MediaController$$ExternalSyntheticLambda14(AlertDialog alertDialog, boolean[] zArr, int i) {
        this.$r8$classId = i;
        this.f$0 = alertDialog;
        this.f$1 = zArr;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                MediaController.lambda$saveFile$54(this.f$0, this.f$1);
                break;
            case 1:
                MediaController.lambda$saveFile$45(this.f$1, this.f$0);
                break;
            case 2:
                MediaController.lambda$saveFile$49(this.f$0, this.f$1);
                break;
            default:
                MediaController.lambda$saveFile$52(this.f$1, this.f$0);
                break;
        }
    }

    public MediaController$$ExternalSyntheticLambda14(boolean[] zArr, AlertDialog alertDialog, int i) {
        this.$r8$classId = i;
        this.f$1 = zArr;
        this.f$0 = alertDialog;
    }
}
