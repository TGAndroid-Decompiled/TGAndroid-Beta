package ei;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import ci.fd;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.w6;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.aa0;
import org.telegram.ui.ej1;
import org.telegram.ui.ry;
import org.telegram.ui.vq;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.xn;
public final class e1 implements Runnable {
    public final int f8293a = 0;
    public final TLObject f8294b;
    public final int f8295c;
    public final long d;
    public final Object e;
    public final Object f8296f;
    public final Object h;
    public final Object f8297n;
    public final Object f8298r;

    public e1(TLObject tLObject, int i10, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j3, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f8294b = tLObject;
        this.f8295c = i10;
        this.e = b2Var;
        this.f8296f = context;
        this.d = j3;
        this.h = d6Var;
        this.f8297n = sVar;
        this.f8298r = eVar;
    }

    @Override
    public final void run() {
        String i10;
        xc a02;
        int i11;
        ry ryVar;
        TLObject tLObject;
        String[] split;
        switch (this.f8293a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
                Context context = (Context) this.f8296f;
                d6 d6Var = (d6) this.h;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.f8297n;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f8298r;
                TLObject tLObject2 = this.f8294b;
                if (tLObject2 instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject2;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z10 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i12 = this.f8295c;
                    long j3 = this.d;
                    if (z10) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str = tL_botInlineMessageMediaWebPage.url;
                            f1 f1Var = new f1(b2Var, context, i12, j3, tL_messages_preparedInlineMessage, d6Var, sVar, eVar);
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            int[] iArr = {ConnectionsManager.getInstance(i12).sendRequestTyped(getwebpagepreview, new Object(), new h1(iArr, f1Var, notificationCenterDelegateArr, i12, 0))};
                            b2Var.setOnCancelListener(new fd(new ai.s1(iArr, i12, notificationCenterDelegateArr, 9), 1));
                            return;
                        }
                    }
                    File[] fileArr = new File[1];
                    g1 g1Var = new g1(b2Var, context, i12, j3, tL_messages_preparedInlineMessage, fileArr, d6Var, sVar, eVar);
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
                                i10 = org.telegram.ui.Cells.q3.i(".", httpUrlExtension);
                            }
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str2) + i10);
                            if (!file.exists()) {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new ai.g3(11, fileArr, g1Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str2);
                                b2Var.setOnCancelListener(new fd(httpGetFileTask, 2));
                                return;
                            }
                            g1Var.run();
                            return;
                        }
                    }
                    g1Var.run();
                    return;
                }
                eVar.run("MESSAGE_EXPIRED", null);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.e;
                String str3 = (String) this.f8296f;
                String str4 = (String) this.h;
                TLRPC.User user = (TLRPC.User) this.f8297n;
                String str5 = (String) this.f8298r;
                ArrayList arrayList = launchActivity.f30795f0;
                ArrayList arrayList2 = launchActivity.f30791d0;
                ArrayList arrayList3 = launchActivity.E0;
                TLObject tLObject3 = this.f8294b;
                if (tLObject3 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject3;
                    int i13 = this.f8295c;
                    MessagesController.getInstance(i13).putUsers(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str3 != null) {
                        LaunchActivity.C0(launchActivity, launchActivity.O, tL_attachMenuBot, str3, false);
                        return;
                    }
                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) hg.c.h(1, arrayList2);
                    if (AndroidUtilities.isTablet() && !(n2Var instanceof xn) && !arrayList.isEmpty()) {
                        n2Var = (org.telegram.ui.ActionBar.n2) hg.c.h(1, arrayList);
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
                        ryVar = new ry(bundle);
                        ryVar.C2 = new aa0(launchActivity, user, str5, i13);
                    } else {
                        ryVar = null;
                    }
                    if (!tL_attachMenuBot.inactive) {
                        if (ryVar != null) {
                            if (n2Var != null) {
                                n2Var.dismissCurrentDialog();
                            }
                            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                if (((Dialog) arrayList3.get(i14)).isShowing()) {
                                    ((Dialog) arrayList3.get(i14)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.p0(ryVar);
                            return;
                        } else if (n2Var instanceof xn) {
                            xn xnVar = (xn) n2Var;
                            if (xnVar.i() != null) {
                                tLObject = xnVar.i();
                            } else {
                                tLObject = xnVar.e;
                            }
                            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject)) {
                                a02 = xc.a0(n2Var);
                                i11 = R.string.BotAlreadyAddedToAttachMenu;
                            } else {
                                xnVar.W9(user.f18230id, str5, false);
                                return;
                            }
                        } else {
                            a02 = xc.a0(n2Var);
                            i11 = R.string.BotAlreadyAddedToAttachMenu;
                        }
                    } else {
                        w6 w6Var = new w6(launchActivity);
                        w6Var.setColor(h6.w0(null, h6.f18882ia, false));
                        w6Var.setBackgroundColor(h6.w0(null, h6.L5, false));
                        w6Var.setAttachBot(tL_attachMenuBot);
                        ej1.a(launchActivity, new vq(launchActivity, i13, this.d, ryVar, n2Var, user, str5), null);
                        return;
                    }
                } else {
                    a02 = xc.a0((org.telegram.ui.ActionBar.n2) hg.c.h(1, arrayList2));
                    i11 = R.string.BotCantAddToAttachMenu;
                }
                org.telegram.messenger.z0.p(i11, a02, null);
                return;
        }
    }

    public e1(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.e = launchActivity;
        this.f8294b = tLObject;
        this.f8295c = i10;
        this.f8296f = str;
        this.h = str2;
        this.f8297n = user;
        this.f8298r = str3;
        this.d = j3;
    }
}
