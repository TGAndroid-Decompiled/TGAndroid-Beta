package ab;

import a8.h7;
import a8.r7;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import gb.y0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m1.u0;
import org.telegram.messenger.a8;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.ms;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l71;
import org.telegram.ui.an;
import org.telegram.ui.cy0;
import org.telegram.ui.hy0;
import org.telegram.ui.ie;
import org.telegram.ui.jy0;
import org.telegram.ui.web.c1;
import org.telegram.ui.web.d1;
import ug.w0;
import zd.a1;
public final class b0 implements ib.b, ms, jy0, q5.b {
    public static b0 f905f;
    public final int f906a;
    public Object f907b;
    public Object f908c;
    public Object d;
    public Object f909e;

    public b0(int i7, boolean z9) {
        this.f906a = i7;
    }

    public static void f(String str, String str2, HashMap hashMap) {
        d1 d1Var = new d1();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i7 = 0; i7 < split.length; i7++) {
            String trim = split[i7].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i7 != 0 && indexOf >= 0) {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = com.google.android.recaptcha.internal.a.k(trim3, 1, 1);
                    }
                    d1Var.f51119b.put(trim2, trim3);
                } else {
                    d1Var.f51118a = trim;
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), d1Var);
    }

    public static synchronized b0 k() {
        b0 b0Var;
        synchronized (b0.class) {
            try {
                if (f905f == null) {
                    f905f = new b0(0);
                }
                b0Var = f905f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b0Var;
    }

    public static void r(long j3, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j3) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            hashMap.remove(arrayList.get(i7));
        }
    }

    @Override
    public void a() {
        org.telegram.messenger.g0.i3(new cy0((an) this.f907b, (Activity) this.f908c, (f6) this.d, (ij) this.f909e, 2), 200L);
    }

    @Override
    public void b() {
        a0.k kVar = (a0.k) this.d;
        if (((ls) this.f908c) == null) {
            return;
        }
        b0 b0Var = (b0) this.f909e;
        if (b0Var != null) {
            b0Var.b();
            this.f909e = null;
        }
        int i7 = kVar.f28b;
        for (int i10 = 0; i10 < i7; i10++) {
            qs qsVar = (qs) this.f907b;
            ls lsVar = (ls) this.f908c;
            if (i10 >= 0) {
                if (i10 < kVar.f28b) {
                    qsVar.n(lsVar, kVar.f27a[i10]);
                }
            } else {
                kVar.getClass();
            }
            StringBuilder n10 = jg.g.n(i10, "Index ", " must be in 0..");
            n10.append(kVar.f28b - 1);
            throw new IndexOutOfBoundsException(n10.toString());
        }
        kVar.f28b = 0;
        this.f907b = null;
        this.f908c = null;
    }

    public b0 c(int i7) {
        if (((ls) this.f908c) == null) {
            return this;
        }
        a0.k kVar = (a0.k) this.d;
        int i10 = kVar.f28b + 1;
        int[] iArr = kVar.f27a;
        if (iArr.length < i10) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            kVar.f27a = copyOf;
        }
        int[] iArr2 = kVar.f27a;
        int i11 = kVar.f28b;
        iArr2[i11] = i7;
        kVar.f28b = i11 + 1;
        ((qs) this.f907b).b((ls) this.f908c, i7);
        return this;
    }

    @Override
    public void d() {
        org.telegram.messenger.g0.i3(new ie((an) this.f907b, (ij) this.f909e, 8), 200L);
    }

    public b0 e(int i7) {
        if (((ls) this.f908c) == null) {
            return this;
        }
        if (((b0) this.f909e) == null) {
            this.f909e = new b0(qs.e(), (ls) this.f908c);
        }
        ((b0) this.f909e).c(i7);
        return this;
    }

    @Override
    public void g() {
        an anVar = (an) this.f907b;
        anVar.showDialog(new w0((f2) anVar, 3, true));
    }

    @Override
    public Object mo24get() {
        switch (this.f906a) {
            case 3:
                return new gb.o((o9.g) ((d9.o) this.f907b).f8253a, (jb.l) ((ib.c) this.f908c).mo24get(), (id.h) ((ib.c) this.d).mo24get(), (y0) ((ib.c) this.f909e).mo24get());
            default:
                return new ui.e((Executor) ((fd.a) this.f907b).mo24get(), (v5.d) ((fd.a) this.f908c).mo24get(), (hy0) ((hy0) this.d).mo24get(), (w5.c) ((fd.a) this.f909e).mo24get(), false, 13);
        }
    }

    public ArrayList h(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.f907b;
        r(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.f908c;
        r(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            p2.b bVar = (p2.b) list.get(i7);
            if (!hashMap.containsKey(bVar.f53096b) && !hashMap2.containsKey(Integer.valueOf(bVar.f53097c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public void i(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            o(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public String j(String str) {
        ArrayList arrayList = (ArrayList) this.f908c;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.f907b);
            if (matcher.find()) {
                String group = matcher.group();
                if (!arrayList.contains(group)) {
                    arrayList.add(group + ";");
                }
                i(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e10) {
            arrayList.clear();
            a8.g(e10, true);
        }
        return TextUtils.join("", arrayList);
    }

    public boolean l(Context context) {
        boolean z9;
        if (((Boolean) this.d) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.d = Boolean.valueOf(z9);
        }
        if (!((Boolean) this.f908c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean m(Context context) {
        boolean z9;
        if (((Boolean) this.f908c) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f908c = Boolean.valueOf(z9);
        }
        if (!((Boolean) this.f908c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f908c).booleanValue();
    }

    public void n(int r12, java.lang.String r13, java.util.HashMap r14) {
        throw new UnsupportedOperationException("Method not decompiled: ab.b0.n(int, java.lang.String, java.util.HashMap):void");
    }

    public void o(String str, HashMap hashMap, boolean[] zArr, int i7) {
        if (i7 >= 0) {
            zArr[0] = false;
            String trim = str.trim();
            Matcher matcher = l71.f35567x0.matcher(trim);
            if (matcher.find()) {
                trim = trim.substring(matcher.group(0).length());
            } else {
                Matcher matcher2 = l71.f35568y0.matcher(trim);
                if (matcher2.find()) {
                    trim = trim.substring(matcher2.group(0).length());
                    zArr[0] = true;
                }
            }
            n(i7, trim, hashMap);
            return;
        }
        throw new Exception("recursion limit reached");
    }

    public kf.f p(String str) {
        if (str != null) {
            gf.h hVar = new gf.h((ArrayList) this.f907b, (lf.b) this.d, (ArrayList) this.f908c);
            int i7 = 0;
            while (true) {
                int length = str.length();
                int i10 = i7;
                while (true) {
                    if (i10 < length) {
                        char charAt = str.charAt(i10);
                        if (charAt == '\n' || charAt == '\r') {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 == -1) {
                    break;
                }
                hVar.i(str.substring(i7, i10));
                i7 = i10 + 1;
                if (i7 < str.length() && str.charAt(i10) == '\r' && str.charAt(i7) == '\n') {
                    i7 = i10 + 2;
                }
            }
            if (str.length() > 0 && (i7 == 0 || i7 < str.length())) {
                hVar.i(str.substring(i7));
            }
            hVar.f(hVar.f13903n);
            lf.a b10 = hVar.f13899j.b(new wf.b(20, hVar.f13900k, hVar.f13902m));
            for (mf.a aVar : hVar.f13904o) {
                aVar.g(b10);
            }
            kf.f fVar = (kf.f) hVar.f13901l.f13887b;
            Iterator it = ((ArrayList) this.f909e).iterator();
            if (!it.hasNext()) {
                return fVar;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
        throw new NullPointerException("input must not be null");
    }

    public HashMap q(BufferedReader bufferedReader) {
        String str;
        StringBuilder sb2;
        HashMap hashMap = new HashMap();
        loop0: while (true) {
            str = null;
            sb2 = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break loop0;
                }
                long[] jArr = (long[]) this.f909e;
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                String trim = readLine.trim();
                if (trim.isEmpty()) {
                    break loop0;
                } else if (str != null && sb2 != null) {
                    sb2.append(trim);
                    if (!trim.endsWith(";")) {
                        break;
                    }
                } else {
                    int indexOf = trim.indexOf(58);
                    if (indexOf >= 0) {
                        String trim2 = trim.substring(0, indexOf).trim();
                        String trim3 = trim.substring(indexOf + 1).trim();
                        if (trim3.endsWith(";")) {
                            sb2 = com.google.android.recaptcha.internal.a.m(trim3);
                            str = trim2;
                        } else {
                            f(trim2, trim3, hashMap);
                        }
                    }
                }
            }
            f(str, sb2.toString(), hashMap);
        }
        if (str != null && sb2 != null) {
            f(str, sb2.toString(), hashMap);
        }
        return hashMap;
    }

    public p2.b s(List list) {
        p2.b bVar;
        HashMap hashMap = (HashMap) this.d;
        ArrayList h = h(list);
        if (h.size() < 2) {
            return (p2.b) h9.o.m(h, null);
        }
        Collections.sort(h, new jg.x(10));
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        int i10 = ((p2.b) h.get(0)).f53097c;
        int i11 = 0;
        while (true) {
            if (i11 >= h.size()) {
                break;
            }
            p2.b bVar2 = (p2.b) h.get(i11);
            if (i10 != bVar2.f53097c) {
                if (arrayList.size() == 1) {
                    return (p2.b) h.get(0);
                }
            } else {
                arrayList.add(new Pair(bVar2.f53096b, Integer.valueOf(bVar2.d)));
                i11++;
            }
        }
        p2.b bVar3 = (p2.b) hashMap.get(arrayList);
        if (bVar3 == null) {
            List subList = h.subList(0, arrayList.size());
            int i12 = 0;
            for (int i13 = 0; i13 < subList.size(); i13++) {
                i12 += ((p2.b) subList.get(i13)).d;
            }
            int nextInt = ((Random) this.f909e).nextInt(i12);
            int i14 = 0;
            while (true) {
                if (i7 < subList.size()) {
                    bVar = (p2.b) subList.get(i7);
                    i14 += bVar.d;
                    if (nextInt < i14) {
                        break;
                    }
                    i7++;
                } else {
                    bVar = (p2.b) h9.o.n(subList);
                    break;
                }
            }
            hashMap.put(arrayList, bVar);
            return bVar;
        }
        return bVar3;
    }

    public b0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f906a = i7;
        this.f907b = obj;
        this.f908c = obj2;
        this.d = obj3;
        this.f909e = obj4;
    }

    public b0(File file) {
        this.f906a = 12;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f908c = arrayList;
        HashMap hashMap2 = new HashMap();
        this.d = hashMap2;
        long[] jArr = new long[1];
        this.f909e = jArr;
        this.f907b = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(q(bufferedReader));
        d1 d1Var = (d1) hashMap.get("content-type");
        String str = d1Var == null ? null : (String) d1Var.f51119b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            c1 c1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (c1Var != null) {
                        c1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(c1Var);
                        d1 d1Var2 = (d1) c1Var.f51111a.get("content-location");
                        hashMap2.put(d1Var2 == null ? null : d1Var2.f51118a, c1Var);
                    }
                    c1Var = new c1();
                    c1Var.f51112b = (File) this.f907b;
                    c1Var.f51111a.putAll(q(bufferedReader));
                    c1Var.f51113c = jArr[0];
                }
            }
            if (c1Var != null && c1Var.f51113c != 0 && c1Var.d != 0) {
                arrayList.add(c1Var);
                d1 d1Var3 = (d1) c1Var.f51111a.get("content-location");
                hashMap2.put(d1Var3 != null ? d1Var3.f51118a : null, c1Var);
            }
        }
        bufferedReader.close();
    }

    public b0(zd.z zVar, m1.y yVar, be.l lVar) {
        this.f906a = 6;
        this.f907b = zVar;
        this.f908c = lVar;
        this.d = h7.a(Integer.MAX_VALUE, null, 6);
        this.f909e = new g6.d0(17);
        a1 a1Var = (a1) zVar.c().get(zd.y.f60132b);
        if (a1Var != null) {
            a1Var.invokeOnCompletion(new u0(1, yVar, this));
        }
    }

    public b0(r7 r7Var) {
        this.f906a = 5;
        LinkedHashSet linkedHashSet = gf.h.f13890p;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) r7Var.f614b);
        for (Class cls : (LinkedHashSet) r7Var.f616e) {
            arrayList.add(gf.h.f13891q.get(cls));
        }
        this.f907b = arrayList;
        lf.b bVar = (q4.q) r7Var.f617f;
        bVar = bVar == null ? new nb.a(13) : bVar;
        this.d = bVar;
        this.f909e = (ArrayList) r7Var.d;
        ArrayList arrayList2 = (ArrayList) r7Var.f615c;
        this.f908c = arrayList2;
        bVar.b(new wf.b(20, arrayList2, Collections.EMPTY_MAP));
    }

    public b0(Typeface typeface, s1.b bVar) {
        int i7;
        int i10;
        int i11;
        int i12;
        this.f906a = 1;
        this.f909e = typeface;
        this.f907b = bVar;
        this.d = new androidx.emoji2.text.s(1024);
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i13 = a10 + bVar.f54237a;
            i7 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i13) + i13);
        } else {
            i7 = 0;
        }
        this.f908c = new char[i7 * 2];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i14 = a11 + bVar.f54237a;
            i10 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            androidx.emoji2.text.o oVar = new androidx.emoji2.text.o(this, i15);
            s1.a b10 = oVar.b();
            int a12 = b10.a(4);
            Character.toChars(a12 != 0 ? ((ByteBuffer) b10.d).getInt(a12 + b10.f54237a) : 0, (char[]) this.f908c, i15 * 2);
            s1.a b11 = oVar.b();
            int a13 = b11.a(16);
            if (a13 != 0) {
                int i16 = a13 + b11.f54237a;
                i11 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                androidx.emoji2.text.s sVar = (androidx.emoji2.text.s) this.d;
                s1.a b12 = oVar.b();
                int a14 = b12.a(16);
                if (a14 != 0) {
                    int i17 = a14 + b12.f54237a;
                    i12 = ((ByteBuffer) b12.d).getInt(((ByteBuffer) b12.d).getInt(i17) + i17);
                } else {
                    i12 = 0;
                }
                sVar.a(oVar, 0, i12 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public b0(int i7) {
        this.f906a = i7;
        switch (i7) {
            case 7:
                Random random = new Random();
                this.d = new HashMap();
                this.f909e = random;
                this.f907b = new HashMap();
                this.f908c = new HashMap();
                return;
            default:
                this.f907b = null;
                this.f908c = null;
                this.d = null;
                this.f909e = new ArrayDeque();
                return;
        }
    }

    public b0(String str) {
        this.f906a = 9;
        this.f908c = new ArrayList();
        this.d = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.f909e = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.f907b = str;
    }

    public b0(qs qsVar, ls lsVar) {
        this.f906a = 8;
        ?? obj = new Object();
        obj.f27a = new int[16];
        this.d = obj;
        this.f907b = qsVar;
        this.f908c = lsVar;
    }
}
