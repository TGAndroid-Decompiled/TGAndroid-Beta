package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class j28 implements View.OnClickListener {
    public final byte a;
    public final s28 b;

    public j28(s28 s28Var, byte b) {
        this.a = b;
        this.b = s28Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        s28 s28Var = this.b;
        switch (b) {
            case 0:
                y28 y28Var = s28Var.x;
                y28Var.a1(y28Var.r1);
                s28 s28Var2 = y28Var.j1;
                if (s28Var2 != null) {
                    s28Var2.a();
                    return;
                }
                return;
            case 1:
                y28 y28Var2 = s28Var.x;
                y28Var2.M0();
                s28 s28Var3 = y28Var2.j1;
                if (s28Var3 != null) {
                    s28Var3.a();
                    return;
                }
                return;
            case 2:
                y28 y28Var3 = s28Var.x;
                gl.g(y28Var3.E1.b());
                y28Var3.I0();
                s28 s28Var4 = y28Var3.j1;
                if (s28Var4 != null) {
                    s28Var4.a();
                    return;
                }
                return;
            case 3:
                y28 y28Var4 = s28Var.x;
                y28Var4.T0(false);
                s28 s28Var5 = y28Var4.j1;
                if (s28Var5 != null) {
                    s28Var5.a();
                    return;
                }
                return;
            case 4:
                y28 y28Var5 = s28Var.x;
                x28 x28Var = y28Var5.E1;
                x28Var.a.translated = false;
                s2b s2bVar = na7.q1(y28Var5.s2).M1().k;
                TL_stories.StoryItem storyItem = x28Var.a;
                s2bVar.k(storyItem.dialogId, storyItem);
                y28Var5.f0();
                y28Var5.c1(false);
                s28 s28Var6 = y28Var5.j1;
                if (s28Var6 != null) {
                    s28Var6.a();
                    return;
                }
                return;
            case 5:
                y28 y28Var6 = s28Var.x;
                x28 x28Var2 = y28Var6.E1;
                x28Var2.a.translated = true;
                y28Var6.f0();
                t28 t28Var = y28Var6.G1;
                if (t28Var != null) {
                    m8b m8bVar = ((d8b) t28Var).d;
                    m8bVar.Z0 = true;
                    m8bVar.U();
                }
                s2b s2bVar2 = na7.q1(y28Var6.s2).M1().k;
                TL_stories.StoryItem storyItem2 = x28Var2.a;
                s2bVar2.k(storyItem2.dialogId, storyItem2);
                long currentTimeMillis = System.currentTimeMillis();
                m28 m28Var = new m28(s28Var, (byte) 1);
                b1c b1cVar = na7.q1(y28Var6.s2).i4;
                TL_stories.StoryItem storyItem3 = x28Var2.a;
                et etVar = new et(m28Var, currentTimeMillis, (byte) 24);
                HashSet hashSet = b1cVar.K;
                if (storyItem3 != null) {
                    Object obj = new Object();
                    String G0 = rzb.G0();
                    if (storyItem3.translatedText != null && TextUtils.equals(storyItem3.translatedLng, G0)) {
                        etVar.run();
                    } else if (hashSet.contains(obj)) {
                        etVar.run();
                    } else {
                        hashSet.add(obj);
                        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                        tL_messages_translateText.flags |= 2;
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        tL_textWithEntities.text = storyItem3.caption;
                        tL_textWithEntities.entities = storyItem3.entities;
                        tL_messages_translateText.text.add(tL_textWithEntities);
                        tL_messages_translateText.to_lang = b1c.D(G0);
                        b1cVar.getConnectionsManager().sendRequest(tL_messages_translateText, new kn0(b1cVar, storyItem3, G0, obj, etVar, tL_textWithEntities, (byte) 5));
                    }
                }
                y28Var6.c1(false);
                y28Var6.X2 = true;
                y28Var6.A0.E(true);
                s28 s28Var7 = y28Var6.j1;
                if (s28Var7 != null) {
                    s28Var7.a();
                    return;
                }
                return;
            case 6:
                y28 y28Var7 = s28Var.x;
                f2b f2bVar = y28Var7.E1.b;
                if (f2bVar != null) {
                    f2bVar.a();
                    y28Var7.h1();
                }
                s28 s28Var8 = y28Var7.j1;
                if (s28Var8 != null) {
                    s28Var8.a();
                    return;
                }
                return;
            case 7:
                y28 y28Var8 = s28Var.x;
                y28Var8.M0();
                s28 s28Var9 = y28Var8.j1;
                if (s28Var9 != null) {
                    s28Var9.a();
                    return;
                }
                return;
            case 8:
                y28 y28Var9 = s28Var.x;
                gl.g(y28Var9.E1.b());
                y28Var9.I0();
                s28 s28Var10 = y28Var9.j1;
                if (s28Var10 != null) {
                    s28Var10.a();
                    return;
                }
                return;
            case 9:
                y28 y28Var10 = s28Var.x;
                y28Var10.T0(false);
                s28 s28Var11 = y28Var10.j1;
                if (s28Var11 != null) {
                    s28Var11.a();
                    return;
                }
                return;
            case 10:
                t76 t76Var = t76.N;
                if (t76Var != null) {
                    t76Var.H();
                }
                s28 s28Var12 = s28Var.x.j1;
                if (s28Var12 != null) {
                    s28Var12.a();
                    return;
                }
                return;
            case 11:
                s28Var.x.t3.b();
                return;
            case 12:
                s28Var.x.u3.b();
                return;
            case 13:
                y28 y28Var11 = s28Var.x;
                y28Var11.u0();
                s28 s28Var13 = y28Var11.j1;
                if (s28Var13 != null) {
                    s28Var13.a();
                    return;
                }
                return;
            case 14:
                y28 y28Var12 = s28Var.x;
                hq6.d0(y28Var12.s2).Q1(y28Var12.r1);
                y28Var12.I1.l0(y28Var12.r1, true, false);
                s28 s28Var14 = y28Var12.j1;
                if (s28Var14 != null) {
                    s28Var14.a();
                    return;
                }
                return;
            default:
                y28 y28Var13 = s28Var.x;
                y28Var13.a1(y28Var13.r1);
                s28 s28Var15 = y28Var13.j1;
                if (s28Var15 != null) {
                    s28Var15.a();
                    return;
                }
                return;
        }
    }
}
