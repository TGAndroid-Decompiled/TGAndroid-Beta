package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class w3 implements View.OnClickListener {
    public final int f17999a;
    public final Object f18000b;

    public w3(Object obj, int i10) {
        this.f17999a = i10;
        this.f18000b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f17999a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.m((FilesMigrationService.FilesMigrationBottomSheet) this.f18000b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$445((boolean[]) this.f18000b, view);
                return;
        }
    }
}
