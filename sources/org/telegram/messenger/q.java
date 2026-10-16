package org.telegram.messenger;

import java.io.File;
import org.telegram.messenger.AudioRecorderV2Controller;
public final class q implements Runnable {
    public final int f17845a;
    public final AudioRecorderV2Controller.AnonymousClass2 f17846b;
    public final long f17847c;
    public final AudioRecorderV2Controller.Listener d;
    public final File e;

    public q(AudioRecorderV2Controller.AnonymousClass2 anonymousClass2, long j10, AudioRecorderV2Controller.Listener listener, File file, int i10) {
        this.f17845a = i10;
        this.f17846b = anonymousClass2;
        this.f17847c = j10;
        this.d = listener;
        this.e = file;
    }

    @Override
    public final void run() {
        switch (this.f17845a) {
            case 0:
                AudioRecorderV2Controller.AnonymousClass2.a(this.f17846b, this.f17847c, this.d, this.e);
                return;
            default:
                AudioRecorderV2Controller.AnonymousClass2.b(this.f17846b, this.f17847c, this.d, this.e);
                return;
        }
    }
}
