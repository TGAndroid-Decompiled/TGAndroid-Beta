package g6;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v7.t7;
public final class m extends p {
    public static final String v;
    public long f10332e;
    public c6.q f10333f;
    public Long f10334g;
    public a6.i h;
    public int f10335i;
    public final o f10336j;
    public final o f10337k;
    public final o f10338l;
    public final o f10339m;
    public final o f10340n;
    public final o f10341o;
    public final o f10342p;
    public final o f10343q;
    public final o f10344r;
    public final o f10345s;
    public final o f10346t;
    public final o f10347u;

    static {
        Pattern pattern = a.f10320a;
        v = "urn:x-cast:com.google.cast.media";
    }

    public m() {
        super(v);
        this.f10335i = -1;
        o oVar = new o(86400000L, "load");
        this.f10336j = oVar;
        o oVar2 = new o(86400000L, "pause");
        this.f10337k = oVar2;
        o oVar3 = new o(86400000L, "play");
        this.f10338l = oVar3;
        o oVar4 = new o(86400000L, "stop");
        o oVar5 = new o(10000L, "seek");
        this.f10339m = oVar5;
        o oVar6 = new o(86400000L, "volume");
        this.f10340n = oVar6;
        o oVar7 = new o(86400000L, "mute");
        this.f10341o = oVar7;
        o oVar8 = new o(86400000L, "status");
        this.f10342p = oVar8;
        o oVar9 = new o(86400000L, "activeTracks");
        o oVar10 = new o(86400000L, "trackStyle");
        o oVar11 = new o(86400000L, "queueInsert");
        o oVar12 = new o(86400000L, "queueUpdate");
        this.f10343q = oVar12;
        o oVar13 = new o(86400000L, "queueRemove");
        o oVar14 = new o(86400000L, "queueReorder");
        o oVar15 = new o(86400000L, "queueFetchItemIds");
        this.f10344r = oVar15;
        o oVar16 = new o(86400000L, "queueFetchItemRange");
        this.f10346t = oVar16;
        this.f10345s = new o(86400000L, "queueFetchItems");
        o oVar17 = new o(86400000L, "setPlaybackRate");
        this.f10347u = oVar17;
        o oVar18 = new o(86400000L, "skipAd");
        a(oVar);
        a(oVar2);
        a(oVar3);
        a(oVar4);
        a(oVar5);
        a(oVar6);
        a(oVar7);
        a(oVar8);
        a(oVar9);
        a(oVar10);
        a(oVar11);
        a(oVar12);
        a(oVar13);
        a(oVar14);
        a(oVar15);
        a(oVar16);
        a(oVar16);
        a(oVar17);
        a(oVar18);
        g();
    }

    public static l f(JSONObject jSONObject) {
        MediaError.b(jSONObject);
        ?? obj = new Object();
        Pattern pattern = a.f10320a;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return obj;
    }

    public static int[] m(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            iArr[i10] = jSONArray.getInt(i10);
        }
        return iArr;
    }

    public final void d(n nVar, int i10, Integer num) {
        JSONObject jSONObject = new JSONObject();
        long b10 = b();
        try {
            jSONObject.put("requestId", b10);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", p());
            if (i10 != 0) {
                jSONObject.put("jump", i10);
            }
            String b11 = t7.b(num);
            if (b11 != null) {
                jSONObject.put("repeatMode", b11);
            }
            int i11 = this.f10335i;
            if (i11 != -1) {
                jSONObject.put("sequenceNumber", i11);
            }
        } catch (JSONException unused) {
        }
        c(b10, jSONObject.toString());
        this.f10343q.a(b10, new n4.x(this, nVar, false, 18));
    }

    public final long e(double d, long j3, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f10332e;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j3;
        }
        long j11 = j3 + ((long) (elapsedRealtime * d));
        if (j10 > 0 && j11 > j10) {
            return j10;
        }
        if (j11 < 0) {
            return 0L;
        }
        return j11;
    }

    public final void g() {
        this.f10332e = 0L;
        this.f10333f = null;
        for (o oVar : this.d) {
            oVar.f(2002);
        }
    }

    public final void h(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.f10335i = jSONObject.optInt("sequenceNumber", -1);
            return;
        }
        b bVar = this.f10355a;
        Log.w(bVar.f10322a, bVar.d(str.concat(" message is missing a sequence number."), new Object[0]));
    }

    public final void i() {
        a6.i iVar = this.h;
        if (iVar != null) {
            e6.h hVar = (e6.h) iVar.f326b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f8676i.iterator();
                while (it2.hasNext()) {
                    ((e6.g) it2.next()).c();
                }
                return;
            }
            throw a1.g.k(it);
        }
    }

    public final void j() {
        a6.i iVar = this.h;
        if (iVar != null) {
            e6.h hVar = (e6.h) iVar.f326b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f8676i.iterator();
                while (it2.hasNext()) {
                    ((e6.g) it2.next()).d();
                }
                return;
            }
            throw a1.g.k(it);
        }
    }

    public final void k() {
        a6.i iVar = this.h;
        if (iVar != null) {
            e6.h hVar = (e6.h) iVar.f326b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f8676i.iterator();
                while (it2.hasNext()) {
                    ((e6.g) it2.next()).e();
                }
                return;
            }
            throw a1.g.k(it);
        }
    }

    public final void l() {
        a6.i iVar = this.h;
        if (iVar != null) {
            e6.h hVar = (e6.h) iVar.f326b;
            Iterator it = hVar.f8677j.values().iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    if (!hVar.h()) {
                        if (!hVar.h()) {
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw new ClassCastException();
            }
            Iterator it2 = hVar.h.iterator();
            if (!it2.hasNext()) {
                Iterator it3 = hVar.f8676i.iterator();
                while (it3.hasNext()) {
                    ((e6.g) it3.next()).g();
                }
                return;
            }
            throw a1.g.k(it2);
        }
    }

    public final void n() {
        synchronized (this.d) {
            try {
                for (o oVar : this.d) {
                    oVar.f(2002);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g();
    }

    public final long o() {
        MediaInfo mediaInfo;
        MediaInfo mediaInfo2;
        long j3;
        c6.j jVar;
        c6.q qVar = this.f10333f;
        MediaInfo mediaInfo3 = null;
        if (qVar == null) {
            mediaInfo = null;
        } else {
            mediaInfo = qVar.f4406a;
        }
        long j10 = 0;
        if (mediaInfo != null && qVar != null) {
            Long l4 = this.f10334g;
            if (l4 != null) {
                if (l4.equals(4294967296000L)) {
                    c6.q qVar2 = this.f10333f;
                    if (qVar2.K != null) {
                        long longValue = l4.longValue();
                        c6.q qVar3 = this.f10333f;
                        if (qVar3 != null && (jVar = qVar3.K) != null) {
                            long j11 = jVar.f4369b;
                            if (!jVar.d) {
                                j10 = e(1.0d, j11, -1L);
                            } else {
                                j10 = j11;
                            }
                        }
                        return Math.min(longValue, j10);
                    }
                    if (qVar2 == null) {
                        mediaInfo2 = null;
                    } else {
                        mediaInfo2 = qVar2.f4406a;
                    }
                    if (mediaInfo2 != null) {
                        j3 = mediaInfo2.f6492e;
                    } else {
                        j3 = 0;
                    }
                    if (j3 >= 0) {
                        long longValue2 = l4.longValue();
                        c6.q qVar4 = this.f10333f;
                        if (qVar4 != null) {
                            mediaInfo3 = qVar4.f4406a;
                        }
                        if (mediaInfo3 != null) {
                            j10 = mediaInfo3.f6492e;
                        }
                        return Math.min(longValue2, j10);
                    }
                }
                return l4.longValue();
            } else if (this.f10332e != 0) {
                double d = qVar.d;
                long j12 = qVar.h;
                int i10 = qVar.f4409e;
                if (d != 0.0d && i10 == 2) {
                    return e(d, j12, mediaInfo.f6492e);
                }
                return j12;
            }
        }
        return 0L;
    }

    public final long p() {
        c6.q qVar = this.f10333f;
        if (qVar != null) {
            return qVar.f4407b;
        }
        throw new Exception();
    }
}
