package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
public final class cg implements Runnable {
    public final int f18096a;
    public final long f18097b;
    public final boolean f18098c;
    public final int d;
    public final Object e;
    public final Object f18099f;

    public cg(BaseController baseController, long j10, List list, boolean z10, int i10, int i11) {
        this.f18096a = i11;
        this.e = baseController;
        this.f18097b = j10;
        this.f18099f = list;
        this.f18098c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        ci.q7 q7Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.f18096a;
        Object obj = this.f18099f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.f18097b, (List) obj, this.f18098c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f18097b, (ArrayList) obj, this.f18098c, this.d);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.C1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i11 = 0;
                    while (true) {
                        q7Var = null;
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f20506id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j10 = this.f18097b;
                        storyItem.dialogId = j10;
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
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
                            if (this.f18098c) {
                                R.getOrCreateStoryViewer().f6260w1 = true;
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

    public cg(LaunchActivity launchActivity, TLObject tLObject, int i10, long j10, boolean z10) {
        this.f18096a = 2;
        this.e = launchActivity;
        this.f18099f = tLObject;
        this.d = i10;
        this.f18097b = j10;
        this.f18098c = z10;
    }
}
