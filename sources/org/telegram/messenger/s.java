package org.telegram.messenger;

import java.io.File;
import org.telegram.messenger.AudioRecorderV2Controller;
public final class s implements Runnable {
    public final int f18824a;
    public final AudioRecorderV2Controller.AnonymousClass2 f18825b;
    public final long f18826c;
    public final AudioRecorderV2Controller.Listener d;
    public final File f18827e;

    public s(AudioRecorderV2Controller.AnonymousClass2 anonymousClass2, long j3, AudioRecorderV2Controller.Listener listener, File file, int i10) {
        this.f18824a = i10;
        this.f18825b = anonymousClass2;
        this.f18826c = j3;
        this.d = listener;
        this.f18827e = file;
    }

    @Override
    public final void run() {
        switch (this.f18824a) {
            case 0:
                AudioRecorderV2Controller.AnonymousClass2.a(this.f18825b, this.f18826c, this.d, this.f18827e);
                return;
            default:
                AudioRecorderV2Controller.AnonymousClass2.b(this.f18825b, this.f18826c, this.d, this.f18827e);
                return;
        }
    }
}
