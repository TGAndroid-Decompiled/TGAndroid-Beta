package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.uy;
public final class fg implements Runnable {
    public final int f17867a;
    public final long f17868b;
    public final boolean f17869c;
    public final int d;
    public final Object f17870e;
    public final Object f17871f;

    public fg(BaseController baseController, long j3, List list, boolean z10, int i10, int i11) {
        this.f17867a = i11;
        this.f17870e = baseController;
        this.f17868b = j3;
        this.f17871f = list;
        this.f17869c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        ai.u9 u9Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.f17867a;
        Object obj = this.f17871f;
        Object obj2 = this.f17870e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.f17868b, (List) obj, this.f17869c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f17868b, (ArrayList) obj, this.f17869c, this.d);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i11 = 0;
                    while (true) {
                        u9Var = null;
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f20275id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j3 = this.f17868b;
                        storyItem.dialogId = j3;
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        if (R != null) {
                            if (R instanceof uy) {
                                try {
                                    u9Var = ai.u9.a(((uy) R).E0.h);
                                } catch (Exception unused) {
                                }
                            }
                            ai.u9 u9Var2 = u9Var;
                            R.getOrCreateStoryViewer().v();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j3));
                            if (this.f17869c) {
                                R.getOrCreateStoryViewer().f1196w1 = true;
                            }
                            R.getOrCreateStoryViewer().G(launchActivity, storyItem, arrayList, 0, null, null, u9Var2, false);
                            return;
                        }
                        return;
                    }
                }
                org.telegram.ui.Components.yc.X().Q(R.raw.error, 36, LocaleController.getString(R.string.StoryNotFound)).k(false);
                return;
        }
    }

    public fg(LaunchActivity launchActivity, TLObject tLObject, int i10, long j3, boolean z10) {
        this.f17867a = 2;
        this.f17870e = launchActivity;
        this.f17871f = tLObject;
        this.d = i10;
        this.f17868b = j3;
        this.f17869c = z10;
    }
}
