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
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.x6;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
import org.telegram.ui.hi1;
import org.telegram.ui.nq;
import org.telegram.ui.sn;
import org.telegram.ui.u80;
import org.telegram.ui.web.HttpGetFileTask;
public final class b1 implements Runnable {
    public final int f11108a = 0;
    public final TLObject f11109b;
    public final int f11110c;
    public final long d;
    public final Object e;
    public final Object f11111f;
    public final Object h;
    public final Object f11112n;
    public final Object f11113r;

    public b1(TLObject tLObject, int i10, org.telegram.ui.ActionBar.c2 c2Var, Context context, long j10, g6 g6Var, org.telegram.ui.web.t tVar, ai.s0 s0Var) {
        this.f11109b = tLObject;
        this.f11110c = i10;
        this.e = c2Var;
        this.f11111f = context;
        this.d = j10;
        this.h = g6Var;
        this.f11112n = tVar;
        this.f11113r = s0Var;
    }

    @Override
    public final void run() {
        String h;
        xc a02;
        int i10;
        ey eyVar;
        TLObject tLObject;
        String[] split;
        switch (this.f11108a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.e;
                Context context = (Context) this.f11111f;
                g6 g6Var = (g6) this.h;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.f11112n;
                ai.s0 s0Var = (ai.s0) this.f11113r;
                TLObject tLObject2 = this.f11109b;
                if (tLObject2 instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject2;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z10 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i11 = this.f11110c;
                    long j10 = this.d;
                    if (z10) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str = tL_botInlineMessageMediaWebPage.url;
                            c1 c1Var = new c1(c2Var, context, i11, j10, tL_messages_preparedInlineMessage, g6Var, tVar, s0Var);
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            int[] iArr = {ConnectionsManager.getInstance(i11).sendRequestTyped(getwebpagepreview, new Object(), new ai.u0(iArr, c1Var, notificationCenterDelegateArr, i11, 2))};
                            c2Var.setOnCancelListener(new pc(new ah.o(iArr, i11, notificationCenterDelegateArr, 14), 1));
                            return;
                        }
                    }
                    File[] fileArr = new File[1];
                    d1 d1Var = new d1(c2Var, context, i11, j10, tL_messages_preparedInlineMessage, fileArr, g6Var, tVar, s0Var);
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
                                h = si.o0.h(".", httpUrlExtension);
                            }
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str2) + h);
                            if (!file.exists()) {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new ai.o2(17, fileArr, d1Var), null);
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
                s0Var.run("MESSAGE_EXPIRED", null);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.e;
                String str3 = (String) this.f11111f;
                String str4 = (String) this.h;
                TLRPC.User user = (TLRPC.User) this.f11112n;
                String str5 = (String) this.f11113r;
                ArrayList arrayList = launchActivity.f33467f0;
                ArrayList arrayList2 = launchActivity.f33463d0;
                ArrayList arrayList3 = launchActivity.E0;
                TLObject tLObject3 = this.f11109b;
                if (tLObject3 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject3;
                    int i12 = this.f11110c;
                    MessagesController.getInstance(i12).putUsers(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str3 != null) {
                        LaunchActivity.H0(launchActivity, launchActivity.O, tL_attachMenuBot, str3, false);
                        return;
                    }
                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) i2.o1.i(1, arrayList2);
                    if (AndroidUtilities.isTablet() && !(o2Var instanceof sn) && !arrayList.isEmpty()) {
                        o2Var = (org.telegram.ui.ActionBar.o2) i2.o1.i(1, arrayList);
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
                        eyVar = new ey(bundle);
                        eyVar.C2 = new u80(launchActivity, user, str5, i12);
                    } else {
                        eyVar = null;
                    }
                    if (!tL_attachMenuBot.inactive) {
                        if (eyVar != null) {
                            if (o2Var != null) {
                                o2Var.dismissCurrentDialog();
                            }
                            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                if (((Dialog) arrayList3.get(i13)).isShowing()) {
                                    ((Dialog) arrayList3.get(i13)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.u0(eyVar);
                            return;
                        } else if (o2Var instanceof sn) {
                            sn snVar = (sn) o2Var;
                            if (snVar.i() != null) {
                                tLObject = snVar.i();
                            } else {
                                tLObject = snVar.e;
                            }
                            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject)) {
                                a02 = xc.a0(o2Var);
                                i10 = R.string.BotAlreadyAddedToAttachMenu;
                            } else {
                                snVar.ba(user.f20490id, str5, false);
                                return;
                            }
                        } else {
                            a02 = xc.a0(o2Var);
                            i10 = R.string.BotAlreadyAddedToAttachMenu;
                        }
                    } else {
                        x6 x6Var = new x6(launchActivity);
                        x6Var.setColor(k6.x0(null, k6.ia, false));
                        r6.i(k6.L5, x6Var, null);
                        x6Var.setAttachBot(tL_attachMenuBot);
                        hi1.a(launchActivity, new nq(launchActivity, i12, this.d, eyVar, o2Var, user, str5), null);
                        return;
                    }
                } else {
                    a02 = xc.a0((org.telegram.ui.ActionBar.o2) i2.o1.i(1, arrayList2));
                    i10 = R.string.BotCantAddToAttachMenu;
                }
                sl.q(i10, a02, null);
                return;
        }
    }

    public b1(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.e = launchActivity;
        this.f11109b = tLObject;
        this.f11110c = i10;
        this.f11111f = str;
        this.h = str2;
        this.f11112n = user;
        this.f11113r = str3;
        this.d = j10;
    }
}
