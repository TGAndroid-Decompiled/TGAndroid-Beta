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
public final class y8 {
    public final int f1953a;
    public final long f1954b;
    public final boolean f1955c;
    public boolean d;
    public boolean f1956e;
    public boolean f1957f;
    public final ArrayList f1958g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean f1959i;
    public final m9 f1960j;

    public y8(int i10, long j3, m9 m9Var) {
        boolean z10;
        this.f1960j = m9Var;
        this.f1953a = i10;
        this.f1954b = j3;
        if (j3 == UserConfig.getInstance(i10).getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1955c = z10;
        d();
    }

    public final boolean a() {
        if ((this.f1955c || this.f1960j.i(this.f1954b)) && this.f1957f && this.h.size() < MessagesController.getInstance(this.f1953a).config.storiesAlbumsLimit.get()) {
            return true;
        }
        return false;
    }

    public final f9 b(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                f9 f9Var = (f9) arrayList.get(i11);
                if (i10 == f9Var.f1033a) {
                    return f9Var;
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
                if (i10 == ((f9) arrayList.get(i11)).f1033a) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.f1956e && !this.f1957f) {
            this.f1956e = true;
            boolean z10 = this.d;
            long j3 = this.f1954b;
            int i10 = this.f1953a;
            if (!z10) {
                MessagesStorage.getInstance(i10).loadStoryAlbumsCache(j3, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        AndroidUtilities.runOnUIThread(new a1.f(16, y8.this, (List) obj));
                    }

                    public Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = MessagesController.getInstance(i10).getInputPeer(j3);
            ConnectionsManager.getInstance(i10).sendRequest(tL_getAlbums, new o8(this, 2));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i10 = this.f1953a;
        tL_reorderAlbums.peer = MessagesController.getInstance(i10).getInputPeer(this.f1954b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tL_reorderAlbums.order.add(Integer.valueOf(((f9) obj).f1033a));
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i10 = this.f1953a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        ArrayList arrayList = this.h;
        long j3 = this.f1954b;
        messagesStorage.saveStoryAlbumsCache(j3, arrayList);
        if (z10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(j3), this);
        }
    }
}
