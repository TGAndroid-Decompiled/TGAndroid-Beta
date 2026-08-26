package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.ui.ActionBar.AlertDialog;

public final class SharedConfig$$ExternalSyntheticLambda5 implements GenericProvider, OnSuccessListener, AlertDialog.OnButtonClickListener, Vector.TLDeserializer {
    public final int $r8$classId;

    public SharedConfig$$ExternalSyntheticLambda5(int i) {
        this.$r8$classId = i;
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.$r8$classId) {
            case 9:
                return TLRPC.Peer.TLdeserialize(inputSerializedData, i, z);
            case 10:
                return TL_account.WebBrowserSettings.TLdeserialize(inputSerializedData, i, z);
            case 11:
                return TLRPC.MessageEntity.TLdeserialize(inputSerializedData, i, z);
            case 12:
                return TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, i, z);
            default:
                return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i, z);
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                SharedConfig.lambda$checkSdCard$1(alertDialog, i);
                break;
            default:
                alertDialog.dismiss();
                break;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        AndroidUtilities.lambda$setWaitingForSms$12((Void) obj);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.$r8$classId) {
            case 1:
                return AndroidUtilities.lambda$formatSpannable$16((Integer) obj);
            case 2:
            case 4:
            default:
                return MediaDataController.lambda$getEntities$184((Void) obj);
            case 3:
                return AndroidUtilities.lambda$formatSpannableSimple$15((Integer) obj);
            case 5:
                return MediaDataController.lambda$getEntities$181((Void) obj);
            case 6:
                return MediaDataController.lambda$getEntities$182((Void) obj);
            case 7:
                return MediaDataController.lambda$getEntities$183((Void) obj);
        }
    }
}
