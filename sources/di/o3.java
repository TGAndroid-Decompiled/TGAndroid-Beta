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
import org.telegram.ui.Components.k21;
public final class o3 implements View.OnClickListener {
    public final int f9435a;
    public final a4 f9436b;

    public o3(a4 a4Var, int i7) {
        this.f9435a = i7;
        this.f9436b = a4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9435a) {
            case 0:
                j4 j4Var = this.f9436b.f8813x;
                j4.c0(j4Var, j4Var.f9201k1);
                a4 a4Var = j4Var.f9173c1;
                if (a4Var != null) {
                    a4Var.a();
                    return;
                }
                return;
            case 1:
                j4 j4Var2 = this.f9436b.f8813x;
                j4.b0(j4Var2);
                a4 a4Var2 = j4Var2.f9173c1;
                if (a4Var2 != null) {
                    a4Var2.a();
                    return;
                }
                return;
            case 2:
                j4 j4Var3 = this.f9436b.f8813x;
                org.telegram.messenger.g0.g(j4Var3.f9250x1.e());
                j4.h0(j4Var3);
                a4 a4Var3 = j4Var3.f9173c1;
                if (a4Var3 != null) {
                    a4Var3.a();
                    return;
                }
                return;
            case 3:
                j4 j4Var4 = this.f9436b.f8813x;
                j4Var4.W0(false);
                a4 a4Var4 = j4Var4.f9173c1;
                if (a4Var4 != null) {
                    a4Var4.a();
                    return;
                }
                return;
            case 4:
                j4 j4Var5 = this.f9436b.f8813x;
                h4 h4Var = j4Var5.f9250x1;
                h4Var.f9069a.translated = false;
                m7 m7Var = qp.s1(j4Var5.f9205l2).P1().f10005k;
                TL_stories.StoryItem storyItem = h4Var.f9069a;
                m7Var.k(storyItem.dialogId, storyItem);
                j4Var5.n0();
                j4Var5.d1(false);
                a4 a4Var5 = j4Var5.f9173c1;
                if (a4Var5 != null) {
                    a4Var5.a();
                    return;
                }
                return;
            case 5:
                a4 a4Var6 = this.f9436b;
                j4 j4Var6 = a4Var6.f8813x;
                h4 h4Var2 = j4Var6.f9250x1;
                h4Var2.f9069a.translated = true;
                j4Var6.n0();
                c4 c4Var = j4Var6.f9258z1;
                if (c4Var != null) {
                    q9 q9Var = ((h9) c4Var).d;
                    q9Var.Y0 = true;
                    q9Var.V();
                }
                m7 m7Var2 = qp.s1(j4Var6.f9205l2).P1().f10005k;
                TL_stories.StoryItem storyItem2 = h4Var2.f9069a;
                m7Var2.k(storyItem2.dialogId, storyItem2);
                long currentTimeMillis = System.currentTimeMillis();
                s3 s3Var = new s3(a4Var6, 1);
                f10 f10Var = qp.s1(j4Var6.f9205l2).f24900s7;
                TL_stories.StoryItem storyItem3 = h4Var2.f9069a;
                bi.r3 r3Var = new bi.r3(s3Var, currentTimeMillis, 4);
                HashSet hashSet = f10Var.J;
                if (storyItem3 != null) {
                    Object obj = new Object();
                    String M0 = k21.M0();
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
                j4Var6.d1(false);
                j4Var6.Q2 = true;
                j4Var6.f9233t0.E(true);
                a4 a4Var7 = j4Var6.f9173c1;
                if (a4Var7 != null) {
                    a4Var7.a();
                    return;
                }
                return;
            case 6:
                j4 j4Var7 = this.f9436b.f8813x;
                y6 y6Var = j4Var7.f9250x1.f9070b;
                if (y6Var != null) {
                    y6Var.a();
                    j4Var7.h1();
                }
                a4 a4Var8 = j4Var7.f9173c1;
                if (a4Var8 != null) {
                    a4Var8.a();
                    return;
                }
                return;
            case 7:
                j4 j4Var8 = this.f9436b.f8813x;
                j4.b0(j4Var8);
                a4 a4Var9 = j4Var8.f9173c1;
                if (a4Var9 != null) {
                    a4Var9.a();
                    return;
                }
                return;
            case 8:
                j4 j4Var9 = this.f9436b.f8813x;
                org.telegram.messenger.g0.g(j4Var9.f9250x1.e());
                j4.h0(j4Var9);
                a4 a4Var10 = j4Var9.f9173c1;
                if (a4Var10 != null) {
                    a4Var10.a();
                    return;
                }
                return;
            case 9:
                j4 j4Var10 = this.f9436b.f8813x;
                j4Var10.W0(false);
                a4 a4Var11 = j4Var10.f9173c1;
                if (a4Var11 != null) {
                    a4Var11.a();
                    return;
                }
                return;
            case 10:
                g1 g1Var = g1.W;
                if (g1Var != null && g1Var.f9007n) {
                    long j3 = g1Var.J;
                    boolean z9 = !g1Var.I;
                    g1Var.I = z9;
                    NativeInstance.switchCameraCapturer(j3, z9);
                }
                a4 a4Var12 = this.f9436b.f8813x.f9173c1;
                if (a4Var12 != null) {
                    a4Var12.a();
                    return;
                }
                return;
            case 11:
                this.f9436b.f8813x.f9209m3.b();
                return;
            case 12:
                this.f9436b.f8813x.f9212n3.b();
                return;
            case 13:
                j4 j4Var11 = this.f9436b.f8813x;
                j4.d0(j4Var11);
                a4 a4Var13 = j4Var11.f9173c1;
                if (a4Var13 != null) {
                    a4Var13.a();
                    return;
                }
                return;
            case 14:
                j4 j4Var12 = this.f9436b.f8813x;
                ui.b0(j4Var12.f9205l2).N1(j4Var12.f9201k1);
                j4Var12.B1.l0(j4Var12.f9201k1, true, false);
                a4 a4Var14 = j4Var12.f9173c1;
                if (a4Var14 != null) {
                    a4Var14.a();
                    return;
                }
                return;
            default:
                j4 j4Var13 = this.f9436b.f8813x;
                j4.c0(j4Var13, j4Var13.f9201k1);
                a4 a4Var15 = j4Var13.f9173c1;
                if (a4Var15 != null) {
                    a4Var15.a();
                    return;
                }
                return;
        }
    }
}
