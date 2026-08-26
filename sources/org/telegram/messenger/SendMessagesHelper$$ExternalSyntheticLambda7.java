package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Stars.StarsController;

public final class SendMessagesHelper$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;
    public final boolean f$7;
    public final Object f$8;

    public SendMessagesHelper$$ExternalSyntheticLambda7(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap map, boolean z, TLMethod tLMethod, int i) {
        this.$r8$classId = i;
        this.f$0 = sendMessagesHelper;
        this.f$1 = tL_error;
        this.f$2 = message;
        this.f$3 = tLObject;
        this.f$4 = messageObject;
        this.f$5 = str;
        this.f$6 = map;
        this.f$7 = z;
        this.f$8 = tLMethod;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((SendMessagesHelper) this.f$0).lambda$performSendMessageRequest$86((TLRPC.TL_error) this.f$1, (TLRPC.Message) this.f$2, (TLObject) this.f$3, (MessageObject) this.f$4, (String) this.f$5, (HashMap) this.f$6, this.f$7, (TLRPC.TL_messages_addPollAnswer) this.f$8);
                break;
            case 1:
                ((SendMessagesHelper) this.f$0).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f$1, (TLRPC.Message) this.f$2, (TLObject) this.f$3, (MessageObject) this.f$4, (String) this.f$5, (HashMap) this.f$6, this.f$7, (TLRPC.TL_messages_editMessage) this.f$8);
                break;
            case 2:
                ((SendMessagesHelper) this.f$0).lambda$performSendMessageRequest$100(this.f$7, (TLRPC.TL_error) this.f$1, (TLRPC.Message) this.f$2, (TLObject) this.f$3, (MessageObject) this.f$4, (HashMap) this.f$6, (String) this.f$5, (TLObject) this.f$8);
                break;
            default:
                ProfileGiftsContainer.SelectGiftsBottomSheet selectGiftsBottomSheet = ProfileGiftsContainer.SelectGiftsBottomSheet.this;
                ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) this.f$1;
                if (actionBarMenuSubItem != null) {
                    actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(selectGiftsBottomSheet.list.sort_by_date ? R.string.Gift2FilterSortByValue : R.string.Gift2FilterSortByDate), selectGiftsBottomSheet.list.sort_by_date ? R.drawable.menu_sort_value : R.drawable.menu_sort_date);
                }
                ((ActionBarMenuSubItem) this.f$2).setChecked(TLObject.hasFlag(selectGiftsBottomSheet.list.includeFlags, 1));
                StarsController.GiftsList giftsList = selectGiftsBottomSheet.list;
                ((ActionBarMenuSubItem) this.f$3).setChecked(TLObject.hasFlag(giftsList.includeFlags, 2));
                ((ActionBarMenuSubItem) this.f$4).setChecked(TLObject.hasFlag(giftsList.includeFlags, 4));
                ((ActionBarMenuSubItem) this.f$5).setChecked(TLObject.hasFlag(giftsList.includeFlags, 8));
                if (this.f$7) {
                    ((ActionBarMenuSubItem) this.f$6).setChecked(TLObject.hasFlag(giftsList.includeFlags, 256));
                    ((ActionBarMenuSubItem) this.f$8).setChecked(TLObject.hasFlag(giftsList.includeFlags, 512));
                }
                break;
        }
    }

    public SendMessagesHelper$$ExternalSyntheticLambda7(SendMessagesHelper sendMessagesHelper, boolean z, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap map, String str, TLObject tLObject2) {
        this.$r8$classId = 2;
        this.f$0 = sendMessagesHelper;
        this.f$7 = z;
        this.f$1 = tL_error;
        this.f$2 = message;
        this.f$3 = tLObject;
        this.f$4 = messageObject;
        this.f$6 = map;
        this.f$5 = str;
        this.f$8 = tLObject2;
    }

    public SendMessagesHelper$$ExternalSyntheticLambda7(ProfileGiftsContainer.SelectGiftsBottomSheet.AnonymousClass1 anonymousClass1, ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2, ActionBarMenuSubItem actionBarMenuSubItem3, ActionBarMenuSubItem actionBarMenuSubItem4, ActionBarMenuSubItem actionBarMenuSubItem5, boolean z, ActionBarMenuSubItem actionBarMenuSubItem6, ActionBarMenuSubItem actionBarMenuSubItem7) {
        this.$r8$classId = 3;
        this.f$0 = anonymousClass1;
        this.f$1 = actionBarMenuSubItem;
        this.f$2 = actionBarMenuSubItem2;
        this.f$3 = actionBarMenuSubItem3;
        this.f$4 = actionBarMenuSubItem4;
        this.f$5 = actionBarMenuSubItem5;
        this.f$7 = z;
        this.f$6 = actionBarMenuSubItem6;
        this.f$8 = actionBarMenuSubItem7;
    }
}
