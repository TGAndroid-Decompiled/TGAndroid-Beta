package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;
public final class o8 implements Runnable {
    public final int f18759a;
    public final Object f18760b;
    public final long f18761c;
    public final boolean d;
    public final Object f18762e;

    public o8(Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f18759a = i10;
        this.f18760b = obj;
        this.d = z10;
        this.f18761c = j3;
        this.f18762e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18759a) {
            case 0:
                ((MediaDataController) this.f18760b).lambda$loadFeaturedStickers$57((TLObject) this.f18762e, this.d, this.f18761c);
                return;
            case 1:
                ((MediaDataController) this.f18760b).lambda$processLoadedFeaturedStickers$60((ArrayList) this.f18762e, this.f18761c, this.d);
                return;
            case 2:
                ((MessagesController) this.f18760b).lambda$processUpdates$376(this.d, this.f18761c, (ArrayList) this.f18762e);
                return;
            case 3:
                ((MessagesController) this.f18760b).lambda$getChannelRecommendations$481((TLObject) this.f18762e, this.d, this.f18761c);
                return;
            case 4:
                boolean z10 = this.d;
                ((MessagesController) this.f18760b).lambda$processLoadedChannelAdmins$66(this.f18761c, (a0.i) this.f18762e, z10);
                return;
            case 5:
                ((MessagesStorage) this.f18760b).lambda$createTaskForMid$115(this.d, this.f18761c, (ArrayList) this.f18762e);
                return;
            case 6:
                ((MessagesStorage) this.f18760b).lambda$loadPendingTasks$24((org.telegram.ui.ActionBar.a6) this.f18762e, this.d, this.f18761c);
                return;
            case 7:
                ((VideoPlayerHolderBase) this.f18760b).lambda$seekTo$12(this.f18761c, this.d, (Runnable) this.f18762e);
                return;
            case 8:
                org.telegram.ui.a7.T((org.telegram.ui.a7) this.f18760b, this.d, this.f18761c, (org.telegram.ui.p6) this.f18762e);
                return;
            default:
                ((ProfileActivity) this.f18760b).getMessagesController().getStoriesController().o0(this.f18761c, (ArrayList) this.f18762e, this.d, null);
                return;
        }
    }

    public o8(BaseController baseController, Object obj, boolean z10, long j3, int i10) {
        this.f18759a = i10;
        this.f18760b = baseController;
        this.f18762e = obj;
        this.d = z10;
        this.f18761c = j3;
    }

    public o8(MediaDataController mediaDataController, ArrayList arrayList, long j3, boolean z10) {
        this.f18759a = 1;
        this.f18760b = mediaDataController;
        this.f18762e = arrayList;
        this.f18761c = j3;
        this.d = z10;
    }

    public o8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Cloneable cloneable, boolean z10, int i10) {
        this.f18759a = i10;
        this.f18760b = notificationCenterDelegate;
        this.f18761c = j3;
        this.f18762e = cloneable;
        this.d = z10;
    }

    public o8(VideoPlayerHolderBase videoPlayerHolderBase, long j3, boolean z10, Runnable runnable) {
        this.f18759a = 7;
        this.f18760b = videoPlayerHolderBase;
        this.f18761c = j3;
        this.d = z10;
        this.f18762e = runnable;
    }
}
