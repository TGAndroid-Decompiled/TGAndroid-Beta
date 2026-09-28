package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class w3 implements View.OnClickListener {
    public final int f17998a;
    public final Object f17999b;

    public w3(Object obj, int i10) {
        this.f17998a = i10;
        this.f17999b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f17998a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.m((FilesMigrationService.FilesMigrationBottomSheet) this.f17999b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$445((boolean[]) this.f17999b, view);
                return;
        }
    }
}
