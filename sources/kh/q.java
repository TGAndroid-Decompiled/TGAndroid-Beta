package kh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import f2.o1;
import java.util.ArrayList;
import jh.b6;
import jh.j6;
import jh.r6;
import lh.z7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.zk0;

public class q extends jk0 {

    public final Context f15208c;

    public j6 f15209e;

    public q f15210f;
    public n7 h;

    public boolean f15212r;

    public final r f15213s;
    public final ArrayList d = new ArrayList();

    public final ArrayList f15211n = new ArrayList();

    public q(r rVar, Context context) {
        this.f15213s = rVar;
        this.f15208c = context;
        M();
    }

    @Override
    public final boolean D(o1 o1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        j6 j6Var = this.f15209e;
        if (j6Var == null || i10 < 0 || i10 >= j6Var.f13540i.size() || (messageObject = (MessageObject) this.f15209e.f13540i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override
    public final void G(zk0 zk0Var, float f10, int[] iArr) {
        int measuredHeight = zk0Var.getChildAt(0).getMeasuredHeight();
        q qVar = this.f15210f;
        r rVar = this.f15213s;
        int i10 = this == qVar ? rVar.f15217e : rVar.d;
        int iCeil = (int) (Math.ceil(h() / i10) * ((double) measuredHeight));
        int measuredHeight2 = zk0Var.getMeasuredHeight() - zk0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f11 = f10 * (iCeil - measuredHeight2);
            iArr[0] = ((int) (f11 / measuredHeight)) * i10;
            iArr[1] = ((int) f11) % measuredHeight;
        }
    }

    public final boolean L(int i10) {
        vq0 vq0Var = this.f15213s.S;
        j6 j6Var = this.f15209e;
        if (j6Var == null) {
            return false;
        }
        if (j6Var instanceof b6) {
            TLRPC.User user = MessagesController.getInstance(vq0Var.f15230b).getUser(Long.valueOf(vq0Var.d));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= j6Var.f13540i.size()) {
            return false;
        }
        return this.f15209e.m(((MessageObject) this.f15209e.f13540i.get(i10)).getId());
    }

    public final void M() {
        if (this.f15209e == null) {
            return;
        }
        r rVar = this.f15213s;
        if ((!rVar.E || (rVar.D && h() > 1)) && h() > 0) {
            if (h() < 5) {
                int iMax = Math.max(1, h());
                rVar.d = iMax;
                rVar.D = iMax == 1;
            } else if (rVar.D || rVar.d == 1) {
                rVar.D = false;
                rVar.d = Math.max(2, SharedConfig.storiesColumnsCount);
            }
            rVar.h.y1(rVar.d);
            rVar.E = true;
        }
    }

    @Override
    public final int h() {
        if (this.f15209e == null) {
            return 0;
        }
        return this.f15209e.g() + this.d.size();
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
        j6 j6Var = this.f15209e;
        boolean z10 = j6Var instanceof b6;
        r rVar = this.f15213s;
        if (z10) {
            b6 b6Var = (b6) j6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList arrayListE = MessagesController.getInstance(this.f15209e.f13536c).getStoriesController().E(rVar.S.d);
            if (arrayListE != null) {
                for (int i10 = 0; i10 < arrayListE.size(); i10++) {
                    r6 r6Var = (r6) arrayListE.get(i10);
                    z7 z7Var = r6Var.f13907c;
                    if (z7Var != null && !z7Var.f17209g && TextUtils.equals(z7Var.K0, b6Var.E)) {
                        arrayList.add(r6Var);
                    }
                }
            }
        }
        super.l();
        q qVar = this.f15210f;
        if (qVar != null) {
            qVar.l();
        }
        if (this != rVar.f15222w) {
            M();
            rVar.c();
        }
    }

    @Override
    public final void v(o1 o1Var, int i10) {
        if (this.f15209e == null) {
            return;
        }
        View view = o1Var.f5789a;
        if (view instanceof o7) {
            o7 o7Var = (o7) view;
            o7Var.W = true;
            r rVar = this.f15213s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                r6 r6Var = (r6) arrayList.get(i10);
                o7Var.f24785b0 = false;
                if (r6Var.G == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j10 = r6Var.f13905a;
                    int i11 = (int) (j10 ^ (j10 >>> 32));
                    tL_storyItem.messageId = i11;
                    tL_storyItem.f22617id = i11;
                    tL_storyItem.attachPath = r6Var.f13909f;
                    p pVar = new p(this.f15209e.f13536c, tL_storyItem);
                    r6Var.G = pVar;
                    pVar.uploadingStory = r6Var;
                }
                o7Var.k(r6Var.G, this == this.f15210f ? rVar.f15217e : rVar.d, false);
                o7Var.W = true;
                o7Var.setReorder(false);
                o7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size < 0 || size >= this.f15209e.f13540i.size()) {
                o7Var.f24785b0 = false;
                o7Var.k(null, this == this.f15210f ? rVar.f15217e : rVar.d, false);
                o7Var.W = true;
                return;
            }
            MessageObject messageObject = (MessageObject) this.f15209e.f13540i.get(size);
            o7Var.f24785b0 = messageObject != null && this.f15209e.m(messageObject.getId());
            o7Var.setReorder(true);
            o7Var.k(messageObject, this == this.f15210f ? rVar.f15217e : rVar.d, false);
            vq0 vq0Var = rVar.S;
            if (!vq0Var.C.f29163y1 || messageObject == null) {
                o7Var.i(false, false);
            } else {
                o7Var.i(vq0Var.c(messageObject), true);
            }
        }
    }

    @Override
    public final o1 x(ViewGroup viewGroup, int i10) {
        vq0 vq0Var = this.f15213s.S;
        if (this.h == null) {
            this.h = new n7(viewGroup.getContext(), vq0Var.f15231c);
        }
        o7 o7Var = new o7(this.f15208c, this.h, vq0Var.f15230b);
        o7Var.f24807s0 = true;
        o7Var.setGradientView(null);
        o7Var.W = true;
        return new lk0(o7Var);
    }

    @Override
    public final void I() {
    }
}
