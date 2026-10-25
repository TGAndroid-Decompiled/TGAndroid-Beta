package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cy;
public final class eg implements Runnable {
    public final int f20006a;
    public final long f20007b;
    public final boolean f20008c;
    public final int d;
    public final Object e;
    public final Object f20009f;

    public eg(BaseController baseController, long j10, List list, boolean z10, int i10, int i11) {
        this.f20006a = i11;
        this.e = baseController;
        this.f20007b = j10;
        this.f20009f = list;
        this.f20008c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        di.q7 q7Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.f20006a;
        Object obj = this.f20009f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$50(this.f20007b, (List) obj, this.f20008c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f20007b, (ArrayList) obj, this.f20008c, this.d);
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
                            if (tL_stories_stories.stories.get(i11).f22264id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j10 = this.f20007b;
                        storyItem.dialogId = j10;
                        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                        if (R != null) {
                            if (R instanceof cy) {
                                try {
                                    q7Var = di.q7.a(((cy) R).E0.h);
                                } catch (Exception unused) {
                                }
                            }
                            di.q7 q7Var2 = q7Var;
                            R.getOrCreateStoryViewer().v();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j10));
                            if (this.f20008c) {
                                R.getOrCreateStoryViewer().f9467w1 = true;
                            }
                            R.getOrCreateStoryViewer().G(launchActivity, storyItem, arrayList, 0, null, null, q7Var2, false);
                            return;
                        }
                        return;
                    }
                }
                org.telegram.ui.Components.wc.Y().R(R.raw.error, 36, LocaleController.getString(R.string.StoryNotFound)).k(false);
                return;
        }
    }

    public eg(LaunchActivity launchActivity, TLObject tLObject, int i10, long j10, boolean z10) {
        this.f20006a = 2;
        this.e = launchActivity;
        this.f20009f = tLObject;
        this.d = i10;
        this.f20007b = j10;
        this.f20008c = z10;
    }
}
