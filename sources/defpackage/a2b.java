package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.tl.TL_stories;
public final class a2b extends y1b {
    public final ArrayList C;

    public a2b(int i, ArrayList arrayList) {
        super(i, 0L, 3, -1, null);
        this.C = new ArrayList();
        F(arrayList);
    }

    public final void F(ArrayList arrayList) {
        int i;
        ArrayList arrayList2 = this.i;
        arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = arrayList.size();
            i = this.c;
            if (i2 >= size) {
                break;
            }
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i2);
            if (storyItem != null) {
                storyItem.messageId = arrayList2.size();
                k27 k27Var = new k27(i, storyItem);
                k27Var.r0(false);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(Integer.valueOf(arrayList2.size()));
                this.C.add(arrayList3);
                arrayList2.add(k27Var);
                i3++;
            }
            i2++;
        }
        if (i3 > 0) {
            kk7.f(i).k(kk7.z5, this);
        }
    }

    @Override
    public final k27 f(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.i;
            if (i < arrayList.size()) {
                return (k27) arrayList.get(i);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int g() {
        return this.i.size();
    }

    @Override
    public final ArrayList h() {
        return new ArrayList(this.C);
    }

    @Override
    public final int i() {
        return this.i.size();
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean q(int i, List list, boolean z) {
        return false;
    }

    @Override
    public final boolean r(int i) {
        return false;
    }

    @Override
    public final void j() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void x() {
    }
}
