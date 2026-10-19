package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cy;
public final class bg implements Runnable {
    public final int f17968a;
    public final long f17969b;
    public final boolean f17970c;
    public final int d;
    public final Object e;
    public final Object f17971f;

    public bg(BaseController baseController, long j10, List list, boolean z10, int i10, int i11) {
        this.f17968a = i11;
        this.e = baseController;
        this.f17969b = j10;
        this.f17971f = list;
        this.f17970c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        ci.r7 r7Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.f17968a;
        Object obj = this.f17971f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.f17969b, (List) obj, this.f17970c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f17969b, (ArrayList) obj, this.f17970c, this.d);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.C1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i11 = 0;
                    while (true) {
                        r7Var = null;
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f20507id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j10 = this.f17969b;
                        storyItem.dialogId = j10;
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        if (R != null) {
                            if (R instanceof cy) {
                                try {
                                    r7Var = ci.r7.a(((cy) R).E0.h);
                                } catch (Exception unused) {
                                }
                            }
                            ci.r7 r7Var2 = r7Var;
                            R.getOrCreateStoryViewer().v();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j10));
                            if (this.f17970c) {
                                R.getOrCreateStoryViewer().f5225w1 = true;
                            }
                            R.getOrCreateStoryViewer().G(launchActivity, storyItem, arrayList, 0, null, null, r7Var2, false);
                            return;
                        }
                        return;
                    }
                }
                org.telegram.ui.Components.xc.X().Q(R.raw.error, 36, LocaleController.getString(R.string.StoryNotFound)).k(false);
                return;
        }
    }

    public bg(LaunchActivity launchActivity, TLObject tLObject, int i10, long j10, boolean z10) {
        this.f17968a = 2;
        this.e = launchActivity;
        this.f17971f = tLObject;
        this.d = i10;
        this.f17969b = j10;
        this.f17970c = z10;
    }
}
