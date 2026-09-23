package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;
public final class u8 implements Runnable {
    public final int f17424a;
    public final Object f17425b;
    public final long f17426c;
    public final boolean d;
    public final Object e;

    public u8(Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f17424a = i10;
        this.f17425b = obj;
        this.d = z10;
        this.f17426c = j3;
        this.e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17424a) {
            case 0:
                ((MediaDataController) this.f17425b).lambda$loadFeaturedStickers$57((TLObject) this.e, this.d, this.f17426c);
                return;
            case 1:
                ((MediaDataController) this.f17425b).lambda$processLoadedFeaturedStickers$60((ArrayList) this.e, this.f17426c, this.d);
                return;
            case 2:
                ((MessagesController) this.f17425b).lambda$processUpdates$376(this.d, this.f17426c, (ArrayList) this.e);
                return;
            case 3:
                ((MessagesController) this.f17425b).lambda$getChannelRecommendations$481((TLObject) this.e, this.d, this.f17426c);
                return;
            case 4:
                boolean z10 = this.d;
                ((MessagesController) this.f17425b).lambda$processLoadedChannelAdmins$66(this.f17426c, (a0.i) this.e, z10);
                return;
            case 5:
                ((MessagesStorage) this.f17425b).lambda$createTaskForMid$115(this.d, this.f17426c, (ArrayList) this.e);
                return;
            case 6:
                ((MessagesStorage) this.f17425b).lambda$loadPendingTasks$24((org.telegram.ui.ActionBar.a6) this.e, this.d, this.f17426c);
                return;
            case 7:
                ((VideoPlayerHolderBase) this.f17425b).lambda$seekTo$12(this.f17426c, this.d, (Runnable) this.e);
                return;
            case 8:
                org.telegram.ui.z6.U((org.telegram.ui.z6) this.f17425b, this.d, this.f17426c, (org.telegram.ui.n6) this.e);
                return;
            default:
                ((ProfileActivity) this.f17425b).getMessagesController().getStoriesController().o0(this.f17426c, (ArrayList) this.e, this.d, null);
                return;
        }
    }

    public u8(BaseController baseController, Object obj, boolean z10, long j3, int i10) {
        this.f17424a = i10;
        this.f17425b = baseController;
        this.e = obj;
        this.d = z10;
        this.f17426c = j3;
    }

    public u8(MediaDataController mediaDataController, ArrayList arrayList, long j3, boolean z10) {
        this.f17424a = 1;
        this.f17425b = mediaDataController;
        this.e = arrayList;
        this.f17426c = j3;
        this.d = z10;
    }

    public u8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Cloneable cloneable, boolean z10, int i10) {
        this.f17424a = i10;
        this.f17425b = notificationCenterDelegate;
        this.f17426c = j3;
        this.e = cloneable;
        this.d = z10;
    }

    public u8(VideoPlayerHolderBase videoPlayerHolderBase, long j3, boolean z10, Runnable runnable) {
        this.f17424a = 7;
        this.f17425b = videoPlayerHolderBase;
        this.f17426c = j3;
        this.d = z10;
        this.e = runnable;
    }
}
