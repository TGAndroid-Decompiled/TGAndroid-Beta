package mh;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kh.pc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.q6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dy;
import org.telegram.ui.fi1;
import org.telegram.ui.i90;
import org.telegram.ui.qn;
import org.telegram.ui.web.HttpGetFileTask;
public final class b1 implements Runnable {
    public final int f17708a = 0;
    public final TLObject f17709b;
    public final int f17710c;
    public final long d;
    public final Object f17711e;
    public final Object f17712f;
    public final Object h;
    public final Object f17713n;
    public final Object f17714r;

    public b1(TLObject tLObject, int i9, org.telegram.ui.ActionBar.c2 c2Var, Context context, long j10, b6 b6Var, org.telegram.ui.web.t tVar, bg.y0 y0Var) {
        this.f17709b = tLObject;
        this.f17710c = i9;
        this.f17711e = c2Var;
        this.f17712f = context;
        this.d = j10;
        this.h = b6Var;
        this.f17713n = tVar;
        this.f17714r = y0Var;
    }

    @Override
    public final void run() {
        String d;
        oc a02;
        int i9;
        dy dyVar;
        TLObject tLObject;
        String[] split;
        switch (this.f17708a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f17711e;
                Context context = (Context) this.f17712f;
                b6 b6Var = (b6) this.h;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.f17713n;
                bg.y0 y0Var = (bg.y0) this.f17714r;
                TLObject tLObject2 = this.f17709b;
                if (tLObject2 instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject2;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z10 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i10 = this.f17710c;
                    long j10 = this.d;
                    if (z10) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str = tL_botInlineMessageMediaWebPage.url;
                            c1 c1Var = new c1(c2Var, context, i10, j10, tL_messages_preparedInlineMessage, b6Var, tVar, y0Var);
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            int[] iArr = {ConnectionsManager.getInstance(i10).sendRequestTyped(getwebpagepreview, new Object(), new gh.j0(iArr, c1Var, notificationCenterDelegateArr, i10, 1))};
                            c2Var.setOnCancelListener(new pc(new d5.i(iArr, i10, notificationCenterDelegateArr, 16), 1));
                            return;
                        }
                    }
                    File[] fileArr = new File[1];
                    d1 d1Var = new d1(c2Var, context, i10, j10, tL_messages_preparedInlineMessage, fileArr, b6Var, tVar, y0Var);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str2 = botInlineResult.content.url;
                            String httpUrlExtension = ImageLoader.getHttpUrlExtension(str2, null);
                            if (TextUtils.isEmpty(httpUrlExtension)) {
                                d = FileLoader.getExtensionByMimeType(tL_messages_preparedInlineMessage.result.content.mime_type);
                            } else {
                                d = ta.b.d(".", httpUrlExtension);
                            }
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str2) + d);
                            if (!file.exists()) {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new fh.f1(19, fileArr, d1Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str2);
                                c2Var.setOnCancelListener(new pc(httpGetFileTask, 2));
                                return;
                            }
                            d1Var.run();
                            return;
                        }
                    }
                    d1Var.run();
                    return;
                }
                y0Var.run("MESSAGE_EXPIRED", null);
                return;
            default:
                final LaunchActivity launchActivity = (LaunchActivity) this.f17711e;
                String str3 = (String) this.f17712f;
                String str4 = (String) this.h;
                final TLRPC.User user = (TLRPC.User) this.f17713n;
                final String str5 = (String) this.f17714r;
                ArrayList arrayList = launchActivity.f35498b0;
                ArrayList arrayList2 = launchActivity.Z;
                ArrayList arrayList3 = launchActivity.A0;
                TLObject tLObject3 = this.f17709b;
                if (tLObject3 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject3;
                    final int i11 = this.f17710c;
                    MessagesController.getInstance(i11).putUsers(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str3 != null) {
                        LaunchActivity.C0(launchActivity, launchActivity.K, tL_attachMenuBot, str3, false);
                        return;
                    }
                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList2);
                    if (AndroidUtilities.isTablet() && !(o2Var instanceof qn) && !arrayList.isEmpty()) {
                        o2Var = (org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList);
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
                        dyVar = new dy(bundle);
                        dyVar.f37752y2 = new i90(launchActivity, user, str5, i11);
                    } else {
                        dyVar = null;
                    }
                    if (!tL_attachMenuBot.inactive) {
                        if (dyVar != null) {
                            if (o2Var != null) {
                                o2Var.dismissCurrentDialog();
                            }
                            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                if (((Dialog) arrayList3.get(i12)).isShowing()) {
                                    ((Dialog) arrayList3.get(i12)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.p0(dyVar);
                            return;
                        } else if (o2Var instanceof qn) {
                            qn qnVar = (qn) o2Var;
                            if (qnVar.i() != null) {
                                tLObject = qnVar.i();
                            } else {
                                tLObject = qnVar.f41890e;
                            }
                            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject)) {
                                a02 = oc.a0(o2Var);
                                i9 = R.string.BotAlreadyAddedToAttachMenu;
                            } else {
                                qnVar.W9(user.f22527id, str5, false);
                                return;
                            }
                        } else {
                            a02 = oc.a0(o2Var);
                            i9 = R.string.BotAlreadyAddedToAttachMenu;
                        }
                    } else {
                        q6 q6Var = new q6(launchActivity);
                        q6Var.setColor(f6.w0(null, f6.f23095ia, false));
                        q6Var.setBackgroundColor(f6.w0(null, f6.L5, false));
                        q6Var.setAttachBot(tL_attachMenuBot);
                        final long j11 = this.d;
                        final dy dyVar2 = dyVar;
                        final org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        fi1.a(launchActivity, new d5.d() {
                            @Override
                            public final void accept(Object obj) {
                                Boolean bool = (Boolean) obj;
                                Pattern pattern = LaunchActivity.f35493x1;
                                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                int i13 = i11;
                                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i13).getInputUser(j11);
                                tL_messages_toggleBotInAttachMenu.enabled = true;
                                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.zh(LaunchActivity.this, i13, dyVar2, o2Var2, user, str5), 66);
                            }
                        }, null);
                        return;
                    }
                } else {
                    a02 = oc.a0((org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList2));
                    i9 = R.string.BotCantAddToAttachMenu;
                }
                ll.p(i9, a02, null);
                return;
        }
    }

    public b1(LaunchActivity launchActivity, TLObject tLObject, int i9, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.f17711e = launchActivity;
        this.f17709b = tLObject;
        this.f17710c = i9;
        this.f17712f = str;
        this.h = str2;
        this.f17713n = user;
        this.f17714r = str3;
        this.d = j10;
    }
}
