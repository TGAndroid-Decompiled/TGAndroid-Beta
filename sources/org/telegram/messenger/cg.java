package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gy;

public final class cg implements Runnable {

    public final int f19968a;

    public final long f19969b;

    public final boolean f19970c;
    public final int d;

    public final Object f19971e;

    public final Object f19972f;

    public cg(BaseController baseController, long j10, List list, boolean z10, int i10, int i11) {
        this.f19968a = i11;
        this.f19971e = baseController;
        this.f19969b = j10;
        this.f19972f = list;
        this.f19970c = z10;
        this.d = i10;
    }

    @Override
    public final void run() throws Throwable {
        jh.b7 b7VarA;
        TL_stories.StoryItem storyItem;
        int i10 = this.f19968a;
        Object obj = this.f19972f;
        Object obj2 = this.f19971e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.f19969b, (List) obj, this.f19970c, this.d);
                break;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f19969b, (ArrayList) obj, this.f19970c, this.d);
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.f35496x1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i11 = 0;
                    while (true) {
                        b7VarA = null;
                        if (i11 >= tL_stories_stories.stories.size()) {
                            storyItem = null;
                        } else if (tL_stories_stories.stories.get(i11).f22617id == this.d) {
                            storyItem = tL_stories_stories.stories.get(i11);
                        } else {
                            i11++;
                        }
                    }
                    if (storyItem != null) {
                        long j10 = this.f19969b;
                        storyItem.dialogId = j10;
                        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                        if (n2VarR != null) {
                            if (n2VarR instanceof gy) {
                                try {
                                    b7VarA = jh.b7.a(((gy) n2VarR).A0.h);
                                    break;
                                } catch (Exception unused) {
                                }
                            }
                            jh.b7 b7Var = b7VarA;
                            n2VarR.getOrCreateStoryViewer().v();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j10));
                            if (this.f19970c) {
                                n2VarR.getOrCreateStoryViewer().f13507s1 = true;
                            }
                            n2VarR.getOrCreateStoryViewer().F(launchActivity, storyItem, arrayList, 0, null, null, b7Var, false);
                            break;
                        }
                    }
                }
                org.telegram.ui.Components.mc.X().Q(R.raw.error, 36, LocaleController.getString(R.string.StoryNotFound)).k(false);
                break;
        }
    }

    public cg(LaunchActivity launchActivity, TLObject tLObject, int i10, long j10, boolean z10) {
        this.f19968a = 2;
        this.f19971e = launchActivity;
        this.f19972f = tLObject;
        this.d = i10;
        this.f19969b = j10;
        this.f19970c = z10;
    }
}
