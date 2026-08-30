package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.oy;
public final class hg implements Runnable {
    public final int f17407a;
    public final long f17408b;
    public final boolean f17409c;
    public final int d;
    public final Object e;
    public final Object f17410f;

    public hg(BaseController baseController, long j10, List list, boolean z4, int i10, int i11) {
        this.f17407a = i11;
        this.e = baseController;
        this.f17408b = j10;
        this.f17410f = list;
        this.f17409c = z4;
        this.d = i10;
    }

    @Override
    public final void run() {
        nh.c7 c7Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.f17407a;
        Object obj = this.f17410f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.f17408b, (List) obj, this.f17409c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f17408b, (ArrayList) obj, this.f17409c, this.d);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.f31612y1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i11 = 0;
                    while (true) {
                        c7Var = null;
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f19419id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j10 = this.f17408b;
                        storyItem.dialogId = j10;
                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                        if (R != null) {
                            if (R instanceof oy) {
                                try {
                                    c7Var = nh.c7.a(((oy) R).B0.h);
                                } catch (Exception unused) {
                                }
                            }
                            nh.c7 c7Var2 = c7Var;
                            R.getOrCreateStoryViewer().v();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j10));
                            if (this.f17409c) {
                                R.getOrCreateStoryViewer().f15492t1 = true;
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
        this.f17407a = 2;
        this.e = launchActivity;
        this.f17410f = tLObject;
        this.d = i10;
        this.f17408b = j10;
        this.f17409c = z4;
    }
}
