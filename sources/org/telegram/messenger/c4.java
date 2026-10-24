package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class c4 implements View.OnClickListener {
    public final int f18068a;
    public final Object f18069b;

    public c4(Object obj, int i10) {
        this.f18068a = i10;
        this.f18069b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f18068a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.m((FilesMigrationService.FilesMigrationBottomSheet) this.f18069b, view);
                return;
            default:
                MessagesController.L4((boolean[]) this.f18069b, view);
                return;
        }
    }
}
