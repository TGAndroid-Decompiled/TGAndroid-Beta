package hi;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;
public final class f9 implements Runnable {
    public final int f14652a = 0;
    public final long f14653b;
    public final boolean f14654c;
    public final boolean d;
    public final gs f14655e;
    public final TLObject f14656f;
    public final TLObject h;

    public f9(sa saVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.f14655e = saVar;
        this.f14654c = z10;
        this.f14656f = storyItem;
        this.f14653b = j3;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i7 = this.f14652a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f14656f;
        gs gsVar = this.f14655e;
        switch (i7) {
            case 0:
                sa saVar = (sa) gsVar;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f14654c;
                long j3 = this.f14653b;
                if (!z10) {
                    fi.c1.X = new fi.c1(saVar.f15388b, saVar.f15392c, storyItem, j3, storyItem.f28673id, z10, inputGroupCall, true, this.d);
                }
                na naVar = saVar.G;
                if (naVar != null) {
                    naVar.f(false);
                }
                saVar.G = null;
                saVar.K = 0;
                RectF rectF = saVar.I;
                Point point = org.telegram.messenger.g0.f24046q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                saVar.H = org.telegram.messenger.g0.L(8.0f);
                saVar.p(true);
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                T.getOrCreateStoryViewer().L(saVar.f15388b, storyItem, null);
                ls.f(saVar.f15392c).k(176, Long.valueOf(inputGroupCall.f28451id));
                return;
            default:
                cx cxVar = (cx) gsVar;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f14653b;
                boolean z11 = this.f14654c;
                if (chat != null) {
                    if (org.telegram.messenger.v3.r0(chat)) {
                        cxVar.getMessagesController().X(0, j10, z11);
                    } else {
                        cxVar.getMessagesController().g0(-j10, cxVar.getMessagesController().c2(Long.valueOf(cxVar.getUserConfig().e())), null, z11, z11);
                    }
                } else {
                    cxVar.getMessagesController().X(0, j10, z11);
                    if (user != null && user.bot && this.d) {
                        cxVar.getMessagesController().w(user.f28583id);
                    }
                }
                cxVar.getMessagesController().J(cxVar.Y2);
                return;
        }
    }

    public f9(cx cxVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.f14655e = cxVar;
        this.f14656f = chat;
        this.f14653b = j3;
        this.f14654c = z10;
        this.h = user;
        this.d = z11;
    }
}
