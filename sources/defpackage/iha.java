package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class iha extends ihc {
    public final kha h;

    public iha(kha khaVar, h4b h4bVar, long j, int i) {
        super(i, j, h4bVar);
        this.h = khaVar;
    }

    @Override
    public final void a(ArrayList arrayList) {
        sea seaVar;
        k47 messageObject;
        kha khaVar = this.h;
        nha nhaVar = khaVar.G;
        int i = 0;
        while (true) {
            iga[] igaVarArr = nhaVar.n0;
            if (i < igaVarArr.length) {
                sea seaVar2 = igaVarArr[i].h;
                if (seaVar2 != null && seaVar2.getAdapter() == khaVar) {
                    seaVar = nhaVar.n0[i].h;
                    break;
                }
                i++;
            } else {
                seaVar = null;
                break;
            }
        }
        if (seaVar != null) {
            for (int i2 = 0; i2 < seaVar.getChildCount(); i2++) {
                View childAt = seaVar.getChildAt(i2);
                if ((childAt instanceof sha) && (messageObject = ((sha) childAt).getMessageObject()) != null && messageObject.w4()) {
                    arrayList.add(Integer.valueOf(messageObject.l.id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        z3b z3bVar = this.h.s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        z3bVar.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z = false;
            for (int i = 0; i < arrayList.size(); i++) {
                Integer num = (Integer) arrayList.get(i);
                num.getClass();
                if (i >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i);
                k47 k47Var = (k47) z3bVar.j.get(num);
                if (k47Var != null && (storyItem = k47Var.l) != null) {
                    storyItem.views = storyViews;
                    z = true;
                }
            }
            if (z) {
                z3bVar.x();
            }
        }
        return true;
    }
}
