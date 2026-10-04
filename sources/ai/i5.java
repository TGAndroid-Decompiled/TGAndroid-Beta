package ai;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;
public final class i5 implements View.OnClickListener {
    public final int f1072a;
    public final v5 f1073b;

    public i5(v5 v5Var, int i10) {
        this.f1072a = i10;
        this.f1073b = v5Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1072a) {
            case 0:
                e6 e6Var = this.f1073b.f1756l;
                e6.e0(e6Var, e6Var.B1);
                v5 v5Var = e6Var.f895t1;
                if (v5Var != null) {
                    v5Var.a();
                    return;
                }
                return;
            case 1:
                e6 e6Var2 = this.f1073b.f1756l;
                e6.d0(e6Var2);
                v5 v5Var2 = e6Var2.f895t1;
                if (v5Var2 != null) {
                    v5Var2.a();
                    return;
                }
                return;
            case 2:
                e6 e6Var3 = this.f1073b.f1756l;
                AndroidUtilities.addToClipboard(e6Var3.O1.e());
                e6.j0(e6Var3);
                v5 v5Var3 = e6Var3.f895t1;
                if (v5Var3 != null) {
                    v5Var3.a();
                    return;
                }
                return;
            case 3:
                e6 e6Var4 = this.f1073b.f1756l;
                e6Var4.Y0(false);
                v5 v5Var4 = e6Var4.f895t1;
                if (v5Var4 != null) {
                    v5Var4.a();
                    return;
                }
                return;
            case 4:
                e6 e6Var5 = this.f1073b.f1756l;
                c6 c6Var = e6Var5.O1;
                c6Var.f696a.translated = false;
                y9 y9Var = MessagesController.getInstance(e6Var5.C2).getStoriesController().f1298k;
                TL_stories.StoryItem storyItem = c6Var.f696a;
                y9Var.k(storyItem.dialogId, storyItem);
                e6Var5.p0();
                e6Var5.f1(false);
                v5 v5Var5 = e6Var5.f895t1;
                if (v5Var5 != null) {
                    v5Var5.a();
                    return;
                }
                return;
            case 5:
                v5 v5Var6 = this.f1073b;
                e6 e6Var6 = v5Var6.f1756l;
                c6 c6Var2 = e6Var6.O1;
                c6Var2.f696a.translated = true;
                e6Var6.p0();
                x5 x5Var = e6Var6.Q1;
                if (x5Var != null) {
                    jc jcVar = ((ac) x5Var).d;
                    jcVar.Z0 = true;
                    jcVar.P();
                }
                y9 y9Var2 = MessagesController.getInstance(e6Var6.C2).getStoriesController().f1298k;
                TL_stories.StoryItem storyItem2 = c6Var2.f696a;
                y9Var2.k(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(e6Var6.C2).getTranslateController().translateStory(c6Var2.f696a, new j(new m5(v5Var6, 1), System.currentTimeMillis(), 2));
                e6Var6.f1(false);
                e6Var6.f863h3 = true;
                e6Var6.K0.E(true);
                v5 v5Var7 = e6Var6.f895t1;
                if (v5Var7 != null) {
                    v5Var7.a();
                    return;
                }
                return;
            case 6:
                e6 e6Var7 = this.f1073b.f1756l;
                k9 k9Var = e6Var7.O1.f697b;
                if (k9Var != null) {
                    k9Var.a();
                    e6Var7.j1();
                }
                v5 v5Var8 = e6Var7.f895t1;
                if (v5Var8 != null) {
                    v5Var8.a();
                    return;
                }
                return;
            case 7:
                e6 e6Var8 = this.f1073b.f1756l;
                e6.d0(e6Var8);
                v5 v5Var9 = e6Var8.f895t1;
                if (v5Var9 != null) {
                    v5Var9.a();
                    return;
                }
                return;
            case 8:
                e6 e6Var9 = this.f1073b.f1756l;
                AndroidUtilities.addToClipboard(e6Var9.O1.e());
                e6.j0(e6Var9);
                v5 v5Var10 = e6Var9.f895t1;
                if (v5Var10 != null) {
                    v5Var10.a();
                    return;
                }
                return;
            case 9:
                e6 e6Var10 = this.f1073b.f1756l;
                e6Var10.Y0(false);
                v5 v5Var11 = e6Var10.f895t1;
                if (v5Var11 != null) {
                    v5Var11.a();
                    return;
                }
                return;
            case 10:
                d2 d2Var = d2.W;
                if (d2Var != null && d2Var.f758n) {
                    long j3 = d2Var.J;
                    boolean z10 = !d2Var.I;
                    d2Var.I = z10;
                    NativeInstance.switchCameraCapturer(j3, z10);
                }
                v5 v5Var12 = this.f1073b.f1756l.f895t1;
                if (v5Var12 != null) {
                    v5Var12.a();
                    return;
                }
                return;
            case 11:
                this.f1073b.f1756l.D3.b();
                return;
            case 12:
                this.f1073b.f1756l.E3.b();
                return;
            case 13:
                e6 e6Var11 = this.f1073b.f1756l;
                e6.f0(e6Var11);
                v5 v5Var13 = e6Var11.f895t1;
                if (v5Var13 != null) {
                    v5Var13.a();
                    return;
                }
                return;
            case 14:
                e6 e6Var12 = this.f1073b.f1756l;
                MediaDataController.getInstance(e6Var12.C2).removePeer(e6Var12.B1);
                e6Var12.S1.i0(e6Var12.B1, true, false);
                v5 v5Var14 = e6Var12.f895t1;
                if (v5Var14 != null) {
                    v5Var14.a();
                    return;
                }
                return;
            default:
                e6 e6Var13 = this.f1073b.f1756l;
                e6.e0(e6Var13, e6Var13.B1);
                v5 v5Var15 = e6Var13.f895t1;
                if (v5Var15 != null) {
                    v5Var15.a();
                    return;
                }
                return;
        }
    }
}
