package org.telegram.messenger;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dq;
import org.telegram.ui.ey;
import org.telegram.ui.ia0;
public final class n8 implements Runnable {
    public final int f19089a = 0;
    public final boolean f19090b;
    public final int f19091c;
    public final long d;
    public final Object e;
    public final Object f19092f;
    public final Object h;
    public final Object f19093n;
    public final Object f19094r;
    public final Object f19095s;
    public final Object v;
    public final Object f19096w;

    public n8(MediaDataController mediaDataController, Timer.Task task, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i10, Timer timer, a0.h hVar2, a0.h hVar3, boolean z10, long j10) {
        this.e = mediaDataController;
        this.f19092f = task;
        this.h = hVar;
        this.f19095s = atomicInteger;
        this.v = runnable;
        this.f19091c = i10;
        this.f19096w = timer;
        this.f19093n = hVar2;
        this.f19094r = hVar3;
        this.f19090b = z10;
        this.d = j10;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        int i10 = this.f19089a;
        Object obj = this.f19096w;
        Object obj2 = this.v;
        Object obj3 = this.f19095s;
        Object obj4 = this.f19094r;
        Object obj5 = this.f19093n;
        Object obj6 = this.h;
        Object obj7 = this.f19092f;
        Object obj8 = this.e;
        switch (i10) {
            case 0:
                ((MediaDataController) obj8).lambda$loadReplyMessagesForMessages$177((Timer.Task) obj7, (a0.h) obj6, (AtomicInteger) obj3, (Runnable) obj2, this.f19091c, (Timer) obj, (a0.h) obj5, (a0.h) obj4, this.f19090b, this.d);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                String str = (String) obj7;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = (TLRPC.TL_chatAdminRights) obj6;
                String str2 = (String) obj5;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                ey eyVar = (ey) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str3 = (String) obj;
                Pattern pattern = LaunchActivity.D1;
                if (str != null) {
                    String[] split = str.split("\\+| ");
                    tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
                    for (String str4 : split) {
                        str4.getClass();
                        char c10 = 65535;
                        switch (str4.hashCode()) {
                            case -2110462504:
                                if (str4.equals("ban_users")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case -2095811475:
                                if (str4.equals("anonymous")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case -1654794275:
                                if (str4.equals("change_info")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                            case -1593320096:
                                if (str4.equals("delete_messages")) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                            case -939200543:
                                if (str4.equals("edit_messages")) {
                                    c10 = 4;
                                    break;
                                }
                                break;
                            case 22162680:
                                if (str4.equals("manage_call")) {
                                    c10 = 5;
                                    break;
                                }
                                break;
                            case 22169074:
                                if (str4.equals("manage_chat")) {
                                    c10 = 6;
                                    break;
                                }
                                break;
                            case 106069776:
                                if (str4.equals("other")) {
                                    c10 = 7;
                                    break;
                                }
                                break;
                            case 323243326:
                                if (str4.equals("manage_topics")) {
                                    c10 = '\b';
                                    break;
                                }
                                break;
                            case 449085338:
                                if (str4.equals("promote_members")) {
                                    c10 = '\t';
                                    break;
                                }
                                break;
                            case 632157522:
                                if (str4.equals("invite_users")) {
                                    c10 = '\n';
                                    break;
                                }
                                break;
                            case 703163861:
                                if (str4.equals("manage_topic")) {
                                    c10 = 11;
                                    break;
                                }
                                break;
                            case 758599179:
                                if (str4.equals("post_messages")) {
                                    c10 = '\f';
                                    break;
                                }
                                break;
                            case 1357805750:
                                if (str4.equals("pin_messages")) {
                                    c10 = '\r';
                                    break;
                                }
                                break;
                            case 1529816162:
                                if (str4.equals("add_admins")) {
                                    c10 = 14;
                                    break;
                                }
                                break;
                            case 1542893206:
                                if (str4.equals("restrict_members")) {
                                    c10 = 15;
                                    break;
                                }
                                break;
                            case 1641337725:
                                if (str4.equals("manage_video_chats")) {
                                    c10 = 16;
                                    break;
                                }
                                break;
                        }
                        switch (c10) {
                            case 0:
                            case 15:
                                tL_chatAdminRights.ban_users = true;
                                break;
                            case 1:
                                tL_chatAdminRights.anonymous = true;
                                break;
                            case 2:
                                tL_chatAdminRights.change_info = true;
                                break;
                            case 3:
                                tL_chatAdminRights.delete_messages = true;
                                break;
                            case 4:
                                tL_chatAdminRights.edit_messages = true;
                                break;
                            case 5:
                            case 16:
                                tL_chatAdminRights.manage_call = true;
                                break;
                            case 6:
                            case 7:
                                tL_chatAdminRights.other = true;
                                break;
                            case '\b':
                            case 11:
                                tL_chatAdminRights.manage_topics = true;
                                break;
                            case '\t':
                            case 14:
                                tL_chatAdminRights.add_admins = true;
                                break;
                            case '\n':
                                tL_chatAdminRights.invite_users = true;
                                break;
                            case '\f':
                                tL_chatAdminRights.post_messages = true;
                                break;
                            case '\r':
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
                        if (!tL_chatAdminRights.change_info && !tL_chatAdminRights2.change_info) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        tL_chatAdminRights2.change_info = z10;
                        if (!tL_chatAdminRights.post_messages && !tL_chatAdminRights2.post_messages) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        tL_chatAdminRights2.post_messages = z11;
                        if (!tL_chatAdminRights.edit_messages && !tL_chatAdminRights2.edit_messages) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        tL_chatAdminRights2.edit_messages = z12;
                        if (!tL_chatAdminRights.add_admins && !tL_chatAdminRights2.add_admins) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        tL_chatAdminRights2.add_admins = z13;
                        if (!tL_chatAdminRights.delete_messages && !tL_chatAdminRights2.delete_messages) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        tL_chatAdminRights2.delete_messages = z14;
                        if (!tL_chatAdminRights.ban_users && !tL_chatAdminRights2.ban_users) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        tL_chatAdminRights2.ban_users = z15;
                        if (!tL_chatAdminRights.invite_users && !tL_chatAdminRights2.invite_users) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        tL_chatAdminRights2.invite_users = z16;
                        if (!tL_chatAdminRights.pin_messages && !tL_chatAdminRights2.pin_messages) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        tL_chatAdminRights2.pin_messages = z17;
                        if (!tL_chatAdminRights.manage_call && !tL_chatAdminRights2.manage_call) {
                            z18 = false;
                        } else {
                            z18 = true;
                        }
                        tL_chatAdminRights2.manage_call = z18;
                        if (!tL_chatAdminRights.anonymous && !tL_chatAdminRights2.anonymous) {
                            z19 = false;
                        } else {
                            z19 = true;
                        }
                        tL_chatAdminRights2.anonymous = z19;
                        if (!tL_chatAdminRights.other && !tL_chatAdminRights2.other) {
                            z20 = false;
                        } else {
                            z20 = true;
                        }
                        tL_chatAdminRights2.other = z20;
                    }
                }
                boolean z21 = this.f19090b;
                int i11 = this.f19091c;
                if (z21 && tL_chatAdminRights == null && !TextUtils.isEmpty(str2)) {
                    MessagesController.getInstance(launchActivity.O).addUserToChat(chat.f20344id, user, 0, str2, eyVar, true, new ez0(launchActivity, i11, chat, eyVar, 6), null);
                    return;
                }
                dq dqVar = new dq(user.f20491id, -this.d, tL_chatAdminRights2, null, null, str3, 2, true, !z21, str2);
                dqVar.Y0 = new ia0(eyVar, i11);
                ((ActionBarLayout) launchActivity.O()).R(dqVar, false);
                return;
        }
    }

    public n8(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z10, String str2, int i10, TLRPC.Chat chat, ey eyVar, TLRPC.User user, long j10, String str3) {
        this.e = launchActivity;
        this.f19092f = str;
        this.h = tL_chatAdminRights;
        this.f19090b = z10;
        this.f19093n = str2;
        this.f19091c = i10;
        this.f19094r = chat;
        this.f19095s = eyVar;
        this.v = user;
        this.d = j10;
        this.f19096w = str3;
    }
}
