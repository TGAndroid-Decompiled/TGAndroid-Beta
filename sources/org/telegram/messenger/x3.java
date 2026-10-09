package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class x3 implements View.OnClickListener {
    public final int f19764a;
    public final Object f19765b;

    public x3(Object obj, int i10) {
        this.f19764a = i10;
        this.f19765b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19764a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.o((FilesMigrationService.FilesMigrationBottomSheet) this.f19765b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$448((boolean[]) this.f19765b, view);
                return;
        }
    }
}
