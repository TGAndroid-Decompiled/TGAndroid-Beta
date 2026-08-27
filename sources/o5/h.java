package o5;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import c2.t0;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import m5.f0;
import m5.g0;
import m5.r;
import n2.b0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class h implements m5.f {

    public static final r5.b f19330k = new r5.b("RemoteMediaClient", null);

    public final Object f19331a;

    public final t0 f19332b;

    public final r5.n f19333c;
    public final j9.a d;

    public final c f19334e;

    public g0 f19335f;

    public TaskCompletionSource f19336g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();

    public final CopyOnWriteArrayList f19337i = new CopyOnWriteArrayList();

    public final ConcurrentHashMap f19338j;

    static {
        String str = r5.n.v;
    }

    public h(r5.n nVar) {
        new ConcurrentHashMap();
        this.f19338j = new ConcurrentHashMap();
        this.f19331a = new Object();
        this.f19332b = new t0(Looper.getMainLooper(), 1);
        j9.a aVar = new j9.a(this);
        this.d = aVar;
        this.f19333c = nVar;
        nVar.h = new b0(this, 4);
        nVar.f46806c = aVar;
        this.f19334e = new c(this);
    }

    public static u t() {
        u uVar = new u(null, 1);
        uVar.a(new m(new Status(17, null, null, null), 0));
        return uVar;
    }

    public static final void x(n nVar) {
        try {
            nVar.p();
        } catch (IllegalArgumentException e9) {
            throw e9;
        } catch (Throwable unused) {
            nVar.a(new m(new Status(2100, null, null, null), 1));
        }
    }

    public final long a() {
        long jO;
        synchronized (this.f19331a) {
            y5.l.e("Must be called from the main thread.");
            jO = this.f19333c.o();
        }
        return jO;
    }

    public final int b() {
        int i10;
        synchronized (this.f19331a) {
            try {
                y5.l.e("Must be called from the main thread.");
                r rVarE = e();
                i10 = rVarE != null ? rVarE.f17836f : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i10;
    }

    public final m5.p c() {
        y5.l.e("Must be called from the main thread.");
        r rVarE = e();
        if (rVarE == null) {
            return null;
        }
        Integer num = (Integer) rVarE.J.get(rVarE.f17840w);
        if (num == null) {
            return null;
        }
        return (m5.p) rVarE.C.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.f19331a) {
            y5.l.e("Must be called from the main thread.");
            r rVar = this.f19333c.f46782f;
            mediaInfo = rVar == null ? null : rVar.f17832a;
        }
        return mediaInfo;
    }

    public final r e() {
        r rVar;
        synchronized (this.f19331a) {
            y5.l.e("Must be called from the main thread.");
            rVar = this.f19333c.f46782f;
        }
        return rVar;
    }

    public final int f() {
        int i10;
        synchronized (this.f19331a) {
            try {
                y5.l.e("Must be called from the main thread.");
                r rVarE = e();
                i10 = rVarE != null ? rVarE.f17835e : 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i10;
    }

    public final long g() {
        long j10;
        synchronized (this.f19331a) {
            y5.l.e("Must be called from the main thread.");
            r rVar = this.f19333c.f46782f;
            MediaInfo mediaInfo = rVar == null ? null : rVar.f17832a;
            j10 = mediaInfo != null ? mediaInfo.f3146e : 0L;
        }
        return j10;
    }

    public final boolean h() {
        y5.l.e("Must be called from the main thread.");
        if (i()) {
            return true;
        }
        y5.l.e("Must be called from the main thread.");
        r rVarE = e();
        return (rVarE != null && rVarE.f17835e == 5) || m() || l() || k();
    }

    public final boolean i() {
        y5.l.e("Must be called from the main thread.");
        r rVarE = e();
        return rVarE != null && rVarE.f17835e == 4;
    }

    public final boolean j() {
        y5.l.e("Must be called from the main thread.");
        MediaInfo mediaInfoD = d();
        return mediaInfoD != null && mediaInfoD.f3144b == 2;
    }

    public final boolean k() {
        y5.l.e("Must be called from the main thread.");
        r rVarE = e();
        return (rVarE == null || rVarE.f17840w == 0) ? false : true;
    }

    public final boolean l() {
        y5.l.e("Must be called from the main thread.");
        r rVarE = e();
        if (rVarE == null) {
            return false;
        }
        if (rVarE.f17835e != 3) {
            return j() && b() == 2;
        }
        return true;
    }

    public final boolean m() {
        y5.l.e("Must be called from the main thread.");
        r rVarE = e();
        return rVarE != null && rVarE.f17835e == 2;
    }

    public final boolean n() {
        y5.l.e("Must be called from the main thread.");
        r rVarE = e();
        return rVarE != null && rVarE.D;
    }

    public final void o(String str) {
        char c10;
        int i10;
        int iB;
        r rVar;
        int[] iArrM;
        r5.n nVar = this.f19333c;
        ?? r10 = nVar.f46790o;
        r5.p pVar = nVar.f46789n;
        r5.p pVar2 = nVar.f46785j;
        List list = nVar.d;
        r5.b bVar = nVar.f46804a;
        bVar.b("message received: %s", str);
        String str2 = bVar.f46768a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            try {
                long jOptLong = jSONObject.optLong("requestId", -1L);
                c10 = 1;
                try {
                    try {
                        switch (string.hashCode()) {
                            case -1830647528:
                                if (string.equals("LOAD_CANCELLED")) {
                                    pVar2.b(jOptLong, 2101, r5.n.f(jSONObject));
                                }
                                break;
                            case -1790231854:
                                if (string.equals("QUEUE_ITEMS")) {
                                    nVar.f46794s.b(jOptLong, 0, null);
                                    nVar.h("QUEUE_ITEMS", jSONObject);
                                    if (nVar.h != null) {
                                        JSONArray jSONArray = jSONObject.getJSONArray("items");
                                        m5.p[] pVarArr = new m5.p[jSONArray.length()];
                                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                            pVarArr[i11] = new m5.o(jSONArray.getJSONObject(i11)).k();
                                        }
                                        Iterator it = ((h) nVar.h.f18130b).f19337i.iterator();
                                        while (it.hasNext()) {
                                            ((g) it.next()).k(pVarArr);
                                        }
                                    }
                                }
                                break;
                            case -1125000185:
                                if (string.equals("INVALID_REQUEST")) {
                                    Log.w(str2, bVar.d("received unexpected error: Invalid Request.", new Object[0]));
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        ((r5.p) it2.next()).b(jOptLong, 2001, r5.n.f(jSONObject));
                                    }
                                }
                                break;
                            case -262628938:
                                if (string.equals("LOAD_FAILED")) {
                                    pVar2.b(jOptLong, 2100, r5.n.f(jSONObject));
                                }
                                break;
                            case 66247144:
                                if (string.equals("ERROR")) {
                                    Iterator it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        ((r5.p) it3.next()).b(jOptLong, 2100, r5.n.f(jSONObject));
                                    }
                                    if (nVar.h != null) {
                                        MediaError mediaErrorB = MediaError.b(jSONObject);
                                        Iterator it4 = ((h) nVar.h.f18130b).f19337i.iterator();
                                        while (it4.hasNext()) {
                                            ((g) it4.next()).b(mediaErrorB);
                                        }
                                    }
                                }
                                break;
                            case 154411710:
                                if (string.equals("QUEUE_CHANGE")) {
                                    nVar.f46795t.b(jOptLong, 0, null);
                                    nVar.h("QUEUE_CHANGE", jSONObject);
                                    if (nVar.h != null) {
                                        String string2 = jSONObject.getString("changeType");
                                        int[] iArrM2 = r5.n.m(jSONObject.getJSONArray("itemIds"));
                                        int iOptInt = jSONObject.optInt("insertBefore", 0);
                                        if (iArrM2 != null) {
                                            switch (string2.hashCode()) {
                                                case -2130463047:
                                                    if (string2.equals("INSERT")) {
                                                        Iterator it5 = ((h) nVar.h.f18130b).f19337i.iterator();
                                                        while (it5.hasNext()) {
                                                            ((g) it5.next()).j(iArrM2, iOptInt);
                                                        }
                                                    }
                                                    break;
                                                case -1881281404:
                                                    if (string2.equals("REMOVE")) {
                                                        Iterator it6 = ((h) nVar.h.f18130b).f19337i.iterator();
                                                        while (it6.hasNext()) {
                                                            ((g) it6.next()).l(iArrM2);
                                                        }
                                                    }
                                                    break;
                                                case -1785516855:
                                                    if (string2.equals("UPDATE")) {
                                                        int[] iArrM3 = r5.n.m(jSONObject.getJSONArray("itemIds"));
                                                        y5.l.i(iArrM3, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                                        if (jSONArrayOptJSONArray != null) {
                                                            ArrayList arrayListC = r5.a.c(iArrM3);
                                                            int iOptInt2 = jSONObject.optInt("insertBefore", 0);
                                                            int[] iArrM4 = r5.n.m(jSONArrayOptJSONArray);
                                                            y5.l.h(iArrM4);
                                                            ArrayList arrayListC2 = r5.a.c(iArrM4);
                                                            Iterator it7 = ((h) nVar.h.f18130b).f19337i.iterator();
                                                            while (it7.hasNext()) {
                                                                ((g) it7.next()).m(arrayListC, arrayListC2, iOptInt2);
                                                            }
                                                        } else {
                                                            Iterator it8 = ((h) nVar.h.f18130b).f19337i.iterator();
                                                            while (it8.hasNext()) {
                                                                ((g) it8.next()).i(iArrM3);
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 1122976047:
                                                    if (string2.equals("ITEMS_CHANGE")) {
                                                        Iterator it9 = ((h) nVar.h.f18130b).f19337i.iterator();
                                                        while (it9.hasNext()) {
                                                            ((g) it9.next()).n(iArrM2);
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                }
                                break;
                            case 431600379:
                                if (string.equals("INVALID_PLAYER_STATE")) {
                                    Log.w(str2, bVar.d("received unexpected error: Invalid Player State.", new Object[0]));
                                    Iterator it10 = list.iterator();
                                    while (it10.hasNext()) {
                                        ((r5.p) it10.next()).b(jOptLong, 2100, r5.n.f(jSONObject));
                                    }
                                }
                                break;
                            case 823510221:
                                if (string.equals("MEDIA_STATUS")) {
                                    JSONArray jSONArray2 = jSONObject.getJSONArray("status");
                                    if (jSONArray2.length() > 0) {
                                        JSONObject jSONObject2 = jSONArray2.getJSONObject(0);
                                        boolean zC = pVar2.c(jOptLong);
                                        if (!pVar.d() || pVar.c(jOptLong)) {
                                            i10 = (!r10.d() || r10.c(jOptLong)) ? 0 : 1;
                                        }
                                        if (zC || (rVar = nVar.f46782f) == null) {
                                            r rVar2 = new r(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                            rVar2.b(0, jSONObject2);
                                            nVar.f46782f = rVar2;
                                            nVar.f46781e = SystemClock.elapsedRealtime();
                                            iB = 127;
                                        } else {
                                            iB = rVar.b(i10, jSONObject2);
                                        }
                                        if ((iB & 1) != 0) {
                                            nVar.f46781e = SystemClock.elapsedRealtime();
                                            nVar.f46784i = -1;
                                            nVar.l();
                                        }
                                        if ((iB & 2) != 0) {
                                            nVar.f46781e = SystemClock.elapsedRealtime();
                                            nVar.l();
                                        }
                                        if ((iB & 128) != 0) {
                                            nVar.f46781e = SystemClock.elapsedRealtime();
                                        }
                                        if ((iB & 4) != 0) {
                                            nVar.i();
                                        }
                                        if ((iB & 8) != 0) {
                                            nVar.k();
                                        }
                                        if ((iB & 16) != 0) {
                                            nVar.j();
                                        }
                                        if ((iB & 32) != 0) {
                                            nVar.f46781e = SystemClock.elapsedRealtime();
                                            b0 b0Var = nVar.h;
                                            if (b0Var != null) {
                                                b0Var.t();
                                            }
                                        }
                                        if ((iB & 64) != 0) {
                                            nVar.f46781e = SystemClock.elapsedRealtime();
                                            nVar.l();
                                        }
                                    } else {
                                        nVar.f46782f = null;
                                        nVar.l();
                                        nVar.i();
                                        nVar.k();
                                        nVar.j();
                                    }
                                    Iterator it11 = list.iterator();
                                    while (it11.hasNext()) {
                                        ((r5.p) it11.next()).b(jOptLong, 0, null);
                                    }
                                }
                                break;
                            case 2107149050:
                                if (string.equals("QUEUE_ITEM_IDS")) {
                                    nVar.f46793r.b(jOptLong, 0, null);
                                    nVar.h("QUEUE_ITEM_IDS", jSONObject);
                                    if (nVar.h != null && (iArrM = r5.n.m(jSONObject.getJSONArray("itemIds"))) != null) {
                                        Iterator it12 = ((h) nVar.h.f18130b).f19337i.iterator();
                                        while (it12.hasNext()) {
                                            ((g) it12.next()).i(iArrM);
                                        }
                                        break;
                                    }
                                }
                                break;
                        }
                    } catch (JSONException e9) {
                        e = e9;
                        r10 = str2;
                        Object[] objArr = new Object[2];
                        objArr[0] = e.getMessage();
                        objArr[c10] = str;
                        Log.w((String) r10, bVar.d("Message is malformed (%s); ignoring: %s", objArr));
                    }
                } catch (JSONException e10) {
                    e = e10;
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = e.getMessage();
                    objArr2[c10] = str;
                    Log.w((String) r10, bVar.d("Message is malformed (%s); ignoring: %s", objArr2));
                }
            } catch (JSONException e11) {
                e = e11;
                r10 = str2;
                c10 = 1;
                Object[] objArr3 = new Object[2];
                objArr3[0] = e.getMessage();
                objArr3[c10] = str;
                Log.w((String) r10, bVar.d("Message is malformed (%s); ignoring: %s", objArr3));
            }
        } catch (JSONException e12) {
            e = e12;
            r10 = str2;
        }
    }

    public final void p(g gVar) {
        y5.l.e("Must be called from the main thread.");
        if (gVar != null) {
            this.f19337i.add(gVar);
        }
    }

    public final BasePendingResult q(m5.q qVar) {
        y5.l.e("Must be called from the main thread.");
        if (!w()) {
            return t();
        }
        j jVar = new j(this, qVar, 2);
        x(jVar);
        return jVar;
    }

    public final void r() {
        y5.l.e("Must be called from the main thread.");
        int iF = f();
        if (iF == 4 || iF == 2) {
            y5.l.e("Must be called from the main thread.");
            if (w()) {
                x(new i(this, 5));
                return;
            } else {
                t();
                return;
            }
        }
        y5.l.e("Must be called from the main thread.");
        if (w()) {
            x(new i(this, 6));
        } else {
            t();
        }
    }

    public final int s() {
        m5.p pVarC;
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
            if (k() && (pVarC = c()) != null && pVarC.f17824a != null) {
                return 6;
            }
        }
        return 0;
    }

    public final void u() {
        g0 g0Var = this.f19335f;
        if (g0Var == null) {
            return;
        }
        y5.l.e("Must be called from the main thread.");
        String str = this.f19333c.f46805b;
        f0 f0Var = (f0) g0Var;
        r5.a.b(str);
        synchronized (f0Var.C) {
            f0Var.C.put(str, this);
        }
        v vVarB = w.b();
        vVarB.f3359c = new m5.b0(f0Var, str, this);
        vVarB.f3357a = 8413;
        f0Var.e(1, vVarB.b());
        y5.l.e("Must be called from the main thread.");
        if (w()) {
            x(new i(this, 0));
        } else {
            t();
        }
    }

    public final void v(f0 f0Var) {
        m5.f fVar;
        g0 g0Var = this.f19335f;
        if (g0Var == f0Var) {
            return;
        }
        if (g0Var != null) {
            this.f19333c.n();
            this.f19334e.c();
            y5.l.e("Must be called from the main thread.");
            String str = this.f19333c.f46805b;
            f0 f0Var2 = (f0) g0Var;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Channel namespace cannot be null or empty");
            }
            synchronized (f0Var2.C) {
                fVar = (m5.f) f0Var2.C.remove(str);
            }
            v vVarB = w.b();
            vVarB.f3359c = new m5.b0(f0Var2, fVar, str);
            vVarB.f3357a = 8414;
            f0Var2.e(1, vVarB.b());
            this.d.f12863b = null;
            this.f19332b.removeCallbacksAndMessages(null);
        }
        this.f19335f = f0Var;
        if (f0Var != null) {
            this.d.f12863b = f0Var;
        }
    }

    public final boolean w() {
        return this.f19335f != null;
    }
}
