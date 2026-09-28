package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class w3 implements View.OnClickListener {
    public final int f17997a;
    public final Object f17998b;

    public w3(Object obj, int i10) {
        this.f17997a = i10;
        this.f17998b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f17997a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.m((FilesMigrationService.FilesMigrationBottomSheet) this.f17998b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$445((boolean[]) this.f17998b, view);
                return;
        }
    }
}
