package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class b4 implements View.OnClickListener {
    public final int f17990a;
    public final Object f17991b;

    public b4(Object obj, int i10) {
        this.f17990a = i10;
        this.f17991b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f17990a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.m((FilesMigrationService.FilesMigrationBottomSheet) this.f17991b, view);
                return;
            default:
                MessagesController.L4((boolean[]) this.f17991b, view);
                return;
        }
    }
}
