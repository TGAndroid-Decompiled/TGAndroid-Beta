package fi;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import di.dd;
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
import org.telegram.messenger.yh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.z6;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dr;
import org.telegram.ui.fo;
import org.telegram.ui.ia0;
import org.telegram.ui.vj1;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.yy;
public final class d1 implements Runnable {
    public final int f9222a = 0;
    public final TLObject f9223b;
    public final int f9224c;
    public final long d;
    public final Object e;
    public final Object f9225f;
    public final Object h;
    public final Object f9226n;
    public final Object f9227r;

    public d1(TLObject tLObject, int i10, org.telegram.ui.ActionBar.a2 a2Var, Context context, long j10, c6 c6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f9223b = tLObject;
        this.f9224c = i10;
        this.e = a2Var;
        this.f9225f = context;
        this.d = j10;
        this.h = c6Var;
        this.f9226n = sVar;
        this.f9227r = eVar;
    }

    @Override
    public final void run() {
        String h;
        zc a02;
        int i10;
        yy yyVar;
        TLObject tLObject;
        String[] split;
        switch (this.f9222a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.e;
                Context context = (Context) this.f9225f;
                c6 c6Var = (c6) this.h;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.f9226n;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f9227r;
                TLObject tLObject2 = this.f9223b;
                if (tLObject2 instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject2;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z10 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i11 = this.f9224c;
                    long j10 = this.d;
                    if (z10) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str = tL_botInlineMessageMediaWebPage.url;
                            e1 e1Var = new e1(a2Var, context, i11, j10, tL_messages_preparedInlineMessage, c6Var, sVar, eVar);
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            int[] iArr = {ConnectionsManager.getInstance(i11).sendRequestTyped(getwebpagepreview, new Object(), new g1(iArr, e1Var, notificationCenterDelegateArr, i11, 0))};
                            a2Var.setOnCancelListener(new dd(new ah.o(iArr, i11, notificationCenterDelegateArr, 10), 1));
                            return;
                        }
                    }
                    File[] fileArr = new File[1];
                    f1 f1Var = new f1(a2Var, context, i11, j10, tL_messages_preparedInlineMessage, fileArr, c6Var, sVar, eVar);
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
                                h = t8.b.h(".", httpUrlExtension);
                            }
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str2) + h);
                            if (!file.exists()) {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new bi.v2(11, fileArr, f1Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str2);
                                a2Var.setOnCancelListener(new dd(httpGetFileTask, 2));
                                return;
                            }
                            f1Var.run();
                            return;
                        }
                    }
                    f1Var.run();
                    return;
                }
                eVar.run("MESSAGE_EXPIRED", null);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.e;
                String str3 = (String) this.f9225f;
                String str4 = (String) this.h;
                TLRPC.User user = (TLRPC.User) this.f9226n;
                String str5 = (String) this.f9227r;
                ArrayList arrayList = launchActivity.f32113f0;
                ArrayList arrayList2 = launchActivity.f32109d0;
                ArrayList arrayList3 = launchActivity.E0;
                TLObject tLObject3 = this.f9223b;
                if (tLObject3 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject3;
                    int i12 = this.f9224c;
                    MessagesController.getInstance(i12).putUsers(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str3 != null) {
                        LaunchActivity.C0(launchActivity, launchActivity.O, tL_attachMenuBot, str3, false);
                        return;
                    }
                    org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) i2.d.g(1, arrayList2);
                    if (AndroidUtilities.isTablet() && !(m2Var instanceof fo) && !arrayList.isEmpty()) {
                        m2Var = (org.telegram.ui.ActionBar.m2) i2.d.g(1, arrayList);
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
                        yyVar = new yy(bundle);
                        yyVar.C2 = new ia0(launchActivity, user, str5, i12);
                    } else {
                        yyVar = null;
                    }
                    if (!tL_attachMenuBot.inactive) {
                        if (yyVar != null) {
                            if (m2Var != null) {
                                m2Var.dismissCurrentDialog();
                            }
                            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                if (((Dialog) arrayList3.get(i13)).isShowing()) {
                                    ((Dialog) arrayList3.get(i13)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.p0(yyVar);
                            return;
                        } else if (m2Var instanceof fo) {
                            fo foVar = (fo) m2Var;
                            if (foVar.i() != null) {
                                tLObject = foVar.i();
                            } else {
                                tLObject = foVar.e;
                            }
                            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject)) {
                                a02 = zc.a0(m2Var);
                                i10 = R.string.BotAlreadyAddedToAttachMenu;
                            } else {
                                foVar.ba(user.f19363id, str5, false);
                                return;
                            }
                        } else {
                            a02 = zc.a0(m2Var);
                            i10 = R.string.BotAlreadyAddedToAttachMenu;
                        }
                    } else {
                        z6 z6Var = new z6(launchActivity);
                        z6Var.setColor(g6.x0(null, g6.ia, false));
                        z6Var.setBackgroundColor(g6.x0(null, g6.L5, false));
                        z6Var.setAttachBot(tL_attachMenuBot);
                        vj1.a(launchActivity, new dr(launchActivity, i12, this.d, yyVar, m2Var, user, str5), null);
                        return;
                    }
                } else {
                    a02 = zc.a0((org.telegram.ui.ActionBar.m2) i2.d.g(1, arrayList2));
                    i10 = R.string.BotCantAddToAttachMenu;
                }
                yh.p(i10, a02, null);
                return;
        }
    }

    public d1(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.e = launchActivity;
        this.f9223b = tLObject;
        this.f9224c = i10;
        this.f9225f = str;
        this.h = str2;
        this.f9226n = user;
        this.f9227r = str3;
        this.d = j10;
    }
}
