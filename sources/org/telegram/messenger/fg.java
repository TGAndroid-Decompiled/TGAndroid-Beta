package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.uy;
public final class fg implements Runnable {
    public final int f17723a;
    public final long f17724b;
    public final boolean f17725c;
    public final int d;
    public final Object f17726e;
    public final Object f17727f;

    public fg(BaseController baseController, long j3, List list, boolean z10, int i10, int i11) {
        this.f17723a = i11;
        this.f17726e = baseController;
        this.f17724b = j3;
        this.f17727f = list;
        this.f17725c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        bi.d9 d9Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.f17723a;
        Object obj = this.f17727f;
        Object obj2 = this.f17726e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.f17724b, (List) obj, this.f17725c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f17724b, (ArrayList) obj, this.f17725c, this.d);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i11 = 0;
                    while (true) {
                        d9Var = null;
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f20133id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j3 = this.f17724b;
                        storyItem.dialogId = j3;
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        if (R != null) {
                            if (R instanceof uy) {
                                try {
                                    d9Var = bi.d9.a(((uy) R).E0.h);
                                } catch (Exception unused) {
                                }
                            }
                            bi.d9 d9Var2 = d9Var;
                            R.getOrCreateStoryViewer().v();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j3));
                            if (this.f17725c) {
                                R.getOrCreateStoryViewer().f3610w1 = true;
                            }
                            R.getOrCreateStoryViewer().G(launchActivity, storyItem, arrayList, 0, null, null, d9Var2, false);
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
        this.f17723a = 2;
        this.f17726e = launchActivity;
        this.f17727f = tLObject;
        this.d = i10;
        this.f17724b = j3;
        this.f17725c = z10;
    }
}
