package defpackage;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
public final class hn5 implements Runnable {
    public final File a;
    public final byte b;
    public final gn5 c;
    public final in5 d;

    public hn5(in5 in5Var, int i, File file, gn5 gn5Var) {
        this.d = in5Var;
        this.b = i;
        this.a = file;
        this.c = gn5Var;
    }

    public final void a() {
        this.d.s.c(new tg5(this, xb4.r(null, this.c.a), (byte) 8));
    }

    @Override
    public final void run() {
        int min;
        int i;
        Bitmap createScaledBitmap;
        File file = this.a;
        gn5 gn5Var = this.c;
        try {
            String str = "q_" + gn5Var.a.dc_id + "_" + gn5Var.a.id;
            File file2 = new File(xb4.z(4), str.concat(".jpg"));
            try {
                if (!file2.exists() && file.exists()) {
                    if (gn5Var.e) {
                        Point point = hl.q;
                        min = Math.max(point.x, point.y);
                    } else {
                        Point point2 = hl.q;
                        min = Math.min(180, Math.min(point2.x, point2.y) / 4);
                    }
                    byte b = this.b;
                    Bitmap bitmap = null;
                    if (b == 0) {
                        float f = min;
                        bitmap = in5.G(file.toString(), null, f, f, false);
                    } else {
                        int i2 = 2;
                        if (b == 2) {
                            String file3 = file.toString();
                            if (!gn5Var.e) {
                                i2 = 1;
                            }
                            bitmap = r7a.q(i2, file3);
                        } else if (b == 3) {
                            String lowerCase = file.toString().toLowerCase();
                            if (lowerCase.endsWith("mp4")) {
                                String file4 = file.toString();
                                if (!gn5Var.e) {
                                    i2 = 1;
                                }
                                bitmap = r7a.q(i2, file4);
                            } else if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                                float f2 = min;
                                bitmap = in5.G(lowerCase, null, f2, f2, false);
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
                        float f3 = width;
                        float f4 = min;
                        float f5 = height;
                        float min2 = Math.min(f3 / f4, f5 / f4);
                        if (min2 > 1.0f && (createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (f3 / min2), (int) (f5 / min2), true)) != bitmap) {
                            bitmap.recycle();
                            bitmap = createScaledBitmap;
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                        if (gn5Var.e) {
                            i = 83;
                        } else {
                            i = 60;
                        }
                        bitmap.compress(compressFormat, i, fileOutputStream);
                        try {
                            fileOutputStream.close();
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                        hl.c3(new tw4(this, str, new ArrayList(gn5Var.c), new BitmapDrawable(bitmap), new ArrayList(gn5Var.d), (byte) 9));
                        return;
                    }
                    a();
                    return;
                }
                a();
            } catch (Throwable th) {
                th = th;
                cc4.g(th, true);
                a();
            }
        } catch (Throwable th2) {
            th = th2;
            cc4.g(th, true);
            a();
        }
    }
}
