package di;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import ci.a7;
import ci.h7;
import ci.t6;
import ei.a8;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.rl0;
import s4.b1;
public class q extends rl0 {
    public final Context f8048c;
    public a7 e;
    public q f8049f;
    public r7 h;
    public boolean f8051r;
    public final r f8052s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f8050n = new ArrayList();

    public q(r rVar, Context context) {
        this.f8052s = rVar;
        this.f8048c = context;
        M();
    }

    @Override
    public final boolean D(b1 b1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        a7 a7Var = this.e;
        if (a7Var == null || i10 < 0 || i10 >= a7Var.f5149i.size() || (messageObject = (MessageObject) this.e.f5149i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override
    public final void G(jm0 jm0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = jm0Var.getChildAt(0).getMeasuredHeight();
        q qVar = this.f8049f;
        r rVar = this.f8052s;
        if (this == qVar) {
            i10 = rVar.e;
        } else {
            i10 = rVar.d;
        }
        int ceil = (int) (Math.ceil(h() / i10) * measuredHeight);
        int measuredHeight2 = jm0Var.getMeasuredHeight() - jm0Var.getPaddingTop();
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
        js0 js0Var = this.f8052s.W;
        a7 a7Var = this.e;
        if (a7Var != null) {
            if (a7Var instanceof t6) {
                TLRPC.User user = MessagesController.getInstance(js0Var.f8069b).getUser(Long.valueOf(js0Var.d));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < a7Var.f5149i.size()) {
                return this.e.m(((MessageObject) this.e.f5149i.get(i10)).getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.e != null) {
            r rVar = this.f8052s;
            if ((!rVar.I || (rVar.H && h() > 1)) && h() > 0) {
                boolean z10 = false;
                if (h() < 5) {
                    int max = Math.max(1, h());
                    rVar.d = max;
                    if (max == 1) {
                        z10 = true;
                    }
                    rVar.H = z10;
                } else if (rVar.H || rVar.d == 1) {
                    rVar.H = false;
                    rVar.d = Math.max(2, SharedConfig.storiesColumnsCount);
                }
                rVar.h.y1(rVar.d);
                rVar.I = true;
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
        a7 a7Var = this.e;
        boolean z10 = a7Var instanceof t6;
        r rVar = this.f8052s;
        if (z10) {
            t6 t6Var = (t6) a7Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.e.f5146c).getStoriesController().E(rVar.W.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    h7 h7Var = (h7) E.get(i10);
                    a8 a8Var = h7Var.f5468c;
                    if (a8Var != null && !a8Var.f8709g && TextUtils.equals(a8Var.K0, t6Var.E)) {
                        arrayList.add(h7Var);
                    }
                }
            }
        }
        super.l();
        q qVar = this.f8049f;
        if (qVar != null) {
            qVar.l();
        }
        if (this != rVar.f8061w) {
            M();
            rVar.c();
        }
    }

    @Override
    public final void v(b1 b1Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        if (this.e != null) {
            View view = b1Var.f45920a;
            if (!(view instanceof s7)) {
                return;
            }
            s7 s7Var = (s7) view;
            s7Var.f23032d0 = true;
            r rVar = this.f8052s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                h7 h7Var = (h7) arrayList.get(i10);
                s7Var.f23035f0 = false;
                if (h7Var.K == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j10 = h7Var.f5466a;
                    int i14 = (int) (j10 ^ (j10 >>> 32));
                    tL_storyItem.messageId = i14;
                    tL_storyItem.f20513id = i14;
                    tL_storyItem.attachPath = h7Var.f5469f;
                    MessageObject messageObject = new MessageObject(this.e.f5146c, tL_storyItem);
                    h7Var.K = messageObject;
                    messageObject.uploadingStory = h7Var;
                }
                MessageObject messageObject2 = h7Var.K;
                if (this == this.f8049f) {
                    i13 = rVar.e;
                } else {
                    i13 = rVar.d;
                }
                s7Var.k(messageObject2, i13, false);
                s7Var.f23032d0 = true;
                s7Var.setReorder(false);
                s7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size >= 0 && size < this.e.f5149i.size()) {
                MessageObject messageObject3 = (MessageObject) this.e.f5149i.get(size);
                if (messageObject3 != null && this.e.m(messageObject3.getId())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s7Var.f23035f0 = z10;
                s7Var.setReorder(true);
                if (this == this.f8049f) {
                    i12 = rVar.e;
                } else {
                    i12 = rVar.d;
                }
                s7Var.k(messageObject3, i12, false);
                js0 js0Var = rVar.W;
                if (js0Var.G.C1 && messageObject3 != null) {
                    s7Var.i(js0Var.c(messageObject3), true);
                    return;
                } else {
                    s7Var.i(false, false);
                    return;
                }
            }
            s7Var.f23035f0 = false;
            if (this == this.f8049f) {
                i11 = rVar.e;
            } else {
                i11 = rVar.d;
            }
            s7Var.k(null, i11, false);
            s7Var.f23032d0 = true;
        }
    }

    @Override
    public final b1 x(ViewGroup viewGroup, int i10) {
        js0 js0Var = this.f8052s.W;
        if (this.h == null) {
            this.h = new r7(viewGroup.getContext(), js0Var.f8070c);
        }
        s7 s7Var = new s7(this.f8048c, this.h, js0Var.f8069b);
        s7Var.f23055w0 = true;
        s7Var.setGradientView(null);
        s7Var.f23032d0 = true;
        return new b1(s7Var);
    }

    @Override
    public final void I() {
    }
}
