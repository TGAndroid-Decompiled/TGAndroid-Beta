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
public final class v99 {
    public static final he6 k = new he6("RemoteMediaClient", null);
    public final rdd c;
    public final ko9 d;
    public final bu6 e;
    public rjd f;
    public TaskCompletionSource g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public final Object a = new Object();
    public final b99 b = new b99(Looper.getMainLooper(), (byte) 3);

    static {
        String str = rdd.v;
    }

    public v99(rdd rddVar) {
        ko9 ko9Var = new ko9(this);
        this.d = ko9Var;
        this.c = rddVar;
        rddVar.h = new i09(this, (byte) 29);
        rddVar.c = ko9Var;
        this.e = new bu6(this);
    }

    public static e2b t() {
        e2b e2bVar = new e2b(null, (byte) 1);
        e2bVar.a(new ohd(new Status(17, null, null, null), (byte) 0));
        return e2bVar;
    }

    public static final void x(fid fidVar) {
        try {
            fidVar.p();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            fidVar.a(new ohd(new Status(2100, null, null, null), (byte) 1));
        }
    }

    public final long a() {
        long o;
        synchronized (this.a) {
            xve.e("Must be called from the main thread.");
            o = this.c.o();
        }
        return o;
    }

    public final int b() {
        int i;
        synchronized (this.a) {
            xve.e("Must be called from the main thread.");
            j07 e = e();
            if (e != null) {
                i = e.f;
            } else {
                i = 0;
            }
        }
        return i;
    }

    public final eu6 c() {
        xve.e("Must be called from the main thread.");
        j07 e = e();
        if (e == null) {
            return null;
        }
        Integer num = (Integer) e.O.get(e.x);
        if (num == null) {
            return null;
        }
        return (eu6) e.H.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.a) {
            xve.e("Must be called from the main thread.");
            j07 j07Var = this.c.f;
            if (j07Var == null) {
                mediaInfo = null;
            } else {
                mediaInfo = j07Var.a;
            }
        }
        return mediaInfo;
    }

    public final j07 e() {
        j07 j07Var;
        synchronized (this.a) {
            xve.e("Must be called from the main thread.");
            j07Var = this.c.f;
        }
        return j07Var;
    }

    public final int f() {
        int i;
        synchronized (this.a) {
            xve.e("Must be called from the main thread.");
            j07 e = e();
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
            xve.e("Must be called from the main thread.");
            j07 j07Var = this.c.f;
            if (j07Var == null) {
                mediaInfo = null;
            } else {
                mediaInfo = j07Var.a;
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
        xve.e("Must be called from the main thread.");
        if (!i()) {
            xve.e("Must be called from the main thread.");
            j07 e = e();
            if ((e == null || e.e != 5) && !m() && !l() && !k()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean i() {
        xve.e("Must be called from the main thread.");
        j07 e = e();
        if (e != null && e.e == 4) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        xve.e("Must be called from the main thread.");
        MediaInfo d = d();
        if (d != null && d.b == 2) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        xve.e("Must be called from the main thread.");
        j07 e = e();
        if (e != null && e.x != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        xve.e("Must be called from the main thread.");
        j07 e = e();
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
        xve.e("Must be called from the main thread.");
        j07 e = e();
        if (e != null && e.e == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        xve.e("Must be called from the main thread.");
        j07 e = e();
        if (e != null && e.I) {
            return true;
        }
        return false;
    }

    public final void o(String str) {
        char c;
        int i;
        int i2;
        j07 j07Var;
        int[] j;
        rdd rddVar = this.c;
        ned nedVar = rddVar.o;
        ned nedVar2 = rddVar.n;
        ned nedVar3 = rddVar.j;
        List<ned> list = rddVar.d;
        he6 he6Var = rddVar.a;
        he6Var.b("message received: %s", str);
        String str2 = he6Var.a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            long optLong = jSONObject.optLong("requestId", -1L);
            c = 1;
            try {
                switch (string.hashCode()) {
                    case -1830647528:
                        if (string.equals("LOAD_CANCELLED")) {
                            nedVar3.b(optLong, 2101, rdd.c(jSONObject));
                            return;
                        }
                        return;
                    case -1790231854:
                        if (string.equals("QUEUE_ITEMS")) {
                            rddVar.s.b(optLong, 0, null);
                            rddVar.e("QUEUE_ITEMS", jSONObject);
                            if (rddVar.h != null) {
                                JSONArray jSONArray = jSONObject.getJSONArray("items");
                                eu6[] eu6VarArr = new eu6[jSONArray.length()];
                                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                    eu6VarArr[i3] = new kj4(jSONArray.getJSONObject(i3)).v();
                                }
                                Iterator it = ((v99) rddVar.h.b).i.iterator();
                                while (it.hasNext()) {
                                    ((u99) it.next()).k(eu6VarArr);
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case -1125000185:
                        if (string.equals("INVALID_REQUEST")) {
                            Log.w(str2, he6Var.d("received unexpected error: Invalid Request.", new Object[0]));
                            for (ned nedVar4 : list) {
                                nedVar4.b(optLong, 2001, rdd.c(jSONObject));
                            }
                            return;
                        }
                        return;
                    case -262628938:
                        if (string.equals("LOAD_FAILED")) {
                            nedVar3.b(optLong, 2100, rdd.c(jSONObject));
                            return;
                        }
                        return;
                    case 66247144:
                        if (string.equals("ERROR")) {
                            for (ned nedVar5 : list) {
                                nedVar5.b(optLong, 2100, rdd.c(jSONObject));
                            }
                            if (rddVar.h != null) {
                                MediaError b = MediaError.b(jSONObject);
                                Iterator it2 = ((v99) rddVar.h.b).i.iterator();
                                while (it2.hasNext()) {
                                    ((u99) it2.next()).b(b);
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 154411710:
                        if (string.equals("QUEUE_CHANGE")) {
                            rddVar.t.b(optLong, 0, null);
                            rddVar.e("QUEUE_CHANGE", jSONObject);
                            if (rddVar.h != null) {
                                String string2 = jSONObject.getString("changeType");
                                int[] j2 = rdd.j(jSONObject.getJSONArray("itemIds"));
                                int optInt = jSONObject.optInt("insertBefore", 0);
                                if (j2 != null) {
                                    switch (string2.hashCode()) {
                                        case -2130463047:
                                            if (string2.equals("INSERT")) {
                                                Iterator it3 = ((v99) rddVar.h.b).i.iterator();
                                                while (it3.hasNext()) {
                                                    ((u99) it3.next()).j(j2, optInt);
                                                }
                                                return;
                                            }
                                            return;
                                        case -1881281404:
                                            if (string2.equals("REMOVE")) {
                                                Iterator it4 = ((v99) rddVar.h.b).i.iterator();
                                                while (it4.hasNext()) {
                                                    ((u99) it4.next()).l(j2);
                                                }
                                                return;
                                            }
                                            return;
                                        case -1785516855:
                                            if (string2.equals("UPDATE")) {
                                                int[] j3 = rdd.j(jSONObject.getJSONArray("itemIds"));
                                                xve.i(j3, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                                JSONArray optJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                                if (optJSONArray != null) {
                                                    ArrayList c2 = qd1.c(j3);
                                                    int optInt2 = jSONObject.optInt("insertBefore", 0);
                                                    int[] j4 = rdd.j(optJSONArray);
                                                    xve.h(j4);
                                                    ArrayList c3 = qd1.c(j4);
                                                    Iterator it5 = ((v99) rddVar.h.b).i.iterator();
                                                    while (it5.hasNext()) {
                                                        ((u99) it5.next()).m(c2, c3, optInt2);
                                                    }
                                                    return;
                                                }
                                                Iterator it6 = ((v99) rddVar.h.b).i.iterator();
                                                while (it6.hasNext()) {
                                                    ((u99) it6.next()).i(j3);
                                                }
                                                return;
                                            }
                                            return;
                                        case 1122976047:
                                            if (string2.equals("ITEMS_CHANGE")) {
                                                Iterator it7 = ((v99) rddVar.h.b).i.iterator();
                                                while (it7.hasNext()) {
                                                    ((u99) it7.next()).n(j2);
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
                            Log.w(str2, he6Var.d("received unexpected error: Invalid Player State.", new Object[0]));
                            for (ned nedVar6 : list) {
                                nedVar6.b(optLong, 2100, rdd.c(jSONObject));
                            }
                            return;
                        }
                        return;
                    case 823510221:
                        if (string.equals("MEDIA_STATUS")) {
                            JSONArray jSONArray2 = jSONObject.getJSONArray("status");
                            if (jSONArray2.length() > 0) {
                                JSONObject jSONObject2 = jSONArray2.getJSONObject(0);
                                boolean c4 = nedVar3.c(optLong);
                                if ((nedVar2.d() && !nedVar2.c(optLong)) || (nedVar.d() && !nedVar.c(optLong))) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                if (!c4 && (j07Var = rddVar.f) != null) {
                                    i2 = j07Var.b(jSONObject2, i);
                                } else {
                                    j07 j07Var2 = new j07(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                    j07Var2.b(jSONObject2, 0);
                                    rddVar.f = j07Var2;
                                    rddVar.e = SystemClock.elapsedRealtime();
                                    i2 = 127;
                                }
                                if ((i2 & 1) != 0) {
                                    rddVar.e = SystemClock.elapsedRealtime();
                                    rddVar.i = -1;
                                    rddVar.i();
                                }
                                if ((i2 & 2) != 0) {
                                    rddVar.e = SystemClock.elapsedRealtime();
                                    rddVar.i();
                                }
                                if ((i2 & 128) != 0) {
                                    rddVar.e = SystemClock.elapsedRealtime();
                                }
                                if ((i2 & 4) != 0) {
                                    rddVar.f();
                                }
                                if ((i2 & 8) != 0) {
                                    rddVar.h();
                                }
                                if ((i2 & 16) != 0) {
                                    rddVar.g();
                                }
                                if ((i2 & 32) != 0) {
                                    rddVar.e = SystemClock.elapsedRealtime();
                                    i09 i09Var = rddVar.h;
                                    if (i09Var != null) {
                                        v99 v99Var = (v99) i09Var.b;
                                        Iterator it8 = v99Var.h.iterator();
                                        if (!it8.hasNext()) {
                                            Iterator it9 = v99Var.i.iterator();
                                            while (it9.hasNext()) {
                                                ((u99) it9.next()).a();
                                            }
                                        } else {
                                            throw qu6.l(it8);
                                        }
                                    }
                                }
                                if ((i2 & 64) != 0) {
                                    rddVar.e = SystemClock.elapsedRealtime();
                                    rddVar.i();
                                }
                            } else {
                                rddVar.f = null;
                                rddVar.i();
                                rddVar.f();
                                rddVar.h();
                                rddVar.g();
                            }
                            for (ned nedVar7 : list) {
                                nedVar7.b(optLong, 0, null);
                            }
                            return;
                        }
                        return;
                    case 2107149050:
                        if (string.equals("QUEUE_ITEM_IDS")) {
                            rddVar.r.b(optLong, 0, null);
                            rddVar.e("QUEUE_ITEM_IDS", jSONObject);
                            if (rddVar.h != null && (j = rdd.j(jSONObject.getJSONArray("itemIds"))) != null) {
                                Iterator it10 = ((v99) rddVar.h.b).i.iterator();
                                while (it10.hasNext()) {
                                    ((u99) it10.next()).i(j);
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } catch (JSONException e) {
                e = e;
                Object[] objArr = new Object[2];
                objArr[0] = e.getMessage();
                objArr[c] = str;
                Log.w(str2, he6Var.d("Message is malformed (%s); ignoring: %s", objArr));
            }
        } catch (JSONException e2) {
            e = e2;
            c = 1;
        }
    }

    public final void p(u99 u99Var) {
        xve.e("Must be called from the main thread.");
        if (u99Var != null) {
            this.i.add(u99Var);
        }
    }

    public final BasePendingResult q(sw6 sw6Var) {
        xve.e("Must be called from the main thread.");
        if (!w()) {
            return t();
        }
        hed hedVar = new hed(this, sw6Var, (byte) 2);
        x(hedVar);
        return hedVar;
    }

    public final void r() {
        xve.e("Must be called from the main thread.");
        int f = f();
        if (f != 4 && f != 2) {
            xve.e("Must be called from the main thread.");
            if (!w()) {
                t();
                return;
            } else {
                x(new qad(this, (byte) 6));
                return;
            }
        }
        xve.e("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new qad(this, (byte) 5));
        }
    }

    public final int s() {
        eu6 c;
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
        rjd rjdVar = this.f;
        if (rjdVar == null) {
            return;
        }
        xve.e("Must be called from the main thread.");
        String str = this.c.b;
        qd1.b(str);
        synchronized (rjdVar.D) {
            rjdVar.D.put(str, this);
        }
        wjb b = xjb.b();
        b.a = new rgd(rjdVar, str, this);
        b.d = (char) 8413;
        rjdVar.e(1, b.a());
        xve.e("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new qad(this, (byte) 0));
        }
    }

    public final void v(rjd rjdVar) {
        v99 v99Var;
        rjd rjdVar2 = this.f;
        if (rjdVar2 != rjdVar) {
            if (rjdVar2 != null) {
                this.c.m();
                this.e.b();
                xve.e("Must be called from the main thread.");
                String str = this.c.b;
                if (!TextUtils.isEmpty(str)) {
                    synchronized (rjdVar2.D) {
                        v99Var = (v99) rjdVar2.D.remove(str);
                    }
                    wjb b = xjb.b();
                    b.a = new rgd(rjdVar2, v99Var, str);
                    b.d = (char) 8414;
                    rjdVar2.e(1, b.a());
                    this.d.b = null;
                    this.b.removeCallbacksAndMessages(null);
                } else {
                    lq5.j("Channel namespace cannot be null or empty");
                    return;
                }
            }
            this.f = rjdVar;
            if (rjdVar != null) {
                this.d.b = rjdVar;
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
