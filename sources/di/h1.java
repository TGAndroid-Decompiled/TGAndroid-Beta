package di;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import bi.xe;
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
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.v6;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.da0;
import org.telegram.ui.eo;
import org.telegram.ui.qj1;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.wy;
public final class h1 implements Runnable {
    public final int f6658a = 0;
    public final TLObject f6659b;
    public final int f6660c;
    public final long d;
    public final Object e;
    public final Object f6661f;
    public final Object h;
    public final Object f6662n;
    public final Object f6663r;

    public h1(TLObject tLObject, int i10, org.telegram.ui.ActionBar.d2 d2Var, Context context, long j3, f6 f6Var, org.telegram.ui.web.t tVar, org.telegram.tgnet.g gVar) {
        this.f6659b = tLObject;
        this.f6660c = i10;
        this.e = d2Var;
        this.f6661f = context;
        this.d = j3;
        this.h = f6Var;
        this.f6662n = tVar;
        this.f6663r = gVar;
    }

    @Override
    public final void run() {
        String i10;
        wc a02;
        int i11;
        wy wyVar;
        TLObject tLObject;
        String[] split;
        switch (this.f6658a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.e;
                Context context = (Context) this.f6661f;
                f6 f6Var = (f6) this.h;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.f6662n;
                org.telegram.tgnet.g gVar = (org.telegram.tgnet.g) this.f6663r;
                TLObject tLObject2 = this.f6659b;
                if (tLObject2 instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject2;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z10 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i12 = this.f6660c;
                    long j3 = this.d;
                    if (z10) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str = tL_botInlineMessageMediaWebPage.url;
                            i1 i1Var = new i1(d2Var, context, i12, j3, tL_messages_preparedInlineMessage, f6Var, tVar, gVar);
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            int[] iArr = {ConnectionsManager.getInstance(i12).sendRequestTyped(getwebpagepreview, new Object(), new k1(iArr, i1Var, notificationCenterDelegateArr, i12, 0))};
                            d2Var.setOnCancelListener(new xe(new bi.g3(iArr, i12, notificationCenterDelegateArr, 5), 1));
                            return;
                        }
                    }
                    File[] fileArr = new File[1];
                    j1 j1Var = new j1(d2Var, context, i12, j3, tL_messages_preparedInlineMessage, fileArr, f6Var, tVar, gVar);
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
                                i10 = r6.i(".", httpUrlExtension);
                            }
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str2) + i10);
                            if (!file.exists()) {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new bi.y2(10, fileArr, j1Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str2);
                                d2Var.setOnCancelListener(new xe(httpGetFileTask, 2));
                                return;
                            }
                            j1Var.run();
                            return;
                        }
                    }
                    j1Var.run();
                    return;
                }
                gVar.run("MESSAGE_EXPIRED", null);
                return;
            default:
                final LaunchActivity launchActivity = (LaunchActivity) this.e;
                String str3 = (String) this.f6661f;
                String str4 = (String) this.h;
                final TLRPC.User user = (TLRPC.User) this.f6662n;
                final String str5 = (String) this.f6663r;
                ArrayList arrayList = launchActivity.f29937f0;
                ArrayList arrayList2 = launchActivity.f29933d0;
                ArrayList arrayList3 = launchActivity.E0;
                TLObject tLObject3 = this.f6659b;
                if (tLObject3 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject3;
                    final int i13 = this.f6660c;
                    MessagesController.getInstance(i13).putUsers(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str3 != null) {
                        LaunchActivity.C0(launchActivity, launchActivity.O, tL_attachMenuBot, str3, false);
                        return;
                    }
                    org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) hc.b.i(1, arrayList2);
                    if (AndroidUtilities.isTablet() && !(p2Var instanceof eo) && !arrayList.isEmpty()) {
                        p2Var = (org.telegram.ui.ActionBar.p2) hc.b.i(1, arrayList);
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
                        wyVar.C2 = new da0(launchActivity, user, str5, i13);
                    } else {
                        wyVar = null;
                    }
                    if (!tL_attachMenuBot.inactive) {
                        if (wyVar != null) {
                            if (p2Var != null) {
                                p2Var.dismissCurrentDialog();
                            }
                            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                if (((Dialog) arrayList3.get(i14)).isShowing()) {
                                    ((Dialog) arrayList3.get(i14)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.p0(wyVar);
                            return;
                        } else if (p2Var instanceof eo) {
                            eo eoVar = (eo) p2Var;
                            if (eoVar.i() != null) {
                                tLObject = eoVar.i();
                            } else {
                                tLObject = eoVar.e;
                            }
                            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject)) {
                                a02 = wc.a0(p2Var);
                                i11 = R.string.BotAlreadyAddedToAttachMenu;
                            } else {
                                eoVar.W9(user.f17342id, str5, false);
                                return;
                            }
                        } else {
                            a02 = wc.a0(p2Var);
                            i11 = R.string.BotAlreadyAddedToAttachMenu;
                        }
                    } else {
                        v6 v6Var = new v6(launchActivity);
                        v6Var.setColor(j6.w0(null, j6.f18021ia, false));
                        v6Var.setBackgroundColor(j6.w0(null, j6.L5, false));
                        v6Var.setAttachBot(tL_attachMenuBot);
                        final long j10 = this.d;
                        final wy wyVar2 = wyVar;
                        final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qj1.a(launchActivity, new e2.h() {
                            @Override
                            public final void accept(Object obj) {
                                Boolean bool = (Boolean) obj;
                                Pattern pattern = LaunchActivity.B1;
                                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                int i15 = i13;
                                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i15).getInputUser(j10);
                                tL_messages_toggleBotInAttachMenu.enabled = true;
                                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                                ConnectionsManager.getInstance(i15).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.qi(LaunchActivity.this, i15, wyVar2, p2Var2, user, str5), 66);
                            }
                        }, null);
                        return;
                    }
                } else {
                    a02 = wc.a0((org.telegram.ui.ActionBar.p2) hc.b.i(1, arrayList2));
                    i11 = R.string.BotCantAddToAttachMenu;
                }
                org.telegram.messenger.a2.p(i11, a02, null);
                return;
        }
    }

    public h1(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.e = launchActivity;
        this.f6659b = tLObject;
        this.f6660c = i10;
        this.f6661f = str;
        this.h = str2;
        this.f6662n = user;
        this.f6663r = str3;
        this.d = j3;
    }
}
