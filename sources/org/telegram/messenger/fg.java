package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
public final class fg implements Runnable {
    public final int f20097a;
    public final long f20098b;
    public final boolean f20099c;
    public final int d;
    public final Object e;
    public final Object f20100f;

    public fg(BaseController baseController, long j10, List list, boolean z10, int i10, int i11) {
        this.f20097a = i11;
        this.e = baseController;
        this.f20098b = j10;
        this.f20100f = list;
        this.f20099c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        di.q7 q7Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.f20097a;
        Object obj = this.f20100f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$50(this.f20098b, (List) obj, this.f20099c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f20098b, (ArrayList) obj, this.f20099c, this.d);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.D1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i11 = 0;
                    while (true) {
                        q7Var = null;
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f22267id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j10 = this.f20098b;
                        storyItem.dialogId = j10;
                        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                        if (R != null) {
                            if (R instanceof ey) {
                                try {
                                    q7Var = di.q7.a(((ey) R).E0.h);
                                } catch (Exception unused) {
                                }
                            }
                            di.q7 q7Var2 = q7Var;
                            R.getOrCreateStoryViewer().w();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j10));
                            if (this.f20099c) {
                                R.getOrCreateStoryViewer().f9466w1 = true;
                            }
                            R.getOrCreateStoryViewer().H(launchActivity, storyItem, arrayList, 0, null, null, q7Var2, false);
                            return;
                        }
                        return;
                    }
                }
                org.telegram.ui.Components.wc.Y().R(R.raw.error, 36, LocaleController.getString(R.string.StoryNotFound)).k(false);
                return;
        }
    }

    public fg(LaunchActivity launchActivity, TLObject tLObject, int i10, long j10, boolean z10) {
        this.f20097a = 2;
        this.e = launchActivity;
        this.f20100f = tLObject;
        this.d = i10;
        this.f20098b = j10;
        this.f20099c = z10;
    }
}
