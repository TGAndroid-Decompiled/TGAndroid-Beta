package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sy;
public final class fg implements Runnable {
    public final int f17885a;
    public final long f17886b;
    public final boolean f17887c;
    public final int d;
    public final Object f17888e;
    public final Object f17889f;

    public fg(BaseController baseController, long j3, List list, boolean z10, int i10, int i11) {
        this.f17885a = i11;
        this.f17888e = baseController;
        this.f17886b = j3;
        this.f17889f = list;
        this.f17887c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        ai.v9 v9Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.f17885a;
        Object obj = this.f17889f;
        Object obj2 = this.f17888e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.f17886b, (List) obj, this.f17887c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f17886b, (ArrayList) obj, this.f17887c, this.d);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i11 = 0;
                    while (true) {
                        v9Var = null;
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f20305id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j3 = this.f17886b;
                        storyItem.dialogId = j3;
                        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                        if (R != null) {
                            if (R instanceof sy) {
                                try {
                                    v9Var = ai.v9.a(((sy) R).E0.h);
                                } catch (Exception unused) {
                                }
                            }
                            ai.v9 v9Var2 = v9Var;
                            R.getOrCreateStoryViewer().v();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j3));
                            if (this.f17887c) {
                                R.getOrCreateStoryViewer().f1305w1 = true;
                            }
                            R.getOrCreateStoryViewer().G(launchActivity, storyItem, arrayList, 0, null, null, v9Var2, false);
                            return;
                        }
                        return;
                    }
                }
                org.telegram.ui.Components.ad.X().Q(R.raw.error, 36, LocaleController.getString(R.string.StoryNotFound)).k(false);
                return;
        }
    }

    public fg(LaunchActivity launchActivity, TLObject tLObject, int i10, long j3, boolean z10) {
        this.f17885a = 2;
        this.f17888e = launchActivity;
        this.f17889f = tLObject;
        this.d = i10;
        this.f17886b = j3;
        this.f17887c = z10;
    }
}
