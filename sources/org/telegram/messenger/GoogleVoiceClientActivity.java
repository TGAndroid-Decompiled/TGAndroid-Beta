package org.telegram.messenger;

import com.google.android.search.verification.client.SearchActionVerificationClientActivity;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

public class GoogleVoiceClientActivity extends SearchActionVerificationClientActivity {
    @Override
    public Class<? extends SearchActionVerificationClientService> getServiceClass() {
        return GoogleVoiceClientService.class;
    }
}
