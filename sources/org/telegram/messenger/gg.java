package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.uy;
public final class gg implements Runnable {
    public final int f17783a;
    public final long f17784b;
    public final boolean f17785c;
    public final int d;
    public final Object f17786e;
    public final Object f17787f;

    public gg(BaseController baseController, long j3, List list, boolean z10, int i10, int i11) {
        this.f17783a = i11;
        this.f17786e = baseController;
        this.f17784b = j3;
        this.f17787f = list;
        this.f17785c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        bi.d9 d9Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.f17783a;
        Object obj = this.f17787f;
        Object obj2 = this.f17786e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.f17784b, (List) obj, this.f17785c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f17784b, (ArrayList) obj, this.f17785c, this.d);
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
                            if (tL_stories_stories.stories.get(i11).f20107id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j3 = this.f17784b;
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
                            if (this.f17785c) {
                                R.getOrCreateStoryViewer().f3583w1 = true;
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

    public gg(LaunchActivity launchActivity, TLObject tLObject, int i10, long j3, boolean z10) {
        this.f17783a = 2;
        this.f17786e = launchActivity;
        this.f17787f = tLObject;
        this.d = i10;
        this.f17784b = j3;
        this.f17785c = z10;
    }
}
