package bi;

import ai.d9;
import ai.k9;
import ai.u8;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import ci.k8;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.zl0;
import s4.c1;
public class t extends gl0 {
    public final Context f3866c;
    public d9 f3867e;
    public t f3868f;
    public s7 h;
    public boolean f3870r;
    public final u f3871s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f3869n = new ArrayList();

    public t(u uVar, Context context) {
        this.f3871s = uVar;
        this.f3866c = context;
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
        d9 d9Var = this.f3867e;
        if (d9Var == null || i10 < 0 || i10 >= d9Var.f789i.size() || (messageObject = (MessageObject) this.f3867e.f789i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override
    public final void G(zl0 zl0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = zl0Var.getChildAt(0).getMeasuredHeight();
        t tVar = this.f3868f;
        u uVar = this.f3871s;
        if (this == tVar) {
            i10 = uVar.f3876e;
        } else {
            i10 = uVar.d;
        }
        int ceil = (int) (Math.ceil(h() / i10) * measuredHeight);
        int measuredHeight2 = zl0Var.getMeasuredHeight() - zl0Var.getPaddingTop();
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
        ds0 ds0Var = this.f3871s.W;
        d9 d9Var = this.f3867e;
        if (d9Var != null) {
            if (d9Var instanceof u8) {
                TLRPC.User user = MessagesController.getInstance(ds0Var.f3891b).getUser(Long.valueOf(ds0Var.d));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < d9Var.f789i.size()) {
                return this.f3867e.m(((MessageObject) this.f3867e.f789i.get(i10)).getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.f3867e != null) {
            u uVar = this.f3871s;
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
        if (this.f3867e == null) {
            return 0;
        }
        return this.f3867e.g() + this.d.size();
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
        d9 d9Var = this.f3867e;
        boolean z10 = d9Var instanceof u8;
        u uVar = this.f3871s;
        if (z10) {
            u8 u8Var = (u8) d9Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.f3867e.f785c).getStoriesController().E(uVar.W.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    k9 k9Var = (k9) E.get(i10);
                    k8 k8Var = k9Var.f1232c;
                    if (k8Var != null && !k8Var.f5325g && TextUtils.equals(k8Var.K0, u8Var.E)) {
                        arrayList.add(k9Var);
                    }
                }
            }
        }
        super.l();
        t tVar = this.f3868f;
        if (tVar != null) {
            tVar.l();
        }
        if (this != uVar.f3881w) {
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
        if (this.f3867e != null) {
            View view = c1Var.f46524a;
            if (!(view instanceof t7)) {
                return;
            }
            t7 t7Var = (t7) view;
            t7Var.f23074d0 = true;
            u uVar = this.f3871s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                k9 k9Var = (k9) arrayList.get(i10);
                t7Var.f23078f0 = false;
                if (k9Var.K == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = k9Var.f1230a;
                    int i14 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i14;
                    tL_storyItem.f20275id = i14;
                    tL_storyItem.attachPath = k9Var.f1234f;
                    MessageObject messageObject = new MessageObject(this.f3867e.f785c, tL_storyItem);
                    k9Var.K = messageObject;
                    messageObject.uploadingStory = k9Var;
                }
                MessageObject messageObject2 = k9Var.K;
                if (this == this.f3868f) {
                    i13 = uVar.f3876e;
                } else {
                    i13 = uVar.d;
                }
                t7Var.k(messageObject2, i13, false);
                t7Var.f23074d0 = true;
                t7Var.setReorder(false);
                t7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size >= 0 && size < this.f3867e.f789i.size()) {
                MessageObject messageObject3 = (MessageObject) this.f3867e.f789i.get(size);
                if (messageObject3 != null && this.f3867e.m(messageObject3.getId())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t7Var.f23078f0 = z10;
                t7Var.setReorder(true);
                if (this == this.f3868f) {
                    i12 = uVar.f3876e;
                } else {
                    i12 = uVar.d;
                }
                t7Var.k(messageObject3, i12, false);
                ds0 ds0Var = uVar.W;
                if (ds0Var.G.C1 && messageObject3 != null) {
                    t7Var.i(ds0Var.c(messageObject3), true);
                    return;
                } else {
                    t7Var.i(false, false);
                    return;
                }
            }
            t7Var.f23078f0 = false;
            if (this == this.f3868f) {
                i11 = uVar.f3876e;
            } else {
                i11 = uVar.d;
            }
            t7Var.k(null, i11, false);
            t7Var.f23074d0 = true;
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        ds0 ds0Var = this.f3871s.W;
        if (this.h == null) {
            this.h = new s7(viewGroup.getContext(), ds0Var.f3892c);
        }
        t7 t7Var = new t7(this.f3866c, this.h, ds0Var.f3891b);
        t7Var.f23098w0 = true;
        t7Var.setGradientView(null);
        t7Var.f23074d0 = true;
        return new c1(t7Var);
    }

    @Override
    public final void I() {
    }
}
