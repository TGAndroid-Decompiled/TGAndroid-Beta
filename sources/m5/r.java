package m5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import h7.f7;
import h7.r8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class r extends z5.a {
    public static final Parcelable.Creator<r> CREATOR;
    public JSONObject A;
    public int B;
    public boolean D;
    public c E;
    public v F;
    public j G;
    public n H;
    public boolean I;

    public MediaInfo f17832a;

    public long f17833b;

    public int f17834c;
    public double d;

    public int f17835e;

    public int f17836f;
    public long h;

    public long f17837n;

    public double f17838r;

    public boolean f17839s;
    public long[] v;

    public int f17840w;

    public int f17841x;

    public String f17842y;
    public final ArrayList C = new ArrayList();
    public final SparseArray J = new SparseArray();

    static {
        y5.l.g("MediaStatus", "The log tag cannot be null or empty.");
        TextUtils.isEmpty(null);
        CREATOR = new w(15);
    }

    public r(MediaInfo mediaInfo, long j10, int i10, double d, int i11, int i12, long j11, long j12, double d10, boolean z10, long[] jArr, int i13, int i14, String str, int i15, ArrayList arrayList, boolean z11, c cVar, v vVar, j jVar, n nVar) {
        this.f17832a = mediaInfo;
        this.f17833b = j10;
        this.f17834c = i10;
        this.d = d;
        this.f17835e = i11;
        this.f17836f = i12;
        this.h = j11;
        this.f17837n = j12;
        this.f17838r = d10;
        this.f17839s = z10;
        this.v = jArr;
        this.f17840w = i13;
        this.f17841x = i14;
        this.f17842y = str;
        if (str != null) {
            try {
                this.A = new JSONObject(this.f17842y);
            } catch (JSONException unused) {
                this.A = null;
                this.f17842y = null;
            }
        } else {
            this.A = null;
        }
        this.B = i15;
        if (arrayList != null && !arrayList.isEmpty()) {
            c(arrayList);
        }
        this.D = z11;
        this.E = cVar;
        this.F = vVar;
        this.G = jVar;
        this.H = nVar;
        boolean z12 = false;
        if (nVar != null && nVar.f17821s) {
            z12 = true;
        }
        this.I = z12;
    }

    public final int b(int i10, JSONObject jSONObject) {
        JSONObject jSONObject2;
        int i11;
        double d;
        long[] jArr;
        boolean zB;
        JSONArray jSONArray;
        int length;
        SparseArray sparseArray;
        int i12;
        ArrayList arrayList;
        int i13;
        boolean z10;
        Integer num;
        JSONObject jSONObject3;
        Integer num2;
        p pVar;
        MediaInfo mediaInfo;
        Integer numA;
        int iIntValue;
        int i14;
        c cVar;
        v vVar;
        int i15;
        int i16;
        JSONObject jSONObjectOptJSONObject;
        j jVar;
        int i17;
        String strA;
        String str;
        m mVar;
        ArrayList arrayList2;
        boolean zOptBoolean;
        ArrayList arrayList3;
        int i18;
        int i19;
        String str2;
        String str3;
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList4;
        JSONArray jSONArrayOptJSONArray2;
        ArrayList arrayList5;
        int i20;
        JSONObject jSONObjectOptJSONObject2;
        MediaInfo mediaInfo2;
        int i21;
        int i22;
        int i23;
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("extendedStatus");
        if (jSONObjectOptJSONObject3 != null) {
            try {
                ArrayList arrayList6 = new ArrayList();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    arrayList6.add(itKeys.next());
                }
                jSONObject2 = new JSONObject(jSONObject, (String[]) arrayList6.toArray(new String[0]));
                Iterator<String> itKeys2 = jSONObjectOptJSONObject3.keys();
                while (itKeys2.hasNext()) {
                    String next = itKeys2.next();
                    jSONObject2.put(next, jSONObjectOptJSONObject3.get(next));
                }
                jSONObject2.remove("extendedStatus");
            } catch (JSONException unused) {
                jSONObject2 = jSONObject;
            }
        } else {
            jSONObject2 = jSONObject;
        }
        long j10 = jSONObject2.getLong("mediaSessionId");
        if (j10 != this.f17833b) {
            this.f17833b = j10;
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (jSONObject2.has("playerState")) {
            String string = jSONObject2.getString("playerState");
            if (string.equals("IDLE")) {
                i22 = 1;
            } else if (string.equals("PLAYING")) {
                i22 = 2;
            } else if (string.equals("PAUSED")) {
                i22 = 3;
            } else if (string.equals("BUFFERING")) {
                i22 = 4;
            } else {
                i22 = string.equals("LOADING") ? 5 : 0;
            }
            if (i22 != this.f17835e) {
                this.f17835e = i22;
                i11 |= 2;
            }
            if (i22 == 1 && jSONObject2.has("idleReason")) {
                String string2 = jSONObject2.getString("idleReason");
                if (string2.equals("CANCELLED")) {
                    i23 = 2;
                } else if (string2.equals("INTERRUPTED")) {
                    i23 = 3;
                } else if (string2.equals("FINISHED")) {
                    i23 = 1;
                } else {
                    i23 = string2.equals("ERROR") ? 4 : 0;
                }
                if (i23 != this.f17836f) {
                    this.f17836f = i23;
                    i11 |= 2;
                }
            }
        }
        if (jSONObject2.has("playbackRate")) {
            double d10 = jSONObject2.getDouble("playbackRate");
            if (this.d != d10) {
                this.d = d10;
                i11 |= 2;
            }
        }
        if (jSONObject2.has("currentTime")) {
            double d11 = jSONObject2.getDouble("currentTime");
            Pattern pattern = r5.a.f46766a;
            long j11 = (long) (d11 * 1000.0d);
            if (j11 != this.h) {
                this.h = j11;
                i11 |= 2;
            }
            i11 |= 128;
        }
        if (jSONObject2.has("supportedMediaCommands")) {
            long j12 = jSONObject2.getLong("supportedMediaCommands");
            if (j12 != this.f17837n) {
                this.f17837n = j12;
                i11 |= 2;
            }
        }
        if (jSONObject2.has("volume") && i10 == 0) {
            JSONObject jSONObject4 = jSONObject2.getJSONObject("volume");
            double d12 = jSONObject4.getDouble("level");
            d = 1000.0d;
            if (d12 != this.f17838r) {
                this.f17838r = d12;
                i11 |= 2;
            }
            boolean z11 = jSONObject4.getBoolean("muted");
            if (z11 != this.f17839s) {
                this.f17839s = z11;
                i11 |= 2;
            }
        } else {
            d = 1000.0d;
        }
        JSONArray jSONArray2 = jSONObject2.has("activeTrackIds") ? jSONObject2.getJSONArray("activeTrackIds") : null;
        Pattern pattern2 = r5.a.f46766a;
        if (jSONArray2 == null) {
            jArr = null;
        } else {
            jArr = new long[jSONArray2.length()];
            for (int i24 = 0; i24 < jSONArray2.length(); i24++) {
                jArr[i24] = jSONArray2.getLong(i24);
            }
        }
        if (jArr != null) {
            long[] jArr2 = this.v;
            if (jArr2 == null || jArr2.length != jArr.length) {
                this.v = jArr;
                i11 |= 2;
                break;
            }
            for (int i25 = 0; i25 < jArr.length; i25++) {
                if (this.v[i25] != jArr[i25]) {
                    this.v = jArr;
                    i11 |= 2;
                    break;
                }
            }
        } else if (this.v != null) {
            this.v = jArr;
            i11 |= 2;
            break;
        }
        if (jSONObject2.has("customData")) {
            this.A = jSONObject2.getJSONObject("customData");
            this.f17842y = null;
            i11 |= 2;
        }
        if (jSONObject2.has("media")) {
            JSONObject jSONObject5 = jSONObject2.getJSONObject("media");
            MediaInfo mediaInfo3 = new MediaInfo(jSONObject5);
            MediaInfo mediaInfo4 = this.f17832a;
            if (mediaInfo4 == null || !mediaInfo4.equals(mediaInfo3)) {
                this.f17832a = mediaInfo3;
                i11 |= 2;
            }
            if (jSONObject5.has("metadata")) {
                i11 |= 4;
            }
        }
        if (jSONObject2.has("currentItemId") && this.f17834c != (i21 = jSONObject2.getInt("currentItemId"))) {
            this.f17834c = i21;
            i11 |= 2;
        }
        int iOptInt = jSONObject2.optInt("preloadedItemId", 0);
        if (this.f17841x != iOptInt) {
            this.f17841x = iOptInt;
            i11 |= 16;
        }
        int iOptInt2 = jSONObject2.optInt("loadingItemId", 0);
        if (this.f17840w != iOptInt2) {
            this.f17840w = iOptInt2;
            i11 |= 2;
        }
        MediaInfo mediaInfo5 = this.f17832a;
        int i26 = mediaInfo5 == null ? -1 : mediaInfo5.f3144b;
        int i27 = this.f17835e;
        int i28 = this.f17836f;
        int i29 = this.f17840w;
        SparseArray sparseArray2 = this.J;
        ArrayList arrayList7 = this.C;
        double d13 = d;
        if (i27 != 1) {
            if (jSONObject2.has("repeatMode")) {
                numA = f7.a(jSONObject2.getString("repeatMode"));
                if (numA == null) {
                    iIntValue = this.B;
                } else {
                    iIntValue = numA.intValue();
                }
                if (this.B != iIntValue) {
                    this.B = iIntValue;
                    zB = true;
                } else {
                    zB = false;
                }
            } else {
                zB = false;
            }
            if (jSONObject2.has("items")) {
                jSONArray = jSONObject2.getJSONArray("items");
                length = jSONArray.length();
                sparseArray = new SparseArray();
                for (i12 = 0; i12 < length; i12++) {
                    sparseArray.put(i12, Integer.valueOf(jSONArray.getJSONObject(i12).getInt("itemId")));
                }
                arrayList = new ArrayList();
                for (i13 = 0; i13 < length; i13++) {
                    num = (Integer) sparseArray.get(i13);
                    jSONObject3 = jSONArray.getJSONObject(i13);
                    num2 = (Integer) sparseArray2.get(num.intValue());
                    if (num2 == null) {
                        pVar = null;
                    } else {
                        pVar = (p) arrayList7.get(num2.intValue());
                    }
                    if (pVar != null) {
                        zB |= pVar.b(jSONObject3);
                        arrayList.add(pVar);
                        if (i13 != ((Integer) sparseArray2.get(num.intValue())).intValue()) {
                        }
                    } else if (num.intValue() == this.f17834c) {
                        arrayList.add(new p(jSONObject3));
                    } else {
                        arrayList.add(new p(jSONObject3));
                    }
                    zB = true;
                }
                if (arrayList7.size() != length) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                zB |= !z10;
                c(arrayList);
            }
            if (zB) {
                i11 |= 8;
            }
            i14 = i11;
        } else if (i28 == 1) {
            if (i29 != 0) {
                this.f17834c = 0;
                this.f17840w = 0;
                this.f17841x = 0;
                if (arrayList7.isEmpty()) {
                    this.B = 0;
                    arrayList7.clear();
                    sparseArray2.clear();
                    i14 = i11 | 8;
                }
            } else {
                if (jSONObject2.has("repeatMode")) {
                    zB = false;
                } else {
                    numA = f7.a(jSONObject2.getString("repeatMode"));
                    if (numA == null) {
                        iIntValue = this.B;
                    } else {
                        iIntValue = numA.intValue();
                    }
                    if (this.B != iIntValue) {
                        this.B = iIntValue;
                        zB = true;
                    } else {
                        zB = false;
                    }
                }
                if (jSONObject2.has("items")) {
                    jSONArray = jSONObject2.getJSONArray("items");
                    length = jSONArray.length();
                    sparseArray = new SparseArray();
                    while (i12 < length) {
                        sparseArray.put(i12, Integer.valueOf(jSONArray.getJSONObject(i12).getInt("itemId")));
                    }
                    arrayList = new ArrayList();
                    while (i13 < length) {
                        num = (Integer) sparseArray.get(i13);
                        jSONObject3 = jSONArray.getJSONObject(i13);
                        num2 = (Integer) sparseArray2.get(num.intValue());
                        if (num2 == null) {
                            pVar = null;
                        } else {
                            pVar = (p) arrayList7.get(num2.intValue());
                        }
                        if (pVar != null) {
                            zB |= pVar.b(jSONObject3);
                            arrayList.add(pVar);
                            if (i13 != ((Integer) sparseArray2.get(num.intValue())).intValue()) {
                            }
                        } else if (num.intValue() == this.f17834c || (mediaInfo = this.f17832a) == null) {
                            arrayList.add(new p(jSONObject3));
                        } else {
                            p pVarK = new o(mediaInfo).k();
                            pVarK.b(jSONObject3);
                            arrayList.add(pVarK);
                        }
                        zB = true;
                    }
                    if (arrayList7.size() != length) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zB |= !z10;
                    c(arrayList);
                }
                if (zB) {
                    i11 |= 8;
                }
            }
            i14 = i11;
        } else {
            if (i28 == 2) {
                if (i26 == 2) {
                    if (jSONObject2.has("repeatMode")) {
                        zB = false;
                    } else {
                        numA = f7.a(jSONObject2.getString("repeatMode"));
                        if (numA == null) {
                            iIntValue = this.B;
                        } else {
                            iIntValue = numA.intValue();
                        }
                        if (this.B != iIntValue) {
                            this.B = iIntValue;
                            zB = true;
                        } else {
                            zB = false;
                        }
                    }
                    if (jSONObject2.has("items")) {
                        jSONArray = jSONObject2.getJSONArray("items");
                        length = jSONArray.length();
                        sparseArray = new SparseArray();
                        while (i12 < length) {
                            sparseArray.put(i12, Integer.valueOf(jSONArray.getJSONObject(i12).getInt("itemId")));
                        }
                        arrayList = new ArrayList();
                        while (i13 < length) {
                            num = (Integer) sparseArray.get(i13);
                            jSONObject3 = jSONArray.getJSONObject(i13);
                            num2 = (Integer) sparseArray2.get(num.intValue());
                            if (num2 == null) {
                                pVar = null;
                            } else {
                                pVar = (p) arrayList7.get(num2.intValue());
                            }
                            if (pVar != null) {
                                zB |= pVar.b(jSONObject3);
                                arrayList.add(pVar);
                                if (i13 != ((Integer) sparseArray2.get(num.intValue())).intValue()) {
                                }
                            } else if (num.intValue() == this.f17834c) {
                                arrayList.add(new p(jSONObject3));
                            } else {
                                arrayList.add(new p(jSONObject3));
                            }
                            zB = true;
                        }
                        if (arrayList7.size() != length) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        zB |= !z10;
                        c(arrayList);
                    }
                    if (zB) {
                        i11 |= 8;
                    }
                }
                i14 = i11;
            } else if (i28 == 3) {
                if (i29 != 0) {
                    if (jSONObject2.has("repeatMode")) {
                        zB = false;
                    } else {
                        numA = f7.a(jSONObject2.getString("repeatMode"));
                        if (numA == null) {
                            iIntValue = this.B;
                        } else {
                            iIntValue = numA.intValue();
                        }
                        if (this.B != iIntValue) {
                            this.B = iIntValue;
                            zB = true;
                        } else {
                            zB = false;
                        }
                    }
                    if (jSONObject2.has("items")) {
                        jSONArray = jSONObject2.getJSONArray("items");
                        length = jSONArray.length();
                        sparseArray = new SparseArray();
                        while (i12 < length) {
                            sparseArray.put(i12, Integer.valueOf(jSONArray.getJSONObject(i12).getInt("itemId")));
                        }
                        arrayList = new ArrayList();
                        while (i13 < length) {
                            num = (Integer) sparseArray.get(i13);
                            jSONObject3 = jSONArray.getJSONObject(i13);
                            num2 = (Integer) sparseArray2.get(num.intValue());
                            if (num2 == null) {
                                pVar = null;
                            } else {
                                pVar = (p) arrayList7.get(num2.intValue());
                            }
                            if (pVar != null) {
                                zB |= pVar.b(jSONObject3);
                                arrayList.add(pVar);
                                if (i13 != ((Integer) sparseArray2.get(num.intValue())).intValue()) {
                                }
                            } else if (num.intValue() == this.f17834c) {
                                arrayList.add(new p(jSONObject3));
                            } else {
                                arrayList.add(new p(jSONObject3));
                            }
                            zB = true;
                        }
                        if (arrayList7.size() != length) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        zB |= !z10;
                        c(arrayList);
                    }
                    if (zB) {
                        i11 |= 8;
                    }
                }
                i14 = i11;
            }
            this.f17834c = 0;
            this.f17840w = 0;
            this.f17841x = 0;
            if (arrayList7.isEmpty()) {
                i14 = i11;
            } else {
                this.B = 0;
                arrayList7.clear();
                sparseArray2.clear();
                i14 = i11 | 8;
            }
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject2.optJSONObject("breakStatus");
        Parcelable.Creator<c> creator = c.CREATOR;
        long j13 = -1;
        if (jSONObjectOptJSONObject4 != null && jSONObjectOptJSONObject4.has("currentBreakTime") && jSONObjectOptJSONObject4.has("currentBreakClipTime")) {
            try {
                long j14 = jSONObjectOptJSONObject4.getLong("currentBreakTime");
                Pattern pattern3 = r5.a.f46766a;
                long j15 = j14 * 1000;
                long j16 = jSONObjectOptJSONObject4.getLong("currentBreakClipTime") * 1000;
                String strA2 = r5.a.a("breakId", jSONObjectOptJSONObject4);
                String strA3 = r5.a.a("breakClipId", jSONObjectOptJSONObject4);
                long jOptLong = jSONObjectOptJSONObject4.optLong("whenSkippable", -1L);
                if (jOptLong != -1) {
                    jOptLong *= 1000;
                }
                cVar = new c(j15, j16, strA2, strA3, jOptLong);
            } catch (JSONException e9) {
                r5.b bVar = c.f17748f;
                Log.e(bVar.f46768a, bVar.d("Error while creating an AdBreakClipInfo from JSON", new Object[0]), e9);
                cVar = null;
            }
        } else {
            cVar = null;
        }
        c cVar2 = this.E;
        if ((cVar2 == null && cVar != null) || (cVar2 != null && !cVar2.equals(cVar))) {
            this.D = (cVar == null || (cVar.f17751c == null && cVar.d == null)) ? false : true;
            this.E = cVar;
            i14 |= 32;
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject2.optJSONObject("videoInfo");
        r5.b bVar2 = v.d;
        if (jSONObjectOptJSONObject5 == null) {
            vVar = null;
        } else {
            try {
                String string3 = jSONObjectOptJSONObject5.getString("hdrType");
                int iHashCode = string3.hashCode();
                if (iHashCode == 3218) {
                    if (string3.equals("dv")) {
                        i15 = 3;
                    }
                    bVar2.b("Unknown HDR type: %s", string3);
                    i15 = 0;
                } else if (iHashCode == 103158) {
                    if (string3.equals("hdr")) {
                        i15 = 4;
                    }
                    bVar2.b("Unknown HDR type: %s", string3);
                    i15 = 0;
                } else if (iHashCode != 113729) {
                    if (iHashCode == 99136405 && string3.equals("hdr10")) {
                        i15 = 2;
                    }
                    try {
                        bVar2.b("Unknown HDR type: %s", string3);
                        i15 = 0;
                    } catch (JSONException e10) {
                        e = e10;
                        bVar2.a(e, "Error while creating a VideoInfo instance from JSON", new Object[0]);
                        vVar = null;
                    }
                } else {
                    if (string3.equals("sdr")) {
                        i15 = 1;
                    }
                    bVar2.b("Unknown HDR type: %s", string3);
                    i15 = 0;
                }
                vVar = new v(jSONObjectOptJSONObject5.getInt("width"), jSONObjectOptJSONObject5.getInt("height"), i15);
            } catch (JSONException e11) {
                e = e11;
            }
        }
        v vVar2 = this.F;
        if ((vVar2 == null && vVar != null) || (vVar2 != null && !vVar2.equals(vVar))) {
            this.F = vVar;
            i14 |= 64;
        }
        if (jSONObject2.has("breakInfo") && (mediaInfo2 = this.f17832a) != null) {
            mediaInfo2.c(jSONObject2.getJSONObject("breakInfo"));
            i14 |= 2;
        }
        if (jSONObject2.has("queueData")) {
            JSONObject jSONObject6 = jSONObject2.getJSONObject("queueData");
            if (jSONObject6 == null) {
                i14 = i14;
                arrayList3 = null;
                mVar = null;
                str3 = null;
                str2 = null;
                i19 = 0;
                i18 = 0;
                zOptBoolean = false;
                strA = null;
                i17 = 0;
            } else {
                String strA4 = r5.a.a("id", jSONObject6);
                String strA5 = r5.a.a("entity", jSONObject6);
                switch (jSONObject6.optString("queueType")) {
                    case "PODCAST_SERIES":
                        i17 = 5;
                        break;
                    case "RADIO_STATION":
                        i17 = 4;
                        break;
                    case "PLAYLIST":
                        i17 = 2;
                        break;
                    case "AUDIOBOOK":
                        i17 = 3;
                        break;
                    case "TV_SERIES":
                        i17 = 6;
                        break;
                    case "ALBUM":
                        i17 = 1;
                        break;
                    case "MOVIE":
                        i17 = 9;
                        break;
                    case "VIDEO_PLAYLIST":
                        i17 = 7;
                        break;
                    case "LIVE_TV":
                        i17 = 8;
                        break;
                    default:
                        i17 = 0;
                        break;
                }
                strA = r5.a.a("name", jSONObject6);
                JSONObject jSONObjectOptJSONObject6 = jSONObject6.has("containerMetadata") ? jSONObject6.optJSONObject("containerMetadata") : null;
                if (jSONObjectOptJSONObject6 != null) {
                    String strOptString = jSONObjectOptJSONObject6.optString("containerType", "");
                    int iHashCode2 = strOptString.hashCode();
                    if (iHashCode2 == 6924225) {
                        int i30 = strOptString.equals("AUDIOBOOK_CONTAINER") ? 1 : 0;
                        String strA6 = r5.a.a("title", jSONObjectOptJSONObject6);
                        jSONArrayOptJSONArray = jSONObjectOptJSONObject6.optJSONArray("sections");
                        if (jSONArrayOptJSONArray != null) {
                            arrayList4 = new ArrayList();
                            i20 = 0;
                            while (i20 < jSONArrayOptJSONArray.length()) {
                                jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i20);
                                int i31 = i20;
                                if (jSONObjectOptJSONObject2 != null) {
                                    l lVar = new l(0);
                                    lVar.e(jSONObjectOptJSONObject2);
                                    arrayList4.add(lVar);
                                }
                                i20 = i31 + 1;
                                strA4 = strA4;
                            }
                        } else {
                            arrayList4 = null;
                        }
                        str = strA4;
                        jSONArrayOptJSONArray2 = jSONObjectOptJSONObject6.optJSONArray("containerImages");
                        if (jSONArrayOptJSONArray2 != null) {
                            arrayList5 = new ArrayList();
                            s5.a.c(arrayList5, jSONArrayOptJSONArray2);
                        } else {
                            arrayList5 = null;
                        }
                        double dOptDouble = jSONObjectOptJSONObject6.optDouble("containerDuration", 0.0d);
                        mVar = new m();
                        mVar.f17810a = i30;
                        mVar.f17811b = strA6;
                        mVar.f17812c = arrayList4;
                        mVar.d = arrayList5;
                        mVar.f17813e = dOptDouble;
                    } else if (iHashCode2 == 828666841) {
                        strOptString.equals("GENERIC_CONTAINER");
                    }
                    String strA7 = r5.a.a("title", jSONObjectOptJSONObject6);
                    jSONArrayOptJSONArray = jSONObjectOptJSONObject6.optJSONArray("sections");
                    if (jSONArrayOptJSONArray != null) {
                        arrayList4 = new ArrayList();
                        i20 = 0;
                        while (i20 < jSONArrayOptJSONArray.length()) {
                            jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i20);
                            int i32 = i20;
                            if (jSONObjectOptJSONObject2 != null) {
                                l lVar2 = new l(0);
                                lVar2.e(jSONObjectOptJSONObject2);
                                arrayList4.add(lVar2);
                            }
                            i20 = i32 + 1;
                            strA4 = strA4;
                        }
                    } else {
                        arrayList4 = null;
                    }
                    str = strA4;
                    jSONArrayOptJSONArray2 = jSONObjectOptJSONObject6.optJSONArray("containerImages");
                    if (jSONArrayOptJSONArray2 != null) {
                        arrayList5 = new ArrayList();
                        s5.a.c(arrayList5, jSONArrayOptJSONArray2);
                    } else {
                        arrayList5 = null;
                    }
                    double dOptDouble2 = jSONObjectOptJSONObject6.optDouble("containerDuration", 0.0d);
                    mVar = new m();
                    mVar.f17810a = i30;
                    mVar.f17811b = strA7;
                    mVar.f17812c = arrayList4;
                    mVar.d = arrayList5;
                    mVar.f17813e = dOptDouble2;
                } else {
                    i14 = i14;
                    str = strA4;
                    mVar = null;
                }
                Integer numA2 = f7.a(jSONObject6.optString("repeatMode"));
                int iIntValue2 = numA2 != null ? numA2.intValue() : 0;
                JSONArray jSONArrayOptJSONArray3 = jSONObject6.optJSONArray("items");
                if (jSONArrayOptJSONArray3 != null) {
                    arrayList2 = new ArrayList();
                    for (int i33 = 0; i33 < jSONArrayOptJSONArray3.length(); i33++) {
                        JSONObject jSONObjectOptJSONObject7 = jSONArrayOptJSONArray3.optJSONObject(i33);
                        if (jSONObjectOptJSONObject7 != null) {
                            try {
                                arrayList2.add(new p(jSONObjectOptJSONObject7));
                            } catch (JSONException unused2) {
                            }
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                int iOptInt3 = jSONObject6.optInt("startIndex", 0);
                long jOptDouble = jSONObject6.has("startTime") ? (long) (jSONObject6.optDouble("startTime", -1L) * d13) : -1L;
                zOptBoolean = jSONObject6.optBoolean("shuffle");
                arrayList3 = arrayList2;
                long j17 = jOptDouble;
                i18 = iOptInt3;
                i19 = iIntValue2;
                j13 = j17;
                str2 = strA5;
                str3 = str;
            }
            n nVar = new n();
            nVar.f17814a = str3;
            nVar.f17815b = str2;
            nVar.f17816c = i17;
            nVar.d = strA;
            nVar.f17817e = mVar;
            nVar.f17818f = i19;
            nVar.h = arrayList3;
            nVar.f17819n = i18;
            nVar.f17820r = j13;
            nVar.f17821s = zOptBoolean;
            this.H = nVar;
            if (this.I != zOptBoolean) {
                this.I = zOptBoolean;
                i16 = i14 | 8;
            }
            if (jSONObject2.has("liveSeekableRange")) {
                i16 |= 2;
                jSONObjectOptJSONObject = jSONObject2.optJSONObject("liveSeekableRange");
                Parcelable.Creator<j> creator2 = j.CREATOR;
                if (jSONObjectOptJSONObject == null && jSONObjectOptJSONObject.has("start") && jSONObjectOptJSONObject.has("end")) {
                    try {
                        double d14 = jSONObjectOptJSONObject.getDouble("start");
                        Pattern pattern4 = r5.a.f46766a;
                        jVar = new j((long) (d14 * d13), (long) (jSONObjectOptJSONObject.getDouble("end") * d13), jSONObjectOptJSONObject.optBoolean("isMovingWindow"), jSONObjectOptJSONObject.optBoolean("isLiveDone"));
                    } catch (JSONException unused3) {
                        r5.b bVar3 = j.f17791e;
                        Log.e(bVar3.f46768a, bVar3.d("Ignoring Malformed MediaLiveSeekableRange: ".concat(jSONObjectOptJSONObject.toString()), new Object[0]));
                        jVar = null;
                    }
                } else {
                    jVar = null;
                }
                this.G = jVar;
            } else {
                if (this.G != null) {
                    i16 |= 2;
                }
                this.G = null;
            }
            return i16;
        }
        i14 = i14;
        i16 = i14;
        if (jSONObject2.has("liveSeekableRange")) {
            i16 |= 2;
            jSONObjectOptJSONObject = jSONObject2.optJSONObject("liveSeekableRange");
            Parcelable.Creator<j> creator3 = j.CREATOR;
            if (jSONObjectOptJSONObject == null) {
                jVar = null;
            } else {
                double d15 = jSONObjectOptJSONObject.getDouble("start");
                Pattern pattern5 = r5.a.f46766a;
                jVar = new j((long) (d15 * d13), (long) (jSONObjectOptJSONObject.getDouble("end") * d13), jSONObjectOptJSONObject.optBoolean("isMovingWindow"), jSONObjectOptJSONObject.optBoolean("isLiveDone"));
            }
            this.G = jVar;
        } else {
            if (this.G != null) {
                i16 |= 2;
            }
            this.G = null;
        }
        return i16;
    }

    public final void c(List list) {
        ArrayList arrayList = this.C;
        arrayList.clear();
        SparseArray sparseArray = this.J;
        sparseArray.clear();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                p pVar = (p) list.get(i10);
                arrayList.add(pVar);
                sparseArray.put(pVar.f17825b, Integer.valueOf(i10));
            }
        }
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof r) {
                r rVar = (r) obj;
                if ((this.A == null) == (rVar.A == null) && this.f17833b == rVar.f17833b && this.f17834c == rVar.f17834c && this.d == rVar.d && this.f17835e == rVar.f17835e && this.f17836f == rVar.f17836f && this.h == rVar.h && this.f17838r == rVar.f17838r && this.f17839s == rVar.f17839s && this.f17840w == rVar.f17840w && this.f17841x == rVar.f17841x && this.B == rVar.B && Arrays.equals(this.v, rVar.v) && r5.a.d(Long.valueOf(this.f17837n), Long.valueOf(rVar.f17837n)) && r5.a.d(this.C, rVar.C) && r5.a.d(this.f17832a, rVar.f17832a) && (((jSONObject = this.A) == null || (jSONObject2 = rVar.A) == null || f6.c.a(jSONObject, jSONObject2)) && this.D == rVar.D && r5.a.d(this.E, rVar.E) && r5.a.d(this.F, rVar.F) && r5.a.d(this.G, rVar.G) && y5.l.l(this.H, rVar.H) && this.I == rVar.I)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17832a, Long.valueOf(this.f17833b), Integer.valueOf(this.f17834c), Double.valueOf(this.d), Integer.valueOf(this.f17835e), Integer.valueOf(this.f17836f), Long.valueOf(this.h), Long.valueOf(this.f17837n), Double.valueOf(this.f17838r), Boolean.valueOf(this.f17839s), Integer.valueOf(Arrays.hashCode(this.v)), Integer.valueOf(this.f17840w), Integer.valueOf(this.f17841x), String.valueOf(this.A), Integer.valueOf(this.B), this.C, Boolean.valueOf(this.D), this.E, this.F, this.G, this.H});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.A;
        this.f17842y = jSONObject == null ? null : jSONObject.toString();
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.f17832a, i10);
        long j10 = this.f17833b;
        r8.s(parcel, 3, 8);
        parcel.writeLong(j10);
        int i11 = this.f17834c;
        r8.s(parcel, 4, 4);
        parcel.writeInt(i11);
        double d = this.d;
        r8.s(parcel, 5, 8);
        parcel.writeDouble(d);
        int i12 = this.f17835e;
        r8.s(parcel, 6, 4);
        parcel.writeInt(i12);
        int i13 = this.f17836f;
        r8.s(parcel, 7, 4);
        parcel.writeInt(i13);
        long j11 = this.h;
        r8.s(parcel, 8, 8);
        parcel.writeLong(j11);
        long j12 = this.f17837n;
        r8.s(parcel, 9, 8);
        parcel.writeLong(j12);
        double d10 = this.f17838r;
        r8.s(parcel, 10, 8);
        parcel.writeDouble(d10);
        boolean z10 = this.f17839s;
        r8.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        r8.j(parcel, 12, this.v);
        int i14 = this.f17840w;
        r8.s(parcel, 13, 4);
        parcel.writeInt(i14);
        int i15 = this.f17841x;
        r8.s(parcel, 14, 4);
        parcel.writeInt(i15);
        r8.l(parcel, 15, this.f17842y);
        int i16 = this.B;
        r8.s(parcel, 16, 4);
        parcel.writeInt(i16);
        r8.p(parcel, 17, this.C);
        boolean z11 = this.D;
        r8.s(parcel, 18, 4);
        parcel.writeInt(z11 ? 1 : 0);
        r8.k(parcel, 19, this.E, i10);
        r8.k(parcel, 20, this.F, i10);
        r8.k(parcel, 21, this.G, i10);
        r8.k(parcel, 22, this.H, i10);
        r8.r(parcel, iQ);
    }
}
