package ca;

import a1.g;
import a4.d;
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
import x9.j;
import z9.a2;
public final class b {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f4668f = 15;
    public static final aa.b f4669g = new Object();
    public static final d h = new d(11);
    public static final a f4670i = new a(0);
    public final AtomicInteger f4671a = new AtomicInteger(0);
    public final c f4672b;
    public final ea.b f4673c;
    public final j d;

    public b(c cVar, ea.b bVar, j jVar) {
        this.f4672b = cVar;
        this.f4673c = bVar;
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
        c cVar = this.f4672b;
        arrayList.addAll(c.e(cVar.e.listFiles()));
        arrayList.addAll(c.e(cVar.f4677f.listFiles()));
        d dVar = h;
        Collections.sort(arrayList, dVar);
        List e7 = c.e(cVar.d.listFiles());
        Collections.sort(e7, dVar);
        arrayList.addAll(e7);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(c.e(this.f4672b.f4676c.list())).descendingSet();
    }

    public final void d(a2 a2Var, String str, boolean z10) {
        String str2;
        c cVar = this.f4672b;
        int i10 = this.f4673c.d().f8659a.f5108a;
        f4669g.getClass();
        String N = aa.b.f359a.N(a2Var);
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.f4671a.getAndIncrement()));
        if (z10) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            f(cVar.b(str, g.p("event", format, str2)), N);
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e7);
        }
        a aVar = new a(1);
        cVar.getClass();
        File file = new File(cVar.f4676c, str);
        file.mkdirs();
        List<File> e10 = c.e(file.listFiles(aVar));
        Collections.sort(e10, new d(12));
        int size = e10.size();
        for (File file2 : e10) {
            if (size > i10) {
                c.d(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
