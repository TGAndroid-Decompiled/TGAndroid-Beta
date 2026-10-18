package ci;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;
public final class v3 implements View.OnClickListener {
    public final int f6007a;
    public final g4 f6008b;

    public v3(g4 g4Var, int i10) {
        this.f6007a = i10;
        this.f6008b = g4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f6007a) {
            case 0:
                p4 p4Var = this.f6008b.f5357l;
                p4.e0(p4Var, p4Var.B1);
                g4 g4Var = p4Var.f5704t1;
                if (g4Var != null) {
                    g4Var.a();
                    return;
                }
                return;
            case 1:
                p4 p4Var2 = this.f6008b.f5357l;
                p4.d0(p4Var2);
                g4 g4Var2 = p4Var2.f5704t1;
                if (g4Var2 != null) {
                    g4Var2.a();
                    return;
                }
                return;
            case 2:
                p4 p4Var3 = this.f6008b.f5357l;
                AndroidUtilities.addToClipboard(p4Var3.O1.e());
                p4.j0(p4Var3);
                g4 g4Var3 = p4Var3.f5704t1;
                if (g4Var3 != null) {
                    g4Var3.a();
                    return;
                }
                return;
            case 3:
                p4 p4Var4 = this.f6008b.f5357l;
                p4Var4.Y0(false);
                g4 g4Var4 = p4Var4.f5704t1;
                if (g4Var4 != null) {
                    g4Var4.a();
                    return;
                }
                return;
            case 4:
                p4 p4Var5 = this.f6008b.f5357l;
                n4 n4Var = p4Var5.O1;
                n4Var.f5591a.translated = false;
                v7 v7Var = MessagesController.getInstance(p4Var5.C2).getStoriesController().f5404k;
                TL_stories.StoryItem storyItem = n4Var.f5591a;
                v7Var.k(storyItem.dialogId, storyItem);
                p4Var5.p0();
                p4Var5.f1(false);
                g4 g4Var5 = p4Var5.f5704t1;
                if (g4Var5 != null) {
                    g4Var5.a();
                    return;
                }
                return;
            case 5:
                g4 g4Var6 = this.f6008b;
                p4 p4Var6 = g4Var6.f5357l;
                n4 n4Var2 = p4Var6.O1;
                n4Var2.f5591a.translated = true;
                p4Var6.p0();
                i4 i4Var = p4Var6.Q1;
                if (i4Var != null) {
                    z9 z9Var = ((q9) i4Var).d;
                    z9Var.Z0 = true;
                    z9Var.P();
                }
                v7 v7Var2 = MessagesController.getInstance(p4Var6.C2).getStoriesController().f5404k;
                TL_stories.StoryItem storyItem2 = n4Var2.f5591a;
                v7Var2.k(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(p4Var6.C2).getTranslateController().translateStory(n4Var2.f5591a, new ai.t3(new z3(g4Var6, 1), System.currentTimeMillis(), 4));
                p4Var6.f1(false);
                p4Var6.f5671h3 = true;
                p4Var6.K0.D(true);
                g4 g4Var7 = p4Var6.f5704t1;
                if (g4Var7 != null) {
                    g4Var7.a();
                    return;
                }
                return;
            case 6:
                p4 p4Var7 = this.f6008b.f5357l;
                g7 g7Var = p4Var7.O1.f5592b;
                if (g7Var != null) {
                    g7Var.a();
                    p4Var7.j1();
                }
                g4 g4Var8 = p4Var7.f5704t1;
                if (g4Var8 != null) {
                    g4Var8.a();
                    return;
                }
                return;
            case 7:
                p4 p4Var8 = this.f6008b.f5357l;
                p4.d0(p4Var8);
                g4 g4Var9 = p4Var8.f5704t1;
                if (g4Var9 != null) {
                    g4Var9.a();
                    return;
                }
                return;
            case 8:
                p4 p4Var9 = this.f6008b.f5357l;
                AndroidUtilities.addToClipboard(p4Var9.O1.e());
                p4.j0(p4Var9);
                g4 g4Var10 = p4Var9.f5704t1;
                if (g4Var10 != null) {
                    g4Var10.a();
                    return;
                }
                return;
            case 9:
                p4 p4Var10 = this.f6008b.f5357l;
                p4Var10.Y0(false);
                g4 g4Var11 = p4Var10.f5704t1;
                if (g4Var11 != null) {
                    g4Var11.a();
                    return;
                }
                return;
            case 10:
                h1 h1Var = h1.W;
                if (h1Var != null && h1Var.f5381n) {
                    long j10 = h1Var.J;
                    boolean z10 = !h1Var.I;
                    h1Var.I = z10;
                    NativeInstance.switchCameraCapturer(j10, z10);
                }
                g4 g4Var12 = this.f6008b.f5357l.f5704t1;
                if (g4Var12 != null) {
                    g4Var12.a();
                    return;
                }
                return;
            case 11:
                this.f6008b.f5357l.D3.b();
                return;
            case 12:
                this.f6008b.f5357l.E3.b();
                return;
            case 13:
                p4 p4Var11 = this.f6008b.f5357l;
                p4.f0(p4Var11);
                g4 g4Var13 = p4Var11.f5704t1;
                if (g4Var13 != null) {
                    g4Var13.a();
                    return;
                }
                return;
            case 14:
                p4 p4Var12 = this.f6008b.f5357l;
                MediaDataController.getInstance(p4Var12.C2).removePeer(p4Var12.B1);
                p4Var12.S1.i0(p4Var12.B1, true, false);
                g4 g4Var14 = p4Var12.f5704t1;
                if (g4Var14 != null) {
                    g4Var14.a();
                    return;
                }
                return;
            default:
                p4 p4Var13 = this.f6008b.f5357l;
                p4.e0(p4Var13, p4Var13.B1);
                g4 g4Var15 = p4Var13.f5704t1;
                if (g4Var15 != null) {
                    g4Var15.a();
                    return;
                }
                return;
        }
    }
}
