package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;
public final class s8 implements Runnable {
    public final int f18994a;
    public final Object f18995b;
    public final long f18996c;
    public final boolean d;
    public final Object f18997e;

    public s8(Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f18994a = i10;
        this.f18995b = obj;
        this.d = z10;
        this.f18996c = j3;
        this.f18997e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18994a) {
            case 0:
                ((MediaDataController) this.f18995b).lambda$loadFeaturedStickers$57((TLObject) this.f18997e, this.d, this.f18996c);
                return;
            case 1:
                ((MediaDataController) this.f18995b).lambda$processLoadedFeaturedStickers$60((ArrayList) this.f18997e, this.f18996c, this.d);
                return;
            case 2:
                ((MessagesController) this.f18995b).lambda$processUpdates$376(this.d, this.f18996c, (ArrayList) this.f18997e);
                return;
            case 3:
                ((MessagesController) this.f18995b).lambda$getChannelRecommendations$481((TLObject) this.f18997e, this.d, this.f18996c);
                return;
            case 4:
                boolean z10 = this.d;
                ((MessagesController) this.f18995b).lambda$processLoadedChannelAdmins$66(this.f18996c, (a0.i) this.f18997e, z10);
                return;
            case 5:
                ((MessagesStorage) this.f18995b).lambda$createTaskForMid$115(this.d, this.f18996c, (ArrayList) this.f18997e);
                return;
            case 6:
                ((MessagesStorage) this.f18995b).lambda$loadPendingTasks$24((org.telegram.ui.ActionBar.b6) this.f18997e, this.d, this.f18996c);
                return;
            case 7:
                ((VideoPlayerHolderBase) this.f18995b).lambda$seekTo$12(this.f18996c, this.d, (Runnable) this.f18997e);
                return;
            case 8:
                org.telegram.ui.z6.U((org.telegram.ui.z6) this.f18995b, this.d, this.f18996c, (org.telegram.ui.n6) this.f18997e);
                return;
            default:
                ((ProfileActivity) this.f18995b).getMessagesController().getStoriesController().o0(this.f18996c, (ArrayList) this.f18997e, this.d, null);
                return;
        }
    }

    public s8(BaseController baseController, Object obj, boolean z10, long j3, int i10) {
        this.f18994a = i10;
        this.f18995b = baseController;
        this.f18997e = obj;
        this.d = z10;
        this.f18996c = j3;
    }

    public s8(MediaDataController mediaDataController, ArrayList arrayList, long j3, boolean z10) {
        this.f18994a = 1;
        this.f18995b = mediaDataController;
        this.f18997e = arrayList;
        this.f18996c = j3;
        this.d = z10;
    }

    public s8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Cloneable cloneable, boolean z10, int i10) {
        this.f18994a = i10;
        this.f18995b = notificationCenterDelegate;
        this.f18996c = j3;
        this.f18997e = cloneable;
        this.d = z10;
    }

    public s8(VideoPlayerHolderBase videoPlayerHolderBase, long j3, boolean z10, Runnable runnable) {
        this.f18994a = 7;
        this.f18995b = videoPlayerHolderBase;
        this.f18996c = j3;
        this.d = z10;
        this.f18997e = runnable;
    }
}
