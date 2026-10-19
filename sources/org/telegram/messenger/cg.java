package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cy;
public final class cg implements Runnable {
    public final int f18099a;
    public final long f18100b;
    public final boolean f18101c;
    public final int d;
    public final Object e;
    public final Object f18102f;

    public cg(BaseController baseController, long j10, List list, boolean z10, int i10, int i11) {
        this.f18099a = i11;
        this.e = baseController;
        this.f18100b = j10;
        this.f18102f = list;
        this.f18101c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        ci.r7 r7Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.f18099a;
        Object obj = this.f18102f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.f18100b, (List) obj, this.f18101c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f18100b, (ArrayList) obj, this.f18101c, this.d);
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
                            if (tL_stories_stories.stories.get(i11).f20509id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j10 = this.f18100b;
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
                            if (this.f18101c) {
                                R.getOrCreateStoryViewer().f5227w1 = true;
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

    public cg(LaunchActivity launchActivity, TLObject tLObject, int i10, long j10, boolean z10) {
        this.f18099a = 2;
        this.e = launchActivity;
        this.f18102f = tLObject;
        this.d = i10;
        this.f18100b = j10;
        this.f18101c = z10;
    }
}
