package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;

public final class SecretChatHelper$$ExternalSyntheticLambda9 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public SecretChatHelper$$ExternalSyntheticLambda9(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((SecretChatHelper) this.f$0).lambda$startSecretChat$30((Context) this.f$1, (AlertDialog) this.f$2, (TLRPC.User) this.f$3, tLObject, tL_error);
                break;
            case 1:
                ((FactCheckController) this.f$0).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f$1, (ArrayList) this.f$2, (HashMap) this.f$3, tLObject, tL_error);
                break;
            case 2:
                ((LocationController) this.f$0).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f$1, (int[]) this.f$2, (TLRPC.TL_messages_editMessage) this.f$3, tLObject, tL_error);
                break;
            case 3:
                ((MessagesController) this.f$0).lambda$didReceivedNotification$45((Theme.OverrideWallpaperInfo) this.f$1, (TLRPC.TL_wallPaperSettings) this.f$2, (String) this.f$3, tLObject, tL_error);
                break;
            case 4:
                ((MessagesController) this.f$0).lambda$deleteUserChannelHistory$133((TLRPC.Chat) this.f$1, (TLRPC.User) this.f$3, (TLRPC.Chat) this.f$2, tLObject, tL_error);
                break;
            default:
                ((SendMessagesHelper) this.f$0).lambda$sendVote$32((MessageObject) this.f$1, (String) this.f$2, (Runnable) this.f$3, tLObject, tL_error);
                break;
        }
    }

    public SecretChatHelper$$ExternalSyntheticLambda9(MessagesController messagesController, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2) {
        this.$r8$classId = 4;
        this.f$0 = messagesController;
        this.f$1 = chat;
        this.f$3 = user;
        this.f$2 = chat2;
    }
}
