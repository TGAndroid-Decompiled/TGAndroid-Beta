package org.telegram.messenger;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

public class GoogleVoiceClientService extends SearchActionVerificationClientService {
    @Override
    public void performAction(Intent intent, boolean z, Bundle bundle) {
        AndroidUtilities.googleVoiceClientService_performAction(intent, z, bundle);
    }
}
