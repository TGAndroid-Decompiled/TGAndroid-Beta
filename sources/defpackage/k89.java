package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class k89 {
    public static final ce6 k = new ce6("RemoteMediaClient", null);
    public final abd c;
    public final wm9 d;
    public final xt6 e;
    public bhd f;
    public TaskCompletionSource g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public final Object a = new Object();
    public final q79 b = new q79(Looper.getMainLooper(), (byte) 3);

    static {
        String str = abd.v;
    }

    public k89(abd abdVar) {
        wm9 wm9Var = new wm9(this);
        this.d = wm9Var;
        this.c = abdVar;
        abdVar.h = new cf9(this, (byte) 24);
        abdVar.c = wm9Var;
        this.e = new xt6(this);
    }

    public static f0b t() {
        f0b f0bVar = new f0b(null, (byte) 1);
        f0bVar.a(new xed(new Status(17, null, null, null), (byte) 0));
        return f0bVar;
    }

    public static final void x(pfd pfdVar) {
        try {
            pfdVar.p();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            pfdVar.a(new xed(new Status(2100, null, null, null), (byte) 1));
        }
    }

    public final long a() {
        long o;
        synchronized (this.a) {
            ite.e("Must be called from the main thread.");
            o = this.c.o();
        }
        return o;
    }

    public final int b() {
        int i;
        synchronized (this.a) {
            ite.e("Must be called from the main thread.");
            f07 e = e();
            if (e != null) {
                i = e.f;
            } else {
                i = 0;
            }
        }
        return i;
    }

    public final au6 c() {
        ite.e("Must be called from the main thread.");
        f07 e = e();
        if (e == null) {
            return null;
        }
        Integer num = (Integer) e.O.get(e.x);
        if (num == null) {
            return null;
        }
        return (au6) e.H.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.a) {
            ite.e("Must be called from the main thread.");
            f07 f07Var = this.c.f;
            if (f07Var == null) {
                mediaInfo = null;
            } else {
                mediaInfo = f07Var.a;
            }
        }
        return mediaInfo;
    }

    public final f07 e() {
        f07 f07Var;
        synchronized (this.a) {
            ite.e("Must be called from the main thread.");
            f07Var = this.c.f;
        }
        return f07Var;
    }

    public final int f() {
        int i;
        synchronized (this.a) {
            ite.e("Must be called from the main thread.");
            f07 e = e();
            if (e != null) {
                i = e.e;
            } else {
                i = 1;
            }
        }
        return i;
    }

    public final long g() {
        MediaInfo mediaInfo;
        long j;
        synchronized (this.a) {
            ite.e("Must be called from the main thread.");
            f07 f07Var = this.c.f;
            if (f07Var == null) {
                mediaInfo = null;
            } else {
                mediaInfo = f07Var.a;
            }
            if (mediaInfo != null) {
                j = mediaInfo.e;
            } else {
                j = 0;
            }
        }
        return j;
    }

    public final boolean h() {
        ite.e("Must be called from the main thread.");
        if (!i()) {
            ite.e("Must be called from the main thread.");
            f07 e = e();
            if ((e == null || e.e != 5) && !m() && !l() && !k()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean i() {
        ite.e("Must be called from the main thread.");
        f07 e = e();
        if (e != null && e.e == 4) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        ite.e("Must be called from the main thread.");
        MediaInfo d = d();
        if (d != null && d.b == 2) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        ite.e("Must be called from the main thread.");
        f07 e = e();
        if (e != null && e.x != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        ite.e("Must be called from the main thread.");
        f07 e = e();
        if (e == null) {
            return false;
        }
        if (e.e == 3) {
            return true;
        }
        if (!j() || b() != 2) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        ite.e("Must be called from the main thread.");
        f07 e = e();
        if (e != null && e.e == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        ite.e("Must be called from the main thread.");
        f07 e = e();
        if (e != null && e.I) {
            return true;
        }
        return false;
    }

    public final void o(String str) {
        char c;
        JSONObject jSONObject;
        String string;
        long optLong;
        int i;
        int i2;
        f07 f07Var;
        int[] j;
        abd abdVar = this.c;
        wbd wbdVar = abdVar.o;
        wbd wbdVar2 = abdVar.n;
        wbd wbdVar3 = abdVar.j;
        List<wbd> list = abdVar.d;
        ce6 ce6Var = abdVar.a;
        ce6Var.b("message received: %s", str);
        String str2 = ce6Var.a;
        try {
            jSONObject = new JSONObject(str);
            string = jSONObject.getString("type");
            optLong = jSONObject.optLong("requestId", -1L);
            c = 1;
        } catch (JSONException e) {
            e = e;
            c = 1;
        }
        try {
            switch (string.hashCode()) {
                case -1830647528:
                    if (string.equals("LOAD_CANCELLED")) {
                        wbdVar3.b(optLong, 2101, abd.c(jSONObject));
                        return;
                    }
                    return;
                case -1790231854:
                    if (string.equals("QUEUE_ITEMS")) {
                        abdVar.s.b(optLong, 0, null);
                        abdVar.e("QUEUE_ITEMS", jSONObject);
                        if (abdVar.h != null) {
                            JSONArray jSONArray = jSONObject.getJSONArray("items");
                            au6[] au6VarArr = new au6[jSONArray.length()];
                            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                                ?? obj = new Object();
                                obj.a = new au6(jSONObject2);
                                au6VarArr[i3] = obj.j();
                            }
                            Iterator it = ((k89) abdVar.h.b).i.iterator();
                            while (it.hasNext()) {
                                ((j89) it.next()).k(au6VarArr);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case -1125000185:
                    if (string.equals("INVALID_REQUEST")) {
                        Log.w(str2, ce6Var.d("received unexpected error: Invalid Request.", new Object[0]));
                        for (wbd wbdVar4 : list) {
                            wbdVar4.b(optLong, 2001, abd.c(jSONObject));
                        }
                        return;
                    }
                    return;
                case -262628938:
                    if (string.equals("LOAD_FAILED")) {
                        wbdVar3.b(optLong, 2100, abd.c(jSONObject));
                        return;
                    }
                    return;
                case 66247144:
                    if (string.equals("ERROR")) {
                        for (wbd wbdVar5 : list) {
                            wbdVar5.b(optLong, 2100, abd.c(jSONObject));
                        }
                        if (abdVar.h != null) {
                            MediaError b = MediaError.b(jSONObject);
                            Iterator it2 = ((k89) abdVar.h.b).i.iterator();
                            while (it2.hasNext()) {
                                ((j89) it2.next()).b(b);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 154411710:
                    if (string.equals("QUEUE_CHANGE")) {
                        abdVar.t.b(optLong, 0, null);
                        abdVar.e("QUEUE_CHANGE", jSONObject);
                        if (abdVar.h != null) {
                            String string2 = jSONObject.getString("changeType");
                            int[] j2 = abd.j(jSONObject.getJSONArray("itemIds"));
                            int optInt = jSONObject.optInt("insertBefore", 0);
                            if (j2 != null) {
                                switch (string2.hashCode()) {
                                    case -2130463047:
                                        if (string2.equals("INSERT")) {
                                            Iterator it3 = ((k89) abdVar.h.b).i.iterator();
                                            while (it3.hasNext()) {
                                                ((j89) it3.next()).j(j2, optInt);
                                            }
                                            return;
                                        }
                                        return;
                                    case -1881281404:
                                        if (string2.equals("REMOVE")) {
                                            Iterator it4 = ((k89) abdVar.h.b).i.iterator();
                                            while (it4.hasNext()) {
                                                ((j89) it4.next()).l(j2);
                                            }
                                            return;
                                        }
                                        return;
                                    case -1785516855:
                                        if (string2.equals("UPDATE")) {
                                            int[] j3 = abd.j(jSONObject.getJSONArray("itemIds"));
                                            ite.i(j3, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                            JSONArray optJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                            if (optJSONArray != null) {
                                                ArrayList c2 = qe1.c(j3);
                                                int optInt2 = jSONObject.optInt("insertBefore", 0);
                                                int[] j4 = abd.j(optJSONArray);
                                                ite.h(j4);
                                                ArrayList c3 = qe1.c(j4);
                                                Iterator it5 = ((k89) abdVar.h.b).i.iterator();
                                                while (it5.hasNext()) {
                                                    ((j89) it5.next()).m(c2, c3, optInt2);
                                                }
                                                return;
                                            }
                                            Iterator it6 = ((k89) abdVar.h.b).i.iterator();
                                            while (it6.hasNext()) {
                                                ((j89) it6.next()).i(j3);
                                            }
                                            return;
                                        }
                                        return;
                                    case 1122976047:
                                        if (string2.equals("ITEMS_CHANGE")) {
                                            Iterator it7 = ((k89) abdVar.h.b).i.iterator();
                                            while (it7.hasNext()) {
                                                ((j89) it7.next()).n(j2);
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 431600379:
                    if (string.equals("INVALID_PLAYER_STATE")) {
                        Log.w(str2, ce6Var.d("received unexpected error: Invalid Player State.", new Object[0]));
                        for (wbd wbdVar6 : list) {
                            wbdVar6.b(optLong, 2100, abd.c(jSONObject));
                        }
                        return;
                    }
                    return;
                case 823510221:
                    if (string.equals("MEDIA_STATUS")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("status");
                        if (jSONArray2.length() > 0) {
                            JSONObject jSONObject3 = jSONArray2.getJSONObject(0);
                            boolean c4 = wbdVar3.c(optLong);
                            if ((wbdVar2.d() && !wbdVar2.c(optLong)) || (wbdVar.d() && !wbdVar.c(optLong))) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            if (!c4 && (f07Var = abdVar.f) != null) {
                                i2 = f07Var.b(jSONObject3, i);
                            } else {
                                f07 f07Var2 = new f07(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                f07Var2.b(jSONObject3, 0);
                                abdVar.f = f07Var2;
                                abdVar.e = SystemClock.elapsedRealtime();
                                i2 = 127;
                            }
                            if ((i2 & 1) != 0) {
                                abdVar.e = SystemClock.elapsedRealtime();
                                abdVar.i = -1;
                                abdVar.i();
                            }
                            if ((i2 & 2) != 0) {
                                abdVar.e = SystemClock.elapsedRealtime();
                                abdVar.i();
                            }
                            if ((i2 & 128) != 0) {
                                abdVar.e = SystemClock.elapsedRealtime();
                            }
                            if ((i2 & 4) != 0) {
                                abdVar.f();
                            }
                            if ((i2 & 8) != 0) {
                                abdVar.h();
                            }
                            if ((i2 & 16) != 0) {
                                abdVar.g();
                            }
                            if ((i2 & 32) != 0) {
                                abdVar.e = SystemClock.elapsedRealtime();
                                cf9 cf9Var = abdVar.h;
                                if (cf9Var != null) {
                                    k89 k89Var = (k89) cf9Var.b;
                                    Iterator it8 = k89Var.h.iterator();
                                    if (!it8.hasNext()) {
                                        Iterator it9 = k89Var.i.iterator();
                                        while (it9.hasNext()) {
                                            ((j89) it9.next()).a();
                                        }
                                    } else {
                                        throw kt6.l(it8);
                                    }
                                }
                            }
                            if ((i2 & 64) != 0) {
                                abdVar.e = SystemClock.elapsedRealtime();
                                abdVar.i();
                            }
                        } else {
                            abdVar.f = null;
                            abdVar.i();
                            abdVar.f();
                            abdVar.h();
                            abdVar.g();
                        }
                        for (wbd wbdVar7 : list) {
                            wbdVar7.b(optLong, 0, null);
                        }
                        return;
                    }
                    return;
                case 2107149050:
                    if (string.equals("QUEUE_ITEM_IDS")) {
                        abdVar.r.b(optLong, 0, null);
                        abdVar.e("QUEUE_ITEM_IDS", jSONObject);
                        if (abdVar.h != null && (j = abd.j(jSONObject.getJSONArray("itemIds"))) != null) {
                            Iterator it10 = ((k89) abdVar.h.b).i.iterator();
                            while (it10.hasNext()) {
                                ((j89) it10.next()).i(j);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (JSONException e2) {
            e = e2;
            Object[] objArr = new Object[2];
            objArr[0] = e.getMessage();
            objArr[c] = str;
            Log.w(str2, ce6Var.d("Message is malformed (%s); ignoring: %s", objArr));
        }
    }

    public final void p(j89 j89Var) {
        ite.e("Must be called from the main thread.");
        if (j89Var != null) {
            this.i.add(j89Var);
        }
    }

    public final BasePendingResult q(nw6 nw6Var) {
        ite.e("Must be called from the main thread.");
        if (!w()) {
            return t();
        }
        qbd qbdVar = new qbd(this, nw6Var, (byte) 2);
        x(qbdVar);
        return qbdVar;
    }

    public final void r() {
        ite.e("Must be called from the main thread.");
        int f = f();
        if (f != 4 && f != 2) {
            ite.e("Must be called from the main thread.");
            if (!w()) {
                t();
                return;
            } else {
                x(new z7d(this, (byte) 6));
                return;
            }
        }
        ite.e("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new z7d(this, (byte) 5));
        }
    }

    public final int s() {
        au6 c;
        if (d() != null && h()) {
            if (i()) {
                return 6;
            }
            if (m()) {
                return 3;
            }
            if (l()) {
                return 2;
            }
            if (k() && (c = c()) != null && c.a != null) {
                return 6;
            }
        }
        return 0;
    }

    public final void u() {
        bhd bhdVar = this.f;
        if (bhdVar == null) {
            return;
        }
        ite.e("Must be called from the main thread.");
        String str = this.c.b;
        qe1.b(str);
        synchronized (bhdVar.D) {
            bhdVar.D.put(str, this);
        }
        bib b = cib.b();
        b.a = new aed(bhdVar, str, this);
        b.d = (char) 8413;
        bhdVar.e(1, b.a());
        ite.e("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new z7d(this, (byte) 0));
        }
    }

    public final void v(bhd bhdVar) {
        k89 k89Var;
        bhd bhdVar2 = this.f;
        if (bhdVar2 != bhdVar) {
            if (bhdVar2 != null) {
                this.c.m();
                this.e.b();
                ite.e("Must be called from the main thread.");
                String str = this.c.b;
                if (!TextUtils.isEmpty(str)) {
                    synchronized (bhdVar2.D) {
                        k89Var = (k89) bhdVar2.D.remove(str);
                    }
                    bib b = cib.b();
                    b.a = new aed(bhdVar2, k89Var, str);
                    b.d = (char) 8414;
                    bhdVar2.e(1, b.a());
                    this.d.b = null;
                    this.b.removeCallbacksAndMessages(null);
                } else {
                    u36.j("Channel namespace cannot be null or empty");
                    return;
                }
            }
            this.f = bhdVar;
            if (bhdVar != null) {
                this.d.b = bhdVar;
            }
        }
    }

    public final boolean w() {
        if (this.f != null) {
            return true;
        }
        return false;
    }
}
