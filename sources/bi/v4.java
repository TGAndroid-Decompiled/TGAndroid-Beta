package bi;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;
public final class v4 implements View.OnClickListener {
    public final int f3860a;
    public final h5 f3861b;

    public v4(h5 h5Var, int i10) {
        this.f3860a = i10;
        this.f3861b = h5Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3860a) {
            case 0:
                q5 q5Var = this.f3861b.f3126l;
                q5.e0(q5Var, q5Var.B1);
                h5 h5Var = q5Var.f3567t1;
                if (h5Var != null) {
                    h5Var.a();
                    return;
                }
                return;
            case 1:
                q5 q5Var2 = this.f3861b.f3126l;
                q5.d0(q5Var2);
                h5 h5Var2 = q5Var2.f3567t1;
                if (h5Var2 != null) {
                    h5Var2.a();
                    return;
                }
                return;
            case 2:
                q5 q5Var3 = this.f3861b.f3126l;
                AndroidUtilities.addToClipboard(q5Var3.O1.e());
                q5.j0(q5Var3);
                h5 h5Var3 = q5Var3.f3567t1;
                if (h5Var3 != null) {
                    h5Var3.a();
                    return;
                }
                return;
            case 3:
                q5 q5Var4 = this.f3861b.f3126l;
                q5Var4.Y0(false);
                h5 h5Var4 = q5Var4.f3567t1;
                if (h5Var4 != null) {
                    h5Var4.a();
                    return;
                }
                return;
            case 4:
                q5 q5Var5 = this.f3861b.f3126l;
                o5 o5Var = q5Var5.O1;
                o5Var.f3417a.translated = false;
                k9 k9Var = MessagesController.getInstance(q5Var5.C2).getStoriesController().f3973k;
                TL_stories.StoryItem storyItem = o5Var.f3417a;
                k9Var.k(storyItem.dialogId, storyItem);
                q5Var5.p0();
                q5Var5.f1(false);
                h5 h5Var5 = q5Var5.f3567t1;
                if (h5Var5 != null) {
                    h5Var5.a();
                    return;
                }
                return;
            case 5:
                h5 h5Var6 = this.f3861b;
                q5 q5Var6 = h5Var6.f3126l;
                o5 o5Var2 = q5Var6.O1;
                o5Var2.f3417a.translated = true;
                q5Var6.p0();
                j5 j5Var = q5Var6.Q1;
                if (j5Var != null) {
                    sb sbVar = ((jb) j5Var).d;
                    sbVar.Z0 = true;
                    sbVar.P();
                }
                k9 k9Var2 = MessagesController.getInstance(q5Var6.C2).getStoriesController().f3973k;
                TL_stories.StoryItem storyItem2 = o5Var2.f3417a;
                k9Var2.k(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(q5Var6.C2).getTranslateController().translateStory(o5Var2.f3417a, new g(new z4(h5Var6, 1), System.currentTimeMillis(), 2));
                q5Var6.f1(false);
                q5Var6.f3534h3 = true;
                q5Var6.K0.D(true);
                h5 h5Var7 = q5Var6.f3567t1;
                if (h5Var7 != null) {
                    h5Var7.a();
                    return;
                }
                return;
            case 6:
                q5 q5Var7 = this.f3861b.f3126l;
                w8 w8Var = q5Var7.O1.f3418b;
                if (w8Var != null) {
                    w8Var.a();
                    q5Var7.j1();
                }
                h5 h5Var8 = q5Var7.f3567t1;
                if (h5Var8 != null) {
                    h5Var8.a();
                    return;
                }
                return;
            case 7:
                q5 q5Var8 = this.f3861b.f3126l;
                q5.d0(q5Var8);
                h5 h5Var9 = q5Var8.f3567t1;
                if (h5Var9 != null) {
                    h5Var9.a();
                    return;
                }
                return;
            case 8:
                q5 q5Var9 = this.f3861b.f3126l;
                AndroidUtilities.addToClipboard(q5Var9.O1.e());
                q5.j0(q5Var9);
                h5 h5Var10 = q5Var9.f3567t1;
                if (h5Var10 != null) {
                    h5Var10.a();
                    return;
                }
                return;
            case 9:
                q5 q5Var10 = this.f3861b.f3126l;
                q5Var10.Y0(false);
                h5 h5Var11 = q5Var10.f3567t1;
                if (h5Var11 != null) {
                    h5Var11.a();
                    return;
                }
                return;
            case 10:
                t1 t1Var = t1.W;
                if (t1Var != null && t1Var.f3728n) {
                    long j10 = t1Var.J;
                    boolean z10 = !t1Var.I;
                    t1Var.I = z10;
                    NativeInstance.switchCameraCapturer(j10, z10);
                }
                h5 h5Var12 = this.f3861b.f3126l.f3567t1;
                if (h5Var12 != null) {
                    h5Var12.a();
                    return;
                }
                return;
            case 11:
                this.f3861b.f3126l.D3.b();
                return;
            case 12:
                this.f3861b.f3126l.E3.b();
                return;
            case 13:
                q5 q5Var11 = this.f3861b.f3126l;
                q5.f0(q5Var11);
                h5 h5Var13 = q5Var11.f3567t1;
                if (h5Var13 != null) {
                    h5Var13.a();
                    return;
                }
                return;
            case 14:
                q5 q5Var12 = this.f3861b.f3126l;
                MediaDataController.getInstance(q5Var12.C2).removePeer(q5Var12.B1);
                q5Var12.S1.i0(q5Var12.B1, true, false);
                h5 h5Var14 = q5Var12.f3567t1;
                if (h5Var14 != null) {
                    h5Var14.a();
                    return;
                }
                return;
            default:
                q5 q5Var13 = this.f3861b.f3126l;
                q5.e0(q5Var13, q5Var13.B1);
                h5 h5Var15 = q5Var13.f3567t1;
                if (h5Var15 != null) {
                    h5Var15.a();
                    return;
                }
                return;
        }
    }
}
