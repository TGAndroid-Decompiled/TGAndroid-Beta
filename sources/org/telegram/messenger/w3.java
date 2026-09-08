package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class w3 implements View.OnClickListener {
    public final int f19484a;
    public final Object f19485b;

    public w3(Object obj, int i10) {
        this.f19484a = i10;
        this.f19485b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19484a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.m((FilesMigrationService.FilesMigrationBottomSheet) this.f19485b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$445((boolean[]) this.f19485b, view);
                return;
        }
    }
}
