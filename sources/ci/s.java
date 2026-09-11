package ci;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import bi.b8;
import bi.l8;
import bi.t8;
import di.o8;
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
import org.telegram.ui.Components.lr0;
import org.telegram.ui.Components.tk0;
import s4.c1;
public class s extends tk0 {
    public final Context f4824c;
    public l8 f4825e;
    public s f4826f;
    public s7 h;
    public boolean f4828r;
    public final t f4829s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f4827n = new ArrayList();

    public s(t tVar, Context context) {
        this.f4829s = tVar;
        this.f4824c = context;
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
        l8 l8Var = this.f4825e;
        if (l8Var == null || i10 < 0 || i10 >= l8Var.f3275i.size() || (messageObject = (MessageObject) this.f4825e.f3275i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override
    public final void G(ll0 ll0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = ll0Var.getChildAt(0).getMeasuredHeight();
        s sVar = this.f4826f;
        t tVar = this.f4829s;
        if (this == sVar) {
            i10 = tVar.f4834e;
        } else {
            i10 = tVar.d;
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
        lr0 lr0Var = this.f4829s.W;
        l8 l8Var = this.f4825e;
        if (l8Var != null) {
            if (l8Var instanceof b8) {
                TLRPC.User user = MessagesController.getInstance(lr0Var.f4849b).getUser(Long.valueOf(lr0Var.d));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < l8Var.f3275i.size()) {
                return this.f4825e.m(((MessageObject) this.f4825e.f3275i.get(i10)).getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.f4825e != null) {
            t tVar = this.f4829s;
            if ((!tVar.I || (tVar.H && h() > 1)) && h() > 0) {
                boolean z10 = false;
                if (h() < 5) {
                    int max = Math.max(1, h());
                    tVar.d = max;
                    if (max == 1) {
                        z10 = true;
                    }
                    tVar.H = z10;
                } else if (tVar.H || tVar.d == 1) {
                    tVar.H = false;
                    tVar.d = Math.max(2, SharedConfig.storiesColumnsCount);
                }
                tVar.h.y1(tVar.d);
                tVar.I = true;
            }
        }
    }

    @Override
    public final int h() {
        if (this.f4825e == null) {
            return 0;
        }
        return this.f4825e.g() + this.d.size();
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
        l8 l8Var = this.f4825e;
        boolean z10 = l8Var instanceof b8;
        t tVar = this.f4829s;
        if (z10) {
            b8 b8Var = (b8) l8Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.f4825e.f3271c).getStoriesController().E(tVar.W.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    t8 t8Var = (t8) E.get(i10);
                    o8 o8Var = t8Var.f3740c;
                    if (o8Var != null && !o8Var.f7756g && TextUtils.equals(o8Var.K0, b8Var.E)) {
                        arrayList.add(t8Var);
                    }
                }
            }
        }
        super.l();
        s sVar = this.f4826f;
        if (sVar != null) {
            sVar.l();
        }
        if (this != tVar.f4839w) {
            M();
            tVar.c();
        }
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        if (this.f4825e != null) {
            View view = c1Var.f45738a;
            if (!(view instanceof t7)) {
                return;
            }
            t7 t7Var = (t7) view;
            t7Var.f23264d0 = true;
            t tVar = this.f4829s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                t8 t8Var = (t8) arrayList.get(i10);
                t7Var.f23268f0 = false;
                if (t8Var.K == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = t8Var.f3738a;
                    int i14 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i14;
                    tL_storyItem.f20107id = i14;
                    tL_storyItem.attachPath = t8Var.f3742f;
                    MessageObject messageObject = new MessageObject(this.f4825e.f3271c, tL_storyItem);
                    t8Var.K = messageObject;
                    messageObject.uploadingStory = t8Var;
                }
                MessageObject messageObject2 = t8Var.K;
                if (this == this.f4826f) {
                    i13 = tVar.f4834e;
                } else {
                    i13 = tVar.d;
                }
                t7Var.k(messageObject2, i13, false);
                t7Var.f23264d0 = true;
                t7Var.setReorder(false);
                t7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size >= 0 && size < this.f4825e.f3275i.size()) {
                MessageObject messageObject3 = (MessageObject) this.f4825e.f3275i.get(size);
                if (messageObject3 != null && this.f4825e.m(messageObject3.getId())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t7Var.f23268f0 = z10;
                t7Var.setReorder(true);
                if (this == this.f4826f) {
                    i12 = tVar.f4834e;
                } else {
                    i12 = tVar.d;
                }
                t7Var.k(messageObject3, i12, false);
                lr0 lr0Var = tVar.W;
                if (lr0Var.G.C1 && messageObject3 != null) {
                    t7Var.i(lr0Var.c(messageObject3), true);
                    return;
                } else {
                    t7Var.i(false, false);
                    return;
                }
            }
            t7Var.f23268f0 = false;
            if (this == this.f4826f) {
                i11 = tVar.f4834e;
            } else {
                i11 = tVar.d;
            }
            t7Var.k(null, i11, false);
            t7Var.f23264d0 = true;
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        lr0 lr0Var = this.f4829s.W;
        if (this.h == null) {
            this.h = new s7(viewGroup.getContext(), lr0Var.f4850c);
        }
        t7 t7Var = new t7(this.f4824c, this.h, lr0Var.f4849b);
        t7Var.f23288w0 = true;
        t7Var.setGradientView(null);
        t7Var.f23264d0 = true;
        return new c1(t7Var);
    }

    @Override
    public final void I() {
    }
}
