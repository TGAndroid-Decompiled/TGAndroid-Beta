package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;
public final class t8 implements Runnable {
    public final int f17382a;
    public final Object f17383b;
    public final long f17384c;
    public final boolean d;
    public final Object e;

    public t8(Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f17382a = i10;
        this.f17383b = obj;
        this.d = z10;
        this.f17384c = j3;
        this.e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17382a) {
            case 0:
                ((MediaDataController) this.f17383b).lambda$loadFeaturedStickers$57((TLObject) this.e, this.d, this.f17384c);
                return;
            case 1:
                ((MediaDataController) this.f17383b).lambda$processLoadedFeaturedStickers$60((ArrayList) this.e, this.f17384c, this.d);
                return;
            case 2:
                ((MessagesController) this.f17383b).lambda$processUpdates$376(this.d, this.f17384c, (ArrayList) this.e);
                return;
            case 3:
                ((MessagesController) this.f17383b).lambda$getChannelRecommendations$481((TLObject) this.e, this.d, this.f17384c);
                return;
            case 4:
                boolean z10 = this.d;
                ((MessagesController) this.f17383b).lambda$processLoadedChannelAdmins$66(this.f17384c, (a0.i) this.e, z10);
                return;
            case 5:
                ((MessagesStorage) this.f17383b).lambda$createTaskForMid$115(this.d, this.f17384c, (ArrayList) this.e);
                return;
            case 6:
                ((MessagesStorage) this.f17383b).lambda$loadPendingTasks$24((org.telegram.ui.ActionBar.c6) this.e, this.d, this.f17384c);
                return;
            case 7:
                ((VideoPlayerHolderBase) this.f17383b).lambda$seekTo$12(this.f17384c, this.d, (Runnable) this.e);
                return;
            case 8:
                org.telegram.ui.a7.U((org.telegram.ui.a7) this.f17383b, this.d, this.f17384c, (org.telegram.ui.o6) this.e);
                return;
            default:
                ((ProfileActivity) this.f17383b).getMessagesController().getStoriesController().o0(this.f17384c, (ArrayList) this.e, this.d, null);
                return;
        }
    }

    public t8(BaseController baseController, Object obj, boolean z10, long j3, int i10) {
        this.f17382a = i10;
        this.f17383b = baseController;
        this.e = obj;
        this.d = z10;
        this.f17384c = j3;
    }

    public t8(MediaDataController mediaDataController, ArrayList arrayList, long j3, boolean z10) {
        this.f17382a = 1;
        this.f17383b = mediaDataController;
        this.e = arrayList;
        this.f17384c = j3;
        this.d = z10;
    }

    public t8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Cloneable cloneable, boolean z10, int i10) {
        this.f17382a = i10;
        this.f17383b = notificationCenterDelegate;
        this.f17384c = j3;
        this.e = cloneable;
        this.d = z10;
    }

    public t8(VideoPlayerHolderBase videoPlayerHolderBase, long j3, boolean z10, Runnable runnable) {
        this.f17382a = 7;
        this.f17383b = videoPlayerHolderBase;
        this.f17384c = j3;
        this.d = z10;
        this.e = runnable;
    }
}
