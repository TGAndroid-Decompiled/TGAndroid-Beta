package ih;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;
public final class q3 implements View.OnClickListener {
    public final int f11998a;
    public final b4 f11999b;

    public q3(b4 b4Var, int i9) {
        this.f11998a = i9;
        this.f11999b = b4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f11998a) {
            case 0:
                i4 i4Var = this.f11999b.f11268l;
                i4.e0(i4Var, i4Var.f11604x1);
                b4 b4Var = i4Var.f11574p1;
                if (b4Var != null) {
                    b4Var.a();
                    return;
                }
                return;
            case 1:
                i4 i4Var2 = this.f11999b.f11268l;
                i4.d0(i4Var2);
                b4 b4Var2 = i4Var2.f11574p1;
                if (b4Var2 != null) {
                    b4Var2.a();
                    return;
                }
                return;
            case 2:
                i4 i4Var3 = this.f11999b.f11268l;
                AndroidUtilities.addToClipboard(i4Var3.K1.e());
                i4.j0(i4Var3);
                b4 b4Var3 = i4Var3.f11574p1;
                if (b4Var3 != null) {
                    b4Var3.a();
                    return;
                }
                return;
            case 3:
                i4 i4Var4 = this.f11999b.f11268l;
                i4Var4.Y0(false);
                b4 b4Var4 = i4Var4.f11574p1;
                if (b4Var4 != null) {
                    b4Var4.a();
                    return;
                }
                return;
            case 4:
                i4 i4Var5 = this.f11999b.f11268l;
                g4 g4Var = i4Var5.K1;
                g4Var.f11466a.translated = false;
                i7 i7Var = MessagesController.getInstance(i4Var5.f11609y2).getStoriesController().f12244k;
                TL_stories.StoryItem storyItem = g4Var.f11466a;
                i7Var.k(storyItem.dialogId, storyItem);
                i4Var5.p0();
                i4Var5.f1(false);
                b4 b4Var5 = i4Var5.f11574p1;
                if (b4Var5 != null) {
                    b4Var5.a();
                    return;
                }
                return;
            case 5:
                b4 b4Var6 = this.f11999b;
                i4 i4Var6 = b4Var6.f11268l;
                g4 g4Var2 = i4Var6.K1;
                g4Var2.f11466a.translated = true;
                i4Var6.p0();
                c4 c4Var = i4Var6.M1;
                if (c4Var != null) {
                    m9 m9Var = ((d9) c4Var).d;
                    m9Var.V0 = true;
                    m9Var.P();
                }
                i7 i7Var2 = MessagesController.getInstance(i4Var6.f11609y2).getStoriesController().f12244k;
                TL_stories.StoryItem storyItem2 = g4Var2.f11466a;
                i7Var2.k(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(i4Var6.f11609y2).getTranslateController().translateStory(g4Var2.f11466a, new bg.i2(new u3(b4Var6, 1), System.currentTimeMillis(), 5));
                i4Var6.f1(false);
                i4Var6.f11541d3 = true;
                i4Var6.G0.D(true);
                b4 b4Var7 = i4Var6.f11574p1;
                if (b4Var7 != null) {
                    b4Var7.a();
                    return;
                }
                return;
            case 6:
                i4 i4Var7 = this.f11999b.f11268l;
                u6 u6Var = i4Var7.K1.f11467b;
                if (u6Var != null) {
                    u6Var.a();
                    i4Var7.j1();
                }
                b4 b4Var8 = i4Var7.f11574p1;
                if (b4Var8 != null) {
                    b4Var8.a();
                    return;
                }
                return;
            case 7:
                i4 i4Var8 = this.f11999b.f11268l;
                i4.d0(i4Var8);
                b4 b4Var9 = i4Var8.f11574p1;
                if (b4Var9 != null) {
                    b4Var9.a();
                    return;
                }
                return;
            case 8:
                i4 i4Var9 = this.f11999b.f11268l;
                AndroidUtilities.addToClipboard(i4Var9.K1.e());
                i4.j0(i4Var9);
                b4 b4Var10 = i4Var9.f11574p1;
                if (b4Var10 != null) {
                    b4Var10.a();
                    return;
                }
                return;
            case 9:
                i4 i4Var10 = this.f11999b.f11268l;
                i4Var10.Y0(false);
                b4 b4Var11 = i4Var10.f11574p1;
                if (b4Var11 != null) {
                    b4Var11.a();
                    return;
                }
                return;
            case 10:
                f1 f1Var = f1.S;
                if (f1Var != null && f1Var.f11403n) {
                    long j10 = f1Var.F;
                    boolean z10 = !f1Var.E;
                    f1Var.E = z10;
                    NativeInstance.switchCameraCapturer(j10, z10);
                }
                b4 b4Var12 = this.f11999b.f11268l.f11574p1;
                if (b4Var12 != null) {
                    b4Var12.a();
                    return;
                }
                return;
            case 11:
                this.f11999b.f11268l.f11614z3.b();
                return;
            case 12:
                this.f11999b.f11268l.A3.b();
                return;
            case 13:
                i4 i4Var11 = this.f11999b.f11268l;
                i4.f0(i4Var11);
                b4 b4Var13 = i4Var11.f11574p1;
                if (b4Var13 != null) {
                    b4Var13.a();
                    return;
                }
                return;
            case 14:
                i4 i4Var12 = this.f11999b.f11268l;
                MediaDataController.getInstance(i4Var12.f11609y2).removePeer(i4Var12.f11604x1);
                i4Var12.O1.i0(i4Var12.f11604x1, true, false);
                b4 b4Var14 = i4Var12.f11574p1;
                if (b4Var14 != null) {
                    b4Var14.a();
                    return;
                }
                return;
            default:
                i4 i4Var13 = this.f11999b.f11268l;
                i4.e0(i4Var13, i4Var13.f11604x1);
                b4 b4Var15 = i4Var13.f11574p1;
                if (b4Var15 != null) {
                    b4Var15.a();
                    return;
                }
                return;
        }
    }
}
