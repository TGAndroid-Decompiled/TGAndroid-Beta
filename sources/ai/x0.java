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
public final class x0 implements Runnable {
    public final int f1584a = 0;
    public final int f1585b;
    public final long f1586c;
    public final boolean d;
    public final Object f1587e;
    public final Object f1588f;

    public x0(y0 y0Var, boolean z10, float[] fArr, long j3, int i7) {
        this.f1587e = y0Var;
        this.d = z10;
        this.f1588f = fArr;
        this.f1586c = j3;
        this.f1585b = i7;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        int i7 = this.f1584a;
        float[] fArr = null;
        r2 = null;
        y6 a10 = null;
        boolean z10 = this.d;
        long j3 = this.f1586c;
        int i10 = this.f1585b;
        Object obj = this.f1588f;
        Object obj2 = this.f1587e;
        switch (i7) {
            case 0:
                y0 y0Var = (y0) obj2;
                float[] fArr2 = (float[]) obj;
                ExecutorService executorService = DictationLid.f43040a;
                if (z10) {
                    fArr = fArr2;
                }
                y0Var.a(fArr, j3, i10);
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
                            if (tL_stories_stories.stories.get(i11).f28637id == i10) {
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
                                Q.getOrCreateStoryViewer().f11998w1 = true;
                            }
                            Q.getOrCreateStoryViewer().M(launchActivity, storyItem, arrayList, 0, null, null, y6Var, false);
                            return;
                        }
                        return;
                    }
                }
                lc.Y().Q(2131624012, 36, hd.N0(2131744365, null)).k(false);
                return;
        }
    }

    public x0(LaunchActivity launchActivity, TLObject tLObject, int i7, long j3, boolean z10) {
        this.f1587e = launchActivity;
        this.f1588f = tLObject;
        this.f1585b = i7;
        this.f1586c = j3;
        this.d = z10;
    }
}
