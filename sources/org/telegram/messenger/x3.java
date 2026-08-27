package org.telegram.messenger;

import android.view.View;

public final class x3 implements View.OnClickListener {

    public final int f22098a;

    public final Object f22099b;

    public x3(Object obj, int i10) {
        this.f22098a = i10;
        this.f22099b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22098a) {
            case 0:
                ((FilesMigrationService.FilesMigrationBottomSheet) this.f22099b).lambda$new$0(view);
                break;
            default:
                MessagesController.lambda$checkSensitive$445((boolean[]) this.f22099b, view);
                break;
        }
    }
}
