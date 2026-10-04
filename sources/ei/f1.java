package ei;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import ci.ed;
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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.w6;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.da0;
import org.telegram.ui.ej1;
import org.telegram.ui.uy;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.wq;
import org.telegram.ui.yn;
public final class f1 implements Runnable {
    public final int f9026a = 0;
    public final TLObject f9027b;
    public final int f9028c;
    public final long d;
    public final Object f9029e;
    public final Object f9030f;
    public final Object h;
    public final Object f9031n;
    public final Object f9032r;

    public f1(TLObject tLObject, int i10, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j3, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f9027b = tLObject;
        this.f9028c = i10;
        this.f9029e = b2Var;
        this.f9030f = context;
        this.d = j3;
        this.h = d6Var;
        this.f9031n = sVar;
        this.f9032r = eVar;
    }

    @Override
    public final void run() {
        String i10;
        yc a02;
        int i11;
        uy uyVar;
        TLObject tLObject;
        String[] split;
        switch (this.f9026a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f9029e;
                Context context = (Context) this.f9030f;
                d6 d6Var = (d6) this.h;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.f9031n;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f9032r;
                TLObject tLObject2 = this.f9027b;
                if (tLObject2 instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject2;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z10 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i12 = this.f9028c;
                    long j3 = this.d;
                    if (z10) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str = tL_botInlineMessageMediaWebPage.url;
                            g1 g1Var = new g1(b2Var, context, i12, j3, tL_messages_preparedInlineMessage, d6Var, sVar, eVar);
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            int[] iArr = {ConnectionsManager.getInstance(i12).sendRequestTyped(getwebpagepreview, new Object(), new i1(iArr, g1Var, notificationCenterDelegateArr, i12, 0))};
                            b2Var.setOnCancelListener(new ed(new ai.s1(iArr, i12, notificationCenterDelegateArr, 9), 1));
                            return;
                        }
                    }
                    File[] fileArr = new File[1];
                    h1 h1Var = new h1(b2Var, context, i12, j3, tL_messages_preparedInlineMessage, fileArr, d6Var, sVar, eVar);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str2 = botInlineResult.content.url;
                            String httpUrlExtension = ImageLoader.getHttpUrlExtension(str2, null);
                            if (TextUtils.isEmpty(httpUrlExtension)) {
                                i10 = FileLoader.getExtensionByMimeType(tL_messages_preparedInlineMessage.result.content.mime_type);
                            } else {
                                i10 = sa.e.i(".", httpUrlExtension);
                            }
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str2) + i10);
                            if (!file.exists()) {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new ai.g3(11, fileArr, h1Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str2);
                                b2Var.setOnCancelListener(new ed(httpGetFileTask, 2));
                                return;
                            }
                            h1Var.run();
                            return;
                        }
                    }
                    h1Var.run();
                    return;
                }
                eVar.run("MESSAGE_EXPIRED", null);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.f9029e;
                String str3 = (String) this.f9030f;
                String str4 = (String) this.h;
                TLRPC.User user = (TLRPC.User) this.f9031n;
                String str5 = (String) this.f9032r;
                ArrayList arrayList = launchActivity.f33784f0;
                ArrayList arrayList2 = launchActivity.f33780d0;
                ArrayList arrayList3 = launchActivity.E0;
                TLObject tLObject3 = this.f9027b;
                if (tLObject3 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject3;
                    int i13 = this.f9028c;
                    MessagesController.getInstance(i13).putUsers(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str3 != null) {
                        LaunchActivity.C0(launchActivity, launchActivity.O, tL_attachMenuBot, str3, false);
                        return;
                    }
                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) hg.c.g(1, arrayList2);
                    if (AndroidUtilities.isTablet() && !(n2Var instanceof yn) && !arrayList.isEmpty()) {
                        n2Var = (org.telegram.ui.ActionBar.n2) hg.c.g(1, arrayList);
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
                        uyVar = new uy(bundle);
                        uyVar.C2 = new da0(launchActivity, user, str5, i13);
                    } else {
                        uyVar = null;
                    }
                    if (!tL_attachMenuBot.inactive) {
                        if (uyVar != null) {
                            if (n2Var != null) {
                                n2Var.dismissCurrentDialog();
                            }
                            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                if (((Dialog) arrayList3.get(i14)).isShowing()) {
                                    ((Dialog) arrayList3.get(i14)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.p0(uyVar);
                            return;
                        } else if (n2Var instanceof yn) {
                            yn ynVar = (yn) n2Var;
                            if (ynVar.i() != null) {
                                tLObject = ynVar.i();
                            } else {
                                tLObject = ynVar.f43322e;
                            }
                            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject)) {
                                a02 = yc.a0(n2Var);
                                i11 = R.string.BotAlreadyAddedToAttachMenu;
                            } else {
                                ynVar.V9(user.f20189id, str5, false);
                                return;
                            }
                        } else {
                            a02 = yc.a0(n2Var);
                            i11 = R.string.BotAlreadyAddedToAttachMenu;
                        }
                    } else {
                        w6 w6Var = new w6(launchActivity);
                        w6Var.setColor(i6.w0(null, i6.f20917ia, false));
                        w6Var.setBackgroundColor(i6.w0(null, i6.L5, false));
                        w6Var.setAttachBot(tL_attachMenuBot);
                        ej1.a(launchActivity, new wq(launchActivity, i13, this.d, uyVar, n2Var, user, str5), null);
                        return;
                    }
                } else {
                    a02 = yc.a0((org.telegram.ui.ActionBar.n2) hg.c.g(1, arrayList2));
                    i11 = R.string.BotCantAddToAttachMenu;
                }
                bi.o(i11, a02, null);
                return;
        }
    }

    public f1(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.f9029e = launchActivity;
        this.f9027b = tLObject;
        this.f9028c = i10;
        this.f9030f = str;
        this.h = str2;
        this.f9031n = user;
        this.f9032r = str3;
        this.d = j3;
    }
}
