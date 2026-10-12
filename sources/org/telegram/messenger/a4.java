package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class a4 implements View.OnClickListener {
    public final int f17039a;
    public final Object f17040b;

    public a4(Object obj, int i10) {
        this.f17039a = i10;
        this.f17040b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f17039a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.o((FilesMigrationService.FilesMigrationBottomSheet) this.f17040b, view);
                return;
            default:
                MessagesController.L4((boolean[]) this.f17040b, view);
                return;
        }
    }
}
