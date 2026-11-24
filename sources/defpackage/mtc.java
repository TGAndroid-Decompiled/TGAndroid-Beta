package defpackage;

import android.os.AsyncTask;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
public final class mtc extends AsyncTask {
    public final byte a;
    public String b;
    public final String[] c;
    public final stc d;

    public mtc(stc stcVar, String str, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.d = stcVar;
                this.c = new String[4];
                this.b = str;
                return;
            case 2:
                this.d = stcVar;
                this.c = new String[2];
                this.b = str;
                return;
            case 3:
                this.d = stcVar;
                this.c = new String[2];
                this.b = str;
                return;
            case 4:
                this.d = stcVar;
                this.c = new String[2];
                this.b = str;
                return;
            default:
                this.d = stcVar;
                this.c = new String[2];
                this.b = str;
                return;
        }
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        byte b = this.a;
        stc stcVar = this.d;
        String[] strArr = this.c;
        switch (b) {
            case 0:
                Void[] voidArr = (Void[]) objArr;
                Locale locale = Locale.US;
                stcVar.getClass();
                String c = stc.c(this, "http://www.aparat.com/video/video/embed/vt/frame/showvideo/yes/videohash/" + this.b, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher = stc.s0.matcher(c);
                    if (matcher.find()) {
                        JSONArray jSONArray = new JSONArray(matcher.group(1));
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                            if (jSONArray2.length() != 0) {
                                JSONObject jSONObject = jSONArray2.getJSONObject(0);
                                if (jSONObject.has("file")) {
                                    strArr[0] = jSONObject.getString("file");
                                    strArr[1] = "other";
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr[0];
            case 1:
                Void[] voidArr2 = (Void[]) objArr;
                Locale locale2 = Locale.US;
                stcVar.getClass();
                String c2 = stc.c(this, "https://coub.com/api/v2/coubs/" + this.b + ".json", null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject(c2).getJSONObject("file_versions").getJSONObject("mobile");
                    String string = jSONObject2.getString("video");
                    String string2 = jSONObject2.getJSONArray("audio").getString(0);
                    if (string != null && string2 != null) {
                        strArr[0] = string;
                        strArr[1] = "other";
                        strArr[2] = string2;
                        strArr[3] = "other";
                    }
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr[0];
            case 2:
                Void[] voidArr3 = (Void[]) objArr;
                String str = this.b;
                stcVar.getClass();
                String c3 = stc.c(this, str, null, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher2 = stc.t0.matcher(c3);
                    if (matcher2.find()) {
                        strArr[0] = new JSONObject(matcher2.group(1)).getJSONArray("quality_options").getJSONObject(0).getString("source");
                        strArr[1] = "other";
                    }
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr[0];
            case 3:
                Void[] voidArr4 = (Void[]) objArr;
                HashMap hashMap = new HashMap();
                hashMap.put("Client-ID", "jzkbprff40iqj646a697cyrvl0zt2m6");
                int indexOf = this.b.indexOf(38);
                if (indexOf > 0) {
                    this.b = this.b.substring(0, indexOf);
                }
                Locale locale3 = Locale.US;
                stcVar.getClass();
                String c4 = stc.c(this, "https://api.twitch.tv/kraken/streams/" + this.b + "?stream_type=all", hashMap, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    new JSONObject(c4).getJSONObject("stream");
                    JSONObject jSONObject3 = new JSONObject(stc.c(this, "https://api.twitch.tv/api/channels/" + this.b + "/access_token", hashMap, false));
                    String encode = URLEncoder.encode(jSONObject3.getString("sig"), "UTF-8");
                    String encode2 = URLEncoder.encode(jSONObject3.getString("token"), "UTF-8");
                    URLEncoder.encode("https://youtube.googleapis.com/v/" + this.b, "UTF-8");
                    String str2 = this.b;
                    strArr[0] = "https://usher.ttvnw.net/api/channel/hls/" + str2 + ".m3u8?" + ("allow_source=true&allow_audio_only=true&allow_spectre=true&player=twitchweb&segment_preference=4&p=" + ((int) (Math.random() * 1.0E7d)) + "&sig=" + encode + "&token=" + encode2);
                    strArr[1] = "hls";
                } catch (Exception e4) {
                    fa4.g(e4, true);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr[0];
            default:
                Void[] voidArr5 = (Void[]) objArr;
                Locale locale4 = Locale.US;
                stcVar.getClass();
                String c5 = stc.c(this, "https://player.vimeo.com/video/" + this.b + "/config", null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    JSONObject jSONObject4 = new JSONObject(c5).getJSONObject("request").getJSONObject("files");
                    if (jSONObject4.has("hls")) {
                        JSONObject jSONObject5 = jSONObject4.getJSONObject("hls");
                        try {
                            strArr[0] = jSONObject5.getString("url");
                        } catch (Exception unused) {
                            strArr[0] = jSONObject5.getJSONObject("cdns").getJSONObject(jSONObject5.getString("default_cdn")).getString("url");
                        }
                        strArr[1] = "hls";
                    } else if (jSONObject4.has("progressive")) {
                        strArr[1] = "other";
                        strArr[0] = jSONObject4.getJSONArray("progressive").getJSONObject(0).getString("url");
                    }
                } catch (Exception e5) {
                    fa4.g(e5, true);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr[0];
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        byte b = this.a;
        String[] strArr = this.c;
        stc stcVar = this.d;
        switch (b) {
            case 0:
                String str = (String) obj;
                if (str != null) {
                    stcVar.x = true;
                    stcVar.y = str;
                    stcVar.E = strArr[1];
                    if (stcVar.s) {
                        stcVar.i();
                    }
                    stcVar.j(false, true);
                    stcVar.g0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    stcVar.h();
                    return;
                } else {
                    return;
                }
            case 1:
                String str2 = (String) obj;
                if (str2 != null) {
                    stcVar.x = true;
                    stcVar.y = str2;
                    stcVar.E = strArr[1];
                    stcVar.F = strArr[2];
                    stcVar.G = strArr[3];
                    if (stcVar.s) {
                        stcVar.i();
                    }
                    stcVar.j(false, true);
                    stcVar.g0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    stcVar.h();
                    return;
                } else {
                    return;
                }
            case 2:
                String str3 = (String) obj;
                if (str3 != null) {
                    stcVar.x = true;
                    stcVar.y = str3;
                    stcVar.E = strArr[1];
                    if (stcVar.s) {
                        stcVar.i();
                    }
                    stcVar.j(false, true);
                    stcVar.g0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    stcVar.h();
                    return;
                } else {
                    return;
                }
            case 3:
                String str4 = (String) obj;
                if (str4 != null) {
                    stcVar.x = true;
                    stcVar.y = str4;
                    stcVar.E = strArr[1];
                    if (stcVar.s) {
                        stcVar.i();
                    }
                    stcVar.j(false, true);
                    stcVar.g0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    stcVar.h();
                    return;
                } else {
                    return;
                }
            default:
                String str5 = (String) obj;
                if (str5 != null) {
                    stcVar.x = true;
                    stcVar.y = str5;
                    stcVar.E = strArr[1];
                    if (stcVar.s) {
                        stcVar.i();
                    }
                    stcVar.j(false, true);
                    stcVar.g0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    stcVar.h();
                    return;
                } else {
                    return;
                }
        }
    }
}
