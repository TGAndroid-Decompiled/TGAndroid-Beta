package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class zia extends hjc {
    public final bja h;

    public zia(bja bjaVar, c6b c6bVar, long j, int i) {
        super(i, j, c6bVar);
        this.h = bjaVar;
    }

    @Override
    public final void a(ArrayList arrayList) {
        jga jgaVar;
        r47 messageObject;
        bja bjaVar = this.h;
        eja ejaVar = bjaVar.G;
        int i = 0;
        while (true) {
            zha[] zhaVarArr = ejaVar.n0;
            if (i < zhaVarArr.length) {
                jga jgaVar2 = zhaVarArr[i].h;
                if (jgaVar2 != null && jgaVar2.getAdapter() == bjaVar) {
                    jgaVar = ejaVar.n0[i].h;
                    break;
                }
                i++;
            } else {
                jgaVar = null;
                break;
            }
        }
        if (jgaVar != null) {
            for (int i2 = 0; i2 < jgaVar.getChildCount(); i2++) {
                View childAt = jgaVar.getChildAt(i2);
                if ((childAt instanceof jja) && (messageObject = ((jja) childAt).getMessageObject()) != null && messageObject.w4()) {
                    arrayList.add(Integer.valueOf(messageObject.l.id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        v5b v5bVar = this.h.s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        v5bVar.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z = false;
            for (int i = 0; i < arrayList.size(); i++) {
                Integer num = (Integer) arrayList.get(i);
                num.getClass();
                if (i >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i);
                r47 r47Var = (r47) v5bVar.j.get(num);
                if (r47Var != null && (storyItem = r47Var.l) != null) {
                    storyItem.views = storyViews;
                    z = true;
                }
            }
            if (z) {
                v5bVar.x();
            }
        }
        return true;
    }
}
