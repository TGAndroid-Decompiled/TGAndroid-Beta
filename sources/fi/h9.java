package fi;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yw;
public final class h9 implements Runnable {
    public final int f12142a = 0;
    public final long f12143b;
    public final boolean f12144c;
    public final boolean d;
    public final ls f12145e;
    public final TLObject f12146f;
    public final TLObject h;

    public h9(va vaVar, boolean z9, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z10) {
        this.f12145e = vaVar;
        this.f12144c = z9;
        this.f12146f = storyItem;
        this.f12143b = j3;
        this.h = inputGroupCall;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i7 = this.f12142a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f12146f;
        ls lsVar = this.f12145e;
        switch (i7) {
            case 0:
                va vaVar = (va) lsVar;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z9 = this.f12144c;
                long j3 = this.f12143b;
                if (!z9) {
                    di.g1.W = new di.g1(vaVar.f12938b, vaVar.f12942c, storyItem, j3, storyItem.f27195id, z9, inputGroupCall, true, this.d);
                }
                qa qaVar = vaVar.F;
                if (qaVar != null) {
                    qaVar.f(false);
                }
                vaVar.F = null;
                vaVar.J = 0;
                RectF rectF = vaVar.H;
                Point point = org.telegram.messenger.g0.f22563q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                vaVar.G = org.telegram.messenger.g0.L(8.0f);
                vaVar.p(true);
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                T.getOrCreateStoryViewer().L(vaVar.f12938b, storyItem, null);
                qs.f(vaVar.f12942c).k(176, Long.valueOf(inputGroupCall.f26973id));
                return;
            default:
                yw ywVar = (yw) lsVar;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f12143b;
                boolean z10 = this.f12144c;
                if (chat != null) {
                    if (org.telegram.messenger.t3.r0(chat)) {
                        ywVar.getMessagesController().X(0, j10, z10);
                    } else {
                        ywVar.getMessagesController().g0(-j10, ywVar.getMessagesController().a2(Long.valueOf(ywVar.getUserConfig().e())), null, z10, z10);
                    }
                } else {
                    ywVar.getMessagesController().X(0, j10, z10);
                    if (user != null && user.bot && this.d) {
                        ywVar.getMessagesController().w(user.f27105id);
                    }
                }
                ywVar.getMessagesController().J(ywVar.X2);
                return;
        }
    }

    public h9(yw ywVar, TLRPC.Chat chat, long j3, boolean z9, TLRPC.User user, boolean z10) {
        this.f12145e = ywVar;
        this.f12146f = chat;
        this.f12143b = j3;
        this.f12144c = z9;
        this.h = user;
        this.d = z10;
    }
}
