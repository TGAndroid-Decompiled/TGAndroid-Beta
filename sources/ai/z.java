package ai;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import bi.r9;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vr0;
import s4.c1;
import zh.a5;
import zh.h5;
import zh.s4;
public class z extends dl0 {
    public final Context f475c;
    public a5 e;
    public z f476f;
    public t7 h;
    public boolean f478r;
    public final a0 f479s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f477n = new ArrayList();

    public z(a0 a0Var, Context context) {
        this.f479s = a0Var;
        this.f475c = context;
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
        a5 a5Var = this.e;
        if (a5Var == null || i10 < 0 || i10 >= a5Var.f48240i.size() || (messageObject = (MessageObject) this.e.f48240i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = vl0Var.getChildAt(0).getMeasuredHeight();
        z zVar = this.f476f;
        a0 a0Var = this.f479s;
        if (this == zVar) {
            i10 = a0Var.e;
        } else {
            i10 = a0Var.d;
        }
        int ceil = (int) (Math.ceil(h() / i10) * measuredHeight);
        int measuredHeight2 = vl0Var.getMeasuredHeight() - vl0Var.getPaddingTop();
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
        vr0 vr0Var = this.f479s.W;
        a5 a5Var = this.e;
        if (a5Var != null) {
            if (a5Var instanceof s4) {
                TLRPC.User user = MessagesController.getInstance(vr0Var.f443b).getUser(Long.valueOf(vr0Var.d));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < a5Var.f48240i.size()) {
                return this.e.m(((MessageObject) this.e.f48240i.get(i10)).getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.e != null) {
            a0 a0Var = this.f479s;
            if ((!a0Var.I || (a0Var.H && h() > 1)) && h() > 0) {
                boolean z10 = false;
                if (h() < 5) {
                    int max = Math.max(1, h());
                    a0Var.d = max;
                    if (max == 1) {
                        z10 = true;
                    }
                    a0Var.H = z10;
                } else if (a0Var.H || a0Var.d == 1) {
                    a0Var.H = false;
                    a0Var.d = Math.max(2, SharedConfig.storiesColumnsCount);
                }
                a0Var.h.y1(a0Var.d);
                a0Var.I = true;
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
        a5 a5Var = this.e;
        boolean z10 = a5Var instanceof s4;
        a0 a0Var = this.f479s;
        if (z10) {
            s4 s4Var = (s4) a5Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.e.f48237c).getStoriesController().E(a0Var.W.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    h5 h5Var = (h5) E.get(i10);
                    r9 r9Var = h5Var.f48473c;
                    if (r9Var != null && !r9Var.f3574g && TextUtils.equals(r9Var.K0, s4Var.E)) {
                        arrayList.add(h5Var);
                    }
                }
            }
        }
        super.l();
        z zVar = this.f476f;
        if (zVar != null) {
            zVar.l();
        }
        if (this != a0Var.f418w) {
            M();
            a0Var.c();
        }
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        if (this.e != null) {
            View view = c1Var.f41610a;
            if (!(view instanceof u7)) {
                return;
            }
            u7 u7Var = (u7) view;
            u7Var.f20499d0 = true;
            a0 a0Var = this.f479s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                h5 h5Var = (h5) arrayList.get(i10);
                u7Var.f20502f0 = false;
                if (h5Var.K == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = h5Var.f48471a;
                    int i14 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i14;
                    tL_storyItem.f17435id = i14;
                    tL_storyItem.attachPath = h5Var.f48474f;
                    MessageObject messageObject = new MessageObject(this.e.f48237c, tL_storyItem);
                    h5Var.K = messageObject;
                    messageObject.uploadingStory = h5Var;
                }
                MessageObject messageObject2 = h5Var.K;
                if (this == this.f476f) {
                    i13 = a0Var.e;
                } else {
                    i13 = a0Var.d;
                }
                u7Var.k(messageObject2, i13, false);
                u7Var.f20499d0 = true;
                u7Var.setReorder(false);
                u7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size >= 0 && size < this.e.f48240i.size()) {
                MessageObject messageObject3 = (MessageObject) this.e.f48240i.get(size);
                if (messageObject3 != null && this.e.m(messageObject3.getId())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u7Var.f20502f0 = z10;
                u7Var.setReorder(true);
                if (this == this.f476f) {
                    i12 = a0Var.e;
                } else {
                    i12 = a0Var.d;
                }
                u7Var.k(messageObject3, i12, false);
                vr0 vr0Var = a0Var.W;
                if (vr0Var.G.C1 && messageObject3 != null) {
                    u7Var.i(vr0Var.c(messageObject3), true);
                    return;
                } else {
                    u7Var.i(false, false);
                    return;
                }
            }
            u7Var.f20502f0 = false;
            if (this == this.f476f) {
                i11 = a0Var.e;
            } else {
                i11 = a0Var.d;
            }
            u7Var.k(null, i11, false);
            u7Var.f20499d0 = true;
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        vr0 vr0Var = this.f479s.W;
        if (this.h == null) {
            this.h = new t7(viewGroup.getContext(), vr0Var.f444c);
        }
        u7 u7Var = new u7(this.f475c, this.h, vr0Var.f443b);
        u7Var.f20522w0 = true;
        u7Var.setGradientView(null);
        u7Var.f20499d0 = true;
        return new c1(u7Var);
    }

    @Override
    public final void I() {
    }
}
