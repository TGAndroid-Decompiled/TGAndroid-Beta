package org.telegram.messenger;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f1 implements Runnable {
    public final int f16337a;
    public final Object f16338b;

    public f1(Object obj, int i10) {
        this.f16337a = i10;
        this.f16338b = obj;
    }

    @Override
    public final void run() {
        switch (this.f16337a) {
            case 0:
                CompoundEmoji.DrawableInfo.a((CompoundEmoji.DrawableInfo) this.f16338b);
                return;
            case 1:
                ((FeedRemoteViewsFactory) this.f16338b).lambda$onDataSetChanged$0();
                return;
            case 2:
                ((FilesMigrationService.AnonymousClass1) this.f16338b).lambda$run$0();
                return;
            case 3:
                ((ImageLoader.AnonymousClass6) this.f16338b).lambda$onReceive$0();
                return;
            case 4:
                ((LocaleController.TimeZoneChangedReceiver) this.f16338b).lambda$onReceive$0();
                return;
            case 5:
                ((MediaController.AnonymousClass7) this.f16338b).lambda$onSurfaceDestroyed$0();
                return;
            case 6:
                ((MediaController.AnonymousClass9) this.f16338b).lambda$onSurfaceDestroyed$0();
                return;
            case 7:
                ((MediaController.GalleryObserverInternal) this.f16338b).lambda$scheduleReloadRunnable$0();
                return;
            case 8:
                ((MediaController.MusicListenReporter) this.f16338b).report();
                return;
            case 9:
                MediaController.VideoConvertRunnable.lambda$runConversion$0((MediaController.VideoConvertMessage) this.f16338b);
                return;
            case 10:
                ((TelegramMediaSession.SessionCallback) this.f16338b).lambda$notifyPlayStateForNotificationRefresh$0();
                return;
            case 11:
                ANRDetector.a((ANRDetector) this.f16338b);
                return;
            case 12:
                AndroidUtilities.lambda$notifyDataSetChanged$26((RecyclerView) this.f16338b);
                return;
            case 13:
                BotFullscreenButtons.a((BotFullscreenButtons) this.f16338b);
                return;
            case 14:
                ((BotFullscreenButtons.OptionsIcon) this.f16338b).invalidateSelf();
                return;
            case 15:
                CodeHighlighting.a((CodeHighlighting.LockedSpannableString) this.f16338b);
                return;
            case 16:
                CompoundEmoji.CompoundEmojiDrawable.a((CompoundEmoji.CompoundEmojiDrawable) this.f16338b);
                return;
            case 17:
                ContactsLoadingObserver.b((ContactsLoadingObserver) this.f16338b);
                return;
            case 18:
                ((FactCheckController) this.f16338b).loadMissing();
                return;
            case 19:
                FileLoaderPriorityQueue.a((FileLoaderPriorityQueue) this.f16338b);
                return;
            case 20:
                ((FilePathDatabase) this.f16338b).lambda$clear$3();
                return;
            case 21:
                FileRefController.lambda$onRequestComplete$46((TLRPC.TL_theme) this.f16338b);
                return;
            case 22:
                ((ImageReceiver) this.f16338b).invalidate();
                return;
            case 23:
                MediaController.lambda$saveFile$46((org.telegram.ui.ActionBar.a2) this.f16338b);
                return;
            case 24:
                ((org.telegram.ui.Components.oc) this.f16338b).f();
                return;
            case 25:
                MediaDataController.lambda$addRecentGif$27((TLRPC.Document) this.f16338b);
                return;
            case 26:
                MessagesController.lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f16338b);
                return;
            case 27:
                MessagesController.lambda$performLogout$321((TLObject) this.f16338b);
                return;
            case 28:
                MessagesController.lambda$setContentSettings$503((TLRPC.TL_error) this.f16338b);
                return;
            default:
                ((MusicPlayerService) this.f16338b).stopSelf();
                return;
        }
    }
}
