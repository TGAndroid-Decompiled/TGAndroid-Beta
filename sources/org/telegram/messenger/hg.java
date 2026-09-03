package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qy;
public final class hg implements Runnable {
    public final int f17387a;
    public final long f17388b;
    public final boolean f17389c;
    public final int d;
    public final Object e;
    public final Object f17390f;

    public hg(BaseController baseController, long j10, List list, boolean z4, int i10, int i11) {
        this.f17387a = i11;
        this.e = baseController;
        this.f17388b = j10;
        this.f17390f = list;
        this.f17389c = z4;
        this.d = i10;
    }

    @Override
    public final void run() {
        nh.c7 c7Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.f17387a;
        Object obj = this.f17390f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.f17388b, (List) obj, this.f17389c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f17388b, (ArrayList) obj, this.f17389c, this.d);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.f31586y1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i11 = 0;
                    while (true) {
                        c7Var = null;
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f19394id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j10 = this.f17388b;
                        storyItem.dialogId = j10;
                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                        if (R != null) {
                            if (R instanceof qy) {
                                try {
                                    c7Var = nh.c7.a(((qy) R).B0.h);
                                } catch (Exception unused) {
                                }
                            }
                            nh.c7 c7Var2 = c7Var;
                            R.getOrCreateStoryViewer().v();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j10));
                            if (this.f17389c) {
                                R.getOrCreateStoryViewer().f15472t1 = true;
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
        this.f17387a = 2;
        this.e = launchActivity;
        this.f17390f = tLObject;
        this.d = i10;
        this.f17388b = j10;
        this.f17389c = z4;
    }
}
