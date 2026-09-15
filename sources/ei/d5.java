package ei;

import ai.t7;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import ci.uc;
import com.google.android.gms.tasks.OnSuccessListener;
import ii.d6;
import ii.g5;
import ii.o5;
import ii.p5;
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
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.i5;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.zt;
import org.telegram.ui.dg1;
import org.telegram.ui.oy;
import org.telegram.ui.uy;
import w7.f6;
public final class d5 implements Utilities.Callback5, OnSuccessListener, c3.g, org.telegram.ui.ActionBar.a2, e2.m, zt, ii.p0, oy, p5, f2.s {
    public final int f8298a;
    public final Object f8299b;

    public d5(j2.a aVar, Object obj, int i10) {
        this.f8298a = i10;
        this.f8299b = obj;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(uy uyVar) {
        return false;
    }

    @Override
    public n70 a(ii.i1 i1Var) {
        return n70.H((ii.d2) ((a6.i) this.f8299b).f301b, i1Var);
    }

    @Override
    public void b(long j3, e2.v vVar) {
        switch (this.f8298a) {
            case 27:
                c3.b.d(j3, vVar, ((j4.c0) this.f8299b).f12628c);
                return;
            default:
                c3.b.e(j3, vVar, ((j4.c0) this.f8299b).f12628c);
                return;
        }
    }

    public ii.b0 c(aa.a aVar) {
        InputStream inputStream;
        j5.b bVar = (j5.b) this.f8299b;
        URL url = (URL) aVar.f358c;
        String c10 = f6.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.f12882g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) aVar.f357b;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                ka.c cVar = bVar.f12878a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                ka.e eVar = (ka.e) cVar.f13564b;
                ka.f fVar = new ka.f(bufferedWriter, eVar.f13568a, eVar.f13569b, eVar.f13570c, eVar.d);
                fVar.h((k5.i) aVar.d);
                fVar.j();
                fVar.f13572b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String c11 = f6.c("CctTransportBackend");
                if (Log.isLoggable(c11, 4)) {
                    Log.i(c11, String.format("Status Code: %d", valueOf));
                }
                f6.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                f6.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
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
                        ii.b0 b0Var = new ii.b0(responseCode, null, k5.m.a(new BufferedReader(new InputStreamReader(inputStream))).f13487a);
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
        } catch (ia.b e) {
            e = e;
            f6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new ii.b0(400, null, 0L);
        } catch (ConnectException e7) {
            e = e7;
            f6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new ii.b0(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            f6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new ii.b0(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            f6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new ii.b0(400, null, 0L);
        }
    }

    public void d(int i10) {
        ii.a0 a0Var = (ii.a0) this.f8299b;
        a0Var.f11219c = i10;
        a0Var.f(i10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f8298a) {
            case 5:
                hg.y1 y1Var = ((hg.p1) this.f8299b).f10384a;
                hg.b2 f7 = hg.b2.f(hg.y1.b0(y1Var));
                ArrayList arrayList = y1Var.f10484b;
                int i11 = f7.f10229a;
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
                        f7.f10230b.remove(c10);
                        f7.a(c10.f10218b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.f10217a;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new t7(6));
                        if ("hello".equals(c10.f10218b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                            if (userFull != null) {
                                userFull.flags2 &= -5;
                                userFull.business_greeting_message = null;
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull, true);
                            }
                        } else if ("away".equals(c10.f10218b)) {
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
                hg.y1.X(y1Var);
                return;
            default:
                ((ai.s4) this.f8299b).run();
                return;
        }
    }

    @Override
    public void i() {
        switch (this.f8298a) {
            case 15:
                ii.u0 u0Var = (ii.u0) this.f8299b;
                ii.i1 i1Var = u0Var.d;
                ii.a aVar = u0Var.f11649f;
                if (aVar != null) {
                    aVar.f11215s = true;
                    aVar.f11214r = i1Var.E;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f11201b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = ii.f6.f(i1Var.getText());
                    }
                }
                ii.d3 d3Var = u0Var.h;
                if (d3Var != null && u0Var.f11649f != null) {
                    ii.w3.O1(d3Var.f11330a);
                    return;
                }
                return;
            case 20:
                ((g5) this.f8299b).h();
                return;
            default:
                o5 o5Var = (o5) this.f8299b;
                ii.a aVar2 = o5Var.f11217a;
                if (aVar2 != null) {
                    aVar2.f11215s = true;
                    aVar2.f11214r = o5Var.f11540r.E;
                }
                o5Var.u();
                ii.c3 c3Var = o5Var.E;
                if (c3Var != null && o5Var.f11217a != null) {
                    ii.w3.O1(c3Var.f11283a);
                    return;
                }
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8298a) {
            case 7:
                ((b2.z0) obj).onMediaMetadataChanged((b2.n0) this.f8299b);
                return;
            case 8:
                ((b2.z0) obj).onAudioAttributesChanged((b2.e) this.f8299b);
                return;
            case 9:
                ((b2.z0) obj).onTrackSelectionParametersChanged((b2.q1) this.f8299b);
                return;
            case 10:
                ((b2.z0) obj).onCues((d2.d) this.f8299b);
                return;
            case 11:
                ((b2.z0) obj).onMediaMetadataChanged(((i2.b0) this.f8299b).f10621a.O);
                return;
            case 12:
                ((b2.z0) obj).onMetadata((b2.p0) this.f8299b);
                return;
            case 23:
                ((j2.b) obj).h((b2.u0) this.f8299b);
                return;
            case 24:
                ((j2.b) obj).onSeekStarted((j2.a) this.f8299b);
                return;
            case 25:
                ((j2.b) obj).a((i2.g) this.f8299b);
                return;
            default:
                ((j2.b) obj).b((u2.b0) this.f8299b);
                return;
        }
    }

    @Override
    public long m(long j3) {
        c3.u uVar = (c3.u) this.f8299b;
        return e2.d0.i((j3 * uVar.e) / 1000000, 0L, uVar.f3803j - 1);
    }

    @Override
    public void onSuccess(Object obj) {
        ((e1.b) this.f8299b).invoke(obj);
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        hg.f1 f1Var;
        hg.f1 f1Var2;
        int i11;
        switch (this.f8298a) {
            case 0:
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((e5) this.f8299b).V((i51) obj);
                return;
            case 1:
            case 2:
            case 5:
            default:
                i51 i51Var = (i51) obj;
                View view2 = (View) obj2;
                Integer num = (Integer) obj3;
                Float f7 = (Float) obj4;
                Float f10 = (Float) obj5;
                if (((ii.w3[]) this.f8299b)[0] != null) {
                    num.intValue();
                    f7.floatValue();
                    f10.floatValue();
                    if (view2 instanceof d6) {
                        ((d6) view2).B();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                hg.g1 g1Var = (hg.g1) this.f8299b;
                i51 i51Var2 = (i51) obj;
                View view3 = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i12 = i51Var2.d;
                if (i12 == -1) {
                    boolean z10 = !g1Var.e;
                    g1Var.e = z10;
                    ((w8) view3).setChecked(z10);
                    g1Var.f10294a.Y2.N(true);
                    g1Var.Y(true);
                    return;
                } else if (i12 == -2) {
                    ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                    n2Var.f10275n = g1Var.f10299r;
                    n2Var.f10273c = new ci.m2(17, g1Var, view3);
                    g1Var.presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                    return;
                } else if (i51Var2.f15533a == 5 && i12 >= 0 && i12 < g1Var.h.length) {
                    if (!LocaleController.isRTL ? floatValue >= view3.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue <= AndroidUtilities.dp(76.0f)) {
                        if (g1Var.h[i51Var2.d].isEmpty()) {
                            ((i5) view3).setChecked(true);
                            g1Var.h[i51Var2.d].add(new hg.f1(0, 1439));
                            g1Var.X(i51Var2.d);
                        } else {
                            g1Var.h[i51Var2.d].clear();
                            ((i5) view3).setChecked(false);
                        }
                        ((i5) view3).setValue(hg.g1.a0(g1Var.h[i51Var2.d]));
                        g1Var.Y(true);
                        return;
                    }
                    int i13 = (i51Var2.d + 6) % 7;
                    int i14 = 0;
                    for (int i15 = 0; i15 < g1Var.h[i13].size(); i15++) {
                        if (((hg.f1) g1Var.h[i13].get(i15)).f10285b > i14) {
                            i14 = ((hg.f1) g1Var.h[i13].get(i15)).f10285b;
                        }
                    }
                    int max = Math.max(0, i14 - 1439);
                    int i16 = (i51Var2.d + 1) % 7;
                    int i17 = 1440;
                    for (int i18 = 0; i18 < g1Var.h[i16].size(); i18++) {
                        if (((hg.f1) g1Var.h[i16].get(i18)).f10284a < i17) {
                            i17 = ((hg.f1) g1Var.h[i16].get(i18)).f10284a;
                        }
                    }
                    int i19 = i17 + 1439;
                    CharSequence charSequence = i51Var2.f24894l;
                    ArrayList arrayList = g1Var.h[i51Var2.d];
                    int i20 = 0;
                    for (int i21 = 0; i21 < 7; i21++) {
                        ArrayList arrayList2 = g1Var.h[i21];
                        if (arrayList2 != null) {
                            i20 = Math.max(1, arrayList2.size()) + i20;
                        }
                    }
                    hg.i1 i1Var = new hg.i1(charSequence, arrayList, max, i19, 28 - i20);
                    i1Var.f10314f = new uc(g1Var, 23);
                    i1Var.h = new gg.x1(5, g1Var, i51Var2);
                    g1Var.presentFragment(i1Var);
                    return;
                } else {
                    return;
                }
            case 4:
                final hg.i1 i1Var2 = (hg.i1) this.f8299b;
                i51 i51Var3 = (i51) obj;
                final View view4 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i22 = i1Var2.f10313c;
                int i23 = i1Var2.d;
                ArrayList arrayList3 = i1Var2.f10312b;
                int i24 = i51Var3.d;
                if (i24 == -1) {
                    i1Var2.f10316r = !i1Var2.f10316r;
                    arrayList3.clear();
                    if (i1Var2.f10316r) {
                        arrayList3.add(new hg.f1(0, 1439));
                    }
                    w8 w8Var = (w8) view4;
                    boolean z11 = i1Var2.f10316r;
                    i51Var3.e = z11;
                    w8Var.setChecked(z11);
                    boolean z12 = i1Var2.f10316r;
                    if (z12) {
                        i11 = i6.f18872f6;
                    } else {
                        i11 = i6.f18855e6;
                    }
                    w8Var.b(i6.w0(null, i11, false), z12);
                    i1Var2.f10315n.Y2.N(true);
                    uc ucVar = i1Var2.f10314f;
                    if (ucVar != null) {
                        ucVar.run();
                        return;
                    }
                    return;
                } else if (i24 == -2) {
                    if (!arrayList3.isEmpty() && !i1Var2.U()) {
                        int i25 = ((hg.f1) hg.k0.h(1, arrayList3)).f10285b;
                        int clamp = Utilities.clamp(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new hg.f1(clamp, Utilities.clamp((i25 + 1560) / 2, i23, clamp + 1)));
                    } else {
                        if (i1Var2.U()) {
                            arrayList3.clear();
                        }
                        int clamp2 = Utilities.clamp(480, i23 - 1, i22);
                        arrayList3.add(new hg.f1(clamp2, Utilities.clamp(1200, i23, clamp2 + 1)));
                    }
                    uc ucVar2 = i1Var2.f10314f;
                    if (ucVar2 != null) {
                        ucVar2.run();
                    }
                    i1Var2.f10315n.Y2.N(true);
                    return;
                } else if (i51Var3.f15533a == 3 && (i10 = i24 / 3) >= 0 && i10 < arrayList3.size()) {
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
                    int i28 = i51Var3.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = i1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i29 = f1Var3.f10284a;
                        if (f1Var != null) {
                            i22 = f1Var.f10285b + 1;
                        }
                        org.telegram.ui.Components.c5.X(parentActivity, string, i29, i22, f1Var3.f10285b - 1, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        i1 i1Var3 = i1Var2;
                                        boolean V = i1Var3.V();
                                        int intValue = num2.intValue();
                                        f1Var3.f10284a = intValue;
                                        ((r8) view4).u(f1.a(intValue), true);
                                        if (V != i1Var3.V()) {
                                            i1Var3.f10315n.Y2.N(true);
                                        }
                                        uc ucVar3 = i1Var3.f10314f;
                                        if (ucVar3 != null) {
                                            ucVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        i1 i1Var4 = i1Var2;
                                        boolean V2 = i1Var4.V();
                                        int intValue2 = num2.intValue();
                                        f1Var3.f10285b = intValue2;
                                        ((r8) view4).u(f1.a(intValue2), true);
                                        if (V2 != i1Var4.V()) {
                                            i1Var4.f10315n.Y2.N(true);
                                        }
                                        uc ucVar4 = i1Var4.f10314f;
                                        if (ucVar4 != null) {
                                            ucVar4.run();
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
                        int i30 = f1Var3.f10285b;
                        int i31 = f1Var3.f10284a + 1;
                        if (f1Var2 != null) {
                            i23 = f1Var2.f10284a - 1;
                        }
                        org.telegram.ui.Components.c5.X(parentActivity2, string2, i30, i31, i23, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        i1 i1Var3 = i1Var2;
                                        boolean V = i1Var3.V();
                                        int intValue = num2.intValue();
                                        f1Var3.f10284a = intValue;
                                        ((r8) view4).u(f1.a(intValue), true);
                                        if (V != i1Var3.V()) {
                                            i1Var3.f10315n.Y2.N(true);
                                        }
                                        uc ucVar3 = i1Var3.f10314f;
                                        if (ucVar3 != null) {
                                            ucVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        i1 i1Var4 = i1Var2;
                                        boolean V2 = i1Var4.V();
                                        int intValue2 = num2.intValue();
                                        f1Var3.f10285b = intValue2;
                                        ((r8) view4).u(f1.a(intValue2), true);
                                        if (V2 != i1Var4.V()) {
                                            i1Var4.f10315n.Y2.N(true);
                                        }
                                        uc ucVar4 = i1Var4.f10314f;
                                        if (ucVar4 != null) {
                                            ucVar4.run();
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
                        i1Var2.f10315n.Y2.N(true);
                        uc ucVar3 = i1Var2.f10314f;
                        if (ucVar3 != null) {
                            ucVar3.run();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                hg.e2.U((hg.e2) this.f8299b, (i51) obj, (View) obj2);
                return;
        }
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, dg1 dg1Var) {
        ii.i4 i4Var = (ii.i4) this.f8299b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        i4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        uyVar.finishFragment();
        return true;
    }

    public d5(j2.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        this.f8298a = 26;
        this.f8299b = b0Var;
    }

    public d5(Object obj, int i10) {
        this.f8298a = i10;
        this.f8299b = obj;
    }
}
