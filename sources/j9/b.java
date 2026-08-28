package j9;

import a5.e;
import aa.d;
import android.util.Log;
import c3.h;
import e9.i;
import e9.k;
import g9.a2;
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
public final class b {
    public static final Charset f14237e = Charset.forName("UTF-8");
    public static final int f14238f = 15;
    public static final h9.c f14239g = new Object();
    public static final e h = new e(29);
    public static final i f14240i = new i(2);
    public final AtomicInteger f14241a = new AtomicInteger(0);
    public final c f14242b;
    public final h f14243c;
    public final k d;

    public b(c cVar, h hVar, k kVar) {
        this.f14242b = cVar;
        this.f14243c = hVar;
        this.d = kVar;
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
                    String str = new String(byteArrayOutputStream.toByteArray(), f14237e);
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

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f14237e);
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

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        c cVar = this.f14242b;
        arrayList.addAll(c.e(cVar.f14247e.listFiles()));
        arrayList.addAll(c.e(cVar.f14248f.listFiles()));
        e eVar = h;
        Collections.sort(arrayList, eVar);
        List e10 = c.e(cVar.d.listFiles());
        Collections.sort(e10, eVar);
        arrayList.addAll(e10);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(c.e(this.f14242b.f14246c.list())).descendingSet();
    }

    public final void d(a2 a2Var, String str, boolean z10) {
        String str2;
        c cVar = this.f14242b;
        int i9 = this.f14243c.d().f16697a.f2981a;
        f14239g.getClass();
        String u10 = h9.c.f10257a.u(a2Var);
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.f14241a.getAndIncrement()));
        if (z10) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            f(cVar.b(str, d.o("event", format, str2)), u10);
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        i iVar = new i(3);
        cVar.getClass();
        File file = new File(cVar.f14246c, str);
        file.mkdirs();
        List<File> e11 = c.e(file.listFiles(iVar));
        Collections.sort(e11, new a(0));
        int size = e11.size();
        for (File file2 : e11) {
            if (size > i9) {
                c.d(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
