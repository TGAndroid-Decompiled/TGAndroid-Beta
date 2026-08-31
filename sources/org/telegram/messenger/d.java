package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AutoDeleteMediaTask;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class d implements Comparator {
    public final int f18440a;

    public d(int i10) {
        this.f18440a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$pruneOverlaps$10;
        int lambda$processUpdatesQueue$7;
        int lambda$getContactsHash$26;
        int lambda$sortEmoji$3;
        int lambda$removePart$1;
        int lambda$loadGalleryPhotosAlbums$56;
        int lambda$sortPlaylist$13;
        int lambda$static$160;
        int lambda$increaseWebappRating$151;
        int lambda$getTextStyleRuns$180;
        int lambda$increasePeerRaiting$155;
        int lambda$increaseInlineRating$150;
        int lambda$handleFoundWords$3;
        int lambda$addEntitiesToText$2;
        int lambda$processUpdatesQueue$328;
        int lambda$processUpdatesQueue$329;
        int lambda$processChannelsUpdatesQueue$326;
        int lambda$processLoadedMessages$190;
        int lambda$processLoadedDialogFilters$21;
        int lambda$processLoadedMessages$191;
        int lambda$processLoadedMessages$192;
        int lambda$loadDialogFilters$66;
        int lambda$getMessagesInternal$159;
        int lambda$processLoadedFilterPeersInternal$70;
        int lambda$localSearch$260;
        int lambda$quotesFor$0;
        int lambda$updatePinnedOrder$4;
        int lambda$updatePinnedOrder$5;
        switch (this.f18440a) {
            case 0:
                lambda$pruneOverlaps$10 = AndroidUtilities.lambda$pruneOverlaps$10((AndroidUtilities.LinkSpec) obj, (AndroidUtilities.LinkSpec) obj2);
                return lambda$pruneOverlaps$10;
            case 1:
                return AutoDeleteMediaTask.a((AutoDeleteMediaTask.FileInfoInternal) obj, (AutoDeleteMediaTask.FileInfoInternal) obj2);
            case 2:
                lambda$processUpdatesQueue$7 = ChatObject.Call.lambda$processUpdatesQueue$7((TL_update.TL_updateGroupCallParticipants) obj, (TL_update.TL_updateGroupCallParticipants) obj2);
                return lambda$processUpdatesQueue$7;
            case 3:
                lambda$getContactsHash$26 = ContactsController.lambda$getContactsHash$26((TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$getContactsHash$26;
            case 4:
                lambda$sortEmoji$3 = Emoji.lambda$sortEmoji$3((String) obj, (String) obj2);
                return lambda$sortEmoji$3;
            case 5:
                lambda$removePart$1 = FileLoadOperation.lambda$removePart$1((FileLoadOperation.Range) obj, (FileLoadOperation.Range) obj2);
                return lambda$removePart$1;
            case 6:
                lambda$loadGalleryPhotosAlbums$56 = MediaController.lambda$loadGalleryPhotosAlbums$56((MediaController.PhotoEntry) obj, (MediaController.PhotoEntry) obj2);
                return lambda$loadGalleryPhotosAlbums$56;
            case 7:
                lambda$sortPlaylist$13 = MediaController.lambda$sortPlaylist$13((MessageObject) obj, (MessageObject) obj2);
                return lambda$sortPlaylist$13;
            case 8:
                lambda$static$160 = MediaDataController.lambda$static$160((TLRPC.MessageEntity) obj, (TLRPC.MessageEntity) obj2);
                return lambda$static$160;
            case 9:
                lambda$increaseWebappRating$151 = MediaDataController.lambda$increaseWebappRating$151((TLRPC.TL_topPeer) obj, (TLRPC.TL_topPeer) obj2);
                return lambda$increaseWebappRating$151;
            case 10:
                lambda$getTextStyleRuns$180 = MediaDataController.lambda$getTextStyleRuns$180((TLRPC.MessageEntity) obj, (TLRPC.MessageEntity) obj2);
                return lambda$getTextStyleRuns$180;
            case 11:
                lambda$increasePeerRaiting$155 = MediaDataController.lambda$increasePeerRaiting$155((TLRPC.TL_topPeer) obj, (TLRPC.TL_topPeer) obj2);
                return lambda$increasePeerRaiting$155;
            case 12:
                lambda$increaseInlineRating$150 = MediaDataController.lambda$increaseInlineRating$150((TLRPC.TL_topPeer) obj, (TLRPC.TL_topPeer) obj2);
                return lambda$increaseInlineRating$150;
            case 13:
                lambda$handleFoundWords$3 = MessageObject.lambda$handleFoundWords$3((String) obj, (String) obj2);
                return lambda$handleFoundWords$3;
            case 14:
                lambda$addEntitiesToText$2 = MessageObject.lambda$addEntitiesToText$2((TLRPC.MessageEntity) obj, (TLRPC.MessageEntity) obj2);
                return lambda$addEntitiesToText$2;
            case 15:
                lambda$processUpdatesQueue$328 = MessagesController.lambda$processUpdatesQueue$328((TLRPC.Updates) obj, (TLRPC.Updates) obj2);
                return lambda$processUpdatesQueue$328;
            case 16:
                lambda$processUpdatesQueue$329 = MessagesController.lambda$processUpdatesQueue$329((TLRPC.Updates) obj, (TLRPC.Updates) obj2);
                return lambda$processUpdatesQueue$329;
            case 17:
                lambda$processChannelsUpdatesQueue$326 = MessagesController.lambda$processChannelsUpdatesQueue$326((TLRPC.Updates) obj, (TLRPC.Updates) obj2);
                return lambda$processChannelsUpdatesQueue$326;
            case 18:
                lambda$processLoadedMessages$190 = MessagesController.lambda$processLoadedMessages$190((MessageObject) obj, (MessageObject) obj2);
                return lambda$processLoadedMessages$190;
            case 19:
                lambda$processLoadedDialogFilters$21 = MessagesController.lambda$processLoadedDialogFilters$21((MessagesController.DialogFilter) obj, (MessagesController.DialogFilter) obj2);
                return lambda$processLoadedDialogFilters$21;
            case 20:
                lambda$processLoadedMessages$191 = MessagesController.lambda$processLoadedMessages$191((MessageObject) obj, (MessageObject) obj2);
                return lambda$processLoadedMessages$191;
            case 21:
                lambda$processLoadedMessages$192 = MessagesController.lambda$processLoadedMessages$192((MessageObject) obj, (MessageObject) obj2);
                return lambda$processLoadedMessages$192;
            case 22:
                lambda$loadDialogFilters$66 = MessagesStorage.lambda$loadDialogFilters$66((MessagesController.DialogFilter) obj, (MessagesController.DialogFilter) obj2);
                return lambda$loadDialogFilters$66;
            case 23:
                lambda$getMessagesInternal$159 = MessagesStorage.lambda$getMessagesInternal$159((TLRPC.Message) obj, (TLRPC.Message) obj2);
                return lambda$getMessagesInternal$159;
            case 24:
                lambda$processLoadedFilterPeersInternal$70 = MessagesStorage.lambda$processLoadedFilterPeersInternal$70((MessagesController.DialogFilter) obj, (MessagesController.DialogFilter) obj2);
                return lambda$processLoadedFilterPeersInternal$70;
            case 25:
                lambda$localSearch$260 = MessagesStorage.lambda$localSearch$260((uf.u) obj, (uf.u) obj2);
                return lambda$localSearch$260;
            case 26:
                return ProxyRotationController.a((SharedConfig.ProxyInfo) obj, (SharedConfig.ProxyInfo) obj2);
            case 27:
                lambda$quotesFor$0 = RichMessageLayout.lambda$quotesFor$0((RichMessageLayout.QuoteBackground) obj, (RichMessageLayout.QuoteBackground) obj2);
                return lambda$quotesFor$0;
            case 28:
                lambda$updatePinnedOrder$4 = SavedMessagesController.lambda$updatePinnedOrder$4((SavedMessagesController.SavedDialog) obj, (SavedMessagesController.SavedDialog) obj2);
                return lambda$updatePinnedOrder$4;
            default:
                lambda$updatePinnedOrder$5 = SavedMessagesController.lambda$updatePinnedOrder$5((SavedMessagesController.SavedDialog) obj, (SavedMessagesController.SavedDialog) obj2);
                return lambda$updatePinnedOrder$5;
        }
    }
}
