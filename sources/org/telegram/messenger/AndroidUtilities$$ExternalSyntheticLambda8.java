package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
public final class AndroidUtilities$$ExternalSyntheticLambda8 implements OnSuccessListener {
    public static final AndroidUtilities$$ExternalSyntheticLambda8 INSTANCE = new AndroidUtilities$$ExternalSyntheticLambda8();

    private AndroidUtilities$$ExternalSyntheticLambda8() {
    }

    @Override
    public final void onSuccess(Object obj) {
        AndroidUtilities.lambda$setWaitingForSms$6((Void) obj);
    }
}
