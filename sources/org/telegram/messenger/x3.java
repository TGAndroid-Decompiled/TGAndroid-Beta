package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class x3 implements View.OnClickListener {
    public final int f19768a;
    public final Object f19769b;

    public x3(Object obj, int i10) {
        this.f19768a = i10;
        this.f19769b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19768a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.o((FilesMigrationService.FilesMigrationBottomSheet) this.f19769b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$448((boolean[]) this.f19769b, view);
                return;
        }
    }
}
