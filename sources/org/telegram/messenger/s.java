package org.telegram.messenger;

import java.io.File;
import org.telegram.messenger.AudioRecorderV2Controller;
public final class s implements Runnable {
    public final int f19453a;
    public final AudioRecorderV2Controller.AnonymousClass2 f19454b;
    public final long f19455c;
    public final AudioRecorderV2Controller.Listener d;
    public final File e;

    public s(AudioRecorderV2Controller.AnonymousClass2 anonymousClass2, long j10, AudioRecorderV2Controller.Listener listener, File file, int i10) {
        this.f19453a = i10;
        this.f19454b = anonymousClass2;
        this.f19455c = j10;
        this.d = listener;
        this.e = file;
    }

    @Override
    public final void run() {
        switch (this.f19453a) {
            case 0:
                AudioRecorderV2Controller.AnonymousClass2.a(this.f19454b, this.f19455c, this.d, this.e);
                return;
            default:
                AudioRecorderV2Controller.AnonymousClass2.b(this.f19454b, this.f19455c, this.d, this.e);
                return;
        }
    }
}
