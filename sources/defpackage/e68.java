package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class e68 implements View.OnClickListener {
    public final byte a;
    public final j68 b;

    public e68(j68 j68Var, byte b) {
        this.a = b;
        this.b = j68Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        j68 j68Var = this.b;
        switch (b) {
            case 0:
                o68 o68Var = j68Var.x;
                b6b b6bVar = o68Var.y1.b;
                if (b6bVar != null) {
                    b6bVar.a();
                    o68Var.h1();
                }
                j68 j68Var2 = o68Var.d1;
                if (j68Var2 != null) {
                    j68Var2.a();
                    return;
                }
                return;
            case 1:
                o68 o68Var2 = j68Var.x;
                o68Var2.u0();
                j68 j68Var3 = o68Var2.d1;
                if (j68Var3 != null) {
                    j68Var3.a();
                    return;
                }
                return;
            case 2:
                j68Var.x.n3.b();
                return;
            case 3:
                o68 o68Var3 = j68Var.x;
                ls6.d0(o68Var3.m2).Q1(o68Var3.l1);
                o68Var3.C1.l0(o68Var3.l1, true, false);
                j68 j68Var4 = o68Var3.d1;
                if (j68Var4 != null) {
                    j68Var4.a();
                    return;
                }
                return;
            case 4:
                o68 o68Var4 = j68Var.x;
                o68Var4.a1(o68Var4.l1);
                j68 j68Var5 = o68Var4.d1;
                if (j68Var5 != null) {
                    j68Var5.a();
                    return;
                }
                return;
            case 5:
                o68 o68Var5 = j68Var.x;
                o68Var5.a1(o68Var5.l1);
                j68 j68Var6 = o68Var5.d1;
                if (j68Var6 != null) {
                    j68Var6.a();
                    return;
                }
                return;
            case 6:
                o68 o68Var6 = j68Var.x;
                o68Var6.M0();
                j68 j68Var7 = o68Var6.d1;
                if (j68Var7 != null) {
                    j68Var7.a();
                    return;
                }
                return;
            case 7:
                o68 o68Var7 = j68Var.x;
                hl.g(o68Var7.y1.b());
                o68Var7.I0();
                j68 j68Var8 = o68Var7.d1;
                if (j68Var8 != null) {
                    j68Var8.a();
                    return;
                }
                return;
            case 8:
                o68 o68Var8 = j68Var.x;
                o68Var8.T0(false);
                j68 j68Var9 = o68Var8.d1;
                if (j68Var9 != null) {
                    j68Var9.a();
                    return;
                }
                return;
            case 9:
                o68 o68Var9 = j68Var.x;
                n68 n68Var = o68Var9.y1;
                n68Var.a.translated = false;
                o6b o6bVar = uc7.s1(o68Var9.m2).O1().k;
                TL_stories.StoryItem storyItem = n68Var.a;
                o6bVar.k(storyItem.dialogId, storyItem);
                o68Var9.f0();
                o68Var9.c1(false);
                j68 j68Var10 = o68Var9.d1;
                if (j68Var10 != null) {
                    j68Var10.a();
                    return;
                }
                return;
            case 10:
                o68 o68Var10 = j68Var.x;
                n68 n68Var2 = o68Var10.y1;
                n68Var2.a.translated = true;
                o68Var10.f0();
                k68 k68Var = o68Var10.A1;
                if (k68Var != null) {
                    lcb lcbVar = ((ccb) k68Var).d;
                    lcbVar.Z0 = true;
                    lcbVar.U();
                }
                o6b o6bVar2 = uc7.s1(o68Var10.m2).O1().k;
                TL_stories.StoryItem storyItem2 = n68Var2.a;
                o6bVar2.k(storyItem2.dialogId, storyItem2);
                long currentTimeMillis = System.currentTimeMillis();
                a68 a68Var = new a68(j68Var, (byte) 0);
                a5c a5cVar = uc7.s1(o68Var10.m2).j4;
                TL_stories.StoryItem storyItem3 = n68Var2.a;
                kt ktVar = new kt(a68Var, currentTimeMillis, (byte) 24);
                HashSet hashSet = a5cVar.K;
                if (storyItem3 != null) {
                    Object obj = new Object();
                    String H0 = r3c.H0();
                    if (storyItem3.translatedText != null && TextUtils.equals(storyItem3.translatedLng, H0)) {
                        ktVar.run();
                    } else if (hashSet.contains(obj)) {
                        ktVar.run();
                    } else {
                        hashSet.add(obj);
                        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                        tL_messages_translateText.flags |= 2;
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        tL_textWithEntities.text = storyItem3.caption;
                        tL_textWithEntities.entities = storyItem3.entities;
                        tL_messages_translateText.text.add(tL_textWithEntities);
                        tL_messages_translateText.to_lang = a5c.D(H0);
                        a5cVar.getConnectionsManager().sendRequest(tL_messages_translateText, new mn0(a5cVar, storyItem3, H0, obj, ktVar, tL_textWithEntities, (byte) 5));
                    }
                }
                o68Var10.c1(false);
                o68Var10.R2 = true;
                o68Var10.u0.E(true);
                j68 j68Var11 = o68Var10.d1;
                if (j68Var11 != null) {
                    j68Var11.a();
                    return;
                }
                return;
            case 11:
                o68 o68Var11 = j68Var.x;
                o68Var11.M0();
                j68 j68Var12 = o68Var11.d1;
                if (j68Var12 != null) {
                    j68Var12.a();
                    return;
                }
                return;
            case 12:
                o68 o68Var12 = j68Var.x;
                hl.g(o68Var12.y1.b());
                o68Var12.I0();
                j68 j68Var13 = o68Var12.d1;
                if (j68Var13 != null) {
                    j68Var13.a();
                    return;
                }
                return;
            case 13:
                o68 o68Var13 = j68Var.x;
                o68Var13.T0(false);
                j68 j68Var14 = o68Var13.d1;
                if (j68Var14 != null) {
                    j68Var14.a();
                    return;
                }
                return;
            case 14:
                w96 w96Var = w96.N;
                if (w96Var != null) {
                    w96Var.H();
                }
                j68 j68Var15 = j68Var.x.d1;
                if (j68Var15 != null) {
                    j68Var15.a();
                    return;
                }
                return;
            default:
                j68Var.x.o3.b();
                return;
        }
    }
}
