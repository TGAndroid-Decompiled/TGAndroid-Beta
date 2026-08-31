package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;
public final class w8 implements Runnable {
    public final int f20523a;
    public final Object f20524b;
    public final long f20525c;
    public final boolean d;
    public final Object f20526e;

    public w8(Object obj, boolean z4, long j10, Object obj2, int i10) {
        this.f20523a = i10;
        this.f20524b = obj;
        this.d = z4;
        this.f20525c = j10;
        this.f20526e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f20523a) {
            case 0:
                ((MediaDataController) this.f20524b).lambda$loadFeaturedStickers$57((TLObject) this.f20526e, this.d, this.f20525c);
                return;
            case 1:
                ((MediaDataController) this.f20524b).lambda$processLoadedFeaturedStickers$60((ArrayList) this.f20526e, this.f20525c, this.d);
                return;
            case 2:
                ((MessagesController) this.f20524b).lambda$processUpdates$376(this.d, this.f20525c, (ArrayList) this.f20526e);
                return;
            case 3:
                ((MessagesController) this.f20524b).lambda$getChannelRecommendations$481((TLObject) this.f20526e, this.d, this.f20525c);
                return;
            case 4:
                boolean z4 = this.d;
                ((MessagesController) this.f20524b).lambda$processLoadedChannelAdmins$66(this.f20525c, (a0.h) this.f20526e, z4);
                return;
            case 5:
                ((MessagesStorage) this.f20524b).lambda$createTaskForMid$115(this.d, this.f20525c, (ArrayList) this.f20526e);
                return;
            case 6:
                ((MessagesStorage) this.f20524b).lambda$loadPendingTasks$24((org.telegram.ui.ActionBar.d6) this.f20526e, this.d, this.f20525c);
                return;
            case 7:
                ((VideoPlayerHolderBase) this.f20524b).lambda$seekTo$12(this.f20525c, this.d, (Runnable) this.f20526e);
                return;
            case 8:
                org.telegram.ui.b7.U((org.telegram.ui.b7) this.f20524b, this.d, this.f20525c, (org.telegram.ui.q6) this.f20526e);
                return;
            default:
                ((ProfileActivity) this.f20524b).getMessagesController().getStoriesController().o0(this.f20525c, (ArrayList) this.f20526e, this.d, null);
                return;
        }
    }

    public w8(BaseController baseController, Object obj, boolean z4, long j10, int i10) {
        this.f20523a = i10;
        this.f20524b = baseController;
        this.f20526e = obj;
        this.d = z4;
        this.f20525c = j10;
    }

    public w8(MediaDataController mediaDataController, ArrayList arrayList, long j10, boolean z4) {
        this.f20523a = 1;
        this.f20524b = mediaDataController;
        this.f20526e = arrayList;
        this.f20525c = j10;
        this.d = z4;
    }

    public w8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, Cloneable cloneable, boolean z4, int i10) {
        this.f20523a = i10;
        this.f20524b = notificationCenterDelegate;
        this.f20525c = j10;
        this.f20526e = cloneable;
        this.d = z4;
    }

    public w8(VideoPlayerHolderBase videoPlayerHolderBase, long j10, boolean z4, Runnable runnable) {
        this.f20523a = 7;
        this.f20524b = videoPlayerHolderBase;
        this.f20525c = j10;
        this.d = z4;
        this.f20526e = runnable;
    }
}
