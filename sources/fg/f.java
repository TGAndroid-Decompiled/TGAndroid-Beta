package fg;

import a0.l;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.i0;
import androidx.fragment.app.l0;
import androidx.fragment.app.o0;
import b2.p;
import b2.u0;
import b2.x0;
import bi.i2;
import bi.z2;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.internal.vision.e2;
import di.h4;
import e2.d0;
import e9.a1;
import e9.g0;
import e9.m0;
import e9.q;
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
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ji.b5;
import l.b0;
import l.s;
import m2.t;
import m4.a0;
import m4.h1;
import m4.l1;
import m4.r;
import n7.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.g10;
import org.telegram.ui.web.m1;
import org.telegram.ui.web.n1;
import y9.t0;
import zd.e0;
public final class f implements n5.b {
    public static volatile f f9491e;
    public Object f9492a;
    public Object f9493b;
    public Object f9494c;
    public Object d;

    public f(File file) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f9493b = arrayList;
        HashMap hashMap2 = new HashMap();
        this.f9494c = hashMap2;
        long[] jArr = new long[1];
        this.d = jArr;
        this.f9492a = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(K(bufferedReader));
        n1 n1Var = (n1) hashMap.get("content-type");
        String str = n1Var == null ? null : (String) n1Var.f42187b.get("boundary");
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
                        n1 n1Var2 = (n1) m1Var.f42179a.get("content-location");
                        hashMap2.put(n1Var2 == null ? null : n1Var2.f42186a, m1Var);
                    }
                    m1Var = new m1();
                    m1Var.f42180b = (File) this.f9492a;
                    m1Var.f42179a.putAll(K(bufferedReader));
                    m1Var.f42181c = jArr[0];
                }
            }
            if (m1Var != null && m1Var.f42181c != 0 && m1Var.d != 0) {
                arrayList.add(m1Var);
                n1 n1Var3 = (n1) m1Var.f42179a.get("content-location");
                hashMap2.put(n1Var3 != null ? n1Var3.f42186a : null, m1Var);
            }
        }
        bufferedReader.close();
    }

    public static void O(long j3, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j3) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            hashMap.remove(arrayList.get(i10));
        }
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
                    n1Var.f42187b.put(trim2, trim3);
                } else {
                    n1Var.f42186a = trim;
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), n1Var);
    }

    public void A(String str, HashMap hashMap, boolean[] zArr, int i10) {
        if (i10 >= 0) {
            zArr[0] = false;
            String trim = str.trim();
            Matcher matcher = b91.f24615x0.matcher(trim);
            if (matcher.find()) {
                trim = trim.substring(matcher.group(0).length());
            } else {
                Matcher matcher2 = b91.f24616y0.matcher(trim);
                if (matcher2.find()) {
                    trim = trim.substring(matcher2.group(0).length());
                    zArr[0] = true;
                }
            }
            z(i10, trim, hashMap);
            return;
        }
        throw new Exception("recursion limit reached");
    }

    public boolean B(r rVar) {
        boolean z10;
        synchronized (this.f9492a) {
            if (((a0.f) this.f9494c).get(rVar) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean C(r rVar, int i10) {
        m4.e eVar;
        synchronized (this.f9492a) {
            eVar = (m4.e) ((a0.f) this.f9494c).get(rVar);
        }
        a0 a0Var = (a0) ((WeakReference) this.d).get();
        if (eVar != null && eVar.f15870e.a(i10) && a0Var != null && a0Var.f15843t.t().a(i10)) {
            return true;
        }
        return false;
    }

    public boolean D(r rVar, int i10) {
        m4.e eVar;
        boolean z10;
        synchronized (this.f9492a) {
            eVar = (m4.e) ((a0.f) this.f9494c).get(rVar);
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
            for (l1 l1Var : m1Var.f16005a) {
                if (l1Var.f15998a == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean E(r rVar, l1 l1Var) {
        m4.e eVar;
        synchronized (this.f9492a) {
            eVar = (m4.e) ((a0.f) this.f9494c).get(rVar);
        }
        if (eVar != null) {
            m0 m0Var = eVar.d.f16005a;
            l1Var.getClass();
            if (m0Var.contains(l1Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void F(o0 o0Var) {
        androidx.fragment.app.r rVar = o0Var.f1507c;
        String str = rVar.f1533e;
        HashMap hashMap = (HashMap) this.f9493b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(rVar.f1533e, o0Var);
        if (i0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + rVar);
        }
    }

    public void G(o0 o0Var) {
        HashMap hashMap = (HashMap) this.f9493b;
        androidx.fragment.app.r rVar = o0Var.f1507c;
        if (rVar.S) {
            ((l0) this.d).f(rVar);
        }
        if (hashMap.get(rVar.f1533e) == o0Var && ((o0) hashMap.put(rVar.f1533e, null)) != null && i0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + rVar);
        }
    }

    public boolean H(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f9492a).onActionItemClicked(p(aVar), new s((Context) this.f9493b, (l0.a) menuItem));
    }

    public boolean I(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f9492a;
        k.e p5 = p(aVar);
        l lVar = (l) this.d;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new b0((Context) this.f9493b, (l.l) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(p5, menu2);
    }

    public bf.f J(String str) {
        if (str != null) {
            ye.d dVar = new ye.d((ArrayList) this.f9492a, (cf.b) this.f9494c, (ArrayList) this.f9493b);
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
            dVar.f(dVar.f49996n);
            cf.a y12 = dVar.f49992j.y1(new z0(27, dVar.f49993k, dVar.f49995m));
            for (df.a aVar : dVar.f49997o) {
                aVar.g(y12);
            }
            bf.f fVar = (bf.f) dVar.f49994l.f49982b;
            Iterator it = ((ArrayList) this.d).iterator();
            if (!it.hasNext()) {
                return fVar;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
        throw new NullPointerException("input must not be null");
    }

    public HashMap K(BufferedReader bufferedReader) {
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

    public void L() {
        if (((e) this.f9493b) == null) {
            e eVar = (e) ((ArrayDeque) this.f9492a).pollFirst();
            this.f9493b = eVar;
            if (eVar != null) {
                c cVar = new c(this, eVar, 0);
                this.f9494c = cVar;
                AndroidUtilities.runOnUIThread(cVar, 10000L);
                b bVar = eVar.f9489b;
                String str = bVar.f9479b;
                String str2 = bVar.f9482f;
                d dVar = new d(this, eVar);
                String i10 = k.i(str);
                byte[] d = k.d(str2);
                int i11 = 0;
                if (!TextUtils.isEmpty(i10) && d != null && k.h()) {
                    synchronized (k.f9503t) {
                        k kVar = k.v;
                        if (kVar != null) {
                            kVar.m();
                            k.v = null;
                        }
                        try {
                            k kVar2 = new k(i10, str2, d);
                            k.v = kVar2;
                            kVar2.f9521s = dVar;
                            g10 g10Var = g10.getInstance();
                            if (g10Var != null) {
                                g10Var.addListener(kVar2);
                            }
                            kVar2.h.execute(new g(kVar2, 2));
                            AndroidUtilities.runOnUIThread(new g(kVar2, 1));
                            i11 = k.v.f9510g.getLocalPort();
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
                    k(eVar);
                }
            }
        }
    }

    public void M(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.f9494c;
        if (linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
            return;
        }
        Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
    }

    public void N(r rVar) {
        synchronized (this.f9492a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f9494c).remove(rVar);
                if (eVar == null) {
                    return;
                }
                ((a0.f) this.f9493b).remove(eVar.f15867a);
                eVar.f15868b.g();
                a0 a0Var = (a0) ((WeakReference) this.d).get();
                if (a0Var != null && !a0Var.j()) {
                    d0.U(a0Var.f15835l, new m4.b(a0Var, rVar, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m2.b P(List list) {
        m2.b bVar;
        HashMap hashMap = (HashMap) this.f9494c;
        ArrayList f7 = f(list);
        if (f7.size() < 2) {
            return (m2.b) q.k(f7, null);
        }
        Collections.sort(f7, new a4.e(22));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((m2.b) f7.get(0)).f15755c;
        int i12 = 0;
        while (true) {
            if (i12 >= f7.size()) {
                break;
            }
            m2.b bVar2 = (m2.b) f7.get(i12);
            if (i11 != bVar2.f15755c) {
                if (arrayList.size() == 1) {
                    return (m2.b) f7.get(0);
                }
            } else {
                arrayList.add(new Pair(bVar2.f15754b, Integer.valueOf(bVar2.d)));
                i12++;
            }
        }
        m2.b bVar3 = (m2.b) hashMap.get(arrayList);
        if (bVar3 == null) {
            List subList = f7.subList(0, arrayList.size());
            int i13 = 0;
            for (int i14 = 0; i14 < subList.size(); i14++) {
                i13 += ((m2.b) subList.get(i14)).d;
            }
            int nextInt = ((Random) this.d).nextInt(i13);
            int i15 = 0;
            while (true) {
                if (i10 < subList.size()) {
                    bVar = (m2.b) subList.get(i10);
                    i15 += bVar.d;
                    if (nextInt < i15) {
                        break;
                    }
                    i10++;
                } else {
                    bVar = (m2.b) q.l(subList);
                    break;
                }
            }
            hashMap.put(arrayList, bVar);
            return bVar;
        }
        return bVar3;
    }

    public void Q(int i10) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.f9494c).drainTo(arrayList);
        Message obtain = Message.obtain(null, i10, 0, 0);
        kotlin.jvm.internal.i.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        e0.q(e0.b((id.h) this.f9492a), new bb.j(this, arrayList, null, 6));
    }

    public Bundle R(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f9494c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    public void S(View view) {
        i2 i2Var = (i2) this.d;
        if (((View) this.f9493b) == view) {
            return;
        }
        T(null);
        View view2 = (View) this.f9493b;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(i2Var);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(i2Var);
            if (view.isAttachedToWindow()) {
                T(view.getViewTreeObserver());
            }
        }
        this.f9493b = view;
    }

    public void T(ViewTreeObserver viewTreeObserver) {
        h4 h4Var = (h4) this.f9492a;
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.f9494c;
        if (viewTreeObserver2 == viewTreeObserver) {
            return;
        }
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
            ((ViewTreeObserver) this.f9494c).removeOnGlobalLayoutListener(h4Var);
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(h4Var);
        }
        this.f9494c = viewTreeObserver;
    }

    public void b(Object obj, r rVar, m4.m1 m1Var, x0 x0Var) {
        synchronized (this.f9492a) {
            try {
                r u10 = u(obj);
                if (u10 == null) {
                    ((a0.f) this.f9493b).put(obj, rVar);
                    ?? obj2 = new Object();
                    obj2.f5117c = new Object();
                    obj2.d = new l(0);
                    ((a0.f) this.f9494c).put(rVar, new m4.e(obj, obj2, m1Var, x0Var));
                } else {
                    m4.e eVar = (m4.e) ((a0.f) this.f9494c).get(u10);
                    e2.d.h(eVar);
                    eVar.d = m1Var;
                    eVar.f15870e = x0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(androidx.fragment.app.r rVar) {
        if (!((ArrayList) this.f9492a).contains(rVar)) {
            synchronized (((ArrayList) this.f9492a)) {
                ((ArrayList) this.f9492a).add(rVar);
            }
            rVar.v = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + rVar);
    }

    public void d(r rVar, int i10, m4.d dVar) {
        synchronized (this.f9492a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f9494c).get(rVar);
                if (eVar != null) {
                    x0 x0Var = eVar.f15872g;
                    x0Var.getClass();
                    p pVar = new p();
                    pVar.c(x0Var.f2413a);
                    pVar.b(i10);
                    eVar.f15872g = new x0(pVar.d());
                    eVar.f15869c.add(dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ArrayList f(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.f9492a;
        O(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.f9493b;
        O(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            m2.b bVar = (m2.b) list.get(i10);
            if (!hashMap.containsKey(bVar.f15754b) && !hashMap2.containsKey(Integer.valueOf(bVar.f15755c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public t0 g() {
        String str;
        if (((String) this.f9492a) == null) {
            str = " processName";
        } else {
            str = "";
        }
        if (((Integer) this.f9493b) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.f9494c) == null) {
            str = p6.t(str, " importance");
        }
        if (((Boolean) this.d) == null) {
            str = p6.t(str, " defaultProcess");
        }
        if (str.isEmpty()) {
            return new t0((String) this.f9492a, ((Integer) this.f9493b).intValue(), ((Integer) this.f9494c).intValue(), ((Boolean) this.d).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override
    public Object mo28get() {
        return new com.google.firebase.messaging.s((Executor) ((fd.a) this.f9492a).mo28get(), (s5.d) ((fd.a) this.f9493b).mo28get(), (t) ((t) this.f9494c).mo28get(), (t5.c) ((fd.a) this.d).mo28get(), 9);
    }

    public y9.z0 h() {
        String str;
        if (((Integer) this.f9492a) == null) {
            str = " platform";
        } else {
            str = "";
        }
        if (((String) this.f9493b) == null) {
            str = str.concat(" version");
        }
        if (((String) this.f9494c) == null) {
            str = p6.t(str, " buildVersion");
        }
        if (((Boolean) this.d) == null) {
            str = p6.t(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new y9.z0(((Integer) this.f9492a).intValue(), (String) this.f9493b, (String) this.f9494c, ((Boolean) this.d).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void i(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            A(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public String j(String str) {
        ArrayList arrayList = (ArrayList) this.f9492a;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.f9493b);
            if (matcher.find()) {
                String group = matcher.group();
                if (!arrayList.contains(group)) {
                    arrayList.add(group + ";");
                }
                i(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e7) {
            arrayList.clear();
            FileLog.e(e7);
        }
        return TextUtils.join("", arrayList);
    }

    public void k(e eVar) {
        if (((e) this.f9493b) != eVar) {
            return;
        }
        c cVar = (c) this.f9494c;
        if (cVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar);
            this.f9494c = null;
        }
        c cVar2 = (c) this.d;
        if (cVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar2);
            this.d = null;
        }
        synchronized (k.f9503t) {
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
        this.f9493b = null;
        eVar.f9490c.run(-1L);
        L();
    }

    public androidx.fragment.app.r l(String str) {
        o0 o0Var = (o0) ((HashMap) this.f9493b).get(str);
        if (o0Var != null) {
            return o0Var.f1507c;
        }
        return null;
    }

    public androidx.fragment.app.r m(String str) {
        for (o0 o0Var : ((HashMap) this.f9493b).values()) {
            if (o0Var != null) {
                androidx.fragment.app.r rVar = o0Var.f1507c;
                if (!str.equals(rVar.f1533e)) {
                    rVar = rVar.L.f1438c.m(str);
                }
                if (rVar != null) {
                    return rVar;
                }
            }
        }
        return null;
    }

    public void n(m4.e eVar) {
        a0 a0Var = (a0) ((WeakReference) this.d).get();
        if (a0Var != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            while (atomicBoolean.get()) {
                atomicBoolean.set(false);
                m4.d dVar = (m4.d) eVar.f15869c.poll();
                if (dVar == null) {
                    eVar.f15871f = false;
                    return;
                }
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
                m4.e eVar2 = eVar;
                d0.U(a0Var.f15835l, new b5(a0Var, u(eVar.f15867a), new z2(this, dVar, atomicBoolean2, eVar2, atomicBoolean, 10)));
                atomicBoolean2.set(false);
                eVar = eVar2;
            }
        }
    }

    public void o(final r rVar) {
        synchronized (this.f9492a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f9494c).get(rVar);
                if (eVar == null) {
                    return;
                }
                final x0 x0Var = eVar.f15872g;
                eVar.f15872g = x0.f2411b;
                eVar.f15869c.add(new m4.d(rVar, x0Var) {
                    public final r f15860b;

                    @Override
                    public final i9.w run() {
                        a0 a0Var = (a0) ((WeakReference) fg.f.this.d).get();
                        if (a0Var != null) {
                            a0Var.p(this.f15860b);
                        }
                        return i9.u.f11925b;
                    }
                });
                if (eVar.f15871f) {
                    return;
                }
                eVar.f15871f = true;
                n(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k.e p(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.f9494c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k.e eVar = (k.e) arrayList.get(i10);
            if (eVar != null && eVar.f14392b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.f9493b, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList q() {
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : ((HashMap) this.f9493b).values()) {
            if (o0Var != null) {
                arrayList.add(o0Var);
            }
        }
        return arrayList;
    }

    public ArrayList r() {
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : ((HashMap) this.f9493b).values()) {
            if (o0Var != null) {
                arrayList.add(o0Var.f1507c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public x0 s(r rVar) {
        synchronized (this.f9492a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f9494c).get(rVar);
                if (eVar != null) {
                    return eVar.f15870e;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public e9.i0 t() {
        e9.i0 v;
        synchronized (this.f9492a) {
            v = e9.i0.v(((a0.f) this.f9493b).values());
        }
        return v;
    }

    public r u(Object obj) {
        r rVar;
        synchronized (this.f9492a) {
            rVar = (r) ((a0.f) this.f9493b).get(obj);
        }
        return rVar;
    }

    public List v() {
        ArrayList arrayList;
        if (((ArrayList) this.f9492a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f9492a)) {
            arrayList = new ArrayList((ArrayList) this.f9492a);
        }
        return arrayList;
    }

    public u0 w(r rVar) {
        synchronized (this.f9492a) {
            try {
                return ((m4.e) ((a0.f) this.f9494c).get(rVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public h1 x(r rVar) {
        synchronized (this.f9492a) {
            try {
                if (((m4.e) ((a0.f) this.f9494c).get(rVar)) != null) {
                    return null;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public v y(r rVar) {
        m4.e eVar;
        synchronized (this.f9492a) {
            eVar = (m4.e) ((a0.f) this.f9494c).get(rVar);
        }
        if (eVar != null) {
            return eVar.f15868b;
        }
        return null;
    }

    public void z(int r12, java.lang.String r13, java.util.HashMap r14) {
        throw new UnsupportedOperationException("Method not decompiled: fg.f.z(int, java.lang.String, java.util.HashMap):void");
    }

    public f(int i10) {
        switch (i10) {
            case 1:
                this.f9492a = new ArrayList();
                this.f9493b = new HashMap();
                this.f9494c = new HashMap();
                return;
            case 5:
                Random random = new Random();
                this.f9494c = new HashMap();
                this.d = random;
                this.f9492a = new HashMap();
                this.f9493b = new HashMap();
                return;
            default:
                this.f9492a = new ArrayDeque();
                return;
        }
    }

    public f(a0 a0Var) {
        this.f9493b = new l(0);
        this.f9494c = new l(0);
        this.f9492a = new Object();
        this.d = new WeakReference(a0Var);
    }

    public f(String str) {
        this.f9492a = new ArrayList();
        this.f9494c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.f9493b = str;
    }

    public f(a1 a1Var, f2.j jVar, pf.b bVar, f2.j jVar2) {
        Object obj;
        if (a1Var != null) {
            obj = e9.i0.v(a1Var);
        } else {
            g0 g0Var = e9.i0.f8957b;
            obj = a1.f8920e;
        }
        this.f9492a = obj;
        this.f9493b = jVar;
        this.f9494c = bVar;
        this.d = jVar2;
    }
}
