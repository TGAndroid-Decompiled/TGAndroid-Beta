package ei;

import ai.v7;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import ci.rc;
import com.google.android.gms.tasks.OnSuccessListener;
import ii.f6;
import ii.h6;
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
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pu;
import org.telegram.ui.fg1;
import org.telegram.ui.ny;
import org.telegram.ui.ty;
import w7.i6;
public final class c5 implements Utilities.Callback5, OnSuccessListener, c3.g, org.telegram.ui.ActionBar.a2, e2.m, pu, ii.p0, ny, r5, f2.t {
    public final int f8998a;
    public final Object f8999b;

    public c5(j2.a aVar, Object obj, int i10) {
        this.f8998a = i10;
        this.f8999b = obj;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(ty tyVar) {
        return false;
    }

    @Override
    public p80 a(ii.i1 i1Var) {
        return p80.H((ii.e2) ((a6.i) this.f8999b).f326b, i1Var);
    }

    @Override
    public void b(long j3, e2.v vVar) {
        switch (this.f8998a) {
            case 26:
                c3.b.d(j3, vVar, ((j4.c0) this.f8999b).f13752c);
                return;
            default:
                c3.b.e(j3, vVar, ((j4.c0) this.f8999b).f13752c);
                return;
        }
    }

    @Override
    public long c(long j3) {
        c3.u uVar = (c3.u) this.f8999b;
        return e2.d0.i((j3 * uVar.f4157e) / 1000000, 0L, uVar.f4161j - 1);
    }

    public ii.b0 d(aa.a aVar) {
        InputStream inputStream;
        j5.b bVar = (j5.b) this.f8999b;
        URL url = (URL) aVar.f385c;
        String c10 = i6.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.f14031g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) aVar.f384b;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                a4.l lVar = bVar.f14026a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                ka.d dVar = (ka.d) lVar.f297b;
                ka.e eVar = new ka.e(bufferedWriter, dVar.f14771a, dVar.f14772b, dVar.f14773c, dVar.d);
                eVar.h((k5.i) aVar.d);
                eVar.j();
                eVar.f14775b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String c11 = i6.c("CctTransportBackend");
                if (Log.isLoggable(c11, 4)) {
                    Log.i(c11, String.format("Status Code: %d", valueOf));
                }
                i6.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                i6.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
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
                        ii.b0 b0Var = new ii.b0(responseCode, null, k5.m.a(new BufferedReader(new InputStreamReader(inputStream))).f14684a);
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
            i6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new ii.b0(400, null, 0L);
        } catch (ConnectException e10) {
            e = e10;
            i6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new ii.b0(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            i6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new ii.b0(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            i6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new ii.b0(400, null, 0L);
        }
    }

    public void e(int i10) {
        ii.a0 a0Var = (ii.a0) this.f8999b;
        a0Var.f12253c = i10;
        a0Var.f(i10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f8998a) {
            case 5:
                hg.z1 z1Var = ((hg.q1) this.f8999b).f11357a;
                hg.c2 f7 = hg.c2.f(hg.z1.b0(z1Var));
                ArrayList arrayList = z1Var.f11467b;
                int i11 = f7.f11182a;
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
                        f7.f11183b.remove(c10);
                        f7.a(c10.f11175b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.f11174a;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new v7(6));
                        if ("hello".equals(c10.f11175b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                            if (userFull != null) {
                                userFull.flags2 &= -5;
                                userFull.business_greeting_message = null;
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull, true);
                            }
                        } else if ("away".equals(c10.f11175b)) {
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
                    messagesStorage.getStorageQueue().postRunnable(new ci.v0(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                hg.z1.X(z1Var);
                return;
            default:
                ((ai.t4) this.f8999b).run();
                return;
        }
    }

    @Override
    public void i() {
        switch (this.f8998a) {
            case 14:
                ii.u0 u0Var = (ii.u0) this.f8999b;
                ii.i1 i1Var = u0Var.d;
                ii.a aVar = u0Var.f12726f;
                if (aVar != null) {
                    aVar.f12249s = true;
                    aVar.f12248r = i1Var.E;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f12234b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = h6.f(i1Var.getText());
                    }
                }
                ii.e3 e3Var = u0Var.h;
                if (e3Var != null && u0Var.f12726f != null) {
                    ii.x3.P1(e3Var.f12394a);
                    return;
                }
                return;
            case 19:
                ((i5) this.f8999b).h();
                return;
            default:
                q5 q5Var = (q5) this.f8999b;
                ii.a aVar2 = q5Var.f12251a;
                if (aVar2 != null) {
                    aVar2.f12249s = true;
                    aVar2.f12248r = q5Var.f12644r.E;
                }
                q5Var.u();
                ii.d3 d3Var = q5Var.E;
                if (d3Var != null && q5Var.f12251a != null) {
                    ii.x3.P1(d3Var.f12347a);
                    return;
                }
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8998a) {
            case 7:
                ((b2.z0) obj).onAudioAttributesChanged((b2.e) this.f8999b);
                return;
            case 8:
                ((b2.z0) obj).onTrackSelectionParametersChanged((b2.q1) this.f8999b);
                return;
            case 9:
                ((b2.z0) obj).onCues((d2.d) this.f8999b);
                return;
            case 10:
                ((b2.z0) obj).onMediaMetadataChanged(((i2.c0) this.f8999b).f11620a.O);
                return;
            case 11:
                ((b2.z0) obj).onMetadata((b2.p0) this.f8999b);
                return;
            case 22:
                ((j2.b) obj).h((b2.u0) this.f8999b);
                return;
            case 23:
                ((j2.b) obj).onSeekStarted((j2.a) this.f8999b);
                return;
            case 24:
                ((j2.b) obj).a((i2.g) this.f8999b);
                return;
            default:
                ((j2.b) obj).c((u2.b0) this.f8999b);
                return;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        ((e1.b) this.f8999b).invoke(obj);
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        hg.f1 f1Var;
        hg.f1 f1Var2;
        int i11;
        switch (this.f8998a) {
            case 0:
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((d5) this.f8999b).V((p61) obj);
                return;
            case 1:
            case 2:
            case 5:
            default:
                p61 p61Var = (p61) obj;
                View view2 = (View) obj2;
                Integer num = (Integer) obj3;
                Float f7 = (Float) obj4;
                Float f10 = (Float) obj5;
                if (((ii.x3[]) this.f8999b)[0] != null) {
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
            case 3:
                hg.g1 g1Var = (hg.g1) this.f8999b;
                p61 p61Var2 = (p61) obj;
                View view3 = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i12 = p61Var2.d;
                if (i12 == -1) {
                    boolean z10 = !g1Var.f11248e;
                    g1Var.f11248e = z10;
                    ((w8) view3).setChecked(z10);
                    g1Var.f11245a.W2.N(true);
                    g1Var.Y(true);
                    return;
                } else if (i12 == -2) {
                    ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                    n2Var.f11235n = g1Var.f11251r;
                    n2Var.f11232c = new ai.h3(18, g1Var, view3);
                    g1Var.presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                    return;
                } else if (p61Var2.f17125a == 5 && i12 >= 0 && i12 < g1Var.h.length) {
                    if (!LocaleController.isRTL ? floatValue >= view3.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue <= AndroidUtilities.dp(76.0f)) {
                        if (g1Var.h[p61Var2.d].isEmpty()) {
                            ((j5) view3).setChecked(true);
                            g1Var.h[p61Var2.d].add(new hg.f1(0, 1439));
                            g1Var.X(p61Var2.d);
                        } else {
                            g1Var.h[p61Var2.d].clear();
                            ((j5) view3).setChecked(false);
                        }
                        ((j5) view3).setValue(hg.g1.a0(g1Var.h[p61Var2.d]));
                        g1Var.Y(true);
                        return;
                    }
                    int i13 = (p61Var2.d + 6) % 7;
                    int i14 = 0;
                    for (int i15 = 0; i15 < g1Var.h[i13].size(); i15++) {
                        if (((hg.f1) g1Var.h[i13].get(i15)).f11229b > i14) {
                            i14 = ((hg.f1) g1Var.h[i13].get(i15)).f11229b;
                        }
                    }
                    int max = Math.max(0, i14 - 1439);
                    int i16 = (p61Var2.d + 1) % 7;
                    int i17 = 1440;
                    for (int i18 = 0; i18 < g1Var.h[i16].size(); i18++) {
                        if (((hg.f1) g1Var.h[i16].get(i18)).f11228a < i17) {
                            i17 = ((hg.f1) g1Var.h[i16].get(i18)).f11228a;
                        }
                    }
                    int i19 = i17 + 1439;
                    CharSequence charSequence = p61Var2.f29734l;
                    ArrayList arrayList = g1Var.h[p61Var2.d];
                    int i20 = 0;
                    for (int i21 = 0; i21 < 7; i21++) {
                        ArrayList arrayList2 = g1Var.h[i21];
                        if (arrayList2 != null) {
                            i20 = Math.max(1, arrayList2.size()) + i20;
                        }
                    }
                    hg.i1 i1Var = new hg.i1(charSequence, arrayList, max, i19, 28 - i20);
                    i1Var.f11271f = new rc(g1Var, 23);
                    i1Var.h = new gg.w1(5, g1Var, p61Var2);
                    g1Var.presentFragment(i1Var);
                    return;
                } else {
                    return;
                }
            case 4:
                final hg.i1 i1Var2 = (hg.i1) this.f8999b;
                p61 p61Var3 = (p61) obj;
                final View view4 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i22 = i1Var2.f11269c;
                int i23 = i1Var2.d;
                ArrayList arrayList3 = i1Var2.f11268b;
                int i24 = p61Var3.d;
                if (i24 == -1) {
                    i1Var2.f11273r = !i1Var2.f11273r;
                    arrayList3.clear();
                    if (i1Var2.f11273r) {
                        arrayList3.add(new hg.f1(0, 1439));
                    }
                    w8 w8Var = (w8) view4;
                    boolean z11 = i1Var2.f11273r;
                    p61Var3.f29728e = z11;
                    w8Var.setChecked(z11);
                    boolean z12 = i1Var2.f11273r;
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.i6.f20834f6;
                    } else {
                        i11 = org.telegram.ui.ActionBar.i6.f20817e6;
                    }
                    w8Var.b(org.telegram.ui.ActionBar.i6.x0(null, i11, false), z12);
                    i1Var2.f11272n.W2.N(true);
                    rc rcVar = i1Var2.f11271f;
                    if (rcVar != null) {
                        rcVar.run();
                        return;
                    }
                    return;
                } else if (i24 == -2) {
                    if (!arrayList3.isEmpty() && !i1Var2.U()) {
                        int i25 = ((hg.f1) hg.c.g(1, arrayList3)).f11229b;
                        int clamp = Utilities.clamp(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new hg.f1(clamp, Utilities.clamp((i25 + 1560) / 2, i23, clamp + 1)));
                    } else {
                        if (i1Var2.U()) {
                            arrayList3.clear();
                        }
                        int clamp2 = Utilities.clamp(480, i23 - 1, i22);
                        arrayList3.add(new hg.f1(clamp2, Utilities.clamp(1200, i23, clamp2 + 1)));
                    }
                    rc rcVar2 = i1Var2.f11271f;
                    if (rcVar2 != null) {
                        rcVar2.run();
                    }
                    i1Var2.f11272n.W2.N(true);
                    return;
                } else if (p61Var3.f17125a == 3 && (i10 = i24 / 3) >= 0 && i10 < arrayList3.size()) {
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
                    int i28 = p61Var3.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = i1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i29 = f1Var3.f11228a;
                        if (f1Var != null) {
                            i22 = f1Var.f11229b + 1;
                        }
                        g5.W(parentActivity, string, i29, i22, f1Var3.f11229b - 1, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        i1 i1Var3 = i1Var2;
                                        boolean V = i1Var3.V();
                                        int intValue = num2.intValue();
                                        f1Var3.f11228a = intValue;
                                        ((r8) view4).u(f1.a(intValue), true);
                                        if (V != i1Var3.V()) {
                                            i1Var3.f11272n.W2.N(true);
                                        }
                                        rc rcVar3 = i1Var3.f11271f;
                                        if (rcVar3 != null) {
                                            rcVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        i1 i1Var4 = i1Var2;
                                        boolean V2 = i1Var4.V();
                                        int intValue2 = num2.intValue();
                                        f1Var3.f11229b = intValue2;
                                        ((r8) view4).u(f1.a(intValue2), true);
                                        if (V2 != i1Var4.V()) {
                                            i1Var4.f11272n.W2.N(true);
                                        }
                                        rc rcVar4 = i1Var4.f11271f;
                                        if (rcVar4 != null) {
                                            rcVar4.run();
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
                        int i30 = f1Var3.f11229b;
                        int i31 = f1Var3.f11228a + 1;
                        if (f1Var2 != null) {
                            i23 = f1Var2.f11228a - 1;
                        }
                        g5.W(parentActivity2, string2, i30, i31, i23, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        i1 i1Var3 = i1Var2;
                                        boolean V = i1Var3.V();
                                        int intValue = num2.intValue();
                                        f1Var3.f11228a = intValue;
                                        ((r8) view4).u(f1.a(intValue), true);
                                        if (V != i1Var3.V()) {
                                            i1Var3.f11272n.W2.N(true);
                                        }
                                        rc rcVar3 = i1Var3.f11271f;
                                        if (rcVar3 != null) {
                                            rcVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        i1 i1Var4 = i1Var2;
                                        boolean V2 = i1Var4.V();
                                        int intValue2 = num2.intValue();
                                        f1Var3.f11229b = intValue2;
                                        ((r8) view4).u(f1.a(intValue2), true);
                                        if (V2 != i1Var4.V()) {
                                            i1Var4.f11272n.W2.N(true);
                                        }
                                        rc rcVar4 = i1Var4.f11271f;
                                        if (rcVar4 != null) {
                                            rcVar4.run();
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
                        i1Var2.f11272n.W2.N(true);
                        rc rcVar3 = i1Var2.f11271f;
                        if (rcVar3 != null) {
                            rcVar3.run();
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
                hg.f2.U((hg.f2) this.f8999b, (p61) obj, (View) obj2);
                return;
        }
    }

    @Override
    public boolean w(ty tyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        ii.k4 k4Var = (ii.k4) this.f8999b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        k4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        tyVar.finishFragment();
        return true;
    }

    public c5(j2.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        this.f8998a = 25;
        this.f8999b = b0Var;
    }

    public c5(Object obj, int i10) {
        this.f8998a = i10;
        this.f8999b = obj;
    }
}
