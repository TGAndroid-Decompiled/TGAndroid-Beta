package ci;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;
public final class w3 implements View.OnClickListener {
    public final int f6111a;
    public final h4 f6112b;

    public w3(h4 h4Var, int i10) {
        this.f6111a = i10;
        this.f6112b = h4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f6111a) {
            case 0:
                q4 q4Var = this.f6112b.f5463l;
                q4.e0(q4Var, q4Var.B1);
                h4 h4Var = q4Var.f5823t1;
                if (h4Var != null) {
                    h4Var.a();
                    return;
                }
                return;
            case 1:
                q4 q4Var2 = this.f6112b.f5463l;
                q4.d0(q4Var2);
                h4 h4Var2 = q4Var2.f5823t1;
                if (h4Var2 != null) {
                    h4Var2.a();
                    return;
                }
                return;
            case 2:
                q4 q4Var3 = this.f6112b.f5463l;
                AndroidUtilities.addToClipboard(q4Var3.O1.e());
                q4.j0(q4Var3);
                h4 h4Var3 = q4Var3.f5823t1;
                if (h4Var3 != null) {
                    h4Var3.a();
                    return;
                }
                return;
            case 3:
                q4 q4Var4 = this.f6112b.f5463l;
                q4Var4.Y0(false);
                h4 h4Var4 = q4Var4.f5823t1;
                if (h4Var4 != null) {
                    h4Var4.a();
                    return;
                }
                return;
            case 4:
                q4 q4Var5 = this.f6112b.f5463l;
                o4 o4Var = q4Var5.O1;
                o4Var.f5690a.translated = false;
                w7 w7Var = MessagesController.getInstance(q4Var5.C2).getStoriesController().f5500k;
                TL_stories.StoryItem storyItem = o4Var.f5690a;
                w7Var.k(storyItem.dialogId, storyItem);
                q4Var5.p0();
                q4Var5.f1(false);
                h4 h4Var5 = q4Var5.f5823t1;
                if (h4Var5 != null) {
                    h4Var5.a();
                    return;
                }
                return;
            case 5:
                h4 h4Var6 = this.f6112b;
                q4 q4Var6 = h4Var6.f5463l;
                o4 o4Var2 = q4Var6.O1;
                o4Var2.f5690a.translated = true;
                q4Var6.p0();
                j4 j4Var = q4Var6.Q1;
                if (j4Var != null) {
                    aa aaVar = ((r9) j4Var).d;
                    aaVar.Z0 = true;
                    aaVar.P();
                }
                w7 w7Var2 = MessagesController.getInstance(q4Var6.C2).getStoriesController().f5500k;
                TL_stories.StoryItem storyItem2 = o4Var2.f5690a;
                w7Var2.k(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(q4Var6.C2).getTranslateController().translateStory(o4Var2.f5690a, new ai.s3(new a4(h4Var6, 1), System.currentTimeMillis(), 4));
                q4Var6.f1(false);
                q4Var6.f5790h3 = true;
                q4Var6.K0.D(true);
                h4 h4Var7 = q4Var6.f5823t1;
                if (h4Var7 != null) {
                    h4Var7.a();
                    return;
                }
                return;
            case 6:
                q4 q4Var7 = this.f6112b.f5463l;
                h7 h7Var = q4Var7.O1.f5691b;
                if (h7Var != null) {
                    h7Var.a();
                    q4Var7.j1();
                }
                h4 h4Var8 = q4Var7.f5823t1;
                if (h4Var8 != null) {
                    h4Var8.a();
                    return;
                }
                return;
            case 7:
                q4 q4Var8 = this.f6112b.f5463l;
                q4.d0(q4Var8);
                h4 h4Var9 = q4Var8.f5823t1;
                if (h4Var9 != null) {
                    h4Var9.a();
                    return;
                }
                return;
            case 8:
                q4 q4Var9 = this.f6112b.f5463l;
                AndroidUtilities.addToClipboard(q4Var9.O1.e());
                q4.j0(q4Var9);
                h4 h4Var10 = q4Var9.f5823t1;
                if (h4Var10 != null) {
                    h4Var10.a();
                    return;
                }
                return;
            case 9:
                q4 q4Var10 = this.f6112b.f5463l;
                q4Var10.Y0(false);
                h4 h4Var11 = q4Var10.f5823t1;
                if (h4Var11 != null) {
                    h4Var11.a();
                    return;
                }
                return;
            case 10:
                h1 h1Var = h1.W;
                if (h1Var != null && h1Var.f5446n) {
                    long j10 = h1Var.J;
                    boolean z10 = !h1Var.I;
                    h1Var.I = z10;
                    NativeInstance.switchCameraCapturer(j10, z10);
                }
                h4 h4Var12 = this.f6112b.f5463l.f5823t1;
                if (h4Var12 != null) {
                    h4Var12.a();
                    return;
                }
                return;
            case 11:
                this.f6112b.f5463l.D3.b();
                return;
            case 12:
                this.f6112b.f5463l.E3.b();
                return;
            case 13:
                q4 q4Var11 = this.f6112b.f5463l;
                q4.f0(q4Var11);
                h4 h4Var13 = q4Var11.f5823t1;
                if (h4Var13 != null) {
                    h4Var13.a();
                    return;
                }
                return;
            case 14:
                q4 q4Var12 = this.f6112b.f5463l;
                MediaDataController.getInstance(q4Var12.C2).removePeer(q4Var12.B1);
                q4Var12.S1.i0(q4Var12.B1, true, false);
                h4 h4Var14 = q4Var12.f5823t1;
                if (h4Var14 != null) {
                    h4Var14.a();
                    return;
                }
                return;
            default:
                q4 q4Var13 = this.f6112b.f5463l;
                q4.e0(q4Var13, q4Var13.B1);
                h4 h4Var15 = q4Var13.f5823t1;
                if (h4Var15 != null) {
                    h4Var15.a();
                    return;
                }
                return;
        }
    }
}
