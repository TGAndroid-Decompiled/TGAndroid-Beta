package org.telegram.messenger;

import java.io.File;
import org.telegram.messenger.AudioRecorderV2Controller;
public final class s implements Runnable {
    public final int f18340a;
    public final AudioRecorderV2Controller.AnonymousClass2 f18341b;
    public final long f18342c;
    public final AudioRecorderV2Controller.Listener d;
    public final File e;

    public s(AudioRecorderV2Controller.AnonymousClass2 anonymousClass2, long j10, AudioRecorderV2Controller.Listener listener, File file, int i10) {
        this.f18340a = i10;
        this.f18341b = anonymousClass2;
        this.f18342c = j10;
        this.d = listener;
        this.e = file;
    }

    @Override
    public final void run() {
        switch (this.f18340a) {
            case 0:
                AudioRecorderV2Controller.AnonymousClass2.a(this.f18341b, this.f18342c, this.d, this.e);
                return;
            default:
                AudioRecorderV2Controller.AnonymousClass2.b(this.f18341b, this.f18342c, this.d, this.e);
                return;
        }
    }
}
