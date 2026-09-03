package org.telegram.messenger;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dt;
import org.telegram.ui.kq;
import org.telegram.ui.pa0;
import org.telegram.ui.py;
public final class p8 implements Runnable {
    public final int f19642a = 0;
    public final boolean f19643b;
    public final int f19644c;
    public final long d;
    public final Object f19645e;
    public final Object f19646f;
    public final Object h;
    public final Object f19647n;
    public final Object f19648r;
    public final Object f19649s;
    public final Object v;
    public final Object f19650w;

    public p8(MediaDataController mediaDataController, Timer.Task task, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i10, Timer timer, a0.h hVar2, a0.h hVar3, boolean z4, long j10) {
        this.f19645e = mediaDataController;
        this.f19646f = task;
        this.h = hVar;
        this.f19649s = atomicInteger;
        this.v = runnable;
        this.f19644c = i10;
        this.f19650w = timer;
        this.f19647n = hVar2;
        this.f19648r = hVar3;
        this.f19643b = z4;
        this.d = j10;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z4;
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
        int i10 = this.f19642a;
        Object obj = this.f19650w;
        Object obj2 = this.v;
        Object obj3 = this.f19649s;
        Object obj4 = this.f19648r;
        Object obj5 = this.f19647n;
        Object obj6 = this.h;
        Object obj7 = this.f19646f;
        Object obj8 = this.f19645e;
        switch (i10) {
            case 0:
                ((MediaDataController) obj8).lambda$loadReplyMessagesForMessages$177((Timer.Task) obj7, (a0.h) obj6, (AtomicInteger) obj3, (Runnable) obj2, this.f19644c, (Timer) obj, (a0.h) obj5, (a0.h) obj4, this.f19643b, this.d);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                String str = (String) obj7;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = (TLRPC.TL_chatAdminRights) obj6;
                String str2 = (String) obj5;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                py pyVar = (py) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str3 = (String) obj;
                Pattern pattern = LaunchActivity.f34134y1;
                if (str != null) {
                    String[] split = str.split("\\+| ");
                    tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
                    for (String str4 : split) {
                        str4.getClass();
                        char c3 = 65535;
                        switch (str4.hashCode()) {
                            case -2110462504:
                                if (str4.equals("ban_users")) {
                                    c3 = 0;
                                    break;
                                }
                                break;
                            case -2095811475:
                                if (str4.equals("anonymous")) {
                                    c3 = 1;
                                    break;
                                }
                                break;
                            case -1654794275:
                                if (str4.equals("change_info")) {
                                    c3 = 2;
                                    break;
                                }
                                break;
                            case -1593320096:
                                if (str4.equals("delete_messages")) {
                                    c3 = 3;
                                    break;
                                }
                                break;
                            case -939200543:
                                if (str4.equals("edit_messages")) {
                                    c3 = 4;
                                    break;
                                }
                                break;
                            case 22162680:
                                if (str4.equals("manage_call")) {
                                    c3 = 5;
                                    break;
                                }
                                break;
                            case 22169074:
                                if (str4.equals("manage_chat")) {
                                    c3 = 6;
                                    break;
                                }
                                break;
                            case 106069776:
                                if (str4.equals("other")) {
                                    c3 = 7;
                                    break;
                                }
                                break;
                            case 323243326:
                                if (str4.equals("manage_topics")) {
                                    c3 = '\b';
                                    break;
                                }
                                break;
                            case 449085338:
                                if (str4.equals("promote_members")) {
                                    c3 = '\t';
                                    break;
                                }
                                break;
                            case 632157522:
                                if (str4.equals("invite_users")) {
                                    c3 = '\n';
                                    break;
                                }
                                break;
                            case 703163861:
                                if (str4.equals("manage_topic")) {
                                    c3 = 11;
                                    break;
                                }
                                break;
                            case 758599179:
                                if (str4.equals("post_messages")) {
                                    c3 = '\f';
                                    break;
                                }
                                break;
                            case 1357805750:
                                if (str4.equals("pin_messages")) {
                                    c3 = '\r';
                                    break;
                                }
                                break;
                            case 1529816162:
                                if (str4.equals("add_admins")) {
                                    c3 = 14;
                                    break;
                                }
                                break;
                            case 1542893206:
                                if (str4.equals("restrict_members")) {
                                    c3 = 15;
                                    break;
                                }
                                break;
                            case 1641337725:
                                if (str4.equals("manage_video_chats")) {
                                    c3 = 16;
                                    break;
                                }
                                break;
                        }
                        switch (c3) {
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
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        tL_chatAdminRights2.change_info = z4;
                        if (!tL_chatAdminRights.post_messages && !tL_chatAdminRights2.post_messages) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        tL_chatAdminRights2.post_messages = z10;
                        if (!tL_chatAdminRights.edit_messages && !tL_chatAdminRights2.edit_messages) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        tL_chatAdminRights2.edit_messages = z11;
                        if (!tL_chatAdminRights.add_admins && !tL_chatAdminRights2.add_admins) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        tL_chatAdminRights2.add_admins = z12;
                        if (!tL_chatAdminRights.delete_messages && !tL_chatAdminRights2.delete_messages) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        tL_chatAdminRights2.delete_messages = z13;
                        if (!tL_chatAdminRights.ban_users && !tL_chatAdminRights2.ban_users) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        tL_chatAdminRights2.ban_users = z14;
                        if (!tL_chatAdminRights.invite_users && !tL_chatAdminRights2.invite_users) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        tL_chatAdminRights2.invite_users = z15;
                        if (!tL_chatAdminRights.pin_messages && !tL_chatAdminRights2.pin_messages) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        tL_chatAdminRights2.pin_messages = z16;
                        if (!tL_chatAdminRights.manage_call && !tL_chatAdminRights2.manage_call) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        tL_chatAdminRights2.manage_call = z17;
                        if (!tL_chatAdminRights.anonymous && !tL_chatAdminRights2.anonymous) {
                            z18 = false;
                        } else {
                            z18 = true;
                        }
                        tL_chatAdminRights2.anonymous = z18;
                        if (!tL_chatAdminRights.other && !tL_chatAdminRights2.other) {
                            z19 = false;
                        } else {
                            z19 = true;
                        }
                        tL_chatAdminRights2.other = z19;
                    }
                }
                boolean z20 = this.f19643b;
                int i11 = this.f19644c;
                if (z20 && tL_chatAdminRights == null && !TextUtils.isEmpty(str2)) {
                    MessagesController.getInstance(launchActivity.L).addUserToChat(chat.f20845id, user, 0, str2, pyVar, true, new dt(launchActivity, i11, chat, pyVar, 2), null);
                    return;
                }
                kq kqVar = new kq(user.f20992id, -this.d, tL_chatAdminRights2, null, null, str3, 2, true, !z20, str2);
                kqVar.U0 = new pa0(pyVar, i11);
                ((ActionBarLayout) launchActivity.O()).Q(kqVar, false);
                return;
        }
    }

    public p8(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z4, String str2, int i10, TLRPC.Chat chat, py pyVar, TLRPC.User user, long j10, String str3) {
        this.f19645e = launchActivity;
        this.f19646f = str;
        this.h = tL_chatAdminRights;
        this.f19643b = z4;
        this.f19647n = str2;
        this.f19644c = i10;
        this.f19648r = chat;
        this.f19649s = pyVar;
        this.v = user;
        this.d = j10;
        this.f19650w = str3;
    }
}
