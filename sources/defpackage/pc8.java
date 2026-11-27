package defpackage;

import android.media.MediaExtractor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.PhotoViewer;
public final class pc8 implements Runnable {
    public final String a;
    public final long b;
    public final int c;
    public final PhotoViewer d;

    public pc8(PhotoViewer photoViewer, String str, long j, int i) {
        this.d = photoViewer;
        this.a = str;
        this.b = j;
        this.c = i;
    }

    @Override
    public final void run() {
        boolean z;
        boolean z2;
        if (this.d.C8 == this) {
            int C = MediaController.C(this.a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.a, iArr, this.b);
            boolean z3 = false;
            if (iArr[10] != 0) {
                z = true;
            } else {
                z = false;
            }
            PhotoViewer photoViewer = this.d;
            if (iArr[0] != 0 && (!z || iArr[9] != 0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            photoViewer.p8 = z2;
            PhotoViewer photoViewer2 = this.d;
            if (C == -1) {
                C = iArr[3];
            }
            photoViewer2.l8 = C;
            photoViewer2.m8 = C;
            if (this.d.p8) {
                PhotoViewer photoViewer3 = this.d;
                int i = iArr[1];
                photoViewer3.h8 = i;
                photoViewer3.j8 = i;
                PhotoViewer photoViewer4 = this.d;
                int i2 = iArr[2];
                photoViewer4.i8 = i2;
                photoViewer4.k8 = i2;
                PhotoViewer photoViewer5 = this.d;
                int max = Math.max(photoViewer5.h8, this.d.i8);
                if (max > 1280) {
                    photoViewer5.e8 = 4;
                } else if (max > 854) {
                    photoViewer5.e8 = 3;
                } else if (max > 640) {
                    photoViewer5.e8 = 2;
                } else {
                    photoViewer5.e8 = 1;
                }
                PhotoViewer photoViewer6 = this.d;
                int i3 = this.c;
                if (i3 == -1) {
                    i3 = photoViewer6.E1();
                }
                photoViewer6.d8 = i3;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.l8 != 0 && photoViewer7.d2 != 1) {
                    Size h = photoViewer7.h();
                    if (h.getWidth() == photoViewer7.h8 && h.getHeight() == photoViewer7.i8) {
                        MediaController.s(h.getWidth(), h.getHeight(), photoViewer7.m8, false);
                    } else {
                        MediaController.s(h.getWidth(), h.getHeight(), MediaController.T(photoViewer7.i8, photoViewer7.h8, photoViewer7.m8, h.getHeight(), h.getWidth()), false);
                    }
                }
                PhotoViewer photoViewer8 = this.d;
                String str = this.a;
                MediaExtractor mediaExtractor = new MediaExtractor();
                try {
                    try {
                        mediaExtractor.setDataSource(str);
                        int t = MediaController.t(mediaExtractor, false);
                        if (t >= 0) {
                            if (mediaExtractor.getTrackFormat(t).getString("mime").equals("video/avc")) {
                                z3 = true;
                            }
                        }
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                    mediaExtractor.release();
                    photoViewer8.q8 = z3;
                } catch (Throwable th) {
                    mediaExtractor.release();
                    throw th;
                }
            }
            if (this.d.C8 != this) {
                return;
            }
            hl.c3(new sa8(this, this, iArr, (byte) 1));
        }
    }
}
