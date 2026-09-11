package g6;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.regex.Pattern;
import n4.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v7.v7;
public final class m extends p {
    public static final String v;
    public long f10396e;
    public c6.q f10397f;
    public Long f10398g;
    public a4.m h;
    public int f10399i;
    public final o f10400j;
    public final o f10401k;
    public final o f10402l;
    public final o f10403m;
    public final o f10404n;
    public final o f10405o;
    public final o f10406p;
    public final o f10407q;
    public final o f10408r;
    public final o f10409s;
    public final o f10410t;
    public final o f10411u;

    static {
        Pattern pattern = a.f10384a;
        v = "urn:x-cast:com.google.cast.media";
    }

    public m() {
        super(v);
        this.f10399i = -1;
        o oVar = new o(86400000L, "load");
        this.f10400j = oVar;
        o oVar2 = new o(86400000L, "pause");
        this.f10401k = oVar2;
        o oVar3 = new o(86400000L, "play");
        this.f10402l = oVar3;
        o oVar4 = new o(86400000L, "stop");
        o oVar5 = new o(10000L, "seek");
        this.f10403m = oVar5;
        o oVar6 = new o(86400000L, "volume");
        this.f10404n = oVar6;
        o oVar7 = new o(86400000L, "mute");
        this.f10405o = oVar7;
        o oVar8 = new o(86400000L, "status");
        this.f10406p = oVar8;
        o oVar9 = new o(86400000L, "activeTracks");
        o oVar10 = new o(86400000L, "trackStyle");
        o oVar11 = new o(86400000L, "queueInsert");
        o oVar12 = new o(86400000L, "queueUpdate");
        this.f10407q = oVar12;
        o oVar13 = new o(86400000L, "queueRemove");
        o oVar14 = new o(86400000L, "queueReorder");
        o oVar15 = new o(86400000L, "queueFetchItemIds");
        this.f10408r = oVar15;
        o oVar16 = new o(86400000L, "queueFetchItemRange");
        this.f10410t = oVar16;
        this.f10409s = new o(86400000L, "queueFetchItems");
        o oVar17 = new o(86400000L, "setPlaybackRate");
        this.f10411u = oVar17;
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
        Pattern pattern = a.f10384a;
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
            String b11 = v7.b(num);
            if (b11 != null) {
                jSONObject.put("repeatMode", b11);
            }
            int i11 = this.f10399i;
            if (i11 != -1) {
                jSONObject.put("sequenceNumber", i11);
            }
        } catch (JSONException unused) {
        }
        c(b10, jSONObject.toString());
        this.f10407q.a(b10, new y(this, nVar, false, 16));
    }

    public final long e(double d, long j3, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f10396e;
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
        this.f10396e = 0L;
        this.f10397f = null;
        for (o oVar : this.d) {
            oVar.f(2002);
        }
    }

    public final void h(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.f10399i = jSONObject.optInt("sequenceNumber", -1);
            return;
        }
        b bVar = this.f10419a;
        Log.w(bVar.f10386a, bVar.d(str.concat(" message is missing a sequence number."), new Object[0]));
    }

    public final void i() {
        a4.m mVar = this.h;
        if (mVar != null) {
            e6.h hVar = (e6.h) mVar.f283b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f8882i.iterator();
                while (it2.hasNext()) {
                    ((e6.g) it2.next()).c();
                }
                return;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void j() {
        a4.m mVar = this.h;
        if (mVar != null) {
            e6.h hVar = (e6.h) mVar.f283b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f8882i.iterator();
                while (it2.hasNext()) {
                    ((e6.g) it2.next()).d();
                }
                return;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void k() {
        a4.m mVar = this.h;
        if (mVar != null) {
            e6.h hVar = (e6.h) mVar.f283b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f8882i.iterator();
                while (it2.hasNext()) {
                    ((e6.g) it2.next()).e();
                }
                return;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void l() {
        a4.m mVar = this.h;
        if (mVar != null) {
            e6.h hVar = (e6.h) mVar.f283b;
            Iterator it = hVar.f8883j.values().iterator();
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
                Iterator it3 = hVar.f8882i.iterator();
                while (it3.hasNext()) {
                    ((e6.g) it3.next()).g();
                }
                return;
            }
            it2.next().getClass();
            throw new ClassCastException();
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
        c6.q qVar = this.f10397f;
        MediaInfo mediaInfo3 = null;
        if (qVar == null) {
            mediaInfo = null;
        } else {
            mediaInfo = qVar.f4550a;
        }
        long j10 = 0;
        if (mediaInfo != null && qVar != null) {
            Long l4 = this.f10398g;
            if (l4 != null) {
                if (l4.equals(4294967296000L)) {
                    c6.q qVar2 = this.f10397f;
                    if (qVar2.K != null) {
                        long longValue = l4.longValue();
                        c6.q qVar3 = this.f10397f;
                        if (qVar3 != null && (jVar = qVar3.K) != null) {
                            long j11 = jVar.f4513b;
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
                        mediaInfo2 = qVar2.f4550a;
                    }
                    if (mediaInfo2 != null) {
                        j3 = mediaInfo2.f4914e;
                    } else {
                        j3 = 0;
                    }
                    if (j3 >= 0) {
                        long longValue2 = l4.longValue();
                        c6.q qVar4 = this.f10397f;
                        if (qVar4 != null) {
                            mediaInfo3 = qVar4.f4550a;
                        }
                        if (mediaInfo3 != null) {
                            j10 = mediaInfo3.f4914e;
                        }
                        return Math.min(longValue2, j10);
                    }
                }
                return l4.longValue();
            } else if (this.f10396e != 0) {
                double d = qVar.d;
                long j12 = qVar.h;
                int i10 = qVar.f4553e;
                if (d != 0.0d && i10 == 2) {
                    return e(d, j12, mediaInfo.f4914e);
                }
                return j12;
            }
        }
        return 0L;
    }

    public final long p() {
        c6.q qVar = this.f10397f;
        if (qVar != null) {
            return qVar.f4551b;
        }
        throw new Exception();
    }
}
