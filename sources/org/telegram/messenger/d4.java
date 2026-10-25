package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class d4 implements View.OnClickListener {
    public final int f19869a;
    public final Object f19870b;

    public d4(Object obj, int i10) {
        this.f19869a = i10;
        this.f19870b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19869a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.m((FilesMigrationService.FilesMigrationBottomSheet) this.f19870b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$450((boolean[]) this.f19870b, view);
                return;
        }
    }
}
