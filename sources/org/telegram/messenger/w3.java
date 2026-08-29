package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class w3 implements View.OnClickListener {
    public final int f22050a;
    public final Object f22051b;

    public w3(Object obj, int i10) {
        this.f22050a = i10;
        this.f22051b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22050a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.m((FilesMigrationService.FilesMigrationBottomSheet) this.f22051b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$445((boolean[]) this.f22051b, view);
                return;
        }
    }
}
