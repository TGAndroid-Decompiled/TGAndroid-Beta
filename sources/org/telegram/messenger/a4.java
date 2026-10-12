package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class a4 implements View.OnClickListener {
    public final int f16743a;
    public final Object f16744b;

    public a4(Object obj, int i10) {
        this.f16743a = i10;
        this.f16744b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f16743a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.n((FilesMigrationService.FilesMigrationBottomSheet) this.f16744b, view);
                return;
            default:
                MessagesController.L4((boolean[]) this.f16744b, view);
                return;
        }
    }
}
