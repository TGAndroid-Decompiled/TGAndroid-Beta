package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VideoCapturerDevice;
public final class a implements Runnable {
    public final byte a;

    public a(byte b) {
        this.a = b;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                VideoCapturerDevice.AnonymousClass1.lambda$onStop$0();
                return;
            default:
                VideoCapturerDevice.AnonymousClass2.lambda$onFirstFrameAvailable$0();
                return;
        }
    }
}
