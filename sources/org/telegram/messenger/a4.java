package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class a4 implements View.OnClickListener {
    public final int f17835a;
    public final Object f17836b;

    public a4(Object obj, int i10) {
        this.f17835a = i10;
        this.f17836b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f17835a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.n((FilesMigrationService.FilesMigrationBottomSheet) this.f17836b, view);
                return;
            default:
                MessagesController.L4((boolean[]) this.f17836b, view);
                return;
        }
    }
}
