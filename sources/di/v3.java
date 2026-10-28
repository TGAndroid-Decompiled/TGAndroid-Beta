package di;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;
public final class v3 implements View.OnClickListener {
    public final int f9250a;
    public final h4 f9251b;

    public v3(h4 h4Var, int i10) {
        this.f9250a = i10;
        this.f9251b = h4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9250a) {
            case 0:
                q4 q4Var = this.f9251b.f8625l;
                q4.c0(q4Var, q4Var.f9015q1);
                h4 h4Var = q4Var.f8987i1;
                if (h4Var != null) {
                    h4Var.a();
                    return;
                }
                return;
            case 1:
                q4 q4Var2 = this.f9251b.f8625l;
                q4.b0(q4Var2);
                h4 h4Var2 = q4Var2.f8987i1;
                if (h4Var2 != null) {
                    h4Var2.a();
                    return;
                }
                return;
            case 2:
                q4 q4Var3 = this.f9251b.f8625l;
                AndroidUtilities.addToClipboard(q4Var3.D1.e());
                q4.h0(q4Var3);
                h4 h4Var3 = q4Var3.f8987i1;
                if (h4Var3 != null) {
                    h4Var3.a();
                    return;
                }
                return;
            case 3:
                q4 q4Var4 = this.f9251b.f8625l;
                q4Var4.W0(false);
                h4 h4Var4 = q4Var4.f8987i1;
                if (h4Var4 != null) {
                    h4Var4.a();
                    return;
                }
                return;
            case 4:
                q4 q4Var5 = this.f9251b.f8625l;
                o4 o4Var = q4Var5.D1;
                o4Var.f8870a.translated = false;
                u7 u7Var = MessagesController.getInstance(q4Var5.f9020r2).getStoriesController().f8636k;
                TL_stories.StoryItem storyItem = o4Var.f8870a;
                u7Var.k(storyItem.dialogId, storyItem);
                q4Var5.n0();
                q4Var5.d1(false);
                h4 h4Var5 = q4Var5.f8987i1;
                if (h4Var5 != null) {
                    h4Var5.a();
                    return;
                }
                return;
            case 5:
                h4 h4Var6 = this.f9251b;
                q4 q4Var6 = h4Var6.f8625l;
                o4 o4Var2 = q4Var6.D1;
                o4Var2.f8870a.translated = true;
                q4Var6.n0();
                j4 j4Var = q4Var6.F1;
                if (j4Var != null) {
                    y9 y9Var = ((p9) j4Var).d;
                    y9Var.Z0 = true;
                    y9Var.Q();
                }
                u7 u7Var2 = MessagesController.getInstance(q4Var6.f9020r2).getStoriesController().f8636k;
                TL_stories.StoryItem storyItem2 = o4Var2.f8870a;
                u7Var2.k(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(q4Var6.f9020r2).getTranslateController().translateStory(o4Var2.f8870a, new bi.r3(new z3(h4Var6, 1), System.currentTimeMillis(), 4));
                q4Var6.d1(false);
                q4Var6.W2 = true;
                q4Var6.f9049z0.E(true);
                h4 h4Var7 = q4Var6.f8987i1;
                if (h4Var7 != null) {
                    h4Var7.a();
                    return;
                }
                return;
            case 6:
                q4 q4Var7 = this.f9251b.f8625l;
                g7 g7Var = q4Var7.D1.f8871b;
                if (g7Var != null) {
                    g7Var.a();
                    q4Var7.h1();
                }
                h4 h4Var8 = q4Var7.f8987i1;
                if (h4Var8 != null) {
                    h4Var8.a();
                    return;
                }
                return;
            case 7:
                q4 q4Var8 = this.f9251b.f8625l;
                q4.b0(q4Var8);
                h4 h4Var9 = q4Var8.f8987i1;
                if (h4Var9 != null) {
                    h4Var9.a();
                    return;
                }
                return;
            case 8:
                q4 q4Var9 = this.f9251b.f8625l;
                AndroidUtilities.addToClipboard(q4Var9.D1.e());
                q4.h0(q4Var9);
                h4 h4Var10 = q4Var9.f8987i1;
                if (h4Var10 != null) {
                    h4Var10.a();
                    return;
                }
                return;
            case 9:
                q4 q4Var10 = this.f9251b.f8625l;
                q4Var10.W0(false);
                h4 h4Var11 = q4Var10.f8987i1;
                if (h4Var11 != null) {
                    h4Var11.a();
                    return;
                }
                return;
            case 10:
                h1 h1Var = h1.W;
                if (h1Var != null && h1Var.f8607n) {
                    long j10 = h1Var.J;
                    boolean z10 = !h1Var.I;
                    h1Var.I = z10;
                    NativeInstance.switchCameraCapturer(j10, z10);
                }
                h4 h4Var12 = this.f9251b.f8625l.f8987i1;
                if (h4Var12 != null) {
                    h4Var12.a();
                    return;
                }
                return;
            case 11:
                this.f9251b.f8625l.f9025s3.b();
                return;
            case 12:
                this.f9251b.f8625l.f9029t3.b();
                return;
            case 13:
                q4 q4Var11 = this.f9251b.f8625l;
                q4.d0(q4Var11);
                h4 h4Var13 = q4Var11.f8987i1;
                if (h4Var13 != null) {
                    h4Var13.a();
                    return;
                }
                return;
            case 14:
                q4 q4Var12 = this.f9251b.f8625l;
                MediaDataController.getInstance(q4Var12.f9020r2).removePeer(q4Var12.f9015q1);
                q4Var12.H1.l0(q4Var12.f9015q1, true, false);
                h4 h4Var14 = q4Var12.f8987i1;
                if (h4Var14 != null) {
                    h4Var14.a();
                    return;
                }
                return;
            default:
                q4 q4Var13 = this.f9251b.f8625l;
                q4.c0(q4Var13, q4Var13.f9015q1);
                h4 h4Var15 = q4Var13.f8987i1;
                if (h4Var15 != null) {
                    h4Var15.a();
                    return;
                }
                return;
        }
    }
}
