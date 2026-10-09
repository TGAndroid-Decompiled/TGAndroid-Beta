package bi;

import ai.e9;
import ai.l9;
import ai.v8;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import ci.l8;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.qs0;
import org.telegram.ui.Components.yl0;
import s4.d1;
public class t extends yl0 {
    public final Context f3916c;
    public e9 f3917e;
    public t f3918f;
    public s7 h;
    public boolean f3920r;
    public final u f3921s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f3919n = new ArrayList();

    public t(u uVar, Context context) {
        this.f3921s = uVar;
        this.f3916c = context;
        M();
    }

    @Override
    public final boolean D(d1 d1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        e9 e9Var = this.f3917e;
        if (e9Var == null || i10 < 0 || i10 >= e9Var.f899i.size() || (messageObject = (MessageObject) this.f3917e.f899i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override
    public final void G(qm0 qm0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = qm0Var.getChildAt(0).getMeasuredHeight();
        t tVar = this.f3918f;
        u uVar = this.f3921s;
        if (this == tVar) {
            i10 = uVar.f3926e;
        } else {
            i10 = uVar.d;
        }
        int ceil = (int) (Math.ceil(h() / i10) * measuredHeight);
        int measuredHeight2 = qm0Var.getMeasuredHeight() - qm0Var.getPaddingTop();
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
        qs0 qs0Var = this.f3921s.W;
        e9 e9Var = this.f3917e;
        if (e9Var != null) {
            if (e9Var instanceof v8) {
                TLRPC.User user = MessagesController.getInstance(qs0Var.f3941b).getUser(Long.valueOf(qs0Var.d));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < e9Var.f899i.size()) {
                return this.f3917e.m(((MessageObject) this.f3917e.f899i.get(i10)).getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.f3917e != null) {
            u uVar = this.f3921s;
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
        if (this.f3917e == null) {
            return 0;
        }
        return this.f3917e.g() + this.d.size();
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
        e9 e9Var = this.f3917e;
        boolean z10 = e9Var instanceof v8;
        u uVar = this.f3921s;
        if (z10) {
            v8 v8Var = (v8) e9Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.f3917e.f895c).getStoriesController().E(uVar.W.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    l9 l9Var = (l9) E.get(i10);
                    l8 l8Var = l9Var.f1351c;
                    if (l8Var != null && !l8Var.f5410g && TextUtils.equals(l8Var.K0, v8Var.E)) {
                        arrayList.add(l9Var);
                    }
                }
            }
        }
        super.l();
        t tVar = this.f3918f;
        if (tVar != null) {
            tVar.l();
        }
        if (this != uVar.f3931w) {
            M();
            uVar.c();
        }
    }

    @Override
    public final void v(d1 d1Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        if (this.f3917e != null) {
            View view = d1Var.f47658a;
            if (!(view instanceof t7)) {
                return;
            }
            t7 t7Var = (t7) view;
            t7Var.f23067d0 = true;
            u uVar = this.f3921s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                l9 l9Var = (l9) arrayList.get(i10);
                t7Var.f23071f0 = false;
                if (l9Var.K == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = l9Var.f1349a;
                    int i14 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i14;
                    tL_storyItem.f20275id = i14;
                    tL_storyItem.attachPath = l9Var.f1353f;
                    MessageObject messageObject = new MessageObject(this.f3917e.f895c, tL_storyItem);
                    l9Var.K = messageObject;
                    messageObject.uploadingStory = l9Var;
                }
                MessageObject messageObject2 = l9Var.K;
                if (this == this.f3918f) {
                    i13 = uVar.f3926e;
                } else {
                    i13 = uVar.d;
                }
                t7Var.k(messageObject2, i13, false);
                t7Var.f23067d0 = true;
                t7Var.setReorder(false);
                t7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size >= 0 && size < this.f3917e.f899i.size()) {
                MessageObject messageObject3 = (MessageObject) this.f3917e.f899i.get(size);
                if (messageObject3 != null && this.f3917e.m(messageObject3.getId())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t7Var.f23071f0 = z10;
                t7Var.setReorder(true);
                if (this == this.f3918f) {
                    i12 = uVar.f3926e;
                } else {
                    i12 = uVar.d;
                }
                t7Var.k(messageObject3, i12, false);
                qs0 qs0Var = uVar.W;
                if (qs0Var.G.C1 && messageObject3 != null) {
                    t7Var.i(qs0Var.c(messageObject3), true);
                    return;
                } else {
                    t7Var.i(false, false);
                    return;
                }
            }
            t7Var.f23071f0 = false;
            if (this == this.f3918f) {
                i11 = uVar.f3926e;
            } else {
                i11 = uVar.d;
            }
            t7Var.k(null, i11, false);
            t7Var.f23067d0 = true;
        }
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i10) {
        qs0 qs0Var = this.f3921s.W;
        if (this.h == null) {
            this.h = new s7(viewGroup.getContext(), qs0Var.f3942c);
        }
        t7 t7Var = new t7(this.f3916c, this.h, qs0Var.f3941b);
        t7Var.f23091w0 = true;
        t7Var.setGradientView(null);
        t7Var.f23067d0 = true;
        return new d1(t7Var);
    }

    @Override
    public final void I() {
    }
}
