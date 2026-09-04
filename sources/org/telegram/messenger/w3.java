package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class w3 implements View.OnClickListener {
    public final int f19457a;
    public final Object f19458b;

    public w3(Object obj, int i10) {
        this.f19457a = i10;
        this.f19458b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19457a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.m((FilesMigrationService.FilesMigrationBottomSheet) this.f19458b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$445((boolean[]) this.f19458b, view);
                return;
        }
    }
}
