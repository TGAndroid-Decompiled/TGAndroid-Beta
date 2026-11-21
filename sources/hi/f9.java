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
public final class f9 implements Runnable {
    public final int f14649a = 0;
    public final long f14650b;
    public final boolean f14651c;
    public final boolean d;
    public final fs f14652e;
    public final TLObject f14653f;
    public final TLObject h;

    public f9(sa saVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.f14652e = saVar;
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
        fs fsVar = this.f14652e;
        switch (i7) {
            case 0:
                sa saVar = (sa) fsVar;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f14651c;
                long j3 = this.f14650b;
                if (!z10) {
                    fi.c1.X = new fi.c1(saVar.f15385b, saVar.f15389c, storyItem, j3, storyItem.f28670id, z10, inputGroupCall, true, this.d);
                }
                na naVar = saVar.G;
                if (naVar != null) {
                    naVar.f(false);
                }
                saVar.G = null;
                saVar.K = 0;
                RectF rectF = saVar.I;
                Point point = org.telegram.messenger.g0.f24146q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                saVar.H = org.telegram.messenger.g0.L(8.0f);
                saVar.p(true);
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                T.getOrCreateStoryViewer().L(saVar.f15385b, storyItem, null);
                ks.f(saVar.f15389c).k(176, Long.valueOf(inputGroupCall.f28448id));
                return;
            default:
                cx cxVar = (cx) fsVar;
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
                        cxVar.getMessagesController().w(user.f28580id);
                    }
                }
                cxVar.getMessagesController().J(cxVar.Y2);
                return;
        }
    }

    public f9(cx cxVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.f14652e = cxVar;
        this.f14653f = chat;
        this.f14650b = j3;
        this.f14651c = z10;
        this.h = user;
        this.d = z11;
    }
}
