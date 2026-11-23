package ai;

import fi.y6;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bx;
public final class y0 implements Runnable {
    public final int f1596a = 0;
    public final int f1597b;
    public final long f1598c;
    public final boolean d;
    public final Object f1599e;
    public final Object f1600f;

    public y0(z0 z0Var, boolean z10, float[] fArr, long j3, int i7) {
        this.f1599e = z0Var;
        this.d = z10;
        this.f1600f = fArr;
        this.f1598c = j3;
        this.f1597b = i7;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        int i7 = this.f1596a;
        float[] fArr = null;
        r2 = null;
        y6 a10 = null;
        boolean z10 = this.d;
        long j3 = this.f1598c;
        int i10 = this.f1597b;
        Object obj = this.f1600f;
        Object obj2 = this.f1599e;
        switch (i7) {
            case 0:
                z0 z0Var = (z0) obj2;
                float[] fArr2 = (float[]) obj;
                ExecutorService executorService = DictationLid.f43150a;
                if (z10) {
                    fArr = fArr2;
                }
                z0Var.a(fArr, j3, i10);
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
                            if (tL_stories_stories.stories.get(i11).f28731id == i10) {
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
                            if (Q instanceof bx) {
                                try {
                                    a10 = y6.a(((bx) Q).F0.h);
                                } catch (Exception unused) {
                                }
                            }
                            y6 y6Var = a10;
                            Q.getOrCreateStoryViewer().B();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j3));
                            if (z10) {
                                Q.getOrCreateStoryViewer().f12009w1 = true;
                            }
                            Q.getOrCreateStoryViewer().M(launchActivity, storyItem, arrayList, 0, null, null, y6Var, false);
                            return;
                        }
                        return;
                    }
                }
                kc.Y().Q(2131624012, 36, gd.N0(2131744362, null)).k(false);
                return;
        }
    }

    public y0(LaunchActivity launchActivity, TLObject tLObject, int i7, long j3, boolean z10) {
        this.f1599e = launchActivity;
        this.f1600f = tLObject;
        this.f1597b = i7;
        this.f1598c = j3;
        this.d = z10;
    }
}
