package hg;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class z implements RequestDelegate {
    public final int f10485a;
    public final a0 f10486b;

    public z(a0 a0Var, int i10) {
        this.f10485a = i10;
        this.f10486b = a0Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10485a) {
            case 0:
                final a0 a0Var = this.f10486b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        a0 a0Var2 = a0Var;
                        switch (i10) {
                            case 0:
                                int i11 = a0Var2.f10206a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    a0Var2.f10207b.add(tL_businessChatLink);
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinkCreated, tL_businessChatLink);
                                    a0Var2.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = a0Var2.f10207b;
                                int i12 = a0Var2.f10206a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    MessagesController.getInstance(i12).putUsers(businesschatlinks.users, false);
                                    MessagesController.getInstance(i12).putChats(businesschatlinks.chats, false);
                                    MessagesStorage.getInstance(i12).putUsersAndChats(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    a0Var2.f();
                                } else {
                                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                                }
                                a0Var2.f10208c = false;
                                a0Var2.d = true;
                                return;
                        }
                    }
                });
                return;
            default:
                final a0 a0Var2 = this.f10486b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        a0 a0Var22 = a0Var2;
                        switch (i10) {
                            case 0:
                                int i11 = a0Var22.f10206a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    a0Var22.f10207b.add(tL_businessChatLink);
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinkCreated, tL_businessChatLink);
                                    a0Var22.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = a0Var22.f10207b;
                                int i12 = a0Var22.f10206a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    MessagesController.getInstance(i12).putUsers(businesschatlinks.users, false);
                                    MessagesController.getInstance(i12).putChats(businesschatlinks.chats, false);
                                    MessagesStorage.getInstance(i12).putUsersAndChats(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    a0Var22.f();
                                } else {
                                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                                }
                                a0Var22.f10208c = false;
                                a0Var22.d = true;
                                return;
                        }
                    }
                });
                return;
        }
    }
}
