package j6;

import android.os.SystemClock;
import android.util.Log;
import c8.y0;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class m extends p {
    public static final String v;
    public long f16518e;
    public f6.q f16519f;
    public Long f16520g;
    public gf.g h;
    public int f16521i;
    public final o f16522j;
    public final o f16523k;
    public final o f16524l;
    public final o f16525m;
    public final o f16526n;
    public final o f16527o;
    public final o f16528p;
    public final o f16529q;
    public final o f16530r;
    public final o f16531s;
    public final o f16532t;
    public final o f16533u;

    static {
        Pattern pattern = a.f16506a;
        v = "urn:x-cast:com.google.cast.media";
    }

    public m() {
        super(v);
        this.f16521i = -1;
        o oVar = new o(86400000L, "load");
        this.f16522j = oVar;
        o oVar2 = new o(86400000L, "pause");
        this.f16523k = oVar2;
        o oVar3 = new o(86400000L, "play");
        this.f16524l = oVar3;
        o oVar4 = new o(86400000L, "stop");
        o oVar5 = new o(10000L, "seek");
        this.f16525m = oVar5;
        o oVar6 = new o(86400000L, "volume");
        this.f16526n = oVar6;
        o oVar7 = new o(86400000L, "mute");
        this.f16527o = oVar7;
        o oVar8 = new o(86400000L, "status");
        this.f16528p = oVar8;
        o oVar9 = new o(86400000L, "activeTracks");
        o oVar10 = new o(86400000L, "trackStyle");
        o oVar11 = new o(86400000L, "queueInsert");
        o oVar12 = new o(86400000L, "queueUpdate");
        this.f16529q = oVar12;
        o oVar13 = new o(86400000L, "queueRemove");
        o oVar14 = new o(86400000L, "queueReorder");
        o oVar15 = new o(86400000L, "queueFetchItemIds");
        this.f16530r = oVar15;
        o oVar16 = new o(86400000L, "queueFetchItemRange");
        this.f16532t = oVar16;
        this.f16531s = new o(86400000L, "queueFetchItems");
        o oVar17 = new o(86400000L, "setPlaybackRate");
        this.f16533u = oVar17;
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
        Pattern pattern = a.f16506a;
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
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            iArr[i7] = jSONArray.getInt(i7);
        }
        return iArr;
    }

    public final void d(n nVar, int i7, Integer num) {
        JSONObject jSONObject = new JSONObject();
        long b10 = b();
        try {
            jSONObject.put("requestId", b10);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", p());
            if (i7 != 0) {
                jSONObject.put("jump", i7);
            }
            String b11 = y0.b(num);
            if (b11 != null) {
                jSONObject.put("repeatMode", b11);
            }
            int i10 = this.f16521i;
            if (i10 != -1) {
                jSONObject.put("sequenceNumber", i10);
            }
        } catch (JSONException unused) {
        }
        c(b10, jSONObject.toString());
        this.f16529q.a(b10, new wf.b(this, nVar, false, 25));
    }

    public final long e(double d, long j3, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f16518e;
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
        this.f16518e = 0L;
        this.f16519f = null;
        for (o oVar : this.d) {
            oVar.f(2002);
        }
    }

    public final void h(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.f16521i = jSONObject.optInt("sequenceNumber", -1);
            return;
        }
        b bVar = this.f16541a;
        Log.w(bVar.f16508a, bVar.d(str.concat(" message is missing a sequence number."), new Object[0]));
    }

    public final void i() {
        gf.g gVar = this.h;
        if (gVar != null) {
            h6.h hVar = (h6.h) gVar.f13889b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f14253i.iterator();
                while (it2.hasNext()) {
                    ((h6.g) it2.next()).c();
                }
                return;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void j() {
        gf.g gVar = this.h;
        if (gVar != null) {
            h6.h hVar = (h6.h) gVar.f13889b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f14253i.iterator();
                while (it2.hasNext()) {
                    ((h6.g) it2.next()).d();
                }
                return;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void k() {
        gf.g gVar = this.h;
        if (gVar != null) {
            h6.h hVar = (h6.h) gVar.f13889b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f14253i.iterator();
                while (it2.hasNext()) {
                    ((h6.g) it2.next()).e();
                }
                return;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void l() {
        gf.g gVar = this.h;
        if (gVar != null) {
            h6.h hVar = (h6.h) gVar.f13889b;
            Iterator it = hVar.f14254j.values().iterator();
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
                Iterator it3 = hVar.f14253i.iterator();
                while (it3.hasNext()) {
                    ((h6.g) it3.next()).g();
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
        f6.j jVar;
        f6.q qVar = this.f16519f;
        MediaInfo mediaInfo3 = null;
        if (qVar == null) {
            mediaInfo = null;
        } else {
            mediaInfo = qVar.f11309a;
        }
        long j10 = 0;
        if (mediaInfo != null && qVar != null) {
            Long l10 = this.f16520g;
            if (l10 != null) {
                if (l10.equals(4294967296000L)) {
                    f6.q qVar2 = this.f16519f;
                    if (qVar2.K != null) {
                        long longValue = l10.longValue();
                        f6.q qVar3 = this.f16519f;
                        if (qVar3 != null && (jVar = qVar3.K) != null) {
                            long j11 = jVar.f11272b;
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
                        mediaInfo2 = qVar2.f11309a;
                    }
                    if (mediaInfo2 != null) {
                        j3 = mediaInfo2.f6495e;
                    } else {
                        j3 = 0;
                    }
                    if (j3 >= 0) {
                        long longValue2 = l10.longValue();
                        f6.q qVar4 = this.f16519f;
                        if (qVar4 != null) {
                            mediaInfo3 = qVar4.f11309a;
                        }
                        if (mediaInfo3 != null) {
                            j10 = mediaInfo3.f6495e;
                        }
                        return Math.min(longValue2, j10);
                    }
                }
                return l10.longValue();
            } else if (this.f16518e != 0) {
                double d = qVar.d;
                long j12 = qVar.h;
                int i7 = qVar.f11312e;
                if (d != 0.0d && i7 == 2) {
                    return e(d, j12, mediaInfo.f6495e);
                }
                return j12;
            }
        }
        return 0L;
    }

    public final long p() {
        f6.q qVar = this.f16519f;
        if (qVar != null) {
            return qVar.f11310b;
        }
        throw new Exception();
    }
}
