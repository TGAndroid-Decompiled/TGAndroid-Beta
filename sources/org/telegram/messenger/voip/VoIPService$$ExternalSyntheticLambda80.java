package org.telegram.messenger.voip;

import android.widget.EditText;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.SharedMediaLayout;

public final class VoIPService$$ExternalSyntheticLambda80 implements RequestDelegateTimestamp, AlertDialog.OnButtonClickListener, MessagesStorage.StringCallback {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final long f$2;

    public VoIPService$$ExternalSyntheticLambda80(Object obj, int i, long j, int i2) {
        this.$r8$classId = i2;
        this.f$2 = j;
        this.f$1 = i;
        this.f$0 = obj;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                AlertsCreator.lambda$createChangeBioAlert$87(this.f$2, this.f$1, (EditText) this.f$0, alertDialog, i);
                break;
            default:
                AlertsCreator.lambda$createColorSelectDialog$204(this.f$2, this.f$1, (Runnable) this.f$0, alertDialog, i);
                break;
        }
    }

    @Override
    public void run(String str) {
        ((SharedMediaLayout) this.f$0).lambda$openRenameStoriesAlbumAlert$70(this.f$2, this.f$1, str);
    }

    public VoIPService$$ExternalSyntheticLambda80(VoIPService voIPService, int i, long j) {
        this.$r8$classId = 0;
        this.f$0 = voIPService;
        this.f$1 = i;
        this.f$2 = j;
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j) {
        ((VoIPService) this.f$0).lambda$createGroupInstance$78(this.f$1, this.f$2, tLObject, tL_error, j);
    }

    public VoIPService$$ExternalSyntheticLambda80(SharedMediaLayout sharedMediaLayout, long j, int i) {
        this.$r8$classId = 3;
        this.f$0 = sharedMediaLayout;
        this.f$2 = j;
        this.f$1 = i;
    }
}
