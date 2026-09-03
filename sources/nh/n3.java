package nh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;
public final class n3 implements View.OnClickListener {
    public final int f15637a;
    public final w3 f15638b;

    public n3(w3 w3Var, int i10) {
        this.f15637a = i10;
        this.f15638b = w3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f15637a) {
            case 0:
                d4 d4Var = this.f15638b.f16007l;
                d4.e0(d4Var, d4Var.f15238y1);
                w3 w3Var = d4Var.f15208q1;
                if (w3Var != null) {
                    w3Var.a();
                    return;
                }
                return;
            case 1:
                d4 d4Var2 = this.f15638b.f16007l;
                d4.d0(d4Var2);
                w3 w3Var2 = d4Var2.f15208q1;
                if (w3Var2 != null) {
                    w3Var2.a();
                    return;
                }
                return;
            case 2:
                d4 d4Var3 = this.f15638b.f16007l;
                AndroidUtilities.addToClipboard(d4Var3.L1.e());
                d4.j0(d4Var3);
                w3 w3Var3 = d4Var3.f15208q1;
                if (w3Var3 != null) {
                    w3Var3.a();
                    return;
                }
                return;
            case 3:
                d4 d4Var4 = this.f15638b.f16007l;
                d4Var4.Y0(false);
                w3 w3Var4 = d4Var4.f15208q1;
                if (w3Var4 != null) {
                    w3Var4.a();
                    return;
                }
                return;
            case 4:
                d4 d4Var5 = this.f15638b.f16007l;
                b4 b4Var = d4Var5.L1;
                b4Var.f15091a.translated = false;
                g7 g7Var = MessagesController.getInstance(d4Var5.f15243z2).getStoriesController().f15904k;
                TL_stories.StoryItem storyItem = b4Var.f15091a;
                g7Var.k(storyItem.dialogId, storyItem);
                d4Var5.p0();
                d4Var5.f1(false);
                w3 w3Var5 = d4Var5.f15208q1;
                if (w3Var5 != null) {
                    w3Var5.a();
                    return;
                }
                return;
            case 5:
                w3 w3Var6 = this.f15638b;
                d4 d4Var6 = w3Var6.f16007l;
                b4 b4Var2 = d4Var6.L1;
                b4Var2.f15091a.translated = true;
                d4Var6.p0();
                x3 x3Var = d4Var6.N1;
                if (x3Var != null) {
                    i9 i9Var = ((z8) x3Var).d;
                    i9Var.W0 = true;
                    i9Var.P();
                }
                g7 g7Var2 = MessagesController.getInstance(d4Var6.f15243z2).getStoriesController().f15904k;
                TL_stories.StoryItem storyItem2 = b4Var2.f15091a;
                g7Var2.k(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(d4Var6.f15243z2).getTranslateController().translateStory(b4Var2.f15091a, new gg.y1(new q3(w3Var6, 1), System.currentTimeMillis(), 6));
                d4Var6.f1(false);
                d4Var6.f15175e3 = true;
                d4Var6.H0.D(true);
                w3 w3Var7 = d4Var6.f15208q1;
                if (w3Var7 != null) {
                    w3Var7.a();
                    return;
                }
                return;
            case 6:
                d4 d4Var7 = this.f15638b.f16007l;
                s6 s6Var = d4Var7.L1.f15092b;
                if (s6Var != null) {
                    s6Var.a();
                    d4Var7.j1();
                }
                w3 w3Var8 = d4Var7.f15208q1;
                if (w3Var8 != null) {
                    w3Var8.a();
                    return;
                }
                return;
            case 7:
                d4 d4Var8 = this.f15638b.f16007l;
                d4.d0(d4Var8);
                w3 w3Var9 = d4Var8.f15208q1;
                if (w3Var9 != null) {
                    w3Var9.a();
                    return;
                }
                return;
            case 8:
                d4 d4Var9 = this.f15638b.f16007l;
                AndroidUtilities.addToClipboard(d4Var9.L1.e());
                d4.j0(d4Var9);
                w3 w3Var10 = d4Var9.f15208q1;
                if (w3Var10 != null) {
                    w3Var10.a();
                    return;
                }
                return;
            case 9:
                d4 d4Var10 = this.f15638b.f16007l;
                d4Var10.Y0(false);
                w3 w3Var11 = d4Var10.f15208q1;
                if (w3Var11 != null) {
                    w3Var11.a();
                    return;
                }
                return;
            case 10:
                e1 e1Var = e1.T;
                if (e1Var != null && e1Var.f15276n) {
                    long j10 = e1Var.G;
                    boolean z4 = !e1Var.F;
                    e1Var.F = z4;
                    NativeInstance.switchCameraCapturer(j10, z4);
                }
                w3 w3Var12 = this.f15638b.f16007l.f15208q1;
                if (w3Var12 != null) {
                    w3Var12.a();
                    return;
                }
                return;
            case 11:
                this.f15638b.f16007l.A3.b();
                return;
            case 12:
                this.f15638b.f16007l.B3.b();
                return;
            case 13:
                d4 d4Var11 = this.f15638b.f16007l;
                d4.f0(d4Var11);
                w3 w3Var13 = d4Var11.f15208q1;
                if (w3Var13 != null) {
                    w3Var13.a();
                    return;
                }
                return;
            case 14:
                d4 d4Var12 = this.f15638b.f16007l;
                MediaDataController.getInstance(d4Var12.f15243z2).removePeer(d4Var12.f15238y1);
                d4Var12.P1.i0(d4Var12.f15238y1, true, false);
                w3 w3Var14 = d4Var12.f15208q1;
                if (w3Var14 != null) {
                    w3Var14.a();
                    return;
                }
                return;
            default:
                d4 d4Var13 = this.f15638b.f16007l;
                d4.e0(d4Var13, d4Var13.f15238y1);
                w3 w3Var15 = d4Var13.f15208q1;
                if (w3Var15 != null) {
                    w3Var15.a();
                    return;
                }
                return;
        }
    }
}
