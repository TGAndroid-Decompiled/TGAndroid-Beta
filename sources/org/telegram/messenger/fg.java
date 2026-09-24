package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qy;
public final class fg implements Runnable {
    public final int f16366a;
    public final long f16367b;
    public final boolean f16368c;
    public final int d;
    public final Object e;
    public final Object f16369f;

    public fg(BaseController baseController, long j3, List list, boolean z10, int i10, int i11) {
        this.f16366a = i11;
        this.e = baseController;
        this.f16367b = j3;
        this.f16369f = list;
        this.f16368c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        ai.u9 u9Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.f16366a;
        Object obj = this.f16369f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.f16367b, (List) obj, this.f16368c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f16367b, (ArrayList) obj, this.f16368c, this.d);
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
                            if (tL_stories_stories.stories.get(i11).f18556id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j3 = this.f16367b;
                        storyItem.dialogId = j3;
                        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                        if (R != null) {
                            if (R instanceof qy) {
                                try {
                                    u9Var = ai.u9.a(((qy) R).E0.h);
                                } catch (Exception unused) {
                                }
                            }
                            ai.u9 u9Var2 = u9Var;
                            R.getOrCreateStoryViewer().v();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j3));
                            if (this.f16368c) {
                                R.getOrCreateStoryViewer().f1109w1 = true;
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
        this.f16366a = 2;
        this.e = launchActivity;
        this.f16369f = tLObject;
        this.d = i10;
        this.f16367b = j3;
        this.f16368c = z10;
    }
}
