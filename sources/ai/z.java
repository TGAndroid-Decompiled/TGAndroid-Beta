package ai;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class z implements NotificationCenter.NotificationCenterDelegate {
    public final int f1982a;
    public final TLRPC.Document f1983b;
    public final int f1984c;
    public final n1 d;
    public boolean e;
    public boolean f1985f;
    public boolean h;

    public z(int i10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i11, n1 n1Var) {
        this.f1982a = i10;
        this.f1983b = document;
        this.f1984c = i11;
        this.d = n1Var;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        if (!FileLoader.getInstance(i10).getPathToAttach(document, true).exists()) {
            FileLoader.getInstance(i10).loadFile(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (!this.e && !this.f1985f && FileLoader.getInstance(this.f1982a).getPathToAttach(this.f1983b, true).exists()) {
            this.f1985f = true;
            NotificationCenter.getInstance(this.f1982a).removeObserver(this, NotificationCenter.fileLoaded);
            Utilities.globalQueue.postRunnable(new a1.f(8, this, FileLoader.getInstance(this.f1982a).getPathToAttach(this.f1983b, true)));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            a();
        }
    }
}
