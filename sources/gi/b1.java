package gi;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import ei.pc;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.x6;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cy;
import org.telegram.ui.lq;
import org.telegram.ui.o80;
import org.telegram.ui.qn;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.zh1;
public final class b1 implements Runnable {
    public final int f11089a = 0;
    public final TLObject f11090b;
    public final int f11091c;
    public final long d;
    public final Object e;
    public final Object f11092f;
    public final Object h;
    public final Object f11093n;
    public final Object f11094r;

    public b1(TLObject tLObject, int i10, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j10, d6 d6Var, org.telegram.ui.web.t tVar, ai.s0 s0Var) {
        this.f11090b = tLObject;
        this.f11091c = i10;
        this.e = b2Var;
        this.f11092f = context;
        this.d = j10;
        this.h = d6Var;
        this.f11093n = tVar;
        this.f11094r = s0Var;
    }

    @Override
    public final void run() {
        String h;
        xc a02;
        int i10;
        cy cyVar;
        TLObject tLObject;
        String[] split;
        switch (this.f11089a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
                Context context = (Context) this.f11092f;
                d6 d6Var = (d6) this.h;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.f11093n;
                ai.s0 s0Var = (ai.s0) this.f11094r;
                TLObject tLObject2 = this.f11090b;
                if (tLObject2 instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject2;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z10 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i11 = this.f11091c;
                    long j10 = this.d;
                    if (z10) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str = tL_botInlineMessageMediaWebPage.url;
                            c1 c1Var = new c1(b2Var, context, i11, j10, tL_messages_preparedInlineMessage, d6Var, tVar, s0Var);
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            int[] iArr = {ConnectionsManager.getInstance(i11).sendRequestTyped(getwebpagepreview, new Object(), new ai.u0(iArr, c1Var, notificationCenterDelegateArr, i11, 2))};
                            b2Var.setOnCancelListener(new pc(new ah.o(iArr, i11, notificationCenterDelegateArr, 14), 1));
                            return;
                        }
                    }
                    File[] fileArr = new File[1];
                    d1 d1Var = new d1(b2Var, context, i11, j10, tL_messages_preparedInlineMessage, fileArr, d6Var, tVar, s0Var);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str2 = botInlineResult.content.url;
                            String httpUrlExtension = ImageLoader.getHttpUrlExtension(str2, null);
                            if (TextUtils.isEmpty(httpUrlExtension)) {
                                h = FileLoader.getExtensionByMimeType(tL_messages_preparedInlineMessage.result.content.mime_type);
                            } else {
                                h = r4.c.h(".", httpUrlExtension);
                            }
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str2) + h);
                            if (!file.exists()) {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new ai.o2(17, fileArr, d1Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str2);
                                b2Var.setOnCancelListener(new pc(httpGetFileTask, 2));
                                return;
                            }
                            d1Var.run();
                            return;
                        }
                    }
                    d1Var.run();
                    return;
                }
                s0Var.run("MESSAGE_EXPIRED", null);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.e;
                String str3 = (String) this.f11092f;
                String str4 = (String) this.h;
                TLRPC.User user = (TLRPC.User) this.f11093n;
                String str5 = (String) this.f11094r;
                ArrayList arrayList = launchActivity.f33159f0;
                ArrayList arrayList2 = launchActivity.f33155d0;
                ArrayList arrayList3 = launchActivity.E0;
                TLObject tLObject3 = this.f11090b;
                if (tLObject3 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject3;
                    int i12 = this.f11091c;
                    MessagesController.getInstance(i12).putUsers(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str3 != null) {
                        LaunchActivity.G0(launchActivity, launchActivity.O, tL_attachMenuBot, str3, false);
                        return;
                    }
                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) i2.e.h(1, arrayList2);
                    if (AndroidUtilities.isTablet() && !(n2Var instanceof qn) && !arrayList.isEmpty()) {
                        n2Var = (org.telegram.ui.ActionBar.n2) i2.e.h(1, arrayList);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    if (!TextUtils.isEmpty(str4)) {
                        for (String str6 : str4.split(" ")) {
                            if (MediaDataController.canShowAttachMenuBotForTarget(tL_attachMenuBot, str6)) {
                                arrayList4.add(str6);
                            }
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
                        cyVar = new cy(bundle);
                        cyVar.C2 = new o80(launchActivity, user, str5, i12);
                    } else {
                        cyVar = null;
                    }
                    if (!tL_attachMenuBot.inactive) {
                        if (cyVar != null) {
                            if (n2Var != null) {
                                n2Var.dismissCurrentDialog();
                            }
                            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                if (((Dialog) arrayList3.get(i13)).isShowing()) {
                                    ((Dialog) arrayList3.get(i13)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.t0(cyVar);
                            return;
                        } else if (n2Var instanceof qn) {
                            qn qnVar = (qn) n2Var;
                            if (qnVar.i() != null) {
                                tLObject = qnVar.i();
                            } else {
                                tLObject = qnVar.e;
                            }
                            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject)) {
                                a02 = xc.a0(n2Var);
                                i10 = R.string.BotAlreadyAddedToAttachMenu;
                            } else {
                                qnVar.ba(user.f20420id, str5, false);
                                return;
                            }
                        } else {
                            a02 = xc.a0(n2Var);
                            i10 = R.string.BotAlreadyAddedToAttachMenu;
                        }
                    } else {
                        x6 x6Var = new x6(launchActivity);
                        x6Var.setColor(h6.x0(null, h6.ia, false));
                        x6Var.setBackgroundColor(h6.x0(null, h6.L5, false));
                        x6Var.setAttachBot(tL_attachMenuBot);
                        zh1.a(launchActivity, new lq(launchActivity, i12, this.d, cyVar, n2Var, user, str5), null);
                        return;
                    }
                } else {
                    a02 = xc.a0((org.telegram.ui.ActionBar.n2) i2.e.h(1, arrayList2));
                    i10 = R.string.BotCantAddToAttachMenu;
                }
                kk.q(i10, a02, null);
                return;
        }
    }

    public b1(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.e = launchActivity;
        this.f11090b = tLObject;
        this.f11091c = i10;
        this.f11092f = str;
        this.h = str2;
        this.f11093n = user;
        this.f11094r = str3;
        this.d = j10;
    }
}
