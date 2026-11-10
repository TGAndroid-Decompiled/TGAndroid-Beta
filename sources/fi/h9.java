package fi;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zw;
public final class h9 implements Runnable {
    public final int f12146a = 0;
    public final long f12147b;
    public final boolean f12148c;
    public final boolean d;
    public final ls f12149e;
    public final TLObject f12150f;
    public final TLObject h;

    public h9(va vaVar, boolean z9, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z10) {
        this.f12149e = vaVar;
        this.f12148c = z9;
        this.f12150f = storyItem;
        this.f12147b = j3;
        this.h = inputGroupCall;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i7 = this.f12146a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f12150f;
        ls lsVar = this.f12149e;
        switch (i7) {
            case 0:
                va vaVar = (va) lsVar;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z9 = this.f12148c;
                long j3 = this.f12147b;
                if (!z9) {
                    di.g1.W = new di.g1(vaVar.f12940b, vaVar.f12944c, storyItem, j3, storyItem.f27199id, z9, inputGroupCall, true, this.d);
                }
                qa qaVar = vaVar.F;
                if (qaVar != null) {
                    qaVar.f(false);
                }
                vaVar.F = null;
                vaVar.J = 0;
                RectF rectF = vaVar.H;
                Point point = org.telegram.messenger.g0.f22567q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                vaVar.G = org.telegram.messenger.g0.L(8.0f);
                vaVar.p(true);
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                T.getOrCreateStoryViewer().L(vaVar.f12940b, storyItem, null);
                qs.f(vaVar.f12944c).k(176, Long.valueOf(inputGroupCall.f26977id));
                return;
            default:
                zw zwVar = (zw) lsVar;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f12147b;
                boolean z10 = this.f12148c;
                if (chat != null) {
                    if (org.telegram.messenger.t3.r0(chat)) {
                        zwVar.getMessagesController().X(0, j10, z10);
                    } else {
                        zwVar.getMessagesController().g0(-j10, zwVar.getMessagesController().a2(Long.valueOf(zwVar.getUserConfig().e())), null, z10, z10);
                    }
                } else {
                    zwVar.getMessagesController().X(0, j10, z10);
                    if (user != null && user.bot && this.d) {
                        zwVar.getMessagesController().w(user.f27109id);
                    }
                }
                zwVar.getMessagesController().J(zwVar.X2);
                return;
        }
    }

    public h9(zw zwVar, TLRPC.Chat chat, long j3, boolean z9, TLRPC.User user, boolean z10) {
        this.f12149e = zwVar;
        this.f12150f = chat;
        this.f12147b = j3;
        this.f12148c = z9;
        this.h = user;
        this.d = z10;
    }
}
