package oi;

import a0.m;
import ae.g0;
import ai.n3;
import ai.v2;
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
import ci.f4;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.internal.vision.e2;
import e2.d0;
import e9.a1;
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
import l.a0;
import m.f3;
import m4.c0;
import m4.e1;
import m4.i1;
import m4.j1;
import m4.r;
import m4.w;
import n4.y;
import n7.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.ma1;
import org.telegram.ui.Components.z10;
import org.telegram.ui.web.k1;
import org.telegram.ui.web.l1;
import sc.v;
import y9.t0;
public final class f implements n5.b {
    public static volatile f f16925e;
    public Object f16926a;
    public Object f16927b;
    public Object f16928c;
    public Object d;

    public f(File file) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f16927b = arrayList;
        HashMap hashMap2 = new HashMap();
        this.f16928c = hashMap2;
        long[] jArr = new long[1];
        this.d = jArr;
        this.f16926a = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(J(bufferedReader));
        l1 l1Var = (l1) hashMap.get("content-type");
        String str = l1Var == null ? null : (String) l1Var.f43328b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            k1 k1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (k1Var != null) {
                        k1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(k1Var);
                        l1 l1Var2 = (l1) k1Var.f43319a.get("content-location");
                        hashMap2.put(l1Var2 == null ? null : l1Var2.f43327a, k1Var);
                    }
                    k1Var = new k1();
                    k1Var.f43320b = (File) this.f16926a;
                    k1Var.f43319a.putAll(J(bufferedReader));
                    k1Var.f43321c = jArr[0];
                }
            }
            if (k1Var != null && k1Var.f43321c != 0 && k1Var.d != 0) {
                arrayList.add(k1Var);
                l1 l1Var3 = (l1) k1Var.f43319a.get("content-location");
                hashMap2.put(l1Var3 != null ? l1Var3.f43327a : null, k1Var);
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
        l1 l1Var = new l1();
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
                    l1Var.f43328b.put(trim2, trim3);
                } else {
                    l1Var.f43327a = trim;
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), l1Var);
    }

    public boolean A(r rVar) {
        boolean z10;
        synchronized (this.f16926a) {
            if (((a0.f) this.f16928c).get(rVar) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean B(r rVar, int i10) {
        m4.e eVar;
        synchronized (this.f16926a) {
            eVar = (m4.e) ((a0.f) this.f16928c).get(rVar);
        }
        c0 c0Var = (c0) ((WeakReference) this.d).get();
        if (eVar != null && eVar.f15765e.a(i10) && c0Var != null && c0Var.f15748t.t().a(i10)) {
            return true;
        }
        return false;
    }

    public boolean C(r rVar, int i10) {
        m4.e eVar;
        boolean z10;
        synchronized (this.f16926a) {
            eVar = (m4.e) ((a0.f) this.f16928c).get(rVar);
        }
        if (eVar != null) {
            j1 j1Var = eVar.d;
            j1Var.getClass();
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.a("Use contains(Command) for custom command", z10);
            for (i1 i1Var : j1Var.f15867a) {
                if (i1Var.f15862a == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean D(r rVar, i1 i1Var) {
        m4.e eVar;
        synchronized (this.f16926a) {
            eVar = (m4.e) ((a0.f) this.f16928c).get(rVar);
        }
        if (eVar != null) {
            m0 m0Var = eVar.d.f15867a;
            i1Var.getClass();
            if (m0Var.contains(i1Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void E(q0 q0Var) {
        s sVar = q0Var.f2767c;
        String str = sVar.f2792e;
        HashMap hashMap = (HashMap) this.f16927b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(sVar.f2792e, q0Var);
        if (k0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + sVar);
        }
    }

    public void F(q0 q0Var) {
        HashMap hashMap = (HashMap) this.f16927b;
        s sVar = q0Var.f2767c;
        if (sVar.S) {
            ((n0) this.d).f(sVar);
        }
        if (hashMap.get(sVar.f2792e) == q0Var && ((q0) hashMap.put(sVar.f2792e, null)) != null && k0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public boolean G(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f16926a).onActionItemClicked(o(aVar), new l.r((Context) this.f16927b, (l0.a) menuItem));
    }

    public boolean H(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f16926a;
        k.e o9 = o(aVar);
        m mVar = (m) this.d;
        Menu menu2 = (Menu) mVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) this.f16927b, (l.k) menu);
            mVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(o9, menu2);
    }

    public cf.f I(String str) {
        if (str != null) {
            ze.d dVar = new ze.d((ArrayList) this.f16926a, (df.b) this.f16928c, (ArrayList) this.f16927b);
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
            dVar.f(dVar.f54615n);
            df.a K = dVar.f54611j.K(new z0(27, dVar.f54612k, dVar.f54614m));
            for (ef.a aVar : dVar.f54616o) {
                aVar.g(K);
            }
            cf.f fVar = (cf.f) dVar.f54613l.f54601b;
            Iterator it = ((ArrayList) this.d).iterator();
            if (!it.hasNext()) {
                return fVar;
            }
            throw a1.g.k(it);
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
                            sb2 = a1.g.v(trim3);
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
        boolean z10;
        if (((e) this.f16927b) == null) {
            e eVar = (e) ((ArrayDeque) this.f16926a).pollFirst();
            this.f16927b = eVar;
            if (eVar != null) {
                c cVar = new c(this, eVar, 0);
                this.f16928c = cVar;
                AndroidUtilities.runOnUIThread(cVar, 10000L);
                b bVar = eVar.f16923b;
                String str = bVar.f16913b;
                String str2 = bVar.f16916f;
                d dVar = new d(this, eVar);
                f3 i10 = k.i(str);
                byte[] d = k.d(str2);
                int i11 = 0;
                if (i10 != null && d != null) {
                    try {
                        z10 = o.a("WEB_MESSAGE_LISTENER");
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                        z10 = false;
                    }
                    if (z10) {
                        synchronized (k.f16937y) {
                            k kVar = k.A;
                            if (kVar != null) {
                                kVar.o();
                                k.A = null;
                            }
                            try {
                                k kVar2 = new k(i10, str2, d);
                                k.A = kVar2;
                                kVar2.f16959x = dVar;
                                z10 z10Var = z10.getInstance();
                                if (z10Var != null) {
                                    z10Var.addListener(kVar2);
                                }
                                kVar2.f16946j.execute(new g(kVar2, 1));
                                AndroidUtilities.runOnUIThread(new g(kVar2, 2));
                                i11 = k.A.f16945i.getLocalPort();
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                k kVar3 = k.A;
                                if (kVar3 != null) {
                                    kVar3.o();
                                    k.A = null;
                                }
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
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.f16928c;
        if (linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
            return;
        }
        Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
    }

    public void M(r rVar) {
        synchronized (this.f16926a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f16928c).remove(rVar);
                if (eVar == null) {
                    return;
                }
                ((a0.f) this.f16927b).remove(eVar.f15762a);
                eVar.f15763b.g();
                c0 c0Var = (c0) ((WeakReference) this.d).get();
                if (c0Var != null && !c0Var.j()) {
                    d0.T(c0Var.f15740l, new m4.b(c0Var, rVar, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void N(int i10) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.f16928c).drainTo(arrayList);
        Message obtain = Message.obtain(null, i10, 0, 0);
        kotlin.jvm.internal.i.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        g0.q(g0.b((jd.h) this.f16926a), new bb.j(this, arrayList, null, 6));
    }

    public Bundle O(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f16928c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    public void P(View view) {
        v2 v2Var = (v2) this.d;
        if (((View) this.f16927b) == view) {
            return;
        }
        Q(null);
        View view2 = (View) this.f16927b;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(v2Var);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(v2Var);
            if (view.isAttachedToWindow()) {
                Q(view.getViewTreeObserver());
            }
        }
        this.f16927b = view;
    }

    public void Q(ViewTreeObserver viewTreeObserver) {
        f4 f4Var = (f4) this.f16926a;
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.f16928c;
        if (viewTreeObserver2 == viewTreeObserver) {
            return;
        }
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
            ((ViewTreeObserver) this.f16928c).removeOnGlobalLayoutListener(f4Var);
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(f4Var);
        }
        this.f16928c = viewTreeObserver;
    }

    public void b(Object obj, r rVar, j1 j1Var, x0 x0Var) {
        synchronized (this.f16926a) {
            try {
                r t10 = t(obj);
                if (t10 == null) {
                    ((a0.f) this.f16927b).put(obj, rVar);
                    ?? obj2 = new Object();
                    obj2.f6694c = new Object();
                    obj2.d = new m(0);
                    ((a0.f) this.f16928c).put(rVar, new m4.e(obj, obj2, j1Var, x0Var));
                } else {
                    m4.e eVar = (m4.e) ((a0.f) this.f16928c).get(t10);
                    e2.d.h(eVar);
                    eVar.d = j1Var;
                    eVar.f15765e = x0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(s sVar) {
        if (!((ArrayList) this.f16926a).contains(sVar)) {
            synchronized (((ArrayList) this.f16926a)) {
                ((ArrayList) this.f16926a).add(sVar);
            }
            sVar.v = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + sVar);
    }

    public void d(r rVar, int i10, m4.d dVar) {
        synchronized (this.f16926a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f16928c).get(rVar);
                if (eVar != null) {
                    x0 x0Var = eVar.f15767g;
                    x0Var.getClass();
                    p pVar = new p();
                    pVar.c(x0Var.f3684a);
                    pVar.b(i10);
                    eVar.f15767g = new x0(pVar.d());
                    eVar.f15764c.add(dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public t0 f() {
        String str;
        if (((String) this.f16926a) == null) {
            str = " processName";
        } else {
            str = "";
        }
        if (((Integer) this.f16927b) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.f16928c) == null) {
            str = v.v(str, " importance");
        }
        if (((Boolean) this.d) == null) {
            str = v.v(str, " defaultProcess");
        }
        if (str.isEmpty()) {
            return new t0((String) this.f16926a, ((Integer) this.f16927b).intValue(), ((Integer) this.f16928c).intValue(), ((Boolean) this.d).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public y9.z0 g() {
        String str;
        if (((Integer) this.f16926a) == null) {
            str = " platform";
        } else {
            str = "";
        }
        if (((String) this.f16927b) == null) {
            str = str.concat(" version");
        }
        if (((String) this.f16928c) == null) {
            str = v.v(str, " buildVersion");
        }
        if (((Boolean) this.d) == null) {
            str = v.v(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new y9.z0(((Integer) this.f16926a).intValue(), (String) this.f16927b, (String) this.f16928c, ((Boolean) this.d).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override
    public Object mo27get() {
        return new com.google.firebase.messaging.s((Executor) ((gd.a) this.f16926a).mo27get(), (s5.d) ((gd.a) this.f16927b).mo27get(), (f3) ((f3) this.f16928c).mo27get(), (t5.c) ((gd.a) this.d).mo27get(), 9);
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
        ArrayList arrayList = (ArrayList) this.f16926a;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.f16927b);
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
        if (((e) this.f16927b) != eVar) {
            return;
        }
        c cVar = (c) this.f16928c;
        if (cVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar);
            this.f16928c = null;
        }
        c cVar2 = (c) this.d;
        if (cVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar2);
            this.d = null;
        }
        synchronized (k.f16937y) {
            try {
                k kVar = k.A;
                if (kVar != null) {
                    kVar.o();
                    k.A = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f16927b = null;
        eVar.f16924c.run(-1L);
        K();
    }

    public s k(String str) {
        q0 q0Var = (q0) ((HashMap) this.f16927b).get(str);
        if (q0Var != null) {
            return q0Var.f2767c;
        }
        return null;
    }

    public s l(String str) {
        for (q0 q0Var : ((HashMap) this.f16927b).values()) {
            if (q0Var != null) {
                s sVar = q0Var.f2767c;
                if (!str.equals(sVar.f2792e)) {
                    sVar = sVar.L.f2697c.l(str);
                }
                if (sVar != null) {
                    return sVar;
                }
            }
        }
        return null;
    }

    public void m(m4.e eVar) {
        c0 c0Var = (c0) ((WeakReference) this.d).get();
        if (c0Var != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            while (atomicBoolean.get()) {
                atomicBoolean.set(false);
                m4.d dVar = (m4.d) eVar.f15764c.poll();
                if (dVar == null) {
                    eVar.f15766f = false;
                    return;
                }
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
                m4.e eVar2 = eVar;
                d0.T(c0Var.f15740l, new w(c0Var, t(eVar.f15762a), new n3(this, dVar, atomicBoolean2, eVar2, atomicBoolean, 10)));
                atomicBoolean2.set(false);
                eVar = eVar2;
            }
        }
    }

    public void n(final r rVar) {
        synchronized (this.f16926a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f16928c).get(rVar);
                if (eVar == null) {
                    return;
                }
                final x0 x0Var = eVar.f15767g;
                eVar.f15767g = x0.f3682b;
                eVar.f15764c.add(new m4.d(rVar, x0Var) {
                    public final r f15730b;

                    @Override
                    public final i9.w run() {
                        c0 c0Var = (c0) ((WeakReference) oi.f.this.d).get();
                        if (c0Var != null) {
                            c0Var.p(this.f15730b);
                        }
                        return i9.u.f12078b;
                    }
                });
                if (eVar.f15766f) {
                    return;
                }
                eVar.f15766f = true;
                m(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k.e o(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.f16928c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k.e eVar = (k.e) arrayList.get(i10);
            if (eVar != null && eVar.f14281b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.f16927b, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList p() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : ((HashMap) this.f16927b).values()) {
            if (q0Var != null) {
                arrayList.add(q0Var);
            }
        }
        return arrayList;
    }

    public ArrayList q() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : ((HashMap) this.f16927b).values()) {
            if (q0Var != null) {
                arrayList.add(q0Var.f2767c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public x0 r(r rVar) {
        synchronized (this.f16926a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f16928c).get(rVar);
                if (eVar != null) {
                    return eVar.f15765e;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public i0 s() {
        i0 v;
        synchronized (this.f16926a) {
            v = i0.v(((a0.f) this.f16927b).values());
        }
        return v;
    }

    public r t(Object obj) {
        r rVar;
        synchronized (this.f16926a) {
            rVar = (r) ((a0.f) this.f16927b).get(obj);
        }
        return rVar;
    }

    public List u() {
        ArrayList arrayList;
        if (((ArrayList) this.f16926a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f16926a)) {
            arrayList = new ArrayList((ArrayList) this.f16926a);
        }
        return arrayList;
    }

    public u0 v(r rVar) {
        synchronized (this.f16926a) {
            try {
                return ((m4.e) ((a0.f) this.f16928c).get(rVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public e1 w(r rVar) {
        synchronized (this.f16926a) {
            try {
                if (((m4.e) ((a0.f) this.f16928c).get(rVar)) != null) {
                    return null;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public com.google.android.gms.common.api.internal.v x(r rVar) {
        m4.e eVar;
        synchronized (this.f16926a) {
            eVar = (m4.e) ((a0.f) this.f16928c).get(rVar);
        }
        if (eVar != null) {
            return eVar.f15763b;
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
            Matcher matcher = ma1.f28500x0.matcher(trim);
            if (matcher.find()) {
                trim = trim.substring(matcher.group(0).length());
            } else {
                Matcher matcher2 = ma1.f28501y0.matcher(trim);
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
                this.f16926a = new ArrayList();
                this.f16927b = new HashMap();
                this.f16928c = new HashMap();
                return;
            default:
                this.f16926a = new ArrayDeque();
                return;
        }
    }

    public f(c0 c0Var) {
        this.f16927b = new m(0);
        this.f16928c = new m(0);
        this.f16926a = new Object();
        this.d = new WeakReference(c0Var);
    }

    public f(String str) {
        this.f16926a = new ArrayList();
        this.f16928c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.f16927b = str;
    }

    public f(a1 a1Var, f2.j jVar, y yVar, f2.j jVar2) {
        Object obj;
        if (a1Var != null) {
            obj = i0.v(a1Var);
        } else {
            e9.g0 g0Var = i0.f8749b;
            obj = a1.f8712e;
        }
        this.f16926a = obj;
        this.f16927b = jVar;
        this.f16928c = yVar;
        this.d = jVar2;
    }
}
