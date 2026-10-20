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
public final class i1 implements Runnable {
    public final int f18577a;
    public final Object f18578b;

    public i1(Object obj, int i10) {
        this.f18577a = i10;
        this.f18578b = obj;
    }

    @Override
    public final void run() {
        switch (this.f18577a) {
            case 0:
                CompoundEmoji.DrawableInfo.a((CompoundEmoji.DrawableInfo) this.f18578b);
                return;
            case 1:
                ((FeedRemoteViewsFactory) this.f18578b).lambda$onDataSetChanged$0();
                return;
            case 2:
                ((FilesMigrationService.AnonymousClass1) this.f18578b).lambda$run$0();
                return;
            case 3:
                ((ImageLoader.AnonymousClass6) this.f18578b).lambda$onReceive$0();
                return;
            case 4:
                ((LocaleController.TimeZoneChangedReceiver) this.f18578b).lambda$onReceive$0();
                return;
            case 5:
                ((MediaController.AnonymousClass7) this.f18578b).lambda$onSurfaceDestroyed$0();
                return;
            case 6:
                ((MediaController.AnonymousClass9) this.f18578b).lambda$onSurfaceDestroyed$0();
                return;
            case 7:
                ((MediaController.GalleryObserverInternal) this.f18578b).lambda$scheduleReloadRunnable$0();
                return;
            case 8:
                ((MediaController.MusicListenReporter) this.f18578b).report();
                return;
            case 9:
                MediaController.VideoConvertRunnable.lambda$runConversion$0((MediaController.VideoConvertMessage) this.f18578b);
                return;
            case 10:
                ((TelegramMediaSession.SessionCallback) this.f18578b).lambda$notifyPlayStateForNotificationRefresh$0();
                return;
            case 11:
                ANRDetector.a((ANRDetector) this.f18578b);
                return;
            case 12:
                AndroidUtilities.lambda$notifyDataSetChanged$26((RecyclerView) this.f18578b);
                return;
            case 13:
                BotFullscreenButtons.a((BotFullscreenButtons) this.f18578b);
                return;
            case 14:
                ((BotFullscreenButtons.OptionsIcon) this.f18578b).invalidateSelf();
                return;
            case 15:
                CompoundEmoji.CompoundEmojiDrawable.a((CompoundEmoji.CompoundEmojiDrawable) this.f18578b);
                return;
            case 16:
                ContactsLoadingObserver.b((ContactsLoadingObserver) this.f18578b);
                return;
            case 17:
                ((FactCheckController) this.f18578b).loadMissing();
                return;
            case 18:
                FileLoaderPriorityQueue.a((FileLoaderPriorityQueue) this.f18578b);
                return;
            case 19:
                ((FilePathDatabase) this.f18578b).lambda$clear$3();
                return;
            case 20:
                FileRefController.lambda$onRequestComplete$46((TLRPC.TL_theme) this.f18578b);
                return;
            case 21:
                ((ImageReceiver) this.f18578b).invalidate();
                return;
            case 22:
                MediaController.lambda$saveFile$47((org.telegram.ui.ActionBar.b2) this.f18578b);
                return;
            case 23:
                ((org.telegram.ui.Components.oc) this.f18578b).f();
                return;
            case 24:
                MediaDataController.lambda$addRecentGif$27((TLRPC.Document) this.f18578b);
                return;
            case 25:
                MessagesController.lambda$setContentSettings$506((TLRPC.TL_error) this.f18578b);
                return;
            case 26:
                MessagesController.lambda$performLogout$320((TLObject) this.f18578b);
                return;
            case 27:
                MessagesController.lambda$convertToGigaGroup$267((MessagesStorage.BooleanCallback) this.f18578b);
                return;
            case 28:
                ((MusicPlayerService) this.f18578b).stopSelf();
                return;
            default:
                NotificationBadge.HuaweiHomeBadger.lambda$executeBadge$0((Bundle) this.f18578b);
                return;
        }
    }
}
