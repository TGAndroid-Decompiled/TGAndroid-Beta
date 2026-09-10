package ki;

import a0.l;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.j0;
import androidx.fragment.app.p0;
import androidx.fragment.app.s;
import b2.p;
import b2.u0;
import b2.x0;
import bi.ya;
import bi.z4;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.internal.vision.e2;
import e2.d0;
import e9.g0;
import e9.i0;
import e9.m0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m.e3;
import m4.b0;
import m4.j1;
import m4.n1;
import m4.o1;
import m4.r;
import m4.w;
import n4.y;
import n7.a1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.o10;
import org.telegram.ui.Components.o91;
import org.telegram.ui.web.l1;
import org.telegram.ui.web.m1;
import y9.t0;
import y9.z0;
import zd.e0;
public final class f implements n5.b {
    public static volatile f e;
    public Object f12538a;
    public Object f12539b;
    public Object f12540c;
    public Object d;

    public f(File file) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f12539b = arrayList;
        HashMap hashMap2 = new HashMap();
        this.f12540c = hashMap2;
        long[] jArr = new long[1];
        this.d = jArr;
        this.f12538a = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(H(bufferedReader));
        m1 m1Var = (m1) hashMap.get("content-type");
        String str = m1Var == null ? null : (String) m1Var.f38018b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            l1 l1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (l1Var != null) {
                        l1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(l1Var);
                        m1 m1Var2 = (m1) l1Var.f38008a.get("content-location");
                        hashMap2.put(m1Var2 == null ? null : m1Var2.f38017a, l1Var);
                    }
                    l1Var = new l1();
                    l1Var.f38009b = (File) this.f12538a;
                    l1Var.f38008a.putAll(H(bufferedReader));
                    l1Var.f38010c = jArr[0];
                }
            }
            if (l1Var != null && l1Var.f38010c != 0 && l1Var.d != 0) {
                arrayList.add(l1Var);
                m1 m1Var3 = (m1) l1Var.f38008a.get("content-location");
                hashMap2.put(m1Var3 != null ? m1Var3.f38017a : null, l1Var);
            }
        }
        bufferedReader.close();
    }

    public static final Message a(f fVar, ArrayList arrayList, int i10) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            if (((Message) obj2).what == i10) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        return (Message) obj;
    }

    public static void e(String str, String str2, HashMap hashMap) {
        m1 m1Var = new m1();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i10 = 0; i10 < split.length; i10++) {
            String trim = split[i10].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i10 != 0 && indexOf >= 0) {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = e2.h(1, 1, trim3);
                    }
                    m1Var.f38018b.put(trim2, trim3);
                } else {
                    m1Var.f38017a = trim;
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), m1Var);
    }

    public boolean A(r rVar, int i10) {
        m4.e eVar;
        synchronized (this.f12538a) {
            eVar = (m4.e) ((a0.f) this.f12540c).get(rVar);
        }
        b0 b0Var = (b0) ((WeakReference) this.d).get();
        if (eVar != null && eVar.e.a(i10) && b0Var != null && b0Var.f13307t.t().a(i10)) {
            return true;
        }
        return false;
    }

    public boolean B(r rVar, int i10) {
        m4.e eVar;
        boolean z10;
        synchronized (this.f12538a) {
            eVar = (m4.e) ((a0.f) this.f12540c).get(rVar);
        }
        if (eVar != null) {
            o1 o1Var = eVar.d;
            o1Var.getClass();
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.a("Use contains(Command) for custom command", z10);
            for (n1 n1Var : o1Var.f13466a) {
                if (n1Var.f13458a == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean C(r rVar, n1 n1Var) {
        m4.e eVar;
        synchronized (this.f12538a) {
            eVar = (m4.e) ((a0.f) this.f12540c).get(rVar);
        }
        if (eVar != null) {
            m0 m0Var = eVar.d.f13466a;
            n1Var.getClass();
            if (m0Var.contains(n1Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void D(p0 p0Var) {
        s sVar = p0Var.f1183c;
        String str = sVar.e;
        HashMap hashMap = (HashMap) this.f12539b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(sVar.e, p0Var);
        if (j0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + sVar);
        }
    }

    public void E(p0 p0Var) {
        HashMap hashMap = (HashMap) this.f12539b;
        s sVar = p0Var.f1183c;
        if (sVar.S) {
            ((androidx.fragment.app.m0) this.d).f(sVar);
        }
        if (hashMap.get(sVar.e) == p0Var && ((p0) hashMap.put(sVar.e, null)) != null && j0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public void F(k1.k r32) {
        throw new UnsupportedOperationException("Method not decompiled: ki.f.F(k1.k):void");
    }

    public bf.f G(String str) {
        if (str != null) {
            ye.d dVar = new ye.d((ArrayList) this.f12538a, (cf.b) this.f12540c, (ArrayList) this.f12539b);
            int i10 = 0;
            while (true) {
                int length = str.length();
                int i11 = i10;
                while (true) {
                    if (i11 < length) {
                        char charAt = str.charAt(i11);
                        if (charAt == '\n' || charAt == '\r') {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 == -1) {
                    break;
                }
                dVar.i(str.substring(i10, i11));
                i10 = i11 + 1;
                if (i10 < str.length() && str.charAt(i11) == '\r' && str.charAt(i10) == '\n') {
                    i10 = i11 + 2;
                }
            }
            if (str.length() > 0 && (i10 == 0 || i10 < str.length())) {
                dVar.i(str.substring(i10));
            }
            dVar.f(dVar.f46879n);
            cf.a u10 = dVar.f46875j.u(new a1(27, dVar.f46876k, dVar.f46878m));
            for (df.a aVar : dVar.f46880o) {
                aVar.g(u10);
            }
            bf.f fVar = (bf.f) dVar.f46877l.f46866b;
            Iterator it = ((ArrayList) this.d).iterator();
            if (!it.hasNext()) {
                return fVar;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
        throw new NullPointerException("input must not be null");
    }

    public HashMap H(BufferedReader bufferedReader) {
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
                long[] jArr = (long[]) this.d;
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
                            sb2 = a4.a.u(trim3);
                            str = trim2;
                        } else {
                            e(trim2, trim3, hashMap);
                        }
                    }
                }
            }
            e(str, sb2.toString(), hashMap);
        }
        if (str != null && sb2 != null) {
            e(str, sb2.toString(), hashMap);
        }
        return hashMap;
    }

    public void I() {
        if (((e) this.f12539b) == null) {
            e eVar = (e) ((ArrayDeque) this.f12538a).pollFirst();
            this.f12539b = eVar;
            if (eVar != null) {
                c cVar = new c(this, eVar, 0);
                this.f12540c = cVar;
                AndroidUtilities.runOnUIThread(cVar, 10000L);
                b bVar = eVar.f12536b;
                String str = bVar.f12527b;
                String str2 = bVar.f12529f;
                d dVar = new d(this, eVar);
                String i10 = k.i(str);
                byte[] d = k.d(str2);
                int i11 = 0;
                if (!TextUtils.isEmpty(i10) && d != null && k.h()) {
                    synchronized (k.f12548t) {
                        k kVar = k.v;
                        if (kVar != null) {
                            kVar.m();
                            k.v = null;
                        }
                        try {
                            k kVar2 = new k(i10, str2, d);
                            k.v = kVar2;
                            kVar2.f12565s = dVar;
                            o10 o10Var = o10.getInstance();
                            if (o10Var != null) {
                                o10Var.addListener(kVar2);
                            }
                            kVar2.h.execute(new g(kVar2, 1));
                            AndroidUtilities.runOnUIThread(new g(kVar2, 2));
                            i11 = k.v.f12554g.getLocalPort();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            k kVar3 = k.v;
                            if (kVar3 != null) {
                                kVar3.m();
                                k.v = null;
                            }
                        }
                    }
                }
                eVar.d = i11;
                if (i11 == 0) {
                    j(eVar);
                }
            }
        }
    }

    public void J(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.f12540c;
        if (linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
            return;
        }
        Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
    }

    public void K(r rVar) {
        synchronized (this.f12538a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f12540c).remove(rVar);
                if (eVar == null) {
                    return;
                }
                ((a0.f) this.f12539b).remove(eVar.f13328a);
                eVar.f13329b.g();
                b0 b0Var = (b0) ((WeakReference) this.d).get();
                if (b0Var != null && !b0Var.j()) {
                    d0.U(b0Var.f13299l, new m4.b(b0Var, rVar, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void L(int i10) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.f12540c).drainTo(arrayList);
        Message obtain = Message.obtain(null, i10, 0, 0);
        kotlin.jvm.internal.i.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        e0.q(e0.b((id.h) this.f12538a), new bb.i(this, arrayList, null, 6));
    }

    public Bundle M(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f12540c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    public void N(View view) {
        l.d dVar = (l.d) this.d;
        if (((View) this.f12539b) == view) {
            return;
        }
        O(null);
        View view2 = (View) this.f12539b;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(dVar);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(dVar);
            if (view.isAttachedToWindow()) {
                O(view.getViewTreeObserver());
            }
        }
        this.f12539b = view;
    }

    public void O(ViewTreeObserver viewTreeObserver) {
        z4 z4Var = (z4) this.f12538a;
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.f12540c;
        if (viewTreeObserver2 == viewTreeObserver) {
            return;
        }
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
            ((ViewTreeObserver) this.f12540c).removeOnGlobalLayoutListener(z4Var);
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(z4Var);
        }
        this.f12540c = viewTreeObserver;
    }

    public void b(Object obj, r rVar, o1 o1Var, x0 x0Var) {
        synchronized (this.f12538a) {
            try {
                r s10 = s(obj);
                if (s10 == null) {
                    ((a0.f) this.f12539b).put(obj, rVar);
                    ?? obj2 = new Object();
                    obj2.f4957c = new Object();
                    obj2.d = new l(0);
                    ((a0.f) this.f12540c).put(rVar, new m4.e(obj, obj2, o1Var, x0Var));
                } else {
                    m4.e eVar = (m4.e) ((a0.f) this.f12540c).get(s10);
                    e2.d.h(eVar);
                    eVar.d = o1Var;
                    eVar.e = x0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(s sVar) {
        if (!((ArrayList) this.f12538a).contains(sVar)) {
            synchronized (((ArrayList) this.f12538a)) {
                ((ArrayList) this.f12538a).add(sVar);
            }
            sVar.v = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + sVar);
    }

    public void d(r rVar, int i10, m4.d dVar) {
        synchronized (this.f12538a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f12540c).get(rVar);
                if (eVar != null) {
                    x0 x0Var = eVar.f13332g;
                    x0Var.getClass();
                    p pVar = new p();
                    pVar.c(x0Var.f2042a);
                    pVar.b(i10);
                    eVar.f13332g = new x0(pVar.d());
                    eVar.f13330c.add(dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public t0 f() {
        String str;
        if (((String) this.f12538a) == null) {
            str = " processName";
        } else {
            str = "";
        }
        if (((Integer) this.f12539b) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.f12540c) == null) {
            str = r6.t(str, " importance");
        }
        if (((Boolean) this.d) == null) {
            str = r6.t(str, " defaultProcess");
        }
        if (str.isEmpty()) {
            return new t0((String) this.f12538a, ((Integer) this.f12539b).intValue(), ((Integer) this.f12540c).intValue(), ((Boolean) this.d).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public z0 g() {
        String str;
        if (((Integer) this.f12538a) == null) {
            str = " platform";
        } else {
            str = "";
        }
        if (((String) this.f12539b) == null) {
            str = str.concat(" version");
        }
        if (((String) this.f12540c) == null) {
            str = r6.t(str, " buildVersion");
        }
        if (((Boolean) this.d) == null) {
            str = r6.t(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new z0(((Integer) this.f12538a).intValue(), (String) this.f12539b, (String) this.f12540c, ((Boolean) this.d).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override
    public Object mo28get() {
        return new com.google.firebase.messaging.s((Executor) ((fd.a) this.f12538a).mo28get(), (s5.d) ((fd.a) this.f12539b).mo28get(), (e3) ((e3) this.f12540c).mo28get(), (t5.c) ((fd.a) this.d).mo28get(), 9);
    }

    public void h(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            y(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public String i(String str) {
        ArrayList arrayList = (ArrayList) this.f12538a;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.f12539b);
            if (matcher.find()) {
                String group = matcher.group();
                if (!arrayList.contains(group)) {
                    arrayList.add(group + ";");
                }
                h(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e7) {
            arrayList.clear();
            FileLog.e(e7);
        }
        return TextUtils.join("", arrayList);
    }

    public void j(e eVar) {
        if (((e) this.f12539b) != eVar) {
            return;
        }
        c cVar = (c) this.f12540c;
        if (cVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar);
            this.f12540c = null;
        }
        c cVar2 = (c) this.d;
        if (cVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar2);
            this.d = null;
        }
        synchronized (k.f12548t) {
            try {
                k kVar = k.v;
                if (kVar != null) {
                    kVar.m();
                    k.v = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f12539b = null;
        eVar.f12537c.run(-1L);
        I();
    }

    public s k(String str) {
        p0 p0Var = (p0) ((HashMap) this.f12539b).get(str);
        if (p0Var != null) {
            return p0Var.f1183c;
        }
        return null;
    }

    public s l(String str) {
        for (p0 p0Var : ((HashMap) this.f12539b).values()) {
            if (p0Var != null) {
                s sVar = p0Var.f1183c;
                if (!str.equals(sVar.e)) {
                    sVar = sVar.L.f1119c.l(str);
                }
                if (sVar != null) {
                    return sVar;
                }
            }
        }
        return null;
    }

    public void m(m4.e eVar) {
        b0 b0Var = (b0) ((WeakReference) this.d).get();
        if (b0Var != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            while (atomicBoolean.get()) {
                atomicBoolean.set(false);
                m4.d dVar = (m4.d) eVar.f13330c.poll();
                if (dVar == null) {
                    eVar.f13331f = false;
                    return;
                }
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
                m4.e eVar2 = eVar;
                d0.U(b0Var.f13299l, new w(b0Var, s(eVar.f13328a), new ya(this, dVar, atomicBoolean2, eVar2, atomicBoolean, 6)));
                atomicBoolean2.set(false);
                eVar = eVar2;
            }
        }
    }

    public void n(final r rVar) {
        synchronized (this.f12538a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f12540c).get(rVar);
                if (eVar == null) {
                    return;
                }
                final x0 x0Var = eVar.f13332g;
                eVar.f13332g = x0.f2040b;
                eVar.f13330c.add(new m4.d(rVar, x0Var) {
                    public final r f13317b;

                    @Override
                    public final i9.w run() {
                        b0 b0Var = (b0) ((WeakReference) ki.f.this.d).get();
                        if (b0Var != null) {
                            b0Var.p(this.f13317b);
                        }
                        return i9.u.f10538b;
                    }
                });
                if (eVar.f13331f) {
                    return;
                }
                eVar.f13331f = true;
                m(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ArrayList o() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.f12539b).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var);
            }
        }
        return arrayList;
    }

    public ArrayList p() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.f12539b).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var.f1183c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public x0 q(r rVar) {
        synchronized (this.f12538a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f12540c).get(rVar);
                if (eVar != null) {
                    return eVar.e;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public i0 r() {
        i0 v;
        synchronized (this.f12538a) {
            v = i0.v(((a0.f) this.f12539b).values());
        }
        return v;
    }

    public r s(Object obj) {
        r rVar;
        synchronized (this.f12538a) {
            rVar = (r) ((a0.f) this.f12539b).get(obj);
        }
        return rVar;
    }

    public List t() {
        ArrayList arrayList;
        if (((ArrayList) this.f12538a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f12538a)) {
            arrayList = new ArrayList((ArrayList) this.f12538a);
        }
        return arrayList;
    }

    public u0 u(r rVar) {
        synchronized (this.f12538a) {
            try {
                return ((m4.e) ((a0.f) this.f12540c).get(rVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public j1 v(r rVar) {
        synchronized (this.f12538a) {
            try {
                if (((m4.e) ((a0.f) this.f12540c).get(rVar)) != null) {
                    return null;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public v w(r rVar) {
        m4.e eVar;
        synchronized (this.f12538a) {
            eVar = (m4.e) ((a0.f) this.f12540c).get(rVar);
        }
        if (eVar != null) {
            return eVar.f13329b;
        }
        return null;
    }

    public void x(int r12, java.lang.String r13, java.util.HashMap r14) {
        throw new UnsupportedOperationException("Method not decompiled: ki.f.x(int, java.lang.String, java.util.HashMap):void");
    }

    public void y(String str, HashMap hashMap, boolean[] zArr, int i10) {
        if (i10 >= 0) {
            zArr[0] = false;
            String trim = str.trim();
            Matcher matcher = o91.f25712x0.matcher(trim);
            if (matcher.find()) {
                trim = trim.substring(matcher.group(0).length());
            } else {
                Matcher matcher2 = o91.f25713y0.matcher(trim);
                if (matcher2.find()) {
                    trim = trim.substring(matcher2.group(0).length());
                    zArr[0] = true;
                }
            }
            x(i10, trim, hashMap);
            return;
        }
        throw new Exception("recursion limit reached");
    }

    public boolean z(r rVar) {
        boolean z10;
        synchronized (this.f12538a) {
            if (((a0.f) this.f12540c).get(rVar) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public f(int i10) {
        switch (i10) {
            case 1:
                this.f12538a = new ArrayList();
                this.f12539b = new HashMap();
                this.f12540c = new HashMap();
                return;
            default:
                this.f12538a = new ArrayDeque();
                return;
        }
    }

    public f(b0 b0Var) {
        this.f12539b = new l(0);
        this.f12540c = new l(0);
        this.f12538a = new Object();
        this.d = new WeakReference(b0Var);
    }

    public f(String str) {
        this.f12538a = new ArrayList();
        this.f12540c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.f12539b = str;
    }

    public f(e9.a1 a1Var, f2.i iVar, y yVar, f2.i iVar2) {
        Object obj;
        if (a1Var != null) {
            obj = i0.v(a1Var);
        } else {
            g0 g0Var = i0.f7384b;
            obj = e9.a1.e;
        }
        this.f12538a = obj;
        this.f12539b = iVar;
        this.f12540c = yVar;
        this.d = iVar2;
    }
}
