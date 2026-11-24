package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class m48 implements View.OnClickListener {
    public final byte a;
    public final v48 b;

    public m48(v48 v48Var, byte b) {
        this.a = b;
        this.b = v48Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        v48 v48Var = this.b;
        switch (b) {
            case 0:
                a58 a58Var = v48Var.x;
                a58Var.a1(a58Var.r1);
                v48 v48Var2 = a58Var.j1;
                if (v48Var2 != null) {
                    v48Var2.a();
                    return;
                }
                return;
            case 1:
                a58 a58Var2 = v48Var.x;
                a58Var2.M0();
                v48 v48Var3 = a58Var2.j1;
                if (v48Var3 != null) {
                    v48Var3.a();
                    return;
                }
                return;
            case 2:
                a58 a58Var3 = v48Var.x;
                gm.g(a58Var3.E1.b());
                a58Var3.I0();
                v48 v48Var4 = a58Var3.j1;
                if (v48Var4 != null) {
                    v48Var4.a();
                    return;
                }
                return;
            case 3:
                a58 a58Var4 = v48Var.x;
                a58Var4.T0(false);
                v48 v48Var5 = a58Var4.j1;
                if (v48Var5 != null) {
                    v48Var5.a();
                    return;
                }
                return;
            case 4:
                a58 a58Var5 = v48Var.x;
                z48 z48Var = a58Var5.E1;
                z48Var.a.translated = false;
                t4b t4bVar = oc7.r1(a58Var5.s2).N1().k;
                TL_stories.StoryItem storyItem = z48Var.a;
                t4bVar.k(storyItem.dialogId, storyItem);
                a58Var5.f0();
                a58Var5.c1(false);
                v48 v48Var6 = a58Var5.j1;
                if (v48Var6 != null) {
                    v48Var6.a();
                    return;
                }
                return;
            case 5:
                a58 a58Var6 = v48Var.x;
                z48 z48Var2 = a58Var6.E1;
                z48Var2.a.translated = true;
                a58Var6.f0();
                w48 w48Var = a58Var6.G1;
                if (w48Var != null) {
                    oab oabVar = ((fab) w48Var).d;
                    oabVar.Z0 = true;
                    oabVar.U();
                }
                t4b t4bVar2 = oc7.r1(a58Var6.s2).N1().k;
                TL_stories.StoryItem storyItem2 = z48Var2.a;
                t4bVar2.k(storyItem2.dialogId, storyItem2);
                long currentTimeMillis = System.currentTimeMillis();
                p48 p48Var = new p48(v48Var, (byte) 1);
                b3c b3cVar = oc7.r1(a58Var6.s2).i4;
                TL_stories.StoryItem storyItem3 = z48Var2.a;
                fu fuVar = new fu(p48Var, currentTimeMillis, (byte) 24);
                HashSet hashSet = b3cVar.K;
                if (storyItem3 != null) {
                    Object obj = new Object();
                    String G0 = s1c.G0();
                    if (storyItem3.translatedText != null && TextUtils.equals(storyItem3.translatedLng, G0)) {
                        fuVar.run();
                    } else if (hashSet.contains(obj)) {
                        fuVar.run();
                    } else {
                        hashSet.add(obj);
                        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                        tL_messages_translateText.flags |= 2;
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        tL_textWithEntities.text = storyItem3.caption;
                        tL_textWithEntities.entities = storyItem3.entities;
                        tL_messages_translateText.text.add(tL_textWithEntities);
                        tL_messages_translateText.to_lang = b3c.D(G0);
                        b3cVar.getConnectionsManager().sendRequest(tL_messages_translateText, new ko0(b3cVar, storyItem3, G0, obj, fuVar, tL_textWithEntities, (byte) 5));
                    }
                }
                a58Var6.c1(false);
                a58Var6.X2 = true;
                a58Var6.A0.E(true);
                v48 v48Var7 = a58Var6.j1;
                if (v48Var7 != null) {
                    v48Var7.a();
                    return;
                }
                return;
            case 6:
                a58 a58Var7 = v48Var.x;
                g4b g4bVar = a58Var7.E1.b;
                if (g4bVar != null) {
                    g4bVar.a();
                    a58Var7.h1();
                }
                v48 v48Var8 = a58Var7.j1;
                if (v48Var8 != null) {
                    v48Var8.a();
                    return;
                }
                return;
            case 7:
                a58 a58Var8 = v48Var.x;
                a58Var8.M0();
                v48 v48Var9 = a58Var8.j1;
                if (v48Var9 != null) {
                    v48Var9.a();
                    return;
                }
                return;
            case 8:
                a58 a58Var9 = v48Var.x;
                gm.g(a58Var9.E1.b());
                a58Var9.I0();
                v48 v48Var10 = a58Var9.j1;
                if (v48Var10 != null) {
                    v48Var10.a();
                    return;
                }
                return;
            case 9:
                a58 a58Var10 = v48Var.x;
                a58Var10.T0(false);
                v48 v48Var11 = a58Var10.j1;
                if (v48Var11 != null) {
                    v48Var11.a();
                    return;
                }
                return;
            case 10:
                s96 s96Var = s96.N;
                if (s96Var != null) {
                    s96Var.H();
                }
                v48 v48Var12 = v48Var.x.j1;
                if (v48Var12 != null) {
                    v48Var12.a();
                    return;
                }
                return;
            case 11:
                v48Var.x.t3.b();
                return;
            case 12:
                v48Var.x.u3.b();
                return;
            case 13:
                a58 a58Var11 = v48Var.x;
                a58Var11.u0();
                v48 v48Var13 = a58Var11.j1;
                if (v48Var13 != null) {
                    v48Var13.a();
                    return;
                }
                return;
            case 14:
                a58 a58Var12 = v48Var.x;
                hs6.d0(a58Var12.s2).Q1(a58Var12.r1);
                a58Var12.I1.l0(a58Var12.r1, true, false);
                v48 v48Var14 = a58Var12.j1;
                if (v48Var14 != null) {
                    v48Var14.a();
                    return;
                }
                return;
            default:
                a58 a58Var13 = v48Var.x;
                a58Var13.a1(a58Var13.r1);
                v48 v48Var15 = a58Var13.j1;
                if (v48Var15 != null) {
                    v48Var15.a();
                    return;
                }
                return;
        }
    }
}
