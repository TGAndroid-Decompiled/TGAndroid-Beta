package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class a4 implements View.OnClickListener {
    public final int f16437a;
    public final Object f16438b;

    public a4(Object obj, int i10) {
        this.f16437a = i10;
        this.f16438b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f16437a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.n((FilesMigrationService.FilesMigrationBottomSheet) this.f16438b, view);
                return;
            default:
                MessagesController.L4((boolean[]) this.f16438b, view);
                return;
        }
    }
}
