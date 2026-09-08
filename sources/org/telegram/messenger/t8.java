package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;
public final class t8 implements Runnable {
    public final int f19078a;
    public final Object f19079b;
    public final long f19080c;
    public final boolean d;
    public final Object f19081e;

    public t8(Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f19078a = i10;
        this.f19079b = obj;
        this.d = z10;
        this.f19080c = j3;
        this.f19081e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19078a) {
            case 0:
                ((MediaDataController) this.f19079b).lambda$loadFeaturedStickers$57((TLObject) this.f19081e, this.d, this.f19080c);
                return;
            case 1:
                ((MediaDataController) this.f19079b).lambda$processLoadedFeaturedStickers$60((ArrayList) this.f19081e, this.f19080c, this.d);
                return;
            case 2:
                ((MessagesController) this.f19079b).lambda$processUpdates$376(this.d, this.f19080c, (ArrayList) this.f19081e);
                return;
            case 3:
                ((MessagesController) this.f19079b).lambda$getChannelRecommendations$481((TLObject) this.f19081e, this.d, this.f19080c);
                return;
            case 4:
                boolean z10 = this.d;
                ((MessagesController) this.f19079b).lambda$processLoadedChannelAdmins$66(this.f19080c, (a0.i) this.f19081e, z10);
                return;
            case 5:
                ((MessagesStorage) this.f19079b).lambda$createTaskForMid$115(this.d, this.f19080c, (ArrayList) this.f19081e);
                return;
            case 6:
                ((MessagesStorage) this.f19079b).lambda$loadPendingTasks$24((org.telegram.ui.ActionBar.b6) this.f19081e, this.d, this.f19080c);
                return;
            case 7:
                ((VideoPlayerHolderBase) this.f19079b).lambda$seekTo$12(this.f19080c, this.d, (Runnable) this.f19081e);
                return;
            case 8:
                org.telegram.ui.z6.U((org.telegram.ui.z6) this.f19079b, this.d, this.f19080c, (org.telegram.ui.n6) this.f19081e);
                return;
            default:
                ((ProfileActivity) this.f19079b).getMessagesController().getStoriesController().o0(this.f19080c, (ArrayList) this.f19081e, this.d, null);
                return;
        }
    }

    public t8(BaseController baseController, Object obj, boolean z10, long j3, int i10) {
        this.f19078a = i10;
        this.f19079b = baseController;
        this.f19081e = obj;
        this.d = z10;
        this.f19080c = j3;
    }

    public t8(MediaDataController mediaDataController, ArrayList arrayList, long j3, boolean z10) {
        this.f19078a = 1;
        this.f19079b = mediaDataController;
        this.f19081e = arrayList;
        this.f19080c = j3;
        this.d = z10;
    }

    public t8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Cloneable cloneable, boolean z10, int i10) {
        this.f19078a = i10;
        this.f19079b = notificationCenterDelegate;
        this.f19080c = j3;
        this.f19081e = cloneable;
        this.d = z10;
    }

    public t8(VideoPlayerHolderBase videoPlayerHolderBase, long j3, boolean z10, Runnable runnable) {
        this.f19078a = 7;
        this.f19079b = videoPlayerHolderBase;
        this.f19080c = j3;
        this.d = z10;
        this.f19081e = runnable;
    }
}
