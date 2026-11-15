package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
public final class ec implements Runnable {
    public final File f23284a;
    public final int f23285b;
    public final dc f23286c;
    public final fc d;

    public ec(fc fcVar, int i7, File file, dc dcVar) {
        this.d = fcVar;
        this.f23285b = i7;
        this.f23284a = file;
        this.f23286c = dcVar;
    }

    public final void a() {
        this.d.f23476s.c(new x4(20, this, w7.r(null, this.f23286c.f23054a)));
    }

    @Override
    public final void run() {
        int min;
        int i7;
        Bitmap createScaledBitmap;
        File file = this.f23284a;
        dc dcVar = this.f23286c;
        try {
            String str = "q_" + dcVar.f23054a.dc_id + "_" + dcVar.f23054a.f28057id;
            File file2 = new File(w7.z(4), str + ".jpg");
            if (!file2.exists() && file.exists()) {
                if (dcVar.f23057e) {
                    Point point = g0.f23609q;
                    min = Math.max(point.x, point.y);
                } else {
                    Point point2 = g0.f23609q;
                    min = Math.min(180, Math.min(point2.x, point2.y) / 4);
                }
                int i10 = this.f23285b;
                Bitmap bitmap = null;
                if (i10 == 0) {
                    String file3 = file.toString();
                    float f10 = min;
                    bitmap = fc.K(file3, null, f10, f10, false);
                } else {
                    int i11 = 2;
                    if (i10 == 2) {
                        String file4 = file.toString();
                        if (!dcVar.f23057e) {
                            i11 = 1;
                        }
                        bitmap = ez.r(i11, file4);
                    } else if (i10 == 3) {
                        String lowerCase = file.toString().toLowerCase();
                        if (lowerCase.endsWith("mp4")) {
                            String file5 = file.toString();
                            if (!dcVar.f23057e) {
                                i11 = 1;
                            }
                            bitmap = ez.r(i11, file5);
                        } else if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                            float f11 = min;
                            bitmap = fc.K(lowerCase, null, f11, f11, false);
                        }
                    }
                }
                if (bitmap == null) {
                    a();
                    return;
                }
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (width != 0 && height != 0) {
                    float f12 = width;
                    float f13 = min;
                    float f14 = height;
                    float min2 = Math.min(f12 / f13, f14 / f13);
                    if (min2 > 1.0f && (createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (f12 / min2), (int) (f14 / min2), true)) != bitmap) {
                        bitmap.recycle();
                        bitmap = createScaledBitmap;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (dcVar.f23057e) {
                        i7 = 83;
                    } else {
                        i7 = 60;
                    }
                    bitmap.compress(compressFormat, i7, fileOutputStream);
                    try {
                        fileOutputStream.close();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    g0.h3(new jn(this, str, new ArrayList(dcVar.f23056c), new BitmapDrawable(bitmap), new ArrayList(dcVar.d), 4));
                    return;
                }
                a();
                return;
            }
            a();
        } catch (Throwable th2) {
            a8.g(th2, true);
            a();
        }
    }
}
