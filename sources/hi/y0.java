package hi;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import fi.ob;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gc;
import org.telegram.messenger.k5;
import org.telegram.messenger.ls;
import org.telegram.messenger.pb;
import org.telegram.messenger.qb;
import org.telegram.messenger.qp;
import org.telegram.messenger.ui;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.q6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.tp;
import org.telegram.ui.vc1;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.ww;
import org.telegram.ui.x60;
public final class y0 implements Runnable {
    public final int f15044a = 1;
    public final int f15045b;
    public final long f15046c;
    public final Object d;
    public final Object f15047e;
    public final Object f15048f;
    public final Object h;
    public final Object f15049n;
    public final Object f15050r;

    public y0(qb qbVar, int i7, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.d = qbVar;
        this.f15045b = i7;
        this.f15047e = str;
        this.f15048f = inputFile;
        this.h = inputEncryptedFile;
        this.f15049n = bArr;
        this.f15050r = bArr2;
        this.f15046c = j3;
    }

    @Override
    public final void run() {
        String i7;
        ww wwVar;
        ?? r22;
        hc a02;
        TLObject tLObject;
        int i10 = this.f15044a;
        Object obj = this.f15050r;
        Object obj2 = this.f15049n;
        Object obj3 = this.h;
        Object obj4 = this.f15048f;
        Object obj5 = this.d;
        Object obj6 = this.f15047e;
        switch (i10) {
            case 0:
                TLObject tLObject2 = (TLObject) obj5;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj6;
                Context context = (Context) obj4;
                f6 f6Var = (f6) obj3;
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) obj2;
                bi.t0 t0Var = (bi.t0) obj;
                if (tLObject2 instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject2;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z9 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i11 = this.f15045b;
                    long j3 = this.f15046c;
                    if (z9) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str = tL_botInlineMessageMediaWebPage.url;
                            z0 z0Var = new z0(u1Var, context, i11, j3, tL_messages_preparedInlineMessage, f6Var, pVar, t0Var);
                            ls[] lsVarArr = new ls[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            int[] iArr = {ConnectionsManager.getInstance(i11).sendRequestTyped(getwebpagepreview, new d3.b(1), new bi.v0(iArr, z0Var, lsVarArr, i11, 2))};
                            u1Var.setOnCancelListener(new ob(new ai.e0(iArr, i11, lsVarArr, 15), 1));
                            return;
                        }
                    }
                    File[] fileArr = new File[1];
                    a1 a1Var = new a1(u1Var, context, i11, j3, tL_messages_preparedInlineMessage, fileArr, f6Var, pVar, t0Var);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str2 = botInlineResult.content.url;
                            String B = gc.B(str2, null);
                            if (TextUtils.isEmpty(B)) {
                                i7 = w7.C(tL_messages_preparedInlineMessage.result.content.mime_type);
                            } else {
                                i7 = rf.b.i(".", B);
                            }
                            File z10 = w7.z(4);
                            File file = new File(z10, Utilities.a(str2) + i7);
                            if (!file.exists()) {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new ai.f1(18, fileArr, a1Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str2);
                                u1Var.setOnCancelListener(new ob(httpGetFileTask, 2));
                                return;
                            }
                            a1Var.run();
                            return;
                        }
                    }
                    a1Var.run();
                    return;
                }
                t0Var.a("MESSAGE_EXPIRED", null);
                return;
            case 1:
                qb qbVar = (qb) obj5;
                String str3 = (String) obj6;
                qbVar.getClass();
                org.telegram.messenger.g0.h3(new pb(this.f15045b, str3, (TLRPC.InputFile) obj4, (TLRPC.InputEncryptedFile) obj3, (byte[]) obj2, (byte[]) obj, this.f15046c));
                qbVar.f24676b.f22627u.remove(str3);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLObject tLObject3 = (TLObject) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str6 = (String) obj;
                ArrayList arrayList = launchActivity.f41236f0;
                ArrayList arrayList2 = launchActivity.f41232d0;
                ArrayList arrayList3 = launchActivity.C0;
                if (tLObject3 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject3;
                    int i12 = this.f15045b;
                    qp.s1(i12).Y3(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str4 != null) {
                        LaunchActivity.G0(launchActivity, launchActivity.O, tL_attachMenuBot, str4, false);
                        return;
                    }
                    org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList2);
                    if (org.telegram.messenger.g0.Q1() && !(f2Var instanceof an) && !arrayList.isEmpty()) {
                        f2Var = (org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    if (!TextUtils.isEmpty(str5)) {
                        String[] split = str5.split(" ");
                        int length = split.length;
                        int i13 = 0;
                        while (i13 < length) {
                            String[] strArr = split;
                            String str7 = strArr[i13];
                            Pattern pattern = ui.R1;
                            int i14 = length;
                            ArrayList<TLRPC.AttachMenuPeerType> arrayList5 = tL_attachMenuBot.peer_types;
                            int i15 = i13;
                            int size = arrayList5.size();
                            int i16 = 0;
                            while (i16 < size) {
                                TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList5.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
                                ArrayList<TLRPC.AttachMenuPeerType> arrayList6 = arrayList5;
                                if (((!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) && !(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM)) || !str7.equals("bots")) && ((!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) || !str7.equals("channels")) && ((!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) || !str7.equals("groups")) && (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypePM) || !str7.equals("users"))))) {
                                    arrayList5 = arrayList6;
                                    i16 = i17;
                                } else {
                                    arrayList4.add(str7);
                                    i13 = i15 + 1;
                                    split = strArr;
                                    length = i14;
                                }
                            }
                            i13 = i15 + 1;
                            split = strArr;
                            length = i14;
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
                        wwVar = new ww(bundle);
                        wwVar.C2 = new x60(launchActivity, user, str6, i12);
                    } else {
                        wwVar = null;
                    }
                    if (!tL_attachMenuBot.inactive) {
                        if (wwVar != null) {
                            if (f2Var != null) {
                                f2Var.dismissCurrentDialog();
                            }
                            for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                                if (((Dialog) arrayList3.get(i18)).isShowing()) {
                                    ((Dialog) arrayList3.get(i18)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.t0(wwVar);
                        } else {
                            if (f2Var instanceof an) {
                                an anVar = (an) f2Var;
                                if (anVar.j() != null) {
                                    tLObject = anVar.j();
                                } else {
                                    tLObject = anVar.f43747e;
                                }
                                if (!ui.t(tL_attachMenuBot, tLObject)) {
                                    a02 = hc.a0(f2Var);
                                    r22 = 0;
                                } else {
                                    anVar.wa(user.f27101id, str6, false);
                                }
                            } else {
                                r22 = 0;
                                a02 = hc.a0(f2Var);
                            }
                            k5.p(r22, 2131753140, a02, r22);
                        }
                        return;
                    }
                    q6 q6Var = new q6(launchActivity);
                    q6Var.setColor(k6.x0(null, k6.f27943ia, false));
                    r6.i(k6.L5, q6Var, null);
                    q6Var.setAttachBot(tL_attachMenuBot);
                    vc1.a(launchActivity, new tp(launchActivity, i12, this.f15046c, wwVar, f2Var, user, str6), null);
                    return;
                }
                k5.p(null, 2131753109, hc.a0((org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList2)), null);
                return;
        }
    }

    public y0(TLObject tLObject, int i7, org.telegram.ui.ActionBar.u1 u1Var, Context context, long j3, f6 f6Var, org.telegram.ui.web.p pVar, bi.t0 t0Var) {
        this.d = tLObject;
        this.f15045b = i7;
        this.f15047e = u1Var;
        this.f15048f = context;
        this.f15046c = j3;
        this.h = f6Var;
        this.f15049n = pVar;
        this.f15050r = t0Var;
    }

    public y0(LaunchActivity launchActivity, TLObject tLObject, int i7, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.f15047e = launchActivity;
        this.d = tLObject;
        this.f15045b = i7;
        this.f15048f = str;
        this.h = str2;
        this.f15049n = user;
        this.f15050r = str3;
        this.f15046c = j3;
    }
}
