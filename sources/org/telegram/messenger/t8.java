package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;
public final class t8 implements Runnable {
    public final int f17373a;
    public final Object f17374b;
    public final long f17375c;
    public final boolean d;
    public final Object e;

    public t8(Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f17373a = i10;
        this.f17374b = obj;
        this.d = z10;
        this.f17375c = j3;
        this.e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17373a) {
            case 0:
                ((MediaDataController) this.f17374b).lambda$loadFeaturedStickers$57((TLObject) this.e, this.d, this.f17375c);
                return;
            case 1:
                ((MediaDataController) this.f17374b).lambda$processLoadedFeaturedStickers$60((ArrayList) this.e, this.f17375c, this.d);
                return;
            case 2:
                ((MessagesController) this.f17374b).lambda$processUpdates$376(this.d, this.f17375c, (ArrayList) this.e);
                return;
            case 3:
                ((MessagesController) this.f17374b).lambda$getChannelRecommendations$481((TLObject) this.e, this.d, this.f17375c);
                return;
            case 4:
                boolean z10 = this.d;
                ((MessagesController) this.f17374b).lambda$processLoadedChannelAdmins$66(this.f17375c, (a0.i) this.e, z10);
                return;
            case 5:
                ((MessagesStorage) this.f17374b).lambda$createTaskForMid$115(this.d, this.f17375c, (ArrayList) this.e);
                return;
            case 6:
                ((MessagesStorage) this.f17374b).lambda$loadPendingTasks$24((org.telegram.ui.ActionBar.b6) this.e, this.d, this.f17375c);
                return;
            case 7:
                ((VideoPlayerHolderBase) this.f17374b).lambda$seekTo$12(this.f17375c, this.d, (Runnable) this.e);
                return;
            case 8:
                org.telegram.ui.z6.U((org.telegram.ui.z6) this.f17374b, this.d, this.f17375c, (org.telegram.ui.n6) this.e);
                return;
            default:
                ((ProfileActivity) this.f17374b).getMessagesController().getStoriesController().o0(this.f17375c, (ArrayList) this.e, this.d, null);
                return;
        }
    }

    public t8(BaseController baseController, Object obj, boolean z10, long j3, int i10) {
        this.f17373a = i10;
        this.f17374b = baseController;
        this.e = obj;
        this.d = z10;
        this.f17375c = j3;
    }

    public t8(MediaDataController mediaDataController, ArrayList arrayList, long j3, boolean z10) {
        this.f17373a = 1;
        this.f17374b = mediaDataController;
        this.e = arrayList;
        this.f17375c = j3;
        this.d = z10;
    }

    public t8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Cloneable cloneable, boolean z10, int i10) {
        this.f17373a = i10;
        this.f17374b = notificationCenterDelegate;
        this.f17375c = j3;
        this.e = cloneable;
        this.d = z10;
    }

    public t8(VideoPlayerHolderBase videoPlayerHolderBase, long j3, boolean z10, Runnable runnable) {
        this.f17373a = 7;
        this.f17374b = videoPlayerHolderBase;
        this.f17375c = j3;
        this.d = z10;
        this.e = runnable;
    }
}
