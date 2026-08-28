package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;
public final class q8 implements Runnable {
    public final int f21304a;
    public final Object f21305b;
    public final long f21306c;
    public final boolean d;
    public final Object f21307e;

    public q8(Object obj, boolean z10, long j10, Object obj2, int i9) {
        this.f21304a = i9;
        this.f21305b = obj;
        this.d = z10;
        this.f21306c = j10;
        this.f21307e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f21304a) {
            case 0:
                ((MediaDataController) this.f21305b).lambda$loadFeaturedStickers$57((TLObject) this.f21307e, this.d, this.f21306c);
                return;
            case 1:
                ((MediaDataController) this.f21305b).lambda$processLoadedFeaturedStickers$60((ArrayList) this.f21307e, this.f21306c, this.d);
                return;
            case 2:
                ((MessagesController) this.f21305b).lambda$processUpdates$376(this.d, this.f21306c, (ArrayList) this.f21307e);
                return;
            case 3:
                ((MessagesController) this.f21305b).lambda$getChannelRecommendations$481((TLObject) this.f21307e, this.d, this.f21306c);
                return;
            case 4:
                boolean z10 = this.d;
                ((MessagesController) this.f21305b).lambda$processLoadedChannelAdmins$66(this.f21306c, (a0.h) this.f21307e, z10);
                return;
            case 5:
                ((MessagesStorage) this.f21305b).lambda$createTaskForMid$115(this.d, this.f21306c, (ArrayList) this.f21307e);
                return;
            case 6:
                ((MessagesStorage) this.f21305b).lambda$loadPendingTasks$24((org.telegram.ui.ActionBar.y5) this.f21307e, this.d, this.f21306c);
                return;
            case 7:
                ((VideoPlayerHolderBase) this.f21305b).lambda$seekTo$12(this.f21306c, this.d, (Runnable) this.f21307e);
                return;
            case 8:
                org.telegram.ui.y6.T((org.telegram.ui.y6) this.f21305b, this.d, this.f21306c, (org.telegram.ui.m6) this.f21307e);
                return;
            default:
                ((ProfileActivity) this.f21305b).getMessagesController().getStoriesController().o0(this.f21306c, (ArrayList) this.f21307e, this.d, null);
                return;
        }
    }

    public q8(BaseController baseController, Object obj, boolean z10, long j10, int i9) {
        this.f21304a = i9;
        this.f21305b = baseController;
        this.f21307e = obj;
        this.d = z10;
        this.f21306c = j10;
    }

    public q8(MediaDataController mediaDataController, ArrayList arrayList, long j10, boolean z10) {
        this.f21304a = 1;
        this.f21305b = mediaDataController;
        this.f21307e = arrayList;
        this.f21306c = j10;
        this.d = z10;
    }

    public q8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, Cloneable cloneable, boolean z10, int i9) {
        this.f21304a = i9;
        this.f21305b = notificationCenterDelegate;
        this.f21306c = j10;
        this.f21307e = cloneable;
        this.d = z10;
    }

    public q8(VideoPlayerHolderBase videoPlayerHolderBase, long j10, boolean z10, Runnable runnable) {
        this.f21304a = 7;
        this.f21305b = videoPlayerHolderBase;
        this.f21306c = j10;
        this.d = z10;
        this.f21307e = runnable;
    }
}
