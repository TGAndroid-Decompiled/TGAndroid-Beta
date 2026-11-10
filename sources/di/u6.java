package di;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_stories;
public final class u6 extends r6 {
    public final ArrayList C;

    public u6(int i7, ArrayList arrayList) {
        super(i7, 0L, 3, -1, null);
        this.C = new ArrayList();
        F(arrayList);
    }

    public final void F(ArrayList arrayList) {
        int i7;
        ArrayList arrayList2 = this.f9699i;
        arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            i7 = this.f9695c;
            if (i10 >= size) {
                break;
            }
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i10);
            if (storyItem != null) {
                storyItem.messageId = arrayList2.size();
                ij ijVar = new ij(i7, storyItem);
                ijVar.r0(false);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(Integer.valueOf(arrayList2.size()));
                this.C.add(arrayList3);
                arrayList2.add(ijVar);
                i11++;
            }
            i10++;
        }
        if (i11 > 0) {
            qs.f(i7).k(qs.f25113x5, this);
        }
    }

    @Override
    public final ij f(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f9699i;
            if (i7 < arrayList.size()) {
                return (ij) arrayList.get(i7);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int g() {
        return this.f9699i.size();
    }

    @Override
    public final ArrayList h() {
        return new ArrayList(this.C);
    }

    @Override
    public final int i() {
        return this.f9699i.size();
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
    public final boolean q(int i7, List list, boolean z9) {
        return false;
    }

    @Override
    public final boolean r(int i7) {
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
