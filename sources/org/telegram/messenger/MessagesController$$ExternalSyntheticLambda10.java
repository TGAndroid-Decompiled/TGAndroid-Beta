package org.telegram.messenger;

import androidx.collection.LongSparseArray;
import java.io.FileNotFoundException;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ChatNotificationsPopupWrapper;
import org.telegram.ui.Components.ItemOptions;

public final class MessagesController$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;
    public final Object f$3;
    public final Object f$4;
    public final int f$5;
    public final long f$6;

    public MessagesController$$ExternalSyntheticLambda10(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j, TLRPC.Chat chat, LongSparseArray longSparseArray, int i, long j2) {
        this.f$0 = messagesController;
        this.f$1 = updates_channeldifference;
        this.f$2 = j;
        this.f$3 = chat;
        this.f$4 = longSparseArray;
        this.f$5 = i;
        this.f$6 = j2;
    }

    @Override
    public final void run() throws FileNotFoundException {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesController) this.f$0).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f$1, this.f$2, (TLRPC.Chat) this.f$3, (LongSparseArray) this.f$4, this.f$5, this.f$6);
                break;
            default:
                BaseFragment baseFragment = (BaseFragment) this.f$3;
                ChatNotificationsPopupWrapper.lambda$addAsItemOptions$13((ItemOptions) this.f$0, this.f$5, this.f$2, this.f$6, (ItemOptions) this.f$1, baseFragment, (Theme.ResourcesProvider) this.f$4);
                break;
        }
    }

    public MessagesController$$ExternalSyntheticLambda10(ItemOptions itemOptions, int i, long j, long j2, ItemOptions itemOptions2, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        this.f$0 = itemOptions;
        this.f$5 = i;
        this.f$2 = j;
        this.f$6 = j2;
        this.f$1 = itemOptions2;
        this.f$3 = baseFragment;
        this.f$4 = resourcesProvider;
    }
}
