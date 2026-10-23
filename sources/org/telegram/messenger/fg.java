package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
public final class fg implements Runnable {
    public final int f18439a;
    public final long f18440b;
    public final boolean f18441c;
    public final int d;
    public final Object e;
    public final Object f18442f;

    public fg(BaseController baseController, long j10, List list, boolean z10, int i10, int i11) {
        this.f18439a = i11;
        this.e = baseController;
        this.f18440b = j10;
        this.f18442f = list;
        this.f18441c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        ci.q7 q7Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.f18439a;
        Object obj = this.f18442f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.f18440b, (List) obj, this.f18441c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f18440b, (ArrayList) obj, this.f18441c, this.d);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.E1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i11 = 0;
                    while (true) {
                        q7Var = null;
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f20577id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j10 = this.f18440b;
                        storyItem.dialogId = j10;
                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                        if (R != null) {
                            if (R instanceof ey) {
                                try {
                                    q7Var = ci.q7.a(((ey) R).E0.h);
                                } catch (Exception unused) {
                                }
                            }
                            ci.q7 q7Var2 = q7Var;
                            R.getOrCreateStoryViewer().v();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j10));
                            if (this.f18441c) {
                                R.getOrCreateStoryViewer().f6271w1 = true;
                            }
                            R.getOrCreateStoryViewer().G(launchActivity, storyItem, arrayList, 0, null, null, q7Var2, false);
                            return;
                        }
                        return;
                    }
                }
                org.telegram.ui.Components.xc.X().Q(R.raw.error, 36, LocaleController.getString(R.string.StoryNotFound)).k(false);
                return;
        }
    }

    public fg(LaunchActivity launchActivity, TLObject tLObject, int i10, long j10, boolean z10) {
        this.f18439a = 2;
        this.e = launchActivity;
        this.f18442f = tLObject;
        this.d = i10;
        this.f18440b = j10;
        this.f18441c = z10;
    }
}
