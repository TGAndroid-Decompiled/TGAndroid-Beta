package kg;

import android.util.Log;
import android.view.View;
import c8.hc;
import hi.u5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import ki.d4;
import oi.a3;
import oi.b3;
import oi.b6;
import oi.d5;
import oi.f4;
import oi.l5;
import oi.m5;
import oi.s3;
import oi.z5;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.o41;
import org.telegram.ui.cx;
import org.telegram.ui.ww;
import org.telegram.ui.y91;
public final class y1 implements w10, org.telegram.ui.ActionBar.q1, h2.o, i2.u, mt, oi.k0, ww, m5, Vector.TLDeserializer {
    public final int f18537a;
    public final Object f18538b;

    public y1(Object obj, int i7) {
        this.f18537a = i7;
        this.f18538b = obj;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean P(cx cxVar) {
        return false;
    }

    @Override
    public void a(long j3, h2.x xVar) {
        switch (this.f18537a) {
            case 15:
                f3.b.c(j3, xVar, ((m4.c0) this.f18538b).f20554c);
                return;
            default:
                f3.b.d(j3, xVar, ((m4.c0) this.f18538b).f20554c);
                return;
        }
    }

    public m5.b b(h6.m mVar) {
        InputStream inputStream;
        m5.c cVar = (m5.c) this.f18538b;
        URL url = (URL) mVar.f13931b;
        String c10 = hc.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f20836g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) mVar.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                c5 c5Var = cVar.f20831a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                pa.d dVar = (pa.d) c5Var.f30474a;
                pa.e eVar = new pa.e(bufferedWriter, dVar.f55516a, dVar.f55517b, dVar.f55518c, dVar.d);
                eVar.h((n5.m) mVar.f13932c);
                eVar.j();
                eVar.f55520b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String c11 = hc.c("CctTransportBackend");
                if (Log.isLoggable(c11, 4)) {
                    Log.i(c11, String.format("Status Code: %d", valueOf));
                }
                hc.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                hc.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new m5.b(responseCode, null, 0L);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                            inputStream = new GZIPInputStream(inputStream2);
                        } else {
                            inputStream = inputStream2;
                        }
                        m5.b bVar = new m5.b(responseCode, null, n5.u.a(new BufferedReader(new InputStreamReader(inputStream))).f21407a);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        return bVar;
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
                return new m5.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
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
        } catch (ConnectException e10) {
            e = e10;
            hc.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new m5.b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            hc.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new m5.b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            hc.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new m5.b(400, null, 0L);
        } catch (na.b e13) {
            e = e13;
            hc.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new m5.b(400, null, 0L);
        }
    }

    public void c(int i7) {
        oi.x xVar = (oi.x) this.f18538b;
        xVar.f22470c = i7;
        xVar.e(i7);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i7, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f18538b).lambda$readParams$0(inputSerializedData, i7, z10);
        return lambda$readParams$0;
    }

    @Override
    public void g() {
        switch (this.f18537a) {
            case 20:
                oi.p0 p0Var = (oi.p0) this.f18538b;
                oi.e1 e1Var = p0Var.d;
                oi.a aVar = p0Var.f22263f;
                if (aVar != null) {
                    aVar.f21916s = true;
                    aVar.f21915r = e1Var.f22048q2;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f21901b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = b6.f(e1Var.getText());
                    }
                }
                b3 b3Var = p0Var.h;
                if (b3Var != null && p0Var.f22263f != null) {
                    s3.S1(b3Var.f21978a);
                    return;
                }
                return;
            case 25:
                ((d5) this.f18538b).g();
                return;
            default:
                l5 l5Var = (l5) this.f18538b;
                oi.a aVar2 = l5Var.f22468a;
                if (aVar2 != null) {
                    aVar2.f21916s = true;
                    aVar2.f21915r = l5Var.f22184r.f22048q2;
                }
                l5Var.w();
                a3 a3Var = l5Var.F;
                if (a3Var != null && l5Var.f22468a != null) {
                    s3.S1(a3Var.f21961a);
                    return;
                }
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18537a) {
            case 1:
                ((ki.d) this.f18538b).run();
                return;
            case 2:
                ki.j jVar = (ki.j) this.f18538b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = jVar.getMessagesController().q1(jVar.S);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, jVar.getParentActivity(), null);
                t1Var2.r(150L);
                jVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ki.b(jVar, t1Var2, 0));
                return;
            default:
                ((aa.c0) this.f18538b).run();
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f18537a) {
            case 5:
                ((e2.a1) obj).o((e2.e) this.f18538b);
                return;
            case 6:
                ((e2.a1) obj).E((e2.q1) this.f18538b);
                return;
            case 7:
                ((e2.a1) obj).x((g2.c) this.f18538b);
                return;
            case 8:
                ((e2.a1) obj).p(((l2.z) this.f18538b).f19594a.Q);
                return;
            case 9:
                ((e2.a1) obj).M((e2.q0) this.f18538b);
                return;
            case 10:
            default:
                ((m2.b) obj).b((x2.c0) this.f18538b);
                return;
            case 11:
                ((m2.b) obj).G((e2.v0) this.f18538b);
                return;
            case 12:
                ((m2.b) obj).onSeekStarted((m2.a) this.f18538b);
                return;
            case 13:
                ((m2.b) obj).z((l2.d) this.f18538b);
                return;
        }
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.f18537a) {
            case 0:
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                z1.Z((z1) this.f18538b, (o41) obj, (View) obj2);
                return;
            case 1:
            case 2:
            default:
                o41 o41Var = (o41) obj;
                View view = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                if (((s3[]) this.f18538b)[0] != null && (view instanceof z5)) {
                    ((z5) view).B();
                    return;
                }
                return;
            case 3:
                View view2 = (View) obj2;
                Integer num3 = (Integer) number;
                Float f14 = (Float) serializable;
                Float f15 = (Float) serializable2;
                ki.q.a0((ki.q) this.f18538b, (o41) obj);
                return;
            case 4:
                View view3 = (View) obj2;
                Integer num4 = (Integer) number;
                Float f16 = (Float) serializable;
                Float f17 = (Float) serializable2;
                ((d4) this.f18538b).a0((o41) obj);
                return;
        }
    }

    @Override
    public a70 m(oi.e1 e1Var) {
        return a70.I((oi.a2) ((u5) this.f18538b).f15495b, e1Var);
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        f4 f4Var = (f4) this.f18538b;
        if (arrayList.isEmpty() || ((tr) arrayList.get(0)).f27037a <= 0) {
            return false;
        }
        f4Var.run(((tr) arrayList.get(0)).f27037a);
        cxVar.finishFragment();
        return true;
    }

    public y1(m2.a aVar, Object obj, int i7) {
        this.f18537a = i7;
        this.f18538b = obj;
    }

    public y1(m2.a aVar, x2.u uVar, x2.c0 c0Var, IOException iOException, boolean z10) {
        this.f18537a = 14;
        this.f18538b = c0Var;
    }
}
