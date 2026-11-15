package hi;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yw;
public final class f9 implements Runnable {
    public final int f14316a = 0;
    public final long f14317b;
    public final boolean f14318c;
    public final boolean d;
    public final is f14319e;
    public final TLObject f14320f;
    public final TLObject h;

    public f9(sa saVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.f14319e = saVar;
        this.f14318c = z10;
        this.f14320f = storyItem;
        this.f14317b = j3;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i7 = this.f14316a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f14320f;
        is isVar = this.f14319e;
        switch (i7) {
            case 0:
                sa saVar = (sa) isVar;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f14318c;
                long j3 = this.f14317b;
                if (!z10) {
                    fi.e1.X = new fi.e1(saVar.f15039b, saVar.f15043c, storyItem, j3, storyItem.f28290id, z10, inputGroupCall, true, this.d);
                }
                na naVar = saVar.G;
                if (naVar != null) {
                    naVar.f(false);
                }
                saVar.G = null;
                saVar.K = 0;
                RectF rectF = saVar.I;
                Point point = org.telegram.messenger.g0.f23609q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                saVar.H = org.telegram.messenger.g0.L(8.0f);
                saVar.p(true);
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                T.getOrCreateStoryViewer().L(saVar.f15039b, storyItem, null);
                ns.f(saVar.f15043c).k(176, Long.valueOf(inputGroupCall.f28068id));
                return;
            default:
                yw ywVar = (yw) isVar;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f14317b;
                boolean z11 = this.f14318c;
                if (chat != null) {
                    if (org.telegram.messenger.t3.r0(chat)) {
                        ywVar.getMessagesController().X(0, j10, z11);
                    } else {
                        ywVar.getMessagesController().g0(-j10, ywVar.getMessagesController().a2(Long.valueOf(ywVar.getUserConfig().e())), null, z11, z11);
                    }
                } else {
                    ywVar.getMessagesController().X(0, j10, z11);
                    if (user != null && user.bot && this.d) {
                        ywVar.getMessagesController().w(user.f28200id);
                    }
                }
                ywVar.getMessagesController().J(ywVar.Y2);
                return;
        }
    }

    public f9(yw ywVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.f14319e = ywVar;
        this.f14320f = chat;
        this.f14317b = j3;
        this.f14318c = z10;
        this.h = user;
        this.d = z11;
    }
}
