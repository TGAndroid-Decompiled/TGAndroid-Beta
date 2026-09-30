package ai;

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
public final class x8 {
    public final int f1705a;
    public final long f1706b;
    public final boolean f1707c;
    public boolean d;
    public boolean e;
    public boolean f1708f;
    public final ArrayList f1709g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean f1710i;
    public final l9 f1711j;

    public x8(int i10, long j3, l9 l9Var) {
        boolean z10;
        this.f1711j = l9Var;
        this.f1705a = i10;
        this.f1706b = j3;
        if (j3 == UserConfig.getInstance(i10).getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1707c = z10;
        d();
    }

    public final boolean a() {
        if ((this.f1707c || this.f1711j.i(this.f1706b)) && this.f1708f && this.h.size() < MessagesController.getInstance(this.f1705a).config.storiesAlbumsLimit.get()) {
            return true;
        }
        return false;
    }

    public final e9 b(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                e9 e9Var = (e9) arrayList.get(i11);
                if (i10 == e9Var.f854a) {
                    return e9Var;
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
                if (i10 == ((e9) arrayList.get(i11)).f854a) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.e && !this.f1708f) {
            this.e = true;
            boolean z10 = this.d;
            long j3 = this.f1706b;
            int i10 = this.f1705a;
            if (!z10) {
                MessagesStorage.getInstance(i10).loadStoryAlbumsCache(j3, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        AndroidUtilities.runOnUIThread(new a1.e(16, x8.this, (List) obj));
                    }

                    public Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = MessagesController.getInstance(i10).getInputPeer(j3);
            ConnectionsManager.getInstance(i10).sendRequest(tL_getAlbums, new n8(this, 2));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i10 = this.f1705a;
        tL_reorderAlbums.peer = MessagesController.getInstance(i10).getInputPeer(this.f1706b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tL_reorderAlbums.order.add(Integer.valueOf(((e9) obj).f854a));
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i10 = this.f1705a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        ArrayList arrayList = this.h;
        long j3 = this.f1706b;
        messagesStorage.saveStoryAlbumsCache(j3, arrayList);
        if (z10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(j3), this);
        }
    }
}
