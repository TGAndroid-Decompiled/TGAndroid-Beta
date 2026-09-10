package gg;

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
    public final int f9101a;
    public final b0 f9102b;

    public z(b0 b0Var, int i10) {
        this.f9101a = i10;
        this.f9102b = b0Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9101a) {
            case 0:
                final b0 b0Var = this.f9102b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        b0 b0Var2 = b0Var;
                        switch (i10) {
                            case 0:
                                int i11 = b0Var2.f8816a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    b0Var2.f8817b.add(tL_businessChatLink);
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinkCreated, tL_businessChatLink);
                                    b0Var2.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = b0Var2.f8817b;
                                int i12 = b0Var2.f8816a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    MessagesController.getInstance(i12).putUsers(businesschatlinks.users, false);
                                    MessagesController.getInstance(i12).putChats(businesschatlinks.chats, false);
                                    MessagesStorage.getInstance(i12).putUsersAndChats(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    b0Var2.f();
                                } else {
                                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                                }
                                b0Var2.f8818c = false;
                                b0Var2.d = true;
                                return;
                        }
                    }
                });
                return;
            default:
                final b0 b0Var2 = this.f9102b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        b0 b0Var22 = b0Var2;
                        switch (i10) {
                            case 0:
                                int i11 = b0Var22.f8816a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    b0Var22.f8817b.add(tL_businessChatLink);
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinkCreated, tL_businessChatLink);
                                    b0Var22.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = b0Var22.f8817b;
                                int i12 = b0Var22.f8816a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    MessagesController.getInstance(i12).putUsers(businesschatlinks.users, false);
                                    MessagesController.getInstance(i12).putChats(businesschatlinks.chats, false);
                                    MessagesStorage.getInstance(i12).putUsersAndChats(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    b0Var22.f();
                                } else {
                                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                                }
                                b0Var22.f8818c = false;
                                b0Var22.d = true;
                                return;
                        }
                    }
                });
                return;
        }
    }
}
