package jh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;

public final class o3 implements View.OnClickListener {

    public final int f13743a;

    public final x3 f13744b;

    public o3(x3 x3Var, int i10) {
        this.f13743a = i10;
        this.f13744b = x3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f13743a) {
            case 0:
                e4 e4Var = this.f13744b.f14128l;
                e4.e0(e4Var, e4Var.f13291x1);
                x3 x3Var = e4Var.f13261p1;
                if (x3Var != null) {
                    x3Var.a();
                }
                break;
            case 1:
                e4 e4Var2 = this.f13744b.f14128l;
                e4.d0(e4Var2);
                x3 x3Var2 = e4Var2.f13261p1;
                if (x3Var2 != null) {
                    x3Var2.a();
                }
                break;
            case 2:
                e4 e4Var3 = this.f13744b.f14128l;
                AndroidUtilities.addToClipboard(e4Var3.K1.e());
                e4.j0(e4Var3);
                x3 x3Var3 = e4Var3.f13261p1;
                if (x3Var3 != null) {
                    x3Var3.a();
                }
                break;
            case 3:
                e4 e4Var4 = this.f13744b.f14128l;
                e4Var4.Y0(false);
                x3 x3Var4 = e4Var4.f13261p1;
                if (x3Var4 != null) {
                    x3Var4.a();
                }
                break;
            case 4:
                e4 e4Var5 = this.f13744b.f14128l;
                c4 c4Var = e4Var5.K1;
                c4Var.f13141a.translated = false;
                f7 f7Var = MessagesController.getInstance(e4Var5.f13296y2).getStoriesController().f13963k;
                TL_stories.StoryItem storyItem = c4Var.f13141a;
                f7Var.k(storyItem.dialogId, storyItem);
                e4Var5.p0();
                e4Var5.f1(false);
                x3 x3Var5 = e4Var5.f13261p1;
                if (x3Var5 != null) {
                    x3Var5.a();
                }
                break;
            case 5:
                x3 x3Var6 = this.f13744b;
                e4 e4Var6 = x3Var6.f14128l;
                c4 c4Var2 = e4Var6.K1;
                c4Var2.f13141a.translated = true;
                e4Var6.p0();
                y3 y3Var = e4Var6.M1;
                if (y3Var != null) {
                    i9 i9Var = ((z8) y3Var).d;
                    i9Var.V0 = true;
                    i9Var.P();
                }
                f7 f7Var2 = MessagesController.getInstance(e4Var6.f13296y2).getStoriesController().f13963k;
                TL_stories.StoryItem storyItem2 = c4Var2.f13141a;
                f7Var2.k(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(e4Var6.f13296y2).getTranslateController().translateStory(c4Var2.f13141a, new cg.b2(new r3(x3Var6, 1), System.currentTimeMillis(), 6));
                e4Var6.f1(false);
                e4Var6.f13228d3 = true;
                e4Var6.G0.D(true);
                x3 x3Var7 = e4Var6.f13261p1;
                if (x3Var7 != null) {
                    x3Var7.a();
                }
                break;
            case 6:
                e4 e4Var7 = this.f13744b.f14128l;
                r6 r6Var = e4Var7.K1.f13142b;
                if (r6Var != null) {
                    r6Var.a();
                    e4Var7.j1();
                }
                x3 x3Var8 = e4Var7.f13261p1;
                if (x3Var8 != null) {
                    x3Var8.a();
                }
                break;
            case 7:
                e4 e4Var8 = this.f13744b.f14128l;
                e4.d0(e4Var8);
                x3 x3Var9 = e4Var8.f13261p1;
                if (x3Var9 != null) {
                    x3Var9.a();
                }
                break;
            case 8:
                e4 e4Var9 = this.f13744b.f14128l;
                AndroidUtilities.addToClipboard(e4Var9.K1.e());
                e4.j0(e4Var9);
                x3 x3Var10 = e4Var9.f13261p1;
                if (x3Var10 != null) {
                    x3Var10.a();
                }
                break;
            case 9:
                e4 e4Var10 = this.f13744b.f14128l;
                e4Var10.Y0(false);
                x3 x3Var11 = e4Var10.f13261p1;
                if (x3Var11 != null) {
                    x3Var11.a();
                }
                break;
            case 10:
                d1 d1Var = d1.S;
                if (d1Var != null && d1Var.f13179n) {
                    long j10 = d1Var.F;
                    boolean z10 = !d1Var.E;
                    d1Var.E = z10;
                    NativeInstance.switchCameraCapturer(j10, z10);
                }
                x3 x3Var12 = this.f13744b.f14128l.f13261p1;
                if (x3Var12 != null) {
                    x3Var12.a();
                }
                break;
            case 11:
                this.f13744b.f14128l.f13301z3.b();
                break;
            case 12:
                this.f13744b.f14128l.A3.b();
                break;
            case 13:
                e4 e4Var11 = this.f13744b.f14128l;
                e4.f0(e4Var11);
                x3 x3Var13 = e4Var11.f13261p1;
                if (x3Var13 != null) {
                    x3Var13.a();
                }
                break;
            case 14:
                e4 e4Var12 = this.f13744b.f14128l;
                MediaDataController.getInstance(e4Var12.f13296y2).removePeer(e4Var12.f13291x1);
                e4Var12.O1.i0(e4Var12.f13291x1, true, false);
                x3 x3Var14 = e4Var12.f13261p1;
                if (x3Var14 != null) {
                    x3Var14.a();
                }
                break;
            default:
                e4 e4Var13 = this.f13744b.f14128l;
                e4.e0(e4Var13, e4Var13.f13291x1);
                x3 x3Var15 = e4Var13.f13261p1;
                if (x3Var15 != null) {
                    x3Var15.a();
                }
                break;
        }
    }
}
