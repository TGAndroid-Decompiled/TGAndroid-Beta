package ki;

import android.util.Log;
import android.view.View;
import c8.gc;
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
import oi.b6;
import oi.d5;
import oi.l5;
import oi.m5;
import oi.z5;
import org.telegram.messenger.sr;
import org.telegram.messenger.v10;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.y60;
import org.telegram.ui.cx;
import org.telegram.ui.ww;
import org.telegram.ui.y91;
public final class e implements org.telegram.ui.ActionBar.r1, v10, h2.o, i2.u, kt, oi.k0, ww, m5, Vector.TLDeserializer {
    public final int f18628a;
    public final Object f18629b;

    public e(Object obj, int i7) {
        this.f18628a = i7;
        this.f18629b = obj;
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
        switch (this.f18628a) {
            case 14:
                f3.b.c(j3, xVar, ((m4.c0) this.f18629b).f20557c);
                return;
            default:
                f3.b.d(j3, xVar, ((m4.c0) this.f18629b).f20557c);
                return;
        }
    }

    public m5.b b(h6.m mVar) {
        InputStream inputStream;
        m5.c cVar = (m5.c) this.f18629b;
        URL url = (URL) mVar.f13936b;
        String c10 = gc.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f20839g);
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
                c5 c5Var = cVar.f20834a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                pa.d dVar = (pa.d) c5Var.f30477a;
                pa.e eVar = new pa.e(bufferedWriter, dVar.f55506a, dVar.f55507b, dVar.f55508c, dVar.d);
                eVar.h((n5.m) mVar.f13937c);
                eVar.j();
                eVar.f55510b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String c11 = gc.c("CctTransportBackend");
                if (Log.isLoggable(c11, 4)) {
                    Log.i(c11, String.format("Status Code: %d", valueOf));
                }
                gc.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                gc.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
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
                        m5.b bVar = new m5.b(responseCode, null, n5.u.a(new BufferedReader(new InputStreamReader(inputStream))).f21410a);
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
            gc.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new m5.b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            gc.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new m5.b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            gc.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new m5.b(400, null, 0L);
        } catch (na.b e13) {
            e = e13;
            gc.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new m5.b(400, null, 0L);
        }
    }

    public void c(int i7) {
        oi.x xVar = (oi.x) this.f18629b;
        xVar.f22441c = i7;
        xVar.e(i7);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i7, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f18628a) {
            case 28:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f18629b).lambda$readParams$0(inputSerializedData, i7, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f18629b).lambda$readParams$0(inputSerializedData, i7, z10);
                return lambda$readParams$02;
        }
    }

    @Override
    public void g() {
        switch (this.f18628a) {
            case 19:
                oi.p0 p0Var = (oi.p0) this.f18629b;
                oi.e1 e1Var = p0Var.d;
                oi.a aVar = p0Var.f22233f;
                if (aVar != null) {
                    aVar.f21922s = true;
                    aVar.f21921r = e1Var.f22019q2;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f21907b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = b6.f(e1Var.getText());
                    }
                }
                oi.b3 b3Var = p0Var.h;
                if (b3Var != null && p0Var.f22233f != null) {
                    oi.s3.S1(b3Var.f21949a);
                    return;
                }
                return;
            case 24:
                ((d5) this.f18629b).g();
                return;
            default:
                l5 l5Var = (l5) this.f18629b;
                oi.a aVar2 = l5Var.f22439a;
                if (aVar2 != null) {
                    aVar2.f21922s = true;
                    aVar2.f21921r = l5Var.f22163r.f22019q2;
                }
                l5Var.w();
                oi.a3 a3Var = l5Var.F;
                if (a3Var != null && l5Var.f22439a != null) {
                    oi.s3.S1(a3Var.f21932a);
                    return;
                }
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f18628a) {
            case 0:
                ((d) this.f18629b).run();
                return;
            case 1:
                k kVar = (k) this.f18629b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = kVar.getMessagesController().q1(kVar.S);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, kVar.getParentActivity(), null);
                u1Var2.r(150L);
                kVar.getConnectionsManager().sendRequest(updatestarrefprogram, new b(kVar, u1Var2, 0));
                return;
            default:
                ((aa.c0) this.f18629b).run();
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f18628a) {
            case 4:
                ((e2.a1) obj).o((e2.e) this.f18629b);
                return;
            case 5:
                ((e2.a1) obj).E((e2.q1) this.f18629b);
                return;
            case 6:
                ((e2.a1) obj).x((g2.c) this.f18629b);
                return;
            case 7:
                ((e2.a1) obj).p(((l2.z) this.f18629b).f19597a.Q);
                return;
            case 8:
                ((e2.a1) obj).M((e2.q0) this.f18629b);
                return;
            case 9:
            default:
                ((m2.b) obj).b((x2.c0) this.f18629b);
                return;
            case 10:
                ((m2.b) obj).G((e2.v0) this.f18629b);
                return;
            case 11:
                ((m2.b) obj).onSeekStarted((m2.a) this.f18629b);
                return;
            case 12:
                ((m2.b) obj).z((l2.d) this.f18629b);
                return;
        }
    }

    @Override
    public y60 j(oi.e1 e1Var) {
        return y60.I((oi.z1) ((u5) this.f18629b).f15536b, e1Var);
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.f18628a) {
            case 2:
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                r.a0((r) this.f18629b, (l41) obj);
                return;
            case 3:
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                ((e4) this.f18629b).a0((l41) obj);
                return;
            default:
                l41 l41Var = (l41) obj;
                View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                Float f14 = (Float) serializable;
                Float f15 = (Float) serializable2;
                if (((oi.s3[]) this.f18629b)[0] != null && (view3 instanceof z5)) {
                    ((z5) view3).B();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        oi.f4 f4Var = (oi.f4) this.f18629b;
        if (arrayList.isEmpty() || ((sr) arrayList.get(0)).f26845a <= 0) {
            return false;
        }
        f4Var.run(((sr) arrayList.get(0)).f26845a);
        cxVar.finishFragment();
        return true;
    }

    public e(m2.a aVar, Object obj, int i7) {
        this.f18628a = i7;
        this.f18629b = obj;
    }

    public e(m2.a aVar, x2.u uVar, x2.c0 c0Var, IOException iOException, boolean z10) {
        this.f18628a = 13;
        this.f18629b = c0Var;
    }
}
