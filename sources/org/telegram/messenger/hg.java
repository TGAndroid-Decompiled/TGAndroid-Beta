package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.py;
public final class hg implements Runnable {
    public final int f18872a;
    public final long f18873b;
    public final boolean f18874c;
    public final int d;
    public final Object f18875e;
    public final Object f18876f;

    public hg(BaseController baseController, long j10, List list, boolean z4, int i10, int i11) {
        this.f18872a = i11;
        this.f18875e = baseController;
        this.f18873b = j10;
        this.f18876f = list;
        this.f18874c = z4;
        this.d = i10;
    }

    @Override
    public final void run() {
        oh.c7 c7Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.f18872a;
        Object obj = this.f18876f;
        Object obj2 = this.f18875e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.f18873b, (List) obj, this.f18874c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f18873b, (ArrayList) obj, this.f18874c, this.d);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.f34134y1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i11 = 0;
                    while (true) {
                        c7Var = null;
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f21080id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j10 = this.f18873b;
                        storyItem.dialogId = j10;
                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                        if (R != null) {
                            if (R instanceof py) {
                                try {
                                    c7Var = oh.c7.a(((py) R).B0.h);
                                } catch (Exception unused) {
                                }
                            }
                            oh.c7 c7Var2 = c7Var;
                            R.getOrCreateStoryViewer().v();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j10));
                            if (this.f18874c) {
                                R.getOrCreateStoryViewer().f17297t1 = true;
                            }
                            R.getOrCreateStoryViewer().F(launchActivity, storyItem, arrayList, 0, null, null, c7Var2, false);
                            return;
                        }
                        return;
                    }
                }
                org.telegram.ui.Components.qc.X().Q(R.raw.error, 36, LocaleController.getString(R.string.StoryNotFound)).k(false);
                return;
        }
    }

    public hg(LaunchActivity launchActivity, TLObject tLObject, int i10, long j10, boolean z4) {
        this.f18872a = 2;
        this.f18875e = launchActivity;
        this.f18876f = tLObject;
        this.d = i10;
        this.f18873b = j10;
        this.f18874c = z4;
    }
}
