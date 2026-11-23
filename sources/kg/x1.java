package kg;

import android.util.Log;
import android.view.View;
import c8.gc;
import hi.t5;
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
import oi.a6;
import oi.b2;
import oi.b3;
import oi.c3;
import oi.c6;
import oi.e5;
import oi.g4;
import oi.m5;
import oi.n5;
import oi.t3;
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
public final class x1 implements w10, org.telegram.ui.ActionBar.q1, h2.o, i2.u, mt, oi.l0, ww, n5, Vector.TLDeserializer {
    public final int f18563a;
    public final Object f18564b;

    public x1(Object obj, int i7) {
        this.f18563a = i7;
        this.f18564b = obj;
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
        switch (this.f18563a) {
            case 15:
                f3.b.c(j3, xVar, ((m4.c0) this.f18564b).f20588c);
                return;
            default:
                f3.b.d(j3, xVar, ((m4.c0) this.f18564b).f20588c);
                return;
        }
    }

    public m5.b b(h6.m mVar) {
        InputStream inputStream;
        m5.c cVar = (m5.c) this.f18564b;
        URL url = (URL) mVar.f13968b;
        String c10 = gc.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f20870g);
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
                c5 c5Var = cVar.f20865a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                pa.d dVar = (pa.d) c5Var.f30508a;
                pa.e eVar = new pa.e(bufferedWriter, dVar.f55551a, dVar.f55552b, dVar.f55553c, dVar.d);
                eVar.h((n5.m) mVar.f13969c);
                eVar.j();
                eVar.f55555b.flush();
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
                        m5.b bVar = new m5.b(responseCode, null, n5.u.a(new BufferedReader(new InputStreamReader(inputStream))).f21441a);
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
        oi.y yVar = (oi.y) this.f18564b;
        yVar.f22533c = i7;
        yVar.e(i7);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i7, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f18564b).lambda$readParams$0(inputSerializedData, i7, z10);
        return lambda$readParams$0;
    }

    @Override
    public void g() {
        switch (this.f18563a) {
            case 20:
                oi.q0 q0Var = (oi.q0) this.f18564b;
                oi.f1 f1Var = q0Var.d;
                oi.a aVar = q0Var.f22326f;
                if (aVar != null) {
                    aVar.f21950s = true;
                    aVar.f21949r = f1Var.f22112q2;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f21935b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = c6.f(f1Var.getText());
                    }
                }
                c3 c3Var = q0Var.h;
                if (c3Var != null && q0Var.f22326f != null) {
                    t3.S1(c3Var.f22045a);
                    return;
                }
                return;
            case 25:
                ((e5) this.f18564b).g();
                return;
            default:
                m5 m5Var = (m5) this.f18564b;
                oi.a aVar2 = m5Var.f22531a;
                if (aVar2 != null) {
                    aVar2.f21950s = true;
                    aVar2.f21949r = m5Var.f22246r.f22112q2;
                }
                m5Var.w();
                b3 b3Var = m5Var.F;
                if (b3Var != null && m5Var.f22531a != null) {
                    t3.S1(b3Var.f22024a);
                    return;
                }
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18563a) {
            case 1:
                ((ki.d) this.f18564b).run();
                return;
            case 2:
                ki.j jVar = (ki.j) this.f18564b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = jVar.getMessagesController().q1(jVar.S);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, jVar.getParentActivity(), null);
                t1Var2.r(150L);
                jVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ki.b(jVar, t1Var2, 0));
                return;
            default:
                ((aa.c0) this.f18564b).run();
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f18563a) {
            case 5:
                ((e2.a1) obj).o((e2.e) this.f18564b);
                return;
            case 6:
                ((e2.a1) obj).E((e2.q1) this.f18564b);
                return;
            case 7:
                ((e2.a1) obj).x((g2.c) this.f18564b);
                return;
            case 8:
                ((e2.a1) obj).p(((l2.z) this.f18564b).f19628a.Q);
                return;
            case 9:
                ((e2.a1) obj).M((e2.q0) this.f18564b);
                return;
            case 10:
            default:
                ((m2.b) obj).b((x2.c0) this.f18564b);
                return;
            case 11:
                ((m2.b) obj).G((e2.v0) this.f18564b);
                return;
            case 12:
                ((m2.b) obj).onSeekStarted((m2.a) this.f18564b);
                return;
            case 13:
                ((m2.b) obj).z((l2.d) this.f18564b);
                return;
        }
    }

    @Override
    public a70 j(oi.f1 f1Var) {
        return a70.I((b2) ((t5) this.f18564b).f15508b, f1Var);
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.f18563a) {
            case 0:
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                y1.Z((y1) this.f18564b, (o41) obj, (View) obj2);
                return;
            case 1:
            case 2:
            default:
                o41 o41Var = (o41) obj;
                View view = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                if (((t3[]) this.f18564b)[0] != null && (view instanceof a6)) {
                    ((a6) view).B();
                    return;
                }
                return;
            case 3:
                View view2 = (View) obj2;
                Integer num3 = (Integer) number;
                Float f14 = (Float) serializable;
                Float f15 = (Float) serializable2;
                ki.q.a0((ki.q) this.f18564b, (o41) obj);
                return;
            case 4:
                View view3 = (View) obj2;
                Integer num4 = (Integer) number;
                Float f16 = (Float) serializable;
                Float f17 = (Float) serializable2;
                ((d4) this.f18564b).a0((o41) obj);
                return;
        }
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        g4 g4Var = (g4) this.f18564b;
        if (arrayList.isEmpty() || ((tr) arrayList.get(0)).f27073a <= 0) {
            return false;
        }
        g4Var.run(((tr) arrayList.get(0)).f27073a);
        cxVar.finishFragment();
        return true;
    }

    public x1(m2.a aVar, Object obj, int i7) {
        this.f18563a = i7;
        this.f18564b = obj;
    }

    public x1(m2.a aVar, x2.u uVar, x2.c0 c0Var, IOException iOException, boolean z10) {
        this.f18563a = 14;
        this.f18564b = c0Var;
    }
}
