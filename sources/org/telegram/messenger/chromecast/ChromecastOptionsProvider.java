package org.telegram.messenger.chromecast;

import android.content.Context;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.OptionsProvider;
import com.google.android.gms.cast.framework.SessionProvider;
import java.util.List;

public class ChromecastOptionsProvider implements OptionsProvider {
    private static final CastOptions castOptions = new CastOptions.Builder().setReceiverApplicationId("CC1AD845").build();

    @Override
    public List<SessionProvider> getAdditionalSessionProviders(Context context) {
        return null;
    }

    @Override
    public CastOptions getCastOptions(Context context) {
        return castOptions;
    }
}
