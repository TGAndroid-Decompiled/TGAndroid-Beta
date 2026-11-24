package defpackage;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
public final class el5 implements Runnable {
    public final File a;
    public final byte b;
    public final dl5 c;
    public final fl5 d;

    public el5(fl5 fl5Var, int i, File file, dl5 dl5Var) {
        this.d = fl5Var;
        this.b = i;
        this.a = file;
        this.c = dl5Var;
    }

    public final void a() {
        this.d.s.c(new hb5(this, ba4.r(null, this.c.a), (byte) 11));
    }

    @Override
    public final void run() {
        int min;
        int i;
        Bitmap createScaledBitmap;
        File file = this.a;
        dl5 dl5Var = this.c;
        try {
            String str = "q_" + dl5Var.a.dc_id + "_" + dl5Var.a.id;
            File file2 = new File(ba4.z(4), str.concat(".jpg"));
            try {
                if (!file2.exists() && file.exists()) {
                    if (dl5Var.e) {
                        Point point = gl.q;
                        min = Math.max(point.x, point.y);
                    } else {
                        Point point2 = gl.q;
                        min = Math.min(180, Math.min(point2.x, point2.y) / 4);
                    }
                    byte b = this.b;
                    Bitmap bitmap = null;
                    if (b == 0) {
                        float f = min;
                        bitmap = fl5.G(file.toString(), null, f, f, false);
                    } else {
                        int i2 = 2;
                        if (b == 2) {
                            String file3 = file.toString();
                            if (!dl5Var.e) {
                                i2 = 1;
                            }
                            bitmap = z3a.q(i2, file3);
                        } else if (b == 3) {
                            String lowerCase = file.toString().toLowerCase();
                            if (lowerCase.endsWith("mp4")) {
                                String file4 = file.toString();
                                if (!dl5Var.e) {
                                    i2 = 1;
                                }
                                bitmap = z3a.q(i2, file4);
                            } else if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                                float f2 = min;
                                bitmap = fl5.G(lowerCase, null, f2, f2, false);
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
                        if (dl5Var.e) {
                            i = 83;
                        } else {
                            i = 60;
                        }
                        bitmap.compress(compressFormat, i, fileOutputStream);
                        try {
                            fileOutputStream.close();
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                        gl.d3(new vz4((Object) this, str, (Serializable) new ArrayList(dl5Var.c), (Object) new BitmapDrawable(bitmap), (Object) new ArrayList(dl5Var.d), (byte) 8));
                        return;
                    }
                    a();
                    return;
                }
                a();
            } catch (Throwable th) {
                th = th;
                fa4.g(th, true);
                a();
            }
        } catch (Throwable th2) {
            th = th2;
            fa4.g(th, true);
            a();
        }
    }
}
