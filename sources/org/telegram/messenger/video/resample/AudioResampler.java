package org.telegram.messenger.video.resample;

import com.android.billingclient.api.zzcs;
import com.google.android.gms.dynamite.zzk;
import java.nio.ShortBuffer;

public interface AudioResampler {
    public static final zzcs DOWNSAMPLE = new zzcs(24);
    public static final zzk UPSAMPLE = new zzk(24);

    void resample(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3);
}
