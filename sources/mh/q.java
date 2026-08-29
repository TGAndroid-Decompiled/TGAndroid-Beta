package mh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import f2.n1;
import java.util.ArrayList;
import lh.c6;
import lh.k6;
import lh.r6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.tk0;
public class q extends tk0 {
    public final Context f17035c;
    public k6 f17036e;
    public q f17037f;
    public o7 h;
    public boolean f17039r;
    public final r f17040s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f17038n = new ArrayList();

    public q(r rVar, Context context) {
        this.f17040s = rVar;
        this.f17035c = context;
        M();
    }

    @Override
    public final boolean D(n1 n1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        k6 k6Var = this.f17036e;
        if (k6Var == null || i10 < 0 || i10 >= k6Var.f15838i.size() || (messageObject = (MessageObject) this.f17036e.f15838i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override
    public final void G(jl0 jl0Var, float f9, int[] iArr) {
        int i10;
        int measuredHeight = jl0Var.getChildAt(0).getMeasuredHeight();
        q qVar = this.f17037f;
        r rVar = this.f17040s;
        if (this == qVar) {
            i10 = rVar.f17044e;
        } else {
            i10 = rVar.d;
        }
        int ceil = (int) (Math.ceil(h() / i10) * measuredHeight);
        int measuredHeight2 = jl0Var.getMeasuredHeight() - jl0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
            return;
        }
        float f10 = f9 * (ceil - measuredHeight2);
        iArr[0] = ((int) (f10 / measuredHeight)) * i10;
        iArr[1] = ((int) f10) % measuredHeight;
    }

    public final boolean L(int i10) {
        fr0 fr0Var = this.f17040s.S;
        k6 k6Var = this.f17036e;
        if (k6Var != null) {
            if (k6Var instanceof c6) {
                TLRPC.User user = MessagesController.getInstance(fr0Var.f17057b).getUser(Long.valueOf(fr0Var.d));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < k6Var.f15838i.size()) {
                return this.f17036e.m(((MessageObject) this.f17036e.f15838i.get(i10)).getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.f17036e != null) {
            r rVar = this.f17040s;
            if ((!rVar.E || (rVar.D && h() > 1)) && h() > 0) {
                boolean z10 = false;
                if (h() < 5) {
                    int max = Math.max(1, h());
                    rVar.d = max;
                    if (max == 1) {
                        z10 = true;
                    }
                    rVar.D = z10;
                } else if (rVar.D || rVar.d == 1) {
                    rVar.D = false;
                    rVar.d = Math.max(2, SharedConfig.storiesColumnsCount);
                }
                rVar.h.y1(rVar.d);
                rVar.E = true;
            }
        }
    }

    @Override
    public final int h() {
        if (this.f17036e == null) {
            return 0;
        }
        return this.f17036e.g() + this.d.size();
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
        k6 k6Var = this.f17036e;
        boolean z10 = k6Var instanceof c6;
        r rVar = this.f17040s;
        if (z10) {
            c6 c6Var = (c6) k6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.f17036e.f15834c).getStoriesController().E(rVar.S.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    r6 r6Var = (r6) E.get(i10);
                    nh.o7 o7Var = r6Var.f16169c;
                    if (o7Var != null && !o7Var.f18270g && TextUtils.equals(o7Var.K0, c6Var.E)) {
                        arrayList.add(r6Var);
                    }
                }
            }
        }
        super.l();
        q qVar = this.f17037f;
        if (qVar != null) {
            qVar.l();
        }
        if (this != rVar.f17049w) {
            M();
            rVar.c();
        }
    }

    @Override
    public final void v(n1 n1Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        if (this.f17036e != null) {
            View view = n1Var.f6432a;
            if (!(view instanceof p7)) {
                return;
            }
            p7 p7Var = (p7) view;
            p7Var.W = true;
            r rVar = this.f17040s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                r6 r6Var = (r6) arrayList.get(i10);
                p7Var.f24977b0 = false;
                if (r6Var.G == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j10 = r6Var.f16167a;
                    int i14 = (int) (j10 ^ (j10 >>> 32));
                    tL_storyItem.messageId = i14;
                    tL_storyItem.f22629id = i14;
                    tL_storyItem.attachPath = r6Var.f16171f;
                    MessageObject messageObject = new MessageObject(this.f17036e.f15834c, tL_storyItem);
                    r6Var.G = messageObject;
                    messageObject.uploadingStory = r6Var;
                }
                MessageObject messageObject2 = r6Var.G;
                if (this == this.f17037f) {
                    i13 = rVar.f17044e;
                } else {
                    i13 = rVar.d;
                }
                p7Var.k(messageObject2, i13, false);
                p7Var.W = true;
                p7Var.setReorder(false);
                p7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size >= 0 && size < this.f17036e.f15838i.size()) {
                MessageObject messageObject3 = (MessageObject) this.f17036e.f15838i.get(size);
                if (messageObject3 != null && this.f17036e.m(messageObject3.getId())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p7Var.f24977b0 = z10;
                p7Var.setReorder(true);
                if (this == this.f17037f) {
                    i12 = rVar.f17044e;
                } else {
                    i12 = rVar.d;
                }
                p7Var.k(messageObject3, i12, false);
                fr0 fr0Var = rVar.S;
                if (fr0Var.C.f32111y1 && messageObject3 != null) {
                    p7Var.i(fr0Var.c(messageObject3), true);
                    return;
                } else {
                    p7Var.i(false, false);
                    return;
                }
            }
            p7Var.f24977b0 = false;
            if (this == this.f17037f) {
                i11 = rVar.f17044e;
            } else {
                i11 = rVar.d;
            }
            p7Var.k(null, i11, false);
            p7Var.W = true;
        }
    }

    @Override
    public final n1 x(ViewGroup viewGroup, int i10) {
        fr0 fr0Var = this.f17040s.S;
        if (this.h == null) {
            this.h = new o7(viewGroup.getContext(), fr0Var.f17058c);
        }
        p7 p7Var = new p7(this.f17035c, this.h, fr0Var.f17057b);
        p7Var.f24999s0 = true;
        p7Var.setGradientView(null);
        p7Var.W = true;
        return new n1(p7Var);
    }

    @Override
    public final void I() {
    }
}
