package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class b4 implements View.OnClickListener {
    public final int f14753a;
    public final Object f14754b;

    public b4(Object obj, int i10) {
        this.f14753a = i10;
        this.f14754b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f14753a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.m((FilesMigrationService.FilesMigrationBottomSheet) this.f14754b, view);
                return;
            default:
                MessagesController.r0((boolean[]) this.f14754b, view);
                return;
        }
    }
}
