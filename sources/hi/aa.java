package hi;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bx;
public final class aa implements Runnable {
    public final int f14197a = 0;
    public final long f14198b;
    public final boolean f14199c;
    public final boolean d;
    public final fs f14200e;
    public final TLObject f14201f;
    public final TLObject h;

    public aa(nb nbVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.f14200e = nbVar;
        this.f14199c = z10;
        this.f14201f = storyItem;
        this.f14198b = j3;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i7 = this.f14197a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f14201f;
        fs fsVar = this.f14200e;
        switch (i7) {
            case 0:
                nb nbVar = (nb) fsVar;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f14199c;
                long j3 = this.f14198b;
                if (!z10) {
                    fi.c1.X = new fi.c1(nbVar.f15058b, nbVar.f15062c, storyItem, j3, storyItem.f28731id, z10, inputGroupCall, true, this.d);
                }
                ib ibVar = nbVar.G;
                if (ibVar != null) {
                    ibVar.f(false);
                }
                nbVar.G = null;
                nbVar.K = 0;
                RectF rectF = nbVar.I;
                Point point = org.telegram.messenger.g0.f24226q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                nbVar.H = org.telegram.messenger.g0.L(8.0f);
                nbVar.p(true);
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                T.getOrCreateStoryViewer().L(nbVar.f15058b, storyItem, null);
                ks.f(nbVar.f15062c).k(176, Long.valueOf(inputGroupCall.f28509id));
                return;
            default:
                bx bxVar = (bx) fsVar;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f14198b;
                boolean z11 = this.f14199c;
                if (chat != null) {
                    if (org.telegram.messenger.v3.r0(chat)) {
                        bxVar.getMessagesController().X(0, j10, z11);
                    } else {
                        bxVar.getMessagesController().g0(-j10, bxVar.getMessagesController().c2(Long.valueOf(bxVar.getUserConfig().e())), null, z11, z11);
                    }
                } else {
                    bxVar.getMessagesController().X(0, j10, z11);
                    if (user != null && user.bot && this.d) {
                        bxVar.getMessagesController().w(user.f28641id);
                    }
                }
                bxVar.getMessagesController().J(bxVar.Y2);
                return;
        }
    }

    public aa(bx bxVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.f14200e = bxVar;
        this.f14201f = chat;
        this.f14198b = j3;
        this.f14199c = z10;
        this.h = user;
        this.d = z11;
    }
}
