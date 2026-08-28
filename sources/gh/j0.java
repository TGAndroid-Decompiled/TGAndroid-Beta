package gh;

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
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.kt0;
public final class j0 implements Utilities.Callback2 {
    public final int f8320a;
    public final int f8321b;
    public final Object f8322c;
    public final Object d;
    public final Object f8323e;

    public j0(int i9, org.telegram.ui.ActionBar.o2 o2Var, ve.d dVar, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f8320a = 0;
        this.f8321b = i9;
        this.f8322c = o2Var;
        this.d = dVar;
        this.f8323e = c2Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f8320a) {
            case 0:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f8322c;
                ve.d dVar = (ve.d) this.d;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f8323e;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error == null) {
                    MessagesController.getInstance(this.f8321b).processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(o2Var, tL_error, dVar, c2Var, 4));
                return;
            case 1:
                mh.c1 c1Var = (mh.c1) this.d;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.f8323e;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ((int[]) this.f8322c)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                TLRPC.WebPage webPage = null;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage2 = messageMedia.webpage;
                    if (!(webPage2 instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage2 instanceof TLRPC.TL_webPagePending) {
                                long j10 = webPage2.f22533id;
                                int i9 = this.f8321b;
                                mh.e1 e1Var = new mh.e1(j10, notificationCenterDelegateArr, i9, c1Var);
                                notificationCenterDelegateArr[0] = e1Var;
                                NotificationCenter.getInstance(i9).addObserver(e1Var, NotificationCenter.didReceivedWebpagesInUpdates);
                                return;
                            }
                            if (webPage2 instanceof TLRPC.TL_webPage) {
                                webPage = webPage2;
                            }
                            c1Var.run(webPage);
                            return;
                        }
                        c1Var.run(null);
                        return;
                    }
                }
                c1Var.run(null);
                return;
            case 2:
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f8322c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f8323e;
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr[0];
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                    c2VarArr[0] = null;
                }
                if (tL_error3 != null) {
                    oc.a0(o2Var2).d0(tL_error3, false);
                    return;
                } else if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        org.telegram.messenger.l0.p(R.string.CommunityNoChatsToAdd, oc.a0(o2Var2), R.raw.info, 36);
                        return;
                    } else if (!arrayList.isEmpty()) {
                        o2Var2.showDialog(new nh.j0(o2Var2, 0L, arrayList, new fh.v2(o2Var2, chat, this.f8321b, 2)));
                        return;
                    } else {
                        oc.a0(o2Var2).Q(R.raw.info, 36, "").j();
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.f1 f1Var = (org.telegram.ui.f1) this.f8322c;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f8323e;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                int i10 = this.f8321b;
                if (tL_error4 != null) {
                    AndroidUtilities.runOnUIThread(new c3.d(f1Var, i10, tL_error4, tL_channels_joinChannel, 9));
                    return;
                }
                boolean z11 = false;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    int i11 = 0;
                    while (true) {
                        if (i11 < updates2.updates.size()) {
                            TLRPC.Update update = updates2.updates.get(i11);
                            if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                z10 = true;
                            } else {
                                i11++;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                    MessagesController.getInstance(i10).processUpdates(updates2, false);
                    z11 = z10;
                } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    AndroidUtilities.runOnUIThread(new d5.i(i10, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat2, 25));
                    z11 = true;
                }
                if (!z11) {
                    MessagesController.getInstance(i10).generateJoinMessage(chat2.f22380id, true);
                }
                AndroidUtilities.runOnUIThread(new kt0(f1Var, 5));
                AndroidUtilities.runOnUIThread(new bg.c2(i10, chat2, 14), 1000L);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                long j11 = chat2.f22380id;
                messagesStorage.updateDialogsWithDeletedMessages(-j11, j11, new ArrayList<>(), null);
                return;
            case 4:
                org.telegram.ui.Components.e0.Y((org.telegram.ui.Components.e0) this.f8322c, (org.telegram.ui.ActionBar.h5) this.d, this.f8321b, (TLRPC.TL_messages_composeMessageWithAI) this.f8323e, (TLRPC.TL_composedMessageWithAI) obj, (TLRPC.TL_error) obj2);
                return;
            case 5:
                org.telegram.ui.Components.e0.U((org.telegram.ui.Components.e0) this.f8322c, (org.telegram.ui.ActionBar.h5) this.d, this.f8321b, (TLRPC.TL_messages_composeRichMessageWithAI) this.f8323e, (TLRPC.TL_composedRichMessageWithAI) obj, (TLRPC.TL_error) obj2);
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.f8322c;
                ArrayList arrayList2 = (ArrayList) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f8323e;
                String str = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr[0]) {
                    if (str != null) {
                        arrayList2.set(this.f8321b, str);
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            if (arrayList2.get(i12) == null) {
                                return;
                            }
                        }
                        zArr[0] = true;
                        callback2.run(TextUtils.join("", arrayList2), Boolean.FALSE);
                        return;
                    }
                    zArr[0] = true;
                    callback2.run(null, bool);
                    return;
                }
                return;
            default:
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f8323e;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str2 = (String) obj2;
                ((kh.d) this.f8322c).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str2)) {
                    if ("EMPTY".equalsIgnoreCase(str2)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PasskeyNoOptionsText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f22702a.setOnDismissListener(new org.telegram.ui.r5(f3Var, 10));
                        alertDialog$Builder.o();
                        return;
                    }
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        if (str2 != null) {
                            new oc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0(str2, false);
                            return;
                        } else if (passkey != null) {
                            int i13 = this.f8321b;
                            MessagesController.getInstance(i13).removeSuggestion(0L, "SETUP_PASSKEY");
                            if (U instanceof PasskeysActivity) {
                                f3Var.dismiss();
                                ((PasskeysActivity) U).X(passkey);
                                return;
                            } else if (U instanceof PrivacySettingsActivity) {
                                f3Var.dismiss();
                                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) U;
                                ArrayList arrayList3 = privacySettingsActivity.f35910e;
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(passkey);
                                privacySettingsActivity.z0(true);
                                U.presentFragment(new PasskeysActivity(arrayList3));
                                return;
                            } else {
                                ConnectionsManager.getInstance(i13).sendRequestTyped(new TL_account.getPasskeys(), new Object(), new org.telegram.ui.l6(f3Var, passkey, str2, 3));
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public j0(Object obj, Object obj2, int i9, Object obj3, int i10) {
        this.f8320a = i10;
        this.f8322c = obj;
        this.d = obj2;
        this.f8321b = i9;
        this.f8323e = obj3;
    }

    public j0(Object obj, Object obj2, Object obj3, int i9, int i10) {
        this.f8320a = i10;
        this.f8322c = obj;
        this.d = obj2;
        this.f8323e = obj3;
        this.f8321b = i9;
    }

    public j0(org.telegram.ui.f1 f1Var, int i9, TLRPC.TL_channels_joinChannel tL_channels_joinChannel, TLRPC.Chat chat) {
        this.f8320a = 3;
        this.f8322c = f1Var;
        this.f8321b = i9;
        this.d = tL_channels_joinChannel;
        this.f8323e = chat;
    }

    public j0(org.telegram.ui.ActionBar.c2[] c2VarArr, org.telegram.ui.ActionBar.o2 o2Var, int i9, TLRPC.Chat chat) {
        this.f8320a = 2;
        this.d = c2VarArr;
        this.f8322c = o2Var;
        this.f8321b = i9;
        this.f8323e = chat;
    }
}
