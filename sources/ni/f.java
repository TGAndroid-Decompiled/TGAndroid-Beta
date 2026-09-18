package ni;

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
import e9.g0;
import e9.i0;
import e9.m0;
import gg.x1;
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
import m4.a0;
import m4.i1;
import m4.n1;
import m4.r;
import n7.a1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.g10;
import org.telegram.ui.web.l1;
import org.telegram.ui.web.m1;
import y9.t0;
import y9.z0;
import zd.e0;
public final class f implements n5.b {
    public static volatile f e;
    public Object f15267a;
    public Object f15268b;
    public Object f15269c;
    public Object d;

    public f(File file) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f15268b = arrayList;
        HashMap hashMap2 = new HashMap();
        this.f15269c = hashMap2;
        long[] jArr = new long[1];
        this.d = jArr;
        this.f15267a = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(J(bufferedReader));
        m1 m1Var = (m1) hashMap.get("content-type");
        String str = m1Var == null ? null : (String) m1Var.f38876b.get("boundary");
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
                        m1 m1Var2 = (m1) l1Var.f38868a.get("content-location");
                        hashMap2.put(m1Var2 == null ? null : m1Var2.f38875a, l1Var);
                    }
                    l1Var = new l1();
                    l1Var.f38869b = (File) this.f15267a;
                    l1Var.f38868a.putAll(J(bufferedReader));
                    l1Var.f38870c = jArr[0];
                }
            }
            if (l1Var != null && l1Var.f38870c != 0 && l1Var.d != 0) {
                arrayList.add(l1Var);
                m1 m1Var3 = (m1) l1Var.f38868a.get("content-location");
                hashMap2.put(m1Var3 != null ? m1Var3.f38875a : null, l1Var);
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
                        trim3 = e2.i(1, 1, trim3);
                    }
                    m1Var.f38876b.put(trim2, trim3);
                } else {
                    m1Var.f38875a = trim;
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), m1Var);
    }

    public boolean A(r rVar) {
        boolean z10;
        synchronized (this.f15267a) {
            if (((a0.f) this.f15269c).get(rVar) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean B(r rVar, int i10) {
        m4.e eVar;
        synchronized (this.f15267a) {
            eVar = (m4.e) ((a0.f) this.f15269c).get(rVar);
        }
        a0 a0Var = (a0) ((WeakReference) this.d).get();
        if (eVar != null && eVar.e.a(i10) && a0Var != null && a0Var.f14476t.t().a(i10)) {
            return true;
        }
        return false;
    }

    public boolean C(r rVar, int i10) {
        m4.e eVar;
        boolean z10;
        synchronized (this.f15267a) {
            eVar = (m4.e) ((a0.f) this.f15269c).get(rVar);
        }
        if (eVar != null) {
            n1 n1Var = eVar.d;
            n1Var.getClass();
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.a("Use contains(Command) for custom command", z10);
            for (m4.m1 m1Var : n1Var.f14637a) {
                if (m1Var.f14627a == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean D(r rVar, m4.m1 m1Var) {
        m4.e eVar;
        synchronized (this.f15267a) {
            eVar = (m4.e) ((a0.f) this.f15269c).get(rVar);
        }
        if (eVar != null) {
            m0 m0Var = eVar.d.f14637a;
            m1Var.getClass();
            if (m0Var.contains(m1Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void E(q0 q0Var) {
        s sVar = q0Var.f2492c;
        String str = sVar.e;
        HashMap hashMap = (HashMap) this.f15268b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(sVar.e, q0Var);
        if (k0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + sVar);
        }
    }

    public void F(q0 q0Var) {
        HashMap hashMap = (HashMap) this.f15268b;
        s sVar = q0Var.f2492c;
        if (sVar.S) {
            ((n0) this.d).f(sVar);
        }
        if (hashMap.get(sVar.e) == q0Var && ((q0) hashMap.put(sVar.e, null)) != null && k0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public boolean G(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f15267a).onActionItemClicked(o(aVar), new l.r((Context) this.f15268b, (l0.a) menuItem));
    }

    public boolean H(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f15267a;
        k.e o9 = o(aVar);
        m mVar = (m) this.d;
        Menu menu2 = (Menu) mVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) this.f15268b, (l.k) menu);
            mVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(o9, menu2);
    }

    public bf.f I(String str) {
        if (str != null) {
            ye.d dVar = new ye.d((ArrayList) this.f15267a, (cf.b) this.f15269c, (ArrayList) this.f15268b);
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
            dVar.f(dVar.f46757n);
            cf.a F1 = dVar.f46753j.F1(new a1(27, dVar.f46754k, dVar.f46756m));
            for (df.a aVar : dVar.f46758o) {
                aVar.g(F1);
            }
            bf.f fVar = (bf.f) dVar.f46755l.f46744b;
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
        if (((e) this.f15268b) == null) {
            e eVar = (e) ((ArrayDeque) this.f15267a).pollFirst();
            this.f15268b = eVar;
            if (eVar != null) {
                c cVar = new c(this, eVar, 0);
                this.f15269c = cVar;
                AndroidUtilities.runOnUIThread(cVar, 10000L);
                b bVar = eVar.f15265b;
                String str = bVar.f15256b;
                String str2 = bVar.f15258f;
                d dVar = new d(this, eVar);
                lf.i i10 = k.i(str);
                byte[] d = k.d(str2);
                int i11 = 0;
                if (i10 != null && d != null && k.h()) {
                    synchronized (k.v) {
                        k kVar = k.f15278x;
                        if (kVar != null) {
                            kVar.n();
                            k.f15278x = null;
                        }
                        try {
                            k kVar2 = new k(i10, str2, d);
                            k.f15278x = kVar2;
                            kVar2.f15296u = dVar;
                            g10 g10Var = g10.getInstance();
                            if (g10Var != null) {
                                g10Var.addListener(kVar2);
                            }
                            kVar2.f15285j.execute(new g(kVar2, 1));
                            AndroidUtilities.runOnUIThread(new g(kVar2, 2));
                            i11 = k.f15278x.f15284i.getLocalPort();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            k kVar3 = k.f15278x;
                            if (kVar3 != null) {
                                kVar3.n();
                                k.f15278x = null;
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
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.f15269c;
        if (linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
            return;
        }
        Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
    }

    public void M(r rVar) {
        synchronized (this.f15267a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f15269c).remove(rVar);
                if (eVar == null) {
                    return;
                }
                ((a0.f) this.f15268b).remove(eVar.f14503a);
                eVar.f14504b.g();
                a0 a0Var = (a0) ((WeakReference) this.d).get();
                if (a0Var != null && !a0Var.j()) {
                    d0.U(a0Var.f14468l, new m4.b(a0Var, rVar, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void N(int i10) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.f15269c).drainTo(arrayList);
        Message obtain = Message.obtain(null, i10, 0, 0);
        kotlin.jvm.internal.i.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        e0.q(e0.b((id.h) this.f15267a), new bb.i(this, arrayList, null, 6));
    }

    public Bundle O(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f15269c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    public void P(View view) {
        u2 u2Var = (u2) this.d;
        if (((View) this.f15268b) == view) {
            return;
        }
        Q(null);
        View view2 = (View) this.f15268b;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(u2Var);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(u2Var);
            if (view.isAttachedToWindow()) {
                Q(view.getViewTreeObserver());
            }
        }
        this.f15268b = view;
    }

    public void Q(ViewTreeObserver viewTreeObserver) {
        h4 h4Var = (h4) this.f15267a;
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.f15269c;
        if (viewTreeObserver2 == viewTreeObserver) {
            return;
        }
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
            ((ViewTreeObserver) this.f15269c).removeOnGlobalLayoutListener(h4Var);
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(h4Var);
        }
        this.f15269c = viewTreeObserver;
    }

    public void b(Object obj, r rVar, n1 n1Var, x0 x0Var) {
        synchronized (this.f15267a) {
            try {
                r t10 = t(obj);
                if (t10 == null) {
                    ((a0.f) this.f15268b).put(obj, rVar);
                    ?? obj2 = new Object();
                    obj2.f6183c = new Object();
                    obj2.d = new m(0);
                    ((a0.f) this.f15269c).put(rVar, new m4.e(obj, obj2, n1Var, x0Var));
                } else {
                    m4.e eVar = (m4.e) ((a0.f) this.f15269c).get(t10);
                    e2.d.h(eVar);
                    eVar.d = n1Var;
                    eVar.e = x0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(s sVar) {
        if (!((ArrayList) this.f15267a).contains(sVar)) {
            synchronized (((ArrayList) this.f15267a)) {
                ((ArrayList) this.f15267a).add(sVar);
            }
            sVar.v = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + sVar);
    }

    public void d(r rVar, int i10, m4.d dVar) {
        synchronized (this.f15267a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f15269c).get(rVar);
                if (eVar != null) {
                    x0 x0Var = eVar.f14507g;
                    x0Var.getClass();
                    p pVar = new p();
                    pVar.c(x0Var.f3349a);
                    pVar.b(i10);
                    eVar.f14507g = new x0(pVar.d());
                    eVar.f14505c.add(dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public t0 f() {
        String str;
        if (((String) this.f15267a) == null) {
            str = " processName";
        } else {
            str = "";
        }
        if (((Integer) this.f15268b) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.f15269c) == null) {
            str = p6.t(str, " importance");
        }
        if (((Boolean) this.d) == null) {
            str = p6.t(str, " defaultProcess");
        }
        if (str.isEmpty()) {
            return new t0((String) this.f15267a, ((Integer) this.f15268b).intValue(), ((Integer) this.f15269c).intValue(), ((Boolean) this.d).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public z0 g() {
        String str;
        if (((Integer) this.f15267a) == null) {
            str = " platform";
        } else {
            str = "";
        }
        if (((String) this.f15268b) == null) {
            str = str.concat(" version");
        }
        if (((String) this.f15269c) == null) {
            str = p6.t(str, " buildVersion");
        }
        if (((Boolean) this.d) == null) {
            str = p6.t(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new z0(((Integer) this.f15267a).intValue(), (String) this.f15268b, (String) this.f15269c, ((Boolean) this.d).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override
    public Object mo28get() {
        return new t((Executor) ((fd.a) this.f15267a).mo28get(), (s5.d) ((fd.a) this.f15268b).mo28get(), (lf.i) ((lf.i) this.f15269c).mo28get(), (t5.c) ((fd.a) this.d).mo28get(), 9);
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
        ArrayList arrayList = (ArrayList) this.f15267a;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.f15268b);
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
        if (((e) this.f15268b) != eVar) {
            return;
        }
        c cVar = (c) this.f15269c;
        if (cVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar);
            this.f15269c = null;
        }
        c cVar2 = (c) this.d;
        if (cVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar2);
            this.d = null;
        }
        synchronized (k.v) {
            try {
                k kVar = k.f15278x;
                if (kVar != null) {
                    kVar.n();
                    k.f15278x = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f15268b = null;
        eVar.f15266c.run(-1L);
        K();
    }

    public s k(String str) {
        q0 q0Var = (q0) ((HashMap) this.f15268b).get(str);
        if (q0Var != null) {
            return q0Var.f2492c;
        }
        return null;
    }

    public s l(String str) {
        for (q0 q0Var : ((HashMap) this.f15268b).values()) {
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
                m4.d dVar = (m4.d) eVar.f14505c.poll();
                if (dVar == null) {
                    eVar.f14506f = false;
                    return;
                }
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
                m4.e eVar2 = eVar;
                d0.U(a0Var.f14468l, new x1(a0Var, t(eVar.f14503a), new m3(this, dVar, atomicBoolean2, eVar2, atomicBoolean, 10)));
                atomicBoolean2.set(false);
                eVar = eVar2;
            }
        }
    }

    public void n(final r rVar) {
        synchronized (this.f15267a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f15269c).get(rVar);
                if (eVar == null) {
                    return;
                }
                final x0 x0Var = eVar.f14507g;
                eVar.f14507g = x0.f3347b;
                eVar.f14505c.add(new m4.d(rVar, x0Var) {
                    public final r f14494b;

                    @Override
                    public final i9.w run() {
                        a0 a0Var = (a0) ((WeakReference) ni.f.this.d).get();
                        if (a0Var != null) {
                            a0Var.p(this.f14494b);
                        }
                        return i9.u.f11057b;
                    }
                });
                if (eVar.f14506f) {
                    return;
                }
                eVar.f14506f = true;
                m(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k.e o(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.f15269c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k.e eVar = (k.e) arrayList.get(i10);
            if (eVar != null && eVar.f13115b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.f15268b, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList p() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : ((HashMap) this.f15268b).values()) {
            if (q0Var != null) {
                arrayList.add(q0Var);
            }
        }
        return arrayList;
    }

    public ArrayList q() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : ((HashMap) this.f15268b).values()) {
            if (q0Var != null) {
                arrayList.add(q0Var.f2492c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public x0 r(r rVar) {
        synchronized (this.f15267a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f15269c).get(rVar);
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
        synchronized (this.f15267a) {
            v = i0.v(((a0.f) this.f15268b).values());
        }
        return v;
    }

    public r t(Object obj) {
        r rVar;
        synchronized (this.f15267a) {
            rVar = (r) ((a0.f) this.f15268b).get(obj);
        }
        return rVar;
    }

    public List u() {
        ArrayList arrayList;
        if (((ArrayList) this.f15267a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f15267a)) {
            arrayList = new ArrayList((ArrayList) this.f15267a);
        }
        return arrayList;
    }

    public u0 v(r rVar) {
        synchronized (this.f15267a) {
            try {
                return ((m4.e) ((a0.f) this.f15269c).get(rVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public i1 w(r rVar) {
        synchronized (this.f15267a) {
            try {
                if (((m4.e) ((a0.f) this.f15269c).get(rVar)) != null) {
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
        synchronized (this.f15267a) {
            eVar = (m4.e) ((a0.f) this.f15269c).get(rVar);
        }
        if (eVar != null) {
            return eVar.f14504b;
        }
        return null;
    }

    public void y(int r12, java.lang.String r13, java.util.HashMap r14) {
        throw new UnsupportedOperationException("Method not decompiled: ni.f.y(int, java.lang.String, java.util.HashMap):void");
    }

    public void z(String str, HashMap hashMap, boolean[] zArr, int i10) {
        if (i10 >= 0) {
            zArr[0] = false;
            String trim = str.trim();
            Matcher matcher = d91.f23264x0.matcher(trim);
            if (matcher.find()) {
                trim = trim.substring(matcher.group(0).length());
            } else {
                Matcher matcher2 = d91.f23265y0.matcher(trim);
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
                this.f15267a = new ArrayList();
                this.f15268b = new HashMap();
                this.f15269c = new HashMap();
                return;
            default:
                this.f15267a = new ArrayDeque();
                return;
        }
    }

    public f(a0 a0Var) {
        this.f15268b = new m(0);
        this.f15269c = new m(0);
        this.f15267a = new Object();
        this.d = new WeakReference(a0Var);
    }

    public f(String str) {
        this.f15267a = new ArrayList();
        this.f15269c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.f15268b = str;
    }

    public f(e9.a1 a1Var, f2.i iVar, of.b bVar, f2.i iVar2) {
        Object obj;
        if (a1Var != null) {
            obj = i0.v(a1Var);
        } else {
            g0 g0Var = i0.f8084b;
            obj = e9.a1.e;
        }
        this.f15267a = obj;
        this.f15268b = iVar;
        this.f15269c = bVar;
        this.d = iVar2;
    }
}
