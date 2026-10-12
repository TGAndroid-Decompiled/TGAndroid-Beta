package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class a4 implements View.OnClickListener {
    public final int f17038a;
    public final Object f17039b;

    public a4(Object obj, int i10) {
        this.f17038a = i10;
        this.f17039b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f17038a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.o((FilesMigrationService.FilesMigrationBottomSheet) this.f17039b, view);
                return;
            default:
                MessagesController.L4((boolean[]) this.f17039b, view);
                return;
        }
    }
}
