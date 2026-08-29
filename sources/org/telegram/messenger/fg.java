package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fy;
public final class fg implements Runnable {
    public final int f20244a;
    public final long f20245b;
    public final boolean f20246c;
    public final int d;
    public final Object f20247e;
    public final Object f20248f;

    public fg(BaseController baseController, long j10, List list, boolean z10, int i10, int i11) {
        this.f20244a = i11;
        this.f20247e = baseController;
        this.f20245b = j10;
        this.f20248f = list;
        this.f20246c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        lh.b7 b7Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.f20244a;
        Object obj = this.f20248f;
        Object obj2 = this.f20247e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.f20245b, (List) obj, this.f20246c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f20245b, (ArrayList) obj, this.f20246c, this.d);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.f35560x1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i11 = 0;
                    while (true) {
                        b7Var = null;
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f22629id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j10 = this.f20245b;
                        storyItem.dialogId = j10;
                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                        if (R != null) {
                            if (R instanceof fy) {
                                try {
                                    b7Var = lh.b7.a(((fy) R).A0.h);
                                } catch (Exception unused) {
                                }
                            }
                            lh.b7 b7Var2 = b7Var;
                            R.getOrCreateStoryViewer().v();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j10));
                            if (this.f20246c) {
                                R.getOrCreateStoryViewer().f15785s1 = true;
                            }
                            R.getOrCreateStoryViewer().F(launchActivity, storyItem, arrayList, 0, null, null, b7Var2, false);
                            return;
                        }
                        return;
                    }
                }
                org.telegram.ui.Components.tc.X().Q(R.raw.error, 36, LocaleController.getString(R.string.StoryNotFound)).k(false);
                return;
        }
    }

    public fg(LaunchActivity launchActivity, TLObject tLObject, int i10, long j10, boolean z10) {
        this.f20244a = 2;
        this.f20247e = launchActivity;
        this.f20248f = tLObject;
        this.d = i10;
        this.f20245b = j10;
        this.f20246c = z10;
    }
}
