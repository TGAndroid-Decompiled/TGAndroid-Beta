package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class c4 implements View.OnClickListener {
    public final int f18004a;
    public final Object f18005b;

    public c4(Object obj, int i10) {
        this.f18004a = i10;
        this.f18005b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f18004a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.n((FilesMigrationService.FilesMigrationBottomSheet) this.f18005b, view);
                return;
            default:
                MessagesController.L4((boolean[]) this.f18005b, view);
                return;
        }
    }
}
