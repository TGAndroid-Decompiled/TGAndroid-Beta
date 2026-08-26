package org.telegram.messenger.chromecast;

import android.content.Context;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.OptionsProvider;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.internal.cast.zzai;
import java.util.ArrayList;
import java.util.List;

public class ChromecastOptionsProvider implements OptionsProvider {
    public static final CastOptions castOptions;

    static {
        ArrayList arrayList = new ArrayList();
        LaunchOptions launchOptions = new LaunchOptions();
        ArrayList arrayList2 = new ArrayList();
        CastMediaOptions castMediaOptions = CastOptions.zzc;
        if (castMediaOptions == null) {
            throw new NullPointerException("use Optional.orNull() instead of Optional.or(null)");
        }
        castOptions = new CastOptions("CC1AD845", arrayList, false, launchOptions, true, castMediaOptions, true, 0.05000000074505806d, false, false, false, arrayList2, true, false, CastOptions.zza, CastOptions.zzb);
    }

    @Override
    public List<zzai> getAdditionalSessionProviders(Context context) {
        return null;
    }

    @Override
    public CastOptions getCastOptions(Context context) {
        return castOptions;
    }
}
