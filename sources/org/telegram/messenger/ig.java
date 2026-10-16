package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yy;
public final class ig implements Runnable {
    public final int f17192a;
    public final long f17193b;
    public final boolean f17194c;
    public final int d;
    public final Object e;
    public final Object f17195f;

    public ig(BaseController baseController, long j10, List list, boolean z10, int i10, int i11) {
        this.f17192a = i11;
        this.e = baseController;
        this.f17193b = j10;
        this.f17195f = list;
        this.f17194c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        bi.g9 g9Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.f17192a;
        Object obj = this.f17195f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.f17193b, (List) obj, this.f17194c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f17193b, (ArrayList) obj, this.f17194c, this.d);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i11 = 0;
                    while (true) {
                        g9Var = null;
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f19151id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j10 = this.f17193b;
                        storyItem.dialogId = j10;
                        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                        if (R != null) {
                            if (R instanceof yy) {
                                try {
                                    g9Var = bi.g9.a(((yy) R).E0.h);
                                } catch (Exception unused) {
                                }
                            }
                            bi.g9 g9Var2 = g9Var;
                            R.getOrCreateStoryViewer().v();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j10));
                            if (this.f17194c) {
                                R.getOrCreateStoryViewer().f3715w1 = true;
                            }
                            R.getOrCreateStoryViewer().G(launchActivity, storyItem, arrayList, 0, null, null, g9Var2, false);
                            return;
                        }
                        return;
                    }
                }
                org.telegram.ui.Components.zc.X().Q(R.raw.error, 36, LocaleController.getString(R.string.StoryNotFound)).k(false);
                return;
        }
    }

    public ig(LaunchActivity launchActivity, TLObject tLObject, int i10, long j10, boolean z10) {
        this.f17192a = 2;
        this.e = launchActivity;
        this.f17195f = tLObject;
        this.d = i10;
        this.f17193b = j10;
        this.f17194c = z10;
    }
}
