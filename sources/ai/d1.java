package ai;

import fi.y6;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;
public final class d1 implements Runnable {
    public final int f1152a = 0;
    public final int f1153b;
    public final long f1154c;
    public final boolean d;
    public final Object f1155e;
    public final Object f1156f;

    public d1(e1 e1Var, boolean z10, float[] fArr, long j3, int i7) {
        this.f1155e = e1Var;
        this.d = z10;
        this.f1156f = fArr;
        this.f1154c = j3;
        this.f1153b = i7;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        int i7 = this.f1152a;
        float[] fArr = null;
        r2 = null;
        y6 a10 = null;
        boolean z10 = this.d;
        long j3 = this.f1154c;
        int i10 = this.f1153b;
        Object obj = this.f1156f;
        Object obj2 = this.f1155e;
        switch (i7) {
            case 0:
                e1 e1Var = (e1) obj2;
                float[] fArr2 = (float[]) obj;
                ExecutorService executorService = DictationLid.f43075a;
                if (z10) {
                    fArr = fArr2;
                }
                e1Var.a(fArr, j3, i10);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                String str = LaunchActivity.C1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i11 = 0;
                    while (true) {
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f28673id == i10) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        storyItem.dialogId = j3;
                        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            if (Q instanceof cx) {
                                try {
                                    a10 = y6.a(((cx) Q).F0.h);
                                } catch (Exception unused) {
                                }
                            }
                            y6 y6Var = a10;
                            Q.getOrCreateStoryViewer().B();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j3));
                            if (z10) {
                                Q.getOrCreateStoryViewer().f12047w1 = true;
                            }
                            Q.getOrCreateStoryViewer().M(launchActivity, storyItem, arrayList, 0, null, null, y6Var, false);
                            return;
                        }
                        return;
                    }
                }
                lc.Y().Q(2131624012, 36, hd.N0(2131744363, null)).k(false);
                return;
        }
    }

    public d1(LaunchActivity launchActivity, TLObject tLObject, int i7, long j3, boolean z10) {
        this.f1155e = launchActivity;
        this.f1156f = tLObject;
        this.f1153b = i7;
        this.f1154c = j3;
        this.d = z10;
    }
}
