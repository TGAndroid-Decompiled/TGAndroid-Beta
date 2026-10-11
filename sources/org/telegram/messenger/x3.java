package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class x3 implements View.OnClickListener {
    public final int f19761a;
    public final Object f19762b;

    public x3(Object obj, int i10) {
        this.f19761a = i10;
        this.f19762b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19761a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.o((FilesMigrationService.FilesMigrationBottomSheet) this.f19762b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$448((boolean[]) this.f19762b, view);
                return;
        }
    }
}
