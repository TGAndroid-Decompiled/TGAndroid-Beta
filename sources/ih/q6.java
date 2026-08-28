package ih;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_stories;
public final class q6 extends n6 {
    public final ArrayList C;

    public q6(int i9, ArrayList arrayList) {
        super(i9, 0L, 3, -1, null);
        this.C = new ArrayList();
        F(arrayList);
    }

    public final void F(ArrayList arrayList) {
        int i9;
        ArrayList arrayList2 = this.f11851i;
        arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            i9 = this.f11847c;
            if (i10 >= size) {
                break;
            }
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i10);
            if (storyItem != null) {
                storyItem.messageId = arrayList2.size();
                MessageObject messageObject = new MessageObject(i9, storyItem);
                messageObject.generateThumbs(false);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(Integer.valueOf(arrayList2.size()));
                this.C.add(arrayList3);
                arrayList2.add(messageObject);
                i11++;
            }
            i10++;
        }
        if (i11 > 0) {
            NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, this);
        }
    }

    @Override
    public final MessageObject f(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.f11851i;
            if (i9 < arrayList.size()) {
                return (MessageObject) arrayList.get(i9);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int g() {
        return this.f11851i.size();
    }

    @Override
    public final ArrayList h() {
        return new ArrayList(this.C);
    }

    @Override
    public final int i() {
        return this.f11851i.size();
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
    public final boolean q(int i9, List list, boolean z10) {
        return false;
    }

    @Override
    public final boolean r(int i9) {
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
