package org.telegram.messenger;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f1 implements Runnable {
    public final int f17800a;
    public final Object f17801b;

    public f1(Object obj, int i10) {
        this.f17800a = i10;
        this.f17801b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17800a) {
            case 0:
                CompoundEmoji.DrawableInfo.a((CompoundEmoji.DrawableInfo) this.f17801b);
                return;
            case 1:
                ((FeedRemoteViewsFactory) this.f17801b).lambda$onDataSetChanged$0();
                return;
            case 2:
                ((FilesMigrationService.AnonymousClass1) this.f17801b).lambda$run$0();
                return;
            case 3:
                ((ImageLoader.AnonymousClass6) this.f17801b).lambda$onReceive$0();
                return;
            case 4:
                ((LocaleController.TimeZoneChangedReceiver) this.f17801b).lambda$onReceive$0();
                return;
            case 5:
                ((MediaController.AnonymousClass7) this.f17801b).lambda$onSurfaceDestroyed$0();
                return;
            case 6:
                ((MediaController.AnonymousClass9) this.f17801b).lambda$onSurfaceDestroyed$0();
                return;
            case 7:
                ((MediaController.GalleryObserverInternal) this.f17801b).lambda$scheduleReloadRunnable$0();
                return;
            case 8:
                ((MediaController.MusicListenReporter) this.f17801b).report();
                return;
            case 9:
                MediaController.VideoConvertRunnable.lambda$runConversion$0((MediaController.VideoConvertMessage) this.f17801b);
                return;
            case 10:
                ((TelegramMediaSession.SessionCallback) this.f17801b).lambda$notifyPlayStateForNotificationRefresh$0();
                return;
            case 11:
                ANRDetector.a((ANRDetector) this.f17801b);
                return;
            case 12:
                AndroidUtilities.lambda$notifyDataSetChanged$26((RecyclerView) this.f17801b);
                return;
            case 13:
                BotFullscreenButtons.a((BotFullscreenButtons) this.f17801b);
                return;
            case 14:
                ((BotFullscreenButtons.OptionsIcon) this.f17801b).invalidateSelf();
                return;
            case 15:
                CompoundEmoji.CompoundEmojiDrawable.a((CompoundEmoji.CompoundEmojiDrawable) this.f17801b);
                return;
            case 16:
                ContactsLoadingObserver.b((ContactsLoadingObserver) this.f17801b);
                return;
            case 17:
                ((FactCheckController) this.f17801b).loadMissing();
                return;
            case 18:
                FileLoaderPriorityQueue.a((FileLoaderPriorityQueue) this.f17801b);
                return;
            case 19:
                ((FilePathDatabase) this.f17801b).lambda$clear$3();
                return;
            case 20:
                FileRefController.lambda$onRequestComplete$46((TLRPC.TL_theme) this.f17801b);
                return;
            case 21:
                ((ImageReceiver) this.f17801b).invalidate();
                return;
            case 22:
                MediaController.lambda$saveFile$46((org.telegram.ui.ActionBar.a2) this.f17801b);
                return;
            case 23:
                ((org.telegram.ui.Components.qc) this.f17801b).f();
                return;
            case 24:
                MediaDataController.lambda$addRecentGif$27((TLRPC.Document) this.f17801b);
                return;
            case 25:
                MessagesController.lambda$setContentSettings$506((TLRPC.TL_error) this.f17801b);
                return;
            case 26:
                MessagesController.lambda$performLogout$320((TLObject) this.f17801b);
                return;
            case 27:
                MessagesController.lambda$convertToGigaGroup$267((MessagesStorage.BooleanCallback) this.f17801b);
                return;
            case 28:
                ((MusicPlayerService) this.f17801b).stopSelf();
                return;
            default:
                NotificationBadge.HuaweiHomeBadger.lambda$executeBadge$0((Bundle) this.f17801b);
                return;
        }
    }
}
