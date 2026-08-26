package org.telegram.messenger.video.remix;

import com.android.billingclient.api.zzcs;
import com.google.android.gms.dynamite.zzk;
import com.stripe.android.time.Clock;
import java.nio.ShortBuffer;
import org.telegram.ui.iv.RichMediaCell;

public interface AudioRemixer {
    public static final zzcs DOWNMIX = new zzcs(23);
    public static final Clock UPMIX = new Clock(23);
    public static final zzk PASSTHROUGH = new zzk(23);
    public static final RichMediaCell.AnonymousClass2 SURROUND = new RichMediaCell.AnonymousClass2(24);

    int getRemixedSize(int i, int i2, int i3);

    void remix(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2);
}
