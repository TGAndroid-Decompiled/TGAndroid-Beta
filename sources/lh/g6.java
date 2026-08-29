package lh;

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
public final class g6 {
    public final int f15634a;
    public final long f15635b;
    public final boolean f15636c;
    public boolean d;
    public boolean f15637e;
    public boolean f15638f;
    public final ArrayList f15639g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean f15640i;
    public final s6 f15641j;

    public g6(int i10, long j10, s6 s6Var) {
        boolean z10;
        this.f15641j = s6Var;
        this.f15634a = i10;
        this.f15635b = j10;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15636c = z10;
        d();
    }

    public final boolean a() {
        if ((this.f15636c || this.f15641j.i(this.f15635b)) && this.f15638f && this.h.size() < MessagesController.getInstance(this.f15634a).config.storiesAlbumsLimit.get()) {
            return true;
        }
        return false;
    }

    public final l6 b(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                l6 l6Var = (l6) arrayList.get(i11);
                if (i10 == l6Var.f15893a) {
                    return l6Var;
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
                if (i10 == ((l6) arrayList.get(i11)).f15893a) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.f15637e && !this.f15638f) {
            this.f15637e = true;
            boolean z10 = this.d;
            long j10 = this.f15635b;
            int i10 = this.f15634a;
            if (!z10) {
                MessagesStorage.getInstance(i10).loadStoryAlbumsCache(j10, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        AndroidUtilities.runOnUIThread(new r3(4, g6.this, (List) obj));
                    }

                    public Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            ConnectionsManager.getInstance(i10).sendRequest(tL_getAlbums, new ef.a(this, 13));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i10 = this.f15634a;
        tL_reorderAlbums.peer = MessagesController.getInstance(i10).getInputPeer(this.f15635b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tL_reorderAlbums.order.add(Integer.valueOf(((l6) obj).f15893a));
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i10 = this.f15634a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        ArrayList arrayList = this.h;
        long j10 = this.f15635b;
        messagesStorage.saveStoryAlbumsCache(j10, arrayList);
        if (z10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(j10), this);
        }
    }
}
