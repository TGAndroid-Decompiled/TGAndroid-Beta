package hi;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;
public final class g9 implements Runnable {
    public final int f14697a = 0;
    public final long f14698b;
    public final boolean f14699c;
    public final boolean d;
    public final fs f14700e;
    public final TLObject f14701f;
    public final TLObject h;

    public g9(ta taVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.f14700e = taVar;
        this.f14699c = z10;
        this.f14701f = storyItem;
        this.f14698b = j3;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i7 = this.f14697a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f14701f;
        fs fsVar = this.f14700e;
        switch (i7) {
            case 0:
                ta taVar = (ta) fsVar;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f14699c;
                long j3 = this.f14698b;
                if (!z10) {
                    fi.c1.X = new fi.c1(taVar.f15424b, taVar.f15428c, storyItem, j3, storyItem.f28642id, z10, inputGroupCall, true, this.d);
                }
                oa oaVar = taVar.G;
                if (oaVar != null) {
                    oaVar.f(false);
                }
                taVar.G = null;
                taVar.K = 0;
                RectF rectF = taVar.I;
                Point point = org.telegram.messenger.g0.f24118q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                taVar.H = org.telegram.messenger.g0.L(8.0f);
                taVar.p(true);
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                T.getOrCreateStoryViewer().L(taVar.f15424b, storyItem, null);
                ks.f(taVar.f15428c).k(176, Long.valueOf(inputGroupCall.f28420id));
                return;
            default:
                cx cxVar = (cx) fsVar;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f14698b;
                boolean z11 = this.f14699c;
                if (chat != null) {
                    if (org.telegram.messenger.v3.r0(chat)) {
                        cxVar.getMessagesController().X(0, j10, z11);
                    } else {
                        cxVar.getMessagesController().g0(-j10, cxVar.getMessagesController().c2(Long.valueOf(cxVar.getUserConfig().e())), null, z11, z11);
                    }
                } else {
                    cxVar.getMessagesController().X(0, j10, z11);
                    if (user != null && user.bot && this.d) {
                        cxVar.getMessagesController().w(user.f28552id);
                    }
                }
                cxVar.getMessagesController().J(cxVar.Y2);
                return;
        }
    }

    public g9(cx cxVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.f14700e = cxVar;
        this.f14701f = chat;
        this.f14698b = j3;
        this.f14699c = z10;
        this.h = user;
        this.d = z11;
    }
}
