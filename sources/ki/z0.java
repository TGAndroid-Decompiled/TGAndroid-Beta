package ki;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import hi.lb;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fc;
import org.telegram.messenger.is;
import org.telegram.messenger.k5;
import org.telegram.messenger.np;
import org.telegram.messenger.ob;
import org.telegram.messenger.pb;
import org.telegram.messenger.si;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.o6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.v60;
import org.telegram.ui.vp;
import org.telegram.ui.wc1;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.yw;
public final class z0 implements Runnable {
    public final int f18723a = 1;
    public final int f18724b;
    public final long f18725c;
    public final Object d;
    public final Object f18726e;
    public final Object f18727f;
    public final Object h;
    public final Object f18728n;
    public final Object f18729r;

    public z0(pb pbVar, int i7, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.d = pbVar;
        this.f18724b = i7;
        this.f18726e = str;
        this.f18727f = inputFile;
        this.h = inputEncryptedFile;
        this.f18728n = bArr;
        this.f18729r = bArr2;
        this.f18725c = j3;
    }

    @Override
    public final void run() {
        String k10;
        yw ywVar;
        ?? r22;
        cc a02;
        TLObject tLObject;
        int i7 = this.f18723a;
        Object obj = this.f18729r;
        Object obj2 = this.f18728n;
        Object obj3 = this.h;
        Object obj4 = this.f18727f;
        Object obj5 = this.d;
        Object obj6 = this.f18726e;
        switch (i7) {
            case 0:
                TLObject tLObject2 = (TLObject) obj5;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj6;
                Context context = (Context) obj4;
                e6 e6Var = (e6) obj3;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) obj2;
                bi.h0 h0Var = (bi.h0) obj;
                if (tLObject2 instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject2;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z10 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i10 = this.f18724b;
                    long j3 = this.f18725c;
                    if (z10) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str = tL_botInlineMessageMediaWebPage.url;
                            a1 a1Var = new a1(t1Var, context, i10, j3, tL_messages_preparedInlineMessage, e6Var, qVar, h0Var);
                            is[] isVarArr = new is[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            int[] iArr = {ConnectionsManager.getInstance(i10).sendRequestTyped(getwebpagepreview, new d3.b(1), new di.k0(iArr, a1Var, isVarArr, i10, 2))};
                            t1Var.setOnCancelListener(new lb(new ai.a1(iArr, i10, isVarArr, 20), 1));
                            return;
                        }
                    }
                    File[] fileArr = new File[1];
                    b1 b1Var = new b1(t1Var, context, i10, j3, tL_messages_preparedInlineMessage, fileArr, e6Var, qVar, h0Var);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str2 = botInlineResult.content.url;
                            String B = fc.B(str2, null);
                            if (TextUtils.isEmpty(B)) {
                                k10 = w7.C(tL_messages_preparedInlineMessage.result.content.mime_type);
                            } else {
                                k10 = r.b.k(".", B);
                            }
                            File z11 = w7.z(4);
                            File file = new File(z11, Utilities.a(str2) + k10);
                            if (!file.exists()) {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new ai.v1(26, fileArr, b1Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str2);
                                t1Var.setOnCancelListener(new lb(httpGetFileTask, 2));
                                return;
                            }
                            b1Var.run();
                            return;
                        }
                    }
                    b1Var.run();
                    return;
                }
                h0Var.a("MESSAGE_EXPIRED", null);
                return;
            case 1:
                pb pbVar = (pb) obj5;
                String str3 = (String) obj6;
                pbVar.getClass();
                org.telegram.messenger.g0.h3(new ob(this.f18724b, str3, (TLRPC.InputFile) obj4, (TLRPC.InputEncryptedFile) obj3, (byte[]) obj2, (byte[]) obj, this.f18725c));
                pbVar.f25921b.f23481u.remove(str3);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLObject tLObject3 = (TLObject) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str6 = (String) obj;
                ArrayList arrayList = launchActivity.f42634g0;
                ArrayList arrayList2 = launchActivity.f42630e0;
                ArrayList arrayList3 = launchActivity.D0;
                if (tLObject3 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject3;
                    int i11 = this.f18724b;
                    np.s1(i11).Y3(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str4 != null) {
                        LaunchActivity.G0(launchActivity, launchActivity.P, tL_attachMenuBot, str4, false);
                        return;
                    }
                    org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList2);
                    if (org.telegram.messenger.g0.Q1() && !(e2Var instanceof an) && !arrayList.isEmpty()) {
                        e2Var = (org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    if (!TextUtils.isEmpty(str5)) {
                        String[] split = str5.split(" ");
                        int length = split.length;
                        int i12 = 0;
                        while (i12 < length) {
                            String[] strArr = split;
                            String str7 = strArr[i12];
                            Pattern pattern = si.S1;
                            int i13 = length;
                            ArrayList<TLRPC.AttachMenuPeerType> arrayList5 = tL_attachMenuBot.peer_types;
                            int i14 = i12;
                            int size = arrayList5.size();
                            int i15 = 0;
                            while (i15 < size) {
                                TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList5.get(i15);
                                int i16 = i15 + 1;
                                TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
                                ArrayList<TLRPC.AttachMenuPeerType> arrayList6 = arrayList5;
                                if (((!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) && !(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM)) || !str7.equals("bots")) && ((!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) || !str7.equals("channels")) && ((!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) || !str7.equals("groups")) && (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypePM) || !str7.equals("users"))))) {
                                    arrayList5 = arrayList6;
                                    i15 = i16;
                                } else {
                                    arrayList4.add(str7);
                                    i12 = i14 + 1;
                                    split = strArr;
                                    length = i13;
                                }
                            }
                            i12 = i14 + 1;
                            split = strArr;
                            length = i13;
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("dialogsType", 14);
                        bundle.putBoolean("onlySelect", true);
                        bundle.putBoolean("allowGroups", arrayList4.contains("groups"));
                        bundle.putBoolean("allowMegagroups", arrayList4.contains("groups"));
                        bundle.putBoolean("allowLegacyGroups", arrayList4.contains("groups"));
                        bundle.putBoolean("allowUsers", arrayList4.contains("users"));
                        bundle.putBoolean("allowChannels", arrayList4.contains("channels"));
                        bundle.putBoolean("allowBots", arrayList4.contains("bots"));
                        ywVar = new yw(bundle);
                        ywVar.E2 = new v60(launchActivity, user, str6, i11);
                    } else {
                        ywVar = null;
                    }
                    if (!tL_attachMenuBot.inactive) {
                        if (ywVar != null) {
                            if (e2Var != null) {
                                e2Var.dismissCurrentDialog();
                            }
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                if (((Dialog) arrayList3.get(i17)).isShowing()) {
                                    ((Dialog) arrayList3.get(i17)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.t0(ywVar);
                        } else {
                            if (e2Var instanceof an) {
                                an anVar = (an) e2Var;
                                if (anVar.j() != null) {
                                    tLObject = anVar.j();
                                } else {
                                    tLObject = anVar.f45172e;
                                }
                                if (!si.t(tL_attachMenuBot, tLObject)) {
                                    a02 = cc.a0(e2Var);
                                    r22 = 0;
                                } else {
                                    anVar.za(user.f28200id, str6, false);
                                }
                            } else {
                                r22 = 0;
                                a02 = cc.a0(e2Var);
                            }
                            k5.o(r22, 2131753140, a02, r22);
                        }
                        return;
                    }
                    o6 o6Var = new o6(launchActivity);
                    o6Var.setColor(j6.x0(null, j6.f28944ia, false));
                    q6.h(j6.L5, o6Var, null);
                    o6Var.setAttachBot(tL_attachMenuBot);
                    wc1.a(launchActivity, new vp(launchActivity, i11, this.f18725c, ywVar, e2Var, user, str6), null);
                    return;
                }
                k5.o(null, 2131753109, cc.a0((org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList2)), null);
                return;
        }
    }

    public z0(TLObject tLObject, int i7, org.telegram.ui.ActionBar.t1 t1Var, Context context, long j3, e6 e6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.d = tLObject;
        this.f18724b = i7;
        this.f18726e = t1Var;
        this.f18727f = context;
        this.f18725c = j3;
        this.h = e6Var;
        this.f18728n = qVar;
        this.f18729r = h0Var;
    }

    public z0(LaunchActivity launchActivity, TLObject tLObject, int i7, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.f18726e = launchActivity;
        this.d = tLObject;
        this.f18724b = i7;
        this.f18727f = str;
        this.h = str2;
        this.f18728n = user;
        this.f18729r = str3;
        this.f18725c = j3;
    }
}
