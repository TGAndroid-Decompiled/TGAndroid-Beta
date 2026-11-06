package fi;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ww;
public final class i9 implements Runnable {
    public final int f12184a = 0;
    public final long f12185b;
    public final boolean f12186c;
    public final boolean d;
    public final ls f12187e;
    public final TLObject f12188f;
    public final TLObject h;

    public i9(va vaVar, boolean z9, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z10) {
        this.f12187e = vaVar;
        this.f12186c = z9;
        this.f12188f = storyItem;
        this.f12185b = j3;
        this.h = inputGroupCall;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i7 = this.f12184a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f12188f;
        ls lsVar = this.f12187e;
        switch (i7) {
            case 0:
                va vaVar = (va) lsVar;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z9 = this.f12186c;
                long j3 = this.f12185b;
                if (!z9) {
                    di.g1.W = new di.g1(vaVar.f12938b, vaVar.f12942c, storyItem, j3, storyItem.f27191id, z9, inputGroupCall, true, this.d);
                }
                qa qaVar = vaVar.F;
                if (qaVar != null) {
                    qaVar.f(false);
                }
                vaVar.F = null;
                vaVar.J = 0;
                RectF rectF = vaVar.H;
                Point point = org.telegram.messenger.g0.f22537q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                vaVar.G = org.telegram.messenger.g0.L(8.0f);
                vaVar.p(true);
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                T.getOrCreateStoryViewer().L(vaVar.f12938b, storyItem, null);
                qs.f(vaVar.f12942c).k(176, Long.valueOf(inputGroupCall.f26969id));
                return;
            default:
                ww wwVar = (ww) lsVar;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f12185b;
                boolean z10 = this.f12186c;
                if (chat != null) {
                    if (org.telegram.messenger.t3.r0(chat)) {
                        wwVar.getMessagesController().X(0, j10, z10);
                    } else {
                        wwVar.getMessagesController().g0(-j10, wwVar.getMessagesController().a2(Long.valueOf(wwVar.getUserConfig().e())), null, z10, z10);
                    }
                } else {
                    wwVar.getMessagesController().X(0, j10, z10);
                    if (user != null && user.bot && this.d) {
                        wwVar.getMessagesController().w(user.f27101id);
                    }
                }
                wwVar.getMessagesController().J(wwVar.W2);
                return;
        }
    }

    public i9(ww wwVar, TLRPC.Chat chat, long j3, boolean z9, TLRPC.User user, boolean z10) {
        this.f12187e = wwVar;
        this.f12188f = chat;
        this.f12185b = j3;
        this.f12186c = z9;
        this.h = user;
        this.d = z10;
    }
}
