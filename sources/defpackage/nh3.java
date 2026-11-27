package defpackage;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class nh3 implements Runnable {
    public final byte a = 1;
    public final boolean b;
    public final long c;
    public final boolean d;
    public final fn7 e;
    public final TLObject f;
    public final TLObject h;

    public nh3(uj3 uj3Var, TLRPC.Chat chat, long j, boolean z, TLRPC.User user, boolean z2) {
        this.e = uj3Var;
        this.f = chat;
        this.c = j;
        this.b = z;
        this.h = user;
        this.d = z2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f;
        fn7 fn7Var = this.e;
        switch (b) {
            case 0:
                uj3 uj3Var = (uj3) fn7Var;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j = this.c;
                boolean z = this.b;
                if (chat != null) {
                    if (xc2.r0(chat)) {
                        uj3Var.getMessagesController().V(0, j, z);
                    } else {
                        uj3Var.getMessagesController().e0(-j, uj3Var.getMessagesController().X1(Long.valueOf(uj3Var.getUserConfig().e())), null, z, z);
                    }
                } else {
                    uj3Var.getMessagesController().V(0, j, z);
                    if (user != null && user.bot && this.d) {
                        uj3Var.getMessagesController().u(user.id);
                    }
                }
                uj3Var.getMessagesController().H(uj3Var.Y2);
                return;
            default:
                rbb rbbVar = (rbb) fn7Var;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z2 = this.b;
                long j2 = this.c;
                if (!z2) {
                    w96.N = w96.g(rbbVar.b, rbbVar.c, storyItem, j2, storyItem.id, z2, inputGroupCall, true, this.d);
                }
                mbb mbbVar = rbbVar.G;
                if (mbbVar != null) {
                    mbbVar.f(false);
                }
                rbbVar.G = null;
                rbbVar.K = false;
                RectF rectF = rbbVar.I;
                Point point = hl.q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                rbbVar.H = hl.L(8.0f);
                rbbVar.o(true);
                e S = LaunchActivity.S();
                storyItem.dialogId = j2;
                storyItem.justUploaded = true;
                S.getOrCreateStoryViewer().J(rbbVar.b, storyItem, null);
                jn7.f(rbbVar.c).k(177, Long.valueOf(inputGroupCall.id));
                return;
        }
    }

    public nh3(rbb rbbVar, boolean z, TL_stories.StoryItem storyItem, long j, TLRPC.InputGroupCall inputGroupCall, boolean z2) {
        this.e = rbbVar;
        this.b = z;
        this.f = storyItem;
        this.c = j;
        this.h = inputGroupCall;
        this.d = z2;
    }
}
