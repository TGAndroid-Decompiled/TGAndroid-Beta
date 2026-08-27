package org.telegram.messenger;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dq;
import org.telegram.ui.gy;
import org.telegram.ui.ha0;
import org.telegram.ui.xs;

public final class m8 implements Runnable {

    public final int f20949a = 0;

    public final boolean f20950b;

    public final int f20951c;
    public final long d;

    public final Object f20952e;

    public final Object f20953f;
    public final Object h;

    public final Object f20954n;

    public final Object f20955r;

    public final Object f20956s;
    public final Object v;

    public final Object f20957w;

    public m8(MediaDataController mediaDataController, Timer.Task task, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i10, Timer timer, a0.h hVar2, a0.h hVar3, boolean z10, long j10) {
        this.f20952e = mediaDataController;
        this.f20953f = task;
        this.h = hVar;
        this.f20956s = atomicInteger;
        this.v = runnable;
        this.f20951c = i10;
        this.f20957w = timer;
        this.f20954n = hVar2;
        this.f20955r = hVar3;
        this.f20950b = z10;
        this.d = j10;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f20949a;
        Object obj = this.f20957w;
        Object obj2 = this.v;
        Object obj3 = this.f20956s;
        Object obj4 = this.f20955r;
        Object obj5 = this.f20954n;
        Object obj6 = this.h;
        Object obj7 = this.f20953f;
        Object obj8 = this.f20952e;
        switch (i10) {
            case 0:
                ((MediaDataController) obj8).lambda$loadReplyMessagesForMessages$177((Timer.Task) obj7, (a0.h) obj6, (AtomicInteger) obj3, (Runnable) obj2, this.f20951c, (Timer) obj, (a0.h) obj5, (a0.h) obj4, this.f20950b, this.d);
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                String str = (String) obj7;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = (TLRPC.TL_chatAdminRights) obj6;
                String str2 = (String) obj5;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                gy gyVar = (gy) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str3 = (String) obj;
                Pattern pattern = LaunchActivity.f35496x1;
                if (str != null) {
                    String[] strArrSplit = str.split("\\+| ");
                    tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
                    for (String str4 : strArrSplit) {
                        str4.getClass();
                        switch (str4) {
                            case "ban_users":
                            case "restrict_members":
                                tL_chatAdminRights.ban_users = true;
                                break;
                            case "anonymous":
                                tL_chatAdminRights.anonymous = true;
                                break;
                            case "change_info":
                                tL_chatAdminRights.change_info = true;
                                break;
                            case "delete_messages":
                                tL_chatAdminRights.delete_messages = true;
                                break;
                            case "edit_messages":
                                tL_chatAdminRights.edit_messages = true;
                                break;
                            case "manage_call":
                            case "manage_video_chats":
                                tL_chatAdminRights.manage_call = true;
                                break;
                            case "manage_chat":
                            case "other":
                                tL_chatAdminRights.other = true;
                                break;
                            case "manage_topics":
                            case "manage_topic":
                                tL_chatAdminRights.manage_topics = true;
                                break;
                            case "promote_members":
                            case "add_admins":
                                tL_chatAdminRights.add_admins = true;
                                break;
                            case "invite_users":
                                tL_chatAdminRights.invite_users = true;
                                break;
                            case "post_messages":
                                tL_chatAdminRights.post_messages = true;
                                break;
                            case "pin_messages":
                                tL_chatAdminRights.pin_messages = true;
                                break;
                        }
                    }
                } else {
                    tL_chatAdminRights = null;
                }
                if (tL_chatAdminRights == null && tL_chatAdminRights2 == null) {
                    tL_chatAdminRights2 = null;
                } else if (tL_chatAdminRights != null) {
                    if (tL_chatAdminRights2 == null) {
                        tL_chatAdminRights2 = tL_chatAdminRights;
                    } else {
                        tL_chatAdminRights2.change_info = tL_chatAdminRights.change_info || tL_chatAdminRights2.change_info;
                        tL_chatAdminRights2.post_messages = tL_chatAdminRights.post_messages || tL_chatAdminRights2.post_messages;
                        tL_chatAdminRights2.edit_messages = tL_chatAdminRights.edit_messages || tL_chatAdminRights2.edit_messages;
                        tL_chatAdminRights2.add_admins = tL_chatAdminRights.add_admins || tL_chatAdminRights2.add_admins;
                        tL_chatAdminRights2.delete_messages = tL_chatAdminRights.delete_messages || tL_chatAdminRights2.delete_messages;
                        tL_chatAdminRights2.ban_users = tL_chatAdminRights.ban_users || tL_chatAdminRights2.ban_users;
                        tL_chatAdminRights2.invite_users = tL_chatAdminRights.invite_users || tL_chatAdminRights2.invite_users;
                        tL_chatAdminRights2.pin_messages = tL_chatAdminRights.pin_messages || tL_chatAdminRights2.pin_messages;
                        tL_chatAdminRights2.manage_call = tL_chatAdminRights.manage_call || tL_chatAdminRights2.manage_call;
                        tL_chatAdminRights2.anonymous = tL_chatAdminRights.anonymous || tL_chatAdminRights2.anonymous;
                        tL_chatAdminRights2.other = tL_chatAdminRights.other || tL_chatAdminRights2.other;
                    }
                }
                boolean z10 = this.f20950b;
                int i11 = this.f20951c;
                if (z10 && tL_chatAdminRights == null && !TextUtils.isEmpty(str2)) {
                    MessagesController.getInstance(launchActivity.K).addUserToChat(chat.f22380id, user, 0, str2, gyVar, true, new xs(launchActivity, i11, chat, gyVar, 2), null);
                } else {
                    dq dqVar = new dq(user.f22527id, -this.d, tL_chatAdminRights2, null, null, str3, 2, true, !z10, str2);
                    dqVar.T0 = new ha0(gyVar, i11);
                    ((ActionBarLayout) launchActivity.O()).Q(dqVar, false);
                }
                break;
        }
    }

    public m8(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z10, String str2, int i10, TLRPC.Chat chat, gy gyVar, TLRPC.User user, long j10, String str3) {
        this.f20952e = launchActivity;
        this.f20953f = str;
        this.h = tL_chatAdminRights;
        this.f20950b = z10;
        this.f20954n = str2;
        this.f20951c = i10;
        this.f20955r = chat;
        this.f20956s = gyVar;
        this.v = user;
        this.d = j10;
        this.f20957w = str3;
    }
}
