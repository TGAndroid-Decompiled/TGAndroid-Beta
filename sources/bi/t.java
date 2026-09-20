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
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.xr0;
import s4.c1;
public class t extends dl0 {
    public final Context f3585c;
    public d9 e;
    public t f3586f;
    public t7 h;
    public boolean f3588r;
    public final u f3589s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f3587n = new ArrayList();

    public t(u uVar, Context context) {
        this.f3589s = uVar;
        this.f3585c = context;
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
        if (d9Var == null || i10 < 0 || i10 >= d9Var.f721i.size() || (messageObject = (MessageObject) this.e.f721i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = vl0Var.getChildAt(0).getMeasuredHeight();
        t tVar = this.f3586f;
        u uVar = this.f3589s;
        if (this == tVar) {
            i10 = uVar.e;
        } else {
            i10 = uVar.d;
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
        xr0 xr0Var = this.f3589s.W;
        d9 d9Var = this.e;
        if (d9Var != null) {
            if (d9Var instanceof t8) {
                TLRPC.User user = MessagesController.getInstance(xr0Var.f3608b).getUser(Long.valueOf(xr0Var.d));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < d9Var.f721i.size()) {
                return this.e.m(((MessageObject) this.e.f721i.get(i10)).getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.e != null) {
            u uVar = this.f3589s;
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
        u uVar = this.f3589s;
        if (z10) {
            t8 t8Var = (t8) d9Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.e.f718c).getStoriesController().E(uVar.W.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    k9 k9Var = (k9) E.get(i10);
                    o8 o8Var = k9Var.f1143c;
                    if (o8Var != null && !o8Var.f5158g && TextUtils.equals(o8Var.K0, t8Var.E)) {
                        arrayList.add(k9Var);
                    }
                }
            }
        }
        super.l();
        t tVar = this.f3586f;
        if (tVar != null) {
            tVar.l();
        }
        if (this != uVar.f3598w) {
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
            View view = c1Var.f42974a;
            if (!(view instanceof u7)) {
                return;
            }
            u7 u7Var = (u7) view;
            u7Var.f21625d0 = true;
            u uVar = this.f3589s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                k9 k9Var = (k9) arrayList.get(i10);
                u7Var.f21628f0 = false;
                if (k9Var.K == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = k9Var.f1141a;
                    int i14 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i14;
                    tL_storyItem.f18563id = i14;
                    tL_storyItem.attachPath = k9Var.f1144f;
                    MessageObject messageObject = new MessageObject(this.e.f718c, tL_storyItem);
                    k9Var.K = messageObject;
                    messageObject.uploadingStory = k9Var;
                }
                MessageObject messageObject2 = k9Var.K;
                if (this == this.f3586f) {
                    i13 = uVar.e;
                } else {
                    i13 = uVar.d;
                }
                u7Var.k(messageObject2, i13, false);
                u7Var.f21625d0 = true;
                u7Var.setReorder(false);
                u7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size >= 0 && size < this.e.f721i.size()) {
                MessageObject messageObject3 = (MessageObject) this.e.f721i.get(size);
                if (messageObject3 != null && this.e.m(messageObject3.getId())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u7Var.f21628f0 = z10;
                u7Var.setReorder(true);
                if (this == this.f3586f) {
                    i12 = uVar.e;
                } else {
                    i12 = uVar.d;
                }
                u7Var.k(messageObject3, i12, false);
                xr0 xr0Var = uVar.W;
                if (xr0Var.G.C1 && messageObject3 != null) {
                    u7Var.i(xr0Var.c(messageObject3), true);
                    return;
                } else {
                    u7Var.i(false, false);
                    return;
                }
            }
            u7Var.f21628f0 = false;
            if (this == this.f3586f) {
                i11 = uVar.e;
            } else {
                i11 = uVar.d;
            }
            u7Var.k(null, i11, false);
            u7Var.f21625d0 = true;
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        xr0 xr0Var = this.f3589s.W;
        if (this.h == null) {
            this.h = new t7(viewGroup.getContext(), xr0Var.f3609c);
        }
        u7 u7Var = new u7(this.f3585c, this.h, xr0Var.f3608b);
        u7Var.f21648w0 = true;
        u7Var.setGradientView(null);
        u7Var.f21625d0 = true;
        return new c1(u7Var);
    }

    @Override
    public final void I() {
    }
}
