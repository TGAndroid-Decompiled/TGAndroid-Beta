package org.telegram.messenger;

import java.io.File;
import org.telegram.messenger.AudioRecorderV2Controller;
public final class u implements Runnable {
    public final int f21358a;
    public final AudioRecorderV2Controller.AnonymousClass2 f21359b;
    public final long f21360c;
    public final AudioRecorderV2Controller.Listener d;
    public final File e;

    public u(AudioRecorderV2Controller.AnonymousClass2 anonymousClass2, long j10, AudioRecorderV2Controller.Listener listener, File file, int i10) {
        this.f21358a = i10;
        this.f21359b = anonymousClass2;
        this.f21360c = j10;
        this.d = listener;
        this.e = file;
    }

    @Override
    public final void run() {
        switch (this.f21358a) {
            case 0:
                AudioRecorderV2Controller.AnonymousClass2.a(this.f21359b, this.f21360c, this.d, this.e);
                return;
            default:
                AudioRecorderV2Controller.AnonymousClass2.b(this.f21359b, this.f21360c, this.d, this.e);
                return;
        }
    }
}
