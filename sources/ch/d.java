package ch;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
public final class d extends bh.h {
    public final MediaController.PhotoEntry f3489b;
    public final SendMessagesHelper.SendingMediaInfo f3490c;

    public d(org.telegram.messenger.SendMessagesHelper.SendingMediaInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: ch.d.<init>(org.telegram.messenger.SendMessagesHelper$SendingMediaInfo):void");
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.f2668a;
        imageReceiver.setImageCoords(0.0f, 0.0f, i10, i11);
        imageReceiver.draw(canvas);
    }
}
