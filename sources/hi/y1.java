package hi;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import bi.u6;
import j$.util.Objects;
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
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w70;
import org.telegram.ui.ig1;
import org.telegram.ui.qy;
import org.telegram.ui.wy;
public final class y1 implements q0, Utilities.Callback5, org.telegram.ui.ActionBar.c2, qy, du, s5, e2.m, f2.s, a5.b, le.d, m4.a0, m4.g1, m4.e1, q9.d, og.k0 {
    public final int f9975a;
    public final Object f9976b;

    public y1(j2.a aVar, Object obj, int i10) {
        this.f9975a = i10;
        this.f9976b = obj;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public void G(int i10, float f7, float f10, le.e eVar) {
        ((Switch) this.f9976b).invalidate();
    }

    @Override
    public boolean J(wy wyVar) {
        return false;
    }

    @Override
    public Object P1(u6 u6Var) {
        return new na.c((Context) u6Var.a(Context.class), ((k9.h) u6Var.a(k9.h.class)).d(), u6Var.x(na.d.class), u6Var.c(xa.b.class), (Executor) u6Var.h((q9.r) this.f9976b));
    }

    @Override
    public Typeface a() {
        return og.m0.a((Font) this.f9976b);
    }

    @Override
    public void b(WebView webView, a5.a aVar, Uri uri, boolean z10, b5.h hVar) {
        b5.h hVar2;
        ki.k kVar = (ki.k) this.f9976b;
        if (webView == kVar.f12559m && z10 && kVar.d.equals(uri.toString())) {
            int i10 = aVar.f275b;
            if (i10 == 0) {
                aVar.d(0);
                kVar.g((String) aVar.f276c, hVar);
            } else if (i10 == 1) {
                synchronized (kVar.f12550a) {
                    if (!kVar.f12562p && (hVar2 = kVar.f12560n) != null && hVar2 == hVar) {
                        aVar.d(1);
                        byte[] bArr = (byte[]) aVar.d;
                        Objects.requireNonNull(bArr);
                        kVar.f12555i.execute(new fg.s1(29, kVar, bArr));
                    }
                }
            }
        }
    }

    @Override
    public void c(long j3, e2.v vVar) {
        switch (this.f9975a) {
            case 18:
                c3.b.d(j3, vVar, ((j4.d0) this.f9976b).f11536c);
                return;
            default:
                c3.b.e(j3, vVar, ((j4.d0) this.f9976b).f11536c);
                return;
        }
    }

    @Override
    public void d(m4.q qVar, int i10) {
        qVar.c(i10, (b2.x0) this.f9976b);
    }

    @Override
    public void e(m4.l1 l1Var, m4.r rVar) {
        ((e2.h) this.f9976b).accept(l1Var);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ((bi.g2) this.f9976b).run();
    }

    @Override
    public w70 g(k1 k1Var) {
        return w70.H((g2) ((xa.c) this.f9976b).f45077b, k1Var);
    }

    public c0 h(aa.a aVar) {
        InputStream inputStream;
        j5.b bVar = (j5.b) this.f9976b;
        URL url = (URL) aVar.f356c;
        String c10 = w7.i6.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.f11776g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) aVar.f355b;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                a6.i iVar = bVar.f11772a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                ka.d dVar = (ka.d) iVar.f301b;
                ka.e eVar = new ka.e(bufferedWriter, dVar.f12412a, dVar.f12413b, dVar.f12414c, dVar.d);
                eVar.h((k5.i) aVar.d);
                eVar.j();
                eVar.f12416b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String c11 = w7.i6.c("CctTransportBackend");
                if (Log.isLoggable(c11, 4)) {
                    Log.i(c11, String.format("Status Code: %d", valueOf));
                }
                w7.i6.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                w7.i6.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new c0(responseCode, null, 0L);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                            inputStream = new GZIPInputStream(inputStream2);
                        } else {
                            inputStream = inputStream2;
                        }
                        c0 c0Var = new c0(responseCode, null, k5.m.a(new BufferedReader(new InputStreamReader(inputStream))).f12333a);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        return c0Var;
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
                return new c0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
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
        } catch (ia.b e) {
            e = e;
            w7.i6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c0(400, null, 0L);
        } catch (ConnectException e7) {
            e = e7;
            w7.i6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c0(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            w7.i6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c0(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            w7.i6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c0(400, null, 0L);
        }
    }

    @Override
    public Object i(m4.b0 b0Var, m4.r rVar, int i10) {
        int i11 = this.f9975a;
        Object obj = this.f9976b;
        switch (i11) {
            case 25:
                return b0Var.l(rVar, (e9.i0) obj);
            default:
                m4.e1 e1Var = (m4.e1) obj;
                i9.u uVar = i9.u.f10538b;
                if (!b0Var.j()) {
                    e1Var.e(b0Var.f13307t, rVar);
                    m4.h1.O0(b0Var, rVar, i10, new m4.r1(0));
                }
                return i9.u.f10538b;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f9975a) {
            case 7:
                ((b2.z0) obj).onMediaMetadataChanged((b2.n0) this.f9976b);
                return;
            case 8:
                ((b2.z0) obj).onAudioAttributesChanged((b2.e) this.f9976b);
                return;
            case 9:
                ((b2.z0) obj).onTrackSelectionParametersChanged((b2.q1) this.f9976b);
                return;
            case 10:
                ((b2.z0) obj).onCues((d2.c) this.f9976b);
                return;
            case 11:
                ((b2.z0) obj).onMediaMetadataChanged(((i2.b0) this.f9976b).f10108a.O);
                return;
            case 12:
                ((b2.z0) obj).onMetadata((b2.p0) this.f9976b);
                return;
            case 13:
            default:
                ((j2.b) obj).b((u2.c0) this.f9976b);
                return;
            case 14:
                ((j2.b) obj).h((b2.u0) this.f9976b);
                return;
            case 15:
                ((j2.b) obj).onSeekStarted((j2.a) this.f9976b);
                return;
            case 16:
                ((j2.b) obj).a((i2.g) this.f9976b);
                return;
        }
    }

    @Override
    public void j() {
        switch (this.f9975a) {
            case 4:
                ((j5) this.f9976b).h();
                return;
            default:
                r5 r5Var = (r5) this.f9976b;
                a aVar = r5Var.f9464a;
                if (aVar != null) {
                    aVar.f9435s = true;
                    aVar.f9434r = r5Var.f9829r.E;
                }
                r5Var.u();
                f3 f3Var = r5Var.E;
                if (f3Var != null && r5Var.f9464a != null) {
                    z3.N1(f3Var.f9568a);
                    return;
                }
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        v51 v51Var = (v51) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        if (((z3[]) this.f9976b)[0] != null) {
            num.intValue();
            f7.floatValue();
            f10.floatValue();
            if (view instanceof g6) {
                ((g6) view).B();
            }
        }
    }

    @Override
    public boolean v(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        l4 l4Var = (l4) this.f9976b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        l4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        wyVar.finishFragment();
        return true;
    }

    public y1(j2.a aVar, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        this.f9975a = 17;
        this.f9976b = c0Var;
    }

    public y1(Object obj, int i10) {
        this.f9975a = i10;
        this.f9976b = obj;
    }

    @Override
    public void B(float f7, int i10) {
    }
}
