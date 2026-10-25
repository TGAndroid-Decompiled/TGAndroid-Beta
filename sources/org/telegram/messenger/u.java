package org.telegram.messenger;

import java.io.File;
import org.telegram.messenger.AudioRecorderV2Controller;
public final class u implements Runnable {
    public final int f21373a;
    public final AudioRecorderV2Controller.AnonymousClass2 f21374b;
    public final long f21375c;
    public final AudioRecorderV2Controller.Listener d;
    public final File e;

    public u(AudioRecorderV2Controller.AnonymousClass2 anonymousClass2, long j10, AudioRecorderV2Controller.Listener listener, File file, int i10) {
        this.f21373a = i10;
        this.f21374b = anonymousClass2;
        this.f21375c = j10;
        this.d = listener;
        this.e = file;
    }

    @Override
    public final void run() {
        switch (this.f21373a) {
            case 0:
                AudioRecorderV2Controller.AnonymousClass2.a(this.f21374b, this.f21375c, this.d, this.e);
                return;
            default:
                AudioRecorderV2Controller.AnonymousClass2.b(this.f21374b, this.f21375c, this.d, this.e);
                return;
        }
    }
}
