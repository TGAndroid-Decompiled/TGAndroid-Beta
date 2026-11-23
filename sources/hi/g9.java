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
public final class g9 implements Runnable {
    public final int f14649a = 0;
    public final long f14650b;
    public final boolean f14651c;
    public final boolean d;
    public final gs f14652e;
    public final TLObject f14653f;
    public final TLObject h;

    public g9(ta taVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.f14652e = taVar;
        this.f14651c = z10;
        this.f14653f = storyItem;
        this.f14650b = j3;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i7 = this.f14649a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f14653f;
        gs gsVar = this.f14652e;
        switch (i7) {
            case 0:
                ta taVar = (ta) gsVar;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f14651c;
                long j3 = this.f14650b;
                if (!z10) {
                    fi.c1.X = new fi.c1(taVar.f15391b, taVar.f15395c, storyItem, j3, storyItem.f28637id, z10, inputGroupCall, true, this.d);
                }
                oa oaVar = taVar.G;
                if (oaVar != null) {
                    oaVar.f(false);
                }
                taVar.G = null;
                taVar.K = 0;
                RectF rectF = taVar.I;
                Point point = org.telegram.messenger.g0.f24010q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                taVar.H = org.telegram.messenger.g0.L(8.0f);
                taVar.p(true);
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                T.getOrCreateStoryViewer().L(taVar.f15391b, storyItem, null);
                ls.f(taVar.f15395c).k(176, Long.valueOf(inputGroupCall.f28415id));
                return;
            default:
                cx cxVar = (cx) gsVar;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f14650b;
                boolean z11 = this.f14651c;
                if (chat != null) {
                    if (org.telegram.messenger.v3.r0(chat)) {
                        cxVar.getMessagesController().X(0, j10, z11);
                    } else {
                        cxVar.getMessagesController().g0(-j10, cxVar.getMessagesController().c2(Long.valueOf(cxVar.getUserConfig().e())), null, z11, z11);
                    }
                } else {
                    cxVar.getMessagesController().X(0, j10, z11);
                    if (user != null && user.bot && this.d) {
                        cxVar.getMessagesController().w(user.f28547id);
                    }
                }
                cxVar.getMessagesController().J(cxVar.Y2);
                return;
        }
    }

    public g9(cx cxVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.f14652e = cxVar;
        this.f14653f = chat;
        this.f14650b = j3;
        this.f14651c = z10;
        this.h = user;
        this.d = z11;
    }
}
