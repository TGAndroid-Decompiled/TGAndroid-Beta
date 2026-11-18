package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
public final class dc implements Runnable {
    public final File f23506a;
    public final int f23507b;
    public final cc f23508c;
    public final ec d;

    public dc(ec ecVar, int i7, File file, cc ccVar) {
        this.d = ecVar;
        this.f23507b = i7;
        this.f23506a = file;
        this.f23508c = ccVar;
    }

    public final void a() {
        this.d.f23692s.c(new z4(20, this, w7.r(null, this.f23508c.f23324a)));
    }

    @Override
    public final void run() {
        int min;
        int i7;
        Bitmap createScaledBitmap;
        File file = this.f23506a;
        cc ccVar = this.f23508c;
        try {
            String str = "q_" + ccVar.f23324a.dc_id + "_" + ccVar.f23324a.f28409id;
            File file2 = new File(w7.z(4), str + ".jpg");
            if (!file2.exists() && file.exists()) {
                if (ccVar.f23327e) {
                    Point point = g0.f24118q;
                    min = Math.max(point.x, point.y);
                } else {
                    Point point2 = g0.f24118q;
                    min = Math.min(180, Math.min(point2.x, point2.y) / 4);
                }
                int i10 = this.f23507b;
                Bitmap bitmap = null;
                if (i10 == 0) {
                    String file3 = file.toString();
                    float f10 = min;
                    bitmap = ec.K(file3, null, f10, f10, false);
                } else {
                    int i11 = 2;
                    if (i10 == 2) {
                        String file4 = file.toString();
                        if (!ccVar.f23327e) {
                            i11 = 1;
                        }
                        bitmap = zy.r(i11, file4);
                    } else if (i10 == 3) {
                        String lowerCase = file.toString().toLowerCase();
                        if (lowerCase.endsWith("mp4")) {
                            String file5 = file.toString();
                            if (!ccVar.f23327e) {
                                i11 = 1;
                            }
                            bitmap = zy.r(i11, file5);
                        } else if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                            float f11 = min;
                            bitmap = ec.K(lowerCase, null, f11, f11, false);
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
                    if (ccVar.f23327e) {
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
                    g0.g3(new fn(this, str, new ArrayList(ccVar.f23326c), new BitmapDrawable(bitmap), new ArrayList(ccVar.d), 4));
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
