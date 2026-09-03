package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class x3 implements View.OnClickListener {
    public final int f20594a;
    public final Object f20595b;

    public x3(Object obj, int i10) {
        this.f20594a = i10;
        this.f20595b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20594a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.m((FilesMigrationService.FilesMigrationBottomSheet) this.f20595b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$445((boolean[]) this.f20595b, view);
                return;
        }
    }
}
