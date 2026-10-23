package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class b4 implements View.OnClickListener {
    public final int f17926a;
    public final Object f17927b;

    public b4(Object obj, int i10) {
        this.f17926a = i10;
        this.f17927b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f17926a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.n((FilesMigrationService.FilesMigrationBottomSheet) this.f17927b, view);
                return;
            default:
                MessagesController.L4((boolean[]) this.f17927b, view);
                return;
        }
    }
}
