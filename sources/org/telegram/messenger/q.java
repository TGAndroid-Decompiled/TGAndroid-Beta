package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

public final class q implements Comparator {

    public final int f21304a;

    public q(int i10) {
        this.f21304a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f21304a) {
            case 0:
                return AndroidUtilities.lambda$pruneOverlaps$10((AndroidUtilities.LinkSpec) obj, (AndroidUtilities.LinkSpec) obj2);
            case 1:
                return AutoDeleteMediaTask.lambda$run$0((AutoDeleteMediaTask.FileInfoInternal) obj, (AutoDeleteMediaTask.FileInfoInternal) obj2);
            case 2:
                return ChatObject.Call.lambda$processUpdatesQueue$7((TL_update.TL_updateGroupCallParticipants) obj, (TL_update.TL_updateGroupCallParticipants) obj2);
            case 3:
                return ContactsController.lambda$getContactsHash$26((TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
            case 4:
                return Emoji.lambda$sortEmoji$3((String) obj, (String) obj2);
            case 5:
                return FileLoadOperation.lambda$removePart$1((FileLoadOperation.Range) obj, (FileLoadOperation.Range) obj2);
            case 6:
                return MediaController.lambda$loadGalleryPhotosAlbums$56((MediaController.PhotoEntry) obj, (MediaController.PhotoEntry) obj2);
            case 7:
                return MediaController.lambda$sortPlaylist$13((MessageObject) obj, (MessageObject) obj2);
            case 8:
                return MediaDataController.lambda$static$160((TLRPC.MessageEntity) obj, (TLRPC.MessageEntity) obj2);
            case 9:
                return MediaDataController.lambda$increaseWebappRating$151((TLRPC.TL_topPeer) obj, (TLRPC.TL_topPeer) obj2);
            case 10:
                return MediaDataController.lambda$getTextStyleRuns$180((TLRPC.MessageEntity) obj, (TLRPC.MessageEntity) obj2);
            case 11:
                return MediaDataController.lambda$increasePeerRaiting$155((TLRPC.TL_topPeer) obj, (TLRPC.TL_topPeer) obj2);
            case 12:
                return MediaDataController.lambda$increaseInlineRating$150((TLRPC.TL_topPeer) obj, (TLRPC.TL_topPeer) obj2);
            case 13:
                return MessageObject.lambda$handleFoundWords$3((String) obj, (String) obj2);
            case 14:
                return MessageObject.lambda$addEntitiesToText$2((TLRPC.MessageEntity) obj, (TLRPC.MessageEntity) obj2);
            case 15:
                return MessagesController.lambda$processUpdatesQueue$328((TLRPC.Updates) obj, (TLRPC.Updates) obj2);
            case 16:
                return MessagesController.lambda$processUpdatesQueue$329((TLRPC.Updates) obj, (TLRPC.Updates) obj2);
            case 17:
                return MessagesController.lambda$processChannelsUpdatesQueue$326((TLRPC.Updates) obj, (TLRPC.Updates) obj2);
            case 18:
                return MessagesController.lambda$processLoadedMessages$190((MessageObject) obj, (MessageObject) obj2);
            case 19:
                return MessagesController.lambda$processLoadedDialogFilters$21((MessagesController.DialogFilter) obj, (MessagesController.DialogFilter) obj2);
            case 20:
                return MessagesController.lambda$processLoadedMessages$191((MessageObject) obj, (MessageObject) obj2);
            case 21:
                return MessagesController.lambda$processLoadedMessages$192((MessageObject) obj, (MessageObject) obj2);
            case 22:
                return MessagesStorage.lambda$loadDialogFilters$66((MessagesController.DialogFilter) obj, (MessagesController.DialogFilter) obj2);
            case 23:
                return MessagesStorage.lambda$getMessagesInternal$159((TLRPC.Message) obj, (TLRPC.Message) obj2);
            case 24:
                return MessagesStorage.lambda$processLoadedFilterPeersInternal$70((MessagesController.DialogFilter) obj, (MessagesController.DialogFilter) obj2);
            case 25:
                return MessagesStorage.lambda$localSearch$260((pf.u) obj, (pf.u) obj2);
            case 26:
                return ProxyRotationController.lambda$switchToAvailable$3((SharedConfig.ProxyInfo) obj, (SharedConfig.ProxyInfo) obj2);
            case 27:
                return RichMessageLayout.lambda$quotesFor$0((RichMessageLayout.QuoteBackground) obj, (RichMessageLayout.QuoteBackground) obj2);
            case 28:
                return SavedMessagesController.lambda$updatePinnedOrder$4((SavedMessagesController.SavedDialog) obj, (SavedMessagesController.SavedDialog) obj2);
            default:
                return SavedMessagesController.lambda$updatePinnedOrder$5((SavedMessagesController.SavedDialog) obj, (SavedMessagesController.SavedDialog) obj2);
        }
    }
}
