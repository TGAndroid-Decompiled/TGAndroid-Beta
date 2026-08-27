package hh;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.lt0;

public final class j0 implements Utilities.Callback2 {

    public final int f9506a;

    public final int f9507b;

    public final Object f9508c;
    public final Object d;

    public final Object f9509e;

    public j0(int i10, org.telegram.ui.ActionBar.n2 n2Var, we.d dVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f9506a = 0;
        this.f9507b = i10;
        this.f9508c = n2Var;
        this.d = dVar;
        this.f9509e = b2Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f9506a) {
            case 0:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f9508c;
                we.d dVar = (we.d) this.d;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f9509e;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error == null) {
                    MessagesController.getInstance(this.f9507b).processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(n2Var, tL_error, dVar, b2Var, 4));
                break;
            case 1:
                int[] iArr = (int[]) this.f9508c;
                nh.b1 b1Var = (nh.b1) this.d;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.f9509e;
                iArr[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage = messageMedia.webpage;
                    if (!(webPage instanceof TLRPC.TL_webPageEmpty)) {
                        if (!(messageMedia instanceof TLRPC.TL_messageMediaWebPage)) {
                            b1Var.run(null);
                        } else if (webPage instanceof TLRPC.TL_webPagePending) {
                            long j10 = webPage.f22533id;
                            int i10 = this.f9507b;
                            nh.d1 d1Var = new nh.d1(j10, notificationCenterDelegateArr, i10, b1Var);
                            notificationCenterDelegateArr[0] = d1Var;
                            NotificationCenter.getInstance(i10).addObserver(d1Var, NotificationCenter.didReceivedWebpagesInUpdates);
                        } else {
                            b1Var.run(webPage instanceof TLRPC.TL_webPage ? webPage : null);
                        }
                    }
                }
                b1Var.run(null);
                break;
            case 2:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f9508c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f9509e;
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    b2VarArr[0] = null;
                }
                if (tL_error2 != null) {
                    mc.a0(n2Var2).d0(tL_error2, false);
                } else if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        org.telegram.messenger.y1.q(R.string.CommunityNoChatsToAdd, mc.a0(n2Var2), R.raw.info, 36);
                    } else if (arrayList.isEmpty()) {
                        mc.a0(n2Var2).Q(R.raw.info, 36, "").j();
                    } else {
                        n2Var2.showDialog(new oh.j0(n2Var2, 0L, arrayList, new gh.q2(n2Var2, chat, this.f9507b, 2)));
                    }
                }
                break;
            case 3:
                org.telegram.ui.g1 g1Var = (org.telegram.ui.g1) this.f9508c;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f9509e;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i11 = this.f9507b;
                if (tL_error3 != null) {
                    AndroidUtilities.runOnUIThread(new ag.k0(g1Var, i11, tL_error3, tL_channels_joinChannel, 8));
                } else {
                    boolean z11 = false;
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                        TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                        int i12 = 0;
                        while (true) {
                            if (i12 < updates2.updates.size()) {
                                TLRPC.Update update = updates2.updates.get(i12);
                                if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                    z10 = true;
                                } else {
                                    i12++;
                                }
                            } else {
                                z10 = false;
                            }
                        }
                        MessagesController.getInstance(i11).processUpdates(updates2, false);
                        z11 = z10;
                    } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        AndroidUtilities.runOnUIThread(new d5.i(i11, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat2, 24));
                        z11 = true;
                    }
                    if (!z11) {
                        MessagesController.getInstance(i11).generateJoinMessage(chat2.f22380id, true);
                    }
                    AndroidUtilities.runOnUIThread(new lt0(g1Var, 5));
                    AndroidUtilities.runOnUIThread(new cg.w1(i11, chat2, 13), 1000L);
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
                    long j11 = chat2.f22380id;
                    messagesStorage.updateDialogsWithDeletedMessages(-j11, j11, new ArrayList<>(), null);
                }
                break;
            case 4:
                org.telegram.ui.Components.e0.Z((org.telegram.ui.Components.e0) this.f9508c, (org.telegram.ui.ActionBar.h5) this.d, this.f9507b, (TLRPC.TL_messages_composeMessageWithAI) this.f9509e, (TLRPC.TL_composedMessageWithAI) obj, (TLRPC.TL_error) obj2);
                break;
            case 5:
                org.telegram.ui.Components.e0.V((org.telegram.ui.Components.e0) this.f9508c, (org.telegram.ui.ActionBar.h5) this.d, this.f9507b, (TLRPC.TL_messages_composeRichMessageWithAI) this.f9509e, (TLRPC.TL_composedRichMessageWithAI) obj, (TLRPC.TL_error) obj2);
                break;
            case 6:
                boolean[] zArr = (boolean[]) this.f9508c;
                ArrayList arrayList2 = (ArrayList) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f9509e;
                String str = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr[0]) {
                    if (str != null) {
                        arrayList2.set(this.f9507b, str);
                        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                            if (arrayList2.get(i13) == null) {
                            }
                            break;
                        }
                        zArr[0] = true;
                        callback2.run(TextUtils.join("", arrayList2), Boolean.FALSE);
                    } else {
                        zArr[0] = true;
                        callback2.run(null, bool);
                    }
                    break;
                }
                break;
            default:
                lh.d dVar2 = (lh.d) this.f9508c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f9509e;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str2 = (String) obj2;
                dVar2.setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str2)) {
                    if ("EMPTY".equalsIgnoreCase(str2)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PasskeyNoOptionsText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f22702a.setOnDismissListener(new org.telegram.ui.s5(e3Var, 10));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                        if (n2VarU != null) {
                            if (str2 != null) {
                                new mc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).c0(str2, false);
                            } else if (passkey != null) {
                                int i14 = this.f9507b;
                                MessagesController.getInstance(i14).removeSuggestion(0L, "SETUP_PASSKEY");
                                if (n2VarU instanceof PasskeysActivity) {
                                    e3Var.dismiss();
                                    ((PasskeysActivity) n2VarU).Y(passkey);
                                } else if (n2VarU instanceof PrivacySettingsActivity) {
                                    e3Var.dismiss();
                                    PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) n2VarU;
                                    ArrayList arrayList3 = privacySettingsActivity.f35913e;
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                    }
                                    arrayList3.add(passkey);
                                    privacySettingsActivity.A0(true);
                                    n2VarU.presentFragment(new PasskeysActivity(arrayList3));
                                } else {
                                    ConnectionsManager.getInstance(i14).sendRequestTyped(new TL_account.getPasskeys(), new org.telegram.messenger.a(), new org.telegram.ui.m6(e3Var, passkey, str2, 3));
                                }
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }

    public j0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f9506a = i11;
        this.f9508c = obj;
        this.d = obj2;
        this.f9507b = i10;
        this.f9509e = obj3;
    }

    public j0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f9506a = i11;
        this.f9508c = obj;
        this.d = obj2;
        this.f9509e = obj3;
        this.f9507b = i10;
    }

    public j0(org.telegram.ui.g1 g1Var, int i10, TLRPC.TL_channels_joinChannel tL_channels_joinChannel, TLRPC.Chat chat) {
        this.f9506a = 3;
        this.f9508c = g1Var;
        this.f9507b = i10;
        this.d = tL_channels_joinChannel;
        this.f9509e = chat;
    }

    public j0(org.telegram.ui.ActionBar.b2[] b2VarArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Chat chat) {
        this.f9506a = 2;
        this.d = b2VarArr;
        this.f9508c = n2Var;
        this.f9507b = i10;
        this.f9509e = chat;
    }
}
