package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;

public final class AndroidUtilities$$ExternalSyntheticLambda7 implements OnSuccessListener {
    public static final AndroidUtilities$$ExternalSyntheticLambda7 INSTANCE = new AndroidUtilities$$ExternalSyntheticLambda7();

    private AndroidUtilities$$ExternalSyntheticLambda7() {
    }

    @Override
    public final void onSuccess(Object obj) {
        AndroidUtilities.lambda$setWaitingForSms$5((Void) obj);
    }
}
