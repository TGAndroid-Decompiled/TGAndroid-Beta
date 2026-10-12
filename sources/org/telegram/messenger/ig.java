package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.vy;
public final class ig implements Runnable {
    public final int f17879a;
    public final long f17880b;
    public final boolean f17881c;
    public final int d;
    public final Object f17882e;
    public final Object f17883f;

    public ig(BaseController baseController, long j3, List list, boolean z10, int i10, int i11) {
        this.f17879a = i11;
        this.f17882e = baseController;
        this.f17880b = j3;
        this.f17883f = list;
        this.f17881c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        ai.v9 v9Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.f17879a;
        Object obj = this.f17883f;
        Object obj2 = this.f17882e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.f17880b, (List) obj, this.f17881c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f17880b, (ArrayList) obj, this.f17881c, this.d);
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
                            if (tL_stories_stories.stories.get(i11).f20041id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j3 = this.f17880b;
                        storyItem.dialogId = j3;
                        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                        if (R != null) {
                            if (R instanceof vy) {
                                try {
                                    v9Var = ai.v9.a(((vy) R).E0.h);
                                } catch (Exception unused) {
                                }
                            }
                            ai.v9 v9Var2 = v9Var;
                            R.getOrCreateStoryViewer().v();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j3));
                            if (this.f17881c) {
                                R.getOrCreateStoryViewer().f1303w1 = true;
                            }
                            R.getOrCreateStoryViewer().G(launchActivity, storyItem, arrayList, 0, null, null, v9Var2, false);
                            return;
                        }
                        return;
                    }
                }
                org.telegram.ui.Components.zc.X().Q(R.raw.error, 36, LocaleController.getString(R.string.StoryNotFound)).k(false);
                return;
        }
    }

    public ig(LaunchActivity launchActivity, TLObject tLObject, int i10, long j3, boolean z10) {
        this.f17879a = 2;
        this.f17882e = launchActivity;
        this.f17883f = tLObject;
        this.d = i10;
        this.f17880b = j3;
        this.f17881c = z10;
    }
}
