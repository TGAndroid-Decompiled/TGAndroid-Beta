package ki;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import c8.dc;
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
import oi.a6;
import oi.c5;
import oi.k5;
import oi.l5;
import oi.y5;
import org.telegram.messenger.ur;
import org.telegram.messenger.x10;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.m60;
import org.telegram.ui.sw;
import org.telegram.ui.u91;
import org.telegram.ui.yw;
public final class e implements org.telegram.ui.ActionBar.q1, x10, h2.o, i2.u, dt, oi.k0, sw, l5, Vector.TLDeserializer, r0.m {
    public final int f18271a;
    public final Object f18272b;

    public e(Object obj, int i7) {
        this.f18271a = i7;
        this.f18272b = obj;
    }

    @Override
    public void E() {
        switch (this.f18271a) {
            case 18:
                oi.p0 p0Var = (oi.p0) this.f18272b;
                oi.e1 e1Var = p0Var.d;
                oi.a aVar = p0Var.f21869f;
                if (aVar != null) {
                    aVar.f21559s = true;
                    aVar.f21558r = e1Var.f21665q2;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f21544b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = a6.f(e1Var.getText());
                    }
                }
                oi.z2 z2Var = p0Var.h;
                if (z2Var != null && p0Var.f21869f != null) {
                    oi.q3.S1(z2Var.f22192a);
                    return;
                }
                return;
            case 23:
                ((c5) this.f18272b).g();
                return;
            default:
                k5 k5Var = (k5) this.f18272b;
                oi.a aVar2 = k5Var.f22106a;
                if (aVar2 != null) {
                    aVar2.f21559s = true;
                    aVar2.f21558r = k5Var.f21776r.f21665q2;
                }
                k5Var.w();
                oi.y2 y2Var = k5Var.F;
                if (y2Var != null && k5Var.f22106a != null) {
                    oi.q3.S1(y2Var.f22138a);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        ActionBarLayout actionBarLayout = (ActionBarLayout) this.f18272b;
        Drawable drawable = ActionBarLayout.f28322w1;
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        i0.c I02 = org.telegram.messenger.g0.I0(k1Var, true);
        actionBarLayout.f28371u1 = I0;
        actionBarLayout.f28373v1 = I02;
        actionBarLayout.f28369t1 = k1Var;
        int childCount = actionBarLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            actionBarLayout.o(actionBarLayout.getChildAt(i7), k1Var);
        }
        return r0.k1.f55681b;
    }

    @Override
    public boolean P(yw ywVar) {
        return false;
    }

    @Override
    public void a(long j3, h2.x xVar) {
        switch (this.f18271a) {
            case 13:
                f3.b.c(j3, xVar, ((m4.c0) this.f18272b).f20196c);
                return;
            default:
                f3.b.d(j3, xVar, ((m4.c0) this.f18272b).f20196c);
                return;
        }
    }

    @Override
    public m60 b(oi.e1 e1Var) {
        return m60.H((oi.z1) ((ia.d) this.f18272b).f15881b, e1Var);
    }

    public m5.b c(h6.m mVar) {
        InputStream inputStream;
        m5.c cVar = (m5.c) this.f18272b;
        URL url = (URL) mVar.f13624b;
        String c10 = dc.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f20478g);
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
                cf cfVar = cVar.f20473a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                pa.d dVar = (pa.d) cfVar.f33545a;
                pa.e eVar = new pa.e(bufferedWriter, dVar.f54930a, dVar.f54931b, dVar.f54932c, dVar.d);
                eVar.h((n5.m) mVar.f13625c);
                eVar.j();
                eVar.f54934b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String c11 = dc.c("CctTransportBackend");
                if (Log.isLoggable(c11, 4)) {
                    Log.i(c11, String.format("Status Code: %d", valueOf));
                }
                dc.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                dc.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
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
                        m5.b bVar = new m5.b(responseCode, null, n5.u.a(new BufferedReader(new InputStreamReader(inputStream))).f21049a);
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
            dc.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new m5.b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            dc.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new m5.b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            dc.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new m5.b(400, null, 0L);
        } catch (na.b e13) {
            e = e13;
            dc.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new m5.b(400, null, 0L);
        }
    }

    public void d(int i7) {
        oi.x xVar = (oi.x) this.f18272b;
        xVar.f22108c = i7;
        xVar.e(i7);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i7, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f18271a) {
            case 27:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f18272b).lambda$readParams$0(inputSerializedData, i7, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f18272b).lambda$readParams$0(inputSerializedData, i7, z10);
                return lambda$readParams$02;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18271a) {
            case 0:
                k kVar = (k) this.f18272b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = kVar.getMessagesController().o1(kVar.S);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, kVar.getParentActivity(), null);
                t1Var2.r(150L);
                kVar.getConnectionsManager().sendRequest(updatestarrefprogram, new b(kVar, t1Var2, 0));
                return;
            default:
                ((aa.c0) this.f18272b).run();
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f18271a) {
            case 3:
                ((e2.a1) obj).n((e2.e) this.f18272b);
                return;
            case 4:
                ((e2.a1) obj).E((e2.q1) this.f18272b);
                return;
            case 5:
                ((e2.a1) obj).x((g2.c) this.f18272b);
                return;
            case 6:
                ((e2.a1) obj).o(((l2.z) this.f18272b).f19233a.Q);
                return;
            case 7:
                ((e2.a1) obj).M((e2.q0) this.f18272b);
                return;
            case 8:
            default:
                ((m2.b) obj).k((x2.b0) this.f18272b);
                return;
            case 9:
                ((m2.b) obj).G((e2.v0) this.f18272b);
                return;
            case 10:
                ((m2.b) obj).onSeekStarted((m2.a) this.f18272b);
                return;
            case 11:
                ((m2.b) obj).z((l2.d) this.f18272b);
                return;
        }
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.f18271a) {
            case 1:
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                s.a0((s) this.f18272b, (b41) obj);
                return;
            case 2:
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                ((j4) this.f18272b).a0((b41) obj);
                return;
            default:
                b41 b41Var = (b41) obj;
                View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                Float f14 = (Float) serializable;
                Float f15 = (Float) serializable2;
                if (((oi.q3[]) this.f18272b)[0] != null && (view3 instanceof y5)) {
                    ((y5) view3).B();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        oi.d4 d4Var = (oi.d4) this.f18272b;
        if (arrayList.isEmpty() || ((ur) arrayList.get(0)).f26861a <= 0) {
            return false;
        }
        d4Var.run(((ur) arrayList.get(0)).f26861a);
        ywVar.finishFragment();
        return true;
    }

    public e(m2.a aVar, Object obj, int i7) {
        this.f18271a = i7;
        this.f18272b = obj;
    }

    public e(m2.a aVar, x2.t tVar, x2.b0 b0Var, IOException iOException, boolean z10) {
        this.f18271a = 12;
        this.f18272b = b0Var;
    }
}
