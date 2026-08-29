package l9;

import a4.w;
import android.util.Log;
import c5.e;
import e3.f;
import g9.i;
import g9.k;
import i9.a2;
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
public final class a {
    public static final Charset f15095e = Charset.forName("UTF-8");
    public static final int f15096f = 15;
    public static final j9.a f15097g = new Object();
    public static final e h = new e(23);
    public static final i f15098i = new i(2);
    public final AtomicInteger f15099a = new AtomicInteger(0);
    public final b f15100b;
    public final f f15101c;
    public final k d;

    public a(b bVar, f fVar, k kVar) {
        this.f15100b = bVar;
        this.f15101c = fVar;
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
                    String str = new String(byteArrayOutputStream.toByteArray(), f15095e);
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
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f15095e);
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
        b bVar = this.f15100b;
        arrayList.addAll(b.e(bVar.f15105e.listFiles()));
        arrayList.addAll(b.e(bVar.f15106f.listFiles()));
        e eVar = h;
        Collections.sort(arrayList, eVar);
        List e10 = b.e(bVar.d.listFiles());
        Collections.sort(e10, eVar);
        arrayList.addAll(e10);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(b.e(this.f15100b.f15104c.list())).descendingSet();
    }

    public final void d(a2 a2Var, String str, boolean z10) {
        String str2;
        b bVar = this.f15100b;
        int i10 = this.f15101c.d().f17164a.f161a;
        f15097g.getClass();
        String y8 = j9.a.f11292a.y(a2Var);
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.f15099a.getAndIncrement()));
        if (z10) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            f(bVar.b(str, w.n("event", format, str2)), y8);
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        i iVar = new i(3);
        bVar.getClass();
        File file = new File(bVar.f15104c, str);
        file.mkdirs();
        List<File> e11 = b.e(file.listFiles(iVar));
        Collections.sort(e11, new e(24));
        int size = e11.size();
        for (File file2 : e11) {
            if (size > i10) {
                b.d(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
