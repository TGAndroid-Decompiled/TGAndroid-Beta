package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;

public final class SecretChatHelper$$ExternalSyntheticLambda11 implements RequestDelegate {
    public final int $r8$classId;
    public final BaseController f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;

    public SecretChatHelper$$ExternalSyntheticLambda11(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = baseController;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
        this.f$5 = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((SecretChatHelper) this.f$0).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f$1, (TLRPC.EncryptedChat) this.f$2, (TLRPC.Message) this.f$3, (MessageObject) this.f$4, (String) this.f$5, tLObject, tL_error);
                break;
            case 1:
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f$4;
                ((TranslateController) this.f$0).lambda$translateStory$38((TL_stories.StoryItem) this.f$1, (String) this.f$5, (TranslateController.StoryKey) this.f$2, (Runnable) this.f$3, tL_textWithEntities, tLObject, tL_error);
                break;
            default:
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) this.f$5;
                ((MessagesController) this.f$0).lambda$convertToGigaGroup$270((Context) this.f$1, (AlertDialog) this.f$2, (MessagesStorage.BooleanCallback) this.f$3, (BaseFragment) this.f$4, tL_channels_convertToGigagroup, tLObject, tL_error);
                break;
        }
    }

    public SecretChatHelper$$ExternalSyntheticLambda11(TranslateController translateController, TL_stories.StoryItem storyItem, String str, TranslateController.StoryKey storyKey, Runnable runnable, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.$r8$classId = 1;
        this.f$0 = translateController;
        this.f$1 = storyItem;
        this.f$5 = str;
        this.f$2 = storyKey;
        this.f$3 = runnable;
        this.f$4 = tL_textWithEntities;
    }
}
