package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.uy;
public final class gg implements Runnable {
    public final int f17810a;
    public final long f17811b;
    public final boolean f17812c;
    public final int d;
    public final Object f17813e;
    public final Object f17814f;

    public gg(BaseController baseController, long j3, List list, boolean z10, int i10, int i11) {
        this.f17810a = i11;
        this.f17813e = baseController;
        this.f17811b = j3;
        this.f17814f = list;
        this.f17812c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        bi.d9 d9Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.f17810a;
        Object obj = this.f17814f;
        Object obj2 = this.f17813e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.f17811b, (List) obj, this.f17812c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f17811b, (ArrayList) obj, this.f17812c, this.d);
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
                            if (tL_stories_stories.stories.get(i11).f20134id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j3 = this.f17811b;
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
                            if (this.f17812c) {
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

    public gg(LaunchActivity launchActivity, TLObject tLObject, int i10, long j3, boolean z10) {
        this.f17810a = 2;
        this.f17813e = launchActivity;
        this.f17814f = tLObject;
        this.d = i10;
        this.f17811b = j3;
        this.f17812c = z10;
    }
}
