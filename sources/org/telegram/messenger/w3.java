package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class w3 implements View.OnClickListener {
    public final int f17983a;
    public final Object f17984b;

    public w3(Object obj, int i10) {
        this.f17983a = i10;
        this.f17984b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f17983a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.m((FilesMigrationService.FilesMigrationBottomSheet) this.f17984b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$445((boolean[]) this.f17984b, view);
                return;
        }
    }
}
