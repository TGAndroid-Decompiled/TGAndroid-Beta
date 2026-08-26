package org.telegram.messenger.video.resample;

import com.google.android.gms.dynamite.zzf;
import java.nio.ShortBuffer;
import org.telegram.ui.iv.RichEditor;

public interface AudioResampler {
    public static final zzf DOWNSAMPLE = new zzf(23);
    public static final RichEditor.AnonymousClass12 UPSAMPLE = new RichEditor.AnonymousClass12(25);

    void resample(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3);
}
