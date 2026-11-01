package org.telegram.messenger;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.d70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.re1;
import org.telegram.ui.v70;
import org.telegram.ui.web.HttpGetFileTask;
public final class qb implements Runnable {
    public final int f17760a = 0;
    public final int f17761b;
    public final Object f17762c;
    public final long d;
    public final Object e;
    public final Object f17763f;
    public final Object h;
    public final Object f17764n;
    public final Object f17765r;

    public qb(sb sbVar, int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.e = sbVar;
        this.f17761b = i10;
        this.f17762c = str;
        this.f17763f = inputFile;
        this.h = inputEncryptedFile;
        this.f17764n = bArr;
        this.f17765r = bArr2;
        this.d = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.zx zxVar;
        ?? r22;
        org.telegram.ui.Components.cc a02;
        TLObject tLObject;
        String h;
        int i10 = this.f17760a;
        Object obj = this.f17765r;
        Object obj2 = this.f17764n;
        Object obj3 = this.h;
        Object obj4 = this.f17763f;
        Object obj5 = this.f17762c;
        Object obj6 = this.e;
        switch (i10) {
            case 0:
                sb sbVar = (sb) obj6;
                String str = (String) obj5;
                sbVar.getClass();
                i0.g3(new rb(this.f17761b, str, (TLRPC.InputFile) obj4, (TLRPC.InputEncryptedFile) obj3, (byte[]) obj2, (byte[]) obj, this.d));
                sbVar.f18077b.f16263u.remove(str);
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLObject tLObject2 = (TLObject) obj4;
                String str2 = (String) obj5;
                String str3 = (String) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str4 = (String) obj;
                ArrayList arrayList = launchActivity.f33364f0;
                ArrayList arrayList2 = launchActivity.f33360d0;
                ArrayList arrayList3 = launchActivity.E0;
                if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject2;
                    int i11 = this.f17761b;
                    wp.r1(i11).V3(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str2 != null) {
                        LaunchActivity.G0(launchActivity, launchActivity.O, tL_attachMenuBot, str2, false);
                        return;
                    }
                    org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList2);
                    if (i0.Q1() && !(k2Var instanceof org.telegram.ui.un) && !arrayList.isEmpty()) {
                        k2Var = (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList);
                    }
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    ArrayList arrayList4 = new ArrayList();
                    if (!TextUtils.isEmpty(str3)) {
                        String[] split = str3.split(" ");
                        int length = split.length;
                        int i12 = 0;
                        while (i12 < length) {
                            int i13 = i12;
                            String str5 = split[i13];
                            Pattern pattern = vi.R1;
                            String[] strArr = split;
                            ArrayList<TLRPC.AttachMenuPeerType> arrayList5 = tL_attachMenuBot.peer_types;
                            int i14 = length;
                            int size = arrayList5.size();
                            int i15 = 0;
                            while (i15 < size) {
                                TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList5.get(i15);
                                int i16 = i15 + 1;
                                TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
                                ArrayList<TLRPC.AttachMenuPeerType> arrayList6 = arrayList5;
                                if (((!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) && !(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM)) || !str5.equals("bots")) && ((!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) || !str5.equals("channels")) && ((!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) || !str5.equals("groups")) && (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypePM) || !str5.equals("users"))))) {
                                    arrayList5 = arrayList6;
                                    i15 = i16;
                                } else {
                                    arrayList4.add(str5);
                                    i12 = i13 + 1;
                                    split = strArr;
                                    length = i14;
                                }
                            }
                            i12 = i13 + 1;
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
                        zxVar = new org.telegram.ui.zx(bundle);
                        zxVar.C2 = new v70(launchActivity, user, str4, i11);
                    } else {
                        zxVar = null;
                    }
                    if (!tL_attachMenuBot.inactive) {
                        if (zxVar != null) {
                            if (k2Var2 != null) {
                                k2Var2.dismissCurrentDialog();
                            }
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                if (((Dialog) arrayList3.get(i17)).isShowing()) {
                                    ((Dialog) arrayList3.get(i17)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.t0(zxVar);
                        } else {
                            if (k2Var2 instanceof org.telegram.ui.un) {
                                org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var2;
                                if (unVar.j() != null) {
                                    tLObject = unVar.j();
                                } else {
                                    tLObject = unVar.e;
                                }
                                if (!vi.t(tL_attachMenuBot, tLObject)) {
                                    a02 = org.telegram.ui.Components.cc.a0(k2Var2);
                                    r22 = 0;
                                } else {
                                    unVar.ra(user.f19943id, str4, false);
                                }
                            } else {
                                r22 = 0;
                                a02 = org.telegram.ui.Components.cc.a0(k2Var2);
                            }
                            m5.o(r22, 2131753140, a02, r22);
                        }
                        return;
                    }
                    org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(launchActivity);
                    m6Var.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ia, false));
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.L5, m6Var, null);
                    m6Var.setAttachBot(tL_attachMenuBot);
                    re1.a(launchActivity, new org.telegram.ui.sq(launchActivity, i11, this.d, zxVar, k2Var2, user, str4), null);
                    return;
                }
                m5.o(null, 2131753109, org.telegram.ui.Components.cc.a0((org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList2)), null);
                return;
            default:
                TLObject tLObject3 = (TLObject) obj6;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj5;
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj3;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) obj2;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) obj;
                if (tLObject3 instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject3;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z10 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i18 = this.f17761b;
                    long j10 = this.d;
                    if (z10) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str6 = tL_botInlineMessageMediaWebPage.url;
                            xh.u0 u0Var = new xh.u0(x1Var, context, i18, j10, tL_messages_preparedInlineMessage, p6Var, qVar, eVar);
                            vs[] vsVarArr = new vs[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str6;
                            int[] iArr = {ConnectionsManager.getInstance(i18).sendRequestTyped(getwebpagepreview, new a3.b(1), new org.telegram.ui.f0(iArr, u0Var, vsVarArr, i18, 8))};
                            x1Var.setOnCancelListener(new eg.k(new org.telegram.ui.Wallet.x0(iArr, i18, vsVarArr, 24), 2));
                            return;
                        }
                    }
                    File[] fileArr = new File[1];
                    d70 d70Var = new d70(x1Var, context, i18, j10, tL_messages_preparedInlineMessage, fileArr, p6Var, qVar, eVar);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str7 = botInlineResult.content.url;
                            String B = ic.B(str7, null);
                            if (TextUtils.isEmpty(B)) {
                                h = b8.C(tL_messages_preparedInlineMessage.result.content.mime_type);
                            } else {
                                h = sc.e.h(".", B);
                            }
                            File z11 = b8.z(4);
                            File file = new File(z11, Utilities.a(str7) + h);
                            if (!file.exists()) {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new rh.q2(14, fileArr, d70Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str7);
                                x1Var.setOnCancelListener(new eg.k(httpGetFileTask, 3));
                                return;
                            }
                            d70Var.run();
                            return;
                        }
                    }
                    d70Var.run();
                    return;
                }
                eVar.a("MESSAGE_EXPIRED", null);
                return;
        }
    }

    public qb(TLObject tLObject, int i10, org.telegram.ui.ActionBar.x1 x1Var, Context context, long j10, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.web.q qVar, org.telegram.tgnet.e eVar) {
        this.e = tLObject;
        this.f17761b = i10;
        this.f17762c = x1Var;
        this.f17763f = context;
        this.d = j10;
        this.h = p6Var;
        this.f17764n = qVar;
        this.f17765r = eVar;
    }

    public qb(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.e = launchActivity;
        this.f17763f = tLObject;
        this.f17761b = i10;
        this.f17762c = str;
        this.h = str2;
        this.f17764n = user;
        this.f17765r = str3;
        this.d = j10;
    }
}
