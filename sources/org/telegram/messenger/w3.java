package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class w3 implements View.OnClickListener {
    public final int f19653a;
    public final Object f19654b;

    public w3(Object obj, int i10) {
        this.f19653a = i10;
        this.f19654b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19653a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.m((FilesMigrationService.FilesMigrationBottomSheet) this.f19654b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$445((boolean[]) this.f19654b, view);
                return;
        }
    }
}
