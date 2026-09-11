package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;
public final class s8 implements Runnable {
    public final int f18967a;
    public final Object f18968b;
    public final long f18969c;
    public final boolean d;
    public final Object f18970e;

    public s8(Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f18967a = i10;
        this.f18968b = obj;
        this.d = z10;
        this.f18969c = j3;
        this.f18970e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18967a) {
            case 0:
                ((MediaDataController) this.f18968b).lambda$loadFeaturedStickers$57((TLObject) this.f18970e, this.d, this.f18969c);
                return;
            case 1:
                ((MediaDataController) this.f18968b).lambda$processLoadedFeaturedStickers$60((ArrayList) this.f18970e, this.f18969c, this.d);
                return;
            case 2:
                ((MessagesController) this.f18968b).lambda$processUpdates$376(this.d, this.f18969c, (ArrayList) this.f18970e);
                return;
            case 3:
                ((MessagesController) this.f18968b).lambda$getChannelRecommendations$481((TLObject) this.f18970e, this.d, this.f18969c);
                return;
            case 4:
                boolean z10 = this.d;
                ((MessagesController) this.f18968b).lambda$processLoadedChannelAdmins$66(this.f18969c, (a0.i) this.f18970e, z10);
                return;
            case 5:
                ((MessagesStorage) this.f18968b).lambda$createTaskForMid$115(this.d, this.f18969c, (ArrayList) this.f18970e);
                return;
            case 6:
                ((MessagesStorage) this.f18968b).lambda$loadPendingTasks$24((org.telegram.ui.ActionBar.b6) this.f18970e, this.d, this.f18969c);
                return;
            case 7:
                ((VideoPlayerHolderBase) this.f18968b).lambda$seekTo$12(this.f18969c, this.d, (Runnable) this.f18970e);
                return;
            case 8:
                org.telegram.ui.z6.U((org.telegram.ui.z6) this.f18968b, this.d, this.f18969c, (org.telegram.ui.n6) this.f18970e);
                return;
            default:
                ((ProfileActivity) this.f18968b).getMessagesController().getStoriesController().o0(this.f18969c, (ArrayList) this.f18970e, this.d, null);
                return;
        }
    }

    public s8(BaseController baseController, Object obj, boolean z10, long j3, int i10) {
        this.f18967a = i10;
        this.f18968b = baseController;
        this.f18970e = obj;
        this.d = z10;
        this.f18969c = j3;
    }

    public s8(MediaDataController mediaDataController, ArrayList arrayList, long j3, boolean z10) {
        this.f18967a = 1;
        this.f18968b = mediaDataController;
        this.f18970e = arrayList;
        this.f18969c = j3;
        this.d = z10;
    }

    public s8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Cloneable cloneable, boolean z10, int i10) {
        this.f18967a = i10;
        this.f18968b = notificationCenterDelegate;
        this.f18969c = j3;
        this.f18970e = cloneable;
        this.d = z10;
    }

    public s8(VideoPlayerHolderBase videoPlayerHolderBase, long j3, boolean z10, Runnable runnable) {
        this.f18967a = 7;
        this.f18968b = videoPlayerHolderBase;
        this.f18969c = j3;
        this.d = z10;
        this.f18970e = runnable;
    }
}
