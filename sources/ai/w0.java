package ai;

import fi.b7;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yw;
public final class w0 implements Runnable {
    public final int f1605a = 0;
    public final int f1606b;
    public final long f1607c;
    public final boolean d;
    public final Object f1608e;
    public final Object f1609f;

    public w0(b1 b1Var, boolean z10, float[] fArr, long j3, int i7) {
        this.f1608e = b1Var;
        this.d = z10;
        this.f1609f = fArr;
        this.f1607c = j3;
        this.f1606b = i7;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        int i7 = this.f1605a;
        float[] fArr = null;
        r2 = null;
        b7 a10 = null;
        boolean z10 = this.d;
        long j3 = this.f1607c;
        int i10 = this.f1606b;
        Object obj = this.f1609f;
        Object obj2 = this.f1608e;
        switch (i7) {
            case 0:
                b1 b1Var = (b1) obj2;
                float[] fArr2 = (float[]) obj;
                ExecutorService executorService = DictationLid.f42585a;
                if (z10) {
                    fArr = fArr2;
                }
                b1Var.a(fArr, j3, i10);
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
                            if (tL_stories_stories.stories.get(i11).f28290id == i10) {
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
                        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            if (Q instanceof yw) {
                                try {
                                    a10 = b7.a(((yw) Q).F0.h);
                                } catch (Exception unused) {
                                }
                            }
                            b7 b7Var = a10;
                            Q.getOrCreateStoryViewer().B();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j3));
                            if (z10) {
                                Q.getOrCreateStoryViewer().f11881w1 = true;
                            }
                            Q.getOrCreateStoryViewer().M(launchActivity, storyItem, arrayList, 0, null, null, b7Var, false);
                            return;
                        }
                        return;
                    }
                }
                cc.X().Q(2131624012, 36, hd.M0(2131744606, null)).k(false);
                return;
        }
    }

    public w0(LaunchActivity launchActivity, TLObject tLObject, int i7, long j3, boolean z10) {
        this.f1608e = launchActivity;
        this.f1609f = tLObject;
        this.f1606b = i7;
        this.f1607c = j3;
        this.d = z10;
    }
}
