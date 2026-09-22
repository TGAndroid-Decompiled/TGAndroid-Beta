package bi;

import ai.d9;
import ai.k9;
import ai.t8;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import ci.o8;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.tk0;
import s4.c1;
public class t extends tk0 {
    public final Context f3582c;
    public d9 e;
    public t f3583f;
    public s7 h;
    public boolean f3585r;
    public final u f3586s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f3584n = new ArrayList();

    public t(u uVar, Context context) {
        this.f3586s = uVar;
        this.f3582c = context;
        M();
    }

    @Override
    public final boolean D(c1 c1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        d9 d9Var = this.e;
        if (d9Var == null || i10 < 0 || i10 >= d9Var.f718i.size() || (messageObject = (MessageObject) this.e.f718i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override
    public final void G(ll0 ll0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = ll0Var.getChildAt(0).getMeasuredHeight();
        t tVar = this.f3583f;
        u uVar = this.f3586s;
        if (this == tVar) {
            i10 = uVar.e;
        } else {
            i10 = uVar.d;
        }
        int ceil = (int) (Math.ceil(h() / i10) * measuredHeight);
        int measuredHeight2 = ll0Var.getMeasuredHeight() - ll0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
            return;
        }
        float f10 = f7 * (ceil - measuredHeight2);
        iArr[0] = ((int) (f10 / measuredHeight)) * i10;
        iArr[1] = ((int) f10) % measuredHeight;
    }

    public final boolean L(int i10) {
        mr0 mr0Var = this.f3586s.W;
        d9 d9Var = this.e;
        if (d9Var != null) {
            if (d9Var instanceof t8) {
                TLRPC.User user = MessagesController.getInstance(mr0Var.f3605b).getUser(Long.valueOf(mr0Var.d));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < d9Var.f718i.size()) {
                return this.e.m(((MessageObject) this.e.f718i.get(i10)).getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.e != null) {
            u uVar = this.f3586s;
            if ((!uVar.I || (uVar.H && h() > 1)) && h() > 0) {
                boolean z10 = false;
                if (h() < 5) {
                    int max = Math.max(1, h());
                    uVar.d = max;
                    if (max == 1) {
                        z10 = true;
                    }
                    uVar.H = z10;
                } else if (uVar.H || uVar.d == 1) {
                    uVar.H = false;
                    uVar.d = Math.max(2, SharedConfig.storiesColumnsCount);
                }
                uVar.h.y1(uVar.d);
                uVar.I = true;
            }
        }
    }

    @Override
    public final int h() {
        if (this.e == null) {
            return 0;
        }
        return this.e.g() + this.d.size();
    }

    @Override
    public final int j(int i10) {
        return 19;
    }

    @Override
    public final int k() {
        return h();
    }

    @Override
    public void l() {
        d9 d9Var = this.e;
        boolean z10 = d9Var instanceof t8;
        u uVar = this.f3586s;
        if (z10) {
            t8 t8Var = (t8) d9Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.e.f715c).getStoriesController().E(uVar.W.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    k9 k9Var = (k9) E.get(i10);
                    o8 o8Var = k9Var.f1140c;
                    if (o8Var != null && !o8Var.f5154g && TextUtils.equals(o8Var.K0, t8Var.E)) {
                        arrayList.add(k9Var);
                    }
                }
            }
        }
        super.l();
        t tVar = this.f3583f;
        if (tVar != null) {
            tVar.l();
        }
        if (this != uVar.f3595w) {
            M();
            uVar.c();
        }
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        if (this.e != null) {
            View view = c1Var.f42671a;
            if (!(view instanceof t7)) {
                return;
            }
            t7 t7Var = (t7) view;
            t7Var.f21363d0 = true;
            u uVar = this.f3586s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                k9 k9Var = (k9) arrayList.get(i10);
                t7Var.f21366f0 = false;
                if (k9Var.K == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = k9Var.f1138a;
                    int i14 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i14;
                    tL_storyItem.f18344id = i14;
                    tL_storyItem.attachPath = k9Var.f1141f;
                    MessageObject messageObject = new MessageObject(this.e.f715c, tL_storyItem);
                    k9Var.K = messageObject;
                    messageObject.uploadingStory = k9Var;
                }
                MessageObject messageObject2 = k9Var.K;
                if (this == this.f3583f) {
                    i13 = uVar.e;
                } else {
                    i13 = uVar.d;
                }
                t7Var.k(messageObject2, i13, false);
                t7Var.f21363d0 = true;
                t7Var.setReorder(false);
                t7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size >= 0 && size < this.e.f718i.size()) {
                MessageObject messageObject3 = (MessageObject) this.e.f718i.get(size);
                if (messageObject3 != null && this.e.m(messageObject3.getId())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t7Var.f21366f0 = z10;
                t7Var.setReorder(true);
                if (this == this.f3583f) {
                    i12 = uVar.e;
                } else {
                    i12 = uVar.d;
                }
                t7Var.k(messageObject3, i12, false);
                mr0 mr0Var = uVar.W;
                if (mr0Var.G.C1 && messageObject3 != null) {
                    t7Var.i(mr0Var.c(messageObject3), true);
                    return;
                } else {
                    t7Var.i(false, false);
                    return;
                }
            }
            t7Var.f21366f0 = false;
            if (this == this.f3583f) {
                i11 = uVar.e;
            } else {
                i11 = uVar.d;
            }
            t7Var.k(null, i11, false);
            t7Var.f21363d0 = true;
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        mr0 mr0Var = this.f3586s.W;
        if (this.h == null) {
            this.h = new s7(viewGroup.getContext(), mr0Var.f3606c);
        }
        t7 t7Var = new t7(this.f3582c, this.h, mr0Var.f3605b);
        t7Var.f21386w0 = true;
        t7Var.setGradientView(null);
        t7Var.f21363d0 = true;
        return new c1(t7Var);
    }

    @Override
    public final void I() {
    }
}
