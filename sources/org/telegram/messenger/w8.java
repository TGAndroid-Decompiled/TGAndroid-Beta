package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;
public final class w8 implements Runnable {
    public final int f18884a;
    public final Object f18885b;
    public final long f18886c;
    public final boolean d;
    public final Object e;

    public w8(Object obj, boolean z4, long j10, Object obj2, int i10) {
        this.f18884a = i10;
        this.f18885b = obj;
        this.d = z4;
        this.f18886c = j10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18884a) {
            case 0:
                ((MediaDataController) this.f18885b).lambda$loadFeaturedStickers$57((TLObject) this.e, this.d, this.f18886c);
                return;
            case 1:
                ((MediaDataController) this.f18885b).lambda$processLoadedFeaturedStickers$60((ArrayList) this.e, this.f18886c, this.d);
                return;
            case 2:
                ((MessagesController) this.f18885b).lambda$processUpdates$376(this.d, this.f18886c, (ArrayList) this.e);
                return;
            case 3:
                ((MessagesController) this.f18885b).lambda$getChannelRecommendations$481((TLObject) this.e, this.d, this.f18886c);
                return;
            case 4:
                boolean z4 = this.d;
                ((MessagesController) this.f18885b).lambda$processLoadedChannelAdmins$66(this.f18886c, (a0.h) this.e, z4);
                return;
            case 5:
                ((MessagesStorage) this.f18885b).lambda$createTaskForMid$115(this.d, this.f18886c, (ArrayList) this.e);
                return;
            case 6:
                ((MessagesStorage) this.f18885b).lambda$loadPendingTasks$24((org.telegram.ui.ActionBar.c6) this.e, this.d, this.f18886c);
                return;
            case 7:
                ((VideoPlayerHolderBase) this.f18885b).lambda$seekTo$12(this.f18886c, this.d, (Runnable) this.e);
                return;
            case 8:
                org.telegram.ui.b7.U((org.telegram.ui.b7) this.f18885b, this.d, this.f18886c, (org.telegram.ui.q6) this.e);
                return;
            default:
                ((ProfileActivity) this.f18885b).getMessagesController().getStoriesController().o0(this.f18886c, (ArrayList) this.e, this.d, null);
                return;
        }
    }

    public w8(BaseController baseController, Object obj, boolean z4, long j10, int i10) {
        this.f18884a = i10;
        this.f18885b = baseController;
        this.e = obj;
        this.d = z4;
        this.f18886c = j10;
    }

    public w8(MediaDataController mediaDataController, ArrayList arrayList, long j10, boolean z4) {
        this.f18884a = 1;
        this.f18885b = mediaDataController;
        this.e = arrayList;
        this.f18886c = j10;
        this.d = z4;
    }

    public w8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, Cloneable cloneable, boolean z4, int i10) {
        this.f18884a = i10;
        this.f18885b = notificationCenterDelegate;
        this.f18886c = j10;
        this.e = cloneable;
        this.d = z4;
    }

    public w8(VideoPlayerHolderBase videoPlayerHolderBase, long j10, boolean z4, Runnable runnable) {
        this.f18884a = 7;
        this.f18885b = videoPlayerHolderBase;
        this.f18886c = j10;
        this.d = z4;
        this.e = runnable;
    }
}
