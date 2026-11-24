package defpackage;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import javax.xml.parsers.SAXParserFactory;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.SerializedData;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
public abstract class zqc {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static volatile File b;

    public static ArrayList a(String str) {
        byte[] v = Utilities.v(str);
        int length = v.length / 52;
        SerializedData serializedData = new SerializedData(v);
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            float readFloat = serializedData.readFloat(true);
            float readFloat2 = serializedData.readFloat(true);
            RectF rectF = new RectF(readFloat, readFloat2, serializedData.readFloat(true) + readFloat, serializedData.readFloat(true) + readFloat2);
            Matrix matrix = new Matrix();
            matrix.setValues(new float[]{serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true)});
            arrayList.add(new uqc(rectF, matrix));
        }
        serializedData.cleanup();
        return arrayList;
    }

    public static File b(ng5 ng5Var) {
        File file = b;
        if (file == null) {
            file = new File(a.b.getCacheDir(), "wallpaper/mask");
            b = file;
            Pattern pattern = sqc.a;
            SharedPreferences c1 = na7.c1();
            if (c1.getInt("wallpaperFilesCleanup", 0) < 1) {
                Utilities.e.c(new kbc(c1, (byte) 29));
            }
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, ng5Var.a());
    }

    public static mqc c() {
        Point point = gl.q;
        return e(new ng5("r-default_pattern", Math.min(1440, Math.min(point.x, point.y))), new fyb((byte) 19));
    }

    public static mqc d(String str) {
        mqc g;
        Object putIfAbsent;
        if ("fqv01SQemVIBAAAApND8LDRUhRU".equals(str)) {
            return c();
        }
        ng5 c = ng5.c(str);
        String a2 = c.a();
        ConcurrentHashMap concurrentHashMap = a;
        Object obj = concurrentHashMap.get(a2);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a2, (obj = new Object()))) != null) {
            obj = putIfAbsent;
        }
        synchronized (obj) {
            g = g(b(c));
        }
        return g;
    }

    public static mqc e(ng5 ng5Var, yqc yqcVar) {
        Object putIfAbsent;
        String a2 = ng5Var.a();
        ConcurrentHashMap concurrentHashMap = a;
        Object obj = concurrentHashMap.get(a2);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a2, (obj = new Object()))) != null) {
            obj = putIfAbsent;
        }
        synchronized (obj) {
            File b2 = b(ng5Var);
            mqc g = g(b2);
            if (g != null) {
                return g;
            }
            mqc f = f(ng5Var, yqcVar);
            if (f != null) {
                i(b2, f);
            }
            return f;
        }
    }

    public static mqc f(ng5 ng5Var, yqc yqcVar) {
        icb icbVar;
        Bitmap bitmap;
        boolean z;
        Bitmap extractAlpha;
        mqc mqcVar;
        try {
            InputStream b2 = yqcVar.b();
            if (b2 == null) {
                if (b2 != null) {
                    b2.close();
                    return null;
                }
            } else {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(b2, 65536);
                byte[] bArr = new byte[4];
                bufferedInputStream.mark(4);
                int read = bufferedInputStream.read(bArr);
                bufferedInputStream.reset();
                if (read >= 4) {
                    boolean z2 = false;
                    byte b3 = bArr[0];
                    if (b3 == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b3 == -1 && bArr[1] == -40) {
                        z2 = true;
                    }
                    if (z || z2) {
                        int i = ng5Var.b;
                        Bitmap decodeStream = BitmapFactory.decodeStream(bufferedInputStream);
                        if (decodeStream == null) {
                            extractAlpha = null;
                        } else {
                            if (decodeStream.getWidth() != i) {
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeStream, i, Math.max(1, Math.round((i / decodeStream.getWidth()) * decodeStream.getHeight())), true);
                                if (createScaledBitmap != decodeStream) {
                                    decodeStream.recycle();
                                    decodeStream = createScaledBitmap;
                                }
                            }
                            extractAlpha = decodeStream.extractAlpha();
                            decodeStream.recycle();
                        }
                        if (extractAlpha != null) {
                            mqcVar = new mqc(extractAlpha, 1, null);
                        } else {
                            mqcVar = null;
                        }
                        b2.close();
                        return mqcVar;
                    }
                }
                int i2 = ng5Var.b;
                double[] dArr = lcb.a;
                try {
                    XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                    icbVar = new icb(i2, i2, null, false, 1.0f, 2);
                    icbVar.F = true;
                    xMLReader.setContentHandler(icbVar);
                    xMLReader.parse(new InputSource(bufferedInputStream));
                } catch (Exception e) {
                    fa4.g(e, true);
                    icbVar = null;
                }
                if (icbVar != null) {
                    bitmap = icbVar.b;
                } else {
                    bitmap = null;
                }
                if (bitmap == null) {
                    b2.close();
                } else {
                    mqc mqcVar2 = new mqc(bitmap, 1, icbVar.K);
                    b2.close();
                    return mqcVar2;
                }
            }
            return null;
        } catch (Throwable th) {
            fa4.g(th, true);
            return null;
        }
    }

    public static defpackage.mqc g(java.io.File r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zqc.g(java.io.File):mqc");
    }

    public static String h(List list) {
        SerializedData serializedData = new SerializedData(list.size() * 52);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            uqc uqcVar = (uqc) list.get(i);
            RectF rectF = uqcVar.a;
            serializedData.writeFloat(rectF.left);
            serializedData.writeFloat(rectF.top);
            serializedData.writeFloat(rectF.width());
            serializedData.writeFloat(rectF.height());
            float[] fArr = new float[9];
            uqcVar.b.getValues(fArr);
            for (int i2 = 0; i2 < 9; i2++) {
                serializedData.writeFloat(fArr[i2]);
            }
        }
        String f = Utilities.f(serializedData.toByteArray());
        serializedData.cleanup();
        return f;
    }

    public static void i(File file, mqc mqcVar) {
        Bitmap bitmap;
        Bitmap bitmap2 = mqcVar.a;
        File file2 = new File(file.getParentFile(), file.getName() + ".tmp");
        Bitmap bitmap3 = null;
        r3 = null;
        List singletonList = null;
        try {
            List list = mqcVar.b;
            if (bitmap2.getConfig() == Bitmap.Config.ALPHA_8) {
                bitmap = null;
            } else {
                bitmap2 = bitmap2.extractAlpha();
                bitmap = bitmap2;
            }
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        singletonList = Collections.singletonList("patterns = ".concat(h(list)));
                    }
                } catch (Throwable th) {
                    th = th;
                    bitmap3 = bitmap;
                    try {
                        fa4.g(th, true);
                    } finally {
                        if (bitmap3 != null) {
                            bitmap3.recycle();
                        }
                        file2.delete();
                    }
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(fileOutputStream, 65536));
            iqe.e(bitmap2, gZIPOutputStream, singletonList);
            gZIPOutputStream.finish();
            gZIPOutputStream.flush();
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
            boolean renameTo = file2.renameTo(file);
            if (bitmap != null) {
                bitmap.recycle();
            }
            if (renameTo) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
