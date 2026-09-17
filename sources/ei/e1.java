package ei;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import ci.id;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.u6;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import org.telegram.ui.fa0;
import org.telegram.ui.lj1;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.wy;
public final class e1 implements Runnable {
    public final int f8310a = 0;
    public final TLObject f8311b;
    public final int f8312c;
    public final long d;
    public final Object e;
    public final Object f8313f;
    public final Object h;
    public final Object f8314n;
    public final Object f8315r;

    public e1(TLObject tLObject, int i10, org.telegram.ui.ActionBar.c2 c2Var, Context context, long j3, f6 f6Var, org.telegram.ui.web.t tVar, org.telegram.tgnet.e eVar) {
        this.f8311b = tLObject;
        this.f8312c = i10;
        this.e = c2Var;
        this.f8313f = context;
        this.d = j3;
        this.h = f6Var;
        this.f8314n = tVar;
        this.f8315r = eVar;
    }

    @Override
    public final void run() {
        String i10;
        vc a02;
        int i11;
        wy wyVar;
        TLObject tLObject;
        String[] split;
        switch (this.f8310a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.e;
                Context context = (Context) this.f8313f;
                f6 f6Var = (f6) this.h;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.f8314n;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f8315r;
                TLObject tLObject2 = this.f8311b;
                if (tLObject2 instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject2;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z10 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i12 = this.f8312c;
                    long j3 = this.d;
                    if (z10) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str = tL_botInlineMessageMediaWebPage.url;
                            f1 f1Var = new f1(c2Var, context, i12, j3, tL_messages_preparedInlineMessage, f6Var, tVar, eVar);
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            int[] iArr = {ConnectionsManager.getInstance(i12).sendRequestTyped(getwebpagepreview, new Object(), new h1(iArr, f1Var, notificationCenterDelegateArr, i12, 0))};
                            c2Var.setOnCancelListener(new id(new ai.s1(iArr, i12, notificationCenterDelegateArr, 9), 1));
                            return;
                        }
                    }
                    File[] fileArr = new File[1];
                    g1 g1Var = new g1(c2Var, context, i12, j3, tL_messages_preparedInlineMessage, fileArr, f6Var, tVar, eVar);
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
                                i10 = p6.i(".", httpUrlExtension);
                            }
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str2) + i10);
                            if (!file.exists()) {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new ci.m2(10, fileArr, g1Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str2);
                                c2Var.setOnCancelListener(new id(httpGetFileTask, 2));
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
                final LaunchActivity launchActivity = (LaunchActivity) this.e;
                String str3 = (String) this.f8313f;
                String str4 = (String) this.h;
                final TLRPC.User user = (TLRPC.User) this.f8314n;
                final String str5 = (String) this.f8315r;
                ArrayList arrayList = launchActivity.f30838f0;
                ArrayList arrayList2 = launchActivity.f30834d0;
                ArrayList arrayList3 = launchActivity.E0;
                TLObject tLObject3 = this.f8311b;
                if (tLObject3 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject3;
                    final int i13 = this.f8312c;
                    MessagesController.getInstance(i13).putUsers(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str3 != null) {
                        LaunchActivity.C0(launchActivity, launchActivity.O, tL_attachMenuBot, str3, false);
                        return;
                    }
                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) hg.k0.h(1, arrayList2);
                    if (AndroidUtilities.isTablet() && !(o2Var instanceof bo) && !arrayList.isEmpty()) {
                        o2Var = (org.telegram.ui.ActionBar.o2) hg.k0.h(1, arrayList);
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
                        wyVar = new wy(bundle);
                        wyVar.C2 = new fa0(launchActivity, user, str5, i13);
                    } else {
                        wyVar = null;
                    }
                    if (!tL_attachMenuBot.inactive) {
                        if (wyVar != null) {
                            if (o2Var != null) {
                                o2Var.dismissCurrentDialog();
                            }
                            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                if (((Dialog) arrayList3.get(i14)).isShowing()) {
                                    ((Dialog) arrayList3.get(i14)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.p0(wyVar);
                            return;
                        } else if (o2Var instanceof bo) {
                            bo boVar = (bo) o2Var;
                            if (boVar.i() != null) {
                                tLObject = boVar.i();
                            } else {
                                tLObject = boVar.e;
                            }
                            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject)) {
                                a02 = vc.a0(o2Var);
                                i11 = R.string.BotAlreadyAddedToAttachMenu;
                            } else {
                                boVar.W9(user.f18268id, str5, false);
                                return;
                            }
                        } else {
                            a02 = vc.a0(o2Var);
                            i11 = R.string.BotAlreadyAddedToAttachMenu;
                        }
                    } else {
                        u6 u6Var = new u6(launchActivity);
                        u6Var.setColor(j6.w0(null, j6.f18956ia, false));
                        u6Var.setBackgroundColor(j6.w0(null, j6.L5, false));
                        u6Var.setAttachBot(tL_attachMenuBot);
                        final long j10 = this.d;
                        final wy wyVar2 = wyVar;
                        final org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        lj1.a(launchActivity, new e2.h() {
                            @Override
                            public final void accept(Object obj) {
                                Boolean bool = (Boolean) obj;
                                Pattern pattern = LaunchActivity.B1;
                                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                int i15 = i13;
                                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i15).getInputUser(j10);
                                tL_messages_toggleBotInAttachMenu.enabled = true;
                                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                                ConnectionsManager.getInstance(i15).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.ii(LaunchActivity.this, i15, wyVar2, o2Var2, user, str5), 66);
                            }
                        }, null);
                        return;
                    }
                } else {
                    a02 = vc.a0((org.telegram.ui.ActionBar.o2) hg.k0.h(1, arrayList2));
                    i11 = R.string.BotCantAddToAttachMenu;
                }
                org.telegram.messenger.w1.p(i11, a02, null);
                return;
        }
    }

    public e1(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.e = launchActivity;
        this.f8311b = tLObject;
        this.f8312c = i10;
        this.f8313f = str;
        this.h = str2;
        this.f8314n = user;
        this.f8315r = str3;
        this.d = j3;
    }
}
