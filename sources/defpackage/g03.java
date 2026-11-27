package defpackage;

import android.os.Build;
import android.util.Log;
import j$.util.Optional;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
public final class g03 {
    public static final Charset e = Charset.forName("UTF-8");
    public static final byte f = 15;
    public static final e03 g = new Object();
    public static final f03 h = new f03((byte) 0);
    public static final sy2 i = new sy2((byte) 3);
    public final AtomicInteger a = new AtomicInteger(0);
    public final gd4 b;
    public final oy8 c;
    public final ty2 d;

    public g03(gd4 gd4Var, oy8 oy8Var, ty2 ty2Var) {
        this.b = gd4Var;
        this.c = oy8Var;
        this.d = ty2Var;
    }

    public static void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String f(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void g(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final yz2 a(String str, t80 t80Var) {
        String str2 = t80Var.b;
        if (Build.VERSION.SDK_INT >= 37 && (str2.equals("crash") || str2.equals("ndk-crash"))) {
            return (yz2) Optional.of(this.b.b(str, "profiling-manager-info")).filter(new eh((byte) 4)).flatMap(new yz((byte) 5)).map(new cf1(t80Var, (byte) 1)).orElse(t80Var);
        }
        return t80Var;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        gd4 gd4Var = this.b;
        arrayList.addAll(gd4.e(((File) gd4Var.f).listFiles()));
        arrayList.addAll(gd4.e(((File) gd4Var.g).listFiles()));
        f03 f03Var = h;
        Collections.sort(arrayList, f03Var);
        List e2 = gd4.e(((File) gd4Var.e).listFiles());
        Collections.sort(e2, f03Var);
        arrayList.addAll(e2);
        return arrayList;
    }

    public final NavigableSet d() {
        return new TreeSet(gd4.e(((File) this.b.d).list())).descendingSet();
    }

    public final void e(yz2 yz2Var, String str, boolean z) {
        String str2;
        gd4 gd4Var = this.b;
        int i2 = this.c.c().a.a;
        g.getClass();
        String O = e03.a.O(yz2Var);
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement()));
        if (z) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            g(gd4Var.b(str, qd4.y("event", format, str2)), O);
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e2);
        }
        sy2 sy2Var = new sy2((byte) 4);
        File file = new File((File) gd4Var.d, str);
        file.mkdirs();
        List<File> e3 = gd4.e(file.listFiles(sy2Var));
        Collections.sort(e3, new f03((byte) 1));
        int size = e3.size();
        for (File file2 : e3) {
            if (size > i2) {
                gd4.d(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
