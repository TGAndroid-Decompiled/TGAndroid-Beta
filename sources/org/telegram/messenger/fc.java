package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
public final class fc implements Runnable {
    public final File f22397a;
    public final int f22398b;
    public final ec f22399c;
    public final gc d;

    public fc(gc gcVar, int i7, File file, ec ecVar) {
        this.d = gcVar;
        this.f22398b = i7;
        this.f22397a = file;
        this.f22399c = ecVar;
    }

    public final void a() {
        this.d.f22655s.c(new x4(20, this, w7.r(null, this.f22399c.f22205a)));
    }

    @Override
    public final void run() {
        int min;
        int i7;
        Bitmap createScaledBitmap;
        File file = this.f22397a;
        ec ecVar = this.f22399c;
        try {
            String str = "q_" + ecVar.f22205a.dc_id + "_" + ecVar.f22205a.f26966id;
            File file2 = new File(w7.z(4), str + ".jpg");
            if (!file2.exists() && file.exists()) {
                if (ecVar.f22208e) {
                    Point point = g0.f22567q;
                    min = Math.max(point.x, point.y);
                } else {
                    Point point2 = g0.f22567q;
                    min = Math.min(180, Math.min(point2.x, point2.y) / 4);
                }
                int i10 = this.f22398b;
                Bitmap bitmap = null;
                if (i10 == 0) {
                    String file3 = file.toString();
                    float f10 = min;
                    bitmap = gc.K(file3, null, f10, f10, false);
                } else {
                    int i11 = 2;
                    if (i10 == 2) {
                        String file4 = file.toString();
                        if (!ecVar.f22208e) {
                            i11 = 1;
                        }
                        bitmap = gz.r(i11, file4);
                    } else if (i10 == 3) {
                        String lowerCase = file.toString().toLowerCase();
                        if (lowerCase.endsWith("mp4")) {
                            String file5 = file.toString();
                            if (!ecVar.f22208e) {
                                i11 = 1;
                            }
                            bitmap = gz.r(i11, file5);
                        } else if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                            float f11 = min;
                            bitmap = gc.K(lowerCase, null, f11, f11, false);
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
                    if (ecVar.f22208e) {
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
                    g0.h3(new mn(this, str, new ArrayList(ecVar.f22207c), new BitmapDrawable(bitmap), new ArrayList(ecVar.d), 4));
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
