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
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.zt;
import org.telegram.ui.eg1;
import org.telegram.ui.oy;
import org.telegram.ui.uy;
import w7.f6;
public final class d5 implements Utilities.Callback5, OnSuccessListener, c3.g, org.telegram.ui.ActionBar.a2, e2.m, zt, ii.p0, oy, p5, f2.s {
    public final int f8300a;
    public final Object f8301b;

    public d5(j2.a aVar, Object obj, int i10) {
        this.f8300a = i10;
        this.f8301b = obj;
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
        return n70.H((ii.d2) ((a6.i) this.f8301b).f303b, i1Var);
    }

    @Override
    public void b(long j3, e2.v vVar) {
        switch (this.f8300a) {
            case 27:
                c3.b.d(j3, vVar, ((j4.c0) this.f8301b).f12630c);
                return;
            default:
                c3.b.e(j3, vVar, ((j4.c0) this.f8301b).f12630c);
                return;
        }
    }

    public ii.b0 c(aa.a aVar) {
        InputStream inputStream;
        j5.b bVar = (j5.b) this.f8301b;
        URL url = (URL) aVar.f360c;
        String c10 = f6.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.f12884g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) aVar.f359b;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                ka.c cVar = bVar.f12880a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                ka.e eVar = (ka.e) cVar.f13566b;
                ka.f fVar = new ka.f(bufferedWriter, eVar.f13570a, eVar.f13571b, eVar.f13572c, eVar.d);
                fVar.h((k5.i) aVar.d);
                fVar.j();
                fVar.f13574b.flush();
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
                        ii.b0 b0Var = new ii.b0(responseCode, null, k5.m.a(new BufferedReader(new InputStreamReader(inputStream))).f13489a);
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
        ii.a0 a0Var = (ii.a0) this.f8301b;
        a0Var.f11221c = i10;
        a0Var.f(i10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f8300a) {
            case 5:
                hg.z1 z1Var = ((hg.q1) this.f8301b).f10394a;
                hg.c2 f7 = hg.c2.f(hg.z1.b0(z1Var));
                ArrayList arrayList = z1Var.f10491b;
                int i11 = f7.f10238a;
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
                        hg.b2 c10 = f7.c(((Integer) arrayList.get(i13)).intValue());
                        f7.f10239b.remove(c10);
                        f7.a(c10.f10220b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.f10219a;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new t7(6));
                        if ("hello".equals(c10.f10220b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                            if (userFull != null) {
                                userFull.flags2 &= -5;
                                userFull.business_greeting_message = null;
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull, true);
                            }
                        } else if ("away".equals(c10.f10220b)) {
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
                hg.z1.X(z1Var);
                return;
            default:
                ((ai.s4) this.f8301b).run();
                return;
        }
    }

    @Override
    public void i() {
        switch (this.f8300a) {
            case 15:
                ii.u0 u0Var = (ii.u0) this.f8301b;
                ii.i1 i1Var = u0Var.d;
                ii.a aVar = u0Var.f11651f;
                if (aVar != null) {
                    aVar.f11217s = true;
                    aVar.f11216r = i1Var.E;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f11203b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = ii.f6.f(i1Var.getText());
                    }
                }
                ii.d3 d3Var = u0Var.h;
                if (d3Var != null && u0Var.f11651f != null) {
                    ii.w3.O1(d3Var.f11332a);
                    return;
                }
                return;
            case 20:
                ((g5) this.f8301b).h();
                return;
            default:
                o5 o5Var = (o5) this.f8301b;
                ii.a aVar2 = o5Var.f11219a;
                if (aVar2 != null) {
                    aVar2.f11217s = true;
                    aVar2.f11216r = o5Var.f11542r.E;
                }
                o5Var.u();
                ii.c3 c3Var = o5Var.E;
                if (c3Var != null && o5Var.f11219a != null) {
                    ii.w3.O1(c3Var.f11285a);
                    return;
                }
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8300a) {
            case 7:
                ((b2.z0) obj).onMediaMetadataChanged((b2.n0) this.f8301b);
                return;
            case 8:
                ((b2.z0) obj).onAudioAttributesChanged((b2.e) this.f8301b);
                return;
            case 9:
                ((b2.z0) obj).onTrackSelectionParametersChanged((b2.q1) this.f8301b);
                return;
            case 10:
                ((b2.z0) obj).onCues((d2.d) this.f8301b);
                return;
            case 11:
                ((b2.z0) obj).onMediaMetadataChanged(((i2.b0) this.f8301b).f10623a.O);
                return;
            case 12:
                ((b2.z0) obj).onMetadata((b2.p0) this.f8301b);
                return;
            case 23:
                ((j2.b) obj).h((b2.u0) this.f8301b);
                return;
            case 24:
                ((j2.b) obj).onSeekStarted((j2.a) this.f8301b);
                return;
            case 25:
                ((j2.b) obj).a((i2.g) this.f8301b);
                return;
            default:
                ((j2.b) obj).b((u2.b0) this.f8301b);
                return;
        }
    }

    @Override
    public long m(long j3) {
        c3.u uVar = (c3.u) this.f8301b;
        return e2.d0.i((j3 * uVar.e) / 1000000, 0L, uVar.f3805j - 1);
    }

    @Override
    public void onSuccess(Object obj) {
        ((e1.b) this.f8301b).invoke(obj);
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        hg.g1 g1Var;
        hg.g1 g1Var2;
        int i11;
        switch (this.f8300a) {
            case 0:
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((e5) this.f8301b).V((i51) obj);
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
                if (((ii.w3[]) this.f8301b)[0] != null) {
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
                hg.h1 h1Var = (hg.h1) this.f8301b;
                i51 i51Var2 = (i51) obj;
                View view3 = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i12 = i51Var2.d;
                if (i12 == -1) {
                    boolean z10 = !h1Var.e;
                    h1Var.e = z10;
                    ((w8) view3).setChecked(z10);
                    h1Var.f10302a.Y2.N(true);
                    h1Var.Y(true);
                    return;
                } else if (i12 == -2) {
                    ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                    n2Var.f10285n = h1Var.f10307r;
                    n2Var.f10283c = new ci.m2(17, h1Var, view3);
                    h1Var.presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                    return;
                } else if (i51Var2.f15531a == 5 && i12 >= 0 && i12 < h1Var.h.length) {
                    if (!LocaleController.isRTL ? floatValue >= view3.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue <= AndroidUtilities.dp(76.0f)) {
                        if (h1Var.h[i51Var2.d].isEmpty()) {
                            ((j5) view3).setChecked(true);
                            h1Var.h[i51Var2.d].add(new hg.g1(0, 1439));
                            h1Var.X(i51Var2.d);
                        } else {
                            h1Var.h[i51Var2.d].clear();
                            ((j5) view3).setChecked(false);
                        }
                        ((j5) view3).setValue(hg.h1.a0(h1Var.h[i51Var2.d]));
                        h1Var.Y(true);
                        return;
                    }
                    int i13 = (i51Var2.d + 6) % 7;
                    int i14 = 0;
                    for (int i15 = 0; i15 < h1Var.h[i13].size(); i15++) {
                        if (((hg.g1) h1Var.h[i13].get(i15)).f10292b > i14) {
                            i14 = ((hg.g1) h1Var.h[i13].get(i15)).f10292b;
                        }
                    }
                    int max = Math.max(0, i14 - 1439);
                    int i16 = (i51Var2.d + 1) % 7;
                    int i17 = 1440;
                    for (int i18 = 0; i18 < h1Var.h[i16].size(); i18++) {
                        if (((hg.g1) h1Var.h[i16].get(i18)).f10291a < i17) {
                            i17 = ((hg.g1) h1Var.h[i16].get(i18)).f10291a;
                        }
                    }
                    int i19 = i17 + 1439;
                    CharSequence charSequence = i51Var2.f24900l;
                    ArrayList arrayList = h1Var.h[i51Var2.d];
                    int i20 = 0;
                    for (int i21 = 0; i21 < 7; i21++) {
                        ArrayList arrayList2 = h1Var.h[i21];
                        if (arrayList2 != null) {
                            i20 = Math.max(1, arrayList2.size()) + i20;
                        }
                    }
                    hg.j1 j1Var = new hg.j1(charSequence, arrayList, max, i19, 28 - i20);
                    j1Var.f10318f = new uc(h1Var, 23);
                    j1Var.h = new gg.x1(5, h1Var, i51Var2);
                    h1Var.presentFragment(j1Var);
                    return;
                } else {
                    return;
                }
            case 4:
                final hg.j1 j1Var2 = (hg.j1) this.f8301b;
                i51 i51Var3 = (i51) obj;
                final View view4 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i22 = j1Var2.f10317c;
                int i23 = j1Var2.d;
                ArrayList arrayList3 = j1Var2.f10316b;
                int i24 = i51Var3.d;
                if (i24 == -1) {
                    j1Var2.f10320r = !j1Var2.f10320r;
                    arrayList3.clear();
                    if (j1Var2.f10320r) {
                        arrayList3.add(new hg.g1(0, 1439));
                    }
                    w8 w8Var = (w8) view4;
                    boolean z11 = j1Var2.f10320r;
                    i51Var3.e = z11;
                    w8Var.setChecked(z11);
                    boolean z12 = j1Var2.f10320r;
                    if (z12) {
                        i11 = i6.f18870f6;
                    } else {
                        i11 = i6.f18853e6;
                    }
                    w8Var.b(i6.w0(null, i11, false), z12);
                    j1Var2.f10319n.Y2.N(true);
                    uc ucVar = j1Var2.f10318f;
                    if (ucVar != null) {
                        ucVar.run();
                        return;
                    }
                    return;
                } else if (i24 == -2) {
                    if (!arrayList3.isEmpty() && !j1Var2.U()) {
                        int i25 = ((hg.g1) hg.c.h(1, arrayList3)).f10292b;
                        int clamp = Utilities.clamp(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new hg.g1(clamp, Utilities.clamp((i25 + 1560) / 2, i23, clamp + 1)));
                    } else {
                        if (j1Var2.U()) {
                            arrayList3.clear();
                        }
                        int clamp2 = Utilities.clamp(480, i23 - 1, i22);
                        arrayList3.add(new hg.g1(clamp2, Utilities.clamp(1200, i23, clamp2 + 1)));
                    }
                    uc ucVar2 = j1Var2.f10318f;
                    if (ucVar2 != null) {
                        ucVar2.run();
                    }
                    j1Var2.f10319n.Y2.N(true);
                    return;
                } else if (i51Var3.f15531a == 3 && (i10 = i24 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i26 = i10 - 1;
                    if (i26 >= 0) {
                        g1Var = (hg.g1) arrayList3.get(i26);
                    } else {
                        g1Var = null;
                    }
                    final hg.g1 g1Var3 = (hg.g1) arrayList3.get(i10);
                    int i27 = i10 + 1;
                    if (i27 < arrayList3.size()) {
                        g1Var2 = (hg.g1) arrayList3.get(i27);
                    } else {
                        g1Var2 = null;
                    }
                    int i28 = i51Var3.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = j1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i29 = g1Var3.f10291a;
                        if (g1Var != null) {
                            i22 = g1Var.f10292b + 1;
                        }
                        org.telegram.ui.Components.c5.X(parentActivity, string, i29, i22, g1Var3.f10292b - 1, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        j1 j1Var3 = j1Var2;
                                        boolean V = j1Var3.V();
                                        int intValue = num2.intValue();
                                        g1Var3.f10291a = intValue;
                                        ((r8) view4).u(g1.a(intValue), true);
                                        if (V != j1Var3.V()) {
                                            j1Var3.f10319n.Y2.N(true);
                                        }
                                        uc ucVar3 = j1Var3.f10318f;
                                        if (ucVar3 != null) {
                                            ucVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        j1 j1Var4 = j1Var2;
                                        boolean V2 = j1Var4.V();
                                        int intValue2 = num2.intValue();
                                        g1Var3.f10292b = intValue2;
                                        ((r8) view4).u(g1.a(intValue2), true);
                                        if (V2 != j1Var4.V()) {
                                            j1Var4.f10319n.Y2.N(true);
                                        }
                                        uc ucVar4 = j1Var4.f10318f;
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
                        Activity parentActivity2 = j1Var2.getParentActivity();
                        String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                        int i30 = g1Var3.f10292b;
                        int i31 = g1Var3.f10291a + 1;
                        if (g1Var2 != null) {
                            i23 = g1Var2.f10291a - 1;
                        }
                        org.telegram.ui.Components.c5.X(parentActivity2, string2, i30, i31, i23, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        j1 j1Var3 = j1Var2;
                                        boolean V = j1Var3.V();
                                        int intValue = num2.intValue();
                                        g1Var3.f10291a = intValue;
                                        ((r8) view4).u(g1.a(intValue), true);
                                        if (V != j1Var3.V()) {
                                            j1Var3.f10319n.Y2.N(true);
                                        }
                                        uc ucVar3 = j1Var3.f10318f;
                                        if (ucVar3 != null) {
                                            ucVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        j1 j1Var4 = j1Var2;
                                        boolean V2 = j1Var4.V();
                                        int intValue2 = num2.intValue();
                                        g1Var3.f10292b = intValue2;
                                        ((r8) view4).u(g1.a(intValue2), true);
                                        if (V2 != j1Var4.V()) {
                                            j1Var4.f10319n.Y2.N(true);
                                        }
                                        uc ucVar4 = j1Var4.f10318f;
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
                            arrayList3.add(new hg.g1(0, 1439));
                        }
                        j1Var2.f10319n.Y2.N(true);
                        uc ucVar3 = j1Var2.f10318f;
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
                hg.f2.U((hg.f2) this.f8301b, (i51) obj, (View) obj2);
                return;
        }
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        ii.i4 i4Var = (ii.i4) this.f8301b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        i4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        uyVar.finishFragment();
        return true;
    }

    public d5(j2.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        this.f8300a = 26;
        this.f8301b = b0Var;
    }

    public d5(Object obj, int i10) {
        this.f8300a = i10;
        this.f8301b = obj;
    }
}
