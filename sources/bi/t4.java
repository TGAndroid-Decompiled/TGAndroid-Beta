package bi;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;
public final class t4 implements View.OnClickListener {
    public final int f3756a;
    public final f5 f3757b;

    public t4(f5 f5Var, int i10) {
        this.f3756a = i10;
        this.f3757b = f5Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3756a) {
            case 0:
                o5 o5Var = this.f3757b.f2999l;
                o5.e0(o5Var, o5Var.B1);
                f5 f5Var = o5Var.f3487t1;
                if (f5Var != null) {
                    f5Var.a();
                    return;
                }
                return;
            case 1:
                o5 o5Var2 = this.f3757b.f2999l;
                o5.d0(o5Var2);
                f5 f5Var2 = o5Var2.f3487t1;
                if (f5Var2 != null) {
                    f5Var2.a();
                    return;
                }
                return;
            case 2:
                o5 o5Var3 = this.f3757b.f2999l;
                AndroidUtilities.addToClipboard(o5Var3.O1.e());
                o5.j0(o5Var3);
                f5 f5Var3 = o5Var3.f3487t1;
                if (f5Var3 != null) {
                    f5Var3.a();
                    return;
                }
                return;
            case 3:
                o5 o5Var4 = this.f3757b.f2999l;
                o5Var4.Y0(false);
                f5 f5Var4 = o5Var4.f3487t1;
                if (f5Var4 != null) {
                    f5Var4.a();
                    return;
                }
                return;
            case 4:
                o5 o5Var5 = this.f3757b.f2999l;
                m5 m5Var = o5Var5.O1;
                m5Var.f3337a.translated = false;
                h9 h9Var = MessagesController.getInstance(o5Var5.C2).getStoriesController().f3840k;
                TL_stories.StoryItem storyItem = m5Var.f3337a;
                h9Var.k(storyItem.dialogId, storyItem);
                o5Var5.p0();
                o5Var5.f1(false);
                f5 f5Var5 = o5Var5.f3487t1;
                if (f5Var5 != null) {
                    f5Var5.a();
                    return;
                }
                return;
            case 5:
                f5 f5Var6 = this.f3757b;
                o5 o5Var6 = f5Var6.f2999l;
                m5 m5Var2 = o5Var6.O1;
                m5Var2.f3337a.translated = true;
                o5Var6.p0();
                h5 h5Var = o5Var6.Q1;
                if (h5Var != null) {
                    pb pbVar = ((gb) h5Var).d;
                    pbVar.Z0 = true;
                    pbVar.P();
                }
                h9 h9Var2 = MessagesController.getInstance(o5Var6.C2).getStoriesController().f3840k;
                TL_stories.StoryItem storyItem2 = m5Var2.f3337a;
                h9Var2.k(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(o5Var6.C2).getTranslateController().translateStory(m5Var2.f3337a, new g(new x4(f5Var6, 1), System.currentTimeMillis(), 2));
                o5Var6.f1(false);
                o5Var6.f3455h3 = true;
                o5Var6.K0.D(true);
                f5 f5Var7 = o5Var6.f3487t1;
                if (f5Var7 != null) {
                    f5Var7.a();
                    return;
                }
                return;
            case 6:
                o5 o5Var7 = this.f3757b.f2999l;
                t8 t8Var = o5Var7.O1.f3338b;
                if (t8Var != null) {
                    t8Var.a();
                    o5Var7.j1();
                }
                f5 f5Var8 = o5Var7.f3487t1;
                if (f5Var8 != null) {
                    f5Var8.a();
                    return;
                }
                return;
            case 7:
                o5 o5Var8 = this.f3757b.f2999l;
                o5.d0(o5Var8);
                f5 f5Var9 = o5Var8.f3487t1;
                if (f5Var9 != null) {
                    f5Var9.a();
                    return;
                }
                return;
            case 8:
                o5 o5Var9 = this.f3757b.f2999l;
                AndroidUtilities.addToClipboard(o5Var9.O1.e());
                o5.j0(o5Var9);
                f5 f5Var10 = o5Var9.f3487t1;
                if (f5Var10 != null) {
                    f5Var10.a();
                    return;
                }
                return;
            case 9:
                o5 o5Var10 = this.f3757b.f2999l;
                o5Var10.Y0(false);
                f5 f5Var11 = o5Var10.f3487t1;
                if (f5Var11 != null) {
                    f5Var11.a();
                    return;
                }
                return;
            case 10:
                t1 t1Var = t1.W;
                if (t1Var != null && t1Var.f3747n) {
                    long j3 = t1Var.J;
                    boolean z10 = !t1Var.I;
                    t1Var.I = z10;
                    NativeInstance.switchCameraCapturer(j3, z10);
                }
                f5 f5Var12 = this.f3757b.f2999l.f3487t1;
                if (f5Var12 != null) {
                    f5Var12.a();
                    return;
                }
                return;
            case 11:
                this.f3757b.f2999l.D3.b();
                return;
            case 12:
                this.f3757b.f2999l.E3.b();
                return;
            case 13:
                o5 o5Var11 = this.f3757b.f2999l;
                o5.f0(o5Var11);
                f5 f5Var13 = o5Var11.f3487t1;
                if (f5Var13 != null) {
                    f5Var13.a();
                    return;
                }
                return;
            case 14:
                o5 o5Var12 = this.f3757b.f2999l;
                MediaDataController.getInstance(o5Var12.C2).removePeer(o5Var12.B1);
                o5Var12.S1.i0(o5Var12.B1, true, false);
                f5 f5Var14 = o5Var12.f3487t1;
                if (f5Var14 != null) {
                    f5Var14.a();
                    return;
                }
                return;
            default:
                o5 o5Var13 = this.f3757b.f2999l;
                o5.e0(o5Var13, o5Var13.B1);
                f5 f5Var15 = o5Var13.f3487t1;
                if (f5Var15 != null) {
                    f5Var15.a();
                    return;
                }
                return;
        }
    }
}
