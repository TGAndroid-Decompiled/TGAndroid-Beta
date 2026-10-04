package ei;

import ai.u7;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import ci.qc;
import com.google.android.gms.tasks.OnSuccessListener;
import ii.f6;
import ii.i5;
import ii.q5;
import ii.r5;
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
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.g61;
import org.telegram.ui.oy;
import org.telegram.ui.uy;
import org.telegram.ui.yf1;
import w7.h6;
public final class f implements org.telegram.ui.ActionBar.a2, Utilities.Callback5, OnSuccessListener, c3.g, e2.m, cu, ii.p0, oy, r5, f2.s {
    public final int f9021a;
    public final Object f9022b;

    public f(j2.a aVar, Object obj, int i10) {
        this.f9021a = i10;
        this.f9022b = obj;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean H(uy uyVar) {
        return false;
    }

    @Override
    public b80 a(ii.i1 i1Var) {
        return b80.H((ii.e2) ((a4.m) this.f9022b).f297b, i1Var);
    }

    @Override
    public void b(long j3, e2.v vVar) {
        switch (this.f9021a) {
            case 27:
                c3.b.d(j3, vVar, ((j4.c0) this.f9022b).f13715c);
                return;
            default:
                c3.b.e(j3, vVar, ((j4.c0) this.f9022b).f13715c);
                return;
        }
    }

    public ii.b0 c(aa.a aVar) {
        InputStream inputStream;
        j5.b bVar = (j5.b) this.f9022b;
        URL url = (URL) aVar.f387c;
        String c10 = h6.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.f13994g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) aVar.f386b;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                k2.e eVar = bVar.f13989a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                ka.d dVar = (ka.d) eVar.f14389b;
                ka.e eVar2 = new ka.e(bufferedWriter, dVar.f14739a, dVar.f14740b, dVar.f14741c, dVar.d);
                eVar2.h((k5.i) aVar.d);
                eVar2.j();
                eVar2.f14743b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String c11 = h6.c("CctTransportBackend");
                if (Log.isLoggable(c11, 4)) {
                    Log.i(c11, String.format("Status Code: %d", valueOf));
                }
                h6.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                h6.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new ii.b0(responseCode, null, 0L);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                            inputStream = new GZIPInputStream(inputStream2);
                        } else {
                            inputStream = inputStream2;
                        }
                        ii.b0 b0Var = new ii.b0(responseCode, null, k5.m.a(new BufferedReader(new InputStreamReader(inputStream))).f14652a);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        return b0Var;
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
                return new ii.b0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
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
        } catch (ia.b e7) {
            e = e7;
            h6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new ii.b0(400, null, 0L);
        } catch (ConnectException e10) {
            e = e10;
            h6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new ii.b0(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            h6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new ii.b0(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            h6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new ii.b0(400, null, 0L);
        }
    }

    public void d(int i10) {
        ii.a0 a0Var = (ii.a0) this.f9022b;
        a0Var.f12206c = i10;
        a0Var.f(i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f9021a) {
            case 0:
                m mVar = (m) this.f9022b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = mVar.getMessagesController().getInputUser(mVar.P);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(mVar.getParentActivity(), 3, null);
                b2Var2.q(150L);
                mVar.getConnectionsManager().sendRequest(updatestarrefprogram, new b(mVar, b2Var2, 0));
                return;
            case 6:
                hg.y1 y1Var = ((hg.p1) this.f9022b).f11297a;
                hg.b2 f7 = hg.b2.f(hg.y1.b0(y1Var));
                ArrayList arrayList = y1Var.f11408b;
                int i11 = f7.f11129a;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (f7.c(((Integer) arrayList.get(i12)).intValue()) == null) {
                        arrayList.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        hg.a2 c10 = f7.c(((Integer) arrayList.get(i13)).intValue());
                        f7.f11130b.remove(c10);
                        f7.a(c10.f11105b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.f11104a;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new u7(6));
                        if ("hello".equals(c10.f11105b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                            if (userFull != null) {
                                userFull.flags2 &= -5;
                                userFull.business_greeting_message = null;
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull, true);
                            }
                        } else if ("away".equals(c10.f11105b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull userFull2 = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                            if (userFull2 != null) {
                                userFull2.flags2 &= -9;
                                userFull2.business_away_message = null;
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull2, true);
                            }
                        }
                    }
                    f7.l();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
                    messagesStorage.getStorageQueue().postRunnable(new ci.w0(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                hg.y1.W(y1Var);
                return;
            default:
                ((ai.s4) this.f9022b).run();
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f9021a) {
            case 8:
                ((b2.z0) obj).onAudioAttributesChanged((b2.e) this.f9022b);
                return;
            case 9:
                ((b2.z0) obj).onTrackSelectionParametersChanged((b2.q1) this.f9022b);
                return;
            case 10:
                ((b2.z0) obj).onCues((d2.d) this.f9022b);
                return;
            case 11:
                ((b2.z0) obj).onMediaMetadataChanged(((i2.c0) this.f9022b).f11570a.O);
                return;
            case 12:
                ((b2.z0) obj).onMetadata((b2.p0) this.f9022b);
                return;
            case 23:
                ((j2.b) obj).h((b2.u0) this.f9022b);
                return;
            case 24:
                ((j2.b) obj).onSeekStarted((j2.a) this.f9022b);
                return;
            case 25:
                ((j2.b) obj).a((i2.g) this.f9022b);
                return;
            default:
                ((j2.b) obj).b((u2.b0) this.f9022b);
                return;
        }
    }

    @Override
    public void j() {
        switch (this.f9021a) {
            case 15:
                ii.u0 u0Var = (ii.u0) this.f9022b;
                ii.i1 i1Var = u0Var.d;
                ii.a aVar = u0Var.f12679f;
                if (aVar != null) {
                    aVar.f12202s = true;
                    aVar.f12201r = i1Var.E;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f12187b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = ii.h6.f(i1Var.getText());
                    }
                }
                ii.e3 e3Var = u0Var.h;
                if (e3Var != null && u0Var.f12679f != null) {
                    ii.x3.Q1(e3Var.f12349a);
                    return;
                }
                return;
            case 20:
                ((i5) this.f9022b).h();
                return;
            default:
                q5 q5Var = (q5) this.f9022b;
                ii.a aVar2 = q5Var.f12204a;
                if (aVar2 != null) {
                    aVar2.f12202s = true;
                    aVar2.f12201r = q5Var.f12597r.E;
                }
                q5Var.u();
                ii.d3 d3Var = q5Var.E;
                if (d3Var != null && q5Var.f12204a != null) {
                    ii.x3.Q1(d3Var.f12299a);
                    return;
                }
                return;
        }
    }

    @Override
    public long m(long j3) {
        c3.u uVar = (c3.u) this.f9022b;
        return e2.d0.i((j3 * uVar.f4108e) / 1000000, 0L, uVar.f4112j - 1);
    }

    @Override
    public void onSuccess(Object obj) {
        ((e1.b) this.f9022b).invoke(obj);
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        hg.f1 f1Var;
        hg.f1 f1Var2;
        int i11;
        switch (this.f9021a) {
            case 1:
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((e5) this.f9022b).T((g61) obj);
                return;
            case 2:
            case 3:
            case 6:
            default:
                g61 g61Var = (g61) obj;
                View view2 = (View) obj2;
                Integer num = (Integer) obj3;
                Float f7 = (Float) obj4;
                Float f10 = (Float) obj5;
                if (((ii.x3[]) this.f9022b)[0] != null) {
                    num.intValue();
                    f7.floatValue();
                    f10.floatValue();
                    if (view2 instanceof f6) {
                        ((f6) view2).B();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                hg.g1 g1Var = (hg.g1) this.f9022b;
                g61 g61Var2 = (g61) obj;
                View view3 = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i12 = g61Var2.d;
                if (i12 == -1) {
                    boolean z10 = !g1Var.f11201e;
                    g1Var.f11201e = z10;
                    ((w8) view3).setChecked(z10);
                    g1Var.f11198a.f25250f3.N(true);
                    g1Var.X(true);
                    return;
                } else if (i12 == -2) {
                    ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                    n2Var.f11170n = g1Var.f11204r;
                    n2Var.f11167c = new ai.g3(18, g1Var, view3);
                    g1Var.presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                    return;
                } else if (g61Var2.f17187a == 5 && i12 >= 0 && i12 < g1Var.h.length) {
                    if (!LocaleController.isRTL ? floatValue >= view3.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue <= AndroidUtilities.dp(76.0f)) {
                        if (g1Var.h[g61Var2.d].isEmpty()) {
                            ((j5) view3).setChecked(true);
                            g1Var.h[g61Var2.d].add(new hg.f1(0, 1439));
                            g1Var.W(g61Var2.d);
                        } else {
                            g1Var.h[g61Var2.d].clear();
                            ((j5) view3).setChecked(false);
                        }
                        ((j5) view3).setValue(hg.g1.Z(g1Var.h[g61Var2.d]));
                        g1Var.X(true);
                        return;
                    }
                    int i13 = (g61Var2.d + 6) % 7;
                    int i14 = 0;
                    for (int i15 = 0; i15 < g1Var.h[i13].size(); i15++) {
                        if (((hg.f1) g1Var.h[i13].get(i15)).f11183b > i14) {
                            i14 = ((hg.f1) g1Var.h[i13].get(i15)).f11183b;
                        }
                    }
                    int max = Math.max(0, i14 - 1439);
                    int i16 = (g61Var2.d + 1) % 7;
                    int i17 = 1440;
                    for (int i18 = 0; i18 < g1Var.h[i16].size(); i18++) {
                        if (((hg.f1) g1Var.h[i16].get(i18)).f11182a < i17) {
                            i17 = ((hg.f1) g1Var.h[i16].get(i18)).f11182a;
                        }
                    }
                    int i19 = i17 + 1439;
                    CharSequence charSequence = g61Var2.f26674l;
                    ArrayList arrayList = g1Var.h[g61Var2.d];
                    int i20 = 0;
                    for (int i21 = 0; i21 < 7; i21++) {
                        ArrayList arrayList2 = g1Var.h[i21];
                        if (arrayList2 != null) {
                            i20 = Math.max(1, arrayList2.size()) + i20;
                        }
                    }
                    hg.i1 i1Var = new hg.i1(charSequence, arrayList, max, i19, 28 - i20);
                    i1Var.f11219f = new qc(g1Var, 23);
                    i1Var.h = new gg.x1(5, g1Var, g61Var2);
                    g1Var.presentFragment(i1Var);
                    return;
                } else {
                    return;
                }
            case 5:
                final hg.i1 i1Var2 = (hg.i1) this.f9022b;
                g61 g61Var3 = (g61) obj;
                final View view4 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i22 = i1Var2.f11217c;
                int i23 = i1Var2.d;
                ArrayList arrayList3 = i1Var2.f11216b;
                int i24 = g61Var3.d;
                if (i24 == -1) {
                    i1Var2.f11221r = !i1Var2.f11221r;
                    arrayList3.clear();
                    if (i1Var2.f11221r) {
                        arrayList3.add(new hg.f1(0, 1439));
                    }
                    w8 w8Var = (w8) view4;
                    boolean z11 = i1Var2.f11221r;
                    g61Var3.f26668e = z11;
                    w8Var.setChecked(z11);
                    boolean z12 = i1Var2.f11221r;
                    if (z12) {
                        i11 = i6.f20859f6;
                    } else {
                        i11 = i6.f20842e6;
                    }
                    w8Var.b(i6.w0(null, i11, false), z12);
                    i1Var2.f11220n.f25250f3.N(true);
                    qc qcVar = i1Var2.f11219f;
                    if (qcVar != null) {
                        qcVar.run();
                        return;
                    }
                    return;
                } else if (i24 == -2) {
                    if (!arrayList3.isEmpty() && !i1Var2.S()) {
                        int i25 = ((hg.f1) hg.c.g(1, arrayList3)).f11183b;
                        int clamp = Utilities.clamp(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new hg.f1(clamp, Utilities.clamp((i25 + 1560) / 2, i23, clamp + 1)));
                    } else {
                        if (i1Var2.S()) {
                            arrayList3.clear();
                        }
                        int clamp2 = Utilities.clamp(480, i23 - 1, i22);
                        arrayList3.add(new hg.f1(clamp2, Utilities.clamp(1200, i23, clamp2 + 1)));
                    }
                    qc qcVar2 = i1Var2.f11219f;
                    if (qcVar2 != null) {
                        qcVar2.run();
                    }
                    i1Var2.f11220n.f25250f3.N(true);
                    return;
                } else if (g61Var3.f17187a == 3 && (i10 = i24 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i26 = i10 - 1;
                    if (i26 >= 0) {
                        f1Var = (hg.f1) arrayList3.get(i26);
                    } else {
                        f1Var = null;
                    }
                    final hg.f1 f1Var3 = (hg.f1) arrayList3.get(i10);
                    int i27 = i10 + 1;
                    if (i27 < arrayList3.size()) {
                        f1Var2 = (hg.f1) arrayList3.get(i27);
                    } else {
                        f1Var2 = null;
                    }
                    int i28 = g61Var3.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = i1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i29 = f1Var3.f11182a;
                        if (f1Var != null) {
                            i22 = f1Var.f11183b + 1;
                        }
                        org.telegram.ui.Components.e5.X(parentActivity, string, i29, i22, f1Var3.f11183b - 1, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        i1 i1Var3 = i1Var2;
                                        boolean T = i1Var3.T();
                                        int intValue = num2.intValue();
                                        f1Var3.f11182a = intValue;
                                        ((r8) view4).u(f1.a(intValue), true);
                                        if (T != i1Var3.T()) {
                                            i1Var3.f11220n.f25250f3.N(true);
                                        }
                                        qc qcVar3 = i1Var3.f11219f;
                                        if (qcVar3 != null) {
                                            qcVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        i1 i1Var4 = i1Var2;
                                        boolean T2 = i1Var4.T();
                                        int intValue2 = num2.intValue();
                                        f1Var3.f11183b = intValue2;
                                        ((r8) view4).u(f1.a(intValue2), true);
                                        if (T2 != i1Var4.T()) {
                                            i1Var4.f11220n.f25250f3.N(true);
                                        }
                                        qc qcVar4 = i1Var4.f11219f;
                                        if (qcVar4 != null) {
                                            qcVar4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i28 == 1) {
                        Activity parentActivity2 = i1Var2.getParentActivity();
                        String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                        int i30 = f1Var3.f11183b;
                        int i31 = f1Var3.f11182a + 1;
                        if (f1Var2 != null) {
                            i23 = f1Var2.f11182a - 1;
                        }
                        org.telegram.ui.Components.e5.X(parentActivity2, string2, i30, i31, i23, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        i1 i1Var3 = i1Var2;
                                        boolean T = i1Var3.T();
                                        int intValue = num2.intValue();
                                        f1Var3.f11182a = intValue;
                                        ((r8) view4).u(f1.a(intValue), true);
                                        if (T != i1Var3.T()) {
                                            i1Var3.f11220n.f25250f3.N(true);
                                        }
                                        qc qcVar3 = i1Var3.f11219f;
                                        if (qcVar3 != null) {
                                            qcVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        i1 i1Var4 = i1Var2;
                                        boolean T2 = i1Var4.T();
                                        int intValue2 = num2.intValue();
                                        f1Var3.f11183b = intValue2;
                                        ((r8) view4).u(f1.a(intValue2), true);
                                        if (T2 != i1Var4.T()) {
                                            i1Var4.f11220n.f25250f3.N(true);
                                        }
                                        qc qcVar4 = i1Var4.f11219f;
                                        if (qcVar4 != null) {
                                            qcVar4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i28 == 2) {
                        arrayList3.remove(i10);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new hg.f1(0, 1439));
                        }
                        i1Var2.f11220n.f25250f3.N(true);
                        qc qcVar3 = i1Var2.f11219f;
                        if (qcVar3 != null) {
                            qcVar3.run();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 7:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                hg.e2.S((hg.e2) this.f9022b, (g61) obj, (View) obj2);
                return;
        }
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, yf1 yf1Var) {
        ii.j4 j4Var = (ii.j4) this.f9022b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        j4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        uyVar.finishFragment();
        return true;
    }

    public f(j2.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        this.f9021a = 26;
        this.f9022b = b0Var;
    }

    public f(Object obj, int i10) {
        this.f9021a = i10;
        this.f9022b = obj;
    }
}
