package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class v3 implements View.OnClickListener {
    public final int f19198a;
    public final Object f19199b;

    public v3(Object obj, int i10) {
        this.f19198a = i10;
        this.f19199b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19198a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.m((FilesMigrationService.FilesMigrationBottomSheet) this.f19199b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$445((boolean[]) this.f19199b, view);
                return;
        }
    }
}
