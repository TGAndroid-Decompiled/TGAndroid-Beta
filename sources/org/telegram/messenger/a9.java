package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;
public final class a9 implements Runnable {
    public final int f14695a;
    public final Object f14696b;
    public final long f14697c;
    public final boolean d;
    public final Object e;

    public a9(Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f14695a = i10;
        this.f14696b = obj;
        this.d = z10;
        this.f14697c = j3;
        this.e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f14695a) {
            case 0:
                ((MediaDataController) this.f14696b).lambda$loadFeaturedStickers$57((TLObject) this.e, this.d, this.f14697c);
                return;
            case 1:
                ((MediaDataController) this.f14696b).lambda$processLoadedFeaturedStickers$60((ArrayList) this.e, this.f14697c, this.d);
                return;
            case 2:
                ((MessagesController) this.f14696b).lambda$processUpdates$376(this.d, this.f14697c, (ArrayList) this.e);
                return;
            case 3:
                ((MessagesController) this.f14696b).lambda$getChannelRecommendations$481((TLObject) this.e, this.d, this.f14697c);
                return;
            case 4:
                boolean z10 = this.d;
                ((MessagesController) this.f14696b).lambda$processLoadedChannelAdmins$66(this.f14697c, (a0.i) this.e, z10);
                return;
            case 5:
                ((MessagesStorage) this.f14696b).lambda$createTaskForMid$115(this.d, this.f14697c, (ArrayList) this.e);
                return;
            case 6:
                ((MessagesStorage) this.f14696b).lambda$loadPendingTasks$24((org.telegram.ui.ActionBar.c6) this.e, this.d, this.f14697c);
                return;
            case 7:
                ((VideoPlayerHolderBase) this.f14696b).lambda$seekTo$12(this.f14697c, this.d, (Runnable) this.e);
                return;
            case 8:
                org.telegram.ui.y6.U((org.telegram.ui.y6) this.f14696b, this.d, this.f14697c, (org.telegram.ui.n6) this.e);
                return;
            default:
                ((ProfileActivity) this.f14696b).getMessagesController().getStoriesController().o0(this.f14697c, (ArrayList) this.e, this.d, null);
                return;
        }
    }

    public a9(BaseController baseController, Object obj, boolean z10, long j3, int i10) {
        this.f14695a = i10;
        this.f14696b = baseController;
        this.e = obj;
        this.d = z10;
        this.f14697c = j3;
    }

    public a9(MediaDataController mediaDataController, ArrayList arrayList, long j3, boolean z10) {
        this.f14695a = 1;
        this.f14696b = mediaDataController;
        this.e = arrayList;
        this.f14697c = j3;
        this.d = z10;
    }

    public a9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Cloneable cloneable, boolean z10, int i10) {
        this.f14695a = i10;
        this.f14696b = notificationCenterDelegate;
        this.f14697c = j3;
        this.e = cloneable;
        this.d = z10;
    }

    public a9(VideoPlayerHolderBase videoPlayerHolderBase, long j3, boolean z10, Runnable runnable) {
        this.f14695a = 7;
        this.f14696b = videoPlayerHolderBase;
        this.f14697c = j3;
        this.d = z10;
        this.e = runnable;
    }
}
