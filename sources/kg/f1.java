package kg;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import c8.hc;
import fi.l5;
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
import ki.e4;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.sr;
import org.telegram.messenger.tr;
import org.telegram.messenger.u10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.x60;
import org.telegram.ui.bx;
import org.telegram.ui.vw;
import org.telegram.ui.w91;
public final class f1 implements u10, org.telegram.ui.ActionBar.q1, h2.o, i2.u, kt, oi.l0, vw, n5 {
    public final int f18411a;
    public final Object f18412b;

    public f1(Object obj, int i7) {
        this.f18411a = i7;
        this.f18412b = obj;
    }

    @Override
    public boolean F() {
        return false;
    }

    @Override
    public boolean O(bx bxVar) {
        return false;
    }

    @Override
    public void a(long j3, h2.x xVar) {
        switch (this.f18411a) {
            case 17:
                f3.b.c(j3, xVar, ((m4.c0) this.f18412b).f20650c);
                return;
            default:
                f3.b.d(j3, xVar, ((m4.c0) this.f18412b).f20650c);
                return;
        }
    }

    public m5.b b(h6.m mVar) {
        InputStream inputStream;
        m5.c cVar = (m5.c) this.f18412b;
        URL url = (URL) mVar.f13931b;
        String c10 = hc.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f20932g);
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
                i5 i5Var = cVar.f20927a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                pa.d dVar = (pa.d) i5Var.f29095a;
                pa.e eVar = new pa.e(bufferedWriter, dVar.f55629a, dVar.f55630b, dVar.f55631c, dVar.d);
                eVar.h((n5.m) mVar.f13932c);
                eVar.j();
                eVar.f55633b.flush();
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
                        m5.b bVar = new m5.b(responseCode, null, n5.u.a(new BufferedReader(new InputStreamReader(inputStream))).f21506a);
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
        oi.y yVar = (oi.y) this.f18412b;
        yVar.f22600c = i7;
        yVar.e(i7);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18411a) {
            case 1:
                t1 t1Var2 = (t1) ((bi.w1) this.f18412b).f4171b;
                w1 f10 = w1.f(t1.g0(t1Var2));
                ArrayList arrayList = t1Var2.f18581b;
                int i10 = f10.f18614a;
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    if (f10.c(((Integer) arrayList.get(i11)).intValue()) == null) {
                        arrayList.remove(i11);
                        i11--;
                    }
                    i11++;
                }
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        v1 c10 = f10.c(((Integer) arrayList.get(i12)).intValue());
                        f10.f18615b.remove(c10);
                        f10.a(c10.f18602b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.f18601a;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_deleteQuickReplyShortcut, new l5(6));
                        if ("hello".equals(c10.f18602b)) {
                            ConnectionsManager.getInstance(i10).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull d2 = mp.u1(i10).d2(i10.i(i10).e());
                            if (d2 != null) {
                                d2.flags2 &= -5;
                                d2.business_greeting_message = null;
                                tr.a0(i10).j2(d2, true);
                            }
                        } else if ("away".equals(c10.f18602b)) {
                            ConnectionsManager.getInstance(i10).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull d22 = mp.u1(i10).d2(i10.i(i10).e());
                            if (d22 != null) {
                                d22.flags2 &= -9;
                                d22.business_away_message = null;
                                tr.a0(i10).j2(d22, true);
                            }
                        }
                    }
                    f10.l();
                    tr a02 = tr.a0(i10);
                    a02.f27149a.c(new hi.h1(a02, arrayList, 2));
                    ks.f(i10).k(121, new Object[0]);
                }
                t1.c0(t1Var2);
                return;
            case 2:
            default:
                ((aa.c0) this.f18412b).run();
                return;
            case 3:
                ((ki.d) this.f18412b).run();
                return;
            case 4:
                ki.j jVar = (ki.j) this.f18412b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = jVar.getMessagesController().q1(jVar.S);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, jVar.getParentActivity(), null);
                t1Var3.r(150L);
                jVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ki.b(jVar, t1Var3, 0));
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f18411a) {
            case 7:
                ((e2.a1) obj).o((e2.e) this.f18412b);
                return;
            case 8:
                ((e2.a1) obj).E((e2.q1) this.f18412b);
                return;
            case 9:
                ((e2.a1) obj).x((g2.c) this.f18412b);
                return;
            case 10:
                ((e2.a1) obj).p(((l2.a0) this.f18412b).f19342a.Q);
                return;
            case 11:
                ((e2.a1) obj).M((e2.q0) this.f18412b);
                return;
            case 12:
            default:
                ((m2.b) obj).l((x2.c0) this.f18412b);
                return;
            case 13:
                ((m2.b) obj).G((e2.v0) this.f18412b);
                return;
            case 14:
                ((m2.b) obj).onSeekStarted((m2.a) this.f18412b);
                return;
            case 15:
                ((m2.b) obj).A((l2.e) this.f18412b);
                return;
        }
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i7;
        d1 d1Var;
        d1 d1Var2;
        int i10;
        int i11;
        int i12 = this.f18411a;
        Object obj3 = this.f18412b;
        switch (i12) {
            case 0:
                final h1 h1Var = (h1) obj3;
                n41 n41Var = (n41) obj;
                final View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                int i13 = h1Var.f18428c;
                int i14 = h1Var.d;
                ArrayList arrayList = h1Var.f18427b;
                int i15 = n41Var.d;
                if (i15 == -1) {
                    h1Var.f18432r = !h1Var.f18432r;
                    arrayList.clear();
                    if (h1Var.f18432r) {
                        arrayList.add(new d1(0, 1439));
                    }
                    r8 r8Var = (r8) view;
                    boolean z10 = h1Var.f18432r;
                    n41Var.f37648e = z10;
                    r8Var.setChecked(z10);
                    boolean z11 = h1Var.f18432r;
                    if (z11) {
                        i11 = n6.f29489f6;
                    } else {
                        i11 = n6.f29470e6;
                    }
                    r8Var.b(n6.x0(null, i11, false), z11);
                    h1Var.f18431n.f35323g3.O(true);
                    i0 i0Var = h1Var.f18430f;
                    if (i0Var != null) {
                        i0Var.run();
                        return;
                    }
                    return;
                } else if (i15 == -2) {
                    if (!arrayList.isEmpty() && !h1Var.Z()) {
                        int i16 = ((d1) i5.c.h(1, arrayList)).f18380b;
                        int j3 = Utilities.j(i16 + 30, i14 - 1, i13);
                        arrayList.add(new d1(j3, Utilities.j((i16 + 1560) / 2, i14, j3 + 1)));
                    } else {
                        if (h1Var.Z()) {
                            arrayList.clear();
                        }
                        int j10 = Utilities.j(480, i14 - 1, i13);
                        arrayList.add(new d1(j10, Utilities.j(1200, i14, j10 + 1)));
                    }
                    i0 i0Var2 = h1Var.f18430f;
                    if (i0Var2 != null) {
                        i0Var2.run();
                    }
                    h1Var.f18431n.f35323g3.O(true);
                    return;
                } else if (n41Var.f56712a == 3 && (i7 = i15 / 3) >= 0 && i7 < arrayList.size()) {
                    int i17 = i7 - 1;
                    if (i17 >= 0) {
                        d1Var = (d1) arrayList.get(i17);
                    } else {
                        d1Var = null;
                    }
                    final d1 d1Var3 = (d1) arrayList.get(i7);
                    int i18 = i7 + 1;
                    if (i18 < arrayList.size()) {
                        d1Var2 = (d1) arrayList.get(i18);
                    } else {
                        d1Var2 = null;
                    }
                    int i19 = n41Var.d % 3;
                    if (i19 == 0) {
                        Activity parentActivity = h1Var.getParentActivity();
                        String N0 = gd.N0(2131752738, null);
                        int i20 = d1Var3.f18379a;
                        if (d1Var != null) {
                            i13 = d1Var.f18380b + 1;
                        }
                        b5.U(parentActivity, N0, i20, i13, d1Var3.f18380b - 1, new w10() {
                            @Override
                            public final void a(Object obj4) {
                                Integer num2 = (Integer) obj4;
                                switch (r4) {
                                    case 0:
                                        h1 h1Var2 = h1Var;
                                        boolean a02 = h1Var2.a0();
                                        int intValue = num2.intValue();
                                        d1Var3.f18379a = intValue;
                                        ((m8) view).w(d1.a(intValue), true);
                                        if (a02 != h1Var2.a0()) {
                                            h1Var2.f18431n.f35323g3.O(true);
                                        }
                                        i0 i0Var3 = h1Var2.f18430f;
                                        if (i0Var3 != null) {
                                            i0Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        h1 h1Var3 = h1Var;
                                        boolean a03 = h1Var3.a0();
                                        int intValue2 = num2.intValue();
                                        d1Var3.f18380b = intValue2;
                                        ((m8) view).w(d1.a(intValue2), true);
                                        if (a03 != h1Var3.a0()) {
                                            h1Var3.f18431n.f35323g3.O(true);
                                        }
                                        i0 i0Var4 = h1Var3.f18430f;
                                        if (i0Var4 != null) {
                                            i0Var4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i19 == 1) {
                        Activity parentActivity2 = h1Var.getParentActivity();
                        String N02 = gd.N0(2131752744, null);
                        int i21 = d1Var3.f18380b;
                        int i22 = d1Var3.f18379a + 1;
                        if (d1Var2 == null) {
                            i10 = i14;
                        } else {
                            i10 = d1Var2.f18379a - 1;
                        }
                        b5.U(parentActivity2, N02, i21, i22, i10, new w10() {
                            @Override
                            public final void a(Object obj4) {
                                Integer num2 = (Integer) obj4;
                                switch (r4) {
                                    case 0:
                                        h1 h1Var2 = h1Var;
                                        boolean a02 = h1Var2.a0();
                                        int intValue = num2.intValue();
                                        d1Var3.f18379a = intValue;
                                        ((m8) view).w(d1.a(intValue), true);
                                        if (a02 != h1Var2.a0()) {
                                            h1Var2.f18431n.f35323g3.O(true);
                                        }
                                        i0 i0Var3 = h1Var2.f18430f;
                                        if (i0Var3 != null) {
                                            i0Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        h1 h1Var3 = h1Var;
                                        boolean a03 = h1Var3.a0();
                                        int intValue2 = num2.intValue();
                                        d1Var3.f18380b = intValue2;
                                        ((m8) view).w(d1.a(intValue2), true);
                                        if (a03 != h1Var3.a0()) {
                                            h1Var3.f18431n.f35323g3.O(true);
                                        }
                                        i0 i0Var4 = h1Var3.f18430f;
                                        if (i0Var4 != null) {
                                            i0Var4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i19 == 2) {
                        arrayList.remove(i7);
                        if (arrayList.isEmpty()) {
                            arrayList.add(new d1(0, 1439));
                        }
                        h1Var.f18431n.f35323g3.O(true);
                        i0 i0Var3 = h1Var.f18430f;
                        if (i0Var3 != null) {
                            i0Var3.run();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
            case 3:
            case 4:
            default:
                n41 n41Var2 = (n41) obj;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                if (((t3[]) obj3)[0] != null && (view2 instanceof a6)) {
                    ((a6) view2).B();
                    return;
                }
                return;
            case 2:
                Integer num3 = (Integer) number;
                Float f14 = (Float) serializable;
                Float f15 = (Float) serializable2;
                y1.Z((y1) obj3, (n41) obj, (View) obj2);
                return;
            case 5:
                View view3 = (View) obj2;
                Integer num4 = (Integer) number;
                Float f16 = (Float) serializable;
                Float f17 = (Float) serializable2;
                ki.q.a0((ki.q) obj3, (n41) obj);
                return;
            case 6:
                View view4 = (View) obj2;
                Integer num5 = (Integer) number;
                Float f18 = (Float) serializable;
                Float f19 = (Float) serializable2;
                ((e4) obj3).a0((n41) obj);
                return;
        }
    }

    @Override
    public x60 m(oi.f1 f1Var) {
        return x60.I((b2) ((hi.u0) this.f18412b).f15482b, f1Var);
    }

    @Override
    public void u() {
        switch (this.f18411a) {
            case 22:
                oi.q0 q0Var = (oi.q0) this.f18412b;
                oi.f1 f1Var = q0Var.d;
                oi.a aVar = q0Var.f22391f;
                if (aVar != null) {
                    aVar.f22016s = true;
                    aVar.f22015r = f1Var.f22178q2;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f22001b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = c6.f(f1Var.getText());
                    }
                }
                c3 c3Var = q0Var.h;
                if (c3Var != null && q0Var.f22391f != null) {
                    t3.S1(c3Var.f22111a);
                    return;
                }
                return;
            case 27:
                ((e5) this.f18412b).g();
                return;
            default:
                m5 m5Var = (m5) this.f18412b;
                oi.a aVar2 = m5Var.f22598a;
                if (aVar2 != null) {
                    aVar2.f22016s = true;
                    aVar2.f22015r = m5Var.f22314r.f22178q2;
                }
                m5Var.w();
                b3 b3Var = m5Var.F;
                if (b3Var != null && m5Var.f22598a != null) {
                    t3.S1(b3Var.f22090a);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean z(bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        g4 g4Var = (g4) this.f18412b;
        if (arrayList.isEmpty() || ((sr) arrayList.get(0)).f26946a <= 0) {
            return false;
        }
        g4Var.run(((sr) arrayList.get(0)).f26946a);
        bxVar.finishFragment();
        return true;
    }

    public f1(m2.a aVar, Object obj, int i7) {
        this.f18411a = i7;
        this.f18412b = obj;
    }

    public f1(m2.a aVar, x2.u uVar, x2.c0 c0Var, IOException iOException, boolean z10) {
        this.f18411a = 16;
        this.f18412b = c0Var;
    }
}
