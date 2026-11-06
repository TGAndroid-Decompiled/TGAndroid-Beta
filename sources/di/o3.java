package di;

import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.f10;
import org.telegram.messenger.qp;
import org.telegram.messenger.ui;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.yn;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.e21;
public final class o3 implements View.OnClickListener {
    public final int f9452a;
    public final z3 f9453b;

    public o3(z3 z3Var, int i7) {
        this.f9452a = i7;
        this.f9453b = z3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9452a) {
            case 0:
                i4 i4Var = this.f9453b.f10013x;
                i4.c0(i4Var, i4Var.f9164k1);
                z3 z3Var = i4Var.f9136c1;
                if (z3Var != null) {
                    z3Var.a();
                    return;
                }
                return;
            case 1:
                i4 i4Var2 = this.f9453b.f10013x;
                i4.b0(i4Var2);
                z3 z3Var2 = i4Var2.f9136c1;
                if (z3Var2 != null) {
                    z3Var2.a();
                    return;
                }
                return;
            case 2:
                i4 i4Var3 = this.f9453b.f10013x;
                org.telegram.messenger.g0.g(i4Var3.f9213x1.e());
                i4.h0(i4Var3);
                z3 z3Var3 = i4Var3.f9136c1;
                if (z3Var3 != null) {
                    z3Var3.a();
                    return;
                }
                return;
            case 3:
                i4 i4Var4 = this.f9453b.f10013x;
                i4Var4.W0(false);
                z3 z3Var4 = i4Var4.f9136c1;
                if (z3Var4 != null) {
                    z3Var4.a();
                    return;
                }
                return;
            case 4:
                i4 i4Var5 = this.f9453b.f10013x;
                g4 g4Var = i4Var5.f9213x1;
                g4Var.f9038a.translated = false;
                l7 l7Var = qp.s1(i4Var5.f9168l2).P1().f9971k;
                TL_stories.StoryItem storyItem = g4Var.f9038a;
                l7Var.k(storyItem.dialogId, storyItem);
                i4Var5.n0();
                i4Var5.d1(false);
                z3 z3Var5 = i4Var5.f9136c1;
                if (z3Var5 != null) {
                    z3Var5.a();
                    return;
                }
                return;
            case 5:
                z3 z3Var6 = this.f9453b;
                i4 i4Var6 = z3Var6.f10013x;
                g4 g4Var2 = i4Var6.f9213x1;
                g4Var2.f9038a.translated = true;
                i4Var6.n0();
                b4 b4Var = i4Var6.f9221z1;
                if (b4Var != null) {
                    p9 p9Var = ((g9) b4Var).d;
                    p9Var.Y0 = true;
                    p9Var.V();
                }
                l7 l7Var2 = qp.s1(i4Var6.f9168l2).P1().f9971k;
                TL_stories.StoryItem storyItem2 = g4Var2.f9038a;
                l7Var2.k(storyItem2.dialogId, storyItem2);
                long currentTimeMillis = System.currentTimeMillis();
                s3 s3Var = new s3(z3Var6, 1);
                f10 f10Var = qp.s1(i4Var6.f9168l2).f24881s7;
                TL_stories.StoryItem storyItem3 = g4Var2.f9038a;
                bi.r3 r3Var = new bi.r3(s3Var, currentTimeMillis, 4);
                HashSet hashSet = f10Var.J;
                if (storyItem3 != null) {
                    Object obj = new Object();
                    String M0 = e21.M0();
                    if (storyItem3.translatedText != null && TextUtils.equals(storyItem3.translatedLng, M0)) {
                        r3Var.run();
                    } else if (hashSet.contains(obj)) {
                        r3Var.run();
                    } else {
                        hashSet.add(obj);
                        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                        tL_messages_translateText.flags |= 2;
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        tL_textWithEntities.text = storyItem3.caption;
                        tL_textWithEntities.entities = storyItem3.entities;
                        tL_messages_translateText.text.add(tL_textWithEntities);
                        tL_messages_translateText.to_lang = f10.D(M0);
                        f10Var.getConnectionsManager().sendRequest(tL_messages_translateText, new yn(f10Var, storyItem3, M0, obj, r3Var, tL_textWithEntities, 1));
                    }
                }
                i4Var6.d1(false);
                i4Var6.Q2 = true;
                i4Var6.f9196t0.E(true);
                z3 z3Var7 = i4Var6.f9136c1;
                if (z3Var7 != null) {
                    z3Var7.a();
                    return;
                }
                return;
            case 6:
                i4 i4Var7 = this.f9453b.f10013x;
                x6 x6Var = i4Var7.f9213x1.f9039b;
                if (x6Var != null) {
                    x6Var.a();
                    i4Var7.h1();
                }
                z3 z3Var8 = i4Var7.f9136c1;
                if (z3Var8 != null) {
                    z3Var8.a();
                    return;
                }
                return;
            case 7:
                i4 i4Var8 = this.f9453b.f10013x;
                i4.b0(i4Var8);
                z3 z3Var9 = i4Var8.f9136c1;
                if (z3Var9 != null) {
                    z3Var9.a();
                    return;
                }
                return;
            case 8:
                i4 i4Var9 = this.f9453b.f10013x;
                org.telegram.messenger.g0.g(i4Var9.f9213x1.e());
                i4.h0(i4Var9);
                z3 z3Var10 = i4Var9.f9136c1;
                if (z3Var10 != null) {
                    z3Var10.a();
                    return;
                }
                return;
            case 9:
                i4 i4Var10 = this.f9453b.f10013x;
                i4Var10.W0(false);
                z3 z3Var11 = i4Var10.f9136c1;
                if (z3Var11 != null) {
                    z3Var11.a();
                    return;
                }
                return;
            case 10:
                g1 g1Var = g1.W;
                if (g1Var != null && g1Var.f9027n) {
                    long j3 = g1Var.J;
                    boolean z9 = !g1Var.I;
                    g1Var.I = z9;
                    NativeInstance.switchCameraCapturer(j3, z9);
                }
                z3 z3Var12 = this.f9453b.f10013x.f9136c1;
                if (z3Var12 != null) {
                    z3Var12.a();
                    return;
                }
                return;
            case 11:
                this.f9453b.f10013x.f9172m3.b();
                return;
            case 12:
                this.f9453b.f10013x.f9175n3.b();
                return;
            case 13:
                i4 i4Var11 = this.f9453b.f10013x;
                i4.d0(i4Var11);
                z3 z3Var13 = i4Var11.f9136c1;
                if (z3Var13 != null) {
                    z3Var13.a();
                    return;
                }
                return;
            case 14:
                i4 i4Var12 = this.f9453b.f10013x;
                ui.b0(i4Var12.f9168l2).N1(i4Var12.f9164k1);
                i4Var12.B1.l0(i4Var12.f9164k1, true, false);
                z3 z3Var14 = i4Var12.f9136c1;
                if (z3Var14 != null) {
                    z3Var14.a();
                    return;
                }
                return;
            default:
                i4 i4Var13 = this.f9453b.f10013x;
                i4.c0(i4Var13, i4Var13.f9164k1);
                z3 z3Var15 = i4Var13.f9136c1;
                if (z3Var15 != null) {
                    z3Var15.a();
                    return;
                }
                return;
        }
    }
}
