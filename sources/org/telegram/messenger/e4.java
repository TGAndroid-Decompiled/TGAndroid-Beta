package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class e4 implements View.OnClickListener {
    public final int f19957a;
    public final Object f19958b;

    public e4(Object obj, int i10) {
        this.f19957a = i10;
        this.f19958b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19957a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.m((FilesMigrationService.FilesMigrationBottomSheet) this.f19958b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$451((boolean[]) this.f19958b, view);
                return;
        }
    }
}
