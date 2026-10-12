package org.telegram.messenger;

import java.io.File;
import org.telegram.messenger.AudioRecorderV2Controller;
public final class s implements Runnable {
    public final int f18825a;
    public final AudioRecorderV2Controller.AnonymousClass2 f18826b;
    public final long f18827c;
    public final AudioRecorderV2Controller.Listener d;
    public final File f18828e;

    public s(AudioRecorderV2Controller.AnonymousClass2 anonymousClass2, long j3, AudioRecorderV2Controller.Listener listener, File file, int i10) {
        this.f18825a = i10;
        this.f18826b = anonymousClass2;
        this.f18827c = j3;
        this.d = listener;
        this.f18828e = file;
    }

    @Override
    public final void run() {
        switch (this.f18825a) {
            case 0:
                AudioRecorderV2Controller.AnonymousClass2.a(this.f18826b, this.f18827c, this.d, this.f18828e);
                return;
            default:
                AudioRecorderV2Controller.AnonymousClass2.b(this.f18826b, this.f18827c, this.d, this.f18828e);
                return;
        }
    }
}
