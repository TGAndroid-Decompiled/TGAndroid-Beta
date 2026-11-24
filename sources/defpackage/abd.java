package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class abd {
    public static final String v;
    public final ce6 a;
    public final String b;
    public wm9 c;
    public final List d;
    public long e;
    public f07 f;
    public Long g;
    public cf9 h;
    public int i;
    public final wbd j;
    public final wbd k;
    public final wbd l;
    public final wbd m;
    public final wbd n;
    public final wbd o;
    public final wbd p;
    public final wbd q;
    public final wbd r;
    public final wbd s;
    public final wbd t;
    public final wbd u;

    static {
        Pattern pattern = qe1.a;
        v = "urn:x-cast:com.google.cast.media";
    }

    public abd() {
        String str = v;
        qe1.b(str);
        this.b = str;
        this.a = new ce6("MediaControlChannel", null);
        this.d = DesugarCollections.synchronizedList(new ArrayList());
        this.i = -1;
        wbd wbdVar = new wbd(86400000L, "load");
        this.j = wbdVar;
        wbd wbdVar2 = new wbd(86400000L, "pause");
        this.k = wbdVar2;
        wbd wbdVar3 = new wbd(86400000L, "play");
        this.l = wbdVar3;
        wbd wbdVar4 = new wbd(86400000L, "stop");
        wbd wbdVar5 = new wbd(10000L, "seek");
        this.m = wbdVar5;
        wbd wbdVar6 = new wbd(86400000L, "volume");
        this.n = wbdVar6;
        wbd wbdVar7 = new wbd(86400000L, "mute");
        this.o = wbdVar7;
        wbd wbdVar8 = new wbd(86400000L, "status");
        this.p = wbdVar8;
        wbd wbdVar9 = new wbd(86400000L, "activeTracks");
        wbd wbdVar10 = new wbd(86400000L, "trackStyle");
        wbd wbdVar11 = new wbd(86400000L, "queueInsert");
        wbd wbdVar12 = new wbd(86400000L, "queueUpdate");
        this.q = wbdVar12;
        wbd wbdVar13 = new wbd(86400000L, "queueRemove");
        wbd wbdVar14 = new wbd(86400000L, "queueReorder");
        wbd wbdVar15 = new wbd(86400000L, "queueFetchItemIds");
        this.r = wbdVar15;
        wbd wbdVar16 = new wbd(86400000L, "queueFetchItemRange");
        this.t = wbdVar16;
        this.s = new wbd(86400000L, "queueFetchItems");
        wbd wbdVar17 = new wbd(86400000L, "setPlaybackRate");
        this.u = wbdVar17;
        wbd wbdVar18 = new wbd(86400000L, "skipAd");
        k(wbdVar);
        k(wbdVar2);
        k(wbdVar3);
        k(wbdVar4);
        k(wbdVar5);
        k(wbdVar6);
        k(wbdVar7);
        k(wbdVar8);
        k(wbdVar9);
        k(wbdVar10);
        k(wbdVar11);
        k(wbdVar12);
        k(wbdVar13);
        k(wbdVar14);
        k(wbdVar15);
        k(wbdVar16);
        k(wbdVar16);
        k(wbdVar17);
        k(wbdVar18);
        d();
    }

    public static tad c(JSONObject jSONObject) {
        MediaError.b(jSONObject);
        ?? obj = new Object();
        Pattern pattern = qe1.a;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return obj;
    }

    public static int[] j(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    public final void a(hbd hbdVar, int i, Integer num) {
        JSONObject jSONObject = new JSONObject();
        long l = l();
        try {
            jSONObject.put("requestId", l);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", p());
            if (i != 0) {
                jSONObject.put("jump", i);
            }
            String b = rqe.b(num);
            if (b != null) {
                jSONObject.put("repeatMode", b);
            }
            int i2 = this.i;
            if (i2 != -1) {
                jSONObject.put("sequenceNumber", i2);
            }
        } catch (JSONException unused) {
        }
        n(l, jSONObject.toString());
        this.q.a(l, new xab(this, hbdVar, (byte) 13));
    }

    public final long b(double d, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j;
        }
        long j3 = j + ((long) (elapsedRealtime * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 < 0) {
            return 0L;
        }
        return j3;
    }

    public final void d() {
        this.e = 0L;
        this.f = null;
        for (wbd wbdVar : this.d) {
            wbdVar.f(2002);
        }
    }

    public final void e(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.i = jSONObject.optInt("sequenceNumber", -1);
            return;
        }
        ce6 ce6Var = this.a;
        Log.w(ce6Var.a, ce6Var.d(str.concat(" message is missing a sequence number."), new Object[0]));
    }

    public final void f() {
        cf9 cf9Var = this.h;
        if (cf9Var != null) {
            k89 k89Var = (k89) cf9Var.b;
            Iterator it = k89Var.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = k89Var.i.iterator();
                while (it2.hasNext()) {
                    ((j89) it2.next()).c();
                }
                return;
            }
            throw kt6.l(it);
        }
    }

    public final void g() {
        cf9 cf9Var = this.h;
        if (cf9Var != null) {
            k89 k89Var = (k89) cf9Var.b;
            Iterator it = k89Var.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = k89Var.i.iterator();
                while (it2.hasNext()) {
                    ((j89) it2.next()).d();
                }
                return;
            }
            throw kt6.l(it);
        }
    }

    public final void h() {
        cf9 cf9Var = this.h;
        if (cf9Var != null) {
            k89 k89Var = (k89) cf9Var.b;
            Iterator it = k89Var.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = k89Var.i.iterator();
                while (it2.hasNext()) {
                    ((j89) it2.next()).e();
                }
                return;
            }
            throw kt6.l(it);
        }
    }

    public final void i() {
        cf9 cf9Var = this.h;
        if (cf9Var != null) {
            k89 k89Var = (k89) cf9Var.b;
            Iterator it = k89Var.j.values().iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    if (!k89Var.h()) {
                        if (!k89Var.h()) {
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                rjb.p();
                return;
            }
            Iterator it2 = k89Var.h.iterator();
            if (!it2.hasNext()) {
                Iterator it3 = k89Var.i.iterator();
                while (it3.hasNext()) {
                    ((j89) it3.next()).g();
                }
                return;
            }
            throw kt6.l(it2);
        }
    }

    public final void k(wbd wbdVar) {
        this.d.add(wbdVar);
    }

    public final long l() {
        wm9 wm9Var = this.c;
        if (wm9Var == null) {
            ce6 ce6Var = this.a;
            Log.e(ce6Var.a, ce6Var.d("Attempt to generate requestId without a sink", new Object[0]));
            return 0L;
        }
        return ((AtomicLong) wm9Var.c).getAndIncrement();
    }

    public final void m() {
        synchronized (this.d) {
            for (wbd wbdVar : this.d) {
                wbdVar.f(2002);
            }
        }
        d();
    }

    public final void n(long j, String str) {
        wm9 wm9Var = this.c;
        if (wm9Var == null) {
            ce6 ce6Var = this.a;
            Log.e(ce6Var.a, ce6Var.d("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        bhd bhdVar = (bhd) wm9Var.b;
        if (bhdVar != null) {
            String str2 = this.b;
            qe1.b(str2);
            if (!TextUtils.isEmpty(str)) {
                if (str.length() <= 524288) {
                    bib b = cib.b();
                    b.a = new hed(bhdVar, str2, str, (byte) 1);
                    b.d = (char) 8405;
                    bhdVar.e(1, b.a()).addOnFailureListener(new vh2(wm9Var, j, (byte) 9));
                    return;
                }
                ce6 ce6Var2 = bhd.H;
                Log.w(ce6Var2.a, ce6Var2.d("Message send failed. Message exceeds maximum size", new Object[0]));
                u36.j("Message exceeds maximum size524288");
                return;
            }
            u36.j("The message payload cannot be null or empty");
            return;
        }
        dq9.m("Device is not connected");
    }

    public final long o() {
        MediaInfo mediaInfo;
        MediaInfo mediaInfo2;
        long j;
        et6 et6Var;
        f07 f07Var = this.f;
        MediaInfo mediaInfo3 = null;
        if (f07Var == null) {
            mediaInfo = null;
        } else {
            mediaInfo = f07Var.a;
        }
        long j2 = 0;
        if (mediaInfo != null && f07Var != null) {
            Long l = this.g;
            if (l != null) {
                if (l.equals(4294967296000L)) {
                    f07 f07Var2 = this.f;
                    if (f07Var2.L != null) {
                        long longValue = l.longValue();
                        f07 f07Var3 = this.f;
                        if (f07Var3 != null && (et6Var = f07Var3.L) != null) {
                            long j3 = et6Var.b;
                            j2 = !et6Var.d ? b(1.0d, j3, -1L) : j3;
                        }
                        return Math.min(longValue, j2);
                    }
                    if (f07Var2 == null) {
                        mediaInfo2 = null;
                    } else {
                        mediaInfo2 = f07Var2.a;
                    }
                    if (mediaInfo2 != null) {
                        j = mediaInfo2.e;
                    } else {
                        j = 0;
                    }
                    if (j >= 0) {
                        long longValue2 = l.longValue();
                        f07 f07Var4 = this.f;
                        if (f07Var4 != null) {
                            mediaInfo3 = f07Var4.a;
                        }
                        if (mediaInfo3 != null) {
                            j2 = mediaInfo3.e;
                        }
                        return Math.min(longValue2, j2);
                    }
                }
                return l.longValue();
            } else if (this.e != 0) {
                double d = f07Var.d;
                long j4 = f07Var.h;
                int i = f07Var.e;
                if (d != 0.0d && i == 2) {
                    return b(d, j4, mediaInfo.e);
                }
                return j4;
            }
        }
        return 0L;
    }

    public final long p() {
        f07 f07Var = this.f;
        if (f07Var != null) {
            return f07Var.b;
        }
        throw new Exception();
    }
}
