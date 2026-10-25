package ei;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import di.g7;
import di.s6;
import di.z6;
import fi.w7;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.v7;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.us0;
import s4.e1;
public class q extends tl0 {
    public final Context f9995c;
    public z6 e;
    public q f9996f;
    public v7 h;
    public boolean f9998r;
    public final r f9999s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f9997n = new ArrayList();

    public q(r rVar, Context context) {
        this.f9999s = rVar;
        this.f9995c = context;
        M();
    }

    @Override
    public final boolean D(e1 e1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        z6 z6Var = this.e;
        if (z6Var == null || i10 < 0 || i10 >= z6Var.f9493i.size() || (messageObject = (MessageObject) this.e.f9493i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override
    public final void G(mm0 mm0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = mm0Var.getChildAt(0).getMeasuredHeight();
        q qVar = this.f9996f;
        r rVar = this.f9999s;
        if (this == qVar) {
            i10 = rVar.e;
        } else {
            i10 = rVar.d;
        }
        int ceil = (int) (Math.ceil(h() / i10) * measuredHeight);
        int measuredHeight2 = mm0Var.getMeasuredHeight() - mm0Var.getPaddingTop();
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
        us0 us0Var = this.f9999s.W;
        z6 z6Var = this.e;
        if (z6Var != null) {
            if (z6Var instanceof s6) {
                TLRPC.User user = MessagesController.getInstance(us0Var.f10016b).getUser(Long.valueOf(us0Var.d));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < z6Var.f9493i.size()) {
                return this.e.m(((MessageObject) this.e.f9493i.get(i10)).getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.e != null) {
            r rVar = this.f9999s;
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
                rVar.h.z1(rVar.d);
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
        z6 z6Var = this.e;
        boolean z10 = z6Var instanceof s6;
        r rVar = this.f9999s;
        if (z10) {
            s6 s6Var = (s6) z6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.e.f9490c).getStoriesController().E(rVar.W.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    g7 g7Var = (g7) E.get(i10);
                    w7 w7Var = g7Var.f8585c;
                    if (w7Var != null && !w7Var.f11903g && TextUtils.equals(w7Var.K0, s6Var.E)) {
                        arrayList.add(g7Var);
                    }
                }
            }
        }
        super.l();
        q qVar = this.f9996f;
        if (qVar != null) {
            qVar.l();
        }
        if (this != rVar.f10008w) {
            M();
            rVar.c();
        }
    }

    @Override
    public final void v(e1 e1Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        if (this.e != null) {
            View view = e1Var.f47735a;
            if (!(view instanceof org.telegram.ui.Cells.w7)) {
                return;
            }
            org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
            w7Var.f25638d0 = true;
            r rVar = this.f9999s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                g7 g7Var = (g7) arrayList.get(i10);
                w7Var.f25641f0 = false;
                if (g7Var.K == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j10 = g7Var.f8583a;
                    int i14 = (int) (j10 ^ (j10 >>> 32));
                    tL_storyItem.messageId = i14;
                    tL_storyItem.f22264id = i14;
                    tL_storyItem.attachPath = g7Var.f8586f;
                    MessageObject messageObject = new MessageObject(this.e.f9490c, tL_storyItem);
                    g7Var.K = messageObject;
                    messageObject.uploadingStory = g7Var;
                }
                MessageObject messageObject2 = g7Var.K;
                if (this == this.f9996f) {
                    i13 = rVar.e;
                } else {
                    i13 = rVar.d;
                }
                w7Var.k(messageObject2, i13, false);
                w7Var.f25638d0 = true;
                w7Var.setReorder(false);
                w7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size >= 0 && size < this.e.f9493i.size()) {
                MessageObject messageObject3 = (MessageObject) this.e.f9493i.get(size);
                if (messageObject3 != null && this.e.m(messageObject3.getId())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w7Var.f25641f0 = z10;
                w7Var.setReorder(true);
                if (this == this.f9996f) {
                    i12 = rVar.e;
                } else {
                    i12 = rVar.d;
                }
                w7Var.k(messageObject3, i12, false);
                us0 us0Var = rVar.W;
                if (us0Var.G.E1 && messageObject3 != null) {
                    w7Var.i(us0Var.c(messageObject3), true);
                    return;
                } else {
                    w7Var.i(false, false);
                    return;
                }
            }
            w7Var.f25641f0 = false;
            if (this == this.f9996f) {
                i11 = rVar.e;
            } else {
                i11 = rVar.d;
            }
            w7Var.k(null, i11, false);
            w7Var.f25638d0 = true;
        }
    }

    @Override
    public final e1 x(ViewGroup viewGroup, int i10) {
        us0 us0Var = this.f9999s.W;
        if (this.h == null) {
            this.h = new v7(viewGroup.getContext(), us0Var.f10017c);
        }
        org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7(this.f9995c, this.h, us0Var.f10016b);
        w7Var.f25661w0 = true;
        w7Var.setGradientView(null);
        w7Var.f25638d0 = true;
        return new e1(w7Var);
    }

    @Override
    public final void I() {
    }
}
