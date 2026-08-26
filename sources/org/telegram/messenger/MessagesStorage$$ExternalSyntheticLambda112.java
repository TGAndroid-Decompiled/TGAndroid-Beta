package org.telegram.messenger;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.collection.LongSparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.SearchAdapterHelper$$ExternalSyntheticLambda0;
import org.telegram.ui.Business.BusinessLinksController;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.HintView2$$ExternalSyntheticLambda2;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichInlineButtonEditor;

public final class MessagesStorage$$ExternalSyntheticLambda112 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final boolean f$4;

    public MessagesStorage$$ExternalSyntheticLambda112(Object obj, Object obj2, Object obj3, Object obj4, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = z;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesStorage) this.f$0).lambda$putChannelViews$191((LongSparseArray) this.f$1, (LongSparseArray) this.f$2, (LongSparseArray) this.f$3, this.f$4);
                break;
            case 1:
                ((FactCheckController) this.f$0).lambda$applyFactCheck$15((TLObject) this.f$1, (TLRPC.TL_textWithEntities) this.f$2, this.f$4, (AlertDialog) this.f$3);
                break;
            case 2:
                ((MediaDataController) this.f$0).lambda$loadStickersByEmojiOrName$84((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (String) this.f$3, this.f$4);
                break;
            case 3:
                ((MessagesController) this.f$0).lambda$setParticipantBannedRole$91((TLRPC.TL_error) this.f$1, (BaseFragment) this.f$2, (TLRPC.TL_channels_editBanned) this.f$3, this.f$4);
                break;
            case 4:
                ((MessagesStorage) this.f$0).lambda$replaceMessageIfExists$234((TLRPC.Message) this.f$1, this.f$4, (ArrayList) this.f$2, (ArrayList) this.f$3);
                break;
            case 5:
                ((SendMessagesHelper) this.f$0).lambda$sendEditRichMessageRequest$23((TLRPC.TL_messages_editMessage) this.f$1, (MessageObject) this.f$2, (BaseFragment) this.f$3, this.f$4);
                break;
            case 6:
                ((SendMessagesHelper) this.f$0).lambda$performSendMessageRequest$80((TLRPC.Message) this.f$1, this.f$4, (TLObject) this.f$2, (SendMessagesHelper.DelayedMessage) this.f$3);
                break;
            case 7:
                ((UnconfirmedAuthController) this.f$0).lambda$updateList$7((boolean[]) this.f$1, (ArrayList) this.f$2, this.f$4, (Utilities.Callback) this.f$3);
                break;
            case 8:
                ((CameraController) this.f$0).lambda$recordVideo$12((CameraController.ICameraView) this.f$1, (File) this.f$2, this.f$4, (Runnable) this.f$3);
                break;
            case 9:
                BusinessLinksController businessLinksController = (BusinessLinksController) this.f$0;
                ArrayList arrayList = businessLinksController.links;
                arrayList.clear();
                arrayList.addAll((ArrayList) this.f$1);
                int i = businessLinksController.currentAccount;
                MessagesController.getInstance(i).putUsers((ArrayList) this.f$2, true);
                MessagesController.getInstance(i).putChats((ArrayList) this.f$3, true);
                NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                businessLinksController.loading = false;
                businessLinksController.load(false, this.f$4);
                break;
            case 10:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) this.f$0;
                boolean z = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                BaseFragment baseFragment = (BaseFragment) this.f$3;
                boolean z2 = this.f$4;
                String str = (String) this.f$1;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) this.f$2;
                if (z) {
                    BoostDialogs.showAbout(z2, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, baseFragment.getParentActivity(), baseFragment.getResourceProvider());
                } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                    BoostDialogs.showAboutEnd(z2, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, baseFragment.getParentActivity(), baseFragment.getResourceProvider());
                }
                break;
            case 11:
                EmojiBottomSheet.GifPage.GifAdapter gifAdapter = (EmojiBottomSheet.GifPage.GifAdapter) this.f$0;
                if (gifAdapter.requesting) {
                    TLObject tLObject = (TLObject) this.f$1;
                    boolean z3 = tLObject instanceof TLRPC.messages_BotResults;
                    boolean z4 = this.f$4;
                    EmojiBottomSheet.GifPage gifPage = EmojiBottomSheet.GifPage.this;
                    if (!z3) {
                        gifAdapter.currentReqId = ConnectionsManager.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).sendRequest((TLRPC.TL_messages_getInlineBotResults) this.f$2, new SearchAdapterHelper$$ExternalSyntheticLambda0(gifAdapter, (String) this.f$3, z4, 2));
                    } else {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        gifAdapter.offset = messages_botresults.next_offset;
                        if (z4) {
                            gifPage.gifs.clear();
                        }
                        gifPage.gifs.size();
                        gifPage.gifs.addAll(messages_botresults.results);
                        gifAdapter.notifyDataSetChanged();
                        gifPage.searchField.showProgress(false);
                        gifAdapter.requesting = false;
                    }
                    break;
                }
                break;
            case 12:
                Bitmap bitmap = (Bitmap) this.f$1;
                File file = (File) this.f$2;
                StoryRecorder storyRecorder = (StoryRecorder) this.f$0;
                storyRecorder.getClass();
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, this.f$4 ? 95 : 99, new FileOutputStream(file));
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new HintView2$$ExternalSyntheticLambda2(storyRecorder, (StoryEntry) this.f$3, file, 9));
                break;
            default:
                RichInlineButtonEditor.showBlockProfileDialog((BaseFragment) this.f$0, (Context) this.f$1, (Theme.ResourcesProvider) this.f$2, (RichEditorListView.BlockButtonEdit) this.f$3, this.f$4);
                break;
        }
    }

    public MessagesStorage$$ExternalSyntheticLambda112(Object obj, Object obj2, Object obj3, boolean z, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = z;
        this.f$3 = obj4;
    }

    public MessagesStorage$$ExternalSyntheticLambda112(Object obj, Object obj2, boolean z, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$4 = z;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    public MessagesStorage$$ExternalSyntheticLambda112(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z, String str, long j, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, BaseFragment baseFragment) {
        this.$r8$classId = 10;
        this.f$0 = payments_giveawayinfo;
        this.f$4 = z;
        this.f$1 = str;
        this.f$2 = tL_messageMediaGiveaway;
        this.f$3 = baseFragment;
    }
}
