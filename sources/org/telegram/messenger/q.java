package org.telegram.messenger;

import java.io.File;
import org.telegram.messenger.AudioRecorderV2Controller;
public final class q implements Runnable {
    public final int f19307a;
    public final AudioRecorderV2Controller.AnonymousClass2 f19308b;
    public final long f19309c;
    public final AudioRecorderV2Controller.Listener d;
    public final File e;

    public q(AudioRecorderV2Controller.AnonymousClass2 anonymousClass2, long j10, AudioRecorderV2Controller.Listener listener, File file, int i10) {
        this.f19307a = i10;
        this.f19308b = anonymousClass2;
        this.f19309c = j10;
        this.d = listener;
        this.e = file;
    }

    @Override
    public final void run() {
        switch (this.f19307a) {
            case 0:
                AudioRecorderV2Controller.AnonymousClass2.a(this.f19308b, this.f19309c, this.d, this.e);
                return;
            default:
                AudioRecorderV2Controller.AnonymousClass2.b(this.f19308b, this.f19309c, this.d, this.e);
                return;
        }
    }
}
