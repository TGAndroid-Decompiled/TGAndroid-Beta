package org.telegram.messenger;

import android.view.KeyEvent;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda20;
import org.telegram.ui.ChatActivity$21$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.PollVotesAlert;
import org.telegram.ui.Components.StickersDialogs;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda15;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda16;
import org.telegram.ui.Stories.StoryContainsEmojiButton;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class ChatObject$Call$$ExternalSyntheticLambda12 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public ChatObject$Call$$ExternalSyntheticLambda12(int i, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, ChatActivity$21$$ExternalSyntheticLambda4 chatActivity$21$$ExternalSyntheticLambda4, INavigationLayout iNavigationLayout) {
        this.$r8$classId = 1;
        this.f$1 = i;
        this.f$0 = photoSize;
        this.f$2 = photoSize2;
        this.f$3 = chatActivity$21$$ExternalSyntheticLambda4;
        this.f$4 = iNavigationLayout;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatObject.Call) this.f$0).lambda$loadUnknownParticipants$6(this.f$1, (ChatObject.Call.OnParticipantsLoad) this.f$2, (ArrayList) this.f$3, (HashSet) this.f$4, tLObject, tL_error);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda16(tLObject, this.f$1, (TLRPC.PhotoSize) this.f$0, (TLRPC.PhotoSize) this.f$2, (ChatActivity$21$$ExternalSyntheticLambda4) this.f$3, (INavigationLayout) this.f$4, 4));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda20((MentionsAdapter.AnonymousClass7) this.f$0, this.f$1, (ArrayList) this.f$3, (LongSparseArray) this.f$2, tL_error, tLObject, (MessagesController) this.f$4));
                break;
            case 3:
                ((PollVotesAlert) this.f$0).lambda$new$1((Integer[]) this.f$2, this.f$1, (ArrayList) this.f$3, (TLRPC.PollAnswerVoters) this.f$4, tLObject, tL_error);
                break;
            case 4:
                StickersDialogs.lambda$openStickerPickerDialog$10((AlertDialog) this.f$0, this.f$1, (TLRPC.Document) this.f$2, this.f$3, (TLRPC.TL_stickers_addStickerToSet) this.f$4, tLObject, tL_error);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda15((ButtonWithCounterView) this.f$0, (BottomSheet[]) this.f$2, this.f$1, (TLObject) this.f$3, (String) this.f$4, 17));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda16((ButtonWithCounterView) this.f$0, tLObject, (BottomSheet[]) this.f$2, (Theme.ResourcesProvider) this.f$3, this.f$1, (TLRPC.TL_messages_checkChatInvite) this.f$4, 11));
                break;
            default:
                StoryContainsEmojiButton storyContainsEmojiButton = (StoryContainsEmojiButton) this.f$0;
                storyContainsEmojiButton.getClass();
                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda16(storyContainsEmojiButton, tLObject, this.f$2, (ArrayList) this.f$3, (boolean[]) this.f$4, this.f$1, 12));
                break;
        }
    }

    public ChatObject$Call$$ExternalSyntheticLambda12(KeyEvent.Callback callback, Object[] objArr, int i, Object obj, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = callback;
        this.f$2 = objArr;
        this.f$1 = i;
        this.f$3 = obj;
        this.f$4 = obj2;
    }

    public ChatObject$Call$$ExternalSyntheticLambda12(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    public ChatObject$Call$$ExternalSyntheticLambda12(MentionsAdapter.AnonymousClass7 anonymousClass7, int i, ArrayList arrayList, LongSparseArray longSparseArray, MessagesController messagesController) {
        this.$r8$classId = 2;
        this.f$0 = anonymousClass7;
        this.f$1 = i;
        this.f$3 = arrayList;
        this.f$2 = longSparseArray;
        this.f$4 = messagesController;
    }

    public ChatObject$Call$$ExternalSyntheticLambda12(StoryContainsEmojiButton storyContainsEmojiButton, Object obj, ArrayList arrayList, boolean[] zArr, int i) {
        this.$r8$classId = 7;
        this.f$0 = storyContainsEmojiButton;
        this.f$2 = obj;
        this.f$3 = arrayList;
        this.f$4 = zArr;
        this.f$1 = i;
    }

    public ChatObject$Call$$ExternalSyntheticLambda12(ButtonWithCounterView buttonWithCounterView, BottomSheet[] bottomSheetArr, Theme.ResourcesProvider resourcesProvider, int i, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.$r8$classId = 6;
        this.f$0 = buttonWithCounterView;
        this.f$2 = bottomSheetArr;
        this.f$3 = resourcesProvider;
        this.f$1 = i;
        this.f$4 = tL_messages_checkChatInvite;
    }
}
