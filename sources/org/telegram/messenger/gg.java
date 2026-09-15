package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.uy;
public final class gg implements Runnable {
    public final int f16242a;
    public final long f16243b;
    public final boolean f16244c;
    public final int d;
    public final Object e;
    public final Object f16245f;

    public gg(BaseController baseController, long j3, List list, boolean z10, int i10, int i11) {
        this.f16242a = i11;
        this.e = baseController;
        this.f16243b = j3;
        this.f16245f = list;
        this.f16244c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        ai.u9 u9Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.f16242a;
        Object obj = this.f16245f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.f16243b, (List) obj, this.f16244c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f16243b, (ArrayList) obj, this.f16244c, this.d);
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
                            if (tL_stories_stories.stories.get(i11).f18348id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j3 = this.f16243b;
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
                            if (this.f16244c) {
                                R.getOrCreateStoryViewer().f1113w1 = true;
                            }
                            R.getOrCreateStoryViewer().G(launchActivity, storyItem, arrayList, 0, null, null, u9Var2, false);
                            return;
                        }
                        return;
                    }
                }
                org.telegram.ui.Components.vc.X().Q(R.raw.error, 36, LocaleController.getString(R.string.StoryNotFound)).k(false);
                return;
        }
    }

    public gg(LaunchActivity launchActivity, TLObject tLObject, int i10, long j3, boolean z10) {
        this.f16242a = 2;
        this.e = launchActivity;
        this.f16245f = tLObject;
        this.d = i10;
        this.f16243b = j3;
        this.f16244c = z10;
    }
}
