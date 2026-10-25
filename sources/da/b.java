package da;

import a1.g;
import a4.d;
import aa.b0;
import aa.c2;
import android.util.Log;
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
import y9.j;
public final class b {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f8267f = 15;
    public static final ba.a f8268g = new Object();
    public static final d h = new d(7);
    public static final a f8269i = new a(0);
    public final AtomicInteger f8270a = new AtomicInteger(0);
    public final c f8271b;
    public final b0 f8272c;
    public final j d;

    public b(c cVar, b0 b0Var, j jVar) {
        this.f8271b = cVar;
        this.f8272c = b0Var;
        this.d = jVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
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
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        c cVar = this.f8271b;
        arrayList.addAll(c.e(cVar.e.listFiles()));
        arrayList.addAll(c.e(cVar.f8276f.listFiles()));
        d dVar = h;
        Collections.sort(arrayList, dVar);
        List e10 = c.e(cVar.d.listFiles());
        Collections.sort(e10, dVar);
        arrayList.addAll(e10);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(c.e(this.f8271b.f8275c.list())).descendingSet();
    }

    public final void d(c2 c2Var, String str, boolean z10) {
        String str2;
        c cVar = this.f8271b;
        int i10 = this.f8272c.d().f10370a.f1303a;
        f8268g.getClass();
        String c10 = ba.a.f3719a.c(c2Var);
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.f8270a.getAndIncrement()));
        if (z10) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            f(cVar.b(str, g.p("event", format, str2)), c10);
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        a aVar = new a(1);
        cVar.getClass();
        File file = new File(cVar.f8275c, str);
        file.mkdirs();
        List<File> e11 = c.e(file.listFiles(aVar));
        Collections.sort(e11, new d(8));
        int size = e11.size();
        for (File file2 : e11) {
            if (size > i10) {
                c.d(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
