package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class x3 implements View.OnClickListener {
    public final int f20592a;
    public final Object f20593b;

    public x3(Object obj, int i10) {
        this.f20592a = i10;
        this.f20593b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20592a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.m((FilesMigrationService.FilesMigrationBottomSheet) this.f20593b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$445((boolean[]) this.f20593b, view);
                return;
        }
    }
}
