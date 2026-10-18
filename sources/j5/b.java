package j5;

import ai.x9;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import androidx.biometric.e;
import b2.b1;
import b2.z0;
import b5.h;
import c0.i;
import c0.j;
import c5.b0;
import ci.y7;
import com.google.android.gms.internal.cast.z5;
import d9.k;
import e9.n0;
import j9.w;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k5.m;
import ki.a0;
import ki.c3;
import ki.c6;
import ki.d2;
import ki.d3;
import ki.e6;
import ki.g5;
import ki.h1;
import ki.i4;
import ki.o0;
import ki.o5;
import ki.p5;
import ki.t0;
import ki.t1;
import ki.w3;
import m4.e0;
import m4.e1;
import m4.f0;
import m4.g1;
import m4.i1;
import m4.m1;
import m4.s1;
import m4.u;
import m4.v;
import m4.z;
import n4.s;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.voip.k1;
import org.telegram.ui.Components.voip.t;
import org.telegram.ui.ey;
import org.telegram.ui.te1;
import org.telegram.ui.web.c0;
import org.telegram.ui.web.y0;
import org.telegram.ui.xx;
import org.webrtc.GlGenericDrawer;
import p4.r0;
import p4.s0;
import r9.r;
import w7.j6;
public final class b implements gu, o0, Utilities.Callback5, a2, xx, p5, j, e0, g1, e2.j, e1, k, ne.d, r9.d, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, k1, a5.b {
    public final int f14254a;
    public final Object f14255b;

    public b(Object obj, int i10) {
        this.f14254a = i10;
        this.f14255b = obj;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public void F() {
        switch (this.f14254a) {
            case 3:
                t0 t0Var = (t0) this.f14255b;
                h1 h1Var = t0Var.d;
                ki.a aVar = t0Var.f15521f;
                if (aVar != null) {
                    aVar.f15108s = true;
                    aVar.f15107r = h1Var.E;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f15094b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = e6.f(h1Var.getText());
                    }
                }
                d3 d3Var = t0Var.h;
                if (d3Var != null && t0Var.f15521f != null) {
                    w3.P1(d3Var.f15230a);
                    return;
                }
                return;
            case 8:
                ((g5) this.f14255b).h();
                return;
            default:
                o5 o5Var = (o5) this.f14255b;
                ki.a aVar2 = o5Var.f15110a;
                if (aVar2 != null) {
                    aVar2.f15108s = true;
                    aVar2.f15107r = o5Var.f15430r.E;
                }
                o5Var.u();
                c3 c3Var = o5Var.E;
                if (c3Var != null && o5Var.f15110a != null) {
                    w3.P1(c3Var.f15174a);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean K(ey eyVar) {
        return false;
    }

    @Override
    public Object a(i iVar) {
        f0 f0Var = (f0) this.f14255b;
        f0Var.f16528o.post(new z(0, f0Var, iVar));
        return "onPlayRequested";
    }

    @Override
    public void accept(Object obj) {
        switch (this.f14254a) {
            case 14:
                ((m1) obj).f((z0) this.f14255b);
                return;
            default:
                ((n2.k) obj).a((oa.d) this.f14255b);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f14254a) {
            case 17:
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                i9.a aVar = (i9.a) ((s) this.f14255b).f17125c;
                if (aVar.a(Math.max(height, width))) {
                    if (aVar.a(height)) {
                        height--;
                    }
                    if (aVar.a(width)) {
                        width--;
                    }
                    return e0.e0.c(Bitmap.createScaledBitmap(bitmap, width, height, true));
                }
                return bitmap;
            default:
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i10 = ((b0) this.f14255b).f4703b;
                if (width2 > i10 || bitmap2.getHeight() > i10) {
                    float f7 = i10;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f7 / width3, f7 / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                return e0.e0.c(bitmap2);
        }
    }

    @Override
    public void b(u uVar, int i10) {
        uVar.c(i10, (b1) this.f14255b);
    }

    @Override
    public void c(WebView webView, a5.a aVar, Uri uri, boolean z10, h hVar) {
        String uri2;
        y0 y0Var = (y0) this.f14255b;
        org.telegram.ui.web.b1 b1Var = y0Var.Q;
        if (webView == y0Var && b1Var != null) {
            if (webView == b1Var.f42519a && aVar.f280b == 0) {
                if (uri == null) {
                    uri2 = null;
                } else {
                    uri2 = uri.toString();
                }
                String k10 = org.telegram.ui.web.b1.k(uri2);
                if (b1Var.f42544t0 && (TextUtils.isEmpty(b1Var.F0) || !TextUtils.equals(b1Var.F0, k10) || !TextUtils.equals(b1Var.F0, b1Var.getOriginHost()))) {
                    b1Var.g("onBotWebMessage ignored: untrusted origin");
                    return;
                }
                y7 f7 = b1Var.f();
                try {
                    aVar.h(0);
                    String str = (String) aVar.f281c;
                    if (str != null && str.length() <= 1048576) {
                        JSONObject jSONObject = new JSONObject(str);
                        String string = jSONObject.getString("eventType");
                        if (!string.isEmpty() && string.length() <= 128) {
                            AndroidUtilities.runOnUIThread(new c0(b1Var, webView, f7, string, jSONObject.optString("eventData", null), 2));
                            return;
                        }
                        b1Var.g("onBotWebMessage ignored: invalid event type");
                        return;
                    }
                    b1Var.g("onBotWebMessage ignored: invalid payload length");
                    return;
                } catch (JSONException e) {
                    FileLog.e(e);
                    return;
                }
            }
            b1Var.g("onBotWebMessage ignored: invalid source or payload");
        }
    }

    @Override
    public void d(m1 m1Var, v vVar) {
        ((e2.j) this.f14255b).accept(m1Var);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f14254a) {
            case 23:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f14255b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f14255b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override
    public Object e(f0 f0Var, v vVar, int i10) {
        int i11 = this.f14254a;
        Object obj = this.f14255b;
        switch (i11) {
            case 13:
                return f0Var.l(vVar, (n0) obj);
            default:
                e1 e1Var = (e1) obj;
                w wVar = w.f14361b;
                if (!f0Var.j()) {
                    e1Var.d(f0Var.f16533t, vVar);
                    i1.P0(f0Var, vVar, i10, new s1(0));
                }
                return w.f14361b;
        }
    }

    public c f(e eVar) {
        InputStream inputStream;
        d dVar = (d) this.f14255b;
        URL url = (URL) eVar.f2819b;
        String c10 = j6.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(dVar.f14263g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) eVar.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                t1 t1Var = dVar.f14259a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                la.d dVar2 = (la.d) t1Var.f15524b;
                la.e eVar2 = new la.e(bufferedWriter, dVar2.f15986a, dVar2.f15987b, dVar2.f15988c, dVar2.d);
                eVar2.h((k5.i) eVar.f2820c);
                eVar2.j();
                eVar2.f15990b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String c11 = j6.c("CctTransportBackend");
                if (Log.isLoggable(c11, 4)) {
                    Log.i(c11, String.format("Status Code: %d", valueOf));
                }
                j6.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                j6.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new c(responseCode, null, 0L);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                            inputStream = new GZIPInputStream(inputStream2);
                        } else {
                            inputStream = inputStream2;
                        }
                        c cVar = new c(responseCode, null, m.a(new BufferedReader(new InputStreamReader(inputStream))).f14950a);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        return cVar;
                    } catch (Throwable th2) {
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                return new c(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (ja.b e) {
            e = e;
            j6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c(400, null, 0L);
        } catch (ConnectException e7) {
            e = e7;
            j6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            j6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            j6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c(400, null, 0L);
        }
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f14254a) {
            case 6:
                ((x9) this.f14255b).run();
                return;
            default:
                ((c0) this.f14255b).run();
                return;
        }
    }

    @Override
    public i80 h(h1 h1Var) {
        return i80.H((d2) ((ag.b) this.f14255b).f634b, h1Var);
    }

    public void i(int i10) {
        a0 a0Var = (a0) this.f14255b;
        a0Var.f15112c = i10;
        a0Var.f(i10);
    }

    @Override
    public Object j2(z5 z5Var) {
        return new oa.c((Context) z5Var.a(Context.class), ((l9.h) z5Var.a(l9.h.class)).d(), z5Var.y(oa.d.class), z5Var.b(ya.c.class), (Executor) z5Var.f((r) this.f14255b));
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        f61 f61Var = (f61) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        if (((w3[]) this.f14255b)[0] != null) {
            num.intValue();
            f7.floatValue();
            f10.floatValue();
            if (view instanceof c6) {
                ((c6) view).B();
            }
        }
    }

    @Override
    public void u(int i10, float f7, float f10, ne.e eVar) {
        ((Switch) this.f14255b).invalidate();
    }

    @Override
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, te1 te1Var) {
        i4 i4Var = (i4) this.f14255b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        i4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        eyVar.finishFragment();
        return true;
    }

    public b(s0 s0Var, r0 r0Var) {
        this.f14254a = 29;
        this.f14255b = s0Var;
    }

    @Override
    public void run(Bitmap bitmap, int i10) {
        t tVar = (t) this.f14255b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
        AndroidUtilities.runOnUIThread(new go0(26, tVar, bitmap));
    }

    @Override
    public void E(float f7, int i10) {
    }
}
