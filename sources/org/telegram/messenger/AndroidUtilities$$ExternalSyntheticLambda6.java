package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;

public final class AndroidUtilities$$ExternalSyntheticLambda6 implements OnSuccessListener {
    public static final AndroidUtilities$$ExternalSyntheticLambda6 INSTANCE = new AndroidUtilities$$ExternalSyntheticLambda6();

    private AndroidUtilities$$ExternalSyntheticLambda6() {
    }

    @Override
    public final void onSuccess(Object obj) {
        AndroidUtilities.lambda$setWaitingForSms$5((Void) obj);
    }
}
