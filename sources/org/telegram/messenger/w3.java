package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class w3 implements View.OnClickListener {
    public final int f17740a;
    public final Object f17741b;

    public w3(Object obj, int i10) {
        this.f17740a = i10;
        this.f17741b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f17740a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.m((FilesMigrationService.FilesMigrationBottomSheet) this.f17741b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$445((boolean[]) this.f17741b, view);
                return;
        }
    }
}
