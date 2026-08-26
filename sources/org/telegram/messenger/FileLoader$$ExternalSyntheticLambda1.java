package org.telegram.messenger;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.ExoPlayerImpl;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatEditActivity;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.EmojiTabsStrip;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.HashtagActivity;
import org.telegram.ui.Components.InstantCameraView;
import org.telegram.ui.Components.MediaActivity;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$2$1;
import org.telegram.ui.Components.SearchDownloadsContainer;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SizeNotifierFrameLayoutPhoto;
import org.telegram.ui.Components.SuggestEmojiView;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Delegates.MemberRequestsDelegate;
import org.telegram.ui.Delegates.MemberRequestsDelegate$$ExternalSyntheticLambda2;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda41;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda77;

public final class FileLoader$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public FileLoader$$ExternalSyntheticLambda1(int i, Object obj, boolean z) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        int i = 2;
        Object memberRequestsDelegate$$ExternalSyntheticLambda2 = null;
        int i2 = 1;
        int i3 = 0;
        boolean z = this.f$1;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((FileLoader) obj).lambda$onNetworkChanged$4(z);
                break;
            case 1:
                AudioRendererEventListener.EventDispatcher eventDispatcher = (AudioRendererEventListener.EventDispatcher) obj;
                eventDispatcher.getClass();
                int i4 = Util.SDK_INT;
                ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
                if (exoPlayerImpl.skipSilenceEnabled != z) {
                    exoPlayerImpl.skipSilenceEnabled = z;
                    LoginActivity$$ExternalSyntheticLambda41 loginActivity$$ExternalSyntheticLambda41 = new LoginActivity$$ExternalSyntheticLambda41(i, z);
                    ListenerSet listenerSet = exoPlayerImpl.listeners;
                    listenerSet.queueEvent(23, loginActivity$$ExternalSyntheticLambda41);
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
                Browser.openUrl((Context) obj, LocaleController.getString(z ? R.string.BotMonetizationInfoTONLink : R.string.MonetizationInfoTONLink));
                break;
            case 12:
                SuggestEmojiView suggestEmojiView = ChatActivity.this.suggestEmojiPanel;
                if (suggestEmojiView != null && z) {
                    suggestEmojiView.setVisibility(8);
                    break;
                }
                break;
            case 13:
                ChatEditActivity chatEditActivity = (ChatEditActivity) obj;
                chatEditActivity.currentChat.autotranslation = z;
                chatEditActivity.getMessagesController().putChat(chatEditActivity.currentChat, false);
                break;
            case 14:
                ChatThemeBottomSheet chatThemeBottomSheet = (ChatThemeBottomSheet) obj;
                ChatThemeBottomSheet.Adapter adapter = chatThemeBottomSheet.adapter;
                if (adapter != null && adapter.items != null && !chatThemeBottomSheet.isDismissed()) {
                    chatThemeBottomSheet.setForceDark$1(z, true);
                    if (chatThemeBottomSheet.selectedItem != null) {
                        chatThemeBottomSheet.isLightDarkChangeAnimation = true;
                        ?? r10 = chatThemeBottomSheet.hasChanges$1() ? null : chatThemeBottomSheet.themeDelegate.wallpaper;
                        EmojiThemes emojiThemes = chatThemeBottomSheet.selectedItem.chatTheme;
                        if (emojiThemes.showAsDefaultStub) {
                            chatThemeBottomSheet.themeDelegate.setCurrentTheme(null, r10, false, Boolean.valueOf(z), false);
                        } else {
                            chatThemeBottomSheet.themeDelegate.setCurrentTheme(emojiThemes, r10, false, Boolean.valueOf(z), false);
                        }
                    }
                    if (adapter.items != null) {
                        while (i3 < adapter.items.size()) {
                            ((ChatThemeBottomSheet.ChatThemeItem) adapter.items.get(i3)).themeIndex = z ? 1 : 0;
                            i3++;
                        }
                        adapter.mObservable.notifyChanged();
                    }
                    break;
                }
                break;
            case 15:
                EmojiTabsStrip emojiTabsStrip = (EmojiTabsStrip) obj;
                if (!z) {
                    emojiTabsStrip.giftsTab.setVisibility(8);
                } else {
                    emojiTabsStrip.getClass();
                }
                break;
            case 16:
                FolderBottomSheet folderBottomSheet = (FolderBottomSheet) obj;
                folderBottomSheet.deselectAll(folderBottomSheet.headerCell, z);
                break;
            case 17:
                HashtagActivity hashtagActivity = (HashtagActivity) obj;
                if (!z) {
                    hashtagActivity.storiesView.setVisibility(8);
                } else {
                    hashtagActivity.getClass();
                }
                break;
            case 18:
                InstantCameraView instantCameraView = InstantCameraView.this;
                if (!instantCameraView.cancelled) {
                    try {
                        instantCameraView.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(instantCameraView.delegate.getParentActivity());
                    instantCameraView.recordPlusTime = z ? instantCameraView.recordedTime : 0L;
                    instantCameraView.recordStartTime = System.currentTimeMillis();
                    instantCameraView.recording = true;
                    instantCameraView.updateFlash();
                    instantCameraView.invalidate();
                    NotificationCenter.getInstance(instantCameraView.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(instantCameraView.recordingGuid), Boolean.FALSE);
                    break;
                }
                break;
            case 19:
                MediaActivity mediaActivity = (MediaActivity) obj;
                if (!z) {
                    mediaActivity.getClass();
                } else {
                    mediaActivity.optionsItem.setVisibility(8);
                }
                break;
            case 20:
                ChatCustomReactionsEditActivity$2$1 chatCustomReactionsEditActivity$2$1 = (ChatCustomReactionsEditActivity$2$1) obj;
                if (!z) {
                    chatCustomReactionsEditActivity$2$1.getClass();
                } else {
                    ((ChatCustomReactionsEditActivity) chatCustomReactionsEditActivity$2$1.this$1.this$0).actionButtonContainer.setVisibility(4);
                }
                break;
            case 21:
                SearchDownloadsContainer searchDownloadsContainer = (SearchDownloadsContainer) obj;
                searchDownloadsContainer.getClass();
                searchDownloadsContainer.parentFragment.presentFragment(new PremiumPreviewFragment(0, z ? "upload_speed" : "download_speed"));
                break;
            case 22:
                SharedMediaLayout sharedMediaLayout = (SharedMediaLayout) obj;
                if (!z) {
                    sharedMediaLayout.searchItemIcon.setVisibility(8);
                } else {
                    sharedMediaLayout.getClass();
                }
                break;
            case 23:
                SharedMediaLayout.AnonymousClass13 anonymousClass13 = (SharedMediaLayout.AnonymousClass13) obj;
                if (!z) {
                    anonymousClass13.this$0.saveItem.setVisibility(0);
                } else {
                    anonymousClass13.getClass();
                }
                break;
            case 24:
                SharedMediaLayout.AnonymousClass15 anonymousClass15 = (SharedMediaLayout.AnonymousClass15) obj;
                if (!z) {
                    SharedMediaLayout.this.saveItem.setVisibility(0);
                } else {
                    anonymousClass15.getClass();
                }
                break;
            case 25:
                SizeNotifierFrameLayout sizeNotifierFrameLayout = (SizeNotifierFrameLayout) obj;
                SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate sizeNotifierFrameLayoutDelegate = sizeNotifierFrameLayout.delegate;
                if (sizeNotifierFrameLayoutDelegate != null) {
                    sizeNotifierFrameLayoutDelegate.onSizeChanged(sizeNotifierFrameLayout.keyboardHeight, z);
                }
                while (true) {
                    ArrayList arrayList = sizeNotifierFrameLayout.delegates;
                    if (i3 < arrayList.size()) {
                        ((SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate) arrayList.get(i3)).onSizeChanged(sizeNotifierFrameLayout.keyboardHeight, z);
                        i3++;
                    }
                    break;
                }
                break;
            case 26:
                SizeNotifierFrameLayoutPhoto sizeNotifierFrameLayoutPhoto = (SizeNotifierFrameLayoutPhoto) obj;
                SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate sizeNotifierFrameLayoutDelegate2 = sizeNotifierFrameLayoutPhoto.delegate;
                if (sizeNotifierFrameLayoutDelegate2 != null) {
                    sizeNotifierFrameLayoutDelegate2.onSizeChanged(sizeNotifierFrameLayoutPhoto.keyboardHeight, z);
                }
                while (true) {
                    ArrayList arrayList2 = sizeNotifierFrameLayoutPhoto.delegates;
                    if (i3 < arrayList2.size()) {
                        ((SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate) arrayList2.get(i3)).onSizeChanged(sizeNotifierFrameLayoutPhoto.keyboardHeight, z);
                        i3++;
                    }
                    break;
                }
                break;
            case 27:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z));
                break;
            case 28:
                ((UniversalAdapter) obj).updateInternal(z);
                break;
            default:
                MemberRequestsDelegate memberRequestsDelegate = (MemberRequestsDelegate) obj;
                boolean zIsEmpty = TextUtils.isEmpty(memberRequestsDelegate.query);
                String str = memberRequestsDelegate.query;
                memberRequestsDelegate.isLoading = true;
                memberRequestsDelegate.isFirstLoading = false;
                if (zIsEmpty) {
                    ArrayList arrayList3 = memberRequestsDelegate.currentImporters;
                    if (arrayList3.isEmpty()) {
                        tL_chatInviteImporter = null;
                    } else {
                        tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList3);
                    }
                } else {
                    tL_chatInviteImporter = null;
                }
                boolean z2 = tL_chatInviteImporter == null;
                if (zIsEmpty && z2 && z) {
                    memberRequestsDelegate$$ExternalSyntheticLambda2 = new MemberRequestsDelegate$$ExternalSyntheticLambda2(memberRequestsDelegate, i2);
                }
                ?? r12 = memberRequestsDelegate$$ExternalSyntheticLambda2;
                if (zIsEmpty) {
                    AndroidUtilities.runOnUIThread(r12, 300L);
                }
                memberRequestsDelegate.searchRequestId = memberRequestsDelegate.controller.getImporters(memberRequestsDelegate.chatId, str, tL_chatInviteImporter, memberRequestsDelegate.users, new StarGiftSheet$$ExternalSyntheticLambda77(memberRequestsDelegate, zIsEmpty, (MemberRequestsDelegate$$ExternalSyntheticLambda2) r12, str, z2));
                break;
        }
    }
}
