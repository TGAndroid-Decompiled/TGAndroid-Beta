package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.ButtonSpan;

public final class AndroidUtilities$$ExternalSyntheticLambda42 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;

    public AndroidUtilities$$ExternalSyntheticLambda42(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
        this.f$6 = obj7;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.lambda$showProxyAlert$19((boolean[]) this.f$0, (ButtonSpan.TextViewButtons[]) this.f$1, (String) this.f$2, (String) this.f$3, (String) this.f$4, (String) this.f$5, (String) this.f$6);
                break;
            case 1:
                ((TranslateController) this.f$0).lambda$translateStory$36((TL_stories.StoryItem) this.f$1, (String) this.f$2, (TLRPC.TL_textWithEntities) this.f$3, (TLRPC.TL_textWithEntities) this.f$4, (TranslateController.StoryKey) this.f$5, (Runnable) this.f$6);
                break;
            case 2:
                ((MediaDataController) this.f$0).lambda$loadHints$144((ArrayList) this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$3, (ArrayList) this.f$4, (ArrayList) this.f$5, (ArrayList) this.f$6);
                break;
            case 3:
                ((MessagesController) this.f$0).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f$1, (Context) this.f$2, (AlertDialog) this.f$3, (TLRPC.TL_error) this.f$4, (BaseFragment) this.f$5, (TLRPC.TL_channels_convertToGigagroup) this.f$6);
                break;
            case 4:
                ((MessagesController) this.f$0).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f$1, (Context) this.f$2, (AlertDialog) this.f$3, (TLRPC.TL_error) this.f$4, (BaseFragment) this.f$5, (TLRPC.TL_messages_migrateChat) this.f$6);
                break;
            default:
                ((SecretChatHelper) this.f$0).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f$1, (TLRPC.DecryptedMessage) this.f$3, (TLRPC.Message) this.f$4, (TLRPC.InputEncryptedFile) this.f$5, (MessageObject) this.f$6, (String) this.f$2);
                break;
        }
    }

    public AndroidUtilities$$ExternalSyntheticLambda42(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.$r8$classId = 5;
        this.f$0 = secretChatHelper;
        this.f$1 = encryptedChat;
        this.f$3 = decryptedMessage;
        this.f$4 = message;
        this.f$5 = inputEncryptedFile;
        this.f$6 = messageObject;
        this.f$2 = str;
    }
}
