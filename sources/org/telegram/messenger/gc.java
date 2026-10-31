package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
public final class gc implements Runnable {
    public final File f15692a;
    public final int f15693b;
    public final fc f15694c;
    public final hc d;

    public gc(hc hcVar, int i10, File file, fc fcVar) {
        this.d = hcVar;
        this.f15693b = i10;
        this.f15692a = file;
        this.f15694c = fcVar;
    }

    public final void a() {
        this.d.f15868s.c(new t6(18, this, b8.r(null, this.f15694c.f15535a)));
    }

    @Override
    public final void run() {
        int min;
        int i10;
        Bitmap createScaledBitmap;
        File file = this.f15692a;
        fc fcVar = this.f15694c;
        try {
            String str = "q_" + fcVar.f15535a.dc_id + "_" + fcVar.f15535a.f19799id;
            File file2 = new File(b8.z(4), str + ".jpg");
            if (!file2.exists() && file.exists()) {
                if (fcVar.e) {
                    Point point = i0.f16026q;
                    min = Math.max(point.x, point.y);
                } else {
                    Point point2 = i0.f16026q;
                    min = Math.min(180, Math.min(point2.x, point2.y) / 4);
                }
                int i11 = this.f15693b;
                Bitmap bitmap = null;
                if (i11 == 0) {
                    String file3 = file.toString();
                    float f7 = min;
                    bitmap = hc.K(file3, null, f7, f7, false);
                } else {
                    int i12 = 2;
                    if (i11 == 2) {
                        String file4 = file.toString();
                        if (!fcVar.e) {
                            i12 = 1;
                        }
                        bitmap = qz.r(i12, file4);
                    } else if (i11 == 3) {
                        String lowerCase = file.toString().toLowerCase();
                        if (lowerCase.endsWith("mp4")) {
                            String file5 = file.toString();
                            if (!fcVar.e) {
                                i12 = 1;
                            }
                            bitmap = qz.r(i12, file5);
                        } else if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                            float f10 = min;
                            bitmap = hc.K(lowerCase, null, f10, f10, false);
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
                    float f11 = width;
                    float f12 = min;
                    float f13 = height;
                    float min2 = Math.min(f11 / f12, f13 / f12);
                    if (min2 > 1.0f && (createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (f11 / min2), (int) (f13 / min2), true)) != bitmap) {
                        bitmap.recycle();
                        bitmap = createScaledBitmap;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (fcVar.e) {
                        i10 = 83;
                    } else {
                        i10 = 60;
                    }
                    bitmap.compress(compressFormat, i10, fileOutputStream);
                    try {
                        fileOutputStream.close();
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                    i0.g3(new cn(this, str, new ArrayList(fcVar.f15537c), new BitmapDrawable(bitmap), new ArrayList(fcVar.d), 4));
                    return;
                }
                a();
                return;
            }
            a();
        } catch (Throwable th2) {
            f8.g(th2, true);
            a();
        }
    }
}
