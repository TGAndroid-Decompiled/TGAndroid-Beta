package ei;

import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.hp;
import org.telegram.messenger.li;
import org.telegram.messenger.on;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.x00;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.f21;
public final class r3 implements View.OnClickListener {
    public final int f10864a;
    public final b4 f10865b;

    public r3(b4 b4Var, int i3) {
        this.f10864a = i3;
        this.f10865b = b4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f10864a) {
            case 0:
                j4 j4Var = this.f10865b.f10126x;
                j4.c0(j4Var, j4Var.f10477l1);
                b4 b4Var = j4Var.f10449d1;
                if (b4Var != null) {
                    b4Var.a();
                    return;
                }
                return;
            case 1:
                j4 j4Var2 = this.f10865b.f10126x;
                j4.b0(j4Var2);
                b4 b4Var2 = j4Var2.f10449d1;
                if (b4Var2 != null) {
                    b4Var2.a();
                    return;
                }
                return;
            case 2:
                j4 j4Var3 = this.f10865b.f10126x;
                org.telegram.messenger.g0.g(j4Var3.f10527y1.e());
                j4.h0(j4Var3);
                b4 b4Var3 = j4Var3.f10449d1;
                if (b4Var3 != null) {
                    b4Var3.a();
                    return;
                }
                return;
            case 3:
                j4 j4Var4 = this.f10865b.f10126x;
                j4Var4.W0(false);
                b4 b4Var4 = j4Var4.f10449d1;
                if (b4Var4 != null) {
                    b4Var4.a();
                    return;
                }
                return;
            case 4:
                j4 j4Var5 = this.f10865b.f10126x;
                h4 h4Var = j4Var5.f10527y1;
                h4Var.f10358a.translated = false;
                m7 m7Var = hp.s1(j4Var5.f10480m2).P1().f11282k;
                TL_stories.StoryItem storyItem = h4Var.f10358a;
                m7Var.k(storyItem.dialogId, storyItem);
                j4Var5.n0();
                j4Var5.d1(false);
                b4 b4Var5 = j4Var5.f10449d1;
                if (b4Var5 != null) {
                    b4Var5.a();
                    return;
                }
                return;
            case 5:
                b4 b4Var6 = this.f10865b;
                j4 j4Var6 = b4Var6.f10126x;
                h4 h4Var2 = j4Var6.f10527y1;
                h4Var2.f10358a.translated = true;
                j4Var6.n0();
                c4 c4Var = j4Var6.A1;
                if (c4Var != null) {
                    r9 r9Var = ((i9) c4Var).d;
                    r9Var.f10910a1 = true;
                    r9Var.d0();
                }
                m7 m7Var2 = hp.s1(j4Var6.f10480m2).P1().f11282k;
                TL_stories.StoryItem storyItem2 = h4Var2.f10358a;
                m7Var2.k(storyItem2.dialogId, storyItem2);
                long currentTimeMillis = System.currentTimeMillis();
                v3 v3Var = new v3(b4Var6, 1);
                x00 x00Var = hp.s1(j4Var6.f10480m2).f23120s7;
                TL_stories.StoryItem storyItem3 = h4Var2.f10358a;
                ci.e3 e3Var = new ci.e3(v3Var, currentTimeMillis, 4);
                HashSet hashSet = x00Var.K;
                if (storyItem3 != null) {
                    Object obj = new Object();
                    String M0 = f21.M0();
                    if (storyItem3.translatedText != null && TextUtils.equals(storyItem3.translatedLng, M0)) {
                        e3Var.run();
                    } else if (hashSet.contains(obj)) {
                        e3Var.run();
                    } else {
                        hashSet.add(obj);
                        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                        tL_messages_translateText.flags |= 2;
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        tL_textWithEntities.text = storyItem3.caption;
                        tL_textWithEntities.entities = storyItem3.entities;
                        tL_messages_translateText.text.add(tL_textWithEntities);
                        tL_messages_translateText.to_lang = x00.D(M0);
                        x00Var.getConnectionsManager().sendRequest(tL_messages_translateText, new on(x00Var, storyItem3, M0, obj, e3Var, tL_textWithEntities, 1));
                    }
                }
                j4Var6.d1(false);
                j4Var6.R2 = true;
                j4Var6.f10510u0.E(true);
                b4 b4Var7 = j4Var6.f10449d1;
                if (b4Var7 != null) {
                    b4Var7.a();
                    return;
                }
                return;
            case 6:
                j4 j4Var7 = this.f10865b.f10126x;
                y6 y6Var = j4Var7.f10527y1.f10359b;
                if (y6Var != null) {
                    y6Var.a();
                    j4Var7.h1();
                }
                b4 b4Var8 = j4Var7.f10449d1;
                if (b4Var8 != null) {
                    b4Var8.a();
                    return;
                }
                return;
            case 7:
                j4 j4Var8 = this.f10865b.f10126x;
                j4.b0(j4Var8);
                b4 b4Var9 = j4Var8.f10449d1;
                if (b4Var9 != null) {
                    b4Var9.a();
                    return;
                }
                return;
            case 8:
                j4 j4Var9 = this.f10865b.f10126x;
                org.telegram.messenger.g0.g(j4Var9.f10527y1.e());
                j4.h0(j4Var9);
                b4 b4Var10 = j4Var9.f10449d1;
                if (b4Var10 != null) {
                    b4Var10.a();
                    return;
                }
                return;
            case 9:
                j4 j4Var10 = this.f10865b.f10126x;
                j4Var10.W0(false);
                b4 b4Var11 = j4Var10.f10449d1;
                if (b4Var11 != null) {
                    b4Var11.a();
                    return;
                }
                return;
            case 10:
                g1 g1Var = g1.X;
                if (g1Var != null && g1Var.f10301n) {
                    long j10 = g1Var.K;
                    boolean z10 = !g1Var.J;
                    g1Var.J = z10;
                    NativeInstance.switchCameraCapturer(j10, z10);
                }
                b4 b4Var12 = this.f10865b.f10126x.f10449d1;
                if (b4Var12 != null) {
                    b4Var12.a();
                    return;
                }
                return;
            case 11:
                this.f10865b.f10126x.f10485n3.b();
                return;
            case 12:
                this.f10865b.f10126x.f10489o3.b();
                return;
            case 13:
                j4 j4Var11 = this.f10865b.f10126x;
                j4.d0(j4Var11);
                b4 b4Var13 = j4Var11.f10449d1;
                if (b4Var13 != null) {
                    b4Var13.a();
                    return;
                }
                return;
            case 14:
                j4 j4Var12 = this.f10865b.f10126x;
                li.b0(j4Var12.f10480m2).N1(j4Var12.f10477l1);
                j4Var12.C1.l0(j4Var12.f10477l1, true, false);
                b4 b4Var14 = j4Var12.f10449d1;
                if (b4Var14 != null) {
                    b4Var14.a();
                    return;
                }
                return;
            default:
                j4 j4Var13 = this.f10865b.f10126x;
                j4.c0(j4Var13, j4Var13.f10477l1);
                b4 b4Var15 = j4Var13.f10449d1;
                if (b4Var15 != null) {
                    b4Var15.a();
                    return;
                }
                return;
        }
    }
}
