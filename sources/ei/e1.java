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
import org.telegram.messenger.ok;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.w6;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ej1;
import org.telegram.ui.qy;
import org.telegram.ui.uq;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.wn;
import org.telegram.ui.z90;
public final class e1 implements Runnable {
    public final int f8292a = 0;
    public final TLObject f8293b;
    public final int f8294c;
    public final long d;
    public final Object e;
    public final Object f8295f;
    public final Object h;
    public final Object f8296n;
    public final Object f8297r;

    public e1(TLObject tLObject, int i10, org.telegram.ui.ActionBar.a2 a2Var, Context context, long j3, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f8293b = tLObject;
        this.f8294c = i10;
        this.e = a2Var;
        this.f8295f = context;
        this.d = j3;
        this.h = d6Var;
        this.f8296n = sVar;
        this.f8297r = eVar;
    }

    @Override
    public final void run() {
        String g10;
        xc a02;
        int i10;
        qy qyVar;
        TLObject tLObject;
        String[] split;
        switch (this.f8292a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.e;
                Context context = (Context) this.f8295f;
                d6 d6Var = (d6) this.h;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.f8296n;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f8297r;
                TLObject tLObject2 = this.f8293b;
                if (tLObject2 instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject2;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z10 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i11 = this.f8294c;
                    long j3 = this.d;
                    if (z10) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str = tL_botInlineMessageMediaWebPage.url;
                            f1 f1Var = new f1(a2Var, context, i11, j3, tL_messages_preparedInlineMessage, d6Var, sVar, eVar);
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            int[] iArr = {ConnectionsManager.getInstance(i11).sendRequestTyped(getwebpagepreview, new Object(), new h1(iArr, f1Var, notificationCenterDelegateArr, i11, 0))};
                            a2Var.setOnCancelListener(new fd(new ai.s1(iArr, i11, notificationCenterDelegateArr, 9), 1));
                            return;
                        }
                    }
                    File[] fileArr = new File[1];
                    g1 g1Var = new g1(a2Var, context, i11, j3, tL_messages_preparedInlineMessage, fileArr, d6Var, sVar, eVar);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str2 = botInlineResult.content.url;
                            String httpUrlExtension = ImageLoader.getHttpUrlExtension(str2, null);
                            if (TextUtils.isEmpty(httpUrlExtension)) {
                                g10 = FileLoader.getExtensionByMimeType(tL_messages_preparedInlineMessage.result.content.mime_type);
                            } else {
                                g10 = v7.j.g(".", httpUrlExtension);
                            }
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str2) + g10);
                            if (!file.exists()) {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new ai.g3(11, fileArr, g1Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str2);
                                a2Var.setOnCancelListener(new fd(httpGetFileTask, 2));
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
                String str3 = (String) this.f8295f;
                String str4 = (String) this.h;
                TLRPC.User user = (TLRPC.User) this.f8296n;
                String str5 = (String) this.f8297r;
                ArrayList arrayList = launchActivity.f31109f0;
                ArrayList arrayList2 = launchActivity.f31105d0;
                ArrayList arrayList3 = launchActivity.E0;
                TLObject tLObject3 = this.f8293b;
                if (tLObject3 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject3;
                    int i12 = this.f8294c;
                    MessagesController.getInstance(i12).putUsers(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str3 != null) {
                        LaunchActivity.C0(launchActivity, launchActivity.O, tL_attachMenuBot, str3, false);
                        return;
                    }
                    org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) hg.c.g(1, arrayList2);
                    if (AndroidUtilities.isTablet() && !(m2Var instanceof wn) && !arrayList.isEmpty()) {
                        m2Var = (org.telegram.ui.ActionBar.m2) hg.c.g(1, arrayList);
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
                        qyVar = new qy(bundle);
                        qyVar.C2 = new z90(launchActivity, user, str5, i12);
                    } else {
                        qyVar = null;
                    }
                    if (!tL_attachMenuBot.inactive) {
                        if (qyVar != null) {
                            if (m2Var != null) {
                                m2Var.dismissCurrentDialog();
                            }
                            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                if (((Dialog) arrayList3.get(i13)).isShowing()) {
                                    ((Dialog) arrayList3.get(i13)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.p0(qyVar);
                            return;
                        } else if (m2Var instanceof wn) {
                            wn wnVar = (wn) m2Var;
                            if (wnVar.i() != null) {
                                tLObject = wnVar.i();
                            } else {
                                tLObject = wnVar.e;
                            }
                            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject)) {
                                a02 = xc.a0(m2Var);
                                i10 = R.string.BotAlreadyAddedToAttachMenu;
                            } else {
                                wnVar.W9(user.f18482id, str5, false);
                                return;
                            }
                        } else {
                            a02 = xc.a0(m2Var);
                            i10 = R.string.BotAlreadyAddedToAttachMenu;
                        }
                    } else {
                        w6 w6Var = new w6(launchActivity);
                        w6Var.setColor(h6.w0(null, h6.f19152ia, false));
                        w6Var.setBackgroundColor(h6.w0(null, h6.L5, false));
                        w6Var.setAttachBot(tL_attachMenuBot);
                        ej1.a(launchActivity, new uq(launchActivity, i12, this.d, qyVar, m2Var, user, str5), null);
                        return;
                    }
                } else {
                    a02 = xc.a0((org.telegram.ui.ActionBar.m2) hg.c.g(1, arrayList2));
                    i10 = R.string.BotCantAddToAttachMenu;
                }
                ok.p(i10, a02, null);
                return;
        }
    }

    public e1(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.e = launchActivity;
        this.f8293b = tLObject;
        this.f8294c = i10;
        this.f8295f = str;
        this.h = str2;
        this.f8296n = user;
        this.f8297r = str3;
        this.d = j3;
    }
}
