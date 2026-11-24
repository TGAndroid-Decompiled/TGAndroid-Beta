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
public final class y03 {
    public static final Charset e = Charset.forName("UTF-8");
    public static final byte f = 15;
    public static final w03 g = new Object();
    public static final x03 h = new x03((byte) 0);
    public static final iz2 i = new iz2((byte) 3);
    public final AtomicInteger a = new AtomicInteger(0);
    public final jd4 b;
    public final ex8 c;
    public final jz2 d;

    public y03(jd4 jd4Var, ex8 ex8Var, jz2 jz2Var) {
        this.b = jd4Var;
        this.c = ex8Var;
        this.d = jz2Var;
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

    public final o03 a(String str, r90 r90Var) {
        String str2 = r90Var.b;
        if (Build.VERSION.SDK_INT >= 37 && (str2.equals("crash") || str2.equals("ndk-crash"))) {
            return (o03) Optional.of(this.b.b(str, "profiling-manager-info")).filter(new se((byte) 4)).flatMap(new x00((byte) 5)).map(new dg1(r90Var, (byte) 1)).orElse(r90Var);
        }
        return r90Var;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        jd4 jd4Var = this.b;
        arrayList.addAll(jd4.e(((File) jd4Var.f).listFiles()));
        arrayList.addAll(jd4.e(((File) jd4Var.g).listFiles()));
        x03 x03Var = h;
        Collections.sort(arrayList, x03Var);
        List e2 = jd4.e(((File) jd4Var.e).listFiles());
        Collections.sort(e2, x03Var);
        arrayList.addAll(e2);
        return arrayList;
    }

    public final NavigableSet d() {
        return new TreeSet(jd4.e(((File) this.b.d).list())).descendingSet();
    }

    public final void e(o03 o03Var, String str, boolean z) {
        String str2;
        jd4 jd4Var = this.b;
        int i2 = this.c.c().a.a;
        g.getClass();
        String s = w03.a.s(o03Var);
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement()));
        if (z) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            g(jd4Var.b(str, kt6.o("event", format, str2)), s);
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e2);
        }
        iz2 iz2Var = new iz2((byte) 4);
        File file = new File((File) jd4Var.d, str);
        file.mkdirs();
        List<File> e3 = jd4.e(file.listFiles(iz2Var));
        Collections.sort(e3, new x03((byte) 1));
        int size = e3.size();
        for (File file2 : e3) {
            if (size > i2) {
                jd4.d(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
