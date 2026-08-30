package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class x3 implements View.OnClickListener {
    public final int f18945a;
    public final Object f18946b;

    public x3(Object obj, int i10) {
        this.f18945a = i10;
        this.f18946b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f18945a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.m((FilesMigrationService.FilesMigrationBottomSheet) this.f18946b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$445((boolean[]) this.f18946b, view);
                return;
        }
    }
}
