package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.ui.PhotoViewer;
public final class ob8 implements Runnable {
    public final byte a;
    public final PhotoViewer b;

    public ob8(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override
    public final void run() {
        float f;
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2;
        nc8 nc8Var;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer3 = this.b;
                if (photoViewer3.l3 && photoViewer3.P3 && !a.x) {
                    s7 s7Var = this.b.p0;
                    if (s7Var == null || !s7Var.y()) {
                        s7 s7Var2 = this.b.q0;
                        if (s7Var2 == null || !s7Var2.y()) {
                            ic8 ic8Var = this.b.U1;
                            if (ic8Var == null || ic8Var.getScrollY() == 0) {
                                ei1 ei1Var = this.b.Y0;
                                if (ei1Var == null || ei1Var.getVisibility() != 0) {
                                    PhotoViewer photoViewer4 = PhotoViewer.k9;
                                    PhotoViewer photoViewer5 = this.b;
                                    if (photoViewer4 != photoViewer5) {
                                        photoViewer5.t2(false, true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                PhotoViewer photoViewer6 = this.b;
                if (photoViewer6.G2 != null || ((nc8Var = photoViewer6.g0) != null && nc8Var.y)) {
                    if (photoViewer6.s1) {
                        if (!photoViewer6.X7.r) {
                            float l0 = ((float) photoViewer6.l0()) / ((float) this.b.z0());
                            PhotoViewer photoViewer7 = this.b;
                            if (!photoViewer7.G8 && (photoViewer7.t4 != 0 || photoViewer7.W7.getVisibility() == 0)) {
                                int i = (l0 > this.b.X7.getRightProgress() ? 1 : (l0 == this.b.X7.getRightProgress() ? 0 : -1));
                                mb8 mb8Var = this.b.X7;
                                if (i >= 0) {
                                    mb8Var.setProgress(mb8Var.getLeftProgress());
                                    this.b.G2.o0((int) (photoViewer2.X7.getLeftProgress() * ((float) this.b.z0())));
                                    PhotoViewer photoViewer8 = this.b;
                                    photoViewer8.H2 = false;
                                    photoViewer8.m();
                                    PhotoViewer photoViewer9 = this.b;
                                    if (!photoViewer9.r && photoViewer9.d2 != 1 && photoViewer9.t4 == 0 && photoViewer9.n6 <= 0) {
                                        photoViewer9.p1();
                                    } else {
                                        photoViewer9.r1();
                                    }
                                    this.b.f0.invalidate();
                                } else {
                                    mb8Var.setProgress(l0);
                                }
                            } else {
                                PhotoViewer photoViewer10 = this.b;
                                if (photoViewer10.d2 != 1) {
                                    photoViewer10.X7.setProgress(l0);
                                }
                            }
                            this.b.Q2();
                        }
                    } else {
                        float l02 = ((float) photoViewer6.l0()) / ((float) this.b.z0());
                        if (this.b.g5) {
                            f = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.b.S3) >= 500) {
                                PhotoViewer photoViewer11 = this.b;
                                nc8 nc8Var2 = photoViewer11.g0;
                                if (nc8Var2 != null && nc8Var2.y) {
                                    f = nc8Var2.getBufferedPosition();
                                } else if (photoViewer11.Q3) {
                                    xb4 G = xb4.G(photoViewer11.U);
                                    PhotoViewer photoViewer12 = this.b;
                                    float f2 = photoViewer12.a3;
                                    if (f2 == 0.0f) {
                                        f2 = l02;
                                    }
                                    f = G.t(photoViewer12.b5[0], f2);
                                } else {
                                    f = 1.0f;
                                }
                                this.b.S3 = elapsedRealtime;
                            } else {
                                f = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer13 = this.b;
                        if (!photoViewer13.G8 && photoViewer13.W7.getVisibility() == 0) {
                            int i2 = (l02 > this.b.X7.getRightProgress() ? 1 : (l02 == this.b.X7.getRightProgress() ? 0 : -1));
                            PhotoViewer photoViewer14 = this.b;
                            if (i2 >= 0) {
                                photoViewer14.H2 = false;
                                photoViewer14.p1();
                                this.b.q3.h(false, 0.0f);
                                this.b.C1((int) (photoViewer.X7.getLeftProgress() * ((float) this.b.z0())));
                                this.b.f0.invalidate();
                            } else {
                                float leftProgress = l02 - photoViewer14.X7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                l02 = leftProgress / (this.b.X7.getRightProgress() - this.b.X7.getLeftProgress());
                                if (l02 > 1.0f) {
                                    l02 = 1.0f;
                                }
                                this.b.q3.h(false, l02);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.b;
                            if (photoViewer15.a3 == 0.0f) {
                                ob2 ob2Var = photoViewer15.a4;
                                if (ob2Var.rewindCount == 0 || (!ob2Var.rewindByBackSeek && !photoViewer15.c4.rewindByBackSeek)) {
                                    photoViewer15.q3.h(false, l02);
                                }
                            }
                            if (f != -1.0f) {
                                this.b.q3.f(f);
                                this.b.V8 = f;
                            }
                        }
                        this.b.r3.invalidate();
                        if (this.b.b3 != null && l02 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.b;
                            if (elapsedRealtime2 - photoViewer16.d3 >= 1000) {
                                String str = photoViewer16.b3;
                                photoViewer16.d3 = SystemClock.elapsedRealtime();
                                r47 r47Var = this.b.S4;
                                if (r47Var != null) {
                                    r47Var.l3 = Float.valueOf(l02);
                                }
                                Utilities.e.c(new bo6(str, l02, (byte) 1));
                            }
                        }
                        this.b.Q2();
                    }
                }
                zc8 zc8Var = this.b.F2;
                if (zc8Var != null) {
                    int i3 = zc8.r;
                    zc8Var.a();
                }
                PhotoViewer photoViewer17 = this.b;
                if (photoViewer17.P3) {
                    hl.d3(photoViewer17.h4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.b;
                me8 a = fc3.b().a();
                if (a != null && a != photoViewer18.U8) {
                    a.b();
                    hl.d3(this, 250L);
                    return;
                }
                photoViewer18.L3 = false;
                Bitmap bitmap2 = photoViewer18.C3;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    photoViewer18.C3 = null;
                }
                photoViewer18.F3 = true;
                try {
                } catch (Throwable th) {
                    Bitmap bitmap3 = photoViewer18.C3;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        photoViewer18.C3 = null;
                    }
                    cc4.g(th, true);
                }
                if (photoViewer18.E2) {
                    Drawable drawable = photoViewer18.x3.getDrawable();
                    if (drawable instanceof BitmapDrawable) {
                        Bitmap bitmap4 = ((BitmapDrawable) drawable).getBitmap();
                        photoViewer18.C3 = bitmap4;
                        if (bitmap4 != null) {
                            ImageView imageView = photoViewer18.x3;
                            if (imageView != null) {
                                imageView.setVisibility(0);
                                photoViewer18.x3.setImageBitmap(photoViewer18.C3);
                            }
                            bitmap = photoViewer18.C3;
                        }
                    }
                    bitmap = null;
                } else {
                    int width = photoViewer18.C2.getWidth();
                    int height = photoViewer18.C2.getHeight();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    Bitmap a2 = lc1.a(width, height);
                    photoViewer18.C3 = a2;
                    photoViewer18.C2.getBitmap(a2);
                    if (photoViewer18.C3 != null) {
                        ImageView imageView2 = photoViewer18.x3;
                        if (imageView2 != null) {
                            imageView2.setVisibility(0);
                            photoViewer18.x3.setImageBitmap(photoViewer18.C3);
                        }
                        bitmap = photoViewer18.C3;
                    }
                    bitmap = null;
                }
                photoViewer18.J3 = true;
                photoViewer18.V();
                photoViewer18.w3 = photoViewer18.U8.i(photoViewer18.E, bitmap, !photoViewer18.K3);
                photoViewer18.K3 = true;
                if (photoViewer18.E2) {
                    dc8 dc8Var = photoViewer18.z2;
                    if (dc8Var != null) {
                        dc8Var.removeView(photoViewer18.C2);
                        photoViewer18.z2.removeView(photoViewer18.D2);
                    }
                    photoViewer18.G2.y0(null);
                    photoViewer18.G2.z0(null);
                    photoViewer18.G2.g0();
                    photoViewer18.G2.z0(photoViewer18.w3);
                    photoViewer18.q(true);
                    photoViewer18.w3.setVisibility(0);
                    return;
                }
                photoViewer18.C3 = null;
                photoViewer18.G2.z0(null);
                dc8 dc8Var2 = photoViewer18.z2;
                if (dc8Var2 != null) {
                    dc8Var2.removeView(photoViewer18.C2);
                    photoViewer18.z2.removeView(photoViewer18.D2);
                }
                photoViewer18.G2.z0(photoViewer18.w3);
                photoViewer18.F3 = false;
                photoViewer18.q(true);
                return;
        }
    }
}
