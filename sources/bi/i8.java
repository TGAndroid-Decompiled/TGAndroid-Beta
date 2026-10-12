package bi;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class i8 {
    public final int f3176a;
    public final long f3177b;
    public final boolean f3178c;
    public boolean d;
    public boolean e;
    public boolean f3179f;
    public final ArrayList f3180g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean f3181i;
    public final x8 f3182j;

    public i8(int i10, long j10, x8 x8Var) {
        boolean z10;
        this.f3182j = x8Var;
        this.f3176a = i10;
        this.f3177b = j10;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3178c = z10;
        d();
    }

    public final boolean a() {
        if ((this.f3178c || this.f3182j.i(this.f3177b)) && this.f3179f && this.h.size() < MessagesController.getInstance(this.f3176a).config.storiesAlbumsLimit.get()) {
            return true;
        }
        return false;
    }

    public final p8 b(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                p8 p8Var = (p8) arrayList.get(i11);
                if (i10 == p8Var.f3473a) {
                    return p8Var;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final int c(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                if (i10 == ((p8) arrayList.get(i11)).f3473a) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.e && !this.f3179f) {
            this.e = true;
            boolean z10 = this.d;
            long j10 = this.f3177b;
            int i10 = this.f3176a;
            if (!z10) {
                MessagesStorage.getInstance(i10).loadStoryAlbumsCache(j10, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        AndroidUtilities.runOnUIThread(new a1.f(27, i8.this, (List) obj));
                    }

                    public Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            ConnectionsManager.getInstance(i10).sendRequest(tL_getAlbums, new z7(this, 2));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i10 = this.f3176a;
        tL_reorderAlbums.peer = MessagesController.getInstance(i10).getInputPeer(this.f3177b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tL_reorderAlbums.order.add(Integer.valueOf(((p8) obj).f3473a));
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i10 = this.f3176a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        ArrayList arrayList = this.h;
        long j10 = this.f3177b;
        messagesStorage.saveStoryAlbumsCache(j10, arrayList);
        if (z10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(j10), this);
        }
    }
}
