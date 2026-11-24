package defpackage;

import android.media.MediaExtractor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.PhotoViewer;
public final class z88 implements Runnable {
    public final String a;
    public final long b;
    public final int c;
    public final PhotoViewer d;

    public z88(PhotoViewer photoViewer, String str, long j, int i) {
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
            int z3 = MediaController.z(this.a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.a, iArr, this.b);
            boolean z4 = false;
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
            if (z3 == -1) {
                z3 = iArr[3];
            }
            photoViewer2.l8 = z3;
            photoViewer2.m8 = z3;
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
                    Size i4 = photoViewer7.i();
                    if (i4.getWidth() == photoViewer7.h8 && i4.getHeight() == photoViewer7.i8) {
                        MediaController.q(i4.getWidth(), i4.getHeight(), photoViewer7.m8, false);
                    } else {
                        MediaController.q(i4.getWidth(), i4.getHeight(), MediaController.P(photoViewer7.i8, photoViewer7.h8, photoViewer7.m8, i4.getHeight(), i4.getWidth()), false);
                    }
                }
                PhotoViewer photoViewer8 = this.d;
                String str = this.a;
                MediaExtractor mediaExtractor = new MediaExtractor();
                try {
                    try {
                        mediaExtractor.setDataSource(str);
                        int r = MediaController.r(mediaExtractor, false);
                        if (r >= 0) {
                            if (mediaExtractor.getTrackFormat(r).getString("mime").equals("video/avc")) {
                                z4 = true;
                            }
                        }
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                    mediaExtractor.release();
                    photoViewer8.q8 = z4;
                } catch (Throwable th) {
                    mediaExtractor.release();
                    throw th;
                }
            }
            if (this.d.C8 != this) {
                return;
            }
            gl.c3(new pc7(this, this, iArr, (byte) 23));
        }
    }
}
