package ih;

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
public final class j6 {
    public final int f11631a;
    public final long f11632b;
    public final boolean f11633c;
    public boolean d;
    public boolean f11634e;
    public boolean f11635f;
    public final ArrayList f11636g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean f11637i;
    public final v6 f11638j;

    public j6(int i9, long j10, v6 v6Var) {
        boolean z10;
        this.f11638j = v6Var;
        this.f11631a = i9;
        this.f11632b = j10;
        if (j10 == UserConfig.getInstance(i9).getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11633c = z10;
        d();
    }

    public final boolean a() {
        if ((this.f11633c || this.f11638j.i(this.f11632b)) && this.f11635f && this.h.size() < MessagesController.getInstance(this.f11631a).config.storiesAlbumsLimit.get()) {
            return true;
        }
        return false;
    }

    public final o6 b(int i9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                o6 o6Var = (o6) arrayList.get(i10);
                if (i9 == o6Var.f11901a) {
                    return o6Var;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final int c(int i9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (i9 == ((o6) arrayList.get(i10)).f11901a) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.f11634e && !this.f11635f) {
            this.f11634e = true;
            boolean z10 = this.d;
            long j10 = this.f11632b;
            int i9 = this.f11631a;
            if (!z10) {
                MessagesStorage.getInstance(i9).loadStoryAlbumsCache(j10, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        AndroidUtilities.runOnUIThread(new h3.g0(18, j6.this, (List) obj));
                    }

                    public Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = MessagesController.getInstance(i9).getInputPeer(j10);
            ConnectionsManager.getInstance(i9).sendRequest(tL_getAlbums, new bf.a(this, 13));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i9 = this.f11631a;
        tL_reorderAlbums.peer = MessagesController.getInstance(i9).getInputPeer(this.f11632b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_reorderAlbums.order.add(Integer.valueOf(((o6) obj).f11901a));
        }
        ConnectionsManager.getInstance(i9).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i9 = this.f11631a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i9);
        ArrayList arrayList = this.h;
        long j10 = this.f11632b;
        messagesStorage.saveStoryAlbumsCache(j10, arrayList);
        if (z10) {
            NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(j10), this);
        }
    }
}
