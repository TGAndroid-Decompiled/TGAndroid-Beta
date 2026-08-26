package org.telegram.messenger;

import android.media.AudioManager;
import com.google.android.exoplayer2.ExoPlayerImpl;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Util;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$2$1;
import org.telegram.ui.Delegates.MemberRequestsDelegate;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda32;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.GalleryListView;
import org.telegram.ui.Stories.recorder.LivePlayerView;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.SelectPeerView;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.community.CommunityUtils;

public final class FileLoader$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public FileLoader$$ExternalSyntheticLambda1(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        boolean z = this.f$1;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((FileLoader) obj).lambda$onNetworkChanged$4(z);
                break;
            case 1:
                AudioRendererEventListener.EventDispatcher eventDispatcher = (AudioRendererEventListener.EventDispatcher) obj;
                eventDispatcher.getClass();
                int i = Util.SDK_INT;
                ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
                if (exoPlayerImpl.skipSilenceEnabled != z) {
                    exoPlayerImpl.skipSilenceEnabled = z;
                    LoginActivity$$ExternalSyntheticLambda32 loginActivity$$ExternalSyntheticLambda32 = new LoginActivity$$ExternalSyntheticLambda32(z, 2);
                    ListenerSet listenerSet = exoPlayerImpl.listeners;
                    listenerSet.queueEvent(23, loginActivity$$ExternalSyntheticLambda32);
                    listenerSet.flushEvents();
                    break;
                }
                break;
            case 2:
                ((FileUploadOperation) obj).lambda$onNetworkChanged$1(z);
                break;
            case 3:
                ((LocationController) obj).lambda$startFusedLocationRequest$5(z);
                break;
            case 4:
                ((RichMessageLayout.RichBlock) obj).lambda$toggleCheckbox$1(z);
                break;
            case 5:
                ((UserConfig) obj).lambda$saveConfig$0(z);
                break;
            case 6:
                ((CameraController) obj).lambda$recordVideo$11(z);
                break;
            case 7:
                ((VideoCapturerDevice) obj).lambda$new$0(z);
                break;
            case 8:
                ((VoIPService) obj).lambda$startGroupCall$27(z);
                break;
            case 9:
                ((AudioManager) obj).setSpeakerphoneOn(z);
                break;
            case 10:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z);
                break;
            case 11:
                ChatCustomReactionsEditActivity$2$1 chatCustomReactionsEditActivity$2$1 = (ChatCustomReactionsEditActivity$2$1) obj;
                if (!z) {
                    chatCustomReactionsEditActivity$2$1.getClass();
                } else {
                    ((ChatCustomReactionsEditActivity) chatCustomReactionsEditActivity$2$1.this$1.this$0).actionButtonContainer.setVisibility(4);
                }
                break;
            case 12:
                ((MemberRequestsDelegate) obj).lambda$loadMembers$5(z);
                break;
            case 13:
                StarGiftPreviewSheet starGiftPreviewSheet = (StarGiftPreviewSheet) obj;
                if (!z) {
                    starGiftPreviewSheet.gradientTop.setVisibility(8);
                } else {
                    starGiftPreviewSheet.getClass();
                }
                break;
            case 14:
                StarGiftSheet starGiftSheet = (StarGiftSheet) obj;
                starGiftSheet.getClass();
                starGiftSheet.showHint(starGiftSheet.ownerTextView, true, AndroidUtilities.replaceTags(LocaleController.formatString(z ? R.string.Gift2ActionWearDone : R.string.Gift2ActionWearOffDone, starGiftSheet.getGiftName())));
                break;
            case 15:
                StarGiftSheet starGiftSheet2 = StarGiftSheet.this;
                TL_stars.SavedStarGift neighbourSavedGift = starGiftSheet2.getNeighbourSavedGift(z);
                if (neighbourSavedGift != null) {
                    starGiftSheet2.firstSet = true;
                    starGiftSheet2.set(neighbourSavedGift, starGiftSheet2.giftsList);
                } else {
                    TL_stars.TL_starGiftUnique neighbourSlugGift = starGiftSheet2.getNeighbourSlugGift(z);
                    if (neighbourSlugGift != null) {
                        starGiftSheet2.firstSet = true;
                        starGiftSheet2.set(neighbourSlugGift.slug, neighbourSlugGift, starGiftSheet2.giftsList);
                    }
                }
                starGiftSheet2.overrideNextIndex = -1;
                if (Bulletin.getVisibleBulletin() != null) {
                    Bulletin.getVisibleBulletin().hide(false, 0L);
                }
                break;
            case 16:
                BotPreviewsEditContainer.BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditContainer.BotPreviewsEditLangContainer) obj;
                BotPreviewsEditContainer botPreviewsEditContainer = BotPreviewsEditContainer.this;
                if (!z) {
                    botPreviewsEditContainer.deleteLang(botPreviewsEditLangContainer.list.lang_code);
                } else {
                    botPreviewsEditContainer.addTranslation();
                }
                break;
            case 17:
                GalleryListView.Cell cell = (GalleryListView.Cell) obj;
                if (!z) {
                    cell.checkBoxContainer.setVisibility(8);
                } else {
                    cell.getClass();
                }
                break;
            case 18:
                LivePlayerView livePlayerView = (LivePlayerView) obj;
                livePlayerView.getClass();
                livePlayerView.emptyView.setVisibility(z ? 0 : 8);
                break;
            case 19:
                PaintView paintView = (PaintView) obj;
                if (!z) {
                    paintView.textDim.setVisibility(8);
                } else {
                    paintView.getClass();
                }
                break;
            case 20:
                SelectPeerView selectPeerView = (SelectPeerView) obj;
                if (!z) {
                    selectPeerView.setVisibility(8);
                } else {
                    selectPeerView.getClass();
                }
                break;
            case 21:
                StoryRecorder.AnonymousClass24 anonymousClass24 = (StoryRecorder.AnonymousClass24) obj;
                if (!z) {
                    StoryRecorder.this.playButton.setVisibility(8);
                } else {
                    anonymousClass24.getClass();
                }
                break;
            default:
                ((CommunityUtils.PendingRequests) obj).onResolveAllJoinRequests(z, false);
                break;
        }
    }
}
