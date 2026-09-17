package bi;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_stories;
public final class o8 extends l8 {
    public final ArrayList C;

    public o8(int i10, ArrayList arrayList) {
        super(i10, 0L, 3, -1, null);
        this.C = new ArrayList();
        F(arrayList);
    }

    public final void F(ArrayList arrayList) {
        int i10;
        ArrayList arrayList2 = this.f3275i;
        arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = arrayList.size();
            i10 = this.f3271c;
            if (i11 >= size) {
                break;
            }
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            if (storyItem != null) {
                storyItem.messageId = arrayList2.size();
                MessageObject messageObject = new MessageObject(i10, storyItem);
                messageObject.generateThumbs(false);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(Integer.valueOf(arrayList2.size()));
                this.C.add(arrayList3);
                arrayList2.add(messageObject);
                i12++;
            }
            i11++;
        }
        if (i12 > 0) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, this);
        }
    }

    @Override
    public final MessageObject f(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f3275i;
            if (i10 < arrayList.size()) {
                return (MessageObject) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int g() {
        return this.f3275i.size();
    }

    @Override
    public final ArrayList h() {
        return new ArrayList(this.C);
    }

    @Override
    public final int i() {
        return this.f3275i.size();
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
    public final boolean q(int i10, List list, boolean z10) {
        return false;
    }

    @Override
    public final boolean r(int i10) {
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
