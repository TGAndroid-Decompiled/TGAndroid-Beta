package di;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import ci.g7;
import ci.s6;
import ci.z6;
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
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.ql0;
import s4.b1;
public class q extends ql0 {
    public final Context f8049c;
    public z6 e;
    public q f8050f;
    public r7 h;
    public boolean f8052r;
    public final r f8053s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f8051n = new ArrayList();

    public q(r rVar, Context context) {
        this.f8053s = rVar;
        this.f8049c = context;
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
        z6 z6Var = this.e;
        if (z6Var == null || i10 < 0 || i10 >= z6Var.f6184i.size() || (messageObject = (MessageObject) this.e.f6184i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override
    public final void G(im0 im0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = im0Var.getChildAt(0).getMeasuredHeight();
        q qVar = this.f8050f;
        r rVar = this.f8053s;
        if (this == qVar) {
            i10 = rVar.e;
        } else {
            i10 = rVar.d;
        }
        int ceil = (int) (Math.ceil(h() / i10) * measuredHeight);
        int measuredHeight2 = im0Var.getMeasuredHeight() - im0Var.getPaddingTop();
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
        hs0 hs0Var = this.f8053s.W;
        z6 z6Var = this.e;
        if (z6Var != null) {
            if (z6Var instanceof s6) {
                TLRPC.User user = MessagesController.getInstance(hs0Var.f8070b).getUser(Long.valueOf(hs0Var.d));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < z6Var.f6184i.size()) {
                return this.e.m(((MessageObject) this.e.f6184i.get(i10)).getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.e != null) {
            r rVar = this.f8053s;
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
        z6 z6Var = this.e;
        boolean z10 = z6Var instanceof s6;
        r rVar = this.f8053s;
        if (z10) {
            s6 s6Var = (s6) z6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.e.f6181c).getStoriesController().E(rVar.W.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    g7 g7Var = (g7) E.get(i10);
                    a8 a8Var = g7Var.f5364c;
                    if (a8Var != null && !a8Var.f8710g && TextUtils.equals(a8Var.K0, s6Var.E)) {
                        arrayList.add(g7Var);
                    }
                }
            }
        }
        super.l();
        q qVar = this.f8050f;
        if (qVar != null) {
            qVar.l();
        }
        if (this != rVar.f8062w) {
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
            View view = b1Var.f45910a;
            if (!(view instanceof s7)) {
                return;
            }
            s7 s7Var = (s7) view;
            s7Var.f23025d0 = true;
            r rVar = this.f8053s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                g7 g7Var = (g7) arrayList.get(i10);
                s7Var.f23028f0 = false;
                if (g7Var.K == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j10 = g7Var.f5362a;
                    int i14 = (int) (j10 ^ (j10 >>> 32));
                    tL_storyItem.messageId = i14;
                    tL_storyItem.f20506id = i14;
                    tL_storyItem.attachPath = g7Var.f5365f;
                    MessageObject messageObject = new MessageObject(this.e.f6181c, tL_storyItem);
                    g7Var.K = messageObject;
                    messageObject.uploadingStory = g7Var;
                }
                MessageObject messageObject2 = g7Var.K;
                if (this == this.f8050f) {
                    i13 = rVar.e;
                } else {
                    i13 = rVar.d;
                }
                s7Var.k(messageObject2, i13, false);
                s7Var.f23025d0 = true;
                s7Var.setReorder(false);
                s7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size >= 0 && size < this.e.f6184i.size()) {
                MessageObject messageObject3 = (MessageObject) this.e.f6184i.get(size);
                if (messageObject3 != null && this.e.m(messageObject3.getId())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s7Var.f23028f0 = z10;
                s7Var.setReorder(true);
                if (this == this.f8050f) {
                    i12 = rVar.e;
                } else {
                    i12 = rVar.d;
                }
                s7Var.k(messageObject3, i12, false);
                hs0 hs0Var = rVar.W;
                if (hs0Var.G.C1 && messageObject3 != null) {
                    s7Var.i(hs0Var.c(messageObject3), true);
                    return;
                } else {
                    s7Var.i(false, false);
                    return;
                }
            }
            s7Var.f23028f0 = false;
            if (this == this.f8050f) {
                i11 = rVar.e;
            } else {
                i11 = rVar.d;
            }
            s7Var.k(null, i11, false);
            s7Var.f23025d0 = true;
        }
    }

    @Override
    public final b1 x(ViewGroup viewGroup, int i10) {
        hs0 hs0Var = this.f8053s.W;
        if (this.h == null) {
            this.h = new r7(viewGroup.getContext(), hs0Var.f8071c);
        }
        s7 s7Var = new s7(this.f8049c, this.h, hs0Var.f8070b);
        s7Var.f23048w0 = true;
        s7Var.setGradientView(null);
        s7Var.f23025d0 = true;
        return new b1(s7Var);
    }

    @Override
    public final void I() {
    }
}
