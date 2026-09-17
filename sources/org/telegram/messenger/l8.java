package org.telegram.messenger;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.r11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qq;
import org.telegram.ui.uy;
import org.telegram.ui.ya0;
public final class l8 implements Runnable {
    public final int f18268a = 0;
    public final boolean f18269b;
    public final int f18270c;
    public final long d;
    public final Object f18271e;
    public final Object f18272f;
    public final Object h;
    public final Object f18273n;
    public final Object f18274r;
    public final Object f18275s;
    public final Object v;
    public final Object f18276w;

    public l8(MediaDataController mediaDataController, Timer.Task task, a0.i iVar, AtomicInteger atomicInteger, Runnable runnable, int i10, Timer timer, a0.i iVar2, a0.i iVar3, boolean z10, long j3) {
        this.f18271e = mediaDataController;
        this.f18272f = task;
        this.h = iVar;
        this.f18275s = atomicInteger;
        this.v = runnable;
        this.f18270c = i10;
        this.f18276w = timer;
        this.f18273n = iVar2;
        this.f18274r = iVar3;
        this.f18269b = z10;
        this.d = j3;
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
        int i10 = this.f18268a;
        Object obj = this.f18276w;
        Object obj2 = this.v;
        Object obj3 = this.f18275s;
        Object obj4 = this.f18274r;
        Object obj5 = this.f18273n;
        Object obj6 = this.h;
        Object obj7 = this.f18272f;
        Object obj8 = this.f18271e;
        switch (i10) {
            case 0:
                ((MediaDataController) obj8).lambda$loadReplyMessagesForMessages$177((Timer.Task) obj7, (a0.i) obj6, (AtomicInteger) obj3, (Runnable) obj2, this.f18270c, (Timer) obj, (a0.i) obj5, (a0.i) obj4, this.f18269b, this.d);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                String str = (String) obj7;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = (TLRPC.TL_chatAdminRights) obj6;
                String str2 = (String) obj5;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                uy uyVar = (uy) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str3 = (String) obj;
                Pattern pattern = LaunchActivity.B1;
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
                boolean z21 = this.f18269b;
                int i11 = this.f18270c;
                if (z21 && tL_chatAdminRights == null && !TextUtils.isEmpty(str2)) {
                    MessagesController.getInstance(launchActivity.O).addUserToChat(chat.f19869id, user, 0, str2, uyVar, true, new r11(launchActivity, i11, chat, uyVar, 3), null);
                    return;
                }
                qq qqVar = new qq(user.f20016id, -this.d, tL_chatAdminRights2, null, null, str3, 2, true, !z21, str2);
                qqVar.X0 = new ya0(uyVar, i11);
                ((ActionBarLayout) launchActivity.O()).Q(qqVar, false);
                return;
        }
    }

    public l8(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z10, String str2, int i10, TLRPC.Chat chat, uy uyVar, TLRPC.User user, long j3, String str3) {
        this.f18271e = launchActivity;
        this.f18272f = str;
        this.h = tL_chatAdminRights;
        this.f18269b = z10;
        this.f18273n = str2;
        this.f18270c = i10;
        this.f18274r = chat;
        this.f18275s = uyVar;
        this.v = user;
        this.d = j3;
        this.f18276w = str3;
    }
}
