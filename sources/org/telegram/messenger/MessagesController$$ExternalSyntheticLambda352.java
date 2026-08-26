package org.telegram.messenger;

import android.view.View;

public final class MessagesController$$ExternalSyntheticLambda352 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public MessagesController$$ExternalSyntheticLambda352(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                MessagesController.lambda$checkSensitive$445((boolean[]) this.f$0, view);
                break;
            default:
                ((FilesMigrationService.FilesMigrationBottomSheet) this.f$0).lambda$new$0(view);
                break;
        }
    }
}
