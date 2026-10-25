package hi;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import fi.lc;
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
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.z6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cy;
import org.telegram.ui.ki1;
import org.telegram.ui.pq;
import org.telegram.ui.t80;
import org.telegram.ui.un;
import org.telegram.ui.web.HttpGetFileTask;
public final class i1 implements Runnable {
    public final int f13025a = 0;
    public final TLObject f13026b;
    public final int f13027c;
    public final long d;
    public final Object e;
    public final Object f13028f;
    public final Object h;
    public final Object f13029n;
    public final Object f13030r;

    public i1(TLObject tLObject, int i10, org.telegram.ui.ActionBar.e2 e2Var, Context context, long j10, u6 u6Var, org.telegram.ui.web.t tVar, bi.t0 t0Var) {
        this.f13026b = tLObject;
        this.f13027c = i10;
        this.e = e2Var;
        this.f13028f = context;
        this.d = j10;
        this.h = u6Var;
        this.f13029n = tVar;
        this.f13030r = t0Var;
    }

    @Override
    public final void run() {
        String j10;
        wc b02;
        int i10;
        cy cyVar;
        TLObject tLObject;
        String[] split;
        switch (this.f13025a) {
            case 0:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.e;
                Context context = (Context) this.f13028f;
                u6 u6Var = (u6) this.h;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.f13029n;
                bi.t0 t0Var = (bi.t0) this.f13030r;
                TLObject tLObject2 = this.f13026b;
                if (tLObject2 instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject2;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z10 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i11 = this.f13027c;
                    long j11 = this.d;
                    if (z10) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str = tL_botInlineMessageMediaWebPage.url;
                            j1 j1Var = new j1(e2Var, context, i11, j11, tL_messages_preparedInlineMessage, u6Var, tVar, t0Var);
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            int[] iArr = {ConnectionsManager.getInstance(i11).sendRequestTyped(getwebpagepreview, new Object(), new bi.v0(iArr, j1Var, notificationCenterDelegateArr, i11, 2))};
                            e2Var.setOnCancelListener(new lc(new ai.h0(iArr, i11, notificationCenterDelegateArr, 15), 1));
                            return;
                        }
                    }
                    File[] fileArr = new File[1];
                    k1 k1Var = new k1(e2Var, context, i11, j11, tL_messages_preparedInlineMessage, fileArr, u6Var, tVar, t0Var);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str2 = botInlineResult.content.url;
                            String httpUrlExtension = ImageLoader.getHttpUrlExtension(str2, null);
                            if (TextUtils.isEmpty(httpUrlExtension)) {
                                j10 = FileLoader.getExtensionByMimeType(tL_messages_preparedInlineMessage.result.content.mime_type);
                            } else {
                                j10 = b10.j(".", httpUrlExtension);
                            }
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str2) + j10);
                            if (!file.exists()) {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new ai.n1(19, fileArr, k1Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str2);
                                e2Var.setOnCancelListener(new lc(httpGetFileTask, 2));
                                return;
                            }
                            k1Var.run();
                            return;
                        }
                    }
                    k1Var.run();
                    return;
                }
                t0Var.run("MESSAGE_EXPIRED", null);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.e;
                String str3 = (String) this.f13028f;
                String str4 = (String) this.h;
                TLRPC.User user = (TLRPC.User) this.f13029n;
                String str5 = (String) this.f13030r;
                ArrayList arrayList = launchActivity.f35530f0;
                ArrayList arrayList2 = launchActivity.f35526d0;
                ArrayList arrayList3 = launchActivity.E0;
                TLObject tLObject3 = this.f13026b;
                if (tLObject3 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject3;
                    int i12 = this.f13027c;
                    MessagesController.getInstance(i12).putUsers(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str3 != null) {
                        LaunchActivity.H0(launchActivity, launchActivity.O, tL_attachMenuBot, str3, false);
                        return;
                    }
                    org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) ic.a.g(1, arrayList2);
                    if (AndroidUtilities.isTablet() && !(r2Var instanceof un) && !arrayList.isEmpty()) {
                        r2Var = (org.telegram.ui.ActionBar.r2) ic.a.g(1, arrayList);
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
                        cyVar.C2 = new t80(launchActivity, user, str5, i12);
                    } else {
                        cyVar = null;
                    }
                    if (!tL_attachMenuBot.inactive) {
                        if (cyVar != null) {
                            if (r2Var != null) {
                                r2Var.dismissCurrentDialog();
                            }
                            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                if (((Dialog) arrayList3.get(i13)).isShowing()) {
                                    ((Dialog) arrayList3.get(i13)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.u0(cyVar);
                            return;
                        } else if (r2Var instanceof un) {
                            un unVar = (un) r2Var;
                            if (unVar.i() != null) {
                                tLObject = unVar.i();
                            } else {
                                tLObject = unVar.e;
                            }
                            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject)) {
                                b02 = wc.b0(r2Var);
                                i10 = R.string.BotAlreadyAddedToAttachMenu;
                            } else {
                                unVar.ga(user.f22174id, str5, false);
                                return;
                            }
                        } else {
                            b02 = wc.b0(r2Var);
                            i10 = R.string.BotAlreadyAddedToAttachMenu;
                        }
                    } else {
                        z6 z6Var = new z6(launchActivity);
                        z6Var.setColor(y6.x0(null, y6.ia, false));
                        f7.i(y6.L5, z6Var, null);
                        z6Var.setAttachBot(tL_attachMenuBot);
                        ki1.a(launchActivity, new pq(launchActivity, i12, this.d, cyVar, r2Var, user, str5), null);
                        return;
                    }
                } else {
                    b02 = wc.b0((org.telegram.ui.ActionBar.r2) ic.a.g(1, arrayList2));
                    i10 = R.string.BotCantAddToAttachMenu;
                }
                vh.n(i10, b02, null);
                return;
        }
    }

    public i1(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.e = launchActivity;
        this.f13026b = tLObject;
        this.f13027c = i10;
        this.f13028f = str;
        this.h = str2;
        this.f13029n = user;
        this.f13030r = str3;
        this.d = j10;
    }
}
