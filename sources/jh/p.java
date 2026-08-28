package jh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import f2.q1;
import ih.f6;
import ih.n6;
import ih.u6;
import java.util.ArrayList;
import kh.a8;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.q7;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.wk0;
public class p extends gk0 {
    public final Context f14357c;
    public n6 f14358e;
    public p f14359f;
    public q7 h;
    public boolean f14361r;
    public final q f14362s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f14360n = new ArrayList();

    public p(q qVar, Context context) {
        this.f14362s = qVar;
        this.f14357c = context;
        M();
    }

    @Override
    public final boolean D(q1 q1Var) {
        return false;
    }

    @Override
    public final String F(int i9) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        n6 n6Var = this.f14358e;
        if (n6Var == null || i9 < 0 || i9 >= n6Var.f11851i.size() || (messageObject = (MessageObject) this.f14358e.f11851i.get(i9)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        int i9;
        int measuredHeight = wk0Var.getChildAt(0).getMeasuredHeight();
        p pVar = this.f14359f;
        q qVar = this.f14362s;
        if (this == pVar) {
            i9 = qVar.f14366e;
        } else {
            i9 = qVar.d;
        }
        int ceil = (int) (Math.ceil(h() / i9) * measuredHeight);
        int measuredHeight2 = wk0Var.getMeasuredHeight() - wk0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
            return;
        }
        float f11 = f10 * (ceil - measuredHeight2);
        iArr[0] = ((int) (f11 / measuredHeight)) * i9;
        iArr[1] = ((int) f11) % measuredHeight;
    }

    public final boolean L(int i9) {
        uq0 uq0Var = this.f14362s.S;
        n6 n6Var = this.f14358e;
        if (n6Var != null) {
            if (n6Var instanceof f6) {
                TLRPC.User user = MessagesController.getInstance(uq0Var.f14379b).getUser(Long.valueOf(uq0Var.d));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i9 >= 0 && i9 < n6Var.f11851i.size()) {
                return this.f14358e.m(((MessageObject) this.f14358e.f11851i.get(i9)).getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.f14358e != null) {
            q qVar = this.f14362s;
            if ((!qVar.E || (qVar.D && h() > 1)) && h() > 0) {
                boolean z10 = false;
                if (h() < 5) {
                    int max = Math.max(1, h());
                    qVar.d = max;
                    if (max == 1) {
                        z10 = true;
                    }
                    qVar.D = z10;
                } else if (qVar.D || qVar.d == 1) {
                    qVar.D = false;
                    qVar.d = Math.max(2, SharedConfig.storiesColumnsCount);
                }
                qVar.h.y1(qVar.d);
                qVar.E = true;
            }
        }
    }

    @Override
    public final int h() {
        if (this.f14358e == null) {
            return 0;
        }
        return this.f14358e.g() + this.d.size();
    }

    @Override
    public final int j(int i9) {
        return 19;
    }

    @Override
    public final int k() {
        return h();
    }

    @Override
    public void l() {
        n6 n6Var = this.f14358e;
        boolean z10 = n6Var instanceof f6;
        q qVar = this.f14362s;
        if (z10) {
            f6 f6Var = (f6) n6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.f14358e.f11847c).getStoriesController().E(qVar.S.d);
            if (E != null) {
                for (int i9 = 0; i9 < E.size(); i9++) {
                    u6 u6Var = (u6) E.get(i9);
                    a8 a8Var = u6Var.f12193c;
                    if (a8Var != null && !a8Var.f14917g && TextUtils.equals(a8Var.K0, f6Var.E)) {
                        arrayList.add(u6Var);
                    }
                }
            }
        }
        super.l();
        p pVar = this.f14359f;
        if (pVar != null) {
            pVar.l();
        }
        if (this != qVar.f14371w) {
            M();
            qVar.c();
        }
    }

    @Override
    public final void v(q1 q1Var, int i9) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        if (this.f14358e != null) {
            View view = q1Var.f5501a;
            if (!(view instanceof r7)) {
                return;
            }
            r7 r7Var = (r7) view;
            r7Var.W = true;
            q qVar = this.f14362s;
            ArrayList arrayList = this.d;
            if (i9 >= 0 && i9 < arrayList.size()) {
                u6 u6Var = (u6) arrayList.get(i9);
                r7Var.f25093b0 = false;
                if (u6Var.G == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j10 = u6Var.f12191a;
                    int i13 = (int) (j10 ^ (j10 >>> 32));
                    tL_storyItem.messageId = i13;
                    tL_storyItem.f22617id = i13;
                    tL_storyItem.attachPath = u6Var.f12195f;
                    MessageObject messageObject = new MessageObject(this.f14358e.f11847c, tL_storyItem);
                    u6Var.G = messageObject;
                    messageObject.uploadingStory = u6Var;
                }
                MessageObject messageObject2 = u6Var.G;
                if (this == this.f14359f) {
                    i12 = qVar.f14366e;
                } else {
                    i12 = qVar.d;
                }
                r7Var.k(messageObject2, i12, false);
                r7Var.W = true;
                r7Var.setReorder(false);
                r7Var.i(false, false);
                return;
            }
            int size = i9 - arrayList.size();
            if (size >= 0 && size < this.f14358e.f11851i.size()) {
                MessageObject messageObject3 = (MessageObject) this.f14358e.f11851i.get(size);
                if (messageObject3 != null && this.f14358e.m(messageObject3.getId())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r7Var.f25093b0 = z10;
                r7Var.setReorder(true);
                if (this == this.f14359f) {
                    i11 = qVar.f14366e;
                } else {
                    i11 = qVar.d;
                }
                r7Var.k(messageObject3, i11, false);
                uq0 uq0Var = qVar.S;
                if (uq0Var.C.f28178y1 && messageObject3 != null) {
                    r7Var.i(uq0Var.c(messageObject3), true);
                    return;
                } else {
                    r7Var.i(false, false);
                    return;
                }
            }
            r7Var.f25093b0 = false;
            if (this == this.f14359f) {
                i10 = qVar.f14366e;
            } else {
                i10 = qVar.d;
            }
            r7Var.k(null, i10, false);
            r7Var.W = true;
        }
    }

    @Override
    public final q1 x(ViewGroup viewGroup, int i9) {
        uq0 uq0Var = this.f14362s.S;
        if (this.h == null) {
            this.h = new q7(viewGroup.getContext(), uq0Var.f14380c);
        }
        r7 r7Var = new r7(this.f14357c, this.h, uq0Var.f14379b);
        r7Var.f25115s0 = true;
        r7Var.setGradientView(null);
        r7Var.W = true;
        return new q1(r7Var);
    }

    @Override
    public final void I() {
    }
}
