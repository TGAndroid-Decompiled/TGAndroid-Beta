package gi;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.uw;
public final class i9 implements Runnable {
    public final int f12975a = 0;
    public final long f12976b;
    public final boolean f12977c;
    public final boolean d;
    public final cs f12978e;
    public final TLObject f12979f;
    public final TLObject h;

    public i9(va vaVar, boolean z10, TL_stories.StoryItem storyItem, long j10, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.f12978e = vaVar;
        this.f12977c = z10;
        this.f12979f = storyItem;
        this.f12976b = j10;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i3 = this.f12975a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f12979f;
        cs csVar = this.f12978e;
        switch (i3) {
            case 0:
                va vaVar = (va) csVar;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f12977c;
                long j10 = this.f12976b;
                if (!z10) {
                    ei.g1.X = new ei.g1(vaVar.f13702b, vaVar.f13706c, storyItem, j10, storyItem.f27240id, z10, inputGroupCall, true, this.d);
                }
                qa qaVar = vaVar.G;
                if (qaVar != null) {
                    qaVar.f(false);
                }
                vaVar.G = null;
                vaVar.K = 0;
                RectF rectF = vaVar.I;
                Point point = org.telegram.messenger.g0.f22608q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                vaVar.H = org.telegram.messenger.g0.L(8.0f);
                vaVar.p(true);
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                storyItem.dialogId = j10;
                storyItem.justUploaded = true;
                T.getOrCreateStoryViewer().T(vaVar.f13702b, storyItem, null);
                hs.f(vaVar.f13706c).k(176, Long.valueOf(inputGroupCall.f27018id));
                return;
            default:
                uw uwVar = (uw) csVar;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j11 = this.f12976b;
                boolean z11 = this.f12977c;
                if (chat != null) {
                    if (org.telegram.messenger.t3.r0(chat)) {
                        uwVar.getMessagesController().X(0, j11, z11);
                    } else {
                        uwVar.getMessagesController().g0(-j11, uwVar.getMessagesController().a2(Long.valueOf(uwVar.getUserConfig().e())), null, z11, z11);
                    }
                } else {
                    uwVar.getMessagesController().X(0, j11, z11);
                    if (user != null && user.bot && this.d) {
                        uwVar.getMessagesController().w(user.f27150id);
                    }
                }
                uwVar.getMessagesController().J(uwVar.X2);
                return;
        }
    }

    public i9(uw uwVar, TLRPC.Chat chat, long j10, boolean z10, TLRPC.User user, boolean z11) {
        this.f12978e = uwVar;
        this.f12979f = chat;
        this.f12976b = j10;
        this.f12977c = z10;
        this.h = user;
        this.d = z11;
    }
}
