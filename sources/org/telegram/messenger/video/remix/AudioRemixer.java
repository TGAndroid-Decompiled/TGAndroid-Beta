package org.telegram.messenger.video.remix;

import com.google.android.gms.dynamite.zzf;
import com.stripe.android.time.Clock;
import java.nio.ShortBuffer;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.iv.RichEditor;

public interface AudioRemixer {
    public static final zzf DOWNMIX = new zzf(22);
    public static final Clock UPMIX = new Clock(23);
    public static final RichEditor.AnonymousClass12 PASSTHROUGH = new RichEditor.AnonymousClass12(24);
    public static final ChatActivity.AnonymousClass40 SURROUND = new ChatActivity.AnonymousClass40(24);

    int getRemixedSize(int i, int i2, int i3);

    void remix(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2);
}
