package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wy;
public final class og implements Runnable {
    public final int f15982a;
    public final long f15983b;
    public final boolean f15984c;
    public final int d;
    public final Object e;
    public final Object f15985f;

    public og(BaseController baseController, long j3, List list, boolean z10, int i10, int i11) {
        this.f15982a = i11;
        this.e = baseController;
        this.f15983b = j3;
        this.f15985f = list;
        this.f15984c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        zh.s5 s5Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.f15982a;
        Object obj = this.f15985f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.f15983b, (List) obj, this.f15984c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f15983b, (ArrayList) obj, this.f15984c, this.d);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i11 = 0;
                    while (true) {
                        s5Var = null;
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f17435id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j3 = this.f15983b;
                        storyItem.dialogId = j3;
                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                        if (R != null) {
                            if (R instanceof wy) {
                                try {
                                    s5Var = zh.s5.a(((wy) R).E0.h);
                                } catch (Exception unused) {
                                }
                            }
                            zh.s5 s5Var2 = s5Var;
                            R.getOrCreateStoryViewer().v();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j3));
                            if (this.f15984c) {
                                R.getOrCreateStoryViewer().f48969w1 = true;
                            }
                            R.getOrCreateStoryViewer().F(launchActivity, storyItem, arrayList, 0, null, null, s5Var2, false);
                            return;
                        }
                        return;
                    }
                }
                org.telegram.ui.Components.wc.X().Q(R.raw.error, 36, LocaleController.getString(R.string.StoryNotFound)).k(false);
                return;
        }
    }

    public og(LaunchActivity launchActivity, TLObject tLObject, int i10, long j3, boolean z10) {
        this.f15982a = 2;
        this.e = launchActivity;
        this.f15985f = tLObject;
        this.d = i10;
        this.f15983b = j3;
        this.f15984c = z10;
    }
}
