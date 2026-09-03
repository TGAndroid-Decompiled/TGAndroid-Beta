package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class x3 implements View.OnClickListener {
    public final int f18930a;
    public final Object f18931b;

    public x3(Object obj, int i10) {
        this.f18930a = i10;
        this.f18931b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f18930a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.m((FilesMigrationService.FilesMigrationBottomSheet) this.f18931b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$445((boolean[]) this.f18931b, view);
                return;
        }
    }
}
