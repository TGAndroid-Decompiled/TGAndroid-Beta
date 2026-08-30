package oh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import f2.l1;
import java.util.ArrayList;
import nh.d6;
import nh.l6;
import nh.s6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.q7;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.sl0;
import ph.u6;
public class q extends cl0 {
    public final Context f16596c;
    public l6 e;
    public q f16597f;
    public q7 h;
    public boolean f16599r;
    public final r f16600s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f16598n = new ArrayList();

    public q(r rVar, Context context) {
        this.f16600s = rVar;
        this.f16596c = context;
        M();
    }

    @Override
    public final boolean D(l1 l1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        l6 l6Var = this.e;
        if (l6Var == null || i10 < 0 || i10 >= l6Var.f15580i.size() || (messageObject = (MessageObject) this.e.f15580i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override
    public final void G(sl0 sl0Var, float f10, int[] iArr) {
        int i10;
        int measuredHeight = sl0Var.getChildAt(0).getMeasuredHeight();
        q qVar = this.f16597f;
        r rVar = this.f16600s;
        if (this == qVar) {
            i10 = rVar.e;
        } else {
            i10 = rVar.d;
        }
        int ceil = (int) (Math.ceil(h() / i10) * measuredHeight);
        int measuredHeight2 = sl0Var.getMeasuredHeight() - sl0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
            return;
        }
        float f11 = f10 * (ceil - measuredHeight2);
        iArr[0] = ((int) (f11 / measuredHeight)) * i10;
        iArr[1] = ((int) f11) % measuredHeight;
    }

    public final boolean L(int i10) {
        nr0 nr0Var = this.f16600s.T;
        l6 l6Var = this.e;
        if (l6Var != null) {
            if (l6Var instanceof d6) {
                TLRPC.User user = MessagesController.getInstance(nr0Var.f16616b).getUser(Long.valueOf(nr0Var.d));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < l6Var.f15580i.size()) {
                return this.e.m(((MessageObject) this.e.f15580i.get(i10)).getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.e != null) {
            r rVar = this.f16600s;
            if ((!rVar.F || (rVar.E && h() > 1)) && h() > 0) {
                boolean z4 = false;
                if (h() < 5) {
                    int max = Math.max(1, h());
                    rVar.d = max;
                    if (max == 1) {
                        z4 = true;
                    }
                    rVar.E = z4;
                } else if (rVar.E || rVar.d == 1) {
                    rVar.E = false;
                    rVar.d = Math.max(2, SharedConfig.storiesColumnsCount);
                }
                rVar.h.y1(rVar.d);
                rVar.F = true;
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
        l6 l6Var = this.e;
        boolean z4 = l6Var instanceof d6;
        r rVar = this.f16600s;
        if (z4) {
            d6 d6Var = (d6) l6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.e.f15577c).getStoriesController().E(rVar.T.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    s6 s6Var = (s6) E.get(i10);
                    u6 u6Var = s6Var.f15883c;
                    if (u6Var != null && !u6Var.f42413g && TextUtils.equals(u6Var.K0, d6Var.E)) {
                        arrayList.add(s6Var);
                    }
                }
            }
        }
        super.l();
        q qVar = this.f16597f;
        if (qVar != null) {
            qVar.l();
        }
        if (this != rVar.f16608w) {
            M();
            rVar.c();
        }
    }

    @Override
    public final void v(l1 l1Var, int i10) {
        int i11;
        boolean z4;
        int i12;
        int i13;
        if (this.e != null) {
            View view = l1Var.f5785a;
            if (!(view instanceof r7)) {
                return;
            }
            r7 r7Var = (r7) view;
            r7Var.f21766a0 = true;
            r rVar = this.f16600s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                s6 s6Var = (s6) arrayList.get(i10);
                r7Var.f21770c0 = false;
                if (s6Var.H == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j10 = s6Var.f15881a;
                    int i14 = (int) (j10 ^ (j10 >>> 32));
                    tL_storyItem.messageId = i14;
                    tL_storyItem.f19419id = i14;
                    tL_storyItem.attachPath = s6Var.f15884f;
                    MessageObject messageObject = new MessageObject(this.e.f15577c, tL_storyItem);
                    s6Var.H = messageObject;
                    messageObject.uploadingStory = s6Var;
                }
                MessageObject messageObject2 = s6Var.H;
                if (this == this.f16597f) {
                    i13 = rVar.e;
                } else {
                    i13 = rVar.d;
                }
                r7Var.k(messageObject2, i13, false);
                r7Var.f21766a0 = true;
                r7Var.setReorder(false);
                r7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size >= 0 && size < this.e.f15580i.size()) {
                MessageObject messageObject3 = (MessageObject) this.e.f15580i.get(size);
                if (messageObject3 != null && this.e.m(messageObject3.getId())) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                r7Var.f21770c0 = z4;
                r7Var.setReorder(true);
                if (this == this.f16597f) {
                    i12 = rVar.e;
                } else {
                    i12 = rVar.d;
                }
                r7Var.k(messageObject3, i12, false);
                nr0 nr0Var = rVar.T;
                if (nr0Var.D.f31161z1 && messageObject3 != null) {
                    r7Var.i(nr0Var.c(messageObject3), true);
                    return;
                } else {
                    r7Var.i(false, false);
                    return;
                }
            }
            r7Var.f21770c0 = false;
            if (this == this.f16597f) {
                i11 = rVar.e;
            } else {
                i11 = rVar.d;
            }
            r7Var.k(null, i11, false);
            r7Var.f21766a0 = true;
        }
    }

    @Override
    public final l1 x(ViewGroup viewGroup, int i10) {
        nr0 nr0Var = this.f16600s.T;
        if (this.h == null) {
            this.h = new q7(viewGroup.getContext(), nr0Var.f16617c);
        }
        r7 r7Var = new r7(this.f16596c, this.h, nr0Var.f16616b);
        r7Var.f21790t0 = true;
        r7Var.setGradientView(null);
        r7Var.f21766a0 = true;
        return new l1(r7Var);
    }

    @Override
    public final void I() {
    }
}
