package oi;

import a0.m;
import ai.m3;
import ai.u2;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.k0;
import androidx.fragment.app.n0;
import androidx.fragment.app.q0;
import androidx.fragment.app.s;
import b2.p;
import b2.u0;
import b2.x0;
import ci.h4;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.internal.vision.e2;
import com.google.firebase.messaging.t;
import e2.d0;
import e9.a1;
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
import l.b0;
import l.l;
import m4.a0;
import m4.h1;
import m4.l1;
import m4.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.p91;
import org.telegram.ui.web.m1;
import org.telegram.ui.web.n1;
import v7.j0;
import y9.t0;
import y9.z0;
import zd.e0;
public final class f implements n5.b {
    public static volatile f e;
    public Object f15748a;
    public Object f15749b;
    public Object f15750c;
    public Object d;

    public f(File file) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f15749b = arrayList;
        HashMap hashMap2 = new HashMap();
        this.f15750c = hashMap2;
        long[] jArr = new long[1];
        this.d = jArr;
        this.f15748a = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(J(bufferedReader));
        n1 n1Var = (n1) hashMap.get("content-type");
        String str = n1Var == null ? null : (String) n1Var.f38993b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            m1 m1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (m1Var != null) {
                        m1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(m1Var);
                        n1 n1Var2 = (n1) m1Var.f38984a.get("content-location");
                        hashMap2.put(n1Var2 == null ? null : n1Var2.f38992a, m1Var);
                    }
                    m1Var = new m1();
                    m1Var.f38985b = (File) this.f15748a;
                    m1Var.f38984a.putAll(J(bufferedReader));
                    m1Var.f38986c = jArr[0];
                }
            }
            if (m1Var != null && m1Var.f38986c != 0 && m1Var.d != 0) {
                arrayList.add(m1Var);
                n1 n1Var3 = (n1) m1Var.f38984a.get("content-location");
                hashMap2.put(n1Var3 != null ? n1Var3.f38992a : null, m1Var);
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
        n1 n1Var = new n1();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i10 = 0; i10 < split.length; i10++) {
            String trim = split[i10].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i10 != 0 && indexOf >= 0) {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = e2.i(1, 1, trim3);
                    }
                    n1Var.f38993b.put(trim2, trim3);
                } else {
                    n1Var.f38992a = trim;
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), n1Var);
    }

    public boolean A(r rVar) {
        boolean z10;
        synchronized (this.f15748a) {
            if (((a0.f) this.f15750c).get(rVar) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean B(r rVar, int i10) {
        m4.e eVar;
        synchronized (this.f15748a) {
            eVar = (m4.e) ((a0.f) this.f15750c).get(rVar);
        }
        a0 a0Var = (a0) ((WeakReference) this.d).get();
        if (eVar != null && eVar.e.a(i10) && a0Var != null && a0Var.f14687t.t().a(i10)) {
            return true;
        }
        return false;
    }

    public boolean C(r rVar, int i10) {
        m4.e eVar;
        boolean z10;
        synchronized (this.f15748a) {
            eVar = (m4.e) ((a0.f) this.f15750c).get(rVar);
        }
        if (eVar != null) {
            m4.m1 m1Var = eVar.d;
            m1Var.getClass();
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.a("Use contains(Command) for custom command", z10);
            for (l1 l1Var : m1Var.f14839a) {
                if (l1Var.f14832a == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean D(r rVar, l1 l1Var) {
        m4.e eVar;
        synchronized (this.f15748a) {
            eVar = (m4.e) ((a0.f) this.f15750c).get(rVar);
        }
        if (eVar != null) {
            m0 m0Var = eVar.d.f14839a;
            l1Var.getClass();
            if (m0Var.contains(l1Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void E(q0 q0Var) {
        s sVar = q0Var.f2492c;
        String str = sVar.e;
        HashMap hashMap = (HashMap) this.f15749b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(sVar.e, q0Var);
        if (k0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + sVar);
        }
    }

    public void F(q0 q0Var) {
        HashMap hashMap = (HashMap) this.f15749b;
        s sVar = q0Var.f2492c;
        if (sVar.S) {
            ((n0) this.d).f(sVar);
        }
        if (hashMap.get(sVar.e) == q0Var && ((q0) hashMap.put(sVar.e, null)) != null && k0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public boolean G(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f15748a).onActionItemClicked(o(aVar), new l.s((Context) this.f15749b, (l0.a) menuItem));
    }

    public boolean H(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f15748a;
        k.e o9 = o(aVar);
        m mVar = (m) this.d;
        Menu menu2 = (Menu) mVar.get(menu);
        if (menu2 == null) {
            menu2 = new b0((Context) this.f15749b, (l) menu);
            mVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(o9, menu2);
    }

    public bf.f I(String str) {
        if (str != null) {
            ye.d dVar = new ye.d((ArrayList) this.f15748a, (cf.b) this.f15750c, (ArrayList) this.f15749b);
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
            dVar.f(dVar.f47031n);
            cf.a c02 = dVar.f47027j.c0(new f3(dVar.f47028k, dVar.f47030m, false, 24));
            for (df.a aVar : dVar.f47032o) {
                aVar.g(c02);
            }
            bf.f fVar = (bf.f) dVar.f47029l.f47018b;
            Iterator it = ((ArrayList) this.d).iterator();
            if (!it.hasNext()) {
                return fVar;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
        throw new NullPointerException("input must not be null");
    }

    public HashMap J(BufferedReader bufferedReader) {
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

    public void K() {
        if (((e) this.f15749b) == null) {
            e eVar = (e) ((ArrayDeque) this.f15748a).pollFirst();
            this.f15749b = eVar;
            if (eVar != null) {
                c cVar = new c(this, eVar, 0);
                this.f15750c = cVar;
                AndroidUtilities.runOnUIThread(cVar, 10000L);
                b bVar = eVar.f15746b;
                String str = bVar.f15737b;
                String str2 = bVar.f15739f;
                d dVar = new d(this, eVar);
                lf.h i10 = k.i(str);
                byte[] d = k.d(str2);
                int i11 = 0;
                if (i10 != null && d != null && k.h()) {
                    synchronized (k.v) {
                        k kVar = k.f15759x;
                        if (kVar != null) {
                            kVar.n();
                            k.f15759x = null;
                        }
                        try {
                            k kVar2 = new k(i10, str2, d);
                            k.f15759x = kVar2;
                            kVar2.f15777u = dVar;
                            g10 g10Var = g10.getInstance();
                            if (g10Var != null) {
                                g10Var.addListener(kVar2);
                            }
                            kVar2.f15766j.execute(new g(kVar2, 1));
                            AndroidUtilities.runOnUIThread(new g(kVar2, 2));
                            i11 = k.f15759x.f15765i.getLocalPort();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            k kVar3 = k.f15759x;
                            if (kVar3 != null) {
                                kVar3.n();
                                k.f15759x = null;
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

    public void L(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.f15750c;
        if (linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
            return;
        }
        Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
    }

    public void M(r rVar) {
        synchronized (this.f15748a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f15750c).remove(rVar);
                if (eVar == null) {
                    return;
                }
                ((a0.f) this.f15749b).remove(eVar.f14711a);
                eVar.f14712b.g();
                a0 a0Var = (a0) ((WeakReference) this.d).get();
                if (a0Var != null && !a0Var.j()) {
                    d0.U(a0Var.f14679l, new m4.b(a0Var, rVar, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void N(int i10) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.f15750c).drainTo(arrayList);
        Message obtain = Message.obtain(null, i10, 0, 0);
        kotlin.jvm.internal.i.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        e0.q(e0.b((id.h) this.f15748a), new bb.i(this, arrayList, null, 6));
    }

    public Bundle O(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f15750c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    public void P(View view) {
        u2 u2Var = (u2) this.d;
        if (((View) this.f15749b) == view) {
            return;
        }
        Q(null);
        View view2 = (View) this.f15749b;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(u2Var);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(u2Var);
            if (view.isAttachedToWindow()) {
                Q(view.getViewTreeObserver());
            }
        }
        this.f15749b = view;
    }

    public void Q(ViewTreeObserver viewTreeObserver) {
        h4 h4Var = (h4) this.f15748a;
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.f15750c;
        if (viewTreeObserver2 == viewTreeObserver) {
            return;
        }
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
            ((ViewTreeObserver) this.f15750c).removeOnGlobalLayoutListener(h4Var);
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(h4Var);
        }
        this.f15750c = viewTreeObserver;
    }

    public void b(Object obj, r rVar, m4.m1 m1Var, x0 x0Var) {
        synchronized (this.f15748a) {
            try {
                r t10 = t(obj);
                if (t10 == null) {
                    ((a0.f) this.f15749b).put(obj, rVar);
                    ?? obj2 = new Object();
                    obj2.f6184c = new Object();
                    obj2.d = new m(0);
                    ((a0.f) this.f15750c).put(rVar, new m4.e(obj, obj2, m1Var, x0Var));
                } else {
                    m4.e eVar = (m4.e) ((a0.f) this.f15750c).get(t10);
                    e2.d.h(eVar);
                    eVar.d = m1Var;
                    eVar.e = x0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(s sVar) {
        if (!((ArrayList) this.f15748a).contains(sVar)) {
            synchronized (((ArrayList) this.f15748a)) {
                ((ArrayList) this.f15748a).add(sVar);
            }
            sVar.v = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + sVar);
    }

    public void d(r rVar, int i10, m4.d dVar) {
        synchronized (this.f15748a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f15750c).get(rVar);
                if (eVar != null) {
                    x0 x0Var = eVar.f14715g;
                    x0Var.getClass();
                    p pVar = new p();
                    pVar.c(x0Var.f3349a);
                    pVar.b(i10);
                    eVar.f14715g = new x0(pVar.d());
                    eVar.f14713c.add(dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public t0 f() {
        String str;
        if (((String) this.f15748a) == null) {
            str = " processName";
        } else {
            str = "";
        }
        if (((Integer) this.f15749b) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.f15750c) == null) {
            str = j0.s(str, " importance");
        }
        if (((Boolean) this.d) == null) {
            str = j0.s(str, " defaultProcess");
        }
        if (str.isEmpty()) {
            return new t0((String) this.f15748a, ((Integer) this.f15749b).intValue(), ((Integer) this.f15750c).intValue(), ((Boolean) this.d).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public z0 g() {
        String str;
        if (((Integer) this.f15748a) == null) {
            str = " platform";
        } else {
            str = "";
        }
        if (((String) this.f15749b) == null) {
            str = str.concat(" version");
        }
        if (((String) this.f15750c) == null) {
            str = j0.s(str, " buildVersion");
        }
        if (((Boolean) this.d) == null) {
            str = j0.s(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new z0(((Integer) this.f15748a).intValue(), (String) this.f15749b, (String) this.f15750c, ((Boolean) this.d).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override
    public Object mo28get() {
        return new t((Executor) ((fd.a) this.f15748a).mo28get(), (s5.d) ((fd.a) this.f15749b).mo28get(), (lf.h) ((lf.h) this.f15750c).mo28get(), (t5.c) ((fd.a) this.d).mo28get(), 9);
    }

    public void h(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            z(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public String i(String str) {
        ArrayList arrayList = (ArrayList) this.f15748a;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.f15749b);
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
        if (((e) this.f15749b) != eVar) {
            return;
        }
        c cVar = (c) this.f15750c;
        if (cVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar);
            this.f15750c = null;
        }
        c cVar2 = (c) this.d;
        if (cVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar2);
            this.d = null;
        }
        synchronized (k.v) {
            try {
                k kVar = k.f15759x;
                if (kVar != null) {
                    kVar.n();
                    k.f15759x = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f15749b = null;
        eVar.f15747c.run(-1L);
        K();
    }

    public s k(String str) {
        q0 q0Var = (q0) ((HashMap) this.f15749b).get(str);
        if (q0Var != null) {
            return q0Var.f2492c;
        }
        return null;
    }

    public s l(String str) {
        for (q0 q0Var : ((HashMap) this.f15749b).values()) {
            if (q0Var != null) {
                s sVar = q0Var.f2492c;
                if (!str.equals(sVar.e)) {
                    sVar = sVar.L.f2427c.l(str);
                }
                if (sVar != null) {
                    return sVar;
                }
            }
        }
        return null;
    }

    public void m(m4.e eVar) {
        a0 a0Var = (a0) ((WeakReference) this.d).get();
        if (a0Var != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            while (atomicBoolean.get()) {
                atomicBoolean.set(false);
                m4.d dVar = (m4.d) eVar.f14713c.poll();
                if (dVar == null) {
                    eVar.f14714f = false;
                    return;
                }
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
                m4.e eVar2 = eVar;
                d0.U(a0Var.f14679l, new ki.l(a0Var, t(eVar.f14711a), new m3(this, dVar, atomicBoolean2, eVar2, atomicBoolean, 10)));
                atomicBoolean2.set(false);
                eVar = eVar2;
            }
        }
    }

    public void n(final r rVar) {
        synchronized (this.f15748a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f15750c).get(rVar);
                if (eVar == null) {
                    return;
                }
                final x0 x0Var = eVar.f14715g;
                eVar.f14715g = x0.f3347b;
                eVar.f14713c.add(new m4.d(rVar, x0Var) {
                    public final r f14704b;

                    @Override
                    public final i9.w run() {
                        a0 a0Var = (a0) ((WeakReference) oi.f.this.d).get();
                        if (a0Var != null) {
                            a0Var.p(this.f14704b);
                        }
                        return i9.u.f11058b;
                    }
                });
                if (eVar.f14714f) {
                    return;
                }
                eVar.f14714f = true;
                m(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k.e o(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.f15750c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k.e eVar = (k.e) arrayList.get(i10);
            if (eVar != null && eVar.f13116b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.f15749b, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList p() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : ((HashMap) this.f15749b).values()) {
            if (q0Var != null) {
                arrayList.add(q0Var);
            }
        }
        return arrayList;
    }

    public ArrayList q() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : ((HashMap) this.f15749b).values()) {
            if (q0Var != null) {
                arrayList.add(q0Var.f2492c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public x0 r(r rVar) {
        synchronized (this.f15748a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f15750c).get(rVar);
                if (eVar != null) {
                    return eVar.e;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public i0 s() {
        i0 v;
        synchronized (this.f15748a) {
            v = i0.v(((a0.f) this.f15749b).values());
        }
        return v;
    }

    public r t(Object obj) {
        r rVar;
        synchronized (this.f15748a) {
            rVar = (r) ((a0.f) this.f15749b).get(obj);
        }
        return rVar;
    }

    public List u() {
        ArrayList arrayList;
        if (((ArrayList) this.f15748a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f15748a)) {
            arrayList = new ArrayList((ArrayList) this.f15748a);
        }
        return arrayList;
    }

    public u0 v(r rVar) {
        synchronized (this.f15748a) {
            try {
                return ((m4.e) ((a0.f) this.f15750c).get(rVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public h1 w(r rVar) {
        synchronized (this.f15748a) {
            try {
                if (((m4.e) ((a0.f) this.f15750c).get(rVar)) != null) {
                    return null;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public v x(r rVar) {
        m4.e eVar;
        synchronized (this.f15748a) {
            eVar = (m4.e) ((a0.f) this.f15750c).get(rVar);
        }
        if (eVar != null) {
            return eVar.f14712b;
        }
        return null;
    }

    public void y(int r12, java.lang.String r13, java.util.HashMap r14) {
        throw new UnsupportedOperationException("Method not decompiled: oi.f.y(int, java.lang.String, java.util.HashMap):void");
    }

    public void z(String str, HashMap hashMap, boolean[] zArr, int i10) {
        if (i10 >= 0) {
            zArr[0] = false;
            String trim = str.trim();
            Matcher matcher = p91.f27208x0.matcher(trim);
            if (matcher.find()) {
                trim = trim.substring(matcher.group(0).length());
            } else {
                Matcher matcher2 = p91.f27209y0.matcher(trim);
                if (matcher2.find()) {
                    trim = trim.substring(matcher2.group(0).length());
                    zArr[0] = true;
                }
            }
            y(i10, trim, hashMap);
            return;
        }
        throw new Exception("recursion limit reached");
    }

    public f(int i10) {
        switch (i10) {
            case 1:
                this.f15748a = new ArrayList();
                this.f15749b = new HashMap();
                this.f15750c = new HashMap();
                return;
            default:
                this.f15748a = new ArrayDeque();
                return;
        }
    }

    public f(a0 a0Var) {
        this.f15749b = new m(0);
        this.f15750c = new m(0);
        this.f15748a = new Object();
        this.d = new WeakReference(a0Var);
    }

    public f(String str) {
        this.f15748a = new ArrayList();
        this.f15750c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.f15749b = str;
    }

    public f(a1 a1Var, f2.i iVar, of.b bVar, f2.i iVar2) {
        Object obj;
        if (a1Var != null) {
            obj = i0.v(a1Var);
        } else {
            g0 g0Var = i0.f8084b;
            obj = a1.e;
        }
        this.f15748a = obj;
        this.f15749b = iVar;
        this.f15750c = bVar;
        this.d = iVar2;
    }
}
