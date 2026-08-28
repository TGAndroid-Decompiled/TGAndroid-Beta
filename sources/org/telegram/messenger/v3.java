package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class v3 implements View.OnClickListener {
    public final int f21721a;
    public final Object f21722b;

    public v3(Object obj, int i9) {
        this.f21721a = i9;
        this.f21722b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21721a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.m((FilesMigrationService.FilesMigrationBottomSheet) this.f21722b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$445((boolean[]) this.f21722b, view);
                return;
        }
    }
}
